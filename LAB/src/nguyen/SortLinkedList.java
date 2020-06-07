/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyen;


/**
 *
 * @author ADMIN
 */
public class SortLinkedList {
    Player head;
    Player tail;
    public SortLinkedList(){
        head=tail=null;
    }
    public boolean isEmpty(){
        return head==null;
    }
   
    public Player ceiling(int pointlling){
        Player t = head;
        while(t!=null && t.getPoint()<pointlling) 
        {            
            t=t.getNextPlayer();
        }
        return t;
    }
    //search Email
    public Player PlayerSearchEmail(String Email){
        Player Result;
        for(Result=head; Result!=null; Result=Result.nextPlayer){
            if(Result.getEmail().equals(Email)){
                return Result;
            }
        }
        return Result;
    }
//    public Player UpdatePlayer(String Email, int newpoint){
//        Player Result = PlayerSearchEmail(Email);
//        if(Result!=null){
//            remove(Result);
//            Result.setPoint(newpoint);
//            add(Email,newpoint);
//            return Result;
//        }
//        else {
//            return null;
//        }
//        
//    }
    public Player add(String Email, int Point) {
        Player newPlayer = new Player(Email, Point);
        Player after = ceiling(Point);
        if (head == null) {
            head = tail = newPlayer;
        } else if (after == null) {
            newPlayer.nextPlayer = null;
            newPlayer.beforePlayer = tail;
            tail.nextPlayer = newPlayer;
            tail = newPlayer;
        } else if  (after == head) {
            newPlayer.nextPlayer = head;
            newPlayer.beforePlayer = null;
            head.beforePlayer = newPlayer;
            head = newPlayer;
        }
        else {
            Player before = after.beforePlayer;
            newPlayer.nextPlayer = after;
            newPlayer.beforePlayer = before;
            after.beforePlayer = newPlayer;
            before.nextPlayer = newPlayer;
        }
        return newPlayer;
}
    public Player Remove(Player Remref){
        if(Remref == head && head ==tail)
        {
            head=tail=null;
            return Remref;
        }
        return Remref;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author Khả Thi
 */
import java.io.*;
public class Csv {
    public static void ReadCsv(String path,PriorityQueue queue) throws IOException{
        String line ="";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
 
            while((line = br.readLine())!=null){
                String[] data = line.split(",");
                String email = data[0];
                Long point = data[1];
                
            }
        }catch(FileNotFoundException e){
            System.out.println("File don.t exit!");
        }
    }
}

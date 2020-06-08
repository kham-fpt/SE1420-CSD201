/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1_1;

/**
 *
 * @author minhv
 */
public class PriorityQueue extends Lab1_1.DoublyLinkedList {

    public void insertUser(Lab1_1.User data) {
	add(data);
    }

    public void deleteUser(String email) {
	deleteUserNode(email);
    }

    public void updateUser(String email, int point) {
	updateUserNode(email, point);
    }

    public void searchUser(String email) {
	displayPointUserEmail(email);
    }

    public void getTop() throws Exception {
	displayPointTopUser();
    }

    public void removeTop() {
	removeLast();
    }

    public void writeUserToFile(String fileName) {
	writeData(this, fileName);
    }
}
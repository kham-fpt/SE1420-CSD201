/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab201;

/**
 *
 * @author nds72
 */
public class User {

    private String email;
    private float mark;

    public User() {
        this.email = " ";
        this.mark = 0;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getEmail() {
        return email;
    }

    public float getMark() {
        return mark;
    }

    public String toString() {
        return email + " " + mark;
    }

}
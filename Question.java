/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testapplication;

import java.util.ArrayList;

/**
 *
 * @author cyrus
 */
public class Question {
    private String qs;
    private ArrayList<String> options;
    
    public Question() {
        this.qs = "";
        this.options = new ArrayList<>();
    }
    public Question(String qs, ArrayList<String> options) {
        this.qs = qs;
        this.options = options;
    }
    public String getQs() {
        return qs;
    }

    public ArrayList<String> getOptions() {
        return options;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2paper;

import javax.swing.JTextArea;

/**
 *
 * @author m0277949
 */
public class Question {
    
    public String title;
    public float points;
    public String questionText;
    
    public void printQuestion(JTextArea area, boolean key, boolean showPoints) {
        System.out.println("Question type not set up yet.");        
    }
    
    public String fmtPoints(boolean display) {
        if (display) {
            double d = points;
            String formatted;
            if(d == (long) d)
                formatted = String.format("%d",(long)d);
            else
                formatted = String.format("%s",d);

            if (formatted.equals("1")) {
                return " (" + formatted + " point)";
            } else {
                return " (" + formatted + " points)";
            }
        }
        else return "";
    }
}

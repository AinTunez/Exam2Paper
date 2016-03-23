/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2paper;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JTextArea;

/**
 *
 * @author m0277949
 */
public class McQuestion extends Question{
        
  
    public String correctAnswerLabel;
    public List<McAnswer> answers = new LinkedList<>();


    
    public void addAnswer(McAnswer a) {
        answers.add(a);
    }
    
    @Override
    public void printQuestion(JTextArea area, boolean key, boolean showPoints) {
        //display the question        
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();        
       /* if (!title.isEmpty()) {            
            area.append(title + System.lineSeparator());
        } */             
        if (!questionText.isEmpty()) {
            String out = questionText + fmtPoints(showPoints) + System.lineSeparator();             
            area.append(out);
        } else {            
            area.append("[NO TEXT]" + System.lineSeparator());
        }
        
        //display each answer
        for (int i = 0; i < answers.size(); i++) {
            McAnswer answer = answers.get(i);
            //System.out.println("ANSWER:" + answer.text);
            //System.out.println("LABEL: " + answer.response_label);
            //System.out.println("CORRECT_LABEL: " + correctAnswerLabel);
            //System.out.println("LABEL == CORRECT_LABEL: " + answer.response_label.equals(correctAnswerLabel));
            String out = alphabet[i] + ") " + answer.text + System.lineSeparator(); 
            if (key) {
                if (answer.response_label.equals(correctAnswerLabel)) {                                
                    area.append("\t*" + out);
                } else {
                    area.append("\t" + out);
                }
            } else {
                area.append("\t" + out);
            }
        }                
        area.append(System.lineSeparator());
        
        
        
    }
    
    
}

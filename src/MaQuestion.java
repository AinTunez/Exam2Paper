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
public class MaQuestion extends Question {
        
   
    public List<String> correctAnswerLabels = new LinkedList<>();
    public List<MaAnswer> answers = new LinkedList<>();
  

    
    public void addAnswer(MaAnswer a) {
        answers.add(a);
    }
    
    @Override
    public void printQuestion(JTextArea area, boolean key, boolean points) {
        //display the question        
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();        
       /* if (!title.isEmpty()) {            
            area.append(title + System.lineSeparator());
        } */             
        if (!questionText.isEmpty()) {
            String out = questionText + fmtPoints(points) + System.lineSeparator();             
            area.append(out);
        } else {            
            area.append("[NO TEXT]" + System.lineSeparator());
        }
        
        //display each answer
        // for (int i = 0; i < correctAnswerLabels.size(); i++) {System.out.println("CORRECT: " + correctAnswerLabels.get(i));}
        
        for (int i = 0; i < answers.size(); i++) {
            MaAnswer answer = answers.get(i);
            // System.out.println("ANSWER:" + answer.text);
            // System.out.println("LABEL: " + answer.response_label);            
            // System.out.println("LABEL == CORRECT_LABEL: " + correctAnswerLabels.contains(answer.response_label));            
            String out = alphabet[i] + ") " + answer.text + System.lineSeparator(); 
            if (key) {            
                if (correctAnswerLabels.contains(answer.response_label)) {                
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

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
public class FibQuestion extends Question {
    
    List<String> correctResponses = new LinkedList<>();
    
    public void addAnswer(String s) {
        correctResponses.add(s);
    }
    
    @Override
    public void printQuestion(JTextArea area, boolean key, boolean showPoints) {
        
        if (!questionText.isEmpty()) {
            String out = questionText + fmtPoints(showPoints) + System.lineSeparator();             
            area.append(out);
        } else {            
            area.append("[NO TEXT]" + System.lineSeparator());
        }
        if (key) {
            area.append("\tCorrect responses: ");
            for (String correctResponse : correctResponses) {                        
                area.append(correctResponse + "; ");
            }
        }
        area.append(System.lineSeparator() + System.lineSeparator());
        
    }
    
}

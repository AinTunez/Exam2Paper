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
public class SrQuestion extends Question {
    
    
    @Override
    public void printQuestion(JTextArea area, boolean key, boolean showPoints) {
        if (!questionText.isEmpty()) {
            String out = questionText + fmtPoints(showPoints) + System.lineSeparator() + System.lineSeparator() + System.lineSeparator();             
            area.append(out);
        } else {            
            area.append("[NO TEXT]" + System.lineSeparator());
        }               
    }
    
}

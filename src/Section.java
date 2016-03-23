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
public class Section {
    
    public String title = "blank";
    public List<Question> questions = new LinkedList<Question>() {};    
    
    public Section() {
        
    }
    
    public String toString() {
        return title;
    }
    
    public void addQuestion(Question q) {
        questions.add(q);        
    }
    
    public void printSection(JTextArea area, boolean key, boolean showPoints) {
        System.out.println("Printing \"" + title + "\"");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println("----------------");
            Question question = questions.get(i);
            System.out.println("Question " + (i + 1) + " is null? " + (question == null));
            if (question != null) {
                System.out.println(question.questionText);
                area.append((i + 1) + ") ");
                question.printQuestion(area, key, showPoints);
            }
            
        }                 
    }
}

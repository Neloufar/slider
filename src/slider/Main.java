 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package slider;

import javax.swing.JFrame;

/**
 *
 * @author neliloghmani
 */
public class Main {
    
    public static void main(String[] args){
        
        JFrame frame = new JFrame("Slider Bar Demo");
        frame.add(new Slider());
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

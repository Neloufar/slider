/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package slider;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author neliloghmani
 */
public class Slider extends JPanel implements ChangeListener{

    /**
     * @param args the command line arguments
     */
   JPanel panel = new JPanel();
   JLabel label = new JLabel("Show Colors");
   int colorRed;
   int colorGreen;
   int colorBlue;
   JSlider redSlide,blueSlide,greenSlide;
   
   
   
public Slider()
{
    
    setLayout(new BorderLayout());
    label.setHorizontalAlignment(SwingConstants.CENTER);
    add(label, BorderLayout.CENTER);
    panel.setLayout(new BorderLayout());
    panel.setBorder(new CompoundBorder(new TitledBorder("Choose colors"),
            new EmptyBorder(2, 2, 2, 2)));
    
     
     redSlide = new JSlider(JSlider.HORIZONTAL, 0,255,0);
     blueSlide = new JSlider(JSlider.HORIZONTAL, 0,255,0);
     greenSlide = new JSlider(JSlider.HORIZONTAL, 0,255,0);
    panel.add(redSlide, BorderLayout.SOUTH);
    panel.add(blueSlide, BorderLayout.CENTER);
    panel.add(greenSlide, BorderLayout.NORTH);
    
    add(panel, BorderLayout.SOUTH);
    
    
    
}
   
   @Override
 public void stateChanged (ChangeEvent e){
    if(e.getSource().equals(redSlide)){
        colorRed = redSlide.getValue();
    } else if (e.getSource().equals(greenSlide)){
         colorGreen = greenSlide.getValue();
    }else if (e.getSource().equals(blueSlide){
         colorBlue = blueSlide.getValue();
    }
    label.setForeground(new Color(colorRed,colorGreen,colorBlue));
}
}
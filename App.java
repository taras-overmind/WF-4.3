package com.App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton button1;
    private JPanel panel1;

    public App() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Triangle t1= new Rectangular_triangle(6, 8);

                Triangle t2= new Isosceles_triangle(5, Math.PI/6);

                JOptionPane.showMessageDialog(null, "Rectangular triangle(6, 8)"+'\n'+t1.calcPerimeter()+
                        '\n'+t1.calcSquare()+'\n'+"Isosceles triangle(5, pi/6)"+'\n'+t2.calcPerimeter()+'\n'+t2.calcSquare());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

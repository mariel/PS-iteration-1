package view;

import java.awt.Color;

import javax.swing.*;

public class Gui {
	JFrame f = new JFrame();
	JButton b = new JButton("Land");
	
	public Gui() {
		b.setBounds(0, 0, 5, 5);
		b.setBackground(Color.BLACK);
		
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}

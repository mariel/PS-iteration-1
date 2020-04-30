package view;

import javax.swing.*;

public class HydroGui {
	private JFrame f = new JFrame();
	private JButton add = new JButton("ADD");
	private JButton delete = new JButton("DELETE");
	private JButton update = new JButton ("UPDATE");
	
	private JTextField nameAdd = new JTextField();
	private JComboBox nameDelete = new JComboBox();
	private JComboBox nameUpdate = new JComboBox();
	
	public HydroGui() {
		
		add.setBounds(850, 100, 100, 50);
		delete.setBounds(850, 250, 100, 50);
		update.setBounds(850, 400, 100, 50);
		nameAdd.setBounds(50, 100, 200, 25);
		nameDelete.setBounds(50, 250, 200, 25);
		nameUpdate.setBounds(50, 400, 200, 25);
		
		f.add(add);
		f.add(delete);
		f.add(update);
		f.add(nameAdd);
		f.add(nameDelete);
		f.add(nameUpdate);
		
		
		f.setSize(1000,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
}

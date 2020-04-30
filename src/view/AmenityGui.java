package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AmenityGui {
	private JFrame f = new JFrame();
	private JButton add = new JButton("ADD");
	private JButton delete = new JButton("DELETE");
	private JButton update = new JButton ("UPDATE");
	
	private JTextField nameAdd = new JTextField();
	private JComboBox nameDelete = new JComboBox();
	private JComboBox nameUpdate = new JComboBox();
	
	public JFrame getf() {
		return f;
	}
	public void setf(JFrame f) {
		this.f = f;
	}
	
	public JButton getadd() {
		return add;
	}
	public void setadd(JButton add) {
		this.add = add;
	}
	
	public JButton getdelete() {
		return delete;
	}
	public void setdelete(JButton delete) {
		this.delete = delete;
	}
	public JButton getupdate() {
		return update;
	}
	public void setupdate(JButton update) {
		this.update = update;
	}
	
	public JTextField getnameAdd() {
		return nameAdd;
	}
	public void setnameAdd(JTextField nameAdd) {
		this.nameAdd = nameAdd;
	}
	
	
	
	
	public AmenityGui() {
		
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
		
		add.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//to Do function
			}
		});
		
		delete.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//to do function				
			}
		});
		
		update.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//to do function				
			}
		});

		f.setSize(1000,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}

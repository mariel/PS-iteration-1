package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Gui {
	private JFrame f = new JFrame();
	private JButton[][] cityMap;
	private Border border = new LineBorder(Color.LIGHT_GRAY,2,true);
	
	private JButton editHydro = new JButton("Edit Hydro");
	private JButton editPlaces = new JButton("Edit Places");
	private JButton editAmenities = new JButton("Edit Amenities");
	
	public Gui() {
		
		cityMap = new JButton[80][100];
		
		for (int i = 0; i < 80; i++)
		{
			for (int j = 0; j < 100; j++)
			{
				cityMap[i][j] = new JButton("Land");
			}
		}

		
		for (int i = 0; i < 80; i++)
		{
			for(int j = 0; j < 100; j++)
			{
				cityMap[i][j].setBounds(i*10, j*10, 10, 10);
				cityMap[i][j].setBackground(Color.LIGHT_GRAY);
				cityMap[i][j].setBorder(border);
				f.add(cityMap[i][j]);
			}
		}

		
		editHydro.setBounds(820, 50, 150, 50);
		editPlaces.setBounds(820, 110, 150, 50);
		editAmenities.setBounds(820, 170, 150, 50);
		
		f.add(editHydro);
		f.add(editPlaces);
		f.add(editAmenities);
		
		
		editHydro.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				HydroGui hg = new HydroGui();				
			}
		});
		
		editPlaces.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PlaceGui pg = new PlaceGui();				
			}
		});
		
		editAmenities.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AmenityGui ag = new AmenityGui();				
			}
		});
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(1100,1100);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	
}

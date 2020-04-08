package demo;

import model.City;
import view.Gui;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City dis = new City("dis",50,25);
		dis.addHydro("tiki", 10, 1);
		dis.addPlaces("mc", "food", 20, 20);
		dis.addAmenity("watersomething", "good looking", 10, 1);
		Gui gui = new Gui();
	}

}

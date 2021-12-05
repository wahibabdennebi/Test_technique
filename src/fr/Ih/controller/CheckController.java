package fr.Ih.controller;

import fr.Ih.model.GridModel;
import fr.Ih.model.IHooverModel;

public class CheckController {
	public static void checkCadre(GridModel grid, IHooverModel iHoover) {
//		je v�rifie que je reste dans le cadre
	if (iHoover.getY() > grid.getHeight() || iHoover.getX() > grid.getWidth()) {
			System.out.println("la destination de l'aspirateur est Hors cadre !!!!");
			System.exit(0);
		}
}

}

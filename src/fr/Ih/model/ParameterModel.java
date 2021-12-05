/**
 * 
 */
package fr.Ih.model;

import java.util.ArrayList;
import java.util.List;

import fr.Ih.controller.ParserController;


public class ParameterModel {
	private GridModel grid;
	private IHooverModel iHoover;
	private List<OrderEnum> orders = new ArrayList<OrderEnum>();

	
	public ParameterModel() {
		super();
	}

	public ParameterModel(List<String> lines) {
		super();
		if (lines.size() == 3) {
			this.grid = ParserController.parseGrid(lines.get(0));
			this.iHoover = ParserController.parseIHoover(lines.get(1));
			this.orders = ParserController.parseOrders(lines.get(2));
		} else {
			System.err.println("Le fichier ne fait pas 3 lignes");
		}
	}

	
	public GridModel getGrid() {
		return grid;
	}

	
	public void setGrid(GridModel grid) {
		this.grid = grid;
	}

	
	public IHooverModel getIHoover() {
		return iHoover;
	}

	
	public void setIHoover(IHooverModel iHoover) {
		this.iHoover = iHoover;
	}

	
	public List<OrderEnum> getOrders() {
		return orders;
	}

	
	public void setOrders(List<OrderEnum> orders) {
		this.orders = orders;
	}

	
	@Override
	public String toString() {
		return "ParameterModel [Grid=" + grid + ", IHoover=" + iHoover + ", orders=" + orders + "]";
	}

}

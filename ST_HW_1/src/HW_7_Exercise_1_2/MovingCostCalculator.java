package HW_7_Exercise_1_2;

public class MovingCostCalculator implements Visitor{

	@Override
	public void visitGlass(Glass g) {
		double cost = 0;
		if(g.getTickness() == 1) {
			cost = 2 * g.getLenght();
		}else if(g.getTickness() == 2) {
			cost = 1.2 * g.getLenght();
		}else if(g.getTickness() == 3) {
			cost = 0.7 * g.getLenght();
		}
		
		System.out.println("Total Cost for " + g.getName() + " is: " + cost + " Euros");
		
	}

	@Override
	public void visitFurniture(Furniture f) {
		double cost = ((double)f.weight/20) * 5;

		System.out.println("Total Cost for " + f.getName() + " is: " + cost + " Euros");
		
	}

	@Override
	public void visitElectronic(Electronic e) {
		double cost = 0;
		if(e.getFragile()) {
			cost = ((double)e.getWeight()/10) * 5;
		}else {
			cost = ((double)e.getWeight()/15) * 5;
		}
		
		System.out.println("Total Cost for " + e.getName() + " is: " + cost + " Euros");
		
	}
	

}

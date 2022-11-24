package HW_7_Exercise_1_2;

public class PackingIntructionsPrinter implements Visitor {

	@Override
	public void visitGlass(Glass g) {
		System.out.println(
				g.getName() + "\n" + ">should be wrapped with Bubble wraps and packed in a box with dimension: "
						+ g.getLenght() + 1 + "x" + g.getHeight() + 1 + "x" + g.getWidth() + 1);

	}

	@Override
	public void visitFurniture(Furniture f) {
		System.out.println(f.getName() + "\n" + ">should be covered with waterproof covers with area of: "
				+ f.getLenght() + "x" + f.getHeight());

	}

	@Override
	public void visitElectronic(Electronic e) {
		System.out.println(e.getName() + "\n"
				+ ">should be covered with Polyethylene foam film and packed in a box with dimension: " + e.getLenght()
				+ "x" + e.getHeight() + "x" + e.getWidth());

	}

}

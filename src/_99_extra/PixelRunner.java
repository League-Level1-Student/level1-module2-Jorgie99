package _99_extra;

public class PixelRunner {

	public static void main(String[] args) {
		PixelParty pixpart = new PixelParty();
		pixpart.setColor(66, 209, 245);
		pixpart.drawRectangle(250, 350, 200, 100);
		pixpart.drawCircle(75,75,75);
		pixpart.saveImage();
		pixpart.displayImage();

	}

}

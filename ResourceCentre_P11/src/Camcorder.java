
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = super.toString();
		// Write your codes here
		return String.format("%-63s %-20d", output, getOpticalZoom());
	}
	public boolean toLoan(String tag, String dueDate) {
		boolean output = super.toLoan(tag, dueDate);
		return output;
	}
	public boolean toReturn(String tag) {
		boolean output = super.toReturn(tag);
		return output;
	}
}


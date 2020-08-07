
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = super.toString();
		return String.format("%-63s %-20d", output,getOs());
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



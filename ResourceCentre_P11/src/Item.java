
public class Item {
	private String assetTag;
	private String description;
	private String dueDate;
	private boolean isAvailable;

	public Item(String assetTag, String description) {
		this.assetTag = assetTag;
		this.description = description;
		this.dueDate = "";
		this.isAvailable = true;
	}
	public String toString() {
		
		// Write your codes here
		return String.format("%-10s %-30s %-10s %-10s\n", getAssetTag(),
				getDescription(),
				showAvailability(getIsAvailable()),
				getDueDate());
		
	}
	
	public static String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	}
	
	public boolean toLoan(String tag, String dueDate) {
		boolean isLoaned = false;
		String assetTag = getAssetTag();
		
		boolean isAvailable = getIsAvailable();
		if (tag.equalsIgnoreCase(assetTag) && isAvailable == true) {
			
			setIsAvailable(false);
			setDueDate(dueDate);
			
			isLoaned = true;
			
		}
		return isLoaned;
	}
	public boolean toReturn(String tag) {
		boolean isReturned = false;
		String assetTag = getAssetTag();
		boolean isAvailable = getIsAvailable();
		if (tag.equalsIgnoreCase(assetTag)
				&& isAvailable == false) {
			setIsAvailable(true);
			setDueDate("");
			isReturned = true;
			
		}
		return isReturned;
	}
	
	public String getAssetTag() {
		return assetTag;
	}

	public String getDescription() {
		return description;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}


package futureLogistics;

public class TimberTransport extends GoodsTransport {
	private float timberLength;
	private float timberRadius;
	private float timberPrice;
	private String timberType;

	TimberTransport(String transportId, String transportDate, int transportRating,float timberLength, float timberRadius,float timberPrice, String timberType ) {
		super(transportId, transportDate, transportRating);
		this.timberLength=timberLength;
		this.timberPrice=timberPrice;
		this.timberRadius=timberRadius;
		this.timberType=timberType;
	}
	
	public float getTimberLength() {
		return timberLength;
	}

	public void setTimberLength(float timberLength) {
		this.timberLength = timberLength;
	}

	public float getTimberRadius() {
		return timberRadius;
	}

	public void setTimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
	}

	public float getTimberPrice() {
		return timberPrice;
	}

	public void setTimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}

	public String getTimberType() {
		return timberType;
	}

	public void setTimberType(String timberType) {
		this.timberType = timberType;
	}

	
	@Override
	public String vehicleSelection() {
		double area = 2*3.147*timberRadius*timberLength;
		if(area<250) {
			return "truck";
		}
		else if(area >=250 && area<=400) {
			return "Lorry";
		}
		return "MonsterLorry";
	}

	@Override
	public float calculateTotalCharge() {
	
	    float volume = (float)(3.147 * timberRadius * timberRadius * timberLength);


	    float timberTypeFactor = 0;
	    if (timberType.equalsIgnoreCase("Premium")) {
	        timberTypeFactor = 0.25f;
	    } else if (timberType.equalsIgnoreCase("NonPremium")) {
	        timberTypeFactor = 0.15f;
	    }

	    float price = volume * timberPrice * timberTypeFactor;

	    float tax = price * 0.30f;

	   
	    float vehiclePrice = 0;
	    String vehicle = vehicleSelection();

	    if (vehicle.equalsIgnoreCase("truck")) {
	        vehiclePrice = 1000;
	    } 
	    else if (vehicle.equalsIgnoreCase("lorry")) {
	        vehiclePrice = 1700;
	    } 
	    else {
	        vehiclePrice = 3000;
	    }

	 
	    float discount = 0;
	    int rating = getTransportRating();

	    if (rating >= 5) {
	        discount = price * 20 / 100;
	    } 
	    else if (rating >= 3) {
	        discount = price * 10 / 100;
	    }
	    float totalCharge = price + vehiclePrice + tax - discount;

	    return totalCharge;
	}
	
}

package futureLogistics;

class BrickTransport  extends GoodsTransport{
	BrickTransport(String transportId, String transportDate, int transportRating ,float brickSize , int brickQuantity , float brickPrize) {
		super(transportId, transportDate, transportRating);
		this.brickPrize=brickPrize;
		this.brickQuantity=brickQuantity;
		this.brickSize=brickSize;
	}

	private float brickSize;
	private int brickQuantity;
	private float brickPrize;
	
	public float getBrickSize() {
		return brickSize;
	}

	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}

	public int getBrickQuantity() {
		return brickQuantity;
	}

	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}

	public float getBrickPrize() {
		return brickPrize;
	}

	public void setBrickPrize(float brickPrize) {
		this.brickPrize = brickPrize;
	}

	@Override
	public String vehicleSelection() {
		// TODO Auto-generated method stub
		if(brickQuantity<300) {
			return "truck";
		}
		else if(brickQuantity>=300&& brickQuantity<=500) {
			return "lorry";
		}
		else {
			return "Mosnter Lorry ";
		}
	}
	@Override
	public float calculateTotalCharge() {

	    float price = brickPrize * brickQuantity;   
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

	    if (rating == 5) {
	        discount = price * 0.20f;
	    }
	    else if (rating == 3 || rating == 4) {
	        discount = price * 0.10f;
	    }

	    return price + vehiclePrice + tax - discount;
	}

}

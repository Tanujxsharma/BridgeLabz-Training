package futureLogistics;

abstract public class GoodsTransport {
	GoodsTransport(String transportId,String transportDate,int transportRating){
		this.transportDate=transportDate;
		this.transportId=transportId;
		this.transportRating=transportRating;
	}
	abstract public String vehicleSelection();
	
	abstract public float calculateTotalCharge();
	private String transportId;
	
	private String transportDate;
	
	private int transportRating;

	public String getTransportId(){
		return transportId;
	}
	public void settransportId(String transportId) {
		this.transportId= transportId;
	}
	public String getTransportDate() {
		return transportDate;
	}
	public void setTransportDate(String transportDate) {
		this.transportDate = transportDate;
	}
	public int getTransportRating() {
		return transportRating;
	}
	public void setTransportRating(int transportRating) {
		this.transportRating = transportRating;
	}
	
}

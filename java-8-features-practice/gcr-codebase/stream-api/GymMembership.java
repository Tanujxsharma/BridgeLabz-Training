package streamApi;

public class GymMembership {
	String name ;
	int dayLeft ;
	GymMembership(String name , int dayLeft){
		this.dayLeft = dayLeft;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getDayLeft() {
		return dayLeft;
	}
}

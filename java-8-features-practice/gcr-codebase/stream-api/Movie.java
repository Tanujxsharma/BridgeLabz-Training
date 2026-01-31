package streamApi;

public class Movie {
float rating;
int year;
Movie(float rating , int year){
	this.rating=rating;
	this.year=year;
}
public float getRating() {
	return rating;
}
public int getYear() {
	return year;
}
public String toString() {
	return "the rating is  "+rating+" and year is  "+ year;
}
}

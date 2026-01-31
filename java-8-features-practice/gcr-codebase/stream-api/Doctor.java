package streamApi;

public class Doctor {
	String name;
Boolean availableOnWeekend ;
String specialty;
Doctor(String name ,String specialty,Boolean availableOnWeekend ){
	this.name = name;
	this.availableOnWeekend = availableOnWeekend;
	this.specialty = specialty;
}
public String getName() {
	return name;
}
public Boolean getAvailableOnWeekend() {
	return availableOnWeekend;
}
public String getSpecialty() {
	return specialty;
} 
@Override
public String toString(){
	return "the name of doctor is  "+name +" and specilist of "+ specialty;
}

}

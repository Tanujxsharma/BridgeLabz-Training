package annotations;
class Animal {
	public void makeSound() {
		
	}
}
public class Dog  extends Animal{
	@Override
public void makeSound() {
		System.out.println("Bark");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		dog.makeSound();
	}

}

package annotations;

public class LegacyApi {
	@Deprecated
	public void oldFeature() {
//		System.out.println("in old featrue");
	}
	public void newFeature() {
//		System.out.println("in new feature ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LegacyApi la= new LegacyApi();
		la.oldFeature();
		la.newFeature();

	}

}

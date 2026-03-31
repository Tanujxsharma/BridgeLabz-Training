package reflections;

import java.lang.reflect.Field;

class Configuration{
	private static String API_KEY="API_12545_KEY";
}
public class AccessandModifyStaticFields {

	public static void main(String[] args) throws Exception  {
		Class clazz = Configuration.class;
		Field field= clazz.getDeclaredField("API_KEY");
		field.setAccessible(true);
		System.out.println("Old Value is  : "+ field.get(clazz));
		field.set(clazz,"NEW_API_123456_KEY");
		System.out.println("New value is  : "+ field.get(clazz));
	}

}

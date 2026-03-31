import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This is the demo text that i am using and creating for the sole pupose of checking the word frequency code using java collectors if you want to know if this code works or not just copypaste and run the code hello hello hii hii this this work work purple  abababababababa abababbabababa ";
		
		String[] words = input.trim().toLowerCase().split("\\s+");
		
		Map<String, Integer> wordCount = Arrays.stream(words).collect(Collectors.toMap(word->word,word-> 1, Integer :: sum));
		
		wordCount.forEach((k,v)->System.out.println(k+ ": "+v));
		
	}

}
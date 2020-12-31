package eg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(123,2345,456,5768,243,123,67435,3246,22,22,22,22,22,22,123,645);
		
		List<Integer> liEven = new ArrayList<>();
		
		for(Integer i:li) {
			if(i%2==0)
				liEven.add(i);
		}
		System.out.println("Actual list li:"+li);
		System.out.println("Even list liEven:"+liEven);
		
		List<Integer> liEvenStreams = li.stream().filter((i->i%2==0)).distinct().sorted().collect(Collectors.toList());
		System.out.println("Even list streams :"+liEvenStreams);
	}

}

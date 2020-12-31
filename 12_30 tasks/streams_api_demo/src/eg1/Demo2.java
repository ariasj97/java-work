package eg1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Grapes", "Watermelon", "Lime", "Orange", "Strawberry", "Grapefruit", "Tangerine", "Apple", "Bannana");
		
		List<String> FruitsResult = fruits.stream().filter(f->f.length()>7).map(f->f.toUpperCase()).sorted().collect(Collectors.toList());
		System.out.println("Fruits Result : "+FruitsResult );
		
		//filters the strings that begin with the letter G
		List<String> fruitsThatStartWithG = fruits.stream().filter(f->f.startsWith("G")).collect(Collectors.toList());
		System.out.println("Fruits that begin with the letter G: "+fruitsThatStartWithG);
		
		//filters the fruits with length>5 and <7
		List<String> fruitsResult2 = fruits.stream().filter(f->f.length()>5&&f.length()<7).map(f->f.toUpperCase()).sorted().collect(Collectors.toList());
		System.out.println("Fruits with length()>5 and <7: "+ fruitsResult2);
		
		//Squares each number in the list
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		List<Integer> squares = num.stream().map(s->s*s).collect(Collectors.toList());
		System.out.println("The squares from 1 to 15: "+squares);
	}

}

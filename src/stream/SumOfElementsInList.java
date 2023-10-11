package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfElementsInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=Arrays.asList(1,2,3,4,5,6,7);
		
		Optional<Integer> sum=ls.stream().reduce((a,b)->a+b);
		
		System.out.println("Sum of elements is :"+sum.get());
		
		

	}

}

package stream;

import java.util.Arrays;
import java.util.List;

public class AverageOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=Arrays.asList(1,2,3,4,5,6,7);
		
		double average=ls.stream().mapToInt(l->l).average().getAsDouble();
		
		System.out.println("Average is:"+average);

	}

}

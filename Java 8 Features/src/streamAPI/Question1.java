package streamAPI;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-2);list.add(9);
		list.add(3);list.add(4);
		list.add(2);list.add(6);
		list.add(-24);list.add(-14);
		list.add(-1);list.add(10);
		list.add(-4);list.add(11);
		list.add(-8);list.add(12);
		
		List<Integer> negList = list.stream().filter(item -> item<0).collect(Collectors.toList());
		negList.stream().filter(item -> item%2==0).collect(Collectors.toList()).forEach(item -> System.out.println(item));
		
	}

}

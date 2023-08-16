import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestDS {

	public static void main(String[] args) {
		
		//List<Integer> list=new ArrayList<>();
		Set<Integer> list=new TreeSet<>();
		list.add(8);
		list.add(10);
		list.add(12);
		list.add(88);
		list.add(18);
		list.add(12);
		for(Integer x:list)
		{
			System.out.println(x);
		}
//		Collections.sort(list);
//		System.out.println(list);
		
	}
}

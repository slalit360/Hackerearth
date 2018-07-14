
import java.util.*;
import javafx.collections.*;

public class AlexString{

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);        
        String str = sc.nextLine(); 
        int count = sc.nextInt();
        String strout = "";
        Character t;
        
        char[] chars = str.toCharArray();
               
        List<Character> list = new ArrayList<Character>();
        for (char c : chars) {
            list.add(c);
        }
       
        List<Character> temp = new ArrayList<Character>();
        
		for(int i=0 ; i<chars.length ; i++)
        {
			if(list.size() >= count)
			{  
				temp=list.subList(0, count);
				Collections.sort(temp);
				t= temp.get(0);
			}
			else
			{
				Collections.sort(list);
				t= list.get(0);
			}
			
			list.remove(0);
        	strout=strout+t;

        }
		
		System.out.println(strout);
		
	}
    
}

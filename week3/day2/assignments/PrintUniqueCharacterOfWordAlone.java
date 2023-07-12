package week3.day2.assignments;
import java.util.HashSet;
import java.util.Set;


public class PrintUniqueCharacterOfWordAlone {
public static void main(String[] args) {
			String name="babu";
			System.out.println("Given Word is :"+name);
			char ch[]=name.toCharArray();
			Set<Character> set1=new HashSet<>();
			Set<Character> set2=new HashSet<>();
			for (int i = 0; i < ch.length; i++)
			{
				
				for (int j = i+1; j < ch.length; j++) 
				{
					if(ch[i]==ch[j]) 
					{
						//System.out.println(ch[i]+" "+ch[j]);
							set2.add(ch[i]);
					}
					else
					{
						set1.add(ch[j]);
						//System.out.println("ch "+ch[i]);
					}
				}
			}
			//System.out.println(set2);
	//System.out.println(set1);
	set1.removeAll(set2);
	System.out.println("Unique Character From Word "+set1);
		}

	}
package week1.day2.assignments;

public class FindIntersectionOf2Arrays {

	public static void main(String[] args) {
		// PROGRAM TO FindVIntersection Of TWO Arrays
		System.out.println("PROGRAM TO FindVIntersection Of TWO Arrays");
		int[] array1= {3,2,11,4,6,7};
		
		int[] array2= {1,2,8,4,9,7};
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if((array1[i]) == (array2[j]))
				System.out.println("FIRST  Arrays index "+i+" matches with second arrays same index "+ " , VALUE "+array1[i]);
				//System.out.println("PROGRAM TO FindVIntersection Of TWO Arrays "+array1[i]+" "+array2[j] );
			}
				
		}

	}

}


package learn.array;
import java.util.Arrays;
public class FindMissingElement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int[] numbers= {1,4,3,2,8,6,7};
Arrays.sort(numbers);
for(int i=0;i<numbers.length-1;i++)
{
	if(numbers[i+1]!=numbers[i]+1)
	{
		System.out.println("Missing num is" + " " +(numbers[i]+1));
		break;
		}
}


	}

}

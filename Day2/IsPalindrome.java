package week1.Day2;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=121;
int output=0;
for(int i=input;i>0;i=i/10)
{
	int rem=i%10;
	output=(output*10)+rem;
	}
if (input == output) {
    System.out.println(input + " is a Palindrome");
} else {
    System.out.println(input + " is not a Palindrome");
}
	}

}

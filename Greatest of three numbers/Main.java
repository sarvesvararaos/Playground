import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
      if (x > y && x > z)
      System.out.println(x);
    else if (y > x && y > z)
      System.out.println(y);
    else if (z > x && z > y)
      System.out.println(z);
    else
      System.out.println("The numbers are not distinct.");
    }
}
package maven.gift;
import java.util.*;
public class sweet {
	int chocolate,candy,bar,toffee,lollipop;
	sweet()
	{
		chocolate=0;
		candy=0;
		bar=0;
		toffee=0;
		lollipop=0;
	}
	void quantity()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of chocolates");
		chocolate=s.nextInt();
		System.out.println("Enter number of candies");
		candy=s.nextInt();
		System.out.println("Enter number of milky bars");
		bar=s.nextInt();
		System.out.println("Enter number of toffees");
		toffee=s.nextInt();
		System.out.println("Enter number of lollipops");
		lollipop=s.nextInt();
		
	}

}

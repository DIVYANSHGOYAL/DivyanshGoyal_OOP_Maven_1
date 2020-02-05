package maven.gift;
import java.util.*;
public class newyear extends sweet {
	public void newyeargift()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pre-determined range of candies");
		int r=sc.nextInt();
		System.out.println("Enter number of children");
		int c=sc.nextInt();
		int co=0,ca=0,ba=0,to=0,lo=0;
		for (int i=1;i<=c;i++)
		{
			System.out.println("Fill the gifts for child"+i);
			quantity();
			co=co+chocolate;
			ca=ca+candy;
			ba=ba+bar;
			to=to+toffee;
			lo=lollipop;
			
		}
		String a1[]= {"Chocolate","Candy","Milky Bar","Toffee","Lollipop"};
		int a2[]= {co,ca,ba,to,lo};
		System.out.println("The ascending order Hierarchy of sweets based on quantity is");
		for(int i=0;i<4;i++)
		{
			String t1="";int t2=0;
			for(int j=i;j<=4;j++)
			{
				if(a2[i]>a2[j])
				{
					t2=a2[j];t1=a1[j];
					a2[j]=a2[i];a1[j]=a1[i];
					a2[i]=t2;a1[i]=t1;
				}
			}
		}
		int tw=0;
		for(int i=0;i<=4;i++)
		{
			System.out.println(a1[i]+"-"+a2[i]);
			tw=tw+a2[i];
		}
		if(tw<=r)
		System.out.println("The candies in the gifts are "+tw+" and left are "+(r-tw));
		else
			System.out.println("The candies in the gifts are to be "+tw+" and more needed"+(tw-r));
		
	}

}

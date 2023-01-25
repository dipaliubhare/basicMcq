//swap
public class Swap{
	int a;
	int b;

public static void swapNumbers(Swap s){
	int temp;
	temp=s.a;
	s.a=s.b;
	s.b=temp;
}
public static void main(String[] args){
	Swap s=new Swap();
	 s.a=10;
	 s.b=20;
	System.out.println("a="+s.a+" b= "+s.b);
	Swap.swapNumbers(s);
	System.out.println("a="+s.a+" b= "+s.b);
}

}
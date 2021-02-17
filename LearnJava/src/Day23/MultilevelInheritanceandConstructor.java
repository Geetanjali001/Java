package Day23;

class Aa
{
	public Aa()
	{
		System.out.println("Class A constructor");
	}
}
class Bb extends Aa
{
	public Bb()
	{
		System.out.println("Constructor of B");
	}
}
class Cc extends Bb
{
	public Cc()
	{
			System.out.println("Class C constructor");
	}
}

public class MultilevelInheritanceandConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cc ob=new Cc();
	}

}

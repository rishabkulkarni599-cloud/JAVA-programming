package asdfghjkl;

class Parent 
{
	void marry()
	{
		System.out.println("slelcted by family");
	}
	void propert()
	{
		System.out.println("propety of family");
	}
}

class Demo extends Parent {
	void marry()
	{
		System.out.println("campus selected");
	}
	public static void main(String[] args) {
		Demo bb = new Demo();
		bb.marry();
		bb.propert();
	}

}

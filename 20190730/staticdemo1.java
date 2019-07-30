class staticdemo1
{ 
	static
	{
		System.out.println("Initilizer/static Block called");
		System.out.println("----------------------------------------");
	}
	{
		System.out.println("----------------------------------------");
		System.out.println("Non static Block called");
	}
	public static String institute="CPI";
	int id;
	String name;
	public static void main(String[]a)
	{
		System.out.println("Main method is called");
		System.out.println("static variable " + institute);
		
		staticdemo d1=new staticdemo();
		d1.display();
		
		staticdemo d2=new staticdemo(2,"amit");
		d2.display();
	}
	staticdemo()
	{
		id=1;
		name="demo";
	}
	staticdemo(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println("static variable in display() " + institute);
		System.out.println("----------------------------------------");
		System.out.println("id " + id);
		System.out.println("name " + name);
	}
}
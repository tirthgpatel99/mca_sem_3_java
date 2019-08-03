class employee
{
	int empid;
	String ename;
	double salary;
	
	employee(int eid,String name,double sal)//perameter constructor
	{
		System.out.println("u r in perameter constructor");
		this.empid=eid;
		this.ename=name;
		this.salary=sal;
	}
	employee()//defaut constructor
	{
		System.out.println("u r in defaut constructor");
		this.empid=0;
		this.ename=null;
		this.salary=0.0;
	}
	employee(employee e)//copy constructor
	{
		System.out.println("u r in copy constructor");
		this.empid=e.empid;
		this.ename=e.ename;
		this.salary=e.salary;
	}
	void display()
	{
		System.out.println("Employee id:"+ empid);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+salary);		
	}
	void setempid(int eid)
	{
		this.empid=eid;
	}
	void setename(String name)
	{
		this.ename=name;
	}
	void setsalary(int sal)
	{
		this.salary=sal;
	}
	int getempid()
	{
		return this.empid;
	}
	String getempname()
	{
		return this.ename;
	}
	double getsalary()
	{
		return this.salary;
	}

}
class test
		{
			public static void main(String []a)
			{
				employee[] staff=new employee[3];
				staff[0]=new employee(1,"Amit patel",500000d);
				staff[1]=new employee(2,"Mehul Joshi",600000d);
				staff[2]=new employee(3,"vijay chauhn",700000d);
				//short hand for loop
				for(employee e:staff)
						System.out.println("id" + e.getempid()+"name" +e.ename() +);
			}
		}


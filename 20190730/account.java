class account1{
	
	int acid;
	String a/choldername;
	String type;
	double balance;
		
		account1(int aid ,String hname,String typ,double blnc)//perameter constructor
		{
			System.out.println("u r in perameter constructor");
			this.acid=aid;
			this.a/choldername=hname;
			this.type=typ;
			this.balance=blnc;	
		}
		account1()//defaut constructor
		{
		System.out.println("u r in defaut constructor");
		this.acid=0;
		this.a/choldername=null;
		this.type=null;
		this.balance=0.0;
		}
		account1(account1 a1)//copy constructor
		{
		System.out.println("u r in copy constructor");
		this.acid=a1.aid;
		this.a/choldername=a1.hname;
		this.type=a1.typ;
		this.balance=a1.blnc;
		}
		void display()
		{
			System.out.println("Ac id:"+this.acid);
			System.out.println("Ac holdername:"+this. hname);
			System.out.println("Ac type:"+this.typ);
			System.out.println("Ac balance:"+this.blnc);	
		}
		void setacid(int aid)
		{
		this.acid=aid;
		}
	void seta/choldername(String hname)
		{
		this.a/choldername=hname;
		}
	void settype(String typ)
	{
		this.type=typ;
	}
	void setbalance(int blnc)
	{
		this.balance=blnc;
	}
	int getacid()
	{
		return this.aid;
	}
	String geta/choldername()
	{
		return this.hname;
	}
	String gettype()
	{
		return this.typ;
	}
	double getbalance()
	{
		return this.blnc;
	}
}


class account
{
		public static void main(String []a)
		{
		System.out.println("-----------------------");
		account a1=new account(1,"Priya Patel");
		a1.display();
		}
	
}
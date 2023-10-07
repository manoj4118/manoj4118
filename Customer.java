package swiggy1;



public class Customer 
{
  private String name;
  private long cno;
  private String addr;
  private String p1 = "Ice Cream";
  private String p2= "Biryani";
  private String p3= "Pav bhaji";
  private int quantity;
  
  
  public Customer()
  {
	  
  }
  
  
  public Customer(String name, long cno, String addr)
  {
	
	this.name = name;
	this.cno = cno;
	this.addr = addr;
  }


public String getName() 
{
	return name;
}


public void setName(String name)
{
	this.name = name;
}


public long getCno()
{
	return cno;
}


public void setCno(long cno)
{
	this.cno = cno;
}


public String getAddr()
{
	return addr;
}


public void setAddr(String addr)
{
	this.addr = addr;
}


public String getP1()
{
	return p1;
}


public void setP1(String p1)
{
	this.p1 = p1;
}


public String getP2() 
{
	return p2;
}


public void setP2(String p2)
{
	this.p2 = p2;
}


public String getP3()
{
	return p3;
}


public void setP3(String p3)
{
	this.p3 = p3;
}


public int getQuantity() 
{
	return quantity;
}


public void setQuantity(int quantity) 
{
	this.quantity = quantity;
}
 
  
  
}

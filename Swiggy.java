package swiggy1;


import java.util.Scanner;
public class Swiggy
{    Scanner s1 = new Scanner(System.in);
    String hname = "Shivneri";
    Customer c;
    Customer c1 = new Customer(); 
    Customer c2 = new Customer();
    Customer c3 = new Customer();
    int it = 0;
    int bt=0;
    int pt=0;
    public void placeorder()
    {   
       if(c==null)
       {
    	System.out.println("Enter the Name");
    	String name = s1.next();
    	System.out.println("Enter the Contact Number");
    	long cno = s1.nextLong();
    	System.out.println("Enter the drop Location");
    	String addr = s1.next();

    	c= new Customer(name,cno,addr);
    	boolean exit = true;
    	while(exit)
    	{
    		System.out.println("What do you Want to Order ?\n1.Ice cream\n2.Biryani\n3.Pav Bhaji\n4.Go Back(After Order)\n5.Exit (without ordering)"); 
			System.out.println("--------------------------------------------------------------------");

    		int ch = s1.nextInt();
    		switch(ch)
    		{
    	    	case 1:
    	    	{
    	    		System.out.println("Enter The Quantity");
    	    		int q = s1.nextInt();
    	    		c1.setQuantity(q);
    	    		System.out.println("Ice cream Added Successfully");
    				System.out.println("--------------------------------------------------------------------");

    	    		
    	    	}
    	    	break;
    	    	case 2:
    	    	{
    	    		System.out.println("Enter The Quantity");
    	    		int q = s1.nextInt();
    	    		c2.setQuantity(q);
    	    		System.out.println("Biryani  Added Successfully");
    				System.out.println("--------------------------------------------------------------------");

    	    		

    	    	}
    	    	break;
    	    	case 3:
    	    	{
    	    		System.out.println("Enter The Quantity");
    	    		int q = s1.nextInt();
    	    		c3.setQuantity(q);
    	    		System.out.println("Pav Bhaji Added Successfully");
    				System.out.println("--------------------------------------------------------------------");


    	    	}
    	    	break;
    	    	case 4:
    	    	{
    	    		exit = false;
    	    		
    	    	}
    	    	break;
    	    	case 5:
    	    	{
    	    		c=null;
    	    		exit = false;
    	    	}
    	    	break;
    	    	default :
    	    	{
    	    		System.out.println("Invalid input.....");
    				System.out.println("--------------------------------------------------------------------");

    	    	}
    		}
    		
    	}
    	
    }
    else
      {
    	 System.out.println("Order Is Already Placed.....");  
			System.out.println("--------------------------------------------------------------------");
      }
  }     
    
    public void cancelorder()
    {
    	if(this.c==null)
    	{
    		System.out.println("First place the order.....");
			System.out.println("--------------------------------------------------------------------");

    	}
    	else
    	{
    		this.c = null;
    		System.out.println("Order cancelled Successfully.....");
			System.out.println("--------------------------------------------------------------------");

    	}
    }
    
    public void displaydetails()
    {
    	if(this.c==null)
    	{
    		System.out.println("First place the order.....");
			System.out.println("--------------------------------------------------------------------");

    	}
    	else
    	{
    	     System.out.println("------Order Details------");
    	     System.out.println("Restaurant Name : "+hname);
    	     System.out.println("Customer Name : "+c.getName());
    	     System.out.println("Customer Address : "+c.getAddr());
    	     it=50*c1.getQuantity();
 	         bt = 100*c2.getQuantity();
 	         pt = 100*c3.getQuantity();
    	     if(it!=0 && bt==0 && pt==0)
    	     {
    	    	 System.out.println("Order : "+c.getP1());
    	     }
    	     else if(bt!=0 && it==0 && pt==0)
    	     {
    	    	 System.out.println("Order : "+c.getP2());
    	     }
    	     else if(pt!=0 && it==0 && bt==0)
    	     {
    	    	 System.out.println("Order : "+c.getP3());
    	     }
    	     else if(it!=0 && bt!=0 && pt==0)
    	     {
    	    	 System.out.println("Order : "+c.getP1()+"\n        "+c.getP2());

    	     }
    	     else if(bt!=0 && pt!=0 && it==0)
    	     {
    	    	 System.out.println("Order : "+c.getP2()+"\n        "+c.getP3());

    	     }
    	     else if(it!=0 && pt!=0 && bt==0)
    	     {
    	    	 System.out.println("Order : "+c.getP1()+"\n        "+c.getP3());

    	     }
    	     else if(it!=0 && bt!=0 && pt!=0)
    	     {
    	    	 System.out.println("Order : "+c.getP1()+"\n        "+c.getP2()+"\n        "+c.getP3());
    	     }
    	     else
    	     {
    	    	 System.out.println("Order : Not Ordered Yet!");
    	     }
    	     
    	     if(it!=0 || bt!=0 || pt!=0)
    	     {
    	        System.out.println("Order ID : "+c.hashCode());
    	     }
    	     else
    	     {
    	    	 System.out.println("Order ID : 0");
    	     }
    	       double tot = it+bt+pt;
    	     if(tot>=1500)
    	     {
    	    	double tot1 = tot + tot*9/100;
    	    	double tot2 = tot1 - tot1*5/100;
    	    	System.out.println("Your Total : "+tot2+"(9% GST) (5% Discount)"); 
    	     }
    	     else
    	     {
      	       System.out.println("Your Total : "+tot);

    	     }
    	       
 		   	 System.out.println("--------------------------------------------------------------------");
 			 System.out.println("\nThank You Visit Again.....");
 			 System.out.println("\n--------------------------------------------------------------------");

 			

    		
    	}
    }
    
    public void updatedetails()
    {
    	if(this.c==null)
    	{
    		System.out.println("First place the order.....");
			System.out.println("--------------------------------------------------------------------");

    	}
    	else
    	{
    		  boolean exit = true;
    		  while(exit)
    		  {
    		     System.out.println("What Do you Want To Update ?\n1.Name\n2.Contact Number\n3.Drop Location\n4.Quantity\n5.Go Back");
    				System.out.println("--------------------------------------------------------------------");

    			  int ch = s1.nextInt();
    			     switch(ch)
    			       {
    			           case 1:
    			             {
    			    	       System.out.println("Enter Your Name");
    			    	       String s=s1.next();
    			    	       c.setName(s);
    			    	       System.out.println("Customer Name Is Updated Successfully....."); 
    			   			   System.out.println("--------------------------------------------------------------------");

    			             }
    			             break;
    			           case 2:
    			             {
   			    	          System.out.println("Enter Your Contact Number");
   			    	          long l = s1.nextLong();
   			    	          c.setCno(l);
   			    	          System.out.println("Contact Number Is Updated Successfully.....");  			
   			   			      System.out.println("--------------------------------------------------------------------");


    			             }
    			             break;
    			           case 3:
    			             {
   			    	          System.out.println("Enter Your Location");
   			    	          String st = s1.next();
   			    	          c.setAddr(st);
   			    	          System.out.println("Drop Area Updated Successfully.....");  
   			   			      System.out.println("--------------------------------------------------------------------");


    			             }
    			             break;
    			           case 4:
    			             {
    			            	 boolean back = true;
    			            	 while(back)
    			            	 {
   			    	                 System.out.println("Which Quantity Do You Want To Update ?\n1.Ice Cream\n2.Biryani\n3.Pav Bhaji\n4.Go Back");
   			    	  		       	 System.out.println("--------------------------------------------------------------------");

   			    	                 int choice = s1.nextInt(); 
   			    	                   switch(choice)
   			    	                      {
   			    	                          case 1:
   			    	                             {
   			    	                	             System.out.println("Enter The Quantity");
   			    	                	             int q = s1.nextInt();
   			    	                	             c1.setQuantity(q);
   			    	                	             System.out.println("Updated Successfully.....");
   			    			    	  		       	 System.out.println("--------------------------------------------------------------------");

   			    	                             }
   			    	                             break;
   			    	                          case 2:
   			    	                             {
   			    	                	             System.out.println("Enter The Quantity");
   			    	                	             int q = s1.nextInt();
   			    	                	             c2.setQuantity(q);
   			    	                	             System.out.println("Updated Successfully.....");
   			    			    	  		       	 System.out.println("--------------------------------------------------------------------");


   			    	                             }
   			    	                             break;
   			    	                          case 3:
   			    	                             {
   			    	                	             System.out.println("Enter The Quantity");
   			    	                	             int q = s1.nextInt();
   			    	                	             c3.setQuantity(q);
   			    	                	             System.out.println("Updated Successfully.....");
   			    			    	  		       	 System.out.println("--------------------------------------------------------------------");



   			    	                             }
   			    	                             break;
   			    	                          case 4:
   			    	                             {
   			    	                        	  back = false;
   			    	                             }
   			    	                             break;
   			    	                          default :
   			    	                             {
   			    	                            	System.out.println("Invalid Input"); 
   			   			    	  		       	 System.out.println("--------------------------------------------------------------------");

   			    	                             }
   			    	                      }
   			    	                   
    			            	 }
    			             }
    			             break;
    			           case 5:
    			             {
   			    	          exit = false;

    			             }
    			             break;
    			             default :
    			             {
   			    	          System.out.println("Invalid Input.....");
		    	  		       	 System.out.println("--------------------------------------------------------------------");


    			             }
    			           
    			            
    			       }
    		  }
    	}
    }
    
}

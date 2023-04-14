package lab3;
interface LibraryUser
{
	void registerAccount();
	void requestBook();
}
class KidUsers implements LibraryUser
{
     int age;
     String bookType;
     public KidUsers(int age,String bookType)
     {
    	 super();
    	 this.age=age;
    	 this.bookType=bookType;
     }
	@Override
	public void registerAccount() {
		if(age>5 && age<=12)
		 System.out.println("You have Successfullyregisterd under a kids Account");
		else
			System.out.println("Sorry,age must be less than 12 to register as a kid");
	}

	@Override
	public void requestBook() {
		if(bookType.equalsIgnoreCase("Kids")&&age<=12)
		    System.out.println("Book issued Successfully...Please return the book within 10 Days");
		else
			System.out.println("Oops...You are allowed to take only Kids books");
	
	}
       	
}
class AdultUser implements LibraryUser
{
    int age;
    String booktype;
    public AdultUser(int age,String bookType)
    {
    	super();
    	this.age=age;
    	this.booktype=bookType;
    }
    
	@Override
	public void registerAccount() {
		if(age<90 && age>12)
			 System.out.println("You have Successfullyregisterd under an Adult Account");
			else
				System.out.println("Sorry,age must be greater than 12 to register as a Adult");
		
	}

	@Override
	public void requestBook() {
			if(booktype.equalsIgnoreCase("Adults")&&age>12)
			{
			   System.out.println("Book issued Successfully...Please return the book within 10 Days");	
			}
			else
				System.out.println("Oops...You are not allowed to take only Kids books");
	}
	
}
public class Interface {

	public static void main(String[] args) {
	    KidUsers kid = new KidUsers(10,"Kids");
	    System.out.println("Age of Candidate : "+kid.age);
	    System.out.println("Book Type : "+kid.bookType);
	    kid.registerAccount();
	    kid.requestBook();
	    System.out.println("-----------------------------");
	     
	   KidUsers kid1 = new KidUsers(18,"Fiction");
	   System.out.println("Age of Candidate : "+kid1.age);
	   System.out.println("Book Type : "+kid1.bookType);
	   kid1.registerAccount();
	   kid1.requestBook();
	   System.out.println("---------------------------------");
	   
	   
	   AdultUser adult = new AdultUser(5,"Kids");
	   System.out.println("Age of Candidate : "+adult.age);
	   System.out.println("Book Type : "+adult.booktype);
	   adult.registerAccount();
	   adult.requestBook();
	   System.out.println("-----------------------------------");
	   
	   AdultUser adult1 = new AdultUser(12,"Fiction");
	   System.out.println("Age of Candidate : "+adult1.age);
	   System.out.println("Book Type : "+adult1.booktype);
	   adult1.registerAccount();
	   adult1.requestBook();
	   
	}

}

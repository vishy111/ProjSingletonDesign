import java.util.HashMap;

public class Library {
	public static Library library;
	private HashMap <String, Integer> books=new HashMap<String,Integer>();
	
	private Library() 
	{
		//library= Library.getInstance();
		System.out.println("Creating our Library. Time to begin reading");
	}
	public static Library getInstance()
	{
		if(library == null)
			library = new Library();
		return library;
	}
	 public void checkInBook(String bookName,int numToAdd)
	   {
	       //Check if book exists
	       if(books.containsKey(bookName))
	       {
	           int count=books.get(bookName);
	           books.put(bookName, count+numToAdd);
	       }
	       else
	       {
	           books.put(bookName, numToAdd);
	       }
	       System.out.println(bookName+" was added to the library");
	   }
	public boolean checkoutBook(String bookName)
	{
		
		if(books.containsKey(bookName));
		{
			int count= books.get(bookName);
		
		if(count>0)
		{
			books.put(bookName, count-1);
			System.out.println(bookName+" was successfully checkout");
		
			return true;
		}
		else
			System.out.println("Sorry "+ bookName +" is not in stock");
		}
		return false;
	}
	 public void displayBooks()
	   {
	       System.out.println("Inventory:");
	       for (HashMap.Entry<String, Integer> entry : books.entrySet()) {
	           System.out.println("- "+entry.getKey() + ", copies: " + entry.getValue());
	       }

}
}

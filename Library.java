import java.util.HashMap;
/**
 * 
 * @author vishalkosaraju
 *
 */
public class Library {
	public static Library library;
	/**
	 * Declare map of books
	 */
	private HashMap <String, Integer> books=new HashMap<String,Integer>();
	/**
	 * Default Constructor
	 */
	private Library() 
	{
		System.out.println("Creating our Library. Time to begin reading");
	}
	/**
	 * The purpose of this method is to return an instance
	 * @return Library
	 */
	public static Library getInstance()
	{
		if(library == null)
			library = new Library();
		return library;
	}
	/**
	 * The purpose of this method is to add books to the library
	 * @param bookName is a key string that aids in searching that the book exists
	 * @param numToAdd is an int that signifies how many items should be added
	 */
	 public void checkInBook(String bookName,int numToAdd)
	   {
	       
	       if(books.containsKey(bookName))
	       {
	           int count = books.get(bookName);
	           books.put(bookName, count + numToAdd);
	       }
	       else
	       {
	           books.put(bookName, numToAdd);
	       }
	       System.out.println(bookName + " was added to the library");
	   }
	 /**
	  * The purpose of this method is to checkout books from the library
	  * @param bookName is a key string that aids in searching that the book exists
	  */
	public boolean checkoutBook(String bookName)
	{
		
		if(books.containsKey(bookName));
		{
			int count = books.get(bookName);
		
		if(count>0)
		{
			books.put(bookName, count-1);
			System.out.println(bookName +" was successfully checked out");
		
			return true;
		}
		else
			System.out.println("Sorry " + bookName +" is not in stock");
		}
		return false;
	}
	/**
	 * The purpose of this method is to display all the books
	 */
	 public void displayBooks()
	   {
	       System.out.println("Inventory:");
	       for (HashMap.Entry<String, Integer> entry : books.entrySet()) {
	           System.out.println(" - "+ entry.getKey() + ", copies: " + entry.getValue());
	       }

}
}

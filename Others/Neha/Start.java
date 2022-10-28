public class Start
{
	public static void main(String [] args)
	{
		
		StoryBook s1 = new StoryBook("20-43372-1","An Occurrence at Owl Creek Bridge One of the Missing","Ambrose Bierce",200.00,160,"Story Book");
		StoryBook s2 = new StoryBook("20-43398-1","A Boy at Seven","John Bidwell",450.00,60,"Story Book");
		StoryBook s3 = new StoryBook("20-43371-1","The Grass is Always Greener","Jeffrey Archer",255.00,20,"Story Book");
		StoryBook s4 = new StoryBook("20-43365-1","The Higgler","A. E. Coppard",300.00,36,"Story Book");
		StoryBook s5 = new StoryBook("20-43360-1","The Hostage","C. S. Forester",105.00,89,"Story Book");

		TextBook t1 = new TextBook("20433721","Concepts of Programming Languages","Robert W. Sebesta",366.00,12,1);
		TextBook t2 = new TextBook("20433981","C++ Programming: From Problem Analysis to Program Design","D. S. Malik",189.00,56,4);
		TextBook t3 = new TextBook("20433711","International Economics: Theory And Policy","Krugman, Paul R.; Obstfeld, Maurice",423.00,67,2);
		TextBook t4 = new TextBook("20433651","Technical Communication","John M. Lannon",502.00,21,3);
		TextBook t5 = new TextBook("20433601","Organic Chemistry","Paula Yurkanis Bruice",289.00,46,5);

		BookShop bookShop = new BookShop("Neha");

		if(bookShop.insertBook(s1))
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("Not Done");
		}

		if(bookShop.insertBook(s2))
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("Not Done");
		}

		if(bookShop.insertBook(s3))
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("Not Done");
		}

		if(bookShop.insertBook(s4))
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("Not Done");
		}

		if(bookShop.insertBook(s5))
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("Not Done");
		}

		if(bookShop.insertBook(t1))
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("Not Done");
		}

		if(bookShop.insertBook(t2))
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("Not Done");
		}

		if(bookShop.insertBook(t3))
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("Not Done");
		}

		if(bookShop.insertBook(t4))
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("Not Done");
		}

		if(bookShop.insertBook(t5))
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("Not Done");
		}

		bookShop.showAllBooks();

		Book forSearch = new Book();
		forSearch=bookShop.searchBook("1-86092-049-7");
		if(forSearch!=null)
		{
			System.out.println("Found");forSearch.showDetails();
		}
		else
		{
			System.out.println("Don't match");
		}
	}
}
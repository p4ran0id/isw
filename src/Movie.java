public class Movie
{
	private String title;
	private int time;
	private  int number;
	// start collection with 1, 0 would be also possible
	private static int nextNumber = 1; 

	// Constructor

	// by creating a new object of the class Movie, 
	// this.* set the classvariable * (title, time, nextNumber)
	// to a given value
	public Movie(String title, int time)
	{
		this.title = title;
		this.time = time;
		this.number = nextNumber;
		nextNumber += 1;
	}

	// getter-setter

	// the setter setTitle needs a String arg
	// which will become the title
	// of the object Movie
	// for Example movie1.setTitle("test") will
	// set the title to test but only for movie1
	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTime(int time)
	{
		this.time = time;
	}

	public int getTime()
	{
		return time;
	}

	// showInformation shows all Attributes for an object of Movie
	public void showInformation()
	{
		System.out.println("Number:  " + this.number);
		System.out.println("Title :  " + this.title);
		System.out.println("Time  :  " + this.time);
		//System.out.println("________________________");
		System.out.println("----------------------------");
	}

	// main

	public static void main(String[] args)
	{
		// declare an Object 'newMovie' from class Movie
		// the programm knows that newMovie is from class 
		// Movie, but the Object does not exist at this time
		Movie firstMovie;

		// create the declared Object with given values
		firstMovie = new Movie("James Bond", 180);
		firstMovie.showInformation();
		Movie secondMovie = new Movie("Terminator", 120);
		Movie thirdMovie = new Movie("Star Wars Episode IV", 160);
		secondMovie.showInformation();
		thirdMovie.showInformation();
	}
}


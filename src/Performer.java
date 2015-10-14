public class Performer
{
	private String firstname;
	private String lastname;
	private Gender gender;
	private Movie movie;

	// constructor
	public Performer()
	{}
	public Performer(String firstName, String lastName, Gender gender)
	{
		this.firstname = firstName;
		this.lastname = lastName;
		this.gender = gender;
	}

	// getter-setter
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}

	public Gender getGender()
	{
		return gender;
	}

	public void setMovie(Movie movie)
	{
		this.movie = movie;
	}

	public Movie getMovie()
	{
		return movie;
	}
}


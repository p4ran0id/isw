public class MyFirstMovieManager
{
	private Movie movie;
	private Performer performer;

	// constructor
	public MyFirstMovieManager()
	{
	}

	public MyFirstMovieManager (Movie movie)
	{
		this.movie = movie;
	}

	public MyFirstMovieManager (Movie movie, Performer performer)
	{
		this.movie = movie;
		this.performer = performer;
	}

	// add Performer to a Movie
	public void addPerformer (Performer performer)
	{
		this.performer = performer;
		performer.setMovie(this.movie);
	}

	// give all performer
	public Performer findPerformer()
	{
		return performer;
	}
}

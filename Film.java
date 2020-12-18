package Integration;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class Film {
	private String title ;
	private String summary;
	private int year;
	private Name director ;
	private Name[] actors;
	
	public Film() {}

	public Film(String title, String summary, int year, Name director, Name[] actors) {
		super();
		this.title = title;
		this.summary = summary;
		this.year = year;
		this.director = director;
		this.actors = actors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Name getDirector() {
		return director;
	}

	public void setDirector(Name director) {
		this.director = director;
	}

	public Name[] getActors() {
		return actors;
	}

	public void setActors(Name[] actors) {
		this.actors = actors;
	}
	
	@Override
	public String toString(){
		//concatenation StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("---------- Film Details ----------\n");
		sb.append("Title : "+getTitle()+"\n");
		sb.append("Summary : "+getSummary()+"\n");
		sb.append("Year : "+getYear()+"\n");
		sb.append("Director : "+getDirector()+"\n");
		sb.append("Actors : "+Arrays.toString(getActors())+"\n");
		sb.append("\n---------------------------");
		return sb.toString();
	}
	
	public static void main(String[] args) {
	Film Emp1= new Film();
	Emp1.setTitle("The Road");

	//System.out.println(Emp1.getName());

	System.out.println(Emp1.getTitle());

	}

	public void setDirector(Integration.Name dir) {
		
	}

	public void setActors(Integration.Name[] act) {
		
	}

}

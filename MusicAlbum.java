package com.gmail.axoh24;

public class MusicAlbum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
private String title;
private String artistName;
private String trackName;
private int numberOfTracks;
private int numberOfMinutes;


public MusicAlbum()

{
	title= "";
	artistName= "";
	numberOfTracks= 0;
	numberOfMinutes= 0;
	
}
public void set(String title, String artist, int num, String track, int minutes) {
	setTitle(title);
	setArtistName(artist);
	setNumberOfTracks(num);
	setNumberOfMinutes(minutes);
	setTrackName(track);
}

public void
setTitle(String title) {
	this.title = title;
}

public void
setArtistName(String artistName) {
	this.artistName= artistName;
	
}

public void 
setNumberOfTracks(int numberOfTracks) {
this.numberOfTracks = numberOfTracks;


}
public void setTrackName(String trackName)
{
	this.trackName = trackName;
}

public void 
	setNumberOfMinutes(int numberOfMinutes)
	{
	this.numberOfMinutes= numberOfMinutes;
	
	}
public String getTitle()
{
	return title;
}
public String getArtistName()
{
return artistName;
}
public String getTrackName()
{
	return trackName;
}
public int getNumberOfTracks()
{
	return numberOfTracks;
}

public int getNumberOfMinutes()
{
	return numberOfMinutes;
	
}
@Override
public String toString()
{
	return"Title name: "+ title+"\n" +"Artist Name:"+artistName+"\n"
			+"Number Of Tracks:"+numberOfTracks+"\n"+"Track Name:"
			+trackName+"\n" + "Number of Minutes: "+ numberOfMinutes;
}

}


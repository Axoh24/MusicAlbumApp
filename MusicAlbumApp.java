package com.gmail.axoh24;
import com.gmail.axoh24.MusicAlbum;
public class MusicAlbumApp {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		MusicAlbum obj = new MusicAlbum();
		obj.set("SmackSmack", "Emtee", 5, "Woza", 6);
		System.out.println("Title: " + obj.getTitle() + "\n" + "Artist Name: " + obj.getArtistName() + "\n" + "Number of track: " + obj.getNumberOfTracks() + "\n" + "Track Name: " + obj.getTrackName() + "\n" + obj.getNumberOfMinutes() + ")");
		
		System.out.println("\n");
		
		obj.set("Strings and blings", "Nasty C", 10, "SMA", 6);
		System.out.println("Title: " + obj.getTitle() + "\n" + "Artist Name: " + obj.getArtistName() + "\n" + "Number of track: " + obj.getNumberOfTracks() + "\n" + "Tracks: \n" + " 1. " + obj.getTrackName() + "(" + obj.getNumberOfMinutes() + ")" +"\n 2. Jungle (5)" + "\n 3. Mrs Me (4)" + "\n 4. They don't (6)");
		
		System.out.println("\n");
		
		obj.set("Ndizozisola", "Semito", 9, "Ndilawule", 6);
		System.out.println("Title: " + obj.getTitle() + "\n" + "Artist Name: " + obj.getArtistName() + "\n" + "Number of track: " + obj.getNumberOfTracks() + "\n" + "Tracks: \n" + "1." + obj.getTrackName() + "(" + obj.getNumberOfMinutes() + ")");
		
		System.out.println("\n");
		
		obj.set("Bow Down", "Rihhan", 5, "Beauty", 6);
		System.out.println("Title: " + obj.getTitle() + "\n" + "Artist Name: " + obj.getArtistName() + "\n" + "Number of track: " + obj.getNumberOfTracks() + "\n" + "Tracks: \n" + " 1. " + obj.getTrackName() + "(" + obj.getNumberOfMinutes() + ")" +"\n 2. Jungle (5)" + "\n 3. Mrs Me (4)" + "\n 4. They don't (6)");
		
		System.out.println("\n");
		
		obj.set("Worldwide", "Simmy", 9, "Slogn", 6);
		System.out.println("Title: " + obj.getTitle() + "\n" + "Artist Name: " + obj.getArtistName() + "\n" + "Number of track: " + obj.getNumberOfTracks() + "\n" + "Tracks: \n" + "1." + obj.getTrackName() + "(" + obj.getNumberOfMinutes() + ")");

		System.exit(0);
	}

}

	
	
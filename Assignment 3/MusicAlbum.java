//MusicAlbum.java
package com.gmail.onesihawu;
import javax.swing.*;
import java.util.Scanner;
public class MusicAlbum
{
	public static void main(String[] args) 
	{
		String numOfTracks,
		       title,
			   artist,
			   trackName,
			   min,		
			   addtoString = "";

	    int trackNo = 1,
	    	stringToInt;

	    numOfTracks = JOptionPane.showInputDialog("How many tracks do you want?");
	    stringToInt = Integer.parseInt(numOfTracks);

	    do
	    {
	    	title = JOptionPane.showInputDialog("Enter Title");
	    	artist = JOptionPane.showInputDialog("Enter the artist name");	    	
	    	trackName = JOptionPane.showInputDialog("Enter the track name");
	    	min = JOptionPane.showInputDialog("Enter the playback time in minutes e.g. [03:28]");

	    	addtoString +=  trackNo + "." + "  " + title + "  " + "  " + artist + "  " + min + "\n";
	    	trackNo++;
	    }
	    while( trackNo <= stringToInt);

        JOptionPane.showMessageDialog(null,addtoString,"Music Album",1);
	}	
}

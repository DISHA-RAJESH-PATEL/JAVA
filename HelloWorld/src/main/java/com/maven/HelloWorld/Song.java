//java program to illustrate a simple pojo class
//POJO:-PLAIN OLD JAVA OBJECT

package com.maven.HelloWorld;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//used to create/define entities in  pojo class eg:name id etc
@Entity

//USED TO CREATE A TABLE INSIDE THE DATABASE
@Table(name = "song")

//POJO CLASS
public class Song {
	// @ wala direct compilation ke bad table mein jayega
	// USED TO DENOTE PRIMARY KEY IN THE TABLE
	@Id

	// to create coumn named songId
	// ye database table ke leeye hai
	@Column(name = "songId")
	// yeh pojo class ke leeye hai
	private int id; // encapsulation use kr rhe hai table ke leeye

	@Column(name = "songName")
	private String songName;

	@Column(name = "singer")
	private String artist;

	// getters setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}

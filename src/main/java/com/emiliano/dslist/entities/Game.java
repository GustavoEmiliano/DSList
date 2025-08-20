package com.emiliano.dslist.entities;

public class Game {

	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String plataforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;

	public Game() {

	}

	public Game(Long id, String title, Integer year, String genre, String plataforms, Double score, String imgUrl,
			String shortDescription, String longDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.plataforms = plataforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	
}

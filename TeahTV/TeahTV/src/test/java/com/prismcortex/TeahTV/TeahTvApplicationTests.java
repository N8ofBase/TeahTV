package com.prismcortex.TeahTV;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeahTvApplicationTests {

	Movie testMovie = new Movie();
	Movie testMovie2 = new Movie();


	@BeforeEach
	public void createTestMovies() {
		testMovie.setTitle("Test Movie");
		testMovie.setYear_released(1982);
		testMovie.setDirector("Nate");
		testMovie.setCategory("Disney");
		testMovie.setDisc("Blu-Ray");
		testMovie.setLocation("Test1");
		testMovie2.setTitle("Test Movie2");
		testMovie2.setYear_released(1983);
		testMovie2.setDirector("NateS");
		testMovie2.setCategory("Christmas");
		testMovie2.setDisc("DVD");
		testMovie2.setLocation("Test2");

	}

	/* Test for a movie object that contains String title, int year_released, String director, String category,
	String disc, and String location.
	 */
	@Test
	public void testForMovieObject() {
		assertAll("testMovie", () -> assertEquals("Test Movie", testMovie.getTitle()),
				() -> assertEquals(1982, testMovie.getYear_released()), () -> assertEquals("Nate", testMovie.getDirector()),
				() -> assertEquals("Disney", testMovie.getCategory()), () -> assertEquals("Blu-Ray", testMovie.getDisc()),
				() -> assertEquals("Test1", testMovie.getLocation()));
	}

	/* Test for Collection object that contains a list of movies
	 */

}

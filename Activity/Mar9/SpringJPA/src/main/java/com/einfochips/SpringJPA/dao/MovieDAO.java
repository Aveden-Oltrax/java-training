/**
 * 
 */
package com.einfochips.SpringJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.einfochips.SpringJPA.model.Movie;

/**
 * @author 158417
 *
 */
@Repository
public interface MovieDAO extends JpaRepository<Movie,Integer>{
	
	@Query("select m from Movie m where m.language= :lang")
	List<Movie> findMovieByLanguage(@Param("lang") String lang);
	
//	
	@Query("delete m from Movie m where m.movieId= mid")
	void deleteMovieById(@RequestParam("mid") int mid);
}
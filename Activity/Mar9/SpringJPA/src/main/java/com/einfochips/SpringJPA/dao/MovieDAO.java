/**
 * 
 */
package com.einfochips.SpringJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.einfochips.SpringJPA.model.Movie;

/**
 * @author 158417
 *
 */
@Repository
public interface MovieDAO extends JpaRepository<Movie,Integer>{
	
	@Query("select m from Movie m where m.language= :lang")
	List<Movie> findMovieByLanguage(@Param("lang") String lang);
	
	
	@Query("delete from Movie m where m.id= mid")
	void deleteMovieById(@Param("id") int mid);
}

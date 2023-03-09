/**
 * 
 */
package com.einfochips.SpringJPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.einfochips.SpringJPA.model.Movie;

/**
 * @author 158417
 *
 */
@Repository
public interface MovieDAO extends JpaRepository<Movie,Integer>{
	
}

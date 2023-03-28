/**
 * 
 */
package com.einfochips.progtest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.einfochips.progtest.Model.User;

/**
 * @author 158417
 *
 *
 */

@Repository
public interface UserDAO extends JpaRepository<User,Integer> {
	
	User findByEmail(String email);
	

}

/**
 * 
 */
package com.einfochips.activity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.einfochips.activity.model.Ticket;

/**
 * @author 158417
 *
 */
@Repository
public interface TicketDAO extends JpaRepository<Ticket, Integer> {
	
	

}

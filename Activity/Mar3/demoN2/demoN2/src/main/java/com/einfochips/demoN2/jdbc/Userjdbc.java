/**
 * 
 */
package com.einfochips.demoN2.jdbc;

import java.util.ArrayList;
import java.util.List;

import com.einfochips.demoN2.model.user;

/**
 * @author 158417
 *
 */
public class Userjdbc {
	public List<user> getAllUsers(){
		List<user> li = new ArrayList<user>();
		li.add(new user("abcd"));
		return li;
	}

}

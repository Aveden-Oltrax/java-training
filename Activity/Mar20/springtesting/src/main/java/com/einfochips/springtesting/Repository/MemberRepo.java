/**
 * 
 */
package com.einfochips.springtesting.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.einfochips.springtesting.model.Member;

/**
 * @author 158417
 *
 */

@Repository
public class MemberRepo {
	
	public List<Member> getMember(){
		List<Member> li = new ArrayList<Member>();
		li.add(new Member("akshay.patil@einfochips.com","Akshay","12121213","M"));
		li.add(new Member("amit.gmail.com","Amit","098342394","M"));
		li.add(new Member("Madhur@einfochips.com","Madhur","94859453","M"));
		
		return li;
	}
	
	public Member getMemberByEmail(String email) {
		return new Member("akshay.patil@einfochips.com","Akshay","12121213","M");
	}

}

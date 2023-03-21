package com.einfochips.springtesting;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.einfochips.springtesting.Repository.MemberRepo;
import com.einfochips.springtesting.model.Member;

@WebMvcTest
@ExtendWith(MockitoExtension.class)
public class DemoTest {
	
	@Autowired
	MockMvc mm;
	
	@MockBean
	MemberRepo mrc;
	
	@Test
	public void testHome() throws Exception {
		mm.perform(get("/home")).andExpect(status().isOk());
	}
	
	@Test
	public void testRepoClass() throws Exception{
		when(mrc.getMemberByEmail("akshay.patil@einfochips.com")).thenReturn(new Member("akshay.patil@einfochips.com","Akshay","12121213","M"));


	}

}

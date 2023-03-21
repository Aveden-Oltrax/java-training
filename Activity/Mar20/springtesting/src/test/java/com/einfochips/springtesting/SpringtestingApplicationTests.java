package com.einfochips.springtesting;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

@SpringBootTest
@AutoConfigureMockMvc
class SpringtestingApplicationTests {

	@Autowired
	private MockMvc mm;

	@Test
	void contextLoads() {

	}

	@Test
	void testController() throws Exception {
		mm.perform(get("/home")).andExpect(status().isOk());
	}

	@Test
	void testController1() throws Exception {
		mm.perform(get("/index1")).andExpect(status().isNotFound());
	}

	@Test
	void checkValue() throws Exception {
		mm.perform(get("/index")).andExpect(content().string(containsString("Hey")));
	}

}

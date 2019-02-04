package lt.mykolaspinkevicius.itemSystem.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import lt.mykolaspinkevicius.itemSystem.entities.Item;

@RunWith(SpringJUnit4ClassRunner.class)
public class ItemControllerTest {

	private MockMvc mockMvc;
	
	@InjectMocks
	private Item item;
	
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(item)
				.build();
	}
	
	@Test
	public void testGetAllItems() throws Exception{
		
		mockMvc.perform(MockMvcRequestBuilders.get)
			.andExpect(MockMvcResultMatchers.status().isOk());
//			.andExpect(MockMvcResultMatchers.content().j)
	}
}

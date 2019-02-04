package lt.mykolaspinkevicius.itemSystem.controllers;


import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lt.mykolaspinkevicius.itemSystem.entities.Item;
import lt.mykolaspinkevicius.itemSystem.entities.Location;
import lt.mykolaspinkevicius.itemSystem.services.ItemsService;

@RunWith(SpringJUnit4ClassRunner.class)
public class ItemControllerTest {

	private ItemsController controller;
	@Mock
	private ItemsService service;
	
	@Before
	public void setUp(){
		controller = new ItemsController(service);
	}
	
	@Test
	public void whenGettingItemById_theNullIsReturned() {
		
	}
	
}

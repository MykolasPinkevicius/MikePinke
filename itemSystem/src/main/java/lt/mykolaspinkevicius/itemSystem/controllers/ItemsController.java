package lt.mykolaspinkevicius.itemSystem.controllers;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import lt.mykolaspinkevicius.itemSystem.entities.Item;
import lt.mykolaspinkevicius.itemSystem.services.ItemsService;

@RestController
@RequestMapping("/items")

public class ItemsController {
	
	@Autowired
	private ItemsService service;

	public ItemsController(ItemsService service) {
		this.service = service;
	}
	
	@PostMapping
	@ResponseStatus(value=HttpStatus.CREATED)
	public int createItem(@RequestBody Item item) {
		return service.createItem(item);
	}
	
	@PutMapping("/{itemId}")
	@ResponseStatus(value=HttpStatus.OK)
	public int updateItem(@RequestBody Item item, @PathVariable int itemId) {
		return service.updateItem(item, itemId);
	}
	
	@GetMapping
	public List<Item>getAllItems() {
		return service.findAllItems();
	}
	
	@GetMapping("/{itemId}")
	public ResponseEntity<Item>getItemById(@PathVariable int itemId) {
		Optional<Item> auth = service.findItemById(itemId);
		if (auth.isPresent()) {
			return ResponseEntity.of(auth);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/sorted-items")
	public Set<Item>getItemsBy(@RequestParam(required=false) String title,
							   @RequestParam(required=false) String description,
							   @RequestParam(required=false) BigDecimal startsFrom, BigDecimal endsTo,
							   @RequestParam(required=false) Integer stock,
							   @RequestParam(required=false) String location) {
		Set<Item> items = new HashSet<>();
		if (title != null && !title.isEmpty()) {
			items.addAll(service.findItemByTitle(title));
		}
		if (stock != null) {
			items.addAll(service.getItemsByStock(stock));
		}
		if(description != null && !description.isEmpty()) {
			items.addAll(service.getItemsByDescription(description));
		}
		if (location != null && !location.isEmpty()) {
			items.addAll(service.getItemsByLocation(location));
		}
		if ((startsFrom != null) && ((endsTo != null))) {
			items.addAll(service.getItemsByPriceRange(startsFrom, endsTo));
		}
			
		return items;
	}
	
	@DeleteMapping("{itemId}")
	public void deleteItem(@PathVariable int itemId) {
		service.deleteItem(itemId);
	}
	
}

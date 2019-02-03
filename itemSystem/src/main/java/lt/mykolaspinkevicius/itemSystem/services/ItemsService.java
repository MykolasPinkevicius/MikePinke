package lt.mykolaspinkevicius.itemSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import lt.mykolaspinkevicius.itemSystem.entities.Item;
import lt.mykolaspinkevicius.itemSystem.repositories.ItemJPARepository;

@Service
@Transactional
public class ItemsService {
	
	@Autowired
	private ItemJPARepository repository;
	
	public int createItem(Item item) {
		return repository.save(item).getId();
	}

	public List<Item>findAllItems() {
		return repository.findAll();
	}
	
	public Optional<Item> findItemById(int id) {
		return repository.findById(id);
	}
	
	public void deleteItem(int itemId) {
		repository.deleteById(itemId);
	}
}

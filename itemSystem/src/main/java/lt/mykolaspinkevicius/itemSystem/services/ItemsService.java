package lt.mykolaspinkevicius.itemSystem.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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

	public List<Item> findAllItems() {
		return repository.findAll();
	}

	public Optional<Item> findItemById(int id) {
		return repository.findById(id);
	}

	public List<Item> findItemByTitle(String title) {
		return repository.findItemByTitle(title);
	}
	public List<Item> getItemsByDescription(String description) {
		return repository.findItemByDescription(description);
	}
	public Set<Item> getItemsByLocation(String location) {
		return repository.findItemByLocation(location);
	}

	public List<Item>getItemsByPriceRange(BigDecimal startsFrom, BigDecimal endsTo) {
		return repository.findItemsByPriceRange(startsFrom, endsTo);
	}
	
	public List<Item>getItemsByStock(Integer stock) {
		return repository.findItemByStock(stock);
	}
	
	public void deleteItem(int itemId) {
		repository.deleteById(itemId);
	}

	public int updateItem(Item item, int id) {
		item.setId(id);
		return repository.save(item).getId();
	}
}

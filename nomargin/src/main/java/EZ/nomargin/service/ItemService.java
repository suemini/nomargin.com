package EZ.nomargin.service;


import EZ.nomargin.domain.Item;
import EZ.nomargin.domain.ItemType;
import EZ.nomargin.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ItemService {
    private final ItemRepository itemRepository;

    public Item save(Item item) {
        return itemRepository.save(item);
    }

    public Item findById(Long id) {
        return itemRepository.findById(id).get();
    }
//    public Item findByName(String name) {return itemRepository.findByName(name).get();}
    public List<Item> findByItemType(ItemType itemType) {return itemRepository.findByItemType(itemType);}

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public List<Item> findTop() {
        return itemRepository.findTop();
    }

    public List<Item> findBottom() {
        return itemRepository.findBottom();
    }

    public List<Item> findOuter() {
        return itemRepository.findOuter();

    }

    public void update(Long itemId, Item updateItem) {
        itemRepository.update(itemId, updateItem);
    }

    public void delete(Long itemId) {
        itemRepository.delete(itemId);
    }


}

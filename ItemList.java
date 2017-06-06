package Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemList {
	List<Item> list;
	
	public ItemList() {
		list = new ArrayList<Item>();
	}
	
	public void addItem(Item itemToAdd) {
		ItemIterator iterator = (ItemIterator) iterator();
		while(iterator.hasNext()){
			Item item = iterator.current();
			if((item.name).equals(itemToAdd.name)){
				item.number++;
				return;
			}
			iterator.next();
		}
		list.add(itemToAdd);
	}
	
	public void removeItem(Item itemToRemove) {
		ItemIterator iterator = (ItemIterator) iterator();
		while(iterator.hasNext()){
			Item item = iterator.current();
			if((item.name).equals(itemToRemove.name)){
				if(--item.number <= 0) {
					list.remove(iterator.current());
				}
				return;
			}
			iterator.next();
		}
	}
	
	public Iterator<Item> iterator() {
		return new ItemIterator();
	}
	
	class ItemIterator implements Iterator<Item> {
		int currentIndex = 0;

		@Override
		public boolean hasNext() {
			if (currentIndex >= list.size()) 
				return false;
			else 
				return true;
		}

		@Override
		public Item next() {
			return list.get(currentIndex++);
		}
		
		public Item current() {
			return list.get(currentIndex);
		}
	}
}

package Game;

import java.util.Iterator;
import java.util.Scanner;

public class Shop {
	Scanner keyboardInt = new Scanner(System.in);
	Scanner keyboardString = new Scanner(System.in);
	
	private ItemList itemlist = new ItemList();
	
	public void transaction(User user){
		int choice;
		do {
			System.out.println("========Shop========");
			System.out.println("1. Buy");
			System.out.println("2. Sell");
			System.out.println("3. Exit");
			System.out.print("> ");
			choice = keyboardInt.nextInt();
			if(choice == 1)
				buy(user);
			else if(choice == 2)
				sell(user);
			else if(choice == 3)
				return;
		} while(choice < 1 || choice > 3);
	}
	
	private void buy(User user){
		System.out.println("========Shop========");
		Iterator<Item> iterator = itemlist.iterator();
		while(iterator.hasNext()){
			Item item = iterator.next();
			if(item.isEquipped)
				System.out.println(item.name);
		}
		System.out.println("====================");
		
		System.out.print("buy > ");
		String itemToBuy = keyboardString.nextLine();
		
		//traverse shop's item list and find the item.
		//if found, update user's itemlist & money and print message
		//else print message
	}
	
	private void sell(User user){
		user.showInventory();
		
		System.out.print("sell > ");
		String itemToSell = keyboardString.nextLine();
		
		//traverse shop's item list and find the item.
		//if found, update user's itemlist & money and print message
		//else print message	
	}
	
}


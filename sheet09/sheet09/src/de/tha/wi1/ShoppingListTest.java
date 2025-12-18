package de.tha.wi1;

public class ShoppingListTest {

	public static void main(String[] args) {
		ShoppingList list = new ShoppingList();

		ShoppingListItem brot = new ShoppingListItem("Brot", 4.5, TaxClass.REDUCED);
		ShoppingListItem duschgel = new ShoppingListItem("Duschgel", 1.99, TaxClass.FULL);
		ShoppingListItem marmelade = new ShoppingListItem("Marmelade", 1.32, TaxClass.REDUCED);
		ShoppingListItem kaese = new ShoppingListItem("Käse", 0.99, TaxClass.REDUCED);

		list.put(new ShoppingListItem("Brot", 4.5, TaxClass.REDUCED));
		list.put(new ShoppingListItem("Fisch", 2.50, TaxClass.REDUCED));
		list.put(kaese = new ShoppingListItem("Käse", 0.99, TaxClass.REDUCED));
		list.put(new ShoppingListItem("Duschgel", 1.99, TaxClass.FULL));

		System.out.println(list);

		System.out.println("Prüfe Listeninhalt:");
		System.out.println("Ist Duschgel in der Liste? " + list.isInList(duschgel));
		System.out.println("Ist Marmelade in der Liste? " + list.isInList(marmelade));
		System.out.println();

		System.out.println("Prüfe Gesamtpreis:");
		System.out.println("Netto:  " + list.getTotalPriceWithoutTax());
		System.out.println("Brutto: " + list.getTotalPriceWithTax());
		System.out.println();


		System.out.println("Prüfe get-Methode:");
		System.out.println(list.get("Brot"));
		System.out.println(list.get("Duschgel"));
		System.out.println(list.get("Nicht in der Liste"));
		System.out.println();

		System.out.println("Entferne Käse:");
		list.remove("Käse");
		System.out.println("Ist Käse noch in der Liste? " + list.isInList(kaese));
		System.out.println(list);

		System.out.println("Entferne Duschgel:");
		list.remove("Duschgel");
		System.out.println("Ist Duschgel noch in der Liste? " + list.isInList(duschgel));
		System.out.println(list);

		System.out.println("Entferne Brot:");
		list.remove("Brot");
		System.out.println("Ist Brot noch in der Liste? " + list.isInList(brot));
		System.out.println(list);


	}

}


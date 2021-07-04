package java8.optional;

public class ReceiptMain {

	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		Receipt fillReceipt = new Receipt(1, "Mariusz Czarny", "Piêkna 20/3", 333241567);
		
		System.out.println(fillReceipt.getAddress());
		System.out.println(receipt.getAddress());
		
		System.out.println(fillReceipt.getName());
		System.out.println(receipt.getName());
		// System.out.println(receipt.getName().get()); <-  NoSuchElementException
		
		System.out.println(fillReceipt.getId());
		System.out.println(receipt.getId());
		
		System.out.println(fillReceipt.getTaxId());
		System.out.println(receipt.getTaxId());
	}

}

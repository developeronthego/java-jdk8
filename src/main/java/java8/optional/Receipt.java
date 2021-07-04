package java8.optional;

import java.util.Optional;

public class Receipt {
	private Integer id;
	private String name;
	private String address;
	private Integer taxId;
	
	public Receipt() {
	}
	
	public Receipt(Integer id, String name, String address, Integer taxId) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.taxId = taxId;
	}
	
	public Integer getId() {
		return Optional.ofNullable(id).isPresent() ? id : 0;
	}

	public String getAddress() {
		return Optional.ofNullable(address).orElseGet(() -> "default");
	}
	
	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}
	
	public Integer getTaxId() {
		return Optional.ofNullable(taxId).orElseThrow(() -> new RuntimeException("Tax id is required for the receipt."));
	}
}

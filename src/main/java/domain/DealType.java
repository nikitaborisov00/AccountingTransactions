package domain;

public class DealType {
	private Long id;
	private String type;
	public DealType() {
	}
	public DealType(String type) {
	this.type = type;
	}
	public DealType(Long id, String type) {
	this.id = id;
	this.type = type;
	}
	public Long getId() {
	return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
	return type;
	}
	public void setType(String type) {
	this.type = type;
	}
	@Override
	public String toString() {
	return "Type {" + "Id = " + id + ", Type = " + type
	+ "}";
	}
}

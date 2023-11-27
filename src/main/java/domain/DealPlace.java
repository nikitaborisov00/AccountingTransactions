package domain;

public class DealPlace {
	private Long id;
	private String placeFull;
	private String placeShort;
	public DealPlace() {
	}
	public DealPlace(String placeFull, String placeShort) {
	this.placeFull = placeFull;
	this.placeShort = placeShort;
	}
	public DealPlace(Long id, String placeFull, String placeShort) {
	this.id = id;
	this.placeFull = placeFull;
	this.placeShort = placeShort;
	}
	public Long getId() {
	return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlaceFull() {
		return placeFull;
	}
	public void PlaceFull(String placeFull) {
		this.placeFull = placeFull;
	}
	public String getPlaceShort() {
		return placeShort;
		}
	public void setPlaceShort(String placeShort) {
		this.placeShort = placeShort;
		}
	@Override
	public String toString() {
	return "placeFull {" + "Id = " + id + ", PlaceFull = " + placeFull
	+ "}";
	}
}

package domain;

public class Deal {
 private Long id;

 private Long number;
 private Long tiker;
 private Long order;
 private Long quantity;
 private Long price;
 private Long totalcost;
 private Long trader;
 private Long commition;
 private Long TypeID;
 private Long PlaceID;
 private Long CurrencyID;
 private DealType dealtype;
 private DealPlace dealplace;
 private Currency currency;
 
 public Deal() {
}

 public Deal(Long number, Long tiker, Long order, Long quantity,
Long price, Long totalcost, Long trader, Long commition, DealPlace dealplace,
Currency currency, DealType dealtype) {
	 this.number = number;
	 this.tiker = tiker;
	 this.order = order;
	 this.quantity = quantity;
	 this.totalcost = totalcost;
	 this.trader = trader;
	 this.commition = commition;
	 this.price = price;
	 this.totalcost = totalcost;
	 this.currency = currency;
	 this.dealtype = dealtype;
	 this.dealplace = dealplace;
 }

 public Deal(Long number, Long tiker, Long order, Long quantity,
Long price, Long totalcost, Long trader, Long commition,
Long TypeID, Long PlaceID, Long CurrencyID, DealPlace dealplace,
Currency currency, DealType dealtype) {
	 this.number = number;
	 this.tiker = tiker;
	 this.order = order;
	 this.quantity = quantity;
	 this.totalcost = totalcost;
	 this.trader = trader;
	 this.commition = commition;
	 this.price = price;
	 this.TypeID = TypeID;
	 this.PlaceID = PlaceID;
	 this.CurrencyID = CurrencyID;
	 this.currency = currency;
	 this.dealtype = dealtype;
	 this.dealplace = dealplace;
 }

 public Deal(Long id, Long number, Long tiker, Long order, Long quantity,
Long price, Long totalcost, Long trader, Long commition,
Long TypeID, Long PlaceID, Long CurrencyID, DealPlace dealplace,
Currency currency, DealType dealtype) {
	 this.id = id;
	 this.number = number;
	 this.tiker = tiker;
	 this.order = order;
	 this.quantity = quantity;
	 this.totalcost = totalcost;
	 this.trader = trader;
	 this.commition = commition;
	 this.price = price;
	 this.TypeID = TypeID;
	 this.PlaceID = PlaceID;
	 this.CurrencyID = CurrencyID;
	 this.currency = currency;
	 this.dealtype = dealtype;
	 this.dealplace = dealplace;
 }


public Long getNumber() {
	return number;
}
public void setNumber(Long number) {
	this.number = number;
}

public Long getTiker() {
	return tiker;
}
public void setTiker(Long tiker) {
	this.tiker = tiker;
}

public Long getOrder() {
	return order;
}
public void setOrder(Long order) {
	this.order = order;
}

public Long getQuantity() {
	return quantity;
}
public void setQuantity(Long quantity) {
	this.quantity = quantity;
}

public Long getTotalcost() {
	return totalcost;
}
public void setTotalcost(Long totalcost) {
	this.totalcost = totalcost;
}

public Long getTrader() {
	return trader;
}
public void setTrader(Long trader) {
	this.trader = trader;
}

public Long getCommition() {
	return commition;
}
public void setCommition(Long commition) {
	this.commition = commition;
}

public Long getPrice() {
	return price;
}
public void setPrice(Long price) {
	this.price = price;
}

public DealType dealtype () {
	return dealtype;
}

public DealPlace dealplace () {
	return dealplace;
}

public Currency currency () {
	return currency;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

public String getDealType() {
return dealtype.getType();
}
public void setDealType(DealType dealtype) {
this.dealtype = dealtype;
}

public String getDealPlace() {
return dealplace.getPlaceFull();
}
public void setDealPlace(DealPlace dealplace) {
this.dealplace = dealplace;
}

public String getCurrency() {
return currency.getCurrencyFull();
}
public void setCurrency(Currency currency) {
this.currency = currency;
}

public Long getTypeID() {
return TypeID;
}
public void setTypeID(Long TypeID) {
this.TypeID = TypeID;
}

public Long getPlaceID() {
return PlaceID;
}
public void setPlaceID(Long PlaceID) {
this.PlaceID = PlaceID;
}

public Long getCurrencyID() {
return CurrencyID;
}
public void setCurrencyID(Long CurrencyID) {
this.CurrencyID = CurrencyID;
}
@Override
public String toString() {
return "DealType {" + "Id = " + id +
		", number = " + number +
		", tiker = " + tiker +
		", order = " + order +
		", quantity = " + quantity +
		", price = " + price +
		", totalcost = " + totalcost +
		", trader = " + trader +
		", commition = " + commition +
		", DealType = " + getDealType() +
		", DealPlace = " + getDealPlace() +
		", Currency = " + getCurrency() +
		"}";
}
}
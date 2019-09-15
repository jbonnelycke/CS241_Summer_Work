
public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(String currentSymbol,String currentName){
		symbol = currentSymbol;
		name = currentName;
	}
	
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
}


package bankaccountapp;

public interface IBaseRate {
	// Method that return the base rate
	default double getBaseRate() {
		return 2.5; 
	}

}

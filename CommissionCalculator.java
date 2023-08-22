package cop2805;

public class CommissionCalculator {
	 public static void main(String[] args) {
		// Initialize the sale amount to 1000
	        double saleAmount = 1000.0;

	        // Loop until the sale amount reaches 20000
	        while (saleAmount <= 20000) {
	            // Initialize the total income to 0
	            double totalIncome = 0.0;
	            // Calculate the total income
	            totalIncome = calculateTotalIncome(saleAmount);
	            // Print the sale amount and total income
	            System.out.println("Sale amount: " + saleAmount + ", Total income: " + totalIncome);
	            // Increment the sale amount by 1000
	            saleAmount += 1000;
	        }
	    }//end main

	    public static double calculateTotalIncome(double saleAmount) {
	        // Initialize the commission percent to 0
	        double commissionPercent = 0.0;
	        // Initialize the commission to 0
	        double commission = 0.0;

	        // Set the commission percent and calculate the commission based on the sale amount
	        if (saleAmount <= 5000) {
	            commissionPercent = 0.08;
	            commission = saleAmount * commissionPercent + 5000;
	        } else if (saleAmount >= 5000.01 && saleAmount <= 10000) {
	            commissionPercent = 0.1;
	            commission = (5000 * 0.08) + ((saleAmount - 5000) * commissionPercent + 5000);
	        } else {
	            commissionPercent = 0.12;
	            commission = (5000 * 0.08) + (5000 * 0.1) + ((saleAmount - 10000) * commissionPercent + 5000);
	        }

	        // Return the commission
	        return commission;
	    }//end method
	}//end class

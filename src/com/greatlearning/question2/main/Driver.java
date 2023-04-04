package com.greatlearning.question2.main;

import java.io.IOException;
import com.greatlearning.question2.model.CurrencyDenominations;
import com.greatlearning.question2.services.Utils;

public class Driver {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		CurrencyDenominations cd=new CurrencyDenominations(null,0);
		int denominations[]=Utils.inputDenominations();
		cd.setCurrency_denominations(denominations);
		int amount=Utils.amountPayable();
		cd.setAmount_payable(amount);
		Utils.frequency(cd.getCurrency_denominations(), cd.getAmount_payable());

	}

}

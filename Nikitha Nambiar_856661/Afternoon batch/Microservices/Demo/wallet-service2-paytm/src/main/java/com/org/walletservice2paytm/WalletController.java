package com.org.walletservice2paytm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wallet2")
public class WalletController {

	@Autowired
	private WalletService ser;
	
	@GetMapping("{accountNo}")
	public Wallet addAmountToWallet(@PathVariable("accountNo")long accNo) {
		return ser.addAmountToWallet(accNo);
	}
}

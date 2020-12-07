package com.org.walletservice2paytm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WalletService {

//	@Autowired
//	private RestTemplate template;
	
	@Autowired
	private AccountClient client;
	
	public Wallet addAmountToWallet(long accNo) {
		
		Wallet w=new Wallet();
		w.setName("John");
		
//		AccountStructure struc=template.getForObject("http://ACCOUNT-SERVICE/account/"+accNo, AccountStructure.class);
//		
//		w.setBalance(w.getBalance()+(struc.getAccNo()*0.5));
		
		w.setBalance(w.getBalance()+(client.getAmountThroughAccount(accNo)*0.5));
		
		return w;
		
	}
}

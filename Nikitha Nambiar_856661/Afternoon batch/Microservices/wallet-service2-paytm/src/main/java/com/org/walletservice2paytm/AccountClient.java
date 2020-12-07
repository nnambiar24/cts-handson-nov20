package com.org.walletservice2paytm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("http://ACCOUNT-SERVICE")
public interface AccountClient {

	@GetMapping("/account/{accountNumber}")
	public double getAmountThroughAccount(@PathVariable("accountNumber")long accNo);
}

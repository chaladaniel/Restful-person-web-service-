package com.chala.feign;
  
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.chala.model.Account;

  
@FeignClient(name = "accountdb", url = "http://localhost:8081")
public interface MyFeign {
  
  
  @GetMapping("/account/holder/{id}") 
  public List<Account> findAccountByHolderId(@PathVariable Long id);
  
 
 }
 
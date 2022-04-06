package com.zensar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.Stock;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/stockapp")
@CrossOrigin(origins = "*")
public class StockController {
	
	@GetMapping(value = "/employee?eid=45")
	public boolean testRequestParam(@RequestParam(value="eid", required=false) int empId)
	{
		System.out.println("Emp Id: "+empId);
		return true;
	}
	
	@GetMapping(value = "/employee2")
	public boolean testHeaderParam(@RequestHeader(value="auth-token") String authToken)
	{
		System.out.println("Emp Id: "+authToken);
		return true;
	}
	
	
	
	 @DeleteMapping(value = "/stock")
	 public boolean getDeleteAllStocks(){
		stocks.clear();
		if(stocks.isEmpty()) {
		 return true;
		}
		return false;
		
	 }
	
	 @DeleteMapping(value = "/stock/{id}")
	 public boolean getDeleteStocksById(@ApiParam(value="Stock id", name="id") @PathVariable("id") int stockId){
		 for(Stock stock:stocks) {
			 if(stock.getId() == stockId)
			 {
				 stocks.remove(stock);
				 return true;
			 }
		 }
		 return false;
	 }
	
	@PutMapping(value = "/stock/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, produces = { MediaType.APPLICATION_JSON_VALUE ,MediaType.APPLICATION_XML_VALUE})
	public Stock updateStock(@ApiParam(value="Stock id", name="id") @PathVariable("id")int stockId, @RequestBody Stock updateStock)
	{
	Stock existingStock = getAllStocksId(stockId);	
	existingStock.setName(updateStock.getName());
	existingStock.setMarket(updateStock.getMarket());
	existingStock.setPrice(updateStock.getPrice());
	return existingStock;
	}
	
	@PostMapping(value = "/stock", consumes = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE} )
	public Stock createNewStock(@ApiParam(value="Stock id", name="id") @RequestBody Stock stock) {
		stock.setId((stocks.size()+1));
		stocks.add(stock);
		return stock;
	}
	
//
	 @GetMapping(value = "/stock/{id}", produces =MediaType.APPLICATION_JSON_VALUE)
	 @ApiOperation(value="Reads stocks by id", notes="This REST API returns list of stocks")
	 public Stock getAllStocksId(@ApiParam(value="Stock id", name="id") @PathVariable("id") int stockId){
		 for(Stock stock:stocks) {
			 if(stock.getId() == stockId)
			 {
				 return stock;
			 }
		 }
		 return null;
	 }
//	 
	
	
	
static List<Stock> stocks = new ArrayList<Stock>();

 static {
	 
	stocks.add(new Stock(1,"Zensar","BSE",50));
	stocks.add(new Stock(2,"IBM","BSE",100));
	
 }
 
 

 @GetMapping(value = "/stock", produces =MediaType.APPLICATION_JSON_VALUE)
 @ApiOperation(value="Reads all stocks", notes="This REST API returns list of all stocks")
 public List<Stock> getAllStocks(){
	 return stocks;
 }
 
 
 
 
}

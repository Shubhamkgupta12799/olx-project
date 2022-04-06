package com.olx.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.olx.dto.Advertise;
import com.olx.service.AdvertiseService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;



@RestController
@RequestMapping("/advertise")
@CrossOrigin(origins = "*")
public class AdvertiseController {
	
	@Autowired
	AdvertiseService advertiseService;
	
	//8
	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="post Item ", notes="This REST API for Post of Item")
	public Advertise postAdvertise(Advertise adv) {
		return advertiseService.postAdvertise(adv);
	}

	//9
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="Item put for selling", notes="This REST API forn selling of Item")
    public Advertise updateAdvertise(Advertise adv) {
		return advertiseService.updateAdvertise(adv);

    }
	
	
	@GetMapping(value = "/user/advertise", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Items advertisment", notes="This REST API for search of Item")
	public List<Advertise> getAllAdvByUser(){
		return null;
	}

	@GetMapping(value = "/user/advertise/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Items advertisment by every user", notes="This REST API for Advertisment of Item")
	public List<Advertise> getAdvByUser(){
		return null;
	} 
	
//	//13 
//	@GetMapping(value = "/search/filter", produces = MediaType.APPLICATION_JSON_VALUE)
//	@ApiOperation(value="search Items by date", notes="This REST API for search of Item")
//	public Advertise filterAdv(Advertise adv){
//		return advertiseService.filterAdvertise(adv);
//	} 
	
	//14 
	@GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="search Items", notes="This REST API for search of Item")
	public Advertise SearchAdvByText(String searchText){
		return advertiseService.SearchAdvertiseByText(searchText);
	} 
	
	// Service 13 mapping in AdvertiseController:

		@GetMapping(value="/search/filtercriteria", produces=MediaType.APPLICATION_JSON_VALUE)
		@ApiOperation(value="search Items by date", notes="This REST API for search of Item")
		public List<Advertise> searchAdvertisesByFilterCriteria(@ApiParam(value="Stock id", name="id") @RequestParam("searchText")String searchText,
		@RequestParam(name = "category", required = false)int categoryId, @RequestParam("postedBy")String postedBy,
		@RequestParam("dateCondition")String dateCondition,
		@RequestParam("onDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate onDate,
		@RequestParam("fromDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromDate,
		@RequestParam("toDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toDate,
		@RequestParam("sortedBy")String sortedBy, @RequestParam(name = "startIndex", defaultValue="0")int startIndex, @RequestParam(name="records", defaultValue = "10")int records
		) {
		return advertiseService.searchAdvertisesByFilterCriteria(searchText, categoryId, postedBy, dateCondition,
		onDate, fromDate, toDate, sortedBy, startIndex, records);
		}
	
	
	//15
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Advertise returnAdv(int id){
		return advertiseService.returnAdvertise(id);
	} 

}


/*
package com.olx.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.dto.Category;
import com.olx.service.AdvertiseService;




@RestController
@RequestMapping("/olx/advertise")
@CrossOrigin(origins = "*")
public class AdvertiseController<Intiger> {

	@Autowired
	AdvertiseService advertiseService;

	@GetMapping(value = "/categories", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map getAllCategories() {
		return advertiseService.getAllCategories();
	}
	

	@GetMapping(value = "/categories/status", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map getAllCategoryStatus() {
		return advertiseService.getAllCategoryStatus();
	}
	
	@PostMapping(value = "/categories", consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE )
	public Category createNewStock(@RequestBody Category category)
	{
		return advertiseService.createNewCategory(category);
	}
	

	@PutMapping(value = "/category/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
	public Category updateStock(@PathVariable("id")int categoryId, @RequestBody Category updateStock)
	{
//	Map<Integer,Category> map = getAllCategories(categoryId);	
//	existingStock.setName(updateStock.getName());
//	existingStock.setMarket(updateStock.getMarket());
//	existingStock.setPrice(updateStock.getPrice());
	return new Category();
	}
	
}

*/

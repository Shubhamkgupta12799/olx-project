package com.olx.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.olx.dto.Advertise;

@Service
public class AdvertiseServiceImpl implements AdvertiseService {

	@Override
	public Advertise postAdvertise(Advertise Advertise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advertise updateAdvertise(Advertise Advertise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertise> getAllAdvertiseByUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertise> getAdvertiseByUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advertise filterAdvertise(Advertise Advertise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advertise SearchAdvertiseByText(String searchText) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advertise returnAdvertise(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertise> searchAdvertisesByFilterCriteria(String searchText, int categoryId, String postedBy,
			String dateCondition, LocalDate onDate, LocalDate fromDate, LocalDate toDate, String sortedBy,
			int startIndex, int records) {
		// TODO Auto-generated method stub
		return null;
	}

	
}










/*
package com.olx.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.olx.dto.Category;


@Service
public class AdvertiseServiceImpl implements AdvertiseService {


	static Map<Integer,Category> category1 = new HashMap<Integer,Category>();

	static {

		category1.put(1,new Category(1, "Furniture"));
		category1.put(2,new Category(2, "Cars"));

	}
		
	@Override
	public Map getAllCategories() {
		// TODO Auto-generated method stub
		return category1;
	}
	
	static Map<Integer,Category> category2 = new HashMap<Integer,Category>();

	static {

		category2.put(1,new Category(1, "Furniture","open"));
		category2.put(2,new Category(2, "Cars","close"));

	}

	@Override
	public Map getAllCategoryStatus() {
		// TODO Auto-generated method stub
		return category2;
	}
//	
//	@PostMapping(value = "/stock", consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE )
//	public Stock createNewStock(@RequestBody Stock stock) {
//		stock.setId((stocks.size()+1));
//		stocks.add(stock);
//		return stock;
//	}
//	
	
	
	public Category createNewCategory(Category category) {
     category.setId((category1.size()+1));
     category1.put(category.getId(),category);
		return category;
	}

}
*/
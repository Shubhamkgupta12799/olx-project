package com.olx.service;

import java.util.List;
import java.util.Map;

import com.olx.dto.Advertise;

public interface AdvertiseService {
	
//	public Map<Integer,Category> getAllCategories();
//	
//	public Map<Integer,Category> getAllCategoryStatus();
//	
//	public Category createNewCategory(Category category);
//	
	
	public Advertise postAdvertise(Advertise Advertise);
	public Advertise updateAdvertise(Advertise Advertise);
	public List<Advertise> getAllAdvertiseByUser();
	public List<Advertise> getAdvertiseByUser();
	public Advertise filterAdvertise(Advertise Advertise);
	public Advertise SearchAdvertiseByText(String searchText);
	public Advertise returnAdvertise(int id);

}

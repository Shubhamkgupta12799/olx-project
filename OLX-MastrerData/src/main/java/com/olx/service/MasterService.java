package com.olx.service;



import java.util.List;

import com.olx.dto.Category;
import com.olx.dto.Status;

public interface MasterService {
	public abstract List<Category> getAllCategory();
	public abstract List<Status> getAllStatus();
}

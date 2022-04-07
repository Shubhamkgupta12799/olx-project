package com.olx.actuator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import com.olx.dto.Advertise;

@Component
@Endpoint(id = "bug-fixes")
public class BugFixesCustomActuator {

	private Map<String, List<Advertise>> TotalNumberOfAdvert = new HashMap<>();

	@PostConstruct
	public void initAdvertisement() {
		TotalNumberOfAdvert.put("v1", Arrays.asList(new Advertise("Furniture",10000,1,"This is world best furniture")));
		TotalNumberOfAdvert.put("v2",Arrays.asList(new Advertise("home appliance",20000,2,"This is world best home appliance")));
	}

	@ReadOperation
	public Map<String, List<Advertise>> getAllBugFixes() {
		return this.TotalNumberOfAdvert;
	}

	@ReadOperation
	public List<Advertise> getBugFixesByVersion(@Selector Advertise advertise) {
		return this.TotalNumberOfAdvert.get(advertise);
	}

	@WriteOperation
	public boolean addBugFixes(@Selector String version, Advertise advertise) {
		TotalNumberOfAdvert.put(version, Arrays.asList(advertise));
		return true;
	}

	@DeleteOperation
	public boolean deleteBugFixes(@Selector  Advertise advertise) {
		if (TotalNumberOfAdvert.remove(advertise) != null) {
			return true;
		}
		return false;
	}

}

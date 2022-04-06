package com.olx.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Category {
	
	@ApiModelProperty(value="Category identifier")
	private int id;
	
	@ApiModelProperty(value="Category identifier")
	private String Categoryname;
}

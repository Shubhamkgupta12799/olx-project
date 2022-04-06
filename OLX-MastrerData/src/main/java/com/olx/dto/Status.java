package com.olx.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Status {

	@ApiModelProperty(value="Status identifier")
	private int id;
	
	@ApiModelProperty(value="Status identifier")
	private String statusName;
}

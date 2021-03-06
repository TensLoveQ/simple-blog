package com.blog.comm.entity;

import java.util.Date;

import com.blog.comm.base.BaseModel;

@SuppressWarnings("serial")
public class WsFileEntity extends BaseModel{
	
	private String path;
	
	private String size;
	
	private Date time;
	
	private String suffix;
	
	private Integer type;
	

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	

}

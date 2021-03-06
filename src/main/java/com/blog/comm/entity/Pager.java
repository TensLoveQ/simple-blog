package com.blog.comm.entity;

import java.util.Collection;

import com.blog.comm.base.BaseModel;

public class Pager extends BaseModel {

	private static final long serialVersionUID = 1L;
	private Integer totalRows;
	private Integer pageSize = 20;
	private Integer currPage;
	private Integer totalPage=1;
	private Integer startRow;
	private Integer formNumber;
	private Collection<?> data;

	public Pager(Integer pageSize) {
		super();
		this.currPage = 1;
		this.startRow = 0;
		this.pageSize = pageSize;
	}


	public Pager(Integer pageSize, Integer currentPage) {
		super();
		if(currentPage==null||currentPage<1){
			currentPage=1;
		}
		if(pageSize==null||pageSize>100){
			pageSize=20;
		}
		this.pageSize = pageSize;
		this.currPage = currentPage;
	}


	public Pager() {
		this.currPage = 1;
		this.startRow = 0;
	}

	public Collection<?> getData() {
		return data;
	}

	public void setData(Collection<?> data) {
		this.data = data;
	}

	public Integer getCurrPage() {
		return currPage;
	}

	public void setCurrPage(Integer currPage) {
		if(currPage==null||currPage<1){
			currPage=1;
		}
		this.currPage = currPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		if(pageSize==null){
			pageSize=20;
		}
		if(pageSize>100){
			pageSize=100;
		}
		this.pageSize = pageSize;
	}

	public Integer getStartRow() {
		return startRow != 0 ? startRow : (currPage - 1) * pageSize;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
		try {
			this.totalPage = totalRows / pageSize;
			Integer mod = totalRows % pageSize;
			if (mod > 0) {
				this.totalPage++;
			}
			if (this.totalPage == 0) {
				this.totalPage = 1;
			}
			if (this.currPage > totalPage) {
				this.currPage = totalPage;
			}
			this.startRow = (currPage - 1) * pageSize;
			if (this.startRow < 0) {
				startRow = 0;
			}
			if (this.currPage == 0 || this.currPage < 0) {
				currPage = 1;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public Integer getFormNumber() {
		return formNumber;
	}

	public void setFormNumber(Integer formNumber) {
		this.formNumber = formNumber;
	}
}

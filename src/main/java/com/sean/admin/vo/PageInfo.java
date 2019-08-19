package com.sean.admin.vo;

import java.util.List;

public class PageInfo<T> {
	private static final long serialVersionUID = 1L;
	private float totalAmount;// 总金额--流水查询

	private int pageNum;      //当前页的页码
	private int pageSize;      //每页的数量
	private int size;           //当前页的数量

	////可以在页面中"显示startRow到endRow 共size条数据"
	private int startRow; //当前页面第一个元素在数据库中的行号
	private int endRow;//当前页面最后一个元素在数据库中的行号

	private long total;     //总记录数
	private int pages;       //总页数
	private List<T> list;      //结果集

	private int prePage;    //上一页
	private int nextPage;   //下一页
 	private int firstPage;    //上一页
	private int lastPage;   //下一页

	private boolean isFirstPage;   //是否为第一页
	private boolean isLastPage;   //是否为最后一页
	private boolean hasPreviousPage;       //是否有前一页
	private boolean hasNextPage;          //是否有下一页

	private int navigatePages;          //导航页码数
	private int[] navigatepageNums;       //所有导航页号
	private int navigateFirstPage;       //导航条上的第一页
	private int navigateLastPage;     //导航条上的最后一页
	public PageInfo(){

	}
	public PageInfo(int pageIndex, int pageSize, int showPage, long total, List<T> resultList) {

		int curPageNo =(pageIndex+pageSize-1)/pageSize;
		int allpages=(int) (total/pageSize+1);
		if(allpages<showPage){
			showPage=allpages;
		}
		int[] showpages = new int[showPage];
		int showFirstPage=1;
		if (curPageNo*2>showPage){
			showFirstPage=showFirstPage+(curPageNo*2-showPage)/2;
			if((showFirstPage+showPage)>allpages){
				showFirstPage= allpages-showPage+1;
			}
		}
		int showLastPage=showFirstPage+showPage;
		for (int i=0,j=showFirstPage;i<showPage;i++,j++){
			showpages[i]=j;
		}
		this.setPageSize(pageSize);//每一页的记录 数量
		this.setStartRow(pageIndex);//当前页第一个数据的行号
		this.setEndRow(pageIndex+pageSize-1);//当前页最后一个数据的行号
		this.setPrePage(pageIndex-pageSize);//上一页的行号
		this.setNextPage(pageIndex+pageSize);//下一页的行号
		this.setFirstPage(1);
		this.setLastPage((int)(total - total%pageSize+1));
		this.setPageNum((pageIndex+pageSize-1)/pageSize);//当前页码
		this.setPages((int) (total/pageSize+1));//所有页数
		this.setSize(resultList.size());//记录数量
		this.setList(resultList);//查回的记录
		this.setNavigatePages(showPage);//导航页码数
		this.setNavigateFirstPage(showFirstPage); //导航条上的第一页
		this.setNavigateLastPage(showLastPage); //导航条上的最后一页
		this.setNavigatepageNums(showpages);//所有显示的导航页号
		this.setTotal(total);//数据库全部记录数
		this.setIsFirstPage(pageIndex==1);//是否为第一页
		this.setIsLastPage(total-pageIndex<=pageSize);///是否为最后一页
		this.setHasPreviousPage(pageIndex!=1);//是否有前一页
		this.setHasNextPage(total-pageIndex>pageSize); //是否有下一页
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getPrePage() {
		return prePage;
	}

	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}


	public int getNavigatePages() {
		return navigatePages;
	}

	public void setNavigatePages(int navigatePages) {
		this.navigatePages = navigatePages;
	}

	public int[] getNavigatepageNums() {
		return navigatepageNums;
	}

	public void setNavigatepageNums(int[] navigatepageNums) {
		this.navigatepageNums = navigatepageNums;
	}

	public int getNavigateFirstPage() {
		return navigateFirstPage;
	}

	public void setNavigateFirstPage(int navigateFirstPage) {
		this.navigateFirstPage = navigateFirstPage;
	}

	public int getNavigateLastPage() {
		return navigateLastPage;
	}

	public void setNavigateLastPage(int navigateLastPage) {
		this.navigateLastPage = navigateLastPage;
	}

	public boolean getIsFirstPage() {
		return isFirstPage;
	}

	public void setIsFirstPage(boolean firstPage) {
		isFirstPage = firstPage;
	}

	public boolean getIsLastPage() {
		return isLastPage;
	}

	public void setIsLastPage(boolean lastPage) {
		isLastPage = lastPage;
	}

	public boolean getHasPreviousPage() {
		return hasPreviousPage;
	}

	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}

	public boolean getHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
}

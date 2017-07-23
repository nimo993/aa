package org.fkit.shop.domain;

public class Goods {
	public int id ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String goods_name;
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public int goods_price;
	public int getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(int goods_price) {
		this.goods_price = goods_price;

	}
	private String image;
	public String getImage() {
		return image;
	}
	private String stoke;
	public String getStoke() {
		return stoke;
	}
	public void setStoke(String stoke) {
		this.stoke = stoke;
	}
	public void setImage(String image) {
		this.image = image;
	}
	private String category;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	private String amount;
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	private String remark;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	private String image1;
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	private String image2;
	private String image3;
	@Override
	public String toString() {
		return "Goods [goods_id=" + id +",goods_name="+goods_name + ", goods_price="
				+ goods_price + ",image="+image+",image1="+image1+",image2="+image2+",image3="+image3+",category="+category+",amount="+amount+""
						+ ",stoke="+stoke+"]";
	}
}

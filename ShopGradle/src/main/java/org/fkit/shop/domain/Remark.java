package org.fkit.shop.domain;

public class Remark {
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getGoodsid() {
	return goodsid;
}
public void setGoodsid(int goodsid) {
	this.goodsid = goodsid;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
private int userid;
private int goodsid;
private String image;
private String remarks;
@Override
public String toString() {
	return "Goods [goodsid=" + goodsid +",userid="+userid + ", image="
			+ image+ ",remarks="+remarks+",id="+id+"]";
}
}

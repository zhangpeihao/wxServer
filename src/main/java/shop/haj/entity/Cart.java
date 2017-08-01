package shop.haj.entity;

import java.io.Serializable;

/**
 * <p>Title: shop.ha.entity</p>
 * <p/>
 * <p>
 * Description: 购物车
 * </p>
 * <p/>
 *
 * @author hao
 *         CreateTime：5/20/17
 */
public class Cart implements Serializable {
	
	private int cart_id;//购物车ID
	private int customer_id;//用户ID
	private int shop_id;//店铺ID
	private String shop_name;//店铺名称
	private int goods_id;//商品ID
	private String goods_name;//商品名称
	private double goods_price;//商品价格
	private int goods_num;//商品数量
	private String goods_image;//商品图片
	private String goods_sku;//规格说明
	private String note;//商品备注
	private String create_time;//添加到购物车的时间
	private String update_time;//购物车更新时间
	
	public Cart() {
	}
	
	public int getCart_id() {
		return cart_id;
	}
	
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	
	public int getCustomer_id() {
		return customer_id;
	}
	
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	
	public int getShop_id() {
		return shop_id;
	}
	
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	
	public String getShop_name() {
		return shop_name;
	}
	
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	
	public int getGoods_id() {
		return goods_id;
	}
	
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	
	public String getGoods_name() {
		return goods_name;
	}
	
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	
	public double getGoods_price() {
		return goods_price;
	}
	
	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}
	
	public int getGoods_num() {
		return goods_num;
	}
	
	public void setGoods_num(int goods_num) {
		this.goods_num = goods_num;
	}
	
	public String getGoods_image() {
		return goods_image;
	}
	
	public void setGoods_image(String goods_image) {
		this.goods_image = goods_image;
	}
	
	public String getGoods_sku() {
		return goods_sku;
	}
	
	public void setGoods_sku(String goods_sku) {
		this.goods_sku = goods_sku;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getCreate_time() {
		return create_time;
	}
	
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	
	public String getUpdate_time() {
		return update_time;
	}
	
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	
	@Override
	public String toString() {
		return "Cart{" +
				"cart_id=" + cart_id +
				", customer_id=" + customer_id +
				", shop_id=" + shop_id +
				", shop_name='" + shop_name + '\'' +
				", goods_id=" + goods_id +
				", goods_name='" + goods_name + '\'' +
				", goods_price=" + goods_price +
				", goods_num=" + goods_num +
				", goods_image='" + goods_image + '\'' +
				", goods_sku='" + goods_sku + '\'' +
				", note='" + note + '\'' +
				", create_time='" + create_time + '\'' +
				", update_time='" + update_time + '\'' +
				'}';
	}
}

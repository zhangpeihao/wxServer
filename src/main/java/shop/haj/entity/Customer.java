package shop.haj.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * <p>Title: shop.ha.entity</p>
 * <p/>
 * <p>
 * Description: 买家实体
 * </p>
 * <p/>
 *
 * @author hao
 *         CreateTime：3/2/17
 */
@Document(collection="wx_customer")
public class Customer implements Serializable {

	@Id
	private String id;
	
	private String nickName;
	
	private String openId;
	
	private String unionId;
	
	private String avatarUrl;
	
	private String phone;
	
	private String note;
	
	private String gender;
	
	private String language;
	
	private String city;
	
	private String province;
	
	private String country;
	
	private String create_time;
	
	private String update_time;
	
	public Customer() {
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getOpenId() {
		return openId;
	}
	
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
	public String getUnionId() {
		return unionId;
	}
	
	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
	
	public String getAvatarUrl() {
		return avatarUrl;
	}
	
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getProvince() {
		return province;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
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
		return "Customer{" +
				"id=" + id +
				", nickName='" + nickName + '\'' +
				", openId='" + openId + '\'' +
				", unionId='" + unionId + '\'' +
				", avatarUrl='" + avatarUrl + '\'' +
				", phone='" + phone + '\'' +
				", note='" + note + '\'' +
				", gender='" + gender + '\'' +
				", language='" + language + '\'' +
				", city='" + city + '\'' +
				", province='" + province + '\'' +
				", country='" + country + '\'' +
				", create_time='" + create_time + '\'' +
				", update_time='" + update_time + '\'' +
				'}';
	}
}

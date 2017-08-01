package shop.haj.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import shop.haj.entity.Coupon;
import shop.haj.entity.Pagination;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * <p>Title: shop.ha.repository</p>
 * <p/>
 * <p>
 * Description: TODO
 * </p>
 * <p/>
 *
 * @author hao
 *         CreateTime：3/24/17
 */
@Repository
public class CouponRepository {
	
	private Logger logger = LogManager.getLogger(CouponRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 新增coupon表数据
	 * @param shop_id
	 * @param coupon
	 * @return
	 */
	public Coupon addCoupon(int shop_id, Coupon coupon) {
		String sql = "insert into coupon(price, limit_price, shop_id, begin_time, \n" +
				"due_time, stock, per_limit,suit_limit, create_time) \n" +
				"values(?, ?, ?, ?, ?, ?, ?, ?, now())";
		
		logger.info("begin to addCoupon, shop_id:{}, coupon_info:{}, sql:{}", shop_id, coupon, sql);
		
		KeyHolder holder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				
				PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ps.setDouble(1, coupon.getPrice());
				ps.setDouble(2, coupon.getLimit_price());
				ps.setInt(3, shop_id);
				ps.setString(4, coupon.getBegin_time());
				ps.setString(5, coupon.getDue_time());
				ps.setInt(6, coupon.getStock());
				ps.setInt(7, coupon.getPer_limit());
				ps.setInt(8, coupon.getSuit_limit());
				return ps;
			}
		}, holder);
		
		coupon.setId(holder.getKey().intValue());
		
		logger.info("finish to addCoupon, generate_id:{}, shop_id:{}, coupon_info:{}, sql:{}",
				coupon.getId(), shop_id, coupon, sql);
		
		return coupon;
	}
	
	/**
	 * 新增优惠券适用商品关系表
	 * @param coupon_id
	 * @param goodsIdList
	 */
	public void addCouponGoodsRel(int coupon_id, List<Integer> goodsIdList){
		String sql = "insert into coupon_goods_rel(coupon_id, goods_id, create_time) values(?, ?, now())";
		
		logger.info("Repository -> addCouponGoodsRel, coupon_id:{}, goodsIdList:{}, sql:{} ",
				coupon_id, goodsIdList.toString(), sql);
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setInt(1, coupon_id);
				ps.setInt(2, goodsIdList.get(i));
			}
			
			@Override
			public int getBatchSize() {
				return goodsIdList.size();
			}
		});
	}
	
	/**
	 * 查找该优惠券对应的全部适用商品
	 * @param coupon_id
	 * @return
	 */
	public List<Integer> findCouponGoodsRelByID(int coupon_id){
		
		return null;
	}
	
	/**
	 * 查询卖家全部的优惠券信息
	 * @param shop_id
	 * @return
	 */
	public List<Coupon> findAllCouponByShopID(int shop_id, Pagination page){
		
		return null;
	}
	
	/**
	 * 卖家删除优惠券
	 * @param shop_id
	 * @param coupon_id
	 * @return
	 */
	public int deleteCouponByID(int shop_id, int coupon_id){
		
		return 1;
	}
	
	/**
	 * 删除该优惠券对应的适用商品信息
	 * @param coupon_id
	 */
	public void deleteCouponGoodsRelByID(int coupon_id){
		
	}
	
}
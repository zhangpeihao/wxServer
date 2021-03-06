package shop.haj.mongo_repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import shop.haj.entity.Notice;

/**
 * Created by 1 on 2017/8/3.
 */
public interface MongoNoticeRepository extends MongoRepository<Notice,String> {
    Page<Notice> findByShopId(String shopId,Pageable page);
    Page<Notice> findByShopIdAndIsShow(String shopId,int isShow,Pageable page);
}

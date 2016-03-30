package com.simpleblog.dao;


import com.simpleblog.domain.Blog;
import org.springframework.data.repository.CrudRepository;

/**
 * @author y.skuratovich
 * @version , 30.03.2016
 */
public interface BlogRepository extends CrudRepository<Blog, Long> {
}

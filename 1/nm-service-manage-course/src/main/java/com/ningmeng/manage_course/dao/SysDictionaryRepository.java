package com.ningmeng.manage_course.dao;

import com.ningmeng.framework.domain.system.SysDictionary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator.
 */
@Repository
public interface SysDictionaryRepository extends MongoRepository<SysDictionary,String> {
    //根据字典分类查询字典信息
    public SysDictionary findByDType(String type);
}

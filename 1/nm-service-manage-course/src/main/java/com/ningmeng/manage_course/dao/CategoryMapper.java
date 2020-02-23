package com.ningmeng.manage_course.dao;

import com.ningmeng.framework.domain.course.ext.CategoryNode;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Administrator.
 */
@Mapper
public interface CategoryMapper {

   public CategoryNode findList(String parentid);

}

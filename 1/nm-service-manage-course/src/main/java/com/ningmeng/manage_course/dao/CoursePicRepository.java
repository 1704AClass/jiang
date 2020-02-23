package com.ningmeng.manage_course.dao;

import com.ningmeng.framework.domain.course.CoursePic;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator.
 */
public interface CoursePicRepository extends JpaRepository<CoursePic,String> {

    long deleteByCourseid(String courseid);
}

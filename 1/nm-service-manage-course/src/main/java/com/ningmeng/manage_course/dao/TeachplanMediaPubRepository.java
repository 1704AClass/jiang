package com.ningmeng.manage_course.dao;

import com.ningmeng.framework.domain.course.TeachplanMediaPub;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 1 on 2020/3/5.
 */
public interface TeachplanMediaPubRepository extends JpaRepository<TeachplanMediaPub,String>{
    //根据课程id 删除课程计划媒资信息
    long deleteByCourseId(String courseId);
}

package com.ningmeng.framework.domain.course.response;

import com.ningmeng.framework.domain.course.CourseBase;
import com.ningmeng.framework.domain.course.CourseMarket;
import com.ningmeng.framework.domain.course.CoursePic;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by 1 on 2020/2/25.
 */
@Data
@ToString
@NoArgsConstructor
public class CourseView {
    CourseBase courseBase;//基础信息
    CourseMarket courseMarket;//课程营销
    CoursePic coursePic;//课程图片
    com.ningmeng.framework.domain.course.ext.TeachplanNode TeachplanNode;//教学计划
}

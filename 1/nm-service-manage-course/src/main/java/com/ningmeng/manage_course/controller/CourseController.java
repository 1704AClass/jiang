package com.ningmeng.manage_course.controller;

import com.ningmeng.api.courseapi.CourseControllerApi;
import com.ningmeng.framework.domain.course.CourseBase;
import com.ningmeng.framework.domain.course.CourseMarket;
import com.ningmeng.framework.domain.course.CoursePic;
import com.ningmeng.framework.domain.course.Teachplan;
import com.ningmeng.framework.domain.course.ext.CategoryNode;
import com.ningmeng.framework.domain.course.ext.TeachplanNode;
import com.ningmeng.framework.domain.course.response.AddCourseResult;
import com.ningmeng.framework.domain.course.response.CoursePublishResult;
import com.ningmeng.framework.domain.course.response.CourseView;
import com.ningmeng.framework.domain.system.SysDictionary;
import com.ningmeng.framework.model.response.CommonCode;
import com.ningmeng.framework.model.response.QueryResponseResult;
import com.ningmeng.framework.model.response.ResponseResult;
import com.ningmeng.manage_course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 1 on 2020/2/18.
 */
@RestController
@RequestMapping("/course")
public class CourseController implements CourseControllerApi{

    @Autowired
    CourseService courseService;

    @GetMapping("/findTeachplanList/{courseId}")
    @Override
    public TeachplanNode findTeachplanList(@PathVariable("courseId") String courseId) {
        return courseService.findTeachplanList(courseId);
    }

    @PostMapping("/teachplan/add")
    @Override
    public ResponseResult addTeachplan(@RequestBody Teachplan teachplan) {
        return courseService.addTeachplan(teachplan);
    }

    @GetMapping("/course/findCourseList/{page}/{size}")
    @Override
    public QueryResponseResult findCourseList(@PathVariable("page") int page,@PathVariable("size") int size, String companyId) {
        return courseService.findCourseList(page,size,companyId);
    }

    @GetMapping("/category/findList/{parentid}")
    @Override
    public CategoryNode findList(@PathVariable("parentid") String parentid) {
        return courseService.findList(parentid);
    }

    @GetMapping("/sys/{type}")
    @Override
    public SysDictionary getByType(@PathVariable("type") String type) {
        return courseService.findDictionaryByType(type);
    }

    @PostMapping("/coursebase/add")
    @Override
    public AddCourseResult addCourseBase(@RequestBody CourseBase courseBase) {
        return courseService.addCourseBase(courseBase);
    }

    @GetMapping("/coursebase/get/{courseId}")
    @Override
    public CourseBase getCourseBaseById(@PathVariable("courseId") String courseId) throws RuntimeException {
        return courseService.getCoursebaseById(courseId);
    }

    @PostMapping("/coursebase/update/{id}")
    @Override
    public ResponseResult updateCourseBase(@PathVariable("id") String id,@RequestBody CourseBase courseBase) {
        return courseService.updateCoursebase(id,courseBase);
    }


    @GetMapping("/coursemarket/get/{courseId}")
    @Override
    public CourseMarket getCourseMarketById(@PathVariable("courseId") String courseId) {
        return courseService.getCourseMarketById(courseId);
    }

    @PostMapping("/coursemarket/update/{id}")
    @Override
    public ResponseResult updateCourseMarket(@PathVariable("id") String id,@RequestBody CourseMarket courseMarket) {
        CourseMarket market = courseService.updateCourseMarket(id, courseMarket);
        if(market != null){
            return new ResponseResult(CommonCode.SUCCESS);
        }else{
            return new ResponseResult(CommonCode.FAIL);
        }
    }

    @PostMapping("/coursepic/add")
    @Override
    public ResponseResult addCoursePic(@RequestParam("courseId") String courseId,@RequestParam("pic") String pic) {
        return courseService.saveCoursePic(courseId,pic);
    }

    @GetMapping("/coursepic/list/{courseId}")
    @Override
    public CoursePic findCoursePic(@PathVariable("courseId") String courseId) {
        return courseService.findCoursepic(courseId);
    }

    @DeleteMapping("/coursepic/delete")
    @Override
    public ResponseResult deleteCoursePic(@RequestParam("courseId") String courseId) {
        return courseService.deleteCoursePic(courseId);
    }

    @GetMapping("/courseview/{id}")
    @Override
    public CourseView courseview(@PathVariable("id") String id) {
        return courseService.getCourseView(id);
    }

    @PostMapping("/preview/{id}")
    @Override
    public CoursePublishResult preview(@PathVariable("id") String id) {
        return courseService.preview(id);
    }

    @PostMapping("/publish/{id}")
    @Override
    public CoursePublishResult publish(@PathVariable("id") String id) {
        return courseService.publish(id);
    }


}

package com.ningmeng.manage_course;

import com.ningmeng.framework.domain.cms.CmsPage;
import com.ningmeng.manage_course.client.CmsPageClient;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 1 on 2020/2/22.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FeignTest {

    @Autowired
    CmsPageClient cmsPageClient;

    @org.junit.Test
    public void testFeign(){
        CmsPage cmsPage = cmsPageClient.findById("5a754adf6abb500ad05688d9");
        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+"+cmsPage);
    }
}

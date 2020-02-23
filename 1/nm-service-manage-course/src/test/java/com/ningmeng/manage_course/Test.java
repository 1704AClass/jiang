package com.ningmeng.manage_course;

import com.ningmeng.framework.domain.cms.CmsPage;
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
public class Test {

    @Autowired
    RestTemplate restTemplate;

    @org.junit.Test
    public void testRibbon(){
        //服务id
        String serviceId = "NM-SERVICE-MANAGE-CMS";
        String id = "5a754adf6abb500ad05688d9";
        for(int i = 0;i<5;i++){
            //通过服务id调用
            ResponseEntity<CmsPage> forEntity = restTemplate.getForEntity("http://" + serviceId
                    + "/cms/findOne/"+id, CmsPage.class);
            CmsPage cmsPage = forEntity.getBody();
            System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+"+cmsPage);
        }
    }
}

package com.ningmeng.manage_course.client;

import com.ningmeng.framework.client.NmServiceList;
import com.ningmeng.framework.domain.cms.CmsPage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by 1 on 2020/2/22.
 */
@FeignClient(value = NmServiceList.nm_SERVICE_MANAGE_CMS)
public interface CmsPageClient {

    @GetMapping("/cms/findOne/{id}")
    public CmsPage findById(@PathVariable("id") String id);
}

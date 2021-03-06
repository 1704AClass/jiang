package com.ningmeng.api.filesystemapi;

import com.ningmeng.framework.domain.filesystem.response.UploadFileResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 1 on 2020/2/21.
 */
@Api(value = "文件系统服务接口",description = "提供文件服务接口常规服务")
public interface FileSystemControllerApi {

    /**
     * 上传文件
     * @param multipartFile 文件
     * @param filetag  文件标签
     * @param businesskey  业务key
     * @param metadata 元信息  json格式
     * @return
     */
    @ApiOperation("文件上传接口")
    public UploadFileResult upload(MultipartFile multipartFile,String filetag,String businesskey,String metadata);
}

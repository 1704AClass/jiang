package com.ningmeng.filesystem.controller;

import com.ningmeng.api.filesystemapi.FileSystemControllerApi;
import com.ningmeng.filesystem.service.FileSystemService;
import com.ningmeng.framework.domain.filesystem.response.UploadFileResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 1 on 2020/2/21.
 */
@RestController
@RequestMapping("/fileSystem")
public class FileSystemController implements FileSystemControllerApi{

    @Autowired
    FileSystemService fileSystemService;

    @PostMapping("/upload")
    @Override
    public UploadFileResult upload(@RequestParam("file") MultipartFile file,
                                   @RequestParam(value = "filetag",required = true) String filetag,
                                   @RequestParam(value = "businesskey",required = false) String businesskey,
                                   @RequestParam(value = "metadata",required = false) String metadata) {
        return fileSystemService.upload(file,filetag,businesskey,metadata);
    }
}

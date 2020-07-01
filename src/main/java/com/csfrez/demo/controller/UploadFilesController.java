package com.csfrez.demo.controller;

import com.csfrez.demo.entity.G11nUploadResult;
import com.csfrez.demo.i18n.CustomizeMessageResource;
import com.csfrez.demo.i18n.G11nUploadCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
public class UploadFilesController {

    private final Logger logger = LoggerFactory.getLogger(UploadFilesController.class);

    private static String UPLOADED_FOLDER = "/users/Frez/upload/";

    @PostMapping("/uploadfiles")
    public G11nUploadResult uploadFile(@RequestParam("file") MultipartFile uploadfile) throws IOException {
        logger.debug("Single file uploa!");

        G11nUploadResult result = new G11nUploadResult();
        CustomizeMessageResource customizeMessageResource = new CustomizeMessageResource();

        if (uploadfile.isEmpty()) {
            return new G11nUploadResult(G11nUploadCode.ERROR, "zh_CN");
        }

        try {
            saveUploadedFiles(Arrays.asList(uploadfile));
        } catch (IOException e) {
            return new G11nUploadResult(G11nUploadCode.NOT_FOUND, "zh_CN");
        }
        logger.info("Successfully uploaded - " + uploadfile.getOriginalFilename());
        result.setStatus("OK");
        result.setData(customizeMessageResource.getMessage("success_upload", "zh_CN", uploadfile.getOriginalFilename()));
        return result;
    }

    private void saveUploadedFiles(List<MultipartFile> multipartFileList) throws IOException{
        multipartFileList.forEach(System.out::println);
        //throw new IOException("文件异常");
    }
}
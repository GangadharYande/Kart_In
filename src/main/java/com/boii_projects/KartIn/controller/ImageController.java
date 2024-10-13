package com.boii_projects.KartIn.controller;


import com.boii_projects.KartIn.dto.ImageDto;
import com.boii_projects.KartIn.model.Image;
import com.boii_projects.KartIn.response.ApiResponse;
import com.boii_projects.KartIn.service.image.IImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.sql.SQLException;
import java.util.List;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/images")
public class ImageController {


    private final IImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<ApiResponse>  savedImages(@RequestParam List<MultipartFile> files , @RequestParam Long productId){
        try{
            List<ImageDto> imageDtos = imageService.saveImages(files, productId);
            return ResponseEntity.ok(new ApiResponse("Upload success", imageDtos));

        }
        catch (Exception e){
            return  ResponseEntity.status(INTERNAL_SERVER_ERROR).body(new ApiResponse("Upload failed",e.getMessage()));
        }
    }


    @GetMapping("/image/download/{imageId}")
    public ResponseEntity<Resource> downloadImage(@PathVariable Long imageId) throws SQLException {
        Image image = imageService.getImageByID(imageId);
        ByteArrayResource resource =  new ByteArrayResource(image.getImage().getBytes(1,(int)image.getImage().length()));

        return ResponseEntity.ok().contentType(MediaType.parseMediaType(image.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION ,"attachment ; filename=\"" + image.getFileName() +"\"")
                .body(resource);
    }


    @PostMapping("/image/{imageID}/update")
    public ResponseEntity<ApiResponse> updateImage (@PathVariable Long imageId , @RequestBody MultipartFile file){
        try {
            Image image = imageService.getImageByID(imageId);
            if(image != null){
                imageService.updateImage(file, imageId);
                return ResponseEntity.ok().body(new ApiResponse("Update success", imageId));
            }
        } catch (Exception e) {
            return ResponseEntity.status(NOT_FOUND).body(new ApiResponse("Update failed", e.getMessage()));
        }

        return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(new ApiResponse("Update failed", INTERNAL_SERVER_ERROR));

    }




    @DeleteMapping ("/image/{imageID}/update")
    public ResponseEntity<ApiResponse> deleteImage (@PathVariable Long imageId ){
        try {
            Image image = imageService.getImageByID(imageId);
            if(image != null){
                imageService.deleteImageByID( imageId);
                return ResponseEntity.ok().body(new ApiResponse("Delete success", imageId));
            }
        } catch (Exception e) {
            return ResponseEntity.status(NOT_FOUND).body(new ApiResponse("Delete failed", e.getMessage()));
        }

        return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(new ApiResponse("Delete failed", INTERNAL_SERVER_ERROR));

    }


}



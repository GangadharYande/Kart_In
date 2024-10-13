package com.boii_projects.KartIn.service.image;

import com.boii_projects.KartIn.dto.ImageDto;
import com.boii_projects.KartIn.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageByID(Long id);
    void deleteImageByID(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId );
    void updateImage(MultipartFile file, Long imageId );

}

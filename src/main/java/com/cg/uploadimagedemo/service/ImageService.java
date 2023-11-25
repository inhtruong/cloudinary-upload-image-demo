package com.cg.uploadimagedemo.service;

import com.cg.uploadimagedemo.model.dto.ImageModel;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface ImageService {
    public ResponseEntity<Map> uploadImage(ImageModel imageModel);
}

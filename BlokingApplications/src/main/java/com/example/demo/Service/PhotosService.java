package com.example.demo.Service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Bean.Photos;

public interface PhotosService {

	public String addPhoto(MultipartFile file) throws IOException ;
	public byte[] getPhoto(String fileName); 
	public Boolean deletePhotos(Long id) ;
	 public Photos updatePhotos(Photos  photos);
	 public Photos getPhotosById(Long id) ;
	 
}

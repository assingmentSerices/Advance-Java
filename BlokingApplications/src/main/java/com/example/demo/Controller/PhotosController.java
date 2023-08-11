package com.example.demo.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Bean.Photos;
import com.example.demo.Service.PhotosService;

@RestController
@RequestMapping("/photos")
public class PhotosController {
	@Autowired
	private PhotosService photosservice;

	@PostMapping("/uplod")
	public ResponseEntity<?> upload(@RequestParam("image") MultipartFile file) throws IOException {
		String uploadImage = photosservice.addPhoto(file);
		return ResponseEntity.status(HttpStatus.OK).body(uploadImage);
	}

	@GetMapping("/{filename}")
	public ResponseEntity<?> downloadImage(@PathVariable String filename) {
		//System.out.println(filename);
		ResponseEntity<?> response = null;
		try {
			byte[] imageData = photosservice.getPhoto(filename);
			//System.out.println(imageData.length);
			response = ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(imageData);
		} catch (Exception e) {

		}

		return response;
	}

	@PutMapping("/update")
	public ResponseEntity<Photos> updatephotos(@RequestBody Photos album) {
		ResponseEntity<Photos> response = new ResponseEntity<Photos>(this.photosservice.updatePhotos(album),
				HttpStatus.OK);
		return response;
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> addAlbum(@PathVariable Long id) {
		ResponseEntity<String> response = new ResponseEntity<String>(
				this.photosservice.deletePhotos(id) + " Photos Deleted Id : " + id, HttpStatus.CREATED);
		return response;
	}

}

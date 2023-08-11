package com.example.demo.Impl;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Bean.Photos;
import com.example.demo.ExcptionHandler.PhotosNotFoundException;
import com.example.demo.Repo.PhotosRepo;
import com.example.demo.Service.PhotosService;
@Service
public class PhotosImpl implements PhotosService{

	@Autowired
	private PhotosRepo photosrepo;

	@Override
	public String addPhoto(MultipartFile file) throws IOException {
		// TODO Auto-generated method stub
		Photos pe=photosrepo.save(Photos.builder().name(file.getOriginalFilename()).type(file.getContentType())
				.imagedata(ImageUtils.compressImage(file.getBytes())).build());
		if(pe!=null) {
			return "file uploaded Successfully" +file.getOriginalFilename();
		}
		return null;
	}

	@Override
	public byte[] getPhoto(String fileName) {
		// TODO Auto-generated method stub
	Optional<Photos> pe=photosrepo.findByName(fileName);
	if(pe.isPresent())
	{
		System.out.println(pe);
		byte[] pho= ImageUtils.decompressImage(pe.get().getImagedata());
		return pho; 
	}
	System.out.println("nul");
	return null;
		}
	

	@Override
	public Boolean deletePhotos(Long id) {
		// TODO Auto-generated method stub
		if (this.photosrepo.existsById(id)) {
			this.photosrepo.deleteById(id);
			return true;
		}
		throw new PhotosNotFoundException("Photo not Found ID : " + id);
	}
	

	@Override
	public Photos updatePhotos(Photos photos) {
		// TODO Auto-generated method stub
		return this.photosrepo.save(photos);
	}

	@Override
	public Photos getPhotosById(Long id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Optional<Photos> photos = this.photosrepo.findById(id);
			       if(photos.isPresent())
			    	   return photos.get();
			       throw new PhotosNotFoundException("photos  not founf" +id);
			}
				
	}
	


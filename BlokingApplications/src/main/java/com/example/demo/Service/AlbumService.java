package com.example.demo.Service;

import java.util.List;

import com.example.demo.Bean.Album;
import com.example.demo.ExcptionHandler.AlbumNotFoundException;


public interface AlbumService {

	public Album addAlbum(Album album);
	 public List<Album> getAllAlbum();
	 public Boolean deleteAlbum(Long id) throws AlbumNotFoundException;
	 public Album updateAlbum(Album album);
	 public Album getAlbumById(Long id);
	   
}

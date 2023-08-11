package com.example.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bean.Album;
import com.example.demo.ExcptionHandler.AlbumNotFoundException;
import com.example.demo.Repo.AlbumRepo;
import com.example.demo.Service.AlbumService;
@Service
public class AlbumImpl implements AlbumService {
@Autowired
	private AlbumRepo albumrepo;

	@Override
	public Album addAlbum(Album album) {
		// TODO Auto-generated method stub
		return this.albumrepo.save(album);
	}

	@Override
	public List<Album> getAllAlbum() {
		// TODO Auto-generated method stub
		return this.albumrepo.findAll();
	}

	@Override
	public Boolean deleteAlbum(Long id) throws AlbumNotFoundException {
		// TODO Auto-generated method stub
		if(this.albumrepo.existsById(id)) {
			this.albumrepo.deleteById(id);
			return  true;
		}
				
		throw new AlbumNotFoundException("Album not Found ID : " + id);
	}

	@Override
	public Album updateAlbum(Album album) {
		// TODO Auto-generated method stub
		return this.albumrepo.save(album);
	}

	@Override
	public Album getAlbumById(Long id) {
		// TODO Auto-generated method stub
		return this.albumrepo.getById(id);
	}

}

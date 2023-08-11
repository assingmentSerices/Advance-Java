package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.Album;
import com.example.demo.ExcptionHandler.AlbumNotFoundException;
import com.example.demo.ExcptionHandler.UserFoundException;
import com.example.demo.Service.AlbumService;

@RestController
@RequestMapping("album")
public class AlbumController {

	@Autowired
	private AlbumService albumservice;
	@PostMapping("save")
	public ResponseEntity<Album> addAlbum(@RequestBody Album album){
		ResponseEntity<Album> responce= new ResponseEntity<Album>(this.albumservice.addAlbum(album),HttpStatus.CREATED);
		    return responce ;
	}
	
	@PutMapping("/update")
	public ResponseEntity<Album> updateAlbum(@RequestBody Album album)throws UserFoundException
	{
		ResponseEntity<Album> responce= new ResponseEntity<Album>(this.albumservice.updateAlbum(album),HttpStatus.CREATED);
		  return responce;
	}
	@GetMapping("/{id}")
	public ResponseEntity<Album> getAlbum(@PathVariable Long id) {
		ResponseEntity<Album> response = new ResponseEntity<Album>(this.albumservice.getAlbumById(id), HttpStatus.CREATED);
		return response;
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAlbum(@PathVariable Long id) throws AlbumNotFoundException  {
		ResponseEntity<String> response = new ResponseEntity<String>(this.albumservice.deleteAlbum(id)+ " Todo Deleted Id : "+id,HttpStatus.CREATED);
		return response;
	}
	@GetMapping("")
	public ResponseEntity<List<Album>> getAllAlbum(Album album){
		ResponseEntity<List<Album>> response = new ResponseEntity<List<Album>>(this.albumservice.getAllAlbum(),HttpStatus.OK);
		return response;
	}
	
	
}

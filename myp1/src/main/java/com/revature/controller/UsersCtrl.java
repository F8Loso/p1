package com.revature.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.revature.beans.Reimbursement;
import com.revature.beans.Users;
import com.revature.repo.UsersRepo;
import com.revature.services.UsersServ;
import com.revature.services.UsersServImpl;

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

@RestController
@RequestMapping("/resourceRootPath")
 class UsersCtrl {

	@Autowired
	UsersServ usersService;
	 @GetMapping
	    public ResponseEntity<List<Users>> getAll() {
	        try {
	            List<Users> items = new ArrayList<Users>();

	            usersService.findAll().forEach(items::add);

	            if (items.isEmpty())
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	            return new ResponseEntity<>(items, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }


	@GetMapping("{id}")
	public ResponseEntity<Users> getById(@PathVariable("id") int id) {
		Optional<Users> existingItemOptional = UsersServ.findById(id);

		if (existingItemOptional.isPresent()) {
			return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping
	public ResponseEntity<Users> create(@RequestBody Users item) {
		try {
			Users savedItem = usersService.save(item);
			return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}

	@PutMapping("{id}")
	public ResponseEntity<Users> update(@PathVariable("id") int id, @RequestBody Users item) {
		Optional<Users> existingItemOptional = UsersServ.findById(id);
		if (existingItemOptional.isPresent()) {
			Users existingItem = existingItemOptional.get();
			System.out.println("TODO for developer - update logic is unique to entity and must be implemented manually.");
			//existingItem.setSomeField(item.getSomeField());
			return new ResponseEntity<>(usersService.save(existingItem), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id) {
		try {
			usersService.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}
}
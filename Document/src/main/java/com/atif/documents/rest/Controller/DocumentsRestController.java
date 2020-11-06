package com.atif.documents.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atif.documents.models.Documents;
import com.atif.documents.service.DocumentsService;

@RestController
@RequestMapping(value = "/docs")
public class DocumentsRestController {

	@Autowired
	DocumentsService service;

	@GetMapping(value = "/download/id/{id}")
	public Documents download(@PathVariable("id") int id) {
		return service.findById(id);
	}

	@PostMapping(value = "upload")
	public Documents addDocument(@RequestBody Documents doc) {
		return service.save(doc);
	}

	@GetMapping(value = "/findall")
	public List<Documents> findAll() {
		return service.findAll();
	}

	@DeleteMapping(value = "/delete/id/{id}")
	public void deleteById(@PathVariable("id") int id) {
		service.delete(id);
	}
}

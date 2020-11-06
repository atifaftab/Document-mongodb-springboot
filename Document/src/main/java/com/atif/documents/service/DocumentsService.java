package com.atif.documents.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atif.documents.models.Documents;
import com.atif.documents.repositories.DocumentsRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class DocumentsService {

	@Autowired
	DocumentsRepository repo;

	public Documents findById(int id) {
		return repo.findById(id).get();
	}

	public Documents save(Documents doc) {
		return repo.save(doc);
	}

	public List<Documents> findAll() {
		return repo.findAll();
	}

	public void delete(int id) {
		repo.deleteById(id);
	}
}

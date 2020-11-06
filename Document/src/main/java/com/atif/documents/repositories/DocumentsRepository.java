package com.atif.documents.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.atif.documents.models.Documents;

@Repository
public interface DocumentsRepository extends MongoRepository<Documents, Integer>{

}

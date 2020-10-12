package com.springbootapp.peerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapp.peerproject.Entity.MessageEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called MessageRepository
	// CRUD refers Create, Read, Update, Delete

//public interface MessageRepository extends CRUDRepository<MessageEntity, Integer> {


//Crud Repository is the base interface and it acts as a marker interface. JPA also provides some extra methods 
//related to JPA such as delete records in batch and flushing data directly to a database
	public interface MessageRepository extends JpaRepository<MessageEntity, Long> {

		
	}


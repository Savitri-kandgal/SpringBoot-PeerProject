package com.SpringbootApp.peerproject.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.SpringbootApp.peerproject.Entity.MessageEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
	// CRUD refers Create, Read, Update, Delete

	public interface MessageRepository extends CrudRepository<MessageEntity, Integer> {

	}


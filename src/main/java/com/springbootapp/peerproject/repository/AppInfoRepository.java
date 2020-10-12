package com.springbootapp.peerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootapp.peerproject.Entity.AppInfoEntity;

@Repository
public interface AppInfoRepository extends JpaRepository<AppInfoEntity, Long> {

	
}

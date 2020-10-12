package com.springbootapp.peerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootapp.peerproject.Entity.EnvEntity;

@Repository
public interface EnvRepository extends JpaRepository<EnvEntity, Long> {
//	List<EnvEntity> findByPid(Long pId);
	// Optional<EnvEntity> findByEidAndPid(Long eId, Long pId);
}

package com.waisl.rlcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.waisl.rlcc.model.RlccUserEntity;
@Repository
public interface RlccRepository extends JpaRepository<RlccUserEntity, Long> {
	

}

package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.EntityValidation;

@Repository
public interface EntityVDAO extends JpaRepository<EntityValidation, Integer> {

}

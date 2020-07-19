package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Validation2;

@Repository
public interface Valid2DAO extends JpaRepository<Validation2, Integer>{

}

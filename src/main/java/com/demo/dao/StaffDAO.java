package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Staff;

@Repository
public interface StaffDAO extends JpaRepository<Staff, Integer> {
	
}

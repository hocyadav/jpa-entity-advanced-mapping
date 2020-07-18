package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.TeachingStaff;

@Repository
public interface TStaffDAO extends JpaRepository<TeachingStaff, Integer> {

}

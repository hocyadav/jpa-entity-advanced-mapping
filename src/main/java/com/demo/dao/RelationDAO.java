package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.ForRelationTest;

@Repository
public interface RelationDAO extends JpaRepository<ForRelationTest, Integer> {

}

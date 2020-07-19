package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.embeddable.Dog;

@Repository
public interface DogDAO extends JpaRepository<Dog, Integer>{

}

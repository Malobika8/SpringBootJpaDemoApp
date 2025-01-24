package com.springboot.jpa.dao;

import com.springboot.jpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Integer> {
}

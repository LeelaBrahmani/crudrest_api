package com.cyr.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyr.rest.entity.Programmer;
@Repository
public interface ProgrammerRepository extends JpaRepository<Programmer, Integer> {


}

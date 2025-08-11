package com.wipro.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.restapi.entity.TheatreEntity;

@Repository
public interface TheatreRepository extends JpaRepository<TheatreEntity, Long> {

}

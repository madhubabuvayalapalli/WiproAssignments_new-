package com.wipro.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.restapi.entity.BookingEntity;
@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long>{

}

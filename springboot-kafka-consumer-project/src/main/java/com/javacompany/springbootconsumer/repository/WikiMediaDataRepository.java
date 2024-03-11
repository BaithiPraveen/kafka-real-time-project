package com.javacompany.springbootconsumer.repository;

import com.javacompany.springbootconsumer.entity.WikiMediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiMediaDataRepository extends JpaRepository<WikiMediaData,Long> {
}

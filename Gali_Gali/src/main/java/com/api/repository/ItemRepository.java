package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Items;

public interface ItemRepository extends JpaRepository<Items, Integer> {

}

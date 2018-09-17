package com.uni7.takersandgivers.repository;

import com.uni7.takersandgivers.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Antenas on 17/09/2018.
 **/
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}

package com.uni7.takersandgivers.repository;

import com.uni7.takersandgivers.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Antenas on 17/09/2018.
 **/
@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}

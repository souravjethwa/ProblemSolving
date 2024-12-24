package com.ssjethwa.springSec.repository;

import com.ssjethwa.springSec.model.Customer;
import com.ssjethwa.springSec.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
}

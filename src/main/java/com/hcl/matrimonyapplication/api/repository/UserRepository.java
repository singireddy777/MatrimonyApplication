package com.hcl.matrimonyapplication.api.repository;
/***
 * @author venkat
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.matrimonyapplication.api.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUserName(String userName);
}

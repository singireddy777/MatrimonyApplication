package com.hcl.matrimonyapplication.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.matrimonyapplication.api.entity.CreateProfile;

@Repository
public interface CreateProfileRepository extends JpaRepository<CreateProfile, Long>{

}

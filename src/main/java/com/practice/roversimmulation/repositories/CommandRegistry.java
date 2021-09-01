package com.practice.roversimmulation.repositories;

import com.practice.roversimmulation.Entity.Registry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandRegistry extends CrudRepository<Registry,Long>{
}

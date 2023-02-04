package com.testsalt.repo;

import com.testsalt.entity.Konsumen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KonsumenRepo extends CrudRepository<Konsumen, Integer> {
}

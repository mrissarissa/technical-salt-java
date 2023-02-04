package com.testsalt.service;

import com.testsalt.entity.Konsumen;
import com.testsalt.repo.KonsumenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


public interface konsumenService {
    public List<Konsumen> findAll();
    public void save(Konsumen konsumen);
    public void delete(Konsumen konsumen);
    public Optional<Konsumen> findbyId(Integer id);
    void update(Konsumen customer);


}

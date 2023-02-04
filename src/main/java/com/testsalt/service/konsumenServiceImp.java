package com.testsalt.service;

import com.testsalt.entity.Konsumen;
import com.testsalt.repo.KonsumenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("konsumenServiceImp")
public class konsumenServiceImp implements konsumenService {

    @Autowired
    private KonsumenRepo konsumenRepo;

    @Override
    public void update(Konsumen konsumen) {
        konsumenRepo.save(konsumen);
    }

    @Override
    public List<Konsumen> findAll() {
        return null;
    }

    @Override
    @Transactional
    public void save(Konsumen konsumen) {
        konsumenRepo.save(konsumen);
    }
    @Override
    @Transactional
    public void delete(Konsumen konsumen) {
        konsumenRepo.delete(konsumen);
    }

    @Override
    public Optional<Konsumen> findbyId(Integer id) {
        return Optional.empty();
    }
}

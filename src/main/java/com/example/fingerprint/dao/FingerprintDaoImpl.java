package com.example.fingerprint.dao;

import com.example.fingerprint.model.Fingerprint;
import com.example.fingerprint.repository.FingerprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FingerprintDaoImpl implements FingerprintDao{

    @Autowired
    private FingerprintRepository fingerprintRepository;

    @Override
    public List<Fingerprint> findAll() {
        return fingerprintRepository.findAll();
    }

    @Override
    public Fingerprint findById(int id) {
        return fingerprintRepository.getOne(id);
    }

    @Override
    public Fingerprint save(Fingerprint fingerprint) {
        return fingerprintRepository.save(fingerprint);
    }


    @Override
    public Fingerprint deleteById(int id) {
        return fingerprintRepository.getOne(id);
    }
}

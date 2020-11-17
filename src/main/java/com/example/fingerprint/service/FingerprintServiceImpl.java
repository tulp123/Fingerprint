package com.example.fingerprint.service;

import com.example.fingerprint.dao.FingerprintDao;
import com.example.fingerprint.model.Fingerprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FingerprintServiceImpl implements FingerprintService{

    @Autowired
    private FingerprintDao fingerprintDao;

    @Override
    public List<Fingerprint> findAll() {
        return fingerprintDao.findAll();
    }

    @Override
    public Fingerprint findById(int id) {
        return fingerprintDao.findById(id);
    }

    @Override
    public Fingerprint save(Fingerprint fingerprint) {
        return fingerprintDao.save(fingerprint);
    }

    @Override
    public Fingerprint deleteById(int id) {
        return fingerprintDao.deleteById(id);
    }


}

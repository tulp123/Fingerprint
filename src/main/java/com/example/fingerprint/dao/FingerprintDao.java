package com.example.fingerprint.dao;

import com.example.fingerprint.model.Fingerprint;

import java.util.List;

public interface FingerprintDao {
    List<Fingerprint> findAll();

    Fingerprint findById(int id);

    Fingerprint save (Fingerprint fingerprint);

    Fingerprint deleteById(int id);
}

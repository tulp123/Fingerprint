package com.example.fingerprint.service;

import com.example.fingerprint.model.Fingerprint;

import java.util.List;

public interface FingerprintService {
    List<Fingerprint> findAll();

    Fingerprint findById(int id);

    Fingerprint save(Fingerprint fingerprint);

    Fingerprint deleteById(int id);
}

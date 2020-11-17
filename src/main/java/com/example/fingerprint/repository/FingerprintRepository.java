package com.example.fingerprint.repository;

import com.example.fingerprint.model.Fingerprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FingerprintRepository extends JpaRepository<Fingerprint, Integer> {

}

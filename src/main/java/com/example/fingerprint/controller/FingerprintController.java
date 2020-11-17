package com.example.fingerprint.controller;

import com.example.fingerprint.model.Fingerprint;
import com.example.fingerprint.service.FingerprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fingerprint")
@CrossOrigin("http://localhost:3000")
public class FingerprintController {

    @Autowired
    private FingerprintService fingerprintService;

    //Get all Fingerprint
    @GetMapping
    public List<Fingerprint> getAll(){
        return fingerprintService.findAll();
    }

    //Get a single fingerprint
    @GetMapping("/{id}")
    public Fingerprint getFingerPrintById(@PathVariable("id") int id) {
        return fingerprintService.findById(id);
    }

    //Create a fingerprint
    @PostMapping
    public Fingerprint saveFingerPrint(@RequestBody Fingerprint fingerprint){
        return fingerprintService.save(fingerprint);
    }

    //Update a company
    @PutMapping("/{id}")
    public Fingerprint updateFingerPrint(@PathVariable(value = "id") int id, @RequestBody Fingerprint fingerprint){
        fingerprint.setId(id);
        Fingerprint updateFingerPrint = fingerprintService.save(fingerprint);
        return updateFingerPrint;
    }

    //Delete a company
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteFingerprint(@PathVariable(value = "id") int id) {
        try {
            fingerprintService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

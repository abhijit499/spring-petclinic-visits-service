package org.springframework.samples.petclinic.visits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.visits.dao.VisitRepository;
import org.springframework.stereotype.Service;

@Service
public class VisitService {

    @Autowired
    VisitRepository visitRepository;

}
package com.surgecross.sjgt.service;

import com.surgecross.sjgt.model.Car;
import com.surgecross.sjgt.model.Dealership;

import java.util.ArrayList;

public class DealerService {

    private ArrayList<Dealership> dealerships;

    public DealerService(ArrayList<Dealership> dealerships) {
        this.dealerships = dealerships;
    }

    private Dealership getDealershipById(long id) {
        return dealerships.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    public void addCarToDealer(Car car, long dealerId){
    }
}

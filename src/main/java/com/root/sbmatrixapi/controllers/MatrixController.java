package com.root.sbmatrixapi.controllers;


// import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.root.sbmatrixapi.entity.Matrix;
import com.root.sbmatrixapi.services.MatrixServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MatrixController {

    @Autowired
    private MatrixServices services;

    @PostMapping("/matrix")
    public int getMatrixSum(@RequestBody Map<String, Object> payload){

        // matrix base params
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Integer> matrix_data = oMapper.convertValue(payload.get("matrix"), new TypeReference<Map<String, Integer>>(){});
        int R = (Integer) matrix_data.get("R");
        int C = (Integer) matrix_data.get("C");
        int Z = (Integer) matrix_data.get("Z");
        
        Matrix matrix = new Matrix(R, C, Z);

        // parameters x and y
        int x = (Integer) payload.get("x");
        int y = (Integer) payload.get("y");
        // System.out.println(matrix_data);
        // System.out.println(x);
        // System.out.println(y);
        
        int result = this.services.getMatrixSum(matrix, x, y);
        return  result;
    }

}
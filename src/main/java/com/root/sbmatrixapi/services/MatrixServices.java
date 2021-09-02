package com.root.sbmatrixapi.services;

// import java.util.ArrayList;

import com.root.sbmatrixapi.entity.Matrix;

import org.springframework.stereotype.Service;

@Service
public class MatrixServices {

    public int getMatrixSum(Matrix matrix, int x, int y) {
        return matrix.sum_range(x, y);
    }

}

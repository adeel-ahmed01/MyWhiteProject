package com.cgi.paris.fs.comex.white.application.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VatService {
    public double computeFrenchVat(final double i) {
        BigDecimal bd = BigDecimal.valueOf(i*0.20);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public double computeGermanVat(final double i) {
        BigDecimal bd = BigDecimal.valueOf(i*0.19);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

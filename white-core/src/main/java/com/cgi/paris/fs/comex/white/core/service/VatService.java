package com.cgi.paris.fs.comex.white.core.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VatService {

    public double computeVat(final double amount, final double Vat){
        BigDecimal bd = BigDecimal.valueOf(amount*Vat);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    public double computeFrenchVat(final double amount) {
        return computeVat(amount, 0.20);
    }

    public double computeGermanVat(final double amount) {
        return computeVat(amount, 0.19);
    }
}

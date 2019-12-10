package com.cgi.paris.fs.comex.white.fitnesse.fixture;

import com.cgi.paris.fs.comex.white.core.service.VatService;
import fit.ColumnFixture;

public class ComputeVat extends ColumnFixture {

    private double amount;
    private VatService vatService = new VatService();

    public double frenchVat() {
        return this.vatService.computeFrenchVat(this.amount);
    }

    public double germanVat() {
        return this.vatService.computeGermanVat(this.amount);
    }

}

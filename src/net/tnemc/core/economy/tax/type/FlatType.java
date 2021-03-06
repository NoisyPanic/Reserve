package net.tnemc.core.economy.tax.type;

import net.tnemc.core.economy.tax.TaxType;

import java.math.BigDecimal;

public class FlatType implements TaxType {
  @Override
  public String name() {
    return "flat";
  }

  @Override
  public BigDecimal handleTaxation(BigDecimal amount, BigDecimal tax) {
    return amount.add(tax);
  }
}
/**
 * The MIT License
 * Copyright (c) 2012 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.xeiam.xchange.bitfinex.v1.dto.trade;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BitfinexCreditResponse {
  
  private final int id;
  private final String currency;
  private final String status;
  private final BigDecimal rate;
  private final int period;
  private final BigDecimal amount;
  private final float timestamp;
  
  public BitfinexCreditResponse(@JsonProperty("id") int id, @JsonProperty("currency") String currency, @JsonProperty("status") String status, @JsonProperty("rate") BigDecimal rate, 
      @JsonProperty("period") int period, @JsonProperty("amount") BigDecimal amount, @JsonProperty("timestamp") float timestamp) {
    
    this.id = id;
    this.currency = currency;
    this.status = status;
    this.rate = rate;
    this.period = period;
    this.amount = amount;
    this.timestamp = timestamp;
  }

  public int getId() {
    return id;
  }

  public String getCurrency() {
    return currency;
  }

  public String getStatus() {
    return status;
  }

  public BigDecimal getRate() {
    return rate;
  }

  public int getPeriod() {
    return period;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public float getTimestamp() {
    return timestamp;
  }

  @Override
  public String toString() {
    return "BitfinexCreditResponse [id=" + id + ", currency=" + currency + ", status=" + status + ", rate=" + rate + ", period=" + period + ", amount=" + amount + ", timestamp=" + timestamp + "]";
  }
  
}

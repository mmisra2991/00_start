package com.eazybytes.cards.query;

import lombok.Value;

@Value
public class FindCardQuery {
    private final String mobileNumber;
    public FindCardQuery(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}

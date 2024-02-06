package org.jmrtd;

import java.security.spec.KeySpec;

public class CANKey implements KeySpec {
    private String cardAccessNumber;

    public CANKey(String str) {
        this.cardAccessNumber = str;
    }

    public String getCardAccessNumber() {
        return this.cardAccessNumber;
    }
}

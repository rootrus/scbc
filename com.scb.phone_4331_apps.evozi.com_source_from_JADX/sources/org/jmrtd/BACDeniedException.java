package org.jmrtd;

import net.p088sf.scuba.smartcards.CardServiceException;

public class BACDeniedException extends CardServiceException {
    private static final long serialVersionUID = -7094953658210693249L;
    private BACKeySpec bacKey;

    public BACDeniedException(String str, BACKeySpec bACKeySpec, int i) {
        super(str, i);
        this.bacKey = bACKeySpec;
    }

    public BACKeySpec getBACKey() {
        return this.bacKey;
    }
}

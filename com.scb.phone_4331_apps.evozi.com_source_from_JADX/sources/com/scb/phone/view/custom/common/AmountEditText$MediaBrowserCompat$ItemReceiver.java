package com.scb.phone.view.custom.common;

import p040o.getICheckDeserializerRtti;

public class AmountEditText$MediaBrowserCompat$ItemReceiver implements AmountEditText$MediaBrowserCompat$CustomActionResultReceiver {
    public final boolean read(AmountEditText amountEditText, String str) {
        amountEditText.setText(getICheckDeserializerRtti.MediaBrowserCompat$SearchResultReceiver(str));
        return true;
    }
}

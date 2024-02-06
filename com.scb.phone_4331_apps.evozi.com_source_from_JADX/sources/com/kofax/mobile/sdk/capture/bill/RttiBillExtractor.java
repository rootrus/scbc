package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiExtractor;
import p040o.HmlPinActivity;

public class RttiBillExtractor extends RttiExtractor {
    @HmlPinActivity
    public RttiBillExtractor(IImageToByteArray iImageToByteArray) {
        super(iImageToByteArray);
    }
}

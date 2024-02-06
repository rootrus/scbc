package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiExtractor;
import p040o.HmlPinActivity;

public class RttiPassportExtractor extends RttiExtractor {
    @HmlPinActivity
    public RttiPassportExtractor(IImageToByteArray iImageToByteArray) {
        super(iImageToByteArray);
    }

    public void updateRttiRequest(RttiExtractor.RttiRequest rttiRequest) {
        rttiRequest.addStringPart("xIdType", "passport");
    }
}

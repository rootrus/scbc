package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiExtractor;
import p040o.HmlPinActivity;

public class RttiCheckExtractor extends RttiExtractor implements ICheckExtractionServer {
    private CheckParameters aay;

    @HmlPinActivity
    public RttiCheckExtractor(IImageToByteArray iImageToByteArray) {
        super(iImageToByteArray);
    }

    public void setCheckParameters(CheckParameters checkParameters) {
        this.aay = checkParameters;
    }

    public void updateRttiRequest(RttiExtractor.RttiRequest rttiRequest) {
        rttiRequest.addStringPart("xCountry", CheckExtractor.aaq.get(this.aay.country));
    }
}

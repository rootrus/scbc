package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.extraction.DataUnit;
import com.kofax.mobile.sdk._internal.extraction.IDataUnitProcessedListener;
import com.kofax.mobile.sdk._internal.impl.extraction.C7992j;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiExtractor;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.RttiIdExtractor */
public class RttiIdExtractor extends RttiExtractor implements IIdExtractionServer {
    private IdParameters acR;

    @HmlPinActivity
    public RttiIdExtractor(IImageToByteArray iImageToByteArray) {
        super(iImageToByteArray);
    }

    public void setIdParameters(IdParameters idParameters) {
        this.acR = idParameters;
    }

    public void extract(DataUnit dataUnit, IDataUnitProcessedListener iDataUnitProcessedListener) {
        super.extract(new DataUnit(m4729b(dataUnit).getNotNullImages()), iDataUnitProcessedListener);
    }

    /* renamed from: b */
    private DataUnit m4729b(DataUnit dataUnit) {
        String str = this.acR.barcode;
        return (str == null || str.length() == 0) ^ true ? m4730c(dataUnit) : dataUnit;
    }

    /* renamed from: c */
    private static DataUnit m4730c(DataUnit dataUnit) {
        return new DataUnit(dataUnit.getNotNullImages()[0]);
    }

    public void updateRttiRequest(RttiExtractor.RttiRequest rttiRequest) {
        rttiRequest.addStringPart(Name.LABEL, "ID");
        rttiRequest.addStringPart("IDType", "ID");
        rttiRequest.addStringPart("xExtractFaceImage", "true");
        rttiRequest.addStringPart("xExtractSignatureImage", "true");
        rttiRequest.addStringPart("xBarcode", C7992j.m3945al(this.acR.barcode));
        rttiRequest.addStringPart("xRegion", IdExtractor.acB.get(this.acR.state.region));
        rttiRequest.addStringPart("xImageResize", "ID-1");
        String str = IdExtractor.acC.get(this.acR.state);
        if (str != null) {
            rttiRequest.addStringPart("xState", str);
        }
    }
}

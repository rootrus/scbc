package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.extraction.DataUnit;
import com.kofax.mobile.sdk._internal.extraction.IDataUnitProcessedListener;
import com.kofax.mobile.sdk._internal.impl.extraction.C7992j;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C8005e;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.IKtaSessionIdProviderFactory;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd.JobService;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.KtaIdExtractor */
public class KtaIdExtractor extends C8005e implements IIdExtractionServer {
    private static final String REGION = "Region";
    private static final String STATE = "State";
    private static final String acT = "IDType";
    private static final String acU = "Barcode";
    private IdParameters acR;

    public String getProcessName() {
        return "KofaxMobileIDCaptureSync";
    }

    @HmlPinActivity
    public KtaIdExtractor(IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory, IImageToByteArray iImageToByteArray) {
        super(iKtaSessionIdProviderFactory, iImageToByteArray);
    }

    public void setIdParameters(IdParameters idParameters) {
        this.acR = idParameters;
    }

    public void extract(DataUnit dataUnit, IDataUnitProcessedListener iDataUnitProcessedListener) {
        super.extract(new DataUnit(m4727b(dataUnit).getNotNullImages()), iDataUnitProcessedListener);
    }

    /* renamed from: b */
    private DataUnit m4727b(DataUnit dataUnit) {
        String str = this.acR.barcode;
        return (str == null || str.length() == 0) ^ true ? m4728c(dataUnit) : dataUnit;
    }

    /* renamed from: c */
    private static DataUnit m4728c(DataUnit dataUnit) {
        return new DataUnit(dataUnit.getNotNullImages()[0]);
    }

    public void updateKTARequest(JobService jobService) {
        jobService.updateJsonDocuments(acT, "ID");
        jobService.updateJsonDocuments(acU, C7992j.m3945al(this.acR.barcode));
        jobService.updateJsonDocuments(REGION, IdExtractor.acB.get(this.acR.state.region));
        String str = IdExtractor.acC.get(this.acR.state);
        if (str != null) {
            jobService.updateJsonDocuments(STATE, str);
        }
    }
}

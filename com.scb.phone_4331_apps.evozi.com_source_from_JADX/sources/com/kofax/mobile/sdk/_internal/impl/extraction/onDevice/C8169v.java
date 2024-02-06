package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.extract.p018id.AggregateException;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractionListener;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractionResult;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import com.kofax.mobile.sdk.extract.p018id.IdExtractionParameters;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.v */
public abstract class C8169v implements IIdExtractor {

    /* renamed from: Ly */
    private final IIdExtractor f4201Ly;

    public C8169v(IIdExtractor iIdExtractor) {
        this.f4201Ly = iIdExtractor;
    }

    public void extractFields(final IdExtractionParameters idExtractionParameters) {
        this.f4201Ly.extractFields(new IdExtractionParameters(idExtractionParameters.getProjectName(), idExtractionParameters.getIdType(), idExtractionParameters.getFrontImage(), idExtractionParameters.getFrontBarcodes(), idExtractionParameters.getBackImage(), idExtractionParameters.getBackBarcodes(), idExtractionParameters.isProcessed(), idExtractionParameters.getExtractFaceImage(), idExtractionParameters.getExtractSignatureImage(), new IIdExtractionListener() {
            public void onExtractionComplete(IIdExtractionResult iIdExtractionResult, AggregateException aggregateException) {
                C8169v.this.mo54431a(idExtractionParameters, iIdExtractionResult, aggregateException);
            }
        }, idExtractionParameters.getImageProcessingListener()));
    }

    public void cancel() {
        this.f4201Ly.cancel();
    }

    /* renamed from: a */
    public void mo54431a(IdExtractionParameters idExtractionParameters, IIdExtractionResult iIdExtractionResult, AggregateException aggregateException) {
        idExtractionParameters.getExtractionListener().onExtractionComplete(iIdExtractionResult, aggregateException);
    }
}

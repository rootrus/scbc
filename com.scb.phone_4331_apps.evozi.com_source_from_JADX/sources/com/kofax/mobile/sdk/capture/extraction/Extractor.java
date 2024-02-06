package com.kofax.mobile.sdk.capture.extraction;

import android.text.TextUtils;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.extraction.DataUnit;
import com.kofax.mobile.sdk._internal.extraction.IDataUnitProcessedListener;
import com.kofax.mobile.sdk._internal.extraction.IDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import java.io.Serializable;
import java.lang.ref.WeakReference;

public abstract class Extractor<T extends Serializable> implements IDataUnitProcessedListener {
    private ExtractionParameters _parameters;
    private IDeserializer<T> ach;
    private IExceptionResponseDeserializer aci;
    private WeakReference<IExtractorListener> acj;
    private IExtractionServer ack;

    /* access modifiers changed from: protected */
    public abstract ExtractorResponse<T> createResponse(T t, ExceptionResponse exceptionResponse);

    /* access modifiers changed from: protected */
    public abstract String getDefaultServerUrl(ExtractionParameters.ExtractionType extractionType);

    public void setExtractionServer(IExtractionServer iExtractionServer) {
        if (iExtractionServer != null) {
            this.ack = iExtractionServer;
            return;
        }
        throw new IllegalArgumentException("extractionServer cannot be null");
    }

    public void setResultDeserializer(IDeserializer<T> iDeserializer) {
        if (iDeserializer != null) {
            this.ach = iDeserializer;
            return;
        }
        throw new IllegalArgumentException("checkDeserializer cannot be null");
    }

    public void setExceptionResponseDeserializer(IExceptionResponseDeserializer iExceptionResponseDeserializer) {
        if (iExceptionResponseDeserializer != null) {
            this.aci = iExceptionResponseDeserializer;
            return;
        }
        throw new IllegalArgumentException("exceptionResponseDeserializer cannot be null");
    }

    public void setParameters(ExtractionParameters extractionParameters) {
        if (extractionParameters != null) {
            this._parameters = extractionParameters;
            if (TextUtils.isEmpty(extractionParameters.serverUrl)) {
                ExtractionParameters extractionParameters2 = this._parameters;
                extractionParameters2.serverUrl = getDefaultServerUrl(extractionParameters2.getExtractionType());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("parameters cannot be null");
    }

    public void setExtractorListener(IExtractorListener iExtractorListener) {
        if (iExtractorListener != null) {
            this.acj = new WeakReference<>(iExtractorListener);
            return;
        }
        throw new IllegalArgumentException("listener cannot be null");
    }

    public void setCertificateValidatorListener(CertificateValidatorListener certificateValidatorListener) {
        this.ack.setCertificateValidatorListener(certificateValidatorListener);
    }

    public void extract(Image... imageArr) {
        this.ack.extract(new DataUnit(imageArr), this);
    }

    public void onExtractionComplete(DataUnit dataUnit) {
        ExceptionResponse exceptionResponse;
        IExtractorListener iExtractorListener = this.acj.get();
        if (iExtractorListener != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Extraction results success: ");
            sb.append(dataUnit.success);
            C0767k.m1791C(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Extraction response: ");
            sb2.append(dataUnit.returnData.response);
            C0767k.m1791C(sb2.toString());
            Serializable serializable = null;
            if (dataUnit.success) {
                serializable = (Serializable) this.ach.deserialize(dataUnit.returnData.response);
                exceptionResponse = null;
            } else {
                try {
                    exceptionResponse = (ExceptionResponse) this.aci.deserialize(dataUnit.returnData.response);
                } catch (RuntimeException e) {
                    exceptionResponse = new ExceptionResponseImpl(e);
                }
            }
            iExtractorListener.onExtractionComplete(createResponse(serializable, exceptionResponse));
        }
    }
}

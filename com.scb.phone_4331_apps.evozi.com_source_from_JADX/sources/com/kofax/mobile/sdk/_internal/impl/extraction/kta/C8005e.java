package com.kofax.mobile.sdk._internal.impl.extraction.kta;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.extraction.C7899a;
import com.kofax.mobile.sdk._internal.extraction.C7905h;
import com.kofax.mobile.sdk._internal.extraction.DataUnit;
import com.kofax.mobile.sdk._internal.impl.extraction.C7982a;
import com.kofax.mobile.sdk._internal.impl.extraction.C7992j;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd.JobService;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import org.bouncycastle.asn1.x509.DisplayText;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.e */
public abstract class C8005e extends C7982a {

    /* renamed from: JG */
    private final IKtaSessionIdProviderFactory f3795JG;

    /* renamed from: JH */
    private final IImageToByteArray f3796JH;

    /* renamed from: JI */
    private CertificateValidatorListener f3797JI;
    protected ExtractionParameters _parameters;

    public abstract String getProcessName();

    /* access modifiers changed from: protected */
    public void updateKTARequest(JobService jobService) {
    }

    public C8005e(IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory, IImageToByteArray iImageToByteArray) {
        this.f3795JG = iKtaSessionIdProviderFactory;
        if (iImageToByteArray != null) {
            this.f3796JH = iImageToByteArray;
            return;
        }
        throw new IllegalArgumentException("converter may not be null");
    }

    public void extractInBackground(DataUnit dataUnit) {
        C7996b create = this.f3795JG.create(this._parameters, this.f3797JI);
        try {
            String a = m3981a(this._parameters.serverUrl, create.mo54387mz(), dataUnit.images);
            dataUnit.success = true;
            dataUnit.returnData = new C7905h(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, a);
        } catch (C7899a e) {
            dataUnit.success = false;
            dataUnit.returnData = C8007g.m3985a(e);
        } catch (Exception e2) {
            m3982a(dataUnit, e2);
        }
    }

    /* renamed from: a */
    private static void m3982a(DataUnit dataUnit, Exception exc) {
        dataUnit.success = false;
        dataUnit.returnData = C8007g.m3987d(exc);
    }

    /* renamed from: a */
    private String m3981a(String str, String str2, Image... imageArr) throws Exception {
        if (imageArr.length != 0) {
            JobService jobService = new JobService(str, this.f3797JI);
            jobService.createJobWithJsonDocuments(str2, getProcessName(), C7992j.m3942C(imageArr[0]), this.f3796JH.convert(imageArr[0]), (imageArr.length <= 1 || imageArr[1] == null) ? null : this.f3796JH.convert(imageArr[1]));
            updateKTARequest(jobService);
            return jobService.progressJsonDocuments();
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_ED_IMAGELEAK);
    }

    public void setCertificateValidatorListener(CertificateValidatorListener certificateValidatorListener) {
        this.f3797JI = certificateValidatorListener;
    }

    public void setParameters(ExtractionParameters extractionParameters) {
        this._parameters = extractionParameters;
    }
}

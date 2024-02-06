package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.PassportDetectionResult;
import com.kofax.kmc.ken.engines.data.PassportDetectionSettings;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import p040o.HmlPinActivity;

public class PassportDetector implements IPassportDetector {

    /* renamed from: bQ */
    private final IPassportDetector f3345bQ;

    @HmlPinActivity
    public PassportDetector() {
        this((IPassportDetector) null);
    }

    PassportDetector(IPassportDetector iPassportDetector) {
        if (Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_PROCESSING) || Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_CAPTURE)) {
            this.f3345bQ = iPassportDetector == null ? new IsgPassportDetector() : iPassportDetector;
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_IMAGE_PROCESSING);
    }

    public PassportDetectionResult detect(PassportDetectionSettings passportDetectionSettings, Bitmap bitmap) {
        return this.f3345bQ.detect(passportDetectionSettings, bitmap);
    }

    public PassportDetectionResult detect(PassportDetectionSettings passportDetectionSettings, byte[] bArr, int i, int i2) {
        return this.f3345bQ.detect(passportDetectionSettings, bArr, i, i2);
    }

    public void destroy() {
        this.f3345bQ.destroy();
    }
}

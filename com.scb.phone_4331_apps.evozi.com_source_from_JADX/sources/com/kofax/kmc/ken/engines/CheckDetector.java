package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.CheckDetectionResult;
import com.kofax.kmc.ken.engines.data.CheckDetectionSettings;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import p040o.HmlPinActivity;

public class CheckDetector implements ICheckDetector {

    /* renamed from: z */
    private final ICheckDetector f3303z;

    @HmlPinActivity
    public CheckDetector() {
        this((ICheckDetector) null, (ICheckDetector) null);
    }

    CheckDetector(ICheckDetector iCheckDetector, ICheckDetector iCheckDetector2) {
        if (Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_PROCESSING) || Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_CAPTURE)) {
            this.f3303z = iCheckDetector == null ? new C7869h() : iCheckDetector;
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_IMAGE_PROCESSING);
    }

    public final CheckDetectionResult detect(CheckDetectionSettings checkDetectionSettings, Bitmap bitmap) {
        return this.f3303z.detect(checkDetectionSettings, bitmap);
    }

    public CheckDetectionResult detect(CheckDetectionSettings checkDetectionSettings, byte[] bArr, int i, int i2) {
        return this.f3303z.detect(checkDetectionSettings, bArr, i, i2);
    }

    public void destroy() {
        this.f3303z.destroy();
    }
}

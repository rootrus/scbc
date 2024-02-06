package com.kofax.kmc.ken.engines;

import android.content.Context;
import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import p040o.HmlPinActivity;

public class DocumentDetector implements IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> {

    /* renamed from: V */
    private final Context f61V;
    protected IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> _detector;

    @HmlPinActivity
    public DocumentDetector(Context context) {
        checkLicense();
        if (context != null) {
            this.f61V = context;
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_BAD_APPLICATION_CONTEXT);
    }

    private void checkLicense() {
        if (!Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_PROCESSING) && !Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_CAPTURE)) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_IMAGE_PROCESSING);
        }
    }

    /* renamed from: com.kofax.kmc.ken.engines.DocumentDetector$1 */
    static /* synthetic */ class C04251 {

        /* renamed from: W */
        static final /* synthetic */ int[] f62W;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.kofax.kmc.ken.engines.data.DocumentDetectionSettings$DocumentEdgeDetection[] r0 = com.kofax.kmc.ken.engines.data.DocumentDetectionSettings.DocumentEdgeDetection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f62W = r0
                com.kofax.kmc.ken.engines.data.DocumentDetectionSettings$DocumentEdgeDetection r1 = com.kofax.kmc.ken.engines.data.DocumentDetectionSettings.DocumentEdgeDetection.GPU_BASED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f62W     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.ken.engines.data.DocumentDetectionSettings$DocumentEdgeDetection r1 = com.kofax.kmc.ken.engines.data.DocumentDetectionSettings.DocumentEdgeDetection.ISG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.DocumentDetector.C04251.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m109a(DocumentDetectionSettings documentDetectionSettings) {
        if (this._detector == null) {
            int i = C04251.f62W[documentDetectionSettings.getEdgeDetection().ordinal()];
            if (i == 1) {
                this._detector = Injector.getInjector(this.f61V).getGpuDocumentDetector();
            } else if (i == 2) {
                this._detector = Injector.getInjector(this.f61V).getIsgDocumentDetector();
            }
        }
    }

    public DocumentDetectionResult detect(DocumentDetectionSettings documentDetectionSettings, Bitmap bitmap) {
        m109a(documentDetectionSettings);
        return this._detector.detect(documentDetectionSettings, bitmap);
    }

    public DocumentDetectionResult detect(DocumentDetectionSettings documentDetectionSettings, byte[] bArr, int i, int i2) {
        m109a(documentDetectionSettings);
        return this._detector.detect(documentDetectionSettings, bArr, i, i2);
    }

    public void destroy() {
        IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> iDocumentDetector = this._detector;
        if (iDocumentDetector != null) {
            iDocumentDetector.destroy();
        }
    }
}

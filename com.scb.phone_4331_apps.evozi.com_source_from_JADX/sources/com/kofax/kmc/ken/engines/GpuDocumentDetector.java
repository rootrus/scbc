package com.kofax.kmc.ken.engines;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.kmc.ken.engines.gpu.BitmapGPUFrame;
import com.kofax.kmc.ken.engines.gpu.CaptureGuidance;
import com.kofax.kmc.ken.engines.gpu.DataGPUFrame;
import com.kofax.kmc.ken.engines.gpu.GPUFrame;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyEdgeDetection;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;
import com.kofax.kmc.kut.utilities.RectUtil;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.impl.detection.Frame;
import java.util.Arrays;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class GpuDocumentDetector implements IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> {

    /* renamed from: T */
    private final IBoundingRectCalculator f76T;

    /* renamed from: ae */
    private final IOrientationGuidanceCalculator f77ae;

    /* renamed from: af */
    private final GPUStrategyEdgeDetection f78af;

    @HmlPinActivity
    public GpuDocumentDetector(Context context, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "COMBINED_STRATEGY") GPUStrategyEdgeDetection gPUStrategyEdgeDetection) {
        C0433a aVar = new C0433a();
        this.f76T = aVar;
        this.f77ae = new C0466l(aVar);
        if (context != null) {
            this.f78af = gPUStrategyEdgeDetection;
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_BAD_APPLICATION_CONTEXT);
    }

    public void destroy() {
        this.f78af.destroy();
    }

    public DocumentDetectionResult detect(DocumentDetectionSettings documentDetectionSettings, Bitmap bitmap) {
        return m115a(documentDetectionSettings, new BitmapGPUFrame(bitmap));
    }

    public DocumentDetectionResult detect(DocumentDetectionSettings documentDetectionSettings, byte[] bArr, int i, int i2) {
        return m115a(documentDetectionSettings, new DataGPUFrame(bArr, 17, i, i2));
    }

    /* renamed from: a */
    private C0435c m115a(DocumentDetectionSettings documentDetectionSettings, GPUFrame gPUFrame) {
        gPUFrame.setMaxTextureSize(OpenGLESContextManager.getMaxTextureSize());
        float[] passTo = gPUFrame.passTo(documentDetectionSettings, this.f78af);
        if (passTo != null) {
            return m116a(documentDetectionSettings, passTo, gPUFrame);
        }
        return null;
    }

    /* renamed from: a */
    private C0435c m116a(DocumentDetectionSettings documentDetectionSettings, float[] fArr, Frame frame) {
        float[] fArr2 = fArr;
        Rect createTargetRect = RectUtil.createTargetRect(documentDetectionSettings.getTargetFramePaddingPercent(), documentDetectionSettings.getTargetFrameAspectRatio(), documentDetectionSettings.getCenterPoint(), frame.getWidth(), frame.getHeight());
        CaptureGuidance captureGuidance = new CaptureGuidance(fArr2);
        return new C0435c(createTargetRect, Arrays.asList(new Point[]{new Point((int) fArr2[0], (int) fArr2[1]), new Point((int) fArr2[2], (int) fArr2[3]), new Point((int) fArr2[4], (int) fArr2[5]), new Point((int) fArr2[6], (int) fArr2[7])}), frame, new C0442f(captureGuidance), documentDetectionSettings, this.f76T, this.f77ae);
    }

    public Bitmap getBitmap(int i) {
        return this.f78af.getBitmap(i);
    }
}

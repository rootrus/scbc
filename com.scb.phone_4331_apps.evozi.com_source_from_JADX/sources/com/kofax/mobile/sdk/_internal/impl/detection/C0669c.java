package com.kofax.mobile.sdk._internal.impl.detection;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.kofax.kmc.ken.engines.IDocumentDetector;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlReviewDocumentActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.detection.c */
public class C0669c {

    /* renamed from: Hm */
    private static final double f1590Hm = 0.03d;

    /* renamed from: Hn */
    private final DocumentDetectionSettings f1591Hn = new DocumentDetectionSettings();

    /* renamed from: nr */
    private final HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> f1592nr;

    /* renamed from: com.kofax.mobile.sdk._internal.impl.detection.c$a */
    public static class C0670a {

        /* renamed from: Ho */
        public final Rect f1593Ho;
        public final Bitmap bitmap;

        C0670a(Bitmap bitmap2, Rect rect) {
            this.bitmap = bitmap2;
            this.f1593Ho = rect;
        }
    }

    @HmlPinActivity
    C0669c(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "FORCED_DOCUMENT") HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> hmlReviewDocumentActivity) {
        this.f1592nr = hmlReviewDocumentActivity;
    }

    /* renamed from: i */
    public C0670a mo11599i(Bitmap bitmap) {
        IDocumentDetector iDocumentDetector = this.f1592nr.get();
        DocumentDetectionResult documentDetectionResult = (DocumentDetectionResult) iDocumentDetector.detect(this.f1591Hn, bitmap);
        iDocumentDetector.destroy();
        if (documentDetectionResult != null) {
            return m1456a(bitmap, documentDetectionResult.getBounds());
        }
        return new C0670a(bitmap, (Rect) null);
    }

    /* renamed from: a */
    private static C0670a m1456a(Bitmap bitmap, BoundingTetragon boundingTetragon) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int min = Math.min(boundingTetragon.getTopLeft().x, boundingTetragon.getBottomLeft().x);
        int max = Math.max(boundingTetragon.getTopRight().x, boundingTetragon.getBottomRight().x);
        int min2 = Math.min(boundingTetragon.getTopLeft().y, boundingTetragon.getTopRight().y);
        int max2 = Math.max(boundingTetragon.getBottomLeft().y, boundingTetragon.getBottomRight().y);
        int max3 = Math.max((int) (((double) Math.min(width, height)) * f1590Hm), 50);
        int max4 = Math.max(0, min - max3);
        int max5 = Math.max(0, min2 - max3);
        int min3 = Math.min(width, max + max3) - max4;
        int min4 = Math.min(height, max2 + max3) - max5;
        return new C0670a(Bitmap.createBitmap(bitmap, max4, max5, min3, min4), new Rect(max4, max5, min3 + max4, min4 + max5));
    }
}

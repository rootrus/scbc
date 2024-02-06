package com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.extract.p018id.QuickExtractorSettings;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.g */
public class C8162g {
    private static final String TAG = C8162g.class.getSimpleName();

    /* renamed from: RR */
    private final FaceDetector f4190RR;

    /* renamed from: RS */
    private final QuickExtractorSettings f4191RS;

    public C8162g(Context context, QuickExtractorSettings quickExtractorSettings) {
        this.f4190RR = new FaceDetector.Builder(context).setTrackingEnabled(false).setMode(0).setLandmarkType(0).setClassificationType(0).build();
        this.f4191RS = quickExtractorSettings;
    }

    public void destroy() {
        this.f4190RR.release();
    }

    /* renamed from: a */
    public C8161f mo54567a(C8160e eVar) {
        if (!this.f4190RR.isOperational()) {
            C0767k.m1801b(TAG, "Not operational");
            return null;
        }
        Face b = m4391b(eVar.mo54559qe());
        if (b == null) {
            return null;
        }
        return m4390a(eVar, b);
    }

    /* renamed from: b */
    private Face m4391b(Frame frame) {
        SparseArray detect = this.f4190RR.detect(frame);
        if (detect.size() > 0) {
            return (Face) detect.valueAt(0);
        }
        return null;
    }

    /* renamed from: a */
    private C8161f m4390a(C8160e eVar, Face face) {
        Bitmap qf = eVar.mo54560qf();
        RectF a = m4389a(face);
        if (!m4392k(qf).contains(a)) {
            C0767k.m1801b(TAG, "Out of frame");
            return null;
        }
        Rect rect = new Rect();
        a.round(rect);
        return new C8161f(Bitmap.createBitmap(qf, rect.left, rect.top, rect.width(), rect.height()), qf);
    }

    /* renamed from: a */
    private RectF m4389a(Face face) {
        PointF position = face.getPosition();
        float f = position.x;
        float f2 = position.y;
        float width = face.getWidth();
        float faceLeftPadding = this.f4191RS.getFaceLeftPadding();
        float width2 = face.getWidth();
        float faceRightPadding = this.f4191RS.getFaceRightPadding();
        return new RectF(f - ((width * faceLeftPadding) * 0.01f), f2 - ((face.getHeight() * this.f4191RS.getFaceTopPadding()) * 0.01f), f + face.getWidth() + (width2 * faceRightPadding * 0.01f), f2 + face.getHeight() + (face.getHeight() * this.f4191RS.getFaceBottomPadding() * 0.01f));
    }

    /* renamed from: k */
    private static RectF m4392k(Bitmap bitmap) {
        return new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) bitmap.getWidth(), (float) bitmap.getHeight());
    }
}

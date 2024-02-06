package com.kofax.mobile.sdk._internal.impl.detection;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.SparseArray;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.kofax.kmc.ken.engines.data.SelfieDetectionSettings;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.detection.IFaceDetectionResult;
import com.kofax.mobile.sdk._internal.detection.IFaceDetector;
import java.nio.ByteBuffer;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.detection.e */
public class C7944e implements IFaceDetector {
    private static final String TAG = "FaceDetection";

    /* renamed from: Hp */
    private FaceDetector f3686Hp;
    private Context _ctx;

    @HmlPinActivity
    public C7944e(Context context) {
        this._ctx = context;
    }

    public IFaceDetectionResult detect(SelfieDetectionSettings selfieDetectionSettings, Bitmap bitmap, int i) {
        return m3912a(selfieDetectionSettings, new Frame.Builder().setBitmap(bitmap).setRotation(i / 90).build());
    }

    public IFaceDetectionResult detect(SelfieDetectionSettings selfieDetectionSettings, byte[] bArr, int i, int i2, int i3) {
        return m3912a(selfieDetectionSettings, new Frame.Builder().setImageData(ByteBuffer.wrap(bArr), i, i2, 17).setRotation(i3 / 90).build());
    }

    /* renamed from: a */
    private IFaceDetectionResult m3912a(SelfieDetectionSettings selfieDetectionSettings, Frame frame) {
        this.f3686Hp = m3913f(selfieDetectionSettings.getMinimumFaceSize());
        return m3911a(frame);
    }

    public boolean isOperational() {
        FaceDetector faceDetector = this.f3686Hp;
        if (faceDetector != null) {
            return faceDetector.isOperational();
        }
        return false;
    }

    public void destroy() {
        FaceDetector faceDetector = this.f3686Hp;
        if (faceDetector != null) {
            faceDetector.release();
            this.f3686Hp = null;
        }
    }

    /* renamed from: f */
    private FaceDetector m3913f(double d) {
        if (this.f3686Hp == null) {
            this.f3686Hp = new FaceDetector.Builder(this._ctx).setClassificationType(1).setTrackingEnabled(false).setMode(1).setProminentFaceOnly(true).setMinFaceSize((float) d).build();
        }
        return this.f3686Hp;
    }

    /* renamed from: a */
    private IFaceDetectionResult m3911a(Frame frame) {
        try {
            SparseArray detect = this.f3686Hp != null ? this.f3686Hp.detect(frame) : null;
            if (detect != null && detect.size() == 1) {
                Face face = (Face) detect.valueAt(0);
                return new C7945a(face.getEulerY(), face.getEulerZ(), face.getHeight(), face.getIsLeftEyeOpenProbability(), face.getIsRightEyeOpenProbability(), face.getIsSmilingProbability(), face.getPosition(), face.getWidth());
            }
        } catch (Throwable th) {
            C0767k.m1822e(TAG, th);
        }
        return null;
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.detection.e$a */
    static class C7945a implements IFaceDetectionResult {

        /* renamed from: Hq */
        float f3687Hq;

        /* renamed from: Hr */
        float f3688Hr;

        /* renamed from: Hs */
        float f3689Hs;

        /* renamed from: Ht */
        float f3690Ht;

        /* renamed from: Hu */
        float f3691Hu;

        /* renamed from: Hv */
        float f3692Hv;

        /* renamed from: Hw */
        PointF f3693Hw;

        /* renamed from: Hx */
        float f3694Hx;

        public C7945a(float f, float f2, float f3, float f4, float f5, float f6, PointF pointF, float f7) {
            this.f3687Hq = f;
            this.f3688Hr = f2;
            this.f3689Hs = f3;
            this.f3690Ht = f4;
            this.f3691Hu = f5;
            this.f3692Hv = f6;
            this.f3693Hw = pointF;
            this.f3694Hx = f7;
        }

        public float getEulerY() {
            return this.f3687Hq;
        }

        public float getEulerZ() {
            return this.f3688Hr;
        }

        public float getHeight() {
            return this.f3689Hs;
        }

        public float getIsLeftEyeOpenProbability() {
            return this.f3690Ht;
        }

        public float getIsRightEyeOpenProbability() {
            return this.f3691Hu;
        }

        public float getIsSmilingProbability() {
            return this.f3692Hv;
        }

        public PointF getPosition() {
            return this.f3693Hw;
        }

        public float getWidth() {
            return this.f3694Hx;
        }
    }
}

package com.pingan.p031ai.face.manager;

import android.app.Activity;
import android.content.Context;
import com.pingan.p031ai.C1022d;
import com.pingan.p031ai.face.control.LiveFaceConfig;
import com.pingan.p031ai.face.manager.impl.OnPaFaceDetectorListener;
import com.pingan.p031ai.face.utils.PaFaceLogger;
import com.pingan.p031ai.face.view.AuroraView;
import java.util.List;

/* renamed from: com.pingan.ai.face.manager.PaFaceDetectorManager */
public class PaFaceDetectorManager {
    public boolean isHasStart;
    public boolean isInitSuccess;
    public OnPaFaceDetectorListener listener;
    public C1022d mControl;

    /* renamed from: com.pingan.ai.face.manager.PaFaceDetectorManager$Holder */
    public static class Holder {
        public static final PaFaceDetectorManager INSTANCE = new PaFaceDetectorManager();
    }

    public PaFaceDetectorManager() {
        this.isHasStart = false;
        this.isInitSuccess = false;
        this.mControl = new C1022d();
    }

    public static native PaFaceDetectorManager getInstance();

    public native void acceptPreviewFrame(int i, byte[] bArr, int i2, int i3, int i4, int i5);

    public native boolean copyModel(Context context, String str);

    public native void detectPreviewFrame(int i, byte[] bArr, int i2, int i3, int i4, int i5);

    public native String getSDKName();

    public native String getVersion();

    public native String getVersionTime();

    public boolean initFaceDetector(Context context) {
        return initFaceDetector(context, new LiveFaceConfig.LiveFaceConfigBuilder().build());
    }

    public boolean initFaceDetector(Context context, LiveFaceConfig liveFaceConfig) {
        if (context == null) {
            PaFaceLogger.error("PaFace initDetector", "context can't be null.");
            this.isInitSuccess = false;
            return false;
        }
        this.isHasStart = false;
        if (this.mControl == null) {
            this.mControl = new C1022d();
        }
        boolean a = this.mControl.mo12499a(context, liveFaceConfig);
        this.isInitSuccess = a;
        return a;
    }

    public native void release();

    public native void setAuroraBg(AuroraView auroraView);

    public native void setGravityEnable(boolean z);

    public native void setLiveFaceConfig(LiveFaceConfig liveFaceConfig);

    public native void setLoggerEnable(boolean z);

    public native void setMotions(List<Integer> list);

    public native void setMultiMode(int i);

    public native void setOnFaceDetectorListener(OnPaFaceDetectorListener onPaFaceDetectorListener);

    public native void setScreenBrightnessEnable(Activity activity, boolean z);

    public native void setScreenBrightnessEnable(boolean z);

    public native void startFaceDetect();

    public native void stopFaceDetect();
}

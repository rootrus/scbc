package com.pingan.p031ai.face.manager.impl;

import com.pingan.p031ai.face.entity.PaFaceDetectFrame;
import java.util.List;

/* renamed from: com.pingan.ai.face.manager.impl.OnPaFaceDetectorListener */
public abstract class OnPaFaceDetectorListener implements OnAbsListener {
    public native void onDetectFaceInfo(int i, PaFaceDetectFrame paFaceDetectFrame);

    public native void onDetectFaceInfo(int i, PaFaceDetectFrame paFaceDetectFrame, int i2, int i3);

    public native void onDetectMotionDone(int i);

    public native void onDetectProgress(int i, float f);

    public native void onDetectTips(int i);

    public native void onDetectTips(int i, PaFaceDetectFrame paFaceDetectFrame);

    public native void onInterruptError(int i);

    public native void onInterruptError(int i, List<PaFaceDetectFrame> list);
}

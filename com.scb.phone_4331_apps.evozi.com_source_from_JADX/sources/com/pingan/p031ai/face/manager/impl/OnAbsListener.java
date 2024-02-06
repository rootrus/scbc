package com.pingan.p031ai.face.manager.impl;

import com.pingan.p031ai.face.entity.PaFaceDetectFrame;

/* renamed from: com.pingan.ai.face.manager.impl.OnAbsListener */
public interface OnAbsListener {
    void onDetectComplete(int i, PaFaceDetectFrame[] paFaceDetectFrameArr);

    void onDetectFaceInfo(int i, PaFaceDetectFrame paFaceDetectFrame, int i2, int i3);

    void onDetectMotionDone(int i);

    void onDetectMotionTips(int i);

    void onDetectProgress(int i, float f);
}

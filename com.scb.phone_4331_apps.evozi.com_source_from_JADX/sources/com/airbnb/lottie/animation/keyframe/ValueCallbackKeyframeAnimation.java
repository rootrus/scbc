package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

public class ValueCallbackKeyframeAnimation<K, A> extends BaseKeyframeAnimation<K, A> {
    private final LottieFrameInfo<A> frameInfo;
    private final A valueCallbackValue;

    /* access modifiers changed from: package-private */
    public float getEndProgress() {
        return 1.0f;
    }

    public ValueCallbackKeyframeAnimation(LottieValueCallback<A> lottieValueCallback) {
        this(lottieValueCallback, (Object) null);
    }

    public ValueCallbackKeyframeAnimation(LottieValueCallback<A> lottieValueCallback, A a) {
        super(Collections.emptyList());
        this.frameInfo = new LottieFrameInfo<>();
        setValueCallback(lottieValueCallback);
        this.valueCallbackValue = a;
    }

    public void notifyListeners() {
        if (this.valueCallback != null) {
            super.notifyListeners();
        }
    }

    public A getValue() {
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        A a = this.valueCallbackValue;
        return lottieValueCallback.getValueInternal(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, a, a, getProgress(), getProgress(), getProgress());
    }

    /* access modifiers changed from: package-private */
    public A getValue(Keyframe<K> keyframe, float f) {
        return getValue();
    }
}

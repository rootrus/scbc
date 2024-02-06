package com.airbnb.lottie.utils;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class MeanCalculator {

    /* renamed from: n */
    private int f41n;
    private float sum;

    public void add(float f) {
        float f2 = this.sum + f;
        this.sum = f2;
        int i = this.f41n + 1;
        this.f41n = i;
        if (i == Integer.MAX_VALUE) {
            this.sum = f2 / 2.0f;
            this.f41n = i / 2;
        }
    }

    public float getMean() {
        int i = this.f41n;
        if (i == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return this.sum / ((float) i);
    }
}

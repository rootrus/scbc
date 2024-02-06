package com.airbnb.lottie.utils;

public class GammaEvaluator {
    private static float OECF_sRGB(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float EOCF_sRGB(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    public static int evaluate(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((float) (i >>> 24)) / 255.0f;
        float EOCF_sRGB = EOCF_sRGB(((float) ((i >> 16) & 255)) / 255.0f);
        float EOCF_sRGB2 = EOCF_sRGB(((float) ((i >> 8) & 255)) / 255.0f);
        float EOCF_sRGB3 = EOCF_sRGB(((float) (i & 255)) / 255.0f);
        float EOCF_sRGB4 = EOCF_sRGB(((float) ((i2 >> 16) & 255)) / 255.0f);
        float EOCF_sRGB5 = EOCF_sRGB(((float) ((i2 >> 8) & 255)) / 255.0f);
        float EOCF_sRGB6 = EOCF_sRGB(((float) (i2 & 255)) / 255.0f);
        float OECF_sRGB = OECF_sRGB(EOCF_sRGB + ((EOCF_sRGB4 - EOCF_sRGB) * f));
        float OECF_sRGB2 = OECF_sRGB(EOCF_sRGB2 + ((EOCF_sRGB5 - EOCF_sRGB2) * f));
        float OECF_sRGB3 = OECF_sRGB(EOCF_sRGB3 + ((EOCF_sRGB6 - EOCF_sRGB3) * f));
        return (Math.round((f2 + (((((float) (i2 >>> 24)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(OECF_sRGB * 255.0f) << 16) | (Math.round(OECF_sRGB2 * 255.0f) << 8) | Math.round(OECF_sRGB3 * 255.0f);
    }
}

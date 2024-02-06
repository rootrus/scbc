package com.pingan.p031ai;

import java.util.List;

/* renamed from: com.pingan.ai.u */
public class C8679u {
    /* renamed from: a */
    public static float m5674a(float f, float f2, float f3, float f4) {
        float abs = Math.abs(f - f3);
        float abs2 = Math.abs(f2 - f4);
        return (float) Math.sqrt((double) ((abs * abs) + (abs2 * abs2)));
    }

    /* renamed from: b */
    public static float m5676b(List<Float> list) {
        float f = 100000.0f;
        for (Float floatValue : list) {
            float floatValue2 = floatValue.floatValue();
            if (floatValue2 < f) {
                f = floatValue2;
            }
        }
        return f;
    }

    /* renamed from: a */
    public static float m5675a(List<Float> list) {
        float f = -100000.0f;
        for (Float floatValue : list) {
            float floatValue2 = floatValue.floatValue();
            if (floatValue2 > f) {
                f = floatValue2;
            }
        }
        return f;
    }
}

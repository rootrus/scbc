package com.pingan.p031ai;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: com.pingan.ai.z */
public class C1036z {
    /* renamed from: a */
    public static void m2782a(Activity activity, float f) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f;
        window.setAttributes(attributes);
    }
}

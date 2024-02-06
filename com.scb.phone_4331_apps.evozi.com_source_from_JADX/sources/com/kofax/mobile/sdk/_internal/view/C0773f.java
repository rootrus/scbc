package com.kofax.mobile.sdk._internal.view;

import android.graphics.Rect;
import android.view.View;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.view.f */
public interface C0773f {
    View getView();

    void setBoundsData(BoundingTetragon boundingTetragon, int i, int i2);

    void setVisible(boolean z);

    void showDebugData(String... strArr);

    void showFocusAreas(List<Rect> list, int i, int i2, boolean z);

    void showIndicators(boolean z, String str, boolean z2, String str2);

    void showRect(Rect rect);
}

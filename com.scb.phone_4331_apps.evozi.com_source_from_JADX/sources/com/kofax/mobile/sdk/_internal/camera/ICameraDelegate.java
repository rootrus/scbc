package com.kofax.mobile.sdk._internal.camera;

import android.graphics.Rect;
import java.util.List;

public interface ICameraDelegate {
    void forceTakePicture(boolean z);

    void onDetachFromWindow();

    void onFocusAreasRequest(List<Rect> list, int i, int i2);

    void onPictureTaken();
}

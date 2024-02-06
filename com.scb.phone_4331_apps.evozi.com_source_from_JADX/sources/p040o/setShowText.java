package p040o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* renamed from: o.setShowText */
public interface setShowText {
    ColorStateList getSupportBackgroundTintList();

    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(ColorStateList colorStateList);

    void setSupportBackgroundTintMode(PorterDuff.Mode mode);
}

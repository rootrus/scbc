package com.scb.phone.view.custom;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.NumberPicker;
import com.scb.phone.R;
import java.lang.reflect.Field;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onCheckBoxClick;
import p040o.setLastBaselineToBottomHeight;

public class ColorChangeableNumberPicker extends NumberPicker {
    public ColorChangeableNumberPicker(Context context) {
        super(context);
    }

    public ColorChangeableNumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDividerColor(context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.ColorChangeableNumberPicker, 0, 0).getColor(0, setLastBaselineToBottomHeight.read(context, R.color.f66182131099773)));
    }

    public ColorChangeableNumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setDividerColor(int i) {
        try {
            Field declaredField = NumberPicker.class.getDeclaredField("mSelectionDivider");
            declaredField.setAccessible(true);
            Drawable drawable = (Drawable) declaredField.get(this);
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
            drawable.invalidateSelf();
            postInvalidate();
        } catch (Exception e) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver(e.getMessage(), new Object[0]);
        }
    }
}

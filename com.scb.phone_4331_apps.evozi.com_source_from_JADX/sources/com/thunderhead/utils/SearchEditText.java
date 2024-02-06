package com.thunderhead.utils;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.thunderhead.android.infrastructure.p057ui.views.TTFAppCompatEditText;

public final class SearchEditText extends TTFAppCompatEditText {
    private IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    public interface IconCompatParcelizer {
        void read(boolean z);
    }

    public SearchEditText(Context context) {
        super(context);
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read(true);
        }
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        IconCompatParcelizer iconCompatParcelizer;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            iconCompatParcelizer.read(false);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void setOnKeyboardListener(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }
}

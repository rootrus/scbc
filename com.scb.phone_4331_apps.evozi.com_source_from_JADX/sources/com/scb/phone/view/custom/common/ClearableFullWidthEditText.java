package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import com.scb.phone.R;
import p040o.onGetStartedClick;

public final class ClearableFullWidthEditText extends ClearableEditText {
    public ClearableFullWidthEditText(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public ClearableFullWidthEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final int read() {
        return R.layout.f80522131493277;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClearableFullWidthEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ ClearableFullWidthEditText(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

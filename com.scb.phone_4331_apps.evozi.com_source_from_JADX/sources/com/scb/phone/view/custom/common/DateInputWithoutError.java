package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import p040o.onGetStartedClick;

public final class DateInputWithoutError extends DateInputText {
    public DateInputWithoutError(Context context) {
        this(context, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer() {
    }

    private /* synthetic */ DateInputWithoutError(Context context, byte b) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateInputWithoutError(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateInputWithoutError(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void setErrorVisible(boolean z) {
        TextView textView = this.errorText;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "errorText");
        textView.setVisibility(z ? 0 : 8);
    }
}

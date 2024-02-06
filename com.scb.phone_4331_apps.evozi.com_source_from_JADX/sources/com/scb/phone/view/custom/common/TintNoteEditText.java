package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import com.scb.phone.R;
import p040o.setLastBaselineToBottomHeight;

public class TintNoteEditText extends NoteEditText {
    /* access modifiers changed from: protected */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return R.layout.f80742131493299;
    }

    public TintNoteEditText(Context context) {
        super(context);
    }

    public TintNoteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TintNoteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void IconCompatParcelizer() {
        this.mErrorText.setVisibility(8);
        this.mNoteEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle_with_focus_color));
    }

    public final void write() {
        this.mErrorText.setVisibility(0);
        this.mNoteEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
    }
}

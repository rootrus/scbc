package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import com.scb.phone.R;
import p040o.setLastBaselineToBottomHeight;

public class TintInputViewGroup extends CommonInputViewGroup {
    /* access modifiers changed from: protected */
    public final int IconCompatParcelizer() {
        return R.layout.f80732131493298;
    }

    public TintInputViewGroup(Context context) {
        super(context);
    }

    public TintInputViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TintInputViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle_with_focus_color));
        this.mErrorTextView.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.mEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
        this.mErrorTextView.setVisibility(0);
    }
}

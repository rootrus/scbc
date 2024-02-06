package com.scb.phone.view.custom;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import com.scb.phone.R;
import p040o.setLastBaselineToBottomHeight;

public class ScbEditText extends TextInputEditText {
    private write MediaBrowserCompat$CustomActionResultReceiver;

    public interface write {
        boolean MediaBrowserCompat$ItemReceiver(ScbEditText scbEditText, String str);
    }

    public ScbEditText(Context context) {
        super(context);
    }

    public ScbEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScbEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setInvalidInput(boolean z) {
        if (z) {
            setBackgroundDrawable(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
        } else {
            setBackgroundDrawable(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
        }
    }

    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (!(this.MediaBrowserCompat$CustomActionResultReceiver == null || primaryClip == null)) {
                return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this, primaryClip.getItemAt(0).coerceToText(getContext()).toString());
            }
        }
        return super.onTextContextMenuItem(i);
    }

    public void setOnPasteListener(write write2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
    }
}

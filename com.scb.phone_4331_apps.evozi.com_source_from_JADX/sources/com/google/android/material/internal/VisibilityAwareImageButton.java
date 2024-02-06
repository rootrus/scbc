package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class VisibilityAwareImageButton extends ImageButton {
    public int MediaMetadataCompat;

    public VisibilityAwareImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaMetadataCompat = getVisibility();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.MediaMetadataCompat = i;
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.MediaMetadataCompat = i;
    }
}

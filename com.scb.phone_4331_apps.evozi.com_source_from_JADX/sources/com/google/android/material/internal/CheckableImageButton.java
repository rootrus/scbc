package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import p040o.AlertController$RecycleListView;
import p040o.SwitchCompat;
import p040o.setIconifiedByDefault;
import p040o.setTextOn;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] write = {16842912};
    private boolean MediaBrowserCompat$CustomActionResultReceiver;

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SwitchCompat.read((View) this, (setIconifiedByDefault) new setIconifiedByDefault() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(View view, AccessibilityEvent accessibilityEvent) {
                super.MediaBrowserCompat$CustomActionResultReceiver(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            public final void IconCompatParcelizer(View view, setTextOn settexton) {
                super.IconCompatParcelizer(view, settexton);
                settexton.read(true);
                settexton.MediaBrowserCompat$CustomActionResultReceiver(CheckableImageButton.this.isChecked());
            }
        });
    }

    public void setChecked(boolean z) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public boolean isChecked() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void toggle() {
        setChecked(!this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public int[] onCreateDrawableState(int i) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            return mergeDrawableStates(super.onCreateDrawableState(i + write.length), write);
        }
        return super.onCreateDrawableState(i);
    }
}

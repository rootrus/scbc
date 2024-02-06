package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class BubbleSelector_ViewBinding implements Unbinder {
    private BubbleSelector MediaBrowserCompat$ItemReceiver;

    public BubbleSelector_ViewBinding(BubbleSelector bubbleSelector, View view) {
        this.MediaBrowserCompat$ItemReceiver = bubbleSelector;
        bubbleSelector.button = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button, "field 'button'", Button.class);
    }

    public final void read() {
        BubbleSelector bubbleSelector = this.MediaBrowserCompat$ItemReceiver;
        if (bubbleSelector != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            bubbleSelector.button = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.custom.common;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomLimit_ViewBinding implements Unbinder {
    private CustomLimit MediaBrowserCompat$ItemReceiver;

    public CustomLimit_ViewBinding(CustomLimit customLimit, View view) {
        this.MediaBrowserCompat$ItemReceiver = customLimit;
        customLimit.mLimitProgress = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.limit_progress_view, "field 'mLimitProgress'", ViewGroup.class);
        customLimit.remainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'remainingLimit'", TextView.class);
    }

    public final void read() {
        CustomLimit customLimit = this.MediaBrowserCompat$ItemReceiver;
        if (customLimit != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customLimit.mLimitProgress = null;
            customLimit.remainingLimit = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

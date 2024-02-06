package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class SetLimitView_ViewBinding implements Unbinder {
    private SetLimitView MediaBrowserCompat$ItemReceiver;

    public SetLimitView_ViewBinding(SetLimitView setLimitView, View view) {
        this.MediaBrowserCompat$ItemReceiver = setLimitView;
        setLimitView.seekBarLimiter = (AppCompatSeekBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.limiter_seekbar, "field 'seekBarLimiter'", AppCompatSeekBar.class);
        setLimitView.startLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.start_limit, "field 'startLimit'", TextView.class);
        setLimitView.endLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.end_limit, "field 'endLimit'", TextView.class);
    }

    public final void read() {
        SetLimitView setLimitView = this.MediaBrowserCompat$ItemReceiver;
        if (setLimitView != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            setLimitView.seekBarLimiter = null;
            setLimitView.startLimit = null;
            setLimitView.endLimit = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

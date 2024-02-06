package com.scb.phone.view.custom.investment.scbs.open;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class SourceOfFundsItemCustomView_ViewBinding implements Unbinder {
    private SourceOfFundsItemCustomView MediaBrowserCompat$ItemReceiver;

    public SourceOfFundsItemCustomView_ViewBinding(SourceOfFundsItemCustomView sourceOfFundsItemCustomView, View view) {
        this.MediaBrowserCompat$ItemReceiver = sourceOfFundsItemCustomView;
        sourceOfFundsItemCustomView.textView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text, "field 'textView'", TextView.class);
    }

    public final void read() {
        SourceOfFundsItemCustomView sourceOfFundsItemCustomView = this.MediaBrowserCompat$ItemReceiver;
        if (sourceOfFundsItemCustomView != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            sourceOfFundsItemCustomView.textView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.adapter.accountsummary;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ErrorPagerAdapter_ViewBinding implements Unbinder {
    private ErrorPagerAdapter MediaBrowserCompat$CustomActionResultReceiver;

    public ErrorPagerAdapter_ViewBinding(ErrorPagerAdapter errorPagerAdapter, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = errorPagerAdapter;
        errorPagerAdapter.title = (AppCompatTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_title, "field 'title'", AppCompatTextView.class);
        errorPagerAdapter.message = (AppCompatTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_description, "field 'message'", AppCompatTextView.class);
    }

    public final void read() {
        ErrorPagerAdapter errorPagerAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (errorPagerAdapter != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            errorPagerAdapter.title = null;
            errorPagerAdapter.message = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

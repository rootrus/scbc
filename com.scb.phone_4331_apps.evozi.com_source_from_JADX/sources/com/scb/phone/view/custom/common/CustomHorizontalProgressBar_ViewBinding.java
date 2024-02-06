package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomHorizontalProgressBar_ViewBinding implements Unbinder {
    private CustomHorizontalProgressBar MediaBrowserCompat$CustomActionResultReceiver;

    public CustomHorizontalProgressBar_ViewBinding(CustomHorizontalProgressBar customHorizontalProgressBar, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customHorizontalProgressBar;
        customHorizontalProgressBar.mAvailableTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.available_title_text_view, "field 'mAvailableTitleTextView'", TextView.class);
        customHorizontalProgressBar.mAvailableValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.available_value_text_view, "field 'mAvailableValueTextView'", TextView.class);
        customHorizontalProgressBar.mProgressBar = (ProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_horizontal_progress_bar, "field 'mProgressBar'", ProgressBar.class);
        customHorizontalProgressBar.mTotalTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_title_text_view, "field 'mTotalTitleTextView'", TextView.class);
        customHorizontalProgressBar.mTotalValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_value_text_view, "field 'mTotalValueTextView'", TextView.class);
        customHorizontalProgressBar.mUsedTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.used_title_text_view, "field 'mUsedTitleTextView'", TextView.class);
        customHorizontalProgressBar.mUsedValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.used_value_text_view, "field 'mUsedValueTextView'", TextView.class);
        customHorizontalProgressBar.mTotalContainerLinearLayout = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_container_constraint_layout, "field 'mTotalContainerLinearLayout'", ConstraintLayout.class);
    }

    public final void read() {
        CustomHorizontalProgressBar customHorizontalProgressBar = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customHorizontalProgressBar != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customHorizontalProgressBar.mAvailableTitleTextView = null;
            customHorizontalProgressBar.mAvailableValueTextView = null;
            customHorizontalProgressBar.mProgressBar = null;
            customHorizontalProgressBar.mTotalTitleTextView = null;
            customHorizontalProgressBar.mTotalValueTextView = null;
            customHorizontalProgressBar.mUsedTitleTextView = null;
            customHorizontalProgressBar.mUsedValueTextView = null;
            customHorizontalProgressBar.mTotalContainerLinearLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

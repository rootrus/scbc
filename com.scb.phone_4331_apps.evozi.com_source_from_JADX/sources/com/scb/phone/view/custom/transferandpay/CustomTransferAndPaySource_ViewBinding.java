package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import p040o.onStart;

public class CustomTransferAndPaySource_ViewBinding implements Unbinder {
    private CustomTransferAndPaySource MediaBrowserCompat$CustomActionResultReceiver;

    public CustomTransferAndPaySource_ViewBinding(CustomTransferAndPaySource customTransferAndPaySource, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customTransferAndPaySource;
        customTransferAndPaySource.mSourceLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_source, "field 'mSourceLinearLayout'", LinearLayout.class);
        customTransferAndPaySource.mSourceNameTextView = (ImageTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_name_text_view, "field 'mSourceNameTextView'", ImageTextView.class);
        customTransferAndPaySource.mAccountNumberTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_account_text_view, "field 'mAccountNumberTextView'", TextView.class);
        customTransferAndPaySource.mAccountBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_account_balance_text_view, "field 'mAccountBalance'", TextView.class);
        customTransferAndPaySource.mSourceTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_label, "field 'mSourceTextView'", TextView.class);
        customTransferAndPaySource.sourceInfoLayout = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_info_layout, "field 'sourceInfoLayout'", FrameLayout.class);
        customTransferAndPaySource.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
    }

    public final void read() {
        CustomTransferAndPaySource customTransferAndPaySource = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customTransferAndPaySource != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customTransferAndPaySource.mSourceLinearLayout = null;
            customTransferAndPaySource.mSourceNameTextView = null;
            customTransferAndPaySource.mAccountNumberTextView = null;
            customTransferAndPaySource.mAccountBalance = null;
            customTransferAndPaySource.mSourceTextView = null;
            customTransferAndPaySource.sourceInfoLayout = null;
            customTransferAndPaySource.divider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

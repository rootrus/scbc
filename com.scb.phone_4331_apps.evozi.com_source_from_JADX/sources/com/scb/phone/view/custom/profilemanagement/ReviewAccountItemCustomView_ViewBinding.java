package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ReviewAccountItemCustomView_ViewBinding implements Unbinder {
    private ReviewAccountItemCustomView MediaBrowserCompat$ItemReceiver;

    public ReviewAccountItemCustomView_ViewBinding(ReviewAccountItemCustomView reviewAccountItemCustomView, View view) {
        this.MediaBrowserCompat$ItemReceiver = reviewAccountItemCustomView;
        reviewAccountItemCustomView.numberAccountListText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.number_account_text, "field 'numberAccountListText'", TextView.class);
        reviewAccountItemCustomView.accountText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_text, "field 'accountText'", TextView.class);
        reviewAccountItemCustomView.typeText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.type_text, "field 'typeText'", TextView.class);
        reviewAccountItemCustomView.branchText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.branch_text, "field 'branchText'", TextView.class);
        reviewAccountItemCustomView.separator = onStart.IconCompatParcelizer(view, R.id.top_separator, "field 'separator'");
    }

    public final void read() {
        ReviewAccountItemCustomView reviewAccountItemCustomView = this.MediaBrowserCompat$ItemReceiver;
        if (reviewAccountItemCustomView != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            reviewAccountItemCustomView.numberAccountListText = null;
            reviewAccountItemCustomView.accountText = null;
            reviewAccountItemCustomView.typeText = null;
            reviewAccountItemCustomView.branchText = null;
            reviewAccountItemCustomView.separator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

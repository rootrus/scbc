package com.scb.phone.view.activity.ndid;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class NdidIdpShareSuccessActivity_ViewBinding extends BaseActivity_ViewBinding {
    private NdidIdpShareSuccessActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public NdidIdpShareSuccessActivity_ViewBinding(final NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, View view) {
        super(ndidIdpShareSuccessActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = ndidIdpShareSuccessActivity;
        ndidIdpShareSuccessActivity.descriptionTwo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_description_two, "field 'descriptionTwo'", TextView.class);
        ndidIdpShareSuccessActivity.descriptionOne = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_description_one, "field 'descriptionOne'", TextView.class);
        ndidIdpShareSuccessActivity.submitDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_date_time, "field 'submitDateTime'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_return_home, "method 'onReturnHomeButtonClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NdidIdpShareSuccessActivity.this.onReturnHomeButtonClick();
            }
        });
    }

    public final void read() {
        NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (ndidIdpShareSuccessActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            ndidIdpShareSuccessActivity.descriptionTwo = null;
            ndidIdpShareSuccessActivity.descriptionOne = null;
            ndidIdpShareSuccessActivity.submitDateTime = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

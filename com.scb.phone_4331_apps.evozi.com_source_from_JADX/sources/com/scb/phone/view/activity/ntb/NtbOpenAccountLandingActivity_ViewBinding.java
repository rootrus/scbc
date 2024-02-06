package com.scb.phone.view.activity.ntb;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class NtbOpenAccountLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private NtbOpenAccountLandingActivity IconCompatParcelizer;

    public NtbOpenAccountLandingActivity_ViewBinding(NtbOpenAccountLandingActivity ntbOpenAccountLandingActivity, View view) {
        super(ntbOpenAccountLandingActivity, view);
        this.IconCompatParcelizer = ntbOpenAccountLandingActivity;
        ntbOpenAccountLandingActivity.mTextViewDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_disclaimer, "field 'mTextViewDisclaimer'", TextView.class);
        ntbOpenAccountLandingActivity.mRecyclerViewRegistrationMethods = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_registration_methods, "field 'mRecyclerViewRegistrationMethods'", RecyclerView.class);
    }

    public final void read() {
        NtbOpenAccountLandingActivity ntbOpenAccountLandingActivity = this.IconCompatParcelizer;
        if (ntbOpenAccountLandingActivity != null) {
            this.IconCompatParcelizer = null;
            ntbOpenAccountLandingActivity.mTextViewDisclaimer = null;
            ntbOpenAccountLandingActivity.mRecyclerViewRegistrationMethods = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

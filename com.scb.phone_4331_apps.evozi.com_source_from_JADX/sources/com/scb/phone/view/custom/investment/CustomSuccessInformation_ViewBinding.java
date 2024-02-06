package com.scb.phone.view.custom.investment;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomSuccessInformation_ViewBinding implements Unbinder {
    private CustomSuccessInformation MediaBrowserCompat$CustomActionResultReceiver;

    public CustomSuccessInformation_ViewBinding(CustomSuccessInformation customSuccessInformation, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customSuccessInformation;
        customSuccessInformation.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'tvTitle'", TextView.class);
        customSuccessInformation.tvAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_number, "field 'tvAccountNumber'", TextView.class);
        customSuccessInformation.tvBranchDesc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_branch_desc, "field 'tvBranchDesc'", TextView.class);
        customSuccessInformation.tvAccountTypeDesc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_type_desc, "field 'tvAccountTypeDesc'", TextView.class);
        customSuccessInformation.tvBonus = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_bonus, "field 'tvBonus'", TextView.class);
    }

    public final void read() {
        CustomSuccessInformation customSuccessInformation = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customSuccessInformation != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customSuccessInformation.tvTitle = null;
            customSuccessInformation.tvAccountNumber = null;
            customSuccessInformation.tvBranchDesc = null;
            customSuccessInformation.tvAccountTypeDesc = null;
            customSuccessInformation.tvBonus = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

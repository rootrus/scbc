package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AccountManagementItemCustomView;

/* renamed from: o.getCheckAccountEligibility */
public final /* synthetic */ class getCheckAccountEligibility implements View.OnClickListener {
    private final /* synthetic */ AccountManagementItemCustomView MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getCheckAccountEligibility(AccountManagementItemCustomView accountManagementItemCustomView) {
        this.MediaBrowserCompat$CustomActionResultReceiver = accountManagementItemCustomView;
    }

    public final void onClick(View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read(true);
    }
}

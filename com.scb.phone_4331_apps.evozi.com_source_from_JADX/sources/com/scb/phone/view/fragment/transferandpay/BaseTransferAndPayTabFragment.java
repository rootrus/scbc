package com.scb.phone.view.fragment.transferandpay;

import android.content.Intent;
import android.content.IntentFilter;
import p040o.ActivityBuilder_ContributeRpLivenessCheckActivity;
import p040o.ActivityBuilder_ContributesHmlBusinessOwnerLoanSetupActivity;
import p040o.ActivityBuilder_ContributesHmlBusinessURLInformationActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.setChildDrawingOrderCallback;

public abstract class BaseTransferAndPayTabFragment extends BaseReplaceableFragment {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;

    public abstract void write(Intent intent);

    public void IconCompatParcelizer(Intent intent) {
        aA_();
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
        super.onDestroy();
    }

    public final boolean IconCompatParcelizer() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        return bulkTransferDeepLinkActivity != null && this.IconCompatParcelizer != null && !bulkTransferDeepLinkActivity.isDisposed() && !this.IconCompatParcelizer.isDisposed();
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter(str)).subscribe(new ActivityBuilder_ContributesHmlBusinessURLInformationActivity(this), ActivityBuilder_ContributesHmlBusinessOwnerLoanSetupActivity.write);
        this.IconCompatParcelizer = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter(str2)).subscribe(new ActivityBuilder_ContributeRpLivenessCheckActivity(this), ActivityBuilder_ContributesHmlBusinessOwnerLoanSetupActivity.write);
    }
}

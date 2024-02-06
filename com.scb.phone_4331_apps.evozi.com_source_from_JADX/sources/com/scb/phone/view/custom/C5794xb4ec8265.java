package com.scb.phone.view.custom;

import androidx.recyclerview.widget.RecyclerView;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.custom.InfiniteRecyclerView$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5794xb4ec8265 extends RecyclerView.ParcelableVolumeInfo {
    private final FundFactSheetActivity<Integer, HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$CustomActionResultReceiver;

    public C5794xb4ec8265(FundFactSheetActivity<? super Integer, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "stateChanged");
        this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView, int i) {
        onGetStartedClick.write((Object) recyclerView, "recyclerView");
        super.MediaBrowserCompat$ItemReceiver(recyclerView, i);
        this.MediaBrowserCompat$CustomActionResultReceiver.invoke(Integer.valueOf(i));
    }
}

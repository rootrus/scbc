package com.scb.phone.view.activity.bankingagent;

import android.os.CountDownTimer;
import p040o.getQueryParamsFor;
import p040o.getQueryParamsFor$MediaBrowserCompat$MediaItem;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class GenerateQRActivity$MediaBrowserCompat$SearchResultReceiver extends CountDownTimer {
    private /* synthetic */ GenerateQRActivity MediaBrowserCompat$CustomActionResultReceiver;

    public final void onTick(long j) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GenerateQRActivity$MediaBrowserCompat$SearchResultReceiver(GenerateQRActivity generateQRActivity, long j) {
        super(j, 1000);
        this.MediaBrowserCompat$CustomActionResultReceiver = generateQRActivity;
    }

    public final void onFinish() {
        GenerateQRActivity.read(this.MediaBrowserCompat$CustomActionResultReceiver).cancel();
        getQueryParamsFor getqueryparamsfor = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        if (getqueryparamsfor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer getqueryparamsfor_mediabrowsercompat_mediaitem = new getQueryParamsFor$MediaBrowserCompat$MediaItem(getqueryparamsfor);
        if (getqueryparamsfor.RatingCompat != null) {
            getqueryparamsfor_mediabrowsercompat_mediaitem.IconCompatParcelizer(getqueryparamsfor.RatingCompat);
        }
    }
}

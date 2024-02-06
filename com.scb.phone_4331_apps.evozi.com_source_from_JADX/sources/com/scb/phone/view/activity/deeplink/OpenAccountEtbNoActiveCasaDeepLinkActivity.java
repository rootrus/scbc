package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.deposit.DepositOpenAccountActivity;
import com.scb.phone.view.activity.ntb.NtbOpenAccountLandingActivity;
import p040o.C10827Iterators;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.IdExtractor;
import p040o.TaskCompletionSource$MediaBrowserCompat$ItemReceiver;
import p040o.isAspectRatioWithinLimits;
import p040o.isAspectRatioWithinLimits$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.preWriteCleanup;

public final class OpenAccountEtbNoActiveCasaDeepLinkActivity extends BaseDeepLinkActivity implements IdExtractor.C69112 {
    @HmlPinActivity
    public isAspectRatioWithinLimits presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        isAspectRatioWithinLimits isaspectratiowithinlimits = this.presenter;
        if (isaspectratiowithinlimits == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        isaspectratiowithinlimits.MediaBrowserCompat$ItemReceiver(this);
        isAspectRatioWithinLimits isaspectratiowithinlimits2 = this.presenter;
        if (isaspectratiowithinlimits2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        C10827Iterators.C353813 r6 = isaspectratiowithinlimits2.IconCompatParcelizer;
        FundFactSheetActivity isaspectratiowithinlimits_mediabrowsercompat_itemreceiver = new isAspectRatioWithinLimits$MediaBrowserCompat$ItemReceiver(isaspectratiowithinlimits2);
        FundFactSheetActivity read = new isAspectRatioWithinLimits.read(isaspectratiowithinlimits2);
        onGetStartedClick.write((Object) isaspectratiowithinlimits_mediabrowsercompat_itemreceiver, "onSuccess");
        onGetStartedClick.write((Object) read, "onError");
        r6.IconCompatParcelizer(r6.write, isaspectratiowithinlimits_mediabrowsercompat_itemreceiver, read, new TaskCompletionSource$MediaBrowserCompat$ItemReceiver(new preWriteCleanup(r6.IconCompatParcelizer)));
    }

    public final void MediaBrowserCompat$ItemReceiver(long j) {
        NtbOpenAccountLandingActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this, j);
        finish();
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        DepositOpenAccountActivity.IconCompatParcelizer iconCompatParcelizer = DepositOpenAccountActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        String stringExtra = getIntent().getStringExtra("accountType");
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, DepositOpenAccountActivity.class);
        intent.putExtra("accountType", stringExtra);
        read(intent);
    }
}

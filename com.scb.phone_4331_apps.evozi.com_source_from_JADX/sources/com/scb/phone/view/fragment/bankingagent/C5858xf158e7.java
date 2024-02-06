package com.scb.phone.view.fragment.bankingagent;

import android.view.View;
import p040o.FundFactSheetActivity;
import p040o.MoreExecutors;
import p040o.bind$MediaBrowserCompat$ItemReceiver;
import p040o.checkNonnegative;
import p040o.onGetStartedClick;
import p040o.requestWasSuccessful;
import p040o.sameThreadExecutor;

/* renamed from: com.scb.phone.view.fragment.bankingagent.BankingEnterAmountFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C5858xf158e7 implements View.OnClickListener {
    private /* synthetic */ BankingEnterAmountFragment IconCompatParcelizer;

    C5858xf158e7(BankingEnterAmountFragment bankingEnterAmountFragment) {
        this.IconCompatParcelizer = bankingEnterAmountFragment;
    }

    public final void onClick(View view) {
        sameThreadExecutor samethreadexecutor;
        requestWasSuccessful requestwassuccessful = this.IconCompatParcelizer.presenter;
        if (requestwassuccessful == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (requestwassuccessful.RatingCompat != null) {
            requestwassuccessful.RatingCompat.AlertController$RecycleListView();
        }
        MoreExecutors.C36611 r0 = requestwassuccessful.IconCompatParcelizer;
        if (r0 != null && (samethreadexecutor = requestwassuccessful.MediaDescriptionCompat) != null) {
            checkNonnegative checknonnegative = requestwassuccessful.MediaBrowserCompat$ItemReceiver;
            FundFactSheetActivity ratingCompat = new requestWasSuccessful.RatingCompat(samethreadexecutor, r0, requestwassuccessful);
            FundFactSheetActivity mediaDescriptionCompat = new requestWasSuccessful.MediaDescriptionCompat(requestwassuccessful);
            String str = r0.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = samethreadexecutor.write;
            String str3 = samethreadexecutor.MediaDescriptionCompat;
            double d = requestwassuccessful.write;
            String str4 = requestwassuccessful.read;
            if (str4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("postingType");
            }
            bind$MediaBrowserCompat$ItemReceiver bind_mediabrowsercompat_itemreceiver = new bind$MediaBrowserCompat$ItemReceiver(str, str2, str3, "BANKING_AGENT", d, str4);
            onGetStartedClick.write((Object) ratingCompat, "onSuccess");
            onGetStartedClick.write((Object) mediaDescriptionCompat, "onError");
            onGetStartedClick.write((Object) bind_mediabrowsercompat_itemreceiver, "params");
            checknonnegative.IconCompatParcelizer(checknonnegative.MediaMetadataCompat, ratingCompat, mediaDescriptionCompat, bind_mediabrowsercompat_itemreceiver);
        }
    }
}

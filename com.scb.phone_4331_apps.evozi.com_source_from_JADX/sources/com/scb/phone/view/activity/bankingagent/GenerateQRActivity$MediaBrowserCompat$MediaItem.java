package com.scb.phone.view.activity.bankingagent;

import android.content.DialogInterface;
import p040o.ComputingConcurrentHashMap;
import p040o.getExitingScheduledExecutorService;
import p040o.getQueryParamsFor;
import p040o.getQueryParamsFor$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.removeIfFromRandomAccessList;

final class GenerateQRActivity$MediaBrowserCompat$MediaItem implements DialogInterface.OnClickListener {
    private /* synthetic */ GenerateQRActivity MediaBrowserCompat$ItemReceiver;

    GenerateQRActivity$MediaBrowserCompat$MediaItem(GenerateQRActivity generateQRActivity) {
        this.MediaBrowserCompat$ItemReceiver = generateQRActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        getQueryParamsFor getqueryparamsfor = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (getqueryparamsfor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getExitingScheduledExecutorService getexitingscheduledexecutorservice = getqueryparamsfor.read;
        if (getexitingscheduledexecutorservice == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
        }
        String str = getexitingscheduledexecutorservice.IconCompatParcelizer;
        getExitingScheduledExecutorService getexitingscheduledexecutorservice2 = getqueryparamsfor.read;
        if (getexitingscheduledexecutorservice2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
        }
        String str2 = getexitingscheduledexecutorservice2.MediaBrowserCompat$CustomActionResultReceiver;
        getExitingScheduledExecutorService getexitingscheduledexecutorservice3 = getqueryparamsfor.read;
        if (getexitingscheduledexecutorservice3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
        }
        String read = removeIfFromRandomAccessList.read(getexitingscheduledexecutorservice3.MediaDescriptionCompat);
        onGetStartedClick.IconCompatParcelizer((Object) read, "Utilities.amountDoubleWi…als(reviewDisplay.amount)");
        getExitingScheduledExecutorService getexitingscheduledexecutorservice4 = getqueryparamsfor.read;
        if (getexitingscheduledexecutorservice4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
        }
        String str3 = getexitingscheduledexecutorservice4.MediaBrowserCompat$SearchResultReceiver;
        getExitingScheduledExecutorService getexitingscheduledexecutorservice5 = getqueryparamsfor.read;
        if (getexitingscheduledexecutorservice5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
        }
        ComputingConcurrentHashMap computingConcurrentHashMap = new ComputingConcurrentHashMap(str, "BANKING_AGENT", str2, read, str3, getexitingscheduledexecutorservice5.MediaBrowserCompat$MediaItem);
        if (getqueryparamsfor.RatingCompat != null) {
            getqueryparamsfor.RatingCompat.AlertController$RecycleListView();
        }
        getqueryparamsfor.write.read(new getQueryParamsFor.IconCompatParcelizer(getqueryparamsfor), new getQueryParamsFor$MediaBrowserCompat$ItemReceiver(getqueryparamsfor), computingConcurrentHashMap, new getQueryParamsFor.read(getqueryparamsfor), getqueryparamsfor.MediaBrowserCompat$ItemReceiver);
    }
}

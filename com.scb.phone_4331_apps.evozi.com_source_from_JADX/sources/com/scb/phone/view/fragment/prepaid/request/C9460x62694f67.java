package com.scb.phone.view.fragment.prepaid.request;

import android.content.DialogInterface;
import p040o.AutoValue_CrashlyticsReport_Session_Device;
import p040o.CrashlyticsReport;
import p040o.FundFactSheetActivity;
import p040o.IFaceDetector;
import p040o.IFaceDetector$MediaBrowserCompat$MediaItem;
import p040o.IFaceDetector$MediaBrowserCompat$SearchResultReceiver;
import p040o.ImmutableCollection;
import p040o.checkPositionIndex$MediaBrowserCompat$ItemReceiver;
import p040o.getRam;
import p040o.hashCodeImpl;
import p040o.onGetStartedClick;
import p040o.setOnMyLocationClickListener;

/* renamed from: com.scb.phone.view.fragment.prepaid.request.PrepaidRequestInputFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C9460x62694f67 implements DialogInterface.OnClickListener {
    private /* synthetic */ PrepaidRequestInputFragment write;

    C9460x62694f67(PrepaidRequestInputFragment prepaidRequestInputFragment) {
        this.write = prepaidRequestInputFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        IFaceDetector iFaceDetector = this.write.presenter;
        if (iFaceDetector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CrashlyticsReport.FilesPayload.File.Builder builder = iFaceDetector.IconCompatParcelizer;
        String str13 = null;
        if (builder != null) {
            str = builder.MediaSessionCompat$Token;
        } else {
            str = null;
        }
        String valueOf = String.valueOf(str);
        AutoValue_CrashlyticsReport_Session_Device.Builder builder2 = iFaceDetector.MediaBrowserCompat$ItemReceiver;
        if (builder2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidCardTypeSelected");
        }
        String str14 = builder2.MediaBrowserCompat$ItemReceiver.read;
        getRam getram = iFaceDetector.read;
        if (getram != null) {
            str2 = getram.MediaBrowserCompat$ItemReceiver;
        } else {
            str2 = null;
        }
        getRam getram2 = iFaceDetector.read;
        if (getram2 != null) {
            str3 = getram2.MediaSessionCompat$QueueItem;
        } else {
            str3 = null;
        }
        getRam getram3 = iFaceDetector.read;
        if (getram3 != null) {
            str4 = getram3.MediaMetadataCompat;
        } else {
            str4 = null;
        }
        getRam getram4 = iFaceDetector.read;
        if (getram4 != null) {
            str5 = getram4.read;
        } else {
            str5 = null;
        }
        getRam getram5 = iFaceDetector.read;
        if (getram5 != null) {
            str6 = getram5.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str6 = null;
        }
        getRam getram6 = iFaceDetector.read;
        if (getram6 != null) {
            str7 = getram6.MediaDescriptionCompat;
        } else {
            str7 = null;
        }
        getRam getram7 = iFaceDetector.read;
        if (getram7 != null) {
            str8 = getram7.MediaBrowserCompat$MediaItem;
        } else {
            str8 = null;
        }
        getRam getram8 = iFaceDetector.read;
        if (getram8 != null) {
            str9 = getram8.RatingCompat;
        } else {
            str9 = null;
        }
        getRam getram9 = iFaceDetector.read;
        if (getram9 != null) {
            str10 = getram9.IconCompatParcelizer;
        } else {
            str10 = null;
        }
        getRam getram10 = iFaceDetector.read;
        if (getram10 != null) {
            str11 = getram10.write;
        } else {
            str11 = null;
        }
        getRam getram11 = iFaceDetector.read;
        if (getram11 != null) {
            str12 = getram11.MediaBrowserCompat$SearchResultReceiver;
        } else {
            str12 = null;
        }
        getRam getram12 = iFaceDetector.read;
        if (getram12 != null) {
            str13 = getram12.MediaSessionCompat$Token;
        }
        ImmutableCollection.EmptyImmutableCollection emptyImmutableCollection = new ImmutableCollection.EmptyImmutableCollection(valueOf, str14, new setOnMyLocationClickListener(str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13));
        if (iFaceDetector.RatingCompat != null) {
            iFaceDetector.RatingCompat.AlertController$RecycleListView();
        }
        hashCodeImpl hashcodeimpl = iFaceDetector.write;
        FundFactSheetActivity iFaceDetector$MediaBrowserCompat$SearchResultReceiver = new IFaceDetector$MediaBrowserCompat$SearchResultReceiver(iFaceDetector);
        FundFactSheetActivity iFaceDetector$MediaBrowserCompat$MediaItem = new IFaceDetector$MediaBrowserCompat$MediaItem(iFaceDetector);
        onGetStartedClick.write((Object) iFaceDetector$MediaBrowserCompat$SearchResultReceiver, "onSuccess");
        onGetStartedClick.write((Object) iFaceDetector$MediaBrowserCompat$MediaItem, "onError");
        onGetStartedClick.write((Object) emptyImmutableCollection, "request");
        hashcodeimpl.IconCompatParcelizer(hashcodeimpl.write, iFaceDetector$MediaBrowserCompat$SearchResultReceiver, iFaceDetector$MediaBrowserCompat$MediaItem, new checkPositionIndex$MediaBrowserCompat$ItemReceiver(emptyImmutableCollection));
    }
}

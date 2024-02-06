package com.scb.phone.view.fragment.additionaldocument;

import p040o.AccountChangeEventsRequest;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.C4310dy;
import p040o.DataPrivacyManagementDeepLinkActivity;
import p040o.DebitCardCoachMarkActivity;
import p040o.DebitCardMarketConductActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindPrepaidRequestInputFragment;
import p040o.HmlPinActivity;
import p040o.createByteArraySparseArray;
import p040o.createCharArray;
import p040o.createDoubleList;
import p040o.createFloatArray;
import p040o.createFloatList;
import p040o.createFloatSparseArray;
import p040o.createIBinderArray;
import p040o.createIBinderList;
import p040o.createLongList;
import p040o.evictsBySize;
import p040o.getChangeType;
import p040o.getLocationAvailability;
import p040o.getPackageName;
import p040o.getProject;
import p040o.getStreetViewPanoramaAsync;
import p040o.nullifyExpirable;
import p040o.rehash;
import p040o.requestActivityUpdates;
import p040o.transactAndReadExceptionReturnVoid;
import p040o.zzfa;
import p040o.zzvo;

/* renamed from: com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5850x981d5d19 implements getProject {
    private C4310dy.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    public getChangeType MediaBrowserCompat$ItemReceiver;
    public FragmentBuilder_BindPrepaidRequestInputFragment read;
    public AccountChangeEventsRequest write;

    private C5850x981d5d19() {
    }

    @HmlPinActivity
    public C5850x981d5d19(C4310dy.IconCompatParcelizer iconCompatParcelizer, AccountChangeEventsRequest accountChangeEventsRequest, getChangeType getchangetype, FragmentBuilder_BindPrepaidRequestInputFragment fragmentBuilder_BindPrepaidRequestInputFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.write = accountChangeEventsRequest;
        this.MediaBrowserCompat$ItemReceiver = getchangetype;
        this.read = fragmentBuilder_BindPrepaidRequestInputFragment;
    }

    public final DebitCardResetOtpActivity<getLocationAvailability> MediaBrowserCompat$ItemReceiver(String str, String str2, nullifyExpirable nullifyexpirable) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.closeAccount(str, str2, nullifyexpirable).map(getPackageName.IconCompatParcelizer).map(new createByteArraySparseArray(this)).doOnNext(new createFloatArray(this));
    }

    public final DebitCardResetOtpActivity<requestActivityUpdates> read(evictsBySize evictsbysize) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.closeAccountVerification(evictsbysize).map(zzfa.write).map(new createLongList(this)).doOnNext(new createFloatSparseArray(this));
    }

    public final BScanCNotificationDeepLinkActivity<getLocationAvailability> MediaBrowserCompat$CustomActionResultReceiver() {
        return BScanCNotificationDeepLinkActivity.read(this.read.MediaBrowserCompat$ItemReceiver);
    }

    public final BScanCNotificationDeepLinkActivity<zzvo> IconCompatParcelizer() {
        return BScanCNotificationDeepLinkActivity.read(this.read.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final BScanCNotificationDeepLinkActivity<String> MediaBrowserCompat$ItemReceiver() {
        if (this.read.MediaBrowserCompat$CustomActionResultReceiver.write == null) {
            return BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new Throwable("Data not found"));
        }
        return BScanCNotificationDeepLinkActivity.read(this.read.MediaBrowserCompat$CustomActionResultReceiver.write);
    }

    public final BScanCNotificationDeepLinkActivity<getStreetViewPanoramaAsync> write() {
        return BScanCNotificationDeepLinkActivity.read(this.read.write);
    }

    public final DebitCardResetOtpActivity<requestActivityUpdates> read() {
        return DebitCardResetOtpActivity.just(this.read.IconCompatParcelizer);
    }

    public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$MediaItem() {
        return DebitCardResetOtpActivity.just(this.read.read);
    }

    public final DebitCardCoachMarkActivity IconCompatParcelizer(zzvo zzvo) {
        this.read.MediaBrowserCompat$CustomActionResultReceiver = zzvo;
        return DebitCardCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver((DebitCardMarketConductActivity) createDoubleList.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final DebitCardCoachMarkActivity write(getStreetViewPanoramaAsync getstreetviewpanoramaasync) {
        return DebitCardCoachMarkActivity.read((DataPrivacyManagementDeepLinkActivity) new createCharArray(this, getstreetviewpanoramaasync));
    }

    public final DebitCardCoachMarkActivity IconCompatParcelizer(rehash rehash) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.validateEligibility(rehash).map(zzfa.write).doOnNext(new createFloatList(this)).map(transactAndReadExceptionReturnVoid.MediaBrowserCompat$CustomActionResultReceiver).map(createIBinderArray.read).doOnNext(new createIBinderList(this)).ignoreElements();
    }
}

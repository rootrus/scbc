package com.scb.phone.view.fragment.hml.businessowner;

import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindPrepaidCashOutSuccessFragment;
import p040o.FragmentBuilder_BindSetupScheduleMonthlyFragment;
import p040o.HmlPinActivity;
import p040o.ImmutableSortedSet;
import p040o.Interner;
import p040o.LocalProjectProvider;
import p040o.SafeParcelable;
import p040o.SignInConnectionListener;
import p040o.addImpression;
import p040o.animateCameraWithDurationAndCallback;
import p040o.creator;
import p040o.getCityFieldName;
import p040o.onStreetViewPanoramaLongClick;
import p040o.previousIndex;
import p040o.putInstance;
import p040o.recordLockedRead;
import p040o.setFilterByAuthorizedAccounts;
import p040o.setNonInteraction;
import p040o.unsafeComparator;
import p040o.userNavigationEnabled;
import p040o.withHolder;
import p040o.writeByteArraySparseArray;
import p040o.zabr;
import p040o.zoomByWithFocus;
import p040o.zzca;
import p040o.zzcg;
import p040o.zzcu;
import p040o.zzfs;
import p040o.zzgc;

/* renamed from: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerOutcomePendingFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6016xc8f96b6e implements LocalProjectProvider.C6940b {
    private final setFilterByAuthorizedAccounts IconCompatParcelizer;
    public final addImpression MediaBrowserCompat$CustomActionResultReceiver;
    public final setNonInteraction MediaBrowserCompat$ItemReceiver;
    private final withHolder MediaBrowserCompat$MediaItem;
    private final SignInConnectionListener MediaDescriptionCompat;
    private final FragmentBuilder_BindSetupScheduleMonthlyFragment MediaMetadataCompat;
    private final getCityFieldName.write read;
    private final FragmentBuilder_BindPrepaidCashOutSuccessFragment write;

    private C6016xc8f96b6e() {
    }

    @HmlPinActivity
    public C6016xc8f96b6e(getCityFieldName.write write2, setFilterByAuthorizedAccounts setfilterbyauthorizedaccounts, addImpression addimpression, SignInConnectionListener signInConnectionListener, withHolder withholder, setNonInteraction setnoninteraction, FragmentBuilder_BindPrepaidCashOutSuccessFragment fragmentBuilder_BindPrepaidCashOutSuccessFragment, FragmentBuilder_BindSetupScheduleMonthlyFragment fragmentBuilder_BindSetupScheduleMonthlyFragment) {
        this.read = write2;
        this.IconCompatParcelizer = setfilterbyauthorizedaccounts;
        this.MediaBrowserCompat$CustomActionResultReceiver = addimpression;
        this.MediaDescriptionCompat = signInConnectionListener;
        this.MediaBrowserCompat$MediaItem = withholder;
        this.MediaBrowserCompat$ItemReceiver = setnoninteraction;
        this.write = fragmentBuilder_BindPrepaidCashOutSuccessFragment;
        this.MediaMetadataCompat = fragmentBuilder_BindSetupScheduleMonthlyFragment;
    }

    public final userNavigationEnabled read() {
        return this.write.write;
    }

    public final putInstance IconCompatParcelizer() {
        return this.write.read;
    }

    public final DebitCardResetOtpActivity<onStreetViewPanoramaLongClick> MediaBrowserCompat$ItemReceiver(ImmutableSortedSet.Builder builder) {
        return this.read.IconCompatParcelizer.confirmFastPayBillPayment(builder).flatMap(new creator(this));
    }

    public final DebitCardResetOtpActivity<zoomByWithFocus> MediaBrowserCompat$ItemReceiver(unsafeComparator unsafecomparator) {
        return this.read.IconCompatParcelizer.confirmFastPayTransfer(unsafecomparator).map(zzfs.write).map(new writeByteArraySparseArray(this.MediaBrowserCompat$MediaItem));
    }

    public final DebitCardResetOtpActivity<zzca.zzd> MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read.IconCompatParcelizer.getFastPayProfiles().map(new previousIndex(this.IconCompatParcelizer));
    }

    public final DebitCardResetOtpActivity<zzca.zzd> MediaBrowserCompat$CustomActionResultReceiver(recordLockedRead recordlockedread) {
        return this.read.IconCompatParcelizer.updateFastPayProfile(recordlockedread).map(new previousIndex(this.IconCompatParcelizer));
    }

    public final DebitCardResetOtpActivity<zzca.zzd> MediaBrowserCompat$ItemReceiver(recordLockedRead recordlockedread, String str, String str2) {
        return this.read.IconCompatParcelizer.updateFastPayProfileWithOtp(recordlockedread, str, str2).map(new previousIndex(this.IconCompatParcelizer));
    }

    public final DebitCardResetOtpActivity<userNavigationEnabled> MediaBrowserCompat$ItemReceiver(putInstance putinstance) {
        this.write.read = putinstance;
        return this.read.IconCompatParcelizer.verifyFastPayBillPayment(putinstance).flatMap(new SafeParcelable.Class(this)).doOnNext(new zzcg.zza(this.write));
    }

    public final DebitCardResetOtpActivity<animateCameraWithDurationAndCallback> MediaBrowserCompat$ItemReceiver(Interner interner) {
        this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver = interner;
        getCityFieldName.write write2 = this.read;
        zabr.IconCompatParcelizer("9003");
        return write2.IconCompatParcelizer.verifyFastPayTransfer(interner).map(new zzcu(this.MediaDescriptionCompat)).doOnNext(new zzgc(this.MediaMetadataCompat));
    }
}

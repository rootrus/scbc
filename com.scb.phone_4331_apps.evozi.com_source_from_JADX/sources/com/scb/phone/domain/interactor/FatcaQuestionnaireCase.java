package com.scb.phone.domain.interactor;

import com.scb.phone.domain.ScbException;
import p040o.CloseAccountReviewActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.IUiSettingsDelegate;
import p040o.IndoorBuilding;
import p040o.LocalProjectProvider;
import p040o.StreetViewLifecycleDelegate;
import p040o.containsRow;
import p040o.getAncestor;
import p040o.getProjection;
import p040o.getStreetViewPanorama;
import p040o.getStrokeJointType;
import p040o.newLocalProjectProvider;
import p040o.rowKeySet;
import p040o.setPositionWithRadius;
import p040o.setPositionWithSource;
import p040o.zzuk;

public final class FatcaQuestionnaireCase extends IndoorBuilding {
    public getAncestor MediaBrowserCompat$CustomActionResultReceiver;
    private LocalProjectProvider.C69353 MediaBrowserCompat$ItemReceiver;
    private LocalProjectProvider.C69386 read;
    private newLocalProjectProvider write;

    public static class FatcaVerificationCodeException extends ScbException {
    }

    @HmlPinActivity
    public FatcaQuestionnaireCase(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r3, newLocalProjectProvider newlocalprojectprovider, LocalProjectProvider.C69353 r5, getAncestor getancestor) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.read = r3;
        this.write = newlocalprojectprovider;
        this.MediaBrowserCompat$ItemReceiver = r5;
        this.MediaBrowserCompat$CustomActionResultReceiver = getancestor;
    }

    public final DebitCardResetOtpActivity<getStrokeJointType> write() {
        return write(this.read.MediaBrowserCompat$MediaItem());
    }

    public final DebitCardResetOtpActivity<getProjection> IconCompatParcelizer(containsRow containsrow) {
        return write(this.read.IconCompatParcelizer(containsrow).onErrorResumeNext(new getStreetViewPanorama(this)));
    }

    public final DebitCardResetOtpActivity<zzuk> MediaBrowserCompat$ItemReceiver(rowKeySet rowkeyset) {
        return write(this.write.MediaBrowserCompat$CustomActionResultReceiver(rowkeyset).onErrorResumeNext(new setPositionWithRadius(this)));
    }

    public final DebitCardResetOtpActivity<zzuk> MediaBrowserCompat$CustomActionResultReceiver(rowKeySet rowkeyset) {
        return write(this.MediaBrowserCompat$ItemReceiver.read(rowkeyset).onErrorResumeNext(new setPositionWithSource(this)));
    }

    public final DebitCardResetOtpActivity<getProjection> MediaBrowserCompat$CustomActionResultReceiver(containsRow containsrow) {
        return write(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(containsrow).doOnNext(new IUiSettingsDelegate(this)).onErrorResumeNext(new StreetViewLifecycleDelegate(this)));
    }
}

package com.scb.phone.presentation.presenter.emailverification;

import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.QuickAnalysisFeedback;
import p040o.access$2300;
import p040o.isBlurry;
import p040o.zzfy;

public final class EmailOtpPresenter$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzfy.zze> {
    public final /* synthetic */ EmailOtpPresenter MediaBrowserCompat$CustomActionResultReceiver;

    private EmailOtpPresenter$MediaBrowserCompat$ItemReceiver(EmailOtpPresenter emailOtpPresenter) {
        this.MediaBrowserCompat$CustomActionResultReceiver = emailOtpPresenter;
    }

    public /* synthetic */ EmailOtpPresenter$MediaBrowserCompat$ItemReceiver(EmailOtpPresenter emailOtpPresenter, byte b) {
        this(emailOtpPresenter);
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzfy.zze zze = (zzfy.zze) obj;
        String unused = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = zze.write;
        String unused2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = zze.read;
        EmailOtpPresenter emailOtpPresenter = this.MediaBrowserCompat$CustomActionResultReceiver;
        QuickAnalysisFeedback.FriendQAF friendQAF = new QuickAnalysisFeedback.FriendQAF(this);
        boolean z = true;
        if (emailOtpPresenter.RatingCompat != null) {
            friendQAF.IconCompatParcelizer(emailOtpPresenter.RatingCompat);
        }
        EmailOtpPresenter emailOtpPresenter2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        isBlurry isblurry = new isBlurry(this);
        if (emailOtpPresenter2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            isblurry.IconCompatParcelizer(emailOtpPresenter2.RatingCompat);
        }
        EmailOtpPresenter.RatingCompat(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void onError(Throwable th) {
        EmailOtpPresenter.MediaMetadataCompat(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}

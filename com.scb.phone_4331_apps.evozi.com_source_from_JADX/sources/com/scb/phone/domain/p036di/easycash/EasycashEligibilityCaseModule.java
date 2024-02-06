package com.scb.phone.domain.p036di.easycash;

import p040o.CloseAccountReviewActivity;
import p040o.Frame;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.MultiDetector;
import p040o.onGetStartedClick;
import p040o.subMap;

/* renamed from: com.scb.phone.domain.di.easycash.EasycashEligibilityCaseModule */
public final class EasycashEligibilityCaseModule {
    @HmlSetNTBPinActivity
    public final MultiDetector.Builder write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, subMap submap) {
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) submap, "easycashRepositoryContractor");
        return new MultiDetector.Builder(closeAccountReviewActivity, closeAccountReviewActivity2, submap);
    }

    @HmlSetNTBPinActivity
    public final Frame read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, subMap submap) {
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) submap, "easycashRepositoryContractor");
        return new Frame(closeAccountReviewActivity, closeAccountReviewActivity2, submap);
    }
}

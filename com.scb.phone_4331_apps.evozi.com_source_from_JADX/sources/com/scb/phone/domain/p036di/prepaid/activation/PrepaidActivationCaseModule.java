package com.scb.phone.domain.p036di.prepaid.activation;

import p040o.CloseAccountReviewActivity;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.Objects;
import p040o.Objects$1$MediaBrowserCompat$ItemReceiver;
import p040o.PairwiseEquivalence;
import p040o.Platform;
import p040o.frequency;
import p040o.getListDelegate;
import p040o.onFinish;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.domain.di.prepaid.activation.PrepaidActivationCaseModule */
public final class PrepaidActivationCaseModule {
    @HmlSetNTBPinActivity
    public final PairwiseEquivalence write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getListDelegate getlistdelegate) {
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getlistdelegate, "prepaidActivationRepositoryContractor");
        return new PairwiseEquivalence(closeAccountReviewActivity, closeAccountReviewActivity2, getlistdelegate);
    }

    @HmlSetNTBPinActivity
    public final Objects.C36991 read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getListDelegate getlistdelegate) {
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getlistdelegate, "prepaidActivationRepositoryContractor");
        return new frequency<onFinish, Objects$1$MediaBrowserCompat$ItemReceiver>(closeAccountReviewActivity, closeAccountReviewActivity2, getlistdelegate) {
            {
                onGetStartedClick.write((Object) r2, "subscriberOn");
                onGetStartedClick.write((Object) r3, "observerOn");
                onGetStartedClick.write((Object) r4, "prepaidActivationRepositoryContractor");
            }
        };
    }

    @HmlSetNTBPinActivity
    public final Platform IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getListDelegate getlistdelegate) {
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getlistdelegate, "prepaidActivationRepositoryContractor");
        return new Platform(closeAccountReviewActivity, closeAccountReviewActivity2, getlistdelegate);
    }
}

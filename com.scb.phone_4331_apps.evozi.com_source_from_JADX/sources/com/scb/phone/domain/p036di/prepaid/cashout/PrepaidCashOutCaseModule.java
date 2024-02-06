package com.scb.phone.domain.p036di.prepaid.cashout;

import p040o.AbstractMultimap;
import p040o.AbstractSetMultimap;
import p040o.CloseAccountReviewActivity;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.LocalProjectProvider;
import p040o.isInstance;
import p040o.onGetStartedClick;
import p040o.simpleName;
import p040o.systemNanoTime;

/* renamed from: com.scb.phone.domain.di.prepaid.cashout.PrepaidCashOutCaseModule */
public final class PrepaidCashOutCaseModule {
    @HmlSetNTBPinActivity
    public final simpleName MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.WrappedList.WrappedListIterator wrappedListIterator) {
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) wrappedListIterator, "prepaidCashOutConfirmationRepositoryContractor");
        return new simpleName(closeAccountReviewActivity, closeAccountReviewActivity2, wrappedListIterator);
    }

    @HmlSetNTBPinActivity
    public final isInstance read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider localProjectProvider, AbstractMultimap.MultisetEntry multisetEntry) {
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) localProjectProvider, "depositRepositoryContractor");
        onGetStartedClick.write((Object) multisetEntry, "transferRepositoryContractor");
        return new isInstance(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider, multisetEntry);
    }

    @HmlSetNTBPinActivity
    public final systemNanoTime MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractSetMultimap abstractSetMultimap) {
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) abstractSetMultimap, "prepaidCashOutVerificationRepositoryContractor");
        return new systemNanoTime(closeAccountReviewActivity, closeAccountReviewActivity2, abstractSetMultimap);
    }
}

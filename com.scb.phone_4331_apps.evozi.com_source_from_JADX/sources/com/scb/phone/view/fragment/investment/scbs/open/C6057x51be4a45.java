package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import butterknife.ButterKnife;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingSuccessFragment;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindEBillSelectedFragment;

/* renamed from: com.scb.phone.view.fragment.investment.scbs.open.OnboardingSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver */
public class C6057x51be4a45 extends FragmentBuilder_BindEBillSelectedFragment<OnboardingSuccessFragment.ScbsRegistrationSuccessScreenshotDisplay> {
    public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
        OnboardingSuccessFragment.ScbsRegistrationSuccessScreenshotDisplay scbsRegistrationSuccessScreenshotDisplay = (OnboardingSuccessFragment.ScbsRegistrationSuccessScreenshotDisplay) simpleForwardingListenableFuture;
        ButterKnife.IconCompatParcelizer(scbsRegistrationSuccessScreenshotDisplay, view);
        scbsRegistrationSuccessScreenshotDisplay.dateTextView.setText(scbsRegistrationSuccessScreenshotDisplay.read.IconCompatParcelizer);
        scbsRegistrationSuccessScreenshotDisplay.nameTextView.setText(scbsRegistrationSuccessScreenshotDisplay.read.read);
        scbsRegistrationSuccessScreenshotDisplay.accountNameTextView.setText(scbsRegistrationSuccessScreenshotDisplay.read.MediaBrowserCompat$ItemReceiver);
        scbsRegistrationSuccessScreenshotDisplay.accountNumberTextView.setText(scbsRegistrationSuccessScreenshotDisplay.read.MediaBrowserCompat$CustomActionResultReceiver);
        scbsRegistrationSuccessScreenshotDisplay.emailTextView.setText(scbsRegistrationSuccessScreenshotDisplay.read.write);
    }
}

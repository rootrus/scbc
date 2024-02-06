package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.util.AttributeSet;
import java.util.concurrent.TimeUnit;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlETBLandingActivity;
import p040o.LoanService;
import p040o.LoginService;
import p040o.verifyLoanPayment;

public class CustomDeltaSliderPressed extends CustomDeltaSlider {
    public BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;

    public CustomDeltaSliderPressed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomDeltaSliderPressed(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void write(int i) {
        this.increaseButton.setOnClickListener(new LoginService(this, i));
        this.decreaseButton.setOnClickListener(new verifyLoanPayment(this, i));
    }

    public void setNewActualValue(int i) {
        super.setNewActualValue(i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$ItemReceiver = DebitCardResetOtpActivity.timer(2000, TimeUnit.MILLISECONDS, HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new LoanService(this));
    }

    public final /* synthetic */ void write() throws Exception {
        this.write.MediaBrowserCompat$ItemReceiver((double) this.IconCompatParcelizer);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$ItemReceiver.dispose();
        }
    }
}

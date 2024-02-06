package com.scb.phone.view.activity.cardmanagement;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.cardmanagement.AmortizationBreakdownAmountTabFragment;
import com.scb.phone.view.fragment.cardmanagement.AmortizationTotalAmountTabFragment;
import com.scb.phone.view.fragment.cardmanagement.C5865x86bbd087;
import p040o.FirebaseTooManyRequestsException;
import p040o.setCardElevation;
import p040o.setTitleMarginStart;

/* renamed from: com.scb.phone.view.activity.cardmanagement.BaseAmortizationActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5566x7e32288c extends setCardElevation {
    private /* synthetic */ BaseAmortizationActivity MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ FirebaseTooManyRequestsException read;

    public final int getCount() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5566x7e32288c(BaseAmortizationActivity baseAmortizationActivity, FirebaseTooManyRequestsException firebaseTooManyRequestsException, setTitleMarginStart settitlemarginstart) {
        super(settitlemarginstart);
        this.MediaBrowserCompat$ItemReceiver = baseAmortizationActivity;
        this.read = firebaseTooManyRequestsException;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            AmortizationTotalAmountTabFragment.IconCompatParcelizer iconCompatParcelizer = AmortizationTotalAmountTabFragment.IconCompatParcelizer;
            FirebaseTooManyRequestsException firebaseTooManyRequestsException = this.read;
            AmortizationTotalAmountTabFragment amortizationTotalAmountTabFragment = new AmortizationTotalAmountTabFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_SUMMARY_DISPLAY", firebaseTooManyRequestsException);
            amortizationTotalAmountTabFragment.setArguments(bundle);
            return amortizationTotalAmountTabFragment;
        }
        C5865x86bbd087 amortizationBreakdownAmountTabFragment$MediaBrowserCompat$ItemReceiver = AmortizationBreakdownAmountTabFragment.IconCompatParcelizer;
        FirebaseTooManyRequestsException firebaseTooManyRequestsException2 = this.read;
        AmortizationBreakdownAmountTabFragment amortizationBreakdownAmountTabFragment = new AmortizationBreakdownAmountTabFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("EXTRA_SUMMARY_DISPLAY", firebaseTooManyRequestsException2);
        amortizationBreakdownAmountTabFragment.setArguments(bundle2);
        return amortizationBreakdownAmountTabFragment;
    }

    public final CharSequence getPageTitle(int i) {
        if (i == 0) {
            return this.MediaBrowserCompat$ItemReceiver.getString(R.string.deejung_amortization_total_amount_tab);
        }
        return this.MediaBrowserCompat$ItemReceiver.getString(R.string.deejung_amortization_breakdown_amount_tab);
    }
}

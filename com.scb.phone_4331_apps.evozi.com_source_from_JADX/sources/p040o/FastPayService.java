package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomBillsToPay;

/* renamed from: o.FastPayService */
public final /* synthetic */ class FastPayService implements View.OnClickListener {
    private final /* synthetic */ CustomBillsToPay read;

    public /* synthetic */ FastPayService(CustomBillsToPay customBillsToPay) {
        this.read = customBillsToPay;
    }

    public final void onClick(View view) {
        FragmentBuilder_BindBillPaymentReviewFragment fragmentBuilder_BindBillPaymentReviewFragment = this.read.write;
        if (fragmentBuilder_BindBillPaymentReviewFragment != null) {
            fragmentBuilder_BindBillPaymentReviewFragment.IconCompatParcelizer();
        }
    }
}

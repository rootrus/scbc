package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomSchedulePayment;

/* renamed from: o.submitAddressInformationFundAppForm */
public final /* synthetic */ class submitAddressInformationFundAppForm implements View.OnClickListener {
    private final /* synthetic */ CustomSchedulePayment write;

    public /* synthetic */ submitAddressInformationFundAppForm(CustomSchedulePayment customSchedulePayment) {
        this.write = customSchedulePayment;
    }

    public final void onClick(View view) {
        CustomSchedulePayment customSchedulePayment = this.write;
        if (customSchedulePayment.IconCompatParcelizer) {
            customSchedulePayment.spinner.performClick();
        }
    }
}

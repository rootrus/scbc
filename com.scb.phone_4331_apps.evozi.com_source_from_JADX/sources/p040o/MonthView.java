package p040o;

import com.scb.phone.view.activity.remittance.RemittanceTermsAndConsActivity;

/* renamed from: o.MonthView */
public final class MonthView implements MileageQuantitySelectionActivity<RemittanceTermsAndConsActivity> {
    public static void write(RemittanceTermsAndConsActivity remittanceTermsAndConsActivity, C5021nT nTVar) {
        remittanceTermsAndConsActivity.presenter = nTVar;
    }
}

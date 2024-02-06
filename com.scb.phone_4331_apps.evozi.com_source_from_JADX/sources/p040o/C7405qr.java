package p040o;

import com.scb.phone.view.activity.etb.EtbOtpActivity;

/* renamed from: o.qr */
public final class C7405qr implements MileageQuantitySelectionActivity<EtbOtpActivity> {
    public static void read(EtbOtpActivity etbOtpActivity, getSecondPassProgram getsecondpassprogram) {
        etbOtpActivity.presenter = getsecondpassprogram;
    }
}

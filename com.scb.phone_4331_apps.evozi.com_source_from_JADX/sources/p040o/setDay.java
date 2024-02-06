package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.ntb.EkycOtpActivity;

/* renamed from: o.setDay */
public final /* synthetic */ class setDay implements DialogInterface.OnClickListener {
    private final /* synthetic */ EkycOtpActivity read;

    public /* synthetic */ setDay(EkycOtpActivity ekycOtpActivity) {
        this.read = ekycOtpActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EkycOtpActivity ekycOtpActivity = this.read;
        dialogInterface.dismiss();
        ekycOtpActivity.onBackPressed();
    }
}

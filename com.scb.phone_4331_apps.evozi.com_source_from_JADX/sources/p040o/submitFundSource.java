package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomSchedulePayment;

/* renamed from: o.submitFundSource */
public final /* synthetic */ class submitFundSource implements View.OnClickListener {
    public static final /* synthetic */ submitFundSource MediaBrowserCompat$CustomActionResultReceiver = new submitFundSource();

    private /* synthetic */ submitFundSource() {
    }

    public final void onClick(View view) {
        CustomSchedulePayment.read();
    }
}

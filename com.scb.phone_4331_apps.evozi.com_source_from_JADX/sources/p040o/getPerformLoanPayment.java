package p040o;

import android.view.View;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider;

/* renamed from: o.getPerformLoanPayment */
public final /* synthetic */ class getPerformLoanPayment implements View.OnClickListener {
    private final /* synthetic */ CustomDeltaSlider read;
    private final /* synthetic */ int write;

    public /* synthetic */ getPerformLoanPayment(CustomDeltaSlider customDeltaSlider, int i) {
        this.read = customDeltaSlider;
        this.write = i;
    }

    public final void onClick(View view) {
        this.read.MediaBrowserCompat$CustomActionResultReceiver(this.write);
    }
}

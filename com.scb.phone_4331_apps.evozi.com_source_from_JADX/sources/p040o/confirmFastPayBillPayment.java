package p040o;

import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomDeltaInput;

/* renamed from: o.confirmFastPayBillPayment */
public final /* synthetic */ class confirmFastPayBillPayment implements AmountEditText.IconCompatParcelizer {
    private final /* synthetic */ CustomDeltaInput MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ confirmFastPayBillPayment(CustomDeltaInput customDeltaInput) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customDeltaInput;
    }

    public final void IconCompatParcelizer() {
        CustomDeltaInput customDeltaInput = this.MediaBrowserCompat$CustomActionResultReceiver;
        customDeltaInput.limitMessage.setFocusable(true);
        customDeltaInput.limitMessage.setFocusableInTouchMode(true);
        customDeltaInput.limitMessage.requestFocus();
        CustomDeltaInput.write write = customDeltaInput.MediaBrowserCompat$ItemReceiver;
        if (write != null) {
            customDeltaInput.MediaBrowserCompat$CustomActionResultReceiver();
            write.aC_();
        }
    }
}

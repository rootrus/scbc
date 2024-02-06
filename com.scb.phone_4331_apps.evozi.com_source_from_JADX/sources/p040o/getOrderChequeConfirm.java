package p040o;

import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.custom.login.CustomPinInput;

/* renamed from: o.getOrderChequeConfirm */
public final /* synthetic */ class getOrderChequeConfirm implements dump {
    private final /* synthetic */ CustomPinInput IconCompatParcelizer;

    public /* synthetic */ getOrderChequeConfirm(CustomPinInput customPinInput) {
        this.IconCompatParcelizer = customPinInput;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        ((ImageView) obj).setImageResource(this.IconCompatParcelizer.IconCompatParcelizer ? R.drawable.shape_pin_empty_white : R.drawable.shape_pin_empty);
    }
}

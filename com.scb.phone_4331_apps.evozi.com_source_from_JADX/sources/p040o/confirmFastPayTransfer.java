package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomDeltaInput;

/* renamed from: o.confirmFastPayTransfer */
public final /* synthetic */ class confirmFastPayTransfer implements View.OnClickListener {
    private final /* synthetic */ double MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CustomDeltaInput write;

    public /* synthetic */ confirmFastPayTransfer(CustomDeltaInput customDeltaInput, double d) {
        this.write = customDeltaInput;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
    }

    public final void onClick(View view) {
        this.write.read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

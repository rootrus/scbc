package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomProxyNumber;

/* renamed from: o.getSourceFundTypes */
public final /* synthetic */ class getSourceFundTypes implements View.OnFocusChangeListener {
    private final /* synthetic */ CustomProxyNumber read;

    public /* synthetic */ getSourceFundTypes(CustomProxyNumber customProxyNumber) {
        this.read = customProxyNumber;
    }

    public final void onFocusChange(View view, boolean z) {
        CustomProxyNumber.write write = this.read.MediaBrowserCompat$ItemReceiver;
        if (write != null) {
            write.MediaBrowserCompat$CustomActionResultReceiver(z);
        }
    }
}

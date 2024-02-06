package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomCardInformationInput;

/* renamed from: o.EligibilityService */
public final /* synthetic */ class EligibilityService implements View.OnFocusChangeListener {
    private final /* synthetic */ CustomCardInformationInput MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Runnable write;

    public /* synthetic */ EligibilityService(CustomCardInformationInput customCardInformationInput, Runnable runnable) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customCardInformationInput;
        this.write = runnable;
    }

    public final void onFocusChange(View view, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.write, z);
    }
}

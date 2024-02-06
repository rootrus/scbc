package p040o;

import android.view.View;
import com.scb.phone.view.activity.easycash.EasycashCreditPowerInputActivity;

/* renamed from: o.oM */
public final /* synthetic */ class C7282oM implements View.OnFocusChangeListener {
    private final /* synthetic */ EasycashCreditPowerInputActivity IconCompatParcelizer;

    public /* synthetic */ C7282oM(EasycashCreditPowerInputActivity easycashCreditPowerInputActivity) {
        this.IconCompatParcelizer = easycashCreditPowerInputActivity;
    }

    public final void onFocusChange(View view, boolean z) {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(z);
    }
}

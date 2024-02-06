package p040o;

import android.view.View;
import com.scb.phone.view.activity.easycash.EasycashCreditPowerInputActivity;

/* renamed from: o.pA */
public final /* synthetic */ class C7339pA implements View.OnFocusChangeListener {
    private final /* synthetic */ EasycashCreditPowerInputActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C7339pA(EasycashCreditPowerInputActivity easycashCreditPowerInputActivity) {
        this.MediaBrowserCompat$ItemReceiver = easycashCreditPowerInputActivity;
    }

    public final void onFocusChange(View view, boolean z) {
        this.MediaBrowserCompat$ItemReceiver.read(z);
    }
}

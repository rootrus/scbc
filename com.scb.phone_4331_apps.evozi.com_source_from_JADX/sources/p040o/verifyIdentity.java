package p040o;

import android.view.View;
import com.scb.phone.view.adapter.sme.gifting.MoneyPresentAdapter;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;

/* renamed from: o.verifyIdentity */
public final /* synthetic */ class verifyIdentity implements View.OnClickListener {
    private final /* synthetic */ MoneyPresentAdapter read;
    private final /* synthetic */ AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 write;

    public /* synthetic */ verifyIdentity(MoneyPresentAdapter moneyPresentAdapter, AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r2) {
        this.read = moneyPresentAdapter;
        this.write = r2;
    }

    public final void onClick(View view) {
        MoneyPresentAdapter moneyPresentAdapter = this.read;
        AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r0 = this.write;
        MoneyPresentAdapter.write write2 = moneyPresentAdapter.MediaBrowserCompat$ItemReceiver;
        if (write2 != null) {
            write2.read(r0);
        }
    }
}

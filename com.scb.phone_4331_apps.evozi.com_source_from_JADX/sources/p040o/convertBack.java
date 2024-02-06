package p040o;

import com.scb.phone.view.fragment.remittance.C6150x69d72700;

/* renamed from: o.convertBack */
public final /* synthetic */ class convertBack implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6150x69d72700 write;

    public /* synthetic */ convertBack(C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver) {
        this.write = remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(Boolean.valueOf(((setCurrentItemInternal) obj).getStatus().write().equals("1000")));
    }
}

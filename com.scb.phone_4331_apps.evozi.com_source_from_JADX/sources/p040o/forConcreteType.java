package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.remittance.C6150x69d72700;

/* renamed from: o.forConcreteType */
public final /* synthetic */ class forConcreteType implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6150x69d72700 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ forConcreteType(C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$CustomActionResultReceiver((getOuterRadius) ((SingleDataEntity) obj).getData()));
    }
}

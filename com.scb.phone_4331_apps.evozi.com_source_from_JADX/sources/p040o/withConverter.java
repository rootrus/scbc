package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.remittance.C6150x69d72700;

/* renamed from: o.withConverter */
public final /* synthetic */ class withConverter implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6150x69d72700 read;

    public /* synthetic */ withConverter(C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver) {
        this.read = remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver = this.read;
        SingleDataEntity<getInnerRadius> singleDataEntity = (SingleDataEntity) obj;
        remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = singleDataEntity;
        return remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(singleDataEntity);
    }
}

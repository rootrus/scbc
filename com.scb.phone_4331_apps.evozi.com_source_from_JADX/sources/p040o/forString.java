package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.remittance.C6150x69d72700;

/* renamed from: o.forString */
public final /* synthetic */ class forString implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ EnumBiMap IconCompatParcelizer;
    private final /* synthetic */ C6150x69d72700 write;

    public /* synthetic */ forString(C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver, EnumBiMap enumBiMap) {
        this.write = remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver;
        this.IconCompatParcelizer = enumBiMap;
    }

    public final Object write(Object obj) {
        C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver = this.write;
        EnumBiMap enumBiMap = this.IconCompatParcelizer;
        remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = (SingleDataEntity) obj;
        return remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(enumBiMap);
    }
}

package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.remittance.C6150x69d72700;
import java.util.HashMap;

/* renamed from: o.forConcreteTypeArray */
public final /* synthetic */ class forConcreteTypeArray implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C6150x69d72700 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ forConcreteTypeArray(C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver, String str) {
        this.MediaBrowserCompat$ItemReceiver = remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        FragmentBuilder_BindRegistrationPushNotificationFragment fragmentBuilder_BindRegistrationPushNotificationFragment = remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindRegistrationPushNotificationFragment.read == null) {
            fragmentBuilder_BindRegistrationPushNotificationFragment.read = new HashMap();
        }
        fragmentBuilder_BindRegistrationPushNotificationFragment.read.put(str, singleDataEntity);
    }
}

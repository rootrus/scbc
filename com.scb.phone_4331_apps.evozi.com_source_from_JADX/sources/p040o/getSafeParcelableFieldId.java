package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.remittance.C6150x69d72700;
import p040o.hasLocationAvailability;
import p040o.isLocationAvailable;

/* renamed from: o.getSafeParcelableFieldId */
public final /* synthetic */ class getSafeParcelableFieldId implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6150x69d72700 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getSafeParcelableFieldId(C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        getGoogleSignInAccount getgooglesigninaccount = this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
        getInnerRoundedness getinnerroundedness = (getInnerRoundedness) ((SingleDataEntity) obj).getData();
        isLocationAvailable.IconCompatParcelizer iconCompatParcelizer = new isLocationAvailable.IconCompatParcelizer((byte) 0);
        iconCompatParcelizer.write = getgooglesigninaccount.MediaBrowserCompat$CustomActionResultReceiver(getinnerroundedness.MediaBrowserCompat$ItemReceiver);
        getOuterRoundedness getouterroundedness = getinnerroundedness.MediaBrowserCompat$CustomActionResultReceiver;
        hasLocationAvailability.IconCompatParcelizer iconCompatParcelizer2 = new hasLocationAvailability.IconCompatParcelizer((byte) 0);
        iconCompatParcelizer2.write = getouterroundedness.read;
        iconCompatParcelizer2.IconCompatParcelizer = getouterroundedness.MediaBrowserCompat$ItemReceiver;
        iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = getouterroundedness.write;
        iconCompatParcelizer.read = new hasLocationAvailability(iconCompatParcelizer2, (byte) 0);
        return DebitCardResetOtpActivity.just(new isLocationAvailable(iconCompatParcelizer, (byte) 0));
    }
}

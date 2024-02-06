package p040o;

import com.scb.phone.domain.interactor.PinCase;
import p040o.zzmd;

/* renamed from: o.CameraPosition */
public final /* synthetic */ class CameraPosition implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ PinCase MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ CameraPosition(PinCase pinCase) {
        this.MediaBrowserCompat$ItemReceiver = pinCase;
    }

    public final Object write(Object obj) {
        PinCase pinCase = this.MediaBrowserCompat$ItemReceiver;
        ForwardingList forwardingList = (ForwardingList) obj;
        PlaceBuffer MediaBrowserCompat$ItemReceiver2 = pinCase.write.MediaBrowserCompat$ItemReceiver();
        standardEquals standardequals = new standardEquals();
        standardequals.MediaBrowserCompat$ItemReceiver = pinCase.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        standardequals.read = forwardingList.IconCompatParcelizer;
        standardequals.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2.read;
        if (!zzmd.zzn.FE_MOBILE.f2998id.equalsIgnoreCase(pinCase.write.MediaBrowserCompat$CustomActionResultReceiver())) {
            standardequals.write = forwardingList.MediaBrowserCompat$CustomActionResultReceiver;
            standardequals.MediaMetadataCompat = MediaBrowserCompat$ItemReceiver2.RatingCompat;
        }
        if (pinCase.MediaMetadataCompat.MediaMetadataCompat() != null) {
            standardequals.MediaBrowserCompat$SearchResultReceiver = new addCopies("EASYAPP", pinCase.MediaMetadataCompat.MediaMetadataCompat());
        }
        return standardequals;
    }

    /* renamed from: o.CameraPosition$Builder */
    public final /* synthetic */ class Builder implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ PinCase write;

        public /* synthetic */ Builder(PinCase pinCase) {
            this.write = pinCase;
        }

        public final Object write(Object obj) {
            PinCase pinCase = this.write;
            ForwardingList forwardingList = (ForwardingList) obj;
            PlaceBuffer MediaBrowserCompat$ItemReceiver = pinCase.write.MediaBrowserCompat$ItemReceiver();
            return new zzvc(forwardingList.IconCompatParcelizer, MediaBrowserCompat$ItemReceiver.read, pinCase.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(), forwardingList.MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver.RatingCompat);
        }
    }
}

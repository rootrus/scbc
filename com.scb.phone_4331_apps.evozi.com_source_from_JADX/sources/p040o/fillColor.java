package p040o;

import com.scb.phone.domain.interactor.PinCase;

/* renamed from: o.fillColor */
public final /* synthetic */ class fillColor implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ PinCase MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ fillColor(PinCase pinCase) {
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
        standardequals.write = forwardingList.MediaBrowserCompat$CustomActionResultReceiver;
        standardequals.MediaMetadataCompat = MediaBrowserCompat$ItemReceiver2.RatingCompat;
        return standardequals;
    }
}

package p040o;

import com.scb.phone.domain.interactor.PinCase;
import p040o.zzmd;

/* renamed from: o.clickable */
public final /* synthetic */ class clickable implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ PinCase write;

    public /* synthetic */ clickable(PinCase pinCase) {
        this.write = pinCase;
    }

    public final Object write(Object obj) {
        standardEquals standardequals;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        PinCase pinCase = this.write;
        ForwardingList forwardingList = (ForwardingList) obj;
        PlaceBuffer MediaBrowserCompat$ItemReceiver = pinCase.write.MediaBrowserCompat$ItemReceiver();
        String str6 = "";
        if (zzmd.zzn.MOVING_MIGRATE.f2998id.equalsIgnoreCase(pinCase.write.MediaBrowserCompat$CustomActionResultReceiver())) {
            standardequals = new standardEquals();
            standardequals.MediaBrowserCompat$ItemReceiver = pinCase.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
            if (forwardingList.IconCompatParcelizer != null) {
                str3 = forwardingList.IconCompatParcelizer;
            } else {
                str3 = str6;
            }
            standardequals.read = str3;
            if (MediaBrowserCompat$ItemReceiver != null) {
                str4 = MediaBrowserCompat$ItemReceiver.read;
            } else {
                str4 = str6;
            }
            standardequals.IconCompatParcelizer = str4;
            if (forwardingList.MediaBrowserCompat$CustomActionResultReceiver != null) {
                str5 = forwardingList.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                str5 = str6;
            }
            standardequals.write = str5;
            if (MediaBrowserCompat$ItemReceiver != null) {
                str6 = MediaBrowserCompat$ItemReceiver.RatingCompat;
            }
            standardequals.MediaMetadataCompat = str6;
        } else if (zzmd.zzn.FE_MOBILE.f2998id.equalsIgnoreCase(pinCase.write.MediaBrowserCompat$CustomActionResultReceiver())) {
            standardequals = new standardEquals();
            standardequals.MediaBrowserCompat$ItemReceiver = pinCase.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
            if (forwardingList.IconCompatParcelizer != null) {
                str2 = forwardingList.IconCompatParcelizer;
            } else {
                str2 = str6;
            }
            standardequals.read = str2;
            if (MediaBrowserCompat$ItemReceiver != null) {
                str6 = MediaBrowserCompat$ItemReceiver.read;
            }
            standardequals.IconCompatParcelizer = str6;
        } else {
            standardequals = new standardEquals();
            standardequals.MediaBrowserCompat$ItemReceiver = pinCase.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
            if (forwardingList.MediaBrowserCompat$CustomActionResultReceiver != null) {
                str = forwardingList.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                str = str6;
            }
            standardequals.write = str;
            if (MediaBrowserCompat$ItemReceiver != null) {
                str6 = MediaBrowserCompat$ItemReceiver.RatingCompat;
            }
            standardequals.MediaMetadataCompat = str6;
        }
        return pinCase.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(standardequals);
    }
}

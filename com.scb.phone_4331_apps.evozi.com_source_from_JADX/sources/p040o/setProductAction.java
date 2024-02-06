package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.SupportStreetViewPanoramaFragment;

/* renamed from: o.setProductAction */
public final class setProductAction extends FragmentBuilder_BindSummaryFragment {
    public final SupportStreetViewPanoramaFragment.zzb MediaBrowserCompat$ItemReceiver(isSuccessful issuccessful) {
        isCompassEnabled iscompassenabled;
        OffsetDateTime offsetDateTime;
        isIndoorLevelPickerEnabled isindoorlevelpickerenabled;
        onGetStartedClick.write((Object) issuccessful, "entity");
        isRotateGesturesEnabled isrotategesturesenabled = null;
        try {
            String str = issuccessful.IconCompatParcelizer;
            if (str == null) {
                str = "";
            }
            iscompassenabled = isCompassEnabled.valueOf(str);
        } catch (IllegalArgumentException unused) {
            iscompassenabled = null;
        }
        String str2 = issuccessful.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            offsetDateTime = FragmentBuilder_BindSummaryFragment.write(str2, (OffsetDateTime) null);
        } else {
            offsetDateTime = null;
        }
        String str3 = issuccessful.MediaMetadataCompat;
        String str4 = issuccessful.read;
        String str5 = issuccessful.RatingCompat;
        String str6 = issuccessful.MediaDescriptionCompat;
        Double d = issuccessful.write;
        prefix prefix = issuccessful.MediaBrowserCompat$MediaItem;
        if (prefix != null) {
            isindoorlevelpickerenabled = prefix.write();
        } else {
            isindoorlevelpickerenabled = null;
        }
        DeepLinkUri deepLinkUri = issuccessful.MediaBrowserCompat$ItemReceiver;
        if (deepLinkUri != null) {
            isrotategesturesenabled = deepLinkUri.read();
        }
        return new SupportStreetViewPanoramaFragment.zzb(offsetDateTime, str3, str4, str5, str6, d, iscompassenabled, isindoorlevelpickerenabled, isrotategesturesenabled);
    }
}

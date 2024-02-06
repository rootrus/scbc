package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.setAllowableAccountsTypes */
public final class setAllowableAccountsTypes extends FragmentBuilder_BindSummaryFragment {
    public final LocationSettingsStates IconCompatParcelizer(setVisible setvisible) {
        LocationSettingsStates locationSettingsStates = new LocationSettingsStates();
        locationSettingsStates.MediaBrowserCompat$MediaItem = setvisible.MediaDescriptionCompat;
        locationSettingsStates.MediaBrowserCompat$ItemReceiver = setvisible.read;
        locationSettingsStates.read = setvisible.IconCompatParcelizer;
        removeAnimation removeanimation = setvisible.MediaBrowserCompat$ItemReceiver;
        isLocationPresent islocationpresent = new isLocationPresent();
        islocationpresent.IconCompatParcelizer = removeanimation.IconCompatParcelizer;
        locationSettingsStates.MediaBrowserCompat$CustomActionResultReceiver = islocationpresent;
        locationSettingsStates.MediaMetadataCompat = setvisible.MediaBrowserCompat$SearchResultReceiver;
        locationSettingsStates.RatingCompat = setvisible.MediaMetadataCompat;
        locationSettingsStates.MediaSessionCompat$Token = setvisible.MediaBrowserCompat$MediaItem;
        locationSettingsStates.write = IconCompatParcelizer(setvisible.MediaBrowserCompat$CustomActionResultReceiver);
        List<hasMasksOnThisLayer> list = setvisible.write;
        ArrayList arrayList = new ArrayList();
        for (hasMasksOnThisLayer next : list) {
            isBlePresent isblepresent = new isBlePresent();
            isblepresent.MediaBrowserCompat$ItemReceiver = next.IconCompatParcelizer;
            isblepresent.MediaBrowserCompat$CustomActionResultReceiver = next.read;
            arrayList.add(isblepresent);
        }
        locationSettingsStates.MediaBrowserCompat$SearchResultReceiver = arrayList;
        return locationSettingsStates;
    }
}

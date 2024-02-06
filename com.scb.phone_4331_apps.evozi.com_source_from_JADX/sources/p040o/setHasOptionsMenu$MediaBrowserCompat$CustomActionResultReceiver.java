package p040o;

import java.io.File;

/* renamed from: o.setHasOptionsMenu$MediaBrowserCompat$CustomActionResultReceiver */
public class setHasOptionsMenu$MediaBrowserCompat$CustomActionResultReceiver<Data> implements setReenterTransition<File, Data> {
    private final setHasOptionsMenu$MediaBrowserCompat$ItemReceiver<Data> MediaBrowserCompat$CustomActionResultReceiver;

    public setHasOptionsMenu$MediaBrowserCompat$CustomActionResultReceiver(setHasOptionsMenu$MediaBrowserCompat$ItemReceiver<Data> sethasoptionsmenu_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = sethasoptionsmenu_mediabrowsercompat_itemreceiver;
    }

    public final setSharedElementEnterTransition<File, Data> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
        return new setHasOptionsMenu(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

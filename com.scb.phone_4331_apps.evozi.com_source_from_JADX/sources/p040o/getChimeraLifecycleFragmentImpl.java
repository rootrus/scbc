package p040o;

/* renamed from: o.getChimeraLifecycleFragmentImpl */
public final class getChimeraLifecycleFragmentImpl extends FragmentBuilder_BindSummaryFragment {
    public static setUserNavigationEnabled MediaBrowserCompat$CustomActionResultReceiver(getPathList getpathlist) {
        setUserNavigationEnabled setusernavigationenabled = new setUserNavigationEnabled();
        setusernavigationenabled.MediaBrowserCompat$SearchResultReceiver = getpathlist.MediaBrowserCompat$SearchResultReceiver;
        setusernavigationenabled.MediaBrowserCompat$MediaItem = getpathlist.MediaDescriptionCompat;
        setusernavigationenabled.MediaMetadataCompat = getpathlist.MediaBrowserCompat$MediaItem;
        setusernavigationenabled.MediaBrowserCompat$ItemReceiver = getpathlist.write;
        setusernavigationenabled.RatingCompat = getpathlist.RatingCompat;
        setusernavigationenabled.read = getpathlist.MediaBrowserCompat$ItemReceiver;
        setusernavigationenabled.write = getpathlist.MediaBrowserCompat$CustomActionResultReceiver;
        setusernavigationenabled.MediaBrowserCompat$CustomActionResultReceiver = getpathlist.IconCompatParcelizer;
        setusernavigationenabled.IconCompatParcelizer = getpathlist.read;
        return setusernavigationenabled;
    }
}

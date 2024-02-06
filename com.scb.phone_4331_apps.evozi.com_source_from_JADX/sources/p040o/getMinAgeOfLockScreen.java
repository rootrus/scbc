package p040o;

/* renamed from: o.getMinAgeOfLockScreen */
public final class getMinAgeOfLockScreen extends FragmentBuilder_BindSummaryFragment {
    public static StreetViewPanoramaOptions MediaBrowserCompat$CustomActionResultReceiver(fromJsonInputStream fromjsoninputstream) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12 = null;
        if (fromjsoninputstream == null) {
            return null;
        }
        StreetViewPanoramaOptions write = StreetViewPanoramaOptions.write();
        write.ParcelableVolumeInfo = 0;
        write.MediaDescriptionCompat = position.NORMALL_BILLER;
        createResultAndNotify createresultandnotify = fromjsoninputstream.IconCompatParcelizer;
        if (createresultandnotify != null) {
            str = createresultandnotify.read;
        } else {
            str = null;
        }
        write.MediaBrowserCompat$SearchResultReceiver = str;
        createResultAndNotify createresultandnotify2 = fromjsoninputstream.read;
        if (createresultandnotify2 != null) {
            str2 = createresultandnotify2.read;
        } else {
            str2 = null;
        }
        write.RatingCompat = str2;
        createResultAndNotify createresultandnotify3 = fromjsoninputstream.IconCompatParcelizer;
        if (createresultandnotify3 != null) {
            str3 = createresultandnotify3.read;
        } else {
            str3 = null;
        }
        write.MediaBrowserCompat$MediaItem = str3;
        createResultAndNotify createresultandnotify4 = fromjsoninputstream.read;
        if (createresultandnotify4 != null) {
            str4 = createresultandnotify4.read;
        } else {
            str4 = null;
        }
        write.MediaMetadataCompat = str4;
        write.MediaBrowserCompat$CustomActionResultReceiver = fromjsoninputstream.write;
        write.read = fromjsoninputstream.MediaBrowserCompat$ItemReceiver;
        write.f2790x50fd9e4a = fromjsoninputstream.MediaBrowserCompat$CustomActionResultReceiver;
        write.AppCompatViewInflater = fromjsoninputstream.RatingCompat;
        write.setExpandedFormat = fromjsoninputstream.MediaMetadataCompat;
        write.setPopupCallback = fromjsoninputstream.MediaBrowserCompat$MediaItem;
        createResultAndNotify createresultandnotify5 = fromjsoninputstream.IconCompatParcelizer;
        if (createresultandnotify5 != null) {
            str5 = createresultandnotify5.IconCompatParcelizer;
        } else {
            str5 = null;
        }
        write.AppCompatDelegateImpl$ListMenuDecorView = str5;
        createResultAndNotify createresultandnotify6 = fromjsoninputstream.read;
        if (createresultandnotify6 != null) {
            str6 = createresultandnotify6.IconCompatParcelizer;
        } else {
            str6 = null;
        }
        write.setBackgroundResource = str6;
        createResultAndNotify createresultandnotify7 = fromjsoninputstream.IconCompatParcelizer;
        if (createresultandnotify7 != null) {
            str7 = createresultandnotify7.MediaBrowserCompat$ItemReceiver;
        } else {
            str7 = null;
        }
        write.AppCompatDialogFragment = str7;
        createResultAndNotify createresultandnotify8 = fromjsoninputstream.read;
        if (createresultandnotify8 != null) {
            str8 = createresultandnotify8.MediaBrowserCompat$ItemReceiver;
        } else {
            str8 = null;
        }
        write.setChecked = str8;
        createResultAndNotify createresultandnotify9 = fromjsoninputstream.IconCompatParcelizer;
        if (createresultandnotify9 != null) {
            str9 = createresultandnotify9.write;
        } else {
            str9 = null;
        }
        write.PlaybackStateCompat$CustomAction = str9;
        createResultAndNotify createresultandnotify10 = fromjsoninputstream.read;
        if (createresultandnotify10 != null) {
            str10 = createresultandnotify10.write;
        } else {
            str10 = null;
        }
        write.AlertController$RecycleListView = str10;
        createResultAndNotify createresultandnotify11 = fromjsoninputstream.IconCompatParcelizer;
        if (createresultandnotify11 != null) {
            str11 = createresultandnotify11.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str11 = null;
        }
        write.Keep = str11;
        createResultAndNotify createresultandnotify12 = fromjsoninputstream.read;
        if (createresultandnotify12 != null) {
            str12 = createresultandnotify12.MediaBrowserCompat$CustomActionResultReceiver;
        }
        write.setHasDecor = str12;
        write.MediaSessionCompat$Token = fromjsoninputstream.MediaBrowserCompat$SearchResultReceiver;
        return write;
    }
}

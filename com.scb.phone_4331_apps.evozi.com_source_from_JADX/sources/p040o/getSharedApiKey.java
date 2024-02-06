package p040o;

import p040o.onMapLongClick;

/* renamed from: o.getSharedApiKey */
public final class getSharedApiKey extends FragmentBuilder_BindSummaryFragment {
    public static onMapLongClick MediaBrowserCompat$ItemReceiver(int i, String str, String str2, String str3, String str4, String str5) {
        onMapLongClick.write write = new onMapLongClick.write();
        write.MediaBrowserCompat$SearchResultReceiver = i;
        write.read = str;
        write.MediaBrowserCompat$ItemReceiver = str2;
        write.MediaBrowserCompat$MediaItem = str3;
        write.IconCompatParcelizer = str4;
        write.write = str5;
        return new onMapLongClick(write, (byte) 0);
    }

    public static onMapLongClick read(int i, String str, String str2, String str3) {
        onMapLongClick.write write = new onMapLongClick.write();
        write.MediaBrowserCompat$SearchResultReceiver = i;
        write.read = str;
        write.MediaBrowserCompat$ItemReceiver = str2;
        write.MediaBrowserCompat$MediaItem = str3;
        return new onMapLongClick(write, (byte) 0);
    }
}

package p040o;

import androidx.recyclerview.widget.RecyclerView;
import p040o.setOnCloseListener;

/* renamed from: o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver */
public class C1539x5a6c48da {
    private static setOnCloseListener.read<C1539x5a6c48da> MediaBrowserCompat$CustomActionResultReceiver = new setOnCloseListener$MediaBrowserCompat$CustomActionResultReceiver(20);
    public RecyclerView.MediaMetadataCompat.IconCompatParcelizer IconCompatParcelizer;
    public int MediaBrowserCompat$ItemReceiver;
    RecyclerView.MediaMetadataCompat.IconCompatParcelizer write;

    private C1539x5a6c48da() {
    }

    public static C1539x5a6c48da write() {
        C1539x5a6c48da read = MediaBrowserCompat$CustomActionResultReceiver.read();
        return read == null ? new C1539x5a6c48da() : read;
    }

    static void MediaBrowserCompat$ItemReceiver(C1539x5a6c48da setstatusbarbackground_mediabrowsercompat_customactionresultreceiver) {
        setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = 0;
        setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = null;
        setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.write = null;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(setstatusbarbackground_mediabrowsercompat_customactionresultreceiver);
    }

    public static void read() {
        do {
        } while (MediaBrowserCompat$CustomActionResultReceiver.read() != null);
    }
}

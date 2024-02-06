package p040o;

import java.util.List;
import p040o.Synchronized;

/* renamed from: o.multimap  reason: case insensitive filesystem */
public final /* synthetic */ class C10850multimap implements dump {
    private final /* synthetic */ Synchronized.C38331 IconCompatParcelizer;
    private final /* synthetic */ discardOldLogFiles MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ C10850multimap(Synchronized.C38331 r1, discardOldLogFiles discardoldlogfiles, String str) {
        this.IconCompatParcelizer = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = discardoldlogfiles;
        this.read = str;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        Synchronized.C38331 r0 = this.IconCompatParcelizer;
        discardOldLogFiles discardoldlogfiles = this.MediaBrowserCompat$CustomActionResultReceiver;
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver = r0.MediaBrowserCompat$ItemReceiver((PlaceLikelihoodBuffer) obj, this.read);
        int size = discardoldlogfiles.read.size();
        List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list = discardoldlogfiles.read;
        MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = (long) size;
        list.add(size, MediaBrowserCompat$ItemReceiver);
    }
}

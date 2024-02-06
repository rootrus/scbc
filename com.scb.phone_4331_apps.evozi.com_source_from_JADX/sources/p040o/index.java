package p040o;

import java.util.List;

/* renamed from: o.index */
public final /* synthetic */ class index implements getAllowEnterTransitionOverlap {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ unmodifiableMultimap MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ index(unmodifiableMultimap unmodifiablemultimap, List list) {
        this.MediaBrowserCompat$ItemReceiver = unmodifiablemultimap;
        this.IconCompatParcelizer = list;
    }

    public final Object read(int i) {
        unmodifiableMultimap unmodifiablemultimap = this.MediaBrowserCompat$ItemReceiver;
        List list = this.IconCompatParcelizer;
        unmodifiableAsMapEntry unmodifiableasmapentry = unmodifiablemultimap.read;
        C5440xe8e92d2 unmodifiableasmapentry_mediabrowsercompat_customactionresultreceiver = new C5440xe8e92d2((getSnippet) list.get(i), i);
        return unmodifiableasmapentry.write(unmodifiableasmapentry_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer, unmodifiableasmapentry_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

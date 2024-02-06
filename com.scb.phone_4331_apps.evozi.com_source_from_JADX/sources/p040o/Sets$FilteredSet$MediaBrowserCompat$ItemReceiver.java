package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.Sets$FilteredSet$MediaBrowserCompat$ItemReceiver */
public final class Sets$FilteredSet$MediaBrowserCompat$ItemReceiver implements findFragmentByWho {
    private final /* synthetic */ getStatusCodeString write;

    private Sets$FilteredSet$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ Sets$FilteredSet$MediaBrowserCompat$ItemReceiver(getStatusCodeString getstatuscodestring) {
        this.write = getstatuscodestring;
    }

    public final Object IconCompatParcelizer(Object obj) {
        fromInputStream frominputstream = (fromInputStream) obj;
        setAnchor setanchor = new setAnchor();
        setanchor.MediaBrowserCompat$ItemReceiver = frominputstream.read;
        setanchor.MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindSummaryFragment.write(frominputstream.MediaBrowserCompat$CustomActionResultReceiver, (OffsetDateTime) null);
        setanchor.write = frominputstream.write;
        return setanchor;
    }
}

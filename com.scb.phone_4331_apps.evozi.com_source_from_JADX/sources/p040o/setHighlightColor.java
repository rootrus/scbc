package p040o;

import p040o.GoogleMap;
import p040o.LevelnessEvent;
import p040o.writeUInt64NoTag;

/* renamed from: o.setHighlightColor */
public final /* synthetic */ class setHighlightColor implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ LevelnessEvent.C35632 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ GoogleMap.OnMapLongClickListener write;

    public /* synthetic */ setHighlightColor(LevelnessEvent.C35632 r1, boolean z, GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.IconCompatParcelizer = z;
        this.write = onMapLongClickListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        LevelnessEvent.C35632 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((PassportParameters_MembersInjector) obj).write(this.IconCompatParcelizer, LevelnessEvent.IconCompatParcelizer(), LevelnessEvent.this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(this.write));
    }
}

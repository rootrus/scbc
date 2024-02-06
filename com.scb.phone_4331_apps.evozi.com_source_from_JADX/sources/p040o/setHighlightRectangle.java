package p040o;

import p040o.CheckWorkflowActivity;
import p040o.SingletonImmutableMap;
import p040o.setCropLineStyle;
import p040o.writeUInt64NoTag;

/* renamed from: o.setHighlightRectangle */
public final /* synthetic */ class setHighlightRectangle implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setCropLineStyle.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getPlaceTypes read;

    public /* synthetic */ setHighlightRectangle(setCropLineStyle.read read2, getPlaceTypes getplacetypes) {
        this.MediaBrowserCompat$ItemReceiver = read2;
        this.read = getplacetypes;
    }

    public final void IconCompatParcelizer(Object obj) {
        setCropLineStyle.read read2 = this.MediaBrowserCompat$ItemReceiver;
        getPlaceTypes getplacetypes = this.read;
        String str = getplacetypes.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        String str2 = getplacetypes.MediaBrowserCompat$CustomActionResultReceiver.read;
        SingletonImmutableMap.Values unused = setCropLineStyle.this.Keep;
        ((CheckWorkflowActivity.C64001) obj).write(str, str2, SingletonImmutableMap.Values.write(getplacetypes.MediaBrowserCompat$ItemReceiver, "O"));
    }
}

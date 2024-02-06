package p040o;

import java.util.List;
import p040o.CheckExtractor_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeWriteTiffImage */
public final /* synthetic */ class nativeWriteTiffImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ writePngImage$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ nativeWriteTiffImage(writePngImage$MediaBrowserCompat$CustomActionResultReceiver writepngimage_mediabrowsercompat_customactionresultreceiver, List list) {
        this.IconCompatParcelizer = writepngimage_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        writePngImage$MediaBrowserCompat$CustomActionResultReceiver writepngimage_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
        ((CheckExtractor_MembersInjector.IconCompatParcelizer) obj).write(constrainedSortedSetMultimap.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, new constrainedMap(writepngimage_mediabrowsercompat_customactionresultreceiver.write.read, writepngimage_mediabrowsercompat_customactionresultreceiver.read)));
    }
}

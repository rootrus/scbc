package p040o;

import p040o.AppStatsSqLiteDs;
import p040o.writeUInt64NoTag;

/* renamed from: o.isError */
public final /* synthetic */ class isError implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ doWriteToLog MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ AppStatsSqLiteDs.C3040a MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isError(AppStatsSqLiteDs.C3040a aVar, doWriteToLog dowritetolog) {
        this.MediaBrowserCompat$ItemReceiver = aVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = dowritetolog;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsSqLiteDs.C3040a aVar = this.MediaBrowserCompat$ItemReceiver;
        doWriteToLog dowritetolog = this.MediaBrowserCompat$CustomActionResultReceiver;
        ICheckExtractorListener$MediaBrowserCompat$ItemReceiver iCheckExtractorListener$MediaBrowserCompat$ItemReceiver = (ICheckExtractorListener$MediaBrowserCompat$ItemReceiver) obj;
        if (dowritetolog == null || dowritetolog.MediaMetadataCompat == null) {
            iCheckExtractorListener$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
            return;
        }
        aVar.MediaBrowserCompat$MediaItem = dowritetolog.MediaBrowserCompat$SearchResultReceiver;
        int i = dowritetolog.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver;
        aVar.read = i;
        if (i <= 1) {
            iCheckExtractorListener$MediaBrowserCompat$ItemReceiver.write();
        }
        iCheckExtractorListener$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(dowritetolog.MediaMetadataCompat.read);
    }
}

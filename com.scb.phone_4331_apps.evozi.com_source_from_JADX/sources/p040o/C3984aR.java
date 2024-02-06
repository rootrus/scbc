package p040o;

import p040o.AppStatsSqLiteDs;
import p040o.writeUInt64NoTag;

/* renamed from: o.aR */
public final /* synthetic */ class C3984aR implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ doWriteToLog MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ AppStatsSqLiteDs.C3040a.C30424 read;

    public /* synthetic */ C3984aR(AppStatsSqLiteDs.C3040a.C30424 r1, doWriteToLog dowritetolog) {
        this.read = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = dowritetolog;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsSqLiteDs.C3040a.C30424 r0 = this.read;
        doWriteToLog dowritetolog = this.MediaBrowserCompat$CustomActionResultReceiver;
        ICheckExtractorListener$MediaBrowserCompat$ItemReceiver iCheckExtractorListener$MediaBrowserCompat$ItemReceiver = (ICheckExtractorListener$MediaBrowserCompat$ItemReceiver) obj;
        if (dowritetolog.MediaMetadataCompat == null || dowritetolog.MediaMetadataCompat.read == null || dowritetolog.MediaMetadataCompat.read.isEmpty()) {
            iCheckExtractorListener$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
            return;
        }
        int unused = AppStatsSqLiteDs.C3040a.this.read = dowritetolog.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver;
        if (AppStatsSqLiteDs.C3040a.this.read <= 1) {
            iCheckExtractorListener$MediaBrowserCompat$ItemReceiver.write();
        }
        iCheckExtractorListener$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(dowritetolog.MediaMetadataCompat.read);
    }
}

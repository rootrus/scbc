package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.jm */
public final /* synthetic */ class C4874jm implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4889kC read;

    public /* synthetic */ C4874jm(C4889kC kCVar, String str) {
        this.read = kCVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4889kC kCVar = this.read;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        setExecution setexecution = kCVar.write;
        ((getMicr) obj).write(setexecution, kCVar.MediaBrowserCompat$MediaItem, C4889kC.MediaBrowserCompat$CustomActionResultReceiver(str, setexecution.read), kCVar.MediaDescriptionCompat ? 1 : 0);
    }
}

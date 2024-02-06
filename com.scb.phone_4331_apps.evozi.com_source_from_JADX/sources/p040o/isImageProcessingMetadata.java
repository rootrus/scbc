package p040o;

import java.util.ArrayList;
import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.isImageProcessingMetadata */
public final /* synthetic */ class isImageProcessingMetadata implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ didCrashOnPreviousExecution MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isImageProcessingMetadata(didCrashOnPreviousExecution didcrashonpreviousexecution) {
        this.MediaBrowserCompat$ItemReceiver = didcrashonpreviousexecution;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.RttiExceptionResponseDeserializer) obj).write(this.MediaBrowserCompat$ItemReceiver.read.IconCompatParcelizer.get(this.MediaBrowserCompat$ItemReceiver.read.read), new ArrayList(this.MediaBrowserCompat$ItemReceiver.read.IconCompatParcelizer.values()), getPageID$MediaBrowserCompat$ItemReceiver.RESIDENCE_TYPE);
    }
}

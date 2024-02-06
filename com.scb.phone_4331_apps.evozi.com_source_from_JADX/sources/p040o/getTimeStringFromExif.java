package p040o;

import java.util.ArrayList;
import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTimeStringFromExif */
public final /* synthetic */ class getTimeStringFromExif implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ didCrashOnPreviousExecution MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getTimeStringFromExif(didCrashOnPreviousExecution didcrashonpreviousexecution) {
        this.MediaBrowserCompat$ItemReceiver = didcrashonpreviousexecution;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.RttiExceptionResponseDeserializer) obj).write(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.IconCompatParcelizer.get(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.read), new ArrayList(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.IconCompatParcelizer.values()), getPageID$MediaBrowserCompat$ItemReceiver.MARITAL_STATUS);
    }
}

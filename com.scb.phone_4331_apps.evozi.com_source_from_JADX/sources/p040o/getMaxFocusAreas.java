package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.getMaxFocusAreas */
public final /* synthetic */ class getMaxFocusAreas implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ takePictureForCaptureExperience$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getMaxFocusAreas(takePictureForCaptureExperience$MediaBrowserCompat$ItemReceiver takepictureforcaptureexperience_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = takepictureforcaptureexperience_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.MediaDescriptionCompat) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
    }
}

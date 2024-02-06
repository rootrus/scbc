package p040o;

import p040o.CaptureGuidance;
import p040o.writeUInt64NoTag;

/* renamed from: o.CaptureGuidance$GuidanceSource$MediaBrowserCompat$MediaItem */
final class CaptureGuidance$GuidanceSource$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<injectOnDeviceExceptionDeserializer> {
    private /* synthetic */ CaptureGuidance.GuidanceSource read;
    private /* synthetic */ createFromAttributes write;

    CaptureGuidance$GuidanceSource$MediaBrowserCompat$MediaItem(CaptureGuidance.GuidanceSource guidanceSource, createFromAttributes createfromattributes) {
        this.read = guidanceSource;
        this.write = createfromattributes;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((injectOnDeviceExceptionDeserializer) obj).IconCompatParcelizer(this.read.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.write), this.read.MediaBrowserCompat$ItemReceiver, this.read.IconCompatParcelizer);
    }
}

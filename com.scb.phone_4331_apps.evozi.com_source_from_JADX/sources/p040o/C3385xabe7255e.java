package p040o;

import p040o.ExtractorResponse;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$SearchResultReceiver */
final class C3385xabe7255e<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.write> {
    private /* synthetic */ Component MediaBrowserCompat$CustomActionResultReceiver;

    C3385xabe7255e(Component component) {
        this.MediaBrowserCompat$CustomActionResultReceiver = component;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ExtractorResponse.write write = (ExtractorResponse.write) obj;
        write.write(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
        String str = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.PAPER.name())) {
            write.read(this.MediaBrowserCompat$CustomActionResultReceiver.read);
            write.write(this.MediaBrowserCompat$CustomActionResultReceiver.write);
            write.MediaBrowserCompat$CustomActionResultReceiver(false);
            write.write(true);
            write.read(true);
        } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.EMAIL.name())) {
            write.read(this.MediaBrowserCompat$CustomActionResultReceiver.read);
            write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
            write.MediaBrowserCompat$CustomActionResultReceiver(false);
            write.write(false);
            write.read(false);
        } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.EASYNET.name())) {
            write.read(this.MediaBrowserCompat$CustomActionResultReceiver.read);
            write.MediaBrowserCompat$CustomActionResultReceiver(true);
        }
    }
}

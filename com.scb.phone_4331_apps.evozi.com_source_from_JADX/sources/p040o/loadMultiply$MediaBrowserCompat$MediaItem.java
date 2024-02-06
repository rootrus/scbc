package p040o;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* renamed from: o.loadMultiply$MediaBrowserCompat$MediaItem */
final class loadMultiply$MediaBrowserCompat$MediaItem implements ObjectEncoder<loadTranslate> {
    static final loadMultiply$MediaBrowserCompat$MediaItem MediaBrowserCompat$ItemReceiver = new loadMultiply$MediaBrowserCompat$MediaItem();

    private loadMultiply$MediaBrowserCompat$MediaItem() {
    }

    public final void encode(Object obj, Object obj2) throws IOException {
        loadTranslate loadtranslate = (loadTranslate) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add("networkType", (Object) loadtranslate.MediaBrowserCompat$CustomActionResultReceiver());
        objectEncoderContext.add("mobileSubtype", (Object) loadtranslate.write());
    }
}

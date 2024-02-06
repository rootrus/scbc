package p040o;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* renamed from: o.loadMultiply$MediaBrowserCompat$ItemReceiver */
final class loadMultiply$MediaBrowserCompat$ItemReceiver implements ObjectEncoder<Long4> {
    static final loadMultiply$MediaBrowserCompat$ItemReceiver write = new loadMultiply$MediaBrowserCompat$ItemReceiver();

    private loadMultiply$MediaBrowserCompat$ItemReceiver() {
    }

    public final void encode(Object obj, Object obj2) throws IOException {
        Long4 long4 = (Long4) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add("sdkVersion", (Object) long4.MediaBrowserCompat$SearchResultReceiver());
        objectEncoderContext.add("model", (Object) long4.read());
        objectEncoderContext.add("hardware", (Object) long4.write());
        objectEncoderContext.add("device", (Object) long4.MediaBrowserCompat$CustomActionResultReceiver());
        objectEncoderContext.add("product", (Object) long4.MediaMetadataCompat());
        objectEncoderContext.add("osBuild", (Object) long4.MediaBrowserCompat$MediaItem());
        objectEncoderContext.add("manufacturer", (Object) long4.MediaBrowserCompat$ItemReceiver());
        objectEncoderContext.add("fingerprint", (Object) long4.IconCompatParcelizer());
    }
}

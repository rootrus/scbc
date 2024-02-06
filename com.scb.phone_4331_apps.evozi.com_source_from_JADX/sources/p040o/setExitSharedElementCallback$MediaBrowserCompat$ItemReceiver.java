package p040o;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p040o.setExitSharedElementCallback;

/* renamed from: o.setExitSharedElementCallback$MediaBrowserCompat$ItemReceiver */
public final class setExitSharedElementCallback$MediaBrowserCompat$ItemReceiver<Model> implements setReenterTransition<Model, InputStream> {
    private final setExitSharedElementCallback.read<InputStream> read = new setExitSharedElementCallback.read<InputStream>() {
        public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) throws IOException {
            ((InputStream) obj).close();
        }

        public final Class<InputStream> IconCompatParcelizer() {
            return InputStream.class;
        }

        public final /* synthetic */ Object IconCompatParcelizer(String str) throws IllegalArgumentException {
            if (str.startsWith("data:image")) {
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                } else if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                } else {
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
            } else {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }
    };

    public final setSharedElementEnterTransition<Model, InputStream> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
        return new setExitSharedElementCallback(this.read);
    }
}

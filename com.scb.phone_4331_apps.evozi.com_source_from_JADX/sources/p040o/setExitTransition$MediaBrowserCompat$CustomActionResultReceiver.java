package p040o;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: o.setExitTransition$MediaBrowserCompat$CustomActionResultReceiver */
public class setExitTransition$MediaBrowserCompat$CustomActionResultReceiver implements setReenterTransition<byte[], InputStream> {
    public final setSharedElementEnterTransition<byte[], InputStream> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
        return new setExitTransition(new setExitTransition$MediaBrowserCompat$ItemReceiver<InputStream>() {
            public final Class<InputStream> IconCompatParcelizer() {
                return InputStream.class;
            }

            public final /* synthetic */ Object write(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        });
    }
}

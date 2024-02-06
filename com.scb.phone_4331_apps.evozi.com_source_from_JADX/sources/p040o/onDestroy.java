package p040o;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: o.onDestroy */
public final class onDestroy extends onConfigurationChanged<ParcelFileDescriptor> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    public onDestroy(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public final Class<ParcelFileDescriptor> write() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object read(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}

package p040o;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.onOptionsItemSelected */
public final class onOptionsItemSelected extends onConfigurationChanged<InputStream> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    public onOptionsItemSelected(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public final Class<InputStream> write() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object read(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}

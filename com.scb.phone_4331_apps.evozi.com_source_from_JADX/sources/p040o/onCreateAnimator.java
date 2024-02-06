package p040o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: o.onCreateAnimator */
public final class onCreateAnimator extends onLowMemory<AssetFileDescriptor> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    public onCreateAnimator(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public final Class<AssetFileDescriptor> write() {
        return AssetFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object IconCompatParcelizer(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FileDescriptor is null for: ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }
}

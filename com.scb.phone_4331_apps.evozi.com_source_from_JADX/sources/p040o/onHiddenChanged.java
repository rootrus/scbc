package p040o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: o.onHiddenChanged */
public final class onHiddenChanged extends onLowMemory<ParcelFileDescriptor> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    public onHiddenChanged(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public final Class<ParcelFileDescriptor> write() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object IconCompatParcelizer(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FileDescriptor is null for: ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }
}

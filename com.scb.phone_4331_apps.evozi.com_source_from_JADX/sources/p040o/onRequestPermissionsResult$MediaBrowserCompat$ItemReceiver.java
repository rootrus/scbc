package p040o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: o.onRequestPermissionsResult$MediaBrowserCompat$ItemReceiver */
public class onRequestPermissionsResult$MediaBrowserCompat$ItemReceiver implements injectKtaCheckDeserializer {
    private static final String[] write = {"_data"};
    private final ContentResolver MediaBrowserCompat$CustomActionResultReceiver;

    public onRequestPermissionsResult$MediaBrowserCompat$ItemReceiver(ContentResolver contentResolver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = contentResolver;
    }

    public final Cursor MediaBrowserCompat$ItemReceiver(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.MediaBrowserCompat$CustomActionResultReceiver.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, write, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
    }
}

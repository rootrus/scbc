package p040o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p040o.CheckParameters;
import p040o.onCreateOptionsMenu;

/* renamed from: o.onRequestPermissionsResult */
public final class onRequestPermissionsResult implements onCreateOptionsMenu<InputStream> {
    private final onPictureInPictureModeChanged IconCompatParcelizer;
    private InputStream MediaBrowserCompat$CustomActionResultReceiver;
    private final Uri read;

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public static onRequestPermissionsResult read(Context context, Uri uri, injectKtaCheckDeserializer injectktacheckdeserializer) {
        CheckParameters.CheckCountry checkCountry = Glide.IconCompatParcelizer(context).write;
        List<ImageHeaderParser> write = Glide.IconCompatParcelizer(context).MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver.write();
        if (!write.isEmpty()) {
            return new onRequestPermissionsResult(uri, new onPictureInPictureModeChanged(write, injectktacheckdeserializer, checkCountry, context.getContentResolver()));
        }
        throw new Registry.NoImageHeaderParserException();
    }

    private onRequestPermissionsResult(Uri uri, onPictureInPictureModeChanged onpictureinpicturemodechanged) {
        this.read = uri;
        this.IconCompatParcelizer = onpictureinpicturemodechanged;
    }

    public final void read() {
        InputStream inputStream = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final Class<InputStream> write() {
        return InputStream.class;
    }

    public final isPostponed MediaBrowserCompat$ItemReceiver() {
        return isPostponed.LOCAL;
    }

    /* renamed from: o.onRequestPermissionsResult$read */
    public static class read implements injectKtaCheckDeserializer {
        private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"_data"};
        private final ContentResolver write;

        public read(ContentResolver contentResolver) {
            this.write = contentResolver;
        }

        public final Cursor MediaBrowserCompat$ItemReceiver(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.write.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, MediaBrowserCompat$CustomActionResultReceiver, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public final void IconCompatParcelizer(hasOptionsMenu hasoptionsmenu, onCreateOptionsMenu.IconCompatParcelizer<? super InputStream> iconCompatParcelizer) {
        try {
            InputStream read2 = this.IconCompatParcelizer.read(this.read);
            int MediaBrowserCompat$CustomActionResultReceiver2 = read2 != null ? this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.read) : -1;
            if (MediaBrowserCompat$CustomActionResultReceiver2 != -1) {
                read2 = new onCreateView(read2, MediaBrowserCompat$CustomActionResultReceiver2);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = read2;
            iconCompatParcelizer.read(read2);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(e);
        }
    }
}

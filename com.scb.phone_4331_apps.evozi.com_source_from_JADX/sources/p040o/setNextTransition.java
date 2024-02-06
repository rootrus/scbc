package p040o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import p040o.onCreateOptionsMenu;

/* renamed from: o.setNextTransition */
public final class setNextTransition implements setSharedElementEnterTransition<Uri, File> {
    private final Context read;

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        Uri uri = (Uri) obj;
        return new C1536x6a517a85(new unregisterListener(uri), new read(this.read, uri));
    }

    public final /* synthetic */ boolean write(Object obj) {
        return AlertController$RecycleListView.IconCompatParcelizer((Uri) obj);
    }

    public setNextTransition(Context context) {
        this.read = context;
    }

    /* renamed from: o.setNextTransition$read */
    static class read implements onCreateOptionsMenu<File> {
        private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"_data"};
        private final Context MediaBrowserCompat$ItemReceiver;
        private final Uri write;

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
        }

        public final void read() {
        }

        read(Context context, Uri uri) {
            this.MediaBrowserCompat$ItemReceiver = context;
            this.write = uri;
        }

        public final void IconCompatParcelizer(hasOptionsMenu hasoptionsmenu, onCreateOptionsMenu.IconCompatParcelizer<? super File> iconCompatParcelizer) {
            Cursor query = this.MediaBrowserCompat$ItemReceiver.getContentResolver().query(this.write, MediaBrowserCompat$CustomActionResultReceiver, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to find file path for: ");
                sb.append(this.write);
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(new FileNotFoundException(sb.toString()));
                return;
            }
            iconCompatParcelizer.read(new File(str));
        }

        public final Class<File> write() {
            return File.class;
        }

        public final isPostponed MediaBrowserCompat$ItemReceiver() {
            return isPostponed.LOCAL;
        }
    }

    /* renamed from: o.setNextTransition$write */
    public static final class write implements setReenterTransition<Uri, File> {
        private final Context read;

        public write(Context context) {
            this.read = context;
        }

        public final setSharedElementEnterTransition<Uri, File> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new setNextTransition(this.read);
        }
    }
}

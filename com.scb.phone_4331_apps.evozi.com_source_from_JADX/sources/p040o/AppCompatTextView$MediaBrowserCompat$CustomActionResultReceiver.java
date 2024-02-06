package p040o;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p040o.AppCompatTextView;

/* renamed from: o.AppCompatTextView$MediaBrowserCompat$CustomActionResultReceiver */
class AppCompatTextView$MediaBrowserCompat$CustomActionResultReceiver implements AppCompatTextView.read {
    final HashMap<String, File> IconCompatParcelizer = new HashMap<>();
    private final String MediaBrowserCompat$ItemReceiver;

    AppCompatTextView$MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final Uri write(File file) {
        String str;
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry next : this.IconCompatParcelizer.entrySet()) {
                String path = ((File) next.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = next;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    str = canonicalPath.substring(path2.length());
                } else {
                    str = canonicalPath.substring(path2.length() + 1);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Uri.encode((String) entry.getKey()));
                sb.append('/');
                sb.append(Uri.encode(str, "/"));
                return new Uri.Builder().scheme("content").authority(this.MediaBrowserCompat$ItemReceiver).encodedPath(sb.toString()).build();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to find configured root that contains ");
            sb2.append(canonicalPath);
            throw new IllegalArgumentException(sb2.toString());
        } catch (IOException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to resolve canonical path for ");
            sb3.append(file);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public final File IconCompatParcelizer(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = this.IconCompatParcelizer.get(decode);
        if (file != null) {
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to resolve canonical path for ");
                sb.append(file2);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to find configured root for ");
            sb2.append(uri);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}

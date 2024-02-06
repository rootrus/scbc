package p040o;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p040o.CheckParameters;

/* renamed from: o.onPictureInPictureModeChanged */
final class onPictureInPictureModeChanged {
    private static final ButtonBarLayout MediaBrowserCompat$CustomActionResultReceiver = new ButtonBarLayout();
    private final injectKtaCheckDeserializer IconCompatParcelizer;
    private final ContentResolver MediaBrowserCompat$ItemReceiver;
    private final List<ImageHeaderParser> read;
    private final CheckParameters.CheckCountry write;

    onPictureInPictureModeChanged(List<ImageHeaderParser> list, injectKtaCheckDeserializer injectktacheckdeserializer, CheckParameters.CheckCountry checkCountry, ContentResolver contentResolver) {
        this(list, MediaBrowserCompat$CustomActionResultReceiver, injectktacheckdeserializer, checkCountry, contentResolver);
    }

    private onPictureInPictureModeChanged(List<ImageHeaderParser> list, ButtonBarLayout buttonBarLayout, injectKtaCheckDeserializer injectktacheckdeserializer, CheckParameters.CheckCountry checkCountry, ContentResolver contentResolver) {
        this.IconCompatParcelizer = injectktacheckdeserializer;
        this.write = checkCountry;
        this.MediaBrowserCompat$ItemReceiver = contentResolver;
        this.read = list;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.MediaBrowserCompat$ItemReceiver.openInputStream(uri);
            int IconCompatParcelizer2 = AlertController$RecycleListView.IconCompatParcelizer(this.read, openInputStream, this.write);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return IconCompatParcelizer2;
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to open uri: ");
                sb.append(uri);
                Log.d("ThumbStreamOpener", sb.toString(), e);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public final InputStream read(Uri uri) throws FileNotFoundException {
        String write2 = write(uri);
        if (TextUtils.isEmpty(write2)) {
            return null;
        }
        File file = new File(write2);
        if (!(file.exists() && 0 < file.length())) {
            return null;
        }
        Uri fromFile = Uri.fromFile(file);
        try {
            return this.MediaBrowserCompat$ItemReceiver.openInputStream(fromFile);
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("NPE opening uri: ");
            sb.append(uri);
            sb.append(" -> ");
            sb.append(fromFile);
            throw ((FileNotFoundException) new FileNotFoundException(sb.toString()).initCause(e));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x001c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String write(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            o.injectKtaCheckDeserializer r2 = r6.IconCompatParcelizer     // Catch:{ SecurityException -> 0x0029, all -> 0x0027 }
            android.database.Cursor r2 = r2.MediaBrowserCompat$ItemReceiver(r7)     // Catch:{ SecurityException -> 0x0029, all -> 0x0027 }
            if (r2 == 0) goto L_0x0021
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x001f }
            if (r3 == 0) goto L_0x0021
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch:{ SecurityException -> 0x001f }
            if (r2 == 0) goto L_0x001b
            r2.close()
        L_0x001b:
            return r7
        L_0x001c:
            r7 = move-exception
            r1 = r2
            goto L_0x004d
        L_0x001f:
            r3 = move-exception
            goto L_0x002c
        L_0x0021:
            if (r2 == 0) goto L_0x0026
            r2.close()
        L_0x0026:
            return r1
        L_0x0027:
            r7 = move-exception
            goto L_0x004d
        L_0x0029:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x002c:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x001c }
            if (r4 == 0) goto L_0x0047
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x001c }
            r4.<init>()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch:{ all -> 0x001c }
            r4.append(r7)     // Catch:{ all -> 0x001c }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x001c }
            android.util.Log.d(r0, r7, r3)     // Catch:{ all -> 0x001c }
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.close()
        L_0x004c:
            return r1
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            r1.close()
        L_0x0052:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onPictureInPictureModeChanged.write(android.net.Uri):java.lang.String");
    }
}

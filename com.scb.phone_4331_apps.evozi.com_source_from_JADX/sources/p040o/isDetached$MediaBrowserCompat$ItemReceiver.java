package p040o;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import p040o.isDetached;

/* renamed from: o.isDetached$MediaBrowserCompat$ItemReceiver */
final class isDetached$MediaBrowserCompat$ItemReceiver {
    File[] IconCompatParcelizer;
    isDetached.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    final String MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ isDetached MediaBrowserCompat$MediaItem;
    boolean MediaBrowserCompat$SearchResultReceiver;
    long MediaMetadataCompat;
    final long[] read;
    File[] write;

    /* synthetic */ isDetached$MediaBrowserCompat$ItemReceiver(isDetached isdetached, String str, byte b) {
        this(isdetached, str);
    }

    private isDetached$MediaBrowserCompat$ItemReceiver(isDetached isdetached, String str) {
        this.MediaBrowserCompat$MediaItem = isdetached;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = new long[isdetached.read];
        this.write = new File[isdetached.read];
        this.IconCompatParcelizer = new File[isdetached.read];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < isdetached.read; i++) {
            sb.append(i);
            this.write[i] = new File(isdetached.MediaBrowserCompat$CustomActionResultReceiver, sb.toString());
            sb.append(".tmp");
            this.IconCompatParcelizer[i] = new File(isdetached.MediaBrowserCompat$CustomActionResultReceiver, sb.toString());
            sb.setLength(length);
        }
    }

    public final String IconCompatParcelizer() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (long append : this.read) {
            sb.append(' ');
            sb.append(append);
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(String[] strArr) throws IOException {
        if (strArr.length == this.MediaBrowserCompat$MediaItem.read) {
            int i = 0;
            while (i < strArr.length) {
                try {
                    this.read[i] = Long.parseLong(strArr[i]);
                    i++;
                } catch (NumberFormatException unused) {
                    throw read(strArr);
                }
            }
            return;
        }
        throw read(strArr);
    }

    private static IOException read(String[] strArr) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("unexpected journal line: ");
        sb.append(Arrays.toString(strArr));
        throw new IOException(sb.toString());
    }
}

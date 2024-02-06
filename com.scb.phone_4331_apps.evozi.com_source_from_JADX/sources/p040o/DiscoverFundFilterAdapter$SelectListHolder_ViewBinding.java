package p040o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.DiscoverFundFilterAdapter$SelectListHolder_ViewBinding */
final class DiscoverFundFilterAdapter$SelectListHolder_ViewBinding extends DiscoverFundsListAdapter$SuggestedFundHolder {
    private static final byte[] read = new byte[0];
    int IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;

    DiscoverFundFilterAdapter$SelectListHolder_ViewBinding(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i >= 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.IconCompatParcelizer = i;
            if (i == 0) {
                MediaBrowserCompat$CustomActionResultReceiver();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    /* access modifiers changed from: package-private */
    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int read() throws IOException {
        if (this.IconCompatParcelizer == 0) {
            return -1;
        }
        int read2 = this.write.read();
        if (read2 >= 0) {
            int i = this.IconCompatParcelizer - 1;
            this.IconCompatParcelizer = i;
            if (i == 0) {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
            return read2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DEF length ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(" object truncated by ");
        sb.append(this.IconCompatParcelizer);
        throw new EOFException(sb.toString());
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.IconCompatParcelizer;
        if (i3 == 0) {
            return -1;
        }
        int read2 = this.write.read(bArr, i, Math.min(i2, i3));
        if (read2 >= 0) {
            int i4 = this.IconCompatParcelizer - read2;
            this.IconCompatParcelizer = i4;
            if (i4 == 0) {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
            return read2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DEF length ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(" object truncated by ");
        sb.append(this.IconCompatParcelizer);
        throw new EOFException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final byte[] write() throws IOException {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            return read;
        }
        byte[] bArr = new byte[i];
        int MediaBrowserCompat$ItemReceiver = i - C6961xbba4702b.MediaBrowserCompat$ItemReceiver(this.write, bArr, i);
        this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver;
        if (MediaBrowserCompat$ItemReceiver == 0) {
            MediaBrowserCompat$CustomActionResultReceiver();
            return bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DEF length ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(" object truncated by ");
        sb.append(this.IconCompatParcelizer);
        throw new EOFException(sb.toString());
    }
}

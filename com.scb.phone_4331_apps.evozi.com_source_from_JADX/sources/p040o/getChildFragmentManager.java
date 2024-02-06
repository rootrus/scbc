package p040o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import p040o.getHost;

/* renamed from: o.getChildFragmentManager */
public final class getChildFragmentManager implements getBottomLeftCornerHeight {
    private final Context read;
    private final IntentFilter write;

    /* renamed from: o.getChildFragmentManager$write */
    public static class write extends C1323x727ec744<Integer, int[], newCheckExtractor> implements newCheckExtractor {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object[] MediaBrowserCompat$ItemReceiver() {
            return new int[8][];
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            return ((int[]) obj).length;
        }

        public final void IconCompatParcelizer(int i) {
            MediaBrowserCompat$CustomActionResultReceiver();
            int i2 = this.write;
            this.write = i2 + 1;
            ((int[]) this.MediaBrowserCompat$ItemReceiver)[i2] = i;
        }

        public final /* synthetic */ Iterator iterator() {
            return new getHost.read() {
                private long IconCompatParcelizer = 0;

                public final int MediaBrowserCompat$ItemReceiver() {
                    write write = write.this;
                    long j = this.IconCompatParcelizer;
                    this.IconCompatParcelizer = 1 + j;
                    int read = write.read(j);
                    if (write.IconCompatParcelizer == 0 && read == 0) {
                        return ((int[]) write.MediaBrowserCompat$ItemReceiver)[(int) j];
                    }
                    return ((int[][]) write.read)[read][(int) (j - write.MediaBrowserCompat$CustomActionResultReceiver[read])];
                }

                public final boolean hasNext() {
                    return this.IconCompatParcelizer < write.this.write();
                }
            };
        }

        public final /* bridge */ /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(int i) {
            return new int[i];
        }
    }

    public getChildFragmentManager(Context context, IntentFilter intentFilter) {
        this.read = context.getApplicationContext();
        this.write = intentFilter;
    }

    public final void IconCompatParcelizer(BroadcastReceiver broadcastReceiver) {
        this.read.registerReceiver(broadcastReceiver, this.write);
    }

    public final void MediaBrowserCompat$ItemReceiver(BroadcastReceiver broadcastReceiver) {
        this.read.unregisterReceiver(broadcastReceiver);
    }

    public getChildFragmentManager() {
    }

    public static byte[] IconCompatParcelizer(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read2 = inputStream.read(bArr);
            if (read2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read2);
        }
    }
}

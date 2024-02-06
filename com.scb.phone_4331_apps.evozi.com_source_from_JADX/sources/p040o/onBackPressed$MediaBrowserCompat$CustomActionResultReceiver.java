package p040o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.onBackPressed$MediaBrowserCompat$CustomActionResultReceiver */
final class onBackPressed$MediaBrowserCompat$CustomActionResultReceiver {
    final ByteBuffer MediaBrowserCompat$ItemReceiver;

    onBackPressed$MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, int i) {
        this.MediaBrowserCompat$ItemReceiver = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }
}

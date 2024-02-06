package p040o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Queue;
import p040o.AppCompatSeekBar;

/* renamed from: o.setColumnCount$MediaBrowserCompat$ItemReceiver */
class setColumnCount$MediaBrowserCompat$ItemReceiver {
    final Queue<AppCompatSeekBar.IconCompatParcelizer> write = LinearLayoutManager.IconCompatParcelizer(0);

    setColumnCount$MediaBrowserCompat$ItemReceiver() {
    }

    /* access modifiers changed from: package-private */
    public final AppCompatSeekBar.IconCompatParcelizer IconCompatParcelizer(ByteBuffer byteBuffer) {
        AppCompatSeekBar.IconCompatParcelizer poll;
        synchronized (this) {
            poll = this.write.poll();
            if (poll == null) {
                poll = new AppCompatSeekBar.IconCompatParcelizer();
            }
            poll.read = null;
            Arrays.fill(poll.MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
            poll.IconCompatParcelizer = new AppCompatSeekBar$MediaBrowserCompat$ItemReceiver();
            poll.MediaBrowserCompat$ItemReceiver = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            poll.read = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            poll.read.order(ByteOrder.LITTLE_ENDIAN);
        }
        return poll;
    }
}

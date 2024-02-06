package p040o;

import java.util.Calendar;

/* renamed from: o.ForwardingListenableFuture */
public interface ForwardingListenableFuture {
    String IconCompatParcelizer();

    String MediaBrowserCompat$CustomActionResultReceiver();

    int read();

    /* renamed from: o.ForwardingListenableFuture$SimpleForwardingListenableFuture */
    public class SimpleForwardingListenableFuture extends remainingCapacity {
        private final boolean IconCompatParcelizer;
        public final boolean MediaBrowserCompat$CustomActionResultReceiver;
        public final int MediaBrowserCompat$ItemReceiver;
        private final String read;

        public SimpleForwardingListenableFuture(int i, String str) {
            this(i, str, false);
        }

        public SimpleForwardingListenableFuture(int i, String str, boolean z) {
            this(i, str, z, false);
        }

        public SimpleForwardingListenableFuture(int i, String str, boolean z, boolean z2) {
            this.MediaBrowserCompat$ItemReceiver = i;
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            this.IconCompatParcelizer = z2;
        }

        public final String read() {
            StringBuilder sb = new StringBuilder(this.read);
            if (this.IconCompatParcelizer) {
                sb.append("_");
                sb.append(String.valueOf(Calendar.getInstance().getTimeInMillis()));
            }
            return sb.toString();
        }
    }
}

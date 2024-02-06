package okhttp3.repackaged.internal.framed;

import java.io.IOException;
import java.util.List;
import p040o.PinLoginActivity;

public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() {
        public final boolean onHeaders(int i, List<Header> list, boolean z) {
            return true;
        }

        public final boolean onRequest(int i, List<Header> list) {
            return true;
        }

        public final void onReset(int i, ErrorCode errorCode) {
        }

        public final boolean onData(int i, PinLoginActivity pinLoginActivity, int i2, boolean z) throws IOException {
            pinLoginActivity.MediaMetadataCompat((long) i2);
            return true;
        }
    };

    boolean onData(int i, PinLoginActivity pinLoginActivity, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}

package p040o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: o.setHideReplaced */
public final class setHideReplaced implements isInLayout<ByteBuffer> {
    public final /* bridge */ /* synthetic */ boolean read(Object obj, File file, onActivityResult onactivityresult) {
        return read((ByteBuffer) obj, file);
    }

    private static boolean read(ByteBuffer byteBuffer, File file) {
        try {
            stopLoading.MediaBrowserCompat$ItemReceiver(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}

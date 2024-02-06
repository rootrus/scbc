package p040o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.ScheduleBulkTransferActivity */
public interface ScheduleBulkTransferActivity {
    boolean MediaBrowserCompat$ItemReceiver(InputStream inputStream) throws IOException;

    boolean MediaDescriptionCompat() throws IOException;

    boolean read(InputStream inputStream) throws IOException;
}

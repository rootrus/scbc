package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;

public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel2) {
        onGetStartedClick.write((Object) fileChannel2, "fileChannel");
        this.fileChannel = fileChannel2;
    }

    public final void read(long j, SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j2) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.fileChannel.transferTo(j, j2, sCBUniversalWebViewActivity);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long j, SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j2) throws IOException {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "source");
        if (j2 < 0 || j2 > sCBUniversalWebViewActivity.read) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferFrom = this.fileChannel.transferFrom(sCBUniversalWebViewActivity, j, j2);
            j += transferFrom;
            j2 -= transferFrom;
        }
    }
}

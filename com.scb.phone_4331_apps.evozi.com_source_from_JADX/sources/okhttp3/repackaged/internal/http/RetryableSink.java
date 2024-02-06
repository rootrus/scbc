package okhttp3.repackaged.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.repackaged.internal.Util;
import p040o.ModifyQuickPromptPayActivity;
import p040o.QuickPromptPayActivity;
import p040o.onMenuPromptPayClick;

public final class RetryableSink implements QuickPromptPayActivity {
    private final onMenuPromptPayClick amt;
    private boolean closed;
    private final int limit;

    public final void flush() throws IOException {
    }

    public RetryableSink(int i) {
        this.amt = new onMenuPromptPayClick();
        this.limit = i;
    }

    public RetryableSink() {
        this(-1);
    }

    public final void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            if (this.amt.IconCompatParcelizer < ((long) this.limit)) {
                StringBuilder sb = new StringBuilder();
                sb.append("content-length promised ");
                sb.append(this.limit);
                sb.append(" bytes, but received ");
                sb.append(this.amt.IconCompatParcelizer);
                throw new ProtocolException(sb.toString());
            }
        }
    }

    public final void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
        if (!this.closed) {
            Util.checkOffsetAndCount(onmenupromptpayclick.IconCompatParcelizer, 0, j);
            if (this.limit == -1 || this.amt.IconCompatParcelizer <= ((long) this.limit) - j) {
                this.amt.write(onmenupromptpayclick, j);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("exceeded content-length limit of ");
            sb.append(this.limit);
            sb.append(" bytes");
            throw new ProtocolException(sb.toString());
        }
        throw new IllegalStateException("closed");
    }

    public final ModifyQuickPromptPayActivity timeout() {
        return ModifyQuickPromptPayActivity.NONE;
    }

    public final long contentLength() throws IOException {
        return this.amt.IconCompatParcelizer;
    }

    public final void writeToSocket(QuickPromptPayActivity quickPromptPayActivity) throws IOException {
        onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
        onMenuPromptPayClick onmenupromptpayclick2 = this.amt;
        onmenupromptpayclick2.MediaBrowserCompat$ItemReceiver(onmenupromptpayclick, 0, onmenupromptpayclick2.IconCompatParcelizer);
        quickPromptPayActivity.write(onmenupromptpayclick, onmenupromptpayclick.IconCompatParcelizer);
    }
}

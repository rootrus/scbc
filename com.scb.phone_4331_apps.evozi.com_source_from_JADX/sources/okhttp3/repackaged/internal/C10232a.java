package okhttp3.repackaged.internal;

import java.io.IOException;
import p040o.PreLoginActivity_ViewBinding;
import p040o.QuickPromptPayActivity;
import p040o.onMenuPromptPayClick;

/* renamed from: okhttp3.repackaged.internal.a */
class C10232a extends PreLoginActivity_ViewBinding {
    private boolean ajd;

    /* access modifiers changed from: protected */
    public void onException(IOException iOException) {
    }

    public C10232a(QuickPromptPayActivity quickPromptPayActivity) {
        super(quickPromptPayActivity);
    }

    public void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
        if (this.ajd) {
            onmenupromptpayclick.MediaMetadataCompat(j);
            return;
        }
        try {
            super.write(onmenupromptpayclick, j);
        } catch (IOException e) {
            this.ajd = true;
            onException(e);
        }
    }

    public void flush() throws IOException {
        if (!this.ajd) {
            try {
                super.flush();
            } catch (IOException e) {
                this.ajd = true;
                onException(e);
            }
        }
    }

    public void close() throws IOException {
        if (!this.ajd) {
            try {
                super.close();
            } catch (IOException e) {
                this.ajd = true;
                onException(e);
            }
        }
    }
}

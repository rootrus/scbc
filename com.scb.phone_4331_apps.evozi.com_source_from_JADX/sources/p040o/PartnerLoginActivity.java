package p040o;

import java.io.IOException;

/* renamed from: o.PartnerLoginActivity */
public abstract class PartnerLoginActivity implements PinChangeActivity {
    private final PinChangeActivity delegate;

    public PartnerLoginActivity(PinChangeActivity pinChangeActivity) {
        onGetStartedClick.write((Object) pinChangeActivity, "delegate");
        this.delegate = pinChangeActivity;
    }

    public final PinChangeActivity delegate() {
        return this.delegate;
    }

    public void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "source");
        this.delegate.write(sCBUniversalWebViewActivity, j);
    }

    public void flush() throws IOException {
        this.delegate.flush();
    }

    public PinChangeActivity_ViewBinding timeout() {
        return this.delegate.timeout();
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.delegate);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final PinChangeActivity m6326deprecated_delegate() {
        return this.delegate;
    }
}

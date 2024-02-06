package p040o;

import java.io.IOException;

/* renamed from: o.PayNowSuccessActivity */
public abstract class PayNowSuccessActivity implements HowToAddAccountStep2Activity {
    private final HowToAddAccountStep2Activity delegate;

    public PayNowSuccessActivity(HowToAddAccountStep2Activity howToAddAccountStep2Activity) {
        onGetStartedClick.write((Object) howToAddAccountStep2Activity, "delegate");
        this.delegate = howToAddAccountStep2Activity;
    }

    public final HowToAddAccountStep2Activity delegate() {
        return this.delegate;
    }

    public long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
        return this.delegate.read(sCBUniversalWebViewActivity, j);
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
    public final HowToAddAccountStep2Activity m6327deprecated_delegate() {
        return this.delegate;
    }
}

package p040o;

import java.io.IOException;

/* renamed from: o.onMenuTopUpClick */
public abstract class onMenuTopUpClick implements HowToAddAccountActivity {
    private final HowToAddAccountActivity ann;

    public onMenuTopUpClick(HowToAddAccountActivity howToAddAccountActivity) {
        if (howToAddAccountActivity != null) {
            this.ann = howToAddAccountActivity;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final HowToAddAccountActivity delegate() {
        return this.ann;
    }

    public long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
        return this.ann.read(onmenupromptpayclick, j);
    }

    public ModifyQuickPromptPayActivity timeout() {
        return this.ann.timeout();
    }

    public void close() throws IOException {
        this.ann.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.ann.toString());
        sb.append(")");
        return sb.toString();
    }
}

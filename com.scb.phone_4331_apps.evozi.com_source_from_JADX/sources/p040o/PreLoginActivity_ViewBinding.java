package p040o;

import java.io.IOException;

/* renamed from: o.PreLoginActivity_ViewBinding */
public abstract class PreLoginActivity_ViewBinding implements QuickPromptPayActivity {
    private final QuickPromptPayActivity anm;

    public PreLoginActivity_ViewBinding(QuickPromptPayActivity quickPromptPayActivity) {
        if (quickPromptPayActivity != null) {
            this.anm = quickPromptPayActivity;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final QuickPromptPayActivity delegate() {
        return this.anm;
    }

    public void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
        this.anm.write(onmenupromptpayclick, j);
    }

    public void flush() throws IOException {
        this.anm.flush();
    }

    public ModifyQuickPromptPayActivity timeout() {
        return this.anm.timeout();
    }

    public void close() throws IOException {
        this.anm.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.anm.toString());
        sb.append(")");
        return sb.toString();
    }
}

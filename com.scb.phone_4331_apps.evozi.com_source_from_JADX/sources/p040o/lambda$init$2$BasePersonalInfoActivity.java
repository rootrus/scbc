package p040o;

import java.io.OutputStream;

/* renamed from: o.lambda$init$2$BasePersonalInfoActivity */
final class lambda$init$2$BasePersonalInfoActivity implements PinChangeActivity {
    private final PinChangeActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    private final OutputStream read;

    public lambda$init$2$BasePersonalInfoActivity(OutputStream outputStream, PinChangeActivity_ViewBinding pinChangeActivity_ViewBinding) {
        onGetStartedClick.write((Object) outputStream, "out");
        onGetStartedClick.write((Object) pinChangeActivity_ViewBinding, "timeout");
        this.read = outputStream;
        this.MediaBrowserCompat$CustomActionResultReceiver = pinChangeActivity_ViewBinding;
    }

    public final void flush() {
        this.read.flush();
    }

    public final void close() {
        this.read.close();
    }

    public final PinChangeActivity_ViewBinding timeout() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sink(");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }

    public final void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "source");
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(sCBUniversalWebViewActivity.read, 0, j);
        while (j > 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver.throwIfReached();
            PersonalizeActivity personalizeActivity = sCBUniversalWebViewActivity.write;
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            int min = (int) Math.min(j, (long) (personalizeActivity.write - personalizeActivity.read));
            this.read.write(personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver, personalizeActivity.read, min);
            personalizeActivity.read += min;
            long j2 = (long) min;
            j -= j2;
            sCBUniversalWebViewActivity.read -= j2;
            if (personalizeActivity.read == personalizeActivity.write) {
                sCBUniversalWebViewActivity.write = personalizeActivity.read();
                PersonalLimitActivity.MediaBrowserCompat$CustomActionResultReceiver(personalizeActivity);
            }
        }
    }
}

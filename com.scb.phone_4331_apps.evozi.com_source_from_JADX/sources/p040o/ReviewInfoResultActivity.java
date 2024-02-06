package p040o;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: o.ReviewInfoResultActivity */
public class ReviewInfoResultActivity extends MwCurrentUserEwalletActivity_ViewBinding {
    private final long IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final int MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$SearchResultReceiver;
    private navigate read;

    private ReviewInfoResultActivity(int i, int i2, long j, String str) {
        onGetStartedClick.write((Object) str, "schedulerName");
        this.MediaBrowserCompat$ItemReceiver = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        this.IconCompatParcelizer = j;
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.read = new navigate(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.MediaBrowserCompat$SearchResultReceiver);
    }

    public /* synthetic */ ReviewInfoResultActivity() {
        this(openHome.write, openHome.IconCompatParcelizer, "DefaultDispatcher");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private ReviewInfoResultActivity(int i, int i2, String str) {
        this(i, i2, openHome.MediaBrowserCompat$ItemReceiver, str);
        onGetStartedClick.write((Object) str, "schedulerName");
    }

    public final void IconCompatParcelizer(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Runnable runnable) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) runnable, "block");
        try {
            navigate.MediaBrowserCompat$ItemReceiver(this.read, runnable, (NationalIdActivity_ViewBinding) null, false, 6);
        } catch (RejectedExecutionException unused) {
            lambda$onCreate$0$MwCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(hmlPromptPayVerificationActivity, runnable);
        }
    }

    public final void read(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Runnable runnable) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) runnable, "block");
        try {
            navigate.MediaBrowserCompat$ItemReceiver(this.read, runnable, (NationalIdActivity_ViewBinding) null, true, 2);
        } catch (RejectedExecutionException unused) {
            lambda$onCreate$0$MwCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver.read(hmlPromptPayVerificationActivity, runnable);
        }
    }

    public void close() {
        this.read.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[scheduler = ");
        sb.append(this.read);
        sb.append(']');
        return sb.toString();
    }

    public final void IconCompatParcelizer(Runnable runnable, NationalIdActivity_ViewBinding nationalIdActivity_ViewBinding, boolean z) {
        onGetStartedClick.write((Object) runnable, "block");
        onGetStartedClick.write((Object) nationalIdActivity_ViewBinding, "context");
        try {
            this.read.write(runnable, nationalIdActivity_ViewBinding, z);
        } catch (RejectedExecutionException unused) {
            lambda$onCreate$0$MwCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver((Runnable) navigate.read(runnable, nationalIdActivity_ViewBinding));
        }
    }
}

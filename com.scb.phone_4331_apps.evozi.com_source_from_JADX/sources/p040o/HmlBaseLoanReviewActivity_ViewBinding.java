package p040o;

import java.util.concurrent.ThreadFactory;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.HmlBaseLoanReviewActivity_ViewBinding */
public final class HmlBaseLoanReviewActivity_ViewBinding extends BankingAgentDeepLinkActivity {
    private static final onCheckboxChanged read = new onCheckboxChanged("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    private ThreadFactory MediaBrowserCompat$ItemReceiver;

    public HmlBaseLoanReviewActivity_ViewBinding() {
        this(read);
    }

    private HmlBaseLoanReviewActivity_ViewBinding(ThreadFactory threadFactory) {
        this.MediaBrowserCompat$ItemReceiver = threadFactory;
    }

    public final BankingAgentDeepLinkActivity.read write() {
        return new onBtnAcceptClicked(this.MediaBrowserCompat$ItemReceiver);
    }
}

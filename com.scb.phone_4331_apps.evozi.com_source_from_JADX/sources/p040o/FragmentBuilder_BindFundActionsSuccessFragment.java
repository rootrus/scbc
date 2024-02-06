package p040o;

import com.squareup.picasso.Picasso;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p040o.FragmentBuilder_BindFundRedeemSearchListFragment;

/* renamed from: o.FragmentBuilder_BindFundActionsSuccessFragment */
public final class FragmentBuilder_BindFundActionsSuccessFragment extends ThreadPoolExecutor {
    public FragmentBuilder_BindFundActionsSuccessFragment() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new FragmentBuilder_BindFundRedeemSearchListFragment.IconCompatParcelizer());
    }

    public final Future<?> submit(Runnable runnable) {
        write write2 = new write((FragmentBuilder_BindEbillSubscriptionReviewFragment) runnable);
        execute(write2);
        return write2;
    }

    /* renamed from: o.FragmentBuilder_BindFundActionsSuccessFragment$write */
    static final class write extends FutureTask<FragmentBuilder_BindEbillSubscriptionReviewFragment> implements Comparable<write> {
        private final FragmentBuilder_BindEbillSubscriptionReviewFragment read;

        public final /* synthetic */ int compareTo(Object obj) {
            write write = (write) obj;
            Picasso.IconCompatParcelizer iconCompatParcelizer = this.read.f3138x50fd9e4a;
            Picasso.IconCompatParcelizer iconCompatParcelizer2 = write.read.f3138x50fd9e4a;
            return iconCompatParcelizer == iconCompatParcelizer2 ? this.read.MediaSessionCompat$QueueItem - write.read.MediaSessionCompat$QueueItem : iconCompatParcelizer2.ordinal() - iconCompatParcelizer.ordinal();
        }

        write(FragmentBuilder_BindEbillSubscriptionReviewFragment fragmentBuilder_BindEbillSubscriptionReviewFragment) {
            super(fragmentBuilder_BindEbillSubscriptionReviewFragment, (Object) null);
            this.read = fragmentBuilder_BindEbillSubscriptionReviewFragment;
        }
    }
}

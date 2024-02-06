package p040o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Picasso;

/* renamed from: o.FragmentBuilder_BindFundAwaitingTransactionsTabFragment$MediaBrowserCompat$CustomActionResultReceiver */
class C6532xb8559bb extends Handler {
    private final FragmentBuilder_BindFundAwaitingTransactionsTabFragment IconCompatParcelizer;

    C6532xb8559bb(Looper looper, FragmentBuilder_BindFundAwaitingTransactionsTabFragment fragmentBuilder_BindFundAwaitingTransactionsTabFragment) {
        super(looper);
        this.IconCompatParcelizer = fragmentBuilder_BindFundAwaitingTransactionsTabFragment;
    }

    public final void handleMessage(final Message message) {
        int i = message.what;
        if (i == 0) {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver++;
        } else if (i == 1) {
            this.IconCompatParcelizer.MediaMetadataCompat++;
        } else if (i == 2) {
            FragmentBuilder_BindFundAwaitingTransactionsTabFragment fragmentBuilder_BindFundAwaitingTransactionsTabFragment = this.IconCompatParcelizer;
            long j = (long) message.arg1;
            int i2 = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.RatingCompat + 1;
            fragmentBuilder_BindFundAwaitingTransactionsTabFragment.RatingCompat = i2;
            long j2 = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.MediaSessionCompat$QueueItem + j;
            fragmentBuilder_BindFundAwaitingTransactionsTabFragment.MediaSessionCompat$QueueItem = j2;
            fragmentBuilder_BindFundAwaitingTransactionsTabFragment.IconCompatParcelizer = j2 / ((long) i2);
        } else if (i == 3) {
            FragmentBuilder_BindFundAwaitingTransactionsTabFragment fragmentBuilder_BindFundAwaitingTransactionsTabFragment2 = this.IconCompatParcelizer;
            long j3 = (long) message.arg1;
            fragmentBuilder_BindFundAwaitingTransactionsTabFragment2.ParcelableVolumeInfo++;
            long j4 = fragmentBuilder_BindFundAwaitingTransactionsTabFragment2.f3142x50fd9e4a + j3;
            fragmentBuilder_BindFundAwaitingTransactionsTabFragment2.f3142x50fd9e4a = j4;
            fragmentBuilder_BindFundAwaitingTransactionsTabFragment2.MediaBrowserCompat$CustomActionResultReceiver = j4 / ((long) fragmentBuilder_BindFundAwaitingTransactionsTabFragment2.RatingCompat);
        } else if (i != 4) {
            Picasso.write.post(new Runnable() {
                public final void run() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled stats message.");
                    sb.append(message.what);
                    throw new AssertionError(sb.toString());
                }
            });
        } else {
            FragmentBuilder_BindFundAwaitingTransactionsTabFragment fragmentBuilder_BindFundAwaitingTransactionsTabFragment3 = this.IconCompatParcelizer;
            fragmentBuilder_BindFundAwaitingTransactionsTabFragment3.MediaDescriptionCompat++;
            long longValue = fragmentBuilder_BindFundAwaitingTransactionsTabFragment3.MediaBrowserCompat$SearchResultReceiver + ((Long) message.obj).longValue();
            fragmentBuilder_BindFundAwaitingTransactionsTabFragment3.MediaBrowserCompat$SearchResultReceiver = longValue;
            fragmentBuilder_BindFundAwaitingTransactionsTabFragment3.write = longValue / ((long) fragmentBuilder_BindFundAwaitingTransactionsTabFragment3.MediaDescriptionCompat);
        }
    }
}

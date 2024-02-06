package p040o;

import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.FragmentBuilder_BindEkycRouterActivity$MediaBrowserCompat$CustomActionResultReceiver */
class C6528x46f48386 extends Handler {
    private final FragmentBuilder_BindEkycRouterActivity write;

    C6528x46f48386(Looper looper, FragmentBuilder_BindEkycRouterActivity fragmentBuilder_BindEkycRouterActivity) {
        super(looper);
        this.write = fragmentBuilder_BindEkycRouterActivity;
    }

    public final void handleMessage(final Message message) {
        boolean z = false;
        switch (message.what) {
            case 1:
                this.write.MediaBrowserCompat$CustomActionResultReceiver((FragmentBuilder_BindEbillSubscriptionInputFragment) message.obj, true);
                return;
            case 2:
                this.write.MediaBrowserCompat$ItemReceiver((FragmentBuilder_BindEbillSubscriptionInputFragment) message.obj);
                return;
            case 4:
                FragmentBuilder_BindEbillSubscriptionReviewFragment fragmentBuilder_BindEbillSubscriptionReviewFragment = (FragmentBuilder_BindEbillSubscriptionReviewFragment) message.obj;
                FragmentBuilder_BindEkycRouterActivity fragmentBuilder_BindEkycRouterActivity = this.write;
                if (FragmentBuilder_BindFatcaQuestionnaireFragment.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindEbillSubscriptionReviewFragment.RatingCompat)) {
                    fragmentBuilder_BindEkycRouterActivity.read.write(fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaBrowserCompat$MediaItem, fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaSessionCompat$ResultReceiverWrapper);
                }
                fragmentBuilder_BindEkycRouterActivity.MediaBrowserCompat$MediaItem.remove(fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaBrowserCompat$MediaItem);
                fragmentBuilder_BindEkycRouterActivity.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindEbillSubscriptionReviewFragment);
                if (fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaDescriptionCompat.RatingCompat) {
                    FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "batched", FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindEbillSubscriptionReviewFragment), "for completion");
                    return;
                }
                return;
            case 5:
                this.write.IconCompatParcelizer((FragmentBuilder_BindEbillSubscriptionReviewFragment) message.obj);
                return;
            case 6:
                this.write.write((FragmentBuilder_BindEbillSubscriptionReviewFragment) message.obj, false);
                return;
            case 7:
                FragmentBuilder_BindEkycRouterActivity fragmentBuilder_BindEkycRouterActivity2 = this.write;
                ArrayList arrayList = new ArrayList(fragmentBuilder_BindEkycRouterActivity2.MediaBrowserCompat$CustomActionResultReceiver);
                fragmentBuilder_BindEkycRouterActivity2.MediaBrowserCompat$CustomActionResultReceiver.clear();
                Handler handler = fragmentBuilder_BindEkycRouterActivity2.MediaMetadataCompat;
                handler.sendMessage(handler.obtainMessage(8, arrayList));
                FragmentBuilder_BindEkycRouterActivity.read(arrayList);
                return;
            case 9:
                this.write.IconCompatParcelizer((NetworkInfo) message.obj);
                return;
            case 10:
                FragmentBuilder_BindEkycRouterActivity fragmentBuilder_BindEkycRouterActivity3 = this.write;
                if (message.arg1 == 1) {
                    z = true;
                }
                fragmentBuilder_BindEkycRouterActivity3.write = z;
                return;
            case 11:
                this.write.MediaBrowserCompat$CustomActionResultReceiver(message.obj);
                return;
            case 12:
                Object obj = message.obj;
                FragmentBuilder_BindEkycRouterActivity fragmentBuilder_BindEkycRouterActivity4 = this.write;
                if (fragmentBuilder_BindEkycRouterActivity4.MediaDescriptionCompat.remove(obj)) {
                    ArrayList arrayList2 = null;
                    Iterator<FragmentBuilder_BindEbillSubscriptionInputFragment> it = fragmentBuilder_BindEkycRouterActivity4.RatingCompat.values().iterator();
                    while (it.hasNext()) {
                        FragmentBuilder_BindEbillSubscriptionInputFragment next = it.next();
                        if (next.MediaBrowserCompat$SearchResultReceiver.equals(obj)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(next);
                            it.remove();
                        }
                    }
                    if (arrayList2 != null) {
                        Handler handler2 = fragmentBuilder_BindEkycRouterActivity4.MediaMetadataCompat;
                        handler2.sendMessage(handler2.obtainMessage(13, arrayList2));
                        return;
                    }
                    return;
                }
                return;
            default:
                Picasso.write.post(new Runnable() {
                    public final void run() {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown handler message received: ");
                        sb.append(message.what);
                        throw new AssertionError(sb.toString());
                    }
                });
                return;
        }
    }
}

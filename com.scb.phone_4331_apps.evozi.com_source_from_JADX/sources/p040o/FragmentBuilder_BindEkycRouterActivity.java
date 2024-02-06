package p040o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p040o.FragmentBuilder_BindFillInformationFragment;

/* renamed from: o.FragmentBuilder_BindEkycRouterActivity */
public final class FragmentBuilder_BindEkycRouterActivity {
    public final Handler IconCompatParcelizer = new C6528x46f48386(this.MediaSessionCompat$ResultReceiverWrapper.getLooper(), this);
    final List<FragmentBuilder_BindEbillSubscriptionReviewFragment> MediaBrowserCompat$CustomActionResultReceiver;
    public final FragmentBuilder_BindExportStatementSuccessfulFragment MediaBrowserCompat$ItemReceiver;
    final Map<String, FragmentBuilder_BindEbillSubscriptionReviewFragment> MediaBrowserCompat$MediaItem = new LinkedHashMap();
    private Context MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private FragmentBuilder_BindFundAwaitingTransactionsTabFragment f3139x50fd9e4a;
    final Set<Object> MediaDescriptionCompat = new LinkedHashSet();
    final Handler MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    private C6530x4f2b44d5 MediaSessionCompat$ResultReceiverWrapper;
    private Map<Object, FragmentBuilder_BindEbillSubscriptionInputFragment> MediaSessionCompat$Token = new WeakHashMap();
    private ExecutorService ParcelableVolumeInfo;
    final Map<Object, FragmentBuilder_BindEbillSubscriptionInputFragment> RatingCompat = new WeakHashMap();
    final FragmentBuilder_BindEditFavouriteFragment read;
    boolean write;

    public FragmentBuilder_BindEkycRouterActivity(Context context, ExecutorService executorService, Handler handler, FragmentBuilder_BindExportStatementSuccessfulFragment fragmentBuilder_BindExportStatementSuccessfulFragment, FragmentBuilder_BindEditFavouriteFragment fragmentBuilder_BindEditFavouriteFragment, FragmentBuilder_BindFundAwaitingTransactionsTabFragment fragmentBuilder_BindFundAwaitingTransactionsTabFragment) {
        C6530x4f2b44d5 fragmentBuilder_BindEkycRouterActivity$MediaBrowserCompat$ItemReceiver = new C6530x4f2b44d5();
        this.MediaSessionCompat$ResultReceiverWrapper = fragmentBuilder_BindEkycRouterActivity$MediaBrowserCompat$ItemReceiver;
        fragmentBuilder_BindEkycRouterActivity$MediaBrowserCompat$ItemReceiver.start();
        FragmentBuilder_BindFundRedeemSearchListFragment.write(this.MediaSessionCompat$ResultReceiverWrapper.getLooper());
        this.MediaBrowserCompat$SearchResultReceiver = context;
        this.ParcelableVolumeInfo = executorService;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindExportStatementSuccessfulFragment;
        this.MediaMetadataCompat = handler;
        this.read = fragmentBuilder_BindEditFavouriteFragment;
        this.f3139x50fd9e4a = fragmentBuilder_BindFundAwaitingTransactionsTabFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList(4);
        this.write = FragmentBuilder_BindFundRedeemSearchListFragment.write(this.MediaBrowserCompat$SearchResultReceiver);
        this.MediaSessionCompat$QueueItem = FragmentBuilder_BindFundRedeemSearchListFragment.read(context, "android.permission.ACCESS_NETWORK_STATE");
        write write2 = new write(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (write2.read.MediaSessionCompat$QueueItem) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        write2.read.MediaBrowserCompat$SearchResultReceiver.registerReceiver(write2, intentFilter);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment, boolean z) {
        T t = null;
        if (this.MediaDescriptionCompat.contains(fragmentBuilder_BindEbillSubscriptionInputFragment.MediaBrowserCompat$SearchResultReceiver)) {
            Map<Object, FragmentBuilder_BindEbillSubscriptionInputFragment> map = this.RatingCompat;
            WeakReference<T> weakReference = fragmentBuilder_BindEbillSubscriptionInputFragment.ParcelableVolumeInfo;
            if (weakReference != null) {
                t = weakReference.get();
            }
            map.put(t, fragmentBuilder_BindEbillSubscriptionInputFragment);
            if (fragmentBuilder_BindEbillSubscriptionInputFragment.MediaDescriptionCompat.RatingCompat) {
                String write2 = fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.write();
                StringBuilder sb = new StringBuilder();
                sb.append("because tag '");
                sb.append(fragmentBuilder_BindEbillSubscriptionInputFragment.MediaBrowserCompat$SearchResultReceiver);
                sb.append("' is paused");
                FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "paused", write2, sb.toString());
                return;
            }
            return;
        }
        FragmentBuilder_BindEbillSubscriptionReviewFragment fragmentBuilder_BindEbillSubscriptionReviewFragment = this.MediaBrowserCompat$MediaItem.get(fragmentBuilder_BindEbillSubscriptionInputFragment.read);
        if (fragmentBuilder_BindEbillSubscriptionReviewFragment != null) {
            fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindEbillSubscriptionInputFragment);
        } else if (!this.ParcelableVolumeInfo.isShutdown()) {
            FragmentBuilder_BindEbillSubscriptionReviewFragment MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindEbillSubscriptionReviewFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindEbillSubscriptionInputFragment.MediaDescriptionCompat, this, this.read, this.f3139x50fd9e4a, fragmentBuilder_BindEbillSubscriptionInputFragment);
            MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = this.ParcelableVolumeInfo.submit(MediaBrowserCompat$CustomActionResultReceiver2);
            this.MediaBrowserCompat$MediaItem.put(fragmentBuilder_BindEbillSubscriptionInputFragment.read, MediaBrowserCompat$CustomActionResultReceiver2);
            if (z) {
                Map<Object, FragmentBuilder_BindEbillSubscriptionInputFragment> map2 = this.MediaSessionCompat$Token;
                WeakReference<T> weakReference2 = fragmentBuilder_BindEbillSubscriptionInputFragment.ParcelableVolumeInfo;
                if (weakReference2 != null) {
                    t = weakReference2.get();
                }
                map2.remove(t);
            }
            if (fragmentBuilder_BindEbillSubscriptionInputFragment.MediaDescriptionCompat.RatingCompat) {
                FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "enqueued", fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.write());
            }
        } else if (fragmentBuilder_BindEbillSubscriptionInputFragment.MediaDescriptionCompat.RatingCompat) {
            FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "ignored", fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.write(), "because shut down");
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if (this.MediaDescriptionCompat.add(obj)) {
            Iterator<FragmentBuilder_BindEbillSubscriptionReviewFragment> it = this.MediaBrowserCompat$MediaItem.values().iterator();
            while (it.hasNext()) {
                FragmentBuilder_BindEbillSubscriptionReviewFragment next = it.next();
                boolean z = next.MediaDescriptionCompat.RatingCompat;
                FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment = next.read;
                List<FragmentBuilder_BindEbillSubscriptionInputFragment> list = next.MediaBrowserCompat$ItemReceiver;
                boolean z2 = list != null && !list.isEmpty();
                if (fragmentBuilder_BindEbillSubscriptionInputFragment != null || z2) {
                    if (fragmentBuilder_BindEbillSubscriptionInputFragment != null && fragmentBuilder_BindEbillSubscriptionInputFragment.MediaBrowserCompat$SearchResultReceiver.equals(obj)) {
                        next.IconCompatParcelizer(fragmentBuilder_BindEbillSubscriptionInputFragment);
                        Map<Object, FragmentBuilder_BindEbillSubscriptionInputFragment> map = this.RatingCompat;
                        WeakReference<T> weakReference = fragmentBuilder_BindEbillSubscriptionInputFragment.ParcelableVolumeInfo;
                        map.put(weakReference == null ? null : weakReference.get(), fragmentBuilder_BindEbillSubscriptionInputFragment);
                        if (z) {
                            String write2 = fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.write();
                            StringBuilder sb = new StringBuilder();
                            sb.append("because tag '");
                            sb.append(obj);
                            sb.append("' was paused");
                            FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "paused", write2, sb.toString());
                        }
                    }
                    if (z2) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment2 = list.get(size);
                            if (fragmentBuilder_BindEbillSubscriptionInputFragment2.MediaBrowserCompat$SearchResultReceiver.equals(obj)) {
                                next.IconCompatParcelizer(fragmentBuilder_BindEbillSubscriptionInputFragment2);
                                Map<Object, FragmentBuilder_BindEbillSubscriptionInputFragment> map2 = this.RatingCompat;
                                WeakReference<T> weakReference2 = fragmentBuilder_BindEbillSubscriptionInputFragment2.ParcelableVolumeInfo;
                                map2.put(weakReference2 == null ? null : weakReference2.get(), fragmentBuilder_BindEbillSubscriptionInputFragment2);
                                if (z) {
                                    String write3 = fragmentBuilder_BindEbillSubscriptionInputFragment2.RatingCompat.write();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("because tag '");
                                    sb2.append(obj);
                                    sb2.append("' was paused");
                                    FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "paused", write3, sb2.toString());
                                }
                            }
                        }
                    }
                    if (next.read()) {
                        it.remove();
                        if (z) {
                            FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "canceled", FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(NetworkInfo networkInfo) {
        ExecutorService executorService = this.ParcelableVolumeInfo;
        if (executorService instanceof FragmentBuilder_BindFundActionsSuccessFragment) {
            FragmentBuilder_BindFundActionsSuccessFragment fragmentBuilder_BindFundActionsSuccessFragment = (FragmentBuilder_BindFundActionsSuccessFragment) executorService;
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                int type = networkInfo.getType();
                if (type == 0) {
                    int subtype = networkInfo.getSubtype();
                    switch (subtype) {
                        case 1:
                        case 2:
                            fragmentBuilder_BindFundActionsSuccessFragment.setCorePoolSize(1);
                            fragmentBuilder_BindFundActionsSuccessFragment.setMaximumPoolSize(1);
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            fragmentBuilder_BindFundActionsSuccessFragment.setCorePoolSize(2);
                            fragmentBuilder_BindFundActionsSuccessFragment.setMaximumPoolSize(2);
                            break;
                        default:
                            switch (subtype) {
                                case 12:
                                    break;
                                case 13:
                                case 14:
                                case 15:
                                    fragmentBuilder_BindFundActionsSuccessFragment.setCorePoolSize(3);
                                    fragmentBuilder_BindFundActionsSuccessFragment.setMaximumPoolSize(3);
                                    break;
                                default:
                                    fragmentBuilder_BindFundActionsSuccessFragment.setCorePoolSize(3);
                                    fragmentBuilder_BindFundActionsSuccessFragment.setMaximumPoolSize(3);
                                    break;
                            }
                            fragmentBuilder_BindFundActionsSuccessFragment.setCorePoolSize(2);
                            fragmentBuilder_BindFundActionsSuccessFragment.setMaximumPoolSize(2);
                            break;
                    }
                } else if (type == 1 || type == 6 || type == 9) {
                    fragmentBuilder_BindFundActionsSuccessFragment.setCorePoolSize(4);
                    fragmentBuilder_BindFundActionsSuccessFragment.setMaximumPoolSize(4);
                }
            }
            fragmentBuilder_BindFundActionsSuccessFragment.setCorePoolSize(3);
            fragmentBuilder_BindFundActionsSuccessFragment.setMaximumPoolSize(3);
        }
        if (networkInfo != null && networkInfo.isConnected() && !this.MediaSessionCompat$Token.isEmpty()) {
            Iterator<FragmentBuilder_BindEbillSubscriptionInputFragment> it = this.MediaSessionCompat$Token.values().iterator();
            while (it.hasNext()) {
                FragmentBuilder_BindEbillSubscriptionInputFragment next = it.next();
                it.remove();
                if (next.MediaDescriptionCompat.RatingCompat) {
                    FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "replaying", next.RatingCompat.write());
                }
                MediaBrowserCompat$CustomActionResultReceiver(next, false);
            }
        }
    }

    static void read(List<FragmentBuilder_BindEbillSubscriptionReviewFragment> list) {
        if (!list.isEmpty() && list.get(0).MediaDescriptionCompat.RatingCompat) {
            StringBuilder sb = new StringBuilder();
            for (FragmentBuilder_BindEbillSubscriptionReviewFragment next : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver(next));
            }
            FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "delivered", sb.toString());
        }
    }

    /* renamed from: o.FragmentBuilder_BindEkycRouterActivity$write */
    static class write extends BroadcastReceiver {
        final FragmentBuilder_BindEkycRouterActivity read;

        write(FragmentBuilder_BindEkycRouterActivity fragmentBuilder_BindEkycRouterActivity) {
            this.read = fragmentBuilder_BindEkycRouterActivity;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        FragmentBuilder_BindEkycRouterActivity fragmentBuilder_BindEkycRouterActivity = this.read;
                        boolean booleanExtra = intent.getBooleanExtra("state", false);
                        Handler handler = fragmentBuilder_BindEkycRouterActivity.IconCompatParcelizer;
                        handler.sendMessage(handler.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    FragmentBuilder_BindEkycRouterActivity fragmentBuilder_BindEkycRouterActivity2 = this.read;
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) FragmentBuilder_BindFundRedeemSearchListFragment.IconCompatParcelizer(context, "connectivity")).getActiveNetworkInfo();
                    Handler handler2 = fragmentBuilder_BindEkycRouterActivity2.IconCompatParcelizer;
                    handler2.sendMessage(handler2.obtainMessage(9, activeNetworkInfo));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindEbillSubscriptionReviewFragment fragmentBuilder_BindEbillSubscriptionReviewFragment) {
        Future<?> future = fragmentBuilder_BindEbillSubscriptionReviewFragment.IconCompatParcelizer;
        if (!(future != null && future.isCancelled())) {
            if (fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaSessionCompat$ResultReceiverWrapper != null) {
                fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaSessionCompat$ResultReceiverWrapper.prepareToDraw();
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEbillSubscriptionReviewFragment);
            if (!this.IconCompatParcelizer.hasMessages(7)) {
                this.IconCompatParcelizer.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    private void write(FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment) {
        WeakReference<T> weakReference = fragmentBuilder_BindEbillSubscriptionInputFragment.ParcelableVolumeInfo;
        T t = weakReference == null ? null : weakReference.get();
        if (t != null) {
            fragmentBuilder_BindEbillSubscriptionInputFragment.MediaSessionCompat$ResultReceiverWrapper = true;
            this.MediaSessionCompat$Token.put(t, fragmentBuilder_BindEbillSubscriptionInputFragment);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment) {
        String str = fragmentBuilder_BindEbillSubscriptionInputFragment.read;
        FragmentBuilder_BindEbillSubscriptionReviewFragment fragmentBuilder_BindEbillSubscriptionReviewFragment = this.MediaBrowserCompat$MediaItem.get(str);
        if (fragmentBuilder_BindEbillSubscriptionReviewFragment != null) {
            fragmentBuilder_BindEbillSubscriptionReviewFragment.IconCompatParcelizer(fragmentBuilder_BindEbillSubscriptionInputFragment);
            if (fragmentBuilder_BindEbillSubscriptionReviewFragment.read()) {
                this.MediaBrowserCompat$MediaItem.remove(str);
                if (fragmentBuilder_BindEbillSubscriptionInputFragment.MediaDescriptionCompat.RatingCompat) {
                    FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "canceled", fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.write());
                }
            }
        }
        T t = null;
        if (this.MediaDescriptionCompat.contains(fragmentBuilder_BindEbillSubscriptionInputFragment.MediaBrowserCompat$SearchResultReceiver)) {
            Map<Object, FragmentBuilder_BindEbillSubscriptionInputFragment> map = this.RatingCompat;
            WeakReference<T> weakReference = fragmentBuilder_BindEbillSubscriptionInputFragment.ParcelableVolumeInfo;
            map.remove(weakReference == null ? null : weakReference.get());
            if (fragmentBuilder_BindEbillSubscriptionInputFragment.MediaDescriptionCompat.RatingCompat) {
                FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "canceled", fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.write(), "because paused request got canceled");
            }
        }
        Map<Object, FragmentBuilder_BindEbillSubscriptionInputFragment> map2 = this.MediaSessionCompat$Token;
        WeakReference<T> weakReference2 = fragmentBuilder_BindEbillSubscriptionInputFragment.ParcelableVolumeInfo;
        if (weakReference2 != null) {
            t = weakReference2.get();
        }
        FragmentBuilder_BindEbillSubscriptionInputFragment remove = map2.remove(t);
        if (remove != null && remove.MediaDescriptionCompat.RatingCompat) {
            FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "canceled", remove.RatingCompat.write(), "from replaying");
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(FragmentBuilder_BindEbillSubscriptionReviewFragment fragmentBuilder_BindEbillSubscriptionReviewFragment, boolean z) {
        if (fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaDescriptionCompat.RatingCompat) {
            String MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindEbillSubscriptionReviewFragment);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : "");
            FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "batched", MediaBrowserCompat$ItemReceiver2, sb.toString());
        }
        this.MediaBrowserCompat$MediaItem.remove(fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaBrowserCompat$MediaItem);
        MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindEbillSubscriptionReviewFragment);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(FragmentBuilder_BindEbillSubscriptionReviewFragment fragmentBuilder_BindEbillSubscriptionReviewFragment) {
        boolean z;
        Future<?> future = fragmentBuilder_BindEbillSubscriptionReviewFragment.IconCompatParcelizer;
        boolean z2 = true;
        if (!(future != null && future.isCancelled())) {
            if (this.ParcelableVolumeInfo.isShutdown()) {
                write(fragmentBuilder_BindEbillSubscriptionReviewFragment, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.MediaSessionCompat$QueueItem) {
                networkInfo = ((ConnectivityManager) FragmentBuilder_BindFundRedeemSearchListFragment.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, "connectivity")).getActiveNetworkInfo();
            }
            if (!(fragmentBuilder_BindEbillSubscriptionReviewFragment.ParcelableVolumeInfo > 0)) {
                z = false;
            } else {
                fragmentBuilder_BindEbillSubscriptionReviewFragment.ParcelableVolumeInfo--;
                z = fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(networkInfo);
            }
            if (z) {
                if (fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaDescriptionCompat.RatingCompat) {
                    FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Dispatcher", "retrying", FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindEbillSubscriptionReviewFragment));
                }
                if (fragmentBuilder_BindEbillSubscriptionReviewFragment.write instanceof FragmentBuilder_BindFillInformationFragment.write) {
                    fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaMetadataCompat |= FragmentBuilder_BindFatcaLandingQuestionFragment.NO_CACHE.index;
                }
                fragmentBuilder_BindEbillSubscriptionReviewFragment.IconCompatParcelizer = this.ParcelableVolumeInfo.submit(fragmentBuilder_BindEbillSubscriptionReviewFragment);
                return;
            }
            if (!this.MediaSessionCompat$QueueItem || !fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver()) {
                z2 = false;
            }
            write(fragmentBuilder_BindEbillSubscriptionReviewFragment, z2);
            if (z2) {
                FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment = fragmentBuilder_BindEbillSubscriptionReviewFragment.read;
                if (fragmentBuilder_BindEbillSubscriptionInputFragment != null) {
                    write(fragmentBuilder_BindEbillSubscriptionInputFragment);
                }
                List<FragmentBuilder_BindEbillSubscriptionInputFragment> list = fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaBrowserCompat$ItemReceiver;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        write(list.get(i));
                    }
                }
            }
        }
    }
}

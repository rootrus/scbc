package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p040o.FragmentBuilder_BindEbillSubscriptionInputFragment;
import p040o.FragmentBuilder_BindEbillSubscriptionReviewFragment;
import p040o.FragmentBuilder_BindEditFavouriteFragment;
import p040o.FragmentBuilder_BindEditRecipientFragment;
import p040o.FragmentBuilder_BindEkycProductTermConditionFragment;
import p040o.FragmentBuilder_BindEkycRouterActivity;
import p040o.FragmentBuilder_BindEkycTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindEnterProxyFragment;
import p040o.FragmentBuilder_BindEtbPersonalInformationFragment;
import p040o.FragmentBuilder_BindFatcaQuestionnaireFragment;
import p040o.FragmentBuilder_BindFavouriteTargetFragment;
import p040o.FragmentBuilder_BindFillInformationFragment;
import p040o.FragmentBuilder_BindFixedTransferTargetTabFragment;
import p040o.FragmentBuilder_BindFundAwaitingTransactionsTabFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.FragmentBuilder_BindFundInvestmentExperienceFragment;
import p040o.FragmentBuilder_BindFundPurchaseLandingFragment;
import p040o.FragmentBuilder_BindFundRedeemSearchListFragment;

public class Picasso {
    private static volatile Picasso MediaSessionCompat$ResultReceiverWrapper = null;
    public static final Handler write = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            int i = message.what;
            T t = null;
            if (i != 3) {
                int i2 = 0;
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i2 < size) {
                        FragmentBuilder_BindEbillSubscriptionReviewFragment fragmentBuilder_BindEbillSubscriptionReviewFragment = (FragmentBuilder_BindEbillSubscriptionReviewFragment) list.get(i2);
                        fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaDescriptionCompat.IconCompatParcelizer(fragmentBuilder_BindEbillSubscriptionReviewFragment);
                        i2++;
                    }
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i2 < size2) {
                        FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment = (FragmentBuilder_BindEbillSubscriptionInputFragment) list2.get(i2);
                        Picasso picasso = fragmentBuilder_BindEbillSubscriptionInputFragment.MediaDescriptionCompat;
                        Bitmap MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindFatcaQuestionnaireFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindEbillSubscriptionInputFragment.MediaBrowserCompat$CustomActionResultReceiver) ? picasso.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindEbillSubscriptionInputFragment.read) : null;
                        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                            picasso.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, read.MEMORY, fragmentBuilder_BindEbillSubscriptionInputFragment, (Exception) null);
                            if (picasso.RatingCompat) {
                                String write = fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.write();
                                StringBuilder sb = new StringBuilder();
                                sb.append("from ");
                                sb.append(read.MEMORY);
                                FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Main", "completed", write, sb.toString());
                            }
                        } else {
                            picasso.read(fragmentBuilder_BindEbillSubscriptionInputFragment);
                            if (picasso.RatingCompat) {
                                FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Main", "resumed", fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.write());
                            }
                        }
                        i2++;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown handler message received: ");
                    sb2.append(message.what);
                    throw new AssertionError(sb2.toString());
                }
            } else {
                FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment2 = (FragmentBuilder_BindEbillSubscriptionInputFragment) message.obj;
                if (fragmentBuilder_BindEbillSubscriptionInputFragment2.MediaDescriptionCompat.RatingCompat) {
                    FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Main", "canceled", fragmentBuilder_BindEbillSubscriptionInputFragment2.RatingCompat.write(), "target got garbage collected");
                }
                Picasso picasso2 = fragmentBuilder_BindEbillSubscriptionInputFragment2.MediaDescriptionCompat;
                WeakReference<T> weakReference = fragmentBuilder_BindEbillSubscriptionInputFragment2.ParcelableVolumeInfo;
                if (weakReference != null) {
                    t = weakReference.get();
                }
                picasso2.write((Object) t);
            }
        }
    };
    public final Context IconCompatParcelizer;
    public final Bitmap.Config MediaBrowserCompat$CustomActionResultReceiver = null;
    public final FragmentBuilder_BindEkycRouterActivity MediaBrowserCompat$ItemReceiver;
    public final ReferenceQueue<Object> MediaBrowserCompat$MediaItem;
    public final List<FragmentBuilder_BindFundInvestmentExperienceFragment> MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final Picasso$MediaBrowserCompat$CustomActionResultReceiver f3102x50fd9e4a;
    public final Picasso$MediaBrowserCompat$SearchResultReceiver MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public final FragmentBuilder_BindFundAwaitingTransactionsTabFragment MediaSessionCompat$QueueItem;
    private Map<Object, FragmentBuilder_BindEbillSubscriptionInputFragment> MediaSessionCompat$Token;
    public final Map<ImageView, FragmentBuilder_BindEnterProxyFragment> ParcelableVolumeInfo;
    public volatile boolean RatingCompat;
    public final FragmentBuilder_BindEditFavouriteFragment read;

    public enum IconCompatParcelizer {
        LOW,
        NORMAL,
        HIGH
    }

    Picasso(Context context, FragmentBuilder_BindEkycRouterActivity fragmentBuilder_BindEkycRouterActivity, FragmentBuilder_BindEditFavouriteFragment fragmentBuilder_BindEditFavouriteFragment, Picasso$MediaBrowserCompat$CustomActionResultReceiver picasso$MediaBrowserCompat$CustomActionResultReceiver, Picasso$MediaBrowserCompat$SearchResultReceiver picasso$MediaBrowserCompat$SearchResultReceiver, List<FragmentBuilder_BindFundInvestmentExperienceFragment> list, FragmentBuilder_BindFundAwaitingTransactionsTabFragment fragmentBuilder_BindFundAwaitingTransactionsTabFragment, Bitmap.Config config, boolean z, boolean z2) {
        this.IconCompatParcelizer = context;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindEkycRouterActivity;
        this.read = fragmentBuilder_BindEditFavouriteFragment;
        this.f3102x50fd9e4a = picasso$MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaDescriptionCompat = picasso$MediaBrowserCompat$SearchResultReceiver;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new FragmentBuilder_BindFundPurchaseLandingFragment(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new FragmentBuilder_BindEkycProductTermConditionFragment(context));
        arrayList.add(new FragmentBuilder_BindFavouriteTargetFragment(context));
        arrayList.add(new FragmentBuilder_BindEkycTermsAndConditionsFragment(context));
        arrayList.add(new FragmentBuilder_BindEditRecipientFragment(context));
        arrayList.add(new FragmentBuilder_BindEtbPersonalInformationFragment(context));
        arrayList.add(new FragmentBuilder_BindFillInformationFragment(fragmentBuilder_BindEkycRouterActivity.MediaBrowserCompat$ItemReceiver, fragmentBuilder_BindFundAwaitingTransactionsTabFragment));
        this.MediaBrowserCompat$SearchResultReceiver = Collections.unmodifiableList(arrayList);
        this.MediaSessionCompat$QueueItem = fragmentBuilder_BindFundAwaitingTransactionsTabFragment;
        this.MediaSessionCompat$Token = new WeakHashMap();
        this.ParcelableVolumeInfo = new WeakHashMap();
        this.MediaMetadataCompat = false;
        this.RatingCompat = false;
        this.MediaBrowserCompat$MediaItem = new ReferenceQueue<>();
        new write(this.MediaBrowserCompat$MediaItem, write).start();
    }

    public final FragmentBuilder_BindFundDetailSummaryFragment write(String str) {
        if (str == null) {
            return new FragmentBuilder_BindFundDetailSummaryFragment(this, (Uri) null, 0);
        }
        if (str.trim().length() != 0) {
            return new FragmentBuilder_BindFundDetailSummaryFragment(this, Uri.parse(str), 0);
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public final Bitmap MediaBrowserCompat$CustomActionResultReceiver(String str) {
        Bitmap MediaBrowserCompat$CustomActionResultReceiver2 = this.read.MediaBrowserCompat$CustomActionResultReceiver(str);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            this.MediaSessionCompat$QueueItem.MediaBrowserCompat$MediaItem.sendEmptyMessage(0);
        } else {
            this.MediaSessionCompat$QueueItem.MediaBrowserCompat$MediaItem.sendEmptyMessage(1);
        }
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    public final void write(Object obj) {
        FragmentBuilder_BindEnterProxyFragment remove;
        FragmentBuilder_BindFundRedeemSearchListFragment.read();
        FragmentBuilder_BindEbillSubscriptionInputFragment remove2 = this.MediaSessionCompat$Token.remove(obj);
        if (remove2 != null) {
            remove2.MediaBrowserCompat$CustomActionResultReceiver();
            Handler handler = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            handler.sendMessage(handler.obtainMessage(2, remove2));
        }
        if ((obj instanceof ImageView) && (remove = this.ParcelableVolumeInfo.remove((ImageView) obj)) != null) {
            remove.write = null;
            ImageView imageView = remove.IconCompatParcelizer.get();
            if (imageView != null) {
                remove.IconCompatParcelizer.clear();
                imageView.removeOnAttachStateChangeListener(remove);
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(remove);
                }
            }
        }
    }

    static class write extends Thread {
        private final Handler MediaBrowserCompat$ItemReceiver;
        private final ReferenceQueue<Object> write;

        write(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.write = referenceQueue;
            this.MediaBrowserCompat$ItemReceiver = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    FragmentBuilder_BindEbillSubscriptionInputFragment.IconCompatParcelizer iconCompatParcelizer = (FragmentBuilder_BindEbillSubscriptionInputFragment.IconCompatParcelizer) this.write.remove(1000);
                    Message obtainMessage = this.MediaBrowserCompat$ItemReceiver.obtainMessage();
                    if (iconCompatParcelizer != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = iconCompatParcelizer.write;
                        this.MediaBrowserCompat$ItemReceiver.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.MediaBrowserCompat$ItemReceiver.post(new Runnable() {
                        public final void run() {
                            throw new RuntimeException(e);
                        }
                    });
                    return;
                }
            }
        }
    }

    public static Picasso read() {
        if (MediaSessionCompat$ResultReceiverWrapper == null) {
            synchronized (Picasso.class) {
                if (MediaSessionCompat$ResultReceiverWrapper == null) {
                    if (FragmentBuilder_BindFixedTransferTargetTabFragment.MediaBrowserCompat$ItemReceiver != null) {
                        MediaSessionCompat$ResultReceiverWrapper = new Picasso$MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindFixedTransferTargetTabFragment.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return MediaSessionCompat$ResultReceiverWrapper;
    }

    public enum read {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        public final int debugColor;

        private read(int i) {
            this.debugColor = i;
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(Bitmap bitmap, read read2, FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment, Exception exc) {
        if (!fragmentBuilder_BindEbillSubscriptionInputFragment.MediaBrowserCompat$ItemReceiver) {
            if (!fragmentBuilder_BindEbillSubscriptionInputFragment.MediaSessionCompat$ResultReceiverWrapper) {
                Map<Object, FragmentBuilder_BindEbillSubscriptionInputFragment> map = this.MediaSessionCompat$Token;
                WeakReference<T> weakReference = fragmentBuilder_BindEbillSubscriptionInputFragment.ParcelableVolumeInfo;
                map.remove(weakReference == null ? null : weakReference.get());
            }
            if (bitmap == null) {
                fragmentBuilder_BindEbillSubscriptionInputFragment.MediaBrowserCompat$ItemReceiver(exc);
                if (this.RatingCompat) {
                    FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Main", "errored", fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.write(), exc.getMessage());
                }
            } else if (read2 != null) {
                fragmentBuilder_BindEbillSubscriptionInputFragment.MediaBrowserCompat$ItemReceiver(bitmap, read2);
                if (this.RatingCompat) {
                    String write2 = fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.write();
                    StringBuilder sb = new StringBuilder();
                    sb.append("from ");
                    sb.append(read2);
                    FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Main", "completed", write2, sb.toString());
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(FragmentBuilder_BindEbillSubscriptionReviewFragment fragmentBuilder_BindEbillSubscriptionReviewFragment) {
        FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment = fragmentBuilder_BindEbillSubscriptionReviewFragment.read;
        List<FragmentBuilder_BindEbillSubscriptionInputFragment> list = fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        boolean z2 = list != null && !list.isEmpty();
        if (fragmentBuilder_BindEbillSubscriptionInputFragment == null && !z2) {
            z = false;
        }
        if (z) {
            Exception exc = fragmentBuilder_BindEbillSubscriptionReviewFragment.write;
            Bitmap bitmap = fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaSessionCompat$ResultReceiverWrapper;
            read read2 = fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaBrowserCompat$SearchResultReceiver;
            if (fragmentBuilder_BindEbillSubscriptionInputFragment != null) {
                IconCompatParcelizer(bitmap, read2, fragmentBuilder_BindEbillSubscriptionInputFragment, exc);
            }
            if (z2) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    IconCompatParcelizer(bitmap, read2, list.get(i), exc);
                }
            }
            Picasso$MediaBrowserCompat$CustomActionResultReceiver picasso$MediaBrowserCompat$CustomActionResultReceiver = this.f3102x50fd9e4a;
            if (picasso$MediaBrowserCompat$CustomActionResultReceiver != null && exc != null) {
                picasso$MediaBrowserCompat$CustomActionResultReceiver.read();
            }
        }
    }

    public final void read(FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment) {
        WeakReference<T> weakReference = fragmentBuilder_BindEbillSubscriptionInputFragment.ParcelableVolumeInfo;
        T t = weakReference == null ? null : weakReference.get();
        if (!(t == null || this.MediaSessionCompat$Token.get(t) == fragmentBuilder_BindEbillSubscriptionInputFragment)) {
            write((Object) t);
            this.MediaSessionCompat$Token.put(t, fragmentBuilder_BindEbillSubscriptionInputFragment);
        }
        Handler handler = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        handler.sendMessage(handler.obtainMessage(1, fragmentBuilder_BindEbillSubscriptionInputFragment));
    }
}

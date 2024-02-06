package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.util.List;
import java.util.concurrent.Executor;
import p040o.Keep;
import p040o.KtaJsonCheck;
import p040o.performCreateOptionsMenu;
import p040o.setClipToPadding;

/* renamed from: o.isAbandoned */
public final class isAbandoned<R> implements commitContentChanged, KtaJsonCheck.C69271, KtaJsonCheck {
    private static final boolean write = Log.isLoggable("Request", 2);
    private final String ActionMenuItemView;
    private final hasOptionsMenu AlertController$RecycleListView;
    private isAbandoned$MediaBrowserCompat$CustomActionResultReceiver AppCompatActivity;
    private performOptionsMenuClosed<R> AppCompatDelegateImpl$ListMenuDecorView;
    private final setClipToPadding AppCompatDialogFragment;
    private int AppCompatViewInflater;
    private final Context IconCompatParcelizer;
    private final Object Keep;
    private final registerListener<? super R> MediaBrowserCompat$CustomActionResultReceiver;
    private final Executor MediaBrowserCompat$ItemReceiver;
    private final getView MediaBrowserCompat$MediaItem;
    private Drawable MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final int f2602x50fd9e4a;
    private Drawable MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private final Object MediaSessionCompat$QueueItem;
    private final int MediaSessionCompat$ResultReceiverWrapper;
    private Drawable MediaSessionCompat$Token;
    private performCreateOptionsMenu.write ParcelableVolumeInfo;
    private final List<deliverCancellation<R>> PlaybackStateCompat;
    private final abandon<?> PlaybackStateCompat$CustomAction;
    private boolean RatingCompat;
    private volatile performCreateOptionsMenu read;
    private RuntimeException setBackgroundResource;
    private final onAbandon<R> setCheckable;
    private final Class<R> setChecked;
    private long setContentView;
    private final deliverCancellation<R> setExpandedFormat;
    private final Keep.read setHasDecor;

    public static <R> isAbandoned<R> MediaBrowserCompat$ItemReceiver(Context context, getView getview, Object obj, Object obj2, Class<R> cls, abandon<?> abandon, int i, int i2, hasOptionsMenu hasoptionsmenu, onAbandon<R> onabandon, deliverCancellation<R> delivercancellation, List<deliverCancellation<R>> list, Keep.read read2, performCreateOptionsMenu performcreateoptionsmenu, registerListener<? super R> registerlistener, Executor executor) {
        return new isAbandoned(context, getview, obj, obj2, cls, abandon, i, i2, hasoptionsmenu, onabandon, delivercancellation, list, (Keep.read) null, performcreateoptionsmenu, registerlistener, executor);
    }

    private isAbandoned(Context context, getView getview, Object obj, Object obj2, Class<R> cls, abandon<?> abandon, int i, int i2, hasOptionsMenu hasoptionsmenu, onAbandon<R> onabandon, deliverCancellation<R> delivercancellation, List<deliverCancellation<R>> list, Keep.read read2, performCreateOptionsMenu performcreateoptionsmenu, registerListener<? super R> registerlistener, Executor executor) {
        getView getview2 = getview;
        this.ActionMenuItemView = write ? String.valueOf(super.hashCode()) : null;
        this.AppCompatDialogFragment = new setClipToPadding.write();
        this.Keep = obj;
        this.IconCompatParcelizer = context;
        this.MediaBrowserCompat$MediaItem = getview2;
        this.MediaSessionCompat$QueueItem = obj2;
        this.setChecked = cls;
        this.PlaybackStateCompat$CustomAction = abandon;
        this.MediaSessionCompat$ResultReceiverWrapper = i;
        this.f2602x50fd9e4a = i2;
        this.AlertController$RecycleListView = hasoptionsmenu;
        this.setCheckable = onabandon;
        this.setExpandedFormat = delivercancellation;
        this.PlaybackStateCompat = list;
        this.setHasDecor = read2;
        this.read = performcreateoptionsmenu;
        this.MediaBrowserCompat$CustomActionResultReceiver = registerlistener;
        this.MediaBrowserCompat$ItemReceiver = executor;
        this.AppCompatActivity = isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.PENDING;
        if (this.setBackgroundResource == null && getview2.MediaBrowserCompat$SearchResultReceiver) {
            this.setBackgroundResource = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.Keep
            monitor-enter(r0)
            boolean r1 = r4.RatingCompat     // Catch:{ all -> 0x00c1 }
            if (r1 != 0) goto L_0x00b9
            o.setClipToPadding r1 = r4.AppCompatDialogFragment     // Catch:{ all -> 0x00c1 }
            r1.write()     // Catch:{ all -> 0x00c1 }
            long r1 = p040o.AudioAttributesCompatParcelizer.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x00c1 }
            r4.setContentView = r1     // Catch:{ all -> 0x00c1 }
            java.lang.Object r1 = r4.MediaSessionCompat$QueueItem     // Catch:{ all -> 0x00c1 }
            if (r1 != 0) goto L_0x003d
            int r1 = r4.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x00c1 }
            int r2 = r4.f2602x50fd9e4a     // Catch:{ all -> 0x00c1 }
            boolean r1 = p040o.LinearLayoutManager.write(r1, r2)     // Catch:{ all -> 0x00c1 }
            if (r1 == 0) goto L_0x0028
            int r1 = r4.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x00c1 }
            r4.AppCompatViewInflater = r1     // Catch:{ all -> 0x00c1 }
            int r1 = r4.f2602x50fd9e4a     // Catch:{ all -> 0x00c1 }
            r4.MediaMetadataCompat = r1     // Catch:{ all -> 0x00c1 }
        L_0x0028:
            android.graphics.drawable.Drawable r1 = r4.MediaBrowserCompat$MediaItem()     // Catch:{ all -> 0x00c1 }
            if (r1 != 0) goto L_0x0030
            r1 = 5
            goto L_0x0031
        L_0x0030:
            r1 = 3
        L_0x0031:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00c1 }
            r4.write(r2, r1)     // Catch:{ all -> 0x00c1 }
            monitor-exit(r0)
            return
        L_0x003d:
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r1 = r4.AppCompatActivity     // Catch:{ all -> 0x00c1 }
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r2 = p040o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.RUNNING     // Catch:{ all -> 0x00c1 }
            if (r1 == r2) goto L_0x00b1
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r1 = r4.AppCompatActivity     // Catch:{ all -> 0x00c1 }
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r2 = p040o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.COMPLETE     // Catch:{ all -> 0x00c1 }
            if (r1 != r2) goto L_0x0052
            o.performOptionsMenuClosed<R> r1 = r4.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ all -> 0x00c1 }
            o.isPostponed r2 = p040o.isPostponed.MEMORY_CACHE     // Catch:{ all -> 0x00c1 }
            r4.read(r1, r2)     // Catch:{ all -> 0x00c1 }
            monitor-exit(r0)
            return
        L_0x0052:
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.WAITING_FOR_SIZE     // Catch:{ all -> 0x00c1 }
            r4.AppCompatActivity = r1     // Catch:{ all -> 0x00c1 }
            int r1 = r4.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x00c1 }
            int r2 = r4.f2602x50fd9e4a     // Catch:{ all -> 0x00c1 }
            boolean r1 = p040o.LinearLayoutManager.write(r1, r2)     // Catch:{ all -> 0x00c1 }
            if (r1 == 0) goto L_0x0068
            int r1 = r4.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x00c1 }
            int r2 = r4.f2602x50fd9e4a     // Catch:{ all -> 0x00c1 }
            r4.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)     // Catch:{ all -> 0x00c1 }
            goto L_0x006d
        L_0x0068:
            o.onAbandon<R> r1 = r4.setCheckable     // Catch:{ all -> 0x00c1 }
            r1.IconCompatParcelizer((p040o.KtaJsonCheck.C69271) r4)     // Catch:{ all -> 0x00c1 }
        L_0x006d:
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r1 = r4.AppCompatActivity     // Catch:{ all -> 0x00c1 }
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r2 = p040o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.RUNNING     // Catch:{ all -> 0x00c1 }
            if (r1 == r2) goto L_0x0079
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r1 = r4.AppCompatActivity     // Catch:{ all -> 0x00c1 }
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r2 = p040o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.WAITING_FOR_SIZE     // Catch:{ all -> 0x00c1 }
            if (r1 != r2) goto L_0x0091
        L_0x0079:
            o.Keep$read r1 = r4.setHasDecor     // Catch:{ all -> 0x00c1 }
            if (r1 == 0) goto L_0x0085
            boolean r1 = r1.ParcelableVolumeInfo()     // Catch:{ all -> 0x00c1 }
            if (r1 != 0) goto L_0x0085
            r1 = 0
            goto L_0x0086
        L_0x0085:
            r1 = 1
        L_0x0086:
            if (r1 == 0) goto L_0x0091
            o.onAbandon<R> r1 = r4.setCheckable     // Catch:{ all -> 0x00c1 }
            android.graphics.drawable.Drawable r2 = r4.MediaBrowserCompat$SearchResultReceiver()     // Catch:{ all -> 0x00c1 }
            r1.read(r2)     // Catch:{ all -> 0x00c1 }
        L_0x0091:
            boolean r1 = write     // Catch:{ all -> 0x00c1 }
            if (r1 == 0) goto L_0x00af
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r1.<init>()     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00c1 }
            long r2 = r4.setContentView     // Catch:{ all -> 0x00c1 }
            double r2 = p040o.AudioAttributesCompatParcelizer.write(r2)     // Catch:{ all -> 0x00c1 }
            r1.append(r2)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c1 }
            r4.MediaBrowserCompat$CustomActionResultReceiver(r1)     // Catch:{ all -> 0x00c1 }
        L_0x00af:
            monitor-exit(r0)
            return
        L_0x00b1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00c1 }
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00b9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x00c1 }
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isAbandoned.read():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005e, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0060, code lost:
        p040o.performCreateOptionsMenu.read((p040o.performOptionsMenuClosed<?>) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.Keep
            monitor-enter(r0)
            boolean r1 = r5.RatingCompat     // Catch:{ all -> 0x0074 }
            if (r1 != 0) goto L_0x006c
            o.setClipToPadding r1 = r5.AppCompatDialogFragment     // Catch:{ all -> 0x0074 }
            r1.write()     // Catch:{ all -> 0x0074 }
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r1 = r5.AppCompatActivity     // Catch:{ all -> 0x0074 }
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r2 = p040o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.CLEARED     // Catch:{ all -> 0x0074 }
            if (r1 != r2) goto L_0x0014
            monitor-exit(r0)
            return
        L_0x0014:
            boolean r1 = r5.RatingCompat     // Catch:{ all -> 0x0074 }
            if (r1 != 0) goto L_0x0064
            o.setClipToPadding r1 = r5.AppCompatDialogFragment     // Catch:{ all -> 0x0074 }
            r1.write()     // Catch:{ all -> 0x0074 }
            o.onAbandon<R> r1 = r5.setCheckable     // Catch:{ all -> 0x0074 }
            r1.MediaBrowserCompat$CustomActionResultReceiver(r5)     // Catch:{ all -> 0x0074 }
            o.performCreateOptionsMenu$write r1 = r5.ParcelableVolumeInfo     // Catch:{ all -> 0x0074 }
            r2 = 0
            if (r1 == 0) goto L_0x0038
            o.performCreateOptionsMenu r3 = p040o.performCreateOptionsMenu.this     // Catch:{ all -> 0x0074 }
            monitor-enter(r3)     // Catch:{ all -> 0x0074 }
            o.performConfigurationChanged<?> r4 = r1.IconCompatParcelizer     // Catch:{ all -> 0x0035 }
            o.KtaJsonCheck r1 = r1.read     // Catch:{ all -> 0x0035 }
            r4.read((p040o.KtaJsonCheck) r1)     // Catch:{ all -> 0x0035 }
            monitor-exit(r3)     // Catch:{ all -> 0x0074 }
            r5.ParcelableVolumeInfo = r2     // Catch:{ all -> 0x0074 }
            goto L_0x0038
        L_0x0035:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0074 }
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0038:
            o.performOptionsMenuClosed<R> r1 = r5.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0041
            o.performOptionsMenuClosed<R> r1 = r5.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ all -> 0x0074 }
            r5.AppCompatDelegateImpl$ListMenuDecorView = r2     // Catch:{ all -> 0x0074 }
            r2 = r1
        L_0x0041:
            o.Keep$read r1 = r5.setHasDecor     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x004d
            boolean r1 = r1.MediaDescriptionCompat()     // Catch:{ all -> 0x0074 }
            if (r1 != 0) goto L_0x004d
            r1 = 0
            goto L_0x004e
        L_0x004d:
            r1 = 1
        L_0x004e:
            if (r1 == 0) goto L_0x0059
            o.onAbandon<R> r1 = r5.setCheckable     // Catch:{ all -> 0x0074 }
            android.graphics.drawable.Drawable r3 = r5.MediaBrowserCompat$SearchResultReceiver()     // Catch:{ all -> 0x0074 }
            r1.write(r3)     // Catch:{ all -> 0x0074 }
        L_0x0059:
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.CLEARED     // Catch:{ all -> 0x0074 }
            r5.AppCompatActivity = r1     // Catch:{ all -> 0x0074 }
            monitor-exit(r0)
            if (r2 == 0) goto L_0x0063
            p040o.performCreateOptionsMenu.read((p040o.performOptionsMenuClosed<?>) r2)
        L_0x0063:
            return
        L_0x0064:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x0074 }
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x006c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x0074 }
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isAbandoned.MediaBrowserCompat$CustomActionResultReceiver():void");
    }

    public final void MediaDescriptionCompat() {
        synchronized (this.Keep) {
            if (IconCompatParcelizer()) {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }

    public final boolean IconCompatParcelizer() {
        boolean z;
        synchronized (this.Keep) {
            z = this.AppCompatActivity == isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.RUNNING || this.AppCompatActivity == isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.WAITING_FOR_SIZE;
        }
        return z;
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        boolean z;
        synchronized (this.Keep) {
            z = this.AppCompatActivity == isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.COMPLETE;
        }
        return z;
    }

    public final boolean write() {
        boolean z;
        synchronized (this.Keep) {
            z = this.AppCompatActivity == isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.CLEARED;
        }
        return z;
    }

    private Drawable MediaBrowserCompat$SearchResultReceiver() {
        if (this.MediaSessionCompat$Token == null) {
            Drawable drawable = this.PlaybackStateCompat$CustomAction.f2569x50fd9e4a;
            this.MediaSessionCompat$Token = drawable;
            if (drawable == null && this.PlaybackStateCompat$CustomAction.Keep > 0) {
                this.MediaSessionCompat$Token = IconCompatParcelizer(this.PlaybackStateCompat$CustomAction.Keep);
            }
        }
        return this.MediaSessionCompat$Token;
    }

    private Drawable MediaBrowserCompat$MediaItem() {
        if (this.MediaDescriptionCompat == null) {
            Drawable drawable = this.PlaybackStateCompat$CustomAction.MediaDescriptionCompat;
            this.MediaDescriptionCompat = drawable;
            if (drawable == null && this.PlaybackStateCompat$CustomAction.MediaBrowserCompat$MediaItem > 0) {
                this.MediaDescriptionCompat = IconCompatParcelizer(this.PlaybackStateCompat$CustomAction.MediaBrowserCompat$MediaItem);
            }
        }
        return this.MediaDescriptionCompat;
    }

    private Drawable IconCompatParcelizer(int i) {
        Resources.Theme theme;
        if (this.PlaybackStateCompat$CustomAction.setHasDecor != null) {
            theme = this.PlaybackStateCompat$CustomAction.setHasDecor;
        } else {
            theme = this.IconCompatParcelizer.getTheme();
        }
        getView getview = this.MediaBrowserCompat$MediaItem;
        return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Context) getview, (Context) getview, i, theme);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        Object obj;
        int i3;
        int i4 = i;
        int i5 = i2;
        this.AppCompatDialogFragment.write();
        Object obj2 = this.Keep;
        synchronized (obj2) {
            try {
                if (write) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got onSizeReady in ");
                    sb.append(AudioAttributesCompatParcelizer.write(this.setContentView));
                    MediaBrowserCompat$CustomActionResultReceiver(sb.toString());
                }
                if (this.AppCompatActivity == isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.WAITING_FOR_SIZE) {
                    this.AppCompatActivity = isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.RUNNING;
                    float f = this.PlaybackStateCompat$CustomAction.PlaybackStateCompat$CustomAction;
                    if (i4 != Integer.MIN_VALUE) {
                        i4 = Math.round(((float) i4) * f);
                    }
                    this.AppCompatViewInflater = i4;
                    if (i5 != Integer.MIN_VALUE) {
                        i3 = Math.round(f * ((float) i5));
                    } else {
                        i3 = i5;
                    }
                    this.MediaMetadataCompat = i3;
                    if (write) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("finished setup for calling load in ");
                        sb2.append(AudioAttributesCompatParcelizer.write(this.setContentView));
                        MediaBrowserCompat$CustomActionResultReceiver(sb2.toString());
                    }
                    obj = obj2;
                    try {
                        try {
                            this.ParcelableVolumeInfo = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem, this.MediaSessionCompat$QueueItem, this.PlaybackStateCompat$CustomAction.PlaybackStateCompat, this.AppCompatViewInflater, this.MediaMetadataCompat, this.PlaybackStateCompat$CustomAction.AlertController$RecycleListView, this.setChecked, this.AlertController$RecycleListView, this.PlaybackStateCompat$CustomAction.write, this.PlaybackStateCompat$CustomAction.setContentView, this.PlaybackStateCompat$CustomAction.MediaSessionCompat$ResultReceiverWrapper, this.PlaybackStateCompat$CustomAction.ParcelableVolumeInfo, this.PlaybackStateCompat$CustomAction.MediaSessionCompat$QueueItem, this.PlaybackStateCompat$CustomAction.MediaBrowserCompat$SearchResultReceiver, this.PlaybackStateCompat$CustomAction.AppCompatActivity, this.PlaybackStateCompat$CustomAction.AppCompatDelegateImpl$ListMenuDecorView, this.PlaybackStateCompat$CustomAction.MediaSessionCompat$Token, this, this.MediaBrowserCompat$ItemReceiver);
                            if (this.AppCompatActivity != isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.RUNNING) {
                                this.ParcelableVolumeInfo = null;
                            }
                            if (write) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("finished onSizeReady in ");
                                sb3.append(AudioAttributesCompatParcelizer.write(this.setContentView));
                                MediaBrowserCompat$CustomActionResultReceiver(sb3.toString());
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        p040o.performCreateOptionsMenu.read(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b4, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b6, code lost:
        p040o.performCreateOptionsMenu.read(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(p040o.performOptionsMenuClosed<?> r6, p040o.isPostponed r7) {
        /*
            r5 = this;
            o.setClipToPadding r0 = r5.AppCompatDialogFragment
            r0.write()
            r0 = 0
            java.lang.Object r1 = r5.Keep     // Catch:{ all -> 0x00c4 }
            monitor-enter(r1)     // Catch:{ all -> 0x00c4 }
            r5.ParcelableVolumeInfo = r0     // Catch:{ all -> 0x00bc }
            if (r6 != 0) goto L_0x002f
            com.bumptech.glide.load.engine.GlideException r6 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00bc }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            r7.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r7.append(r2)     // Catch:{ all -> 0x00bc }
            java.lang.Class<R> r2 = r5.setChecked     // Catch:{ all -> 0x00bc }
            r7.append(r2)     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = " inside, but instead got null."
            r7.append(r2)     // Catch:{ all -> 0x00bc }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00bc }
            r6.<init>(r7)     // Catch:{ all -> 0x00bc }
            r5.write(r6)     // Catch:{ all -> 0x00bc }
            monitor-exit(r1)
            return
        L_0x002f:
            java.lang.Object r2 = r6.write()     // Catch:{ all -> 0x00bc }
            if (r2 == 0) goto L_0x0063
            java.lang.Class<R> r3 = r5.setChecked     // Catch:{ all -> 0x00bc }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00bc }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00bc }
            if (r3 != 0) goto L_0x0042
            goto L_0x0063
        L_0x0042:
            o.Keep$read r3 = r5.setHasDecor     // Catch:{ all -> 0x00bc }
            if (r3 == 0) goto L_0x004e
            boolean r3 = r3.MediaSessionCompat$ResultReceiverWrapper()     // Catch:{ all -> 0x00bc }
            if (r3 != 0) goto L_0x004e
            r3 = 0
            goto L_0x004f
        L_0x004e:
            r3 = 1
        L_0x004f:
            if (r3 != 0) goto L_0x005e
            r5.AppCompatDelegateImpl$ListMenuDecorView = r0     // Catch:{ all -> 0x00ba }
            o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver r7 = p040o.isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.COMPLETE     // Catch:{ all -> 0x00ba }
            r5.AppCompatActivity = r7     // Catch:{ all -> 0x00ba }
            monitor-exit(r1)
            if (r6 == 0) goto L_0x005d
            p040o.performCreateOptionsMenu.read((p040o.performOptionsMenuClosed<?>) r6)
        L_0x005d:
            return
        L_0x005e:
            r5.MediaBrowserCompat$CustomActionResultReceiver(r6, r2, r7)     // Catch:{ all -> 0x00bc }
            monitor-exit(r1)
            return
        L_0x0063:
            r5.AppCompatDelegateImpl$ListMenuDecorView = r0     // Catch:{ all -> 0x00ba }
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r0.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "Expected to receive an object of "
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            java.lang.Class<R> r3 = r5.setChecked     // Catch:{ all -> 0x00ba }
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = " but instead got "
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x0082
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x00ba }
            goto L_0x0084
        L_0x0082:
            java.lang.String r3 = ""
        L_0x0084:
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "{"
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            r0.append(r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "} inside Resource{"
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            r0.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "}."
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x00a4
            java.lang.String r2 = ""
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x00a6:
            r0.append(r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ba }
            r7.<init>(r0)     // Catch:{ all -> 0x00ba }
            r5.write(r7)     // Catch:{ all -> 0x00ba }
            monitor-exit(r1)
            if (r6 == 0) goto L_0x00b9
            p040o.performCreateOptionsMenu.read((p040o.performOptionsMenuClosed<?>) r6)
        L_0x00b9:
            return
        L_0x00ba:
            r7 = move-exception
            goto L_0x00bf
        L_0x00bc:
            r6 = move-exception
            r7 = r6
            r6 = r0
        L_0x00bf:
            monitor-exit(r1)
            throw r7     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r7 = move-exception
            r0 = r6
            goto L_0x00c5
        L_0x00c4:
            r7 = move-exception
        L_0x00c5:
            if (r0 == 0) goto L_0x00ca
            p040o.performCreateOptionsMenu.read((p040o.performOptionsMenuClosed<?>) r0)
        L_0x00ca:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isAbandoned.read(o.performOptionsMenuClosed, o.isPostponed):void");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(performOptionsMenuClosed<R> performoptionsmenuclosed, R r, isPostponed ispostponed) {
        boolean z;
        this.AppCompatActivity = isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.COMPLETE;
        this.AppCompatDelegateImpl$ListMenuDecorView = performoptionsmenuclosed;
        if (this.MediaBrowserCompat$MediaItem.MediaDescriptionCompat <= 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Finished loading ");
            sb.append(r.getClass().getSimpleName());
            sb.append(" from ");
            sb.append(ispostponed);
            sb.append(" for ");
            sb.append(this.MediaSessionCompat$QueueItem);
            sb.append(" with size [");
            sb.append(this.AppCompatViewInflater);
            sb.append("x");
            sb.append(this.MediaMetadataCompat);
            sb.append("] in ");
            sb.append(AudioAttributesCompatParcelizer.write(this.setContentView));
            sb.append(" ms");
            Log.d("Glide", sb.toString());
        }
        boolean z2 = true;
        this.RatingCompat = true;
        try {
            if (this.PlaybackStateCompat != null) {
                z = false;
                for (deliverCancellation<R> IconCompatParcelizer2 : this.PlaybackStateCompat) {
                    z |= IconCompatParcelizer2.IconCompatParcelizer(r);
                }
            } else {
                z = false;
            }
            if (this.setExpandedFormat == null || !this.setExpandedFormat.IconCompatParcelizer(r)) {
                z2 = false;
            }
            if (!z2 && !z) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
                this.setCheckable.MediaBrowserCompat$ItemReceiver(r);
            }
        } finally {
            this.RatingCompat = false;
        }
    }

    public final void write(GlideException glideException) {
        write(glideException, 5);
    }

    public final Object RatingCompat() {
        this.AppCompatDialogFragment.write();
        return this.Keep;
    }

    private void write(GlideException glideException, int i) {
        this.AppCompatDialogFragment.write();
        synchronized (this.Keep) {
            int i2 = this.MediaBrowserCompat$MediaItem.MediaDescriptionCompat;
            if (i2 <= i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Load failed for ");
                sb.append(this.MediaSessionCompat$QueueItem);
                sb.append(" with size [");
                sb.append(this.AppCompatViewInflater);
                sb.append("x");
                sb.append(this.MediaMetadataCompat);
                sb.append("]");
                Log.w("Glide", sb.toString(), glideException);
                if (i2 <= 4) {
                    glideException.MediaBrowserCompat$CustomActionResultReceiver("Glide");
                }
            }
            Drawable drawable = null;
            this.ParcelableVolumeInfo = null;
            this.AppCompatActivity = isAbandoned$MediaBrowserCompat$CustomActionResultReceiver.FAILED;
            boolean z = true;
            this.RatingCompat = true;
            try {
                if (this.PlaybackStateCompat != null) {
                    for (deliverCancellation<R> write2 : this.PlaybackStateCompat) {
                        write2.write(glideException);
                    }
                }
                if (this.setExpandedFormat != null) {
                    this.setExpandedFormat.write(glideException);
                }
                Keep.read read2 = this.setHasDecor;
                if (read2 != null && !read2.ParcelableVolumeInfo()) {
                    z = false;
                }
                if (z) {
                    if (this.MediaSessionCompat$QueueItem == null) {
                        drawable = MediaBrowserCompat$MediaItem();
                    }
                    if (drawable == null) {
                        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                            Drawable drawable2 = this.PlaybackStateCompat$CustomAction.MediaMetadataCompat;
                            this.MediaBrowserCompat$SearchResultReceiver = drawable2;
                            if (drawable2 == null && this.PlaybackStateCompat$CustomAction.MediaBrowserCompat$CustomActionResultReceiver > 0) {
                                this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer(this.PlaybackStateCompat$CustomAction.MediaBrowserCompat$CustomActionResultReceiver);
                            }
                        }
                        drawable = this.MediaBrowserCompat$SearchResultReceiver;
                    }
                    if (drawable == null) {
                        drawable = MediaBrowserCompat$SearchResultReceiver();
                    }
                    this.setCheckable.IconCompatParcelizer(drawable);
                }
            } finally {
                this.RatingCompat = false;
            }
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(commitContentChanged commitcontentchanged) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        abandon<?> abandon;
        hasOptionsMenu hasoptionsmenu;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        abandon<?> abandon2;
        hasOptionsMenu hasoptionsmenu2;
        int size2;
        commitContentChanged commitcontentchanged2 = commitcontentchanged;
        if (!(commitcontentchanged2 instanceof isAbandoned)) {
            return false;
        }
        synchronized (this.Keep) {
            i = this.MediaSessionCompat$ResultReceiverWrapper;
            i2 = this.f2602x50fd9e4a;
            obj = this.MediaSessionCompat$QueueItem;
            cls = this.setChecked;
            abandon = this.PlaybackStateCompat$CustomAction;
            hasoptionsmenu = this.AlertController$RecycleListView;
            size = this.PlaybackStateCompat != null ? this.PlaybackStateCompat.size() : 0;
        }
        isAbandoned isabandoned = (isAbandoned) commitcontentchanged2;
        synchronized (isabandoned.Keep) {
            i3 = isabandoned.MediaSessionCompat$ResultReceiverWrapper;
            i4 = isabandoned.f2602x50fd9e4a;
            obj2 = isabandoned.MediaSessionCompat$QueueItem;
            cls2 = isabandoned.setChecked;
            abandon2 = isabandoned.PlaybackStateCompat$CustomAction;
            hasoptionsmenu2 = isabandoned.AlertController$RecycleListView;
            size2 = isabandoned.PlaybackStateCompat != null ? isabandoned.PlaybackStateCompat.size() : 0;
        }
        return i == i3 && i2 == i4 && LinearLayoutManager.IconCompatParcelizer(obj, obj2) && cls.equals(cls2) && abandon.equals(abandon2) && hasoptionsmenu == hasoptionsmenu2 && size == size2;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.ActionMenuItemView);
        Log.v("Request", sb.toString());
    }
}

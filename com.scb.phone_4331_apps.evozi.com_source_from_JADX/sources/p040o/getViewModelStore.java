package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.Keep;

/* renamed from: o.getViewModelStore */
public final class getViewModelStore<TranscodeType> extends abandon<getViewModelStore<TranscodeType>> implements Cloneable {
    private isHideReplaced<?, ? super TranscodeType> ActionMenuItemView;
    private final Context AppCompatDialogFragment;
    private final Class<TranscodeType> AppCompatViewInflater;
    public boolean IconCompatParcelizer;
    public Object MediaBrowserCompat$ItemReceiver;
    public List<deliverCancellation<TranscodeType>> read;
    private final getView setBackgroundResource;
    private final hashCode setCheckable;

    static {
        ((isReset) ((isReset) new isReset().MediaBrowserCompat$CustomActionResultReceiver(performCreate.write)).MediaBrowserCompat$ItemReceiver(hasOptionsMenu.LOW)).read(true);
    }

    protected getViewModelStore(Glide glide, hashCode hashcode, Class<TranscodeType> cls, Context context) {
        this.setCheckable = hashcode;
        this.AppCompatViewInflater = cls;
        this.AppCompatDialogFragment = context;
        getView getview = hashcode.IconCompatParcelizer.read;
        isHideReplaced<?, ?> ishidereplaced = getview.read.get(cls);
        if (ishidereplaced == null) {
            for (Map.Entry next : getview.read.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    ishidereplaced = (isHideReplaced) next.getValue();
                }
            }
        }
        this.ActionMenuItemView = ishidereplaced == null ? getView.MediaBrowserCompat$ItemReceiver : ishidereplaced;
        this.setBackgroundResource = glide.read;
        for (deliverCancellation<Object> write : hashcode.MediaBrowserCompat$CustomActionResultReceiver) {
            write(write);
        }
        isReset IconCompatParcelizer2 = hashcode.IconCompatParcelizer();
        if (IconCompatParcelizer2 != null) {
            super.IconCompatParcelizer((abandon<?>) IconCompatParcelizer2);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final getViewModelStore<TranscodeType> MediaBrowserCompat$ItemReceiver(abandon<?> abandon) {
        if (abandon != null) {
            return (getViewModelStore) super.IconCompatParcelizer(abandon);
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final getViewModelStore<TranscodeType> write(deliverCancellation<TranscodeType> delivercancellation) {
        if (delivercancellation != null) {
            if (this.read == null) {
                this.read = new ArrayList();
            }
            this.read.add(delivercancellation);
        }
        return this;
    }

    public final <Y extends onAbandon<TranscodeType>> Y MediaBrowserCompat$CustomActionResultReceiver(Y y, deliverCancellation<TranscodeType> delivercancellation, abandon<?> abandon, Executor executor) {
        Y y2 = y;
        if (y2 == null) {
            throw new NullPointerException("Argument must not be null");
        } else if (this.IconCompatParcelizer) {
            Object obj = new Object();
            isHideReplaced<?, ? super TranscodeType> ishidereplaced = this.ActionMenuItemView;
            hasOptionsMenu MediaBrowserCompat$SearchResultReceiver = abandon.MediaBrowserCompat$SearchResultReceiver();
            int MediaDescriptionCompat = abandon.MediaDescriptionCompat();
            int write = abandon.write();
            Context context = this.AppCompatDialogFragment;
            getView getview = this.setBackgroundResource;
            isAbandoned<? super TranscodeType> MediaBrowserCompat$ItemReceiver2 = isAbandoned.MediaBrowserCompat$ItemReceiver(context, getview, obj, this.MediaBrowserCompat$ItemReceiver, this.AppCompatViewInflater, abandon, MediaDescriptionCompat, write, MediaBrowserCompat$SearchResultReceiver, y, delivercancellation, this.read, (Keep.read) null, getview.MediaBrowserCompat$CustomActionResultReceiver, ishidereplaced.MediaBrowserCompat$ItemReceiver, executor);
            commitContentChanged read2 = y.read();
            if (MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver(read2)) {
                if (!(!abandon.MediaBrowserCompat$SearchResultReceiver && read2.MediaBrowserCompat$ItemReceiver())) {
                    if (read2 != null) {
                        if (!read2.IconCompatParcelizer()) {
                            read2.read();
                        }
                        return y2;
                    }
                    throw new NullPointerException("Argument must not be null");
                }
            }
            hashCode hashcode = this.setCheckable;
            if (y2 != null) {
                hashcode.MediaBrowserCompat$CustomActionResultReceiver(y2);
            }
            y2.MediaBrowserCompat$ItemReceiver((commitContentChanged) MediaBrowserCompat$ItemReceiver2);
            hashCode hashcode2 = this.setCheckable;
            synchronized (hashcode2) {
                hashcode2.write.MediaBrowserCompat$ItemReceiver.add(y2);
                onDestroyView$MediaBrowserCompat$CustomActionResultReceiver ondestroyview_mediabrowsercompat_customactionresultreceiver = hashcode2.MediaBrowserCompat$ItemReceiver;
                ondestroyview_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.add(MediaBrowserCompat$ItemReceiver2);
                if (!ondestroyview_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer) {
                    MediaBrowserCompat$ItemReceiver2.read();
                } else {
                    MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    ondestroyview_mediabrowsercompat_customactionresultreceiver.read.add(MediaBrowserCompat$ItemReceiver2);
                }
            }
            return y2;
        } else {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
    }

    public final C1430reset<ImageView, TranscodeType> MediaBrowserCompat$ItemReceiver(ImageView imageView) {
        abandon abandon;
        LinearLayoutManager.IconCompatParcelizer();
        if (imageView != null) {
            if (!MediaSessionCompat$Token() && MediaMetadataCompat() && imageView.getScaleType() != null) {
                switch (C13514.write[imageView.getScaleType().ordinal()]) {
                    case 1:
                        abandon = clone().MediaSessionCompat$QueueItem();
                        break;
                    case 2:
                        abandon = clone().ParcelableVolumeInfo();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        abandon = clone().mo17959x50fd9e4a();
                        break;
                    case 6:
                        abandon = clone().ParcelableVolumeInfo();
                        break;
                }
            }
            abandon = this;
            return (C1430reset) MediaBrowserCompat$CustomActionResultReceiver(getView.MediaBrowserCompat$CustomActionResultReceiver(imageView, this.AppCompatViewInflater), (deliverCancellation) null, abandon, AudioAttributesImplBaseParcelizer.write());
        }
        throw new NullPointerException("Argument must not be null");
    }

    /* renamed from: o.getViewModelStore$4 */
    static /* synthetic */ class C13514 {
        private static /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                o.hasOptionsMenu[] r0 = p040o.hasOptionsMenu.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                IconCompatParcelizer = r0
                r1 = 1
                o.hasOptionsMenu r2 = p040o.hasOptionsMenu.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.hasOptionsMenu r3 = p040o.hasOptionsMenu.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.hasOptionsMenu r4 = p040o.hasOptionsMenu.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.hasOptionsMenu r5 = p040o.hasOptionsMenu.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                write = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = write     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.getViewModelStore.C13514.<clinit>():void");
        }
    }

    public final /* synthetic */ abandon IconCompatParcelizer(abandon abandon) {
        if (abandon != null) {
            return (getViewModelStore) super.IconCompatParcelizer((abandon<?>) abandon);
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final /* synthetic */ abandon read() {
        getViewModelStore getviewmodelstore = (getViewModelStore) super.clone();
        getviewmodelstore.ActionMenuItemView = getviewmodelstore.ActionMenuItemView.clone();
        return getviewmodelstore;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        getViewModelStore getviewmodelstore = (getViewModelStore) super.clone();
        getviewmodelstore.ActionMenuItemView = getviewmodelstore.ActionMenuItemView.clone();
        return getviewmodelstore;
    }

    public final getViewModelStore<TranscodeType> IconCompatParcelizer(Bitmap bitmap) {
        this.MediaBrowserCompat$ItemReceiver = bitmap;
        this.IconCompatParcelizer = true;
        isReset isreset = (isReset) new isReset().MediaBrowserCompat$CustomActionResultReceiver(performCreate.read);
        if (isreset != null) {
            return (getViewModelStore) super.IconCompatParcelizer((abandon<?>) isreset);
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final getViewModelStore<TranscodeType> IconCompatParcelizer(Drawable drawable) {
        this.MediaBrowserCompat$ItemReceiver = drawable;
        this.IconCompatParcelizer = true;
        isReset isreset = (isReset) new isReset().MediaBrowserCompat$CustomActionResultReceiver(performCreate.read);
        if (isreset != null) {
            return (getViewModelStore) super.IconCompatParcelizer((abandon<?>) isreset);
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final getViewModelStore<TranscodeType> read(Integer num) {
        this.MediaBrowserCompat$ItemReceiver = num;
        this.IconCompatParcelizer = true;
        isReset isreset = (isReset) new isReset().IconCompatParcelizer(registerOnLoadCanceledListener.IconCompatParcelizer(this.AppCompatDialogFragment));
        if (isreset != null) {
            return (getViewModelStore) super.IconCompatParcelizer((abandon<?>) isreset);
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final getViewModelStore<TranscodeType> IconCompatParcelizer(byte[] bArr) {
        getViewModelStore getviewmodelstore;
        this.MediaBrowserCompat$ItemReceiver = bArr;
        this.IconCompatParcelizer = true;
        if (!MediaBrowserCompat$MediaItem()) {
            isReset isreset = (isReset) new isReset().MediaBrowserCompat$CustomActionResultReceiver(performCreate.read);
            if (isreset != null) {
                getviewmodelstore = (getViewModelStore) super.IconCompatParcelizer((abandon<?>) isreset);
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        } else {
            getviewmodelstore = this;
        }
        if (getviewmodelstore.RatingCompat()) {
            return getviewmodelstore;
        }
        if (isReset.read == null) {
            isReset.read = (isReset) ((isReset) new isReset().read(true)).IconCompatParcelizer();
        }
        isReset isreset2 = isReset.read;
        if (isreset2 != null) {
            return (getViewModelStore) super.IconCompatParcelizer((abandon<?>) isreset2);
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final dataToString<TranscodeType> MediaBrowserCompat$ItemReceiver() {
        waitForLoader waitforloader = new waitForLoader(PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail);
        return (dataToString) MediaBrowserCompat$CustomActionResultReceiver(waitforloader, waitforloader, this, AudioAttributesImplBaseParcelizer.MediaBrowserCompat$CustomActionResultReceiver());
    }
}

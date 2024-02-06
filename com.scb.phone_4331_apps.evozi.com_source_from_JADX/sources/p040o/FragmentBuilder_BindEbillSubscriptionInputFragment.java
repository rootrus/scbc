package p040o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: o.FragmentBuilder_BindEbillSubscriptionInputFragment */
public abstract class FragmentBuilder_BindEbillSubscriptionInputFragment<T> {
    final Drawable IconCompatParcelizer;
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    final boolean MediaBrowserCompat$MediaItem;
    final Object MediaBrowserCompat$SearchResultReceiver;
    public final Picasso MediaDescriptionCompat;
    final int MediaMetadataCompat;
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    public final WeakReference<T> ParcelableVolumeInfo;
    public final FragmentBuilder_BindFixedTransferInputFormFragment RatingCompat;
    public final String read;
    final int write;

    public abstract void MediaBrowserCompat$ItemReceiver(Bitmap bitmap, Picasso.read read2);

    public abstract void MediaBrowserCompat$ItemReceiver(Exception exc);

    /* renamed from: o.FragmentBuilder_BindEbillSubscriptionInputFragment$IconCompatParcelizer */
    public static class IconCompatParcelizer<M> extends WeakReference<M> {
        public final FragmentBuilder_BindEbillSubscriptionInputFragment write;

        IconCompatParcelizer(FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.write = fragmentBuilder_BindEbillSubscriptionInputFragment;
        }
    }

    FragmentBuilder_BindEbillSubscriptionInputFragment(Picasso picasso, T t, FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        IconCompatParcelizer iconCompatParcelizer;
        this.MediaDescriptionCompat = picasso;
        this.RatingCompat = fragmentBuilder_BindFixedTransferInputFormFragment;
        if (t == null) {
            iconCompatParcelizer = null;
        } else {
            iconCompatParcelizer = new IconCompatParcelizer(this, t, picasso.MediaBrowserCompat$MediaItem);
        }
        this.ParcelableVolumeInfo = iconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.MediaMetadataCompat = i2;
        this.MediaBrowserCompat$MediaItem = z;
        this.write = i3;
        this.IconCompatParcelizer = drawable;
        this.read = str;
        this.MediaBrowserCompat$SearchResultReceiver = obj == null ? this : obj;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$ItemReceiver = true;
    }
}

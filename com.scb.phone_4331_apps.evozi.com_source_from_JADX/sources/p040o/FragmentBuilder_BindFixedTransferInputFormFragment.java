package p040o;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: o.FragmentBuilder_BindFixedTransferInputFormFragment */
public final class FragmentBuilder_BindFixedTransferInputFormFragment {
    private static final long PlaybackStateCompat = TimeUnit.SECONDS.toNanos(5);
    public final Uri AlertController$RecycleListView;
    public final Bitmap.Config IconCompatParcelizer;
    public final List<FragmentBuilder_BindFundSelectAccountFragment> Keep;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    int MediaBrowserCompat$MediaItem;
    public final int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f3141x50fd9e4a;
    public final boolean MediaDescriptionCompat;
    public final Picasso.IconCompatParcelizer MediaMetadataCompat;
    public final float MediaSessionCompat$QueueItem;
    public final float MediaSessionCompat$ResultReceiverWrapper;
    long MediaSessionCompat$Token;
    public final float ParcelableVolumeInfo;
    public final int PlaybackStateCompat$CustomAction;
    public final boolean RatingCompat;
    public final boolean read;
    public final int setHasDecor;
    public final int write;

    /* synthetic */ FragmentBuilder_BindFixedTransferInputFormFragment(Uri uri, int i, String str, List list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, Picasso.IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(uri, i, (String) null, list, i2, i3, z, z2, i4, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, false, config, iconCompatParcelizer);
    }

    private FragmentBuilder_BindFixedTransferInputFormFragment(Uri uri, int i, String str, List<FragmentBuilder_BindFundSelectAccountFragment> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, Picasso.IconCompatParcelizer iconCompatParcelizer) {
        this.AlertController$RecycleListView = uri;
        this.MediaBrowserCompat$SearchResultReceiver = i;
        this.f3141x50fd9e4a = str;
        if (list == null) {
            this.Keep = null;
        } else {
            this.Keep = Collections.unmodifiableList(list);
        }
        this.PlaybackStateCompat$CustomAction = i2;
        this.setHasDecor = i3;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.read = z2;
        this.write = i4;
        this.RatingCompat = z3;
        this.MediaSessionCompat$QueueItem = f;
        this.MediaSessionCompat$ResultReceiverWrapper = f2;
        this.ParcelableVolumeInfo = f3;
        this.MediaBrowserCompat$CustomActionResultReceiver = z4;
        this.MediaDescriptionCompat = z5;
        this.IconCompatParcelizer = config;
        this.MediaMetadataCompat = iconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.MediaBrowserCompat$SearchResultReceiver;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.AlertController$RecycleListView);
        }
        List<FragmentBuilder_BindFundSelectAccountFragment> list = this.Keep;
        if (list != null && !list.isEmpty()) {
            for (FragmentBuilder_BindFundSelectAccountFragment MediaBrowserCompat$ItemReceiver2 : this.Keep) {
                sb.append(' ');
                sb.append(MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver());
            }
        }
        if (this.f3141x50fd9e4a != null) {
            sb.append(" stableKey(");
            sb.append(this.f3141x50fd9e4a);
            sb.append(')');
        }
        if (this.PlaybackStateCompat$CustomAction > 0) {
            sb.append(" resize(");
            sb.append(this.PlaybackStateCompat$CustomAction);
            sb.append(',');
            sb.append(this.setHasDecor);
            sb.append(')');
        }
        if (this.MediaBrowserCompat$ItemReceiver) {
            sb.append(" centerCrop");
        }
        if (this.read) {
            sb.append(" centerInside");
        }
        if (this.MediaSessionCompat$QueueItem != BitmapDescriptorFactory.HUE_RED) {
            sb.append(" rotation(");
            sb.append(this.MediaSessionCompat$QueueItem);
            if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                sb.append(" @ ");
                sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
                sb.append(',');
                sb.append(this.ParcelableVolumeInfo);
            }
            sb.append(')');
        }
        if (this.MediaDescriptionCompat) {
            sb.append(" purgeable");
        }
        if (this.IconCompatParcelizer != null) {
            sb.append(' ');
            sb.append(this.IconCompatParcelizer);
        }
        sb.append('}');
        return sb.toString();
    }

    public final String write() {
        long nanoTime = System.nanoTime() - this.MediaSessionCompat$Token;
        if (nanoTime > PlaybackStateCompat) {
            StringBuilder sb = new StringBuilder();
            sb.append(MediaBrowserCompat$ItemReceiver());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(MediaBrowserCompat$ItemReceiver());
        sb2.append('+');
        sb2.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
        sb2.append("ms");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final String MediaBrowserCompat$ItemReceiver() {
        StringBuilder sb = new StringBuilder();
        sb.append("[R");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: o.FragmentBuilder_BindFixedTransferInputFormFragment$read */
    public static final class read {
        public boolean IconCompatParcelizer;
        Picasso.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        int MediaBrowserCompat$MediaItem;
        Uri MediaBrowserCompat$SearchResultReceiver;
        List<FragmentBuilder_BindFundSelectAccountFragment> MediaDescriptionCompat;
        int MediaMetadataCompat;
        int RatingCompat;
        public int read;
        public Bitmap.Config write;

        read(Uri uri, int i, Bitmap.Config config) {
            this.MediaBrowserCompat$SearchResultReceiver = uri;
            this.RatingCompat = i;
            this.write = config;
        }

        public final read read(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.MediaMetadataCompat = i;
                this.MediaBrowserCompat$MediaItem = i2;
                return this;
            }
        }

        public final read read(FragmentBuilder_BindFundSelectAccountFragment fragmentBuilder_BindFundSelectAccountFragment) {
            if (fragmentBuilder_BindFundSelectAccountFragment == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            } else if (fragmentBuilder_BindFundSelectAccountFragment.MediaBrowserCompat$ItemReceiver() != null) {
                if (this.MediaDescriptionCompat == null) {
                    this.MediaDescriptionCompat = new ArrayList(2);
                }
                this.MediaDescriptionCompat.add(fragmentBuilder_BindFundSelectAccountFragment);
                return this;
            } else {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
        }
    }
}

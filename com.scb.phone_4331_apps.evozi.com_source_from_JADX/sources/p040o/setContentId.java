package p040o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.setContentId */
public abstract class setContentId {
    public int IconCompatParcelizer;
    protected final RecyclerView$MediaBrowserCompat$SearchResultReceiver read;
    final Rect write;

    public abstract int IconCompatParcelizer();

    public abstract int IconCompatParcelizer(View view);

    public abstract int MediaBrowserCompat$CustomActionResultReceiver();

    public abstract int MediaBrowserCompat$CustomActionResultReceiver(View view);

    public abstract int MediaBrowserCompat$ItemReceiver();

    public abstract int MediaBrowserCompat$ItemReceiver(View view);

    public abstract int MediaBrowserCompat$MediaItem();

    public abstract int MediaBrowserCompat$SearchResultReceiver();

    public abstract int MediaDescriptionCompat();

    public abstract int MediaDescriptionCompat(View view);

    public abstract int read();

    public abstract int read(View view);

    public abstract int write(View view);

    public abstract void write(int i);

    /* synthetic */ setContentId(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver, byte b) {
        this(recyclerView$MediaBrowserCompat$SearchResultReceiver);
    }

    private setContentId(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver) {
        this.IconCompatParcelizer = PKIFailureInfo.systemUnavail;
        this.write = new Rect();
        this.read = recyclerView$MediaBrowserCompat$SearchResultReceiver;
    }

    public final RecyclerView$MediaBrowserCompat$SearchResultReceiver write() {
        return this.read;
    }

    public static setContentId MediaBrowserCompat$ItemReceiver(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver, int i) {
        if (i == 0) {
            return new setContentId(recyclerView$MediaBrowserCompat$SearchResultReceiver) {
                public final int MediaBrowserCompat$ItemReceiver() {
                    return this.read.setBackgroundResource - this.read.getPaddingRight();
                }

                public final int read() {
                    return this.read.setBackgroundResource;
                }

                public final void write(int i) {
                    this.read.RatingCompat(i);
                }

                public final int MediaDescriptionCompat() {
                    return this.read.getPaddingLeft();
                }

                public final int read(View view) {
                    RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
                    return RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver(view) + mediaDescriptionCompat.leftMargin + mediaDescriptionCompat.rightMargin;
                }

                public final int MediaBrowserCompat$CustomActionResultReceiver(View view) {
                    RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
                    return RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(view) + mediaDescriptionCompat.topMargin + mediaDescriptionCompat.bottomMargin;
                }

                public final int IconCompatParcelizer(View view) {
                    return view.getRight() + RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem(view) + ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).rightMargin;
                }

                public final int MediaBrowserCompat$ItemReceiver(View view) {
                    return (view.getLeft() - RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat(view)) - ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).leftMargin;
                }

                public final int write(View view) {
                    this.read.write(view, this.write);
                    return this.write.right;
                }

                public final int MediaDescriptionCompat(View view) {
                    this.read.write(view, this.write);
                    return this.write.left;
                }

                public final int MediaBrowserCompat$SearchResultReceiver() {
                    return (this.read.setBackgroundResource - this.read.getPaddingLeft()) - this.read.getPaddingRight();
                }

                public final int MediaBrowserCompat$CustomActionResultReceiver() {
                    return this.read.getPaddingRight();
                }

                public final int IconCompatParcelizer() {
                    return this.read.setContentView;
                }

                public final int MediaBrowserCompat$MediaItem() {
                    return this.read.MediaSessionCompat$QueueItem;
                }
            };
        }
        if (i == 1) {
            return new setContentId(recyclerView$MediaBrowserCompat$SearchResultReceiver) {
                public final int MediaBrowserCompat$ItemReceiver() {
                    return this.read.ParcelableVolumeInfo - this.read.getPaddingBottom();
                }

                public final int read() {
                    return this.read.ParcelableVolumeInfo;
                }

                public final void write(int i) {
                    this.read.MediaBrowserCompat$SearchResultReceiver(i);
                }

                public final int MediaDescriptionCompat() {
                    return this.read.getPaddingTop();
                }

                public final int read(View view) {
                    RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
                    return RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(view) + mediaDescriptionCompat.topMargin + mediaDescriptionCompat.bottomMargin;
                }

                public final int MediaBrowserCompat$CustomActionResultReceiver(View view) {
                    RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
                    return RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver(view) + mediaDescriptionCompat.leftMargin + mediaDescriptionCompat.rightMargin;
                }

                public final int IconCompatParcelizer(View view) {
                    return view.getBottom() + RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(view) + ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).bottomMargin;
                }

                public final int MediaBrowserCompat$ItemReceiver(View view) {
                    return (view.getTop() - RecyclerView$MediaBrowserCompat$SearchResultReceiver.RatingCompat(view)) - ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).topMargin;
                }

                public final int write(View view) {
                    this.read.write(view, this.write);
                    return this.write.bottom;
                }

                public final int MediaDescriptionCompat(View view) {
                    this.read.write(view, this.write);
                    return this.write.top;
                }

                public final int MediaBrowserCompat$SearchResultReceiver() {
                    return (this.read.ParcelableVolumeInfo - this.read.getPaddingTop()) - this.read.getPaddingBottom();
                }

                public final int MediaBrowserCompat$CustomActionResultReceiver() {
                    return this.read.getPaddingBottom();
                }

                public final int IconCompatParcelizer() {
                    return this.read.MediaSessionCompat$QueueItem;
                }

                public final int MediaBrowserCompat$MediaItem() {
                    return this.read.setContentView;
                }
            };
        }
        throw new IllegalArgumentException("invalid orientation");
    }
}

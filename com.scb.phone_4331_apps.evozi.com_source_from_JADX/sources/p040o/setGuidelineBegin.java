package p040o;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.setGuidelineBegin */
public class setGuidelineBegin extends RecyclerView.PlaybackStateCompat {
    public final DecelerateInterpolator IconCompatParcelizer = new DecelerateInterpolator();
    protected final LinearInterpolator MediaBrowserCompat$CustomActionResultReceiver = new LinearInterpolator();
    private int MediaSessionCompat$QueueItem = 0;
    private PointF MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token = 0;
    private final float write;

    public setGuidelineBegin(Context context) {
        this.write = MediaBrowserCompat$CustomActionResultReceiver(context.getResources().getDisplayMetrics());
    }

    public void read(View view, RecyclerView.Keep keep, RecyclerView.PlaybackStateCompat.write write2) {
        int i;
        int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.read;
        int i2 = 0;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null || !recyclerView$MediaBrowserCompat$SearchResultReceiver.write()) {
            i = 0;
        } else {
            RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
            i = MediaBrowserCompat$ItemReceiver((view.getLeft() - RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat(view)) - mediaDescriptionCompat.leftMargin, view.getRight() + RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem(view) + mediaDescriptionCompat.rightMargin, recyclerView$MediaBrowserCompat$SearchResultReceiver.getPaddingLeft(), recyclerView$MediaBrowserCompat$SearchResultReceiver.setBackgroundResource - recyclerView$MediaBrowserCompat$SearchResultReceiver.getPaddingRight(), MediaBrowserCompat$CustomActionResultReceiver2);
        }
        PointF pointF = this.MediaSessionCompat$ResultReceiverWrapper;
        int i3 = (pointF == null || pointF.y == BitmapDescriptorFactory.HUE_RED) ? 0 : this.MediaSessionCompat$ResultReceiverWrapper.y > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver2 = this.read;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver2 != null && recyclerView$MediaBrowserCompat$SearchResultReceiver2.read()) {
            RecyclerView.MediaDescriptionCompat mediaDescriptionCompat2 = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
            i2 = MediaBrowserCompat$ItemReceiver((view.getTop() - RecyclerView$MediaBrowserCompat$SearchResultReceiver.RatingCompat(view)) - mediaDescriptionCompat2.topMargin, view.getBottom() + RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(view) + mediaDescriptionCompat2.bottomMargin, recyclerView$MediaBrowserCompat$SearchResultReceiver2.getPaddingTop(), recyclerView$MediaBrowserCompat$SearchResultReceiver2.ParcelableVolumeInfo - recyclerView$MediaBrowserCompat$SearchResultReceiver2.getPaddingBottom(), i3);
        }
        int ceil = (int) Math.ceil(((double) MediaBrowserCompat$ItemReceiver((int) Math.sqrt((double) ((i * i) + (i2 * i2))))) / 0.3356d);
        if (ceil > 0) {
            int i4 = -i2;
            DecelerateInterpolator decelerateInterpolator = this.IconCompatParcelizer;
            write2.read = -i;
            write2.IconCompatParcelizer = i4;
            write2.MediaBrowserCompat$CustomActionResultReceiver = ceil;
            write2.MediaBrowserCompat$ItemReceiver = decelerateInterpolator;
            write2.write = true;
        }
    }

    public final void IconCompatParcelizer() {
        this.MediaSessionCompat$QueueItem = 0;
        this.MediaSessionCompat$Token = 0;
        this.MediaSessionCompat$ResultReceiverWrapper = null;
    }

    /* access modifiers changed from: protected */
    public float MediaBrowserCompat$CustomActionResultReceiver(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int MediaBrowserCompat$ItemReceiver(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * this.write));
    }

    /* access modifiers changed from: protected */
    public int MediaBrowserCompat$CustomActionResultReceiver() {
        PointF pointF = this.MediaSessionCompat$ResultReceiverWrapper;
        if (pointF == null || pointF.x == BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        return this.MediaSessionCompat$ResultReceiverWrapper.x > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
    }

    private static int MediaBrowserCompat$ItemReceiver(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public final void write(int i, int i2, RecyclerView.PlaybackStateCompat.write write2) {
        if (this.MediaMetadataCompat.AppCompatActivity.MediaSessionCompat$ResultReceiverWrapper() == 0) {
            MediaBrowserCompat$ItemReceiver();
            return;
        }
        int i3 = this.MediaSessionCompat$Token;
        int i4 = i3 - i;
        int i5 = 0;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.MediaSessionCompat$Token = i4;
        int i6 = this.MediaSessionCompat$QueueItem;
        int i7 = i6 - i2;
        if (i6 * i7 > 0) {
            i5 = i7;
        }
        this.MediaSessionCompat$QueueItem = i5;
        if (this.MediaSessionCompat$Token == 0 && i5 == 0) {
            PointF write3 = write(this.MediaBrowserCompat$MediaItem);
            if (write3 == null || (write3.x == BitmapDescriptorFactory.HUE_RED && write3.y == BitmapDescriptorFactory.HUE_RED)) {
                write2.RatingCompat = this.MediaBrowserCompat$MediaItem;
                MediaBrowserCompat$ItemReceiver();
                return;
            }
            float sqrt = (float) Math.sqrt((double) ((write3.x * write3.x) + (write3.y * write3.y)));
            write3.x /= sqrt;
            write3.y /= sqrt;
            this.MediaSessionCompat$ResultReceiverWrapper = write3;
            this.MediaSessionCompat$Token = (int) (write3.x * 10000.0f);
            this.MediaSessionCompat$QueueItem = (int) (write3.y * 10000.0f);
            int MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(10000);
            LinearInterpolator linearInterpolator = this.MediaBrowserCompat$CustomActionResultReceiver;
            write2.read = (int) (((float) this.MediaSessionCompat$Token) * 1.2f);
            write2.IconCompatParcelizer = (int) (((float) this.MediaSessionCompat$QueueItem) * 1.2f);
            write2.MediaBrowserCompat$CustomActionResultReceiver = (int) (((float) MediaBrowserCompat$ItemReceiver) * 1.2f);
            write2.MediaBrowserCompat$ItemReceiver = linearInterpolator;
            write2.write = true;
        }
    }
}

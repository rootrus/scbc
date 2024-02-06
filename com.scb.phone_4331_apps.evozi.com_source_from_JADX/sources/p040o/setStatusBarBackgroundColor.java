package p040o;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$Token;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.setStatusBarBackgroundColor */
public abstract class setStatusBarBackgroundColor extends RecyclerView$MediaSessionCompat$Token {
    private final RecyclerView.ParcelableVolumeInfo IconCompatParcelizer = new RecyclerView.ParcelableVolumeInfo() {
        private boolean MediaBrowserCompat$CustomActionResultReceiver = false;

        public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView, int i) {
            super.MediaBrowserCompat$ItemReceiver(recyclerView, i);
            if (i == 0 && this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.MediaBrowserCompat$CustomActionResultReceiver = false;
                setStatusBarBackgroundColor.this.read();
            }
        }

        public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
            }
        }
    };
    RecyclerView write;

    public abstract int[] MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver, View view);

    public abstract View read(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver);

    public abstract int write(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver, int i, int i2);

    public final boolean IconCompatParcelizer(int i, int i2) {
        boolean z;
        setGuidelineBegin write2;
        int write3;
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.write.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null || this.write.MediaDescriptionCompat == null) {
            return false;
        }
        int i3 = this.write.setChecked;
        if (Math.abs(i2) <= i3 && Math.abs(i) <= i3) {
            return false;
        }
        if (!(recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof RecyclerView.PlaybackStateCompat.read) || (write2 = write(recyclerView$MediaBrowserCompat$SearchResultReceiver)) == null || (write3 = write(recyclerView$MediaBrowserCompat$SearchResultReceiver, i, i2)) == -1) {
            z = false;
        } else {
            write2.MediaBrowserCompat$MediaItem = write3;
            recyclerView$MediaBrowserCompat$SearchResultReceiver.write((RecyclerView.PlaybackStateCompat) write2);
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.write;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.ParcelableVolumeInfo parcelableVolumeInfo = this.IconCompatParcelizer;
                List<RecyclerView.ParcelableVolumeInfo> list = recyclerView2.setGroupDividerEnabled;
                if (list != null) {
                    list.remove(parcelableVolumeInfo);
                }
                this.write.setOnFlingListener((RecyclerView$MediaSessionCompat$Token) null);
            }
            this.write = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.setExpandedFormat == null) {
                RecyclerView recyclerView3 = this.write;
                RecyclerView.ParcelableVolumeInfo parcelableVolumeInfo2 = this.IconCompatParcelizer;
                if (recyclerView3.setGroupDividerEnabled == null) {
                    recyclerView3.setGroupDividerEnabled = new ArrayList();
                }
                recyclerView3.setGroupDividerEnabled.add(parcelableVolumeInfo2);
                this.write.setOnFlingListener(this);
                new Scroller(this.write.getContext(), new DecelerateInterpolator());
                read();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver;
        View read;
        RecyclerView recyclerView = this.write;
        if (recyclerView != null && (recyclerView$MediaBrowserCompat$SearchResultReceiver = recyclerView.AppCompatActivity) != null && (read = read(recyclerView$MediaBrowserCompat$SearchResultReceiver)) != null) {
            int[] MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(recyclerView$MediaBrowserCompat$SearchResultReceiver, read);
            if (MediaBrowserCompat$CustomActionResultReceiver[0] != 0 || MediaBrowserCompat$CustomActionResultReceiver[1] != 0) {
                this.write.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver[0], MediaBrowserCompat$CustomActionResultReceiver[1]);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public setGuidelineBegin write(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver) {
        if (!(recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof RecyclerView.PlaybackStateCompat.read)) {
            return null;
        }
        return new setGuidelineBegin(this.write.getContext()) {
            public final void read(View view, RecyclerView.Keep keep, RecyclerView.PlaybackStateCompat.write write2) {
                if (setStatusBarBackgroundColor.this.write != null) {
                    setStatusBarBackgroundColor setstatusbarbackgroundcolor = setStatusBarBackgroundColor.this;
                    int[] MediaBrowserCompat$CustomActionResultReceiver = setstatusbarbackgroundcolor.MediaBrowserCompat$CustomActionResultReceiver(setstatusbarbackgroundcolor.write.AppCompatActivity, view);
                    int i = MediaBrowserCompat$CustomActionResultReceiver[0];
                    int i2 = MediaBrowserCompat$CustomActionResultReceiver[1];
                    int ceil = (int) Math.ceil(((double) MediaBrowserCompat$ItemReceiver(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
                    if (ceil > 0) {
                        DecelerateInterpolator decelerateInterpolator = this.IconCompatParcelizer;
                        write2.read = i;
                        write2.IconCompatParcelizer = i2;
                        write2.MediaBrowserCompat$CustomActionResultReceiver = ceil;
                        write2.MediaBrowserCompat$ItemReceiver = decelerateInterpolator;
                        write2.write = true;
                    }
                }
            }

            /* access modifiers changed from: protected */
            public final float MediaBrowserCompat$CustomActionResultReceiver(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }
        };
    }
}

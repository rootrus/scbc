package p040o;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.ScriptGroup;
import p040o.zzgk;

/* renamed from: o.validateGEMV */
final class validateGEMV extends ScriptGroup.Future {
    private static final setSwitchTypeface MediaMetadataCompat = new setSwitchTypeface() {
        public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        }

        public final void write(View view) {
        }

        public final void MediaBrowserCompat$ItemReceiver(View view) {
            SwitchCompat.write(view).read((setSwitchTypeface) null);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
    };
    int MediaBrowserCompat$MediaItem;
    Interpolator MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private zzgk.IconCompatParcelizer f2656x50fd9e4a;
    int MediaDescriptionCompat;
    private boolean MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper;
    private final Rect MediaSessionCompat$Token = new Rect();
    private final Rect ParcelableVolumeInfo = new Rect();
    private final Rect PlaybackStateCompat$CustomAction = new Rect();
    private float RatingCompat;
    RecyclerView.setContentView read;

    public validateGEMV(RecyclerView recyclerView, RecyclerView.setContentView setcontentview, zzgk.IconCompatParcelizer iconCompatParcelizer) {
        super(recyclerView, setcontentview);
        this.f2656x50fd9e4a = iconCompatParcelizer;
        FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write(this.write.write, this.ParcelableVolumeInfo);
    }

    public final void write(RecyclerView.setContentView setcontentview) {
        RecyclerView.setContentView setcontentview2 = this.read;
        if (setcontentview2 != setcontentview) {
            if (setcontentview2 != null) {
                setSwitchPadding write = SwitchCompat.write(setcontentview2.write);
                write.read();
                write.MediaBrowserCompat$ItemReceiver(10).read((float) BitmapDescriptorFactory.HUE_RED).MediaMetadataCompat(BitmapDescriptorFactory.HUE_RED).read(MediaMetadataCompat).write();
            }
            this.read = setcontentview;
            if (setcontentview != null) {
                SwitchCompat.write(setcontentview.write).read();
            }
            this.MediaSessionCompat$QueueItem = true;
        }
    }

    public final void read(Canvas canvas, RecyclerView recyclerView) {
        RecyclerView.setContentView setcontentview = this.write;
        RecyclerView.setContentView setcontentview2 = this.read;
        if (setcontentview != null && setcontentview2 != null && setcontentview.MediaBrowserCompat$ItemReceiver == this.f2656x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver) {
            View view = setcontentview2.write;
            int i = setcontentview.ParcelableVolumeInfo;
            if (i == -1) {
                i = setcontentview.MediaSessionCompat$QueueItem;
            }
            int i2 = setcontentview2.ParcelableVolumeInfo;
            if (i2 == -1) {
                i2 = setcontentview2.MediaSessionCompat$QueueItem;
            }
            FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write(view, this.MediaSessionCompat$Token);
            FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.MediaBrowserCompat$ItemReceiver(view, this.PlaybackStateCompat$CustomAction);
            Rect rect = this.PlaybackStateCompat$CustomAction;
            Rect rect2 = this.MediaSessionCompat$Token;
            int height = view.getHeight() + rect.top + rect.bottom + rect2.top + rect2.bottom;
            int width = view.getWidth() + rect.left + rect.right + rect2.left + rect2.right;
            float left = width != 0 ? ((float) (setcontentview.write.getLeft() - this.MediaDescriptionCompat)) / ((float) width) : 0.0f;
            float top = height != 0 ? ((float) (setcontentview.write.getTop() - this.MediaBrowserCompat$MediaItem)) / ((float) height) : 0.0f;
            int write = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write(this.MediaBrowserCompat$ItemReceiver.AppCompatActivity);
            if (write == 1) {
                left = i > i2 ? top : top + 1.0f;
            } else if (write != 0) {
                left = 0.0f;
            } else if (i <= i2) {
                left += 1.0f;
            }
            float min = Math.min(Math.max(left, BitmapDescriptorFactory.HUE_RED), 1.0f);
            if (this.MediaSessionCompat$QueueItem) {
                this.MediaSessionCompat$QueueItem = false;
                this.RatingCompat = min;
            } else {
                float f = (this.RatingCompat * 0.7f) + (0.3f * min);
                if (Math.abs(f - min) >= 0.01f) {
                    min = f;
                }
                this.RatingCompat = min;
            }
            write(setcontentview, setcontentview2, this.RatingCompat);
        }
    }

    private void write(RecyclerView.setContentView setcontentview, RecyclerView.setContentView setcontentview2, float f) {
        View view = setcontentview2.write;
        int i = setcontentview.ParcelableVolumeInfo;
        if (i == -1) {
            i = setcontentview.MediaSessionCompat$QueueItem;
        }
        int i2 = setcontentview2.ParcelableVolumeInfo;
        if (i2 == -1) {
            i2 = setcontentview2.MediaSessionCompat$QueueItem;
        }
        Rect rect = this.f2656x50fd9e4a.MediaBrowserCompat$SearchResultReceiver;
        Rect rect2 = this.ParcelableVolumeInfo;
        int i3 = this.f2656x50fd9e4a.MediaBrowserCompat$ItemReceiver + rect.top + rect.bottom + rect2.top + rect2.bottom;
        int i4 = this.f2656x50fd9e4a.MediaBrowserCompat$MediaItem + rect.left + rect.right + rect2.left + rect2.right;
        Interpolator interpolator = this.MediaBrowserCompat$SearchResultReceiver;
        if (interpolator != null) {
            f = interpolator.getInterpolation(f);
        }
        int write = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write(this.MediaBrowserCompat$ItemReceiver.AppCompatActivity);
        if (write != 0) {
            if (write != 1) {
                return;
            }
            if (i > i2) {
                view.setTranslationY(f * ((float) i3));
                return;
            }
            view.setTranslationY((f - 1.0f) * ((float) i3));
        } else if (i > i2) {
            view.setTranslationX(f * ((float) i4));
        } else {
            view.setTranslationX((f - 1.0f) * ((float) i4));
        }
    }

    public final void IconCompatParcelizer() {
        if (!this.MediaSessionCompat$ResultReceiverWrapper) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer((RecyclerView.RatingCompat) this, 0);
            this.MediaSessionCompat$ResultReceiverWrapper = true;
        }
    }

    public final void write() {
        if (this.MediaSessionCompat$ResultReceiverWrapper) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer((RecyclerView.RatingCompat) this);
        }
        RecyclerView.MediaMetadataCompat mediaMetadataCompat = this.MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.write();
        }
        RecyclerView recyclerView = this.MediaBrowserCompat$ItemReceiver;
        if (recyclerView.ListMenuItemView != 0) {
            recyclerView.ListMenuItemView = 0;
            recyclerView.IconCompatParcelizer();
            recyclerView.MediaBrowserCompat$ItemReceiver(0);
        }
        recyclerView.IconCompatParcelizer();
        if (this.read != null) {
            write(this.write, this.read, this.RatingCompat);
            read(this.read.write, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, true);
            this.read = null;
        }
        this.write = null;
        this.MediaDescriptionCompat = 0;
        this.MediaBrowserCompat$MediaItem = 0;
        this.RatingCompat = BitmapDescriptorFactory.HUE_RED;
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        this.f2656x50fd9e4a = null;
    }
}

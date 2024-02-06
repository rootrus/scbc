package p040o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: o.ZGERU */
public final class ZGERU<V extends View> extends ZHPR<V> {
    private static final Interpolator IconCompatParcelizer = new setPreventCornerOverlap();
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver = false;
    /* access modifiers changed from: private */
    public int MediaBrowserCompat$MediaItem = -1;
    private final ZGERU$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$SearchResultReceiver;
    private setSwitchPadding MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    public boolean read = false;
    public final int write;

    static /* synthetic */ int MediaBrowserCompat$ItemReceiver(ZGERU zgeru) {
        return 0;
    }

    static /* synthetic */ boolean read(ZGERU zgeru) {
        return false;
    }

    public ZGERU(int i) {
        this.MediaBrowserCompat$SearchResultReceiver = Build.VERSION.SDK_INT >= 21 ? new read(this, (byte) 0) : new ZGERU$MediaBrowserCompat$ItemReceiver(this, (byte) 0);
        this.MediaMetadataCompat = true;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.write = 0;
        this.MediaBrowserCompat$ItemReceiver = false;
    }

    public final boolean read(V v, View view) {
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(view, v);
        return view instanceof Snackbar.SnackbarLayout;
    }

    public final void MediaBrowserCompat$ItemReceiver(V v, int i) {
        MediaBrowserCompat$CustomActionResultReceiver(v, i);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(V v, int i) {
        if (this.MediaMetadataCompat) {
            if (i == -1 && this.read) {
                this.read = false;
                read(v, 0);
            } else if (i == 1 && !this.read) {
                this.read = true;
                read(v, this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean IconCompatParcelizer(V v, int i) {
        MediaBrowserCompat$CustomActionResultReceiver(v, i);
        return true;
    }

    public static <V extends View> ZGERU<V> IconCompatParcelizer(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.read) {
            CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = ((CoordinatorLayout.read) layoutParams).MediaDescriptionCompat;
            if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver instanceof ZGERU) {
                return (ZGERU) coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
            }
            throw new IllegalArgumentException("The view is not associated with BottomNavigationBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: o.ZGERU$read */
    class read implements ZGERU$MediaBrowserCompat$CustomActionResultReceiver {
        private read() {
        }

        /* synthetic */ read(ZGERU zgeru, byte b) {
            this();
        }

        public final void MediaBrowserCompat$ItemReceiver(View view, View view2) {
            if (!ZGERU.read(ZGERU.this) && (view instanceof Snackbar.SnackbarLayout)) {
                if (ZGERU.this.MediaBrowserCompat$MediaItem == -1) {
                    int unused = ZGERU.this.MediaBrowserCompat$MediaItem = view.getHeight();
                }
                if (SwitchCompat.PlaybackStateCompat$CustomAction(view2) == BitmapDescriptorFactory.HUE_RED) {
                    int IconCompatParcelizer = ZGERU.this.MediaBrowserCompat$MediaItem;
                    int MediaBrowserCompat$CustomActionResultReceiver2 = ZGERU.this.MediaBrowserCompat$CustomActionResultReceiver;
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (IconCompatParcelizer + MediaBrowserCompat$CustomActionResultReceiver2) - ZGERU.MediaBrowserCompat$ItemReceiver(ZGERU.this));
                }
            }
        }
    }

    public final void read(V v, int i) {
        setSwitchPadding setswitchpadding = this.MediaDescriptionCompat;
        if (setswitchpadding == null) {
            setSwitchPadding write2 = SwitchCompat.write(v);
            this.MediaDescriptionCompat = write2;
            write2.MediaBrowserCompat$ItemReceiver(300);
            this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer);
        } else {
            setswitchpadding.read();
        }
        this.MediaDescriptionCompat.MediaMetadataCompat((float) i).write();
    }

    public final boolean MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, V v, View view) {
        if (view instanceof Snackbar.SnackbarLayout) {
            this.MediaMetadataCompat = false;
        }
        return super.MediaBrowserCompat$ItemReceiver(coordinatorLayout, v, view);
    }

    public final void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, View view) {
        if (view instanceof Snackbar.SnackbarLayout) {
            this.MediaMetadataCompat = true;
        }
        super.IconCompatParcelizer(coordinatorLayout, v, view);
    }
}

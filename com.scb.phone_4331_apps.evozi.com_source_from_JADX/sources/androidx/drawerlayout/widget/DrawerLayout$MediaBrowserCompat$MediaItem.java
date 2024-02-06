package androidx.drawerlayout.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p040o.setTitleMargin;

class DrawerLayout$MediaBrowserCompat$MediaItem extends setTitleMargin.read implements Runnable {
    final /* synthetic */ DrawerLayout IconCompatParcelizer;
    final Runnable MediaBrowserCompat$ItemReceiver = this;
    setTitleMargin read;
    final int write;

    DrawerLayout$MediaBrowserCompat$MediaItem(DrawerLayout drawerLayout, int i) {
        this.IconCompatParcelizer = drawerLayout;
        this.write = i;
    }

    public final boolean IconCompatParcelizer(View view, int i) {
        return DrawerLayout.write(view) && this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(view, this.write) && this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(view) == 0;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        View rootView;
        DrawerLayout drawerLayout = this.IconCompatParcelizer;
        View view = this.read.write;
        int i2 = drawerLayout.MediaBrowserCompat$CustomActionResultReceiver.read;
        int i3 = drawerLayout.MediaDescriptionCompat.read;
        int i4 = 2;
        if (i2 == 1 || i3 == 1) {
            i4 = 1;
        } else if (!(i2 == 2 || i3 == 2)) {
            i4 = 0;
        }
        if (view != null && i == 0) {
            DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver = (DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams();
            if (drawerLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver == BitmapDescriptorFactory.HUE_RED) {
                DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver2 = (DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams();
                if ((drawerLayout$MediaBrowserCompat$ItemReceiver2.read & 1) == 1) {
                    drawerLayout$MediaBrowserCompat$ItemReceiver2.read = 0;
                    List<DrawerLayout.IconCompatParcelizer> list = drawerLayout.MediaBrowserCompat$SearchResultReceiver;
                    if (list != null) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            drawerLayout.MediaBrowserCompat$SearchResultReceiver.get(size);
                        }
                    }
                    drawerLayout.IconCompatParcelizer(view, false);
                    if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (drawerLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver == 1.0f) {
                DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver3 = (DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams();
                if ((drawerLayout$MediaBrowserCompat$ItemReceiver3.read & 1) == 0) {
                    drawerLayout$MediaBrowserCompat$ItemReceiver3.read = 1;
                    List<DrawerLayout.IconCompatParcelizer> list2 = drawerLayout.MediaBrowserCompat$SearchResultReceiver;
                    if (list2 != null) {
                        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                            drawerLayout.MediaBrowserCompat$SearchResultReceiver.get(size2);
                        }
                    }
                    drawerLayout.IconCompatParcelizer(view, true);
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i4 != drawerLayout.IconCompatParcelizer) {
            drawerLayout.IconCompatParcelizer = i4;
            List<DrawerLayout.IconCompatParcelizer> list3 = drawerLayout.MediaBrowserCompat$SearchResultReceiver;
            if (list3 != null) {
                for (int size3 = list3.size() - 1; size3 >= 0; size3--) {
                    drawerLayout.MediaBrowserCompat$SearchResultReceiver.get(size3);
                }
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(View view, int i, int i2) {
        float f;
        int width = view.getWidth();
        if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(view, 3)) {
            f = (float) (i + width);
        } else {
            f = (float) (this.IconCompatParcelizer.getWidth() - i);
        }
        float f2 = f / ((float) width);
        DrawerLayout drawerLayout = this.IconCompatParcelizer;
        DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver = (DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams();
        if (f2 != drawerLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver) {
            drawerLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = f2;
            drawerLayout.IconCompatParcelizer();
        }
        view.setVisibility(f2 == BitmapDescriptorFactory.HUE_RED ? 4 : 0);
        this.IconCompatParcelizer.invalidate();
    }

    public final void write(View view, int i) {
        ((DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams()).write = false;
        MediaBrowserCompat$ItemReceiver();
    }

    private void MediaBrowserCompat$ItemReceiver() {
        int i = 3;
        if (this.write == 3) {
            i = 5;
        }
        View write2 = this.IconCompatParcelizer.write(i);
        if (write2 != null) {
            this.IconCompatParcelizer.IconCompatParcelizer(write2);
        }
    }

    public final void write(View view, float f, float f2) {
        int i;
        float MediaBrowserCompat$CustomActionResultReceiver = DrawerLayout.MediaBrowserCompat$CustomActionResultReceiver(view);
        int width = view.getWidth();
        if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(view, 3)) {
            int i2 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            i = (i2 > 0 || (i2 == 0 && MediaBrowserCompat$CustomActionResultReceiver > 0.5f)) ? 0 : -width;
        } else {
            int width2 = this.IconCompatParcelizer.getWidth();
            i = (f < BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && MediaBrowserCompat$CustomActionResultReceiver > 0.5f)) ? width2 - width : width2;
        }
        this.read.IconCompatParcelizer(i, view.getTop());
        this.IconCompatParcelizer.invalidate();
    }

    public final void write() {
        this.IconCompatParcelizer.postDelayed(this.MediaBrowserCompat$ItemReceiver, 160);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        View view;
        if ((i & 1) == 1) {
            view = this.IconCompatParcelizer.write(3);
        } else {
            view = this.IconCompatParcelizer.write(5);
        }
        if (view != null && this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(view) == 0) {
            this.read.write(view, i2);
        }
    }

    public final int write(View view) {
        if (DrawerLayout.write(view)) {
            return view.getWidth();
        }
        return 0;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
        if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.IconCompatParcelizer.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    public final int read(View view, int i) {
        return view.getTop();
    }

    public final void run() {
        int i;
        View view;
        int i2 = this.read.MediaBrowserCompat$ItemReceiver;
        boolean z = this.write == 3;
        if (z) {
            view = this.IconCompatParcelizer.write(3);
            i = (view != null ? -view.getWidth() : 0) + i2;
        } else {
            view = this.IconCompatParcelizer.write(5);
            i = this.IconCompatParcelizer.getWidth() - i2;
        }
        if (view == null) {
            return;
        }
        if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(view) == 0) {
            this.read.IconCompatParcelizer(view, i, view.getTop());
            ((DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams()).write = true;
            this.IconCompatParcelizer.invalidate();
            MediaBrowserCompat$ItemReceiver();
            DrawerLayout drawerLayout = this.IconCompatParcelizer;
            if (!drawerLayout.MediaBrowserCompat$ItemReceiver) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                int childCount = drawerLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    drawerLayout.getChildAt(i3).dispatchTouchEvent(obtain);
                }
                obtain.recycle();
                drawerLayout.MediaBrowserCompat$ItemReceiver = true;
            }
        }
    }
}

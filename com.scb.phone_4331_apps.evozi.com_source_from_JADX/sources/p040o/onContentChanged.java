package p040o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p040o.KtaJsonCheck;

/* renamed from: o.onContentChanged */
public abstract class onContentChanged<T extends View, Z> implements onAbandon<Z> {
    private static final int IconCompatParcelizer = C1350xd1aa6b47.glide_custom_view_target_tag;
    private final IconCompatParcelizer read;
    private T write;

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final void read(Drawable drawable) {
    }

    public onContentChanged(T t) {
        if (t != null) {
            this.write = (View) t;
            this.read = new IconCompatParcelizer(t);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final void IconCompatParcelizer(KtaJsonCheck.C69271 r8) {
        IconCompatParcelizer iconCompatParcelizer = this.read;
        int MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        int MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        boolean z = false;
        if (MediaBrowserCompat$CustomActionResultReceiver > 0 || MediaBrowserCompat$CustomActionResultReceiver == Integer.MIN_VALUE) {
            if (MediaBrowserCompat$ItemReceiver > 0 || MediaBrowserCompat$ItemReceiver == Integer.MIN_VALUE) {
                z = true;
            }
        }
        if (z) {
            r8.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
            return;
        }
        if (!iconCompatParcelizer.IconCompatParcelizer.contains(r8)) {
            iconCompatParcelizer.IconCompatParcelizer.add(r8);
        }
        if (iconCompatParcelizer.write == null) {
            ViewTreeObserver viewTreeObserver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.getViewTreeObserver();
            IconCompatParcelizer.read read2 = new IconCompatParcelizer.read(iconCompatParcelizer);
            iconCompatParcelizer.write = read2;
            viewTreeObserver.addOnPreDrawListener(read2);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(KtaJsonCheck.C69271 r2) {
        this.read.IconCompatParcelizer.remove(r2);
    }

    public final void write(Drawable drawable) {
        this.read.write();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target for: ");
        sb.append(this.write);
        return sb.toString();
    }

    /* renamed from: o.onContentChanged$IconCompatParcelizer */
    static final class IconCompatParcelizer {
        private static Integer read;
        final List<KtaJsonCheck.C69271> IconCompatParcelizer = new ArrayList();
        final View MediaBrowserCompat$CustomActionResultReceiver;
        read write;

        IconCompatParcelizer(View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = view;
        }

        /* access modifiers changed from: package-private */
        public final void read() {
            if (!this.IconCompatParcelizer.isEmpty()) {
                int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
                int MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
                boolean z = false;
                if (MediaBrowserCompat$CustomActionResultReceiver2 > 0 || MediaBrowserCompat$CustomActionResultReceiver2 == Integer.MIN_VALUE) {
                    if (MediaBrowserCompat$ItemReceiver > 0 || MediaBrowserCompat$ItemReceiver == Integer.MIN_VALUE) {
                        z = true;
                    }
                }
                if (z) {
                    Iterator it = new ArrayList(this.IconCompatParcelizer).iterator();
                    while (it.hasNext()) {
                        ((KtaJsonCheck.C69271) it.next()).MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2, MediaBrowserCompat$ItemReceiver);
                    }
                    write();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void write() {
            ViewTreeObserver viewTreeObserver = this.MediaBrowserCompat$CustomActionResultReceiver.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.write);
            }
            this.write = null;
            this.IconCompatParcelizer.clear();
        }

        /* access modifiers changed from: package-private */
        public final int MediaBrowserCompat$ItemReceiver() {
            int paddingTop = this.MediaBrowserCompat$CustomActionResultReceiver.getPaddingTop();
            int paddingBottom = this.MediaBrowserCompat$CustomActionResultReceiver.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.MediaBrowserCompat$CustomActionResultReceiver.getLayoutParams();
            return MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop + paddingBottom);
        }

        /* access modifiers changed from: package-private */
        public final int MediaBrowserCompat$CustomActionResultReceiver() {
            int paddingLeft = this.MediaBrowserCompat$CustomActionResultReceiver.getPaddingLeft();
            int paddingRight = this.MediaBrowserCompat$CustomActionResultReceiver.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.MediaBrowserCompat$CustomActionResultReceiver.getLayoutParams();
            return MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft + paddingRight);
        }

        private int MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.MediaBrowserCompat$CustomActionResultReceiver.getContext();
            if (read == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    read = Integer.valueOf(Math.max(point.x, point.y));
                } else {
                    throw new NullPointerException("Argument must not be null");
                }
            }
            return read.intValue();
        }

        /* renamed from: o.onContentChanged$IconCompatParcelizer$read */
        static final class read implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<IconCompatParcelizer> IconCompatParcelizer;

            read(IconCompatParcelizer iconCompatParcelizer) {
                this.IconCompatParcelizer = new WeakReference<>(iconCompatParcelizer);
            }

            public final boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                    Log.v("CustomViewTarget", sb.toString());
                }
                IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer.get();
                if (iconCompatParcelizer == null) {
                    return true;
                }
                iconCompatParcelizer.read();
                return true;
            }
        }
    }

    public final commitContentChanged read() {
        Object tag = this.write.getTag(IconCompatParcelizer);
        if (tag == null) {
            return null;
        }
        if (tag instanceof commitContentChanged) {
            return (commitContentChanged) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public final void MediaBrowserCompat$ItemReceiver(commitContentChanged commitcontentchanged) {
        this.write.setTag(IconCompatParcelizer, commitcontentchanged);
    }
}

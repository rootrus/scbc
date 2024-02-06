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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p040o.KtaJsonCheck;

@Deprecated
/* renamed from: o.reset */
public abstract class C1430reset<T extends View, Z> extends forceLoad<Z> {
    private static int MediaBrowserCompat$CustomActionResultReceiver = C1350xd1aa6b47.glide_custom_view_target_tag;
    private final read MediaBrowserCompat$ItemReceiver;
    protected final T write;

    public C1430reset(T t) {
        if (t != null) {
            this.write = (View) t;
            this.MediaBrowserCompat$ItemReceiver = new read(t);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public void read(Drawable drawable) {
        super.read(drawable);
    }

    public final void IconCompatParcelizer(KtaJsonCheck.C69271 r8) {
        read read2 = this.MediaBrowserCompat$ItemReceiver;
        int write2 = read2.write();
        int IconCompatParcelizer = read2.IconCompatParcelizer();
        boolean z = false;
        if (write2 > 0 || write2 == Integer.MIN_VALUE) {
            if (IconCompatParcelizer > 0 || IconCompatParcelizer == Integer.MIN_VALUE) {
                z = true;
            }
        }
        if (z) {
            r8.MediaBrowserCompat$CustomActionResultReceiver(write2, IconCompatParcelizer);
            return;
        }
        if (!read2.MediaBrowserCompat$CustomActionResultReceiver.contains(r8)) {
            read2.MediaBrowserCompat$CustomActionResultReceiver.add(r8);
        }
        if (read2.read == null) {
            ViewTreeObserver viewTreeObserver = read2.MediaBrowserCompat$ItemReceiver.getViewTreeObserver();
            reset$read$MediaBrowserCompat$CustomActionResultReceiver reset_read_mediabrowsercompat_customactionresultreceiver = new reset$read$MediaBrowserCompat$CustomActionResultReceiver(read2);
            read2.read = reset_read_mediabrowsercompat_customactionresultreceiver;
            viewTreeObserver.addOnPreDrawListener(reset_read_mediabrowsercompat_customactionresultreceiver);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(KtaJsonCheck.C69271 r2) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.remove(r2);
    }

    public void write(Drawable drawable) {
        super.write(drawable);
        this.MediaBrowserCompat$ItemReceiver.read();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target for: ");
        sb.append(this.write);
        return sb.toString();
    }

    /* renamed from: o.reset$read */
    static final class read {
        private static Integer IconCompatParcelizer;
        final List<KtaJsonCheck.C69271> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
        final View MediaBrowserCompat$ItemReceiver;
        reset$read$MediaBrowserCompat$CustomActionResultReceiver read;

        read(View view) {
            this.MediaBrowserCompat$ItemReceiver = view;
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
                int write = write();
                int IconCompatParcelizer2 = IconCompatParcelizer();
                boolean z = false;
                if (write > 0 || write == Integer.MIN_VALUE) {
                    if (IconCompatParcelizer2 > 0 || IconCompatParcelizer2 == Integer.MIN_VALUE) {
                        z = true;
                    }
                }
                if (z) {
                    Iterator it = new ArrayList(this.MediaBrowserCompat$CustomActionResultReceiver).iterator();
                    while (it.hasNext()) {
                        ((KtaJsonCheck.C69271) it.next()).MediaBrowserCompat$CustomActionResultReceiver(write, IconCompatParcelizer2);
                    }
                    read();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void read() {
            ViewTreeObserver viewTreeObserver = this.MediaBrowserCompat$ItemReceiver.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.read);
            }
            this.read = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.clear();
        }

        /* access modifiers changed from: package-private */
        public final int IconCompatParcelizer() {
            int paddingTop = this.MediaBrowserCompat$ItemReceiver.getPaddingTop();
            int paddingBottom = this.MediaBrowserCompat$ItemReceiver.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.MediaBrowserCompat$ItemReceiver.getLayoutParams();
            return MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop + paddingBottom);
        }

        /* access modifiers changed from: package-private */
        public final int write() {
            int paddingLeft = this.MediaBrowserCompat$ItemReceiver.getPaddingLeft();
            int paddingRight = this.MediaBrowserCompat$ItemReceiver.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.MediaBrowserCompat$ItemReceiver.getLayoutParams();
            return MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft + paddingRight);
        }

        private int MediaBrowserCompat$ItemReceiver(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.MediaBrowserCompat$ItemReceiver.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.MediaBrowserCompat$ItemReceiver.getContext();
            if (IconCompatParcelizer == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    IconCompatParcelizer = Integer.valueOf(Math.max(point.x, point.y));
                } else {
                    throw new NullPointerException("Argument must not be null");
                }
            }
            return IconCompatParcelizer.intValue();
        }
    }

    public final commitContentChanged read() {
        Object tag = this.write.getTag(MediaBrowserCompat$CustomActionResultReceiver);
        if (tag == null) {
            return null;
        }
        if (tag instanceof commitContentChanged) {
            return (commitContentChanged) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final void MediaBrowserCompat$ItemReceiver(commitContentChanged commitcontentchanged) {
        this.write.setTag(MediaBrowserCompat$CustomActionResultReceiver, commitcontentchanged);
    }
}

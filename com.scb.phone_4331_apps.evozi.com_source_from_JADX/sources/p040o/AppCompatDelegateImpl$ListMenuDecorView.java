package p040o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: o.AppCompatDelegateImpl$ListMenuDecorView */
public final class AppCompatDelegateImpl$ListMenuDecorView {
    private static final Object IconCompatParcelizer = new Object();
    private static final ThreadLocal<TypedValue> MediaBrowserCompat$ItemReceiver = new ThreadLocal<>();
    private static final WeakHashMap<Context, SparseArray<read>> write = new WeakHashMap<>(0);

    public static ColorStateList MediaBrowserCompat$CustomActionResultReceiver(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList read2 = read(context, i);
        if (read2 != null) {
            return read2;
        }
        ColorStateList IconCompatParcelizer2 = IconCompatParcelizer(context, i);
        if (IconCompatParcelizer2 == null) {
            return setLastBaselineToBottomHeight.IconCompatParcelizer(context, i);
        }
        IconCompatParcelizer(context, i, IconCompatParcelizer2);
        return IconCompatParcelizer2;
    }

    public static Drawable MediaBrowserCompat$ItemReceiver(Context context, int i) {
        return ActionBarOverlayLayout.IconCompatParcelizer().MediaBrowserCompat$ItemReceiver(context, i);
    }

    private static ColorStateList IconCompatParcelizer(Context context, int i) {
        if (write(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return setPrecomputedText.MediaBrowserCompat$CustomActionResultReceiver(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList read(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = IconCompatParcelizer
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<o.AppCompatDelegateImpl$ListMenuDecorView$read>> r1 = write     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            o.AppCompatDelegateImpl$ListMenuDecorView$read r2 = (p040o.AppCompatDelegateImpl$ListMenuDecorView.read) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.write     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.IconCompatParcelizer     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AppCompatDelegateImpl$ListMenuDecorView.read(android.content.Context, int):android.content.res.ColorStateList");
    }

    private static void IconCompatParcelizer(Context context, int i, ColorStateList colorStateList) {
        synchronized (IconCompatParcelizer) {
            SparseArray sparseArray = write.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                write.put(context, sparseArray);
            }
            sparseArray.append(i, new read(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static boolean write(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
        resources.getValue(i, MediaBrowserCompat$ItemReceiver2, true);
        if (MediaBrowserCompat$ItemReceiver2.type < 28 || MediaBrowserCompat$ItemReceiver2.type > 31) {
            return false;
        }
        return true;
    }

    private static TypedValue MediaBrowserCompat$ItemReceiver() {
        TypedValue typedValue = MediaBrowserCompat$ItemReceiver.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        MediaBrowserCompat$ItemReceiver.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: o.AppCompatDelegateImpl$ListMenuDecorView$read */
    static class read {
        final ColorStateList IconCompatParcelizer;
        final Configuration write;

        read(ColorStateList colorStateList, Configuration configuration) {
            this.IconCompatParcelizer = colorStateList;
            this.write = configuration;
        }
    }
}

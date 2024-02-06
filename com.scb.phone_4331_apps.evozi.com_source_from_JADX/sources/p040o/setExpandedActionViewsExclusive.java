package p040o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setExpandedActionViewsExclusive */
final class setExpandedActionViewsExclusive {
    static final int[] IconCompatParcelizer = {16842919};
    static final int[] MediaBrowserCompat$CustomActionResultReceiver = {16842908};
    static final int[] MediaBrowserCompat$ItemReceiver = {-16842910};
    private static final ThreadLocal<TypedValue> MediaBrowserCompat$MediaItem = new ThreadLocal<>();
    private static final int[] RatingCompat = new int[1];
    static final int[] read = new int[0];
    static final int[] write = {16842912};

    public static int read(Context context, int i) {
        int[] iArr = RatingCompat;
        iArr[0] = i;
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getColor(0, 0);
        } finally {
            mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
        }
    }

    public static ColorStateList MediaBrowserCompat$CustomActionResultReceiver(Context context, int i) {
        int[] iArr = RatingCompat;
        iArr[0] = i;
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(0);
        } finally {
            mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
        }
    }

    public static int IconCompatParcelizer(Context context, int i) {
        ColorStateList MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(context, i);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null && MediaBrowserCompat$CustomActionResultReceiver2.isStateful()) {
            return MediaBrowserCompat$CustomActionResultReceiver2.getColorForState(MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$CustomActionResultReceiver2.getDefaultColor());
        }
        TypedValue typedValue = MediaBrowserCompat$MediaItem.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            MediaBrowserCompat$MediaItem.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int read2 = read(context, i);
        return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(read2, Math.round(((float) Color.alpha(read2)) * f));
    }
}

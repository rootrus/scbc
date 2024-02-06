package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class DrawerLayout$MediaBrowserCompat$ItemReceiver extends ViewGroup.MarginLayoutParams {
    public int IconCompatParcelizer = 0;
    float MediaBrowserCompat$ItemReceiver;
    public int read;
    boolean write;

    public DrawerLayout$MediaBrowserCompat$ItemReceiver(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.read);
        this.IconCompatParcelizer = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public DrawerLayout$MediaBrowserCompat$ItemReceiver() {
        super(-1, -1);
    }

    public DrawerLayout$MediaBrowserCompat$ItemReceiver(DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver) {
        super(drawerLayout$MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer = drawerLayout$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
    }

    public DrawerLayout$MediaBrowserCompat$ItemReceiver(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public DrawerLayout$MediaBrowserCompat$ItemReceiver(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}

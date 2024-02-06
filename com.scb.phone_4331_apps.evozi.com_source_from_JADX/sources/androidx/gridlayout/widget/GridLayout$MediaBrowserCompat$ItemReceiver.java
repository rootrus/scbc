package androidx.gridlayout.widget;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;

public abstract class GridLayout$MediaBrowserCompat$ItemReceiver {
    /* access modifiers changed from: package-private */
    public abstract int MediaBrowserCompat$CustomActionResultReceiver(View view, int i);

    /* access modifiers changed from: package-private */
    public abstract String MediaBrowserCompat$ItemReceiver();

    /* access modifiers changed from: package-private */
    public abstract int read(View view, int i, int i2);

    /* access modifiers changed from: package-private */
    public int write(int i, int i2) {
        return i;
    }

    GridLayout$MediaBrowserCompat$ItemReceiver() {
    }

    /* access modifiers changed from: package-private */
    public GridLayout.read IconCompatParcelizer() {
        return new GridLayout.read();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alignment:");
        sb.append(MediaBrowserCompat$ItemReceiver());
        return sb.toString();
    }
}

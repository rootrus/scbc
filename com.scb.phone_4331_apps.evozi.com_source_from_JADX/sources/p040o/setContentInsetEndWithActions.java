package p040o;

import android.widget.ListView;

/* renamed from: o.setContentInsetEndWithActions */
public final class setContentInsetEndWithActions extends setTrackTintMode {
    private final ListView MediaBrowserCompat$SearchResultReceiver;

    public setContentInsetEndWithActions(ListView listView) {
        super(listView);
        this.MediaBrowserCompat$SearchResultReceiver = listView;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        setContentInsetsAbsolute.write(this.MediaBrowserCompat$SearchResultReceiver, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean read(int r7) {
        /*
            r6 = this;
            android.widget.ListView r0 = r6.MediaBrowserCompat$SearchResultReceiver
            int r1 = r0.getCount()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r3 = r0.getChildCount()
            int r4 = r0.getFirstVisiblePosition()
            r5 = 1
            if (r7 <= 0) goto L_0x0028
            int r4 = r4 + r3
            if (r4 < r1) goto L_0x0037
            int r3 = r3 - r5
            android.view.View r7 = r0.getChildAt(r3)
            int r7 = r7.getBottom()
            int r0 = r0.getHeight()
            if (r7 > r0) goto L_0x0037
            return r2
        L_0x0028:
            if (r7 >= 0) goto L_0x0038
            if (r4 > 0) goto L_0x0037
            android.view.View r7 = r0.getChildAt(r2)
            int r7 = r7.getTop()
            if (r7 < 0) goto L_0x0037
            return r2
        L_0x0037:
            return r5
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setContentInsetEndWithActions.read(int):boolean");
    }
}

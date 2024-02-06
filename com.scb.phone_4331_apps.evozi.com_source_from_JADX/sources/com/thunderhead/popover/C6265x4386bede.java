package com.thunderhead.popover;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.thunderhead.popover.EditRegionNameDialog$MediaBrowserCompat$CustomActionResultReceiver */
final class C6265x4386bede implements View.OnClickListener {
    private final WeakReference<View.OnClickListener> write;

    C6265x4386bede(View.OnClickListener onClickListener) {
        this.write = new WeakReference<>(onClickListener);
    }

    public final void onClick(View view) {
        WeakReference<View.OnClickListener> weakReference = this.write;
        if (!(weakReference == null || weakReference.get() == null)) {
            this.write.get().onClick(view);
        }
        this.write.clear();
    }
}

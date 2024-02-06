package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
import androidx.lifecycle.ReportFragment;
import java.util.List;
import p040o.SwitchCompat;

public abstract class ExpandableBehavior extends CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver<View> {
    int IconCompatParcelizer = 0;

    /* access modifiers changed from: protected */
    public abstract boolean MediaBrowserCompat$CustomActionResultReceiver(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final ReportFragment.write write;
        if (!SwitchCompat.setCheckable(view)) {
            List<View> write2 = coordinatorLayout.write(view);
            int size = write2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    write = null;
                    break;
                }
                View view2 = write2.get(i2);
                if (read(view, view2)) {
                    write = (ReportFragment.write) view2;
                    break;
                }
                i2++;
            }
            if (write != null && write(write.MediaBrowserCompat$CustomActionResultReceiver())) {
                final int i3 = write.MediaBrowserCompat$CustomActionResultReceiver() ? 1 : 2;
                this.IconCompatParcelizer = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (ExpandableBehavior.this.IconCompatParcelizer == i3) {
                            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                            ReportFragment.write write2 = write;
                            expandableBehavior.MediaBrowserCompat$CustomActionResultReceiver((View) write2, view, write2.MediaBrowserCompat$CustomActionResultReceiver(), false);
                        }
                        return false;
                    }
                });
            }
        }
        return false;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ReportFragment.write write = (ReportFragment.write) view2;
        if (!write(write.MediaBrowserCompat$CustomActionResultReceiver())) {
            return false;
        }
        this.IconCompatParcelizer = write.MediaBrowserCompat$CustomActionResultReceiver() ? 1 : 2;
        return MediaBrowserCompat$CustomActionResultReceiver((View) write, view, write.MediaBrowserCompat$CustomActionResultReceiver(), true);
    }

    private boolean write(boolean z) {
        if (z) {
            int i = this.IconCompatParcelizer;
            return i == 0 || i == 2;
        } else if (this.IconCompatParcelizer == 1) {
            return true;
        } else {
            return false;
        }
    }
}

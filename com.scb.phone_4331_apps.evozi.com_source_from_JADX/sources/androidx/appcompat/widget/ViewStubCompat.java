package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;

public final class ViewStubCompat extends View {
    private int IconCompatParcelizer;
    private ViewStubCompat$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private WeakReference<View> MediaBrowserCompat$ItemReceiver;
    private int read;
    private LayoutInflater write;

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.read = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ViewStubCompat, i, 0);
        this.IconCompatParcelizer = obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ViewStubCompat_android_inflatedId, -1);
        this.read = obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final void setInflatedId(int i) {
        this.IconCompatParcelizer = i;
    }

    public final void setLayoutResource(int i) {
        this.read = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.write = layoutInflater;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void setVisibility(int i) {
        WeakReference<View> weakReference = this.MediaBrowserCompat$ItemReceiver;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            read();
        }
    }

    public final View read() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.read != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.write;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.read, viewGroup, false);
            int i = this.IconCompatParcelizer;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(inflate);
            ViewStubCompat$MediaBrowserCompat$ItemReceiver viewStubCompat$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (viewStubCompat$MediaBrowserCompat$ItemReceiver != null) {
                viewStubCompat$MediaBrowserCompat$ItemReceiver.read(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void setOnInflateListener(ViewStubCompat$MediaBrowserCompat$ItemReceiver viewStubCompat$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = viewStubCompat$MediaBrowserCompat$ItemReceiver;
    }
}

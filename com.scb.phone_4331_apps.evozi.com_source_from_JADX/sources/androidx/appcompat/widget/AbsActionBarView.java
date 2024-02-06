package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.SwitchCompat;
import p040o.setSwitchPadding;
import p040o.setSwitchTypeface;

abstract class AbsActionBarView extends ViewGroup {
    protected ActionMenuPresenter IconCompatParcelizer;
    protected final AbsActionBarView$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = new AbsActionBarView$MediaBrowserCompat$CustomActionResultReceiver(this);
    protected final Context MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat;
    protected setSwitchPadding RatingCompat;
    protected ActionMenuView read;
    protected int write;

    AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AlertController$RecycleListView.read.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.MediaBrowserCompat$ItemReceiver = context;
        } else {
            this.MediaBrowserCompat$ItemReceiver = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar, AlertController$RecycleListView.read.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.IconCompatParcelizer;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.MediaBrowserCompat$ItemReceiver();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.MediaBrowserCompat$SearchResultReceiver = false;
        }
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.MediaBrowserCompat$SearchResultReceiver = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.MediaBrowserCompat$SearchResultReceiver = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.MediaDescriptionCompat = false;
        }
        if (!this.MediaDescriptionCompat) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.MediaDescriptionCompat = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.MediaDescriptionCompat = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.write = i;
        requestLayout();
    }

    public setSwitchPadding IconCompatParcelizer(int i, long j) {
        setSwitchPadding setswitchpadding = this.RatingCompat;
        if (setswitchpadding != null) {
            setswitchpadding.read();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            setSwitchPadding IconCompatParcelizer2 = SwitchCompat.write(this).IconCompatParcelizer(1.0f);
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(j);
            IconCompatParcelizer2.read((setSwitchTypeface) this.MediaBrowserCompat$CustomActionResultReceiver.read(IconCompatParcelizer2, i));
            return IconCompatParcelizer2;
        }
        setSwitchPadding IconCompatParcelizer3 = SwitchCompat.write(this).IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(j);
        IconCompatParcelizer3.read((setSwitchTypeface) this.MediaBrowserCompat$CustomActionResultReceiver.read(IconCompatParcelizer3, i));
        return IconCompatParcelizer3;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            setSwitchPadding setswitchpadding = this.RatingCompat;
            if (setswitchpadding != null) {
                setswitchpadding.read();
            }
            super.setVisibility(i);
        }
    }

    public boolean write() {
        ActionMenuPresenter actionMenuPresenter = this.IconCompatParcelizer;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.MediaBrowserCompat$MediaItem();
        }
        return false;
    }

    protected static int MediaBrowserCompat$ItemReceiver(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}

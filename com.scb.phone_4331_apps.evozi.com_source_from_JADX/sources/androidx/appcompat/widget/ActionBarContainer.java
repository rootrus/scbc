package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p040o.ActionBarContextView;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.SwitchCompat;

public class ActionBarContainer extends FrameLayout {
    public boolean IconCompatParcelizer;
    public Drawable MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;
    private View MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    View RatingCompat;
    public Drawable read;
    public Drawable write;

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SwitchCompat.IconCompatParcelizer((View) this, (Drawable) new ActionBarContextView(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar);
        this.write = obtainStyledAttributes.getDrawable(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_background);
        this.read = obtainStyledAttributes.getDrawable(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_backgroundStacked);
        this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_height, -1);
        boolean z = true;
        if (getId() == AlertController$RecycleListView.MediaDescriptionCompat.split_action_bar) {
            this.IconCompatParcelizer = true;
            this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getDrawable(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.IconCompatParcelizer ? !(this.write == null && this.read == null) : this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.MediaDescriptionCompat = findViewById(AlertController$RecycleListView.MediaDescriptionCompat.action_bar);
        this.MediaBrowserCompat$MediaItem = findViewById(AlertController$RecycleListView.MediaDescriptionCompat.action_context_bar);
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.write;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.write);
        }
        this.write = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.MediaDescriptionCompat;
            if (view != null) {
                this.write.setBounds(view.getLeft(), this.MediaDescriptionCompat.getTop(), this.MediaDescriptionCompat.getRight(), this.MediaDescriptionCompat.getBottom());
            }
        }
        boolean z = true;
        if (!this.IconCompatParcelizer ? !(this.write == null && this.read == null) : this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.read;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.read);
        }
        this.read = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.MediaBrowserCompat$ItemReceiver && (drawable2 = this.read) != null) {
                drawable2.setBounds(this.RatingCompat.getLeft(), this.RatingCompat.getTop(), this.RatingCompat.getRight(), this.RatingCompat.getBottom());
            }
        }
        boolean z = true;
        if (!this.IconCompatParcelizer ? !(this.write == null && this.read == null) : this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.IconCompatParcelizer && (drawable2 = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.IconCompatParcelizer ? this.write == null && this.read == null : this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.write;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.read;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.write && !this.IconCompatParcelizer) || (drawable == this.read && this.MediaBrowserCompat$ItemReceiver) || ((drawable == this.MediaBrowserCompat$CustomActionResultReceiver && this.IconCompatParcelizer) || super.verifyDrawable(drawable));
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.write;
        if (drawable != null && drawable.isStateful()) {
            this.write.setState(getDrawableState());
        }
        Drawable drawable2 = this.read;
        if (drawable2 != null && drawable2.isStateful()) {
            this.read.setState(getDrawableState());
        }
        Drawable drawable3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (drawable3 != null && drawable3.isStateful()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.write;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.read;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.MediaMetadataCompat = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.MediaMetadataCompat || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.RatingCompat;
        if (view != null) {
            removeView(view);
        }
        this.RatingCompat = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.MediaDescriptionCompat
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r1) goto L_0x001c
            int r0 = r6.MediaBrowserCompat$SearchResultReceiver
            if (r0 < 0) goto L_0x001c
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L_0x001c:
            super.onMeasure(r7, r8)
            android.view.View r7 = r6.MediaDescriptionCompat
            if (r7 != 0) goto L_0x0024
            return
        L_0x0024:
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            android.view.View r0 = r6.RatingCompat
            if (r0 == 0) goto L_0x00b0
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x00b0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L_0x00b0
            android.view.View r0 = r6.MediaDescriptionCompat
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x004c
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L_0x004c
            int r0 = r0.getMeasuredHeight()
            if (r0 == 0) goto L_0x004c
            r0 = r4
            goto L_0x004d
        L_0x004c:
            r0 = r3
        L_0x004d:
            if (r0 != 0) goto L_0x0063
            android.view.View r0 = r6.MediaDescriptionCompat
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getMeasuredHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
        L_0x0060:
            int r4 = r0 + r2
            goto L_0x0088
        L_0x0063:
            android.view.View r0 = r6.MediaBrowserCompat$MediaItem
            if (r0 == 0) goto L_0x0074
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L_0x0074
            int r0 = r0.getMeasuredHeight()
            if (r0 == 0) goto L_0x0074
            r3 = r4
        L_0x0074:
            if (r3 != 0) goto L_0x0088
            android.view.View r0 = r6.MediaBrowserCompat$MediaItem
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getMeasuredHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            goto L_0x0060
        L_0x0088:
            if (r7 != r1) goto L_0x008f
            int r7 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x0092
        L_0x008f:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x0092:
            int r8 = r6.getMeasuredWidth()
            android.view.View r0 = r6.RatingCompat
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getMeasuredHeight()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r4 = r4 + r0
            int r7 = java.lang.Math.min(r4, r7)
            r6.setMeasuredDimension(r8, r7)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            android.view.View r6 = r5.RatingCompat
            r8 = 8
            r10 = 1
            r0 = 0
            if (r6 == 0) goto L_0x0013
            int r1 = r6.getVisibility()
            if (r1 == r8) goto L_0x0013
            r1 = r10
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r6 == 0) goto L_0x0035
            int r2 = r6.getVisibility()
            if (r2 == r8) goto L_0x0035
            int r8 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r6.getMeasuredHeight()
            int r3 = r8 - r3
            int r4 = r2.bottomMargin
            int r3 = r3 - r4
            int r2 = r2.bottomMargin
            int r8 = r8 - r2
            r6.layout(r7, r3, r9, r8)
        L_0x0035:
            boolean r7 = r5.IconCompatParcelizer
            if (r7 == 0) goto L_0x004d
            android.graphics.drawable.Drawable r6 = r5.MediaBrowserCompat$CustomActionResultReceiver
            if (r6 == 0) goto L_0x004a
            int r7 = r5.getMeasuredWidth()
            int r8 = r5.getMeasuredHeight()
            r6.setBounds(r0, r0, r7, r8)
            goto L_0x00c0
        L_0x004a:
            r10 = r0
            goto L_0x00c0
        L_0x004d:
            android.graphics.drawable.Drawable r7 = r5.write
            if (r7 == 0) goto L_0x00a5
            android.view.View r7 = r5.MediaDescriptionCompat
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x0077
            android.graphics.drawable.Drawable r7 = r5.write
            android.view.View r8 = r5.MediaDescriptionCompat
            int r8 = r8.getLeft()
            android.view.View r9 = r5.MediaDescriptionCompat
            int r9 = r9.getTop()
            android.view.View r0 = r5.MediaDescriptionCompat
            int r0 = r0.getRight()
            android.view.View r2 = r5.MediaDescriptionCompat
            int r2 = r2.getBottom()
            r7.setBounds(r8, r9, r0, r2)
            goto L_0x00a4
        L_0x0077:
            android.view.View r7 = r5.MediaBrowserCompat$MediaItem
            if (r7 == 0) goto L_0x009f
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x009f
            android.graphics.drawable.Drawable r7 = r5.write
            android.view.View r8 = r5.MediaBrowserCompat$MediaItem
            int r8 = r8.getLeft()
            android.view.View r9 = r5.MediaBrowserCompat$MediaItem
            int r9 = r9.getTop()
            android.view.View r0 = r5.MediaBrowserCompat$MediaItem
            int r0 = r0.getRight()
            android.view.View r2 = r5.MediaBrowserCompat$MediaItem
            int r2 = r2.getBottom()
            r7.setBounds(r8, r9, r0, r2)
            goto L_0x00a4
        L_0x009f:
            android.graphics.drawable.Drawable r7 = r5.write
            r7.setBounds(r0, r0, r0, r0)
        L_0x00a4:
            r0 = r10
        L_0x00a5:
            r5.MediaBrowserCompat$ItemReceiver = r1
            if (r1 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r7 = r5.read
            if (r7 == 0) goto L_0x004a
            int r8 = r6.getLeft()
            int r9 = r6.getTop()
            int r0 = r6.getRight()
            int r6 = r6.getBottom()
            r7.setBounds(r8, r9, r0, r6)
        L_0x00c0:
            if (r10 == 0) goto L_0x00c5
            r5.invalidate()
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }
}

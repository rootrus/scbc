package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jmrtd.cbeff.ISO781611;
import p040o.SwitchCompat;
import p040o.Toolbar;
import p040o.setBackgroundDrawable;
import p040o.setIconifiedByDefault;
import p040o.setQueryHint;
import p040o.setQueryRefinementEnabled;
import p040o.setTextOn;
import p040o.setThumbResource;

public class NestedScrollView extends FrameLayout implements setQueryHint, setQueryRefinementEnabled {
    private static final int[] IconCompatParcelizer = {16843130};
    private static final write MediaBrowserCompat$ItemReceiver = new write();
    private VelocityTracker ActionMenuItemView;
    private final setBackgroundDrawable.read AlertController$RecycleListView;
    private OverScroller AppCompatActivity;
    private final int[] AppCompatDelegateImpl$ListMenuDecorView;
    private final Rect AppCompatDialogFragment;
    private int AppCompatViewInflater;
    private NestedScrollView$MediaBrowserCompat$ItemReceiver Keep;
    private final setBackgroundDrawable.write MediaBrowserCompat$CustomActionResultReceiver;
    private EdgeEffect MediaBrowserCompat$MediaItem;
    private EdgeEffect MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private long f16x50fd9e4a;
    private boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    private int ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private int PlaybackStateCompat$CustomAction;
    private boolean RatingCompat;
    private View read;
    private final int[] setBackgroundResource;
    private float setChecked;
    private boolean setContentView;
    private IconCompatParcelizer setHasDecor;
    private int write;

    public interface IconCompatParcelizer {
        void write(NestedScrollView nestedScrollView, int i, int i2);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean write(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AppCompatDialogFragment = new Rect();
        this.MediaSessionCompat$ResultReceiverWrapper = true;
        this.MediaMetadataCompat = false;
        this.read = null;
        this.MediaDescriptionCompat = false;
        this.setContentView = true;
        this.write = -1;
        this.setBackgroundResource = new int[2];
        this.AppCompatDelegateImpl$ListMenuDecorView = new int[2];
        this.AppCompatActivity = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.AppCompatViewInflater = viewConfiguration.getScaledTouchSlop();
        this.PlaybackStateCompat = viewConfiguration.getScaledMinimumFlingVelocity();
        this.MediaSessionCompat$QueueItem = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IconCompatParcelizer, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.AlertController$RecycleListView = new setBackgroundDrawable.read(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = new setBackgroundDrawable.write(this);
        setNestedScrollingEnabled(true);
        SwitchCompat.read((View) this, (setIconifiedByDefault) MediaBrowserCompat$ItemReceiver);
    }

    public final void IconCompatParcelizer(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.write(i);
    }

    public void setNestedScrollingEnabled(boolean z) {
        setBackgroundDrawable.write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2.write) {
            SwitchCompat.setIcon(write2.MediaBrowserCompat$ItemReceiver);
        }
        write2.write = z;
    }

    public boolean isNestedScrollingEnabled() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.write;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(f, f2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(View view, int i, int i2) {
        this.AlertController$RecycleListView.write = i;
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(2, i2);
    }

    public final void IconCompatParcelizer(View view, int i) {
        this.AlertController$RecycleListView.write = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver.write(i);
    }

    public final void read(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        read(view, i, i2, i3, i4, 0);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        write((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public int getNestedScrollAxes() {
        return this.AlertController$RecycleListView.write;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(IconCompatParcelizer iconCompatParcelizer) {
        this.setHasDecor = iconCompatParcelizer;
    }

    private boolean MediaBrowserCompat$ItemReceiver() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    public void setFillViewport(boolean z) {
        if (z != this.RatingCompat) {
            this.RatingCompat = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.setContentView = z;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        IconCompatParcelizer iconCompatParcelizer = this.setHasDecor;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.write(this, i2, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.RatingCompat && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i3 = layoutParams.leftMargin;
                childAt.measure(getChildMeasureSpec(i, paddingLeft + paddingRight + i3 + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || write(keyEvent);
    }

    public final boolean write(KeyEvent keyEvent) {
        this.AppCompatDialogFragment.setEmpty();
        boolean MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
        int i = ISO781611.BIOMETRIC_SUBTYPE_TAG;
        if (!MediaBrowserCompat$ItemReceiver2) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, ISO781611.BIOMETRIC_SUBTYPE_TAG);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(ISO781611.BIOMETRIC_SUBTYPE_TAG)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    MediaBrowserCompat$MediaItem(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return MediaBrowserCompat$ItemReceiver(ISO781611.BIOMETRIC_SUBTYPE_TAG);
                } else {
                    return MediaBrowserCompat$CustomActionResultReceiver((int) ISO781611.BIOMETRIC_SUBTYPE_TAG);
                }
            } else if (!keyEvent.isAltPressed()) {
                return MediaBrowserCompat$ItemReceiver(33);
            } else {
                return MediaBrowserCompat$CustomActionResultReceiver(33);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r12.MediaDescriptionCompat
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x00b0
            r5 = -1
            if (r0 == r2) goto L_0x0082
            if (r0 == r1) goto L_0x0023
            r1 = 3
            if (r0 == r1) goto L_0x0082
            r1 = 6
            if (r0 != r1) goto L_0x0121
            r12.MediaBrowserCompat$CustomActionResultReceiver((android.view.MotionEvent) r13)
            goto L_0x0121
        L_0x0023:
            int r0 = r12.write
            if (r0 == r5) goto L_0x0121
            int r3 = r13.findPointerIndex(r0)
            if (r3 != r5) goto L_0x004a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r13.append(r1)
            r13.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L_0x0121
        L_0x004a:
            float r0 = r13.getY(r3)
            int r0 = (int) r0
            int r3 = r12.ParcelableVolumeInfo
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.AppCompatViewInflater
            if (r3 <= r5) goto L_0x0121
            int r3 = r12.getNestedScrollAxes()
            r1 = r1 & r3
            if (r1 != 0) goto L_0x0121
            r12.MediaDescriptionCompat = r2
            r12.ParcelableVolumeInfo = r0
            android.view.VelocityTracker r0 = r12.ActionMenuItemView
            if (r0 != 0) goto L_0x0070
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.ActionMenuItemView = r0
        L_0x0070:
            android.view.VelocityTracker r0 = r12.ActionMenuItemView
            r0.addMovement(r13)
            r12.PlaybackStateCompat$CustomAction = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x0121
            r13.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0121
        L_0x0082:
            r12.MediaDescriptionCompat = r4
            r12.write = r5
            android.view.VelocityTracker r13 = r12.ActionMenuItemView
            if (r13 == 0) goto L_0x008f
            r13.recycle()
            r12.ActionMenuItemView = r3
        L_0x008f:
            android.widget.OverScroller r5 = r12.AppCompatActivity
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.IconCompatParcelizer()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x00a9
            p040o.SwitchCompat.setItemInvoker(r12)
        L_0x00a9:
            o.setBackgroundDrawable$write r13 = r12.MediaBrowserCompat$CustomActionResultReceiver
            r13.write(r4)
            goto L_0x0121
        L_0x00b0:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L_0x00e4
            int r6 = r12.getScrollY()
            android.view.View r7 = r12.getChildAt(r4)
            int r8 = r7.getTop()
            int r8 = r8 - r6
            if (r0 < r8) goto L_0x00e4
            int r8 = r7.getBottom()
            int r8 = r8 - r6
            if (r0 >= r8) goto L_0x00e4
            int r6 = r7.getLeft()
            if (r5 < r6) goto L_0x00e4
            int r6 = r7.getRight()
            if (r5 >= r6) goto L_0x00e4
            r5 = r2
            goto L_0x00e5
        L_0x00e4:
            r5 = r4
        L_0x00e5:
            if (r5 != 0) goto L_0x00f3
            r12.MediaDescriptionCompat = r4
            android.view.VelocityTracker r13 = r12.ActionMenuItemView
            if (r13 == 0) goto L_0x0121
            r13.recycle()
            r12.ActionMenuItemView = r3
            goto L_0x0121
        L_0x00f3:
            r12.ParcelableVolumeInfo = r0
            int r0 = r13.getPointerId(r4)
            r12.write = r0
            android.view.VelocityTracker r0 = r12.ActionMenuItemView
            if (r0 != 0) goto L_0x0106
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.ActionMenuItemView = r0
            goto L_0x0109
        L_0x0106:
            r0.clear()
        L_0x0109:
            android.view.VelocityTracker r0 = r12.ActionMenuItemView
            r0.addMovement(r13)
            android.widget.OverScroller r13 = r12.AppCompatActivity
            r13.computeScrollOffset()
            android.widget.OverScroller r13 = r12.AppCompatActivity
            boolean r13 = r13.isFinished()
            r13 = r13 ^ r2
            r12.MediaDescriptionCompat = r13
            o.setBackgroundDrawable$write r13 = r12.MediaBrowserCompat$CustomActionResultReceiver
            r13.MediaBrowserCompat$CustomActionResultReceiver(r1, r4)
        L_0x0121:
            boolean r13 = r12.MediaDescriptionCompat
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.write) {
            int i = actionIndex == 0 ? 1 : 0;
            this.ParcelableVolumeInfo = (int) motionEvent.getY(i);
            this.write = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.ActionMenuItemView;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.MediaDescriptionCompat) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != BitmapDescriptorFactory.HUE_RED) {
                if (this.setChecked == BitmapDescriptorFactory.HUE_RED) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        this.setChecked = typedValue.getDimension(context.getResources().getDisplayMetrics());
                    } else {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                }
                int IconCompatParcelizer2 = IconCompatParcelizer();
                int scrollY = getScrollY();
                int i = scrollY - ((int) (axisValue * this.setChecked));
                if (i < 0) {
                    IconCompatParcelizer2 = 0;
                } else if (i <= IconCompatParcelizer2) {
                    IconCompatParcelizer2 = i;
                }
                if (IconCompatParcelizer2 != scrollY) {
                    super.scrollTo(getScrollX(), IconCompatParcelizer2);
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    private boolean IconCompatParcelizer(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            z = true;
            i2 = 0;
        }
        if (i5 > i4) {
            z2 = true;
        } else if (i5 < 0) {
            z2 = true;
            i4 = 0;
        } else {
            i4 = i5;
            z2 = false;
        }
        if (z2 && !this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(1)) {
            this.AppCompatActivity.springBack(i2, i4, 0, 0, 0, IconCompatParcelizer());
        }
        onOverScrolled(i2, i4, z, z2);
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int IconCompatParcelizer() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int height = childAt.getHeight();
        int i = layoutParams.topMargin;
        return Math.max(0, ((height + i) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    private boolean MediaBrowserCompat$MediaItem(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.AppCompatDialogFragment.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.AppCompatDialogFragment.top + height > bottom) {
                    this.AppCompatDialogFragment.top = bottom - height;
                }
            }
        } else {
            this.AppCompatDialogFragment.top = getScrollY() - height;
            if (this.AppCompatDialogFragment.top < 0) {
                this.AppCompatDialogFragment.top = 0;
            }
        }
        Rect rect = this.AppCompatDialogFragment;
        rect.bottom = rect.top + height;
        return MediaBrowserCompat$ItemReceiver(i, this.AppCompatDialogFragment.top, this.AppCompatDialogFragment.bottom);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        this.AppCompatDialogFragment.top = 0;
        this.AppCompatDialogFragment.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.AppCompatDialogFragment.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.AppCompatDialogFragment;
            rect.top = rect.bottom - height;
        }
        return MediaBrowserCompat$ItemReceiver(i, this.AppCompatDialogFragment.top, this.AppCompatDialogFragment.bottom);
    }

    private boolean MediaBrowserCompat$ItemReceiver(int i, int i2, int i3) {
        boolean z;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z2 = i4 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z4 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i5 < scrollY || i6 > i7) {
            int i9 = z2 ? i5 - scrollY : i6 - i7;
            if (i9 != 0) {
                if (this.setContentView) {
                    write(0, i9);
                } else {
                    scrollBy(0, i9);
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z;
    }

    private boolean MediaBrowserCompat$ItemReceiver(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (((float) getHeight()) * 0.5f);
        if (findNextFocus == null || !write(findNextFocus, height, getHeight())) {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            if (height != 0) {
                if (this.setContentView) {
                    write(0, height);
                } else {
                    scrollBy(0, height);
                }
            }
        } else {
            findNextFocus.getDrawingRect(this.AppCompatDialogFragment);
            offsetDescendantRectToMyCoords(findNextFocus, this.AppCompatDialogFragment);
            int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatDialogFragment);
            if (MediaBrowserCompat$CustomActionResultReceiver2 != 0) {
                if (this.setContentView) {
                    write(0, MediaBrowserCompat$CustomActionResultReceiver2);
                } else {
                    scrollBy(0, MediaBrowserCompat$CustomActionResultReceiver2);
                }
            }
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!write(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private boolean write(View view, int i, int i2) {
        view.getDrawingRect(this.AppCompatDialogFragment);
        offsetDescendantRectToMyCoords(view, this.AppCompatDialogFragment);
        return this.AppCompatDialogFragment.bottom + i >= getScrollY() && this.AppCompatDialogFragment.top - i <= getScrollY() + i2;
    }

    public final void write(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f16x50fd9e4a > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight();
                int i3 = layoutParams.topMargin;
                int i4 = layoutParams.bottomMargin;
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int scrollY = getScrollY();
                int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((height + i3) + i4) - ((height2 - paddingTop) - paddingBottom))));
                this.MediaSessionCompat$Token = getScrollY();
                this.AppCompatActivity.startScroll(getScrollX(), scrollY, 0, max - scrollY);
                SwitchCompat.setItemInvoker(this);
            } else {
                if (!this.AppCompatActivity.isFinished()) {
                    this.AppCompatActivity.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f16x50fd9e4a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        view.measure(getChildMeasureSpec(i, paddingLeft + paddingRight + i5 + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void computeScroll() {
        boolean z = false;
        if (this.AppCompatActivity.computeScrollOffset()) {
            this.AppCompatActivity.getCurrX();
            int currY = this.AppCompatActivity.getCurrY();
            int i = currY - this.MediaSessionCompat$Token;
            if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(0, i, this.AppCompatDelegateImpl$ListMenuDecorView, (int[]) null, 1)) {
                i -= this.AppCompatDelegateImpl$ListMenuDecorView[1];
            }
            if (i != 0) {
                int IconCompatParcelizer2 = IconCompatParcelizer();
                int scrollY = getScrollY();
                IconCompatParcelizer(i, getScrollX(), scrollY, IconCompatParcelizer2);
                int scrollY2 = getScrollY() - scrollY;
                if (!this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(0, scrollY2, 0, i - scrollY2, (int[]) null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && IconCompatParcelizer2 > 0)) {
                        z = true;
                    }
                    if (z) {
                        MediaBrowserCompat$CustomActionResultReceiver();
                        if (currY <= 0 && scrollY > 0) {
                            this.MediaBrowserCompat$MediaItem.onAbsorb((int) this.AppCompatActivity.getCurrVelocity());
                        } else if (currY >= IconCompatParcelizer2 && scrollY < IconCompatParcelizer2) {
                            this.MediaBrowserCompat$SearchResultReceiver.onAbsorb((int) this.AppCompatActivity.getCurrVelocity());
                        }
                    }
                }
            }
            this.MediaSessionCompat$Token = currY;
            SwitchCompat.setItemInvoker(this);
            return;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(1)) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(1);
        }
        this.MediaSessionCompat$Token = 0;
    }

    private void write(View view) {
        view.getDrawingRect(this.AppCompatDialogFragment);
        offsetDescendantRectToMyCoords(view, this.AppCompatDialogFragment);
        int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatDialogFragment);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != 0) {
            scrollBy(0, MediaBrowserCompat$CustomActionResultReceiver2);
        }
    }

    private int MediaBrowserCompat$CustomActionResultReceiver(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.MediaSessionCompat$ResultReceiverWrapper) {
            write(view2);
        } else {
            this.read = view2;
        }
        super.requestChildFocus(view, view2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = ISO781611.BIOMETRIC_SUBTYPE_TAG;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !(true ^ write(view, 0, getHeight()))) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(rect);
        boolean z2 = MediaBrowserCompat$CustomActionResultReceiver2 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, MediaBrowserCompat$CustomActionResultReceiver2);
            } else {
                write(0, MediaBrowserCompat$CustomActionResultReceiver2);
            }
        }
        return z2;
    }

    public void requestLayout() {
        this.MediaSessionCompat$ResultReceiverWrapper = true;
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        View view = this.read;
        if (view != null && MediaBrowserCompat$CustomActionResultReceiver(view, this)) {
            write(this.read);
        }
        this.read = null;
        if (!this.MediaMetadataCompat) {
            if (this.Keep != null) {
                scrollTo(getScrollX(), this.Keep.write);
                this.Keep = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int i7 = ((i4 - i2) - paddingTop) - paddingBottom;
            if (i7 < i5 && scrollY >= 0) {
                i6 = i7 + scrollY > i5 ? i5 - i7 : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.MediaMetadataCompat = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.MediaMetadataCompat = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && write(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.AppCompatDialogFragment);
            offsetDescendantRectToMyCoords(findFocus, this.AppCompatDialogFragment);
            int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatDialogFragment);
            if (MediaBrowserCompat$CustomActionResultReceiver2 == 0) {
                return;
            }
            if (this.setContentView) {
                write(0, MediaBrowserCompat$CustomActionResultReceiver2);
            } else {
                scrollBy(0, MediaBrowserCompat$CustomActionResultReceiver2);
            }
        }
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !MediaBrowserCompat$CustomActionResultReceiver((View) parent, view2)) {
            return false;
        }
        return true;
    }

    public final void read(int i) {
        if (getChildCount() > 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(2, 1);
            this.AppCompatActivity.fling(getScrollX(), getScrollY(), 0, i, 0, 0, PKIFailureInfo.systemUnavail, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            this.MediaSessionCompat$Token = getScrollY();
            SwitchCompat.setItemInvoker(this);
        }
    }

    private void write(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < IconCompatParcelizer() || i < 0);
        float f = (float) i;
        if (!dispatchNestedPreFling(BitmapDescriptorFactory.HUE_RED, f)) {
            dispatchNestedFling(BitmapDescriptorFactory.HUE_RED, f, z);
            read(i);
        }
    }

    private void read() {
        this.MediaDescriptionCompat = false;
        VelocityTracker velocityTracker = this.ActionMenuItemView;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ActionMenuItemView = null;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.write(0);
        EdgeEffect edgeEffect = this.MediaBrowserCompat$MediaItem;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.MediaBrowserCompat$SearchResultReceiver.onRelease();
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = childAt.getWidth();
            int i3 = layoutParams.leftMargin;
            int i4 = layoutParams.rightMargin;
            int height = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height2 = childAt.getHeight();
            int i5 = layoutParams.topMargin;
            int i6 = layoutParams.bottomMargin;
            int i7 = (width - paddingLeft) - paddingRight;
            int i8 = width2 + i3 + i4;
            if (i7 >= i8 || i < 0) {
                i = 0;
            } else if (i7 + i > i8) {
                i = i8 - i7;
            }
            int i9 = (height - paddingTop) - paddingBottom;
            int i10 = height2 + i5 + i6;
            if (i9 >= i10 || i2 < 0) {
                i2 = 0;
            } else if (i9 + i2 > i10) {
                i2 = i10 - i9;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        if (getOverScrollMode() == 2) {
            this.MediaBrowserCompat$MediaItem = null;
            this.MediaBrowserCompat$SearchResultReceiver = null;
        } else if (this.MediaBrowserCompat$MediaItem == null) {
            Context context = getContext();
            this.MediaBrowserCompat$MediaItem = new EdgeEffect(context);
            this.MediaBrowserCompat$SearchResultReceiver = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.MediaBrowserCompat$MediaItem != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.MediaBrowserCompat$MediaItem.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft();
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.MediaBrowserCompat$MediaItem.setSize(width, height);
                if (this.MediaBrowserCompat$MediaItem.draw(canvas)) {
                    SwitchCompat.setItemInvoker(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.MediaBrowserCompat$SearchResultReceiver.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(IconCompatParcelizer(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, BitmapDescriptorFactory.HUE_RED);
                this.MediaBrowserCompat$SearchResultReceiver.setSize(width2, height2);
                if (this.MediaBrowserCompat$SearchResultReceiver.draw(canvas)) {
                    SwitchCompat.setItemInvoker(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof NestedScrollView$MediaBrowserCompat$ItemReceiver)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        NestedScrollView$MediaBrowserCompat$ItemReceiver nestedScrollView$MediaBrowserCompat$ItemReceiver = (NestedScrollView$MediaBrowserCompat$ItemReceiver) parcelable;
        super.onRestoreInstanceState(nestedScrollView$MediaBrowserCompat$ItemReceiver.getSuperState());
        this.Keep = nestedScrollView$MediaBrowserCompat$ItemReceiver;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        NestedScrollView$MediaBrowserCompat$ItemReceiver nestedScrollView$MediaBrowserCompat$ItemReceiver = new NestedScrollView$MediaBrowserCompat$ItemReceiver(super.onSaveInstanceState());
        nestedScrollView$MediaBrowserCompat$ItemReceiver.write = getScrollY();
        return nestedScrollView$MediaBrowserCompat$ItemReceiver;
    }

    static class write extends setIconifiedByDefault {
        write() {
        }

        public final boolean MediaBrowserCompat$ItemReceiver(View view, int i, Bundle bundle) {
            if (super.MediaBrowserCompat$ItemReceiver(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int height = nestedScrollView.getHeight();
                int paddingBottom = nestedScrollView.getPaddingBottom();
                int paddingTop = nestedScrollView.getPaddingTop();
                int min = Math.min(nestedScrollView.getScrollY() + ((height - paddingBottom) - paddingTop), nestedScrollView.IconCompatParcelizer());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.write(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY());
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int height2 = nestedScrollView.getHeight();
                int paddingBottom2 = nestedScrollView.getPaddingBottom();
                int max = Math.max(nestedScrollView.getScrollY() - ((height2 - paddingBottom2) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.write(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY());
                return true;
            }
        }

        public final void IconCompatParcelizer(View view, setTextOn settexton) {
            int IconCompatParcelizer;
            super.IconCompatParcelizer(view, settexton);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            settexton.write((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (IconCompatParcelizer = nestedScrollView.IconCompatParcelizer()) > 0) {
                settexton.MediaSessionCompat$ResultReceiverWrapper(true);
                if (nestedScrollView.getScrollY() > 0) {
                    settexton.read(8192);
                }
                if (nestedScrollView.getScrollY() < IconCompatParcelizer) {
                    settexton.read(4096);
                }
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(View view, AccessibilityEvent accessibilityEvent) {
            super.MediaBrowserCompat$CustomActionResultReceiver(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.IconCompatParcelizer() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            setThumbResource.MediaBrowserCompat$CustomActionResultReceiver(accessibilityEvent, nestedScrollView.getScrollX());
            setThumbResource.write(accessibilityEvent, nestedScrollView.IconCompatParcelizer());
        }
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(i, i2, i3, i4, iArr, 0);
    }

    public boolean hasNestedScrollingParent() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(0);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i, i2, iArr, (int[]) null, 0);
    }

    public final void IconCompatParcelizer(View view, int i, int i2, int[] iArr, int i3) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i, i2, iArr, (int[]) null, i3);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.AlertController$RecycleListView.write = i;
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(2, 0);
    }

    public void onStopNestedScroll(View view) {
        this.AlertController$RecycleListView.write = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver.write(0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        if (this.ActionMenuItemView == null) {
            this.ActionMenuItemView = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.PlaybackStateCompat$CustomAction = 0;
        }
        obtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, (float) this.PlaybackStateCompat$CustomAction);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.ActionMenuItemView;
                velocityTracker.computeCurrentVelocity(1000, (float) this.MediaSessionCompat$QueueItem);
                int yVelocity = (int) velocityTracker.getYVelocity(this.write);
                if (Math.abs(yVelocity) > this.PlaybackStateCompat) {
                    write(-yVelocity);
                } else if (this.AppCompatActivity.springBack(getScrollX(), getScrollY(), 0, 0, 0, IconCompatParcelizer())) {
                    SwitchCompat.setItemInvoker(this);
                }
                this.write = -1;
                read();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.write);
                if (findPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(this.write);
                    sb.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sb.toString());
                } else {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i = this.ParcelableVolumeInfo - y;
                    if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(0, i, this.AppCompatDelegateImpl$ListMenuDecorView, this.setBackgroundResource, 0)) {
                        i -= this.AppCompatDelegateImpl$ListMenuDecorView[1];
                        obtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, (float) this.setBackgroundResource[1]);
                        this.PlaybackStateCompat$CustomAction += this.setBackgroundResource[1];
                    }
                    if (!this.MediaDescriptionCompat && Math.abs(i) > this.AppCompatViewInflater) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.MediaDescriptionCompat = true;
                        if (i > 0) {
                            i -= this.AppCompatViewInflater;
                        } else {
                            i += this.AppCompatViewInflater;
                        }
                    }
                    if (this.MediaDescriptionCompat) {
                        this.ParcelableVolumeInfo = y - this.setBackgroundResource[1];
                        int scrollY = getScrollY();
                        int IconCompatParcelizer2 = IconCompatParcelizer();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && IconCompatParcelizer2 > 0);
                        if (IconCompatParcelizer(i, 0, getScrollY(), IconCompatParcelizer2) && !this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(0)) {
                            this.ActionMenuItemView.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(0, scrollY2, 0, i - scrollY2, this.setBackgroundResource, 0)) {
                            int i2 = this.ParcelableVolumeInfo;
                            int[] iArr = this.setBackgroundResource;
                            this.ParcelableVolumeInfo = i2 - iArr[1];
                            obtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, (float) iArr[1]);
                            this.PlaybackStateCompat$CustomAction += this.setBackgroundResource[1];
                        } else if (z) {
                            MediaBrowserCompat$CustomActionResultReceiver();
                            int i3 = scrollY + i;
                            if (i3 < 0) {
                                Toolbar.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, ((float) i) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.MediaBrowserCompat$SearchResultReceiver.isFinished()) {
                                    this.MediaBrowserCompat$SearchResultReceiver.onRelease();
                                }
                            } else if (i3 > IconCompatParcelizer2) {
                                Toolbar.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, ((float) i) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.MediaBrowserCompat$MediaItem.isFinished()) {
                                    this.MediaBrowserCompat$MediaItem.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.MediaBrowserCompat$MediaItem;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.MediaBrowserCompat$SearchResultReceiver.isFinished())) {
                                SwitchCompat.setItemInvoker(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.MediaDescriptionCompat && getChildCount() > 0 && this.AppCompatActivity.springBack(getScrollX(), getScrollY(), 0, 0, 0, IconCompatParcelizer())) {
                    SwitchCompat.setItemInvoker(this);
                }
                this.write = -1;
                read();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.ParcelableVolumeInfo = (int) motionEvent2.getY(actionIndex);
                this.write = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                MediaBrowserCompat$CustomActionResultReceiver(motionEvent);
                this.ParcelableVolumeInfo = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.write));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.AppCompatActivity.isFinished();
            this.MediaDescriptionCompat = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.AppCompatActivity.isFinished()) {
                this.AppCompatActivity.abortAnimation();
            }
            this.ParcelableVolumeInfo = (int) motionEvent.getY();
            this.write = motionEvent2.getPointerId(0);
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(2, 0);
        }
        VelocityTracker velocityTracker2 = this.ActionMenuItemView;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.ActionMenuItemView) != null) {
            velocityTracker.recycle();
            this.ActionMenuItemView = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean startNestedScroll(int i) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(i, 0);
    }

    public void stopNestedScroll() {
        this.MediaBrowserCompat$CustomActionResultReceiver.write(0);
    }
}

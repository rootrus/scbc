package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$ItemReceiver;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.Iterables;
import p040o.SwitchCompat;
import p040o.nAllocationSetSurface;
import p040o.nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver;
import p040o.nAllocationSetSurface$MediaSessionCompat$Token;
import p040o.nContextFinish;
import p040o.nContextPeekMessage;
import p040o.setIconified;
import p040o.setTextOff;
import p040o.setTitleMarginBottom;
import p040o.zzlz;

@CoordinatorLayout$MediaBrowserCompat$ItemReceiver(write = Behavior.class)
public class AppBarLayout extends LinearLayout {
    int IconCompatParcelizer;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    setTextOff MediaBrowserCompat$ItemReceiver;
    List<AppBarLayout$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$MediaItem;
    boolean MediaBrowserCompat$SearchResultReceiver;
    int MediaDescriptionCompat;
    int MediaMetadataCompat;
    private int[] MediaSessionCompat$ResultReceiverWrapper;
    private boolean RatingCompat;
    int read;
    boolean write;

    public interface read extends AppBarLayout$MediaBrowserCompat$ItemReceiver<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaDescriptionCompat = -1;
        this.IconCompatParcelizer = -1;
        this.read = -1;
        this.MediaMetadataCompat = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            int i = nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.Widget_Design_AppBarLayout;
            Context context2 = getContext();
            TypedArray MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(context2, attributeSet, Iterables.C35273.IconCompatParcelizer.write, 0, i, new int[0]);
            try {
                if (MediaBrowserCompat$ItemReceiver2.hasValue(0)) {
                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, MediaBrowserCompat$ItemReceiver2.getResourceId(0, 0)));
                }
            } finally {
                MediaBrowserCompat$ItemReceiver2.recycle();
            }
        }
        TypedArray MediaBrowserCompat$ItemReceiver3 = AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(context, attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout, 0, nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.Widget_Design_AppBarLayout, new int[0]);
        SwitchCompat.IconCompatParcelizer((View) this, MediaBrowserCompat$ItemReceiver3.getDrawable(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_android_background));
        if (MediaBrowserCompat$ItemReceiver3.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_expanded)) {
            IconCompatParcelizer(MediaBrowserCompat$ItemReceiver3.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && MediaBrowserCompat$ItemReceiver3.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_elevation)) {
            Iterables.C35273.IconCompatParcelizer.write(this, (float) MediaBrowserCompat$ItemReceiver3.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (MediaBrowserCompat$ItemReceiver3.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(MediaBrowserCompat$ItemReceiver3.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (MediaBrowserCompat$ItemReceiver3.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(MediaBrowserCompat$ItemReceiver3.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.write = MediaBrowserCompat$ItemReceiver3.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_liftOnScroll, false);
        MediaBrowserCompat$ItemReceiver3.recycle();
        SwitchCompat.write((View) this, (CheckCaptureModule_GetIJsonExactionHelperRttiFactory) new CheckCaptureModule_GetIJsonExactionHelperRttiFactory() {
            public final setTextOff write(View view, setTextOff settextoff) {
                AppBarLayout appBarLayout = AppBarLayout.this;
                setTextOff settextoff2 = SwitchCompat.RatingCompat(appBarLayout) ? settextoff : null;
                if (!setIconified.MediaBrowserCompat$CustomActionResultReceiver(appBarLayout.MediaBrowserCompat$ItemReceiver, settextoff2)) {
                    appBarLayout.MediaBrowserCompat$ItemReceiver = settextoff2;
                    appBarLayout.MediaDescriptionCompat = -1;
                    appBarLayout.IconCompatParcelizer = -1;
                    appBarLayout.read = -1;
                }
                return settextoff;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.MediaDescriptionCompat = -1;
        this.IconCompatParcelizer = -1;
        this.read = -1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r3 != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = -1
            r1.MediaDescriptionCompat = r2
            r1.IconCompatParcelizer = r2
            r1.read = r2
            r2 = 0
            r1.MediaBrowserCompat$CustomActionResultReceiver = r2
            int r3 = r1.getChildCount()
            r4 = r2
        L_0x0012:
            r5 = 1
            if (r4 >= r3) goto L_0x0029
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$write r6 = (com.google.android.material.appbar.AppBarLayout.write) r6
            android.view.animation.Interpolator r6 = r6.write
            if (r6 == 0) goto L_0x0026
            r1.MediaBrowserCompat$CustomActionResultReceiver = r5
            goto L_0x0029
        L_0x0026:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0029:
            boolean r3 = r1.write
            if (r3 != 0) goto L_0x0056
            int r3 = r1.getChildCount()
            r4 = r2
        L_0x0032:
            if (r4 >= r3) goto L_0x0053
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$write r6 = (com.google.android.material.appbar.AppBarLayout.write) r6
            int r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r0 = r6 & 1
            if (r0 != r5) goto L_0x004b
            r6 = r6 & 10
            if (r6 != 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r6 = r5
            goto L_0x004c
        L_0x004b:
            r6 = r2
        L_0x004c:
            if (r6 == 0) goto L_0x0050
            r3 = r5
            goto L_0x0054
        L_0x0050:
            int r4 = r4 + 1
            goto L_0x0032
        L_0x0053:
            r3 = r2
        L_0x0054:
            if (r3 == 0) goto L_0x0057
        L_0x0056:
            r2 = r5
        L_0x0057:
            boolean r3 = r1.RatingCompat
            if (r3 == r2) goto L_0x0060
            r1.RatingCompat = r2
            r1.refreshDrawableState()
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setExpanded(boolean z) {
        setExpanded(z, SwitchCompat.setCheckable(this));
    }

    public void setExpanded(boolean z, boolean z2) {
        IconCompatParcelizer(z, z2, true);
    }

    private void IconCompatParcelizer(boolean z, boolean z2, boolean z3) {
        int i = z ? 1 : 2;
        int i2 = 0;
        int i3 = z2 ? 4 : 0;
        if (z3) {
            i2 = 8;
        }
        this.MediaMetadataCompat = i | i3 | i2;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof write;
    }

    private static write MediaBrowserCompat$ItemReceiver(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new write((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new write((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new write(layoutParams);
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        int i = this.MediaDescriptionCompat;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            write write2 = (write) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = write2.MediaBrowserCompat$CustomActionResultReceiver;
            if ((i4 & 1) == 0) {
                break;
            }
            i2 += measuredHeight + write2.topMargin + write2.bottomMargin;
            if ((i4 & 2) != 0) {
                i2 -= SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(childAt);
                break;
            }
            i3++;
        }
        setTextOff settextoff = this.MediaBrowserCompat$ItemReceiver;
        int max = Math.max(0, i2 - (settextoff != null ? settextoff.read() : 0));
        this.MediaDescriptionCompat = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        int i;
        int i2 = this.IconCompatParcelizer;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            write write2 = (write) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = write2.MediaBrowserCompat$CustomActionResultReceiver;
            if ((i4 & 5) != 5) {
                if (i3 > 0) {
                    break;
                }
            } else {
                int i5 = i3 + write2.topMargin + write2.bottomMargin;
                if ((i4 & 8) != 0) {
                    i3 = i5 + SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(childAt);
                } else {
                    if ((i4 & 2) != 0) {
                        i = SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(childAt);
                    } else {
                        setTextOff settextoff = this.MediaBrowserCompat$ItemReceiver;
                        i = settextoff != null ? settextoff.read() : 0;
                    }
                    i3 = i5 + (measuredHeight - i);
                }
            }
        }
        int max = Math.max(0, i3);
        this.IconCompatParcelizer = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public final int read() {
        int i = this.read;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            write write2 = (write) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = write2.topMargin;
            int i5 = write2.bottomMargin;
            int i6 = write2.MediaBrowserCompat$CustomActionResultReceiver;
            if ((i6 & 1) == 0) {
                break;
            }
            i2 += measuredHeight + i4 + i5;
            if ((i6 & 2) != 0) {
                int MediaSessionCompat$ResultReceiverWrapper2 = SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(childAt);
                setTextOff settextoff = this.MediaBrowserCompat$ItemReceiver;
                i2 -= MediaSessionCompat$ResultReceiverWrapper2 + (settextoff != null ? settextoff.read() : 0);
            } else {
                i3++;
            }
        }
        int max = Math.max(0, i2);
        this.read = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(int i) {
        List<AppBarLayout$MediaBrowserCompat$ItemReceiver> list = this.MediaBrowserCompat$MediaItem;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AppBarLayout$MediaBrowserCompat$ItemReceiver appBarLayout$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$MediaItem.get(i2);
                if (appBarLayout$MediaBrowserCompat$ItemReceiver != null) {
                    appBarLayout$MediaBrowserCompat$ItemReceiver.read(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.MediaSessionCompat$ResultReceiverWrapper == null) {
            this.MediaSessionCompat$ResultReceiverWrapper = new int[4];
        }
        int[] iArr = this.MediaSessionCompat$ResultReceiverWrapper;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.RatingCompat ? nAllocationSetSurface.read.state_liftable : -nAllocationSetSurface.read.state_liftable;
        iArr[1] = (!this.RatingCompat || !this.MediaBrowserCompat$SearchResultReceiver) ? -nAllocationSetSurface.read.state_lifted : nAllocationSetSurface.read.state_lifted;
        iArr[2] = this.RatingCompat ? nAllocationSetSurface.read.state_collapsible : -nAllocationSetSurface.read.state_collapsible;
        iArr[3] = (!this.RatingCompat || !this.MediaBrowserCompat$SearchResultReceiver) ? -nAllocationSetSurface.read.state_collapsed : nAllocationSetSurface.read.state_collapsed;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void setLiftOnScroll(boolean z) {
        this.write = z;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            Iterables.C35273.IconCompatParcelizer.write(this, f);
        }
    }

    public static class write extends LinearLayout.LayoutParams {
        int MediaBrowserCompat$CustomActionResultReceiver = 1;
        Interpolator write;

        public write(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_Layout);
            this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getInt(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.write = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public write() {
            super(-1, -2);
        }

        public write(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public write(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public write(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            super.read(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }

        public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.IconCompatParcelizer(coordinatorLayout, appBarLayout, i);
        }

        public final /* bridge */ /* synthetic */ Parcelable MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(coordinatorLayout, appBarLayout);
        }

        public final /* bridge */ /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }

        public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.MediaBrowserCompat$CustomActionResultReceiver(coordinatorLayout, appBarLayout, view, i);
        }

        public final /* bridge */ /* synthetic */ int read() {
            return super.read();
        }

        public final /* bridge */ /* synthetic */ void read(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.read(coordinatorLayout, appBarLayout, parcelable);
        }

        public final /* bridge */ /* synthetic */ void read(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.IconCompatParcelizer(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        public final /* bridge */ /* synthetic */ boolean write(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.IconCompatParcelizer(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        public final /* bridge */ /* synthetic */ boolean write(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends nContextFinish<T> {
        private int IconCompatParcelizer;
        int MediaBrowserCompat$CustomActionResultReceiver;
        private float MediaBrowserCompat$SearchResultReceiver;
        private boolean MediaDescriptionCompat;
        private int RatingCompat = -1;
        private WeakReference<View> read;
        private ValueAnimator write;

        /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00af  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ int IconCompatParcelizer(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.read()
                int r1 = r7.MediaBrowserCompat$CustomActionResultReceiver
                int r0 = r0 + r1
                r1 = 0
                if (r11 == 0) goto L_0x00b5
                if (r0 < r11) goto L_0x00b5
                if (r0 > r12) goto L_0x00b5
                if (r10 >= r11) goto L_0x0014
                r10 = r11
                goto L_0x0017
            L_0x0014:
                if (r10 <= r12) goto L_0x0017
                r10 = r12
            L_0x0017:
                if (r0 == r10) goto L_0x00b7
                boolean r11 = r9.MediaBrowserCompat$CustomActionResultReceiver
                if (r11 == 0) goto L_0x0090
                int r11 = java.lang.Math.abs(r10)
                int r12 = r9.getChildCount()
                r2 = r1
            L_0x0026:
                if (r2 >= r12) goto L_0x0090
                android.view.View r3 = r9.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$write r4 = (com.google.android.material.appbar.AppBarLayout.write) r4
                android.view.animation.Interpolator r5 = r4.write
                int r6 = r3.getTop()
                if (r11 < r6) goto L_0x008d
                int r6 = r3.getBottom()
                if (r11 > r6) goto L_0x008d
                if (r5 == 0) goto L_0x0090
                int r12 = r4.MediaBrowserCompat$CustomActionResultReceiver
                r2 = r12 & 1
                if (r2 == 0) goto L_0x005d
                int r2 = r3.getHeight()
                int r6 = r4.topMargin
                int r2 = r2 + r6
                int r4 = r4.bottomMargin
                int r2 = r2 + r4
                int r2 = r2 + r1
                r12 = r12 & 2
                if (r12 == 0) goto L_0x005e
                int r12 = p040o.SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(r3)
                int r2 = r2 - r12
                goto L_0x005e
            L_0x005d:
                r2 = r1
            L_0x005e:
                boolean r12 = p040o.SwitchCompat.RatingCompat(r3)
                if (r12 == 0) goto L_0x006f
                o.setTextOff r12 = r9.MediaBrowserCompat$ItemReceiver
                if (r12 == 0) goto L_0x006d
                int r12 = r12.read()
                goto L_0x006e
            L_0x006d:
                r12 = r1
            L_0x006e:
                int r2 = r2 - r12
            L_0x006f:
                if (r2 <= 0) goto L_0x0090
                int r12 = r3.getTop()
                float r2 = (float) r2
                int r11 = r11 - r12
                float r11 = (float) r11
                float r11 = r11 / r2
                float r11 = r5.getInterpolation(r11)
                float r2 = r2 * r11
                int r11 = java.lang.Math.round(r2)
                int r12 = java.lang.Integer.signum(r10)
                int r2 = r3.getTop()
                int r2 = r2 + r11
                int r12 = r12 * r2
                goto L_0x0091
            L_0x008d:
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0090:
                r12 = r10
            L_0x0091:
                boolean r11 = r7.MediaBrowserCompat$CustomActionResultReceiver(r12)
                int r2 = r0 - r10
                int r12 = r10 - r12
                r7.MediaBrowserCompat$CustomActionResultReceiver = r12
                if (r11 != 0) goto L_0x00a4
                boolean r11 = r9.MediaBrowserCompat$CustomActionResultReceiver
                if (r11 == 0) goto L_0x00a4
                r8.read(r9)
            L_0x00a4:
                int r11 = r7.read()
                r9.IconCompatParcelizer((int) r11)
                if (r10 >= r0) goto L_0x00af
                r11 = -1
                goto L_0x00b0
            L_0x00af:
                r11 = 1
            L_0x00b0:
                read(r8, r9, r10, r11, r1)
                r1 = r2
                goto L_0x00b7
            L_0x00b5:
                r7.MediaBrowserCompat$CustomActionResultReceiver = r1
            L_0x00b7:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.IconCompatParcelizer(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver(View view) {
            return -((AppBarLayout) view).read();
        }

        public final /* synthetic */ int read(View view) {
            return ((AppBarLayout) view).MediaBrowserCompat$ItemReceiver();
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: read */
        public void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.MediaBrowserCompat$ItemReceiver();
                    i5 = t.MediaBrowserCompat$CustomActionResultReceiver() + i4;
                } else {
                    i4 = -t.MediaBrowserCompat$ItemReceiver();
                    i5 = 0;
                }
                int i6 = i4;
                int i7 = i5;
                if (i6 != i7) {
                    iArr[1] = IconCompatParcelizer(coordinatorLayout, t, IconCompatParcelizer() - i2, i6, i7);
                    MediaBrowserCompat$ItemReceiver(i2, t, view, i3);
                }
            }
        }

        /* renamed from: IconCompatParcelizer */
        public void read(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                IconCompatParcelizer(coordinatorLayout, t, IconCompatParcelizer() - i4, -t.read(), 0);
                MediaBrowserCompat$ItemReceiver(i4, t, view, i5);
            }
            if (t.write) {
                boolean z = view.getScrollY() > 0;
                if (t.MediaBrowserCompat$SearchResultReceiver != z) {
                    t.MediaBrowserCompat$SearchResultReceiver = z;
                    t.refreshDrawableState();
                }
            }
        }

        /* renamed from: MediaBrowserCompat$ItemReceiver */
        public void MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.IconCompatParcelizer == 0 || i == 1) {
                IconCompatParcelizer(coordinatorLayout, t);
            }
            this.read = new WeakReference<>(view);
        }

        /* renamed from: write */
        public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.read) t.getLayoutParams()).height != -2) {
                return super.IconCompatParcelizer(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.read(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean IconCompatParcelizer2 = super.IconCompatParcelizer(coordinatorLayout, t, i);
            int i3 = t.MediaMetadataCompat;
            int i4 = this.RatingCompat;
            if (i4 >= 0 && (i3 & 8) == 0) {
                View childAt = t.getChildAt(i4);
                int i5 = -childAt.getBottom();
                if (this.MediaDescriptionCompat) {
                    int MediaSessionCompat$ResultReceiverWrapper = SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(childAt);
                    setTextOff settextoff = t.MediaBrowserCompat$ItemReceiver;
                    i2 = MediaSessionCompat$ResultReceiverWrapper + (settextoff != null ? settextoff.read() : 0);
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.MediaBrowserCompat$SearchResultReceiver);
                }
                IconCompatParcelizer(coordinatorLayout, t, i5 + i2, PKIFailureInfo.systemUnavail, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else if (i3 != 0) {
                boolean z = (i3 & 4) != 0;
                if ((i3 & 2) != 0) {
                    int i6 = -t.MediaBrowserCompat$ItemReceiver();
                    if (z) {
                        MediaBrowserCompat$ItemReceiver(coordinatorLayout, t, i6);
                    } else {
                        IconCompatParcelizer(coordinatorLayout, t, i6, PKIFailureInfo.systemUnavail, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    }
                } else if ((i3 & 1) != 0) {
                    if (z) {
                        MediaBrowserCompat$ItemReceiver(coordinatorLayout, t, 0);
                    } else {
                        IconCompatParcelizer(coordinatorLayout, t, 0, PKIFailureInfo.systemUnavail, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    }
                }
            }
            t.MediaMetadataCompat = 0;
            this.RatingCompat = -1;
            int read2 = read();
            int i7 = -t.MediaBrowserCompat$ItemReceiver();
            if (read2 < i7) {
                read2 = i7;
            } else if (read2 > 0) {
                read2 = 0;
            }
            MediaBrowserCompat$CustomActionResultReceiver(read2);
            read(coordinatorLayout, t, read(), 0, true);
            t.IconCompatParcelizer(read());
            return IconCompatParcelizer2;
        }

        public final int IconCompatParcelizer() {
            return read() + this.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public Parcelable MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable MediaBrowserCompat$CustomActionResultReceiver2 = super.MediaBrowserCompat$CustomActionResultReceiver(coordinatorLayout, t);
            int read2 = read();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + read2;
                if (childAt.getTop() + read2 > 0 || bottom < 0) {
                    i++;
                } else {
                    IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2);
                    iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = i;
                    int MediaSessionCompat$ResultReceiverWrapper = SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(childAt);
                    setTextOff settextoff = t.MediaBrowserCompat$ItemReceiver;
                    if (bottom == MediaSessionCompat$ResultReceiverWrapper + (settextoff != null ? settextoff.read() : 0)) {
                        z = true;
                    }
                    iconCompatParcelizer.IconCompatParcelizer = z;
                    iconCompatParcelizer.read = ((float) bottom) / ((float) childAt.getHeight());
                    return iconCompatParcelizer;
                }
            }
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }

        public void read(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof IconCompatParcelizer) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) parcelable;
                super.read(coordinatorLayout, t, iconCompatParcelizer.write);
                this.RatingCompat = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.read;
                this.MediaDescriptionCompat = iconCompatParcelizer.IconCompatParcelizer;
                return;
            }
            super.read(coordinatorLayout, t, parcelable);
            this.RatingCompat = -1;
        }

        public static class IconCompatParcelizer extends setTitleMarginBottom {
            public static final Parcelable.Creator<IconCompatParcelizer> CREATOR = new Parcelable.ClassLoaderCreator<IconCompatParcelizer>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new IconCompatParcelizer(parcel, (ClassLoader) null);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new IconCompatParcelizer(parcel, classLoader);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new IconCompatParcelizer[i];
                }
            };
            boolean IconCompatParcelizer;
            int MediaBrowserCompat$ItemReceiver;
            float read;

            public IconCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
                this.read = parcel.readFloat();
                this.IconCompatParcelizer = parcel.readByte() != 0;
            }

            public IconCompatParcelizer(Parcelable parcelable) {
                super(parcelable);
            }

            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
                parcel.writeFloat(this.read);
                parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : 0);
            }
        }

        private void MediaBrowserCompat$ItemReceiver(final CoordinatorLayout coordinatorLayout, final T t, int i) {
            int i2;
            int abs = Math.abs((read() + this.MediaBrowserCompat$CustomActionResultReceiver) - i);
            float abs2 = Math.abs(BitmapDescriptorFactory.HUE_RED);
            if (abs2 > BitmapDescriptorFactory.HUE_RED) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            int read2 = read() + this.MediaBrowserCompat$CustomActionResultReceiver;
            if (read2 == i) {
                ValueAnimator valueAnimator = this.write;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.write.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.write;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.write = valueAnimator3;
                valueAnimator3.setInterpolator(zzlz.write);
                this.write.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseBehavior.this.IconCompatParcelizer(coordinatorLayout, t, ((Integer) valueAnimator.getAnimatedValue()).intValue(), PKIFailureInfo.systemUnavail, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.write.setDuration((long) Math.min(i2, 600));
            this.write.setIntValues(new int[]{read2, i});
            this.write.start();
        }

        /* access modifiers changed from: private */
        /* renamed from: MediaBrowserCompat$ItemReceiver */
        public void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, T t) {
            boolean z;
            int read2 = read() + this.MediaBrowserCompat$CustomActionResultReceiver;
            int childCount = t.getChildCount();
            int i = 0;
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= childCount) {
                    i2 = -1;
                    break;
                }
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                write write2 = (write) childAt.getLayoutParams();
                if ((write2.MediaBrowserCompat$CustomActionResultReceiver & 32) == 32) {
                    top -= write2.topMargin;
                    bottom += write2.bottomMargin;
                }
                int i3 = -read2;
                if (top <= i3 && bottom >= i3) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                View childAt2 = t.getChildAt(i2);
                write write3 = (write) childAt2.getLayoutParams();
                int i4 = write3.MediaBrowserCompat$CustomActionResultReceiver;
                if ((i4 & 17) == 17) {
                    int i5 = -childAt2.getTop();
                    int i6 = -childAt2.getBottom();
                    if (i2 == t.getChildCount() - 1) {
                        setTextOff settextoff = t.MediaBrowserCompat$ItemReceiver;
                        i6 += settextoff != null ? settextoff.read() : 0;
                    }
                    if ((i4 & 2) == 2) {
                        i6 += SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(childAt2);
                    } else {
                        if ((i4 & 5) == 5) {
                            int MediaSessionCompat$ResultReceiverWrapper = SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(childAt2) + i6;
                            if (read2 < MediaSessionCompat$ResultReceiverWrapper) {
                                i5 = MediaSessionCompat$ResultReceiverWrapper;
                            } else {
                                i6 = MediaSessionCompat$ResultReceiverWrapper;
                            }
                        }
                    }
                    if ((i4 & 32) != 32) {
                        z = false;
                    }
                    if (z) {
                        i5 += write3.topMargin;
                        i6 -= write3.bottomMargin;
                    }
                    if (read2 < (i6 + i5) / 2) {
                        i5 = i6;
                    }
                    int i7 = -t.MediaBrowserCompat$ItemReceiver();
                    if (i5 < i7) {
                        i = i7;
                    } else if (i5 <= 0) {
                        i = i5;
                    }
                    MediaBrowserCompat$ItemReceiver(coordinatorLayout, t, i);
                }
            }
        }

        private void MediaBrowserCompat$ItemReceiver(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int read2 = read() + this.MediaBrowserCompat$CustomActionResultReceiver;
                if ((i < 0 && read2 == 0) || (i > 0 && read2 == (-t.read()))) {
                    SwitchCompat.MediaDescriptionCompat(view, 1);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
            if (r9 >= (r10 - (r0 != null ? r0.read() : 0))) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
            if (r9 < (r10 - (r0 != null ? r0.read() : 0))) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void read(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            L_0x000a:
                r4 = 0
                if (r3 >= r1) goto L_0x0021
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L_0x001e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L_0x001e
                goto L_0x0022
            L_0x001e:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0021:
                r5 = r4
            L_0x0022:
                if (r5 == 0) goto L_0x00d0
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$write r0 = (com.google.android.material.appbar.AppBarLayout.write) r0
                int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L_0x0069
                int r1 = p040o.SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(r5)
                if (r10 <= 0) goto L_0x004f
                r10 = r0 & 12
                if (r10 == 0) goto L_0x004f
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                o.setTextOff r0 = r8.MediaBrowserCompat$ItemReceiver
                if (r0 == 0) goto L_0x004a
                int r0 = r0.read()
                goto L_0x004b
            L_0x004a:
                r0 = r2
            L_0x004b:
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x0069
                goto L_0x0067
            L_0x004f:
                r10 = r0 & 2
                if (r10 == 0) goto L_0x0069
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                o.setTextOff r0 = r8.MediaBrowserCompat$ItemReceiver
                if (r0 == 0) goto L_0x0062
                int r0 = r0.read()
                goto L_0x0063
            L_0x0062:
                r0 = r2
            L_0x0063:
                int r10 = r10 - r0
                if (r9 >= r10) goto L_0x0067
                goto L_0x0069
            L_0x0067:
                r9 = r3
                goto L_0x006a
            L_0x0069:
                r9 = r2
            L_0x006a:
                boolean r10 = r8.write
                if (r10 == 0) goto L_0x008d
                int r10 = r7.getChildCount()
                r0 = r2
            L_0x0073:
                if (r0 >= r10) goto L_0x0082
                android.view.View r1 = r7.getChildAt(r0)
                boolean r5 = r1 instanceof p040o.setSearchableInfo
                if (r5 == 0) goto L_0x007f
                r4 = r1
                goto L_0x0082
            L_0x007f:
                int r0 = r0 + 1
                goto L_0x0073
            L_0x0082:
                if (r4 == 0) goto L_0x008d
                int r9 = r4.getScrollY()
                if (r9 <= 0) goto L_0x008c
                r9 = r3
                goto L_0x008d
            L_0x008c:
                r9 = r2
            L_0x008d:
                boolean r10 = r8.MediaBrowserCompat$SearchResultReceiver
                if (r10 == r9) goto L_0x0098
                r8.MediaBrowserCompat$SearchResultReceiver = r9
                r8.refreshDrawableState()
                r9 = r3
                goto L_0x0099
            L_0x0098:
                r9 = r2
            L_0x0099:
                int r10 = android.os.Build.VERSION.SDK_INT
                r0 = 11
                if (r10 < r0) goto L_0x00d0
                if (r11 != 0) goto L_0x00cd
                if (r9 == 0) goto L_0x00d0
                java.util.List r7 = r7.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r8)
                int r9 = r7.size()
                r10 = r2
            L_0x00ac:
                if (r10 >= r9) goto L_0x00cb
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$read r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.read) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver r11 = r11.MediaDescriptionCompat
                boolean r0 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L_0x00c8
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.IconCompatParcelizer
                if (r7 == 0) goto L_0x00cb
                r2 = r3
                goto L_0x00cb
            L_0x00c8:
                int r10 = r10 + 1
                goto L_0x00ac
            L_0x00cb:
                if (r2 == 0) goto L_0x00d0
            L_0x00cd:
                r8.jumpDrawablesToCurrentState()
            L_0x00d0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.read(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final /* synthetic */ boolean IconCompatParcelizer(View view) {
            WeakReference<View> weakReference = this.read;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            if (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (((r3.MediaBrowserCompat$ItemReceiver() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002b;
         */
        /* renamed from: write */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean MediaBrowserCompat$CustomActionResultReceiver(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002a
                boolean r5 = r3.write
                if (r5 != 0) goto L_0x002b
                int r5 = r3.MediaBrowserCompat$ItemReceiver()
                if (r5 == 0) goto L_0x0012
                r5 = r6
                goto L_0x0013
            L_0x0012:
                r5 = r0
            L_0x0013:
                if (r5 == 0) goto L_0x0026
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0026
                r2 = r6
                goto L_0x0027
            L_0x0026:
                r2 = r0
            L_0x0027:
                if (r2 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r6 = r0
            L_0x002b:
                if (r6 == 0) goto L_0x0034
                android.animation.ValueAnimator r2 = r1.write
                if (r2 == 0) goto L_0x0034
                r2.cancel()
            L_0x0034:
                r2 = 0
                r1.read = r2
                r1.IconCompatParcelizer = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.MediaBrowserCompat$CustomActionResultReceiver(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }
    }

    public final void IconCompatParcelizer(read read2) {
        if (this.MediaBrowserCompat$MediaItem == null) {
            this.MediaBrowserCompat$MediaItem = new ArrayList();
        }
        if (read2 != null && !this.MediaBrowserCompat$MediaItem.contains(read2)) {
            this.MediaBrowserCompat$MediaItem.add(read2);
        }
    }

    public static class ScrollingViewBehavior extends nContextPeekMessage {
        public final /* synthetic */ View IconCompatParcelizer(List list) {
            return read((List<View>) list);
        }

        public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.IconCompatParcelizer(coordinatorLayout, view, i);
        }

        public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.IconCompatParcelizer(coordinatorLayout, view, i, i2, i3, i4);
        }

        public final /* bridge */ /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }

        public final /* bridge */ /* synthetic */ int read() {
            return super.read();
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.ScrollingViewBehavior_Layout);
            this.IconCompatParcelizer = obtainStyledAttributes.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }

        public final boolean read(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public final boolean write(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout read = read(coordinatorLayout.write(view));
            if (read != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.read;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    read.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        public final float write(View view) {
            int i;
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int MediaBrowserCompat$ItemReceiver = appBarLayout.MediaBrowserCompat$ItemReceiver();
                int MediaBrowserCompat$CustomActionResultReceiver = appBarLayout.MediaBrowserCompat$CustomActionResultReceiver();
                CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = ((CoordinatorLayout.read) appBarLayout.getLayoutParams()).MediaDescriptionCompat;
                if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver instanceof BaseBehavior) {
                    BaseBehavior baseBehavior = (BaseBehavior) coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
                    i = baseBehavior.read() + baseBehavior.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    i = 0;
                }
                if ((MediaBrowserCompat$CustomActionResultReceiver == 0 || MediaBrowserCompat$ItemReceiver + i > MediaBrowserCompat$CustomActionResultReceiver) && (i2 = MediaBrowserCompat$ItemReceiver - MediaBrowserCompat$CustomActionResultReceiver) != 0) {
                    return (((float) i) / ((float) i2)) + 1.0f;
                }
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        private static AppBarLayout read(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final int read(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).MediaBrowserCompat$ItemReceiver();
            }
            return super.read(view);
        }

        public final boolean MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = ((CoordinatorLayout.read) view2.getLayoutParams()).MediaDescriptionCompat;
            if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver instanceof BaseBehavior) {
                int bottom = view2.getBottom();
                int top = view.getTop();
                SwitchCompat.MediaBrowserCompat$ItemReceiver(view, (((bottom - top) + ((BaseBehavior) coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$CustomActionResultReceiver) + MediaBrowserCompat$ItemReceiver()) - MediaBrowserCompat$CustomActionResultReceiver(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.write) {
                    boolean z = view.getScrollY() > 0;
                    if (appBarLayout.MediaBrowserCompat$SearchResultReceiver != z) {
                        appBarLayout.MediaBrowserCompat$SearchResultReceiver = z;
                        appBarLayout.refreshDrawableState();
                    }
                }
            }
            return false;
        }
    }

    public final int IconCompatParcelizer() {
        setTextOff settextoff = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int read2 = settextoff != null ? settextoff.read() : 0;
        int MediaSessionCompat$ResultReceiverWrapper2 = SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(this);
        if (MediaSessionCompat$ResultReceiverWrapper2 == 0) {
            int childCount = getChildCount();
            if (childCount > 0) {
                i = SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(getChildAt(childCount - 1));
            }
            if (i == 0) {
                return getHeight() / 3;
            }
            MediaSessionCompat$ResultReceiverWrapper2 = i;
        }
        return (MediaSessionCompat$ResultReceiverWrapper2 << 1) + read2;
    }
}

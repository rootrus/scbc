package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.ActivityChooserView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver;
import p040o.AppCompatDelegateImpl$ListMenuDecorView;
import p040o.Keep$MediaBrowserCompat$ItemReceiver;
import p040o.SwitchCompat;
import p040o.nAllocationSetSurface;
import p040o.nAllocationSetSurface$MediaBrowserCompat$MediaItem;
import p040o.onActivityCreated;
import p040o.setBaselineAligned;
import p040o.setNavigationContentDescription;
import p040o.setOnCloseListener;
import p040o.setOnSuggestionListener;
import p040o.setThreshold;
import p040o.zzlz;

@ViewPager.read
public class TabLayout extends HorizontalScrollView {
    private static final setOnCloseListener.read<IconCompatParcelizer> ActionMenuItemView = new setOnCloseListener.write(16);
    public ColorStateList AlertController$RecycleListView;
    float AppCompatActivity;
    public final ArrayList<IconCompatParcelizer> AppCompatDelegateImpl$ListMenuDecorView;
    final RectF AppCompatDialogFragment;
    private int AppCompatViewInflater;
    private final int ExpandedMenuView;
    public final ArrayList<BaseOnTabSelectedListener> IconCompatParcelizer;
    int Keep;
    private int ListMenuItemView;
    public IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    final int MediaBrowserCompat$ItemReceiver;
    PorterDuff.Mode MediaBrowserCompat$MediaItem;
    int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    int f49x50fd9e4a;
    boolean MediaDescriptionCompat;
    ColorStateList MediaMetadataCompat;
    int MediaSessionCompat$QueueItem;
    int MediaSessionCompat$ResultReceiverWrapper;
    int MediaSessionCompat$Token;
    int ParcelableVolumeInfo;
    float PlaybackStateCompat;
    ColorStateList PlaybackStateCompat$CustomAction;
    int RatingCompat;
    int read;
    boolean setBackgroundResource;
    private read setCheckable;
    private BaseOnTabSelectedListener setChecked;
    ViewPager setContentView;
    private write setExpandedFormat;
    private boolean setForceShowIcon;
    private final SlidingTabIndicator setGroupDividerEnabled;
    Drawable setHasDecor;
    private final int setIcon;
    private onActivityCreated setItemInvoker;
    private final int setPadding;
    private DataSetObserver setPopupCallback;
    private ValueAnimator setShortcut;
    private BaseOnTabSelectedListener setTitle;
    private final setOnCloseListener.read<TabView> setVisibility;
    boolean write;

    public interface BaseOnTabSelectedListener<T extends IconCompatParcelizer> {
        void write(T t);
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nAllocationSetSurface.read.tabStyle);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0084, code lost:
        r2 = p040o.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(r12, (r2 = r13.getResourceId(r14, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r11.<init>(r12, r13, r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.AppCompatDelegateImpl$ListMenuDecorView = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r11.AppCompatDialogFragment = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11.MediaSessionCompat$QueueItem = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.IconCompatParcelizer = r0
            o.setOnCloseListener$MediaBrowserCompat$CustomActionResultReceiver r0 = new o.setOnCloseListener$MediaBrowserCompat$CustomActionResultReceiver
            r1 = 12
            r0.<init>(r1)
            r11.setVisibility = r0
            r0 = 0
            r11.setHorizontalScrollBarEnabled(r0)
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = new com.google.android.material.tabs.TabLayout$SlidingTabIndicator
            r1.<init>(r12)
            r11.setGroupDividerEnabled = r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r4, r3)
            super.addView(r1, r0, r2)
            int[] r7 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout
            int r9 = p040o.nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.Widget_Design_TabLayout
            r1 = 1
            int[] r10 = new int[r1]
            int r2 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabTextAppearance
            r10[r0] = r2
            r5 = r12
            r6 = r13
            r8 = r14
            android.content.res.TypedArray r13 = p040o.AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(r5, r6, r7, r8, r9, r10)
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r14 = r11.setGroupDividerEnabled
            int r2 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabIndicatorHeight
            int r2 = r13.getDimensionPixelSize(r2, r3)
            int r4 = r14.MediaBrowserCompat$ItemReceiver
            if (r4 == r2) goto L_0x005e
            r14.MediaBrowserCompat$ItemReceiver = r2
            p040o.SwitchCompat.setItemInvoker(r14)
        L_0x005e:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r14 = r11.setGroupDividerEnabled
            int r2 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabIndicatorColor
            int r2 = r13.getColor(r2, r0)
            android.graphics.Paint r4 = r14.write
            int r4 = r4.getColor()
            if (r4 == r2) goto L_0x0076
            android.graphics.Paint r4 = r14.write
            r4.setColor(r2)
            p040o.SwitchCompat.setItemInvoker(r14)
        L_0x0076:
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabIndicator
            boolean r2 = r13.hasValue(r14)
            if (r2 == 0) goto L_0x008b
            int r2 = r13.getResourceId(r14, r0)
            if (r2 == 0) goto L_0x008b
            android.graphics.drawable.Drawable r2 = p040o.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(r12, r2)
            if (r2 == 0) goto L_0x008b
            goto L_0x008f
        L_0x008b:
            android.graphics.drawable.Drawable r2 = r13.getDrawable(r14)
        L_0x008f:
            r11.setSelectedTabIndicator((android.graphics.drawable.Drawable) r2)
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabIndicatorGravity
            int r14 = r13.getInt(r14, r0)
            r11.setSelectedTabIndicatorGravity(r14)
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabIndicatorFullWidth
            boolean r14 = r13.getBoolean(r14, r1)
            r11.setTabIndicatorFullWidth(r14)
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabPadding
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f49x50fd9e4a = r14
            r11.MediaSessionCompat$Token = r14
            r11.MediaSessionCompat$ResultReceiverWrapper = r14
            r11.ParcelableVolumeInfo = r14
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabPaddingStart
            int r2 = r11.ParcelableVolumeInfo
            int r14 = r13.getDimensionPixelSize(r14, r2)
            r11.ParcelableVolumeInfo = r14
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabPaddingTop
            int r2 = r11.MediaSessionCompat$ResultReceiverWrapper
            int r14 = r13.getDimensionPixelSize(r14, r2)
            r11.MediaSessionCompat$ResultReceiverWrapper = r14
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabPaddingEnd
            int r2 = r11.MediaSessionCompat$Token
            int r14 = r13.getDimensionPixelSize(r14, r2)
            r11.MediaSessionCompat$Token = r14
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabPaddingBottom
            int r2 = r11.f49x50fd9e4a
            int r14 = r13.getDimensionPixelSize(r14, r2)
            r11.f49x50fd9e4a = r14
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabTextAppearance
            int r2 = p040o.nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.TextAppearance_Design_Tab
            int r14 = r13.getResourceId(r14, r2)
            r11.Keep = r14
            int[] r2 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance
            android.content.res.TypedArray r14 = r12.obtainStyledAttributes(r14, r2)
            int r2 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textSize     // Catch:{ all -> 0x01aa }
            int r2 = r14.getDimensionPixelSize(r2, r0)     // Catch:{ all -> 0x01aa }
            float r2 = (float) r2     // Catch:{ all -> 0x01aa }
            r11.AppCompatActivity = r2     // Catch:{ all -> 0x01aa }
            int r2 = p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColor     // Catch:{ all -> 0x01aa }
            android.content.res.ColorStateList r2 = p040o.AlertController$RecycleListView.IconCompatParcelizer((android.content.Context) r12, (android.content.res.TypedArray) r14, (int) r2)     // Catch:{ all -> 0x01aa }
            r11.AlertController$RecycleListView = r2     // Catch:{ all -> 0x01aa }
            r14.recycle()
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabTextColor
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto L_0x010e
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabTextColor
            android.content.res.ColorStateList r14 = p040o.AlertController$RecycleListView.IconCompatParcelizer((android.content.Context) r12, (android.content.res.TypedArray) r13, (int) r14)
            r11.AlertController$RecycleListView = r14
        L_0x010e:
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabSelectedTextColor
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto L_0x0128
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabSelectedTextColor
            int r14 = r13.getColor(r14, r0)
            android.content.res.ColorStateList r2 = r11.AlertController$RecycleListView
            int r2 = r2.getDefaultColor()
            android.content.res.ColorStateList r14 = write((int) r2, (int) r14)
            r11.AlertController$RecycleListView = r14
        L_0x0128:
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabIconTint
            android.content.res.ColorStateList r14 = p040o.AlertController$RecycleListView.IconCompatParcelizer((android.content.Context) r12, (android.content.res.TypedArray) r13, (int) r14)
            r11.MediaMetadataCompat = r14
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabIconTintMode
            int r14 = r13.getInt(r14, r3)
            android.graphics.PorterDuff$Mode r14 = p040o.Iterables.C35273.read.read((int) r14)
            r11.MediaBrowserCompat$MediaItem = r14
            int r14 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabRippleColor
            android.content.res.ColorStateList r12 = p040o.AlertController$RecycleListView.IconCompatParcelizer((android.content.Context) r12, (android.content.res.TypedArray) r13, (int) r14)
            r11.PlaybackStateCompat$CustomAction = r12
            int r12 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabIndicatorAnimationDuration
            r14 = 300(0x12c, float:4.2E-43)
            int r12 = r13.getInt(r12, r14)
            r11.ListMenuItemView = r12
            int r12 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabMinWidth
            int r12 = r13.getDimensionPixelSize(r12, r3)
            r11.setIcon = r12
            int r12 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabMaxWidth
            int r12 = r13.getDimensionPixelSize(r12, r3)
            r11.setPadding = r12
            int r12 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabBackground
            int r12 = r13.getResourceId(r12, r0)
            r11.MediaBrowserCompat$ItemReceiver = r12
            int r12 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabContentStart
            int r12 = r13.getDimensionPixelSize(r12, r0)
            r11.AppCompatViewInflater = r12
            int r12 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabMode
            int r12 = r13.getInt(r12, r1)
            r11.read = r12
            int r12 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabGravity
            int r12 = r13.getInt(r12, r0)
            r11.RatingCompat = r12
            int r12 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabInlineLabel
            boolean r12 = r13.getBoolean(r12, r0)
            r11.write = r12
            int r12 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.TabLayout_tabUnboundedRipple
            boolean r12 = r13.getBoolean(r12, r0)
            r11.setBackgroundResource = r12
            r13.recycle()
            android.content.res.Resources r12 = r11.getResources()
            int r13 = p040o.nAllocationSetSurface.IconCompatParcelizer.design_tab_text_size_2line
            int r13 = r12.getDimensionPixelSize(r13)
            float r13 = (float) r13
            r11.PlaybackStateCompat = r13
            int r13 = p040o.nAllocationSetSurface.IconCompatParcelizer.design_tab_scrollable_min_width
            int r12 = r12.getDimensionPixelSize(r13)
            r11.ExpandedMenuView = r12
            r11.MediaBrowserCompat$ItemReceiver()
            return
        L_0x01aa:
            r12 = move-exception
            r14.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSelectedTabIndicatorColor(int i) {
        SlidingTabIndicator slidingTabIndicator = this.setGroupDividerEnabled;
        if (slidingTabIndicator.write.getColor() != i) {
            slidingTabIndicator.write.setColor(i);
            SwitchCompat.setItemInvoker(slidingTabIndicator);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        SlidingTabIndicator slidingTabIndicator = this.setGroupDividerEnabled;
        if (slidingTabIndicator.MediaBrowserCompat$ItemReceiver != i) {
            slidingTabIndicator.MediaBrowserCompat$ItemReceiver = i;
            SwitchCompat.setItemInvoker(slidingTabIndicator);
        }
    }

    public void setScrollPosition(int i, float f, boolean z) {
        write(i, f, z, true);
    }

    /* access modifiers changed from: package-private */
    public final void write(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.setGroupDividerEnabled.getChildCount()) {
            if (z2) {
                this.setGroupDividerEnabled.MediaBrowserCompat$CustomActionResultReceiver(i, f);
            }
            ValueAnimator valueAnimator = this.setShortcut;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.setShortcut.cancel();
            }
            scrollTo(MediaBrowserCompat$CustomActionResultReceiver(i, f), 0);
            if (z) {
                read(round);
            }
        }
    }

    public final void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, this.AppCompatDelegateImpl$ListMenuDecorView.size(), this.AppCompatDelegateImpl$ListMenuDecorView.isEmpty());
    }

    private void MediaBrowserCompat$ItemReceiver(IconCompatParcelizer iconCompatParcelizer, int i, boolean z) {
        if (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver == this) {
            iconCompatParcelizer.read = i;
            this.AppCompatDelegateImpl$ListMenuDecorView.add(i, iconCompatParcelizer);
            int size = this.AppCompatDelegateImpl$ListMenuDecorView.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                }
                this.AppCompatDelegateImpl$ListMenuDecorView.get(i).read = i;
            }
            TabView tabView = iconCompatParcelizer.MediaDescriptionCompat;
            SlidingTabIndicator slidingTabIndicator = this.setGroupDividerEnabled;
            int i2 = iconCompatParcelizer.read;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            write(layoutParams);
            slidingTabIndicator.addView(tabView, i2, layoutParams);
            if (z) {
                TabLayout tabLayout = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                if (tabLayout != null) {
                    tabLayout.write(iconCompatParcelizer, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Deprecated
    public void setOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.setTitle;
        if (baseOnTabSelectedListener2 != null) {
            this.IconCompatParcelizer.remove(baseOnTabSelectedListener2);
        }
        this.setTitle = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            addOnTabSelectedListener(baseOnTabSelectedListener);
        }
    }

    public void addOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
        if (!this.IconCompatParcelizer.contains(baseOnTabSelectedListener)) {
            this.IconCompatParcelizer.add(baseOnTabSelectedListener);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        for (int childCount = this.setGroupDividerEnabled.getChildCount() - 1; childCount >= 0; childCount--) {
            MediaBrowserCompat$ItemReceiver(childCount);
        }
        Iterator<IconCompatParcelizer> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            IconCompatParcelizer next = it.next();
            it.remove();
            next.MediaBrowserCompat$CustomActionResultReceiver();
            ActionMenuItemView.MediaBrowserCompat$CustomActionResultReceiver(next);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public void setTabMode(int i) {
        if (i != this.read) {
            this.read = i;
            MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setTabGravity(int i) {
        if (this.RatingCompat != i) {
            this.RatingCompat = i;
            MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.MediaBrowserCompat$SearchResultReceiver != i) {
            this.MediaBrowserCompat$SearchResultReceiver = i;
            SwitchCompat.setItemInvoker(this.setGroupDividerEnabled);
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.MediaDescriptionCompat = z;
        SwitchCompat.setItemInvoker(this.setGroupDividerEnabled);
    }

    public void setInlineLabel(boolean z) {
        if (this.write != z) {
            this.write = z;
            for (int i = 0; i < this.setGroupDividerEnabled.getChildCount(); i++) {
                View childAt = this.setGroupDividerEnabled.getChildAt(i);
                if (childAt instanceof TabView) {
                    TabView tabView = (TabView) childAt;
                    tabView.setOrientation(TabLayout.this.write ^ true ? 1 : 0);
                    if (tabView.IconCompatParcelizer == null && tabView.read == null) {
                        tabView.IconCompatParcelizer(tabView.MediaBrowserCompat$SearchResultReceiver, tabView.MediaBrowserCompat$CustomActionResultReceiver);
                    } else {
                        tabView.IconCompatParcelizer(tabView.IconCompatParcelizer, tabView.read);
                    }
                }
            }
            MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setUnboundedRipple(boolean z) {
        if (this.setBackgroundResource != z) {
            this.setBackgroundResource = z;
            for (int i = 0; i < this.setGroupDividerEnabled.getChildCount(); i++) {
                View childAt = this.setGroupDividerEnabled.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).MediaBrowserCompat$ItemReceiver(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.AlertController$RecycleListView != colorStateList) {
            this.AlertController$RecycleListView = colorStateList;
            read();
        }
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(write(i, i2));
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.MediaMetadataCompat != colorStateList) {
            this.MediaMetadataCompat = colorStateList;
            read();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver(getContext(), i));
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.PlaybackStateCompat$CustomAction != colorStateList) {
            this.PlaybackStateCompat$CustomAction = colorStateList;
            for (int i = 0; i < this.setGroupDividerEnabled.getChildCount(); i++) {
                View childAt = this.setGroupDividerEnabled.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).MediaBrowserCompat$ItemReceiver(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver(getContext(), i));
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.setHasDecor != drawable) {
            this.setHasDecor = drawable;
            SwitchCompat.setItemInvoker(this.setGroupDividerEnabled);
        }
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        write(viewPager, z, false);
    }

    private void write(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.setContentView;
        if (viewPager2 != null) {
            write write2 = this.setExpandedFormat;
            if (write2 != null) {
                viewPager2.removeOnPageChangeListener(write2);
            }
            read read2 = this.setCheckable;
            if (read2 != null) {
                this.setContentView.removeOnAdapterChangeListener(read2);
            }
        }
        BaseOnTabSelectedListener baseOnTabSelectedListener = this.setChecked;
        if (baseOnTabSelectedListener != null) {
            this.IconCompatParcelizer.remove(baseOnTabSelectedListener);
            this.setChecked = null;
        }
        if (viewPager != null) {
            this.setContentView = viewPager;
            if (this.setExpandedFormat == null) {
                this.setExpandedFormat = new write(this);
            }
            write write3 = this.setExpandedFormat;
            write3.IconCompatParcelizer = 0;
            write3.read = 0;
            viewPager.addOnPageChangeListener(this.setExpandedFormat);
            TabLayout$MediaBrowserCompat$MediaItem tabLayout$MediaBrowserCompat$MediaItem = new TabLayout$MediaBrowserCompat$MediaItem(viewPager);
            this.setChecked = tabLayout$MediaBrowserCompat$MediaItem;
            addOnTabSelectedListener(tabLayout$MediaBrowserCompat$MediaItem);
            onActivityCreated adapter = viewPager.getAdapter();
            if (adapter != null) {
                read(adapter, z);
            }
            if (this.setCheckable == null) {
                this.setCheckable = new read();
            }
            this.setCheckable.MediaBrowserCompat$CustomActionResultReceiver = z;
            viewPager.addOnAdapterChangeListener(this.setCheckable);
            setScrollPosition(viewPager.getCurrentItem(), BitmapDescriptorFactory.HUE_RED, true);
        } else {
            this.setContentView = null;
            read((onActivityCreated) null, false);
        }
        this.setForceShowIcon = z2;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(onActivityCreated onactivitycreated) {
        read(onactivitycreated, false);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.setContentView == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                write((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setForceShowIcon) {
            setupWithViewPager((ViewPager) null);
            this.setForceShowIcon = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(onActivityCreated onactivitycreated, boolean z) {
        DataSetObserver dataSetObserver;
        onActivityCreated onactivitycreated2 = this.setItemInvoker;
        if (!(onactivitycreated2 == null || (dataSetObserver = this.setPopupCallback) == null)) {
            onactivitycreated2.unregisterDataSetObserver(dataSetObserver);
        }
        this.setItemInvoker = onactivitycreated;
        if (z && onactivitycreated != null) {
            if (this.setPopupCallback == null) {
                this.setPopupCallback = new TabLayout$MediaBrowserCompat$CustomActionResultReceiver(this);
            }
            onactivitycreated.registerDataSetObserver(this.setPopupCallback);
        }
        IconCompatParcelizer();
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer() {
        int i;
        MediaBrowserCompat$CustomActionResultReceiver();
        onActivityCreated onactivitycreated = this.setItemInvoker;
        if (onactivitycreated != null) {
            int count = onactivitycreated.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                MediaBrowserCompat$ItemReceiver(write().read(this.setItemInvoker.getPageTitle(i2)), this.AppCompatDelegateImpl$ListMenuDecorView.size(), false);
            }
            ViewPager viewPager = this.setContentView;
            if (viewPager != null && count > 0) {
                int currentItem = viewPager.getCurrentItem();
                IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (iconCompatParcelizer != null) {
                    i = iconCompatParcelizer.read;
                } else {
                    i = -1;
                }
                if (currentItem != i && currentItem < this.AppCompatDelegateImpl$ListMenuDecorView.size()) {
                    write(IconCompatParcelizer(currentItem), true);
                }
            }
        }
    }

    private void read() {
        int size = this.AppCompatDelegateImpl$ListMenuDecorView.size();
        for (int i = 0; i < size; i++) {
            TabView tabView = this.AppCompatDelegateImpl$ListMenuDecorView.get(i).MediaDescriptionCompat;
            if (tabView != null) {
                tabView.MediaBrowserCompat$ItemReceiver();
            }
        }
    }

    private TabView MediaBrowserCompat$ItemReceiver(IconCompatParcelizer iconCompatParcelizer) {
        setOnCloseListener.read<TabView> read2 = this.setVisibility;
        TabView read3 = read2 != null ? read2.read() : null;
        if (read3 == null) {
            read3 = new TabView(getContext());
        }
        if (iconCompatParcelizer != read3.MediaBrowserCompat$MediaItem) {
            read3.MediaBrowserCompat$MediaItem = iconCompatParcelizer;
            read3.MediaBrowserCompat$ItemReceiver();
        }
        read3.setFocusable(true);
        int i = this.setIcon;
        if (i == -1) {
            i = this.read == 0 ? this.ExpandedMenuView : 0;
        }
        read3.setMinimumWidth(i);
        if (TextUtils.isEmpty(iconCompatParcelizer.write)) {
            read3.setContentDescription(iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
        } else {
            read3.setContentDescription(iconCompatParcelizer.write);
        }
        return read3;
    }

    public void addView(View view) {
        write(view);
    }

    public void addView(View view, int i) {
        write(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        write(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        write(view);
    }

    private void write(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            IconCompatParcelizer read2 = ActionMenuItemView.read();
            if (read2 == null) {
                read2 = new IconCompatParcelizer();
            }
            read2.MediaBrowserCompat$ItemReceiver = this;
            read2.MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver(read2);
            if (tabItem.write != null) {
                read2.read(tabItem.write);
            }
            if (tabItem.read != null) {
                read2.MediaBrowserCompat$CustomActionResultReceiver = tabItem.read;
                TabView tabView = read2.MediaDescriptionCompat;
                if (tabView != null) {
                    tabView.MediaBrowserCompat$ItemReceiver();
                }
            }
            if (tabItem.IconCompatParcelizer != 0) {
                read2.IconCompatParcelizer = LayoutInflater.from(read2.MediaDescriptionCompat.getContext()).inflate(tabItem.IconCompatParcelizer, read2.MediaDescriptionCompat, false);
                TabView tabView2 = read2.MediaDescriptionCompat;
                if (tabView2 != null) {
                    tabView2.MediaBrowserCompat$ItemReceiver();
                }
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                read2.write = tabItem.getContentDescription();
                TabView tabView3 = read2.MediaDescriptionCompat;
                if (tabView3 != null) {
                    tabView3.MediaBrowserCompat$ItemReceiver();
                }
            }
            MediaBrowserCompat$ItemReceiver(read2, this.AppCompatDelegateImpl$ListMenuDecorView.size(), this.AppCompatDelegateImpl$ListMenuDecorView.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void write(LinearLayout.LayoutParams layoutParams) {
        if (this.read == 1 && this.RatingCompat == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = (com.google.android.material.tabs.TabLayout.TabView) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r7.setGroupDividerEnabled
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L_0x0034
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r7.setGroupDividerEnabled
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r2 == 0) goto L_0x0031
            com.google.android.material.tabs.TabLayout$TabView r1 = (com.google.android.material.tabs.TabLayout.TabView) r1
            android.graphics.drawable.Drawable r2 = r1.write
            if (r2 == 0) goto L_0x0031
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.write
            r1.draw(r8)
        L_0x0031:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0034:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    private void MediaBrowserCompat$ItemReceiver(int i) {
        TabView tabView = (TabView) this.setGroupDividerEnabled.getChildAt(i);
        this.setGroupDividerEnabled.removeViewAt(i);
        if (tabView != null) {
            if (tabView.MediaBrowserCompat$MediaItem != null) {
                tabView.MediaBrowserCompat$MediaItem = null;
                tabView.MediaBrowserCompat$ItemReceiver();
            }
            tabView.setSelected(false);
            this.setVisibility.MediaBrowserCompat$CustomActionResultReceiver(tabView);
        }
        requestLayout();
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null && SwitchCompat.setCheckable(this)) {
                SlidingTabIndicator slidingTabIndicator = this.setGroupDividerEnabled;
                int childCount = slidingTabIndicator.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    } else if (slidingTabIndicator.getChildAt(i2).getWidth() <= 0) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(i, BitmapDescriptorFactory.HUE_RED);
                    if (scrollX != MediaBrowserCompat$CustomActionResultReceiver2) {
                        if (this.setShortcut == null) {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            this.setShortcut = valueAnimator;
                            valueAnimator.setInterpolator(zzlz.read);
                            this.setShortcut.setDuration((long) this.ListMenuItemView);
                            this.setShortcut.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                                }
                            });
                        }
                        this.setShortcut.setIntValues(new int[]{scrollX, MediaBrowserCompat$CustomActionResultReceiver2});
                        this.setShortcut.start();
                    }
                    this.setGroupDividerEnabled.write(i, this.ListMenuItemView);
                    return;
                }
            }
            setScrollPosition(i, BitmapDescriptorFactory.HUE_RED, true);
        }
    }

    private void read(int i) {
        int childCount = this.setGroupDividerEnabled.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.setGroupDividerEnabled.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public final void write(IconCompatParcelizer iconCompatParcelizer, boolean z) {
        int i;
        IconCompatParcelizer iconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (iconCompatParcelizer2 != iconCompatParcelizer) {
            if (iconCompatParcelizer != null) {
                i = iconCompatParcelizer.read;
            } else {
                i = -1;
            }
            if (z) {
                if ((iconCompatParcelizer2 == null || iconCompatParcelizer2.read == -1) && i != -1) {
                    setScrollPosition(i, BitmapDescriptorFactory.HUE_RED, true);
                } else {
                    MediaBrowserCompat$CustomActionResultReceiver(i);
                }
                if (i != -1) {
                    read(i);
                }
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
            if (iconCompatParcelizer2 != null) {
                for (int size = this.IconCompatParcelizer.size() - 1; size >= 0; size--) {
                    this.IconCompatParcelizer.get(size);
                }
            }
            if (iconCompatParcelizer != null) {
                read(iconCompatParcelizer);
            }
        } else if (iconCompatParcelizer2 != null) {
            for (int size2 = this.IconCompatParcelizer.size() - 1; size2 >= 0; size2--) {
                this.IconCompatParcelizer.get(size2);
            }
            MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer.read);
        }
    }

    private void read(IconCompatParcelizer iconCompatParcelizer) {
        for (int size = this.IconCompatParcelizer.size() - 1; size >= 0; size--) {
            this.IconCompatParcelizer.get(size).write(iconCompatParcelizer);
        }
    }

    private int MediaBrowserCompat$CustomActionResultReceiver(int i, float f) {
        int i2 = 0;
        if (this.read != 0) {
            return 0;
        }
        View childAt = this.setGroupDividerEnabled.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.setGroupDividerEnabled.getChildCount() ? this.setGroupDividerEnabled.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) (((float) (width + i2)) * 0.5f * f);
        return SwitchCompat.m3079x50fd9e4a(this) == 0 ? left + i4 : left - i4;
    }

    private void MediaBrowserCompat$ItemReceiver() {
        SwitchCompat.MediaBrowserCompat$ItemReceiver(this.setGroupDividerEnabled, this.read == 0 ? Math.max(0, this.AppCompatViewInflater - this.ParcelableVolumeInfo) : 0, 0, 0, 0);
        int i = this.read;
        if (i == 0) {
            this.setGroupDividerEnabled.setGravity(8388611);
        } else if (i == 1) {
            this.setGroupDividerEnabled.setGravity(1);
        }
        write(true);
    }

    /* access modifiers changed from: package-private */
    public final void write(boolean z) {
        for (int i = 0; i < this.setGroupDividerEnabled.getChildCount(); i++) {
            View childAt = this.setGroupDividerEnabled.getChildAt(i);
            int i2 = this.setIcon;
            if (i2 == -1) {
                i2 = this.read == 0 ? this.ExpandedMenuView : 0;
            }
            childAt.setMinimumWidth(i2);
            write((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public static class IconCompatParcelizer {
        public View IconCompatParcelizer;
        Drawable MediaBrowserCompat$CustomActionResultReceiver;
        public TabLayout MediaBrowserCompat$ItemReceiver;
        public CharSequence MediaBrowserCompat$SearchResultReceiver;
        public TabView MediaDescriptionCompat;
        public int read = -1;
        CharSequence write;

        public final IconCompatParcelizer read(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.write) && !TextUtils.isEmpty(charSequence)) {
                this.MediaDescriptionCompat.setContentDescription(charSequence);
            }
            this.MediaBrowserCompat$SearchResultReceiver = charSequence;
            TabView tabView = this.MediaDescriptionCompat;
            if (tabView != null) {
                tabView.MediaBrowserCompat$ItemReceiver();
            }
            return this;
        }

        public final void IconCompatParcelizer() {
            TabLayout tabLayout = this.MediaBrowserCompat$ItemReceiver;
            if (tabLayout != null) {
                tabLayout.write(this, true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public final boolean write() {
            int i;
            TabLayout tabLayout = this.MediaBrowserCompat$ItemReceiver;
            if (tabLayout != null) {
                IconCompatParcelizer iconCompatParcelizer = tabLayout.MediaBrowserCompat$CustomActionResultReceiver;
                if (iconCompatParcelizer != null) {
                    i = iconCompatParcelizer.read;
                } else {
                    i = -1;
                }
                return i == this.read;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaDescriptionCompat = null;
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.write = null;
            this.read = -1;
            this.IconCompatParcelizer = null;
        }
    }

    public class TabView extends LinearLayout {
        TextView IconCompatParcelizer;
        ImageView MediaBrowserCompat$CustomActionResultReceiver;
        View MediaBrowserCompat$ItemReceiver;
        IconCompatParcelizer MediaBrowserCompat$MediaItem;
        TextView MediaBrowserCompat$SearchResultReceiver;
        private int MediaMetadataCompat = 2;
        ImageView read;
        Drawable write;

        public TabView(Context context) {
            super(context);
            MediaBrowserCompat$ItemReceiver(context);
            SwitchCompat.MediaBrowserCompat$ItemReceiver(this, TabLayout.this.ParcelableVolumeInfo, TabLayout.this.MediaSessionCompat$ResultReceiverWrapper, TabLayout.this.MediaSessionCompat$Token, TabLayout.this.f49x50fd9e4a);
            setGravity(17);
            setOrientation(TabLayout.this.write ^ true ? 1 : 0);
            setClickable(true);
            SwitchCompat.write((View) this, setThreshold.read(getContext(), 1002));
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver(Context context) {
            GradientDrawable gradientDrawable = null;
            if (TabLayout.this.MediaBrowserCompat$ItemReceiver != 0) {
                Drawable MediaBrowserCompat$ItemReceiver2 = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(context, TabLayout.this.MediaBrowserCompat$ItemReceiver);
                this.write = MediaBrowserCompat$ItemReceiver2;
                if (MediaBrowserCompat$ItemReceiver2 != null && MediaBrowserCompat$ItemReceiver2.isStateful()) {
                    this.write.setState(getDrawableState());
                }
            } else {
                this.write = null;
            }
            Drawable gradientDrawable2 = new GradientDrawable();
            ((GradientDrawable) gradientDrawable2).setColor(0);
            if (TabLayout.this.PlaybackStateCompat$CustomAction != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList MediaBrowserCompat$ItemReceiver3 = AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(TabLayout.this.PlaybackStateCompat$CustomAction);
                if (Build.VERSION.SDK_INT >= 21) {
                    if (TabLayout.this.setBackgroundResource) {
                        gradientDrawable2 = null;
                    }
                    if (!TabLayout.this.setBackgroundResource) {
                        gradientDrawable = gradientDrawable3;
                    }
                    gradientDrawable2 = new RippleDrawable(MediaBrowserCompat$ItemReceiver3, gradientDrawable2, gradientDrawable);
                } else {
                    Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(gradientDrawable3);
                    setBaselineAligned.read(MediaBrowserCompat$MediaItem2, MediaBrowserCompat$ItemReceiver3);
                    gradientDrawable2 = new LayerDrawable(new Drawable[]{gradientDrawable2, MediaBrowserCompat$MediaItem2});
                }
            }
            SwitchCompat.IconCompatParcelizer((View) this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.write;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.write.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.MediaBrowserCompat$MediaItem == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$MediaItem;
            TabLayout tabLayout = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (tabLayout != null) {
                tabLayout.write(iconCompatParcelizer, true);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.MediaBrowserCompat$SearchResultReceiver;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.MediaBrowserCompat$ItemReceiver;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(Keep$MediaBrowserCompat$ItemReceiver.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Keep$MediaBrowserCompat$ItemReceiver.class.getName());
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int i3 = TabLayout.this.MediaSessionCompat$QueueItem;
            if (i3 > 0 && (mode == 0 || size > i3)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.MediaSessionCompat$QueueItem, PKIFailureInfo.systemUnavail);
            }
            super.onMeasure(i, i2);
            if (this.MediaBrowserCompat$SearchResultReceiver != null) {
                float f = TabLayout.this.AppCompatActivity;
                int i4 = this.MediaMetadataCompat;
                ImageView imageView = this.MediaBrowserCompat$CustomActionResultReceiver;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.MediaBrowserCompat$SearchResultReceiver;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.PlaybackStateCompat;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.MediaBrowserCompat$SearchResultReceiver.getTextSize();
                int lineCount = this.MediaBrowserCompat$SearchResultReceiver.getLineCount();
                int MediaBrowserCompat$CustomActionResultReceiver2 = setNavigationContentDescription.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver);
                int i5 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i5 != 0 || (MediaBrowserCompat$CustomActionResultReceiver2 >= 0 && i4 != MediaBrowserCompat$CustomActionResultReceiver2)) {
                    if (TabLayout.this.read == 1 && i5 > 0 && lineCount == 1 && ((layout = this.MediaBrowserCompat$SearchResultReceiver.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.MediaBrowserCompat$SearchResultReceiver.setTextSize(0, f);
                        this.MediaBrowserCompat$SearchResultReceiver.setMaxLines(i4);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            View view;
            IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$MediaItem;
            Drawable drawable = null;
            if (iconCompatParcelizer != null) {
                view = iconCompatParcelizer.IconCompatParcelizer;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.MediaBrowserCompat$ItemReceiver = view;
                TextView textView = this.MediaBrowserCompat$SearchResultReceiver;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.MediaBrowserCompat$CustomActionResultReceiver.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.IconCompatParcelizer = textView2;
                if (textView2 != null) {
                    this.MediaMetadataCompat = setNavigationContentDescription.MediaBrowserCompat$CustomActionResultReceiver(textView2);
                }
                this.read = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.MediaBrowserCompat$ItemReceiver;
                if (view2 != null) {
                    removeView(view2);
                    this.MediaBrowserCompat$ItemReceiver = null;
                }
                this.IconCompatParcelizer = null;
                this.read = null;
            }
            boolean z = false;
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(nAllocationSetSurface$MediaBrowserCompat$MediaItem.design_layout_tab_icon, this, false);
                    addView(imageView2, 0);
                    this.MediaBrowserCompat$CustomActionResultReceiver = imageView2;
                }
                if (!(iconCompatParcelizer == null || iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver == null)) {
                    drawable = setBaselineAligned.MediaBrowserCompat$MediaItem(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver).mutate();
                }
                if (drawable != null) {
                    setBaselineAligned.read(drawable, TabLayout.this.MediaMetadataCompat);
                    if (TabLayout.this.MediaBrowserCompat$MediaItem != null) {
                        setBaselineAligned.IconCompatParcelizer(drawable, TabLayout.this.MediaBrowserCompat$MediaItem);
                    }
                }
                if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(nAllocationSetSurface$MediaBrowserCompat$MediaItem.design_layout_tab_text, this, false);
                    addView(textView3);
                    this.MediaBrowserCompat$SearchResultReceiver = textView3;
                    this.MediaMetadataCompat = setNavigationContentDescription.MediaBrowserCompat$CustomActionResultReceiver(textView3);
                }
                setNavigationContentDescription.read(this.MediaBrowserCompat$SearchResultReceiver, TabLayout.this.Keep);
                if (TabLayout.this.AlertController$RecycleListView != null) {
                    this.MediaBrowserCompat$SearchResultReceiver.setTextColor(TabLayout.this.AlertController$RecycleListView);
                }
                IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$CustomActionResultReceiver);
            } else if (!(this.IconCompatParcelizer == null && this.read == null)) {
                IconCompatParcelizer(this.IconCompatParcelizer, this.read);
            }
            if (iconCompatParcelizer != null && !TextUtils.isEmpty(iconCompatParcelizer.write)) {
                setContentDescription(iconCompatParcelizer.write);
            }
            if (iconCompatParcelizer != null && iconCompatParcelizer.write()) {
                z = true;
            }
            setSelected(z);
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer(TextView textView, ImageView imageView) {
            CharSequence charSequence;
            CharSequence charSequence2;
            IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$MediaItem;
            CharSequence charSequence3 = null;
            Drawable mutate = (iconCompatParcelizer == null || iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver == null) ? null : setBaselineAligned.MediaBrowserCompat$MediaItem(this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver).mutate();
            IconCompatParcelizer iconCompatParcelizer2 = this.MediaBrowserCompat$MediaItem;
            if (iconCompatParcelizer2 != null) {
                charSequence = iconCompatParcelizer2.MediaBrowserCompat$SearchResultReceiver;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int round = (!z || imageView.getVisibility() != 0) ? 0 : Math.round(TabLayout.this.getResources().getDisplayMetrics().density * 8.0f);
                if (TabLayout.this.write) {
                    if (round != setOnSuggestionListener.MediaBrowserCompat$CustomActionResultReceiver(marginLayoutParams)) {
                        setOnSuggestionListener.MediaBrowserCompat$CustomActionResultReceiver(marginLayoutParams, round);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (round != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = round;
                    setOnSuggestionListener.MediaBrowserCompat$CustomActionResultReceiver(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            IconCompatParcelizer iconCompatParcelizer3 = this.MediaBrowserCompat$MediaItem;
            if (iconCompatParcelizer3 != null) {
                charSequence2 = iconCompatParcelizer3.write;
            } else {
                charSequence2 = null;
            }
            if (!z) {
                charSequence3 = charSequence2;
            }
            ActivityChooserView.MediaBrowserCompat$ItemReceiver(this, charSequence3);
        }
    }

    class SlidingTabIndicator extends LinearLayout {
        int IconCompatParcelizer = -1;
        int MediaBrowserCompat$CustomActionResultReceiver = -1;
        int MediaBrowserCompat$ItemReceiver;
        private int MediaBrowserCompat$SearchResultReceiver = -1;
        private ValueAnimator MediaDescriptionCompat;
        float MediaMetadataCompat;
        private final GradientDrawable RatingCompat;
        int read = -1;
        final Paint write;

        SlidingTabIndicator(Context context) {
            super(context);
            setWillNotDraw(false);
            this.write = new Paint();
            this.RatingCompat = new GradientDrawable();
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(int i, float f) {
            ValueAnimator valueAnimator = this.MediaDescriptionCompat;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.MediaDescriptionCompat.cancel();
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.MediaMetadataCompat = f;
            MediaBrowserCompat$CustomActionResultReceiver();
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.MediaBrowserCompat$SearchResultReceiver != i) {
                requestLayout();
                this.MediaBrowserCompat$SearchResultReceiver = i;
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                boolean z = true;
                if (TabLayout.this.read == 1 && TabLayout.this.RatingCompat == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (Math.round(TabLayout.this.getResources().getDisplayMetrics().density * 16.0f) << 1)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != BitmapDescriptorFactory.HUE_RED) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout.this.RatingCompat = 0;
                            TabLayout.this.write(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.MediaDescriptionCompat;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                MediaBrowserCompat$CustomActionResultReceiver();
                return;
            }
            this.MediaDescriptionCompat.cancel();
            write(this.MediaBrowserCompat$CustomActionResultReceiver, Math.round((1.0f - this.MediaDescriptionCompat.getAnimatedFraction()) * ((float) this.MediaDescriptionCompat.getDuration())));
        }

        private void MediaBrowserCompat$CustomActionResultReceiver() {
            int i;
            View childAt = getChildAt(this.MediaBrowserCompat$CustomActionResultReceiver);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                i2 = childAt.getLeft();
                int right = childAt.getRight();
                if (!TabLayout.this.MediaDescriptionCompat && (childAt instanceof TabView)) {
                    write((TabView) childAt, TabLayout.this.AppCompatDialogFragment);
                    right = (int) TabLayout.this.AppCompatDialogFragment.right;
                    i2 = (int) TabLayout.this.AppCompatDialogFragment.left;
                }
                if (this.MediaMetadataCompat <= BitmapDescriptorFactory.HUE_RED || this.MediaBrowserCompat$CustomActionResultReceiver >= getChildCount() - 1) {
                    i = right;
                } else {
                    View childAt2 = getChildAt(this.MediaBrowserCompat$CustomActionResultReceiver + 1);
                    int left = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    if (!TabLayout.this.MediaDescriptionCompat && (childAt2 instanceof TabView)) {
                        write((TabView) childAt2, TabLayout.this.AppCompatDialogFragment);
                        left = (int) TabLayout.this.AppCompatDialogFragment.left;
                        right2 = (int) TabLayout.this.AppCompatDialogFragment.right;
                    }
                    float f = this.MediaMetadataCompat;
                    float f2 = 1.0f - f;
                    i2 = (int) ((((float) left) * f) + (((float) i2) * f2));
                    i = (int) ((((float) right2) * f) + (f2 * ((float) right)));
                }
            }
            if (i2 != this.IconCompatParcelizer || i != this.read) {
                this.IconCompatParcelizer = i2;
                this.read = i;
                SwitchCompat.setItemInvoker(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void write(final int i, int i2) {
            ValueAnimator valueAnimator = this.MediaDescriptionCompat;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.MediaDescriptionCompat.cancel();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                MediaBrowserCompat$CustomActionResultReceiver();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (!TabLayout.this.MediaDescriptionCompat && (childAt instanceof TabView)) {
                write((TabView) childAt, TabLayout.this.AppCompatDialogFragment);
                left = (int) TabLayout.this.AppCompatDialogFragment.left;
                right = (int) TabLayout.this.AppCompatDialogFragment.right;
            }
            final int i3 = left;
            final int i4 = right;
            final int i5 = this.IconCompatParcelizer;
            final int i6 = this.read;
            if (i5 != i3 || i6 != i4) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.MediaDescriptionCompat = valueAnimator2;
                valueAnimator2.setInterpolator(zzlz.read);
                valueAnimator2.setDuration((long) i2);
                valueAnimator2.setFloatValues(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
                valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        SlidingTabIndicator slidingTabIndicator = SlidingTabIndicator.this;
                        int i = i5;
                        int round = i + Math.round(((float) (i3 - i)) * animatedFraction);
                        int i2 = i6;
                        int round2 = i2 + Math.round(animatedFraction * ((float) (i4 - i2)));
                        if (round != slidingTabIndicator.IconCompatParcelizer || round2 != slidingTabIndicator.read) {
                            slidingTabIndicator.IconCompatParcelizer = round;
                            slidingTabIndicator.read = round2;
                            SwitchCompat.setItemInvoker(slidingTabIndicator);
                        }
                    }
                });
                valueAnimator2.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        SlidingTabIndicator.this.MediaBrowserCompat$CustomActionResultReceiver = i;
                        SlidingTabIndicator.this.MediaMetadataCompat = BitmapDescriptorFactory.HUE_RED;
                    }
                });
                valueAnimator2.start();
            }
        }

        public void draw(Canvas canvas) {
            int i = 0;
            int intrinsicHeight = TabLayout.this.setHasDecor != null ? TabLayout.this.setHasDecor.getIntrinsicHeight() : 0;
            int i2 = this.MediaBrowserCompat$ItemReceiver;
            if (i2 >= 0) {
                intrinsicHeight = i2;
            }
            int i3 = TabLayout.this.MediaBrowserCompat$SearchResultReceiver;
            if (i3 == 0) {
                i = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i3 == 1) {
                i = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i3 != 2) {
                intrinsicHeight = i3 != 3 ? 0 : getHeight();
            }
            int i4 = this.IconCompatParcelizer;
            if (i4 >= 0 && this.read > i4) {
                Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(TabLayout.this.setHasDecor != null ? TabLayout.this.setHasDecor : this.RatingCompat);
                MediaBrowserCompat$MediaItem2.setBounds(this.IconCompatParcelizer, i, this.read, intrinsicHeight);
                if (this.write != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        MediaBrowserCompat$MediaItem2.setColorFilter(this.write.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem2, this.write.getColor());
                    }
                }
                MediaBrowserCompat$MediaItem2.draw(canvas);
            }
            super.draw(canvas);
        }

        private void write(TabView tabView, RectF rectF) {
            View[] viewArr = {tabView.MediaBrowserCompat$SearchResultReceiver, tabView.MediaBrowserCompat$CustomActionResultReceiver, tabView.MediaBrowserCompat$ItemReceiver};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            int i4 = i - i2;
            if (i4 < Math.round(TabLayout.this.getResources().getDisplayMetrics().density * 24.0f)) {
                i4 = Math.round(TabLayout.this.getResources().getDisplayMetrics().density * 24.0f);
            }
            int left = (tabView.getLeft() + tabView.getRight()) / 2;
            int i5 = i4 / 2;
            rectF.set((float) (left - i5), BitmapDescriptorFactory.HUE_RED, (float) (left + i5), BitmapDescriptorFactory.HUE_RED);
        }
    }

    private static ColorStateList write(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public static class write implements ViewPager.MediaMetadataCompat {
        int IconCompatParcelizer;
        int read;
        private final WeakReference<TabLayout> write;

        public write(TabLayout tabLayout) {
            this.write = new WeakReference<>(tabLayout);
        }

        public final void onPageScrollStateChanged(int i) {
            this.read = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.write.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.IconCompatParcelizer != 2 || this.read == 1;
                if (!(this.IconCompatParcelizer == 2 && this.read == 0)) {
                    z = true;
                }
                tabLayout.write(i, f, z2, z);
            }
        }

        public final void onPageSelected(int i) {
            int i2;
            TabLayout tabLayout = this.write.get();
            if (tabLayout != null) {
                IconCompatParcelizer iconCompatParcelizer = tabLayout.MediaBrowserCompat$CustomActionResultReceiver;
                if (iconCompatParcelizer != null) {
                    i2 = iconCompatParcelizer.read;
                } else {
                    i2 = -1;
                }
                if (i2 != i && i < tabLayout.AppCompatDelegateImpl$ListMenuDecorView.size()) {
                    int i3 = this.IconCompatParcelizer;
                    tabLayout.write(tabLayout.IconCompatParcelizer(i), i3 == 0 || (i3 == 2 && this.read == 0));
                }
            }
        }
    }

    class read implements ViewPager.IconCompatParcelizer {
        boolean MediaBrowserCompat$CustomActionResultReceiver;

        read() {
        }

        public final void read(ViewPager viewPager, onActivityCreated onactivitycreated, onActivityCreated onactivitycreated2) {
            if (TabLayout.this.setContentView == viewPager) {
                TabLayout.this.read(onactivitycreated2, this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }

    public final IconCompatParcelizer IconCompatParcelizer(int i) {
        if (i < 0 || i >= this.AppCompatDelegateImpl$ListMenuDecorView.size()) {
            return null;
        }
        return this.AppCompatDelegateImpl$ListMenuDecorView.get(i);
    }

    public final IconCompatParcelizer write() {
        IconCompatParcelizer read2 = ActionMenuItemView.read();
        if (read2 == null) {
            read2 = new IconCompatParcelizer();
        }
        read2.MediaBrowserCompat$ItemReceiver = this;
        read2.MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver(read2);
        return read2;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int size = this.AppCompatDelegateImpl$ListMenuDecorView.size();
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z = false;
                break;
            }
            IconCompatParcelizer iconCompatParcelizer = this.AppCompatDelegateImpl$ListMenuDecorView.get(i3);
            if (iconCompatParcelizer != null && iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver != null && !TextUtils.isEmpty(iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver)) {
                z = true;
                break;
            }
            i3++;
        }
        int round = Math.round(getResources().getDisplayMetrics().density * ((float) ((!z || this.write) ? 48 : 72))) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(round, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
        }
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i4 = this.setPadding;
            if (i4 <= 0) {
                i4 = size2 - Math.round(getResources().getDisplayMetrics().density * 56.0f);
            }
            this.MediaSessionCompat$QueueItem = i4;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.read;
            if (i5 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : i5 == 1 && childAt.getMeasuredWidth() != getMeasuredWidth()) {
                z2 = true;
            }
            if (z2) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        int width = this.setGroupDividerEnabled.getWidth();
        int width2 = getWidth();
        if (Math.max(0, ((width - width2) - getPaddingLeft()) - getPaddingRight()) > 0) {
            return true;
        }
        return false;
    }
}

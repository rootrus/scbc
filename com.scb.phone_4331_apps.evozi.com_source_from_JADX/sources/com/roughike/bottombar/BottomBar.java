package com.roughike.bottombar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.roughike.bottombar.BottomBarTab;
import java.util.List;
import p040o.Barcode$PersonName$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.FragmentBuilder_BindPdfViewerFragment;
import p040o.ZGERU;
import p040o.ZHBMV;
import p040o.ZHEMM;
import p040o.ZHEMM$MediaBrowserCompat$ItemReceiver;
import p040o.ZHEMV;
import p040o.ZHER;
import p040o.ZHERK;

public class BottomBar extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {
    /* access modifiers changed from: private */
    public ViewGroup ActionMenuItemView;
    private boolean AlertController$RecycleListView;
    private boolean AppCompatActivity;
    private ZHEMV AppCompatDelegateImpl$ListMenuDecorView;
    private int AppCompatDialogFragment;
    private int AppCompatViewInflater;
    /* access modifiers changed from: private */
    public Typeface ExpandedMenuView;
    private int IconCompatParcelizer;
    private boolean Keep;
    /* access modifiers changed from: private */
    public float MediaBrowserCompat$CustomActionResultReceiver;
    public ViewGroup MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private ZHBMV MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private BottomBarTab[] f2524x50fd9e4a;
    /* access modifiers changed from: private */
    public int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper;
    private boolean MediaSessionCompat$Token;
    private int ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public float PlaybackStateCompat;
    /* access modifiers changed from: private */
    public int PlaybackStateCompat$CustomAction;
    /* access modifiers changed from: private */
    public View RatingCompat;
    public boolean read;
    private ZHER setBackgroundResource;
    private int setCheckable;
    private boolean setChecked;
    private boolean setContentView;
    private View setExpandedFormat;
    private int setHasDecor;
    private int setIcon;
    private int setItemInvoker;
    /* access modifiers changed from: private */
    public int setPadding;
    private Barcode$PersonName$MediaBrowserCompat$CustomActionResultReceiver setPopupCallback;
    private ZHERK setShortcut;
    /* access modifiers changed from: private */
    public int write;

    public BottomBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public BottomBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomBar(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            r0 = -1
            r5.MediaSessionCompat$QueueItem = r0
            o.ZHBMV r1 = new o.ZHBMV
            r1.<init>(r5)
            r5.MediaBrowserCompat$SearchResultReceiver = r1
            android.content.Context r1 = r5.getContext()
            int r2 = p040o.ZHEMM.write.colorPrimary
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r4 = 1
            r1.resolveAttribute(r2, r3, r4)
            int r1 = r3.data
            r5.AppCompatViewInflater = r1
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r2 = r1.widthPixels
            float r2 = (float) r2
            float r1 = r1.density
            float r2 = r2 / r1
            int r1 = (int) r2
            r5.setCheckable = r1
            android.content.Context r1 = r5.getContext()
            r2 = 1092616192(0x41200000, float:10.0)
            int r1 = p040o.FragmentBuilder_BindPdfViewerFragment.write(r1, r2)
            r5.setIcon = r1
            android.content.Context r1 = r5.getContext()
            r2 = 1126694912(0x43280000, float:168.0)
            int r1 = p040o.FragmentBuilder_BindPdfViewerFragment.write(r1, r2)
            r5.AppCompatDialogFragment = r1
            android.content.res.Resources$Theme r1 = r6.getTheme()
            int[] r2 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar
            r3 = 0
            android.content.res.TypedArray r7 = r1.obtainStyledAttributes(r7, r2, r8, r3)
            int r8 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_tabXmlResource     // Catch:{ all -> 0x01b7 }
            int r8 = r7.getResourceId(r8, r3)     // Catch:{ all -> 0x01b7 }
            r5.setItemInvoker = r8     // Catch:{ all -> 0x01b7 }
            int r8 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_tabletMode     // Catch:{ all -> 0x01b7 }
            boolean r8 = r7.getBoolean(r8, r3)     // Catch:{ all -> 0x01b7 }
            r5.Keep = r8     // Catch:{ all -> 0x01b7 }
            int r8 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_behavior     // Catch:{ all -> 0x01b7 }
            int r8 = r7.getInteger(r8, r3)     // Catch:{ all -> 0x01b7 }
            r5.MediaBrowserCompat$MediaItem = r8     // Catch:{ all -> 0x01b7 }
            int r8 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_inActiveTabAlpha     // Catch:{ all -> 0x01b7 }
            boolean r1 = r5.IconCompatParcelizer()     // Catch:{ all -> 0x01b7 }
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0082
            r1 = 1058642330(0x3f19999a, float:0.6)
            goto L_0x0083
        L_0x0082:
            r1 = r2
        L_0x0083:
            float r8 = r7.getFloat(r8, r1)     // Catch:{ all -> 0x01b7 }
            r5.PlaybackStateCompat = r8     // Catch:{ all -> 0x01b7 }
            int r8 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_activeTabAlpha     // Catch:{ all -> 0x01b7 }
            float r8 = r7.getFloat(r8, r2)     // Catch:{ all -> 0x01b7 }
            r5.MediaBrowserCompat$CustomActionResultReceiver = r8     // Catch:{ all -> 0x01b7 }
            boolean r8 = r5.IconCompatParcelizer()     // Catch:{ all -> 0x01b7 }
            if (r8 == 0) goto L_0x0099
            r8 = r0
            goto L_0x009f
        L_0x0099:
            int r8 = p040o.ZHEMM.read.bb_inActiveBottomBarItemColor     // Catch:{ all -> 0x01b7 }
            int r8 = p040o.setLastBaselineToBottomHeight.read(r6, r8)     // Catch:{ all -> 0x01b7 }
        L_0x009f:
            boolean r1 = r5.IconCompatParcelizer()     // Catch:{ all -> 0x01b7 }
            if (r1 == 0) goto L_0x00a7
            r1 = r0
            goto L_0x00a9
        L_0x00a7:
            int r1 = r5.AppCompatViewInflater     // Catch:{ all -> 0x01b7 }
        L_0x00a9:
            int r2 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_longPressHintsEnabled     // Catch:{ all -> 0x01b7 }
            boolean r2 = r7.getBoolean(r2, r4)     // Catch:{ all -> 0x01b7 }
            r5.setContentView = r2     // Catch:{ all -> 0x01b7 }
            int r2 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_inActiveTabColor     // Catch:{ all -> 0x01b7 }
            int r8 = r7.getColor(r2, r8)     // Catch:{ all -> 0x01b7 }
            r5.PlaybackStateCompat$CustomAction = r8     // Catch:{ all -> 0x01b7 }
            int r8 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_activeTabColor     // Catch:{ all -> 0x01b7 }
            int r8 = r7.getColor(r8, r1)     // Catch:{ all -> 0x01b7 }
            r5.write = r8     // Catch:{ all -> 0x01b7 }
            int r8 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_badgeBackgroundColor     // Catch:{ all -> 0x01b7 }
            r1 = -65536(0xffffffffffff0000, float:NaN)
            int r8 = r7.getColor(r8, r1)     // Catch:{ all -> 0x01b7 }
            r5.MediaDescriptionCompat = r8     // Catch:{ all -> 0x01b7 }
            int r8 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_badgesHideWhenActive     // Catch:{ all -> 0x01b7 }
            boolean r8 = r7.getBoolean(r8, r4)     // Catch:{ all -> 0x01b7 }
            r5.MediaSessionCompat$Token = r8     // Catch:{ all -> 0x01b7 }
            int r8 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_titleTextAppearance     // Catch:{ all -> 0x01b7 }
            int r8 = r7.getResourceId(r8, r3)     // Catch:{ all -> 0x01b7 }
            r5.setPadding = r8     // Catch:{ all -> 0x01b7 }
            int r8 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_titleTypeFace     // Catch:{ all -> 0x01b7 }
            java.lang.String r8 = r7.getString(r8)     // Catch:{ all -> 0x01b7 }
            if (r8 == 0) goto L_0x00f0
            android.content.Context r1 = r5.getContext()     // Catch:{ all -> 0x01b7 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ all -> 0x01b7 }
            android.graphics.Typeface r8 = android.graphics.Typeface.createFromAsset(r1, r8)     // Catch:{ all -> 0x01b7 }
            goto L_0x00f1
        L_0x00f0:
            r8 = 0
        L_0x00f1:
            r5.ExpandedMenuView = r8     // Catch:{ all -> 0x01b7 }
            int r8 = p040o.ZHEMM.MediaDescriptionCompat.BottomBar_bb_showShadow     // Catch:{ all -> 0x01b7 }
            boolean r8 = r7.getBoolean(r8, r4)     // Catch:{ all -> 0x01b7 }
            r5.setChecked = r8     // Catch:{ all -> 0x01b7 }
            r7.recycle()
            boolean r7 = r5.Keep
            r8 = -2
            if (r7 == 0) goto L_0x0105
            r7 = r8
            goto L_0x0106
        L_0x0105:
            r7 = r0
        L_0x0106:
            boolean r1 = r5.Keep
            if (r1 == 0) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r0 = r8
        L_0x010c:
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r7, r0)
            r5.setLayoutParams(r8)
            boolean r7 = r5.Keep
            r7 = r7 ^ r4
            r5.setOrientation(r7)
            android.content.Context r7 = r5.getContext()
            boolean r0 = r5.Keep
            if (r0 == 0) goto L_0x0125
            int r0 = p040o.ZHEMM.RatingCompat.bb_bottom_bar_item_container_tablet
            goto L_0x0127
        L_0x0125:
            int r0 = p040o.ZHEMM.RatingCompat.bb_bottom_bar_item_container
        L_0x0127:
            android.view.View r7 = inflate(r7, r0, r5)
            r7.setLayoutParams(r8)
            int r8 = p040o.ZHEMM$MediaBrowserCompat$ItemReceiver.bb_bottom_bar_background_overlay
            android.view.View r8 = r7.findViewById(r8)
            r5.RatingCompat = r8
            int r8 = p040o.ZHEMM$MediaBrowserCompat$ItemReceiver.bb_bottom_bar_outer_container
            android.view.View r8 = r7.findViewById(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r5.ActionMenuItemView = r8
            int r8 = p040o.ZHEMM$MediaBrowserCompat$ItemReceiver.bb_bottom_bar_item_container
            android.view.View r7 = r7.findViewById(r8)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r5.MediaBrowserCompat$ItemReceiver = r7
            int r7 = p040o.ZHEMM$MediaBrowserCompat$ItemReceiver.bb_bottom_bar_shadow
            android.view.View r7 = r5.findViewById(r7)
            r5.setExpandedFormat = r7
            boolean r7 = r5.Keep
            if (r7 != 0) goto L_0x0164
            int r7 = r5.MediaBrowserCompat$MediaItem
            r8 = r7 | 1
            if (r8 != r7) goto L_0x015e
            r7 = r4
            goto L_0x015f
        L_0x015e:
            r7 = r3
        L_0x015f:
            if (r7 != 0) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            r7 = r4
            goto L_0x0165
        L_0x0164:
            r7 = r3
        L_0x0165:
            if (r7 == 0) goto L_0x016b
            int r7 = r5.AppCompatViewInflater
            r5.MediaSessionCompat$QueueItem = r7
        L_0x016b:
            android.graphics.drawable.Drawable r7 = r5.getBackground()
            if (r7 == 0) goto L_0x0176
            boolean r8 = r7 instanceof android.graphics.drawable.ColorDrawable
            if (r8 == 0) goto L_0x0176
            goto L_0x0177
        L_0x0176:
            r4 = r3
        L_0x0177:
            if (r4 == 0) goto L_0x0184
            android.graphics.drawable.ColorDrawable r7 = (android.graphics.drawable.ColorDrawable) r7
            int r7 = r7.getColor()
            r5.MediaSessionCompat$QueueItem = r7
            r5.setBackgroundColor(r3)
        L_0x0184:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r7 < r8) goto L_0x01af
            boolean r7 = r5.setChecked
            if (r7 == 0) goto L_0x01af
            float r7 = r5.getElevation()
            r8 = 0
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x01a2
            android.content.res.Resources r7 = r5.getResources()
            int r8 = p040o.ZHEMM.IconCompatParcelizer.bb_default_elevation
            int r7 = r7.getDimensionPixelSize(r8)
            float r7 = (float) r7
        L_0x01a2:
            int r6 = p040o.FragmentBuilder_BindPdfViewerFragment.write(r6, r7)
            float r6 = (float) r6
            r5.setElevation(r6)
            android.view.ViewOutlineProvider r6 = android.view.ViewOutlineProvider.BOUNDS
            r5.setOutlineProvider(r6)
        L_0x01af:
            int r6 = r5.setItemInvoker
            if (r6 == 0) goto L_0x01b6
            r5.setItems(r6)
        L_0x01b6:
            return
        L_0x01b7:
            r6 = move-exception
            r7.recycle()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roughike.bottombar.BottomBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT < 21 && this.setChecked && (view = this.setExpandedFormat) != null) {
            view.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin - getResources().getDimensionPixelSize(ZHEMM.IconCompatParcelizer.bb_fake_shadow_height), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                setLayoutParams(layoutParams);
            }
        }
    }

    private boolean IconCompatParcelizer() {
        if (this.Keep) {
            return false;
        }
        int i = this.MediaBrowserCompat$MediaItem;
        return (i | 1) == i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if ((r4 - r0) <= 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r3 == false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r6 = this;
            boolean r0 = r6.Keep
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0076
            int r0 = r6.MediaBrowserCompat$MediaItem
            r3 = r0 | 4
            if (r3 != r0) goto L_0x000e
            r0 = r1
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            if (r0 == 0) goto L_0x0076
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r3 = r0.getResources()
            int r4 = p040o.ZHEMM$MediaBrowserCompat$CustomActionResultReceiver.bb_bottom_bar_is_portrait_mode
            boolean r3 = r3.getBoolean(r4)
            if (r3 == 0) goto L_0x0072
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 17
            if (r3 < r4) goto L_0x0053
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics
            r3.<init>()
            r0.getRealMetrics(r3)
            int r4 = r3.heightPixels
            int r3 = r3.widthPixels
            android.util.DisplayMetrics r5 = new android.util.DisplayMetrics
            r5.<init>()
            r0.getMetrics(r5)
            int r0 = r5.heightPixels
            int r5 = r5.widthPixels
            int r3 = r3 - r5
            if (r3 > 0) goto L_0x006d
            int r4 = r4 - r0
            if (r4 <= 0) goto L_0x006b
            goto L_0x006a
        L_0x0053:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 14
            if (r3 < r4) goto L_0x006d
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            r3 = 4
            boolean r3 = android.view.KeyCharacterMap.deviceHasKey(r3)
            if (r0 != 0) goto L_0x006b
            if (r3 != 0) goto L_0x006b
        L_0x006a:
            goto L_0x006d
        L_0x006b:
            r0 = r2
            goto L_0x006e
        L_0x006d:
            r0 = r1
        L_0x006e:
            if (r0 == 0) goto L_0x0072
            r0 = r1
            goto L_0x0073
        L_0x0072:
            r0 = r2
        L_0x0073:
            if (r0 == 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r1 = r2
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roughike.bottombar.BottomBar.MediaBrowserCompat$CustomActionResultReceiver():boolean");
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        if (!this.Keep) {
            int i = this.MediaBrowserCompat$MediaItem;
            if ((i | 2) == i) {
                return true;
            }
        }
        return false;
    }

    private boolean read() {
        if (!this.Keep) {
            int i = this.MediaBrowserCompat$MediaItem;
            if ((i | 8) == i) {
                return true;
            }
        }
        return false;
    }

    public void setItems(int i) {
        setItems(i, (BottomBarTab.write) null);
    }

    private void IconCompatParcelizer(BottomBarTab[] bottomBarTabArr) {
        int round = Math.round(((float) getWidth()) / getContext().getResources().getDisplayMetrics().density);
        if (round <= 0 || round > this.setCheckable) {
            round = this.setCheckable;
        }
        int min = Math.min(FragmentBuilder_BindPdfViewerFragment.write(getContext(), (float) (round / bottomBarTabArr.length)), this.AppCompatDialogFragment);
        double d = (double) min;
        this.setHasDecor = (int) (0.9d * d);
        this.IconCompatParcelizer = (int) (d + (((double) (bottomBarTabArr.length - 1)) * 0.1d * d));
        int round2 = Math.round(getContext().getResources().getDimension(ZHEMM.IconCompatParcelizer.bb_height));
        for (BottomBarTab bottomBarTab : bottomBarTabArr) {
            ViewGroup.LayoutParams layoutParams = bottomBarTab.getLayoutParams();
            layoutParams.height = round2;
            if (!IconCompatParcelizer()) {
                layoutParams.width = min;
            } else if (bottomBarTab.MediaBrowserCompat$SearchResultReceiver) {
                layoutParams.width = this.IconCompatParcelizer;
            } else {
                layoutParams.width = this.setHasDecor;
            }
            if (bottomBarTab.getParent() == null) {
                this.MediaBrowserCompat$ItemReceiver.addView(bottomBarTab);
            }
            bottomBarTab.setLayoutParams(layoutParams);
        }
    }

    public void setTabSelectionInterceptor(ZHERK zherk) {
        this.setShortcut = zherk;
    }

    public void setOnTabSelectListener(ZHEMV zhemv) {
        setOnTabSelectListener(zhemv, true);
    }

    public void setOnTabSelectListener(ZHEMV zhemv, boolean z) {
        this.AppCompatDelegateImpl$ListMenuDecorView = zhemv;
        if (z && this.MediaBrowserCompat$ItemReceiver.getChildCount() > 0) {
            zhemv.IconCompatParcelizer(write().getId());
        }
    }

    public void setOnTabReselectListener(ZHER zher) {
        this.setBackgroundResource = zher;
    }

    public void setDefaultTabPosition(int i) {
        if (!this.AlertController$RecycleListView) {
            read(i);
        }
    }

    public void setLongPressHintsEnabled(boolean z) {
        this.setContentView = z;
    }

    public void setInActiveTabAlpha(float f) {
        this.PlaybackStateCompat = f;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(new ZHBMV.write() {
            public final void IconCompatParcelizer(BottomBarTab bottomBarTab) {
                bottomBarTab.setInActiveAlpha(BottomBar.this.PlaybackStateCompat);
            }
        });
    }

    public void setActiveTabAlpha(float f) {
        this.MediaBrowserCompat$CustomActionResultReceiver = f;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(new ZHBMV.write() {
            public final void IconCompatParcelizer(BottomBarTab bottomBarTab) {
                bottomBarTab.setActiveAlpha(BottomBar.this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        });
    }

    public void setInActiveTabColor(int i) {
        this.PlaybackStateCompat$CustomAction = i;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(new ZHBMV.write() {
            public final void IconCompatParcelizer(BottomBarTab bottomBarTab) {
                bottomBarTab.setInActiveColor(BottomBar.this.PlaybackStateCompat$CustomAction);
            }
        });
    }

    public void setActiveTabColor(int i) {
        this.write = i;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(new ZHBMV.write() {
            public final void IconCompatParcelizer(BottomBarTab bottomBarTab) {
                bottomBarTab.setActiveColor(BottomBar.this.write);
            }
        });
    }

    public void setBadgeBackgroundColor(int i) {
        this.MediaDescriptionCompat = i;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(new ZHBMV.write() {
            public final void IconCompatParcelizer(BottomBarTab bottomBarTab) {
                bottomBarTab.setBadgeBackgroundColor(BottomBar.this.MediaDescriptionCompat);
            }
        });
    }

    public void setBadgesHideWhenActive(final boolean z) {
        this.MediaSessionCompat$Token = z;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(new ZHBMV.write() {
            public final void IconCompatParcelizer(BottomBarTab bottomBarTab) {
                bottomBarTab.setBadgeHidesWhenActive(z);
            }
        });
    }

    public void setTabTitleTextAppearance(int i) {
        this.setPadding = i;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(new ZHBMV.write() {
            public final void IconCompatParcelizer(BottomBarTab bottomBarTab) {
                bottomBarTab.MediaMetadataCompat = BottomBar.this.setPadding;
                bottomBarTab.MediaBrowserCompat$ItemReceiver();
            }
        });
    }

    public void setTabTitleTypeface(Typeface typeface) {
        this.ExpandedMenuView = typeface;
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(new ZHBMV.write() {
            public final void IconCompatParcelizer(BottomBarTab bottomBarTab) {
                bottomBarTab.setTitleTypeface(BottomBar.this.ExpandedMenuView);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int height;
        int height2;
        BottomBarTab bottomBarTab;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            if (!this.Keep) {
                IconCompatParcelizer(this.f2524x50fd9e4a);
            }
            int i5 = 0;
            if (!read()) {
                int childCount = this.MediaBrowserCompat$ItemReceiver.getChildCount();
                if (!(this.MediaBrowserCompat$ItemReceiver == null || childCount == 0 || !IconCompatParcelizer())) {
                    for (int i6 = 0; i6 < childCount; i6++) {
                        View childAt = this.MediaBrowserCompat$ItemReceiver.getChildAt(i6);
                        if (childAt instanceof BadgeContainer) {
                            bottomBarTab = MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) (BadgeContainer) childAt);
                        } else {
                            bottomBarTab = (BottomBarTab) childAt;
                        }
                        TextView textView = bottomBarTab.f2525x50fd9e4a;
                        if (textView != null) {
                            int height3 = this.setIcon - (textView.getHeight() - textView.getBaseline());
                            if (height3 > 0) {
                                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), height3 + textView.getPaddingBottom());
                            }
                        }
                    }
                }
            }
            if (MediaBrowserCompat$ItemReceiver()) {
                ViewParent parent = getParent();
                if (!(parent != null && (parent instanceof CoordinatorLayout))) {
                    throw new RuntimeException("In order to have shy behavior, the BottomBar must be a direct child of a CoordinatorLayout.");
                } else if (!this.read && (height2 = getHeight()) != 0) {
                    write(height2);
                    if (!MediaBrowserCompat$ItemReceiver()) {
                        Log.e("BottomBar", "Tried to get shy settings for a BottomBar that is not shy.");
                    }
                    if (this.setPopupCallback == null) {
                        this.setPopupCallback = new Barcode$PersonName$MediaBrowserCompat$CustomActionResultReceiver(this);
                    }
                    Barcode$PersonName$MediaBrowserCompat$CustomActionResultReceiver barcode$PersonName$MediaBrowserCompat$CustomActionResultReceiver = this.setPopupCallback;
                    Boolean bool = barcode$PersonName$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        if (barcode$PersonName$MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver()) {
                            if (barcode$PersonName$MediaBrowserCompat$CustomActionResultReceiver.read.read) {
                                ZGERU IconCompatParcelizer2 = ZGERU.IconCompatParcelizer(barcode$PersonName$MediaBrowserCompat$CustomActionResultReceiver.read);
                                if (IconCompatParcelizer2 != null) {
                                    BottomBar bottomBar = barcode$PersonName$MediaBrowserCompat$CustomActionResultReceiver.read;
                                    boolean z2 = !booleanValue;
                                    if (!z2 && IconCompatParcelizer2.read) {
                                        IconCompatParcelizer2.read(bottomBar, 0);
                                    } else if (z2 && !IconCompatParcelizer2.read) {
                                        IconCompatParcelizer2.read(bottomBar, IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver);
                                    }
                                    IconCompatParcelizer2.read = z2;
                                }
                            } else {
                                barcode$PersonName$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = Boolean.TRUE;
                            }
                        }
                        barcode$PersonName$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = null;
                    }
                    this.read = true;
                }
            }
            if (MediaBrowserCompat$CustomActionResultReceiver() && Build.VERSION.SDK_INT >= 19 && (height = getHeight()) != 0 && !this.AppCompatActivity) {
                this.AppCompatActivity = true;
                this.MediaBrowserCompat$ItemReceiver.getLayoutParams().height = height;
                Resources resources = getContext().getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i5 = resources.getDimensionPixelSize(identifier);
                }
                int i7 = height + i5;
                getLayoutParams().height = i7;
                if (MediaBrowserCompat$ItemReceiver()) {
                    write(i7);
                }
            }
        }
    }

    private void write(int i) {
        CoordinatorLayout.read read2 = (CoordinatorLayout.read) getLayoutParams();
        ZGERU zgeru = new ZGERU(i);
        if (read2.MediaDescriptionCompat != zgeru) {
            read2.MediaDescriptionCompat = zgeru;
            read2.RatingCompat = true;
            zgeru.IconCompatParcelizer(read2);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle != null) {
                this.AlertController$RecycleListView = true;
                this.MediaSessionCompat$ResultReceiverWrapper = true;
                read(bundle.getInt("STATE_CURRENT_SELECTED_TAB", this.ParcelableVolumeInfo));
            }
            parcelable = bundle.getParcelable("superstate");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onClick(View view) {
        if (view instanceof BottomBarTab) {
            BottomBarTab bottomBarTab = (BottomBarTab) view;
            BottomBarTab write2 = write();
            ZHERK zherk = this.setShortcut;
            if (zherk != null) {
                write2.getId();
                bottomBarTab.getId();
                if (zherk.write()) {
                    return;
                }
            }
            write2.MediaBrowserCompat$ItemReceiver(true);
            bottomBarTab.read(true);
            if (IconCompatParcelizer()) {
                write2.MediaBrowserCompat$CustomActionResultReceiver((float) this.setHasDecor, true);
                bottomBarTab.MediaBrowserCompat$CustomActionResultReceiver((float) this.IconCompatParcelizer, true);
            }
            MediaBrowserCompat$ItemReceiver(bottomBarTab, true);
            MediaBrowserCompat$CustomActionResultReceiver(bottomBarTab.read);
        }
    }

    public boolean onLongClick(View view) {
        if (view instanceof BottomBarTab) {
            BottomBarTab bottomBarTab = (BottomBarTab) view;
            if ((IconCompatParcelizer() || this.Keep) && (bottomBarTab.MediaBrowserCompat$SearchResultReceiver ^ true) && this.setContentView) {
                Toast.makeText(getContext(), bottomBarTab.MediaBrowserCompat$MediaItem, 0).show();
            }
        }
        return true;
    }

    public static BottomBarTab MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof BottomBarTab) {
                return (BottomBarTab) childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v12, types: [android.view.ViewGroup] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$ItemReceiver(com.roughike.bottombar.BottomBarTab r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r5.MediaMetadataCompat
            if (r1 != r0) goto L_0x0007
            return
        L_0x0007:
            if (r7 != 0) goto L_0x000f
            android.view.ViewGroup r6 = r5.ActionMenuItemView
            r6.setBackgroundColor(r0)
            return
        L_0x000f:
            com.roughike.bottombar.BottomBarBadge r7 = r6.IconCompatParcelizer
            r1 = 0
            if (r7 == 0) goto L_0x0016
            r7 = 1
            goto L_0x0017
        L_0x0016:
            r7 = r1
        L_0x0017:
            if (r7 == 0) goto L_0x001f
            android.view.ViewParent r6 = r6.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
        L_0x001f:
            android.view.ViewGroup r7 = r5.ActionMenuItemView
            r7.clearAnimation()
            android.view.View r7 = r5.RatingCompat
            r7.clearAnimation()
            android.view.View r7 = r5.RatingCompat
            r7.setBackgroundColor(r0)
            android.view.View r7 = r5.RatingCompat
            r7.setVisibility(r1)
            int r7 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            r3 = 0
            if (r7 < r2) goto L_0x008c
            android.view.ViewGroup r7 = r5.ActionMenuItemView
            boolean r7 = r7.isAttachedToWindow()
            if (r7 == 0) goto L_0x00a9
            float r7 = p040o.SwitchCompat.setContentView(r6)
            int r2 = r6.getMeasuredWidth()
            int r2 = r2 / 2
            float r2 = (float) r2
            float r7 = r7 + r2
            int r7 = (int) r7
            boolean r2 = r5.Keep
            if (r2 == 0) goto L_0x0058
            float r1 = p040o.SwitchCompat.AppCompatDialogFragment(r6)
            int r1 = (int) r1
        L_0x0058:
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 / 2
            boolean r2 = r5.Keep
            if (r2 == 0) goto L_0x0069
            android.view.ViewGroup r2 = r5.ActionMenuItemView
            int r2 = r2.getHeight()
            goto L_0x006f
        L_0x0069:
            android.view.ViewGroup r2 = r5.ActionMenuItemView
            int r2 = r2.getWidth()
        L_0x006f:
            android.view.View r4 = r5.RatingCompat
            int r1 = r1 + r6
            float r6 = (float) r2
            android.animation.Animator r6 = android.view.ViewAnimationUtils.createCircularReveal(r4, r7, r1, r3, r6)
            boolean r7 = r5.Keep
            if (r7 == 0) goto L_0x0080
            r1 = 500(0x1f4, double:2.47E-321)
            r6.setDuration(r1)
        L_0x0080:
            com.roughike.bottombar.BottomBar$8 r7 = new com.roughike.bottombar.BottomBar$8
            r7.<init>(r0)
            r6.addListener(r7)
            r6.start()
            goto L_0x00a9
        L_0x008c:
            android.view.View r6 = r5.RatingCompat
            p040o.SwitchCompat.MediaBrowserCompat$ItemReceiver((android.view.View) r6, (float) r3)
            android.view.View r6 = r5.RatingCompat
            o.setSwitchPadding r6 = p040o.SwitchCompat.write(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            o.setSwitchPadding r6 = r6.IconCompatParcelizer(r7)
            com.roughike.bottombar.BottomBar$4 r7 = new com.roughike.bottombar.BottomBar$4
            r7.<init>(r0)
            o.setSwitchPadding r6 = r6.read((p040o.setSwitchTypeface) r7)
            r6.write()
        L_0x00a9:
            r5.MediaMetadataCompat = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roughike.bottombar.BottomBar.MediaBrowserCompat$ItemReceiver(com.roughike.bottombar.BottomBarTab, boolean):void");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        BottomBarTab bottomBarTab;
        View childAt = this.MediaBrowserCompat$ItemReceiver.getChildAt(i);
        if (childAt instanceof BadgeContainer) {
            bottomBarTab = MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) (BadgeContainer) childAt);
        } else {
            bottomBarTab = (BottomBarTab) childAt;
        }
        int id = bottomBarTab.getId();
        if (i != this.ParcelableVolumeInfo) {
            ZHEMV zhemv = this.AppCompatDelegateImpl$ListMenuDecorView;
            if (zhemv != null) {
                zhemv.IconCompatParcelizer(id);
            }
        } else {
            ZHER zher = this.setBackgroundResource;
            if (zher != null && !this.MediaSessionCompat$ResultReceiverWrapper) {
                zher.MediaBrowserCompat$ItemReceiver(id);
            }
        }
        this.ParcelableVolumeInfo = i;
        if (this.MediaSessionCompat$ResultReceiverWrapper) {
            this.MediaSessionCompat$ResultReceiverWrapper = false;
        }
    }

    private BottomBarTab write() {
        View childAt = this.MediaBrowserCompat$ItemReceiver.getChildAt(this.ParcelableVolumeInfo);
        if (childAt instanceof BadgeContainer) {
            return MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) (BadgeContainer) childAt);
        }
        return (BottomBarTab) childAt;
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putInt("STATE_CURRENT_SELECTED_TAB", this.ParcelableVolumeInfo);
        bundle.putParcelable("superstate", super.onSaveInstanceState());
        return bundle;
    }

    public void read(int i) {
        BottomBarTab bottomBarTab;
        if (i > this.MediaBrowserCompat$ItemReceiver.getChildCount() - 1 || i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't select tab at position ");
            sb.append(i);
            sb.append(". This BottomBar has no items at that position.");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        BottomBarTab write2 = write();
        View childAt = this.MediaBrowserCompat$ItemReceiver.getChildAt(i);
        if (childAt instanceof BadgeContainer) {
            bottomBarTab = MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) (BadgeContainer) childAt);
        } else {
            bottomBarTab = (BottomBarTab) childAt;
        }
        write2.MediaBrowserCompat$ItemReceiver(false);
        bottomBarTab.read(false);
        MediaBrowserCompat$CustomActionResultReceiver(i);
        if (IconCompatParcelizer()) {
            write2.MediaBrowserCompat$CustomActionResultReceiver((float) this.setHasDecor, false);
            bottomBarTab.MediaBrowserCompat$CustomActionResultReceiver((float) this.IconCompatParcelizer, false);
        }
        MediaBrowserCompat$ItemReceiver(bottomBarTab, false);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        read(((BottomBarTab) this.MediaBrowserCompat$ItemReceiver.findViewById(i)).read);
    }

    public void setDefaultTab(int i) {
        setDefaultTabPosition(((BottomBarTab) this.MediaBrowserCompat$ItemReceiver.findViewById(i)).read);
    }

    public void setItems(int i, BottomBarTab.write write2) {
        BottomBarTab.IconCompatParcelizer iconCompatParcelizer;
        int i2;
        TextView textView;
        if (i != 0) {
            if (write2 == null) {
                BottomBarTab.write.IconCompatParcelizer iconCompatParcelizer2 = new BottomBarTab.write.IconCompatParcelizer();
                iconCompatParcelizer2.MediaDescriptionCompat = this.PlaybackStateCompat;
                iconCompatParcelizer2.read = this.MediaBrowserCompat$CustomActionResultReceiver;
                iconCompatParcelizer2.MediaBrowserCompat$SearchResultReceiver = this.PlaybackStateCompat$CustomAction;
                iconCompatParcelizer2.IconCompatParcelizer = this.write;
                iconCompatParcelizer2.write = this.MediaSessionCompat$QueueItem;
                iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = this.MediaDescriptionCompat;
                iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = this.MediaSessionCompat$Token;
                iconCompatParcelizer2.RatingCompat = this.setPadding;
                iconCompatParcelizer2.MediaMetadataCompat = this.ExpandedMenuView;
                write2 = new BottomBarTab.write(iconCompatParcelizer2, (byte) 0);
            }
            List<BottomBarTab> write3 = new TabParser(getContext(), write2, i).write();
            this.MediaBrowserCompat$ItemReceiver.removeAllViews();
            BottomBarTab[] bottomBarTabArr = new BottomBarTab[write3.size()];
            int i3 = 0;
            int i4 = 0;
            for (BottomBarTab next : write3) {
                if (IconCompatParcelizer()) {
                    iconCompatParcelizer = BottomBarTab.IconCompatParcelizer.SHIFTING;
                } else if (this.Keep) {
                    iconCompatParcelizer = BottomBarTab.IconCompatParcelizer.TABLET;
                } else {
                    iconCompatParcelizer = BottomBarTab.IconCompatParcelizer.FIXED;
                }
                if (read()) {
                    next.write(true);
                }
                next.MediaSessionCompat$Token = iconCompatParcelizer;
                Context context = next.getContext();
                int i5 = BottomBarTab.C10661.read[next.MediaSessionCompat$Token.ordinal()];
                if (i5 == 1) {
                    i2 = ZHEMM.RatingCompat.bb_bottom_bar_item_fixed;
                } else if (i5 == 2) {
                    i2 = ZHEMM.RatingCompat.bb_bottom_bar_item_shifting;
                } else if (i5 == 3) {
                    i2 = ZHEMM.RatingCompat.bb_bottom_bar_item_fixed_tablet;
                } else {
                    throw new RuntimeException("Unknown BottomBarTab type.");
                }
                BottomBarTab.inflate(context, i2, next);
                next.setOrientation(1);
                next.setGravity(next.MediaDescriptionCompat ? 17 : 1);
                next.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                Context context2 = next.getContext();
                int i6 = ZHEMM.write.selectableItemBackgroundBorderless;
                TypedValue typedValue = new TypedValue();
                context2.getTheme().resolveAttribute(i6, typedValue, true);
                next.setBackgroundResource(typedValue.resourceId);
                AppCompatImageView appCompatImageView = (AppCompatImageView) next.findViewById(ZHEMM$MediaBrowserCompat$ItemReceiver.bb_bottom_bar_icon);
                next.MediaBrowserCompat$ItemReceiver = appCompatImageView;
                appCompatImageView.setImageResource(next.write);
                if (next.MediaSessionCompat$Token != BottomBarTab.IconCompatParcelizer.TABLET && !next.MediaDescriptionCompat) {
                    TextView textView2 = (TextView) next.findViewById(ZHEMM$MediaBrowserCompat$ItemReceiver.bb_bottom_bar_title);
                    next.f2525x50fd9e4a = textView2;
                    textView2.setVisibility(0);
                    if (next.MediaSessionCompat$Token == BottomBarTab.IconCompatParcelizer.SHIFTING) {
                        next.findViewById(ZHEMM$MediaBrowserCompat$ItemReceiver.spacer).setVisibility(0);
                    }
                    TextView textView3 = next.f2525x50fd9e4a;
                    if (textView3 != null) {
                        textView3.setText(next.MediaBrowserCompat$MediaItem);
                    }
                }
                next.MediaBrowserCompat$ItemReceiver();
                Typeface typeface = next.RatingCompat;
                if (!(typeface == null || (textView = next.f2525x50fd9e4a) == null)) {
                    textView.setTypeface(typeface);
                }
                if (i3 == this.ParcelableVolumeInfo) {
                    next.read(false);
                    MediaBrowserCompat$ItemReceiver(next, false);
                } else {
                    next.MediaBrowserCompat$ItemReceiver(false);
                }
                if (!this.Keep) {
                    if (next.getWidth() > i4) {
                        i4 = next.getWidth();
                    }
                    bottomBarTabArr[i3] = next;
                } else {
                    this.MediaBrowserCompat$ItemReceiver.addView(next);
                }
                next.setOnClickListener(this);
                next.setOnLongClickListener(this);
                i3++;
            }
            this.f2524x50fd9e4a = bottomBarTabArr;
            if (!this.Keep) {
                IconCompatParcelizer(bottomBarTabArr);
                return;
            }
            return;
        }
        throw new RuntimeException("No items specified for the BottomBar!");
    }

    public void setTabTitleTypeface(String str) {
        Typeface typeface;
        if (str != null) {
            typeface = Typeface.createFromAsset(getContext().getAssets(), str);
        } else {
            typeface = null;
        }
        setTabTitleTypeface(typeface);
    }
}

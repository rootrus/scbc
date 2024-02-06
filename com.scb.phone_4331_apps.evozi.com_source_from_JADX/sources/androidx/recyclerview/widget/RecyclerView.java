package androidx.recyclerview.widget;

import android.content.Context;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.C1539x5a6c48da;
import p040o.SwitchCompat;
import p040o.setBackgroundDrawable;
import p040o.setGuidelinePercent;
import p040o.setIconifiedByDefault;
import p040o.setMeasureWithLargestChildEnabled;
import p040o.setMinWidth;
import p040o.setOptimizationLevel;
import p040o.setQueryRefinementEnabled;
import p040o.setStatusBarBackground;
import p040o.setSubmitButtonEnabled;
import p040o.setTag;
import p040o.setThumbTextPadding;
import p040o.setTitleMarginBottom;

public class RecyclerView extends ViewGroup implements setQueryRefinementEnabled {
    private static final Class<?>[] ActionBarContainer = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    static final boolean IconCompatParcelizer = (Build.VERSION.SDK_INT >= 21);
    static final boolean MediaBrowserCompat$CustomActionResultReceiver = (Build.VERSION.SDK_INT >= 23);
    static final Interpolator MediaBrowserCompat$ItemReceiver = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    static final boolean read = (Build.VERSION.SDK_INT >= 16);
    private static final int[] setPrimaryBackground = {16842987};
    private static final int[] setSplitBackground = {16843830};
    private static final boolean setStackedBackground = (Build.VERSION.SDK_INT <= 15);
    private static final boolean setTabContainer = (Build.VERSION.SDK_INT <= 15);
    static final boolean write = (Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20);
    final AppCompatActivity AbsActionBarView;
    private int ActionBarContextView;
    private MediaMetadataCompat.read ActionBarOverlayLayout;
    public int ActionMenuItemView;
    private EdgeEffect ActionMenuPresenter$OverflowMenuButton;
    private PlaybackStateCompat.CustomAction ActionMenuView;
    private EdgeEffect ActivityChooserView;
    public MediaMetadataCompat AlertController$RecycleListView;
    public RecyclerView$MediaBrowserCompat$SearchResultReceiver AppCompatActivity;
    boolean AppCompatDelegateImpl$ListMenuDecorView;
    Runnable AppCompatDialogFragment;
    boolean AppCompatViewInflater;
    public final Keep ExpandedMenuView;
    setOptimizationLevel Keep;
    public int ListMenuItemView;
    public setTag MediaBrowserCompat$MediaItem;
    final AccessibilityManager MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f23x50fd9e4a;
    public IconCompatParcelizer MediaDescriptionCompat;
    setGuidelinePercent MediaMetadataCompat;
    public boolean MediaSessionCompat$QueueItem;
    public setMinWidth MediaSessionCompat$ResultReceiverWrapper;
    boolean MediaSessionCompat$Token;
    final Runnable MenuItemImpl;
    final setStatusBarBackground MenuItemWrapperICS$CollapsibleActionViewWrapper;
    boolean ParcelableVolumeInfo;
    boolean PlaybackStateCompat;
    int PlaybackStateCompat$CustomAction;
    public C0065xe743b54a RatingCompat;
    public final ArrayList<C0065xe743b54a> mOnItemTouchListeners;
    private int onMenuItemClick;
    private boolean setActionBarHideOffset;
    private int setActionBarVisibilityCallback;
    boolean setBackgroundResource;
    boolean setCheckable;
    public final int setChecked;
    final RectF setContentHeight;
    final ArrayList<RatingCompat> setContentView;
    private EdgeEffect setCustomView;
    private float setExpandedActionViewsExclusive;
    public RecyclerView$MediaSessionCompat$Token setExpandedFormat;
    setBackgroundDrawable.write setForceShowIcon;
    public List<ParcelableVolumeInfo> setGroupDividerEnabled;
    boolean setHasDecor;
    private int setHasNonEmbeddedTabs;
    private int setHideOnContentScrollEnabled;
    public setOptimizationLevel.IconCompatParcelizer setIcon;
    final int[] setItemInvoker;
    private int setLogo;
    private final int[] setMenu;
    private int setMenuCallbacks;
    private EdgeEffect setMenuPrepared;
    private ParcelableVolumeInfo setOnMenuItemClickListener;
    private final int[] setOverflowIcon;
    private final Rect setOverflowReserved;
    private final int setOverlayMode;
    public final RecyclerView$MediaSessionCompat$ResultReceiverWrapper setPadding;
    boolean setPopupCallback;
    private VelocityTracker setPopupTheme;
    private final setStatusBarBackground.IconCompatParcelizer setPresenter;
    final List<setContentView> setShortcut;
    private final int[] setShowingForActionMode;
    private int setSubtitle;
    final int[] setTitle;
    private RecyclerView$MediaBrowserCompat$ItemReceiver setTitleOptional;
    private boolean setTransitioning;
    private final RecyclerView$AlertController$RecycleListView setUiOptions;
    final Rect setVisibility;
    private boolean setWindowCallback;
    private float setWindowTitle;

    public static abstract class ParcelableVolumeInfo {
        public void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        }

        public void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView, int i) {
        }
    }

    public static abstract class setBackgroundResource {
        public abstract View MediaBrowserCompat$CustomActionResultReceiver();
    }

    public interface setHasDecor {
    }

    public void setRecyclerListener(setHasDecor sethasdecor) {
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x035d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            r21 = this;
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            java.lang.String r14 = ": Could not instantiate the LayoutManager: "
            r21.<init>(r22, r23, r24)
            androidx.recyclerview.widget.RecyclerView$AlertController$RecycleListView r0 = new androidx.recyclerview.widget.RecyclerView$AlertController$RecycleListView
            r0.<init>(r10)
            r10.setUiOptions = r0
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r0 = new androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper
            r0.<init>(r10)
            r10.setPadding = r0
            o.setStatusBarBackground r0 = new o.setStatusBarBackground
            r0.<init>()
            r10.MenuItemWrapperICS$CollapsibleActionViewWrapper = r0
            androidx.recyclerview.widget.RecyclerView$5 r0 = new androidx.recyclerview.widget.RecyclerView$5
            r0.<init>()
            r10.MenuItemImpl = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.setVisibility = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.setOverflowReserved = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.setContentHeight = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.setContentView = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.mOnItemTouchListeners = r0
            r15 = 0
            r10.PlaybackStateCompat$CustomAction = r15
            r10.f23x50fd9e4a = r15
            r10.setTransitioning = r15
            r10.ActionMenuItemView = r15
            r10.ActionBarContextView = r15
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$CustomActionResultReceiver r0 = new androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$CustomActionResultReceiver
            r0.<init>()
            o.setMaxHeight r0 = new o.setMaxHeight
            r0.<init>()
            r10.AlertController$RecycleListView = r0
            r10.ListMenuItemView = r15
            r0 = -1
            r10.setMenuCallbacks = r0
            r1 = 1
            r10.setWindowTitle = r1
            r10.setExpandedActionViewsExclusive = r1
            r9 = 1
            r10.setWindowCallback = r9
            androidx.recyclerview.widget.RecyclerView$AppCompatActivity r1 = new androidx.recyclerview.widget.RecyclerView$AppCompatActivity
            r1.<init>()
            r10.AbsActionBarView = r1
            boolean r1 = IconCompatParcelizer
            r16 = 0
            if (r1 == 0) goto L_0x0083
            o.setOptimizationLevel$IconCompatParcelizer r1 = new o.setOptimizationLevel$IconCompatParcelizer
            r1.<init>()
            goto L_0x0085
        L_0x0083:
            r1 = r16
        L_0x0085:
            r10.setIcon = r1
            androidx.recyclerview.widget.RecyclerView$Keep r1 = new androidx.recyclerview.widget.RecyclerView$Keep
            r1.<init>()
            r10.ExpandedMenuView = r1
            r10.AppCompatDelegateImpl$ListMenuDecorView = r15
            r10.setBackgroundResource = r15
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$MediaItem r1 = new androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$MediaItem
            r1.<init>(r10)
            r10.ActionBarOverlayLayout = r1
            r10.setPopupCallback = r15
            r8 = 2
            int[] r1 = new int[r8]
            r10.setMenu = r1
            int[] r1 = new int[r8]
            r10.setOverflowIcon = r1
            int[] r1 = new int[r8]
            r10.setItemInvoker = r1
            int[] r1 = new int[r8]
            r10.setShowingForActionMode = r1
            int[] r1 = new int[r8]
            r10.setTitle = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.setShortcut = r1
            androidx.recyclerview.widget.RecyclerView$2 r1 = new androidx.recyclerview.widget.RecyclerView$2
            r1.<init>()
            r10.AppCompatDialogFragment = r1
            androidx.recyclerview.widget.RecyclerView$1 r1 = new androidx.recyclerview.widget.RecyclerView$1
            r1.<init>()
            r10.setPresenter = r1
            if (r12 == 0) goto L_0x00d7
            int[] r1 = setPrimaryBackground
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1, r13, r15)
            boolean r2 = r1.getBoolean(r15, r9)
            r10.MediaSessionCompat$QueueItem = r2
            r1.recycle()
            goto L_0x00d9
        L_0x00d7:
            r10.MediaSessionCompat$QueueItem = r9
        L_0x00d9:
            r10.setScrollContainer(r9)
            r10.setFocusableInTouchMode(r9)
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r22)
            int r2 = r1.getScaledTouchSlop()
            r10.onMenuItemClick = r2
            float r2 = p040o.SearchView.SearchAutoComplete.MediaBrowserCompat$CustomActionResultReceiver(r1, r11)
            r10.setWindowTitle = r2
            float r2 = p040o.SearchView.SearchAutoComplete.read(r1, r11)
            r10.setExpandedActionViewsExclusive = r2
            int r2 = r1.getScaledMinimumFlingVelocity()
            r10.setChecked = r2
            int r1 = r1.getScaledMaximumFlingVelocity()
            r10.setOverlayMode = r1
            int r1 = r21.getOverScrollMode()
            if (r1 != r8) goto L_0x0109
            r1 = r9
            goto L_0x010a
        L_0x0109:
            r1 = r15
        L_0x010a:
            r10.setWillNotDraw(r1)
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat r1 = r10.AlertController$RecycleListView
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$read r2 = r10.ActionBarOverlayLayout
            r1.MediaDescriptionCompat = r2
            o.setTag r1 = new o.setTag
            androidx.recyclerview.widget.RecyclerView$8 r2 = new androidx.recyclerview.widget.RecyclerView$8
            r2.<init>()
            r1.<init>(r2)
            r10.MediaBrowserCompat$MediaItem = r1
            o.setMinWidth r1 = new o.setMinWidth
            androidx.recyclerview.widget.RecyclerView$4 r2 = new androidx.recyclerview.widget.RecyclerView$4
            r2.<init>()
            r1.<init>(r2)
            r10.MediaSessionCompat$ResultReceiverWrapper = r1
            int r1 = p040o.SwitchCompat.MediaMetadataCompat(r21)
            if (r1 != 0) goto L_0x0136
            r1 = 8
            p040o.SwitchCompat.read((android.view.View) r10, (int) r1)
        L_0x0136:
            int r1 = p040o.SwitchCompat.MediaBrowserCompat$MediaItem(r21)
            if (r1 != 0) goto L_0x013f
            p040o.SwitchCompat.write((android.view.View) r10, (int) r9)
        L_0x013f:
            android.content.Context r1 = r21.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r10.MediaBrowserCompat$SearchResultReceiver = r1
            o.setGuidelinePercent r1 = new o.setGuidelinePercent
            r1.<init>(r10)
            r10.setAccessibilityDelegateCompat(r1)
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r12 == 0) goto L_0x035f
            int[] r2 = p040o.ConstraintHelper.read.RecyclerView
            android.content.res.TypedArray r7 = r11.obtainStyledAttributes(r12, r2, r13, r15)
            int r2 = p040o.ConstraintHelper.read.RecyclerView_layoutManager
            java.lang.String r17 = r7.getString(r2)
            int r2 = p040o.ConstraintHelper.read.RecyclerView_android_descendantFocusability
            int r2 = r7.getInt(r2, r0)
            if (r2 != r0) goto L_0x0170
            r10.setDescendantFocusability(r1)
        L_0x0170:
            int r0 = p040o.ConstraintHelper.read.RecyclerView_fastScrollEnabled
            boolean r0 = r7.getBoolean(r0, r15)
            if (r0 == 0) goto L_0x01e5
            int r0 = p040o.ConstraintHelper.read.RecyclerView_fastScrollVerticalThumbDrawable
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r3 = r0
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            int r0 = p040o.ConstraintHelper.read.RecyclerView_fastScrollVerticalTrackDrawable
            android.graphics.drawable.Drawable r4 = r7.getDrawable(r0)
            int r0 = p040o.ConstraintHelper.read.RecyclerView_fastScrollHorizontalThumbDrawable
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r5 = r0
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5
            int r0 = p040o.ConstraintHelper.read.RecyclerView_fastScrollHorizontalTrackDrawable
            android.graphics.drawable.Drawable r6 = r7.getDrawable(r0)
            if (r3 == 0) goto L_0x01ca
            if (r4 == 0) goto L_0x01ca
            if (r5 == 0) goto L_0x01ca
            if (r6 == 0) goto L_0x01ca
            android.content.Context r0 = r21.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = p040o.ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.fastscroll_default_thickness
            int r18 = r0.getDimensionPixelSize(r1)
            int r1 = p040o.ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.fastscroll_minimum_range
            int r19 = r0.getDimensionPixelSize(r1)
            int r1 = p040o.ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.fastscroll_margin
            o.Constraints r2 = new o.Constraints
            int r0 = r0.getDimensionPixelOffset(r1)
            r1 = r2
            r2 = r21
            r20 = r7
            r7 = r18
            r18 = r8
            r8 = r19
            r9 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x01e9
        L_0x01ca:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Trying to set fast scroller without both required drawables."
            r0.append(r1)
            java.lang.String r1 = r21.read()
            r0.append(r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x01e5:
            r20 = r7
            r18 = r8
        L_0x01e9:
            r20.recycle()
            if (r17 == 0) goto L_0x0348
            java.lang.String r0 = r17.trim()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0348
            char r1 = r0.charAt(r15)
            r2 = 46
            if (r1 != r2) goto L_0x0215
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPackageName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0213:
            r1 = r0
            goto L_0x023b
        L_0x0215:
            java.lang.String r1 = "."
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x021e
            goto L_0x0213
        L_0x021e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r3 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r3 = r3.getPackage()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0213
        L_0x023b:
            boolean r0 = r21.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            if (r0 == 0) goto L_0x024a
            java.lang.Class r0 = r21.getClass()     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            goto L_0x024e
        L_0x024a:
            java.lang.ClassLoader r0 = r22.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
        L_0x024e:
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            java.lang.Class<androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver> r2 = androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver.class
            java.lang.Class r2 = r0.asSubclass(r2)     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            java.lang.Class<?>[] r0 = ActionBarContainer     // Catch:{ NoSuchMethodException -> 0x0276 }
            java.lang.reflect.Constructor r0 = r2.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0276 }
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0276 }
            r3[r15] = r11     // Catch:{ NoSuchMethodException -> 0x0276 }
            r4 = 1
            r3[r4] = r12     // Catch:{ NoSuchMethodException -> 0x0274 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r24)     // Catch:{ NoSuchMethodException -> 0x0274 }
            r3[r18] = r5     // Catch:{ NoSuchMethodException -> 0x0274 }
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ NoSuchMethodException -> 0x0274 }
            r3[r5] = r6     // Catch:{ NoSuchMethodException -> 0x0274 }
            goto L_0x0281
        L_0x0274:
            r0 = move-exception
            goto L_0x0278
        L_0x0276:
            r0 = move-exception
            r4 = 1
        L_0x0278:
            r3 = r0
            java.lang.Class[] r0 = new java.lang.Class[r15]     // Catch:{ NoSuchMethodException -> 0x028f }
            java.lang.reflect.Constructor r0 = r2.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x028f }
            r3 = r16
        L_0x0281:
            r0.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            java.lang.Object r0 = r0.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = (androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver) r0     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            r10.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            goto L_0x0349
        L_0x028f:
            r0 = move-exception
            r0.initCause(r3)     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            r3.<init>()     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            java.lang.String r4 = r23.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            r3.append(r4)     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            java.lang.String r4 = ": Error creating LayoutManager "
            r3.append(r4)     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            r3.append(r1)     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            java.lang.String r3 = r3.toString()     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            r2.<init>(r3, r0)     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x0329, InvocationTargetException -> 0x030c, InstantiationException -> 0x02ef, IllegalAccessException -> 0x02d0, ClassCastException -> 0x02b1 }
        L_0x02b1:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r23.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = ": Class is not a LayoutManager "
            r2.append(r3)
            r2.append(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x02d0:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r23.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = ": Cannot access non-public constructor "
            r2.append(r3)
            r2.append(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x02ef:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r23.getPositionDescription()
            r2.append(r3)
            r2.append(r14)
            r2.append(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x030c:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r23.getPositionDescription()
            r2.append(r3)
            r2.append(r14)
            r2.append(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0329:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r23.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = ": Unable to find LayoutManager "
            r2.append(r3)
            r2.append(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0348:
            r4 = 1
        L_0x0349:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x035d
            int[] r0 = setSplitBackground
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r0, r13, r15)
            boolean r9 = r0.getBoolean(r15, r4)
            r0.recycle()
            goto L_0x0363
        L_0x035d:
            r9 = r4
            goto L_0x0363
        L_0x035f:
            r4 = r9
            r10.setDescendantFocusability(r1)
        L_0x0363:
            r10.setNestedScrollingEnabled(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public final String read() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", layout:");
        sb.append(this.AppCompatActivity);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    public void setAccessibilityDelegateCompat(setGuidelinePercent setguidelinepercent) {
        this.MediaMetadataCompat = setguidelinepercent;
        SwitchCompat.read((View) this, (setIconifiedByDefault) setguidelinepercent);
    }

    public void setHasFixedSize(boolean z) {
        this.PlaybackStateCompat = z;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.MediaSessionCompat$QueueItem) {
            this.setCustomView = null;
            this.ActivityChooserView = null;
            this.ActionMenuPresenter$OverflowMenuButton = null;
            this.setMenuPrepared = null;
        }
        this.MediaSessionCompat$QueueItem = z;
        super.setClipToPadding(z);
        if (this.MediaSessionCompat$Token) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.MediaSessionCompat$QueueItem;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            } else {
                this.onMenuItemClick = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.onMenuItemClick = viewConfiguration.getScaledTouchSlop();
    }

    public void setAdapter(IconCompatParcelizer iconCompatParcelizer) {
        setLayoutFrozen(false);
        IconCompatParcelizer iconCompatParcelizer2 = this.MediaDescriptionCompat;
        if (iconCompatParcelizer2 != null) {
            iconCompatParcelizer2.IconCompatParcelizer.unregisterObserver(this.setUiOptions);
            this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this);
        }
        MediaDescriptionCompat();
        setTag settag = this.MediaBrowserCompat$MediaItem;
        settag.write(settag.MediaBrowserCompat$CustomActionResultReceiver);
        settag.write(settag.MediaDescriptionCompat);
        settag.write = 0;
        IconCompatParcelizer iconCompatParcelizer3 = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = iconCompatParcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.IconCompatParcelizer.registerObserver(this.setUiOptions);
            iconCompatParcelizer.write(this);
        }
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            recyclerView$MediaBrowserCompat$SearchResultReceiver.AlertController$RecycleListView();
        }
        RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper = this.setPadding;
        IconCompatParcelizer iconCompatParcelizer4 = this.MediaDescriptionCompat;
        recyclerView$MediaSessionCompat$ResultReceiverWrapper.write.clear();
        recyclerView$MediaSessionCompat$ResultReceiverWrapper.read();
        if (recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver == null) {
            recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver = new RecyclerView$MediaSessionCompat$QueueItem();
        }
        RecyclerView$MediaSessionCompat$QueueItem recyclerView$MediaSessionCompat$QueueItem = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver;
        if (iconCompatParcelizer3 != null) {
            recyclerView$MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver--;
        }
        if (recyclerView$MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver == 0) {
            for (int i = 0; i < recyclerView$MediaSessionCompat$QueueItem.write.size(); i++) {
                recyclerView$MediaSessionCompat$QueueItem.write.valueAt(i).MediaBrowserCompat$CustomActionResultReceiver.clear();
            }
        }
        if (iconCompatParcelizer4 != null) {
            recyclerView$MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver++;
        }
        this.ExpandedMenuView.f24x50fd9e4a = true;
        MediaBrowserCompat$CustomActionResultReceiver(false);
        requestLayout();
    }

    public final void MediaDescriptionCompat() {
        MediaMetadataCompat mediaMetadataCompat = this.AlertController$RecycleListView;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.write();
        }
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.setPadding);
            this.AppCompatActivity.IconCompatParcelizer(this.setPadding);
        }
        RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper = this.setPadding;
        recyclerView$MediaSessionCompat$ResultReceiverWrapper.write.clear();
        recyclerView$MediaSessionCompat$ResultReceiverWrapper.read();
    }

    public int getBaseline() {
        if (this.AppCompatActivity != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public void setLayoutManager(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver) {
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != this.AppCompatActivity) {
            if (this.ListMenuItemView != 0) {
                this.ListMenuItemView = 0;
                IconCompatParcelizer();
                MediaBrowserCompat$ItemReceiver(0);
            }
            IconCompatParcelizer();
            if (this.AppCompatActivity != null) {
                MediaMetadataCompat mediaMetadataCompat = this.AlertController$RecycleListView;
                if (mediaMetadataCompat != null) {
                    mediaMetadataCompat.write();
                }
                this.AppCompatActivity.MediaBrowserCompat$ItemReceiver(this.setPadding);
                this.AppCompatActivity.IconCompatParcelizer(this.setPadding);
                RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper = this.setPadding;
                recyclerView$MediaSessionCompat$ResultReceiverWrapper.write.clear();
                recyclerView$MediaSessionCompat$ResultReceiverWrapper.read();
                if (this.setHasDecor) {
                    RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver2 = this.AppCompatActivity;
                    RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper2 = this.setPadding;
                    recyclerView$MediaBrowserCompat$SearchResultReceiver2.AlertController$RecycleListView = false;
                    recyclerView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(this, recyclerView$MediaSessionCompat$ResultReceiverWrapper2);
                }
                this.AppCompatActivity.write((RecyclerView) null);
                this.AppCompatActivity = null;
            } else {
                RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper3 = this.setPadding;
                recyclerView$MediaSessionCompat$ResultReceiverWrapper3.write.clear();
                recyclerView$MediaSessionCompat$ResultReceiverWrapper3.read();
            }
            setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
            setMinWidth.read read2 = setminwidth.IconCompatParcelizer;
            read2.write = 0;
            setMinWidth.read read3 = read2.MediaBrowserCompat$ItemReceiver;
            if (read3 != null) {
                do {
                    read3.write = 0;
                    read3 = read3.MediaBrowserCompat$ItemReceiver;
                } while (read3 != null);
            }
            for (int size = setminwidth.MediaBrowserCompat$ItemReceiver.size() - 1; size >= 0; size--) {
                setminwidth.read.write(setminwidth.MediaBrowserCompat$ItemReceiver.get(size));
                setminwidth.MediaBrowserCompat$ItemReceiver.remove(size);
            }
            setminwidth.read.write();
            this.AppCompatActivity = recyclerView$MediaBrowserCompat$SearchResultReceiver;
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
                if (recyclerView$MediaBrowserCompat$SearchResultReceiver.setHasDecor == null) {
                    this.AppCompatActivity.write(this);
                    if (this.setHasDecor) {
                        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver3 = this.AppCompatActivity;
                        recyclerView$MediaBrowserCompat$SearchResultReceiver3.AlertController$RecycleListView = true;
                        recyclerView$MediaBrowserCompat$SearchResultReceiver3.read(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(recyclerView$MediaBrowserCompat$SearchResultReceiver);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(recyclerView$MediaBrowserCompat$SearchResultReceiver.setHasDecor.read());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.setPadding.MediaBrowserCompat$CustomActionResultReceiver();
            requestLayout();
        }
    }

    public void setOnFlingListener(RecyclerView$MediaSessionCompat$Token recyclerView$MediaSessionCompat$Token) {
        this.setExpandedFormat = recyclerView$MediaSessionCompat$Token;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        PlaybackStateCompat.CustomAction customAction = new PlaybackStateCompat.CustomAction(super.onSaveInstanceState());
        PlaybackStateCompat.CustomAction customAction2 = this.ActionMenuView;
        if (customAction2 != null) {
            customAction.read = customAction2.read;
        } else {
            RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
                customAction.read = recyclerView$MediaBrowserCompat$SearchResultReceiver.mo1437n_();
            } else {
                customAction.read = null;
            }
        }
        return customAction;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof PlaybackStateCompat.CustomAction)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        PlaybackStateCompat.CustomAction customAction = (PlaybackStateCompat.CustomAction) parcelable;
        this.ActionMenuView = customAction;
        super.onRestoreInstanceState(customAction.write);
        if (this.AppCompatActivity != null && this.ActionMenuView.read != null) {
            this.AppCompatActivity.IconCompatParcelizer(this.ActionMenuView.read);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: package-private */
    public void write(setContentView setcontentview) {
        View view = setcontentview.write;
        boolean z = false;
        boolean z2 = view.getParent() == this;
        this.setPadding.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem(view));
        if ((setcontentview.read & 256) != 0) {
            z = true;
        }
        if (z) {
            this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.MediaSessionCompat$ResultReceiverWrapper.read(view, -1, true);
        } else {
            setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
            int read2 = setminwidth.read.read(view);
            if (read2 >= 0) {
                setminwidth.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(read2);
                setminwidth.MediaBrowserCompat$ItemReceiver.add(view);
                setminwidth.read.IconCompatParcelizer(view);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void setRecycledViewPool(RecyclerView$MediaSessionCompat$QueueItem recyclerView$MediaSessionCompat$QueueItem) {
        RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper = this.setPadding;
        RecyclerView$MediaSessionCompat$QueueItem recyclerView$MediaSessionCompat$QueueItem2 = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver;
        if (recyclerView$MediaSessionCompat$QueueItem2 != null) {
            recyclerView$MediaSessionCompat$QueueItem2.MediaBrowserCompat$ItemReceiver--;
        }
        recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver = recyclerView$MediaSessionCompat$QueueItem;
        if (recyclerView$MediaSessionCompat$QueueItem != null && recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaDescriptionCompat.MediaDescriptionCompat != null) {
            recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver++;
        }
    }

    public void setViewCacheExtension(setBackgroundResource setbackgroundresource) {
        this.setPadding.MediaMetadataCompat = setbackgroundresource;
    }

    public void setItemViewCacheSize(int i) {
        RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper = this.setPadding;
        recyclerView$MediaSessionCompat$ResultReceiverWrapper.read = i;
        recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$MediaItem(int i) {
        if (i != this.ListMenuItemView) {
            this.ListMenuItemView = i;
            if (i != 2) {
                IconCompatParcelizer();
            }
            MediaBrowserCompat$ItemReceiver(i);
        }
    }

    public final void IconCompatParcelizer(RatingCompat ratingCompat, int i) {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            recyclerView$MediaBrowserCompat$SearchResultReceiver.read("Cannot add item decoration during a scroll  or layout");
        }
        if (this.setContentView.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.setContentView.add(ratingCompat);
        } else {
            this.setContentView.add(i, ratingCompat);
        }
        setBackgroundResource();
        requestLayout();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RatingCompat ratingCompat) {
        IconCompatParcelizer(ratingCompat, -1);
    }

    public final void IconCompatParcelizer(RatingCompat ratingCompat) {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            recyclerView$MediaBrowserCompat$SearchResultReceiver.read("Cannot remove item decoration during a scroll  or layout");
        }
        this.setContentView.remove(ratingCompat);
        if (this.setContentView.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        setBackgroundResource();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(RecyclerView$MediaBrowserCompat$ItemReceiver recyclerView$MediaBrowserCompat$ItemReceiver) {
        if (recyclerView$MediaBrowserCompat$ItemReceiver != this.setTitleOptional) {
            this.setTitleOptional = recyclerView$MediaBrowserCompat$ItemReceiver;
            setChildrenDrawingOrderEnabled(recyclerView$MediaBrowserCompat$ItemReceiver != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(ParcelableVolumeInfo parcelableVolumeInfo) {
        this.setOnMenuItemClickListener = parcelableVolumeInfo;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (!this.setCheckable) {
            if (this.ListMenuItemView != 0) {
                this.ListMenuItemView = 0;
                IconCompatParcelizer();
                MediaBrowserCompat$ItemReceiver(0);
            }
            IconCompatParcelizer();
            RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(int i) {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(i);
            awakenScrollBars();
        }
    }

    public void RatingCompat(int i) {
        if (!this.setCheckable) {
            RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                recyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(this, i);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int i, int i2) {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.setCheckable) {
            boolean write2 = recyclerView$MediaBrowserCompat$SearchResultReceiver.write();
            boolean read2 = this.AppCompatActivity.read();
            if (write2 || read2) {
                if (!write2) {
                    i = 0;
                }
                if (!read2) {
                    i2 = 0;
                }
                write(i, i2, (MotionEvent) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        setContentView setcontentview;
        if (!this.MediaSessionCompat$Token || this.f23x50fd9e4a) {
            setMeasureWithLargestChildEnabled.read("RV FullInvalidate");
            Keep();
            setMeasureWithLargestChildEnabled.MediaBrowserCompat$CustomActionResultReceiver();
            return;
        }
        boolean z = false;
        if (this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver.size() > 0) {
            if ((this.MediaBrowserCompat$MediaItem.write & 4) != 0) {
                if (!((this.MediaBrowserCompat$MediaItem.write & 11) != 0)) {
                    setMeasureWithLargestChildEnabled.read("RV PartialInvalidate");
                    int i = this.PlaybackStateCompat$CustomAction + 1;
                    this.PlaybackStateCompat$CustomAction = i;
                    if (i == 1 && !this.setCheckable) {
                        this.AppCompatViewInflater = false;
                    }
                    this.ActionMenuItemView++;
                    this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
                    if (!this.AppCompatViewInflater) {
                        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
                        int MediaBrowserCompat$CustomActionResultReceiver2 = setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= MediaBrowserCompat$CustomActionResultReceiver2) {
                                break;
                            }
                            setMinWidth setminwidth2 = this.MediaSessionCompat$ResultReceiverWrapper;
                            View MediaBrowserCompat$CustomActionResultReceiver3 = setminwidth2.read.MediaBrowserCompat$CustomActionResultReceiver(setminwidth2.MediaBrowserCompat$ItemReceiver(i2));
                            if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                                setcontentview = null;
                            } else {
                                setcontentview = ((MediaDescriptionCompat) MediaBrowserCompat$CustomActionResultReceiver3.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
                            }
                            if (setcontentview != null) {
                                if ((setcontentview.read & 128) != 0) {
                                    continue;
                                } else {
                                    if ((setcontentview.read & 2) != 0) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            i2++;
                        }
                        if (z) {
                            Keep();
                        } else {
                            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver();
                        }
                    }
                    write(true);
                    read(true);
                    setMeasureWithLargestChildEnabled.MediaBrowserCompat$CustomActionResultReceiver();
                    return;
                }
            }
            if (this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver.size() > 0) {
                z = true;
            }
            if (z) {
                setMeasureWithLargestChildEnabled.read("RV FullInvalidate");
                Keep();
                setMeasureWithLargestChildEnabled.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }

    private boolean write(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        write();
        if (this.MediaDescriptionCompat != null) {
            write(i7, i8, this.setTitle);
            int[] iArr = this.setTitle;
            int i9 = iArr[0];
            int i10 = iArr[1];
            i5 = i10;
            i4 = i9;
            i3 = i7 - i9;
            i6 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.setContentView.isEmpty()) {
            invalidate();
        }
        int i11 = i6;
        if (MediaBrowserCompat$CustomActionResultReceiver(i4, i5, i3, i6, this.setOverflowIcon, 0)) {
            int i12 = this.setHasNonEmbeddedTabs;
            int[] iArr2 = this.setOverflowIcon;
            this.setHasNonEmbeddedTabs = i12 - iArr2[0];
            this.setLogo -= iArr2[1];
            if (motionEvent2 != null) {
                motionEvent2.offsetLocation((float) iArr2[0], (float) iArr2[1]);
            }
            int[] iArr3 = this.setShowingForActionMode;
            int i13 = iArr3[0];
            int[] iArr4 = this.setOverflowIcon;
            iArr3[0] = i13 + iArr4[0];
            iArr3[1] = iArr3[1] + iArr4[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !setSubmitButtonEnabled.read(motionEvent2, 8194)) {
                MediaBrowserCompat$CustomActionResultReceiver(motionEvent.getX(), (float) i3, motionEvent.getY(), (float) i11);
            }
            IconCompatParcelizer(i, i2);
        }
        if (!(i4 == 0 && i5 == 0)) {
            MediaBrowserCompat$CustomActionResultReceiver(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i4 == 0 && i5 == 0) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollOffset() {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null && recyclerView$MediaBrowserCompat$SearchResultReceiver.write()) {
            return this.AppCompatActivity.write(this.ExpandedMenuView);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null && recyclerView$MediaBrowserCompat$SearchResultReceiver.write()) {
            return this.AppCompatActivity.MediaBrowserCompat$CustomActionResultReceiver(this.ExpandedMenuView);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null && recyclerView$MediaBrowserCompat$SearchResultReceiver.write()) {
            return this.AppCompatActivity.IconCompatParcelizer(this.ExpandedMenuView);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null && recyclerView$MediaBrowserCompat$SearchResultReceiver.read()) {
            return this.AppCompatActivity.MediaBrowserCompat$SearchResultReceiver(this.ExpandedMenuView);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null && recyclerView$MediaBrowserCompat$SearchResultReceiver.read()) {
            return this.AppCompatActivity.MediaBrowserCompat$ItemReceiver(this.ExpandedMenuView);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null && recyclerView$MediaBrowserCompat$SearchResultReceiver.read()) {
            return this.AppCompatActivity.MediaMetadataCompat(this.ExpandedMenuView);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void write(boolean z) {
        if (this.PlaybackStateCompat$CustomAction <= 0) {
            this.PlaybackStateCompat$CustomAction = 1;
        }
        if (!z && !this.setCheckable) {
            this.AppCompatViewInflater = false;
        }
        if (this.PlaybackStateCompat$CustomAction == 1) {
            if (z && this.AppCompatViewInflater && !this.setCheckable && this.AppCompatActivity != null && this.MediaDescriptionCompat != null) {
                Keep();
            }
            if (!this.setCheckable) {
                this.AppCompatViewInflater = false;
            }
        }
        this.PlaybackStateCompat$CustomAction--;
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.setCheckable) {
            MediaBrowserCompat$ItemReceiver("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.setCheckable = false;
                if (!(!this.AppCompatViewInflater || this.AppCompatActivity == null || this.MediaDescriptionCompat == null)) {
                    requestLayout();
                }
                this.AppCompatViewInflater = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
            this.setCheckable = true;
            this.setActionBarHideOffset = true;
            if (this.ListMenuItemView != 0) {
                this.ListMenuItemView = 0;
                IconCompatParcelizer();
                MediaBrowserCompat$ItemReceiver(0);
            }
            IconCompatParcelizer();
        }
    }

    public final void IconCompatParcelizer() {
        AppCompatActivity appCompatActivity = this.AbsActionBarView;
        RecyclerView.this.removeCallbacks(appCompatActivity);
        appCompatActivity.MediaBrowserCompat$ItemReceiver.abortAnimation();
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            recyclerView$MediaBrowserCompat$SearchResultReceiver.setHasDecor();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$CustomActionResultReceiver(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0020
            r6.AlertController$RecycleListView()
            android.widget.EdgeEffect r1 = r6.setMenuPrepared
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            p040o.Toolbar.IconCompatParcelizer(r1, r4, r9)
            goto L_0x0039
        L_0x0020:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003b
            r6.PlaybackStateCompat()
            android.widget.EdgeEffect r1 = r6.ActionMenuPresenter$OverflowMenuButton
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            p040o.Toolbar.IconCompatParcelizer(r1, r4, r9)
        L_0x0039:
            r9 = r3
            goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            r6.AppCompatDelegateImpl$ListMenuDecorView()
            android.widget.EdgeEffect r9 = r6.ActivityChooserView
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            p040o.Toolbar.IconCompatParcelizer(r9, r1, r7)
            goto L_0x0072
        L_0x0056:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            r6.PlaybackStateCompat$CustomAction()
            android.widget.EdgeEffect r9 = r6.setCustomView
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            p040o.Toolbar.IconCompatParcelizer(r9, r1, r2)
            goto L_0x0072
        L_0x0071:
            r3 = r9
        L_0x0072:
            if (r3 != 0) goto L_0x007c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            p040o.SwitchCompat.setItemInvoker(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(float, float, float, float):void");
    }

    private void MediaSessionCompat$ResultReceiverWrapper() {
        boolean z;
        EdgeEffect edgeEffect = this.setMenuPrepared;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.setMenuPrepared.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.ActivityChooserView;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.ActivityChooserView.isFinished();
        }
        EdgeEffect edgeEffect3 = this.ActionMenuPresenter$OverflowMenuButton;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.ActionMenuPresenter$OverflowMenuButton.isFinished();
        }
        EdgeEffect edgeEffect4 = this.setCustomView;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.setCustomView.isFinished();
        }
        if (z) {
            SwitchCompat.setItemInvoker(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.setMenuPrepared;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.setMenuPrepared.onRelease();
            z = this.setMenuPrepared.isFinished();
        }
        EdgeEffect edgeEffect2 = this.ActionMenuPresenter$OverflowMenuButton;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.ActionMenuPresenter$OverflowMenuButton.onRelease();
            z |= this.ActionMenuPresenter$OverflowMenuButton.isFinished();
        }
        EdgeEffect edgeEffect3 = this.ActivityChooserView;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.ActivityChooserView.onRelease();
            z |= this.ActivityChooserView.isFinished();
        }
        EdgeEffect edgeEffect4 = this.setCustomView;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.setCustomView.onRelease();
            z |= this.setCustomView.isFinished();
        }
        if (z) {
            SwitchCompat.setItemInvoker(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(int i, int i2) {
        if (i < 0) {
            AlertController$RecycleListView();
            this.setMenuPrepared.onAbsorb(-i);
        } else if (i > 0) {
            PlaybackStateCompat();
            this.ActionMenuPresenter$OverflowMenuButton.onAbsorb(i);
        }
        if (i2 < 0) {
            AppCompatDelegateImpl$ListMenuDecorView();
            this.ActivityChooserView.onAbsorb(-i2);
        } else if (i2 > 0) {
            PlaybackStateCompat$CustomAction();
            this.setCustomView.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            SwitchCompat.setItemInvoker(this);
        }
    }

    private void AlertController$RecycleListView() {
        if (this.setMenuPrepared == null) {
            EdgeEffect write2 = RecyclerView$MediaBrowserCompat$CustomActionResultReceiver.write(this);
            this.setMenuPrepared = write2;
            if (this.MediaSessionCompat$QueueItem) {
                int measuredHeight = getMeasuredHeight();
                int paddingTop = getPaddingTop();
                write2.setSize((measuredHeight - paddingTop) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                return;
            }
            write2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    private void PlaybackStateCompat() {
        if (this.ActionMenuPresenter$OverflowMenuButton == null) {
            EdgeEffect write2 = RecyclerView$MediaBrowserCompat$CustomActionResultReceiver.write(this);
            this.ActionMenuPresenter$OverflowMenuButton = write2;
            if (this.MediaSessionCompat$QueueItem) {
                int measuredHeight = getMeasuredHeight();
                int paddingTop = getPaddingTop();
                write2.setSize((measuredHeight - paddingTop) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                return;
            }
            write2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    private void AppCompatDelegateImpl$ListMenuDecorView() {
        if (this.ActivityChooserView == null) {
            EdgeEffect write2 = RecyclerView$MediaBrowserCompat$CustomActionResultReceiver.write(this);
            this.ActivityChooserView = write2;
            if (this.MediaSessionCompat$QueueItem) {
                int measuredWidth = getMeasuredWidth();
                int paddingLeft = getPaddingLeft();
                write2.setSize((measuredWidth - paddingLeft) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                return;
            }
            write2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    private void PlaybackStateCompat$CustomAction() {
        if (this.setCustomView == null) {
            EdgeEffect write2 = RecyclerView$MediaBrowserCompat$CustomActionResultReceiver.write(this);
            this.setCustomView = write2;
            if (this.MediaSessionCompat$QueueItem) {
                int measuredWidth = getMeasuredWidth();
                int paddingLeft = getPaddingLeft();
                write2.setSize((measuredWidth - paddingLeft) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                return;
            }
            write2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01c2, code lost:
        if (r8 > 0) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01e3, code lost:
        if (r10 > 0) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01e6, code lost:
        if (r8 < 0) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01e9, code lost:
        if (r10 < 0) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01f1, code lost:
        if ((r10 * r3) < 0) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01f9, code lost:
        if ((r10 * r3) > 0) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ea A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r0 = r13.MediaDescriptionCompat
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r13.AppCompatActivity
            if (r0 == 0) goto L_0x0019
            int r0 = r13.ActionMenuItemView
            if (r0 <= 0) goto L_0x0010
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            if (r0 != 0) goto L_0x0019
            boolean r0 = r13.setCheckable
            if (r0 != 0) goto L_0x0019
            r0 = r1
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 66
            r5 = 17
            r6 = 130(0x82, float:1.82E-43)
            r7 = 33
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x00a5
            if (r15 == r9) goto L_0x002e
            if (r15 != r1) goto L_0x00a5
        L_0x002e:
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r13.AppCompatActivity
            boolean r0 = r0.read()
            if (r0 == 0) goto L_0x004a
            if (r15 != r9) goto L_0x003a
            r0 = r6
            goto L_0x003b
        L_0x003a:
            r0 = r7
        L_0x003b:
            android.view.View r10 = r3.findNextFocus(r13, r14, r0)
            if (r10 != 0) goto L_0x0043
            r10 = r1
            goto L_0x0044
        L_0x0043:
            r10 = r2
        L_0x0044:
            boolean r11 = setTabContainer
            if (r11 == 0) goto L_0x004b
            r15 = r0
            goto L_0x004b
        L_0x004a:
            r10 = r2
        L_0x004b:
            if (r10 != 0) goto L_0x007b
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r13.AppCompatActivity
            boolean r0 = r0.write()
            if (r0 == 0) goto L_0x007b
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r13.AppCompatActivity
            androidx.recyclerview.widget.RecyclerView r0 = r0.setHasDecor
            int r0 = p040o.SwitchCompat.m3079x50fd9e4a(r0)
            if (r0 != r1) goto L_0x0061
            r0 = r1
            goto L_0x0062
        L_0x0061:
            r0 = r2
        L_0x0062:
            if (r15 != r9) goto L_0x0066
            r10 = r1
            goto L_0x0067
        L_0x0066:
            r10 = r2
        L_0x0067:
            r0 = r0 ^ r10
            if (r0 == 0) goto L_0x006c
            r0 = r4
            goto L_0x006d
        L_0x006c:
            r0 = r5
        L_0x006d:
            android.view.View r10 = r3.findNextFocus(r13, r14, r0)
            if (r10 != 0) goto L_0x0075
            r10 = r1
            goto L_0x0076
        L_0x0075:
            r10 = r2
        L_0x0076:
            boolean r11 = setTabContainer
            if (r11 == 0) goto L_0x007b
            r15 = r0
        L_0x007b:
            if (r10 == 0) goto L_0x00a0
            r13.write()
            android.view.View r0 = r13.write((android.view.View) r14)
            if (r0 != 0) goto L_0x0087
            return r8
        L_0x0087:
            int r0 = r13.PlaybackStateCompat$CustomAction
            int r0 = r0 + r1
            r13.PlaybackStateCompat$CustomAction = r0
            if (r0 != r1) goto L_0x0094
            boolean r0 = r13.setCheckable
            if (r0 != 0) goto L_0x0094
            r13.AppCompatViewInflater = r2
        L_0x0094:
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r13.AppCompatActivity
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r10 = r13.setPadding
            androidx.recyclerview.widget.RecyclerView$Keep r11 = r13.ExpandedMenuView
            r0.read(r14, r15, r10, r11)
            r13.write((boolean) r2)
        L_0x00a0:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00d3
        L_0x00a5:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00d2
            if (r0 == 0) goto L_0x00d2
            r13.write()
            android.view.View r0 = r13.write((android.view.View) r14)
            if (r0 != 0) goto L_0x00b7
            return r8
        L_0x00b7:
            int r0 = r13.PlaybackStateCompat$CustomAction
            int r0 = r0 + r1
            r13.PlaybackStateCompat$CustomAction = r0
            if (r0 != r1) goto L_0x00c4
            boolean r0 = r13.setCheckable
            if (r0 != 0) goto L_0x00c4
            r13.AppCompatViewInflater = r2
        L_0x00c4:
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r13.AppCompatActivity
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r3 = r13.setPadding
            androidx.recyclerview.widget.RecyclerView$Keep r10 = r13.ExpandedMenuView
            android.view.View r0 = r0.read(r14, r15, r3, r10)
            r13.write((boolean) r2)
            goto L_0x00d3
        L_0x00d2:
            r0 = r3
        L_0x00d3:
            if (r0 == 0) goto L_0x00ea
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00ea
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00e6
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00e6:
            r13.read((android.view.View) r0, (android.view.View) r8)
            return r14
        L_0x00ea:
            if (r0 == 0) goto L_0x00f5
            if (r0 != r13) goto L_0x00ef
            goto L_0x00f5
        L_0x00ef:
            android.view.View r3 = r13.write((android.view.View) r0)
            if (r3 != 0) goto L_0x00f8
        L_0x00f5:
            r1 = r2
            goto L_0x01fb
        L_0x00f8:
            if (r14 != 0) goto L_0x00fc
            goto L_0x01fb
        L_0x00fc:
            android.view.View r3 = r13.write((android.view.View) r14)
            if (r3 != 0) goto L_0x0104
            goto L_0x01fb
        L_0x0104:
            android.graphics.Rect r3 = r13.setVisibility
            int r8 = r14.getWidth()
            int r10 = r14.getHeight()
            r3.set(r2, r2, r8, r10)
            android.graphics.Rect r3 = r13.setOverflowReserved
            int r8 = r0.getWidth()
            int r10 = r0.getHeight()
            r3.set(r2, r2, r8, r10)
            android.graphics.Rect r3 = r13.setVisibility
            r13.offsetDescendantRectToMyCoords(r14, r3)
            android.graphics.Rect r3 = r13.setOverflowReserved
            r13.offsetDescendantRectToMyCoords(r0, r3)
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r3 = r13.AppCompatActivity
            androidx.recyclerview.widget.RecyclerView r3 = r3.setHasDecor
            int r3 = p040o.SwitchCompat.m3079x50fd9e4a(r3)
            r8 = -1
            if (r3 != r1) goto L_0x0135
            r3 = r8
            goto L_0x0136
        L_0x0135:
            r3 = r1
        L_0x0136:
            android.graphics.Rect r10 = r13.setVisibility
            int r10 = r10.left
            android.graphics.Rect r11 = r13.setOverflowReserved
            int r11 = r11.left
            if (r10 < r11) goto L_0x014a
            android.graphics.Rect r10 = r13.setVisibility
            int r10 = r10.right
            android.graphics.Rect r11 = r13.setOverflowReserved
            int r11 = r11.left
            if (r10 > r11) goto L_0x0156
        L_0x014a:
            android.graphics.Rect r10 = r13.setVisibility
            int r10 = r10.right
            android.graphics.Rect r11 = r13.setOverflowReserved
            int r11 = r11.right
            if (r10 >= r11) goto L_0x0156
            r10 = r1
            goto L_0x0177
        L_0x0156:
            android.graphics.Rect r10 = r13.setVisibility
            int r10 = r10.right
            android.graphics.Rect r11 = r13.setOverflowReserved
            int r11 = r11.right
            if (r10 > r11) goto L_0x016a
            android.graphics.Rect r10 = r13.setVisibility
            int r10 = r10.left
            android.graphics.Rect r11 = r13.setOverflowReserved
            int r11 = r11.right
            if (r10 < r11) goto L_0x0176
        L_0x016a:
            android.graphics.Rect r10 = r13.setVisibility
            int r10 = r10.left
            android.graphics.Rect r11 = r13.setOverflowReserved
            int r11 = r11.left
            if (r10 <= r11) goto L_0x0176
            r10 = r8
            goto L_0x0177
        L_0x0176:
            r10 = r2
        L_0x0177:
            android.graphics.Rect r11 = r13.setVisibility
            int r11 = r11.top
            android.graphics.Rect r12 = r13.setOverflowReserved
            int r12 = r12.top
            if (r11 < r12) goto L_0x018b
            android.graphics.Rect r11 = r13.setVisibility
            int r11 = r11.bottom
            android.graphics.Rect r12 = r13.setOverflowReserved
            int r12 = r12.top
            if (r11 > r12) goto L_0x0197
        L_0x018b:
            android.graphics.Rect r11 = r13.setVisibility
            int r11 = r11.bottom
            android.graphics.Rect r12 = r13.setOverflowReserved
            int r12 = r12.bottom
            if (r11 >= r12) goto L_0x0197
            r8 = r1
            goto L_0x01b6
        L_0x0197:
            android.graphics.Rect r11 = r13.setVisibility
            int r11 = r11.bottom
            android.graphics.Rect r12 = r13.setOverflowReserved
            int r12 = r12.bottom
            if (r11 > r12) goto L_0x01ab
            android.graphics.Rect r11 = r13.setVisibility
            int r11 = r11.top
            android.graphics.Rect r12 = r13.setOverflowReserved
            int r12 = r12.bottom
            if (r11 < r12) goto L_0x01b5
        L_0x01ab:
            android.graphics.Rect r11 = r13.setVisibility
            int r11 = r11.top
            android.graphics.Rect r12 = r13.setOverflowReserved
            int r12 = r12.top
            if (r11 > r12) goto L_0x01b6
        L_0x01b5:
            r8 = r2
        L_0x01b6:
            if (r15 == r1) goto L_0x01f4
            if (r15 == r9) goto L_0x01ec
            if (r15 == r5) goto L_0x01e9
            if (r15 == r7) goto L_0x01e6
            if (r15 == r4) goto L_0x01e3
            if (r15 != r6) goto L_0x01c5
            if (r8 <= 0) goto L_0x00f5
            goto L_0x01fb
        L_0x01c5:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Invalid direction: "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r15 = r13.read()
            r14.append(r15)
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r15.<init>(r14)
            throw r15
        L_0x01e3:
            if (r10 <= 0) goto L_0x00f5
            goto L_0x01fb
        L_0x01e6:
            if (r8 >= 0) goto L_0x00f5
            goto L_0x01fb
        L_0x01e9:
            if (r10 >= 0) goto L_0x00f5
            goto L_0x01fb
        L_0x01ec:
            if (r8 > 0) goto L_0x01fb
            if (r8 != 0) goto L_0x00f5
            int r10 = r10 * r3
            if (r10 < 0) goto L_0x00f5
            goto L_0x01fb
        L_0x01f4:
            if (r8 < 0) goto L_0x01fb
            if (r8 != 0) goto L_0x00f5
            int r10 = r10 * r3
            if (r10 > 0) goto L_0x00f5
        L_0x01fb:
            if (r1 != 0) goto L_0x0201
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x0201:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public void requestChildFocus(View view, View view2) {
        PlaybackStateCompat playbackStateCompat = this.AppCompatActivity.AppCompatDelegateImpl$ListMenuDecorView;
        boolean z = true;
        if (!(playbackStateCompat != null && playbackStateCompat.RatingCompat)) {
            if (!(this.ActionMenuItemView > 0)) {
                z = false;
            }
        }
        if (!z && view2 != null) {
            read(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private void read(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.setVisibility.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof MediaDescriptionCompat) {
            MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) layoutParams;
            if (!mediaDescriptionCompat.read) {
                Rect rect = mediaDescriptionCompat.IconCompatParcelizer;
                this.setVisibility.left -= rect.left;
                this.setVisibility.right += rect.right;
                this.setVisibility.top -= rect.top;
                this.setVisibility.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.setVisibility);
            offsetRectIntoDescendantCoords(view, this.setVisibility);
        }
        this.AppCompatActivity.write(this, view, this.setVisibility, !this.MediaSessionCompat$Token, view2 == null);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.AppCompatActivity.write(this, view, rect, z, false);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ActionMenuItemView = 0;
        this.setHasDecor = true;
        this.MediaSessionCompat$Token = this.MediaSessionCompat$Token && !isLayoutRequested();
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            recyclerView$MediaBrowserCompat$SearchResultReceiver.AlertController$RecycleListView = true;
            recyclerView$MediaBrowserCompat$SearchResultReceiver.read(this);
        }
        this.setPopupCallback = false;
        if (IconCompatParcelizer) {
            setOptimizationLevel setoptimizationlevel = setOptimizationLevel.MediaBrowserCompat$CustomActionResultReceiver.get();
            this.Keep = setoptimizationlevel;
            if (setoptimizationlevel == null) {
                this.Keep = new setOptimizationLevel();
                Display MediaDescriptionCompat2 = SwitchCompat.MediaDescriptionCompat(this);
                float f = 60.0f;
                if (!isInEditMode() && MediaDescriptionCompat2 != null) {
                    float refreshRate = MediaDescriptionCompat2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                this.Keep.write = (long) (1.0E9f / f);
                setOptimizationLevel.MediaBrowserCompat$CustomActionResultReceiver.set(this.Keep);
            }
            this.Keep.read.add(this);
        }
    }

    public void onDetachedFromWindow() {
        setOptimizationLevel setoptimizationlevel;
        super.onDetachedFromWindow();
        MediaMetadataCompat mediaMetadataCompat = this.AlertController$RecycleListView;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.write();
        }
        if (this.ListMenuItemView != 0) {
            this.ListMenuItemView = 0;
            IconCompatParcelizer();
            MediaBrowserCompat$ItemReceiver(0);
        }
        IconCompatParcelizer();
        this.setHasDecor = false;
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper = this.setPadding;
            recyclerView$MediaBrowserCompat$SearchResultReceiver.AlertController$RecycleListView = false;
            recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, recyclerView$MediaSessionCompat$ResultReceiverWrapper);
        }
        this.setShortcut.clear();
        removeCallbacks(this.AppCompatDialogFragment);
        C1539x5a6c48da.read();
        if (IconCompatParcelizer && (setoptimizationlevel = this.Keep) != null) {
            setoptimizationlevel.read.remove(this);
            this.Keep = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.setHasDecor;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.setCheckable) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.RatingCompat = null;
        }
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            C0065xe743b54a recyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.mOnItemTouchListeners.get(i);
            if (recyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.IconCompatParcelizer(this, motionEvent) && action != 3) {
                this.RatingCompat = recyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            MediaBrowserCompat$SearchResultReceiver();
            return true;
        }
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null) {
            return false;
        }
        boolean write2 = recyclerView$MediaBrowserCompat$SearchResultReceiver.write();
        boolean read2 = this.AppCompatActivity.read();
        if (this.setPopupTheme == null) {
            this.setPopupTheme = VelocityTracker.obtain();
        }
        this.setPopupTheme.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.setActionBarHideOffset) {
                this.setActionBarHideOffset = false;
            }
            this.setMenuCallbacks = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.setHasNonEmbeddedTabs = x;
            this.setActionBarVisibilityCallback = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.setLogo = y;
            this.setHideOnContentScrollEnabled = y;
            if (this.ListMenuItemView == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                MediaBrowserCompat$MediaItem(1);
            }
            int[] iArr = this.setShowingForActionMode;
            iArr[1] = 0;
            iArr[0] = 0;
            if (read2) {
                write2 |= true;
            }
            if (this.setForceShowIcon == null) {
                this.setForceShowIcon = new setBackgroundDrawable.write(this);
            }
            this.setForceShowIcon.MediaBrowserCompat$CustomActionResultReceiver(write2 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.setPopupTheme.clear();
            if (this.setForceShowIcon == null) {
                this.setForceShowIcon = new setBackgroundDrawable.write(this);
            }
            this.setForceShowIcon.write(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.setMenuCallbacks);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.setMenuCallbacks);
                sb.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sb.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.ListMenuItemView != 1) {
                int i2 = this.setActionBarVisibilityCallback;
                int i3 = this.setHideOnContentScrollEnabled;
                if (!write2 || Math.abs(x2 - i2) <= this.onMenuItemClick) {
                    z2 = false;
                } else {
                    this.setHasNonEmbeddedTabs = x2;
                    z2 = true;
                }
                if (read2 && Math.abs(y2 - i3) > this.onMenuItemClick) {
                    this.setLogo = y2;
                    z2 = true;
                }
                if (z2) {
                    MediaBrowserCompat$MediaItem(1);
                }
            }
        } else if (actionMasked == 3) {
            MediaBrowserCompat$SearchResultReceiver();
        } else if (actionMasked == 5) {
            this.setMenuCallbacks = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.setHasNonEmbeddedTabs = x3;
            this.setActionBarVisibilityCallback = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.setLogo = y3;
            this.setHideOnContentScrollEnabled = y3;
        } else if (actionMasked == 6) {
            MediaBrowserCompat$ItemReceiver(motionEvent);
        }
        if (this.ListMenuItemView == 1) {
            return true;
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).MediaBrowserCompat$CustomActionResultReceiver(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x026e, code lost:
        if (r0 != false) goto L_0x0273;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            r22 = this;
            r6 = r22
            r0 = r23
            boolean r1 = r6.setCheckable
            r7 = 0
            if (r1 != 0) goto L_0x02c8
            boolean r1 = r6.setActionBarHideOffset
            if (r1 != 0) goto L_0x02c8
            int r1 = r23.getAction()
            androidx.recyclerview.widget.RecyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver r2 = r6.RatingCompat
            r3 = 3
            r8 = 1
            if (r2 == 0) goto L_0x0028
            r4 = 0
            if (r1 != 0) goto L_0x001d
            r6.RatingCompat = r4
            goto L_0x0028
        L_0x001d:
            r2.MediaBrowserCompat$CustomActionResultReceiver(r6, r0)
            if (r1 == r3) goto L_0x0024
            if (r1 != r8) goto L_0x0026
        L_0x0024:
            r6.RatingCompat = r4
        L_0x0026:
            r1 = r8
            goto L_0x0048
        L_0x0028:
            if (r1 == 0) goto L_0x0047
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver> r1 = r6.mOnItemTouchListeners
            int r1 = r1.size()
            r2 = r7
        L_0x0031:
            if (r2 >= r1) goto L_0x0047
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver> r4 = r6.mOnItemTouchListeners
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.RecyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver r4 = (androidx.recyclerview.widget.C0065xe743b54a) r4
            boolean r5 = r4.IconCompatParcelizer(r6, r0)
            if (r5 == 0) goto L_0x0044
            r6.RatingCompat = r4
            goto L_0x0026
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x0031
        L_0x0047:
            r1 = r7
        L_0x0048:
            if (r1 == 0) goto L_0x004e
            r22.MediaBrowserCompat$SearchResultReceiver()
            return r8
        L_0x004e:
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r1 = r6.AppCompatActivity
            if (r1 != 0) goto L_0x0053
            return r7
        L_0x0053:
            boolean r9 = r1.write()
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r1 = r6.AppCompatActivity
            boolean r10 = r1.read()
            android.view.VelocityTracker r1 = r6.setPopupTheme
            if (r1 != 0) goto L_0x0067
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r6.setPopupTheme = r1
        L_0x0067:
            android.view.MotionEvent r11 = android.view.MotionEvent.obtain(r23)
            int r1 = r23.getActionMasked()
            int r2 = r23.getActionIndex()
            if (r1 != 0) goto L_0x007b
            int[] r4 = r6.setShowingForActionMode
            r4[r8] = r7
            r4[r7] = r7
        L_0x007b:
            int[] r4 = r6.setShowingForActionMode
            r5 = r4[r7]
            float r5 = (float) r5
            r4 = r4[r8]
            float r4 = (float) r4
            r11.offsetLocation(r5, r4)
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x028f
            java.lang.String r5 = "RecyclerView"
            r12 = 2
            if (r1 == r8) goto L_0x018e
            if (r1 == r12) goto L_0x00c1
            if (r1 == r3) goto L_0x00bc
            r3 = 5
            if (r1 == r3) goto L_0x00a0
            r2 = 6
            if (r1 == r2) goto L_0x009b
            goto L_0x02bd
        L_0x009b:
            r22.MediaBrowserCompat$ItemReceiver((android.view.MotionEvent) r23)
            goto L_0x02bd
        L_0x00a0:
            int r1 = r0.getPointerId(r2)
            r6.setMenuCallbacks = r1
            float r1 = r0.getX(r2)
            float r1 = r1 + r4
            int r1 = (int) r1
            r6.setHasNonEmbeddedTabs = r1
            r6.setActionBarVisibilityCallback = r1
            float r0 = r0.getY(r2)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.setLogo = r0
            r6.setHideOnContentScrollEnabled = r0
            goto L_0x02bd
        L_0x00bc:
            r22.MediaBrowserCompat$SearchResultReceiver()
            goto L_0x02bd
        L_0x00c1:
            int r1 = r6.setMenuCallbacks
            int r1 = r0.findPointerIndex(r1)
            if (r1 >= 0) goto L_0x00e5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.setMenuCallbacks
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r5, r0)
            return r7
        L_0x00e5:
            float r2 = r0.getX(r1)
            float r2 = r2 + r4
            int r12 = (int) r2
            float r0 = r0.getY(r1)
            float r0 = r0 + r4
            int r13 = (int) r0
            int r0 = r6.setHasNonEmbeddedTabs
            int r14 = r0 - r12
            int r0 = r6.setLogo
            int r15 = r0 - r13
            int[] r3 = r6.setItemInvoker
            int[] r4 = r6.setOverflowIcon
            r5 = 0
            r0 = r22
            r1 = r14
            r2 = r15
            boolean r0 = r0.write(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x012d
            int[] r0 = r6.setItemInvoker
            r1 = r0[r7]
            int r14 = r14 - r1
            r0 = r0[r8]
            int r15 = r15 - r0
            int[] r0 = r6.setOverflowIcon
            r1 = r0[r7]
            float r1 = (float) r1
            r0 = r0[r8]
            float r0 = (float) r0
            r11.offsetLocation(r1, r0)
            int[] r0 = r6.setShowingForActionMode
            r1 = r0[r7]
            int[] r2 = r6.setOverflowIcon
            r3 = r2[r7]
            int r1 = r1 + r3
            r0[r7] = r1
            r1 = r0[r8]
            r2 = r2[r8]
            int r1 = r1 + r2
            r0[r8] = r1
        L_0x012d:
            int r0 = r6.ListMenuItemView
            if (r0 == r8) goto L_0x0158
            if (r9 == 0) goto L_0x0142
            int r0 = java.lang.Math.abs(r14)
            int r1 = r6.onMenuItemClick
            if (r0 <= r1) goto L_0x0142
            if (r14 <= 0) goto L_0x013f
            int r14 = r14 - r1
            goto L_0x0140
        L_0x013f:
            int r14 = r14 + r1
        L_0x0140:
            r0 = r8
            goto L_0x0143
        L_0x0142:
            r0 = r7
        L_0x0143:
            if (r10 == 0) goto L_0x0153
            int r1 = java.lang.Math.abs(r15)
            int r2 = r6.onMenuItemClick
            if (r1 <= r2) goto L_0x0153
            if (r15 <= 0) goto L_0x0151
            int r15 = r15 - r2
            goto L_0x0152
        L_0x0151:
            int r15 = r15 + r2
        L_0x0152:
            r0 = r8
        L_0x0153:
            if (r0 == 0) goto L_0x0158
            r6.MediaBrowserCompat$MediaItem((int) r8)
        L_0x0158:
            int r0 = r6.ListMenuItemView
            if (r0 != r8) goto L_0x02bd
            int[] r0 = r6.setOverflowIcon
            r1 = r0[r7]
            int r12 = r12 - r1
            r6.setHasNonEmbeddedTabs = r12
            r0 = r0[r8]
            int r13 = r13 - r0
            r6.setLogo = r13
            if (r9 == 0) goto L_0x016c
            r0 = r14
            goto L_0x016d
        L_0x016c:
            r0 = r7
        L_0x016d:
            if (r10 == 0) goto L_0x0171
            r1 = r15
            goto L_0x0172
        L_0x0171:
            r1 = r7
        L_0x0172:
            boolean r0 = r6.write((int) r0, (int) r1, (android.view.MotionEvent) r11)
            if (r0 == 0) goto L_0x017f
            android.view.ViewParent r0 = r22.getParent()
            r0.requestDisallowInterceptTouchEvent(r8)
        L_0x017f:
            o.setOptimizationLevel r0 = r6.Keep
            if (r0 == 0) goto L_0x02bd
            if (r14 != 0) goto L_0x0187
            if (r15 == 0) goto L_0x02bd
        L_0x0187:
            o.setOptimizationLevel r0 = r6.Keep
            r0.write(r6, r14, r15)
            goto L_0x02bd
        L_0x018e:
            android.view.VelocityTracker r0 = r6.setPopupTheme
            r0.addMovement(r11)
            android.view.VelocityTracker r0 = r6.setPopupTheme
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.setOverlayMode
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r9 == 0) goto L_0x01aa
            android.view.VelocityTracker r1 = r6.setPopupTheme
            int r2 = r6.setMenuCallbacks
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x01ab
        L_0x01aa:
            r1 = r0
        L_0x01ab:
            if (r10 == 0) goto L_0x01b7
            android.view.VelocityTracker r2 = r6.setPopupTheme
            int r3 = r6.setMenuCallbacks
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x01b8
        L_0x01b7:
            r2 = r0
        L_0x01b8:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01c0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0270
        L_0x01c0:
            int r0 = (int) r1
            int r1 = (int) r2
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r2 = r6.AppCompatActivity
            if (r2 != 0) goto L_0x01cd
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r5, r0)
            goto L_0x026d
        L_0x01cd:
            boolean r3 = r6.setCheckable
            if (r3 != 0) goto L_0x026d
            boolean r2 = r2.write()
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r3 = r6.AppCompatActivity
            boolean r3 = r3.read()
            if (r2 == 0) goto L_0x01e5
            int r4 = java.lang.Math.abs(r0)
            int r5 = r6.setChecked
            if (r4 >= r5) goto L_0x01e6
        L_0x01e5:
            r0 = r7
        L_0x01e6:
            if (r3 == 0) goto L_0x01f0
            int r4 = java.lang.Math.abs(r1)
            int r5 = r6.setChecked
            if (r4 >= r5) goto L_0x01f1
        L_0x01f0:
            r1 = r7
        L_0x01f1:
            if (r0 != 0) goto L_0x01f5
            if (r1 == 0) goto L_0x026d
        L_0x01f5:
            float r4 = (float) r0
            float r5 = (float) r1
            boolean r9 = r6.dispatchNestedPreFling(r4, r5)
            if (r9 != 0) goto L_0x026d
            if (r2 != 0) goto L_0x0203
            if (r3 != 0) goto L_0x0203
            r9 = r7
            goto L_0x0204
        L_0x0203:
            r9 = r8
        L_0x0204:
            r6.dispatchNestedFling(r4, r5, r9)
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$Token r4 = r6.setExpandedFormat
            if (r4 == 0) goto L_0x0213
            boolean r4 = r4.IconCompatParcelizer(r0, r1)
            if (r4 == 0) goto L_0x0213
        L_0x0211:
            r0 = r8
            goto L_0x026e
        L_0x0213:
            if (r9 == 0) goto L_0x026d
            if (r3 == 0) goto L_0x0219
            r2 = r2 | 2
        L_0x0219:
            o.setBackgroundDrawable$write r3 = r6.setForceShowIcon
            if (r3 != 0) goto L_0x0224
            o.setBackgroundDrawable$write r3 = new o.setBackgroundDrawable$write
            r3.<init>(r6)
            r6.setForceShowIcon = r3
        L_0x0224:
            o.setBackgroundDrawable$write r3 = r6.setForceShowIcon
            r3.MediaBrowserCompat$CustomActionResultReceiver(r2, r8)
            int r2 = r6.setOverlayMode
            int r3 = -r2
            int r0 = java.lang.Math.min(r0, r2)
            int r16 = java.lang.Math.max(r3, r0)
            int r0 = r6.setOverlayMode
            int r2 = -r0
            int r0 = java.lang.Math.min(r1, r0)
            int r17 = java.lang.Math.max(r2, r0)
            androidx.recyclerview.widget.RecyclerView$AppCompatActivity r0 = r6.AbsActionBarView
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            r1.MediaBrowserCompat$MediaItem((int) r12)
            r0.read = r7
            r0.MediaBrowserCompat$CustomActionResultReceiver = r7
            android.widget.OverScroller r13 = r0.MediaBrowserCompat$ItemReceiver
            r14 = 0
            r15 = 0
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = 2147483647(0x7fffffff, float:NaN)
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = 2147483647(0x7fffffff, float:NaN)
            r13.fling(r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = r0.IconCompatParcelizer
            if (r1 == 0) goto L_0x0262
            r0.write = r8
            goto L_0x0211
        L_0x0262:
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            r1.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            p040o.SwitchCompat.MediaBrowserCompat$ItemReceiver((android.view.View) r1, (java.lang.Runnable) r0)
            goto L_0x0211
        L_0x026d:
            r0 = r7
        L_0x026e:
            if (r0 != 0) goto L_0x0273
        L_0x0270:
            r6.MediaBrowserCompat$MediaItem((int) r7)
        L_0x0273:
            android.view.VelocityTracker r0 = r6.setPopupTheme
            if (r0 == 0) goto L_0x027a
            r0.clear()
        L_0x027a:
            o.setBackgroundDrawable$write r0 = r6.setForceShowIcon
            if (r0 != 0) goto L_0x0285
            o.setBackgroundDrawable$write r0 = new o.setBackgroundDrawable$write
            r0.<init>(r6)
            r6.setForceShowIcon = r0
        L_0x0285:
            o.setBackgroundDrawable$write r0 = r6.setForceShowIcon
            r0.write(r7)
            r22.MediaSessionCompat$ResultReceiverWrapper()
            r7 = r8
            goto L_0x02bd
        L_0x028f:
            int r1 = r0.getPointerId(r7)
            r6.setMenuCallbacks = r1
            float r1 = r23.getX()
            float r1 = r1 + r4
            int r1 = (int) r1
            r6.setHasNonEmbeddedTabs = r1
            r6.setActionBarVisibilityCallback = r1
            float r0 = r23.getY()
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.setLogo = r0
            r6.setHideOnContentScrollEnabled = r0
            if (r10 == 0) goto L_0x02ad
            r9 = r9 | 2
        L_0x02ad:
            o.setBackgroundDrawable$write r0 = r6.setForceShowIcon
            if (r0 != 0) goto L_0x02b8
            o.setBackgroundDrawable$write r0 = new o.setBackgroundDrawable$write
            r0.<init>(r6)
            r6.setForceShowIcon = r0
        L_0x02b8:
            o.setBackgroundDrawable$write r0 = r6.setForceShowIcon
            r0.MediaBrowserCompat$CustomActionResultReceiver(r9, r7)
        L_0x02bd:
            if (r7 != 0) goto L_0x02c4
            android.view.VelocityTracker r0 = r6.setPopupTheme
            r0.addMovement(r11)
        L_0x02c4:
            r11.recycle()
            return r8
        L_0x02c8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void MediaBrowserCompat$ItemReceiver(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.setMenuCallbacks) {
            int i = actionIndex == 0 ? 1 : 0;
            this.setMenuCallbacks = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.setHasNonEmbeddedTabs = x;
            this.setActionBarVisibilityCallback = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.setLogo = y;
            this.setHideOnContentScrollEnabled = y;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.AppCompatActivity != null && !this.setCheckable && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.AppCompatActivity.read() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.AppCompatActivity.write()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == BitmapDescriptorFactory.HUE_RED && f == BitmapDescriptorFactory.HUE_RED)) {
                        write((int) (f * this.setWindowTitle), (int) (f2 * this.setExpandedActionViewsExclusive), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    f = motionEvent.getAxisValue(26);
                    if (this.AppCompatActivity.read()) {
                        f2 = -f;
                    } else if (this.AppCompatActivity.write()) {
                        f2 = 0.0f;
                        write((int) (f * this.setWindowTitle), (int) (f2 * this.setExpandedActionViewsExclusive), motionEvent);
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                write((int) (f * this.setWindowTitle), (int) (f2 * this.setExpandedActionViewsExclusive), motionEvent);
            }
            f = 0.0f;
            write((int) (f * this.setWindowTitle), (int) (f2 * this.setExpandedActionViewsExclusive), motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null) {
            read(i, i2);
            return;
        }
        boolean z = false;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver.mo1438o_()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.AppCompatActivity.setHasDecor.read(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.MediaDescriptionCompat != null) {
                if (this.ExpandedMenuView.MediaMetadataCompat == 1) {
                    MediaBrowserCompat$MediaItem();
                }
                this.AppCompatActivity.read(i, i2);
                this.ExpandedMenuView.MediaBrowserCompat$SearchResultReceiver = true;
                RatingCompat();
                this.AppCompatActivity.MediaBrowserCompat$CustomActionResultReceiver(i, i2);
                if (this.AppCompatActivity.MediaSessionCompat$Token()) {
                    this.AppCompatActivity.read(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.ExpandedMenuView.MediaBrowserCompat$SearchResultReceiver = true;
                    RatingCompat();
                    this.AppCompatActivity.MediaBrowserCompat$CustomActionResultReceiver(i, i2);
                }
            }
        } else if (this.PlaybackStateCompat) {
            this.AppCompatActivity.setHasDecor.read(i, i2);
        } else {
            if (this.ParcelableVolumeInfo) {
                int i3 = this.PlaybackStateCompat$CustomAction + 1;
                this.PlaybackStateCompat$CustomAction = i3;
                if (i3 == 1 && !this.setCheckable) {
                    this.AppCompatViewInflater = false;
                }
                this.ActionMenuItemView++;
                ParcelableVolumeInfo();
                read(true);
                if (this.ExpandedMenuView.RatingCompat) {
                    this.ExpandedMenuView.MediaBrowserCompat$ItemReceiver = true;
                } else {
                    this.MediaBrowserCompat$MediaItem.read();
                    this.ExpandedMenuView.MediaBrowserCompat$ItemReceiver = false;
                }
                this.ParcelableVolumeInfo = false;
                write(false);
            } else if (this.ExpandedMenuView.RatingCompat) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            IconCompatParcelizer iconCompatParcelizer = this.MediaDescriptionCompat;
            if (iconCompatParcelizer != null) {
                this.ExpandedMenuView.MediaBrowserCompat$MediaItem = iconCompatParcelizer.IconCompatParcelizer();
            } else {
                this.ExpandedMenuView.MediaBrowserCompat$MediaItem = 0;
            }
            int i4 = this.PlaybackStateCompat$CustomAction + 1;
            this.PlaybackStateCompat$CustomAction = i4;
            if (i4 == 1 && !this.setCheckable) {
                this.AppCompatViewInflater = false;
            }
            this.AppCompatActivity.setHasDecor.read(i, i2);
            write(false);
            this.ExpandedMenuView.MediaBrowserCompat$ItemReceiver = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(int i, int i2) {
        setMeasuredDimension(RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(i, getPaddingLeft() + getPaddingRight(), SwitchCompat.MediaSessionCompat$Token(this)), RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(i2, getPaddingTop() + getPaddingBottom(), SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(this)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.setCustomView = null;
            this.ActivityChooserView = null;
            this.ActionMenuPresenter$OverflowMenuButton = null;
            this.setMenuPrepared = null;
        }
    }

    public void setItemAnimator(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadataCompat mediaMetadataCompat2 = this.AlertController$RecycleListView;
        if (mediaMetadataCompat2 != null) {
            mediaMetadataCompat2.write();
            this.AlertController$RecycleListView.MediaDescriptionCompat = null;
        }
        this.AlertController$RecycleListView = mediaMetadataCompat;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.MediaDescriptionCompat = this.ActionBarOverlayLayout;
        }
    }

    public final void read(boolean z) {
        int i = this.ActionMenuItemView - 1;
        this.ActionMenuItemView = i;
        if (i <= 0) {
            this.ActionMenuItemView = 0;
            if (z) {
                MediaMetadataCompat();
                setHasDecor();
            }
        }
    }

    private void MediaMetadataCompat() {
        int i = this.setSubtitle;
        boolean z = false;
        this.setSubtitle = 0;
        if (i != 0) {
            AccessibilityManager accessibilityManager = this.MediaBrowserCompat$SearchResultReceiver;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                z = true;
            }
            if (z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(2048);
                setThumbTextPadding.MediaBrowserCompat$CustomActionResultReceiver(obtain, i);
                sendAccessibilityEventUnchecked(obtain);
            }
        }
    }

    private void ParcelableVolumeInfo() {
        boolean z = false;
        if (this.f23x50fd9e4a) {
            setTag settag = this.MediaBrowserCompat$MediaItem;
            settag.write(settag.MediaBrowserCompat$CustomActionResultReceiver);
            settag.write(settag.MediaDescriptionCompat);
            settag.write = 0;
            if (this.setTransitioning) {
                this.AppCompatActivity.mo1406p_();
            }
        }
        if (this.AlertController$RecycleListView != null && this.AppCompatActivity.mo1407q_()) {
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            this.MediaBrowserCompat$MediaItem.read();
        }
        boolean z2 = this.AppCompatDelegateImpl$ListMenuDecorView || this.setBackgroundResource;
        this.ExpandedMenuView.MediaSessionCompat$QueueItem = this.MediaSessionCompat$Token && this.AlertController$RecycleListView != null && (this.f23x50fd9e4a || z2 || this.AppCompatActivity.AppCompatActivity) && (!this.f23x50fd9e4a || this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver);
        Keep keep = this.ExpandedMenuView;
        if (keep.MediaSessionCompat$QueueItem && z2 && !this.f23x50fd9e4a) {
            if (this.AlertController$RecycleListView != null && this.AppCompatActivity.mo1407q_()) {
                z = true;
            }
        }
        keep.RatingCompat = z;
    }

    private void Keep() {
        if (this.MediaDescriptionCompat == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.AppCompatActivity == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            boolean z = false;
            this.ExpandedMenuView.MediaBrowserCompat$SearchResultReceiver = false;
            if (this.ExpandedMenuView.MediaMetadataCompat == 1) {
                MediaBrowserCompat$MediaItem();
            } else {
                setTag settag = this.MediaBrowserCompat$MediaItem;
                if (!settag.MediaDescriptionCompat.isEmpty() && !settag.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
                    z = true;
                }
                if (!z && this.AppCompatActivity.setBackgroundResource == getWidth() && this.AppCompatActivity.ParcelableVolumeInfo == getHeight()) {
                    this.AppCompatActivity.read(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
                    m16x50fd9e4a();
                }
            }
            this.AppCompatActivity.read(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            RatingCompat();
            m16x50fd9e4a();
        }
    }

    private View MediaSessionCompat$QueueItem() {
        setContentView write2;
        int i = this.ExpandedMenuView.write != -1 ? this.ExpandedMenuView.write : 0;
        Keep keep = this.ExpandedMenuView;
        int i2 = keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem;
        int i3 = i;
        while (i3 < i2) {
            setContentView write3 = write(i3);
            if (write3 == null) {
                break;
            } else if (write3.write.hasFocusable()) {
                return write3.write;
            } else {
                i3++;
            }
        }
        int min = Math.min(i2, i);
        while (true) {
            min--;
            if (min < 0 || (write2 = write(min)) == null) {
                return null;
            }
            if (write2.write.hasFocusable()) {
                return write2.write;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$MediaItem() {
        /*
            r11 = this;
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r11.ExpandedMenuView
            r1 = 1
            r0.MediaBrowserCompat$ItemReceiver(r1)
            r11.setContentView()
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r11.ExpandedMenuView
            r2 = 0
            r0.MediaBrowserCompat$SearchResultReceiver = r2
            int r0 = r11.PlaybackStateCompat$CustomAction
            int r0 = r0 + r1
            r11.PlaybackStateCompat$CustomAction = r0
            if (r0 != r1) goto L_0x001b
            boolean r0 = r11.setCheckable
            if (r0 != 0) goto L_0x001b
            r11.AppCompatViewInflater = r2
        L_0x001b:
            o.setStatusBarBackground r0 = r11.MenuItemWrapperICS$CollapsibleActionViewWrapper
            o.setTextAppearance<androidx.recyclerview.widget.RecyclerView$setContentView, o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver> r3 = r0.write
            r3.clear()
            o.setAutoSizeTextTypeWithDefaults<androidx.recyclerview.widget.RecyclerView$setContentView> r0 = r0.read
            r0.IconCompatParcelizer()
            int r0 = r11.ActionMenuItemView
            int r0 = r0 + r1
            r11.ActionMenuItemView = r0
            r11.ParcelableVolumeInfo()
            boolean r0 = r11.setWindowCallback
            r3 = 0
            if (r0 == 0) goto L_0x0043
            boolean r0 = r11.hasFocus()
            if (r0 == 0) goto L_0x0043
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r0 = r11.MediaDescriptionCompat
            if (r0 == 0) goto L_0x0043
            android.view.View r0 = r11.getFocusedChild()
            goto L_0x0044
        L_0x0043:
            r0 = r3
        L_0x0044:
            if (r0 != 0) goto L_0x0048
        L_0x0046:
            r0 = r3
            goto L_0x0053
        L_0x0048:
            android.view.View r0 = r11.write((android.view.View) r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x0046
        L_0x004f:
            androidx.recyclerview.widget.RecyclerView$setContentView r0 = r11.MediaBrowserCompat$MediaItem((android.view.View) r0)
        L_0x0053:
            r4 = -1
            r6 = -1
            if (r0 != 0) goto L_0x0065
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r11.ExpandedMenuView
            r0.read = r4
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r11.ExpandedMenuView
            r0.write = r6
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r11.ExpandedMenuView
            r0.MediaBrowserCompat$CustomActionResultReceiver = r6
            goto L_0x00bd
        L_0x0065:
            androidx.recyclerview.widget.RecyclerView$Keep r7 = r11.ExpandedMenuView
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r8 = r11.MediaDescriptionCompat
            boolean r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r8 == 0) goto L_0x006f
            long r4 = r0.MediaBrowserCompat$ItemReceiver
        L_0x006f:
            r7.read = r4
            androidx.recyclerview.widget.RecyclerView$Keep r4 = r11.ExpandedMenuView
            boolean r5 = r11.f23x50fd9e4a
            if (r5 == 0) goto L_0x0079
        L_0x0077:
            r5 = r6
            goto L_0x0090
        L_0x0079:
            int r5 = r0.read
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0081
            r5 = r1
            goto L_0x0082
        L_0x0081:
            r5 = r2
        L_0x0082:
            if (r5 == 0) goto L_0x0087
            int r5 = r0.MediaBrowserCompat$MediaItem
            goto L_0x0090
        L_0x0087:
            androidx.recyclerview.widget.RecyclerView r5 = r0.MediaMetadataCompat
            if (r5 != 0) goto L_0x008c
            goto L_0x0077
        L_0x008c:
            int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r0)
        L_0x0090:
            r4.write = r5
            androidx.recyclerview.widget.RecyclerView$Keep r4 = r11.ExpandedMenuView
            android.view.View r0 = r0.write
            int r5 = r0.getId()
        L_0x009a:
            boolean r7 = r0.isFocused()
            if (r7 != 0) goto L_0x00bb
            boolean r7 = r0 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00bb
            boolean r7 = r0.hasFocus()
            if (r7 == 0) goto L_0x00bb
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.getFocusedChild()
            int r7 = r0.getId()
            if (r7 == r6) goto L_0x009a
            int r5 = r0.getId()
            goto L_0x009a
        L_0x00bb:
            r4.MediaBrowserCompat$CustomActionResultReceiver = r5
        L_0x00bd:
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r11.ExpandedMenuView
            boolean r4 = r0.MediaSessionCompat$QueueItem
            if (r4 == 0) goto L_0x00ca
            boolean r4 = r11.setBackgroundResource
            if (r4 != 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            r4 = r1
            goto L_0x00cb
        L_0x00ca:
            r4 = r2
        L_0x00cb:
            r0.MediaSessionCompat$Token = r4
            r11.setBackgroundResource = r2
            r11.AppCompatDelegateImpl$ListMenuDecorView = r2
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r11.ExpandedMenuView
            boolean r4 = r0.RatingCompat
            r0.MediaBrowserCompat$ItemReceiver = r4
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r11.ExpandedMenuView
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r4 = r11.MediaDescriptionCompat
            int r4 = r4.IconCompatParcelizer()
            r0.MediaBrowserCompat$MediaItem = r4
            int[] r0 = r11.setMenu
            r11.MediaBrowserCompat$CustomActionResultReceiver((int[]) r0)
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r11.ExpandedMenuView
            boolean r0 = r0.MediaSessionCompat$QueueItem
            r4 = 2
            if (r0 == 0) goto L_0x018e
            o.setMinWidth r0 = r11.MediaSessionCompat$ResultReceiverWrapper
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r5 = r0.read
            int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r0 = r0.MediaBrowserCompat$ItemReceiver
            int r0 = r0.size()
            int r5 = r5 - r0
            r0 = r2
        L_0x00fd:
            if (r0 >= r5) goto L_0x018e
            o.setMinWidth r7 = r11.MediaSessionCompat$ResultReceiverWrapper
            int r8 = r7.MediaBrowserCompat$ItemReceiver((int) r0)
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r7 = r7.read
            android.view.View r7 = r7.MediaBrowserCompat$CustomActionResultReceiver(r8)
            if (r7 != 0) goto L_0x010f
            r7 = r3
            goto L_0x0117
        L_0x010f:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r7 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r7
            androidx.recyclerview.widget.RecyclerView$setContentView r7 = r7.MediaBrowserCompat$SearchResultReceiver
        L_0x0117:
            int r8 = r7.read
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x011f
            r8 = r1
            goto L_0x0120
        L_0x011f:
            r8 = r2
        L_0x0120:
            if (r8 != 0) goto L_0x018a
            int r8 = r7.read
            r8 = r8 & 4
            if (r8 == 0) goto L_0x012a
            r8 = r1
            goto L_0x012b
        L_0x012a:
            r8 = r2
        L_0x012b:
            if (r8 == 0) goto L_0x0133
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r8 = r11.MediaDescriptionCompat
            boolean r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r8 == 0) goto L_0x018a
        L_0x0133:
            androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(r7)
            r7.mo1615t_()
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$IconCompatParcelizer r8 = androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver()
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$IconCompatParcelizer r8 = r8.IconCompatParcelizer(r7)
            o.setStatusBarBackground r9 = r11.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r9.IconCompatParcelizer(r7, r8)
            androidx.recyclerview.widget.RecyclerView$Keep r8 = r11.ExpandedMenuView
            boolean r8 = r8.MediaSessionCompat$Token
            if (r8 == 0) goto L_0x018a
            int r8 = r7.read
            r8 = r8 & r4
            if (r8 == 0) goto L_0x0153
            r8 = r1
            goto L_0x0154
        L_0x0153:
            r8 = r2
        L_0x0154:
            if (r8 == 0) goto L_0x018a
            int r8 = r7.read
            r8 = r8 & 8
            if (r8 == 0) goto L_0x015e
            r8 = r1
            goto L_0x015f
        L_0x015e:
            r8 = r2
        L_0x015f:
            if (r8 != 0) goto L_0x018a
            int r8 = r7.read
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0169
            r8 = r1
            goto L_0x016a
        L_0x0169:
            r8 = r2
        L_0x016a:
            if (r8 != 0) goto L_0x018a
            int r8 = r7.read
            r8 = r8 & 4
            if (r8 == 0) goto L_0x0174
            r8 = r1
            goto L_0x0175
        L_0x0174:
            r8 = r2
        L_0x0175:
            if (r8 != 0) goto L_0x018a
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r8 = r11.MediaDescriptionCompat
            boolean r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r8 == 0) goto L_0x0180
            long r8 = r7.MediaBrowserCompat$ItemReceiver
            goto L_0x0183
        L_0x0180:
            int r8 = r7.MediaSessionCompat$QueueItem
            long r8 = (long) r8
        L_0x0183:
            o.setStatusBarBackground r10 = r11.MenuItemWrapperICS$CollapsibleActionViewWrapper
            o.setAutoSizeTextTypeWithDefaults<androidx.recyclerview.widget.RecyclerView$setContentView> r10 = r10.read
            r10.read(r8, r7)
        L_0x018a:
            int r0 = r0 + 1
            goto L_0x00fd
        L_0x018e:
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r11.ExpandedMenuView
            boolean r0 = r0.RatingCompat
            if (r0 == 0) goto L_0x026b
            o.setMinWidth r0 = r11.MediaSessionCompat$ResultReceiverWrapper
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.read
            int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            r5 = r2
        L_0x019d:
            if (r5 >= r0) goto L_0x01c9
            o.setMinWidth r7 = r11.MediaSessionCompat$ResultReceiverWrapper
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r7 = r7.read
            android.view.View r7 = r7.MediaBrowserCompat$CustomActionResultReceiver(r5)
            if (r7 != 0) goto L_0x01ab
            r7 = r3
            goto L_0x01b3
        L_0x01ab:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r7 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r7
            androidx.recyclerview.widget.RecyclerView$setContentView r7 = r7.MediaBrowserCompat$SearchResultReceiver
        L_0x01b3:
            int r8 = r7.read
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x01bb
            r8 = r1
            goto L_0x01bc
        L_0x01bb:
            r8 = r2
        L_0x01bc:
            if (r8 != 0) goto L_0x01c6
            int r8 = r7.MediaBrowserCompat$MediaItem
            if (r8 != r6) goto L_0x01c6
            int r8 = r7.MediaSessionCompat$QueueItem
            r7.MediaBrowserCompat$MediaItem = r8
        L_0x01c6:
            int r5 = r5 + 1
            goto L_0x019d
        L_0x01c9:
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r11.ExpandedMenuView
            boolean r0 = r0.f24x50fd9e4a
            androidx.recyclerview.widget.RecyclerView$Keep r5 = r11.ExpandedMenuView
            r5.f24x50fd9e4a = r2
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r5 = r11.AppCompatActivity
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r6 = r11.setPadding
            androidx.recyclerview.widget.RecyclerView$Keep r7 = r11.ExpandedMenuView
            r5.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r6, (androidx.recyclerview.widget.RecyclerView.Keep) r7)
            androidx.recyclerview.widget.RecyclerView$Keep r5 = r11.ExpandedMenuView
            r5.f24x50fd9e4a = r0
            r0 = r2
        L_0x01df:
            o.setMinWidth r5 = r11.MediaSessionCompat$ResultReceiverWrapper
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r6 = r5.read
            int r6 = r6.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r5 = r5.MediaBrowserCompat$ItemReceiver
            int r5 = r5.size()
            int r6 = r6 - r5
            if (r0 >= r6) goto L_0x0267
            o.setMinWidth r5 = r11.MediaSessionCompat$ResultReceiverWrapper
            int r6 = r5.MediaBrowserCompat$ItemReceiver((int) r0)
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r5 = r5.read
            android.view.View r5 = r5.MediaBrowserCompat$CustomActionResultReceiver(r6)
            if (r5 != 0) goto L_0x0200
            r5 = r3
            goto L_0x0208
        L_0x0200:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r5 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r5
            androidx.recyclerview.widget.RecyclerView$setContentView r5 = r5.MediaBrowserCompat$SearchResultReceiver
        L_0x0208:
            int r6 = r5.read
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0210
            r6 = r1
            goto L_0x0211
        L_0x0210:
            r6 = r2
        L_0x0211:
            if (r6 != 0) goto L_0x0263
            o.setStatusBarBackground r6 = r11.MenuItemWrapperICS$CollapsibleActionViewWrapper
            o.setTextAppearance<androidx.recyclerview.widget.RecyclerView$setContentView, o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver> r6 = r6.write
            java.lang.Object r6 = r6.get(r5)
            o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver r6 = (p040o.C1539x5a6c48da) r6
            if (r6 == 0) goto L_0x0227
            int r6 = r6.MediaBrowserCompat$ItemReceiver
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0227
            r6 = r1
            goto L_0x0228
        L_0x0227:
            r6 = r2
        L_0x0228:
            if (r6 != 0) goto L_0x0263
            androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(r5)
            int r6 = r5.read
            r6 = r6 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0235
            r6 = r1
            goto L_0x0236
        L_0x0235:
            r6 = r2
        L_0x0236:
            r5.mo1615t_()
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$IconCompatParcelizer r7 = androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver()
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$IconCompatParcelizer r7 = r7.IconCompatParcelizer(r5)
            if (r6 == 0) goto L_0x0247
            r11.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r5, (androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat.IconCompatParcelizer) r7)
            goto L_0x0263
        L_0x0247:
            o.setStatusBarBackground r6 = r11.MenuItemWrapperICS$CollapsibleActionViewWrapper
            o.setTextAppearance<androidx.recyclerview.widget.RecyclerView$setContentView, o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver> r8 = r6.write
            java.lang.Object r8 = r8.get(r5)
            o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver r8 = (p040o.C1539x5a6c48da) r8
            if (r8 != 0) goto L_0x025c
            o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver r8 = p040o.C1539x5a6c48da.write()
            o.setTextAppearance<androidx.recyclerview.widget.RecyclerView$setContentView, o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver> r6 = r6.write
            r6.put(r5, r8)
        L_0x025c:
            int r5 = r8.MediaBrowserCompat$ItemReceiver
            r5 = r5 | r4
            r8.MediaBrowserCompat$ItemReceiver = r5
            r8.IconCompatParcelizer = r7
        L_0x0263:
            int r0 = r0 + 1
            goto L_0x01df
        L_0x0267:
            r11.MediaSessionCompat$Token()
            goto L_0x026e
        L_0x026b:
            r11.MediaSessionCompat$Token()
        L_0x026e:
            r11.read((boolean) r1)
            r11.write((boolean) r2)
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r11.ExpandedMenuView
            r0.MediaMetadataCompat = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.MediaBrowserCompat$MediaItem():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x025c, code lost:
        if (r14.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.contains(r0) != false) goto L_0x025e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02a6  */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16x50fd9e4a() {
        /*
            r14 = this;
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            r1 = 4
            r0.MediaBrowserCompat$ItemReceiver(r1)
            int r0 = r14.PlaybackStateCompat$CustomAction
            r2 = 1
            int r0 = r0 + r2
            r14.PlaybackStateCompat$CustomAction = r0
            r3 = 0
            if (r0 != r2) goto L_0x0015
            boolean r0 = r14.setCheckable
            if (r0 != 0) goto L_0x0015
            r14.AppCompatViewInflater = r3
        L_0x0015:
            int r0 = r14.ActionMenuItemView
            int r0 = r0 + r2
            r14.ActionMenuItemView = r0
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            r0.MediaMetadataCompat = r2
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            boolean r0 = r0.MediaSessionCompat$QueueItem
            r4 = 0
            if (r0 == 0) goto L_0x0199
            o.setMinWidth r0 = r14.MediaSessionCompat$ResultReceiverWrapper
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r5 = r0.read
            int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r0 = r0.MediaBrowserCompat$ItemReceiver
            int r0 = r0.size()
            int r5 = r5 - r0
            int r5 = r5 - r2
        L_0x0035:
            if (r5 < 0) goto L_0x0192
            o.setMinWidth r0 = r14.MediaSessionCompat$ResultReceiverWrapper
            int r6 = r0.MediaBrowserCompat$ItemReceiver((int) r5)
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.read
            android.view.View r0 = r0.MediaBrowserCompat$CustomActionResultReceiver(r6)
            if (r0 != 0) goto L_0x0047
            r8 = r4
            goto L_0x0050
        L_0x0047:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r0 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r0
            androidx.recyclerview.widget.RecyclerView$setContentView r0 = r0.MediaBrowserCompat$SearchResultReceiver
            r8 = r0
        L_0x0050:
            int r0 = r8.read
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0058
            r0 = r2
            goto L_0x0059
        L_0x0058:
            r0 = r3
        L_0x0059:
            if (r0 != 0) goto L_0x018e
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r0 = r14.MediaDescriptionCompat
            boolean r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0064
            long r6 = r8.MediaBrowserCompat$ItemReceiver
            goto L_0x0067
        L_0x0064:
            int r0 = r8.MediaSessionCompat$QueueItem
            long r6 = (long) r0
        L_0x0067:
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$IconCompatParcelizer r0 = androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver()
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$IconCompatParcelizer r0 = r0.IconCompatParcelizer(r8)
            o.setStatusBarBackground r9 = r14.MenuItemWrapperICS$CollapsibleActionViewWrapper
            o.setAutoSizeTextTypeWithDefaults<androidx.recyclerview.widget.RecyclerView$setContentView> r9 = r9.read
            java.lang.Object r9 = r9.MediaBrowserCompat$ItemReceiver(r6, r4)
            androidx.recyclerview.widget.RecyclerView$setContentView r9 = (androidx.recyclerview.widget.RecyclerView.setContentView) r9
            if (r9 == 0) goto L_0x0189
            int r10 = r9.read
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0083
            r10 = r2
            goto L_0x0084
        L_0x0083:
            r10 = r3
        L_0x0084:
            if (r10 != 0) goto L_0x0189
            o.setStatusBarBackground r10 = r14.MenuItemWrapperICS$CollapsibleActionViewWrapper
            o.setTextAppearance<androidx.recyclerview.widget.RecyclerView$setContentView, o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver> r10 = r10.write
            java.lang.Object r10 = r10.get(r9)
            o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver r10 = (p040o.C1539x5a6c48da) r10
            if (r10 == 0) goto L_0x009a
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            r10 = r10 & r2
            if (r10 != 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r11 = r2
            goto L_0x009b
        L_0x009a:
            r11 = r3
        L_0x009b:
            o.setStatusBarBackground r10 = r14.MenuItemWrapperICS$CollapsibleActionViewWrapper
            o.setTextAppearance<androidx.recyclerview.widget.RecyclerView$setContentView, o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver> r10 = r10.write
            java.lang.Object r10 = r10.get(r8)
            o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver r10 = (p040o.C1539x5a6c48da) r10
            if (r10 == 0) goto L_0x00af
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            r10 = r10 & r2
            if (r10 != 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r12 = r2
            goto L_0x00b0
        L_0x00af:
            r12 = r3
        L_0x00b0:
            if (r11 == 0) goto L_0x00b4
            if (r9 == r8) goto L_0x0189
        L_0x00b4:
            o.setStatusBarBackground r10 = r14.MenuItemWrapperICS$CollapsibleActionViewWrapper
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$IconCompatParcelizer r10 = r10.MediaBrowserCompat$ItemReceiver(r9, r1)
            o.setStatusBarBackground r13 = r14.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r13.read(r8, r0)
            o.setStatusBarBackground r0 = r14.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r13 = 8
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$IconCompatParcelizer r0 = r0.MediaBrowserCompat$ItemReceiver(r8, r13)
            if (r10 != 0) goto L_0x0181
            o.setMinWidth r0 = r14.MediaSessionCompat$ResultReceiverWrapper
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r10 = r0.read
            int r10 = r10.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r0 = r0.MediaBrowserCompat$ItemReceiver
            int r0 = r0.size()
            int r10 = r10 - r0
            r0 = r3
        L_0x00d9:
            if (r0 >= r10) goto L_0x015b
            o.setMinWidth r11 = r14.MediaSessionCompat$ResultReceiverWrapper
            int r12 = r11.MediaBrowserCompat$ItemReceiver((int) r0)
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r11 = r11.read
            android.view.View r11 = r11.MediaBrowserCompat$CustomActionResultReceiver(r12)
            if (r11 != 0) goto L_0x00eb
            r11 = r4
            goto L_0x00f3
        L_0x00eb:
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r11 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r11
            androidx.recyclerview.widget.RecyclerView$setContentView r11 = r11.MediaBrowserCompat$SearchResultReceiver
        L_0x00f3:
            if (r11 == r8) goto L_0x0157
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r12 = r14.MediaDescriptionCompat
            boolean r12 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r12 == 0) goto L_0x00fe
            long r12 = r11.MediaBrowserCompat$ItemReceiver
            goto L_0x0101
        L_0x00fe:
            int r12 = r11.MediaSessionCompat$QueueItem
            long r12 = (long) r12
        L_0x0101:
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x0157
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r0 = r14.MediaDescriptionCompat
            java.lang.String r1 = " \n View Holder 2:"
            if (r0 == 0) goto L_0x0133
            boolean r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0133
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r0.append(r2)
            r0.append(r11)
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = r14.read()
            r0.append(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0133:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r0.append(r2)
            r0.append(r11)
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = r14.read()
            r0.append(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0157:
            int r0 = r0 + 1
            goto L_0x00d9
        L_0x015b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r0.append(r6)
            r0.append(r9)
            java.lang.String r6 = " cannot be found but it is necessary for "
            r0.append(r6)
            r0.append(r8)
            java.lang.String r6 = r14.read()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "RecyclerView"
            android.util.Log.e(r6, r0)
            goto L_0x018e
        L_0x0181:
            r6 = r14
            r7 = r9
            r9 = r10
            r10 = r0
            r6.write(r7, r8, r9, r10, r11, r12)
            goto L_0x018e
        L_0x0189:
            o.setStatusBarBackground r6 = r14.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r6.read(r8, r0)
        L_0x018e:
            int r5 = r5 + -1
            goto L_0x0035
        L_0x0192:
            o.setStatusBarBackground r0 = r14.MenuItemWrapperICS$CollapsibleActionViewWrapper
            o.setStatusBarBackground$IconCompatParcelizer r1 = r14.setPresenter
            r0.MediaBrowserCompat$CustomActionResultReceiver((p040o.setStatusBarBackground.IconCompatParcelizer) r1)
        L_0x0199:
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r14.AppCompatActivity
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r1 = r14.setPadding
            r0.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1)
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            int r1 = r0.MediaBrowserCompat$MediaItem
            r0.MediaDescriptionCompat = r1
            r14.f23x50fd9e4a = r3
            r14.setTransitioning = r3
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            r0.MediaSessionCompat$QueueItem = r3
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            r0.RatingCompat = r3
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r14.AppCompatActivity
            r0.AppCompatActivity = r3
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r0 = r14.setPadding
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$setContentView> r0 = r0.IconCompatParcelizer
            if (r0 == 0) goto L_0x01c3
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r0 = r14.setPadding
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$setContentView> r0 = r0.IconCompatParcelizer
            r0.clear()
        L_0x01c3:
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r14.AppCompatActivity
            boolean r0 = r0.PlaybackStateCompat$CustomAction
            if (r0 == 0) goto L_0x01d6
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r14.AppCompatActivity
            r0.PlaybackStateCompat = r3
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r14.AppCompatActivity
            r0.PlaybackStateCompat$CustomAction = r3
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r0 = r14.setPadding
            r0.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x01d6:
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r14.AppCompatActivity
            androidx.recyclerview.widget.RecyclerView$Keep r1 = r14.ExpandedMenuView
            r0.read((androidx.recyclerview.widget.RecyclerView.Keep) r1)
            r14.read((boolean) r2)
            r14.write((boolean) r3)
            o.setStatusBarBackground r0 = r14.MenuItemWrapperICS$CollapsibleActionViewWrapper
            o.setTextAppearance<androidx.recyclerview.widget.RecyclerView$setContentView, o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver> r1 = r0.write
            r1.clear()
            o.setAutoSizeTextTypeWithDefaults<androidx.recyclerview.widget.RecyclerView$setContentView> r0 = r0.read
            r0.IconCompatParcelizer()
            int[] r0 = r14.setMenu
            r1 = r0[r3]
            r0 = r0[r2]
            boolean r0 = r14.MediaBrowserCompat$MediaItem(r1, r0)
            if (r0 == 0) goto L_0x01fe
            r14.MediaBrowserCompat$CustomActionResultReceiver((int) r3, (int) r3)
        L_0x01fe:
            boolean r0 = r14.setWindowCallback
            r1 = -1
            if (r0 == 0) goto L_0x02c3
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r0 = r14.MediaDescriptionCompat
            if (r0 == 0) goto L_0x02c3
            boolean r0 = r14.hasFocus()
            if (r0 == 0) goto L_0x02c3
            int r0 = r14.getDescendantFocusability()
            r3 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r3) goto L_0x02c3
            int r0 = r14.getDescendantFocusability()
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r3) goto L_0x0224
            boolean r0 = r14.isFocused()
            if (r0 != 0) goto L_0x02c3
        L_0x0224:
            boolean r0 = r14.isFocused()
            if (r0 != 0) goto L_0x025e
            android.view.View r0 = r14.getFocusedChild()
            boolean r3 = setStackedBackground
            if (r3 == 0) goto L_0x0254
            android.view.ViewParent r3 = r0.getParent()
            if (r3 == 0) goto L_0x023e
            boolean r3 = r0.hasFocus()
            if (r3 != 0) goto L_0x0254
        L_0x023e:
            o.setMinWidth r0 = r14.MediaSessionCompat$ResultReceiverWrapper
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r3 = r0.read
            int r3 = r3.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r0 = r0.MediaBrowserCompat$ItemReceiver
            int r0 = r0.size()
            int r3 = r3 - r0
            if (r3 != 0) goto L_0x025e
            r14.requestFocus()
            goto L_0x02c3
        L_0x0254:
            o.setMinWidth r3 = r14.MediaSessionCompat$ResultReceiverWrapper
            java.util.List<android.view.View> r3 = r3.MediaBrowserCompat$ItemReceiver
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x02c3
        L_0x025e:
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            long r5 = r0.read
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0275
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r0 = r14.MediaDescriptionCompat
            boolean r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0275
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            long r5 = r0.read
            androidx.recyclerview.widget.RecyclerView$setContentView r0 = r14.IconCompatParcelizer((long) r5)
            goto L_0x0276
        L_0x0275:
            r0 = r4
        L_0x0276:
            if (r0 == 0) goto L_0x028f
            o.setMinWidth r3 = r14.MediaSessionCompat$ResultReceiverWrapper
            android.view.View r5 = r0.write
            java.util.List<android.view.View> r3 = r3.MediaBrowserCompat$ItemReceiver
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L_0x028f
            android.view.View r3 = r0.write
            boolean r3 = r3.hasFocusable()
            if (r3 == 0) goto L_0x028f
            android.view.View r4 = r0.write
            goto L_0x02a4
        L_0x028f:
            o.setMinWidth r0 = r14.MediaSessionCompat$ResultReceiverWrapper
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r3 = r0.read
            int r3 = r3.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r0 = r0.MediaBrowserCompat$ItemReceiver
            int r0 = r0.size()
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x02a4
            android.view.View r4 = r14.MediaSessionCompat$QueueItem()
        L_0x02a4:
            if (r4 == 0) goto L_0x02c3
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            long r5 = (long) r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x02c0
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x02c0
            boolean r3 = r0.isFocusable()
            if (r3 == 0) goto L_0x02c0
            r4 = r0
        L_0x02c0:
            r4.requestFocus()
        L_0x02c3:
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            r0.read = r1
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            r1 = -1
            r0.write = r1
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r14.ExpandedMenuView
            r0.MediaBrowserCompat$CustomActionResultReceiver = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m16x50fd9e4a():void");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int[] iArr) {
        setContentView setcontentview;
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        int MediaBrowserCompat$CustomActionResultReceiver2 = setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size();
        if (MediaBrowserCompat$CustomActionResultReceiver2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = PKIFailureInfo.systemUnavail;
        for (int i3 = 0; i3 < MediaBrowserCompat$CustomActionResultReceiver2; i3++) {
            setMinWidth setminwidth2 = this.MediaSessionCompat$ResultReceiverWrapper;
            View MediaBrowserCompat$CustomActionResultReceiver3 = setminwidth2.read.MediaBrowserCompat$CustomActionResultReceiver(setminwidth2.MediaBrowserCompat$ItemReceiver(i3));
            if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                setcontentview = null;
            } else {
                setcontentview = ((MediaDescriptionCompat) MediaBrowserCompat$CustomActionResultReceiver3.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            }
            if (!((setcontentview.read & 128) != 0)) {
                int i4 = setcontentview.ParcelableVolumeInfo;
                if (i4 == -1) {
                    i4 = setcontentview.MediaSessionCompat$QueueItem;
                }
                if (i4 < i) {
                    i = i4;
                }
                if (i4 > i2) {
                    i2 = i4;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    private boolean MediaBrowserCompat$MediaItem(int i, int i2) {
        MediaBrowserCompat$CustomActionResultReceiver(this.setMenu);
        int[] iArr = this.setMenu;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void write(setContentView setcontentview, setContentView setcontentview2, MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer, MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer2, boolean z, boolean z2) {
        setcontentview.read(false);
        if (z) {
            write(setcontentview);
        }
        if (setcontentview != setcontentview2) {
            if (z2) {
                write(setcontentview2);
            }
            setcontentview.f26x50fd9e4a = setcontentview2;
            write(setcontentview);
            this.setPadding.MediaBrowserCompat$ItemReceiver(setcontentview);
            setcontentview2.read(false);
            setcontentview2.MediaSessionCompat$Token = setcontentview;
        }
        if (this.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(setcontentview, setcontentview2, iconCompatParcelizer, iconCompatParcelizer2) && !this.setPopupCallback && this.setHasDecor) {
            SwitchCompat.MediaBrowserCompat$ItemReceiver((View) this, this.AppCompatDialogFragment);
            this.setPopupCallback = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        setMeasureWithLargestChildEnabled.read("RV OnLayout");
        Keep();
        setMeasureWithLargestChildEnabled.MediaBrowserCompat$CustomActionResultReceiver();
        this.MediaSessionCompat$Token = true;
    }

    public void requestLayout() {
        if (this.PlaybackStateCompat$CustomAction != 0 || this.setCheckable) {
            this.AppCompatViewInflater = true;
        } else {
            super.requestLayout();
        }
    }

    private void setBackgroundResource() {
        int MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver();
        for (int i = 0; i < MediaBrowserCompat$CustomActionResultReceiver2; i++) {
            ((MediaDescriptionCompat) this.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver(i).getLayoutParams()).read = true;
        }
        this.setPadding.write();
    }

    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.setContentView.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.setContentView.get(i).IconCompatParcelizer(canvas, this);
        }
        EdgeEffect edgeEffect = this.setMenuPrepared;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.MediaSessionCompat$QueueItem ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), BitmapDescriptorFactory.HUE_RED);
            EdgeEffect edgeEffect2 = this.setMenuPrepared;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.ActivityChooserView;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.MediaSessionCompat$QueueItem) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.ActivityChooserView;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.ActionMenuPresenter$OverflowMenuButton;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.MediaSessionCompat$QueueItem ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.ActionMenuPresenter$OverflowMenuButton;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.setCustomView;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.MediaSessionCompat$QueueItem) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.setCustomView;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.AlertController$RecycleListView == null || this.setContentView.size() <= 0 || !this.AlertController$RecycleListView.read()) {
            z3 = z;
        }
        if (z3) {
            SwitchCompat.setItemInvoker(this);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.setContentView.size();
        for (int i = 0; i < size; i++) {
            this.setContentView.get(i).read(canvas, this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof MediaDescriptionCompat) && this.AppCompatActivity.write((MediaDescriptionCompat) layoutParams);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            return recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(read());
        throw new IllegalStateException(sb.toString());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            return recyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(read());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            return recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(layoutParams);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(read());
        throw new IllegalStateException(sb.toString());
    }

    private void MediaSessionCompat$Token() {
        setContentView setcontentview;
        int MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver();
        for (int i = 0; i < MediaBrowserCompat$CustomActionResultReceiver2; i++) {
            View MediaBrowserCompat$CustomActionResultReceiver3 = this.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver(i);
            if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                setcontentview = null;
            } else {
                setcontentview = ((MediaDescriptionCompat) MediaBrowserCompat$CustomActionResultReceiver3.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            }
            if (!((setcontentview.read & 128) != 0)) {
                setcontentview.MediaBrowserCompat$MediaItem = -1;
                setcontentview.ParcelableVolumeInfo = -1;
            }
        }
        this.setPadding.MediaBrowserCompat$ItemReceiver();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, boolean z) {
        setContentView setcontentview;
        int MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver();
        for (int i3 = 0; i3 < MediaBrowserCompat$CustomActionResultReceiver2; i3++) {
            View MediaBrowserCompat$CustomActionResultReceiver3 = this.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver(i3);
            if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                setcontentview = null;
            } else {
                setcontentview = ((MediaDescriptionCompat) MediaBrowserCompat$CustomActionResultReceiver3.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            }
            if (setcontentview != null) {
                if (!((setcontentview.read & 128) != 0)) {
                    if (setcontentview.MediaSessionCompat$QueueItem >= i + i2) {
                        setcontentview.write(-i2, z);
                        this.ExpandedMenuView.f24x50fd9e4a = true;
                    } else if (setcontentview.MediaSessionCompat$QueueItem >= i) {
                        setcontentview.read |= 8;
                        setcontentview.write(-i2, z);
                        setcontentview.MediaSessionCompat$QueueItem = i - 1;
                        this.ExpandedMenuView.f24x50fd9e4a = true;
                    }
                }
            }
        }
        RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper = this.setPadding;
        for (int size = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver.size() - 1; size >= 0; size--) {
            setContentView setcontentview2 = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver.get(size);
            if (setcontentview2 != null) {
                if (setcontentview2.MediaSessionCompat$QueueItem >= i + i2) {
                    setcontentview2.write(-i2, z);
                } else if (setcontentview2.MediaSessionCompat$QueueItem >= i) {
                    setcontentview2.read |= 8;
                    recyclerView$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver.get(size), true);
                    recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver.remove(size);
                }
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.setTransitioning = z | this.setTransitioning;
        this.f23x50fd9e4a = true;
        int MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver();
        int i = 0;
        while (true) {
            setContentView setcontentview = null;
            if (i >= MediaBrowserCompat$CustomActionResultReceiver2) {
                break;
            }
            View MediaBrowserCompat$CustomActionResultReceiver3 = this.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver(i);
            if (MediaBrowserCompat$CustomActionResultReceiver3 != null) {
                setcontentview = ((MediaDescriptionCompat) MediaBrowserCompat$CustomActionResultReceiver3.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            }
            if (setcontentview != null) {
                if (!((setcontentview.read & 128) != 0)) {
                    setcontentview.read |= 6;
                }
            }
            i++;
        }
        setBackgroundResource();
        RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper = this.setPadding;
        int size = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver.size();
        for (int i2 = 0; i2 < size; i2++) {
            setContentView setcontentview2 = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver.get(i2);
            if (setcontentview2 != null) {
                setcontentview2.read |= 6;
                setcontentview2.MediaBrowserCompat$ItemReceiver((Object) null);
            }
        }
        if (recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaDescriptionCompat.MediaDescriptionCompat == null || !recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver) {
            recyclerView$MediaSessionCompat$ResultReceiverWrapper.read();
        }
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.setWindowCallback = z;
    }

    public final setContentView MediaBrowserCompat$MediaItem(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            StringBuilder sb = new StringBuilder();
            sb.append("View ");
            sb.append(view);
            sb.append(" is not a direct child of ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        } else if (view == null) {
            return null;
        } else {
            return ((MediaDescriptionCompat) view.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
        }
    }

    public final View write(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent != this) {
            return null;
        }
        return view;
    }

    public static setContentView MediaBrowserCompat$CustomActionResultReceiver(View view) {
        if (view == null) {
            return null;
        }
        return ((MediaDescriptionCompat) view.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
    }

    public final setContentView write(int i) {
        setContentView setcontentview;
        if (this.f23x50fd9e4a) {
            return null;
        }
        int MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver();
        setContentView setcontentview2 = null;
        for (int i2 = 0; i2 < MediaBrowserCompat$CustomActionResultReceiver2; i2++) {
            View MediaBrowserCompat$CustomActionResultReceiver3 = this.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver(i2);
            if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                setcontentview = null;
            } else {
                setcontentview = ((MediaDescriptionCompat) MediaBrowserCompat$CustomActionResultReceiver3.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            }
            if (setcontentview != null) {
                if (!((setcontentview.read & 8) != 0) && MediaBrowserCompat$CustomActionResultReceiver(setcontentview) == i) {
                    if (!this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.contains(setcontentview.write)) {
                        return setcontentview;
                    }
                    setcontentview2 = setcontentview;
                }
            }
        }
        return setcontentview2;
    }

    public final setContentView IconCompatParcelizer(long j) {
        setContentView setcontentview;
        IconCompatParcelizer iconCompatParcelizer = this.MediaDescriptionCompat;
        if (iconCompatParcelizer == null || !iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) {
            return null;
        }
        int MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver();
        setContentView setcontentview2 = null;
        for (int i = 0; i < MediaBrowserCompat$CustomActionResultReceiver2; i++) {
            View MediaBrowserCompat$CustomActionResultReceiver3 = this.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver(i);
            if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                setcontentview = null;
            } else {
                setcontentview = ((MediaDescriptionCompat) MediaBrowserCompat$CustomActionResultReceiver3.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            }
            if (setcontentview != null) {
                if (!((setcontentview.read & 8) != 0) && setcontentview.MediaBrowserCompat$ItemReceiver == j) {
                    if (!this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.contains(setcontentview.write)) {
                        return setcontentview;
                    }
                    setcontentview2 = setcontentview;
                }
            }
        }
        return setcontentview2;
    }

    public final View write(float f, float f2) {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        for (int MediaBrowserCompat$CustomActionResultReceiver2 = (setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size()) - 1; MediaBrowserCompat$CustomActionResultReceiver2 >= 0; MediaBrowserCompat$CustomActionResultReceiver2--) {
            setMinWidth setminwidth2 = this.MediaSessionCompat$ResultReceiverWrapper;
            View MediaBrowserCompat$CustomActionResultReceiver3 = setminwidth2.read.MediaBrowserCompat$CustomActionResultReceiver(setminwidth2.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2));
            float translationX = MediaBrowserCompat$CustomActionResultReceiver3.getTranslationX();
            float translationY = MediaBrowserCompat$CustomActionResultReceiver3.getTranslationY();
            if (f >= ((float) MediaBrowserCompat$CustomActionResultReceiver3.getLeft()) + translationX && f <= ((float) MediaBrowserCompat$CustomActionResultReceiver3.getRight()) + translationX && f2 >= ((float) MediaBrowserCompat$CustomActionResultReceiver3.getTop()) + translationY && f2 <= ((float) MediaBrowserCompat$CustomActionResultReceiver3.getBottom()) + translationY) {
                return MediaBrowserCompat$CustomActionResultReceiver3;
            }
        }
        return null;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public static void IconCompatParcelizer(View view, Rect rect) {
        MediaBrowserCompat$CustomActionResultReceiver(view, rect);
    }

    static void MediaBrowserCompat$CustomActionResultReceiver(View view, Rect rect) {
        MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) view.getLayoutParams();
        Rect rect2 = mediaDescriptionCompat.IconCompatParcelizer;
        int left = view.getLeft();
        int i = rect2.left;
        int i2 = mediaDescriptionCompat.leftMargin;
        int top = view.getTop();
        int i3 = rect2.top;
        int i4 = mediaDescriptionCompat.topMargin;
        int right = view.getRight();
        int i5 = rect2.right;
        rect.set((left - i) - i2, (top - i3) - i4, right + i5 + mediaDescriptionCompat.rightMargin, view.getBottom() + rect2.bottom + mediaDescriptionCompat.bottomMargin);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r3 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Rect MediaMetadataCompat(android.view.View r9) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r0 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r0
            boolean r1 = r0.read
            if (r1 != 0) goto L_0x000d
            android.graphics.Rect r9 = r0.IconCompatParcelizer
            return r9
        L_0x000d:
            androidx.recyclerview.widget.RecyclerView$Keep r1 = r8.ExpandedMenuView
            boolean r1 = r1.MediaBrowserCompat$ItemReceiver
            r2 = 0
            if (r1 == 0) goto L_0x0031
            androidx.recyclerview.widget.RecyclerView$setContentView r1 = r0.MediaBrowserCompat$SearchResultReceiver
            int r1 = r1.read
            r1 = r1 & 2
            r3 = 1
            if (r1 == 0) goto L_0x001f
            r1 = r3
            goto L_0x0020
        L_0x001f:
            r1 = r2
        L_0x0020:
            if (r1 != 0) goto L_0x002e
            androidx.recyclerview.widget.RecyclerView$setContentView r1 = r0.MediaBrowserCompat$SearchResultReceiver
            int r1 = r1.read
            r1 = r1 & 4
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r3 = r2
        L_0x002c:
            if (r3 == 0) goto L_0x0031
        L_0x002e:
            android.graphics.Rect r9 = r0.IconCompatParcelizer
            return r9
        L_0x0031:
            android.graphics.Rect r1 = r0.IconCompatParcelizer
            r1.set(r2, r2, r2, r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$RatingCompat> r3 = r8.setContentView
            int r3 = r3.size()
            r4 = r2
        L_0x003d:
            if (r4 >= r3) goto L_0x007a
            android.graphics.Rect r5 = r8.setVisibility
            r5.set(r2, r2, r2, r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$RatingCompat> r5 = r8.setContentView
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.RecyclerView$RatingCompat r5 = (androidx.recyclerview.widget.RecyclerView.RatingCompat) r5
            android.graphics.Rect r6 = r8.setVisibility
            androidx.recyclerview.widget.RecyclerView$Keep r7 = r8.ExpandedMenuView
            r5.read(r6, r9, r8, r7)
            int r5 = r1.left
            android.graphics.Rect r6 = r8.setVisibility
            int r6 = r6.left
            int r5 = r5 + r6
            r1.left = r5
            int r5 = r1.top
            android.graphics.Rect r6 = r8.setVisibility
            int r6 = r6.top
            int r5 = r5 + r6
            r1.top = r5
            int r5 = r1.right
            android.graphics.Rect r6 = r8.setVisibility
            int r6 = r6.right
            int r5 = r5 + r6
            r1.right = r5
            int r5 = r1.bottom
            android.graphics.Rect r6 = r8.setVisibility
            int r6 = r6.bottom
            int r5 = r5 + r6
            r1.bottom = r5
            int r4 = r4 + 1
            goto L_0x003d
        L_0x007a:
            r0.read = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat(android.view.View):android.graphics.Rect");
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        this.ActionBarContextView++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        ParcelableVolumeInfo parcelableVolumeInfo = this.setOnMenuItemClickListener;
        if (parcelableVolumeInfo != null) {
            parcelableVolumeInfo.IconCompatParcelizer(this, i, i2);
        }
        List<ParcelableVolumeInfo> list = this.setGroupDividerEnabled;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.setGroupDividerEnabled.get(size).IconCompatParcelizer(this, i, i2);
            }
        }
        this.ActionBarContextView--;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem(i);
        }
        ParcelableVolumeInfo parcelableVolumeInfo = this.setOnMenuItemClickListener;
        if (parcelableVolumeInfo != null) {
            parcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(this, i);
        }
        List<ParcelableVolumeInfo> list = this.setGroupDividerEnabled;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.setGroupDividerEnabled.get(size).MediaBrowserCompat$ItemReceiver(this, i);
            }
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.MediaSessionCompat$Token && !this.f23x50fd9e4a) {
            if (!(this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver.size() > 0)) {
                return false;
            }
        }
        return true;
    }

    class AppCompatActivity implements Runnable {
        boolean IconCompatParcelizer = false;
        int MediaBrowserCompat$CustomActionResultReceiver;
        OverScroller MediaBrowserCompat$ItemReceiver;
        private Interpolator MediaMetadataCompat = RecyclerView.MediaBrowserCompat$ItemReceiver;
        int read;
        boolean write = false;

        AppCompatActivity() {
            this.MediaBrowserCompat$ItemReceiver = new OverScroller(RecyclerView.this.getContext(), RecyclerView.MediaBrowserCompat$ItemReceiver);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fd, code lost:
            if (r9 <= 0) goto L_0x00ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0182, code lost:
            if (r1.setForceShowIcon.MediaBrowserCompat$CustomActionResultReceiver(1) != false) goto L_0x0184;
         */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00f9  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0108  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r23 = this;
                r0 = r23
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r1 = r1.AppCompatActivity
                if (r1 != 0) goto L_0x0013
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.removeCallbacks(r0)
                android.widget.OverScroller r1 = r0.MediaBrowserCompat$ItemReceiver
                r1.abortAnimation()
                return
            L_0x0013:
                r1 = 0
                r0.write = r1
                r2 = 1
                r0.IconCompatParcelizer = r2
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                r3.write()
                android.widget.OverScroller r3 = r0.MediaBrowserCompat$ItemReceiver
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r4 = r4.AppCompatActivity
                androidx.recyclerview.widget.RecyclerView$PlaybackStateCompat r4 = r4.AppCompatDelegateImpl$ListMenuDecorView
                boolean r5 = r3.computeScrollOffset()
                if (r5 == 0) goto L_0x01d9
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                int[] r5 = r5.setItemInvoker
                int r12 = r3.getCurrX()
                int r13 = r3.getCurrY()
                int r6 = r0.MediaBrowserCompat$CustomActionResultReceiver
                int r14 = r12 - r6
                int r6 = r0.read
                int r15 = r13 - r6
                r0.MediaBrowserCompat$CustomActionResultReceiver = r12
                r0.read = r13
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r10 = 0
                r11 = 1
                r7 = r14
                r8 = r15
                r9 = r5
                boolean r6 = r6.write(r7, r8, r9, r10, r11)
                if (r6 == 0) goto L_0x0057
                r6 = r5[r1]
                int r14 = r14 - r6
                r5 = r5[r2]
                int r15 = r15 - r5
            L_0x0057:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r5 = r5.MediaDescriptionCompat
                r6 = -1
                if (r5 == 0) goto L_0x00ac
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                int[] r7 = r5.setTitle
                r5.write((int) r14, (int) r15, (int[]) r7)
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                int[] r5 = r5.setTitle
                r5 = r5[r1]
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                int[] r7 = r7.setTitle
                r7 = r7[r2]
                int r8 = r14 - r5
                int r9 = r15 - r7
                if (r4 == 0) goto L_0x00b0
                boolean r10 = r4.MediaBrowserCompat$ItemReceiver
                if (r10 != 0) goto L_0x00b0
                boolean r10 = r4.RatingCompat
                if (r10 == 0) goto L_0x00b0
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Keep r10 = r10.ExpandedMenuView
                boolean r11 = r10.MediaBrowserCompat$ItemReceiver
                if (r11 == 0) goto L_0x008d
                int r11 = r10.MediaDescriptionCompat
                int r10 = r10.IconCompatParcelizer
                int r11 = r11 - r10
                goto L_0x008f
            L_0x008d:
                int r11 = r10.MediaBrowserCompat$MediaItem
            L_0x008f:
                if (r11 != 0) goto L_0x0095
                r4.MediaBrowserCompat$ItemReceiver()
                goto L_0x00b0
            L_0x0095:
                int r10 = r4.MediaBrowserCompat$MediaItem
                if (r10 < r11) goto L_0x00a4
                int r11 = r11 + r6
                r4.MediaBrowserCompat$MediaItem = r11
                int r10 = r14 - r8
                int r11 = r15 - r9
                r4.IconCompatParcelizer(r10, r11)
                goto L_0x00b0
            L_0x00a4:
                int r10 = r14 - r8
                int r11 = r15 - r9
                r4.IconCompatParcelizer(r10, r11)
                goto L_0x00b0
            L_0x00ac:
                r5 = r1
                r7 = r5
                r8 = r7
                r9 = r8
            L_0x00b0:
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$RatingCompat> r10 = r10.setContentView
                boolean r10 = r10.isEmpty()
                if (r10 != 0) goto L_0x00bf
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                r10.invalidate()
            L_0x00bf:
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                int r10 = r10.getOverScrollMode()
                r11 = 2
                if (r10 == r11) goto L_0x00cd
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                r10.IconCompatParcelizer((int) r14, (int) r15)
            L_0x00cd:
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                r21 = 0
                r22 = 1
                r16 = r10
                r17 = r5
                r18 = r7
                r19 = r8
                r20 = r9
                boolean r10 = r16.MediaBrowserCompat$CustomActionResultReceiver(r17, r18, r19, r20, r21, r22)
                if (r10 != 0) goto L_0x0124
                if (r8 != 0) goto L_0x00e7
                if (r9 == 0) goto L_0x0124
            L_0x00e7:
                float r10 = r3.getCurrVelocity()
                int r10 = (int) r10
                if (r8 == r12) goto L_0x00f6
                if (r8 >= 0) goto L_0x00f2
                int r6 = -r10
                goto L_0x00f7
            L_0x00f2:
                if (r8 <= 0) goto L_0x00f6
                r6 = r10
                goto L_0x00f7
            L_0x00f6:
                r6 = r1
            L_0x00f7:
                if (r9 == r13) goto L_0x00ff
                if (r9 >= 0) goto L_0x00fd
                int r10 = -r10
                goto L_0x0100
            L_0x00fd:
                if (r9 > 0) goto L_0x0100
            L_0x00ff:
                r10 = r1
            L_0x0100:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                int r1 = r1.getOverScrollMode()
                if (r1 == r11) goto L_0x010d
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.write((int) r6, (int) r10)
            L_0x010d:
                if (r6 != 0) goto L_0x0117
                if (r8 == r12) goto L_0x0117
                int r1 = r3.getFinalX()
                if (r1 != 0) goto L_0x0124
            L_0x0117:
                if (r10 != 0) goto L_0x0121
                if (r9 == r13) goto L_0x0121
                int r1 = r3.getFinalY()
                if (r1 != 0) goto L_0x0124
            L_0x0121:
                r3.abortAnimation()
            L_0x0124:
                if (r5 != 0) goto L_0x0128
                if (r7 == 0) goto L_0x012d
            L_0x0128:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.MediaBrowserCompat$CustomActionResultReceiver((int) r5, (int) r7)
            L_0x012d:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                boolean r1 = r1.awakenScrollBars()
                if (r1 != 0) goto L_0x013a
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.invalidate()
            L_0x013a:
                if (r15 == 0) goto L_0x014a
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r1 = r1.AppCompatActivity
                boolean r1 = r1.read()
                if (r1 == 0) goto L_0x014a
                if (r7 != r15) goto L_0x014a
                r1 = r2
                goto L_0x014b
            L_0x014a:
                r1 = 0
            L_0x014b:
                if (r14 == 0) goto L_0x015b
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r6 = r6.AppCompatActivity
                boolean r6 = r6.write()
                if (r6 == 0) goto L_0x015b
                if (r5 != r14) goto L_0x015b
                r5 = r2
                goto L_0x015c
            L_0x015b:
                r5 = 0
            L_0x015c:
                if (r14 != 0) goto L_0x0160
                if (r15 == 0) goto L_0x0166
            L_0x0160:
                if (r5 != 0) goto L_0x0166
                if (r1 != 0) goto L_0x0166
                r1 = 0
                goto L_0x0167
            L_0x0166:
                r1 = r2
            L_0x0167:
                boolean r3 = r3.isFinished()
                if (r3 != 0) goto L_0x01a5
                if (r1 != 0) goto L_0x0184
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                o.setBackgroundDrawable$write r3 = r1.setForceShowIcon
                if (r3 != 0) goto L_0x017c
                o.setBackgroundDrawable$write r3 = new o.setBackgroundDrawable$write
                r3.<init>(r1)
                r1.setForceShowIcon = r3
            L_0x017c:
                o.setBackgroundDrawable$write r1 = r1.setForceShowIcon
                boolean r1 = r1.MediaBrowserCompat$CustomActionResultReceiver((int) r2)
                if (r1 == 0) goto L_0x01a5
            L_0x0184:
                boolean r1 = r0.IconCompatParcelizer
                if (r1 == 0) goto L_0x018b
                r0.write = r2
                goto L_0x0195
            L_0x018b:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.removeCallbacks(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                p040o.SwitchCompat.MediaBrowserCompat$ItemReceiver((android.view.View) r1, (java.lang.Runnable) r0)
            L_0x0195:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                o.setOptimizationLevel r1 = r1.Keep
                if (r1 == 0) goto L_0x01d9
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                o.setOptimizationLevel r1 = r1.Keep
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                r1.write(r3, r14, r15)
                goto L_0x01d9
            L_0x01a5:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                int r3 = r1.ListMenuItemView
                if (r3 == 0) goto L_0x01b4
                r3 = 0
                r1.ListMenuItemView = r3
                r1.IconCompatParcelizer()
                r1.MediaBrowserCompat$ItemReceiver((int) r3)
            L_0x01b4:
                boolean r1 = androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
                if (r1 == 0) goto L_0x01c7
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                o.setOptimizationLevel$IconCompatParcelizer r1 = r1.setIcon
                int[] r3 = r1.write
                if (r3 == 0) goto L_0x01c4
                r5 = -1
                java.util.Arrays.fill(r3, r5)
            L_0x01c4:
                r3 = 0
                r1.IconCompatParcelizer = r3
            L_0x01c7:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                o.setBackgroundDrawable$write r3 = r1.setForceShowIcon
                if (r3 != 0) goto L_0x01d4
                o.setBackgroundDrawable$write r3 = new o.setBackgroundDrawable$write
                r3.<init>(r1)
                r1.setForceShowIcon = r3
            L_0x01d4:
                o.setBackgroundDrawable$write r1 = r1.setForceShowIcon
                r1.write(r2)
            L_0x01d9:
                if (r4 == 0) goto L_0x01ed
                boolean r1 = r4.MediaBrowserCompat$ItemReceiver
                if (r1 == 0) goto L_0x01e4
                r1 = 0
                r4.IconCompatParcelizer(r1, r1)
                goto L_0x01e5
            L_0x01e4:
                r1 = 0
            L_0x01e5:
                boolean r3 = r0.write
                if (r3 != 0) goto L_0x01ee
                r4.MediaBrowserCompat$ItemReceiver()
                goto L_0x01ee
            L_0x01ed:
                r1 = 0
            L_0x01ee:
                r0.IconCompatParcelizer = r1
                boolean r3 = r0.write
                if (r3 == 0) goto L_0x0203
                if (r1 == 0) goto L_0x01f9
                r0.write = r2
                return
            L_0x01f9:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.removeCallbacks(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                p040o.SwitchCompat.MediaBrowserCompat$ItemReceiver((android.view.View) r1, (java.lang.Runnable) r0)
            L_0x0203:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AppCompatActivity.run():void");
        }

        /* access modifiers changed from: package-private */
        public final int IconCompatParcelizer(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float sin = (float) Math.sin((double) ((Math.min(1.0f, ((float) sqrt2) / f) - 0.5f) * 0.47123894f));
            if (sqrt > 0) {
                i5 = Math.round(Math.abs((f2 + (sin * f2)) / ((float) sqrt)) * 1000.0f) << 2;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        }

        public final void IconCompatParcelizer(int i, int i2, int i3, Interpolator interpolator) {
            if (this.MediaMetadataCompat != interpolator) {
                this.MediaMetadataCompat = interpolator;
                this.MediaBrowserCompat$ItemReceiver = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.MediaBrowserCompat$MediaItem(2);
            this.read = 0;
            this.MediaBrowserCompat$CustomActionResultReceiver = 0;
            this.MediaBrowserCompat$ItemReceiver.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.MediaBrowserCompat$ItemReceiver.computeScrollOffset();
            }
            if (this.IconCompatParcelizer) {
                this.write = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            SwitchCompat.MediaBrowserCompat$ItemReceiver((View) RecyclerView.this, (Runnable) this);
        }
    }

    private void AppCompatActivity() {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        int MediaBrowserCompat$CustomActionResultReceiver2 = setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size();
        for (int i = 0; i < MediaBrowserCompat$CustomActionResultReceiver2; i++) {
            setMinWidth setminwidth2 = this.MediaSessionCompat$ResultReceiverWrapper;
            View MediaBrowserCompat$CustomActionResultReceiver3 = setminwidth2.read.MediaBrowserCompat$CustomActionResultReceiver(setminwidth2.MediaBrowserCompat$ItemReceiver(i));
            setContentView MediaBrowserCompat$MediaItem2 = MediaBrowserCompat$MediaItem(MediaBrowserCompat$CustomActionResultReceiver3);
            if (!(MediaBrowserCompat$MediaItem2 == null || MediaBrowserCompat$MediaItem2.MediaSessionCompat$Token == null)) {
                View view = MediaBrowserCompat$MediaItem2.MediaSessionCompat$Token.write;
                int left = MediaBrowserCompat$CustomActionResultReceiver3.getLeft();
                int top = MediaBrowserCompat$CustomActionResultReceiver3.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    static RecyclerView MediaBrowserCompat$ItemReceiver(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(viewGroup.getChildAt(i));
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                return MediaBrowserCompat$ItemReceiver2;
            }
        }
        return null;
    }

    static void read(setContentView setcontentview) {
        if (setcontentview.RatingCompat != null) {
            View view = setcontentview.RatingCompat.get();
            while (view != null) {
                if (view != setcontentview.write) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            setcontentview.RatingCompat = null;
        }
    }

    public static long MediaBrowserCompat$ItemReceiver() {
        if (IconCompatParcelizer) {
            return System.nanoTime();
        }
        return 0;
    }

    public static abstract class IconCompatParcelizer<VH extends setContentView> {
        public final write IconCompatParcelizer = new write();
        public boolean MediaBrowserCompat$CustomActionResultReceiver = false;

        public abstract int IconCompatParcelizer();

        public abstract VH IconCompatParcelizer(ViewGroup viewGroup, int i);

        public void IconCompatParcelizer(VH vh) {
        }

        public int MediaBrowserCompat$CustomActionResultReceiver(int i) {
            return 0;
        }

        public void MediaBrowserCompat$CustomActionResultReceiver(VH vh) {
        }

        public abstract void MediaBrowserCompat$CustomActionResultReceiver(VH vh, int i);

        public long MediaBrowserCompat$ItemReceiver(int i) {
            return -1;
        }

        public void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView) {
        }

        public boolean MediaBrowserCompat$ItemReceiver(VH vh) {
            return false;
        }

        public void write(VH vh) {
        }

        public void write(RecyclerView recyclerView) {
        }

        public void write(VH vh, int i, List<Object> list) {
            MediaBrowserCompat$CustomActionResultReceiver(vh, i);
        }

        public final VH MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup, int i) {
            try {
                setMeasureWithLargestChildEnabled.read("RV CreateView");
                VH IconCompatParcelizer2 = IconCompatParcelizer(viewGroup, i);
                if (IconCompatParcelizer2.write.getParent() == null) {
                    IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = i;
                    return IconCompatParcelizer2;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                setMeasureWithLargestChildEnabled.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        public void MediaBrowserCompat$ItemReceiver(boolean z) {
            if (!this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()) {
                this.MediaBrowserCompat$CustomActionResultReceiver = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }

    public static abstract class RatingCompat {
        public void IconCompatParcelizer(Canvas canvas, RecyclerView recyclerView) {
        }

        public void read(Canvas canvas, RecyclerView recyclerView) {
        }

        public void read(Rect rect, View view, RecyclerView recyclerView, Keep keep) {
            view.getLayoutParams();
            rect.set(0, 0, 0, 0);
        }
    }

    public static abstract class setContentView {
        private static final List<Object> setHasDecor = Collections.emptyList();
        boolean IconCompatParcelizer = false;
        private int Keep = 0;
        public int MediaBrowserCompat$CustomActionResultReceiver = -1;
        public long MediaBrowserCompat$ItemReceiver = -1;
        int MediaBrowserCompat$MediaItem = -1;
        List<Object> MediaBrowserCompat$SearchResultReceiver = null;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        setContentView f26x50fd9e4a = null;
        int MediaDescriptionCompat = -1;
        public RecyclerView MediaMetadataCompat;
        public int MediaSessionCompat$QueueItem = -1;
        RecyclerView$MediaSessionCompat$ResultReceiverWrapper MediaSessionCompat$ResultReceiverWrapper = null;
        setContentView MediaSessionCompat$Token = null;
        public int ParcelableVolumeInfo = -1;
        private List<Object> PlaybackStateCompat = null;
        int PlaybackStateCompat$CustomAction = 0;
        public WeakReference<RecyclerView> RatingCompat;
        public int read;
        public final View write;

        public setContentView(View view) {
            if (view != null) {
                this.write = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* access modifiers changed from: package-private */
        public final void write(int i, boolean z) {
            if (this.MediaBrowserCompat$MediaItem == -1) {
                this.MediaBrowserCompat$MediaItem = this.MediaSessionCompat$QueueItem;
            }
            if (this.ParcelableVolumeInfo == -1) {
                this.ParcelableVolumeInfo = this.MediaSessionCompat$QueueItem;
            }
            if (z) {
                this.ParcelableVolumeInfo += i;
            }
            this.MediaSessionCompat$QueueItem += i;
            if (this.write.getLayoutParams() != null) {
                ((MediaDescriptionCompat) this.write.getLayoutParams()).read = true;
            }
        }

        /* renamed from: s_ */
        public final int mo1614s_() {
            RecyclerView recyclerView = this.MediaMetadataCompat;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.MediaBrowserCompat$CustomActionResultReceiver(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t_ */
        public final List<Object> mo1615t_() {
            if ((this.read & 1024) != 0) {
                return setHasDecor;
            }
            List<Object> list = this.MediaBrowserCompat$SearchResultReceiver;
            if (list == null || list.size() == 0) {
                return setHasDecor;
            }
            return this.PlaybackStateCompat;
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.read = 0;
            this.MediaSessionCompat$QueueItem = -1;
            this.MediaBrowserCompat$MediaItem = -1;
            this.MediaBrowserCompat$ItemReceiver = -1;
            this.ParcelableVolumeInfo = -1;
            this.Keep = 0;
            this.f26x50fd9e4a = null;
            this.MediaSessionCompat$Token = null;
            List<Object> list = this.MediaBrowserCompat$SearchResultReceiver;
            if (list != null) {
                list.clear();
            }
            this.read &= -1025;
            this.PlaybackStateCompat$CustomAction = 0;
            this.MediaDescriptionCompat = -1;
            RecyclerView.read(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fc, code lost:
            if (((r0 & 4) != 0) == false) goto L_0x0100;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ViewHolder{"
                r0.append(r1)
                int r1 = r5.hashCode()
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " position="
                r0.append(r1)
                int r1 = r5.MediaSessionCompat$QueueItem
                r0.append(r1)
                java.lang.String r1 = " id="
                r0.append(r1)
                long r1 = r5.MediaBrowserCompat$ItemReceiver
                r0.append(r1)
                java.lang.String r1 = ", oldPos="
                r0.append(r1)
                int r1 = r5.MediaBrowserCompat$MediaItem
                r0.append(r1)
                java.lang.String r1 = ", pLpos:"
                r0.append(r1)
                int r1 = r5.ParcelableVolumeInfo
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r0 = r5.MediaSessionCompat$ResultReceiverWrapper
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L_0x004e
                r0 = r3
                goto L_0x004f
            L_0x004e:
                r0 = r2
            L_0x004f:
                if (r0 == 0) goto L_0x0062
                java.lang.String r0 = " scrap "
                r1.append(r0)
                boolean r0 = r5.IconCompatParcelizer
                if (r0 == 0) goto L_0x005d
                java.lang.String r0 = "[changeScrap]"
                goto L_0x005f
            L_0x005d:
                java.lang.String r0 = "[attachedScrap]"
            L_0x005f:
                r1.append(r0)
            L_0x0062:
                int r0 = r5.read
                r0 = r0 & 4
                if (r0 == 0) goto L_0x006a
                r0 = r3
                goto L_0x006b
            L_0x006a:
                r0 = r2
            L_0x006b:
                if (r0 == 0) goto L_0x0072
                java.lang.String r0 = " invalid"
                r1.append(r0)
            L_0x0072:
                int r0 = r5.read
                r0 = r0 & r3
                if (r0 != 0) goto L_0x0079
                r0 = r2
                goto L_0x007a
            L_0x0079:
                r0 = r3
            L_0x007a:
                if (r0 != 0) goto L_0x0081
                java.lang.String r0 = " unbound"
                r1.append(r0)
            L_0x0081:
                int r0 = r5.read
                r0 = r0 & 2
                if (r0 == 0) goto L_0x0089
                r0 = r3
                goto L_0x008a
            L_0x0089:
                r0 = r2
            L_0x008a:
                if (r0 == 0) goto L_0x0091
                java.lang.String r0 = " update"
                r1.append(r0)
            L_0x0091:
                int r0 = r5.read
                r0 = r0 & 8
                if (r0 == 0) goto L_0x0099
                r0 = r3
                goto L_0x009a
            L_0x0099:
                r0 = r2
            L_0x009a:
                if (r0 == 0) goto L_0x00a1
                java.lang.String r0 = " removed"
                r1.append(r0)
            L_0x00a1:
                int r0 = r5.read
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x00a9
                r0 = r3
                goto L_0x00aa
            L_0x00a9:
                r0 = r2
            L_0x00aa:
                if (r0 == 0) goto L_0x00b1
                java.lang.String r0 = " ignored"
                r1.append(r0)
            L_0x00b1:
                int r0 = r5.read
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x00b9
                r0 = r3
                goto L_0x00ba
            L_0x00b9:
                r0 = r2
            L_0x00ba:
                if (r0 == 0) goto L_0x00c1
                java.lang.String r0 = " tmpDetached"
                r1.append(r0)
            L_0x00c1:
                int r0 = r5.read
                r0 = r0 & 16
                if (r0 != 0) goto L_0x00d1
                android.view.View r0 = r5.write
                boolean r0 = p040o.SwitchCompat.AppCompatViewInflater(r0)
                if (r0 != 0) goto L_0x00d1
                r0 = r3
                goto L_0x00d2
            L_0x00d1:
                r0 = r2
            L_0x00d2:
                if (r0 != 0) goto L_0x00ef
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = " not recyclable("
                r0.append(r4)
                int r4 = r5.Keep
                r0.append(r4)
                java.lang.String r4 = ")"
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                r1.append(r0)
            L_0x00ef:
                int r0 = r5.read
                r4 = r0 & 512(0x200, float:7.175E-43)
                if (r4 != 0) goto L_0x00ff
                r0 = r0 & 4
                if (r0 == 0) goto L_0x00fb
                r0 = r3
                goto L_0x00fc
            L_0x00fb:
                r0 = r2
            L_0x00fc:
                if (r0 != 0) goto L_0x00ff
                goto L_0x0100
            L_0x00ff:
                r2 = r3
            L_0x0100:
                if (r2 == 0) goto L_0x0107
                java.lang.String r0 = " undefined adapter position"
                r1.append(r0)
            L_0x0107:
                android.view.View r0 = r5.write
                android.view.ViewParent r0 = r0.getParent()
                if (r0 != 0) goto L_0x0114
                java.lang.String r0 = " no parent"
                r1.append(r0)
            L_0x0114:
                java.lang.String r0 = "}"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.setContentView.toString():java.lang.String");
        }

        public final void read(boolean z) {
            int i = this.Keep;
            int i2 = z ? i - 1 : i + 1;
            this.Keep = i2;
            if (i2 < 0) {
                this.Keep = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
            } else if (!z && i2 == 1) {
                this.read |= 16;
            } else if (z && this.Keep == 0) {
                this.read &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver(Object obj) {
            if (obj == null) {
                this.read |= 1024;
            } else if ((this.read & 1024) == 0) {
                if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                    ArrayList arrayList = new ArrayList();
                    this.MediaBrowserCompat$SearchResultReceiver = arrayList;
                    this.PlaybackStateCompat = Collections.unmodifiableList(arrayList);
                }
                this.MediaBrowserCompat$SearchResultReceiver.add(obj);
            }
        }
    }

    private void setHasDecor() {
        int i;
        for (int size = this.setShortcut.size() - 1; size >= 0; size--) {
            setContentView setcontentview = this.setShortcut.get(size);
            if (setcontentview.write.getParent() == this) {
                if (!((setcontentview.read & 128) != 0) && (i = setcontentview.MediaDescriptionCompat) != -1) {
                    SwitchCompat.write(setcontentview.write, i);
                    setcontentview.MediaDescriptionCompat = -1;
                }
            }
        }
        this.setShortcut.clear();
    }

    public static class MediaDescriptionCompat extends ViewGroup.MarginLayoutParams {
        public final Rect IconCompatParcelizer = new Rect();
        boolean MediaBrowserCompat$ItemReceiver = false;
        public setContentView MediaBrowserCompat$SearchResultReceiver;
        boolean read = true;

        public MediaDescriptionCompat(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public MediaDescriptionCompat(int i, int i2) {
            super(i, i2);
        }

        public MediaDescriptionCompat(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public MediaDescriptionCompat(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public MediaDescriptionCompat(MediaDescriptionCompat mediaDescriptionCompat) {
            super(mediaDescriptionCompat);
        }
    }

    public static abstract class read {
        public void IconCompatParcelizer(int i, int i2) {
        }

        public void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        }

        public void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        }

        public void write() {
        }

        public void write(int i, int i2) {
        }

        public void IconCompatParcelizer(int i, int i2, Object obj) {
            MediaBrowserCompat$CustomActionResultReceiver(i, i2);
        }
    }

    public static abstract class PlaybackStateCompat {
        boolean MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$MediaItem = -1;
        boolean MediaBrowserCompat$SearchResultReceiver;
        View MediaDescriptionCompat;
        public RecyclerView MediaMetadataCompat;
        boolean RatingCompat;
        public RecyclerView$MediaBrowserCompat$SearchResultReceiver read;
        private final write write = new write();

        public interface read {
            PointF IconCompatParcelizer(int i);
        }

        /* access modifiers changed from: protected */
        public abstract void IconCompatParcelizer();

        /* access modifiers changed from: protected */
        public abstract void read(View view, Keep keep, write write2);

        /* access modifiers changed from: protected */
        public abstract void write(int i, int i2, write write2);

        /* access modifiers changed from: protected */
        public final void MediaBrowserCompat$ItemReceiver() {
            if (this.RatingCompat) {
                this.RatingCompat = false;
                IconCompatParcelizer();
                this.MediaMetadataCompat.ExpandedMenuView.ParcelableVolumeInfo = -1;
                this.MediaDescriptionCompat = null;
                this.MediaBrowserCompat$MediaItem = -1;
                this.MediaBrowserCompat$ItemReceiver = false;
                RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.read;
                if (recyclerView$MediaBrowserCompat$SearchResultReceiver.AppCompatDelegateImpl$ListMenuDecorView == this) {
                    recyclerView$MediaBrowserCompat$SearchResultReceiver.AppCompatDelegateImpl$ListMenuDecorView = null;
                }
                this.read = null;
                this.MediaMetadataCompat = null;
            }
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer(int i, int i2) {
            PointF write2;
            RecyclerView recyclerView = this.MediaMetadataCompat;
            if (!this.RatingCompat || this.MediaBrowserCompat$MediaItem == -1 || recyclerView == null) {
                MediaBrowserCompat$ItemReceiver();
            }
            if (!(!this.MediaBrowserCompat$ItemReceiver || this.MediaDescriptionCompat != null || this.read == null || (write2 = write(this.MediaBrowserCompat$MediaItem)) == null || (write2.x == BitmapDescriptorFactory.HUE_RED && write2.y == BitmapDescriptorFactory.HUE_RED))) {
                recyclerView.write((int) Math.signum(write2.x), (int) Math.signum(write2.y), (int[]) null);
            }
            boolean z = false;
            this.MediaBrowserCompat$ItemReceiver = false;
            View view = this.MediaDescriptionCompat;
            if (view != null) {
                if (RecyclerView.RatingCompat(view) == this.MediaBrowserCompat$MediaItem) {
                    read(this.MediaDescriptionCompat, recyclerView.ExpandedMenuView, this.write);
                    this.write.MediaBrowserCompat$ItemReceiver(recyclerView);
                    MediaBrowserCompat$ItemReceiver();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.MediaDescriptionCompat = null;
                }
            }
            if (this.RatingCompat) {
                write(i, i2, this.write);
                if (this.write.RatingCompat >= 0) {
                    z = true;
                }
                this.write.MediaBrowserCompat$ItemReceiver(recyclerView);
                if (!z) {
                    return;
                }
                if (this.RatingCompat) {
                    this.MediaBrowserCompat$ItemReceiver = true;
                    AppCompatActivity appCompatActivity = recyclerView.AbsActionBarView;
                    if (appCompatActivity.IconCompatParcelizer) {
                        appCompatActivity.write = true;
                        return;
                    }
                    RecyclerView.this.removeCallbacks(appCompatActivity);
                    SwitchCompat.MediaBrowserCompat$ItemReceiver((View) RecyclerView.this, (Runnable) appCompatActivity);
                    return;
                }
                MediaBrowserCompat$ItemReceiver();
            }
        }

        public static class write {
            public int IconCompatParcelizer;
            public int MediaBrowserCompat$CustomActionResultReceiver;
            public Interpolator MediaBrowserCompat$ItemReceiver;
            private int MediaBrowserCompat$MediaItem;
            public int RatingCompat;
            public int read;
            public boolean write;

            public write() {
                this(0, 0);
            }

            private write(int i, int i2) {
                this.RatingCompat = -1;
                this.write = false;
                this.MediaBrowserCompat$MediaItem = 0;
                this.read = 0;
                this.IconCompatParcelizer = 0;
                this.MediaBrowserCompat$CustomActionResultReceiver = PKIFailureInfo.systemUnavail;
                this.MediaBrowserCompat$ItemReceiver = null;
            }

            /* access modifiers changed from: package-private */
            public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView) {
                int i = this.RatingCompat;
                if (i >= 0) {
                    this.RatingCompat = -1;
                    recyclerView.read(i);
                    this.write = false;
                } else if (this.write) {
                    write();
                    if (this.MediaBrowserCompat$ItemReceiver != null) {
                        recyclerView.AbsActionBarView.IconCompatParcelizer(this.read, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
                    } else if (this.MediaBrowserCompat$CustomActionResultReceiver == Integer.MIN_VALUE) {
                        AppCompatActivity appCompatActivity = recyclerView.AbsActionBarView;
                        int i2 = this.read;
                        int i3 = this.IconCompatParcelizer;
                        appCompatActivity.IconCompatParcelizer(i2, i3, appCompatActivity.IconCompatParcelizer(i2, i3, 0, 0), RecyclerView.MediaBrowserCompat$ItemReceiver);
                    } else {
                        recyclerView.AbsActionBarView.IconCompatParcelizer(this.read, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, RecyclerView.MediaBrowserCompat$ItemReceiver);
                    }
                    int i4 = this.MediaBrowserCompat$MediaItem + 1;
                    this.MediaBrowserCompat$MediaItem = i4;
                    if (i4 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.write = false;
                } else {
                    this.MediaBrowserCompat$MediaItem = 0;
                }
            }

            private void write() {
                if (this.MediaBrowserCompat$ItemReceiver != null && this.MediaBrowserCompat$CustomActionResultReceiver <= 0) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.MediaBrowserCompat$CustomActionResultReceiver <= 0) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        public static class CustomAction extends setTitleMarginBottom {
            public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.ClassLoaderCreator<CustomAction>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new CustomAction(parcel, (ClassLoader) null);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new CustomAction(parcel, classLoader);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new CustomAction[i];
                }
            };
            Parcelable read;

            CustomAction(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.read = parcel.readParcelable(classLoader == null ? RecyclerView$MediaBrowserCompat$SearchResultReceiver.class.getClassLoader() : classLoader);
            }

            CustomAction(Parcelable parcelable) {
                super(parcelable);
            }

            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeParcelable(this.read, 0);
            }
        }

        public final PointF write(int i) {
            RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.read;
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof read) {
                return ((read) recyclerView$MediaBrowserCompat$SearchResultReceiver).IconCompatParcelizer(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(read.class.getCanonicalName());
            Log.w("RecyclerView", sb.toString());
            return null;
        }
    }

    public static class write extends Observable<read> {
        write() {
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
            return !this.mObservers.isEmpty();
        }

        public final void write() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((read) this.mObservers.get(size)).write();
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(int i, int i2) {
            MediaBrowserCompat$ItemReceiver(i, i2, (Object) null);
        }

        public final void MediaBrowserCompat$ItemReceiver(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((read) this.mObservers.get(size)).IconCompatParcelizer(i, i2, obj);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((read) this.mObservers.get(size)).write(i, i2);
            }
        }

        public final void write(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((read) this.mObservers.get(size)).MediaBrowserCompat$ItemReceiver(i, i2);
            }
        }

        public final void IconCompatParcelizer(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((read) this.mObservers.get(size)).IconCompatParcelizer(i, i2);
            }
        }
    }

    public static class Keep {
        public int IconCompatParcelizer = 0;
        int MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver = false;
        public int MediaBrowserCompat$MediaItem = 0;
        public boolean MediaBrowserCompat$SearchResultReceiver = false;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        boolean f24x50fd9e4a = false;
        public int MediaDescriptionCompat = 0;
        public int MediaMetadataCompat = 1;
        boolean MediaSessionCompat$QueueItem = false;
        public boolean MediaSessionCompat$Token = false;
        int ParcelableVolumeInfo = -1;
        boolean RatingCompat = false;
        long read;
        int write;

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver(int i) {
            if ((this.MediaMetadataCompat & i) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.MediaMetadataCompat));
                throw new IllegalStateException(sb.toString());
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State{mTargetPosition=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", mData=");
            sb.append((Object) null);
            sb.append(", mItemCount=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", mIsMeasuring=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", mStructureChanged=");
            sb.append(this.f24x50fd9e4a);
            sb.append(", mInPreLayout=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.MediaSessionCompat$QueueItem);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.RatingCompat);
            sb.append('}');
            return sb.toString();
        }
    }

    public static abstract class MediaMetadataCompat {
        public long MediaBrowserCompat$SearchResultReceiver = 250;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public long f25x50fd9e4a = 250;
        public read MediaDescriptionCompat = null;
        public long MediaSessionCompat$Token = 120;
        public long RatingCompat = 120;
        private ArrayList<Object> write = new ArrayList<>();

        public interface read {
            void write(setContentView setcontentview);
        }

        public abstract void IconCompatParcelizer();

        public abstract boolean IconCompatParcelizer(setContentView setcontentview, IconCompatParcelizer iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2);

        public boolean MediaBrowserCompat$CustomActionResultReceiver(setContentView setcontentview) {
            return true;
        }

        public abstract boolean MediaBrowserCompat$ItemReceiver(setContentView setcontentview, setContentView setcontentview2, IconCompatParcelizer iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2);

        public abstract void read(setContentView setcontentview);

        public abstract boolean read();

        public abstract boolean read(setContentView setcontentview, IconCompatParcelizer iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2);

        public abstract void write();

        public abstract boolean write(setContentView setcontentview, IconCompatParcelizer iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2);

        static int MediaBrowserCompat$ItemReceiver(setContentView setcontentview) {
            int i;
            int i2 = setcontentview.read & 14;
            if ((setcontentview.read & 4) != 0) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int i3 = setcontentview.MediaBrowserCompat$MediaItem;
            RecyclerView recyclerView = setcontentview.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
            }
            return (i3 == -1 || i == -1 || i3 == i) ? i2 : i2 | 2048;
        }

        public boolean MediaBrowserCompat$CustomActionResultReceiver(setContentView setcontentview, List<Object> list) {
            return MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            int size = this.write.size();
            for (int i = 0; i < size; i++) {
                this.write.get(i);
            }
            this.write.clear();
        }

        public static IconCompatParcelizer MediaBrowserCompat$ItemReceiver() {
            return new IconCompatParcelizer();
        }

        public static class IconCompatParcelizer {
            public int MediaBrowserCompat$CustomActionResultReceiver;
            public int read;

            public final IconCompatParcelizer IconCompatParcelizer(setContentView setcontentview) {
                View view = setcontentview.write;
                this.read = view.getLeft();
                this.MediaBrowserCompat$CustomActionResultReceiver = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        RecyclerView$MediaBrowserCompat$ItemReceiver recyclerView$MediaBrowserCompat$ItemReceiver = this.setTitleOptional;
        if (recyclerView$MediaBrowserCompat$ItemReceiver == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return recyclerView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private void MediaBrowserCompat$SearchResultReceiver() {
        VelocityTracker velocityTracker = this.setPopupTheme;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        this.setForceShowIcon.write(0);
        MediaSessionCompat$ResultReceiverWrapper();
        if (this.ListMenuItemView != 0) {
            this.ListMenuItemView = 0;
            AppCompatActivity appCompatActivity = this.AbsActionBarView;
            RecyclerView.this.removeCallbacks(appCompatActivity);
            appCompatActivity.MediaBrowserCompat$ItemReceiver.abortAnimation();
            RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
                recyclerView$MediaBrowserCompat$SearchResultReceiver.setHasDecor();
            }
            MediaBrowserCompat$ItemReceiver(0);
        }
    }

    private void RatingCompat() {
        int i = this.PlaybackStateCompat$CustomAction + 1;
        this.PlaybackStateCompat$CustomAction = i;
        if (i == 1 && !this.setCheckable) {
            this.AppCompatViewInflater = false;
        }
        this.ActionMenuItemView++;
        this.ExpandedMenuView.MediaBrowserCompat$ItemReceiver(6);
        this.MediaBrowserCompat$MediaItem.read();
        this.ExpandedMenuView.MediaBrowserCompat$MediaItem = this.MediaDescriptionCompat.IconCompatParcelizer();
        this.ExpandedMenuView.IconCompatParcelizer = 0;
        this.ExpandedMenuView.MediaBrowserCompat$ItemReceiver = false;
        this.AppCompatActivity.MediaBrowserCompat$CustomActionResultReceiver(this.setPadding, this.ExpandedMenuView);
        this.ExpandedMenuView.f24x50fd9e4a = false;
        this.ActionMenuView = null;
        Keep keep = this.ExpandedMenuView;
        keep.MediaSessionCompat$QueueItem = keep.MediaSessionCompat$QueueItem && this.AlertController$RecycleListView != null;
        this.ExpandedMenuView.MediaMetadataCompat = 4;
        read(true);
        write(false);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(String str) {
        if (this.ActionMenuItemView > 0) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(read());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.ActionBarContextView > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(read());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(View view) {
        setContentView setcontentview;
        if (view == null) {
            setcontentview = null;
        } else {
            setcontentview = ((MediaDescriptionCompat) view.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
        }
        IconCompatParcelizer iconCompatParcelizer = this.MediaDescriptionCompat;
        if (iconCompatParcelizer != null && setcontentview != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        return this.setForceShowIcon.MediaBrowserCompat$ItemReceiver(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        return this.setForceShowIcon.MediaBrowserCompat$ItemReceiver(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        return this.setForceShowIcon.MediaBrowserCompat$ItemReceiver(i, i2, iArr, iArr2, 0);
    }

    public final boolean write(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        return this.setForceShowIcon.MediaBrowserCompat$ItemReceiver(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        return this.setForceShowIcon.IconCompatParcelizer(i, i2, i3, i4, iArr, 0);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        return this.setForceShowIcon.IconCompatParcelizer(i, i2, i3, i4, iArr, i5);
    }

    private void setContentView() {
        if (this.ListMenuItemView == 2) {
            OverScroller overScroller = this.AbsActionBarView.MediaBrowserCompat$ItemReceiver;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(setContentView setcontentview) {
        boolean z = false;
        if ((setcontentview.read & 524) != 0) {
            return -1;
        }
        if ((setcontentview.read & 1) != 0) {
            z = true;
        }
        if (z) {
            return this.MediaBrowserCompat$MediaItem.read(setcontentview.MediaSessionCompat$QueueItem);
        }
        return -1;
    }

    public static int read(View view) {
        RecyclerView recyclerView;
        setContentView setcontentview = view == null ? null : ((MediaDescriptionCompat) view.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
        if (setcontentview == null || (recyclerView = setcontentview.MediaMetadataCompat) == null) {
            return -1;
        }
        return recyclerView.MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
    }

    public static int RatingCompat(View view) {
        setContentView setcontentview = view == null ? null : ((MediaDescriptionCompat) view.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
        if (setcontentview == null) {
            return -1;
        }
        int i = setcontentview.ParcelableVolumeInfo;
        return i == -1 ? setcontentview.MediaSessionCompat$QueueItem : i;
    }

    public boolean hasNestedScrollingParent() {
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        return this.setForceShowIcon.MediaBrowserCompat$CustomActionResultReceiver(0);
    }

    public boolean isNestedScrollingEnabled() {
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        return this.setForceShowIcon.write;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.ActionMenuItemView > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(setContentView setcontentview, MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer) {
        long j;
        boolean z = false;
        setcontentview.read = (setcontentview.read & -8193) | 0;
        if (this.ExpandedMenuView.MediaSessionCompat$Token) {
            if ((setcontentview.read & 2) != 0) {
                if (!((setcontentview.read & 8) != 0)) {
                    if ((setcontentview.read & 128) != 0) {
                        z = true;
                    }
                    if (!z) {
                        if (this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver) {
                            j = setcontentview.MediaBrowserCompat$ItemReceiver;
                        } else {
                            j = (long) setcontentview.MediaSessionCompat$QueueItem;
                        }
                        this.MenuItemWrapperICS$CollapsibleActionViewWrapper.read.read(j, setcontentview);
                    }
                }
            }
        }
        this.MenuItemWrapperICS$CollapsibleActionViewWrapper.IconCompatParcelizer(setcontentview, iconCompatParcelizer);
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        setContentView setcontentview = view == null ? null : ((MediaDescriptionCompat) view.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
        if (setcontentview != null) {
            boolean z2 = true;
            if ((setcontentview.read & 256) != 0) {
                setcontentview.read &= -257;
            } else {
                if ((setcontentview.read & 128) == 0) {
                    z2 = false;
                }
                if (!z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                    sb.append(setcontentview);
                    sb.append(read());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        view.clearAnimation();
        IconCompatParcelizer(view);
        super.removeDetachedView(view, z);
    }

    /* access modifiers changed from: package-private */
    public final void write(int i, int i2, int[] iArr) {
        int i3 = this.PlaybackStateCompat$CustomAction + 1;
        this.PlaybackStateCompat$CustomAction = i3;
        if (i3 == 1 && !this.setCheckable) {
            this.AppCompatViewInflater = false;
        }
        this.ActionMenuItemView++;
        setMeasureWithLargestChildEnabled.read("RV Scroll");
        setContentView();
        int write2 = i != 0 ? this.AppCompatActivity.write(i, this.setPadding, this.ExpandedMenuView) : 0;
        int MediaBrowserCompat$CustomActionResultReceiver2 = i2 != 0 ? this.AppCompatActivity.MediaBrowserCompat$CustomActionResultReceiver(i2, this.setPadding, this.ExpandedMenuView) : 0;
        setMeasureWithLargestChildEnabled.MediaBrowserCompat$CustomActionResultReceiver();
        AppCompatActivity();
        read(true);
        write(false);
        if (iArr != null) {
            iArr[0] = write2;
            iArr[1] = MediaBrowserCompat$CustomActionResultReceiver2;
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        int i = 0;
        if (this.ActionMenuItemView > 0) {
            int read2 = accessibilityEvent != null ? setThumbTextPadding.read(accessibilityEvent) : 0;
            if (read2 != 0) {
                i = read2;
            }
            this.setSubtitle |= i;
        } else {
            z = false;
        }
        if (!z) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(setContentView setcontentview, int i) {
        if (this.ActionMenuItemView > 0) {
            setcontentview.MediaDescriptionCompat = i;
            this.setShortcut.add(setcontentview);
            return false;
        }
        SwitchCompat.write(setcontentview.write, i);
        return true;
    }

    public void setEdgeEffectFactory(RecyclerView$MediaBrowserCompat$CustomActionResultReceiver recyclerView$MediaBrowserCompat$CustomActionResultReceiver) {
        this.setCustomView = null;
        this.ActivityChooserView = null;
        this.ActionMenuPresenter$OverflowMenuButton = null;
        this.setMenuPrepared = null;
    }

    public void setNestedScrollingEnabled(boolean z) {
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        setBackgroundDrawable.write write2 = this.setForceShowIcon;
        if (write2.write) {
            SwitchCompat.setIcon(write2.MediaBrowserCompat$ItemReceiver);
        }
        write2.write = z;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.setCheckable) {
            if (!recyclerView$MediaBrowserCompat$SearchResultReceiver.write()) {
                i = 0;
            }
            if (!this.AppCompatActivity.read()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                AppCompatActivity appCompatActivity = this.AbsActionBarView;
                appCompatActivity.IconCompatParcelizer(i, i2, appCompatActivity.IconCompatParcelizer(i, i2, 0, 0), MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    public boolean startNestedScroll(int i) {
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        return this.setForceShowIcon.MediaBrowserCompat$CustomActionResultReceiver(i, 0);
    }

    public void stopNestedScroll() {
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        this.setForceShowIcon.write(0);
    }

    public final void IconCompatParcelizer(int i) {
        if (this.setForceShowIcon == null) {
            this.setForceShowIcon = new setBackgroundDrawable.write(this);
        }
        this.setForceShowIcon.write(i);
    }
}

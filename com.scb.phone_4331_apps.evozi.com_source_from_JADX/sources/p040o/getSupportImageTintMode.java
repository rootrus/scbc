package p040o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p040o.getSupportImageTintList;

/* renamed from: o.getSupportImageTintMode */
public class getSupportImageTintMode {
    private static SparseIntArray IconCompatParcelizer;
    private static final int[] write = {0, 4, 8};
    public HashMap<Integer, write> MediaBrowserCompat$CustomActionResultReceiver = new HashMap<>();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        IconCompatParcelizer = sparseIntArray;
        sparseIntArray.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintRight_toRightOf, 30);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintTop_toTopOf, 36);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_editor_absoluteX, 6);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_editor_absoluteY, 7);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintGuide_begin, 17);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintGuide_end, 18);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintGuide_percent, 19);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_orientation, 27);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintStart_toEndOf, 32);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintStart_toStartOf, 33);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_goneMarginLeft, 13);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_goneMarginTop, 16);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_goneMarginRight, 14);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_goneMarginBottom, 11);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_goneMarginStart, 15);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_goneMarginEnd, 12);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintVertical_weight, 40);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintHorizontal_weight, 39);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintHorizontal_bias, 20);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintVertical_bias, 37);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintDimensionRatio, 5);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintLeft_creator, 75);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintTop_creator, 75);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintRight_creator, 75);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintBottom_creator, 75);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintBaseline_creator, 75);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_layout_marginLeft, 24);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_layout_marginRight, 28);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_layout_marginStart, 31);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_layout_marginEnd, 8);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_layout_marginTop, 34);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_layout_marginBottom, 2);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_layout_width, 23);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_layout_height, 21);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_visibility, 22);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_alpha, 43);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_elevation, 44);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_rotationX, 45);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_rotationY, 46);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_rotation, 60);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_scaleX, 47);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_scaleY, 48);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_transformPivotX, 49);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_transformPivotY, 50);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_translationX, 51);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_translationY, 52);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_translationZ, 53);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintWidth_default, 54);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintHeight_default, 55);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintWidth_max, 56);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintHeight_max, 57);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintWidth_min, 58);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintHeight_min, 59);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintCircle, 61);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintCircleRadius, 62);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintCircleAngle, 63);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_android_id, 38);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintWidth_percent, 69);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_layout_constraintHeight_percent, 70);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_chainUseRtl, 71);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_barrierDirection, 72);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_constraint_referenced_ids, 73);
        IconCompatParcelizer.append(getSupportImageTintList.IconCompatParcelizer.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: o.getSupportImageTintMode$write */
    public static class write {
        public int AbsActionBarView;
        public float ActionBarContainer;
        public int ActionBarContextView;
        public float ActionBarOverlayLayout;
        public int ActionMenuItemView;
        private boolean ActionMenuPresenter$OverflowMenuButton;
        private boolean ActionMenuView;
        public int AlertController$RecycleListView;
        public int AppCompatActivity;
        public int AppCompatDelegateImpl$ListMenuDecorView;
        public int AppCompatDialogFragment;
        public float AppCompatViewInflater;
        public String ExpandedMenuView;
        public float IconCompatParcelizer;
        public int Keep;
        public int ListMenuItemView;
        public int MediaBrowserCompat$CustomActionResultReceiver;
        public int MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$MediaItem;
        public float MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public int f2593x50fd9e4a;
        public int MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public float MediaSessionCompat$QueueItem;
        public int MediaSessionCompat$ResultReceiverWrapper;
        public int MediaSessionCompat$Token;
        public int MenuItemImpl;
        public int MenuItemWrapperICS$CollapsibleActionViewWrapper;
        public int ParcelableVolumeInfo;
        public int PlaybackStateCompat;
        public int PlaybackStateCompat$CustomAction;
        public String RatingCompat;
        public int read;
        public float setActionBarHideOffset;
        public float setActionBarVisibilityCallback;
        public int setBackgroundResource;
        public float setCheckable;
        public int setChecked;
        public int setContentHeight;
        public float setContentView;
        public int setCustomView;
        public float setExpandedFormat;
        public int setForceShowIcon;
        public int[] setGroupDividerEnabled;
        public int setHasDecor;
        public float setHasNonEmbeddedTabs;
        public int setHideOnContentScrollEnabled;
        public int setIcon;
        public boolean setItemInvoker;
        public float setLogo;
        public int setMenu;
        private int setMenuCallbacks;
        public float setMenuPrepared;
        private int setOnMenuItemClickListener;
        private int setOverflowIcon;
        private int setOverflowReserved;
        public int setOverlayMode;
        public int setPadding;
        public int setPopupCallback;
        public float setPrimaryBackground;
        public int setShortcut;
        public float setShowingForActionMode;
        public float setSplitBackground;
        public float setStackedBackground;
        public int setSubtitle;
        public float setTabContainer;
        public boolean setTitle;
        public int setTitleOptional;
        public int setTransitioning;
        public float setUiOptions;
        public int setVisibility;
        private int setWindowCallback;
        private int setWindowTitle;
        public boolean write;

        private write() {
            this.setTitle = false;
            this.AppCompatDialogFragment = -1;
            this.setBackgroundResource = -1;
            this.setContentView = -1.0f;
            this.setPadding = -1;
            this.setShortcut = -1;
            this.MenuItemWrapperICS$CollapsibleActionViewWrapper = -1;
            this.setContentHeight = -1;
            this.setHideOnContentScrollEnabled = -1;
            this.setTransitioning = -1;
            this.MediaMetadataCompat = -1;
            this.read = -1;
            this.MediaBrowserCompat$ItemReceiver = -1;
            this.ActionBarContextView = -1;
            this.setSubtitle = -1;
            this.Keep = -1;
            this.MediaSessionCompat$Token = -1;
            this.AppCompatViewInflater = 0.5f;
            this.setLogo = 0.5f;
            this.RatingCompat = null;
            this.MediaBrowserCompat$MediaItem = -1;
            this.MediaDescriptionCompat = 0;
            this.MediaBrowserCompat$SearchResultReceiver = BitmapDescriptorFactory.HUE_RED;
            this.MediaSessionCompat$ResultReceiverWrapper = -1;
            this.f2593x50fd9e4a = -1;
            this.AbsActionBarView = -1;
            this.ActionMenuItemView = -1;
            this.setVisibility = -1;
            this.setTitleOptional = -1;
            this.MediaBrowserCompat$CustomActionResultReceiver = -1;
            this.ParcelableVolumeInfo = -1;
            this.setCustomView = -1;
            this.setMenu = 0;
            this.AlertController$RecycleListView = -1;
            this.AppCompatDelegateImpl$ListMenuDecorView = -1;
            this.PlaybackStateCompat = -1;
            this.setHasDecor = -1;
            this.PlaybackStateCompat$CustomAction = -1;
            this.AppCompatActivity = -1;
            this.setMenuPrepared = BitmapDescriptorFactory.HUE_RED;
            this.setExpandedFormat = BitmapDescriptorFactory.HUE_RED;
            this.setChecked = 0;
            this.setOverlayMode = 0;
            this.IconCompatParcelizer = 1.0f;
            this.write = false;
            this.MediaSessionCompat$QueueItem = BitmapDescriptorFactory.HUE_RED;
            this.setPrimaryBackground = BitmapDescriptorFactory.HUE_RED;
            this.setStackedBackground = BitmapDescriptorFactory.HUE_RED;
            this.setSplitBackground = BitmapDescriptorFactory.HUE_RED;
            this.setTabContainer = 1.0f;
            this.ActionBarContainer = 1.0f;
            this.setActionBarHideOffset = Float.NaN;
            this.setHasNonEmbeddedTabs = Float.NaN;
            this.setActionBarVisibilityCallback = BitmapDescriptorFactory.HUE_RED;
            this.ActionBarOverlayLayout = BitmapDescriptorFactory.HUE_RED;
            this.setShowingForActionMode = BitmapDescriptorFactory.HUE_RED;
            this.ActionMenuPresenter$OverflowMenuButton = false;
            this.ActionMenuView = false;
            this.setOnMenuItemClickListener = 0;
            this.setWindowTitle = 0;
            this.setOverflowReserved = -1;
            this.setWindowCallback = -1;
            this.setMenuCallbacks = -1;
            this.setOverflowIcon = -1;
            this.setUiOptions = 1.0f;
            this.setCheckable = 1.0f;
            this.setItemInvoker = false;
            this.setPopupCallback = -1;
            this.ListMenuItemView = -1;
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public final void read(int i, Constraints.read read2) {
            read(i, (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) read2);
            this.IconCompatParcelizer = read2.setOverlayMode;
            this.setPrimaryBackground = read2.ActionMenuPresenter$OverflowMenuButton;
            this.setStackedBackground = read2.setWindowTitle;
            this.setSplitBackground = read2.ActionMenuView;
            this.setTabContainer = read2.setUiOptions;
            this.ActionBarContainer = read2.setWindowCallback;
            this.setActionBarHideOffset = read2.setMenuCallbacks;
            this.setHasNonEmbeddedTabs = read2.setOnMenuItemClickListener;
            this.setActionBarVisibilityCallback = read2.setExpandedActionViewsExclusive;
            this.ActionBarOverlayLayout = read2.setOverflowReserved;
            this.setShowingForActionMode = BitmapDescriptorFactory.HUE_RED;
            this.MediaSessionCompat$QueueItem = read2.setShowingForActionMode;
            this.write = read2.setMenu;
        }

        public final void read(int i, ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver) {
            this.setForceShowIcon = i;
            this.setPadding = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setChecked;
            this.setShortcut = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setIcon;
            this.MenuItemWrapperICS$CollapsibleActionViewWrapper = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setTitleOptional;
            this.setContentHeight = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.ActionBarContextView;
            this.setHideOnContentScrollEnabled = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.ActionBarOverlayLayout;
            this.setTransitioning = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setHideOnContentScrollEnabled;
            this.MediaMetadataCompat = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            this.read = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$ItemReceiver = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            this.ActionBarContextView = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setTransitioning;
            this.setSubtitle = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setSubtitle;
            this.Keep = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem;
            this.MediaSessionCompat$Token = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper;
            this.AppCompatViewInflater = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setBackgroundResource;
            this.setLogo = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setActionBarHideOffset;
            this.RatingCompat = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
            this.MediaBrowserCompat$MediaItem = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.write;
            this.MediaDescriptionCompat = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
            this.MediaBrowserCompat$SearchResultReceiver = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.read;
            this.MediaSessionCompat$ResultReceiverWrapper = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
            this.f2593x50fd9e4a = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token;
            this.AbsActionBarView = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AbsActionBarView;
            this.setContentView = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView;
            this.AppCompatDialogFragment = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView;
            this.setBackgroundResource = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AppCompatDialogFragment;
            this.MenuItemImpl = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.width;
            this.setIcon = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.height;
            this.ActionMenuItemView = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.leftMargin;
            this.setVisibility = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.rightMargin;
            this.setTitleOptional = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.topMargin;
            this.MediaBrowserCompat$CustomActionResultReceiver = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.bottomMargin;
            this.setMenuPrepared = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setMenuPrepared;
            this.setExpandedFormat = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setCheckable;
            this.setOverlayMode = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setHasNonEmbeddedTabs;
            this.setChecked = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AppCompatActivity;
            this.ActionMenuPresenter$OverflowMenuButton = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
            this.ActionMenuView = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
            this.setOnMenuItemClickListener = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker;
            this.setWindowTitle = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setPadding;
            this.ActionMenuPresenter$OverflowMenuButton = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
            this.setOverflowReserved = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setShortcut;
            this.setWindowCallback = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setPopupCallback;
            this.setMenuCallbacks = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setForceShowIcon;
            this.setOverflowIcon = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setGroupDividerEnabled;
            this.setUiOptions = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.ExpandedMenuView;
            this.setCheckable = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setTitle;
            if (Build.VERSION.SDK_INT >= 17) {
                this.ParcelableVolumeInfo = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.getMarginEnd();
                this.setCustomView = constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.getMarginStart();
            }
        }

        public final void IconCompatParcelizer(ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver) {
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setChecked = this.setPadding;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setIcon = this.setShortcut;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setTitleOptional = this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.ActionBarContextView = this.setContentHeight;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.ActionBarOverlayLayout = this.setHideOnContentScrollEnabled;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setHideOnContentScrollEnabled = this.setTransitioning;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = this.MediaMetadataCompat;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = this.read;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setTransitioning = this.ActionBarContextView;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setSubtitle = this.setSubtitle;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem = this.Keep;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper = this.MediaSessionCompat$Token;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.leftMargin = this.ActionMenuItemView;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.rightMargin = this.setVisibility;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.topMargin = this.setTitleOptional;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.bottomMargin = this.MediaBrowserCompat$CustomActionResultReceiver;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat = this.AppCompatActivity;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo = this.PlaybackStateCompat$CustomAction;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setBackgroundResource = this.AppCompatViewInflater;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setActionBarHideOffset = this.setLogo;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.write = this.MediaBrowserCompat$MediaItem;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = this.MediaDescriptionCompat;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.read = this.MediaBrowserCompat$SearchResultReceiver;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = this.RatingCompat;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = this.MediaSessionCompat$ResultReceiverWrapper;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = this.f2593x50fd9e4a;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setMenuPrepared = this.setMenuPrepared;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setCheckable = this.setExpandedFormat;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setHasNonEmbeddedTabs = this.setOverlayMode;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AppCompatActivity = this.setChecked;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = this.ActionMenuPresenter$OverflowMenuButton;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = this.ActionMenuView;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker = this.setOnMenuItemClickListener;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setPadding = this.setWindowTitle;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setShortcut = this.setOverflowReserved;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setPopupCallback = this.setWindowCallback;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setForceShowIcon = this.setMenuCallbacks;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setGroupDividerEnabled = this.setOverflowIcon;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.ExpandedMenuView = this.setUiOptions;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setTitle = this.setCheckable;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AbsActionBarView = this.AbsActionBarView;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView = this.setContentView;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView = this.AppCompatDialogFragment;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AppCompatDialogFragment = this.setBackgroundResource;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.width = this.MenuItemImpl;
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.height = this.setIcon;
            if (Build.VERSION.SDK_INT >= 17) {
                constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setMarginStart(this.setCustomView);
                constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.setMarginEnd(this.ParcelableVolumeInfo);
            }
            constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.write();
        }

        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            write write2 = new write();
            write2.setTitle = this.setTitle;
            write2.MenuItemImpl = this.MenuItemImpl;
            write2.setIcon = this.setIcon;
            write2.AppCompatDialogFragment = this.AppCompatDialogFragment;
            write2.setBackgroundResource = this.setBackgroundResource;
            write2.setContentView = this.setContentView;
            write2.setPadding = this.setPadding;
            write2.setShortcut = this.setShortcut;
            write2.MenuItemWrapperICS$CollapsibleActionViewWrapper = this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
            write2.setContentHeight = this.setContentHeight;
            write2.setHideOnContentScrollEnabled = this.setHideOnContentScrollEnabled;
            write2.setTransitioning = this.setTransitioning;
            write2.MediaMetadataCompat = this.MediaMetadataCompat;
            write2.read = this.read;
            write2.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
            write2.ActionBarContextView = this.ActionBarContextView;
            write2.setSubtitle = this.setSubtitle;
            write2.Keep = this.Keep;
            write2.MediaSessionCompat$Token = this.MediaSessionCompat$Token;
            write2.AppCompatViewInflater = this.AppCompatViewInflater;
            write2.setLogo = this.setLogo;
            write2.RatingCompat = this.RatingCompat;
            write2.MediaSessionCompat$ResultReceiverWrapper = this.MediaSessionCompat$ResultReceiverWrapper;
            write2.f2593x50fd9e4a = this.f2593x50fd9e4a;
            write2.AppCompatViewInflater = this.AppCompatViewInflater;
            write2.AppCompatViewInflater = this.AppCompatViewInflater;
            write2.AppCompatViewInflater = this.AppCompatViewInflater;
            write2.AppCompatViewInflater = this.AppCompatViewInflater;
            write2.AppCompatViewInflater = this.AppCompatViewInflater;
            write2.AbsActionBarView = this.AbsActionBarView;
            write2.ActionMenuItemView = this.ActionMenuItemView;
            write2.setVisibility = this.setVisibility;
            write2.setTitleOptional = this.setTitleOptional;
            write2.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            write2.ParcelableVolumeInfo = this.ParcelableVolumeInfo;
            write2.setCustomView = this.setCustomView;
            write2.setMenu = this.setMenu;
            write2.AlertController$RecycleListView = this.AlertController$RecycleListView;
            write2.AppCompatDelegateImpl$ListMenuDecorView = this.AppCompatDelegateImpl$ListMenuDecorView;
            write2.PlaybackStateCompat = this.PlaybackStateCompat;
            write2.setHasDecor = this.setHasDecor;
            write2.PlaybackStateCompat$CustomAction = this.PlaybackStateCompat$CustomAction;
            write2.AppCompatActivity = this.AppCompatActivity;
            write2.setMenuPrepared = this.setMenuPrepared;
            write2.setExpandedFormat = this.setExpandedFormat;
            write2.setChecked = this.setChecked;
            write2.setOverlayMode = this.setOverlayMode;
            write2.IconCompatParcelizer = this.IconCompatParcelizer;
            write2.write = this.write;
            write2.MediaSessionCompat$QueueItem = this.MediaSessionCompat$QueueItem;
            write2.setPrimaryBackground = this.setPrimaryBackground;
            write2.setStackedBackground = this.setStackedBackground;
            write2.setSplitBackground = this.setSplitBackground;
            write2.setTabContainer = this.setTabContainer;
            write2.ActionBarContainer = this.ActionBarContainer;
            write2.setActionBarHideOffset = this.setActionBarHideOffset;
            write2.setHasNonEmbeddedTabs = this.setHasNonEmbeddedTabs;
            write2.setActionBarVisibilityCallback = this.setActionBarVisibilityCallback;
            write2.ActionBarOverlayLayout = this.ActionBarOverlayLayout;
            write2.setShowingForActionMode = this.setShowingForActionMode;
            write2.ActionMenuPresenter$OverflowMenuButton = this.ActionMenuPresenter$OverflowMenuButton;
            write2.ActionMenuView = this.ActionMenuView;
            write2.setOnMenuItemClickListener = this.setOnMenuItemClickListener;
            write2.setWindowTitle = this.setWindowTitle;
            write2.setOverflowReserved = this.setOverflowReserved;
            write2.setWindowCallback = this.setWindowCallback;
            write2.setMenuCallbacks = this.setMenuCallbacks;
            write2.setOverflowIcon = this.setOverflowIcon;
            write2.setUiOptions = this.setUiOptions;
            write2.setCheckable = this.setCheckable;
            write2.setPopupCallback = this.setPopupCallback;
            write2.ListMenuItemView = this.ListMenuItemView;
            int[] iArr = this.setGroupDividerEnabled;
            if (iArr != null) {
                write2.setGroupDividerEnabled = Arrays.copyOf(iArr, iArr.length);
            }
            write2.MediaBrowserCompat$MediaItem = this.MediaBrowserCompat$MediaItem;
            write2.MediaDescriptionCompat = this.MediaDescriptionCompat;
            write2.MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$SearchResultReceiver;
            write2.setItemInvoker = this.setItemInvoker;
            return write2;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ConstraintLayout constraintLayout) {
        IconCompatParcelizer(constraintLayout);
        constraintLayout.setConstraintSet((getSupportImageTintMode) null);
    }

    public final void IconCompatParcelizer(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.MediaBrowserCompat$CustomActionResultReceiver.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    write write2 = this.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        write2.ListMenuItemView = 1;
                    }
                    if (write2.ListMenuItemView != -1 && write2.ListMenuItemView == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(write2.setPopupCallback);
                        barrier.setAllowsGoneWidget(write2.setItemInvoker);
                        if (write2.setGroupDividerEnabled != null) {
                            barrier.setReferencedIds(write2.setGroupDividerEnabled);
                        } else if (write2.ExpandedMenuView != null) {
                            write2.setGroupDividerEnabled = MediaBrowserCompat$CustomActionResultReceiver(barrier, write2.ExpandedMenuView);
                            barrier.setReferencedIds(write2.setGroupDividerEnabled);
                        }
                    }
                    ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) childAt.getLayoutParams();
                    write2.IconCompatParcelizer(constraintLayout$MediaBrowserCompat$CustomActionResultReceiver);
                    childAt.setLayoutParams(constraintLayout$MediaBrowserCompat$CustomActionResultReceiver);
                    childAt.setVisibility(write2.setMenu);
                    if (Build.VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(write2.IconCompatParcelizer);
                        childAt.setRotation(write2.setPrimaryBackground);
                        childAt.setRotationX(write2.setStackedBackground);
                        childAt.setRotationY(write2.setSplitBackground);
                        childAt.setScaleX(write2.setTabContainer);
                        childAt.setScaleY(write2.ActionBarContainer);
                        if (!Float.isNaN(write2.setActionBarHideOffset)) {
                            childAt.setPivotX(write2.setActionBarHideOffset);
                        }
                        if (!Float.isNaN(write2.setHasNonEmbeddedTabs)) {
                            childAt.setPivotY(write2.setHasNonEmbeddedTabs);
                        }
                        childAt.setTranslationX(write2.setActionBarVisibilityCallback);
                        childAt.setTranslationY(write2.ActionBarOverlayLayout);
                        if (Build.VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(write2.setShowingForActionMode);
                            if (write2.write) {
                                childAt.setElevation(write2.MediaSessionCompat$QueueItem);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            write write3 = this.MediaBrowserCompat$CustomActionResultReceiver.get(num);
            if (write3.ListMenuItemView != -1 && write3.ListMenuItemView == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                if (write3.setGroupDividerEnabled != null) {
                    barrier2.setReferencedIds(write3.setGroupDividerEnabled);
                } else if (write3.ExpandedMenuView != null) {
                    write3.setGroupDividerEnabled = MediaBrowserCompat$CustomActionResultReceiver(barrier2, write3.ExpandedMenuView);
                    barrier2.setReferencedIds(write3.setGroupDividerEnabled);
                }
                barrier2.setType(write3.setPopupCallback);
                ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver write4 = ConstraintLayout.write();
                barrier2.write();
                write3.IconCompatParcelizer(write4);
                constraintLayout.addView(barrier2, write4);
            }
            if (write3.setTitle) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver write5 = ConstraintLayout.write();
                write3.IconCompatParcelizer(write5);
                constraintLayout.addView(guideline, write5);
            }
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(write write2, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = IconCompatParcelizer.get(index);
            switch (i2) {
                case 1:
                    int resourceId = typedArray.getResourceId(index, write2.MediaBrowserCompat$ItemReceiver);
                    if (resourceId == -1) {
                        resourceId = typedArray.getInt(index, -1);
                    }
                    write2.MediaBrowserCompat$ItemReceiver = resourceId;
                    break;
                case 2:
                    write2.MediaBrowserCompat$CustomActionResultReceiver = typedArray.getDimensionPixelSize(index, write2.MediaBrowserCompat$CustomActionResultReceiver);
                    break;
                case 3:
                    int resourceId2 = typedArray.getResourceId(index, write2.read);
                    if (resourceId2 == -1) {
                        resourceId2 = typedArray.getInt(index, -1);
                    }
                    write2.read = resourceId2;
                    break;
                case 4:
                    int resourceId3 = typedArray.getResourceId(index, write2.MediaMetadataCompat);
                    if (resourceId3 == -1) {
                        resourceId3 = typedArray.getInt(index, -1);
                    }
                    write2.MediaMetadataCompat = resourceId3;
                    break;
                case 5:
                    write2.RatingCompat = typedArray.getString(index);
                    break;
                case 6:
                    write2.MediaSessionCompat$ResultReceiverWrapper = typedArray.getDimensionPixelOffset(index, write2.MediaSessionCompat$ResultReceiverWrapper);
                    break;
                case 7:
                    write2.f2593x50fd9e4a = typedArray.getDimensionPixelOffset(index, write2.f2593x50fd9e4a);
                    break;
                case 8:
                    write2.ParcelableVolumeInfo = typedArray.getDimensionPixelSize(index, write2.ParcelableVolumeInfo);
                    break;
                case 9:
                    int resourceId4 = typedArray.getResourceId(index, write2.MediaSessionCompat$Token);
                    if (resourceId4 == -1) {
                        resourceId4 = typedArray.getInt(index, -1);
                    }
                    write2.MediaSessionCompat$Token = resourceId4;
                    break;
                case 10:
                    int resourceId5 = typedArray.getResourceId(index, write2.Keep);
                    if (resourceId5 == -1) {
                        resourceId5 = typedArray.getInt(index, -1);
                    }
                    write2.Keep = resourceId5;
                    break;
                case 11:
                    write2.setHasDecor = typedArray.getDimensionPixelSize(index, write2.setHasDecor);
                    break;
                case 12:
                    write2.PlaybackStateCompat$CustomAction = typedArray.getDimensionPixelSize(index, write2.PlaybackStateCompat$CustomAction);
                    break;
                case 13:
                    write2.AlertController$RecycleListView = typedArray.getDimensionPixelSize(index, write2.AlertController$RecycleListView);
                    break;
                case 14:
                    write2.PlaybackStateCompat = typedArray.getDimensionPixelSize(index, write2.PlaybackStateCompat);
                    break;
                case 15:
                    write2.AppCompatActivity = typedArray.getDimensionPixelSize(index, write2.AppCompatActivity);
                    break;
                case 16:
                    write2.AppCompatDelegateImpl$ListMenuDecorView = typedArray.getDimensionPixelSize(index, write2.AppCompatDelegateImpl$ListMenuDecorView);
                    break;
                case 17:
                    write2.AppCompatDialogFragment = typedArray.getDimensionPixelOffset(index, write2.AppCompatDialogFragment);
                    break;
                case 18:
                    write2.setBackgroundResource = typedArray.getDimensionPixelOffset(index, write2.setBackgroundResource);
                    break;
                case 19:
                    write2.setContentView = typedArray.getFloat(index, write2.setContentView);
                    break;
                case 20:
                    write2.AppCompatViewInflater = typedArray.getFloat(index, write2.AppCompatViewInflater);
                    break;
                case 21:
                    write2.setIcon = typedArray.getLayoutDimension(index, write2.setIcon);
                    break;
                case 22:
                    write2.setMenu = typedArray.getInt(index, write2.setMenu);
                    write2.setMenu = write[write2.setMenu];
                    break;
                case 23:
                    write2.MenuItemImpl = typedArray.getLayoutDimension(index, write2.MenuItemImpl);
                    break;
                case 24:
                    write2.ActionMenuItemView = typedArray.getDimensionPixelSize(index, write2.ActionMenuItemView);
                    break;
                case 25:
                    int resourceId6 = typedArray.getResourceId(index, write2.setPadding);
                    if (resourceId6 == -1) {
                        resourceId6 = typedArray.getInt(index, -1);
                    }
                    write2.setPadding = resourceId6;
                    break;
                case 26:
                    int resourceId7 = typedArray.getResourceId(index, write2.setShortcut);
                    if (resourceId7 == -1) {
                        resourceId7 = typedArray.getInt(index, -1);
                    }
                    write2.setShortcut = resourceId7;
                    break;
                case 27:
                    write2.AbsActionBarView = typedArray.getInt(index, write2.AbsActionBarView);
                    break;
                case 28:
                    write2.setVisibility = typedArray.getDimensionPixelSize(index, write2.setVisibility);
                    break;
                case 29:
                    int resourceId8 = typedArray.getResourceId(index, write2.MenuItemWrapperICS$CollapsibleActionViewWrapper);
                    if (resourceId8 == -1) {
                        resourceId8 = typedArray.getInt(index, -1);
                    }
                    write2.MenuItemWrapperICS$CollapsibleActionViewWrapper = resourceId8;
                    break;
                case 30:
                    int resourceId9 = typedArray.getResourceId(index, write2.setContentHeight);
                    if (resourceId9 == -1) {
                        resourceId9 = typedArray.getInt(index, -1);
                    }
                    write2.setContentHeight = resourceId9;
                    break;
                case 31:
                    write2.setCustomView = typedArray.getDimensionPixelSize(index, write2.setCustomView);
                    break;
                case 32:
                    int resourceId10 = typedArray.getResourceId(index, write2.ActionBarContextView);
                    if (resourceId10 == -1) {
                        resourceId10 = typedArray.getInt(index, -1);
                    }
                    write2.ActionBarContextView = resourceId10;
                    break;
                case 33:
                    int resourceId11 = typedArray.getResourceId(index, write2.setSubtitle);
                    if (resourceId11 == -1) {
                        resourceId11 = typedArray.getInt(index, -1);
                    }
                    write2.setSubtitle = resourceId11;
                    break;
                case 34:
                    write2.setTitleOptional = typedArray.getDimensionPixelSize(index, write2.setTitleOptional);
                    break;
                case 35:
                    int resourceId12 = typedArray.getResourceId(index, write2.setTransitioning);
                    if (resourceId12 == -1) {
                        resourceId12 = typedArray.getInt(index, -1);
                    }
                    write2.setTransitioning = resourceId12;
                    break;
                case 36:
                    int resourceId13 = typedArray.getResourceId(index, write2.setHideOnContentScrollEnabled);
                    if (resourceId13 == -1) {
                        resourceId13 = typedArray.getInt(index, -1);
                    }
                    write2.setHideOnContentScrollEnabled = resourceId13;
                    break;
                case 37:
                    write2.setLogo = typedArray.getFloat(index, write2.setLogo);
                    break;
                case 38:
                    write2.setForceShowIcon = typedArray.getResourceId(index, write2.setForceShowIcon);
                    break;
                case 39:
                    write2.setExpandedFormat = typedArray.getFloat(index, write2.setExpandedFormat);
                    break;
                case 40:
                    write2.setMenuPrepared = typedArray.getFloat(index, write2.setMenuPrepared);
                    break;
                case 41:
                    write2.setChecked = typedArray.getInt(index, write2.setChecked);
                    break;
                case 42:
                    write2.setOverlayMode = typedArray.getInt(index, write2.setOverlayMode);
                    break;
                case 43:
                    write2.IconCompatParcelizer = typedArray.getFloat(index, write2.IconCompatParcelizer);
                    break;
                case 44:
                    write2.write = true;
                    write2.MediaSessionCompat$QueueItem = typedArray.getDimension(index, write2.MediaSessionCompat$QueueItem);
                    break;
                case 45:
                    write2.setStackedBackground = typedArray.getFloat(index, write2.setStackedBackground);
                    break;
                case 46:
                    write2.setSplitBackground = typedArray.getFloat(index, write2.setSplitBackground);
                    break;
                case 47:
                    write2.setTabContainer = typedArray.getFloat(index, write2.setTabContainer);
                    break;
                case 48:
                    write2.ActionBarContainer = typedArray.getFloat(index, write2.ActionBarContainer);
                    break;
                case 49:
                    write2.setActionBarHideOffset = typedArray.getFloat(index, write2.setActionBarHideOffset);
                    break;
                case 50:
                    write2.setHasNonEmbeddedTabs = typedArray.getFloat(index, write2.setHasNonEmbeddedTabs);
                    break;
                case 51:
                    write2.setActionBarVisibilityCallback = typedArray.getDimension(index, write2.setActionBarVisibilityCallback);
                    break;
                case 52:
                    write2.ActionBarOverlayLayout = typedArray.getDimension(index, write2.ActionBarOverlayLayout);
                    break;
                case 53:
                    write2.setShowingForActionMode = typedArray.getDimension(index, write2.setShowingForActionMode);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            write2.setPrimaryBackground = typedArray.getFloat(index, write2.setPrimaryBackground);
                            break;
                        case 61:
                            int resourceId14 = typedArray.getResourceId(index, write2.MediaBrowserCompat$MediaItem);
                            if (resourceId14 == -1) {
                                resourceId14 = typedArray.getInt(index, -1);
                            }
                            write2.MediaBrowserCompat$MediaItem = resourceId14;
                            break;
                        case 62:
                            write2.MediaDescriptionCompat = typedArray.getDimensionPixelSize(index, write2.MediaDescriptionCompat);
                            break;
                        case 63:
                            write2.MediaBrowserCompat$SearchResultReceiver = typedArray.getFloat(index, write2.MediaBrowserCompat$SearchResultReceiver);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    write2.setUiOptions = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    write2.setCheckable = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    write2.setPopupCallback = typedArray.getInt(index, write2.setPopupCallback);
                                    break;
                                case 73:
                                    write2.ExpandedMenuView = typedArray.getString(index);
                                    break;
                                case 74:
                                    write2.setItemInvoker = typedArray.getBoolean(index, write2.setItemInvoker);
                                    break;
                                case 75:
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("unused attribute 0x");
                                    sb.append(Integer.toHexString(index));
                                    sb.append("   ");
                                    sb.append(IconCompatParcelizer.get(index));
                                    Log.w("ConstraintSet", sb.toString());
                                    break;
                                default:
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Unknown attribute 0x");
                                    sb2.append(Integer.toHexString(index));
                                    sb2.append("   ");
                                    sb2.append(IconCompatParcelizer.get(index));
                                    Log.w("ConstraintSet", sb2.toString());
                                    break;
                            }
                    }
            }
        }
    }

    private static int[] MediaBrowserCompat$CustomActionResultReceiver(View view, String str) {
        int i;
        Object write2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = getSupportImageTintList.write.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, Name.MARK, context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (write2 = ((ConstraintLayout) view.getParent()).write(trim)) != null && (write2 instanceof Integer)) {
                i = ((Integer) write2).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }
}

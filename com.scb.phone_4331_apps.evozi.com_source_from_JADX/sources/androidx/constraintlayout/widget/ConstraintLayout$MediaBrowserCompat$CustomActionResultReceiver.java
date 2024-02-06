package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.getSupportImageTintList;
import p040o.setImageBitmap;
import p040o.setImageResource;

public class ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver extends ViewGroup.MarginLayoutParams {
    public int AbsActionBarView = -1;
    int ActionBarContainer = -1;
    public int ActionBarContextView = -1;
    public int ActionBarOverlayLayout = -1;
    boolean ActionMenuItemView = false;
    public int AlertController$RecycleListView = -1;
    public int AppCompatActivity = 0;
    public float AppCompatDelegateImpl$ListMenuDecorView = -1.0f;
    public int AppCompatDialogFragment = -1;
    boolean AppCompatViewInflater = false;
    public float ExpandedMenuView = 1.0f;
    public int IconCompatParcelizer = -1;
    public int Keep = -1;
    boolean ListMenuItemView = false;
    public int MediaBrowserCompat$CustomActionResultReceiver = -1;
    public int MediaBrowserCompat$ItemReceiver = -1;
    public int MediaBrowserCompat$MediaItem = -1;
    public boolean MediaBrowserCompat$SearchResultReceiver = false;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public int f13x50fd9e4a = -1;
    public int MediaDescriptionCompat = 0;
    public boolean MediaMetadataCompat = false;
    public int MediaSessionCompat$QueueItem = -1;
    public int MediaSessionCompat$ResultReceiverWrapper = -1;
    public int MediaSessionCompat$Token = -1;
    int MenuItemImpl = -1;
    int MenuItemWrapperICS$CollapsibleActionViewWrapper;
    public int ParcelableVolumeInfo = -1;
    public int PlaybackStateCompat = -1;
    public int PlaybackStateCompat$CustomAction = -1;
    public String RatingCompat = null;
    public float read = BitmapDescriptorFactory.HUE_RED;
    public float setActionBarHideOffset = 0.5f;
    boolean setActionBarVisibilityCallback = true;
    public float setBackgroundResource = 0.5f;
    public float setCheckable = -1.0f;
    public int setChecked = -1;
    int setContentHeight;
    boolean setContentView = true;
    int setCustomView = -1;
    boolean setExpandedFormat = false;
    public int setForceShowIcon = 0;
    public int setGroupDividerEnabled = 0;
    public int setHasDecor = -1;
    public int setHasNonEmbeddedTabs = 0;
    public int setHideOnContentScrollEnabled = -1;
    public int setIcon = -1;
    public int setItemInvoker = 0;
    setImageResource setLogo = new setImageResource();
    public float setMenuPrepared = -1.0f;
    public int setPadding = 0;
    public int setPopupCallback = 0;
    int setPrimaryBackground = -1;
    public int setShortcut = 0;
    private int setShowingForActionMode = 1;
    int setSplitBackground = -1;
    float setStackedBackground;
    public int setSubtitle = -1;
    float setTabContainer = 0.5f;
    public float setTitle = 1.0f;
    public int setTitleOptional = -1;
    public int setTransitioning = -1;
    int setVisibility = -1;
    public int write = -1;

    static class read {
        public static final SparseIntArray write;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            write = sparseIntArray;
            sparseIntArray.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintCircle, 2);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_android_orientation, 1);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_goneMarginTop, 22);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_goneMarginRight, 23);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_goneMarginStart, 25);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constrainedWidth, 27);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constrainedHeight, 28);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
            write.append(getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
        }
    }

    public ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = read.write.get(index);
            switch (i3) {
                case 1:
                    this.AbsActionBarView = obtainStyledAttributes.getInt(index, this.AbsActionBarView);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.write);
                    this.write = resourceId;
                    if (resourceId != -1) {
                        break;
                    } else {
                        this.write = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 3:
                    this.MediaDescriptionCompat = obtainStyledAttributes.getDimensionPixelSize(index, this.MediaDescriptionCompat);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, this.read) % 360.0f;
                    this.read = f;
                    if (f >= BitmapDescriptorFactory.HUE_RED) {
                        break;
                    } else {
                        this.read = (360.0f - f) % 360.0f;
                        break;
                    }
                case 5:
                    this.AlertController$RecycleListView = obtainStyledAttributes.getDimensionPixelOffset(index, this.AlertController$RecycleListView);
                    break;
                case 6:
                    this.AppCompatDialogFragment = obtainStyledAttributes.getDimensionPixelOffset(index, this.AppCompatDialogFragment);
                    break;
                case 7:
                    this.AppCompatDelegateImpl$ListMenuDecorView = obtainStyledAttributes.getFloat(index, this.AppCompatDelegateImpl$ListMenuDecorView);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.setChecked);
                    this.setChecked = resourceId2;
                    if (resourceId2 != -1) {
                        break;
                    } else {
                        this.setChecked = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.setIcon);
                    this.setIcon = resourceId3;
                    if (resourceId3 != -1) {
                        break;
                    } else {
                        this.setIcon = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.setTitleOptional);
                    this.setTitleOptional = resourceId4;
                    if (resourceId4 != -1) {
                        break;
                    } else {
                        this.setTitleOptional = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.ActionBarContextView);
                    this.ActionBarContextView = resourceId5;
                    if (resourceId5 != -1) {
                        break;
                    } else {
                        this.ActionBarContextView = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.ActionBarOverlayLayout);
                    this.ActionBarOverlayLayout = resourceId6;
                    if (resourceId6 != -1) {
                        break;
                    } else {
                        this.ActionBarOverlayLayout = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.setHideOnContentScrollEnabled);
                    this.setHideOnContentScrollEnabled = resourceId7;
                    if (resourceId7 != -1) {
                        break;
                    } else {
                        this.setHideOnContentScrollEnabled = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.MediaBrowserCompat$ItemReceiver);
                    this.MediaBrowserCompat$ItemReceiver = resourceId8;
                    if (resourceId8 != -1) {
                        break;
                    } else {
                        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.MediaBrowserCompat$CustomActionResultReceiver);
                    this.MediaBrowserCompat$CustomActionResultReceiver = resourceId9;
                    if (resourceId9 != -1) {
                        break;
                    } else {
                        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.IconCompatParcelizer);
                    this.IconCompatParcelizer = resourceId10;
                    if (resourceId10 != -1) {
                        break;
                    } else {
                        this.IconCompatParcelizer = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.setTransitioning);
                    this.setTransitioning = resourceId11;
                    if (resourceId11 != -1) {
                        break;
                    } else {
                        this.setTransitioning = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.setSubtitle);
                    this.setSubtitle = resourceId12;
                    if (resourceId12 != -1) {
                        break;
                    } else {
                        this.setSubtitle = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.MediaSessionCompat$QueueItem);
                    this.MediaSessionCompat$QueueItem = resourceId13;
                    if (resourceId13 != -1) {
                        break;
                    } else {
                        this.MediaSessionCompat$QueueItem = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.MediaSessionCompat$ResultReceiverWrapper);
                    this.MediaSessionCompat$ResultReceiverWrapper = resourceId14;
                    if (resourceId14 != -1) {
                        break;
                    } else {
                        this.MediaSessionCompat$ResultReceiverWrapper = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 21:
                    this.Keep = obtainStyledAttributes.getDimensionPixelSize(index, this.Keep);
                    break;
                case 22:
                    this.setHasDecor = obtainStyledAttributes.getDimensionPixelSize(index, this.setHasDecor);
                    break;
                case 23:
                    this.PlaybackStateCompat$CustomAction = obtainStyledAttributes.getDimensionPixelSize(index, this.PlaybackStateCompat$CustomAction);
                    break;
                case 24:
                    this.f13x50fd9e4a = obtainStyledAttributes.getDimensionPixelSize(index, this.f13x50fd9e4a);
                    break;
                case 25:
                    this.PlaybackStateCompat = obtainStyledAttributes.getDimensionPixelSize(index, this.PlaybackStateCompat);
                    break;
                case 26:
                    this.ParcelableVolumeInfo = obtainStyledAttributes.getDimensionPixelSize(index, this.ParcelableVolumeInfo);
                    break;
                case 27:
                    this.MediaMetadataCompat = obtainStyledAttributes.getBoolean(index, this.MediaMetadataCompat);
                    break;
                case 28:
                    this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getBoolean(index, this.MediaBrowserCompat$SearchResultReceiver);
                    break;
                case 29:
                    this.setBackgroundResource = obtainStyledAttributes.getFloat(index, this.setBackgroundResource);
                    break;
                case 30:
                    this.setActionBarHideOffset = obtainStyledAttributes.getFloat(index, this.setActionBarHideOffset);
                    break;
                case 31:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    this.setItemInvoker = i4;
                    if (i4 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    }
                case 32:
                    int i5 = obtainStyledAttributes.getInt(index, 0);
                    this.setPadding = i5;
                    if (i5 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    }
                case 33:
                    try {
                        this.setForceShowIcon = obtainStyledAttributes.getDimensionPixelSize(index, this.setForceShowIcon);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.setForceShowIcon) != -2) {
                            break;
                        } else {
                            this.setForceShowIcon = -2;
                            break;
                        }
                    }
                case 34:
                    try {
                        this.setShortcut = obtainStyledAttributes.getDimensionPixelSize(index, this.setShortcut);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.setShortcut) != -2) {
                            break;
                        } else {
                            this.setShortcut = -2;
                            break;
                        }
                    }
                case 35:
                    this.ExpandedMenuView = Math.max(BitmapDescriptorFactory.HUE_RED, obtainStyledAttributes.getFloat(index, this.ExpandedMenuView));
                    break;
                case 36:
                    try {
                        this.setGroupDividerEnabled = obtainStyledAttributes.getDimensionPixelSize(index, this.setGroupDividerEnabled);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.setGroupDividerEnabled) != -2) {
                            break;
                        } else {
                            this.setGroupDividerEnabled = -2;
                            break;
                        }
                    }
                case 37:
                    try {
                        this.setPopupCallback = obtainStyledAttributes.getDimensionPixelSize(index, this.setPopupCallback);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.setPopupCallback) != -2) {
                            break;
                        } else {
                            this.setPopupCallback = -2;
                            break;
                        }
                    }
                case 38:
                    this.setTitle = Math.max(BitmapDescriptorFactory.HUE_RED, obtainStyledAttributes.getFloat(index, this.setTitle));
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            this.RatingCompat = string;
                            this.setShowingForActionMode = -1;
                            if (string == null) {
                                break;
                            } else {
                                int length = string.length();
                                int indexOf = this.RatingCompat.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String substring = this.RatingCompat.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        this.setShowingForActionMode = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        this.setShowingForActionMode = 1;
                                    }
                                    i = indexOf + 1;
                                }
                                int indexOf2 = this.RatingCompat.indexOf(58);
                                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                    String substring2 = this.RatingCompat.substring(i, indexOf2);
                                    String substring3 = this.RatingCompat.substring(indexOf2 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring2);
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            if (parseFloat > BitmapDescriptorFactory.HUE_RED && parseFloat2 > BitmapDescriptorFactory.HUE_RED) {
                                                int i6 = this.setShowingForActionMode;
                                                break;
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                } else {
                                    String substring4 = this.RatingCompat.substring(i);
                                    if (substring4.length() <= 0) {
                                        break;
                                    } else {
                                        Float.parseFloat(substring4);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 45:
                            this.setCheckable = obtainStyledAttributes.getFloat(index, this.setCheckable);
                            break;
                        case 46:
                            this.setMenuPrepared = obtainStyledAttributes.getFloat(index, this.setMenuPrepared);
                            break;
                        case 47:
                            this.AppCompatActivity = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.setHasNonEmbeddedTabs = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getDimensionPixelOffset(index, this.MediaBrowserCompat$MediaItem);
                            break;
                        case 50:
                            this.MediaSessionCompat$Token = obtainStyledAttributes.getDimensionPixelOffset(index, this.MediaSessionCompat$Token);
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        write();
    }

    public final void write() {
        this.setExpandedFormat = false;
        this.setContentView = true;
        this.setActionBarVisibilityCallback = true;
        if (this.width == -2 && this.MediaMetadataCompat) {
            this.setContentView = false;
            this.setItemInvoker = 1;
        }
        if (this.height == -2 && this.MediaBrowserCompat$SearchResultReceiver) {
            this.setActionBarVisibilityCallback = false;
            this.setPadding = 1;
        }
        if (this.width == 0 || this.width == -1) {
            this.setContentView = false;
            if (this.width == 0 && this.setItemInvoker == 1) {
                this.width = -2;
                this.MediaMetadataCompat = true;
            }
        }
        if (this.height == 0 || this.height == -1) {
            this.setActionBarVisibilityCallback = false;
            if (this.height == 0 && this.setPadding == 1) {
                this.height = -2;
                this.MediaBrowserCompat$SearchResultReceiver = true;
            }
        }
        if (this.AppCompatDelegateImpl$ListMenuDecorView != -1.0f || this.AlertController$RecycleListView != -1 || this.AppCompatDialogFragment != -1) {
            this.setExpandedFormat = true;
            this.setContentView = true;
            this.setActionBarVisibilityCallback = true;
            if (!(this.setLogo instanceof setImageBitmap)) {
                this.setLogo = new setImageBitmap();
            }
            ((setImageBitmap) this.setLogo).RatingCompat(this.AbsActionBarView);
        }
    }

    public ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        super(-2, -2);
    }

    public ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resolveLayoutDirection(int r7) {
        /*
            r6 = this;
            int r0 = r6.leftMargin
            int r1 = r6.rightMargin
            super.resolveLayoutDirection(r7)
            r7 = -1
            r6.ActionBarContainer = r7
            r6.setCustomView = r7
            r6.setSplitBackground = r7
            r6.setPrimaryBackground = r7
            r6.MenuItemImpl = r7
            r6.setVisibility = r7
            int r2 = r6.Keep
            r6.MenuItemImpl = r2
            int r2 = r6.PlaybackStateCompat$CustomAction
            r6.setVisibility = r2
            float r2 = r6.setBackgroundResource
            r6.setTabContainer = r2
            int r2 = r6.AlertController$RecycleListView
            r6.MenuItemWrapperICS$CollapsibleActionViewWrapper = r2
            int r2 = r6.AppCompatDialogFragment
            r6.setContentHeight = r2
            float r2 = r6.AppCompatDelegateImpl$ListMenuDecorView
            r6.setStackedBackground = r2
            int r2 = r6.getLayoutDirection()
            r3 = 0
            r4 = 1
            if (r4 != r2) goto L_0x0036
            r2 = r4
            goto L_0x0037
        L_0x0036:
            r2 = r3
        L_0x0037:
            if (r2 == 0) goto L_0x0099
            int r2 = r6.setTransitioning
            if (r2 == r7) goto L_0x0040
            r6.ActionBarContainer = r2
            goto L_0x0046
        L_0x0040:
            int r2 = r6.setSubtitle
            if (r2 == r7) goto L_0x0047
            r6.setCustomView = r2
        L_0x0046:
            r3 = r4
        L_0x0047:
            int r2 = r6.MediaSessionCompat$QueueItem
            if (r2 == r7) goto L_0x004e
            r6.setPrimaryBackground = r2
            r3 = r4
        L_0x004e:
            int r2 = r6.MediaSessionCompat$ResultReceiverWrapper
            if (r2 == r7) goto L_0x0055
            r6.setSplitBackground = r2
            r3 = r4
        L_0x0055:
            int r2 = r6.PlaybackStateCompat
            if (r2 == r7) goto L_0x005b
            r6.setVisibility = r2
        L_0x005b:
            int r2 = r6.ParcelableVolumeInfo
            if (r2 == r7) goto L_0x0061
            r6.MenuItemImpl = r2
        L_0x0061:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x006b
            float r3 = r6.setBackgroundResource
            float r3 = r2 - r3
            r6.setTabContainer = r3
        L_0x006b:
            boolean r3 = r6.setExpandedFormat
            if (r3 == 0) goto L_0x00bd
            int r3 = r6.AbsActionBarView
            if (r3 != r4) goto L_0x00bd
            float r3 = r6.AppCompatDelegateImpl$ListMenuDecorView
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0083
            float r2 = r2 - r3
            r6.setStackedBackground = r2
            r6.MenuItemWrapperICS$CollapsibleActionViewWrapper = r7
            r6.setContentHeight = r7
            goto L_0x00bd
        L_0x0083:
            int r2 = r6.AlertController$RecycleListView
            if (r2 == r7) goto L_0x008e
            r6.setContentHeight = r2
            r6.MenuItemWrapperICS$CollapsibleActionViewWrapper = r7
            r6.setStackedBackground = r4
            goto L_0x00bd
        L_0x008e:
            int r2 = r6.AppCompatDialogFragment
            if (r2 == r7) goto L_0x00bd
            r6.MenuItemWrapperICS$CollapsibleActionViewWrapper = r2
            r6.setContentHeight = r7
            r6.setStackedBackground = r4
            goto L_0x00bd
        L_0x0099:
            int r2 = r6.setTransitioning
            if (r2 == r7) goto L_0x009f
            r6.setPrimaryBackground = r2
        L_0x009f:
            int r2 = r6.setSubtitle
            if (r2 == r7) goto L_0x00a5
            r6.setSplitBackground = r2
        L_0x00a5:
            int r2 = r6.MediaSessionCompat$QueueItem
            if (r2 == r7) goto L_0x00ab
            r6.ActionBarContainer = r2
        L_0x00ab:
            int r2 = r6.MediaSessionCompat$ResultReceiverWrapper
            if (r2 == r7) goto L_0x00b1
            r6.setCustomView = r2
        L_0x00b1:
            int r2 = r6.PlaybackStateCompat
            if (r2 == r7) goto L_0x00b7
            r6.MenuItemImpl = r2
        L_0x00b7:
            int r2 = r6.ParcelableVolumeInfo
            if (r2 == r7) goto L_0x00bd
            r6.setVisibility = r2
        L_0x00bd:
            int r2 = r6.MediaSessionCompat$QueueItem
            if (r2 != r7) goto L_0x0107
            int r2 = r6.MediaSessionCompat$ResultReceiverWrapper
            if (r2 != r7) goto L_0x0107
            int r2 = r6.setSubtitle
            if (r2 != r7) goto L_0x0107
            int r2 = r6.setTransitioning
            if (r2 != r7) goto L_0x0107
            int r2 = r6.setTitleOptional
            if (r2 == r7) goto L_0x00dc
            r6.ActionBarContainer = r2
            int r2 = r6.rightMargin
            if (r2 > 0) goto L_0x00ea
            if (r1 <= 0) goto L_0x00ea
            r6.rightMargin = r1
            goto L_0x00ea
        L_0x00dc:
            int r2 = r6.ActionBarContextView
            if (r2 == r7) goto L_0x00ea
            r6.setCustomView = r2
            int r2 = r6.rightMargin
            if (r2 > 0) goto L_0x00ea
            if (r1 <= 0) goto L_0x00ea
            r6.rightMargin = r1
        L_0x00ea:
            int r1 = r6.setChecked
            if (r1 == r7) goto L_0x00f9
            r6.setSplitBackground = r1
            int r7 = r6.leftMargin
            if (r7 > 0) goto L_0x0107
            if (r0 <= 0) goto L_0x0107
            r6.leftMargin = r0
            return
        L_0x00f9:
            int r1 = r6.setIcon
            if (r1 == r7) goto L_0x0107
            r6.setPrimaryBackground = r1
            int r7 = r6.leftMargin
            if (r7 > 0) goto L_0x0107
            if (r0 <= 0) goto L_0x0107
            r6.leftMargin = r0
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver.resolveLayoutDirection(int):void");
    }
}

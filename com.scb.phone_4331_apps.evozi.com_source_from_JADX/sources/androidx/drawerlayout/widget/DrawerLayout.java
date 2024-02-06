package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p040o.SwitchCompat;
import p040o.setIconifiedByDefault;
import p040o.setLastBaselineToBottomHeight;
import p040o.setOnQueryTextListener;
import p040o.setTextOn;
import p040o.setTextOn$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTitleMargin;
import p040o.setTitleMarginBottom;

public class DrawerLayout extends ViewGroup {
    private static final boolean MediaBrowserCompat$MediaItem;
    private static final int[] MediaSessionCompat$ResultReceiverWrapper = {16843828};
    static final int[] read = {16842931};
    static final boolean write = (Build.VERSION.SDK_INT >= 19);
    private int ActionMenuItemView;
    private boolean AlertController$RecycleListView;
    private IconCompatParcelizer AppCompatActivity;
    private final DrawerLayout$MediaBrowserCompat$MediaItem AppCompatDelegateImpl$ListMenuDecorView;
    private Object AppCompatDialogFragment;
    private int AppCompatViewInflater;
    private Drawable ExpandedMenuView;
    int IconCompatParcelizer;
    private float Keep;
    private Drawable ListMenuItemView;
    final setTitleMargin MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    List<IconCompatParcelizer> MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final DrawerLayout$MediaBrowserCompat$CustomActionResultReceiver f17x50fd9e4a;
    final setTitleMargin MediaDescriptionCompat;
    CharSequence MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    private Rect MediaSessionCompat$Token;
    private Matrix ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private float PlaybackStateCompat$CustomAction;
    CharSequence RatingCompat;
    private int setBackgroundResource;
    private final DrawerLayout$MediaBrowserCompat$MediaItem setCheckable;
    private int setChecked;
    private int setContentView;
    private final ArrayList<View> setExpandedFormat;
    private Drawable setForceShowIcon;
    private Drawable setGroupDividerEnabled;
    private float setHasDecor;
    private Paint setIcon;
    private float setItemInvoker;
    private Drawable setPadding;
    private int setPopupCallback;
    private Drawable setShortcut;
    private Drawable setTitle;

    public interface IconCompatParcelizer {
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        MediaBrowserCompat$MediaItem = z;
    }

    public DrawerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17x50fd9e4a = new DrawerLayout$MediaBrowserCompat$CustomActionResultReceiver();
        this.setPopupCallback = -1728053248;
        this.setIcon = new Paint();
        this.AlertController$RecycleListView = true;
        this.setContentView = 3;
        this.ActionMenuItemView = 3;
        this.AppCompatViewInflater = 3;
        this.setBackgroundResource = 3;
        this.ListMenuItemView = null;
        this.setShortcut = null;
        this.setPadding = null;
        this.setTitle = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.setChecked = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.AppCompatDelegateImpl$ListMenuDecorView = new DrawerLayout$MediaBrowserCompat$MediaItem(this, 3);
        this.setCheckable = new DrawerLayout$MediaBrowserCompat$MediaItem(this, 5);
        setTitleMargin MediaBrowserCompat$ItemReceiver2 = setTitleMargin.MediaBrowserCompat$ItemReceiver((ViewGroup) this, 1.0f, (setTitleMargin.read) this.AppCompatDelegateImpl$ListMenuDecorView);
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver2;
        MediaBrowserCompat$ItemReceiver2.MediaSessionCompat$ResultReceiverWrapper = 1;
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = f2;
        this.AppCompatDelegateImpl$ListMenuDecorView.read = this.MediaBrowserCompat$CustomActionResultReceiver;
        setTitleMargin MediaBrowserCompat$ItemReceiver3 = setTitleMargin.MediaBrowserCompat$ItemReceiver((ViewGroup) this, 1.0f, (setTitleMargin.read) this.setCheckable);
        this.MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver3;
        MediaBrowserCompat$ItemReceiver3.MediaSessionCompat$ResultReceiverWrapper = 2;
        this.MediaDescriptionCompat.MediaMetadataCompat = f2;
        this.setCheckable.read = this.MediaDescriptionCompat;
        setFocusableInTouchMode(true);
        SwitchCompat.write((View) this, 1);
        SwitchCompat.read((View) this, (setIconifiedByDefault) new write());
        setMotionEventSplittingEnabled(false);
        if (SwitchCompat.RatingCompat(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MediaSessionCompat$ResultReceiverWrapper);
                try {
                    this.ExpandedMenuView = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.ExpandedMenuView = null;
            }
        }
        this.PlaybackStateCompat$CustomAction = f * 10.0f;
        this.setExpandedFormat = new ArrayList<>();
    }

    public void setDrawerElevation(float f) {
        this.PlaybackStateCompat$CustomAction = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (write(childAt)) {
                SwitchCompat.IconCompatParcelizer(childAt, this.PlaybackStateCompat$CustomAction);
            }
        }
    }

    public void setChildInsets(Object obj, boolean z) {
        this.AppCompatDialogFragment = obj;
        this.MediaSessionCompat$QueueItem = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (!MediaBrowserCompat$MediaItem) {
            if ((i & 8388611) == 8388611) {
                this.ListMenuItemView = drawable;
            } else if ((i & 8388613) == 8388613) {
                this.setShortcut = drawable;
            } else if ((i & 3) == 3) {
                this.setPadding = drawable;
            } else if ((i & 5) == 5) {
                this.setTitle = drawable;
            } else {
                return;
            }
            MediaBrowserCompat$CustomActionResultReceiver();
            invalidate();
        }
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(setLastBaselineToBottomHeight.write(getContext(), i), i2);
    }

    public void setScrimColor(int i) {
        this.setPopupCallback = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(IconCompatParcelizer iconCompatParcelizer) {
        List<IconCompatParcelizer> list;
        IconCompatParcelizer iconCompatParcelizer2 = this.AppCompatActivity;
        if (!(iconCompatParcelizer2 == null || iconCompatParcelizer2 == null || (list = this.MediaBrowserCompat$SearchResultReceiver) == null)) {
            list.remove(iconCompatParcelizer2);
        }
        if (!(iconCompatParcelizer == null || iconCompatParcelizer == null)) {
            if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                this.MediaBrowserCompat$SearchResultReceiver = new ArrayList();
            }
            this.MediaBrowserCompat$SearchResultReceiver.add(iconCompatParcelizer);
        }
        this.AppCompatActivity = iconCompatParcelizer;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerLockMode(int i, int i2) {
        View write2;
        int MediaBrowserCompat$CustomActionResultReceiver2 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(i2, SwitchCompat.m3079x50fd9e4a(this));
        if (i2 == 3) {
            this.setContentView = i;
        } else if (i2 == 5) {
            this.ActionMenuItemView = i;
        } else if (i2 == 8388611) {
            this.AppCompatViewInflater = i;
        } else if (i2 == 8388613) {
            this.setBackgroundResource = i;
        }
        if (i != 0) {
            (MediaBrowserCompat$CustomActionResultReceiver2 == 3 ? this.MediaBrowserCompat$CustomActionResultReceiver : this.MediaDescriptionCompat).write();
        }
        if (i == 1) {
            View write3 = write(MediaBrowserCompat$CustomActionResultReceiver2);
            if (write3 != null) {
                IconCompatParcelizer(write3);
            }
        } else if (i == 2 && (write2 = write(MediaBrowserCompat$CustomActionResultReceiver2)) != null) {
            MediaDescriptionCompat(write2);
        }
    }

    public void setDrawerLockMode(int i, View view) {
        if (write(view)) {
            setDrawerLockMode(i, ((DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams()).IconCompatParcelizer);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a ");
        sb.append("drawer with appropriate layout_gravity");
        throw new IllegalArgumentException(sb.toString());
    }

    public final int MediaBrowserCompat$ItemReceiver(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        if (write(view)) {
            int i5 = ((DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams()).IconCompatParcelizer;
            int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = SwitchCompat.m3079x50fd9e4a(this);
            if (i5 == 3) {
                int i6 = this.setContentView;
                if (i6 != 3) {
                    return i6;
                }
                if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 0) {
                    i = this.AppCompatViewInflater;
                } else {
                    i = this.setBackgroundResource;
                }
                if (i != 3) {
                    return i;
                }
                return 0;
            } else if (i5 == 5) {
                int i7 = this.ActionMenuItemView;
                if (i7 != 3) {
                    return i7;
                }
                if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 0) {
                    i2 = this.setBackgroundResource;
                } else {
                    i2 = this.AppCompatViewInflater;
                }
                if (i2 != 3) {
                    return i2;
                }
                return 0;
            } else if (i5 == 8388611) {
                int i8 = this.AppCompatViewInflater;
                if (i8 != 3) {
                    return i8;
                }
                if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 0) {
                    i3 = this.setContentView;
                } else {
                    i3 = this.ActionMenuItemView;
                }
                if (i3 != 3) {
                    return i3;
                }
                return 0;
            } else if (i5 != 8388613) {
                return 0;
            } else {
                int i9 = this.setBackgroundResource;
                if (i9 != 3) {
                    return i9;
                }
                if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 0) {
                    i4 = this.ActionMenuItemView;
                } else {
                    i4 = this.setContentView;
                }
                if (i4 != 3) {
                    return i4;
                }
                return 0;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("View ");
            sb.append(view);
            sb.append(" is not a drawer");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        int MediaBrowserCompat$CustomActionResultReceiver2 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(i, SwitchCompat.m3079x50fd9e4a(this));
        if (MediaBrowserCompat$CustomActionResultReceiver2 == 3) {
            this.RatingCompat = charSequence;
        } else if (MediaBrowserCompat$CustomActionResultReceiver2 == 5) {
            this.MediaMetadataCompat = charSequence;
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || write(childAt)) && (!z || childAt != view)) {
                SwitchCompat.write(childAt, 4);
            } else {
                SwitchCompat.write(childAt, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer() {
        List<IconCompatParcelizer> list = this.MediaBrowserCompat$SearchResultReceiver;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.MediaBrowserCompat$SearchResultReceiver.get(size);
            }
        }
    }

    static float MediaBrowserCompat$CustomActionResultReceiver(View view) {
        return ((DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams()).MediaBrowserCompat$ItemReceiver;
    }

    private View MediaBrowserCompat$ItemReceiver() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams()).read & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final View write(int i) {
        int MediaBrowserCompat$CustomActionResultReceiver2 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(i, SwitchCompat.m3079x50fd9e4a(this));
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(((DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams()).IconCompatParcelizer, SwitchCompat.m3079x50fd9e4a(this)) & 7) == (MediaBrowserCompat$CustomActionResultReceiver2 & 7)) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.AlertController$RecycleListView = true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.AlertController$RecycleListView = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        String str;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.AppCompatDialogFragment != null && SwitchCompat.RatingCompat(this);
        int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = SwitchCompat.m3079x50fd9e4a(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver = (DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams();
                if (z) {
                    int MediaBrowserCompat$CustomActionResultReceiver2 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(drawerLayout$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                    if (SwitchCompat.RatingCompat(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.AppCompatDialogFragment;
                            if (MediaBrowserCompat$CustomActionResultReceiver2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (MediaBrowserCompat$CustomActionResultReceiver2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.AppCompatDialogFragment;
                        if (MediaBrowserCompat$CustomActionResultReceiver2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (MediaBrowserCompat$CustomActionResultReceiver2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        drawerLayout$MediaBrowserCompat$ItemReceiver.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        drawerLayout$MediaBrowserCompat$ItemReceiver.topMargin = windowInsets2.getSystemWindowInsetTop();
                        drawerLayout$MediaBrowserCompat$ItemReceiver.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        drawerLayout$MediaBrowserCompat$ItemReceiver.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if ((((DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams()).IconCompatParcelizer == 0 ? 1 : i3) != 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - drawerLayout$MediaBrowserCompat$ItemReceiver.leftMargin) - drawerLayout$MediaBrowserCompat$ItemReceiver.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - drawerLayout$MediaBrowserCompat$ItemReceiver.topMargin) - drawerLayout$MediaBrowserCompat$ItemReceiver.bottomMargin, 1073741824));
                } else if (write(childAt)) {
                    if (MediaBrowserCompat$MediaItem) {
                        float MediaBrowserCompat$SearchResultReceiver2 = SwitchCompat.MediaBrowserCompat$SearchResultReceiver(childAt);
                        float f = this.PlaybackStateCompat$CustomAction;
                        if (MediaBrowserCompat$SearchResultReceiver2 != f) {
                            SwitchCompat.IconCompatParcelizer(childAt, f);
                        }
                    }
                    int MediaBrowserCompat$CustomActionResultReceiver3 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(((DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams()).IconCompatParcelizer, SwitchCompat.m3079x50fd9e4a(this)) & 7;
                    int i5 = MediaBrowserCompat$CustomActionResultReceiver3 == 3 ? 1 : i3;
                    if ((i5 == 0 || !z2) && (i5 != 0 || !z3)) {
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(getChildMeasureSpec(i, this.setChecked + drawerLayout$MediaBrowserCompat$ItemReceiver.leftMargin + drawerLayout$MediaBrowserCompat$ItemReceiver.rightMargin, drawerLayout$MediaBrowserCompat$ItemReceiver.width), getChildMeasureSpec(i2, drawerLayout$MediaBrowserCompat$ItemReceiver.topMargin + drawerLayout$MediaBrowserCompat$ItemReceiver.bottomMargin, drawerLayout$MediaBrowserCompat$ItemReceiver.height));
                        i4++;
                        i3 = 0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Child drawer has absolute gravity ");
                        if ((MediaBrowserCompat$CustomActionResultReceiver3 & 3) != 3) {
                            str = (MediaBrowserCompat$CustomActionResultReceiver3 & 5) == 5 ? "RIGHT" : Integer.toHexString(MediaBrowserCompat$CustomActionResultReceiver3);
                        } else {
                            str = "LEFT";
                        }
                        sb.append(str);
                        sb.append(" but this ");
                        sb.append("DrawerLayout");
                        sb.append(" already has a ");
                        sb.append("drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i4);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                    sb2.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            int i6 = i;
            int i7 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r3 = this;
            boolean r0 = MediaBrowserCompat$MediaItem
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = p040o.SwitchCompat.m3079x50fd9e4a(r3)
            if (r0 != 0) goto L_0x001d
            android.graphics.drawable.Drawable r1 = r3.ListMenuItemView
            if (r1 == 0) goto L_0x002f
            if (r1 == 0) goto L_0x001a
            boolean r2 = p040o.setBaselineAligned.MediaDescriptionCompat(r1)
            if (r2 == 0) goto L_0x001a
            p040o.setBaselineAligned.read((android.graphics.drawable.Drawable) r1, (int) r0)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r3.ListMenuItemView
            goto L_0x0031
        L_0x001d:
            android.graphics.drawable.Drawable r1 = r3.setShortcut
            if (r1 == 0) goto L_0x002f
            if (r1 == 0) goto L_0x002c
            boolean r2 = p040o.setBaselineAligned.MediaDescriptionCompat(r1)
            if (r2 == 0) goto L_0x002c
            p040o.setBaselineAligned.read((android.graphics.drawable.Drawable) r1, (int) r0)
        L_0x002c:
            android.graphics.drawable.Drawable r0 = r3.setShortcut
            goto L_0x0031
        L_0x002f:
            android.graphics.drawable.Drawable r0 = r3.setPadding
        L_0x0031:
            r3.setGroupDividerEnabled = r0
            int r0 = p040o.SwitchCompat.m3079x50fd9e4a(r3)
            if (r0 != 0) goto L_0x004b
            android.graphics.drawable.Drawable r1 = r3.setShortcut
            if (r1 == 0) goto L_0x005d
            if (r1 == 0) goto L_0x0048
            boolean r2 = p040o.setBaselineAligned.MediaDescriptionCompat(r1)
            if (r2 == 0) goto L_0x0048
            p040o.setBaselineAligned.read((android.graphics.drawable.Drawable) r1, (int) r0)
        L_0x0048:
            android.graphics.drawable.Drawable r0 = r3.setShortcut
            goto L_0x005f
        L_0x004b:
            android.graphics.drawable.Drawable r1 = r3.ListMenuItemView
            if (r1 == 0) goto L_0x005d
            if (r1 == 0) goto L_0x005a
            boolean r2 = p040o.setBaselineAligned.MediaDescriptionCompat(r1)
            if (r2 == 0) goto L_0x005a
            p040o.setBaselineAligned.read((android.graphics.drawable.Drawable) r1, (int) r0)
        L_0x005a:
            android.graphics.drawable.Drawable r0 = r3.ListMenuItemView
            goto L_0x005f
        L_0x005d:
            android.graphics.drawable.Drawable r0 = r3.setTitle
        L_0x005f:
            r3.setForceShowIcon = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.MediaBrowserCompat$CustomActionResultReceiver():void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        boolean z2 = true;
        this.PlaybackStateCompat = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver = (DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams();
                if (((DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams()).IconCompatParcelizer == 0 ? z2 : false) {
                    childAt.layout(drawerLayout$MediaBrowserCompat$ItemReceiver.leftMargin, drawerLayout$MediaBrowserCompat$ItemReceiver.topMargin, drawerLayout$MediaBrowserCompat$ItemReceiver.leftMargin + childAt.getMeasuredWidth(), drawerLayout$MediaBrowserCompat$ItemReceiver.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (MediaBrowserCompat$ItemReceiver(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (drawerLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i8 = i6 - ((int) (drawerLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver * f3));
                        f = ((float) (i6 - i8)) / f3;
                        i5 = i8;
                    }
                    boolean z3 = f != drawerLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver ? z2 : false;
                    int i9 = drawerLayout$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        if (i11 < drawerLayout$MediaBrowserCompat$ItemReceiver.topMargin) {
                            i11 = drawerLayout$MediaBrowserCompat$ItemReceiver.topMargin;
                        } else if (i11 + measuredHeight > i10 - drawerLayout$MediaBrowserCompat$ItemReceiver.bottomMargin) {
                            i11 = (i10 - drawerLayout$MediaBrowserCompat$ItemReceiver.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        childAt.layout(i5, drawerLayout$MediaBrowserCompat$ItemReceiver.topMargin, measuredWidth + i5, drawerLayout$MediaBrowserCompat$ItemReceiver.topMargin + measuredHeight);
                    } else {
                        int i12 = i4 - i2;
                        childAt.layout(i5, (i12 - drawerLayout$MediaBrowserCompat$ItemReceiver.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - drawerLayout$MediaBrowserCompat$ItemReceiver.bottomMargin);
                    }
                    if (z3) {
                        DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver2 = (DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams();
                        if (f != drawerLayout$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver) {
                            drawerLayout$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = f;
                            IconCompatParcelizer();
                        }
                    }
                    int i13 = drawerLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver > BitmapDescriptorFactory.HUE_RED ? 0 : 4;
                    if (childAt.getVisibility() != i13) {
                        childAt.setVisibility(i13);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        this.PlaybackStateCompat = false;
        this.AlertController$RecycleListView = false;
    }

    public void requestLayout() {
        if (!this.PlaybackStateCompat) {
            super.requestLayout();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((DrawerLayout$MediaBrowserCompat$ItemReceiver) getChildAt(i).getLayoutParams()).MediaBrowserCompat$ItemReceiver);
        }
        this.setItemInvoker = f;
        boolean MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        boolean MediaBrowserCompat$CustomActionResultReceiver3 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 || MediaBrowserCompat$CustomActionResultReceiver3) {
            SwitchCompat.setItemInvoker(this);
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.ExpandedMenuView = drawable;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.ExpandedMenuView = i != 0 ? setLastBaselineToBottomHeight.write(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.ExpandedMenuView = new ColorDrawable(i);
        invalidate();
    }

    public void onRtlPropertiesChanged(int i) {
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.AppCompatDialogFragment;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.MediaSessionCompat$QueueItem
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.ExpandedMenuView
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.AppCompatDialogFragment
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.ExpandedMenuView
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.ExpandedMenuView
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        int i = 0;
        boolean z = ((DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams()).IconCompatParcelizer == 0;
        int width = getWidth();
        int save = canvas.save();
        if (z) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view2 && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && write(childAt) && childAt.getHeight() >= height) {
                        if (MediaBrowserCompat$ItemReceiver(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas2.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas2.restoreToCount(save);
        float f = this.setItemInvoker;
        if (f > BitmapDescriptorFactory.HUE_RED && z) {
            int i4 = this.setPopupCallback;
            this.setIcon.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, BitmapDescriptorFactory.HUE_RED, (float) width, (float) getHeight(), this.setIcon);
        } else if (this.setGroupDividerEnabled != null && MediaBrowserCompat$ItemReceiver(view2, 3)) {
            int intrinsicWidth = this.setGroupDividerEnabled.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(((float) right2) / ((float) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver), 1.0f));
            this.setGroupDividerEnabled.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.setGroupDividerEnabled.setAlpha((int) (max * 255.0f));
            this.setGroupDividerEnabled.draw(canvas2);
        } else if (this.setForceShowIcon != null && MediaBrowserCompat$ItemReceiver(view2, 5)) {
            int intrinsicWidth2 = this.setForceShowIcon.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(((float) (getWidth() - left2)) / ((float) this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver), 1.0f));
            this.setForceShowIcon.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.setForceShowIcon.setAlpha((int) (max2 * 255.0f));
            this.setForceShowIcon.draw(canvas2);
        }
        return drawChild;
    }

    static boolean write(View view) {
        int MediaBrowserCompat$CustomActionResultReceiver2 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(((DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams()).IconCompatParcelizer, SwitchCompat.m3079x50fd9e4a(view));
        return ((MediaBrowserCompat$CustomActionResultReceiver2 & 3) == 0 && (MediaBrowserCompat$CustomActionResultReceiver2 & 5) == 0) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r0 != 3) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055 A[LOOP:0: B:8:0x0023->B:20:0x0055, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0053 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r10.getActionMasked()
            o.setTitleMargin r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
            boolean r1 = r1.write((android.view.MotionEvent) r10)
            o.setTitleMargin r2 = r9.MediaDescriptionCompat
            boolean r2 = r2.write((android.view.MotionEvent) r10)
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0075
            if (r0 == r4) goto L_0x006e
            r10 = 2
            if (r0 == r10) goto L_0x001d
            r10 = 3
            if (r0 == r10) goto L_0x006e
            goto L_0x0073
        L_0x001d:
            o.setTitleMargin r10 = r9.MediaBrowserCompat$CustomActionResultReceiver
            float[] r0 = r10.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r0.length
            r5 = r3
        L_0x0023:
            if (r5 >= r0) goto L_0x0058
            int r6 = r10.MediaDescriptionCompat
            int r7 = r4 << r5
            r6 = r6 & r7
            if (r6 != 0) goto L_0x002e
            r6 = r3
            goto L_0x002f
        L_0x002e:
            r6 = r4
        L_0x002f:
            if (r6 != 0) goto L_0x0033
        L_0x0031:
            r6 = r3
            goto L_0x0051
        L_0x0033:
            float[] r6 = r10.RatingCompat
            r6 = r6[r5]
            float[] r7 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r7 = r7[r5]
            float r6 = r6 - r7
            float[] r7 = r10.MediaBrowserCompat$SearchResultReceiver
            r7 = r7[r5]
            float[] r8 = r10.IconCompatParcelizer
            r8 = r8[r5]
            float r7 = r7 - r8
            int r8 = r10.MediaBrowserCompat$MediaItem
            float r6 = r6 * r6
            float r7 = r7 * r7
            float r6 = r6 + r7
            int r8 = r8 * r8
            float r7 = (float) r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0031
            r6 = r4
        L_0x0051:
            if (r6 == 0) goto L_0x0055
            r10 = r4
            goto L_0x0059
        L_0x0055:
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0058:
            r10 = r3
        L_0x0059:
            if (r10 == 0) goto L_0x0073
            androidx.drawerlayout.widget.DrawerLayout$MediaBrowserCompat$MediaItem r10 = r9.AppCompatDelegateImpl$ListMenuDecorView
            androidx.drawerlayout.widget.DrawerLayout r0 = r10.IconCompatParcelizer
            java.lang.Runnable r10 = r10.MediaBrowserCompat$ItemReceiver
            r0.removeCallbacks(r10)
            androidx.drawerlayout.widget.DrawerLayout$MediaBrowserCompat$MediaItem r10 = r9.setCheckable
            androidx.drawerlayout.widget.DrawerLayout r0 = r10.IconCompatParcelizer
            java.lang.Runnable r10 = r10.MediaBrowserCompat$ItemReceiver
            r0.removeCallbacks(r10)
            goto L_0x0073
        L_0x006e:
            r9.read((boolean) r4)
            r9.MediaBrowserCompat$ItemReceiver = r3
        L_0x0073:
            r10 = r3
            goto L_0x00a6
        L_0x0075:
            float r0 = r10.getX()
            float r10 = r10.getY()
            r9.Keep = r0
            r9.setHasDecor = r10
            float r5 = r9.setItemInvoker
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a3
            o.setTitleMargin r5 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = (int) r0
            int r10 = (int) r10
            android.view.View r10 = r5.MediaBrowserCompat$ItemReceiver(r0, r10)
            if (r10 == 0) goto L_0x00a3
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$MediaBrowserCompat$ItemReceiver r10 = (androidx.drawerlayout.widget.DrawerLayout$MediaBrowserCompat$ItemReceiver) r10
            int r10 = r10.IconCompatParcelizer
            if (r10 != 0) goto L_0x009e
            r10 = r4
            goto L_0x009f
        L_0x009e:
            r10 = r3
        L_0x009f:
            if (r10 == 0) goto L_0x00a3
            r10 = r4
            goto L_0x00a4
        L_0x00a3:
            r10 = r3
        L_0x00a4:
            r9.MediaBrowserCompat$ItemReceiver = r3
        L_0x00a6:
            r0 = r1 | r2
            if (r0 != 0) goto L_0x00cd
            if (r10 != 0) goto L_0x00cd
            int r10 = r9.getChildCount()
            r0 = r3
        L_0x00b1:
            if (r0 >= r10) goto L_0x00c6
            android.view.View r1 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$MediaBrowserCompat$ItemReceiver r1 = (androidx.drawerlayout.widget.DrawerLayout$MediaBrowserCompat$ItemReceiver) r1
            boolean r1 = r1.write
            if (r1 == 0) goto L_0x00c3
            r10 = r4
            goto L_0x00c7
        L_0x00c3:
            int r0 = r0 + 1
            goto L_0x00b1
        L_0x00c6:
            r10 = r3
        L_0x00c7:
            if (r10 != 0) goto L_0x00cd
            boolean r10 = r9.MediaBrowserCompat$ItemReceiver
            if (r10 == 0) goto L_0x00ce
        L_0x00cd:
            r3 = r4
        L_0x00ce:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.setItemInvoker <= BitmapDescriptorFactory.HUE_RED) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = getChildAt(childCount);
                if (this.MediaSessionCompat$Token == null) {
                    this.MediaSessionCompat$Token = new Rect();
                }
                childAt.getHitRect(this.MediaSessionCompat$Token);
                if (this.MediaSessionCompat$Token.contains((int) x, (int) y)) {
                    if (((DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams()).IconCompatParcelizer == 0) {
                        continue;
                    } else {
                        if (!childAt.getMatrix().isIdentity()) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.offsetLocation((float) (getScrollX() - childAt.getLeft()), (float) (getScrollY() - childAt.getTop()));
                            Matrix matrix = childAt.getMatrix();
                            if (!matrix.isIdentity()) {
                                if (this.ParcelableVolumeInfo == null) {
                                    this.ParcelableVolumeInfo = new Matrix();
                                }
                                matrix.invert(this.ParcelableVolumeInfo);
                                obtain.transform(this.ParcelableVolumeInfo);
                            }
                            z = childAt.dispatchGenericMotionEvent(obtain);
                            obtain.recycle();
                        } else {
                            float scrollX = (float) (getScrollX() - childAt.getLeft());
                            float scrollY = (float) (getScrollY() - childAt.getTop());
                            motionEvent.offsetLocation(scrollX, scrollY);
                            z = childAt.dispatchGenericMotionEvent(motionEvent);
                            motionEvent.offsetLocation(-scrollX, -scrollY);
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (MediaBrowserCompat$ItemReceiver(r7) != 2) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            o.setTitleMargin r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r0.MediaBrowserCompat$CustomActionResultReceiver((android.view.MotionEvent) r7)
            o.setTitleMargin r0 = r6.MediaDescriptionCompat
            r0.MediaBrowserCompat$CustomActionResultReceiver((android.view.MotionEvent) r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0066
            if (r0 == r2) goto L_0x001f
            r7 = 3
            if (r0 != r7) goto L_0x0074
            r6.read((boolean) r2)
            r6.MediaBrowserCompat$ItemReceiver = r1
            goto L_0x0074
        L_0x001f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            o.setTitleMargin r3 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.MediaBrowserCompat$ItemReceiver(r4, r5)
            if (r3 == 0) goto L_0x0061
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$MediaBrowserCompat$ItemReceiver r3 = (androidx.drawerlayout.widget.DrawerLayout$MediaBrowserCompat$ItemReceiver) r3
            int r3 = r3.IconCompatParcelizer
            if (r3 != 0) goto L_0x003d
            r3 = r2
            goto L_0x003e
        L_0x003d:
            r3 = r1
        L_0x003e:
            if (r3 == 0) goto L_0x0061
            float r3 = r6.Keep
            float r0 = r0 - r3
            float r3 = r6.setHasDecor
            float r7 = r7 - r3
            o.setTitleMargin r3 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r3.MediaBrowserCompat$MediaItem
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0061
            android.view.View r7 = r6.MediaBrowserCompat$ItemReceiver()
            if (r7 == 0) goto L_0x0061
            int r7 = r6.MediaBrowserCompat$ItemReceiver(r7)
            r0 = 2
            if (r7 == r0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            r6.read((boolean) r1)
            goto L_0x0074
        L_0x0066:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.Keep = r0
            r6.setHasDecor = r7
            r6.MediaBrowserCompat$ItemReceiver = r1
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            read(true);
        }
    }

    private void read(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver = (DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams();
            if (write(childAt) && (!z || drawerLayout$MediaBrowserCompat$ItemReceiver.write)) {
                int width = childAt.getWidth();
                if (MediaBrowserCompat$ItemReceiver(childAt, 3)) {
                    z2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.MediaDescriptionCompat.IconCompatParcelizer(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                drawerLayout$MediaBrowserCompat$ItemReceiver.write = false;
            }
        }
        DrawerLayout$MediaBrowserCompat$MediaItem drawerLayout$MediaBrowserCompat$MediaItem = this.AppCompatDelegateImpl$ListMenuDecorView;
        drawerLayout$MediaBrowserCompat$MediaItem.IconCompatParcelizer.removeCallbacks(drawerLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver);
        DrawerLayout$MediaBrowserCompat$MediaItem drawerLayout$MediaBrowserCompat$MediaItem2 = this.setCheckable;
        drawerLayout$MediaBrowserCompat$MediaItem2.IconCompatParcelizer.removeCallbacks(drawerLayout$MediaBrowserCompat$MediaItem2.MediaBrowserCompat$ItemReceiver);
        if (z3) {
            invalidate();
        }
    }

    private void MediaDescriptionCompat(View view) {
        if (write(view)) {
            DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver = (DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams();
            if (this.AlertController$RecycleListView) {
                drawerLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = 1.0f;
                drawerLayout$MediaBrowserCompat$ItemReceiver.read = 1;
                IconCompatParcelizer(view, true);
            } else {
                drawerLayout$MediaBrowserCompat$ItemReceiver.read |= 2;
                if (MediaBrowserCompat$ItemReceiver(view, 3)) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(view, 0, view.getTop());
                } else {
                    this.MediaDescriptionCompat.IconCompatParcelizer(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DrawerLayout$MediaBrowserCompat$ItemReceiver();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof DrawerLayout$MediaBrowserCompat$ItemReceiver) {
            return new DrawerLayout$MediaBrowserCompat$ItemReceiver((DrawerLayout$MediaBrowserCompat$ItemReceiver) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new DrawerLayout$MediaBrowserCompat$ItemReceiver((ViewGroup.MarginLayoutParams) layoutParams) : new DrawerLayout$MediaBrowserCompat$ItemReceiver(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof DrawerLayout$MediaBrowserCompat$ItemReceiver) && super.checkLayoutParams(layoutParams);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new DrawerLayout$MediaBrowserCompat$ItemReceiver(getContext(), attributeSet);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!write(childAt)) {
                    this.setExpandedFormat.add(childAt);
                } else if (write(childAt)) {
                    if ((((DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams()).read & 1) == 1) {
                        childAt.addFocusables(arrayList, i, i2);
                        z = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("View ");
                    sb.append(childAt);
                    sb.append(" is not a drawer");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (!z) {
                int size = this.setExpandedFormat.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.setExpandedFormat.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.setExpandedFormat.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final View write() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (write(childAt)) {
                if (write(childAt)) {
                    if (((DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams()).MediaBrowserCompat$ItemReceiver > BitmapDescriptorFactory.HUE_RED) {
                        return childAt;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("View ");
                    sb.append(childAt);
                    sb.append(" is not a drawer");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return null;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View write2 = write();
        if (write2 != null && MediaBrowserCompat$ItemReceiver(write2) == 0) {
            read(false);
        }
        if (write2 != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View write2;
        if (!(parcelable instanceof read)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        read read2 = (read) parcelable;
        super.onRestoreInstanceState(read2.write);
        if (!(read2.MediaMetadataCompat == 0 || (write2 = write(read2.MediaMetadataCompat)) == null)) {
            MediaDescriptionCompat(write2);
        }
        if (read2.IconCompatParcelizer != 3) {
            setDrawerLockMode(read2.IconCompatParcelizer, 3);
        }
        if (read2.read != 3) {
            setDrawerLockMode(read2.read, 5);
        }
        if (read2.RatingCompat != 3) {
            setDrawerLockMode(read2.RatingCompat, 8388611);
        }
        if (read2.MediaBrowserCompat$ItemReceiver != 3) {
            setDrawerLockMode(read2.MediaBrowserCompat$ItemReceiver, 8388613);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        read read2 = new read(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver = (DrawerLayout$MediaBrowserCompat$ItemReceiver) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = drawerLayout$MediaBrowserCompat$ItemReceiver.read == 1;
            if (drawerLayout$MediaBrowserCompat$ItemReceiver.read != 2) {
                z = false;
            }
            if (z2 || z) {
                read2.MediaMetadataCompat = drawerLayout$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            } else {
                i++;
            }
        }
        read2.IconCompatParcelizer = this.setContentView;
        read2.read = this.ActionMenuItemView;
        read2.RatingCompat = this.AppCompatViewInflater;
        read2.MediaBrowserCompat$ItemReceiver = this.setBackgroundResource;
        return read2;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (MediaBrowserCompat$ItemReceiver() != null || write(view)) {
            SwitchCompat.write(view, 4);
        } else {
            SwitchCompat.write(view, 1);
        }
        if (!write) {
            SwitchCompat.read(view, (setIconifiedByDefault) this.f17x50fd9e4a);
        }
    }

    static boolean read(View view) {
        return (SwitchCompat.MediaBrowserCompat$MediaItem(view) == 4 || SwitchCompat.MediaBrowserCompat$MediaItem(view) == 2) ? false : true;
    }

    public static class read extends setTitleMarginBottom {
        public static final Parcelable.Creator<read> CREATOR = new Parcelable.ClassLoaderCreator<read>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new read(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new read(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new read[i];
            }
        };
        int IconCompatParcelizer;
        int MediaBrowserCompat$ItemReceiver;
        int MediaMetadataCompat = 0;
        int RatingCompat;
        int read;

        public read(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.MediaMetadataCompat = parcel.readInt();
            this.IconCompatParcelizer = parcel.readInt();
            this.read = parcel.readInt();
            this.RatingCompat = parcel.readInt();
            this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
        }

        public read(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.MediaMetadataCompat);
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeInt(this.read);
            parcel.writeInt(this.RatingCompat);
            parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    class write extends setIconifiedByDefault {
        private final Rect read = new Rect();

        write() {
        }

        public final void IconCompatParcelizer(View view, setTextOn settexton) {
            if (DrawerLayout.write) {
                super.IconCompatParcelizer(view, settexton);
            } else {
                setTextOn read2 = setTextOn.read(settexton);
                super.IconCompatParcelizer(view, read2);
                settexton.IconCompatParcelizer(view);
                ViewParent hasDecor = SwitchCompat.setHasDecor(view);
                if (hasDecor instanceof View) {
                    settexton.MediaBrowserCompat$ItemReceiver((View) hasDecor);
                }
                Rect rect = this.read;
                read2.MediaBrowserCompat$ItemReceiver(rect);
                settexton.read(rect);
                read2.write(rect);
                settexton.MediaBrowserCompat$CustomActionResultReceiver(rect);
                settexton.mo20608x50fd9e4a(read2.Keep());
                settexton.MediaBrowserCompat$CustomActionResultReceiver(read2.MediaBrowserCompat$ItemReceiver());
                settexton.write(read2.read());
                settexton.read(read2.write());
                settexton.RatingCompat(read2.MediaSessionCompat$Token());
                settexton.MediaBrowserCompat$ItemReceiver(read2.mo20609x50fd9e4a());
                settexton.MediaBrowserCompat$SearchResultReceiver(read2.MediaSessionCompat$QueueItem());
                settexton.MediaMetadataCompat(read2.MediaSessionCompat$ResultReceiverWrapper());
                settexton.IconCompatParcelizer(read2.RatingCompat());
                settexton.MediaSessionCompat$QueueItem(read2.PlaybackStateCompat());
                settexton.ParcelableVolumeInfo(read2.ParcelableVolumeInfo());
                settexton.read(read2.MediaBrowserCompat$CustomActionResultReceiver());
                read2.AlertController$RecycleListView();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.read(childAt)) {
                        settexton.write(childAt);
                    }
                }
            }
            settexton.write((CharSequence) DrawerLayout.class.getName());
            settexton.MediaBrowserCompat$SearchResultReceiver(false);
            settexton.MediaMetadataCompat(false);
            settexton.write(setTextOn$MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
            settexton.write(setTextOn$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(View view, AccessibilityEvent accessibilityEvent) {
            super.MediaBrowserCompat$CustomActionResultReceiver(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        public final boolean read(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence charSequence;
            if (accessibilityEvent.getEventType() != 32) {
                return super.read(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View write = DrawerLayout.this.write();
            if (write == null) {
                return true;
            }
            int MediaBrowserCompat$CustomActionResultReceiver = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(((DrawerLayout$MediaBrowserCompat$ItemReceiver) write.getLayoutParams()).IconCompatParcelizer, SwitchCompat.m3079x50fd9e4a(DrawerLayout.this));
            DrawerLayout drawerLayout = DrawerLayout.this;
            int MediaBrowserCompat$CustomActionResultReceiver2 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver, SwitchCompat.m3079x50fd9e4a(drawerLayout));
            if (MediaBrowserCompat$CustomActionResultReceiver2 == 3) {
                charSequence = drawerLayout.RatingCompat;
            } else if (MediaBrowserCompat$CustomActionResultReceiver2 == 5) {
                charSequence = drawerLayout.MediaMetadataCompat;
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                return true;
            }
            text.add(charSequence);
            return true;
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.write || DrawerLayout.read(view)) {
                return super.MediaBrowserCompat$CustomActionResultReceiver(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$ItemReceiver(View view, int i) {
        return (setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(((DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams()).IconCompatParcelizer, SwitchCompat.m3079x50fd9e4a(this)) & i) == i;
    }

    public final void IconCompatParcelizer(View view) {
        if (write(view)) {
            DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver = (DrawerLayout$MediaBrowserCompat$ItemReceiver) view.getLayoutParams();
            if (this.AlertController$RecycleListView) {
                drawerLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = BitmapDescriptorFactory.HUE_RED;
                drawerLayout$MediaBrowserCompat$ItemReceiver.read = 0;
            } else {
                drawerLayout$MediaBrowserCompat$ItemReceiver.read |= 4;
                if (MediaBrowserCompat$ItemReceiver(view, 3)) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(view, -view.getWidth(), view.getTop());
                } else {
                    this.MediaDescriptionCompat.IconCompatParcelizer(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (write() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}

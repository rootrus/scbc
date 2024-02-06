package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.SwitchCompat;
import p040o.setBackgroundDrawable;
import p040o.setContentInsetsAbsolute;
import p040o.setLastBaselineToBottomHeight;
import p040o.setOnHierarchyChangeListener;
import p040o.setSearchableInfo;
import p040o.setSuggestionsAdapter;

public class SwipeRefreshLayout extends ViewGroup implements setSuggestionsAdapter, setSearchableInfo {

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static final String f34x50fd9e4a = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] MediaSessionCompat$QueueItem = {16842766};
    private boolean ActionMenuItemView;
    private final Animation AlertController$RecycleListView;
    private int AppCompatActivity;
    private int AppCompatDelegateImpl$ListMenuDecorView;
    private int AppCompatDialogFragment;
    private final setBackgroundDrawable.write AppCompatViewInflater;
    private View ExpandedMenuView;
    CircleImageView IconCompatParcelizer;
    private Animation Keep;
    private float ListMenuItemView;
    IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    int MediaBrowserCompat$SearchResultReceiver;
    boolean MediaDescriptionCompat;
    setOnHierarchyChangeListener MediaMetadataCompat;
    float MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    boolean ParcelableVolumeInfo;
    private Animation PlaybackStateCompat;
    private read PlaybackStateCompat$CustomAction;
    protected int RatingCompat;
    protected int read;
    private float setBackgroundResource;
    private float setCheckable;
    private int setChecked;
    private final DecelerateInterpolator setContentView;
    private boolean setExpandedFormat;
    private Animation setForceShowIcon;
    private float setGroupDividerEnabled;
    private final Animation setHasDecor;
    private Animation setIcon;
    private final setBackgroundDrawable.read setItemInvoker;
    private final int[] setPadding;
    private Animation.AnimationListener setPopupCallback;
    private final int[] setShortcut;
    private Animation setTitle;
    private int setVisibility;
    boolean write;

    public interface IconCompatParcelizer {
        void read();
    }

    public interface read {
        boolean IconCompatParcelizer();
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        this.IconCompatParcelizer.clearAnimation();
        this.MediaMetadataCompat.stop();
        this.IconCompatParcelizer.setVisibility(8);
        this.IconCompatParcelizer.getBackground().setAlpha(255);
        this.MediaMetadataCompat.setAlpha(255);
        if (this.MediaDescriptionCompat) {
            this.IconCompatParcelizer.setScaleX(BitmapDescriptorFactory.HUE_RED);
            this.IconCompatParcelizer.setScaleY(BitmapDescriptorFactory.HUE_RED);
        } else {
            int i = this.RatingCompat - this.MediaBrowserCompat$ItemReceiver;
            this.IconCompatParcelizer.bringToFront();
            SwitchCompat.MediaBrowserCompat$ItemReceiver((View) this.IconCompatParcelizer, i);
            this.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.getTop();
        }
        this.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.getTop();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            read();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        read();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.MediaDescriptionCompat = z;
        this.RatingCompat = i;
        this.MediaBrowserCompat$SearchResultReceiver = i2;
        this.ParcelableVolumeInfo = true;
        read();
        this.MediaBrowserCompat$MediaItem = false;
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.MediaBrowserCompat$SearchResultReceiver = i;
        this.MediaDescriptionCompat = z;
        this.IconCompatParcelizer.invalidate();
    }

    public void setSlingshotDistance(int i) {
        this.AppCompatActivity = i;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.AppCompatDelegateImpl$ListMenuDecorView = (int) (displayMetrics.density * 56.0f);
            } else {
                this.AppCompatDelegateImpl$ListMenuDecorView = (int) (displayMetrics.density * 40.0f);
            }
            this.IconCompatParcelizer.setImageDrawable((Drawable) null);
            this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
            this.IconCompatParcelizer.setImageDrawable(this.MediaMetadataCompat);
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompat$MediaItem = false;
        this.setGroupDividerEnabled = -1.0f;
        this.setPadding = new int[2];
        this.setShortcut = new int[2];
        this.MediaSessionCompat$Token = -1;
        this.AppCompatDialogFragment = -1;
        this.setPopupCallback = new Animation.AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.MediaBrowserCompat$MediaItem) {
                    SwipeRefreshLayout.this.MediaMetadataCompat.setAlpha(255);
                    SwipeRefreshLayout.this.MediaMetadataCompat.start();
                    if (SwipeRefreshLayout.this.write && SwipeRefreshLayout.this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                        SwipeRefreshLayout.this.MediaBrowserCompat$CustomActionResultReceiver.read();
                    }
                    SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                    swipeRefreshLayout.MediaBrowserCompat$ItemReceiver = swipeRefreshLayout.IconCompatParcelizer.getTop();
                    return;
                }
                SwipeRefreshLayout.this.read();
            }
        };
        this.AlertController$RecycleListView = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (!SwipeRefreshLayout.this.ParcelableVolumeInfo) {
                    i = SwipeRefreshLayout.this.MediaBrowserCompat$SearchResultReceiver - Math.abs(SwipeRefreshLayout.this.RatingCompat);
                } else {
                    i = SwipeRefreshLayout.this.MediaBrowserCompat$SearchResultReceiver;
                }
                int top = SwipeRefreshLayout.this.IconCompatParcelizer.getTop();
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                swipeRefreshLayout.IconCompatParcelizer.bringToFront();
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) swipeRefreshLayout.IconCompatParcelizer, (SwipeRefreshLayout.this.read + ((int) (((float) (i - SwipeRefreshLayout.this.read)) * f))) - top);
                swipeRefreshLayout.MediaBrowserCompat$ItemReceiver = swipeRefreshLayout.IconCompatParcelizer.getTop();
                setOnHierarchyChangeListener setonhierarchychangelistener = SwipeRefreshLayout.this.MediaMetadataCompat;
                float f2 = 1.0f - f;
                setOnHierarchyChangeListener.IconCompatParcelizer iconCompatParcelizer = setonhierarchychangelistener.write;
                if (f2 != iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) {
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = f2;
                }
                setonhierarchychangelistener.invalidateSelf();
            }
        };
        this.setHasDecor = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.IconCompatParcelizer(f);
            }
        };
        this.setVisibility = ViewConfiguration.get(context).getScaledTouchSlop();
        this.setChecked = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.setContentView = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.AppCompatDelegateImpl$ListMenuDecorView = (int) (displayMetrics.density * 40.0f);
        this.IconCompatParcelizer = new CircleImageView(getContext());
        setOnHierarchyChangeListener setonhierarchychangelistener = new setOnHierarchyChangeListener(getContext());
        this.MediaMetadataCompat = setonhierarchychangelistener;
        setonhierarchychangelistener.MediaBrowserCompat$CustomActionResultReceiver(1);
        this.IconCompatParcelizer.setImageDrawable(this.MediaMetadataCompat);
        this.IconCompatParcelizer.setVisibility(8);
        addView(this.IconCompatParcelizer);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.MediaBrowserCompat$SearchResultReceiver = i;
        this.setGroupDividerEnabled = (float) i;
        this.setItemInvoker = new setBackgroundDrawable.read(this);
        this.AppCompatViewInflater = new setBackgroundDrawable.write(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.AppCompatDelegateImpl$ListMenuDecorView;
        this.MediaBrowserCompat$ItemReceiver = i2;
        this.RatingCompat = i2;
        IconCompatParcelizer(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MediaSessionCompat$QueueItem);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.AppCompatDialogFragment;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    public void setOnRefreshListener(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.MediaBrowserCompat$MediaItem == z) {
            IconCompatParcelizer(z, false);
            return;
        }
        this.MediaBrowserCompat$MediaItem = z;
        if (!this.ParcelableVolumeInfo) {
            i = this.MediaBrowserCompat$SearchResultReceiver + this.RatingCompat;
        } else {
            i = this.MediaBrowserCompat$SearchResultReceiver;
        }
        int i2 = i - this.MediaBrowserCompat$ItemReceiver;
        this.IconCompatParcelizer.bringToFront();
        SwitchCompat.MediaBrowserCompat$ItemReceiver((View) this.IconCompatParcelizer, i2);
        this.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.getTop();
        this.write = false;
        Animation.AnimationListener animationListener = this.setPopupCallback;
        this.IconCompatParcelizer.setVisibility(0);
        this.MediaMetadataCompat.setAlpha(255);
        C00765 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                swipeRefreshLayout.IconCompatParcelizer.setScaleX(f);
                swipeRefreshLayout.IconCompatParcelizer.setScaleY(f);
            }
        };
        this.setIcon = r0;
        r0.setDuration((long) this.setChecked);
        if (animationListener != null) {
            this.IconCompatParcelizer.setAnimationListener(animationListener);
        }
        this.IconCompatParcelizer.clearAnimation();
        this.IconCompatParcelizer.startAnimation(this.setIcon);
    }

    private void IconCompatParcelizer(boolean z, boolean z2) {
        if (this.MediaBrowserCompat$MediaItem != z) {
            this.write = z2;
            write();
            this.MediaBrowserCompat$MediaItem = z;
            if (z) {
                MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, this.setPopupCallback);
            } else {
                write(this.setPopupCallback);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(Animation.AnimationListener animationListener) {
        C00753 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                float f2 = 1.0f - f;
                swipeRefreshLayout.IconCompatParcelizer.setScaleX(f2);
                swipeRefreshLayout.IconCompatParcelizer.setScaleY(f2);
            }
        };
        this.setForceShowIcon = r0;
        r0.setDuration(150);
        this.IconCompatParcelizer.setAnimationListener(animationListener);
        this.IconCompatParcelizer.clearAnimation();
        this.IconCompatParcelizer.startAnimation(this.setForceShowIcon);
    }

    private Animation MediaBrowserCompat$ItemReceiver(final int i, final int i2) {
        C00742 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                setOnHierarchyChangeListener setonhierarchychangelistener = SwipeRefreshLayout.this.MediaMetadataCompat;
                int i = i;
                setonhierarchychangelistener.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r0.setDuration(300);
        this.IconCompatParcelizer.setAnimationListener((Animation.AnimationListener) null);
        this.IconCompatParcelizer.clearAnimation();
        this.IconCompatParcelizer.startAnimation(r0);
        return r0;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(setLastBaselineToBottomHeight.read(getContext(), i));
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.IconCompatParcelizer.setBackgroundColor(i);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = setLastBaselineToBottomHeight.read(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(int... iArr) {
        write();
        setOnHierarchyChangeListener setonhierarchychangelistener = this.MediaMetadataCompat;
        setOnHierarchyChangeListener.IconCompatParcelizer iconCompatParcelizer = setonhierarchychangelistener.write;
        iconCompatParcelizer.MediaBrowserCompat$MediaItem = iArr;
        iconCompatParcelizer.MediaMetadataCompat = 0;
        iconCompatParcelizer.MediaDescriptionCompat = iconCompatParcelizer.MediaBrowserCompat$MediaItem[0];
        setOnHierarchyChangeListener.IconCompatParcelizer iconCompatParcelizer2 = setonhierarchychangelistener.write;
        iconCompatParcelizer2.MediaMetadataCompat = 0;
        iconCompatParcelizer2.MediaDescriptionCompat = iconCompatParcelizer2.MediaBrowserCompat$MediaItem[0];
        setonhierarchychangelistener.invalidateSelf();
    }

    private void write() {
        if (this.ExpandedMenuView == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.IconCompatParcelizer)) {
                    this.ExpandedMenuView = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.setGroupDividerEnabled = (float) i;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.ExpandedMenuView == null) {
                write();
            }
            View view = this.ExpandedMenuView;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                int paddingLeft2 = getPaddingLeft();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - paddingLeft2) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.IconCompatParcelizer.getMeasuredWidth();
                int measuredHeight2 = this.IconCompatParcelizer.getMeasuredHeight();
                CircleImageView circleImageView = this.IconCompatParcelizer;
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.MediaBrowserCompat$ItemReceiver;
                circleImageView.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.ExpandedMenuView == null) {
            write();
        }
        View view = this.ExpandedMenuView;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.IconCompatParcelizer.measure(View.MeasureSpec.makeMeasureSpec(this.AppCompatDelegateImpl$ListMenuDecorView, 1073741824), View.MeasureSpec.makeMeasureSpec(this.AppCompatDelegateImpl$ListMenuDecorView, 1073741824));
            this.AppCompatDialogFragment = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.IconCompatParcelizer) {
                    this.AppCompatDialogFragment = i3;
                    return;
                }
            }
        }
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver() {
        read read2 = this.PlaybackStateCompat$CustomAction;
        if (read2 != null) {
            return read2.IconCompatParcelizer();
        }
        View view = this.ExpandedMenuView;
        if (view instanceof ListView) {
            return setContentInsetsAbsolute.MediaBrowserCompat$ItemReceiver((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public void setOnChildScrollUpCallback(read read2) {
        this.PlaybackStateCompat$CustomAction = read2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        write();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || MediaBrowserCompat$CustomActionResultReceiver() || this.MediaBrowserCompat$MediaItem || this.setExpandedFormat) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.MediaSessionCompat$Token;
                    if (i == -1) {
                        Log.e(f34x50fd9e4a, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    read(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        IconCompatParcelizer(motionEvent);
                    }
                }
            }
            this.ActionMenuItemView = false;
            this.MediaSessionCompat$Token = -1;
        } else {
            int top = this.RatingCompat - this.IconCompatParcelizer.getTop();
            this.IconCompatParcelizer.bringToFront();
            SwitchCompat.MediaBrowserCompat$ItemReceiver((View) this.IconCompatParcelizer, top);
            this.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.getTop();
            int pointerId = motionEvent.getPointerId(0);
            this.MediaSessionCompat$Token = pointerId;
            this.ActionMenuItemView = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.setBackgroundResource = motionEvent.getY(findPointerIndex2);
        }
        return this.ActionMenuItemView;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.ExpandedMenuView instanceof AbsListView)) {
            View view = this.ExpandedMenuView;
            if (view == null || SwitchCompat.ActionMenuItemView(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.MediaBrowserCompat$MediaItem && (i & 2) != 0;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.setItemInvoker.write = i;
        startNestedScroll(i & 2);
        this.ListMenuItemView = BitmapDescriptorFactory.HUE_RED;
        this.setExpandedFormat = true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.ListMenuItemView;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.ListMenuItemView = BitmapDescriptorFactory.HUE_RED;
                } else {
                    this.ListMenuItemView = f - f2;
                    iArr[1] = i2;
                }
                write(this.ListMenuItemView);
            }
        }
        if (this.ParcelableVolumeInfo && i2 > 0 && this.ListMenuItemView == BitmapDescriptorFactory.HUE_RED && Math.abs(i2 - iArr[1]) > 0) {
            this.IconCompatParcelizer.setVisibility(8);
        }
        int[] iArr2 = this.setPadding;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public int getNestedScrollAxes() {
        return this.setItemInvoker.write;
    }

    public void onStopNestedScroll(View view) {
        this.setItemInvoker.write = 0;
        this.setExpandedFormat = false;
        float f = this.ListMenuItemView;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            MediaBrowserCompat$CustomActionResultReceiver(f);
            this.ListMenuItemView = BitmapDescriptorFactory.HUE_RED;
        }
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.setShortcut);
        int i5 = i4 + this.setShortcut[1];
        if (i5 < 0 && !MediaBrowserCompat$CustomActionResultReceiver()) {
            float abs = this.ListMenuItemView + ((float) Math.abs(i5));
            this.ListMenuItemView = abs;
            write(abs);
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        setBackgroundDrawable.write write2 = this.AppCompatViewInflater;
        if (write2.write) {
            SwitchCompat.setIcon(write2.MediaBrowserCompat$ItemReceiver);
        }
        write2.write = z;
    }

    public boolean isNestedScrollingEnabled() {
        return this.AppCompatViewInflater.write;
    }

    public boolean startNestedScroll(int i) {
        return this.AppCompatViewInflater.MediaBrowserCompat$CustomActionResultReceiver(i, 0);
    }

    public void stopNestedScroll() {
        this.AppCompatViewInflater.write(0);
    }

    public boolean hasNestedScrollingParent() {
        return this.AppCompatViewInflater.MediaBrowserCompat$CustomActionResultReceiver(0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.AppCompatViewInflater.IconCompatParcelizer(i, i2, i3, i4, iArr, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.AppCompatViewInflater.MediaBrowserCompat$ItemReceiver(i, i2, iArr, iArr2, 0);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.AppCompatViewInflater.MediaBrowserCompat$ItemReceiver(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.AppCompatViewInflater.MediaBrowserCompat$ItemReceiver(f, f2);
    }

    private void write(float f) {
        setOnHierarchyChangeListener setonhierarchychangelistener = this.MediaMetadataCompat;
        setOnHierarchyChangeListener.IconCompatParcelizer iconCompatParcelizer = setonhierarchychangelistener.write;
        boolean z = true;
        if (!iconCompatParcelizer.f2635x50fd9e4a) {
            iconCompatParcelizer.f2635x50fd9e4a = true;
        }
        setonhierarchychangelistener.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.setGroupDividerEnabled));
        float max = (Math.max((float) (((double) min) - 0.4d), BitmapDescriptorFactory.HUE_RED) * 5.0f) / 3.0f;
        float abs = Math.abs(f);
        float f2 = this.setGroupDividerEnabled;
        int i = this.AppCompatActivity;
        if (i <= 0) {
            i = this.ParcelableVolumeInfo ? this.MediaBrowserCompat$SearchResultReceiver - this.RatingCompat : this.MediaBrowserCompat$SearchResultReceiver;
        }
        float f3 = (float) i;
        double max2 = (double) (Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(abs - f2, f3 * 2.0f) / f3) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.RatingCompat;
        int i3 = (int) ((min * f3) + (f3 * pow * 2.0f));
        if (this.IconCompatParcelizer.getVisibility() != 0) {
            this.IconCompatParcelizer.setVisibility(0);
        }
        if (!this.MediaDescriptionCompat) {
            this.IconCompatParcelizer.setScaleX(1.0f);
            this.IconCompatParcelizer.setScaleY(1.0f);
        }
        if (this.MediaDescriptionCompat) {
            float min2 = Math.min(1.0f, f / this.setGroupDividerEnabled);
            this.IconCompatParcelizer.setScaleX(min2);
            this.IconCompatParcelizer.setScaleY(min2);
        }
        if (f < this.setGroupDividerEnabled) {
            if (this.MediaMetadataCompat.getAlpha() > 76) {
                Animation animation = this.PlaybackStateCompat;
                if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
                    z = false;
                }
                if (!z) {
                    this.PlaybackStateCompat = MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat.getAlpha(), 76);
                }
            }
        } else if (this.MediaMetadataCompat.getAlpha() < 255) {
            Animation animation2 = this.Keep;
            if (animation2 == null || !animation2.hasStarted() || animation2.hasEnded()) {
                z = false;
            }
            if (!z) {
                this.Keep = MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat.getAlpha(), 255);
            }
        }
        setOnHierarchyChangeListener setonhierarchychangelistener2 = this.MediaMetadataCompat;
        float min3 = Math.min(0.8f, max * 0.8f);
        setonhierarchychangelistener2.write.Keep = BitmapDescriptorFactory.HUE_RED;
        setonhierarchychangelistener2.write.MediaSessionCompat$QueueItem = min3;
        setonhierarchychangelistener2.invalidateSelf();
        setOnHierarchyChangeListener setonhierarchychangelistener3 = this.MediaMetadataCompat;
        float min4 = Math.min(1.0f, max);
        setOnHierarchyChangeListener.IconCompatParcelizer iconCompatParcelizer2 = setonhierarchychangelistener3.write;
        if (min4 != iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver) {
            iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = min4;
        }
        setonhierarchychangelistener3.invalidateSelf();
        setOnHierarchyChangeListener setonhierarchychangelistener4 = this.MediaMetadataCompat;
        setonhierarchychangelistener4.write.MediaSessionCompat$ResultReceiverWrapper = (((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f;
        setonhierarchychangelistener4.invalidateSelf();
        int i4 = (i2 + i3) - this.MediaBrowserCompat$ItemReceiver;
        this.IconCompatParcelizer.bringToFront();
        SwitchCompat.MediaBrowserCompat$ItemReceiver((View) this.IconCompatParcelizer, i4);
        this.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.getTop();
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(float f) {
        if (f > this.setGroupDividerEnabled) {
            IconCompatParcelizer(true, true);
            return;
        }
        this.MediaBrowserCompat$MediaItem = false;
        setOnHierarchyChangeListener setonhierarchychangelistener = this.MediaMetadataCompat;
        setonhierarchychangelistener.write.Keep = BitmapDescriptorFactory.HUE_RED;
        setonhierarchychangelistener.write.MediaSessionCompat$QueueItem = BitmapDescriptorFactory.HUE_RED;
        setonhierarchychangelistener.invalidateSelf();
        C00731 r0 = null;
        if (!this.MediaDescriptionCompat) {
            r0 = new Animation.AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!SwipeRefreshLayout.this.MediaDescriptionCompat) {
                        SwipeRefreshLayout.this.write((Animation.AnimationListener) null);
                    }
                }
            };
        }
        int i = this.MediaBrowserCompat$ItemReceiver;
        if (this.MediaDescriptionCompat) {
            this.read = i;
            this.MediaSessionCompat$ResultReceiverWrapper = this.IconCompatParcelizer.getScaleX();
            C00776 r1 = new Animation() {
                public final void applyTransformation(float f, Transformation transformation) {
                    float f2 = SwipeRefreshLayout.this.MediaSessionCompat$ResultReceiverWrapper;
                    SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                    float f3 = f2 + ((-SwipeRefreshLayout.this.MediaSessionCompat$ResultReceiverWrapper) * f);
                    swipeRefreshLayout.IconCompatParcelizer.setScaleX(f3);
                    swipeRefreshLayout.IconCompatParcelizer.setScaleY(f3);
                    SwipeRefreshLayout.this.IconCompatParcelizer(f);
                }
            };
            this.setTitle = r1;
            r1.setDuration(150);
            if (r0 != null) {
                this.IconCompatParcelizer.setAnimationListener(r0);
            }
            this.IconCompatParcelizer.clearAnimation();
            this.IconCompatParcelizer.startAnimation(this.setTitle);
        } else {
            this.read = i;
            this.setHasDecor.reset();
            this.setHasDecor.setDuration(200);
            this.setHasDecor.setInterpolator(this.setContentView);
            if (r0 != null) {
                this.IconCompatParcelizer.setAnimationListener(r0);
            }
            this.IconCompatParcelizer.clearAnimation();
            this.IconCompatParcelizer.startAnimation(this.setHasDecor);
        }
        setOnHierarchyChangeListener setonhierarchychangelistener2 = this.MediaMetadataCompat;
        setOnHierarchyChangeListener.IconCompatParcelizer iconCompatParcelizer = setonhierarchychangelistener2.write;
        if (iconCompatParcelizer.f2635x50fd9e4a) {
            iconCompatParcelizer.f2635x50fd9e4a = false;
        }
        setonhierarchychangelistener2.invalidateSelf();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || MediaBrowserCompat$CustomActionResultReceiver() || this.MediaBrowserCompat$MediaItem || this.setExpandedFormat) {
            return false;
        }
        if (actionMasked == 0) {
            this.MediaSessionCompat$Token = motionEvent.getPointerId(0);
            this.ActionMenuItemView = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.MediaSessionCompat$Token);
            if (findPointerIndex < 0) {
                Log.e(f34x50fd9e4a, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.ActionMenuItemView) {
                float y = motionEvent.getY(findPointerIndex);
                float f = this.setCheckable;
                this.ActionMenuItemView = false;
                MediaBrowserCompat$CustomActionResultReceiver((y - f) * 0.5f);
            }
            this.MediaSessionCompat$Token = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.MediaSessionCompat$Token);
            if (findPointerIndex2 < 0) {
                Log.e(f34x50fd9e4a, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            read(y2);
            if (this.ActionMenuItemView) {
                float f2 = (y2 - this.setCheckable) * 0.5f;
                if (f2 <= BitmapDescriptorFactory.HUE_RED) {
                    return false;
                }
                write(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f34x50fd9e4a, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.MediaSessionCompat$Token = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                IconCompatParcelizer(motionEvent);
            }
        }
        return true;
    }

    private void read(float f) {
        float f2 = this.setBackgroundResource;
        float f3 = (float) this.setVisibility;
        if (f - f2 > f3 && !this.ActionMenuItemView) {
            this.setCheckable = f2 + f3;
            this.ActionMenuItemView = true;
            this.MediaMetadataCompat.setAlpha(76);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i, Animation.AnimationListener animationListener) {
        this.read = i;
        this.AlertController$RecycleListView.reset();
        this.AlertController$RecycleListView.setDuration(200);
        this.AlertController$RecycleListView.setInterpolator(this.setContentView);
        if (animationListener != null) {
            this.IconCompatParcelizer.setAnimationListener(animationListener);
        }
        this.IconCompatParcelizer.clearAnimation();
        this.IconCompatParcelizer.startAnimation(this.AlertController$RecycleListView);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(float f) {
        int i = this.read;
        int i2 = i + ((int) (((float) (this.RatingCompat - i)) * f));
        this.IconCompatParcelizer.bringToFront();
        SwitchCompat.MediaBrowserCompat$ItemReceiver((View) this.IconCompatParcelizer, i2 - this.IconCompatParcelizer.getTop());
        this.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.getTop();
    }

    private void IconCompatParcelizer(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.MediaSessionCompat$Token) {
            this.MediaSessionCompat$Token = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}

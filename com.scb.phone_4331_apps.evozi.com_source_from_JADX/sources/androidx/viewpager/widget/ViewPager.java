package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.SwitchCompat;
import p040o.onActivityCreated;
import p040o.setIconifiedByDefault;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTextOff;
import p040o.setTitleMarginBottom;

public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator<ViewPager$MediaBrowserCompat$CustomActionResultReceiver> COMPARATOR = new Comparator<ViewPager$MediaBrowserCompat$CustomActionResultReceiver>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((ViewPager$MediaBrowserCompat$CustomActionResultReceiver) obj).IconCompatParcelizer - ((ViewPager$MediaBrowserCompat$CustomActionResultReceiver) obj2).IconCompatParcelizer;
        }
    };
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private static final Interpolator sInterpolator = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final C0086xa6f109a4 sPositionComparator = new C0086xa6f109a4();
    private int mActivePointerId = -1;
    onActivityCreated mAdapter;
    private List<IconCompatParcelizer> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable = new Runnable() {
        public final void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    };
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout = true;
    private float mFirstOffset = -3.4028235E38f;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private MediaMetadataCompat mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<ViewPager$MediaBrowserCompat$CustomActionResultReceiver> mItems = new ArrayList<>();
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset = Float.MAX_VALUE;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets = false;
    private MediaDescriptionCompat mObserver;
    private int mOffscreenPageLimit = 1;
    private MediaMetadataCompat mOnPageChangeListener;
    private List<MediaMetadataCompat> mOnPageChangeListeners;
    private int mPageMargin;
    private ViewPager$MediaBrowserCompat$SearchResultReceiver mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    private int mRestoredCurItem = -1;
    private EdgeEffect mRightEdge;
    private int mScrollState = 0;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final ViewPager$MediaBrowserCompat$CustomActionResultReceiver mTempItem = new ViewPager$MediaBrowserCompat$CustomActionResultReceiver();
    private final Rect mTempRect = new Rect();
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    public interface IconCompatParcelizer {
        void read(ViewPager viewPager, onActivityCreated onactivitycreated, onActivityCreated onactivitycreated2);
    }

    public interface MediaMetadataCompat {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface read {
    }

    public ViewPager(Context context) {
        super(context);
        initViewPager();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }

    /* access modifiers changed from: package-private */
    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        SwitchCompat.read((View) this, (setIconifiedByDefault) new ViewPager$MediaBrowserCompat$ItemReceiver(this));
        if (SwitchCompat.MediaBrowserCompat$MediaItem(this) == 0) {
            SwitchCompat.write((View) this, 1);
        }
        SwitchCompat.write((View) this, (CheckCaptureModule_GetIJsonExactionHelperRttiFactory) new CheckCaptureModule_GetIJsonExactionHelperRttiFactory() {
            private final Rect MediaBrowserCompat$CustomActionResultReceiver = new Rect();

            public final setTextOff write(View view, setTextOff settextoff) {
                setTextOff write = SwitchCompat.write(view, settextoff);
                if (write.RatingCompat()) {
                    return write;
                }
                Rect rect = this.MediaBrowserCompat$CustomActionResultReceiver;
                rect.left = write.MediaBrowserCompat$CustomActionResultReceiver();
                rect.top = write.read();
                rect.right = write.write();
                rect.bottom = write.IconCompatParcelizer();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    setTextOff IconCompatParcelizer2 = SwitchCompat.IconCompatParcelizer(ViewPager.this.getChildAt(i), write);
                    rect.left = Math.min(IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver(), rect.left);
                    rect.top = Math.min(IconCompatParcelizer2.read(), rect.top);
                    rect.right = Math.min(IconCompatParcelizer2.write(), rect.right);
                    rect.bottom = Math.min(IconCompatParcelizer2.IconCompatParcelizer(), rect.bottom);
                }
                return write.MediaBrowserCompat$ItemReceiver(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                enableLayers(i != 0);
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setAdapter(onActivityCreated onactivitycreated) {
        onActivityCreated onactivitycreated2 = this.mAdapter;
        if (onactivitycreated2 != null) {
            onactivitycreated2.setViewPagerObserver((DataSetObserver) null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer, viewPager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        onActivityCreated onactivitycreated3 = this.mAdapter;
        this.mAdapter = onactivitycreated;
        this.mExpectedAdapterCount = 0;
        if (onactivitycreated != null) {
            if (this.mObserver == null) {
                this.mObserver = new MediaDescriptionCompat();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<IconCompatParcelizer> list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAdapterChangeListeners.get(i2).read(this, onactivitycreated3, onactivitycreated);
            }
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((write) getChildAt(i).getLayoutParams()).MediaBrowserCompat$CustomActionResultReceiver) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public onActivityCreated getAdapter() {
        return this.mAdapter;
    }

    public void addOnAdapterChangeListener(IconCompatParcelizer iconCompatParcelizer) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(iconCompatParcelizer);
    }

    public void removeOnAdapterChangeListener(IconCompatParcelizer iconCompatParcelizer) {
        List<IconCompatParcelizer> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(iconCompatParcelizer);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    /* access modifiers changed from: package-private */
    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        onActivityCreated onactivitycreated = this.mAdapter;
        boolean z3 = false;
        if (onactivitycreated == null || onactivitycreated.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    this.mItems.get(i5).write = true;
                }
            }
            if (this.mCurItem != i) {
                z3 = true;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z3) {
                    dispatchOnPageSelected(i);
                }
                requestLayout();
                return;
            }
            populate(i);
            scrollToItem(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForPosition = infoForPosition(i);
        int clientWidth = infoForPosition != null ? (int) (((float) getClientWidth()) * Math.max(this.mFirstOffset, Math.min(infoForPosition.read, this.mLastOffset))) : 0;
        if (z) {
            smoothScrollTo(clientWidth, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(MediaMetadataCompat mediaMetadataCompat) {
        this.mOnPageChangeListener = mediaMetadataCompat;
    }

    public void addOnPageChangeListener(MediaMetadataCompat mediaMetadataCompat) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(mediaMetadataCompat);
    }

    public void removeOnPageChangeListener(MediaMetadataCompat mediaMetadataCompat) {
        List<MediaMetadataCompat> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(mediaMetadataCompat);
        }
    }

    public void clearOnPageChangeListeners() {
        List<MediaMetadataCompat> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void setPageTransformer(boolean z, ViewPager$MediaBrowserCompat$SearchResultReceiver viewPager$MediaBrowserCompat$SearchResultReceiver) {
        setPageTransformer(z, viewPager$MediaBrowserCompat$SearchResultReceiver, 2);
    }

    public void setPageTransformer(boolean z, ViewPager$MediaBrowserCompat$SearchResultReceiver viewPager$MediaBrowserCompat$SearchResultReceiver, int i) {
        int i2 = 1;
        boolean z2 = viewPager$MediaBrowserCompat$SearchResultReceiver != null;
        boolean z3 = z2 != (this.mPageTransformer != null);
        this.mPageTransformer = viewPager$MediaBrowserCompat$SearchResultReceiver;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.mDrawingOrder = i2;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z3) {
            populate();
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((write) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).read;
    }

    /* access modifiers changed from: package-private */
    public MediaMetadataCompat setInternalPageChangeListener(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadataCompat mediaMetadataCompat2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = mediaMetadataCompat;
        return mediaMetadataCompat2;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w(TAG, sb.toString());
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(setLastBaselineToBottomHeight.write(getContext(), i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollTo(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = i2 - scrollY;
        if (i7 == 0 && i8 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float distanceInfluenceForSnapDuration = distanceInfluenceForSnapDuration(Math.min(1.0f, ((float) Math.abs(i7)) / f));
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs((f2 + (distanceInfluenceForSnapDuration * f2)) / ((float) abs)) * 1000.0f) << 2;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.mAdapter.getPageWidth(this.mCurItem)) + ((float) this.mPageMargin))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, MAX_SETTLE_DURATION);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i6, scrollY, i7, i8, min);
        SwitchCompat.setItemInvoker(this);
    }

    /* access modifiers changed from: package-private */
    public ViewPager$MediaBrowserCompat$CustomActionResultReceiver addNewItem(int i, int i2) {
        ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver = new ViewPager$MediaBrowserCompat$CustomActionResultReceiver();
        viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = i;
        viewPager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = this.mAdapter.instantiateItem((ViewGroup) this, i);
        viewPager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(viewPager$MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            this.mItems.add(i2, viewPager$MediaBrowserCompat$CustomActionResultReceiver);
        }
        return viewPager$MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: package-private */
    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit << 1) + 1 && this.mItems.size() < count;
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(viewPager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer, viewPager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
                    if (this.mCurItem == viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) {
                        i = Math.max(0, Math.min(this.mCurItem, count - 1));
                    }
                } else if (viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer != itemPosition) {
                    if (viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer == this.mCurItem) {
                        i = itemPosition;
                    }
                    viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                write write2 = (write) getChildAt(i3).getLayoutParams();
                if (!write2.MediaBrowserCompat$CustomActionResultReceiver) {
                    write2.MediaBrowserCompat$SearchResultReceiver = BitmapDescriptorFactory.HUE_RED;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void populate() {
        populate(this.mCurItem);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r8.IconCompatParcelizer == r0.mCurItem) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r8 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void populate(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.mCurItem
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r2 = r0.infoForPosition(r2)
            r0.mCurItem = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            o.onActivityCreated r1 = r0.mAdapter
            if (r1 != 0) goto L_0x0018
            r17.sortChildDrawingOrder()
            return
        L_0x0018:
            boolean r1 = r0.mPopulatePending
            if (r1 == 0) goto L_0x0020
            r17.sortChildDrawingOrder()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            o.onActivityCreated r1 = r0.mAdapter
            r1.startUpdate((android.view.ViewGroup) r0)
            int r1 = r0.mOffscreenPageLimit
            int r4 = r0.mCurItem
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            o.onActivityCreated r6 = r0.mAdapter
            int r6 = r6.getCount()
            int r7 = r6 + -1
            int r8 = r0.mCurItem
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.mExpectedAdapterCount
            if (r6 != r7) goto L_0x020f
            r7 = r5
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r8 = r0.mItems
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x006a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r8 = r0.mItems
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r8 = (androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver) r8
            int r9 = r8.IconCompatParcelizer
            int r10 = r0.mCurItem
            if (r9 < r10) goto L_0x0067
            int r9 = r8.IconCompatParcelizer
            int r10 = r0.mCurItem
            if (r9 != r10) goto L_0x006a
            goto L_0x006b
        L_0x0067:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x006a:
            r8 = 0
        L_0x006b:
            if (r8 != 0) goto L_0x0075
            if (r6 <= 0) goto L_0x0075
            int r8 = r0.mCurItem
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r8 = r0.addNewItem(r8, r7)
        L_0x0075:
            r9 = 0
            if (r8 == 0) goto L_0x019d
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0085
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r11 = r0.mItems
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r11 = (androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver) r11
            goto L_0x0086
        L_0x0085:
            r11 = 0
        L_0x0086:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x0090
            r14 = r9
            goto L_0x009c
        L_0x0090:
            float r14 = r8.MediaBrowserCompat$CustomActionResultReceiver
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x009c:
            int r3 = r0.mCurItem
            int r3 = r3 + -1
            r15 = r9
        L_0x00a1:
            if (r3 < 0) goto L_0x0100
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00ce
            if (r3 >= r4) goto L_0x00ce
            if (r11 == 0) goto L_0x0100
            int r5 = r11.IconCompatParcelizer
            if (r3 != r5) goto L_0x00fc
            boolean r5 = r11.write
            if (r5 != 0) goto L_0x00fc
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r5 = r0.mItems
            r5.remove(r10)
            o.onActivityCreated r5 = r0.mAdapter
            java.lang.Object r11 = r11.MediaBrowserCompat$ItemReceiver
            r5.destroyItem((android.view.ViewGroup) r0, (int) r3, (java.lang.Object) r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00fa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r5 = (androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver) r5
            goto L_0x00fb
        L_0x00ce:
            if (r11 == 0) goto L_0x00e4
            int r5 = r11.IconCompatParcelizer
            if (r3 != r5) goto L_0x00e4
            float r5 = r11.MediaBrowserCompat$CustomActionResultReceiver
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00fa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r5 = (androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver) r5
            goto L_0x00fb
        L_0x00e4:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r5 = r0.addNewItem(r3, r5)
            float r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00fa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r5 = (androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver) r5
            goto L_0x00fb
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            r11 = r5
        L_0x00fc:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x00a1
        L_0x0100:
            float r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0191
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0119
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r5 = (androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver) r5
            goto L_0x011a
        L_0x0119:
            r5 = 0
        L_0x011a:
            if (r12 > 0) goto L_0x011e
            r10 = r9
            goto L_0x0126
        L_0x011e:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0126:
            int r11 = r0.mCurItem
        L_0x0128:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0191
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0159
            if (r11 <= r1) goto L_0x0159
            if (r5 == 0) goto L_0x0191
            int r12 = r5.IconCompatParcelizer
            if (r11 != r12) goto L_0x0128
            boolean r12 = r5.write
            if (r12 != 0) goto L_0x0128
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r12 = r0.mItems
            r12.remove(r4)
            o.onActivityCreated r12 = r0.mAdapter
            java.lang.Object r5 = r5.MediaBrowserCompat$ItemReceiver
            r12.destroyItem((android.view.ViewGroup) r0, (int) r11, (java.lang.Object) r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x018f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r5 = (androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver) r5
            goto L_0x0128
        L_0x0159:
            if (r5 == 0) goto L_0x0175
            int r12 = r5.IconCompatParcelizer
            if (r11 != r12) goto L_0x0175
            float r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x018f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r5 = (androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver) r5
            goto L_0x0128
        L_0x0175:
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r5 = r0.addNewItem(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x018f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r5 = (androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver) r5
            goto L_0x0128
        L_0x018f:
            r5 = 0
            goto L_0x0128
        L_0x0191:
            r0.calculatePageOffsets(r8, r7, r2)
            o.onActivityCreated r1 = r0.mAdapter
            int r2 = r0.mCurItem
            java.lang.Object r3 = r8.MediaBrowserCompat$ItemReceiver
            r1.setPrimaryItem((android.view.ViewGroup) r0, (int) r2, (java.lang.Object) r3)
        L_0x019d:
            o.onActivityCreated r1 = r0.mAdapter
            r1.finishUpdate((android.view.ViewGroup) r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a7:
            if (r2 >= r1) goto L_0x01d0
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$write r4 = (androidx.viewpager.widget.ViewPager.write) r4
            r4.read = r2
            boolean r5 = r4.MediaBrowserCompat$CustomActionResultReceiver
            if (r5 != 0) goto L_0x01cd
            float r5 = r4.MediaBrowserCompat$SearchResultReceiver
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01cd
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r3 = r0.infoForChild(r3)
            if (r3 == 0) goto L_0x01cd
            float r5 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r4.MediaBrowserCompat$SearchResultReceiver = r5
            int r3 = r3.IconCompatParcelizer
            r4.IconCompatParcelizer = r3
        L_0x01cd:
            int r2 = r2 + 1
            goto L_0x01a7
        L_0x01d0:
            r17.sortChildDrawingOrder()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x020e
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e4
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r3 = r0.infoForAnyChild(r1)
            goto L_0x01e5
        L_0x01e4:
            r3 = 0
        L_0x01e5:
            if (r3 == 0) goto L_0x01ed
            int r1 = r3.IconCompatParcelizer
            int r2 = r0.mCurItem
            if (r1 == r2) goto L_0x020e
        L_0x01ed:
            r5 = 0
        L_0x01ee:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x020e
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r2 = r0.infoForChild(r1)
            if (r2 == 0) goto L_0x020b
            int r2 = r2.IconCompatParcelizer
            int r3 = r0.mCurItem
            if (r2 != r3) goto L_0x020b
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 != 0) goto L_0x020e
        L_0x020b:
            int r5 = r5 + 1
            goto L_0x01ee
        L_0x020e:
            return
        L_0x020f:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x021c }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x021c }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x021c }
            goto L_0x0224
        L_0x021c:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0224:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r2.append(r3)
            int r3 = r0.mExpectedAdapterCount
            r2.append(r3)
            java.lang.String r3 = ", found: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = " Pager id: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " Pager class: "
            r2.append(r1)
            java.lang.Class r1 = r17.getClass()
            r2.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r2.append(r1)
            o.onActivityCreated r1 = r0.mAdapter
            java.lang.Class r1 = r1.getClass()
            r2.append(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    private void calculatePageOffsets(ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver, int i, ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver2) {
        ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver3;
        ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : BitmapDescriptorFactory.HUE_RED;
        if (viewPager$MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            int i2 = viewPager$MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer;
            if (i2 < viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) {
                float f2 = viewPager$MediaBrowserCompat$CustomActionResultReceiver2.read + viewPager$MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer && i4 < this.mItems.size()) {
                    Object obj = this.mItems.get(i4);
                    while (true) {
                        viewPager$MediaBrowserCompat$CustomActionResultReceiver4 = (ViewPager$MediaBrowserCompat$CustomActionResultReceiver) obj;
                        if (i3 > viewPager$MediaBrowserCompat$CustomActionResultReceiver4.IconCompatParcelizer && i4 < this.mItems.size() - 1) {
                            i4++;
                            obj = this.mItems.get(i4);
                        }
                    }
                    while (i3 < viewPager$MediaBrowserCompat$CustomActionResultReceiver4.IconCompatParcelizer) {
                        f2 += this.mAdapter.getPageWidth(i3) + f;
                        i3++;
                    }
                    viewPager$MediaBrowserCompat$CustomActionResultReceiver4.read = f2;
                    f2 += viewPager$MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$CustomActionResultReceiver + f;
                    i3++;
                }
            } else if (i2 > viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) {
                int size = this.mItems.size() - 1;
                float f3 = viewPager$MediaBrowserCompat$CustomActionResultReceiver2.read;
                while (true) {
                    i2--;
                    if (i2 < viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer || size < 0) {
                        break;
                    }
                    Object obj2 = this.mItems.get(size);
                    while (true) {
                        viewPager$MediaBrowserCompat$CustomActionResultReceiver3 = (ViewPager$MediaBrowserCompat$CustomActionResultReceiver) obj2;
                        if (i2 < viewPager$MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer && size > 0) {
                            size--;
                            obj2 = this.mItems.get(size);
                        }
                    }
                    while (i2 > viewPager$MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer) {
                        f3 -= this.mAdapter.getPageWidth(i2) + f;
                        i2--;
                    }
                    f3 -= viewPager$MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver + f;
                    viewPager$MediaBrowserCompat$CustomActionResultReceiver3.read = f3;
                }
            }
        }
        int size2 = this.mItems.size();
        float f4 = viewPager$MediaBrowserCompat$CustomActionResultReceiver.read;
        int i5 = viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer - 1;
        this.mFirstOffset = viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer == 0 ? viewPager$MediaBrowserCompat$CustomActionResultReceiver.read : -3.4028235E38f;
        int i6 = count - 1;
        this.mLastOffset = viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer == i6 ? (viewPager$MediaBrowserCompat$CustomActionResultReceiver.read + viewPager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver5 = this.mItems.get(i7);
            while (i5 > viewPager$MediaBrowserCompat$CustomActionResultReceiver5.IconCompatParcelizer) {
                f4 -= this.mAdapter.getPageWidth(i5) + f;
                i5--;
            }
            f4 -= viewPager$MediaBrowserCompat$CustomActionResultReceiver5.MediaBrowserCompat$CustomActionResultReceiver + f;
            viewPager$MediaBrowserCompat$CustomActionResultReceiver5.read = f4;
            if (viewPager$MediaBrowserCompat$CustomActionResultReceiver5.IconCompatParcelizer == 0) {
                this.mFirstOffset = f4;
            }
            i7--;
            i5--;
        }
        float f5 = viewPager$MediaBrowserCompat$CustomActionResultReceiver.read + viewPager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver + f;
        int i8 = viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver6 = this.mItems.get(i9);
            while (i8 < viewPager$MediaBrowserCompat$CustomActionResultReceiver6.IconCompatParcelizer) {
                f5 += this.mAdapter.getPageWidth(i8) + f;
                i8++;
            }
            if (viewPager$MediaBrowserCompat$CustomActionResultReceiver6.IconCompatParcelizer == i6) {
                this.mLastOffset = (viewPager$MediaBrowserCompat$CustomActionResultReceiver6.MediaBrowserCompat$CustomActionResultReceiver + f5) - 1.0f;
            }
            viewPager$MediaBrowserCompat$CustomActionResultReceiver6.read = f5;
            f5 += viewPager$MediaBrowserCompat$CustomActionResultReceiver6.MediaBrowserCompat$CustomActionResultReceiver + f;
            i9++;
            i8++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    public static class RatingCompat extends setTitleMarginBottom {
        public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.ClassLoaderCreator<RatingCompat>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new RatingCompat(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new RatingCompat(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new RatingCompat[i];
            }
        };
        int IconCompatParcelizer;
        ClassLoader MediaBrowserCompat$ItemReceiver;
        Parcelable read;

        public RatingCompat(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeParcelable(this.read, i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.IconCompatParcelizer);
            sb.append("}");
            return sb.toString();
        }

        RatingCompat(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.IconCompatParcelizer = parcel.readInt();
            this.read = parcel.readParcelable(classLoader);
            this.MediaBrowserCompat$ItemReceiver = classLoader;
        }
    }

    public Parcelable onSaveInstanceState() {
        RatingCompat ratingCompat = new RatingCompat(super.onSaveInstanceState());
        ratingCompat.IconCompatParcelizer = this.mCurItem;
        onActivityCreated onactivitycreated = this.mAdapter;
        if (onactivitycreated != null) {
            ratingCompat.read = onactivitycreated.saveState();
        }
        return ratingCompat;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof RatingCompat)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        RatingCompat ratingCompat = (RatingCompat) parcelable;
        super.onRestoreInstanceState(ratingCompat.write);
        onActivityCreated onactivitycreated = this.mAdapter;
        if (onactivitycreated != null) {
            onactivitycreated.restoreState(ratingCompat.read, ratingCompat.MediaBrowserCompat$ItemReceiver);
            setCurrentItemInternal(ratingCompat.IconCompatParcelizer, false, true);
            return;
        }
        this.mRestoredCurItem = ratingCompat.IconCompatParcelizer;
        this.mRestoredAdapterState = ratingCompat.read;
        this.mRestoredClassLoader = ratingCompat.MediaBrowserCompat$ItemReceiver;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        write write2 = (write) layoutParams;
        write2.MediaBrowserCompat$CustomActionResultReceiver |= isDecorView(view);
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (write2 == null || !write2.MediaBrowserCompat$CustomActionResultReceiver) {
            write2.MediaBrowserCompat$ItemReceiver = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    private static boolean isDecorView(View view) {
        return view.getClass().getAnnotation(read.class) != null;
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    public ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, viewPager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver)) {
                return viewPager$MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    public ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver = this.mItems.get(i2);
            if (viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer == i) {
                return viewPager$MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    public void onMeasure(int i, int i2) {
        write write2;
        write write3;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z2 = true;
            int i8 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (!(childAt.getVisibility() == 8 || (write3 = (write) childAt.getLayoutParams()) == null || !write3.MediaBrowserCompat$CustomActionResultReceiver)) {
                int i9 = write3.write & 7;
                int i10 = write3.write & 112;
                boolean z3 = (i10 == 48 || i10 == 80) ? true : z;
                if (!(i9 == 3 || i9 == 5)) {
                    z2 = z;
                }
                int i11 = PKIFailureInfo.systemUnavail;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i11 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (write3.width != -2) {
                    i5 = write3.width != -1 ? write3.width : paddingLeft;
                    i4 = 1073741824;
                } else {
                    i4 = i11;
                    i5 = paddingLeft;
                }
                if (write3.height != -2) {
                    i6 = write3.height != -1 ? write3.height : measuredHeight;
                } else {
                    i6 = measuredHeight;
                    i8 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, i4), View.MeasureSpec.makeMeasureSpec(i6, i8));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
            z = false;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((write2 = (write) childAt2.getLayoutParams()) == null || !write2.MediaBrowserCompat$CustomActionResultReceiver)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * write2.MediaBrowserCompat$SearchResultReceiver), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.mItems.isEmpty()) {
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForPosition = infoForPosition(this.mCurItem);
            int min = (int) ((infoForPosition != null ? Math.min(infoForPosition.read, this.mLastOffset) : BitmapDescriptorFactory.HUE_RED) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                completeScroll(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - paddingLeft) - paddingRight) + i3))), getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b8
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b4
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$write r12 = (androidx.viewpager.widget.ViewPager.write) r12
            boolean r14 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r14 == 0) goto L_0x00b4
            int r14 = r12.write
            r14 = r14 & 7
            int r12 = r12.write
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005e
            r15 = 3
            if (r14 == r15) goto L_0x0058
            r15 = 5
            if (r14 == r15) goto L_0x004b
            r14 = r4
            goto L_0x006f
        L_0x004b:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x006a
        L_0x0058:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006f
        L_0x005e:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x006a:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006f:
            r15 = 16
            if (r12 == r15) goto L_0x0090
            r15 = 48
            if (r12 == r15) goto L_0x008a
            r15 = 80
            if (r12 == r15) goto L_0x007d
            r12 = r5
            goto L_0x00a1
        L_0x007d:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009c
        L_0x008a:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x00a1
        L_0x0090:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009c:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x00a1:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r16 = r13.getMeasuredHeight()
            int r15 = r15 + r4
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b4:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b8:
            r8 = 0
        L_0x00b9:
            if (r8 >= r1) goto L_0x0109
            android.view.View r9 = r0.getChildAt(r8)
            int r10 = r9.getVisibility()
            if (r10 == r12) goto L_0x0106
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.viewpager.widget.ViewPager$write r10 = (androidx.viewpager.widget.ViewPager.write) r10
            boolean r13 = r10.MediaBrowserCompat$CustomActionResultReceiver
            if (r13 != 0) goto L_0x0106
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$CustomActionResultReceiver r13 = r0.infoForChild(r9)
            if (r13 == 0) goto L_0x0106
            int r14 = r2 - r4
            int r14 = r14 - r6
            float r14 = (float) r14
            float r13 = r13.read
            float r13 = r13 * r14
            int r13 = (int) r13
            int r13 = r13 + r4
            boolean r15 = r10.MediaBrowserCompat$ItemReceiver
            if (r15 == 0) goto L_0x00f9
            r15 = 0
            r10.MediaBrowserCompat$ItemReceiver = r15
            float r10 = r10.MediaBrowserCompat$SearchResultReceiver
            float r14 = r14 * r10
            int r10 = (int) r14
            r14 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r14)
            int r15 = r3 - r5
            int r15 = r15 - r7
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r9.measure(r10, r14)
        L_0x00f9:
            int r10 = r9.getMeasuredWidth()
            int r14 = r9.getMeasuredHeight()
            int r10 = r10 + r13
            int r14 = r14 + r5
            r9.layout(r13, r5, r10, r14)
        L_0x0106:
            int r8 = r8 + 1
            goto L_0x00b9
        L_0x0109:
            r0.mTopPageBounds = r5
            int r3 = r3 - r7
            r0.mBottomPageBounds = r3
            r0.mDecorChildCount = r11
            boolean r1 = r0.mFirstLayout
            if (r1 == 0) goto L_0x011b
            int r1 = r0.mCurItem
            r2 = 0
            r0.scrollToItem(r1, r2, r2, r2)
            goto L_0x011c
        L_0x011b:
            r2 = 0
        L_0x011c:
            r0.mFirstLayout = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        SwitchCompat.setItemInvoker(this);
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() != 0) {
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i2 = this.mPageMargin;
            float f = (float) clientWidth;
            int i3 = infoForCurrentScrollPosition.IconCompatParcelizer;
            float f2 = ((((float) i) / f) - infoForCurrentScrollPosition.read) / (infoForCurrentScrollPosition.MediaBrowserCompat$CustomActionResultReceiver + (((float) i2) / f));
            this.mCalledSuper = false;
            onPageScrolled(i3, f2, (int) (((float) (clientWidth + i2)) * f2));
            if (this.mCalledSuper) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.mFirstLayout) {
            return false;
        } else {
            this.mCalledSuper = false;
            onPageScrolled(0, BitmapDescriptorFactory.HUE_RED, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006a
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L_0x001b:
            if (r7 >= r6) goto L_0x006a
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$write r9 = (androidx.viewpager.widget.ViewPager.write) r9
            boolean r10 = r9.MediaBrowserCompat$CustomActionResultReceiver
            if (r10 == 0) goto L_0x0067
            int r9 = r9.write
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004c
            r10 = 3
            if (r9 == r10) goto L_0x0046
            r10 = 5
            if (r9 == r10) goto L_0x0039
            r9 = r3
            goto L_0x005b
        L_0x0039:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0058
        L_0x0046:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005b
        L_0x004c:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0058:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005b:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0066
            r8.offsetLeftAndRight(r3)
        L_0x0066:
            r3 = r9
        L_0x0067:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006a:
            r12.dispatchOnPageScrolled(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$SearchResultReceiver r13 = r12.mPageTransformer
            if (r13 == 0) goto L_0x009d
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x0079:
            if (r1 >= r14) goto L_0x009d
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$write r0 = (androidx.viewpager.widget.ViewPager.write) r0
            boolean r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 != 0) goto L_0x009a
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$MediaBrowserCompat$SearchResultReceiver r3 = r12.mPageTransformer
            r3.transformPage(r15, r0)
        L_0x009a:
            int r1 = r1 + 1
            goto L_0x0079
        L_0x009d:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        MediaMetadataCompat mediaMetadataCompat = this.mOnPageChangeListener;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.onPageScrolled(i, f, i2);
        }
        List<MediaMetadataCompat> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                MediaMetadataCompat mediaMetadataCompat2 = this.mOnPageChangeListeners.get(i3);
                if (mediaMetadataCompat2 != null) {
                    mediaMetadataCompat2.onPageScrolled(i, f, i2);
                }
            }
        }
        MediaMetadataCompat mediaMetadataCompat3 = this.mInternalPageChangeListener;
        if (mediaMetadataCompat3 != null) {
            mediaMetadataCompat3.onPageScrolled(i, f, i2);
        }
    }

    private void dispatchOnPageSelected(int i) {
        MediaMetadataCompat mediaMetadataCompat = this.mOnPageChangeListener;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.onPageSelected(i);
        }
        List<MediaMetadataCompat> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                MediaMetadataCompat mediaMetadataCompat2 = this.mOnPageChangeListeners.get(i2);
                if (mediaMetadataCompat2 != null) {
                    mediaMetadataCompat2.onPageSelected(i);
                }
            }
        }
        MediaMetadataCompat mediaMetadataCompat3 = this.mInternalPageChangeListener;
        if (mediaMetadataCompat3 != null) {
            mediaMetadataCompat3.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        MediaMetadataCompat mediaMetadataCompat = this.mOnPageChangeListener;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.onPageScrollStateChanged(i);
        }
        List<MediaMetadataCompat> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                MediaMetadataCompat mediaMetadataCompat2 = this.mOnPageChangeListeners.get(i2);
                if (mediaMetadataCompat2 != null) {
                    mediaMetadataCompat2.onPageScrollStateChanged(i);
                }
            }
        }
        MediaMetadataCompat mediaMetadataCompat3 = this.mInternalPageChangeListener;
        if (mediaMetadataCompat3 != null) {
            mediaMetadataCompat3.onPageScrollStateChanged(i);
        }
    }

    private void completeScroll(boolean z) {
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver = this.mItems.get(i);
            if (viewPager$MediaBrowserCompat$CustomActionResultReceiver.write) {
                viewPager$MediaBrowserCompat$CustomActionResultReceiver.write = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            SwitchCompat.MediaBrowserCompat$ItemReceiver((View) this, this.mEndScrollRunnable);
        } else {
            this.mEndScrollRunnable.run();
        }
    }

    private boolean isGutterDrag(float f, float f2) {
        return (f < ((float) this.mGutterSize) && f2 > BitmapDescriptorFactory.HUE_RED) || (f > ((float) (getWidth() - this.mGutterSize)) && f2 < BitmapDescriptorFactory.HUE_RED);
    }

    private void enableLayers(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.mPageTransformerLayerType : 0, (Paint) null);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent2.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.mLastMotionX;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.mInitialMotionY);
                int i2 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i2 != 0 && !isGutterDrag(this.mLastMotionX, f)) {
                    if (canScroll(this, false, (int) f, (int) x2, (int) y2)) {
                        this.mLastMotionX = x2;
                        this.mLastMotionY = y2;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                }
                if (abs > ((float) this.mTouchSlop) && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    float f2 = this.mInitialMotionX;
                    float f3 = (float) this.mTouchSlop;
                    this.mLastMotionX = i2 > 0 ? f2 + f3 : f2 - f3;
                    this.mLastMotionY = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.mTouchSlop)) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x2)) {
                    SwitchCompat.setItemInvoker(this);
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent2);
        return this.mIsBeingDragged;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        onActivityCreated onactivitycreated;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (onactivitycreated = this.mAdapter) == null || onactivitycreated.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        z = resetTouch();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.mLastMotionX);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.mLastMotionY);
                        if (abs > ((float) this.mTouchSlop) && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            float f = this.mInitialMotionX;
                            this.mLastMotionX = x2 - f > BitmapDescriptorFactory.HUE_RED ? f + ((float) this.mTouchSlop) : f - ((float) this.mTouchSlop);
                            this.mLastMotionY = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.mLastMotionX = motionEvent.getX(actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurItem, true, 0, false);
                z = resetTouch();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            float f2 = (float) clientWidth;
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.IconCompatParcelizer, ((((float) scrollX) / f2) - infoForCurrentScrollPosition.read) / (infoForCurrentScrollPosition.MediaBrowserCompat$CustomActionResultReceiver + (((float) this.mPageMargin) / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            z = resetTouch();
        }
        if (z) {
            SwitchCompat.setItemInvoker(this);
        }
        return true;
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX;
        this.mLastMotionX = f;
        float scrollX = ((float) getScrollX()) + (f2 - f);
        float clientWidth = (float) getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver = this.mItems.get(0);
        ArrayList<ViewPager$MediaBrowserCompat$CustomActionResultReceiver> arrayList = this.mItems;
        ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver2 = arrayList.get(arrayList.size() - 1);
        if (viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer != 0) {
            f3 = viewPager$MediaBrowserCompat$CustomActionResultReceiver.read * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (viewPager$MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer != this.mAdapter.getCount() - 1) {
            f4 = viewPager$MediaBrowserCompat$CustomActionResultReceiver2.read * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    private ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForCurrentScrollPosition() {
        int i;
        int clientWidth = getClientWidth();
        float f = BitmapDescriptorFactory.HUE_RED;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver = null;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        float f3 = 0.0f;
        while (i3 < this.mItems.size()) {
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver2 = this.mItems.get(i3);
            if (!z && viewPager$MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer != (i = i2 + 1)) {
                viewPager$MediaBrowserCompat$CustomActionResultReceiver2 = this.mTempItem;
                viewPager$MediaBrowserCompat$CustomActionResultReceiver2.read = f + f3 + f2;
                viewPager$MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = i;
                viewPager$MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = this.mAdapter.getPageWidth(viewPager$MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer);
                i3--;
            }
            f = viewPager$MediaBrowserCompat$CustomActionResultReceiver2.read;
            float f4 = viewPager$MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver;
            if (!z && scrollX < f) {
                return viewPager$MediaBrowserCompat$CustomActionResultReceiver;
            }
            if (scrollX < f4 + f + f2 || i3 == this.mItems.size() - 1) {
                return viewPager$MediaBrowserCompat$CustomActionResultReceiver2;
            }
            i2 = viewPager$MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer;
            f3 = viewPager$MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver;
            i3++;
            z = false;
            viewPager$MediaBrowserCompat$CustomActionResultReceiver = viewPager$MediaBrowserCompat$CustomActionResultReceiver2;
        }
        return viewPager$MediaBrowserCompat$CustomActionResultReceiver;
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            i += (int) (f + (i >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() <= 0) {
            return i;
        }
        ArrayList<ViewPager$MediaBrowserCompat$CustomActionResultReceiver> arrayList = this.mItems;
        return Math.max(this.mItems.get(0).IconCompatParcelizer, Math.min(i, arrayList.get(arrayList.size() - 1).IconCompatParcelizer));
    }

    public void draw(Canvas canvas) {
        onActivityCreated onactivitycreated;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (onactivitycreated = this.mAdapter) != null && onactivitycreated.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.mFirstOffset * ((float) width));
                this.mLeftEdge.setSize(height, width);
                z = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.mLastOffset + 1.0f)) * ((float) width2));
                this.mRightEdge.setSize((height2 - paddingTop) - paddingBottom, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (z) {
            SwitchCompat.setItemInvoker(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.mPageMargin) / f4;
            int i = 0;
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver = this.mItems.get(0);
            float f6 = viewPager$MediaBrowserCompat$CustomActionResultReceiver.read;
            int size = this.mItems.size();
            int i2 = viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            int i3 = this.mItems.get(size - 1).IconCompatParcelizer;
            while (i2 < i3) {
                while (i2 > viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer && i < size) {
                    i++;
                    viewPager$MediaBrowserCompat$CustomActionResultReceiver = this.mItems.get(i);
                }
                if (i2 == viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) {
                    f2 = (viewPager$MediaBrowserCompat$CustomActionResultReceiver.read + viewPager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) * f4;
                    f = viewPager$MediaBrowserCompat$CustomActionResultReceiver.read + viewPager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver + f5;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i2);
                    float f7 = pageWidth + f5 + f6;
                    f2 = (f6 + pageWidth) * f4;
                    f = f7;
                }
                if (((float) this.mPageMargin) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.mMarginDrawable.setBounds(Math.round(f2), this.mTopPageBounds, Math.round(((float) this.mPageMargin) + f2), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i2++;
                    f6 = f;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = BitmapDescriptorFactory.HUE_RED;
        this.mInitialMotionX = BitmapDescriptorFactory.HUE_RED;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.IconCompatParcelizer, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.read) / infoForCurrentScrollPosition.MediaBrowserCompat$CustomActionResultReceiver, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.mAdapter != null) {
            this.mLastMotionX += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver = this.mItems.get(0);
            ArrayList<ViewPager$MediaBrowserCompat$CustomActionResultReceiver> arrayList = this.mItems;
            ViewPager$MediaBrowserCompat$CustomActionResultReceiver viewPager$MediaBrowserCompat$CustomActionResultReceiver2 = arrayList.get(arrayList.size() - 1);
            if (viewPager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer != 0) {
                f2 = viewPager$MediaBrowserCompat$CustomActionResultReceiver.read * clientWidth;
            }
            if (viewPager$MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer != this.mAdapter.getCount() - 1) {
                f3 = viewPager$MediaBrowserCompat$CustomActionResultReceiver2.read * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, BitmapDescriptorFactory.HUE_RED, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
        }
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.mFirstOffset))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.mLastOffset))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                } else {
                    return arrowScroll(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            } else {
                return arrowScroll(17);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean arrowScroll(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            if (r0 != r6) goto L_0x0009
            goto L_0x0066
        L_0x0009:
            if (r0 == 0) goto L_0x0067
            android.view.ViewParent r3 = r0.getParent()
        L_0x000f:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x001c
            if (r3 != r6) goto L_0x0017
            r3 = r1
            goto L_0x001d
        L_0x0017:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x000f
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r3 != 0) goto L_0x0067
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0033:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x004c
            java.lang.String r4 = " => "
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0033
        L_0x004c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "ViewPager"
            android.util.Log.e(r3, r0)
        L_0x0066:
            r0 = 0
        L_0x0067:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b2
            if (r3 == r0) goto L_0x00b2
            if (r7 != r5) goto L_0x0092
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x008d
            if (r1 >= r2) goto L_0x00c0
        L_0x008d:
            boolean r2 = r3.requestFocus()
            goto L_0x00c4
        L_0x0092:
            if (r7 != r4) goto L_0x00c4
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00ad
            if (r1 > r2) goto L_0x00ad
            boolean r2 = r6.pageRight()
            goto L_0x00c4
        L_0x00ad:
            boolean r2 = r3.requestFocus()
            goto L_0x00c4
        L_0x00b2:
            if (r7 == r5) goto L_0x00c0
            if (r7 == r1) goto L_0x00c0
            if (r7 == r4) goto L_0x00bb
            r0 = 2
            if (r7 != r0) goto L_0x00c4
        L_0x00bb:
            boolean r2 = r6.pageRight()
            goto L_0x00c4
        L_0x00c0:
            boolean r2 = r6.pageLeft()
        L_0x00c4:
            if (r2 == 0) goto L_0x00cd
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* access modifiers changed from: package-private */
    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean pageRight() {
        onActivityCreated onactivitycreated = this.mAdapter;
        if (onactivitycreated == null || this.mCurItem >= onactivitycreated.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.IconCompatParcelizer == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.IconCompatParcelizer == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForChild;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 1;
            i3 = 0;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.IconCompatParcelizer == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ViewPager$MediaBrowserCompat$CustomActionResultReceiver infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.IconCompatParcelizer == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new write();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof write) && super.checkLayoutParams(layoutParams);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new write(getContext(), attributeSet);
    }

    class MediaDescriptionCompat extends DataSetObserver {
        MediaDescriptionCompat() {
        }

        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    public static class write extends ViewGroup.LayoutParams {
        int IconCompatParcelizer;
        public boolean MediaBrowserCompat$CustomActionResultReceiver;
        boolean MediaBrowserCompat$ItemReceiver;
        float MediaBrowserCompat$SearchResultReceiver = BitmapDescriptorFactory.HUE_RED;
        int read;
        public int write;

        public write() {
            super(-1, -1);
        }

        public write(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.write = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }
}

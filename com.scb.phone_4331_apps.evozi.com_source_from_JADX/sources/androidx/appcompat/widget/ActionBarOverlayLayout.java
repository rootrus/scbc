package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.ActionMenuView;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetExtractionParametersFactory;
import p040o.SwitchCompat;
import p040o.setBackgroundDrawable;
import p040o.setDefaultActionButtonContentDescription;
import p040o.setStackedBackground$MediaBrowserCompat$ItemReceiver;
import p040o.setSuggestionsAdapter;
import p040o.setWindowCallback;

public class ActionBarOverlayLayout extends ViewGroup implements CheckCaptureModule_GetExtractionParametersFactory, setSuggestionsAdapter {
    private static int[] MediaDescriptionCompat = {AlertController$RecycleListView.read.actionBarSize, 16842841};
    private int ActionMenuItemView;
    private boolean AlertController$RecycleListView;
    private final Rect AppCompatActivity;
    private int AppCompatDelegateImpl$ListMenuDecorView;
    private final Rect AppCompatDialogFragment;
    private final setBackgroundDrawable.read AppCompatViewInflater;
    ActionBarContainer IconCompatParcelizer;
    private boolean Keep;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    final Runnable MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    final AnimatorListenerAdapter MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private setWindowCallback f7x50fd9e4a;
    final Runnable MediaMetadataCompat;
    private final Rect MediaSessionCompat$QueueItem;
    private ContentFrameLayout MediaSessionCompat$ResultReceiverWrapper;
    private final Rect MediaSessionCompat$Token;
    private final Rect ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private boolean PlaybackStateCompat$CustomAction;
    private IconCompatParcelizer RatingCompat;
    boolean read;
    private final Rect setBackgroundResource;
    private Drawable setCheckable;
    private final Rect setContentView;
    private OverScroller setHasDecor;
    ViewPropertyAnimator write;

    public interface IconCompatParcelizer {
        void Keep();

        void MediaMetadataCompat(boolean z);

        void MediaSessionCompat$Token();

        void PlaybackStateCompat$CustomAction();

        void read(int i);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ActionMenuItemView = 0;
        this.MediaSessionCompat$QueueItem = new Rect();
        this.setContentView = new Rect();
        this.MediaSessionCompat$Token = new Rect();
        this.ParcelableVolumeInfo = new Rect();
        this.AppCompatActivity = new Rect();
        this.AppCompatDialogFragment = new Rect();
        this.setBackgroundResource = new Rect();
        this.MediaBrowserCompat$SearchResultReceiver = new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.write = null;
                ActionBarOverlayLayout.this.read = false;
            }

            public final void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.write = null;
                ActionBarOverlayLayout.this.read = false;
            }
        };
        this.MediaMetadataCompat = new Runnable() {
            public final void run() {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.removeCallbacks(actionBarOverlayLayout.MediaMetadataCompat);
                actionBarOverlayLayout.removeCallbacks(actionBarOverlayLayout.MediaBrowserCompat$ItemReceiver);
                ViewPropertyAnimator viewPropertyAnimator = actionBarOverlayLayout.write;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ActionBarOverlayLayout actionBarOverlayLayout2 = ActionBarOverlayLayout.this;
                actionBarOverlayLayout2.write = actionBarOverlayLayout2.IconCompatParcelizer.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener(ActionBarOverlayLayout.this.MediaBrowserCompat$SearchResultReceiver);
            }
        };
        this.MediaBrowserCompat$ItemReceiver = new Runnable() {
            public final void run() {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.removeCallbacks(actionBarOverlayLayout.MediaMetadataCompat);
                actionBarOverlayLayout.removeCallbacks(actionBarOverlayLayout.MediaBrowserCompat$ItemReceiver);
                ViewPropertyAnimator viewPropertyAnimator = actionBarOverlayLayout.write;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ActionBarOverlayLayout actionBarOverlayLayout2 = ActionBarOverlayLayout.this;
                actionBarOverlayLayout2.write = actionBarOverlayLayout2.IconCompatParcelizer.animate().translationY((float) (-ActionBarOverlayLayout.this.IconCompatParcelizer.getHeight())).setListener(ActionBarOverlayLayout.this.MediaBrowserCompat$SearchResultReceiver);
            }
        };
        MediaBrowserCompat$ItemReceiver(context);
        this.AppCompatViewInflater = new setBackgroundDrawable.read(this);
    }

    private void MediaBrowserCompat$ItemReceiver(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(MediaDescriptionCompat);
        boolean z = false;
        this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.setCheckable = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.PlaybackStateCompat$CustomAction = z;
        this.setHasDecor = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.MediaMetadataCompat);
        removeCallbacks(this.MediaBrowserCompat$ItemReceiver);
        ViewPropertyAnimator viewPropertyAnimator = this.write;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void setActionBarVisibilityCallback(IconCompatParcelizer iconCompatParcelizer) {
        this.RatingCompat = iconCompatParcelizer;
        if (getWindowToken() != null) {
            this.RatingCompat.read(this.ActionMenuItemView);
            int i = this.AppCompatDelegateImpl$ListMenuDecorView;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                SwitchCompat.setShortcut(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.PlaybackStateCompat$CustomAction = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.Keep = z;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MediaBrowserCompat$ItemReceiver(getContext());
        SwitchCompat.setShortcut(this);
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        MediaBrowserCompat$MediaItem();
        int i2 = this.AppCompatDelegateImpl$ListMenuDecorView;
        this.AppCompatDelegateImpl$ListMenuDecorView = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        IconCompatParcelizer iconCompatParcelizer = this.RatingCompat;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaMetadataCompat(!z);
            if (z2 || !z) {
                this.RatingCompat.PlaybackStateCompat$CustomAction();
            } else {
                this.RatingCompat.MediaSessionCompat$Token();
            }
        }
        if (((i ^ i2) & 256) != 0 && this.RatingCompat != null) {
            SwitchCompat.setShortcut(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.ActionMenuItemView = i;
        IconCompatParcelizer iconCompatParcelizer = this.RatingCompat;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read(i);
        }
    }

    private static boolean IconCompatParcelizer(View view, Rect rect, boolean z) {
        boolean z2;
        write write2 = (write) view.getLayoutParams();
        if (write2.leftMargin != rect.left) {
            write2.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (write2.topMargin != rect.top) {
            write2.topMargin = rect.top;
            z2 = true;
        }
        if (write2.rightMargin != rect.right) {
            write2.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || write2.bottomMargin == rect.bottom) {
            return z2;
        }
        write2.bottomMargin = rect.bottom;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        MediaBrowserCompat$MediaItem();
        SwitchCompat.PlaybackStateCompat(this);
        boolean IconCompatParcelizer2 = IconCompatParcelizer(this.IconCompatParcelizer, rect, false);
        this.ParcelableVolumeInfo.set(rect);
        setDefaultActionButtonContentDescription.MediaBrowserCompat$CustomActionResultReceiver(this, this.ParcelableVolumeInfo, this.MediaSessionCompat$QueueItem);
        if (!this.AppCompatActivity.equals(this.ParcelableVolumeInfo)) {
            this.AppCompatActivity.set(this.ParcelableVolumeInfo);
            IconCompatParcelizer2 = true;
        }
        if (!this.setContentView.equals(this.MediaSessionCompat$QueueItem)) {
            this.setContentView.set(this.MediaSessionCompat$QueueItem);
            IconCompatParcelizer2 = true;
        }
        if (IconCompatParcelizer2) {
            requestLayout();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new write(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof write;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MediaBrowserCompat$MediaItem();
        measureChildWithMargins(this.IconCompatParcelizer, i, 0, i2, 0);
        write write2 = (write) this.IconCompatParcelizer.getLayoutParams();
        int i3 = 0;
        int max = Math.max(0, this.IconCompatParcelizer.getMeasuredWidth() + write2.leftMargin + write2.rightMargin);
        int max2 = Math.max(0, this.IconCompatParcelizer.getMeasuredHeight() + write2.topMargin + write2.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.IconCompatParcelizer.getMeasuredState());
        boolean z = (SwitchCompat.PlaybackStateCompat(this) & 256) != 0;
        if (z) {
            i3 = this.MediaBrowserCompat$MediaItem;
            if (this.Keep && this.IconCompatParcelizer.RatingCompat != null) {
                i3 += this.MediaBrowserCompat$MediaItem;
            }
        } else if (this.IconCompatParcelizer.getVisibility() != 8) {
            i3 = this.IconCompatParcelizer.getMeasuredHeight();
        }
        this.MediaSessionCompat$Token.set(this.MediaSessionCompat$QueueItem);
        this.AppCompatDialogFragment.set(this.ParcelableVolumeInfo);
        if (this.MediaBrowserCompat$CustomActionResultReceiver || z) {
            this.AppCompatDialogFragment.top += i3;
            Rect rect = this.AppCompatDialogFragment;
            rect.bottom = rect.bottom;
        } else {
            this.MediaSessionCompat$Token.top += i3;
            Rect rect2 = this.MediaSessionCompat$Token;
            rect2.bottom = rect2.bottom;
        }
        IconCompatParcelizer(this.MediaSessionCompat$ResultReceiverWrapper, this.MediaSessionCompat$Token, true);
        if (!this.setBackgroundResource.equals(this.AppCompatDialogFragment)) {
            this.setBackgroundResource.set(this.AppCompatDialogFragment);
            this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(this.AppCompatDialogFragment);
        }
        measureChildWithMargins(this.MediaSessionCompat$ResultReceiverWrapper, i, 0, i2, 0);
        write write3 = (write) this.MediaSessionCompat$ResultReceiverWrapper.getLayoutParams();
        int max3 = Math.max(max, this.MediaSessionCompat$ResultReceiverWrapper.getMeasuredWidth() + write3.leftMargin + write3.rightMargin);
        int max4 = Math.max(max2, this.MediaSessionCompat$ResultReceiverWrapper.getMeasuredHeight() + write3.topMargin + write3.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.MediaSessionCompat$ResultReceiverWrapper.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                write write2 = (write) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = write2.leftMargin + paddingLeft;
                int i7 = write2.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.setCheckable != null && !this.PlaybackStateCompat$CustomAction) {
            int bottom = this.IconCompatParcelizer.getVisibility() == 0 ? (int) (((float) this.IconCompatParcelizer.getBottom()) + this.IconCompatParcelizer.getTranslationY() + 0.5f) : 0;
            this.setCheckable.setBounds(0, bottom, getWidth(), this.setCheckable.getIntrinsicHeight() + bottom);
            this.setCheckable.draw(canvas);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.IconCompatParcelizer.getVisibility() != 0) {
            return false;
        }
        return this.AlertController$RecycleListView;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.AppCompatViewInflater.write = i;
        ActionBarContainer actionBarContainer = this.IconCompatParcelizer;
        this.PlaybackStateCompat = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        removeCallbacks(this.MediaMetadataCompat);
        removeCallbacks(this.MediaBrowserCompat$ItemReceiver);
        ViewPropertyAnimator viewPropertyAnimator = this.write;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        IconCompatParcelizer iconCompatParcelizer = this.RatingCompat;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.Keep();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.PlaybackStateCompat + i2;
        this.PlaybackStateCompat = i5;
        setActionBarHideOffset(i5);
    }

    public void onStopNestedScroll(View view) {
        if (this.AlertController$RecycleListView && !this.read) {
            if (this.PlaybackStateCompat <= this.IconCompatParcelizer.getHeight()) {
                removeCallbacks(this.MediaMetadataCompat);
                removeCallbacks(this.MediaBrowserCompat$ItemReceiver);
                ViewPropertyAnimator viewPropertyAnimator = this.write;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                postDelayed(this.MediaMetadataCompat, 600);
                return;
            }
            removeCallbacks(this.MediaMetadataCompat);
            removeCallbacks(this.MediaBrowserCompat$ItemReceiver);
            ViewPropertyAnimator viewPropertyAnimator2 = this.write;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            postDelayed(this.MediaBrowserCompat$ItemReceiver, 600);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.AlertController$RecycleListView || !z) {
            return false;
        }
        this.setHasDecor.fling(0, 0, 0, (int) f2, 0, 0, PKIFailureInfo.systemUnavail, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (this.setHasDecor.getFinalY() > this.IconCompatParcelizer.getHeight()) {
            z2 = true;
        }
        if (z2) {
            removeCallbacks(this.MediaMetadataCompat);
            removeCallbacks(this.MediaBrowserCompat$ItemReceiver);
            ViewPropertyAnimator viewPropertyAnimator = this.write;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            this.MediaBrowserCompat$ItemReceiver.run();
        } else {
            removeCallbacks(this.MediaMetadataCompat);
            removeCallbacks(this.MediaBrowserCompat$ItemReceiver);
            ViewPropertyAnimator viewPropertyAnimator2 = this.write;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            this.MediaMetadataCompat.run();
        }
        this.read = true;
        return true;
    }

    public int getNestedScrollAxes() {
        return this.AppCompatViewInflater.write;
    }

    private void MediaBrowserCompat$MediaItem() {
        if (this.MediaSessionCompat$ResultReceiverWrapper == null) {
            this.MediaSessionCompat$ResultReceiverWrapper = (ContentFrameLayout) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.action_bar_activity_content);
            this.IconCompatParcelizer = (ActionBarContainer) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.action_bar_container);
            this.f7x50fd9e4a = MediaBrowserCompat$ItemReceiver(findViewById(AlertController$RecycleListView.MediaDescriptionCompat.action_bar));
        }
    }

    private static setWindowCallback MediaBrowserCompat$ItemReceiver(View view) {
        if (view instanceof setWindowCallback) {
            return (setWindowCallback) view;
        }
        if (view instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) view;
            if (toolbar.setHasDecor == null) {
                toolbar.setHasDecor = new ActionMenuView.OnMenuItemClickListener(toolbar, true);
            }
            return toolbar.setHasDecor;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.AlertController$RecycleListView) {
            this.AlertController$RecycleListView = z;
            if (!z) {
                removeCallbacks(this.MediaMetadataCompat);
                removeCallbacks(this.MediaBrowserCompat$ItemReceiver);
                ViewPropertyAnimator viewPropertyAnimator = this.write;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                setActionBarHideOffset(0);
            }
        }
    }

    public void setWindowCallback(Window.Callback callback) {
        MediaBrowserCompat$MediaItem();
        this.f7x50fd9e4a.MediaBrowserCompat$ItemReceiver(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        MediaBrowserCompat$MediaItem();
        this.f7x50fd9e4a.write(charSequence);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        MediaBrowserCompat$MediaItem();
        if (i == 2) {
            this.f7x50fd9e4a.MediaSessionCompat$QueueItem();
        } else if (i == 5) {
            this.f7x50fd9e4a.ParcelableVolumeInfo();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public void setIcon(int i) {
        MediaBrowserCompat$MediaItem();
        this.f7x50fd9e4a.MediaBrowserCompat$ItemReceiver(i);
    }

    public void setIcon(Drawable drawable) {
        MediaBrowserCompat$MediaItem();
        this.f7x50fd9e4a.write(drawable);
    }

    public void setLogo(int i) {
        MediaBrowserCompat$MediaItem();
        this.f7x50fd9e4a.write(i);
    }

    public final boolean read() {
        MediaBrowserCompat$MediaItem();
        return this.f7x50fd9e4a.read();
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        MediaBrowserCompat$MediaItem();
        return this.f7x50fd9e4a.MediaSessionCompat$ResultReceiverWrapper();
    }

    public final boolean write() {
        MediaBrowserCompat$MediaItem();
        return this.f7x50fd9e4a.mo15623x50fd9e4a();
    }

    public final boolean RatingCompat() {
        MediaBrowserCompat$MediaItem();
        return this.f7x50fd9e4a.AlertController$RecycleListView();
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        MediaBrowserCompat$MediaItem();
        return this.f7x50fd9e4a.RatingCompat();
    }

    public void setMenuPrepared() {
        MediaBrowserCompat$MediaItem();
        this.f7x50fd9e4a.MediaSessionCompat$Token();
    }

    public void setMenu(Menu menu, setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver) {
        MediaBrowserCompat$MediaItem();
        this.f7x50fd9e4a.MediaBrowserCompat$ItemReceiver(menu, setstackedbackground_mediabrowsercompat_itemreceiver);
    }

    public final void IconCompatParcelizer() {
        MediaBrowserCompat$MediaItem();
        this.f7x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public static class write extends ViewGroup.MarginLayoutParams {
        public write(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public write() {
            super(-1, -1);
        }

        public write(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new write();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new write(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        removeCallbacks(this.MediaMetadataCompat);
        removeCallbacks(this.MediaBrowserCompat$ItemReceiver);
        ViewPropertyAnimator viewPropertyAnimator = this.write;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.IconCompatParcelizer.setTranslationY((float) (-Math.max(0, Math.min(i, this.IconCompatParcelizer.getHeight()))));
    }
}

package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.C1134xe5b94a38;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.FragmentBuilder_BindMyInsuranceFragment;
import p040o.FragmentBuilder_BindOnboardingSelectAccountFragment;
import p040o.Iterables;
import p040o.SwitchCompat;
import p040o.nAllocationSetSurface;
import p040o.nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver;
import p040o.nAllocationSetSurface$MediaSessionCompat$Token;
import p040o.setBaselineAligned;
import p040o.setIconified;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTextOff;
import p040o.zzlz;

public class CollapsingToolbarLayout extends FrameLayout {
    private ValueAnimator AlertController$RecycleListView;
    private View AppCompatActivity;
    private int AppCompatDialogFragment;
    private boolean IconCompatParcelizer;
    private boolean Keep;
    final FragmentBuilder_BindOnboardingSelectAccountFragment MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private int f3245x50fd9e4a;
    private int MediaDescriptionCompat;
    private Drawable MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private boolean MediaSessionCompat$Token;
    private AppBarLayout.read ParcelableVolumeInfo;
    private long PlaybackStateCompat;
    private final Rect PlaybackStateCompat$CustomAction;
    private boolean RatingCompat;
    setTextOff read;
    private Toolbar setContentView;
    private int setHasDecor;
    Drawable write;

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaSessionCompat$Token = true;
        this.PlaybackStateCompat$CustomAction = new Rect();
        this.setHasDecor = -1;
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = new FragmentBuilder_BindOnboardingSelectAccountFragment(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindOnboardingSelectAccountFragment;
        fragmentBuilder_BindOnboardingSelectAccountFragment.f3148x50fd9e4a = zzlz.write;
        fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
        TypedArray MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(context, attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout, i, nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.Widget_Design_CollapsingToolbar, new int[0]);
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = MediaBrowserCompat$ItemReceiver2.getInt(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        if (fragmentBuilder_BindOnboardingSelectAccountFragment2.MediaBrowserCompat$SearchResultReceiver != i2) {
            fragmentBuilder_BindOnboardingSelectAccountFragment2.MediaBrowserCompat$SearchResultReceiver = i2;
            fragmentBuilder_BindOnboardingSelectAccountFragment2.MediaBrowserCompat$ItemReceiver();
        }
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = MediaBrowserCompat$ItemReceiver2.getInt(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_collapsedTitleGravity, 8388627);
        if (fragmentBuilder_BindOnboardingSelectAccountFragment3.read != i3) {
            fragmentBuilder_BindOnboardingSelectAccountFragment3.read = i3;
            fragmentBuilder_BindOnboardingSelectAccountFragment3.MediaBrowserCompat$ItemReceiver();
        }
        int dimensionPixelSize = MediaBrowserCompat$ItemReceiver2.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.MediaDescriptionCompat = dimensionPixelSize;
        this.MediaBrowserCompat$SearchResultReceiver = dimensionPixelSize;
        this.f3245x50fd9e4a = dimensionPixelSize;
        this.MediaSessionCompat$ResultReceiverWrapper = dimensionPixelSize;
        if (MediaBrowserCompat$ItemReceiver2.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.MediaSessionCompat$ResultReceiverWrapper = MediaBrowserCompat$ItemReceiver2.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (MediaBrowserCompat$ItemReceiver2.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$ItemReceiver2.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (MediaBrowserCompat$ItemReceiver2.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f3245x50fd9e4a = MediaBrowserCompat$ItemReceiver2.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (MediaBrowserCompat$ItemReceiver2.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver2.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(MediaBrowserCompat$ItemReceiver2.getText(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_title));
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(C1134xe5b94a38.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (MediaBrowserCompat$ItemReceiver2.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (MediaBrowserCompat$ItemReceiver2.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.setHasDecor = MediaBrowserCompat$ItemReceiver2.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.PlaybackStateCompat = (long) MediaBrowserCompat$ItemReceiver2.getInt(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(MediaBrowserCompat$ItemReceiver2.getDrawable(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(MediaBrowserCompat$ItemReceiver2.getDrawable(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_statusBarScrim));
        this.AppCompatDialogFragment = MediaBrowserCompat$ItemReceiver2.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_toolbarId, -1);
        MediaBrowserCompat$ItemReceiver2.recycle();
        setWillNotDraw(false);
        SwitchCompat.write((View) this, (CheckCaptureModule_GetIJsonExactionHelperRttiFactory) new CheckCaptureModule_GetIJsonExactionHelperRttiFactory() {
            public final setTextOff write(View view, setTextOff settextoff) {
                CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
                setTextOff settextoff2 = SwitchCompat.RatingCompat(collapsingToolbarLayout) ? settextoff : null;
                if (!setIconified.MediaBrowserCompat$CustomActionResultReceiver(collapsingToolbarLayout.read, settextoff2)) {
                    collapsingToolbarLayout.read = settextoff2;
                    collapsingToolbarLayout.requestLayout();
                }
                return settextoff.MediaBrowserCompat$ItemReceiver();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            SwitchCompat.read((View) this, SwitchCompat.RatingCompat((View) parent));
            if (this.ParcelableVolumeInfo == null) {
                this.ParcelableVolumeInfo = new read();
            }
            ((AppBarLayout) parent).IconCompatParcelizer(this.ParcelableVolumeInfo);
            SwitchCompat.setShortcut(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        List<AppBarLayout$MediaBrowserCompat$ItemReceiver> list;
        ViewParent parent = getParent();
        AppBarLayout.read read2 = this.ParcelableVolumeInfo;
        if (!(read2 == null || !(parent instanceof AppBarLayout) || (list = ((AppBarLayout) parent).MediaBrowserCompat$MediaItem) == null || read2 == null)) {
            list.remove(read2);
        }
        super.onDetachedFromWindow();
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        read();
        if (this.setContentView == null && (drawable = this.MediaMetadataCompat) != null && this.MediaSessionCompat$QueueItem > 0) {
            drawable.mutate().setAlpha(this.MediaSessionCompat$QueueItem);
            this.MediaMetadataCompat.draw(canvas);
        }
        if (this.IconCompatParcelizer && this.RatingCompat) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(canvas);
        }
        if (this.write != null && this.MediaSessionCompat$QueueItem > 0) {
            setTextOff settextoff = this.read;
            int read2 = settextoff != null ? settextoff.read() : 0;
            if (read2 > 0) {
                this.write.setBounds(0, -this.MediaBrowserCompat$ItemReceiver, getWidth(), read2 - this.MediaBrowserCompat$ItemReceiver);
                this.write.mutate().setAlpha(this.MediaSessionCompat$QueueItem);
                this.write.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.MediaMetadataCompat
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r0 = r4.MediaSessionCompat$QueueItem
            if (r0 <= 0) goto L_0x002e
            android.view.View r0 = r4.AppCompatActivity
            if (r0 == 0) goto L_0x0013
            if (r0 == r4) goto L_0x0013
            if (r6 != r0) goto L_0x0017
            goto L_0x0019
        L_0x0013:
            androidx.appcompat.widget.Toolbar r0 = r4.setContentView
            if (r6 == r0) goto L_0x0019
        L_0x0017:
            r0 = r1
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.MediaMetadataCompat
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r4.MediaSessionCompat$QueueItem
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r4.MediaMetadataCompat
            r0.draw(r5)
            r0 = r2
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            boolean r5 = super.drawChild(r5, r6, r7)
            if (r5 != 0) goto L_0x0037
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.MediaMetadataCompat;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void read() {
        /*
            r6 = this;
            boolean r0 = r6.MediaSessionCompat$Token
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.setContentView = r0
            r6.AppCompatActivity = r0
            int r1 = r6.AppCompatDialogFragment
            r2 = -1
            if (r1 == r2) goto L_0x002f
            android.view.View r1 = r6.findViewById(r1)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r6.setContentView = r1
            if (r1 == 0) goto L_0x002f
            android.view.ViewParent r2 = r1.getParent()
        L_0x001d:
            if (r2 == r6) goto L_0x002d
            if (r2 == 0) goto L_0x002d
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x0028
            r1 = r2
            android.view.View r1 = (android.view.View) r1
        L_0x0028:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x001d
        L_0x002d:
            r6.AppCompatActivity = r1
        L_0x002f:
            androidx.appcompat.widget.Toolbar r1 = r6.setContentView
            r2 = 0
            if (r1 != 0) goto L_0x004c
            int r1 = r6.getChildCount()
            r3 = r2
        L_0x0039:
            if (r3 >= r1) goto L_0x004a
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r5 == 0) goto L_0x0047
            r0 = r4
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            goto L_0x004a
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x0039
        L_0x004a:
            r6.setContentView = r0
        L_0x004c:
            r6.MediaBrowserCompat$CustomActionResultReceiver()
            r6.MediaSessionCompat$Token = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.read():void");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        View view;
        if (!this.IconCompatParcelizer && (view = this.MediaBrowserCompat$MediaItem) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.MediaBrowserCompat$MediaItem);
            }
        }
        if (this.IconCompatParcelizer && this.setContentView != null) {
            if (this.MediaBrowserCompat$MediaItem == null) {
                this.MediaBrowserCompat$MediaItem = new View(getContext());
            }
            if (this.MediaBrowserCompat$MediaItem.getParent() == null) {
                this.setContentView.addView(this.MediaBrowserCompat$MediaItem, -1, -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        read();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        setTextOff settextoff = this.read;
        int read2 = settextoff != null ? settextoff.read() : 0;
        if (mode == 0 && read2 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + read2, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        setTextOff settextoff = this.read;
        if (settextoff != null) {
            int read2 = settextoff.read();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (!SwitchCompat.RatingCompat(childAt) && childAt.getTop() < read2) {
                    SwitchCompat.MediaBrowserCompat$ItemReceiver(childAt, read2);
                }
            }
        }
        if (this.IconCompatParcelizer && (view = this.MediaBrowserCompat$MediaItem) != null) {
            boolean z2 = true;
            boolean z3 = SwitchCompat.setExpandedFormat(view) && this.MediaBrowserCompat$MediaItem.getVisibility() == 0;
            this.RatingCompat = z3;
            if (z3) {
                if (SwitchCompat.m3079x50fd9e4a(this) != 1) {
                    z2 = false;
                }
                View view2 = this.AppCompatActivity;
                if (view2 == null) {
                    view2 = this.setContentView;
                }
                int write2 = write(view2);
                View view3 = this.MediaBrowserCompat$MediaItem;
                Rect rect = this.PlaybackStateCompat$CustomAction;
                rect.set(0, 0, view3.getWidth(), view3.getHeight());
                Iterables.C35273.write.read((ViewGroup) this, view3, rect);
                FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i8 = this.PlaybackStateCompat$CustomAction.left;
                if (z2) {
                    i5 = this.setContentView.ParcelableVolumeInfo;
                } else {
                    i5 = this.setContentView.MediaSessionCompat$ResultReceiverWrapper;
                }
                int i9 = this.PlaybackStateCompat$CustomAction.top;
                int i10 = this.setContentView.MediaSessionCompat$Token;
                int i11 = this.PlaybackStateCompat$CustomAction.right;
                if (z2) {
                    i6 = this.setContentView.MediaSessionCompat$ResultReceiverWrapper;
                } else {
                    i6 = this.setContentView.ParcelableVolumeInfo;
                }
                fragmentBuilder_BindOnboardingSelectAccountFragment.write(i8 + i5, i9 + write2 + i10, i11 + i6, (this.PlaybackStateCompat$CustomAction.bottom + write2) - this.setContentView.f11x50fd9e4a);
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(z2 ? this.MediaBrowserCompat$SearchResultReceiver : this.MediaSessionCompat$ResultReceiverWrapper, this.PlaybackStateCompat$CustomAction.top + this.f3245x50fd9e4a, (i3 - i) - (z2 ? this.MediaSessionCompat$ResultReceiverWrapper : this.MediaBrowserCompat$SearchResultReceiver), (i4 - i2) - this.MediaDescriptionCompat);
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
            }
        }
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            FragmentBuilder_BindMyInsuranceFragment IconCompatParcelizer2 = IconCompatParcelizer(getChildAt(i12));
            IconCompatParcelizer2.IconCompatParcelizer = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getTop();
            IconCompatParcelizer2.read = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getLeft();
            IconCompatParcelizer2.IconCompatParcelizer();
        }
        if (this.setContentView != null) {
            if (this.IconCompatParcelizer && TextUtils.isEmpty(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo)) {
                setTitle(this.setContentView.Keep);
            }
            View view4 = this.AppCompatActivity;
            if (view4 == null || view4 == this) {
                setMinimumHeight(MediaBrowserCompat$ItemReceiver(this.setContentView));
            } else {
                setMinimumHeight(MediaBrowserCompat$ItemReceiver(view4));
            }
        }
        MediaBrowserCompat$ItemReceiver();
    }

    private static int MediaBrowserCompat$ItemReceiver(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    static FragmentBuilder_BindMyInsuranceFragment IconCompatParcelizer(View view) {
        FragmentBuilder_BindMyInsuranceFragment fragmentBuilder_BindMyInsuranceFragment = (FragmentBuilder_BindMyInsuranceFragment) view.getTag(nAllocationSetSurface.MediaDescriptionCompat.view_offset_helper);
        if (fragmentBuilder_BindMyInsuranceFragment != null) {
            return fragmentBuilder_BindMyInsuranceFragment;
        }
        FragmentBuilder_BindMyInsuranceFragment fragmentBuilder_BindMyInsuranceFragment2 = new FragmentBuilder_BindMyInsuranceFragment(view);
        view.setTag(nAllocationSetSurface.MediaDescriptionCompat.view_offset_helper, fragmentBuilder_BindMyInsuranceFragment2);
        return fragmentBuilder_BindMyInsuranceFragment2;
    }

    public void setTitle(CharSequence charSequence) {
        CharSequence charSequence2;
        this.MediaBrowserCompat$CustomActionResultReceiver.read(charSequence);
        if (this.IconCompatParcelizer) {
            charSequence2 = this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo;
        } else {
            charSequence2 = null;
        }
        setContentDescription(charSequence2);
    }

    public void setTitleEnabled(boolean z) {
        CharSequence charSequence;
        if (z != this.IconCompatParcelizer) {
            this.IconCompatParcelizer = z;
            if (z) {
                charSequence = this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo;
            } else {
                charSequence = null;
            }
            setContentDescription(charSequence);
            MediaBrowserCompat$CustomActionResultReceiver();
            requestLayout();
        }
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, SwitchCompat.setCheckable(this) && !isInEditMode());
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.Keep != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                read();
                ValueAnimator valueAnimator = this.AlertController$RecycleListView;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.AlertController$RecycleListView = valueAnimator2;
                    valueAnimator2.setDuration(this.PlaybackStateCompat);
                    this.AlertController$RecycleListView.setInterpolator(i > this.MediaSessionCompat$QueueItem ? zzlz.MediaBrowserCompat$ItemReceiver : zzlz.MediaBrowserCompat$CustomActionResultReceiver);
                    this.AlertController$RecycleListView.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            CollapsingToolbarLayout.this.write(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    });
                } else if (valueAnimator.isRunning()) {
                    this.AlertController$RecycleListView.cancel();
                }
                this.AlertController$RecycleListView.setIntValues(new int[]{this.MediaSessionCompat$QueueItem, i});
                this.AlertController$RecycleListView.start();
            } else {
                if (!z) {
                    i = 0;
                }
                write(i);
            }
            this.Keep = z;
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(int i) {
        Toolbar toolbar;
        if (i != this.MediaSessionCompat$QueueItem) {
            if (!(this.MediaMetadataCompat == null || (toolbar = this.setContentView) == null)) {
                SwitchCompat.setItemInvoker(toolbar);
            }
            this.MediaSessionCompat$QueueItem = i;
            SwitchCompat.setItemInvoker(this);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.MediaMetadataCompat;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.MediaMetadataCompat = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.MediaMetadataCompat.setCallback(this);
                this.MediaMetadataCompat.setAlpha(this.MediaSessionCompat$QueueItem);
            }
            SwitchCompat.setItemInvoker(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(setLastBaselineToBottomHeight.write(getContext(), i));
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.write;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.write = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.write.setState(getDrawableState());
                }
                setBaselineAligned.read(this.write, SwitchCompat.m3079x50fd9e4a(this));
                this.write.setVisible(getVisibility() == 0, false);
                this.write.setCallback(this);
                this.write.setAlpha(this.MediaSessionCompat$QueueItem);
            }
            SwitchCompat.setItemInvoker(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.write;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState) | false;
        Drawable drawable2 = this.MediaMetadataCompat;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindOnboardingSelectAccountFragment != null) {
            fragmentBuilder_BindOnboardingSelectAccountFragment.RatingCompat = drawableState;
            if (fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver()) {
                fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.MediaMetadataCompat || drawable == this.write;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.write;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.write.setVisible(z, false);
        }
        Drawable drawable2 = this.MediaMetadataCompat;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.MediaMetadataCompat.setVisible(z, false);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(setLastBaselineToBottomHeight.write(getContext(), i));
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindOnboardingSelectAccountFragment.write != colorStateList) {
            fragmentBuilder_BindOnboardingSelectAccountFragment.write = colorStateList;
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setCollapsedTitleGravity(int i) {
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindOnboardingSelectAccountFragment.read != i) {
            fragmentBuilder_BindOnboardingSelectAccountFragment.read = i;
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(i);
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver != colorStateList) {
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver = colorStateList;
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setExpandedTitleGravity(int i) {
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$SearchResultReceiver != i) {
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$SearchResultReceiver = i;
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver != typeface) {
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver = typeface;
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindOnboardingSelectAccountFragment.MediaDescriptionCompat != typeface) {
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaDescriptionCompat = typeface;
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.MediaSessionCompat$ResultReceiverWrapper = i;
        this.f3245x50fd9e4a = i2;
        this.MediaBrowserCompat$SearchResultReceiver = i3;
        this.MediaDescriptionCompat = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.MediaSessionCompat$ResultReceiverWrapper = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f3245x50fd9e4a = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.MediaBrowserCompat$SearchResultReceiver = i;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.MediaDescriptionCompat = i;
        requestLayout();
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.setHasDecor != i) {
            this.setHasDecor = i;
            MediaBrowserCompat$ItemReceiver();
        }
    }

    private int IconCompatParcelizer() {
        int i = this.setHasDecor;
        if (i >= 0) {
            return i;
        }
        setTextOff settextoff = this.read;
        int read2 = settextoff != null ? settextoff.read() : 0;
        int MediaSessionCompat$ResultReceiverWrapper2 = SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(this);
        if (MediaSessionCompat$ResultReceiverWrapper2 > 0) {
            return Math.min((MediaSessionCompat$ResultReceiverWrapper2 << 1) + read2, getHeight());
        }
        return getHeight() / 3;
    }

    public void setScrimAnimationDuration(long j) {
        this.PlaybackStateCompat = j;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof write;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new write(getContext(), attributeSet);
    }

    public static class write extends FrameLayout.LayoutParams {
        int IconCompatParcelizer = 0;
        float write = 0.5f;

        public write(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_Layout);
            this.IconCompatParcelizer = obtainStyledAttributes.getInt(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.write = obtainStyledAttributes.getFloat(nAllocationSetSurface$MediaSessionCompat$Token.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public write() {
            super(-1, -1);
        }

        public write(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver() {
        if (this.MediaMetadataCompat != null || this.write != null) {
            setScrimsShown(getHeight() + this.MediaBrowserCompat$ItemReceiver < IconCompatParcelizer());
        }
    }

    /* access modifiers changed from: package-private */
    public final int write(View view) {
        return ((getHeight() - IconCompatParcelizer(view).IconCompatParcelizer) - view.getHeight()) - ((write) view.getLayoutParams()).bottomMargin;
    }

    class read implements AppBarLayout.read {
        read() {
        }

        public final void read(AppBarLayout appBarLayout, int i) {
            int round;
            CollapsingToolbarLayout.this.MediaBrowserCompat$ItemReceiver = i;
            int read = CollapsingToolbarLayout.this.read != null ? CollapsingToolbarLayout.this.read.read() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                write write = (write) childAt.getLayoutParams();
                FragmentBuilder_BindMyInsuranceFragment IconCompatParcelizer2 = CollapsingToolbarLayout.IconCompatParcelizer(childAt);
                int i3 = write.IconCompatParcelizer;
                if (i3 == 1) {
                    int i4 = -i;
                    int write2 = CollapsingToolbarLayout.this.write(childAt);
                    if (i4 < 0) {
                        i4 = 0;
                    } else if (i4 > write2) {
                        i4 = write2;
                    }
                    if (IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver != i4) {
                        IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = i4;
                        IconCompatParcelizer2.IconCompatParcelizer();
                    }
                } else if (i3 == 2 && IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver != (round = Math.round(((float) (-i)) * write.write))) {
                    IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = round;
                    IconCompatParcelizer2.IconCompatParcelizer();
                }
            }
            CollapsingToolbarLayout.this.MediaBrowserCompat$ItemReceiver();
            if (CollapsingToolbarLayout.this.write != null && read > 0) {
                SwitchCompat.setItemInvoker(CollapsingToolbarLayout.this);
            }
            CollapsingToolbarLayout.this.MediaBrowserCompat$CustomActionResultReceiver.write(((float) Math.abs(i)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(CollapsingToolbarLayout.this)) - read)));
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new write(layoutParams);
    }
}

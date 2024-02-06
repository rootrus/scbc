package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.Iterables;
import p040o.SwitchCompat;
import p040o.nAllocationSetSurface;
import p040o.nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver;
import p040o.nAllocationSetSurface$MediaSessionCompat$Token;
import p040o.nContextInitToClient;
import p040o.nContextSetPriority;
import p040o.nIncContextCreate;
import p040o.setBaselineAligned;
import p040o.zzlz;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.IconCompatParcelizer {
    int AlertController$RecycleListView;
    boolean AppCompatActivity;
    Animator AppCompatDelegateImpl$ListMenuDecorView;
    final nIncContextCreate AppCompatDialogFragment;
    final nContextInitToClient AppCompatViewInflater;
    AnimatorListenerAdapter PlaybackStateCompat;
    Animator PlaybackStateCompat$CustomAction;
    Animator setBackgroundResource;
    private final int setChecked;
    boolean setContentView;

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nAllocationSetSurface.read.bottomAppBarStyle);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AppCompatActivity = true;
        this.PlaybackStateCompat = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                boolean z = bottomAppBar.AppCompatActivity;
                if (SwitchCompat.setCheckable(bottomAppBar)) {
                    Animator animator2 = bottomAppBar.PlaybackStateCompat$CustomAction;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    ArrayList arrayList = new ArrayList();
                    boolean z2 = z && bottomAppBar.MediaMetadataCompat();
                    if (z2) {
                        bottomAppBar.AppCompatViewInflater.MediaBrowserCompat$CustomActionResultReceiver = (float) bottomAppBar.MediaBrowserCompat$ItemReceiver(bottomAppBar.AlertController$RecycleListView);
                    }
                    float[] fArr = new float[2];
                    fArr[0] = bottomAppBar.AppCompatDialogFragment.MediaBrowserCompat$CustomActionResultReceiver;
                    fArr[1] = z2 ? 1.0f : BitmapDescriptorFactory.HUE_RED;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            nIncContextCreate ninccontextcreate = BottomAppBar.this.AppCompatDialogFragment;
                            ninccontextcreate.MediaBrowserCompat$CustomActionResultReceiver = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ninccontextcreate.invalidateSelf();
                        }
                    });
                    ofFloat.setDuration(300);
                    arrayList.add(ofFloat);
                    FloatingActionButton read2 = bottomAppBar.read();
                    if (read2 != null) {
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(read2, "translationY", new float[]{bottomAppBar.write(z)});
                        ofFloat2.setDuration(300);
                        arrayList.add(ofFloat2);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    bottomAppBar.PlaybackStateCompat$CustomAction = animatorSet;
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            BottomAppBar.this.PlaybackStateCompat$CustomAction = null;
                        }
                    });
                    bottomAppBar.PlaybackStateCompat$CustomAction.start();
                }
                BottomAppBar bottomAppBar2 = BottomAppBar.this;
                bottomAppBar2.MediaBrowserCompat$ItemReceiver(bottomAppBar2.AlertController$RecycleListView, BottomAppBar.this.AppCompatActivity);
            }
        };
        int[] iArr = nAllocationSetSurface$MediaSessionCompat$Token.BottomAppBar;
        int i2 = nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.Widget_MaterialComponents_BottomAppBar;
        AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(context, attributeSet, i, i2);
        AlertController$RecycleListView.read.read(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        ColorStateList IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer(context, obtainStyledAttributes, nAllocationSetSurface$MediaSessionCompat$Token.BottomAppBar_backgroundTint);
        this.AlertController$RecycleListView = obtainStyledAttributes.getInt(nAllocationSetSurface$MediaSessionCompat$Token.BottomAppBar_fabAlignmentMode, 0);
        this.setContentView = obtainStyledAttributes.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.BottomAppBar_hideOnScroll, false);
        obtainStyledAttributes.recycle();
        this.setChecked = getResources().getDimensionPixelOffset(nAllocationSetSurface.IconCompatParcelizer.mtrl_bottomappbar_fabOffsetEndMode);
        this.AppCompatViewInflater = new nContextInitToClient((float) obtainStyledAttributes.getDimensionPixelOffset(nAllocationSetSurface$MediaSessionCompat$Token.BottomAppBar_fabCradleMargin, 0), (float) obtainStyledAttributes.getDimensionPixelOffset(nAllocationSetSurface$MediaSessionCompat$Token.BottomAppBar_fabCradleRoundedCornerRadius, 0), (float) obtainStyledAttributes.getDimensionPixelOffset(nAllocationSetSurface$MediaSessionCompat$Token.BottomAppBar_fabCradleVerticalOffset, 0));
        Iterables.C35273.RatingCompat ratingCompat = new Iterables.C35273.RatingCompat();
        ratingCompat.RatingCompat = this.AppCompatViewInflater;
        nIncContextCreate ninccontextcreate = new nIncContextCreate(ratingCompat);
        this.AppCompatDialogFragment = ninccontextcreate;
        ninccontextcreate.read = true;
        ninccontextcreate.invalidateSelf();
        nIncContextCreate ninccontextcreate2 = this.AppCompatDialogFragment;
        ninccontextcreate2.IconCompatParcelizer = Paint.Style.FILL;
        ninccontextcreate2.invalidateSelf();
        setBaselineAligned.read((Drawable) this.AppCompatDialogFragment, IconCompatParcelizer);
        SwitchCompat.IconCompatParcelizer((View) this, (Drawable) this.AppCompatDialogFragment);
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        setBaselineAligned.read((Drawable) this.AppCompatDialogFragment, colorStateList);
    }

    public void setHideOnScroll(boolean z) {
        this.setContentView = z;
    }

    /* access modifiers changed from: package-private */
    public final FloatingActionButton read() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View next : ((CoordinatorLayout) getParent()).MediaBrowserCompat$CustomActionResultReceiver((View) this)) {
            if (next instanceof FloatingActionButton) {
                return (FloatingActionButton) next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaMetadataCompat() {
        FloatingActionButton read = read();
        if (read != null) {
            if (read.IconCompatParcelizer == null) {
                read.IconCompatParcelizer = read.write();
            }
            if (read.IconCompatParcelizer.read()) {
                return true;
            }
        }
        return false;
    }

    private void IconCompatParcelizer(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(read(), "translationX", new float[]{(float) MediaBrowserCompat$ItemReceiver(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(int i, boolean z) {
        if (SwitchCompat.setCheckable(this)) {
            Animator animator = this.AppCompatDelegateImpl$ListMenuDecorView;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!MediaMetadataCompat()) {
                i = 0;
                z = false;
            }
            read(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.AppCompatDelegateImpl$ListMenuDecorView = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.AppCompatDelegateImpl$ListMenuDecorView = null;
                }
            });
            this.AppCompatDelegateImpl$ListMenuDecorView.start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r6 == false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void read(final int r9, final boolean r10, java.util.List<android.animation.Animator> r11) {
        /*
            r8 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r8.MediaBrowserCompat$MediaItem()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            r1 = 1
            float[] r2 = new float[r1]
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r2[r4] = r3
            java.lang.String r5 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r0, r5, r2)
            boolean r6 = r8.AppCompatActivity
            if (r6 != 0) goto L_0x0038
            if (r10 == 0) goto L_0x003e
            com.google.android.material.floatingactionbutton.FloatingActionButton r6 = r8.read()
            if (r6 == 0) goto L_0x0035
            o.nContextSetPriority r7 = r6.IconCompatParcelizer
            if (r7 != 0) goto L_0x002b
            o.nContextSetPriority r7 = r6.write()
            r6.IconCompatParcelizer = r7
        L_0x002b:
            o.nContextSetPriority r6 = r6.IconCompatParcelizer
            boolean r6 = r6.read()
            if (r6 == 0) goto L_0x0035
            r6 = r1
            goto L_0x0036
        L_0x0035:
            r6 = r4
        L_0x0036:
            if (r6 == 0) goto L_0x003e
        L_0x0038:
            int r6 = r8.AlertController$RecycleListView
            if (r6 == r1) goto L_0x004a
            if (r9 == r1) goto L_0x004a
        L_0x003e:
            float r9 = r0.getAlpha()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x0072
            r11.add(r2)
            return
        L_0x004a:
            float[] r3 = new float[r1]
            r6 = 0
            r3[r4] = r6
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r0, r5, r3)
            com.google.android.material.bottomappbar.BottomAppBar$3 r5 = new com.google.android.material.bottomappbar.BottomAppBar$3
            r5.<init>(r0, r9, r10)
            r3.addListener(r5)
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            r5 = 150(0x96, double:7.4E-322)
            r9.setDuration(r5)
            r10 = 2
            android.animation.Animator[] r10 = new android.animation.Animator[r10]
            r10[r4] = r3
            r10[r1] = r2
            r9.playSequentially(r10)
            r11.add(r9)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.read(int, boolean, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    public final float write(boolean z) {
        FloatingActionButton read = read();
        if (read == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        Rect rect = new Rect();
        if (SwitchCompat.setCheckable(read)) {
            rect.set(0, 0, read.getWidth(), read.getHeight());
            read.write(rect);
        }
        float height = (float) rect.height();
        if (height == BitmapDescriptorFactory.HUE_RED) {
            height = (float) read.getMeasuredHeight();
        }
        float height2 = (float) (read.getHeight() - rect.height());
        float height3 = (-this.AppCompatViewInflater.MediaBrowserCompat$ItemReceiver) + (height / 2.0f) + ((float) (read.getHeight() - rect.bottom));
        float paddingBottom = (float) read.getPaddingBottom();
        float f = (float) (-getMeasuredHeight());
        if (!z) {
            height3 = height2 - paddingBottom;
        }
        return f + height3;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$ItemReceiver(int i) {
        int i2 = 1;
        boolean z = SwitchCompat.m3079x50fd9e4a(this) == 1;
        if (i != 1) {
            return 0;
        }
        int measuredWidth = getMeasuredWidth() / 2;
        int i3 = this.setChecked;
        if (z) {
            i2 = -1;
        }
        return (measuredWidth - i3) * i2;
    }

    private ActionMenuView MediaBrowserCompat$MediaItem() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = SwitchCompat.m3079x50fd9e4a(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.write) && (((Toolbar.write) childAt.getLayoutParams()).write & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? BitmapDescriptorFactory.HUE_RED : (float) (i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Animator animator = this.PlaybackStateCompat$CustomAction;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.setBackgroundResource;
        if (animator3 != null) {
            animator3.cancel();
        }
        RatingCompat();
    }

    /* access modifiers changed from: package-private */
    public final void RatingCompat() {
        this.AppCompatViewInflater.MediaBrowserCompat$CustomActionResultReceiver = (float) MediaBrowserCompat$ItemReceiver(this.AlertController$RecycleListView);
        FloatingActionButton read = read();
        nIncContextCreate ninccontextcreate = this.AppCompatDialogFragment;
        ninccontextcreate.MediaBrowserCompat$CustomActionResultReceiver = (!this.AppCompatActivity || !MediaMetadataCompat()) ? BitmapDescriptorFactory.HUE_RED : 1.0f;
        ninccontextcreate.invalidateSelf();
        if (read != null) {
            read.setTranslationY(write(this.AppCompatActivity));
            read.setTranslationX((float) MediaBrowserCompat$ItemReceiver(this.AlertController$RecycleListView));
        }
        ActionMenuView MediaBrowserCompat$MediaItem = MediaBrowserCompat$MediaItem();
        if (MediaBrowserCompat$MediaItem != null) {
            MediaBrowserCompat$MediaItem.setAlpha(1.0f);
            if (!MediaMetadataCompat()) {
                MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem, 0, false);
            } else {
                MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem, this.AlertController$RecycleListView, this.AppCompatActivity);
            }
        }
    }

    public final CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver<BottomAppBar> write() {
        return new Behavior();
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect MediaBrowserCompat$CustomActionResultReceiver = new Rect();

        public final /* synthetic */ boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, int i) {
            Animator animator;
            Animator animator2;
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            FloatingActionButton read = bottomAppBar.read();
            boolean z = false;
            if (read != null) {
                ((CoordinatorLayout.read) read.getLayoutParams()).MediaBrowserCompat$ItemReceiver = 17;
                AnimatorListenerAdapter animatorListenerAdapter = bottomAppBar.PlaybackStateCompat;
                if (read.IconCompatParcelizer == null) {
                    read.IconCompatParcelizer = read.write();
                }
                ArrayList<Animator.AnimatorListener> arrayList = read.IconCompatParcelizer.MediaSessionCompat$Token;
                if (arrayList != null) {
                    arrayList.remove(animatorListenerAdapter);
                }
                AnimatorListenerAdapter animatorListenerAdapter2 = bottomAppBar.PlaybackStateCompat;
                if (read.IconCompatParcelizer == null) {
                    read.IconCompatParcelizer = read.write();
                }
                ArrayList<Animator.AnimatorListener> arrayList2 = read.IconCompatParcelizer.setBackgroundResource;
                if (arrayList2 != null) {
                    arrayList2.remove(animatorListenerAdapter2);
                }
                AnimatorListenerAdapter animatorListenerAdapter3 = bottomAppBar.PlaybackStateCompat;
                if (read.IconCompatParcelizer == null) {
                    read.IconCompatParcelizer = read.write();
                }
                nContextSetPriority ncontextsetpriority = read.IconCompatParcelizer;
                if (ncontextsetpriority.MediaSessionCompat$Token == null) {
                    ncontextsetpriority.MediaSessionCompat$Token = new ArrayList<>();
                }
                ncontextsetpriority.MediaSessionCompat$Token.add(animatorListenerAdapter3);
                AnimatorListenerAdapter animatorListenerAdapter4 = bottomAppBar.PlaybackStateCompat;
                if (read.IconCompatParcelizer == null) {
                    read.IconCompatParcelizer = read.write();
                }
                nContextSetPriority ncontextsetpriority2 = read.IconCompatParcelizer;
                if (ncontextsetpriority2.setBackgroundResource == null) {
                    ncontextsetpriority2.setBackgroundResource = new ArrayList<>();
                }
                ncontextsetpriority2.setBackgroundResource.add(animatorListenerAdapter4);
                Rect rect = this.MediaBrowserCompat$CustomActionResultReceiver;
                rect.set(0, 0, read.getMeasuredWidth(), read.getMeasuredHeight());
                read.write(rect);
                float height = (float) this.MediaBrowserCompat$CustomActionResultReceiver.height();
                if (height != bottomAppBar.AppCompatViewInflater.write) {
                    bottomAppBar.AppCompatViewInflater.write = height;
                    bottomAppBar.AppCompatDialogFragment.invalidateSelf();
                }
            }
            Animator animator3 = bottomAppBar.PlaybackStateCompat$CustomAction;
            if ((animator3 != null && animator3.isRunning()) || (((animator = bottomAppBar.AppCompatDelegateImpl$ListMenuDecorView) != null && animator.isRunning()) || ((animator2 = bottomAppBar.setBackgroundResource) != null && animator2.isRunning()))) {
                z = true;
            }
            if (!z) {
                bottomAppBar.RatingCompat();
            }
            coordinatorLayout.MediaBrowserCompat$ItemReceiver((View) bottomAppBar, i);
            return super.IconCompatParcelizer(coordinatorLayout, bottomAppBar, i);
        }

        public final /* bridge */ /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.setContentView && super.MediaBrowserCompat$CustomActionResultReceiver(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(View view) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            super.MediaBrowserCompat$ItemReceiver(bottomAppBar);
            FloatingActionButton read = bottomAppBar.read();
            if (read != null) {
                Rect rect = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (SwitchCompat.setCheckable(read)) {
                    rect.set(0, 0, read.getWidth(), read.getHeight());
                    read.write(rect);
                }
                read.clearAnimation();
                read.animate().translationY(((float) (-read.getPaddingBottom())) + ((float) (read.getMeasuredHeight() - this.MediaBrowserCompat$CustomActionResultReceiver.height()))).setInterpolator(zzlz.MediaBrowserCompat$ItemReceiver).setDuration(175);
            }
        }

        public final /* synthetic */ void write(View view) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            super.write(bottomAppBar);
            FloatingActionButton read = bottomAppBar.read();
            if (read != null) {
                read.clearAnimation();
                read.animate().translationY(bottomAppBar.write(bottomAppBar.AppCompatActivity)).setInterpolator(zzlz.MediaBrowserCompat$CustomActionResultReceiver).setDuration(225);
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public Parcelable onSaveInstanceState() {
        BottomAppBar$MediaBrowserCompat$ItemReceiver bottomAppBar$MediaBrowserCompat$ItemReceiver = new BottomAppBar$MediaBrowserCompat$ItemReceiver(super.onSaveInstanceState());
        bottomAppBar$MediaBrowserCompat$ItemReceiver.read = this.AlertController$RecycleListView;
        bottomAppBar$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = this.AppCompatActivity;
        return bottomAppBar$MediaBrowserCompat$ItemReceiver;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof BottomAppBar$MediaBrowserCompat$ItemReceiver)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BottomAppBar$MediaBrowserCompat$ItemReceiver bottomAppBar$MediaBrowserCompat$ItemReceiver = (BottomAppBar$MediaBrowserCompat$ItemReceiver) parcelable;
        super.onRestoreInstanceState(bottomAppBar$MediaBrowserCompat$ItemReceiver.write);
        this.AlertController$RecycleListView = bottomAppBar$MediaBrowserCompat$ItemReceiver.read;
        this.AppCompatActivity = bottomAppBar$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
    }

    public void setCradleVerticalOffset(float f) {
        if (f != this.AppCompatViewInflater.MediaBrowserCompat$ItemReceiver) {
            this.AppCompatViewInflater.MediaBrowserCompat$ItemReceiver = f;
            this.AppCompatDialogFragment.invalidateSelf();
        }
    }

    public void setFabAlignmentMode(int i) {
        if (this.AlertController$RecycleListView != i && SwitchCompat.setCheckable(this)) {
            Animator animator = this.setBackgroundResource;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.AppCompatActivity) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.AppCompatViewInflater.MediaBrowserCompat$CustomActionResultReceiver, (float) MediaBrowserCompat$ItemReceiver(i)});
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BottomAppBar.this.AppCompatViewInflater.MediaBrowserCompat$CustomActionResultReceiver = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BottomAppBar.this.AppCompatDialogFragment.invalidateSelf();
                    }
                });
                ofFloat.setDuration(300);
                arrayList.add(ofFloat);
            }
            IconCompatParcelizer(i, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.setBackgroundResource = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.setBackgroundResource = null;
                }
            });
            this.setBackgroundResource.start();
        }
        MediaBrowserCompat$ItemReceiver(i, this.AppCompatActivity);
        this.AlertController$RecycleListView = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != this.AppCompatViewInflater.IconCompatParcelizer) {
            this.AppCompatViewInflater.IconCompatParcelizer = f;
            this.AppCompatDialogFragment.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != this.AppCompatViewInflater.read) {
            this.AppCompatViewInflater.read = f;
            this.AppCompatDialogFragment.invalidateSelf();
        }
    }
}

package p040o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.VisibilityAwareImageButton;
import java.util.ArrayList;

/* renamed from: o.nDeviceDestroy */
public final class nDeviceDestroy extends nContextSetPriority {
    private InsetDrawable AppCompatViewInflater;

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$MediaItem() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void write() {
    }

    public nDeviceDestroy(VisibilityAwareImageButton visibilityAwareImageButton, CreditCardWorkflowActivity creditCardWorkflowActivity) {
        super(visibilityAwareImageButton, creditCardWorkflowActivity);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(ColorStateList colorStateList) {
        if (this.AppCompatDialogFragment instanceof RippleDrawable) {
            ((RippleDrawable) this.AppCompatDialogFragment).setColor(AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(colorStateList));
        } else {
            super.IconCompatParcelizer(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.ActionMenuItemView.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(RatingCompat, MediaBrowserCompat$ItemReceiver(f, f3));
            stateListAnimator.addState(MediaDescriptionCompat, MediaBrowserCompat$ItemReceiver(f, f2));
            stateListAnimator.addState(read, MediaBrowserCompat$ItemReceiver(f, f2));
            stateListAnimator.addState(IconCompatParcelizer, MediaBrowserCompat$ItemReceiver(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.ActionMenuItemView, "elevation", new float[]{f}).setDuration(0));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.ActionMenuItemView, View.TRANSLATION_Z, new float[]{this.ActionMenuItemView.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.ActionMenuItemView, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(MediaBrowserCompat$CustomActionResultReceiver);
            stateListAnimator.addState(MediaBrowserCompat$ItemReceiver, animatorSet);
            stateListAnimator.addState(write, MediaBrowserCompat$ItemReceiver(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
            this.ActionMenuItemView.setStateListAnimator(stateListAnimator);
        }
        if (this.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver()) {
            RatingCompat();
        }
    }

    private Animator MediaBrowserCompat$ItemReceiver(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.ActionMenuItemView, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.ActionMenuItemView, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(MediaBrowserCompat$CustomActionResultReceiver);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        RatingCompat();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(Rect rect) {
        if (this.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver()) {
            this.AppCompatViewInflater = new InsetDrawable(this.AppCompatDialogFragment, rect.left, rect.top, rect.right, rect.bottom);
            this.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(this.AppCompatViewInflater);
            return;
        }
        this.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(this.AppCompatDialogFragment);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.ActionMenuItemView.isEnabled()) {
            this.ActionMenuItemView.setElevation(this.MediaSessionCompat$QueueItem);
            if (this.ActionMenuItemView.isPressed()) {
                this.ActionMenuItemView.setTranslationZ(this.PlaybackStateCompat);
            } else if (this.ActionMenuItemView.isFocused() || this.ActionMenuItemView.isHovered()) {
                this.ActionMenuItemView.setTranslationZ(this.setHasDecor);
            } else {
                this.ActionMenuItemView.setTranslationZ(BitmapDescriptorFactory.HUE_RED);
            }
        } else {
            this.ActionMenuItemView.setElevation(BitmapDescriptorFactory.HUE_RED);
            this.ActionMenuItemView.setTranslationZ(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* access modifiers changed from: package-private */
    public final nIncAllocationCreateTyped IconCompatParcelizer() {
        return new nElementCreate();
    }

    /* access modifiers changed from: package-private */
    public final GradientDrawable MediaBrowserCompat$ItemReceiver() {
        return new write();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Rect rect) {
        if (this.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver()) {
            this.AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer();
            float elevation = this.ActionMenuItemView.getElevation() + this.PlaybackStateCompat;
            int ceil = (int) Math.ceil((double) elevation);
            int ceil2 = (int) Math.ceil((double) (elevation * 1.5f));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* renamed from: o.nDeviceDestroy$write */
    static class write extends GradientDrawable {
        public final boolean isStateful() {
            return true;
        }

        write() {
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        GradientDrawable MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.setShape(1);
        MediaBrowserCompat$ItemReceiver.setColor(-1);
        this.setContentView = setBaselineAligned.MediaBrowserCompat$MediaItem(MediaBrowserCompat$ItemReceiver);
        setBaselineAligned.read(this.setContentView, colorStateList);
        if (mode != null) {
            setBaselineAligned.IconCompatParcelizer(this.setContentView, mode);
        }
        if (i > 0) {
            this.MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{this.MediaBrowserCompat$MediaItem, this.setContentView});
        } else {
            this.MediaBrowserCompat$MediaItem = null;
            drawable = this.setContentView;
        }
        this.AppCompatDialogFragment = new RippleDrawable(AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(colorStateList2), drawable, (Drawable) null);
        this.MediaMetadataCompat = this.AppCompatDialogFragment;
        this.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(this.AppCompatDialogFragment);
    }
}

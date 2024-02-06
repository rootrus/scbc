package p059me.relex.circleindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import p040o.C9831xbadb2fd9;
import p040o.TouchPointFillInfoActivity;
import p040o.TouchPointInstructionActivity;

/* renamed from: me.relex.circleindicator.BaseCircleIndicator */
class BaseCircleIndicator extends LinearLayout {
    protected int IconCompatParcelizer = -1;
    private Animator MediaBrowserCompat$CustomActionResultReceiver;
    private Animator MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver = -1;
    private int MediaDescriptionCompat = -1;
    private int MediaMetadataCompat;
    private int RatingCompat = -1;
    private Animator read;
    private Animator write;

    /* renamed from: me.relex.circleindicator.BaseCircleIndicator$read */
    public interface read {
    }

    public void setIndicatorCreatedListener(read read2) {
    }

    public BaseCircleIndicator(Context context) {
        super(context);
        write(write(context, (AttributeSet) null));
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        write(write(context, attributeSet));
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        write(write(context, attributeSet));
    }

    private static TouchPointFillInfoActivity write(Context context, AttributeSet attributeSet) {
        TouchPointFillInfoActivity touchPointFillInfoActivity = new TouchPointFillInfoActivity();
        if (attributeSet == null) {
            return touchPointFillInfoActivity;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9831xbadb2fd9.BaseCircleIndicator);
        touchPointFillInfoActivity.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getDimensionPixelSize(C9831xbadb2fd9.BaseCircleIndicator_ci_width, -1);
        touchPointFillInfoActivity.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getDimensionPixelSize(C9831xbadb2fd9.BaseCircleIndicator_ci_height, -1);
        touchPointFillInfoActivity.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getDimensionPixelSize(C9831xbadb2fd9.BaseCircleIndicator_ci_margin, -1);
        touchPointFillInfoActivity.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getResourceId(C9831xbadb2fd9.BaseCircleIndicator_ci_animator, TouchPointInstructionActivity.IconCompatParcelizer.scale_with_alpha);
        touchPointFillInfoActivity.IconCompatParcelizer = obtainStyledAttributes.getResourceId(C9831xbadb2fd9.BaseCircleIndicator_ci_animator_reverse, 0);
        touchPointFillInfoActivity.write = obtainStyledAttributes.getResourceId(C9831xbadb2fd9.BaseCircleIndicator_ci_drawable, TouchPointInstructionActivity.write.white_radius);
        touchPointFillInfoActivity.MediaMetadataCompat = obtainStyledAttributes.getResourceId(C9831xbadb2fd9.BaseCircleIndicator_ci_drawable_unselected, touchPointFillInfoActivity.write);
        touchPointFillInfoActivity.RatingCompat = obtainStyledAttributes.getInt(C9831xbadb2fd9.BaseCircleIndicator_ci_orientation, -1);
        touchPointFillInfoActivity.read = obtainStyledAttributes.getInt(C9831xbadb2fd9.BaseCircleIndicator_ci_gravity, -1);
        obtainStyledAttributes.recycle();
        return touchPointFillInfoActivity;
    }

    public void write(TouchPointFillInfoActivity touchPointFillInfoActivity) {
        int i = 1;
        int applyDimension = (int) (TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()) + 0.5f);
        this.MediaBrowserCompat$SearchResultReceiver = touchPointFillInfoActivity.MediaBrowserCompat$MediaItem < 0 ? applyDimension : touchPointFillInfoActivity.MediaBrowserCompat$MediaItem;
        this.RatingCompat = touchPointFillInfoActivity.MediaBrowserCompat$ItemReceiver < 0 ? applyDimension : touchPointFillInfoActivity.MediaBrowserCompat$ItemReceiver;
        if (touchPointFillInfoActivity.MediaBrowserCompat$SearchResultReceiver >= 0) {
            applyDimension = touchPointFillInfoActivity.MediaBrowserCompat$SearchResultReceiver;
        }
        this.MediaDescriptionCompat = applyDimension;
        this.write = AnimatorInflater.loadAnimator(getContext(), touchPointFillInfoActivity.MediaBrowserCompat$CustomActionResultReceiver);
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), touchPointFillInfoActivity.MediaBrowserCompat$CustomActionResultReceiver);
        this.read = loadAnimator;
        loadAnimator.setDuration(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer(touchPointFillInfoActivity);
        Animator IconCompatParcelizer2 = IconCompatParcelizer(touchPointFillInfoActivity);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setDuration(0);
        this.MediaBrowserCompat$MediaItem = touchPointFillInfoActivity.write == 0 ? TouchPointInstructionActivity.write.white_radius : touchPointFillInfoActivity.write;
        this.MediaMetadataCompat = touchPointFillInfoActivity.MediaMetadataCompat == 0 ? touchPointFillInfoActivity.write : touchPointFillInfoActivity.MediaMetadataCompat;
        if (touchPointFillInfoActivity.RatingCompat != 1) {
            i = 0;
        }
        setOrientation(i);
        setGravity(touchPointFillInfoActivity.read >= 0 ? touchPointFillInfoActivity.read : 17);
    }

    private Animator IconCompatParcelizer(TouchPointFillInfoActivity touchPointFillInfoActivity) {
        if (touchPointFillInfoActivity.IconCompatParcelizer != 0) {
            return AnimatorInflater.loadAnimator(getContext(), touchPointFillInfoActivity.IconCompatParcelizer);
        }
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), touchPointFillInfoActivity.MediaBrowserCompat$CustomActionResultReceiver);
        loadAnimator.setInterpolator(new BaseCircleIndicator$MediaBrowserCompat$ItemReceiver());
        return loadAnimator;
    }

    public void write(int i, int i2) {
        if (this.read.isRunning()) {
            this.read.end();
            this.read.cancel();
        }
        if (this.MediaBrowserCompat$ItemReceiver.isRunning()) {
            this.MediaBrowserCompat$ItemReceiver.end();
            this.MediaBrowserCompat$ItemReceiver.cancel();
        }
        int childCount = getChildCount();
        if (i < childCount) {
            removeViews(i, childCount - i);
        } else if (i > childCount) {
            int orientation = getOrientation();
            for (int i3 = 0; i3 < i - childCount; i3++) {
                View view = new View(getContext());
                LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
                generateDefaultLayoutParams.width = this.MediaBrowserCompat$SearchResultReceiver;
                generateDefaultLayoutParams.height = this.RatingCompat;
                if (orientation == 0) {
                    generateDefaultLayoutParams.leftMargin = this.MediaDescriptionCompat;
                    generateDefaultLayoutParams.rightMargin = this.MediaDescriptionCompat;
                } else {
                    generateDefaultLayoutParams.topMargin = this.MediaDescriptionCompat;
                    generateDefaultLayoutParams.bottomMargin = this.MediaDescriptionCompat;
                }
                addView(view, generateDefaultLayoutParams);
            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            View childAt = getChildAt(i4);
            if (i2 == i4) {
                childAt.setBackgroundResource(this.MediaBrowserCompat$MediaItem);
                this.read.setTarget(childAt);
                this.read.start();
                this.read.end();
            } else {
                childAt.setBackgroundResource(this.MediaMetadataCompat);
                this.MediaBrowserCompat$ItemReceiver.setTarget(childAt);
                this.MediaBrowserCompat$ItemReceiver.start();
                this.MediaBrowserCompat$ItemReceiver.end();
            }
        }
        this.IconCompatParcelizer = i2;
    }

    public void IconCompatParcelizer(int i) {
        View childAt;
        if (this.IconCompatParcelizer != i) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.isRunning()) {
                this.MediaBrowserCompat$CustomActionResultReceiver.end();
                this.MediaBrowserCompat$CustomActionResultReceiver.cancel();
            }
            if (this.write.isRunning()) {
                this.write.end();
                this.write.cancel();
            }
            int i2 = this.IconCompatParcelizer;
            if (i2 >= 0 && (childAt = getChildAt(i2)) != null) {
                childAt.setBackgroundResource(this.MediaMetadataCompat);
                this.MediaBrowserCompat$CustomActionResultReceiver.setTarget(childAt);
                this.MediaBrowserCompat$CustomActionResultReceiver.start();
            }
            View childAt2 = getChildAt(i);
            if (childAt2 != null) {
                childAt2.setBackgroundResource(this.MediaBrowserCompat$MediaItem);
                this.write.setTarget(childAt2);
                this.write.start();
            }
            this.IconCompatParcelizer = i;
        }
    }
}

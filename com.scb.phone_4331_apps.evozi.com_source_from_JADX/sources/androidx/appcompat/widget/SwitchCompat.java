package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.AppCompatDelegateImpl$ListMenuDecorView;
import p040o.setBaselineAligned;
import p040o.setDefaultActionButtonContentDescription;
import p040o.setNavigationContentDescription;
import p040o.setWindowTitle;

public class SwitchCompat extends CompoundButton {
    private static final Property<SwitchCompat, Float> MediaBrowserCompat$ItemReceiver = new Property<SwitchCompat, Float>(Float.class, "thumbPos") {
        /* renamed from: IconCompatParcelizer */
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.read);
        }

        /* renamed from: IconCompatParcelizer */
        public final void set(SwitchCompat switchCompat, Float f) {
            switchCompat.read(f.floatValue());
        }
    };
    private static final int[] write = {16842912};
    private final TextPaint ActionMenuItemView;
    private int AlertController$RecycleListView;
    private int AppCompatActivity;
    private final Rect AppCompatDelegateImpl$ListMenuDecorView;
    private TransformationMethod AppCompatDialogFragment;
    private CharSequence AppCompatViewInflater;
    private VelocityTracker ExpandedMenuView;
    ObjectAnimator IconCompatParcelizer;
    private int Keep;
    private Drawable ListMenuItemView;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f10x50fd9e4a;
    private Layout MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private Layout MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private boolean MediaSessionCompat$Token;
    private int ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private int PlaybackStateCompat$CustomAction;
    private boolean RatingCompat;
    float read;
    private CharSequence setBackgroundResource;
    private int setCheckable;
    private ColorStateList setChecked;
    private ColorStateList setContentView;
    private Drawable setExpandedFormat;
    private ColorStateList setForceShowIcon;
    private PorterDuff.Mode setGroupDividerEnabled;
    private int setHasDecor;
    private int setIcon;
    private int setItemInvoker;
    private PorterDuff.Mode setPadding;
    private float setPopupCallback;
    private int setShortcut;
    private float setTitle;

    private static float IconCompatParcelizer(float f, float f2, float f3) {
        return f >= f2 ? f > f3 ? f3 : f : f2;
    }

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setChecked = null;
        this.setPadding = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.RatingCompat = false;
        this.setForceShowIcon = null;
        this.setGroupDividerEnabled = null;
        this.MediaBrowserCompat$MediaItem = false;
        this.MediaBrowserCompat$SearchResultReceiver = false;
        this.ExpandedMenuView = VelocityTracker.obtain();
        this.AppCompatDelegateImpl$ListMenuDecorView = new Rect();
        this.ActionMenuItemView = new TextPaint(1);
        Resources resources = getResources();
        this.ActionMenuItemView.density = resources.getDisplayMetrics().density;
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat, i, 0));
        Drawable MediaBrowserCompat$ItemReceiver2 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_android_thumb);
        this.setExpandedFormat = MediaBrowserCompat$ItemReceiver2;
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            MediaBrowserCompat$ItemReceiver2.setCallback(this);
        }
        Drawable MediaBrowserCompat$ItemReceiver3 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_track);
        this.ListMenuItemView = MediaBrowserCompat$ItemReceiver3;
        if (MediaBrowserCompat$ItemReceiver3 != null) {
            MediaBrowserCompat$ItemReceiver3.setCallback(this);
        }
        this.AppCompatViewInflater = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_android_textOn);
        this.setBackgroundResource = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_android_textOff);
        this.MediaSessionCompat$Token = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_showText, true);
        this.setCheckable = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_thumbTextPadding, 0);
        this.PlaybackStateCompat$CustomAction = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_switchMinWidth, 0);
        this.AlertController$RecycleListView = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_switchPadding, 0);
        this.f10x50fd9e4a = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_splitTrack, false);
        ColorStateList MediaBrowserCompat$CustomActionResultReceiver2 = mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_thumbTint);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            this.setChecked = MediaBrowserCompat$CustomActionResultReceiver2;
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
        }
        PorterDuff.Mode write2 = setWindowTitle.write(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.setPadding != write2) {
            this.setPadding = write2;
            this.RatingCompat = true;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver || this.RatingCompat) {
            read();
        }
        ColorStateList MediaBrowserCompat$CustomActionResultReceiver3 = mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_trackTint);
        if (MediaBrowserCompat$CustomActionResultReceiver3 != null) {
            this.setForceShowIcon = MediaBrowserCompat$CustomActionResultReceiver3;
            this.MediaBrowserCompat$MediaItem = true;
        }
        PorterDuff.Mode write3 = setWindowTitle.write(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.setGroupDividerEnabled != write3) {
            this.setGroupDividerEnabled = write3;
            this.MediaBrowserCompat$SearchResultReceiver = true;
        }
        if (this.MediaBrowserCompat$MediaItem || this.MediaBrowserCompat$SearchResultReceiver) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
        int resourceId = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SwitchCompat_switchTextAppearance, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.setShortcut = viewConfiguration.getScaledTouchSlop();
        this.MediaMetadataCompat = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTextAppearance(Context context, int i) {
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(i, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance));
        ColorStateList MediaBrowserCompat$CustomActionResultReceiver2 = mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColor);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            this.setContentView = MediaBrowserCompat$CustomActionResultReceiver2;
        } else {
            this.setContentView = getTextColors();
        }
        int dimensionPixelSize = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0) {
            float f = (float) dimensionPixelSize;
            if (f != this.ActionMenuItemView.getTextSize()) {
                this.ActionMenuItemView.setTextSize(f);
                requestLayout();
            }
        }
        MediaBrowserCompat$CustomActionResultReceiver(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_typeface, -1), mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textStyle, -1));
        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_textAllCaps, false)) {
            this.AppCompatDialogFragment = new AlertController$RecycleListView.read(getContext());
        } else {
            this.AppCompatDialogFragment = null;
        }
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i != 2) {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        setSwitchTypeface(typeface, i2);
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        float f = BitmapDescriptorFactory.HUE_RED;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface2);
            int i2 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i;
            TextPaint textPaint = this.ActionMenuItemView;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.ActionMenuItemView;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.ActionMenuItemView.setFakeBoldText(false);
        this.ActionMenuItemView.setTextSkewX(BitmapDescriptorFactory.HUE_RED);
        setSwitchTypeface(typeface);
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.ActionMenuItemView.getTypeface() != null && !this.ActionMenuItemView.getTypeface().equals(typeface)) || (this.ActionMenuItemView.getTypeface() == null && typeface != null)) {
            this.ActionMenuItemView.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchPadding(int i) {
        this.AlertController$RecycleListView = i;
        requestLayout();
    }

    public void setSwitchMinWidth(int i) {
        this.PlaybackStateCompat$CustomAction = i;
        requestLayout();
    }

    public void setThumbTextPadding(int i) {
        this.setCheckable = i;
        requestLayout();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.ListMenuItemView;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.ListMenuItemView = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.setForceShowIcon = colorStateList;
        this.MediaBrowserCompat$MediaItem = true;
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.setGroupDividerEnabled = mode;
        this.MediaBrowserCompat$SearchResultReceiver = true;
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.ListMenuItemView == null) {
            return;
        }
        if (this.MediaBrowserCompat$MediaItem || this.MediaBrowserCompat$SearchResultReceiver) {
            Drawable mutate = this.ListMenuItemView.mutate();
            this.ListMenuItemView = mutate;
            if (this.MediaBrowserCompat$MediaItem) {
                setBaselineAligned.read(mutate, this.setForceShowIcon);
            }
            if (this.MediaBrowserCompat$SearchResultReceiver) {
                setBaselineAligned.IconCompatParcelizer(this.ListMenuItemView, this.setGroupDividerEnabled);
            }
            if (this.ListMenuItemView.isStateful()) {
                this.ListMenuItemView.setState(getDrawableState());
            }
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.setExpandedFormat;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.setExpandedFormat = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(getContext(), i));
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.setChecked = colorStateList;
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        read();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.setPadding = mode;
        this.RatingCompat = true;
        read();
    }

    private void read() {
        if (this.setExpandedFormat == null) {
            return;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver || this.RatingCompat) {
            Drawable mutate = this.setExpandedFormat.mutate();
            this.setExpandedFormat = mutate;
            if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                setBaselineAligned.read(mutate, this.setChecked);
            }
            if (this.RatingCompat) {
                setBaselineAligned.IconCompatParcelizer(this.setExpandedFormat, this.setPadding);
            }
            if (this.setExpandedFormat.isStateful()) {
                this.setExpandedFormat.setState(getDrawableState());
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f10x50fd9e4a = z;
        invalidate();
    }

    public void setTextOn(CharSequence charSequence) {
        this.AppCompatViewInflater = charSequence;
        requestLayout();
    }

    public void setTextOff(CharSequence charSequence) {
        this.setBackgroundResource = charSequence;
        requestLayout();
    }

    public void setShowText(boolean z) {
        if (this.MediaSessionCompat$Token != z) {
            this.MediaSessionCompat$Token = z;
            requestLayout();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.MediaSessionCompat$Token) {
            if (this.MediaSessionCompat$QueueItem == null) {
                this.MediaSessionCompat$QueueItem = MediaBrowserCompat$ItemReceiver(this.AppCompatViewInflater);
            }
            if (this.MediaDescriptionCompat == null) {
                this.MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver(this.setBackgroundResource);
            }
        }
        Rect rect = this.AppCompatDelegateImpl$ListMenuDecorView;
        Drawable drawable = this.setExpandedFormat;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.setExpandedFormat.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.setExpandedFormat.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.setItemInvoker = Math.max(this.MediaSessionCompat$Token ? Math.max(this.MediaSessionCompat$QueueItem.getWidth(), this.MediaDescriptionCompat.getWidth()) + (this.setCheckable << 1) : 0, i4);
        Drawable drawable2 = this.ListMenuItemView;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.ListMenuItemView.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.setExpandedFormat;
        if (drawable3 != null) {
            Rect read2 = setWindowTitle.read(drawable3);
            i6 = Math.max(i6, read2.left);
            i7 = Math.max(i7, read2.right);
        }
        int max = Math.max(this.PlaybackStateCompat$CustomAction, (this.setItemInvoker << 1) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.AppCompatActivity = max;
        this.ParcelableVolumeInfo = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.AppCompatViewInflater : this.setBackgroundResource;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    private Layout MediaBrowserCompat$ItemReceiver(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.AppCompatDialogFragment;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.ActionMenuItemView;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
    }

    private boolean read(float f, float f2) {
        if (this.setExpandedFormat == null) {
            return false;
        }
        int IconCompatParcelizer2 = IconCompatParcelizer();
        this.setExpandedFormat.getPadding(this.AppCompatDelegateImpl$ListMenuDecorView);
        int i = this.Keep;
        int i2 = this.setShortcut;
        int i3 = (this.setHasDecor + IconCompatParcelizer2) - i2;
        int i4 = this.setItemInvoker;
        int i5 = this.AppCompatDelegateImpl$ListMenuDecorView.left;
        int i6 = this.AppCompatDelegateImpl$ListMenuDecorView.right;
        int i7 = this.setShortcut;
        int i8 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (f <= ((float) i3) || f >= ((float) (i4 + i3 + i5 + i6 + i7)) || f2 <= ((float) (i - i2)) || f2 >= ((float) (i8 + i7))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.ExpandedMenuView
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009a
            r2 = 2
            if (r0 == r1) goto L_0x0086
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x0086
            goto L_0x00b4
        L_0x0016:
            int r0 = r6.setIcon
            if (r0 == r1) goto L_0x0052
            if (r0 != r2) goto L_0x00b4
            float r7 = r7.getX()
            int r0 = r6.MediaBrowserCompat$MediaItem()
            float r2 = r6.setPopupCallback
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0030
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x0038
        L_0x0030:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0036
            r2 = r3
            goto L_0x0038
        L_0x0036:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0038:
            boolean r0 = p040o.setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(r6)
            if (r0 == 0) goto L_0x003f
            float r2 = -r2
        L_0x003f:
            float r0 = r6.read
            float r0 = r0 + r2
            float r0 = IconCompatParcelizer(r0, r4, r3)
            float r2 = r6.read
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0051
            r6.setPopupCallback = r7
            r6.read((float) r0)
        L_0x0051:
            return r1
        L_0x0052:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.setPopupCallback
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.setShortcut
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x0078
            float r4 = r6.setTitle
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.setShortcut
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b4
        L_0x0078:
            r6.setIcon = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.setPopupCallback = r0
            r6.setTitle = r3
            return r1
        L_0x0086:
            int r0 = r6.setIcon
            if (r0 != r2) goto L_0x0091
            r6.read((android.view.MotionEvent) r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0091:
            r0 = 0
            r6.setIcon = r0
            android.view.VelocityTracker r0 = r6.ExpandedMenuView
            r0.clear()
            goto L_0x00b4
        L_0x009a:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b4
            boolean r3 = r6.read(r0, r2)
            if (r3 == 0) goto L_0x00b4
            r6.setIcon = r1
            r6.setPopupCallback = r0
            r6.setTitle = r2
        L_0x00b4:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void MediaBrowserCompat$ItemReceiver(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private void read(MotionEvent motionEvent) {
        this.setIcon = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.ExpandedMenuView.computeCurrentVelocity(1000);
            float xVelocity = this.ExpandedMenuView.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.MediaMetadataCompat)) {
                z = MediaBrowserCompat$ItemReceiver();
            } else if (!setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(this) ? xVelocity <= BitmapDescriptorFactory.HUE_RED : xVelocity >= BitmapDescriptorFactory.HUE_RED) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        MediaBrowserCompat$ItemReceiver(motionEvent);
    }

    private void IconCompatParcelizer(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, MediaBrowserCompat$ItemReceiver, new float[]{z ? 1.0f : BitmapDescriptorFactory.HUE_RED});
        this.IconCompatParcelizer = ofFloat;
        ofFloat.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.IconCompatParcelizer.setAutoCancel(true);
        }
        this.IconCompatParcelizer.start();
    }

    private void write() {
        ObjectAnimator objectAnimator = this.IconCompatParcelizer;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean MediaBrowserCompat$ItemReceiver() {
        return this.read > 0.5f;
    }

    /* access modifiers changed from: package-private */
    public void read(float f) {
        this.read = f;
        invalidate();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !p040o.SwitchCompat.setCheckable(this)) {
            write();
            read(isChecked ? 1.0f : BitmapDescriptorFactory.HUE_RED);
            return;
        }
        IconCompatParcelizer(isChecked);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        super.onLayout(z, i, i2, i3, i4);
        int i12 = 0;
        if (this.setExpandedFormat != null) {
            Rect rect = this.AppCompatDelegateImpl$ListMenuDecorView;
            Drawable drawable = this.ListMenuItemView;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect read2 = setWindowTitle.read(this.setExpandedFormat);
            i5 = Math.max(0, read2.left - rect.left);
            i12 = Math.max(0, read2.right - rect.right);
        } else {
            i5 = 0;
        }
        if (setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.AppCompatActivity + i7) - i5) - i12;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i12;
            i7 = (i6 - this.AppCompatActivity) + i5 + i12;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.ParcelableVolumeInfo;
            i11 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i11 = getPaddingTop();
            i10 = this.ParcelableVolumeInfo;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i8 = i9 - this.ParcelableVolumeInfo;
            this.setHasDecor = i7;
            this.Keep = i8;
            this.MediaSessionCompat$ResultReceiverWrapper = i9;
            this.PlaybackStateCompat = i6;
        }
        int i13 = i10 + i11;
        i8 = i11;
        i9 = i13;
        this.setHasDecor = i7;
        this.Keep = i8;
        this.MediaSessionCompat$ResultReceiverWrapper = i9;
        this.PlaybackStateCompat = i6;
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.AppCompatDelegateImpl$ListMenuDecorView;
        int i3 = this.setHasDecor;
        int i4 = this.Keep;
        int i5 = this.PlaybackStateCompat;
        int i6 = this.MediaSessionCompat$ResultReceiverWrapper;
        int IconCompatParcelizer2 = IconCompatParcelizer() + i3;
        Drawable drawable = this.setExpandedFormat;
        if (drawable != null) {
            rect = setWindowTitle.read(drawable);
        } else {
            rect = setWindowTitle.write;
        }
        Drawable drawable2 = this.ListMenuItemView;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            IconCompatParcelizer2 += rect2.left;
            if (rect != null) {
                if (rect.left > rect2.left) {
                    i3 += rect.left - rect2.left;
                }
                i = rect.top > rect2.top ? (rect.top - rect2.top) + i4 : i4;
                if (rect.right > rect2.right) {
                    i5 -= rect.right - rect2.right;
                }
                if (rect.bottom > rect2.bottom) {
                    i2 = i6 - (rect.bottom - rect2.bottom);
                    this.ListMenuItemView.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.ListMenuItemView.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.setExpandedFormat;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i7 = IconCompatParcelizer2 - rect2.left;
            int i8 = IconCompatParcelizer2 + this.setItemInvoker + rect2.right;
            this.setExpandedFormat.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                setBaselineAligned.MediaBrowserCompat$ItemReceiver(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.AppCompatDelegateImpl$ListMenuDecorView;
        Drawable drawable = this.ListMenuItemView;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.Keep;
        int i3 = this.MediaSessionCompat$ResultReceiverWrapper;
        int i4 = rect.top;
        int i5 = rect.bottom;
        Drawable drawable2 = this.setExpandedFormat;
        if (drawable != null) {
            if (!this.f10x50fd9e4a || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect read2 = setWindowTitle.read(drawable2);
                drawable2.copyBounds(rect);
                rect.left += read2.left;
                rect.right -= read2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = MediaBrowserCompat$ItemReceiver() ? this.MediaSessionCompat$QueueItem : this.MediaDescriptionCompat;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.setContentView;
            if (colorStateList != null) {
                this.ActionMenuItemView.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.ActionMenuItemView.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) ((((i2 + i4) + (i3 - i5)) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public int getCompoundPaddingLeft() {
        if (!setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.AppCompatActivity;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.AlertController$RecycleListView : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.AppCompatActivity;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.AlertController$RecycleListView : compoundPaddingRight;
    }

    private int IconCompatParcelizer() {
        float f;
        if (setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(this)) {
            f = 1.0f - this.read;
        } else {
            f = this.read;
        }
        return (int) ((f * ((float) MediaBrowserCompat$MediaItem())) + 0.5f);
    }

    private int MediaBrowserCompat$MediaItem() {
        Rect rect;
        Drawable drawable = this.ListMenuItemView;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.AppCompatDelegateImpl$ListMenuDecorView;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.setExpandedFormat;
        if (drawable2 != null) {
            rect = setWindowTitle.read(drawable2);
        } else {
            rect = setWindowTitle.write;
        }
        return ((((this.AppCompatActivity - this.setItemInvoker) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, write);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.setExpandedFormat;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.ListMenuItemView;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.setExpandedFormat;
        if (drawable != null) {
            setBaselineAligned.IconCompatParcelizer(drawable, f, f2);
        }
        Drawable drawable2 = this.ListMenuItemView;
        if (drawable2 != null) {
            setBaselineAligned.IconCompatParcelizer(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.setExpandedFormat || drawable == this.ListMenuItemView;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.setExpandedFormat;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.ListMenuItemView;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.IconCompatParcelizer;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.IconCompatParcelizer.end();
            this.IconCompatParcelizer = null;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.AppCompatViewInflater : this.setBackgroundResource;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(setNavigationContentDescription.read((TextView) this, callback));
    }
}

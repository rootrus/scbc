package p040o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.VisibilityAwareImageButton;
import java.util.ArrayList;
import java.util.Iterator;
import p040o.Iterables;
import p040o.nAllocationSetSurface;
import p040o.nIncDeviceDestroy;

/* renamed from: o.nContextSetPriority */
public class nContextSetPriority implements ViewTreeObserver.OnPreDrawListener {
    static final int[] IconCompatParcelizer = {16843623, 16842910};
    static final TimeInterpolator MediaBrowserCompat$CustomActionResultReceiver = zzlz.MediaBrowserCompat$ItemReceiver;
    static final int[] MediaBrowserCompat$ItemReceiver = {16842910};
    static final int[] MediaDescriptionCompat = {16843623, 16842908, 16842910};
    static final int[] RatingCompat = {16842919, 16842910};
    static final int[] read = {16842908, 16842910};
    static final int[] write = new int[0];
    public final VisibilityAwareImageButton ActionMenuItemView;
    public float AlertController$RecycleListView = 1.0f;
    nIncContextDestroy AppCompatActivity;
    final CreditCardWorkflowActivity AppCompatDelegateImpl$ListMenuDecorView;
    Drawable AppCompatDialogFragment;
    private nClosureSetGlobal AppCompatViewInflater;
    public ViewTreeObserver.OnPreDrawListener Keep;
    public nIncAllocationCreateTyped MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$SearchResultReceiver = 0;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public nClosureSetGlobal f2608x50fd9e4a;
    Drawable MediaMetadataCompat;
    public float MediaSessionCompat$QueueItem;
    public Animator MediaSessionCompat$ResultReceiverWrapper;
    public ArrayList<Animator.AnimatorListener> MediaSessionCompat$Token;
    public nClosureSetGlobal ParcelableVolumeInfo;
    public float PlaybackStateCompat;
    public int PlaybackStateCompat$CustomAction;
    public ArrayList<Animator.AnimatorListener> setBackgroundResource;
    private float setCheckable;
    public nClosureSetGlobal setChecked;
    public Drawable setContentView;
    public final Matrix setExpandedFormat = new Matrix();
    public float setHasDecor;
    private final nIncDeviceDestroy setIcon;
    private final Rect setItemInvoker = new Rect();
    private final RectF setPadding = new RectF();
    private final RectF setShortcut = new RectF();

    /* renamed from: o.nContextSetPriority$IconCompatParcelizer */
    interface IconCompatParcelizer {
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$CustomActionResultReceiver(Rect rect) {
    }

    public boolean MediaBrowserCompat$MediaItem() {
        return true;
    }

    public nContextSetPriority(VisibilityAwareImageButton visibilityAwareImageButton, CreditCardWorkflowActivity creditCardWorkflowActivity) {
        this.ActionMenuItemView = visibilityAwareImageButton;
        this.AppCompatDelegateImpl$ListMenuDecorView = creditCardWorkflowActivity;
        nIncDeviceDestroy nincdevicedestroy = new nIncDeviceDestroy();
        this.setIcon = nincdevicedestroy;
        int[] iArr = RatingCompat;
        ValueAnimator read2 = read(new C1398x111fa3d2(this));
        nIncDeviceDestroy.read read3 = new nIncDeviceDestroy.read(iArr, read2);
        read2.addListener(nincdevicedestroy.MediaBrowserCompat$ItemReceiver);
        nincdevicedestroy.MediaBrowserCompat$CustomActionResultReceiver.add(read3);
        nIncDeviceDestroy nincdevicedestroy2 = this.setIcon;
        int[] iArr2 = MediaDescriptionCompat;
        ValueAnimator read4 = read(new write());
        nIncDeviceDestroy.read read5 = new nIncDeviceDestroy.read(iArr2, read4);
        read4.addListener(nincdevicedestroy2.MediaBrowserCompat$ItemReceiver);
        nincdevicedestroy2.MediaBrowserCompat$CustomActionResultReceiver.add(read5);
        nIncDeviceDestroy nincdevicedestroy3 = this.setIcon;
        int[] iArr3 = read;
        ValueAnimator read6 = read(new write());
        nIncDeviceDestroy.read read7 = new nIncDeviceDestroy.read(iArr3, read6);
        read6.addListener(nincdevicedestroy3.MediaBrowserCompat$ItemReceiver);
        nincdevicedestroy3.MediaBrowserCompat$CustomActionResultReceiver.add(read7);
        nIncDeviceDestroy nincdevicedestroy4 = this.setIcon;
        int[] iArr4 = IconCompatParcelizer;
        ValueAnimator read8 = read(new write());
        nIncDeviceDestroy.read read9 = new nIncDeviceDestroy.read(iArr4, read8);
        read8.addListener(nincdevicedestroy4.MediaBrowserCompat$ItemReceiver);
        nincdevicedestroy4.MediaBrowserCompat$CustomActionResultReceiver.add(read9);
        nIncDeviceDestroy nincdevicedestroy5 = this.setIcon;
        int[] iArr5 = MediaBrowserCompat$ItemReceiver;
        ValueAnimator read10 = read(new nContextSetPriority$MediaBrowserCompat$ItemReceiver(this));
        nIncDeviceDestroy.read read11 = new nIncDeviceDestroy.read(iArr5, read10);
        read10.addListener(nincdevicedestroy5.MediaBrowserCompat$ItemReceiver);
        nincdevicedestroy5.MediaBrowserCompat$CustomActionResultReceiver.add(read11);
        nIncDeviceDestroy nincdevicedestroy6 = this.setIcon;
        int[] iArr6 = write;
        ValueAnimator read12 = read(new read(this));
        nIncDeviceDestroy.read read13 = new nIncDeviceDestroy.read(iArr6, read12);
        read12.addListener(nincdevicedestroy6.MediaBrowserCompat$ItemReceiver);
        nincdevicedestroy6.MediaBrowserCompat$CustomActionResultReceiver.add(read13);
        this.setCheckable = this.ActionMenuItemView.getRotation();
    }

    public void IconCompatParcelizer(ColorStateList colorStateList) {
        Drawable drawable = this.AppCompatDialogFragment;
        if (drawable != null) {
            setBaselineAligned.read(drawable, AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(colorStateList));
        }
    }

    public final void write(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.ActionMenuItemView.getDrawable();
        if (drawable != null && this.PlaybackStateCompat$CustomAction != 0) {
            RectF rectF = this.setShortcut;
            RectF rectF2 = this.setPadding;
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f2 = (float) this.PlaybackStateCompat$CustomAction;
            rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, f2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f3 = ((float) this.PlaybackStateCompat$CustomAction) / 2.0f;
            matrix.postScale(f, f, f3, f3);
        }
    }

    public void write(float f, float f2, float f3) {
        nIncContextDestroy ninccontextdestroy = this.AppCompatActivity;
        if (ninccontextdestroy != null) {
            ninccontextdestroy.MediaBrowserCompat$CustomActionResultReceiver(f, this.PlaybackStateCompat + f);
            RatingCompat();
        }
    }

    public void IconCompatParcelizer(int[] iArr) {
        nIncDeviceDestroy.read read2;
        ValueAnimator valueAnimator;
        nIncDeviceDestroy nincdevicedestroy = this.setIcon;
        int size = nincdevicedestroy.MediaBrowserCompat$CustomActionResultReceiver.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                read2 = null;
                break;
            }
            read2 = nincdevicedestroy.MediaBrowserCompat$CustomActionResultReceiver.get(i);
            if (StateSet.stateSetMatches(read2.read, iArr)) {
                break;
            }
            i++;
        }
        nIncDeviceDestroy.read read3 = nincdevicedestroy.IconCompatParcelizer;
        if (read2 != read3) {
            if (!(read3 == null || (valueAnimator = nincdevicedestroy.write) == null)) {
                valueAnimator.cancel();
                nincdevicedestroy.write = null;
            }
            nincdevicedestroy.IconCompatParcelizer = read2;
            if (read2 != null) {
                ValueAnimator valueAnimator2 = read2.IconCompatParcelizer;
                nincdevicedestroy.write = valueAnimator2;
                valueAnimator2.start();
            }
        }
    }

    public void write() {
        nIncDeviceDestroy nincdevicedestroy = this.setIcon;
        ValueAnimator valueAnimator = nincdevicedestroy.write;
        if (valueAnimator != null) {
            valueAnimator.end();
            nincdevicedestroy.write = null;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer iconCompatParcelizer, boolean z) {
        if (!read()) {
            Animator animator = this.MediaSessionCompat$ResultReceiverWrapper;
            if (animator != null) {
                animator.cancel();
            }
            if (SwitchCompat.setCheckable(this.ActionMenuItemView) && !this.ActionMenuItemView.isInEditMode()) {
                if (this.ActionMenuItemView.getVisibility() != 0) {
                    this.ActionMenuItemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    this.ActionMenuItemView.setScaleY(BitmapDescriptorFactory.HUE_RED);
                    this.ActionMenuItemView.setScaleX(BitmapDescriptorFactory.HUE_RED);
                    this.AlertController$RecycleListView = BitmapDescriptorFactory.HUE_RED;
                    Matrix matrix = this.setExpandedFormat;
                    write(BitmapDescriptorFactory.HUE_RED, matrix);
                    this.ActionMenuItemView.setImageMatrix(matrix);
                }
                nClosureSetGlobal nclosuresetglobal = this.setChecked;
                if (nclosuresetglobal == null) {
                    if (this.AppCompatViewInflater == null) {
                        this.AppCompatViewInflater = nClosureSetGlobal.read(this.ActionMenuItemView.getContext(), C1390x230a8146.design_fab_show_motion_spec);
                    }
                    nclosuresetglobal = this.AppCompatViewInflater;
                }
                AnimatorSet read2 = read(nclosuresetglobal, 1.0f, 1.0f, 1.0f);
                read2.addListener(new AnimatorListenerAdapter(z, iconCompatParcelizer) {
                    private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

                    {
                        this.MediaBrowserCompat$ItemReceiver = r2;
                    }

                    public final void onAnimationStart(Animator animator) {
                        nContextSetPriority.this.ActionMenuItemView.MediaBrowserCompat$CustomActionResultReceiver(0, this.MediaBrowserCompat$ItemReceiver);
                        nContextSetPriority.this.MediaBrowserCompat$SearchResultReceiver = 2;
                        nContextSetPriority.this.MediaSessionCompat$ResultReceiverWrapper = animator;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        nContextSetPriority.this.MediaBrowserCompat$SearchResultReceiver = 0;
                        nContextSetPriority.this.MediaSessionCompat$ResultReceiverWrapper = null;
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = this.setBackgroundResource;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        read2.addListener(it.next());
                    }
                }
                read2.start();
                return;
            }
            this.ActionMenuItemView.MediaBrowserCompat$CustomActionResultReceiver(0, z);
            this.ActionMenuItemView.setAlpha(1.0f);
            this.ActionMenuItemView.setScaleY(1.0f);
            this.ActionMenuItemView.setScaleX(1.0f);
            this.AlertController$RecycleListView = 1.0f;
            Matrix matrix2 = this.setExpandedFormat;
            write(1.0f, matrix2);
            this.ActionMenuItemView.setImageMatrix(matrix2);
        }
    }

    public final AnimatorSet read(nClosureSetGlobal nclosuresetglobal, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.ActionMenuItemView, View.ALPHA, new float[]{f});
        nclosuresetglobal.write("opacity").write(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.ActionMenuItemView, View.SCALE_X, new float[]{f2});
        nclosuresetglobal.write("scale").write(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.ActionMenuItemView, View.SCALE_Y, new float[]{f2});
        nclosuresetglobal.write("scale").write(ofFloat3);
        arrayList.add(ofFloat3);
        write(f3, this.setExpandedFormat);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.ActionMenuItemView, new nContextDeinitToClient(), new nContextCreate(), new Matrix[]{new Matrix(this.setExpandedFormat)});
        nclosuresetglobal.write("iconScale").write(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        Iterables.C35273.read(animatorSet, arrayList);
        return animatorSet;
    }

    public final void RatingCompat() {
        Rect rect = this.setItemInvoker;
        MediaBrowserCompat$ItemReceiver(rect);
        MediaBrowserCompat$CustomActionResultReceiver(rect);
        this.AppCompatDelegateImpl$ListMenuDecorView.write(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver(Rect rect) {
        this.AppCompatActivity.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public final nIncAllocationCreateTyped MediaBrowserCompat$CustomActionResultReceiver(int i, ColorStateList colorStateList) {
        Context context = this.ActionMenuItemView.getContext();
        nIncAllocationCreateTyped IconCompatParcelizer2 = IconCompatParcelizer();
        int read2 = setLastBaselineToBottomHeight.read(context, nAllocationSetSurface.write.design_fab_stroke_top_outer_color);
        int read3 = setLastBaselineToBottomHeight.read(context, nAllocationSetSurface.write.design_fab_stroke_top_inner_color);
        int read4 = setLastBaselineToBottomHeight.read(context, nAllocationSetSurface.write.design_fab_stroke_end_inner_color);
        int read5 = setLastBaselineToBottomHeight.read(context, nAllocationSetSurface.write.design_fab_stroke_end_outer_color);
        IconCompatParcelizer2.MediaDescriptionCompat = read2;
        IconCompatParcelizer2.MediaBrowserCompat$MediaItem = read3;
        IconCompatParcelizer2.IconCompatParcelizer = read4;
        IconCompatParcelizer2.write = read5;
        float f = (float) i;
        if (IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver != f) {
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = f;
            IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver.setStrokeWidth(f * 1.3333f);
            IconCompatParcelizer2.read = true;
            IconCompatParcelizer2.invalidateSelf();
        }
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(colorStateList);
        return IconCompatParcelizer2;
    }

    /* access modifiers changed from: package-private */
    public nIncAllocationCreateTyped IconCompatParcelizer() {
        return new nIncAllocationCreateTyped();
    }

    /* access modifiers changed from: package-private */
    public GradientDrawable MediaBrowserCompat$ItemReceiver() {
        return new GradientDrawable();
    }

    public final boolean read() {
        if (this.ActionMenuItemView.getVisibility() != 0) {
            if (this.MediaBrowserCompat$SearchResultReceiver == 2) {
                return true;
            }
            return false;
        } else if (this.MediaBrowserCompat$SearchResultReceiver != 1) {
            return true;
        } else {
            return false;
        }
    }

    private static ValueAnimator read(MediaDescriptionCompat mediaDescriptionCompat) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(MediaBrowserCompat$CustomActionResultReceiver);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(mediaDescriptionCompat);
        valueAnimator.addUpdateListener(mediaDescriptionCompat);
        valueAnimator.setFloatValues(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
        return valueAnimator;
    }

    /* renamed from: o.nContextSetPriority$MediaDescriptionCompat */
    abstract class MediaDescriptionCompat extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean MediaBrowserCompat$CustomActionResultReceiver;
        private float read;
        private float write;

        /* access modifiers changed from: protected */
        public abstract float MediaBrowserCompat$CustomActionResultReceiver();

        private MediaDescriptionCompat() {
        }

        /* synthetic */ MediaDescriptionCompat(nContextSetPriority ncontextsetpriority, byte b) {
            this();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.write = nContextSetPriority.this.AppCompatActivity.read;
                this.read = MediaBrowserCompat$CustomActionResultReceiver();
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
            }
            nIncContextDestroy ninccontextdestroy = nContextSetPriority.this.AppCompatActivity;
            float f = this.write;
            ninccontextdestroy.MediaBrowserCompat$CustomActionResultReceiver(f + ((this.read - f) * valueAnimator.getAnimatedFraction()), ninccontextdestroy.IconCompatParcelizer);
        }

        public void onAnimationEnd(Animator animator) {
            nIncContextDestroy ninccontextdestroy = nContextSetPriority.this.AppCompatActivity;
            ninccontextdestroy.MediaBrowserCompat$CustomActionResultReceiver(this.read, ninccontextdestroy.IconCompatParcelizer);
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
        }
    }

    /* renamed from: o.nContextSetPriority$write */
    class write extends MediaDescriptionCompat {
        write() {
            super(nContextSetPriority.this, (byte) 0);
        }

        /* access modifiers changed from: protected */
        public final float MediaBrowserCompat$CustomActionResultReceiver() {
            return nContextSetPriority.this.MediaSessionCompat$QueueItem + nContextSetPriority.this.setHasDecor;
        }
    }

    /* renamed from: o.nContextSetPriority$read */
    class read extends MediaDescriptionCompat {
        /* access modifiers changed from: protected */
        public final float MediaBrowserCompat$CustomActionResultReceiver() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        read(nContextSetPriority ncontextsetpriority) {
            super(ncontextsetpriority, (byte) 0);
        }
    }

    public void write(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable[] drawableArr;
        GradientDrawable MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver2.setShape(1);
        MediaBrowserCompat$ItemReceiver2.setColor(-1);
        Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(MediaBrowserCompat$ItemReceiver2);
        this.setContentView = MediaBrowserCompat$MediaItem2;
        setBaselineAligned.read(MediaBrowserCompat$MediaItem2, colorStateList);
        if (mode != null) {
            setBaselineAligned.IconCompatParcelizer(this.setContentView, mode);
        }
        GradientDrawable MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver3.setShape(1);
        MediaBrowserCompat$ItemReceiver3.setColor(-1);
        Drawable MediaBrowserCompat$MediaItem3 = setBaselineAligned.MediaBrowserCompat$MediaItem(MediaBrowserCompat$ItemReceiver3);
        this.AppCompatDialogFragment = MediaBrowserCompat$MediaItem3;
        setBaselineAligned.read(MediaBrowserCompat$MediaItem3, AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(colorStateList2));
        if (i > 0) {
            nIncAllocationCreateTyped MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(i, colorStateList);
            this.MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver2;
            drawableArr = new Drawable[]{MediaBrowserCompat$CustomActionResultReceiver2, this.setContentView, this.AppCompatDialogFragment};
        } else {
            this.MediaBrowserCompat$MediaItem = null;
            drawableArr = new Drawable[]{this.setContentView, this.AppCompatDialogFragment};
        }
        this.MediaMetadataCompat = new LayerDrawable(drawableArr);
        Context context = this.ActionMenuItemView.getContext();
        Drawable drawable = this.MediaMetadataCompat;
        float IconCompatParcelizer2 = this.AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer();
        float f = this.MediaSessionCompat$QueueItem;
        nIncContextDestroy ninccontextdestroy = new nIncContextDestroy(context, drawable, IconCompatParcelizer2, f, f + this.PlaybackStateCompat);
        this.AppCompatActivity = ninccontextdestroy;
        ninccontextdestroy.write = false;
        ninccontextdestroy.invalidateSelf();
        this.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(this.AppCompatActivity);
    }

    public boolean onPreDraw() {
        float rotation = this.ActionMenuItemView.getRotation();
        if (this.setCheckable != rotation) {
            this.setCheckable = rotation;
            if (Build.VERSION.SDK_INT == 19) {
                if (this.setCheckable % 90.0f != BitmapDescriptorFactory.HUE_RED) {
                    if (this.ActionMenuItemView.getLayerType() != 1) {
                        this.ActionMenuItemView.setLayerType(1, (Paint) null);
                    }
                } else if (this.ActionMenuItemView.getLayerType() != 0) {
                    this.ActionMenuItemView.setLayerType(0, (Paint) null);
                }
            }
            nIncContextDestroy ninccontextdestroy = this.AppCompatActivity;
            if (ninccontextdestroy != null) {
                float f = -this.setCheckable;
                if (ninccontextdestroy.MediaBrowserCompat$MediaItem != f) {
                    ninccontextdestroy.MediaBrowserCompat$MediaItem = f;
                    ninccontextdestroy.invalidateSelf();
                }
            }
            nIncAllocationCreateTyped nincallocationcreatetyped = this.MediaBrowserCompat$MediaItem;
            if (nincallocationcreatetyped != null) {
                float f2 = -this.setCheckable;
                if (f2 != nincallocationcreatetyped.MediaBrowserCompat$SearchResultReceiver) {
                    nincallocationcreatetyped.MediaBrowserCompat$SearchResultReceiver = f2;
                    nincallocationcreatetyped.invalidateSelf();
                }
            }
        }
        return true;
    }
}

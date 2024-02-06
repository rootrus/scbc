package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040o.AppCompatMultiAutoCompleteTextView;
import p040o.AppCompatRadioButton;
import p040o.C1140xd1c12aec;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.SwitchCompat;
import p040o.hasOverlappingRendering;
import p040o.setBackgroundDrawable;
import p040o.setBaselineAligned;
import p040o.setIconified;
import p040o.setLastBaselineToBottomHeight;
import p040o.setOnCloseListener;
import p040o.setOnQueryTextListener;
import p040o.setQueryHint;
import p040o.setTextOff;

public class CoordinatorLayout extends ViewGroup implements setQueryHint {
    private static final setOnCloseListener.read<Rect> MediaDescriptionCompat = new setOnCloseListener.write(12);
    private static String MediaMetadataCompat;
    private static ThreadLocal<Map<String, Constructor<CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver>>> RatingCompat = new ThreadLocal<>();
    private static Comparator<View> read;
    private static Class<?>[] write = {Context.class, AttributeSet.class};
    private final setBackgroundDrawable.read AlertController$RecycleListView;
    private final List<View> AppCompatActivity;
    private final int[] AppCompatDialogFragment;
    boolean IconCompatParcelizer;
    private CoordinatorLayout$MediaBrowserCompat$SearchResultReceiver Keep;
    ViewGroup.OnHierarchyChangeListener MediaBrowserCompat$CustomActionResultReceiver;
    public setTextOff MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private CheckCaptureModule_GetIJsonExactionHelperRttiFactory MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f14x50fd9e4a;
    private final List<View> MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper;
    private final AppCompatRadioButton<View> MediaSessionCompat$Token;
    private int[] ParcelableVolumeInfo;
    private View PlaybackStateCompat;
    private boolean PlaybackStateCompat$CustomAction;
    private final List<View> setBackgroundResource;
    private Drawable setHasDecor;

    public interface IconCompatParcelizer {
        CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver write();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            MediaMetadataCompat = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$MediaMetadataCompat r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$MediaMetadataCompat
            r0.<init>()
            read = r0
            goto L_0x0021
        L_0x001f:
            read = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            write = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            RatingCompat = r0
            o.setOnCloseListener$write r0 = new o.setOnCloseListener$write
            r1 = 12
            r0.<init>(r1)
            MediaDescriptionCompat = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AppCompatMultiAutoCompleteTextView.IconCompatParcelizer.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.MediaSessionCompat$QueueItem = new ArrayList();
        this.MediaSessionCompat$Token = new AppCompatRadioButton<>();
        this.AppCompatActivity = new ArrayList();
        this.setBackgroundResource = new ArrayList();
        this.AppCompatDialogFragment = new int[2];
        this.AlertController$RecycleListView = new setBackgroundDrawable.read(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C1140xd1c12aec.CoordinatorLayout, 0, AppCompatMultiAutoCompleteTextView.read.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C1140xd1c12aec.CoordinatorLayout, i, 0);
        }
        int resourceId = typedArray.getResourceId(C1140xd1c12aec.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.ParcelableVolumeInfo = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.ParcelableVolumeInfo.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.ParcelableVolumeInfo;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.setHasDecor = typedArray.getDrawable(C1140xd1c12aec.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        MediaBrowserCompat$CustomActionResultReceiver();
        super.setOnHierarchyChangeListener(new write());
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.MediaBrowserCompat$CustomActionResultReceiver = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        write(false);
        if (this.PlaybackStateCompat$CustomAction) {
            if (this.Keep == null) {
                this.Keep = new CoordinatorLayout$MediaBrowserCompat$SearchResultReceiver(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.Keep);
        }
        if (this.MediaBrowserCompat$ItemReceiver == null && SwitchCompat.RatingCompat(this)) {
            SwitchCompat.setShortcut(this);
        }
        this.f14x50fd9e4a = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        write(false);
        if (this.PlaybackStateCompat$CustomAction && this.Keep != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.Keep);
        }
        View view = this.PlaybackStateCompat;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f14x50fd9e4a = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.setHasDecor;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.setHasDecor = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.setHasDecor.setState(getDrawableState());
                }
                setBaselineAligned.read(this.setHasDecor, SwitchCompat.m3079x50fd9e4a(this));
                this.setHasDecor.setVisible(getVisibility() == 0, false);
                this.setHasDecor.setCallback(this);
            }
            SwitchCompat.setItemInvoker(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.setHasDecor;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.setHasDecor;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.setHasDecor;
        if (drawable != null && drawable.isVisible() != z) {
            this.setHasDecor.setVisible(z, false);
        }
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? setLastBaselineToBottomHeight.write(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    private void write(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = ((read) childAt.getLayoutParams()).MediaDescriptionCompat;
            if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                if (z) {
                    coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, childAt, obtain);
                } else {
                    coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.write(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((read) getChildAt(i2).getLayoutParams()).MediaSessionCompat$ResultReceiverWrapper = false;
        }
        this.MediaBrowserCompat$MediaItem = null;
        this.MediaSessionCompat$ResultReceiverWrapper = false;
    }

    private boolean read(MotionEvent motionEvent, int i) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.AppCompatActivity;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator<View> comparator = read;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            read read2 = (read) view.getLayoutParams();
            CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = read2.MediaDescriptionCompat;
            if ((!z2 && !z3) || actionMasked == 0) {
                if (!z2 && coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
                    if (i2 == 0) {
                        z2 = coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z2 = coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.write(this, view, motionEvent2);
                    }
                    if (z2) {
                        this.MediaBrowserCompat$MediaItem = view;
                    }
                }
                if (read2.MediaDescriptionCompat == null) {
                    read2.MediaSessionCompat$ResultReceiverWrapper = false;
                }
                boolean z4 = read2.MediaSessionCompat$ResultReceiverWrapper;
                boolean z5 = read2.MediaSessionCompat$ResultReceiverWrapper;
                if (z5) {
                    z = true;
                } else {
                    z = z5 | false;
                    read2.MediaSessionCompat$ResultReceiverWrapper = z;
                }
                z3 = z && !z4;
                if (z && !z3) {
                    break;
                }
            } else if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                }
                if (i2 == 0) {
                    coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, view, motionEvent3);
                } else if (i2 == 1) {
                    coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.write(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            write(true);
        }
        boolean read2 = read(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            write(true);
        }
        return read2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.MediaBrowserCompat$MediaItem
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.read((android.view.MotionEvent) r1, (int) r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.MediaBrowserCompat$MediaItem
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$read r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.read) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver r6 = r6.MediaDescriptionCompat
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.MediaBrowserCompat$MediaItem
            boolean r6 = r6.write((androidx.coordinatorlayout.widget.CoordinatorLayout) r0, r7, (android.view.MotionEvent) r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.MediaBrowserCompat$MediaItem
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.write((boolean) r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.MediaSessionCompat$ResultReceiverWrapper) {
            write(false);
            this.MediaSessionCompat$ResultReceiverWrapper = true;
        }
    }

    private int MediaBrowserCompat$ItemReceiver(int i) {
        int[] iArr = this.ParcelableVolumeInfo;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            Log.e("CoordinatorLayout", sb.toString());
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            Log.e("CoordinatorLayout", sb2.toString());
            return 0;
        }
    }

    static CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver read(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(MediaMetadataCompat)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(MediaMetadataCompat);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = RatingCompat.get();
            if (map == null) {
                map = new HashMap();
                RatingCompat.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(write);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    private static read IconCompatParcelizer(View view) {
        read read2 = (read) view.getLayoutParams();
        if (!read2.RatingCompat) {
            if (view instanceof IconCompatParcelizer) {
                CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver write2 = ((IconCompatParcelizer) view).write();
                if (read2.MediaDescriptionCompat != write2) {
                    read2.MediaDescriptionCompat = write2;
                    read2.RatingCompat = true;
                    write2.IconCompatParcelizer(read2);
                }
                read2.RatingCompat = true;
            } else {
                CoordinatorLayout$MediaBrowserCompat$ItemReceiver coordinatorLayout$MediaBrowserCompat$ItemReceiver = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    coordinatorLayout$MediaBrowserCompat$ItemReceiver = (CoordinatorLayout$MediaBrowserCompat$ItemReceiver) cls.getAnnotation(CoordinatorLayout$MediaBrowserCompat$ItemReceiver.class);
                    if (coordinatorLayout$MediaBrowserCompat$ItemReceiver != null) {
                        break;
                    }
                }
                if (coordinatorLayout$MediaBrowserCompat$ItemReceiver != null) {
                    try {
                        CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = (CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver) coordinatorLayout$MediaBrowserCompat$ItemReceiver.write().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        if (read2.MediaDescriptionCompat != coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver) {
                            read2.MediaDescriptionCompat = coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
                            read2.RatingCompat = true;
                            if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
                                coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(read2);
                            }
                        }
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(coordinatorLayout$MediaBrowserCompat$ItemReceiver.write().getName());
                        sb.append(" could not be instantiated. Did you forget");
                        sb.append(" a default constructor?");
                        Log.e("CoordinatorLayout", sb.toString(), e);
                    }
                }
                read2.RatingCompat = true;
            }
        }
        return read2;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public final void read(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final void MediaBrowserCompat$ItemReceiver(View view, int i) {
        read read2 = (read) view.getLayoutParams();
        if (read2.MediaBrowserCompat$SearchResultReceiver == null && read2.MediaMetadataCompat != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (read2.MediaBrowserCompat$SearchResultReceiver != null) {
            IconCompatParcelizer(view, read2.MediaBrowserCompat$SearchResultReceiver, i);
        } else if (read2.IconCompatParcelizer >= 0) {
            IconCompatParcelizer(view, read2.IconCompatParcelizer, i);
        } else {
            write(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
        int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = SwitchCompat.m3079x50fd9e4a(this);
        int size = this.MediaSessionCompat$QueueItem.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.MediaSessionCompat$QueueItem.get(i5);
            if (view.getVisibility() != 8 && ((coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = ((read) view.getLayoutParams()).MediaDescriptionCompat) == null || !coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this, view, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver))) {
                MediaBrowserCompat$ItemReceiver(view, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.IconCompatParcelizer && this.setHasDecor != null) {
            setTextOff settextoff = this.MediaBrowserCompat$ItemReceiver;
            int read2 = settextoff != null ? settextoff.read() : 0;
            if (read2 > 0) {
                this.setHasDecor.setBounds(0, 0, getWidth(), read2);
                this.setHasDecor.draw(canvas);
            }
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    private void write(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            hasOverlappingRendering.MediaBrowserCompat$CustomActionResultReceiver(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private static void IconCompatParcelizer(int i, Rect rect, Rect rect2, read read2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = read2.MediaBrowserCompat$CustomActionResultReceiver;
        if (i6 == 0) {
            i6 = 17;
        }
        int MediaBrowserCompat$CustomActionResultReceiver2 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(i6, i);
        int i7 = read2.MediaBrowserCompat$ItemReceiver;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        int MediaBrowserCompat$CustomActionResultReceiver3 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(i7, i);
        int i8 = MediaBrowserCompat$CustomActionResultReceiver2 & 7;
        int i9 = MediaBrowserCompat$CustomActionResultReceiver2 & 112;
        int i10 = MediaBrowserCompat$CustomActionResultReceiver3 & 7;
        int i11 = MediaBrowserCompat$CustomActionResultReceiver3 & 112;
        if (i10 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i10 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i11 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i11 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i8 == 1) {
            i4 -= i2 / 2;
        } else if (i8 != 5) {
            i4 -= i2;
        }
        if (i9 == 16) {
            i5 -= i3 / 2;
        } else if (i9 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    private void IconCompatParcelizer(read read2, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int i3 = read2.leftMargin;
        int i4 = paddingLeft + i3;
        int max = Math.max(i4, Math.min(rect.left, ((width - getPaddingRight()) - i) - read2.rightMargin));
        int paddingTop = getPaddingTop();
        int i5 = read2.topMargin;
        int i6 = paddingTop + i5;
        int max2 = Math.max(i6, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - read2.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    private void IconCompatParcelizer(View view, int i, int i2) {
        read read2 = (read) view.getLayoutParams();
        int i3 = read2.MediaBrowserCompat$CustomActionResultReceiver;
        if (i3 == 0) {
            i3 = 8388661;
        }
        int MediaBrowserCompat$CustomActionResultReceiver2 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(i3, i2);
        int i4 = MediaBrowserCompat$CustomActionResultReceiver2 & 7;
        int i5 = MediaBrowserCompat$CustomActionResultReceiver2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i) - measuredWidth;
        if (i4 == 1) {
            MediaBrowserCompat$ItemReceiver2 += measuredWidth / 2;
        } else if (i4 == 5) {
            MediaBrowserCompat$ItemReceiver2 += measuredWidth;
        }
        int i6 = 0;
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight;
        }
        int paddingLeft = getPaddingLeft();
        int i7 = read2.leftMargin;
        int i8 = paddingLeft + i7;
        int max = Math.max(i8, Math.min(MediaBrowserCompat$ItemReceiver2, ((width - getPaddingRight()) - measuredWidth) - read2.rightMargin));
        int paddingTop = getPaddingTop();
        int i9 = read2.topMargin;
        int i10 = paddingTop + i9;
        int max2 = Math.max(i10, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - read2.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void write(View view, int i) {
        read read2 = (read) view.getLayoutParams();
        Rect read3 = MediaDescriptionCompat.read();
        if (read3 == null) {
            read3 = new Rect();
        }
        read3.set(getPaddingLeft() + read2.leftMargin, getPaddingTop() + read2.topMargin, (getWidth() - getPaddingRight()) - read2.rightMargin, (getHeight() - getPaddingBottom()) - read2.bottomMargin);
        if (this.MediaBrowserCompat$ItemReceiver != null && SwitchCompat.RatingCompat(this) && !SwitchCompat.RatingCompat(view)) {
            read3.left += this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            read3.top += this.MediaBrowserCompat$ItemReceiver.read();
            read3.right -= this.MediaBrowserCompat$ItemReceiver.write();
            read3.bottom -= this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        }
        Rect read4 = MediaDescriptionCompat.read();
        if (read4 == null) {
            read4 = new Rect();
        }
        Rect rect = read4;
        int i2 = read2.MediaBrowserCompat$CustomActionResultReceiver;
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        if ((i2 & 112) == 0) {
            i2 |= 48;
        }
        setOnQueryTextListener.MediaBrowserCompat$ItemReceiver(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), read3, rect, i);
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
        read3.setEmpty();
        MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(read3);
        rect.setEmpty();
        MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(rect);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int width;
        int i4;
        int height;
        int i5;
        read read2;
        int i6;
        int i7;
        int i8;
        boolean z5;
        int i9;
        read read3;
        CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
        int i10 = i;
        int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = SwitchCompat.m3079x50fd9e4a(this);
        int size = this.MediaSessionCompat$QueueItem.size();
        Rect read4 = MediaDescriptionCompat.read();
        if (read4 == null) {
            read4 = new Rect();
        }
        Rect rect = read4;
        Rect read5 = MediaDescriptionCompat.read();
        if (read5 == null) {
            read5 = new Rect();
        }
        Rect rect2 = read5;
        Rect read6 = MediaDescriptionCompat.read();
        if (read6 == null) {
            read6 = new Rect();
        }
        Rect rect3 = read6;
        boolean z6 = false;
        int i11 = 0;
        while (i11 < size) {
            View view = this.MediaSessionCompat$QueueItem.get(i11);
            read read7 = (read) view.getLayoutParams();
            if (i10 == 0 && view.getVisibility() == 8) {
                i3 = size;
                z = z6;
                i2 = i11;
            } else {
                int i12 = z6;
                while (i12 < i11) {
                    if (read7.MediaBrowserCompat$MediaItem == this.MediaSessionCompat$QueueItem.get(i12)) {
                        read read8 = (read) view.getLayoutParams();
                        if (read8.MediaBrowserCompat$SearchResultReceiver != null) {
                            Rect read9 = MediaDescriptionCompat.read();
                            if (read9 == null) {
                                read9 = new Rect();
                            }
                            Rect rect4 = read9;
                            Rect read10 = MediaDescriptionCompat.read();
                            if (read10 == null) {
                                read10 = new Rect();
                            }
                            Rect read11 = MediaDescriptionCompat.read();
                            if (read11 == null) {
                                read11 = new Rect();
                            }
                            Rect rect5 = read11;
                            hasOverlappingRendering.MediaBrowserCompat$CustomActionResultReceiver(this, read8.MediaBrowserCompat$SearchResultReceiver, rect4);
                            write(view, z6, read10);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i8 = size;
                            Rect rect6 = read10;
                            Rect rect7 = rect4;
                            read read12 = read8;
                            int i13 = measuredWidth;
                            i7 = i11;
                            i6 = i12;
                            read2 = read7;
                            IconCompatParcelizer(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, rect4, rect5, read12, i13, measuredHeight);
                            Rect rect8 = rect5;
                            if (rect8.left == rect6.left && rect8.top == rect6.top) {
                                i9 = i13;
                                read3 = read12;
                                z5 = false;
                            } else {
                                z5 = true;
                                i9 = i13;
                                read3 = read12;
                            }
                            IconCompatParcelizer(read3, rect8, i9, measuredHeight);
                            int i14 = rect8.left - rect6.left;
                            int i15 = rect8.top - rect6.top;
                            if (i14 != 0) {
                                SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(view, i14);
                            }
                            if (i15 != 0) {
                                SwitchCompat.MediaBrowserCompat$ItemReceiver(view, i15);
                            }
                            if (z5 && (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = read3.MediaDescriptionCompat) != null) {
                                coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this, view, read3.MediaBrowserCompat$SearchResultReceiver);
                            }
                            rect7.setEmpty();
                            MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(rect7);
                            rect6.setEmpty();
                            MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(rect6);
                            rect8.setEmpty();
                            MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(rect8);
                            i12 = i6 + 1;
                            size = i8;
                            i11 = i7;
                            read7 = read2;
                            z6 = false;
                        }
                    }
                    i6 = i12;
                    read2 = read7;
                    i8 = size;
                    i7 = i11;
                    i12 = i6 + 1;
                    size = i8;
                    i11 = i7;
                    read7 = read2;
                    z6 = false;
                }
                int i16 = size;
                i2 = i11;
                write(view, true, rect2);
                read read13 = read7;
                if (read13.write != 0 && !rect2.isEmpty()) {
                    int MediaBrowserCompat$CustomActionResultReceiver2 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(read13.write, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                    int i17 = MediaBrowserCompat$CustomActionResultReceiver2 & 112;
                    if (i17 == 48) {
                        rect.top = Math.max(rect.top, rect2.bottom);
                    } else if (i17 == 80) {
                        rect.bottom = Math.max(rect.bottom, getHeight() - rect2.top);
                    }
                    int i18 = MediaBrowserCompat$CustomActionResultReceiver2 & 7;
                    if (i18 == 3) {
                        rect.left = Math.max(rect.left, rect2.right);
                    } else if (i18 == 5) {
                        rect.right = Math.max(rect.right, getWidth() - rect2.left);
                    }
                }
                if (read13.read != 0 && view.getVisibility() == 0 && SwitchCompat.setCheckable(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    read read14 = (read) view.getLayoutParams();
                    CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver2 = read14.MediaDescriptionCompat;
                    Rect read15 = MediaDescriptionCompat.read();
                    if (read15 == null) {
                        read15 = new Rect();
                    }
                    Rect read16 = MediaDescriptionCompat.read();
                    if (read16 == null) {
                        read16 = new Rect();
                    }
                    read16.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver2 == null || !coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver2.write(this, view, read15)) {
                        read15.set(read16);
                    } else if (!read16.contains(read15)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Rect should be within the child's bounds. Rect:");
                        sb.append(read15.toShortString());
                        sb.append(" | Bounds:");
                        sb.append(read16.toShortString());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    read16.setEmpty();
                    MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(read16);
                    if (read15.isEmpty()) {
                        read15.setEmpty();
                        MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(read15);
                    } else {
                        int MediaBrowserCompat$CustomActionResultReceiver3 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(read14.read, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
                        if ((MediaBrowserCompat$CustomActionResultReceiver3 & 48) != 48 || (i5 = (read15.top - read14.topMargin) - read14.PlaybackStateCompat$CustomAction) >= rect.top) {
                            z3 = false;
                        } else {
                            MediaBrowserCompat$CustomActionResultReceiver(view, rect.top - i5);
                            z3 = true;
                        }
                        if ((MediaBrowserCompat$CustomActionResultReceiver3 & 80) == 80 && (height = ((getHeight() - read15.bottom) - read14.bottomMargin) + read14.PlaybackStateCompat$CustomAction) < rect.bottom) {
                            MediaBrowserCompat$CustomActionResultReceiver(view, height - rect.bottom);
                            z3 = true;
                        }
                        if (!z3) {
                            MediaBrowserCompat$CustomActionResultReceiver(view, 0);
                        }
                        if ((MediaBrowserCompat$CustomActionResultReceiver3 & 3) != 3 || (i4 = (read15.left - read14.leftMargin) - read14.MediaSessionCompat$QueueItem) >= rect.left) {
                            z4 = false;
                        } else {
                            read(view, rect.left - i4);
                            z4 = true;
                        }
                        if ((MediaBrowserCompat$CustomActionResultReceiver3 & 5) == 5 && (width = ((getWidth() - read15.right) - read14.rightMargin) + read14.MediaSessionCompat$QueueItem) < rect.right) {
                            read(view, width - rect.right);
                            z4 = true;
                        }
                        if (!z4) {
                            read(view, 0);
                        }
                        read15.setEmpty();
                        MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(read15);
                    }
                }
                if (i10 != 2) {
                    rect3.set(((read) view.getLayoutParams()).PlaybackStateCompat);
                    if (!rect3.equals(rect2)) {
                        ((read) view.getLayoutParams()).PlaybackStateCompat.set(rect2);
                    } else {
                        i3 = i16;
                        z = false;
                    }
                }
                i3 = i16;
                for (int i19 = i2 + 1; i19 < i3; i19++) {
                    View view2 = this.MediaSessionCompat$QueueItem.get(i19);
                    read read17 = (read) view2.getLayoutParams();
                    CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver3 = read17.MediaDescriptionCompat;
                    if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver3 != null && coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver3.read(view2, view)) {
                        if (i10 != 0 || !read17.f15x50fd9e4a) {
                            if (i10 != 2) {
                                z2 = coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver(this, view2, view);
                            } else {
                                coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer(this, view2, view);
                                z2 = true;
                            }
                            if (i10 == 1) {
                                read17.f15x50fd9e4a = z2;
                            }
                        } else {
                            read17.f15x50fd9e4a = false;
                        }
                    }
                }
                z = false;
            }
            i11 = i2 + 1;
            size = i3;
            z6 = z;
        }
        rect.setEmpty();
        MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(rect);
        rect2.setEmpty();
        MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(rect2);
        rect3.setEmpty();
        MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(rect3);
    }

    private static void read(View view, int i) {
        read read2 = (read) view.getLayoutParams();
        if (read2.MediaSessionCompat$QueueItem != i) {
            SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(view, i - read2.MediaSessionCompat$QueueItem);
            read2.MediaSessionCompat$QueueItem = i;
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
        read read2 = (read) view.getLayoutParams();
        if (read2.PlaybackStateCompat$CustomAction != i) {
            SwitchCompat.MediaBrowserCompat$ItemReceiver(view, i - read2.PlaybackStateCompat$CustomAction);
            read2.PlaybackStateCompat$CustomAction = i;
        }
    }

    public final void read(View view) {
        List list = this.MediaSessionCompat$Token.write.get(view);
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = ((read) view2.getLayoutParams()).MediaDescriptionCompat;
                if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
                    coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this, view2, view);
                }
            }
        }
    }

    public final List<View> write(View view) {
        AppCompatRadioButton<View> appCompatRadioButton = this.MediaSessionCompat$Token;
        int size = appCompatRadioButton.write.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            int i2 = i << 1;
            ArrayList arrayList2 = (ArrayList) appCompatRadioButton.write.read[i2 + 1];
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(appCompatRadioButton.write.read[i2]);
            }
        }
        this.setBackgroundResource.clear();
        if (arrayList != null) {
            this.setBackgroundResource.addAll(arrayList);
        }
        return this.setBackgroundResource;
    }

    public final List<View> MediaBrowserCompat$CustomActionResultReceiver(View view) {
        List list = this.MediaSessionCompat$Token.write.get(view);
        this.setBackgroundResource.clear();
        if (list != null) {
            this.setBackgroundResource.addAll(list);
        }
        return this.setBackgroundResource;
    }

    private void read() {
        boolean z;
        boolean z2;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            AppCompatRadioButton<View> appCompatRadioButton = this.MediaSessionCompat$Token;
            int size = appCompatRadioButton.write.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    ArrayList arrayList = (ArrayList) appCompatRadioButton.write.read[(i2 << 1) + 1];
                    if (arrayList != null && arrayList.contains(childAt)) {
                        z2 = true;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                z = true;
                break;
            }
            i++;
        }
        if (z == this.PlaybackStateCompat$CustomAction) {
            return;
        }
        if (z) {
            if (this.f14x50fd9e4a) {
                if (this.Keep == null) {
                    this.Keep = new CoordinatorLayout$MediaBrowserCompat$SearchResultReceiver(this);
                }
                getViewTreeObserver().addOnPreDrawListener(this.Keep);
            }
            this.PlaybackStateCompat$CustomAction = true;
            return;
        }
        if (this.f14x50fd9e4a && this.Keep != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.Keep);
        }
        this.PlaybackStateCompat$CustomAction = false;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(View view, View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect read2 = MediaDescriptionCompat.read();
        if (read2 == null) {
            read2 = new Rect();
        }
        write(view, view.getParent() != this, read2);
        Rect read3 = MediaDescriptionCompat.read();
        if (read3 == null) {
            read3 = new Rect();
        }
        write(view2, view2.getParent() != this, read3);
        try {
            if (read2.left <= read3.right && read2.top <= read3.bottom && read2.right >= read3.left && read2.bottom >= read3.top) {
                z = true;
            }
            return z;
        } finally {
            read2.setEmpty();
            MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(read2);
            read3.setEmpty();
            MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(read3);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof read) && super.checkLayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return write(view, view2, i, 0);
    }

    public final boolean write(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                read read2 = (read) childAt.getLayoutParams();
                CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = read2.MediaDescriptionCompat;
                if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
                    boolean MediaBrowserCompat$CustomActionResultReceiver2 = coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, childAt, view, view2, i, i2);
                    z |= MediaBrowserCompat$CustomActionResultReceiver2;
                    if (i3 == 0) {
                        read2.MediaSessionCompat$Token = MediaBrowserCompat$CustomActionResultReceiver2;
                    } else if (i3 == 1) {
                        read2.ParcelableVolumeInfo = MediaBrowserCompat$CustomActionResultReceiver2;
                    }
                } else if (i3 == 0) {
                    read2.MediaSessionCompat$Token = false;
                } else if (i3 == 1) {
                    read2.ParcelableVolumeInfo = false;
                }
            }
        }
        return z;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        MediaBrowserCompat$CustomActionResultReceiver(view2, i, 0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(View view, int i, int i2) {
        this.AlertController$RecycleListView.write = i;
        this.PlaybackStateCompat = view;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    public void onStopNestedScroll(View view) {
        IconCompatParcelizer(view, 0);
    }

    public final void IconCompatParcelizer(View view, int i) {
        boolean z;
        this.AlertController$RecycleListView.write = 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            read read2 = (read) childAt.getLayoutParams();
            if (i != 0) {
                z = i != 1 ? false : read2.ParcelableVolumeInfo;
            } else {
                z = read2.MediaSessionCompat$Token;
            }
            if (z) {
                CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = read2.MediaDescriptionCompat;
                if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
                    coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, childAt, view, i);
                }
                if (i == 0) {
                    read2.MediaSessionCompat$Token = false;
                } else if (i == 1) {
                    read2.ParcelableVolumeInfo = false;
                }
                read2.f15x50fd9e4a = false;
            }
        }
        this.PlaybackStateCompat = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        read(view, i, i2, i3, i4, 0);
    }

    public final void read(View view, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
        int i6 = i5;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                read read2 = (read) childAt.getLayoutParams();
                if (i6 != 0) {
                    z = i6 != 1 ? false : read2.ParcelableVolumeInfo;
                } else {
                    z = read2.MediaSessionCompat$Token;
                }
                if (z && (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = read2.MediaDescriptionCompat) != null) {
                    coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.read(this, childAt, view, i, i2, i3, i4, i5);
                    z2 = true;
                }
            }
        }
        if (z2) {
            MediaBrowserCompat$CustomActionResultReceiver(1);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        IconCompatParcelizer(view, i, i2, iArr, 0);
    }

    public final void IconCompatParcelizer(View view, int i, int i2, int[] iArr, int i3) {
        boolean z;
        CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
        int i4;
        int i5;
        int i6 = i3;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                read read2 = (read) childAt.getLayoutParams();
                if (i6 != 0) {
                    z = i6 != 1 ? false : read2.ParcelableVolumeInfo;
                } else {
                    z = read2.MediaSessionCompat$Token;
                }
                if (z && (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = read2.MediaDescriptionCompat) != null) {
                    int[] iArr2 = this.AppCompatDialogFragment;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.AppCompatDialogFragment;
                    if (i > 0) {
                        i4 = Math.max(i7, iArr3[0]);
                    } else {
                        i4 = Math.min(i7, iArr3[0]);
                    }
                    i7 = i4;
                    int[] iArr4 = this.AppCompatDialogFragment;
                    if (i2 > 0) {
                        i5 = Math.max(i8, iArr4[1]);
                    } else {
                        i5 = Math.min(i8, iArr4[1]);
                    }
                    i8 = i5;
                    z2 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z2) {
            MediaBrowserCompat$CustomActionResultReceiver(1);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                read read2 = (read) childAt.getLayoutParams();
                if (read2.MediaSessionCompat$Token && (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = read2.MediaDescriptionCompat) != null) {
                    z2 |= coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            MediaBrowserCompat$CustomActionResultReceiver(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                read read2 = (read) childAt.getLayoutParams();
                if (read2.MediaSessionCompat$Token && (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = read2.MediaDescriptionCompat) != null) {
                    z |= coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public int getNestedScrollAxes() {
        return this.AlertController$RecycleListView.write;
    }

    static class MediaMetadataCompat implements Comparator<View> {
        MediaMetadataCompat() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            float AppCompatDelegateImpl$ListMenuDecorView = SwitchCompat.AppCompatDelegateImpl$ListMenuDecorView((View) obj);
            float AppCompatDelegateImpl$ListMenuDecorView2 = SwitchCompat.AppCompatDelegateImpl$ListMenuDecorView((View) obj2);
            if (AppCompatDelegateImpl$ListMenuDecorView > AppCompatDelegateImpl$ListMenuDecorView2) {
                return -1;
            }
            return AppCompatDelegateImpl$ListMenuDecorView < AppCompatDelegateImpl$ListMenuDecorView2 ? 1 : 0;
        }
    }

    public static class read extends ViewGroup.MarginLayoutParams {
        public int IconCompatParcelizer = -1;
        public int MediaBrowserCompat$CustomActionResultReceiver = 0;
        public int MediaBrowserCompat$ItemReceiver = 0;
        View MediaBrowserCompat$MediaItem;
        View MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        boolean f15x50fd9e4a;
        public CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver MediaDescriptionCompat;
        public int MediaMetadataCompat = -1;
        int MediaSessionCompat$QueueItem;
        boolean MediaSessionCompat$ResultReceiverWrapper;
        boolean MediaSessionCompat$Token;
        boolean ParcelableVolumeInfo;
        final Rect PlaybackStateCompat = new Rect();
        int PlaybackStateCompat$CustomAction;
        public boolean RatingCompat = false;
        public int read = 0;
        public int write = 0;

        public read() {
            super(-2, -2);
        }

        read(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1140xd1c12aec.CoordinatorLayout_Layout);
            this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getInteger(C1140xd1c12aec.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.MediaMetadataCompat = obtainStyledAttributes.getResourceId(C1140xd1c12aec.CoordinatorLayout_Layout_layout_anchor, -1);
            this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getInteger(C1140xd1c12aec.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.IconCompatParcelizer = obtainStyledAttributes.getInteger(C1140xd1c12aec.CoordinatorLayout_Layout_layout_keyline, -1);
            this.write = obtainStyledAttributes.getInt(C1140xd1c12aec.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.read = obtainStyledAttributes.getInt(C1140xd1c12aec.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(C1140xd1c12aec.CoordinatorLayout_Layout_layout_behavior);
            this.RatingCompat = hasValue;
            if (hasValue) {
                this.MediaDescriptionCompat = CoordinatorLayout.read(context, attributeSet, obtainStyledAttributes.getString(C1140xd1c12aec.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat;
            if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
                coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this);
            }
        }

        public read(read read2) {
            super(read2);
        }

        public read(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public read(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class write implements ViewGroup.OnHierarchyChangeListener {
        write() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                CoordinatorLayout.this.MediaBrowserCompat$CustomActionResultReceiver.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.MediaBrowserCompat$CustomActionResultReceiver(2);
            if (CoordinatorLayout.this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                CoordinatorLayout.this.MediaBrowserCompat$CustomActionResultReceiver.onChildViewRemoved(view, view2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof CoordinatorLayout$MediaBrowserCompat$MediaItem)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CoordinatorLayout$MediaBrowserCompat$MediaItem coordinatorLayout$MediaBrowserCompat$MediaItem = (CoordinatorLayout$MediaBrowserCompat$MediaItem) parcelable;
        super.onRestoreInstanceState(coordinatorLayout$MediaBrowserCompat$MediaItem.write);
        SparseArray<Parcelable> sparseArray = coordinatorLayout$MediaBrowserCompat$MediaItem.read;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer(childAt).MediaDescriptionCompat;
            if (!(id == -1 || coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver == null || (parcelable2 = sparseArray.get(id)) == null)) {
                coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.read(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable MediaBrowserCompat$CustomActionResultReceiver2;
        CoordinatorLayout$MediaBrowserCompat$MediaItem coordinatorLayout$MediaBrowserCompat$MediaItem = new CoordinatorLayout$MediaBrowserCompat$MediaItem(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = ((read) childAt.getLayoutParams()).MediaDescriptionCompat;
            if (!(id == -1 || coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver == null || (MediaBrowserCompat$CustomActionResultReceiver2 = coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, childAt)) == null)) {
                sparseArray.append(id, MediaBrowserCompat$CustomActionResultReceiver2);
            }
        }
        coordinatorLayout$MediaBrowserCompat$MediaItem.read = sparseArray;
        return coordinatorLayout$MediaBrowserCompat$MediaItem;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = ((read) view.getLayoutParams()).MediaDescriptionCompat;
        if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver == null || !coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.write(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (SwitchCompat.RatingCompat(this)) {
                if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                    this.MediaBrowserCompat$SearchResultReceiver = new CheckCaptureModule_GetIJsonExactionHelperRttiFactory() {
                        public final setTextOff write(View view, setTextOff settextoff) {
                            CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
                            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                            if (!setIconified.MediaBrowserCompat$CustomActionResultReceiver(coordinatorLayout.MediaBrowserCompat$ItemReceiver, settextoff)) {
                                coordinatorLayout.MediaBrowserCompat$ItemReceiver = settextoff;
                                boolean z = true;
                                boolean z2 = settextoff != null && settextoff.read() > 0;
                                coordinatorLayout.IconCompatParcelizer = z2;
                                if (z2 || coordinatorLayout.getBackground() != null) {
                                    z = false;
                                }
                                coordinatorLayout.setWillNotDraw(z);
                                if (!settextoff.RatingCompat()) {
                                    int childCount = coordinatorLayout.getChildCount();
                                    for (int i = 0; i < childCount; i++) {
                                        View childAt = coordinatorLayout.getChildAt(i);
                                        if (SwitchCompat.RatingCompat(childAt) && (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = ((read) childAt.getLayoutParams()).MediaDescriptionCompat) != null) {
                                            settextoff = coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver.write(coordinatorLayout, childAt, settextoff);
                                            if (settextoff.RatingCompat()) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                coordinatorLayout.requestLayout();
                            }
                            return settextoff;
                        }
                    };
                }
                SwitchCompat.write((View) this, this.MediaBrowserCompat$SearchResultReceiver);
                setSystemUiVisibility(1280);
                return;
            }
            SwitchCompat.write((View) this, (CheckCaptureModule_GetIJsonExactionHelperRttiFactory) null);
        }
    }

    private void IconCompatParcelizer(View view, View view2, int i) {
        Rect read2 = MediaDescriptionCompat.read();
        if (read2 == null) {
            read2 = new Rect();
        }
        Rect read3 = MediaDescriptionCompat.read();
        if (read3 == null) {
            read3 = new Rect();
        }
        Rect rect = read3;
        try {
            hasOverlappingRendering.MediaBrowserCompat$CustomActionResultReceiver(this, view2, read2);
            read read4 = (read) view.getLayoutParams();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            IconCompatParcelizer(i, read2, rect, read4, measuredWidth, measuredHeight);
            IconCompatParcelizer(read4, rect, measuredWidth, measuredHeight);
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        } finally {
            read2.setEmpty();
            MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(read2);
            rect.setEmpty();
            MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(rect);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new read();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new read(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof read) {
            return new read((read) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new read((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new read(layoutParams);
    }

    public final boolean MediaBrowserCompat$ItemReceiver(View view, int i, int i2) {
        Rect read2 = MediaDescriptionCompat.read();
        if (read2 == null) {
            read2 = new Rect();
        }
        hasOverlappingRendering.MediaBrowserCompat$CustomActionResultReceiver(this, view, read2);
        try {
            return read2.contains(i, i2);
        } finally {
            read2.setEmpty();
            MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(read2);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c8, code lost:
        if (r0.IconCompatParcelizer(r31, r19, r25, r20, r26, 0) == false) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r5 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0172 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r32, int r33) {
        /*
            r31 = this;
            r7 = r31
            java.util.List<android.view.View> r0 = r7.MediaSessionCompat$QueueItem
            r0.clear()
            o.AppCompatRadioButton<android.view.View> r0 = r7.MediaSessionCompat$Token
            o.AppCompatCheckBox<T, java.util.ArrayList<T>> r1 = r0.write
            int r1 = r1.size()
            r2 = 0
        L_0x0010:
            r3 = 1
            if (r2 >= r1) goto L_0x002b
            o.AppCompatCheckBox<T, java.util.ArrayList<T>> r4 = r0.write
            java.lang.Object[] r4 = r4.read
            int r5 = r2 << 1
            int r5 = r5 + r3
            r3 = r4[r5]
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L_0x0028
            r3.clear()
            o.setOnCloseListener$read<java.util.ArrayList<T>> r4 = r0.read
            r4.MediaBrowserCompat$CustomActionResultReceiver(r3)
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x002b:
            o.AppCompatCheckBox<T, java.util.ArrayList<T>> r0 = r0.write
            r0.clear()
            int r0 = r31.getChildCount()
            r1 = 0
        L_0x0035:
            if (r1 >= r0) goto L_0x01a3
            android.view.View r2 = r7.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$read r4 = IconCompatParcelizer(r2)
            int r5 = r4.MediaMetadataCompat
            r6 = -1
            r9 = 0
            if (r5 != r6) goto L_0x004b
            r4.MediaBrowserCompat$MediaItem = r9
            r4.MediaBrowserCompat$SearchResultReceiver = r9
            goto L_0x00d2
        L_0x004b:
            android.view.View r5 = r4.MediaBrowserCompat$SearchResultReceiver
            if (r5 == 0) goto L_0x007d
            android.view.View r5 = r4.MediaBrowserCompat$SearchResultReceiver
            int r5 = r5.getId()
            int r6 = r4.MediaMetadataCompat
            if (r5 == r6) goto L_0x005b
        L_0x0059:
            r5 = 0
            goto L_0x007b
        L_0x005b:
            android.view.View r5 = r4.MediaBrowserCompat$SearchResultReceiver
            android.view.ViewParent r6 = r5.getParent()
        L_0x0061:
            if (r6 == r7) goto L_0x0078
            if (r6 == 0) goto L_0x0073
            if (r6 == r2) goto L_0x0073
            boolean r10 = r6 instanceof android.view.View
            if (r10 == 0) goto L_0x006e
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x006e:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0061
        L_0x0073:
            r4.MediaBrowserCompat$MediaItem = r9
            r4.MediaBrowserCompat$SearchResultReceiver = r9
            goto L_0x0059
        L_0x0078:
            r4.MediaBrowserCompat$MediaItem = r5
            r5 = r3
        L_0x007b:
            if (r5 != 0) goto L_0x00d2
        L_0x007d:
            int r5 = r4.MediaMetadataCompat
            android.view.View r5 = r7.findViewById(r5)
            r4.MediaBrowserCompat$SearchResultReceiver = r5
            if (r5 == 0) goto L_0x00c8
            if (r5 != r7) goto L_0x009c
            boolean r5 = r31.isInEditMode()
            if (r5 == 0) goto L_0x0094
            r4.MediaBrowserCompat$MediaItem = r9
            r4.MediaBrowserCompat$SearchResultReceiver = r9
            goto L_0x00d2
        L_0x0094:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x009c:
            android.view.ViewParent r6 = r5.getParent()
        L_0x00a0:
            if (r6 == r7) goto L_0x00c5
            if (r6 == 0) goto L_0x00c5
            if (r6 != r2) goto L_0x00b9
            boolean r5 = r31.isInEditMode()
            if (r5 == 0) goto L_0x00b1
            r4.MediaBrowserCompat$MediaItem = r9
            r4.MediaBrowserCompat$SearchResultReceiver = r9
            goto L_0x00d2
        L_0x00b1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00b9:
            boolean r10 = r6 instanceof android.view.View
            if (r10 == 0) goto L_0x00c0
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00c0:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x00a0
        L_0x00c5:
            r4.MediaBrowserCompat$MediaItem = r5
            goto L_0x00d2
        L_0x00c8:
            boolean r5 = r31.isInEditMode()
            if (r5 == 0) goto L_0x017a
            r4.MediaBrowserCompat$MediaItem = r9
            r4.MediaBrowserCompat$SearchResultReceiver = r9
        L_0x00d2:
            o.AppCompatRadioButton<android.view.View> r5 = r7.MediaSessionCompat$Token
            o.AppCompatCheckBox<T, java.util.ArrayList<T>> r6 = r5.write
            boolean r6 = r6.containsKey(r2)
            if (r6 != 0) goto L_0x00e1
            o.AppCompatCheckBox<T, java.util.ArrayList<T>> r5 = r5.write
            r5.put(r2, r9)
        L_0x00e1:
            r5 = 0
        L_0x00e2:
            if (r5 >= r0) goto L_0x0176
            if (r5 == r1) goto L_0x0172
            android.view.View r6 = r7.getChildAt(r5)
            android.view.View r10 = r4.MediaBrowserCompat$MediaItem
            if (r6 == r10) goto L_0x011a
            int r10 = p040o.SwitchCompat.m3079x50fd9e4a(r31)
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$read r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.read) r11
            int r11 = r11.write
            int r11 = p040o.setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(r11, r10)
            if (r11 == 0) goto L_0x010b
            int r12 = r4.read
            int r10 = p040o.setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(r12, r10)
            r10 = r10 & r11
            if (r10 != r11) goto L_0x010b
            r10 = r3
            goto L_0x010c
        L_0x010b:
            r10 = 0
        L_0x010c:
            if (r10 != 0) goto L_0x011a
            androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver r10 = r4.MediaDescriptionCompat
            if (r10 == 0) goto L_0x0118
            boolean r10 = r10.read(r2, r6)
            if (r10 != 0) goto L_0x011a
        L_0x0118:
            r10 = 0
            goto L_0x011b
        L_0x011a:
            r10 = r3
        L_0x011b:
            if (r10 == 0) goto L_0x0172
            o.AppCompatRadioButton<android.view.View> r10 = r7.MediaSessionCompat$Token
            o.AppCompatCheckBox<T, java.util.ArrayList<T>> r10 = r10.write
            boolean r10 = r10.containsKey(r6)
            if (r10 != 0) goto L_0x0136
            o.AppCompatRadioButton<android.view.View> r10 = r7.MediaSessionCompat$Token
            o.AppCompatCheckBox<T, java.util.ArrayList<T>> r11 = r10.write
            boolean r11 = r11.containsKey(r6)
            if (r11 != 0) goto L_0x0136
            o.AppCompatCheckBox<T, java.util.ArrayList<T>> r10 = r10.write
            r10.put(r6, r9)
        L_0x0136:
            o.AppCompatRadioButton<android.view.View> r10 = r7.MediaSessionCompat$Token
            o.AppCompatCheckBox<T, java.util.ArrayList<T>> r11 = r10.write
            boolean r11 = r11.containsKey(r6)
            if (r11 == 0) goto L_0x016a
            o.AppCompatCheckBox<T, java.util.ArrayList<T>> r11 = r10.write
            boolean r11 = r11.containsKey(r2)
            if (r11 == 0) goto L_0x016a
            o.AppCompatCheckBox<T, java.util.ArrayList<T>> r11 = r10.write
            java.lang.Object r11 = r11.get(r6)
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            if (r11 != 0) goto L_0x0166
            o.setOnCloseListener$read<java.util.ArrayList<T>> r11 = r10.read
            java.lang.Object r11 = r11.read()
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            if (r11 != 0) goto L_0x0161
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x0161:
            o.AppCompatCheckBox<T, java.util.ArrayList<T>> r10 = r10.write
            r10.put(r6, r11)
        L_0x0166:
            r11.add(r2)
            goto L_0x0172
        L_0x016a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0172:
            int r5 = r5 + 1
            goto L_0x00e2
        L_0x0176:
            int r1 = r1 + 1
            goto L_0x0035
        L_0x017a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            r0.append(r1)
            android.content.res.Resources r1 = r31.getResources()
            int r3 = r4.MediaMetadataCompat
            java.lang.String r1 = r1.getResourceName(r3)
            r0.append(r1)
            java.lang.String r1 = " to anchor view "
            r0.append(r1)
            r0.append(r2)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x01a3:
            java.util.List<android.view.View> r0 = r7.MediaSessionCompat$QueueItem
            o.AppCompatRadioButton<android.view.View> r1 = r7.MediaSessionCompat$Token
            java.util.ArrayList r1 = r1.read()
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r7.MediaSessionCompat$QueueItem
            java.util.Collections.reverse(r0)
            r31.read()
            int r9 = r31.getPaddingLeft()
            int r10 = r31.getPaddingTop()
            int r11 = r31.getPaddingRight()
            int r12 = r31.getPaddingBottom()
            int r13 = p040o.SwitchCompat.m3079x50fd9e4a(r31)
            if (r13 != r3) goto L_0x01ce
            r14 = r3
            goto L_0x01cf
        L_0x01ce:
            r14 = 0
        L_0x01cf:
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r6 = android.view.View.MeasureSpec.getMode(r33)
            int r17 = android.view.View.MeasureSpec.getSize(r33)
            int r0 = r31.getSuggestedMinimumWidth()
            int r1 = r31.getSuggestedMinimumHeight()
            o.setTextOff r2 = r7.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x01f4
            boolean r2 = p040o.SwitchCompat.RatingCompat(r31)
            if (r2 == 0) goto L_0x01f4
            r18 = r3
            goto L_0x01f6
        L_0x01f4:
            r18 = 0
        L_0x01f6:
            java.util.List<android.view.View> r2 = r7.MediaSessionCompat$QueueItem
            int r5 = r2.size()
            r4 = r0
            r3 = r1
            r1 = 0
            r2 = 0
        L_0x0200:
            if (r2 >= r5) goto L_0x032f
            java.util.List<android.view.View> r0 = r7.MediaSessionCompat$QueueItem
            java.lang.Object r0 = r0.get(r2)
            r19 = r0
            android.view.View r19 = (android.view.View) r19
            int r0 = r19.getVisibility()
            r8 = 8
            if (r0 == r8) goto L_0x031b
            android.view.ViewGroup$LayoutParams r0 = r19.getLayoutParams()
            r8 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$read r8 = (androidx.coordinatorlayout.widget.CoordinatorLayout.read) r8
            int r0 = r8.IconCompatParcelizer
            if (r0 < 0) goto L_0x0260
            if (r15 == 0) goto L_0x0260
            int r0 = r8.IconCompatParcelizer
            int r0 = r7.MediaBrowserCompat$ItemReceiver(r0)
            r21 = r1
            int r1 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 != 0) goto L_0x0230
            r1 = 8388661(0x800035, float:1.1755018E-38)
        L_0x0230:
            int r1 = p040o.setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(r1, r13)
            r1 = r1 & 7
            r22 = r2
            r2 = 3
            if (r1 != r2) goto L_0x023d
            if (r14 == 0) goto L_0x0242
        L_0x023d:
            r2 = 5
            if (r1 != r2) goto L_0x024e
            if (r14 == 0) goto L_0x024e
        L_0x0242:
            int r1 = r16 - r11
            int r1 = r1 - r0
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            r2 = r0
            r20 = r1
            goto L_0x0267
        L_0x024e:
            if (r1 != r2) goto L_0x0252
            if (r14 == 0) goto L_0x0257
        L_0x0252:
            r2 = 3
            if (r1 != r2) goto L_0x0264
            if (r14 == 0) goto L_0x0264
        L_0x0257:
            int r0 = r0 - r9
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            r20 = r0
            goto L_0x0267
        L_0x0260:
            r21 = r1
            r22 = r2
        L_0x0264:
            r2 = 0
            r20 = r2
        L_0x0267:
            if (r18 == 0) goto L_0x029c
            boolean r0 = p040o.SwitchCompat.RatingCompat(r19)
            if (r0 != 0) goto L_0x029c
            o.setTextOff r0 = r7.MediaBrowserCompat$ItemReceiver
            int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.setTextOff r1 = r7.MediaBrowserCompat$ItemReceiver
            int r1 = r1.write()
            o.setTextOff r2 = r7.MediaBrowserCompat$ItemReceiver
            int r2 = r2.read()
            r24 = r3
            o.setTextOff r3 = r7.MediaBrowserCompat$ItemReceiver
            int r3 = r3.IconCompatParcelizer()
            int r0 = r0 + r1
            int r0 = r16 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r15)
            int r2 = r2 + r3
            int r1 = r17 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            r25 = r0
            r26 = r1
            goto L_0x02a2
        L_0x029c:
            r24 = r3
            r25 = r32
            r26 = r33
        L_0x02a2:
            androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver r0 = r8.MediaDescriptionCompat
            if (r0 == 0) goto L_0x02cb
            r27 = 0
            r3 = r21
            r1 = r31
            r21 = r22
            r22 = 0
            r2 = r19
            r28 = r3
            r29 = r24
            r3 = r25
            r30 = r4
            r4 = r20
            r23 = r5
            r5 = r26
            r24 = r6
            r6 = r27
            boolean r0 = r0.IconCompatParcelizer(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x02e7
            goto L_0x02d9
        L_0x02cb:
            r30 = r4
            r23 = r5
            r28 = r21
            r21 = r22
            r29 = r24
            r22 = 0
            r24 = r6
        L_0x02d9:
            r5 = 0
            r0 = r31
            r1 = r19
            r2 = r25
            r3 = r20
            r4 = r26
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x02e7:
            int r0 = r9 + r11
            int r1 = r19.getMeasuredWidth()
            int r0 = r0 + r1
            int r1 = r8.leftMargin
            int r0 = r0 + r1
            int r1 = r8.rightMargin
            int r0 = r0 + r1
            r1 = r30
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = r10 + r12
            int r2 = r19.getMeasuredHeight()
            int r1 = r1 + r2
            int r2 = r8.topMargin
            int r1 = r1 + r2
            int r2 = r8.bottomMargin
            int r1 = r1 + r2
            r2 = r29
            int r1 = java.lang.Math.max(r2, r1)
            int r2 = r19.getMeasuredState()
            r8 = r28
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r4 = r0
            r3 = r1
            r1 = r2
            goto L_0x0327
        L_0x031b:
            r8 = r1
            r21 = r2
            r2 = r3
            r1 = r4
            r23 = r5
            r24 = r6
            r22 = 0
            r1 = r8
        L_0x0327:
            int r2 = r21 + 1
            r5 = r23
            r6 = r24
            goto L_0x0200
        L_0x032f:
            r8 = r1
            r2 = r3
            r1 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r3 = r32
            int r0 = android.view.View.resolveSizeAndState(r1, r3, r0)
            int r1 = r8 << 16
            r3 = r33
            int r1 = android.view.View.resolveSizeAndState(r2, r3, r1)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }
}

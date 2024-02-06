package p040o;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p040o.AppCompatSeekBar;

/* renamed from: o.SwitchCompat */
public class SwitchCompat {
    private static boolean IconCompatParcelizer;
    private static Field MediaBrowserCompat$CustomActionResultReceiver;
    private static Field MediaBrowserCompat$ItemReceiver;
    private static WeakHashMap<View, String> MediaBrowserCompat$MediaItem;
    private static ThreadLocal<Rect> MediaBrowserCompat$SearchResultReceiver;
    private static WeakHashMap<View, setSwitchPadding> MediaDescriptionCompat = null;
    private static final AtomicInteger MediaMetadataCompat = new AtomicInteger(1);
    private static boolean RatingCompat;
    private static Field read;
    private static boolean write = false;

    private static Rect MediaBrowserCompat$ItemReceiver() {
        if (MediaBrowserCompat$SearchResultReceiver == null) {
            MediaBrowserCompat$SearchResultReceiver = new ThreadLocal<>();
        }
        Rect rect = MediaBrowserCompat$SearchResultReceiver.get();
        if (rect == null) {
            rect = new Rect();
            MediaBrowserCompat$SearchResultReceiver.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void read(View view, setIconifiedByDefault seticonifiedbydefault) {
        view.setAccessibilityDelegate(seticonifiedbydefault == null ? null : seticonifiedbydefault.IconCompatParcelizer());
    }

    public static int MediaMetadataCompat(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void read(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    public static boolean setBackgroundResource(View view) {
        if (write) {
            return false;
        }
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                MediaBrowserCompat$CustomActionResultReceiver = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                write = true;
                return false;
            }
        }
        try {
            if (MediaBrowserCompat$CustomActionResultReceiver.get(view) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused2) {
            write = true;
            return false;
        }
    }

    public static boolean AppCompatViewInflater(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static void write(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    public static void setItemInvoker(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    public static int MediaBrowserCompat$MediaItem(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void write(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setImportantForAccessibility(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static int m3079x50fd9e4a(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static ViewParent setHasDecor(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    public static int read(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static void IconCompatParcelizer(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    public static int MediaSessionCompat$QueueItem(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static int ParcelableVolumeInfo(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static void MediaBrowserCompat$ItemReceiver(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    @Deprecated
    public static float PlaybackStateCompat$CustomAction(View view) {
        return view.getTranslationY();
    }

    public static int MediaSessionCompat$Token(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!RatingCompat) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                read = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            RatingCompat = true;
        }
        Field field = read;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int MediaSessionCompat$ResultReceiverWrapper(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!IconCompatParcelizer) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                MediaBrowserCompat$ItemReceiver = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            IconCompatParcelizer = true;
        }
        Field field = MediaBrowserCompat$ItemReceiver;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static setSwitchPadding write(View view) {
        if (MediaDescriptionCompat == null) {
            MediaDescriptionCompat = new WeakHashMap<>();
        }
        setSwitchPadding setswitchpadding = MediaDescriptionCompat.get(view);
        if (setswitchpadding != null) {
            return setswitchpadding;
        }
        setSwitchPadding setswitchpadding2 = new setSwitchPadding(view);
        MediaDescriptionCompat.put(view, setswitchpadding2);
        return setswitchpadding2;
    }

    @Deprecated
    public static void MediaBrowserCompat$CustomActionResultReceiver(View view, float f) {
        view.setTranslationY(f);
    }

    @Deprecated
    public static void MediaBrowserCompat$ItemReceiver(View view, float f) {
        view.setAlpha(f);
    }

    @Deprecated
    public static void write(View view, float f) {
        view.setScaleX(f);
    }

    @Deprecated
    public static void read(View view, float f) {
        view.setScaleY(f);
    }

    @Deprecated
    public static float setContentView(View view) {
        return view.getX();
    }

    @Deprecated
    public static float AppCompatDialogFragment(View view) {
        return view.getY();
    }

    public static void IconCompatParcelizer(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    public static float MediaBrowserCompat$SearchResultReceiver(View view) {
        return Build.VERSION.SDK_INT >= 21 ? view.getElevation() : BitmapDescriptorFactory.HUE_RED;
    }

    public static void MediaDescriptionCompat(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    public static float AlertController$RecycleListView(View view) {
        return Build.VERSION.SDK_INT >= 21 ? view.getTranslationZ() : BitmapDescriptorFactory.HUE_RED;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (MediaBrowserCompat$MediaItem == null) {
            MediaBrowserCompat$MediaItem = new WeakHashMap<>();
        }
        MediaBrowserCompat$MediaItem.put(view, str);
    }

    public static String Keep(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = MediaBrowserCompat$MediaItem;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int PlaybackStateCompat(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static void setShortcut(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else if (Build.VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static boolean RatingCompat(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    @Deprecated
    public static void read(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void write(View view, final CheckCaptureModule_GetIJsonExactionHelperRttiFactory checkCaptureModule_GetIJsonExactionHelperRttiFactory) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (checkCaptureModule_GetIJsonExactionHelperRttiFactory == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return (WindowInsets) setTextOff.read(checkCaptureModule_GetIJsonExactionHelperRttiFactory.write(view, setTextOff.IconCompatParcelizer(windowInsets)));
                }
            });
        }
    }

    public static setTextOff write(View view, setTextOff settextoff) {
        if (Build.VERSION.SDK_INT < 21) {
            return settextoff;
        }
        WindowInsets windowInsets = (WindowInsets) setTextOff.read(settextoff);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return setTextOff.IconCompatParcelizer(windowInsets);
    }

    public static setTextOff IconCompatParcelizer(View view, setTextOff settextoff) {
        if (Build.VERSION.SDK_INT < 21) {
            return settextoff;
        }
        WindowInsets windowInsets = (WindowInsets) setTextOff.read(settextoff);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return setTextOff.IconCompatParcelizer(windowInsets);
    }

    public static boolean setChecked(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean setPadding(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static void IconCompatParcelizer(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static ColorStateList MediaBrowserCompat$CustomActionResultReceiver(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof setShowText) {
            return ((setShowText) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void MediaBrowserCompat$ItemReceiver(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof setShowText) {
            ((setShowText) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static PorterDuff.Mode MediaBrowserCompat$ItemReceiver(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof setShowText) {
            return ((setShowText) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void write(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof setShowText) {
            ((setShowText) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static void IconCompatParcelizer(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (view instanceof setSearchableInfo) {
            ((setSearchableInfo) view).setNestedScrollingEnabled(z);
        }
    }

    public static boolean ActionMenuItemView(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof setSearchableInfo) {
            return ((setSearchableInfo) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static void setIcon(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof setSearchableInfo) {
            ((setSearchableInfo) view).stopNestedScroll();
        }
    }

    public static void MediaDescriptionCompat(View view, int i) {
        if (view instanceof setQueryRefinementEnabled) {
            ((setQueryRefinementEnabled) view).IconCompatParcelizer(i);
        } else if (i == 0) {
            setIcon(view);
        }
    }

    public static boolean setCheckable(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static float AppCompatDelegateImpl$ListMenuDecorView(View view) {
        return Build.VERSION.SDK_INT >= 21 ? view.getZ() : BitmapDescriptorFactory.HUE_RED;
    }

    public static void MediaBrowserCompat$ItemReceiver(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                MediaBrowserCompat$ItemReceiver2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !MediaBrowserCompat$ItemReceiver2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            RatingCompat(view, i);
            if (z && MediaBrowserCompat$ItemReceiver2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(MediaBrowserCompat$ItemReceiver2);
            }
        } else {
            RatingCompat(view, i);
        }
    }

    private static void RatingCompat(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            setPopupCallback(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                setPopupCallback((View) parent);
            }
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                MediaBrowserCompat$ItemReceiver2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !MediaBrowserCompat$ItemReceiver2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            MediaMetadataCompat(view, i);
            if (z && MediaBrowserCompat$ItemReceiver2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(MediaBrowserCompat$ItemReceiver2);
            }
        } else {
            MediaMetadataCompat(view, i);
        }
    }

    private static void MediaMetadataCompat(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            setPopupCallback(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                setPopupCallback((View) parent);
            }
        }
    }

    private static void setPopupCallback(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void MediaBrowserCompat$ItemReceiver(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static Rect IconCompatParcelizer(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static boolean setExpandedFormat(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean AppCompatActivity(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static void write(View view, setThreshold setthreshold) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (setthreshold != null ? setthreshold.write() : null));
        }
    }

    public static Display MediaDescriptionCompat(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (setExpandedFormat(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    protected SwitchCompat() {
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return read.MediaBrowserCompat$CustomActionResultReceiver(view).IconCompatParcelizer(keyEvent);
    }

    static boolean MediaBrowserCompat$ItemReceiver(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return read.MediaBrowserCompat$CustomActionResultReceiver(view).IconCompatParcelizer(view, keyEvent);
    }

    /* renamed from: o.SwitchCompat$read */
    static class read {
        private static final ArrayList<WeakReference<View>> read = new ArrayList<>();
        private WeakHashMap<View, Boolean> MediaBrowserCompat$CustomActionResultReceiver = null;
        private SparseArray<WeakReference<View>> MediaBrowserCompat$ItemReceiver = null;
        private WeakReference<KeyEvent> write = null;

        read() {
        }

        private SparseArray<WeakReference<View>> write() {
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                this.MediaBrowserCompat$ItemReceiver = new SparseArray<>();
            }
            return this.MediaBrowserCompat$ItemReceiver;
        }

        static read MediaBrowserCompat$CustomActionResultReceiver(View view) {
            read read2 = (read) view.getTag(AppCompatSeekBar.IconCompatParcelizer.tag_unhandled_key_event_manager);
            if (read2 != null) {
                return read2;
            }
            read read3 = new read();
            view.setTag(AppCompatSeekBar.IconCompatParcelizer.tag_unhandled_key_event_manager, read3);
            return read3;
        }

        /* access modifiers changed from: package-private */
        public boolean IconCompatParcelizer(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                IconCompatParcelizer();
            }
            View read2 = read(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (read2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    write().put(keyCode, new WeakReference(read2));
                }
            }
            return read2 != null;
        }

        private View read(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View read2 = read(viewGroup.getChildAt(childCount), keyEvent);
                    if (read2 != null) {
                        return read2;
                    }
                }
            }
            if (write(view, keyEvent)) {
                return view;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean IconCompatParcelizer(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.write;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.write = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> write2 = write();
            WeakReference weakReference2 = null;
            if (keyEvent.getAction() == 1 && (indexOfKey = write2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = write2.valueAt(indexOfKey);
                write2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = write2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && SwitchCompat.setExpandedFormat(view)) {
                write(view, keyEvent);
            }
            return true;
        }

        private boolean write(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(AppCompatSeekBar.IconCompatParcelizer.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((SwitchCompat$MediaBrowserCompat$CustomActionResultReceiver) arrayList.get(size)).MediaBrowserCompat$ItemReceiver(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void IconCompatParcelizer() {
            WeakHashMap<View, Boolean> weakHashMap = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!read.isEmpty()) {
                synchronized (read) {
                    if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakHashMap<>();
                    }
                    for (int size = read.size() - 1; size >= 0; size--) {
                        View view = (View) read.get(size).get();
                        if (view == null) {
                            read.remove(size);
                        } else {
                            this.MediaBrowserCompat$CustomActionResultReceiver.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.MediaBrowserCompat$CustomActionResultReceiver.put((View) parent, Boolean.TRUE);
                            }
                            continue;
                        }
                    }
                }
            }
        }
    }
}

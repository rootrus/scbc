package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.ExtractorResponse;
import p040o.SwitchCompat;
import p040o.nAllocationSetSurface;
import p040o.nAllocationSetSurface$MediaBrowserCompat$MediaItem;
import p040o.nAllocationSetSurface$MediaSessionCompat$Token;
import p040o.nIncElementCreate;
import p040o.setIconifiedByDefault;
import p040o.setTextOff;
import p040o.setTextOn;
import p040o.setThumbDrawable;
import p040o.setThumbDrawable$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.zzlz;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final Handler IconCompatParcelizer = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).MediaMetadataCompat();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).write(message.arg1);
                return true;
            }
        }
    });
    private static final int[] RatingCompat = {nAllocationSetSurface.read.snackbarStyle};
    static final boolean read = (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 19);
    final ExtractorResponse MediaBrowserCompat$CustomActionResultReceiver;
    final AccessibilityManager MediaBrowserCompat$ItemReceiver;
    private final Context MediaBrowserCompat$MediaItem;
    protected final SnackbarBaseLayout MediaBrowserCompat$SearchResultReceiver;
    private int MediaDescriptionCompat;
    private final ViewGroup MediaMetadataCompat;
    final nIncElementCreate.read write = new nIncElementCreate.read() {
        public final void MediaBrowserCompat$ItemReceiver() {
            Handler handler = BaseTransientBottomBar.IconCompatParcelizer;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public final void IconCompatParcelizer(int i) {
            BaseTransientBottomBar.IconCompatParcelizer.sendMessage(BaseTransientBottomBar.IconCompatParcelizer.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    };

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, ExtractorResponse extractorResponse) {
        int i;
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (extractorResponse != null) {
            this.MediaMetadataCompat = viewGroup;
            this.MediaBrowserCompat$CustomActionResultReceiver = extractorResponse;
            Context context = viewGroup.getContext();
            this.MediaBrowserCompat$MediaItem = context;
            AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(context, AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(this.MediaBrowserCompat$MediaItem);
            TypedArray obtainStyledAttributes = this.MediaBrowserCompat$MediaItem.obtainStyledAttributes(RatingCompat);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                i = nAllocationSetSurface$MediaBrowserCompat$MediaItem.mtrl_layout_snackbar;
            } else {
                i = nAllocationSetSurface$MediaBrowserCompat$MediaItem.design_layout_snackbar;
            }
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) from.inflate(i, this.MediaMetadataCompat, false);
            this.MediaBrowserCompat$SearchResultReceiver = snackbarBaseLayout;
            snackbarBaseLayout.addView(view);
            SwitchCompat.IconCompatParcelizer((View) this.MediaBrowserCompat$SearchResultReceiver, 1);
            SwitchCompat.write((View) this.MediaBrowserCompat$SearchResultReceiver, 1);
            SwitchCompat.read((View) this.MediaBrowserCompat$SearchResultReceiver, true);
            SwitchCompat.write((View) this.MediaBrowserCompat$SearchResultReceiver, (CheckCaptureModule_GetIJsonExactionHelperRttiFactory) new CheckCaptureModule_GetIJsonExactionHelperRttiFactory() {
                public final setTextOff write(View view, setTextOff settextoff) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), settextoff.IconCompatParcelizer());
                    return settextoff;
                }
            });
            SwitchCompat.read((View) this.MediaBrowserCompat$SearchResultReceiver, (setIconifiedByDefault) new setIconifiedByDefault() {
                public final void IconCompatParcelizer(View view, setTextOn settexton) {
                    super.IconCompatParcelizer(view, settexton);
                    settexton.read((int) PKIFailureInfo.badCertTemplate);
                    settexton.MediaBrowserCompat$MediaItem(true);
                }

                public final boolean MediaBrowserCompat$ItemReceiver(View view, int i, Bundle bundle) {
                    if (i != 1048576) {
                        return super.MediaBrowserCompat$ItemReceiver(view, i, bundle);
                    }
                    BaseTransientBottomBar.this.read();
                    return true;
                }
            });
            this.MediaBrowserCompat$ItemReceiver = (AccessibilityManager) this.MediaBrowserCompat$MediaItem.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public final B read(int i) {
        this.MediaDescriptionCompat = i;
        return this;
    }

    public int MediaBrowserCompat$ItemReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final Context MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$MediaItem;
    }

    /* access modifiers changed from: package-private */
    public final void MediaMetadataCompat() {
        boolean z = true;
        if (this.MediaBrowserCompat$SearchResultReceiver.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.MediaBrowserCompat$SearchResultReceiver.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.read) {
                CoordinatorLayout.read read2 = (CoordinatorLayout.read) layoutParams;
                Behavior behavior = new Behavior();
                behavior.MediaBrowserCompat$SearchResultReceiver.write = this.write;
                behavior.read = new SwipeDismissBehavior.write() {
                    public final void read(View view) {
                        view.setVisibility(8);
                        BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                        if (nIncElementCreate.read == null) {
                            nIncElementCreate.read = new nIncElementCreate();
                        }
                        nIncElementCreate.read.MediaBrowserCompat$ItemReceiver(baseTransientBottomBar.write, 0);
                    }

                    public final void write(int i) {
                        if (i == 0) {
                            if (nIncElementCreate.read == null) {
                                nIncElementCreate.read = new nIncElementCreate();
                            }
                            nIncElementCreate.read.read(BaseTransientBottomBar.this.write);
                        } else if (i == 1 || i == 2) {
                            if (nIncElementCreate.read == null) {
                                nIncElementCreate.read = new nIncElementCreate();
                            }
                            nIncElementCreate.read.MediaBrowserCompat$ItemReceiver(BaseTransientBottomBar.this.write);
                        }
                    }
                };
                if (read2.MediaDescriptionCompat != behavior) {
                    read2.MediaDescriptionCompat = behavior;
                    read2.RatingCompat = true;
                    behavior.IconCompatParcelizer(read2);
                }
                read2.write = 80;
            }
            this.MediaMetadataCompat.addView(this.MediaBrowserCompat$SearchResultReceiver);
        }
        this.MediaBrowserCompat$SearchResultReceiver.write = new Object() {
            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                if (nIncElementCreate.read == null) {
                    nIncElementCreate.read = new nIncElementCreate();
                }
                if (nIncElementCreate.read.write(baseTransientBottomBar.write)) {
                    BaseTransientBottomBar.IconCompatParcelizer.post(this);
                }
            }

            public final void run() {
                BaseTransientBottomBar.this.IconCompatParcelizer();
            }
        };
        if (SwitchCompat.setCheckable(this.MediaBrowserCompat$SearchResultReceiver)) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.MediaBrowserCompat$ItemReceiver.getEnabledAccessibilityServiceList(1);
            if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
                z = false;
            }
            if (z) {
                write();
            } else {
                MediaBrowserCompat$MediaItem();
            }
        } else {
            this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = new BaseTransientBottomBar$MediaBrowserCompat$ItemReceiver() {
                public final void read() {
                    BaseTransientBottomBar.this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
                    boolean z = true;
                    List<AccessibilityServiceInfo> enabledAccessibilityServiceList = BaseTransientBottomBar.this.MediaBrowserCompat$ItemReceiver.getEnabledAccessibilityServiceList(1);
                    if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
                        z = false;
                    }
                    if (z) {
                        BaseTransientBottomBar.this.write();
                    } else {
                        BaseTransientBottomBar.this.MediaBrowserCompat$MediaItem();
                    }
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        final int MediaDescriptionCompat2 = MediaDescriptionCompat();
        if (read) {
            SwitchCompat.MediaBrowserCompat$ItemReceiver((View) this.MediaBrowserCompat$SearchResultReceiver, MediaDescriptionCompat2);
        } else {
            this.MediaBrowserCompat$SearchResultReceiver.setTranslationY((float) MediaDescriptionCompat2);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{MediaDescriptionCompat2, 0});
        valueAnimator.setInterpolator(zzlz.read);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            }

            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.MediaBrowserCompat$MediaItem();
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            private int IconCompatParcelizer = MediaDescriptionCompat2;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.read) {
                    SwitchCompat.MediaBrowserCompat$ItemReceiver((View) BaseTransientBottomBar.this.MediaBrowserCompat$SearchResultReceiver, intValue - this.IconCompatParcelizer);
                } else {
                    BaseTransientBottomBar.this.MediaBrowserCompat$SearchResultReceiver.setTranslationY((float) intValue);
                }
                this.IconCompatParcelizer = intValue;
            }
        });
        valueAnimator.start();
    }

    private int MediaDescriptionCompat() {
        int height = this.MediaBrowserCompat$SearchResultReceiver.getHeight();
        ViewGroup.LayoutParams layoutParams = this.MediaBrowserCompat$SearchResultReceiver.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    protected static class SnackbarBaseLayout extends FrameLayout {
        BaseTransientBottomBar$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
        private final AccessibilityManager MediaBrowserCompat$ItemReceiver;
        private final setThumbDrawable$MediaBrowserCompat$CustomActionResultReceiver read;
        C0182x1e09699c write;

        protected SnackbarBaseLayout(Context context) {
            this(context, (AttributeSet) null);
        }

        protected SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.SnackbarLayout_elevation)) {
                SwitchCompat.IconCompatParcelizer((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            this.MediaBrowserCompat$ItemReceiver = (AccessibilityManager) context.getSystemService("accessibility");
            C01784 r3 = new setThumbDrawable$MediaBrowserCompat$CustomActionResultReceiver() {
                public final void MediaBrowserCompat$ItemReceiver(boolean z) {
                    SnackbarBaseLayout snackbarBaseLayout = SnackbarBaseLayout.this;
                    snackbarBaseLayout.setClickable(!z);
                    snackbarBaseLayout.setFocusable(z);
                }
            };
            this.read = r3;
            setThumbDrawable.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, r3);
            boolean isTouchExplorationEnabled = this.MediaBrowserCompat$ItemReceiver.isTouchExplorationEnabled();
            setClickable(!isTouchExplorationEnabled);
            setFocusable(isTouchExplorationEnabled);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar$MediaBrowserCompat$ItemReceiver baseTransientBottomBar$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (baseTransientBottomBar$MediaBrowserCompat$ItemReceiver != null) {
                baseTransientBottomBar$MediaBrowserCompat$ItemReceiver.read();
            }
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            SwitchCompat.setShortcut(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C0182x1e09699c baseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver = this.write;
            if (baseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver != null) {
                baseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            }
            setThumbDrawable.write(this.MediaBrowserCompat$ItemReceiver, this.read);
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {
        final read MediaBrowserCompat$SearchResultReceiver = new read(this);

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            read read = this.MediaBrowserCompat$SearchResultReceiver;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    if (nIncElementCreate.read == null) {
                        nIncElementCreate.read = new nIncElementCreate();
                    }
                    nIncElementCreate.read.read(read.write);
                }
            } else if (coordinatorLayout.MediaBrowserCompat$ItemReceiver(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                if (nIncElementCreate.read == null) {
                    nIncElementCreate.read = new nIncElementCreate();
                }
                nIncElementCreate.read.MediaBrowserCompat$ItemReceiver(read.write);
            }
            return super.MediaBrowserCompat$CustomActionResultReceiver(coordinatorLayout, view, motionEvent);
        }

        public final boolean MediaBrowserCompat$ItemReceiver(View view) {
            return view instanceof SnackbarBaseLayout;
        }
    }

    public static class read {
        nIncElementCreate.read write;

        public read(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.IconCompatParcelizer = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 0.1f), 1.0f);
            swipeDismissBehavior.write = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 0.6f), 1.0f);
            swipeDismissBehavior.MediaBrowserCompat$CustomActionResultReceiver = 0;
        }
    }

    public void read() {
        if (nIncElementCreate.read == null) {
            nIncElementCreate.read = new nIncElementCreate();
        }
        nIncElementCreate.read.MediaBrowserCompat$ItemReceiver(this.write, 3);
    }

    /* access modifiers changed from: package-private */
    public final void write(final int i) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.MediaBrowserCompat$ItemReceiver.getEnabledAccessibilityServiceList(1);
        if (!(enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) || this.MediaBrowserCompat$SearchResultReceiver.getVisibility() != 0) {
            IconCompatParcelizer();
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, MediaDescriptionCompat()});
        valueAnimator.setInterpolator(zzlz.read);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.MediaBrowserCompat$CustomActionResultReceiver.write();
            }

            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.IconCompatParcelizer();
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            private int IconCompatParcelizer = 0;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.read) {
                    SwitchCompat.MediaBrowserCompat$ItemReceiver((View) BaseTransientBottomBar.this.MediaBrowserCompat$SearchResultReceiver, intValue - this.IconCompatParcelizer);
                } else {
                    BaseTransientBottomBar.this.MediaBrowserCompat$SearchResultReceiver.setTranslationY((float) intValue);
                }
                this.IconCompatParcelizer = intValue;
            }
        });
        valueAnimator.start();
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer() {
        if (nIncElementCreate.read == null) {
            nIncElementCreate.read = new nIncElementCreate();
        }
        nIncElementCreate.read.IconCompatParcelizer(this.write);
        ViewParent parent = this.MediaBrowserCompat$SearchResultReceiver.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$MediaItem() {
        /*
            r6 = this;
            o.nIncElementCreate r0 = p040o.nIncElementCreate.read
            if (r0 != 0) goto L_0x000b
            o.nIncElementCreate r0 = new o.nIncElementCreate
            r0.<init>()
            p040o.nIncElementCreate.read = r0
        L_0x000b:
            o.nIncElementCreate r0 = p040o.nIncElementCreate.read
            o.nIncElementCreate$read r1 = r6.write
            java.lang.Object r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            monitor-enter(r2)
            o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver r3 = r0.write     // Catch:{ all -> 0x0032 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0028
            if (r1 == 0) goto L_0x0024
            java.lang.ref.WeakReference<o.nIncElementCreate$read> r3 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0032 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0032 }
            if (r3 != r1) goto L_0x0024
            r1 = r4
            goto L_0x0025
        L_0x0024:
            r1 = r5
        L_0x0025:
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r4 = r5
        L_0x0029:
            if (r4 == 0) goto L_0x0030
            o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver r1 = r0.write     // Catch:{ all -> 0x0032 }
            r0.write((p040o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver) r1)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r2)
            return
        L_0x0032:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.MediaBrowserCompat$MediaItem():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[SYNTHETIC, Splitter:B:20:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void RatingCompat() {
        /*
            r7 = this;
            o.nIncElementCreate r0 = p040o.nIncElementCreate.read
            if (r0 != 0) goto L_0x000b
            o.nIncElementCreate r0 = new o.nIncElementCreate
            r0.<init>()
            p040o.nIncElementCreate.read = r0
        L_0x000b:
            o.nIncElementCreate r0 = p040o.nIncElementCreate.read
            int r1 = r7.MediaBrowserCompat$ItemReceiver()
            o.nIncElementCreate$read r2 = r7.write
            java.lang.Object r3 = r0.MediaBrowserCompat$CustomActionResultReceiver
            monitor-enter(r3)
            o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver r4 = r0.write     // Catch:{ all -> 0x007c }
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x002d
            if (r2 == 0) goto L_0x0028
            java.lang.ref.WeakReference<o.nIncElementCreate$read> r4 = r4.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x007c }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x007c }
            if (r4 != r2) goto L_0x0028
            r4 = r5
            goto L_0x0029
        L_0x0028:
            r4 = r6
        L_0x0029:
            if (r4 == 0) goto L_0x002d
            r4 = r5
            goto L_0x002e
        L_0x002d:
            r4 = r6
        L_0x002e:
            if (r4 == 0) goto L_0x0042
            o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver r2 = r0.write     // Catch:{ all -> 0x007c }
            r2.IconCompatParcelizer = r1     // Catch:{ all -> 0x007c }
            android.os.Handler r1 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x007c }
            o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver r2 = r0.write     // Catch:{ all -> 0x007c }
            r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x007c }
            o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver r1 = r0.write     // Catch:{ all -> 0x007c }
            r0.write((p040o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver) r1)     // Catch:{ all -> 0x007c }
            monitor-exit(r3)
            return
        L_0x0042:
            o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver r4 = r0.IconCompatParcelizer     // Catch:{ all -> 0x007c }
            if (r4 == 0) goto L_0x0056
            if (r2 == 0) goto L_0x0052
            java.lang.ref.WeakReference<o.nIncElementCreate$read> r4 = r4.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x007c }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x007c }
            if (r4 != r2) goto L_0x0052
            r4 = r5
            goto L_0x0053
        L_0x0052:
            r4 = r6
        L_0x0053:
            if (r4 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r5 = r6
        L_0x0057:
            if (r5 == 0) goto L_0x005e
            o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver r2 = r0.IconCompatParcelizer     // Catch:{ all -> 0x007c }
            r2.IconCompatParcelizer = r1     // Catch:{ all -> 0x007c }
            goto L_0x0065
        L_0x005e:
            o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver r4 = new o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x007c }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x007c }
            r0.IconCompatParcelizer = r4     // Catch:{ all -> 0x007c }
        L_0x0065:
            o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver r1 = r0.write     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x0074
            o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver r1 = r0.write     // Catch:{ all -> 0x007c }
            r2 = 4
            boolean r1 = r0.MediaBrowserCompat$ItemReceiver((p040o.nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver) r1, (int) r2)     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x0074
            monitor-exit(r3)
            return
        L_0x0074:
            r1 = 0
            r0.write = r1     // Catch:{ all -> 0x007c }
            r0.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x007c }
            monitor-exit(r3)
            return
        L_0x007c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.RatingCompat():void");
    }
}

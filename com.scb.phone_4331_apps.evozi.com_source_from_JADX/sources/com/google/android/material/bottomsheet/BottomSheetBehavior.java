package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p040o.SwitchCompat;
import p040o.nAllocationSetSurface;
import p040o.nAllocationSetSurface$MediaSessionCompat$Token;
import p040o.setTitleMargin;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver<V> {
    private float AlertController$RecycleListView;
    private boolean AppCompatActivity;
    private int AppCompatDelegateImpl$ListMenuDecorView;
    private int AppCompatDialogFragment;
    int IconCompatParcelizer;
    private Map<View, Integer> Keep;
    int MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    boolean f47x50fd9e4a;
    public int MediaDescriptionCompat = 4;
    int MediaMetadataCompat;
    setTitleMargin MediaSessionCompat$QueueItem;
    public WeakReference<V> MediaSessionCompat$ResultReceiverWrapper;
    private boolean MediaSessionCompat$Token;
    private final setTitleMargin.read ParcelableVolumeInfo = new setTitleMargin.read() {
        public final boolean IconCompatParcelizer(View view, int i) {
            View view2;
            if (BottomSheetBehavior.this.MediaDescriptionCompat == 1 || BottomSheetBehavior.this.f47x50fd9e4a) {
                return false;
            }
            if (BottomSheetBehavior.this.MediaDescriptionCompat == 3 && BottomSheetBehavior.this.MediaBrowserCompat$CustomActionResultReceiver == i && (view2 = BottomSheetBehavior.this.RatingCompat.get()) != null && view2.canScrollVertically(-1)) {
                return false;
            }
            if (BottomSheetBehavior.this.MediaSessionCompat$ResultReceiverWrapper == null || BottomSheetBehavior.this.MediaSessionCompat$ResultReceiverWrapper.get() != view) {
                return false;
            }
            return true;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(View view, int i, int i2) {
            BottomSheetBehavior.this.MediaSessionCompat$ResultReceiverWrapper.get();
        }

        public final void MediaBrowserCompat$ItemReceiver(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.IconCompatParcelizer(1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void write(android.view.View r6, float r7, float r8) {
            /*
                r5 = this;
                r0 = 0
                int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                r2 = 3
                r3 = 4
                if (r1 >= 0) goto L_0x0023
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r7 = r7.write
                if (r7 == 0) goto L_0x0013
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.IconCompatParcelizer
                goto L_0x00c7
            L_0x0013:
                int r7 = r6.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.MediaMetadataCompat
                if (r7 <= r8) goto L_0x00a4
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.MediaMetadataCompat
                goto L_0x00bf
            L_0x0023:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r1 = r1.MediaBrowserCompat$MediaItem
                if (r1 == 0) goto L_0x004e
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r1 = r1.MediaBrowserCompat$ItemReceiver(r6, r8)
                if (r1 == 0) goto L_0x004e
                int r1 = r6.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r4 = r4.MediaBrowserCompat$ItemReceiver
                if (r1 > r4) goto L_0x0047
                float r1 = java.lang.Math.abs(r7)
                float r4 = java.lang.Math.abs(r8)
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 >= 0) goto L_0x004e
            L_0x0047:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.MediaBrowserCompat$SearchResultReceiver
                r2 = 5
                goto L_0x00c7
            L_0x004e:
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x0064
                float r7 = java.lang.Math.abs(r7)
                float r8 = java.lang.Math.abs(r8)
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 > 0) goto L_0x0064
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.MediaBrowserCompat$ItemReceiver
            L_0x0062:
                r2 = r3
                goto L_0x00c7
            L_0x0064:
                int r7 = r6.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.write
                if (r8 == 0) goto L_0x008d
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.IconCompatParcelizer
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.MediaBrowserCompat$ItemReceiver
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r8 >= r7) goto L_0x0088
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.IconCompatParcelizer
                goto L_0x00c7
            L_0x0088:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.MediaBrowserCompat$ItemReceiver
                goto L_0x0062
            L_0x008d:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.MediaMetadataCompat
                if (r7 >= r8) goto L_0x00a6
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.MediaBrowserCompat$ItemReceiver
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                if (r7 < r8) goto L_0x00a4
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.MediaMetadataCompat
                goto L_0x00bf
            L_0x00a4:
                r7 = 0
                goto L_0x00c7
            L_0x00a6:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.MediaMetadataCompat
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.MediaBrowserCompat$ItemReceiver
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r8 >= r7) goto L_0x00c2
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.MediaMetadataCompat
            L_0x00bf:
                r8 = 6
                r2 = r8
                goto L_0x00c7
            L_0x00c2:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.MediaBrowserCompat$ItemReceiver
                goto L_0x0062
            L_0x00c7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                o.setTitleMargin r8 = r8.MediaSessionCompat$QueueItem
                int r0 = r6.getLeft()
                boolean r7 = r8.IconCompatParcelizer(r0, r7)
                if (r7 == 0) goto L_0x00e6
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r8 = 2
                r7.IconCompatParcelizer(r8)
                com.google.android.material.bottomsheet.BottomSheetBehavior$read r7 = new com.google.android.material.bottomsheet.BottomSheetBehavior$read
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r7.<init>(r6, r2)
                p040o.SwitchCompat.MediaBrowserCompat$ItemReceiver((android.view.View) r6, (java.lang.Runnable) r7)
                return
            L_0x00e6:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r6.IconCompatParcelizer(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C01622.write(android.view.View, float, float):void");
        }

        public final int read(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.write ? bottomSheetBehavior.IconCompatParcelizer : 0;
            int i3 = BottomSheetBehavior.this.MediaBrowserCompat$MediaItem ? BottomSheetBehavior.this.MediaBrowserCompat$SearchResultReceiver : BottomSheetBehavior.this.MediaBrowserCompat$ItemReceiver;
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }

        public final int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
            return view.getLeft();
        }

        public final int IconCompatParcelizer() {
            if (BottomSheetBehavior.this.MediaBrowserCompat$MediaItem) {
                return BottomSheetBehavior.this.MediaBrowserCompat$SearchResultReceiver;
            }
            return BottomSheetBehavior.this.MediaBrowserCompat$ItemReceiver;
        }
    };
    private int PlaybackStateCompat;
    private int PlaybackStateCompat$CustomAction;
    WeakReference<View> RatingCompat;
    public BottomSheetBehavior$MediaBrowserCompat$ItemReceiver read;
    private boolean setBackgroundResource;
    private VelocityTracker setChecked;
    private boolean setContentView;
    private int setHasDecor;
    boolean write = true;

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(nAllocationSetSurface$MediaSessionCompat$Token.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || peekValue.data != -1) {
            MediaBrowserCompat$CustomActionResultReceiver(obtainStyledAttributes.getDimensionPixelSize(nAllocationSetSurface$MediaSessionCompat$Token.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            MediaBrowserCompat$CustomActionResultReceiver(peekValue.data);
        }
        this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.BottomSheetBehavior_Layout_behavior_hideable, false);
        boolean z = obtainStyledAttributes.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.write != z) {
            this.write = z;
            if (this.MediaSessionCompat$ResultReceiverWrapper != null) {
                read();
            }
            IconCompatParcelizer((!this.write || this.MediaDescriptionCompat != 6) ? this.MediaDescriptionCompat : 3);
        }
        this.AppCompatActivity = obtainStyledAttributes.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        obtainStyledAttributes.recycle();
        this.AlertController$RecycleListView = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final Parcelable MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, V v) {
        return new C0163xc9694653(super.MediaBrowserCompat$CustomActionResultReceiver(coordinatorLayout, v), this.MediaDescriptionCompat);
    }

    public final void read(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C0163xc9694653 bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver = (C0163xc9694653) parcelable;
        super.read(coordinatorLayout, v, bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.write);
        if (bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver == 1 || bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver == 2) {
            this.MediaDescriptionCompat = 4;
        } else {
            this.MediaDescriptionCompat = bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (SwitchCompat.RatingCompat(coordinatorLayout) && !SwitchCompat.RatingCompat(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.MediaBrowserCompat$ItemReceiver((View) v, i);
        this.MediaBrowserCompat$SearchResultReceiver = coordinatorLayout.getHeight();
        if (this.setContentView) {
            if (this.AppCompatDelegateImpl$ListMenuDecorView == 0) {
                this.AppCompatDelegateImpl$ListMenuDecorView = coordinatorLayout.getResources().getDimensionPixelSize(nAllocationSetSurface.IconCompatParcelizer.design_bottom_sheet_peek_height_min);
            }
            this.PlaybackStateCompat$CustomAction = Math.max(this.AppCompatDelegateImpl$ListMenuDecorView, this.MediaBrowserCompat$SearchResultReceiver - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.PlaybackStateCompat$CustomAction = this.AppCompatDialogFragment;
        }
        int i2 = 0;
        this.IconCompatParcelizer = Math.max(0, this.MediaBrowserCompat$SearchResultReceiver - v.getHeight());
        this.MediaMetadataCompat = this.MediaBrowserCompat$SearchResultReceiver / 2;
        read();
        int i3 = this.MediaDescriptionCompat;
        if (i3 == 3) {
            if (this.write) {
                i2 = this.IconCompatParcelizer;
            }
            SwitchCompat.MediaBrowserCompat$ItemReceiver((View) v, i2);
        } else if (i3 == 6) {
            SwitchCompat.MediaBrowserCompat$ItemReceiver((View) v, this.MediaMetadataCompat);
        } else if (!this.MediaBrowserCompat$MediaItem || i3 != 5) {
            int i4 = this.MediaDescriptionCompat;
            if (i4 == 4) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) v, this.MediaBrowserCompat$ItemReceiver);
            } else if (i4 == 1 || i4 == 2) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) v, top - v.getTop());
            }
        } else {
            SwitchCompat.MediaBrowserCompat$ItemReceiver((View) v, this.MediaBrowserCompat$SearchResultReceiver);
        }
        if (this.MediaSessionCompat$QueueItem == null) {
            this.MediaSessionCompat$QueueItem = setTitleMargin.write((ViewGroup) coordinatorLayout, this.ParcelableVolumeInfo);
        }
        this.MediaSessionCompat$ResultReceiverWrapper = new WeakReference<>(v);
        this.RatingCompat = new WeakReference<>(MediaBrowserCompat$ItemReceiver(v));
        return true;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        setTitleMargin settitlemargin;
        if (!v.isShown()) {
            this.MediaSessionCompat$Token = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = -1;
            VelocityTracker velocityTracker = this.setChecked;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.setChecked = null;
            }
        }
        if (this.setChecked == null) {
            this.setChecked = VelocityTracker.obtain();
        }
        this.setChecked.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.PlaybackStateCompat = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.RatingCompat;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && coordinatorLayout.MediaBrowserCompat$ItemReceiver(view2, x, this.PlaybackStateCompat)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f47x50fd9e4a = true;
            }
            this.MediaSessionCompat$Token = this.MediaBrowserCompat$CustomActionResultReceiver == -1 && !coordinatorLayout.MediaBrowserCompat$ItemReceiver(v, x, this.PlaybackStateCompat);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f47x50fd9e4a = false;
            this.MediaBrowserCompat$CustomActionResultReceiver = -1;
            if (this.MediaSessionCompat$Token) {
                this.MediaSessionCompat$Token = false;
                return false;
            }
        }
        if (!this.MediaSessionCompat$Token && (settitlemargin = this.MediaSessionCompat$QueueItem) != null && settitlemargin.write(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.RatingCompat;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        if (actionMasked != 2 || view == null || this.MediaSessionCompat$Token || this.MediaDescriptionCompat == 1 || coordinatorLayout.MediaBrowserCompat$ItemReceiver(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.MediaSessionCompat$QueueItem == null || Math.abs(((float) this.PlaybackStateCompat) - motionEvent.getY()) <= ((float) this.MediaSessionCompat$QueueItem.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        return true;
    }

    public final boolean write(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.MediaDescriptionCompat == 1 && actionMasked == 0) {
            return true;
        }
        setTitleMargin settitlemargin = this.MediaSessionCompat$QueueItem;
        if (settitlemargin != null) {
            settitlemargin.MediaBrowserCompat$CustomActionResultReceiver(motionEvent);
        }
        if (actionMasked == 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = -1;
            VelocityTracker velocityTracker = this.setChecked;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.setChecked = null;
            }
        }
        if (this.setChecked == null) {
            this.setChecked = VelocityTracker.obtain();
        }
        this.setChecked.addMovement(motionEvent);
        if (actionMasked == 2 && !this.MediaSessionCompat$Token && Math.abs(((float) this.PlaybackStateCompat) - motionEvent.getY()) > ((float) this.MediaSessionCompat$QueueItem.MediaBrowserCompat$MediaItem)) {
            this.MediaSessionCompat$QueueItem.write((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.MediaSessionCompat$Token;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.setHasDecor = 0;
        this.setBackgroundResource = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1 && view == this.RatingCompat.get()) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                int i5 = 0;
                if (i4 < (this.write ? this.IconCompatParcelizer : 0)) {
                    if (this.write) {
                        i5 = this.IconCompatParcelizer;
                    }
                    iArr[1] = top - i5;
                    SwitchCompat.MediaBrowserCompat$ItemReceiver((View) v, -iArr[1]);
                    IconCompatParcelizer(3);
                } else {
                    iArr[1] = i2;
                    SwitchCompat.MediaBrowserCompat$ItemReceiver((View) v, -i2);
                    IconCompatParcelizer(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.MediaBrowserCompat$ItemReceiver;
                if (i4 <= i6 || this.MediaBrowserCompat$MediaItem) {
                    iArr[1] = i2;
                    SwitchCompat.MediaBrowserCompat$ItemReceiver((View) v, -i2);
                    IconCompatParcelizer(1);
                } else {
                    iArr[1] = top - i6;
                    SwitchCompat.MediaBrowserCompat$ItemReceiver((View) v, -iArr[1]);
                    IconCompatParcelizer(4);
                }
            }
            v.getTop();
            this.MediaSessionCompat$ResultReceiverWrapper.get();
            this.setHasDecor = i2;
            this.setBackgroundResource = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            boolean r6 = r2.write
            r0 = 0
            if (r6 == 0) goto L_0x000c
            int r6 = r2.IconCompatParcelizer
            goto L_0x000d
        L_0x000c:
            r6 = r0
        L_0x000d:
            r1 = 3
            if (r3 != r6) goto L_0x0014
            r2.IconCompatParcelizer(r1)
            return
        L_0x0014:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.RatingCompat
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00bc
            boolean r3 = r2.setBackgroundResource
            if (r3 == 0) goto L_0x00bc
            int r3 = r2.setHasDecor
            if (r3 <= 0) goto L_0x002c
            boolean r3 = r2.write
            if (r3 == 0) goto L_0x0080
            int r3 = r2.IconCompatParcelizer
            goto L_0x009e
        L_0x002c:
            boolean r3 = r2.MediaBrowserCompat$MediaItem
            if (r3 == 0) goto L_0x004f
            android.view.VelocityTracker r3 = r2.setChecked
            if (r3 != 0) goto L_0x0036
            r3 = 0
            goto L_0x0045
        L_0x0036:
            r5 = 1000(0x3e8, float:1.401E-42)
            float r6 = r2.AlertController$RecycleListView
            r3.computeCurrentVelocity(r5, r6)
            android.view.VelocityTracker r3 = r2.setChecked
            int r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
            float r3 = r3.getYVelocity(r5)
        L_0x0045:
            boolean r3 = r2.MediaBrowserCompat$ItemReceiver(r4, r3)
            if (r3 == 0) goto L_0x004f
            int r3 = r2.MediaBrowserCompat$SearchResultReceiver
            r1 = 5
            goto L_0x009e
        L_0x004f:
            int r3 = r2.setHasDecor
            if (r3 != 0) goto L_0x009b
            int r3 = r4.getTop()
            boolean r5 = r2.write
            if (r5 == 0) goto L_0x0072
            int r5 = r2.IconCompatParcelizer
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r6 = r2.MediaBrowserCompat$ItemReceiver
            int r3 = r3 - r6
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x006f
            int r3 = r2.IconCompatParcelizer
            goto L_0x009e
        L_0x006f:
            int r3 = r2.MediaBrowserCompat$ItemReceiver
            goto L_0x009d
        L_0x0072:
            int r5 = r2.MediaMetadataCompat
            if (r3 >= r5) goto L_0x0085
            int r5 = r2.MediaBrowserCompat$ItemReceiver
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r3 >= r5) goto L_0x0082
        L_0x0080:
            r3 = r0
            goto L_0x009e
        L_0x0082:
            int r3 = r2.MediaMetadataCompat
            goto L_0x0096
        L_0x0085:
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r6 = r2.MediaBrowserCompat$ItemReceiver
            int r3 = r3 - r6
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0098
            int r3 = r2.MediaMetadataCompat
        L_0x0096:
            r1 = 6
            goto L_0x009e
        L_0x0098:
            int r3 = r2.MediaBrowserCompat$ItemReceiver
            goto L_0x009d
        L_0x009b:
            int r3 = r2.MediaBrowserCompat$ItemReceiver
        L_0x009d:
            r1 = 4
        L_0x009e:
            o.setTitleMargin r5 = r2.MediaSessionCompat$QueueItem
            int r6 = r4.getLeft()
            boolean r3 = r5.IconCompatParcelizer((android.view.View) r4, (int) r6, (int) r3)
            if (r3 == 0) goto L_0x00b7
            r3 = 2
            r2.IconCompatParcelizer(r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior$read r3 = new com.google.android.material.bottomsheet.BottomSheetBehavior$read
            r3.<init>(r4, r1)
            p040o.SwitchCompat.MediaBrowserCompat$ItemReceiver((android.view.View) r4, (java.lang.Runnable) r3)
            goto L_0x00ba
        L_0x00b7:
            r2.IconCompatParcelizer(r1)
        L_0x00ba:
            r2.setBackgroundResource = r0
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.MediaBrowserCompat$CustomActionResultReceiver(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.RatingCompat.get() && (this.MediaDescriptionCompat != 3 || super.IconCompatParcelizer(coordinatorLayout, v, view, f, f2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$CustomActionResultReceiver(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.setContentView
            if (r4 != 0) goto L_0x0014
            r3.setContentView = r0
            goto L_0x0023
        L_0x000c:
            boolean r2 = r3.setContentView
            if (r2 != 0) goto L_0x0016
            int r2 = r3.AppCompatDialogFragment
            if (r2 != r4) goto L_0x0016
        L_0x0014:
            r0 = r1
            goto L_0x0023
        L_0x0016:
            r3.setContentView = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.AppCompatDialogFragment = r1
            int r1 = r3.MediaBrowserCompat$SearchResultReceiver
            int r1 = r1 - r4
            r3.MediaBrowserCompat$ItemReceiver = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0039
            int r4 = r3.MediaDescriptionCompat
            r0 = 4
            if (r4 != r0) goto L_0x0039
            java.lang.ref.WeakReference<V> r4 = r3.MediaSessionCompat$ResultReceiverWrapper
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0039
            r4.requestLayout()
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.MediaBrowserCompat$CustomActionResultReceiver(int):void");
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(int i) {
        BottomSheetBehavior$MediaBrowserCompat$ItemReceiver bottomSheetBehavior$MediaBrowserCompat$ItemReceiver;
        if (this.MediaDescriptionCompat != i) {
            this.MediaDescriptionCompat = i;
            if (i == 6 || i == 3) {
                MediaBrowserCompat$CustomActionResultReceiver(true);
            } else if (i == 5 || i == 4) {
                MediaBrowserCompat$CustomActionResultReceiver(false);
            }
            if (((View) this.MediaSessionCompat$ResultReceiverWrapper.get()) != null && (bottomSheetBehavior$MediaBrowserCompat$ItemReceiver = this.read) != null) {
                bottomSheetBehavior$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(i);
            }
        }
    }

    private void read() {
        if (this.write) {
            this.MediaBrowserCompat$ItemReceiver = Math.max(this.MediaBrowserCompat$SearchResultReceiver - this.PlaybackStateCompat$CustomAction, this.IconCompatParcelizer);
        } else {
            this.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$SearchResultReceiver - this.PlaybackStateCompat$CustomAction;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$ItemReceiver(View view, float f) {
        if (this.AppCompatActivity) {
            return true;
        }
        if (view.getTop() < this.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.MediaBrowserCompat$ItemReceiver)) / ((float) this.AppCompatDialogFragment) <= 0.5f) {
            return false;
        }
        return true;
    }

    private View MediaBrowserCompat$ItemReceiver(View view) {
        if (SwitchCompat.ActionMenuItemView(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(viewGroup.getChildAt(i));
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                return MediaBrowserCompat$ItemReceiver2;
            }
        }
        return null;
    }

    public final void IconCompatParcelizer(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.MediaBrowserCompat$ItemReceiver;
        } else if (i == 6) {
            int i4 = this.MediaMetadataCompat;
            if (!this.write || i4 > (i3 = this.IconCompatParcelizer)) {
                i2 = i4;
            } else {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = this.write ? this.IconCompatParcelizer : 0;
        } else if (!this.MediaBrowserCompat$MediaItem || i != 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.MediaBrowserCompat$SearchResultReceiver;
        }
        if (this.MediaSessionCompat$QueueItem.IconCompatParcelizer(view, view.getLeft(), i2)) {
            IconCompatParcelizer(2);
            SwitchCompat.MediaBrowserCompat$ItemReceiver(view, (Runnable) new read(view, i));
            return;
        }
        IconCompatParcelizer(i);
    }

    class read implements Runnable {
        private final int IconCompatParcelizer;
        private final View MediaBrowserCompat$CustomActionResultReceiver;

        read(View view, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = view;
            this.IconCompatParcelizer = i;
        }

        public final void run() {
            if (BottomSheetBehavior.this.MediaSessionCompat$QueueItem == null || !BottomSheetBehavior.this.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver()) {
                BottomSheetBehavior.this.IconCompatParcelizer(this.IconCompatParcelizer);
            } else {
                SwitchCompat.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, (Runnable) this);
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        WeakReference<V> weakReference = this.MediaSessionCompat$ResultReceiverWrapper;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.Keep == null) {
                        this.Keep = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    V childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.MediaSessionCompat$ResultReceiverWrapper.get()) {
                        if (!z) {
                            Map<View, Integer> map = this.Keep;
                            if (map != null && map.containsKey(childAt)) {
                                SwitchCompat.write((View) childAt, this.Keep.get(childAt).intValue());
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.Keep.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            SwitchCompat.write((View) childAt, 4);
                        }
                    }
                }
                if (!z) {
                    this.Keep = null;
                }
            }
        }
    }
}

package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import p040o.C1539x5a6c48da;
import p040o.ConstraintHelper;
import p040o.SwitchCompat;
import p040o.setFitsSystemWindows;
import p040o.setMinWidth;
import p040o.setTextOn;

public abstract class RecyclerView$MediaBrowserCompat$SearchResultReceiver {
    boolean AlertController$RecycleListView = false;
    boolean AppCompatActivity = false;
    RecyclerView.PlaybackStateCompat AppCompatDelegateImpl$ListMenuDecorView;
    setFitsSystemWindows AppCompatDialogFragment = new setFitsSystemWindows(this.read);
    public boolean Keep = true;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = true;
    private final setFitsSystemWindows.IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new setFitsSystemWindows.IconCompatParcelizer() {
        public final View IconCompatParcelizer(int i) {
            return RecyclerView$MediaBrowserCompat$SearchResultReceiver.this.MediaDescriptionCompat(i);
        }

        public final int IconCompatParcelizer() {
            return RecyclerView$MediaBrowserCompat$SearchResultReceiver.this.getPaddingLeft();
        }

        public final int MediaBrowserCompat$ItemReceiver() {
            return RecyclerView$MediaBrowserCompat$SearchResultReceiver.this.setBackgroundResource - RecyclerView$MediaBrowserCompat$SearchResultReceiver.this.getPaddingRight();
        }

        public final int MediaBrowserCompat$CustomActionResultReceiver(View view) {
            return (view.getLeft() - ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).IconCompatParcelizer.left) - ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).leftMargin;
        }

        public final int write(View view) {
            return view.getRight() + ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).IconCompatParcelizer.right + ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).rightMargin;
        }
    };

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f27x50fd9e4a = false;
    public int MediaSessionCompat$QueueItem;
    public setMinWidth MediaSessionCompat$ResultReceiverWrapper;
    setFitsSystemWindows MediaSessionCompat$Token = new setFitsSystemWindows(this.MediaBrowserCompat$ItemReceiver);
    public int ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public boolean PlaybackStateCompat$CustomAction;
    private final setFitsSystemWindows.IconCompatParcelizer read = new setFitsSystemWindows.IconCompatParcelizer() {
        public final View IconCompatParcelizer(int i) {
            return RecyclerView$MediaBrowserCompat$SearchResultReceiver.this.MediaDescriptionCompat(i);
        }

        public final int IconCompatParcelizer() {
            return RecyclerView$MediaBrowserCompat$SearchResultReceiver.this.getPaddingTop();
        }

        public final int MediaBrowserCompat$ItemReceiver() {
            return RecyclerView$MediaBrowserCompat$SearchResultReceiver.this.ParcelableVolumeInfo - RecyclerView$MediaBrowserCompat$SearchResultReceiver.this.getPaddingBottom();
        }

        public final int MediaBrowserCompat$CustomActionResultReceiver(View view) {
            return (view.getTop() - ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).IconCompatParcelizer.top) - ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).topMargin;
        }

        public final int write(View view) {
            return view.getBottom() + ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).IconCompatParcelizer.bottom + ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).bottomMargin;
        }
    };
    public int setBackgroundResource;
    public int setContentView;
    public RecyclerView setHasDecor;

    public interface IconCompatParcelizer {
        void read(int i, int i2);
    }

    public void AlertController$RecycleListView() {
    }

    public int IconCompatParcelizer(RecyclerView.Keep keep) {
        return 0;
    }

    public void IconCompatParcelizer(int i, int i2, RecyclerView.Keep keep, IconCompatParcelizer iconCompatParcelizer) {
    }

    public void IconCompatParcelizer(Parcelable parcelable) {
    }

    public void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
    }

    public int MediaBrowserCompat$CustomActionResultReceiver(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        return 0;
    }

    public int MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.Keep keep) {
        return 0;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper) {
    }

    public int MediaBrowserCompat$ItemReceiver(RecyclerView.Keep keep) {
        return 0;
    }

    public abstract RecyclerView.MediaDescriptionCompat MediaBrowserCompat$ItemReceiver();

    public void MediaBrowserCompat$ItemReceiver(int i) {
    }

    public void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView, int i, int i2) {
    }

    public void MediaBrowserCompat$MediaItem(int i) {
    }

    public int MediaBrowserCompat$SearchResultReceiver(RecyclerView.Keep keep) {
        return 0;
    }

    public int MediaMetadataCompat(RecyclerView.Keep keep) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean MediaSessionCompat$Token() {
        return false;
    }

    /* renamed from: n_ */
    public Parcelable mo1437n_() {
        return null;
    }

    /* renamed from: p_ */
    public void mo1406p_() {
    }

    /* renamed from: q_ */
    public boolean mo1407q_() {
        return false;
    }

    public View read(View view, int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        return null;
    }

    public void read(RecyclerView.Keep keep) {
    }

    public void read(RecyclerView recyclerView) {
    }

    public boolean read() {
        return false;
    }

    public int write(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        return 0;
    }

    public int write(RecyclerView.Keep keep) {
        return 0;
    }

    public void write(int i, IconCompatParcelizer iconCompatParcelizer) {
    }

    public void write(RecyclerView recyclerView, int i, int i2) {
    }

    public boolean write() {
        return false;
    }

    public boolean write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
        return mediaDescriptionCompat != null;
    }

    /* access modifiers changed from: package-private */
    public final void write(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.setHasDecor = null;
            this.MediaSessionCompat$ResultReceiverWrapper = null;
            this.setBackgroundResource = 0;
            this.ParcelableVolumeInfo = 0;
        } else {
            this.setHasDecor = recyclerView;
            this.MediaSessionCompat$ResultReceiverWrapper = recyclerView.MediaSessionCompat$ResultReceiverWrapper;
            this.setBackgroundResource = recyclerView.getWidth();
            this.ParcelableVolumeInfo = recyclerView.getHeight();
        }
        this.setContentView = 1073741824;
        this.MediaSessionCompat$QueueItem = 1073741824;
    }

    /* access modifiers changed from: package-private */
    public final void read(int i, int i2) {
        this.setBackgroundResource = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.setContentView = mode;
        if (mode == 0 && !RecyclerView.MediaBrowserCompat$CustomActionResultReceiver) {
            this.setBackgroundResource = 0;
        }
        this.ParcelableVolumeInfo = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.MediaSessionCompat$QueueItem = mode2;
        if (mode2 == 0 && !RecyclerView.MediaBrowserCompat$CustomActionResultReceiver) {
            this.ParcelableVolumeInfo = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        int MediaSessionCompat$ResultReceiverWrapper2 = MediaSessionCompat$ResultReceiverWrapper();
        if (MediaSessionCompat$ResultReceiverWrapper2 == 0) {
            this.setHasDecor.read(i, i2);
            return;
        }
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < MediaSessionCompat$ResultReceiverWrapper2; i7++) {
            View MediaDescriptionCompat = MediaDescriptionCompat(i7);
            Rect rect = this.setHasDecor.setVisibility;
            RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat, rect);
            if (rect.left < i3) {
                i3 = rect.left;
            }
            if (rect.right > i4) {
                i4 = rect.right;
            }
            if (rect.top < i6) {
                i6 = rect.top;
            }
            if (rect.bottom > i5) {
                i5 = rect.bottom;
            }
        }
        this.setHasDecor.setVisibility.set(i3, i6, i4, i5);
        read(this.setHasDecor.setVisibility, i, i2);
    }

    public void read(Rect rect, int i, int i2) {
        int width = rect.width();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int height = rect.height();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.setHasDecor.setMeasuredDimension(IconCompatParcelizer(i, width + paddingLeft + paddingRight, SwitchCompat.MediaSessionCompat$Token(this.setHasDecor)), IconCompatParcelizer(i2, height + paddingTop + paddingBottom, SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(this.setHasDecor)));
    }

    public static int IconCompatParcelizer(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public void read(String str) {
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            recyclerView.MediaBrowserCompat$ItemReceiver(str);
        }
    }

    /* renamed from: o_ */
    public boolean mo1438o_() {
        return this.f27x50fd9e4a;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public RecyclerView.MediaDescriptionCompat MediaBrowserCompat$CustomActionResultReceiver(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof RecyclerView.MediaDescriptionCompat) {
            return new RecyclerView.MediaDescriptionCompat((RecyclerView.MediaDescriptionCompat) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new RecyclerView.MediaDescriptionCompat((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new RecyclerView.MediaDescriptionCompat(layoutParams);
    }

    public RecyclerView.MediaDescriptionCompat IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new RecyclerView.MediaDescriptionCompat(context, attributeSet);
    }

    public void IconCompatParcelizer(RecyclerView recyclerView, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public final void write(RecyclerView.PlaybackStateCompat playbackStateCompat) {
        RecyclerView.PlaybackStateCompat playbackStateCompat2 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (!(playbackStateCompat2 == null || playbackStateCompat == playbackStateCompat2 || !playbackStateCompat2.RatingCompat)) {
            this.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver();
        }
        this.AppCompatDelegateImpl$ListMenuDecorView = playbackStateCompat;
        RecyclerView recyclerView = this.setHasDecor;
        if (playbackStateCompat.MediaBrowserCompat$SearchResultReceiver) {
            StringBuilder sb = new StringBuilder();
            sb.append("An instance of ");
            sb.append(playbackStateCompat.getClass().getSimpleName());
            sb.append(" was started ");
            sb.append("more than once. Each instance of");
            sb.append(playbackStateCompat.getClass().getSimpleName());
            sb.append(" ");
            sb.append("is intended to only be used once. You should create a new instance for ");
            sb.append("each use.");
            Log.w("RecyclerView", sb.toString());
        }
        playbackStateCompat.MediaMetadataCompat = recyclerView;
        playbackStateCompat.read = this;
        if (playbackStateCompat.MediaBrowserCompat$MediaItem != -1) {
            recyclerView.ExpandedMenuView.ParcelableVolumeInfo = playbackStateCompat.MediaBrowserCompat$MediaItem;
            playbackStateCompat.RatingCompat = true;
            playbackStateCompat.MediaBrowserCompat$ItemReceiver = true;
            playbackStateCompat.MediaDescriptionCompat = playbackStateCompat.MediaMetadataCompat.AppCompatActivity.MediaBrowserCompat$CustomActionResultReceiver(playbackStateCompat.MediaBrowserCompat$MediaItem);
            RecyclerView.AppCompatActivity appCompatActivity = playbackStateCompat.MediaMetadataCompat.AbsActionBarView;
            if (appCompatActivity.IconCompatParcelizer) {
                appCompatActivity.write = true;
            } else {
                RecyclerView.this.removeCallbacks(appCompatActivity);
                SwitchCompat.MediaBrowserCompat$ItemReceiver((View) RecyclerView.this, (Runnable) appCompatActivity);
            }
            playbackStateCompat.MediaBrowserCompat$SearchResultReceiver = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final void write(View view, int i) {
        write(view, 0, true);
    }

    public final void MediaBrowserCompat$ItemReceiver(View view, int i) {
        write(view, i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void write(android.view.View r9, int r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView$setContentView r0 = androidx.recyclerview.widget.RecyclerView.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r9)
            r1 = 1
            r2 = 0
            if (r11 != 0) goto L_0x0028
            int r11 = r0.read
            r11 = r11 & 8
            if (r11 == 0) goto L_0x0010
            r11 = r1
            goto L_0x0011
        L_0x0010:
            r11 = r2
        L_0x0011:
            if (r11 != 0) goto L_0x0028
            androidx.recyclerview.widget.RecyclerView r11 = r8.setHasDecor
            o.setStatusBarBackground r11 = r11.MenuItemWrapperICS$CollapsibleActionViewWrapper
            o.setTextAppearance<androidx.recyclerview.widget.RecyclerView$setContentView, o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver> r11 = r11.write
            java.lang.Object r11 = r11.get(r0)
            o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver r11 = (p040o.C1539x5a6c48da) r11
            if (r11 == 0) goto L_0x002f
            int r3 = r11.MediaBrowserCompat$ItemReceiver
            r3 = r3 & -2
            r11.MediaBrowserCompat$ItemReceiver = r3
            goto L_0x002f
        L_0x0028:
            androidx.recyclerview.widget.RecyclerView r11 = r8.setHasDecor
            o.setStatusBarBackground r11 = r11.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r11.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r0)
        L_0x002f:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r11 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r11
            int r3 = r0.read
            r3 = r3 & 32
            if (r3 == 0) goto L_0x003d
            r3 = r1
            goto L_0x003e
        L_0x003d:
            r3 = r2
        L_0x003e:
            if (r3 != 0) goto L_0x0143
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r3 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r3 == 0) goto L_0x0046
            r3 = r1
            goto L_0x0047
        L_0x0046:
            r3 = r2
        L_0x0047:
            if (r3 != 0) goto L_0x0143
            android.view.ViewParent r3 = r9.getParent()
            androidx.recyclerview.widget.RecyclerView r4 = r8.setHasDecor
            if (r3 != r4) goto L_0x0127
            o.setMinWidth r3 = r8.MediaSessionCompat$ResultReceiverWrapper
            int r3 = r3.MediaBrowserCompat$ItemReceiver((android.view.View) r9)
            r4 = -1
            if (r10 != r4) goto L_0x006a
            o.setMinWidth r10 = r8.MediaSessionCompat$ResultReceiverWrapper
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r5 = r10.read
            int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r10 = r10.MediaBrowserCompat$ItemReceiver
            int r10 = r10.size()
            int r10 = r5 - r10
        L_0x006a:
            if (r3 == r4) goto L_0x0101
            if (r3 == r10) goto L_0x0160
            androidx.recyclerview.widget.RecyclerView r9 = r8.setHasDecor
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r9 = r9.AppCompatActivity
            o.setMinWidth r4 = r9.MediaSessionCompat$ResultReceiverWrapper
            if (r4 == 0) goto L_0x0081
            int r5 = r4.MediaBrowserCompat$ItemReceiver((int) r3)
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r4 = r4.read
            android.view.View r4 = r4.MediaBrowserCompat$CustomActionResultReceiver(r5)
            goto L_0x0082
        L_0x0081:
            r4 = 0
        L_0x0082:
            if (r4 == 0) goto L_0x00e1
            o.setMinWidth r5 = r9.MediaSessionCompat$ResultReceiverWrapper
            if (r5 == 0) goto L_0x0091
            int r6 = r5.MediaBrowserCompat$ItemReceiver((int) r3)
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r5 = r5.read
            r5.MediaBrowserCompat$CustomActionResultReceiver(r6)
        L_0x0091:
            o.setMinWidth r5 = r9.MediaSessionCompat$ResultReceiverWrapper
            int r3 = r5.MediaBrowserCompat$ItemReceiver((int) r3)
            o.setMinWidth$read r6 = r5.IconCompatParcelizer
            r6.MediaBrowserCompat$CustomActionResultReceiver(r3)
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r5 = r5.read
            r5.MediaBrowserCompat$ItemReceiver((int) r3)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r3 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r3
            androidx.recyclerview.widget.RecyclerView$setContentView r5 = androidx.recyclerview.widget.RecyclerView.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r4)
            int r6 = r5.read
            r6 = r6 & 8
            if (r6 == 0) goto L_0x00b3
            r6 = r1
            goto L_0x00b4
        L_0x00b3:
            r6 = r2
        L_0x00b4:
            if (r6 == 0) goto L_0x00be
            androidx.recyclerview.widget.RecyclerView r6 = r9.setHasDecor
            o.setStatusBarBackground r6 = r6.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r6.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r5)
            goto L_0x00d2
        L_0x00be:
            androidx.recyclerview.widget.RecyclerView r6 = r9.setHasDecor
            o.setStatusBarBackground r6 = r6.MenuItemWrapperICS$CollapsibleActionViewWrapper
            o.setTextAppearance<androidx.recyclerview.widget.RecyclerView$setContentView, o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver> r6 = r6.write
            java.lang.Object r6 = r6.get(r5)
            o.setStatusBarBackground$MediaBrowserCompat$CustomActionResultReceiver r6 = (p040o.C1539x5a6c48da) r6
            if (r6 == 0) goto L_0x00d2
            int r7 = r6.MediaBrowserCompat$ItemReceiver
            r7 = r7 & -2
            r6.MediaBrowserCompat$ItemReceiver = r7
        L_0x00d2:
            o.setMinWidth r9 = r9.MediaSessionCompat$ResultReceiverWrapper
            int r5 = r5.read
            r5 = r5 & 8
            if (r5 == 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r1 = r2
        L_0x00dc:
            r9.MediaBrowserCompat$ItemReceiver(r4, r10, r3, r1)
            goto L_0x0160
        L_0x00e1:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Cannot move a child from non-existing index:"
            r10.append(r11)
            r10.append(r3)
            androidx.recyclerview.widget.RecyclerView r9 = r9.setHasDecor
            java.lang.String r9 = r9.toString()
            r10.append(r9)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0101:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
            r10.append(r11)
            androidx.recyclerview.widget.RecyclerView r11 = r8.setHasDecor
            int r9 = r11.indexOfChild(r9)
            r10.append(r9)
            androidx.recyclerview.widget.RecyclerView r9 = r8.setHasDecor
            java.lang.String r9 = r9.read()
            r10.append(r9)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0127:
            o.setMinWidth r3 = r8.MediaSessionCompat$ResultReceiverWrapper
            r3.read(r9, r10, r2)
            r11.read = r1
            androidx.recyclerview.widget.RecyclerView$PlaybackStateCompat r10 = r8.AppCompatDelegateImpl$ListMenuDecorView
            if (r10 == 0) goto L_0x0160
            boolean r10 = r10.RatingCompat
            if (r10 == 0) goto L_0x0160
            androidx.recyclerview.widget.RecyclerView$PlaybackStateCompat r10 = r8.AppCompatDelegateImpl$ListMenuDecorView
            int r1 = androidx.recyclerview.widget.RecyclerView.RatingCompat((android.view.View) r9)
            int r3 = r10.MediaBrowserCompat$MediaItem
            if (r1 != r3) goto L_0x0160
            r10.MediaDescriptionCompat = r9
            goto L_0x0160
        L_0x0143:
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r3 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r3 == 0) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r1 = r2
        L_0x0149:
            if (r1 == 0) goto L_0x0151
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r1 = r0.MediaSessionCompat$ResultReceiverWrapper
            r1.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r0)
            goto L_0x0157
        L_0x0151:
            int r1 = r0.read
            r1 = r1 & -33
            r0.read = r1
        L_0x0157:
            o.setMinWidth r1 = r8.MediaSessionCompat$ResultReceiverWrapper
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            r1.MediaBrowserCompat$ItemReceiver(r9, r10, r3, r2)
        L_0x0160:
            boolean r9 = r11.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x016b
            android.view.View r9 = r0.write
            r9.invalidate()
            r11.MediaBrowserCompat$ItemReceiver = r2
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver.write(android.view.View, int, boolean):void");
    }

    public final void Keep() {
        for (int MediaSessionCompat$ResultReceiverWrapper2 = MediaSessionCompat$ResultReceiverWrapper() - 1; MediaSessionCompat$ResultReceiverWrapper2 >= 0; MediaSessionCompat$ResultReceiverWrapper2--) {
            this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(MediaSessionCompat$ResultReceiverWrapper2);
        }
    }

    public static int MediaMetadataCompat(View view) {
        RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
        int i = setcontentview.ParcelableVolumeInfo;
        return i == -1 ? setcontentview.MediaSessionCompat$QueueItem : i;
    }

    /* renamed from: a_ */
    public final View mo1669a_(View view) {
        View write;
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView == null || (write = recyclerView.write(view)) == null || this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.contains(write)) {
            return null;
        }
        return write;
    }

    public final void read(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper) {
        View MediaDescriptionCompat = MediaDescriptionCompat(i);
        if (MediaDescriptionCompat(i) != null) {
            this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        recyclerView$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(MediaDescriptionCompat);
    }

    public final int MediaSessionCompat$ResultReceiverWrapper() {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        if (setminwidth != null) {
            return setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size();
        }
        return 0;
    }

    public final View MediaDescriptionCompat(int i) {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        if (setminwidth == null) {
            return null;
        }
        return setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver(setminwidth.MediaBrowserCompat$ItemReceiver(i));
    }

    public int getPaddingLeft() {
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingTop() {
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int getPaddingRight() {
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingBottom() {
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingStart() {
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            return SwitchCompat.MediaSessionCompat$QueueItem(recyclerView);
        }
        return 0;
    }

    public int getPaddingEnd() {
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            return SwitchCompat.ParcelableVolumeInfo(recyclerView);
        }
        return 0;
    }

    public final View ParcelableVolumeInfo() {
        View focusedChild;
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final int MediaSessionCompat$QueueItem() {
        RecyclerView.IconCompatParcelizer iconCompatParcelizer;
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            iconCompatParcelizer = recyclerView.MediaDescriptionCompat;
        } else {
            iconCompatParcelizer = null;
        }
        if (iconCompatParcelizer != null) {
            return iconCompatParcelizer.IconCompatParcelizer();
        }
        return 0;
    }

    public void RatingCompat(int i) {
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            setMinWidth setminwidth = recyclerView.MediaSessionCompat$ResultReceiverWrapper;
            int MediaBrowserCompat$CustomActionResultReceiver2 = setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size();
            for (int i2 = 0; i2 < MediaBrowserCompat$CustomActionResultReceiver2; i2++) {
                setMinWidth setminwidth2 = recyclerView.MediaSessionCompat$ResultReceiverWrapper;
                setminwidth2.read.MediaBrowserCompat$CustomActionResultReceiver(setminwidth2.MediaBrowserCompat$ItemReceiver(i2)).offsetLeftAndRight(i);
            }
        }
    }

    public void MediaBrowserCompat$SearchResultReceiver(int i) {
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            setMinWidth setminwidth = recyclerView.MediaSessionCompat$ResultReceiverWrapper;
            int MediaBrowserCompat$CustomActionResultReceiver2 = setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size();
            for (int i2 = 0; i2 < MediaBrowserCompat$CustomActionResultReceiver2; i2++) {
                setMinWidth setminwidth2 = recyclerView.MediaSessionCompat$ResultReceiverWrapper;
                setminwidth2.read.MediaBrowserCompat$CustomActionResultReceiver(setminwidth2.MediaBrowserCompat$ItemReceiver(i2)).offsetTopAndBottom(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$ItemReceiver(View view, int i, int i2, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
        return !this.MediaBrowserCompat$CustomActionResultReceiver || !MediaBrowserCompat$ItemReceiver(view.getMeasuredWidth(), i, mediaDescriptionCompat.width) || !MediaBrowserCompat$ItemReceiver(view.getMeasuredHeight(), i2, mediaDescriptionCompat.height);
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(View view, int i, int i2, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
        return view.isLayoutRequested() || !this.MediaBrowserCompat$CustomActionResultReceiver || !MediaBrowserCompat$ItemReceiver(view.getWidth(), i, mediaDescriptionCompat.width) || !MediaBrowserCompat$ItemReceiver(view.getHeight(), i2, mediaDescriptionCompat.height);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo1663x50fd9e4a() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    private static boolean MediaBrowserCompat$ItemReceiver(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r4 == 1073741824) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int MediaBrowserCompat$CustomActionResultReceiver(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            int r3 = r3 - r5
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L_0x0018
            if (r6 >= 0) goto L_0x001a
            if (r6 != r0) goto L_0x002d
            if (r4 == r1) goto L_0x001e
            if (r4 == 0) goto L_0x002d
            if (r4 == r2) goto L_0x001e
            goto L_0x002d
        L_0x0018:
            if (r6 < 0) goto L_0x001c
        L_0x001a:
            r4 = r2
            goto L_0x002f
        L_0x001c:
            if (r6 != r0) goto L_0x0020
        L_0x001e:
            r6 = r3
            goto L_0x002f
        L_0x0020:
            r7 = -2
            if (r6 != r7) goto L_0x002d
            if (r4 == r1) goto L_0x002a
            if (r4 == r2) goto L_0x002a
            r6 = r3
            r4 = r5
            goto L_0x002f
        L_0x002a:
            r6 = r3
            r4 = r1
            goto L_0x002f
        L_0x002d:
            r4 = r5
            r6 = r4
        L_0x002f:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(int, int, int, int, boolean):int");
    }

    public static int MediaBrowserCompat$SearchResultReceiver(View view) {
        Rect rect = ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).IconCompatParcelizer;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(View view) {
        Rect rect = ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).IconCompatParcelizer;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static void IconCompatParcelizer(View view, int i, int i2, int i3, int i4) {
        RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
        Rect rect = mediaDescriptionCompat.IconCompatParcelizer;
        view.layout(i + rect.left + mediaDescriptionCompat.leftMargin, i2 + rect.top + mediaDescriptionCompat.topMargin, (i3 - rect.right) - mediaDescriptionCompat.rightMargin, (i4 - rect.bottom) - mediaDescriptionCompat.bottomMargin);
    }

    public final void write(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).IconCompatParcelizer;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.setHasDecor == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.setHasDecor.setContentHeight;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public static void MediaBrowserCompat$ItemReceiver(View view, Rect rect) {
        RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(view, rect);
    }

    public static int RatingCompat(View view) {
        return ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).IconCompatParcelizer.top;
    }

    public static int IconCompatParcelizer(View view) {
        return ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).IconCompatParcelizer.bottom;
    }

    public static int MediaDescriptionCompat(View view) {
        return ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).IconCompatParcelizer.left;
    }

    public static int MediaBrowserCompat$MediaItem(View view) {
        return ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).IconCompatParcelizer.right;
    }

    private int[] MediaBrowserCompat$CustomActionResultReceiver(View view, Rect rect) {
        int[] iArr = new int[2];
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i = this.setBackgroundResource;
        int paddingRight = getPaddingRight();
        int i2 = this.ParcelableVolumeInfo;
        int paddingBottom = getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width();
        int height = rect.height();
        int i3 = left - paddingLeft;
        int min = Math.min(0, i3);
        int i4 = top - paddingTop;
        int min2 = Math.min(0, i4);
        int i5 = (width + left) - (i - paddingRight);
        int max = Math.max(0, i5);
        int max2 = Math.max(0, (height + top) - (i2 - paddingBottom));
        if (SwitchCompat.m3079x50fd9e4a(this.setHasDecor) == 1) {
            min = max != 0 ? max : Math.max(min, i5);
        } else if (min == 0) {
            min = Math.min(i3, max);
        }
        if (min2 == 0) {
            min2 = Math.min(i4, max2);
        }
        iArr[0] = min;
        iArr[1] = min2;
        return iArr;
    }

    public final boolean write(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int[] MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(view, rect);
        int i = MediaBrowserCompat$CustomActionResultReceiver2[0];
        int i2 = MediaBrowserCompat$CustomActionResultReceiver2[1];
        if ((z2 && !MediaBrowserCompat$CustomActionResultReceiver(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
            return false;
        }
        if (z) {
            recyclerView.scrollBy(i, i2);
        } else {
            recyclerView.MediaBrowserCompat$ItemReceiver(i, i2);
        }
        return true;
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView, int i, int i2) {
        View focusedChild = recyclerView.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i3 = this.setBackgroundResource;
        int paddingRight = getPaddingRight();
        int i4 = this.ParcelableVolumeInfo;
        int paddingBottom = getPaddingBottom();
        Rect rect = this.setHasDecor.setVisibility;
        RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(focusedChild, rect);
        if (rect.left - i >= i3 - paddingRight || rect.right - i <= paddingLeft || rect.top - i2 >= i4 - paddingBottom || rect.bottom - i2 <= paddingTop) {
            return false;
        }
        return true;
    }

    public void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2, Object obj) {
        IconCompatParcelizer(recyclerView, i, i2);
    }

    /* access modifiers changed from: package-private */
    public final void setHasDecor() {
        RecyclerView.PlaybackStateCompat playbackStateCompat = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (playbackStateCompat != null) {
            playbackStateCompat.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper) {
        for (int MediaSessionCompat$ResultReceiverWrapper2 = MediaSessionCompat$ResultReceiverWrapper() - 1; MediaSessionCompat$ResultReceiverWrapper2 >= 0; MediaSessionCompat$ResultReceiverWrapper2--) {
            if (!((RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat(MediaSessionCompat$ResultReceiverWrapper2)).read & 128) != 0)) {
                View MediaDescriptionCompat = MediaDescriptionCompat(MediaSessionCompat$ResultReceiverWrapper2);
                if (MediaDescriptionCompat(MediaSessionCompat$ResultReceiverWrapper2) != null) {
                    this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(MediaSessionCompat$ResultReceiverWrapper2);
                }
                recyclerView$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(MediaDescriptionCompat);
            }
        }
    }

    public final void read(View view, setTextOn settexton) {
        RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver2 = RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(view);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            if (!((MediaBrowserCompat$CustomActionResultReceiver2.read & 8) != 0)) {
                if (!this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.contains(MediaBrowserCompat$CustomActionResultReceiver2.write)) {
                    MediaBrowserCompat$CustomActionResultReceiver(this.setHasDecor.setPadding, this.setHasDecor.ExpandedMenuView, view, settexton);
                }
            }
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, View view, setTextOn settexton) {
        int i;
        int i2 = 0;
        if (read()) {
            RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            int i3 = setcontentview.ParcelableVolumeInfo;
            if (i3 == -1) {
                i3 = setcontentview.MediaSessionCompat$QueueItem;
            }
            i = i3;
        } else {
            i = 0;
        }
        if (write()) {
            RecyclerView.setContentView setcontentview2 = ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            int i4 = setcontentview2.ParcelableVolumeInfo;
            i2 = i4 == -1 ? setcontentview2.MediaSessionCompat$QueueItem : i4;
        }
        settexton.MediaBrowserCompat$CustomActionResultReceiver((Object) setTextOn.IconCompatParcelizer.write(i, 1, i2, 1, false, false));
    }

    public int MediaBrowserCompat$ItemReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView == null || recyclerView.MediaDescriptionCompat == null || !read()) {
            return 1;
        }
        return this.setHasDecor.MediaDescriptionCompat.IconCompatParcelizer();
    }

    public int IconCompatParcelizer(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView == null || recyclerView.MediaDescriptionCompat == null || !write()) {
            return 1;
        }
        return this.setHasDecor.MediaDescriptionCompat.IconCompatParcelizer();
    }

    public static C5530x1a4d18ae write(Context context, AttributeSet attributeSet, int i, int i2) {
        C5530x1a4d18ae recyclerView$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$ItemReceiver = new C5530x1a4d18ae();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ConstraintHelper.read.RecyclerView, i, i2);
        recyclerView$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getInt(ConstraintHelper.read.RecyclerView_android_orientation, 1);
        recyclerView$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$ItemReceiver.write = obtainStyledAttributes.getInt(ConstraintHelper.read.RecyclerView_spanCount, 1);
        recyclerView$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$ItemReceiver.read = obtainStyledAttributes.getBoolean(ConstraintHelper.read.RecyclerView_reverseLayout, false);
        recyclerView$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getBoolean(ConstraintHelper.read.RecyclerView_stackFromEnd, false);
        obtainStyledAttributes.recycle();
        return recyclerView$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$ItemReceiver;
    }

    public final void MediaBrowserCompat$ItemReceiver(View view) {
        write(view, -1, true);
    }

    public final void read(View view) {
        write(view, -1, false);
    }

    public final void write(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper) {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        for (int MediaBrowserCompat$CustomActionResultReceiver2 = (setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) - 1; MediaBrowserCompat$CustomActionResultReceiver2 >= 0; MediaBrowserCompat$CustomActionResultReceiver2--) {
            setMinWidth setminwidth2 = this.MediaSessionCompat$ResultReceiverWrapper;
            View view = null;
            View MediaBrowserCompat$CustomActionResultReceiver3 = setminwidth2 != null ? setminwidth2.read.MediaBrowserCompat$CustomActionResultReceiver(setminwidth2.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2)) : null;
            RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver4 = RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver3);
            if (!((MediaBrowserCompat$CustomActionResultReceiver4.read & 128) != 0)) {
                if ((MediaBrowserCompat$CustomActionResultReceiver4.read & 4) != 0) {
                    if (!((MediaBrowserCompat$CustomActionResultReceiver4.read & 8) != 0) && !this.setHasDecor.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver) {
                        setMinWidth setminwidth3 = this.MediaSessionCompat$ResultReceiverWrapper;
                        if (setminwidth3 != null) {
                            view = setminwidth3.read.MediaBrowserCompat$CustomActionResultReceiver(setminwidth3.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2));
                        }
                        if (view != null) {
                            this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
                        }
                        recyclerView$MediaSessionCompat$ResultReceiverWrapper.read(MediaBrowserCompat$CustomActionResultReceiver4);
                    }
                }
                setMinWidth setminwidth4 = this.MediaSessionCompat$ResultReceiverWrapper;
                if (setminwidth4 != null) {
                    setminwidth4.read.MediaBrowserCompat$CustomActionResultReceiver(setminwidth4.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2));
                }
                setMinWidth setminwidth5 = this.MediaSessionCompat$ResultReceiverWrapper;
                int MediaBrowserCompat$ItemReceiver2 = setminwidth5.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
                setminwidth5.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
                setminwidth5.read.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
                recyclerView$MediaSessionCompat$ResultReceiverWrapper.write(MediaBrowserCompat$CustomActionResultReceiver3);
                C1539x5a6c48da setstatusbarbackground_mediabrowsercompat_customactionresultreceiver = this.setHasDecor.MenuItemWrapperICS$CollapsibleActionViewWrapper.write.get(MediaBrowserCompat$CustomActionResultReceiver4);
                if (setstatusbarbackground_mediabrowsercompat_customactionresultreceiver != null) {
                    setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver &= -2;
                }
            }
        }
    }

    public View MediaBrowserCompat$CustomActionResultReceiver(int i) {
        View view;
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        int MediaBrowserCompat$CustomActionResultReceiver2 = setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0;
        int i2 = 0;
        while (true) {
            view = null;
            if (i2 >= MediaBrowserCompat$CustomActionResultReceiver2) {
                return null;
            }
            setMinWidth setminwidth2 = this.MediaSessionCompat$ResultReceiverWrapper;
            if (setminwidth2 != null) {
                view = setminwidth2.read.MediaBrowserCompat$CustomActionResultReceiver(setminwidth2.MediaBrowserCompat$ItemReceiver(i2));
            }
            RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver3 = RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(view);
            if (MediaBrowserCompat$CustomActionResultReceiver3 != null) {
                int i3 = MediaBrowserCompat$CustomActionResultReceiver3.ParcelableVolumeInfo;
                if (i3 == -1) {
                    i3 = MediaBrowserCompat$CustomActionResultReceiver3.MediaSessionCompat$QueueItem;
                }
                if (i3 == i) {
                    boolean z = true;
                    if ((MediaBrowserCompat$CustomActionResultReceiver3.read & 128) != 0) {
                        continue;
                    } else if (this.setHasDecor.ExpandedMenuView.MediaBrowserCompat$ItemReceiver) {
                        break;
                    } else {
                        if ((MediaBrowserCompat$CustomActionResultReceiver3.read & 8) == 0) {
                            z = false;
                        }
                        if (!z) {
                            break;
                        }
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
        return view;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.setHasDecor.canScrollVertically(-1) && !this.setHasDecor.canScrollHorizontally(-1) && !this.setHasDecor.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (this.setHasDecor.MediaDescriptionCompat != null) {
                accessibilityEvent.setItemCount(this.setHasDecor.MediaDescriptionCompat.IconCompatParcelizer());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper) {
        int size = recyclerView$MediaSessionCompat$ResultReceiverWrapper.write.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = recyclerView$MediaSessionCompat$ResultReceiverWrapper.write.get(i).write;
            RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver2 = RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(view);
            if (!((MediaBrowserCompat$CustomActionResultReceiver2.read & 128) != 0)) {
                MediaBrowserCompat$CustomActionResultReceiver2.read(false);
                if ((MediaBrowserCompat$CustomActionResultReceiver2.read & 256) != 0) {
                    this.setHasDecor.removeDetachedView(view, false);
                }
                if (this.setHasDecor.AlertController$RecycleListView != null) {
                    this.setHasDecor.AlertController$RecycleListView.read(MediaBrowserCompat$CustomActionResultReceiver2);
                }
                MediaBrowserCompat$CustomActionResultReceiver2.read(true);
                RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver3 = RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(view);
                MediaBrowserCompat$CustomActionResultReceiver3.MediaSessionCompat$ResultReceiverWrapper = null;
                MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer = false;
                MediaBrowserCompat$CustomActionResultReceiver3.read &= -33;
                recyclerView$MediaSessionCompat$ResultReceiverWrapper.read(MediaBrowserCompat$CustomActionResultReceiver3);
            }
        }
        recyclerView$MediaSessionCompat$ResultReceiverWrapper.write.clear();
        ArrayList<RecyclerView.setContentView> arrayList = recyclerView$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.setHasDecor.invalidate();
        }
    }
}

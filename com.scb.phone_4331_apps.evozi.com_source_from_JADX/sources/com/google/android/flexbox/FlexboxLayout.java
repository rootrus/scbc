package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.CardIoWrapperActivity;
import p040o.SwitchCompat;
import p040o.nAllocationSyncAll;
import p040o.nAllocationSyncAll$MediaBrowserCompat$ItemReceiver;
import p040o.nClosureCreate;
import p040o.onNotifyListenerFailed;

public class FlexboxLayout extends ViewGroup implements CardIoWrapperActivity {
    private int IconCompatParcelizer;
    private int Keep;
    private Drawable MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private List<onNotifyListenerFailed> MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private nAllocationSyncAll f3061x50fd9e4a;
    private nAllocationSyncAll$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem;
    private int[] MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    private SparseIntArray ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private int RatingCompat;
    private int read;
    private Drawable write;

    public final void MediaBrowserCompat$ItemReceiver(int i, View view) {
    }

    public final int write(View view) {
        return 0;
    }

    public FlexboxLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaSessionCompat$QueueItem = -1;
        this.f3061x50fd9e4a = new nAllocationSyncAll(this);
        this.MediaBrowserCompat$SearchResultReceiver = new ArrayList();
        this.MediaDescriptionCompat = new nAllocationSyncAll$MediaBrowserCompat$ItemReceiver();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nClosureCreate.IconCompatParcelizer.FlexboxLayout, i, 0);
        this.RatingCompat = obtainStyledAttributes.getInt(nClosureCreate.IconCompatParcelizer.FlexboxLayout_flexDirection, 0);
        this.MediaMetadataCompat = obtainStyledAttributes.getInt(nClosureCreate.IconCompatParcelizer.FlexboxLayout_flexWrap, 0);
        this.MediaSessionCompat$Token = obtainStyledAttributes.getInt(nClosureCreate.IconCompatParcelizer.FlexboxLayout_justifyContent, 0);
        this.IconCompatParcelizer = obtainStyledAttributes.getInt(nClosureCreate.IconCompatParcelizer.FlexboxLayout_alignItems, 4);
        this.read = obtainStyledAttributes.getInt(nClosureCreate.IconCompatParcelizer.FlexboxLayout_alignContent, 5);
        this.MediaSessionCompat$QueueItem = obtainStyledAttributes.getInt(nClosureCreate.IconCompatParcelizer.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(nClosureCreate.IconCompatParcelizer.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(nClosureCreate.IconCompatParcelizer.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(nClosureCreate.IconCompatParcelizer.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(nClosureCreate.IconCompatParcelizer.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.Keep = i2;
            this.PlaybackStateCompat = i2;
        }
        int i3 = obtainStyledAttributes.getInt(nClosureCreate.IconCompatParcelizer.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.Keep = i3;
        }
        int i4 = obtainStyledAttributes.getInt(nClosureCreate.IconCompatParcelizer.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.PlaybackStateCompat = i4;
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.ParcelableVolumeInfo == null) {
            this.ParcelableVolumeInfo = new SparseIntArray(getChildCount());
        }
        if (this.f3061x50fd9e4a.MediaBrowserCompat$ItemReceiver(this.ParcelableVolumeInfo)) {
            this.MediaSessionCompat$ResultReceiverWrapper = this.f3061x50fd9e4a.read(this.ParcelableVolumeInfo);
        }
        int i3 = this.RatingCompat;
        if (i3 == 0 || i3 == 1) {
            write(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            MediaBrowserCompat$CustomActionResultReceiver(i, i2);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid value for the flex direction is set: ");
            sb.append(this.RatingCompat);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: l_ */
    public final int mo33253l_() {
        return getChildCount();
    }

    /* renamed from: a_ */
    public final View mo33247a_(int i) {
        return getChildAt(i);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.ParcelableVolumeInfo == null) {
            this.ParcelableVolumeInfo = new SparseIntArray(getChildCount());
        }
        this.MediaSessionCompat$ResultReceiverWrapper = this.f3061x50fd9e4a.write(view, i, layoutParams, this.ParcelableVolumeInfo);
        super.addView(view, i, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void write(int r12, int r13) {
        /*
            r11 = this;
            java.util.List<o.onNotifyListenerFailed> r0 = r11.MediaBrowserCompat$SearchResultReceiver
            r0.clear()
            o.nAllocationSyncAll$MediaBrowserCompat$ItemReceiver r0 = r11.MediaDescriptionCompat
            r1 = 0
            r0.MediaBrowserCompat$CustomActionResultReceiver = r1
            r2 = 0
            r0.IconCompatParcelizer = r2
            o.nAllocationSyncAll r3 = r11.f3061x50fd9e4a
            o.nAllocationSyncAll$MediaBrowserCompat$ItemReceiver r4 = r11.MediaDescriptionCompat
            r7 = 2147483647(0x7fffffff, float:NaN)
            r8 = 0
            r9 = -1
            r10 = 0
            r5 = r12
            r6 = r13
            r3.IconCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
            o.nAllocationSyncAll$MediaBrowserCompat$ItemReceiver r0 = r11.MediaDescriptionCompat
            java.util.List<o.onNotifyListenerFailed> r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r11.MediaBrowserCompat$SearchResultReceiver = r0
            o.nAllocationSyncAll r0 = r11.f3061x50fd9e4a
            r0.write(r12, r13, r2)
            int r0 = r11.IconCompatParcelizer
            r3 = 3
            if (r0 != r3) goto L_0x00ab
            java.util.List<o.onNotifyListenerFailed> r0 = r11.MediaBrowserCompat$SearchResultReceiver
            java.util.Iterator r0 = r0.iterator()
        L_0x0032:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00ab
            java.lang.Object r3 = r0.next()
            o.onNotifyListenerFailed r3 = (p040o.onNotifyListenerFailed) r3
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2
        L_0x0041:
            int r6 = r3.MediaBrowserCompat$MediaItem
            if (r5 >= r6) goto L_0x00a8
            int r6 = r3.read
            int r6 = r6 + r5
            if (r6 < 0) goto L_0x0056
            int[] r7 = r11.MediaSessionCompat$ResultReceiverWrapper
            int r8 = r7.length
            if (r6 >= r8) goto L_0x0056
            r6 = r7[r6]
            android.view.View r6 = r11.getChildAt(r6)
            goto L_0x0057
        L_0x0056:
            r6 = r1
        L_0x0057:
            if (r6 == 0) goto L_0x00a5
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L_0x0062
            goto L_0x00a5
        L_0x0062:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            com.google.android.flexbox.FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver r7 = (com.google.android.flexbox.FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver) r7
            int r8 = r11.MediaMetadataCompat
            r9 = 2
            if (r8 == r9) goto L_0x0087
            int r8 = r3.f2910x50fd9e4a
            int r9 = r6.getBaseline()
            int r8 = r8 - r9
            int r9 = r7.topMargin
            int r8 = java.lang.Math.max(r8, r9)
            int r6 = r6.getMeasuredHeight()
            int r7 = r7.bottomMargin
            int r6 = r6 + r8
            int r6 = r6 + r7
            int r4 = java.lang.Math.max(r4, r6)
            goto L_0x00a5
        L_0x0087:
            int r8 = r3.f2910x50fd9e4a
            int r9 = r6.getMeasuredHeight()
            int r10 = r6.getBaseline()
            int r8 = r8 - r9
            int r8 = r8 + r10
            int r9 = r7.bottomMargin
            int r8 = java.lang.Math.max(r8, r9)
            int r6 = r6.getMeasuredHeight()
            int r7 = r7.topMargin
            int r6 = r6 + r7
            int r6 = r6 + r8
            int r4 = java.lang.Math.max(r4, r6)
        L_0x00a5:
            int r5 = r5 + 1
            goto L_0x0041
        L_0x00a8:
            r3.MediaBrowserCompat$CustomActionResultReceiver = r4
            goto L_0x0032
        L_0x00ab:
            o.nAllocationSyncAll r0 = r11.f3061x50fd9e4a
            int r1 = r11.getPaddingTop()
            int r3 = r11.getPaddingBottom()
            int r1 = r1 + r3
            r0.IconCompatParcelizer((int) r12, (int) r13, (int) r1)
            o.nAllocationSyncAll r0 = r11.f3061x50fd9e4a
            r0.write(r2)
            int r0 = r11.RatingCompat
            o.nAllocationSyncAll$MediaBrowserCompat$ItemReceiver r1 = r11.MediaDescriptionCompat
            int r1 = r1.IconCompatParcelizer
            r11.MediaBrowserCompat$CustomActionResultReceiver((int) r0, (int) r12, (int) r13, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.write(int, int):void");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        this.MediaBrowserCompat$SearchResultReceiver.clear();
        nAllocationSyncAll$MediaBrowserCompat$ItemReceiver nallocationsyncall_mediabrowsercompat_itemreceiver = this.MediaDescriptionCompat;
        nallocationsyncall_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
        nallocationsyncall_mediabrowsercompat_itemreceiver.IconCompatParcelizer = 0;
        this.f3061x50fd9e4a.IconCompatParcelizer(this.MediaDescriptionCompat, i2, i, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, -1, (List<onNotifyListenerFailed>) null);
        this.MediaBrowserCompat$SearchResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver;
        this.f3061x50fd9e4a.write(i, i2, 0);
        this.f3061x50fd9e4a.IconCompatParcelizer(i, i2, getPaddingLeft() + getPaddingRight());
        this.f3061x50fd9e4a.write(0);
        MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat, i, i2, this.MediaDescriptionCompat.IconCompatParcelizer);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i5 = MediaBrowserCompat$MediaItem() + getPaddingTop() + getPaddingBottom();
            i6 = RatingCompat();
        } else if (i == 2 || i == 3) {
            i5 = RatingCompat();
            i6 = MediaBrowserCompat$MediaItem() + getPaddingLeft() + getPaddingRight();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid flex direction: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else {
                size = i6;
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i7 = View.resolveSizeAndState(i6, i2, i4);
        } else if (mode == 1073741824) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown width mode is set: ");
            sb2.append(mode);
            throw new IllegalStateException(sb2.toString());
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = i5;
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            i8 = View.resolveSizeAndState(i5, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown height mode is set: ");
            sb3.append(mode2);
            throw new IllegalStateException(sb3.toString());
        }
        setMeasuredDimension(i7, i8);
    }

    public final int RatingCompat() {
        int i = PKIFailureInfo.systemUnavail;
        for (onNotifyListenerFailed onnotifylistenerfailed : this.MediaBrowserCompat$SearchResultReceiver) {
            i = Math.max(i, onnotifylistenerfailed.RatingCompat);
        }
        return i;
    }

    public final int MediaBrowserCompat$MediaItem() {
        int i;
        int i2;
        int size = this.MediaBrowserCompat$SearchResultReceiver.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            onNotifyListenerFailed onnotifylistenerfailed = this.MediaBrowserCompat$SearchResultReceiver.get(i4);
            boolean z = true;
            if (write(i4)) {
                int i5 = this.RatingCompat;
                if (i5 == 0 || i5 == 1) {
                    i2 = this.MediaBrowserCompat$ItemReceiver;
                } else {
                    i2 = this.MediaBrowserCompat$MediaItem;
                }
                i3 += i2;
            }
            if (MediaBrowserCompat$ItemReceiver(i4)) {
                int i6 = this.RatingCompat;
                if (!(i6 == 0 || i6 == 1)) {
                    z = false;
                }
                if (z) {
                    i = this.MediaBrowserCompat$ItemReceiver;
                } else {
                    i = this.MediaBrowserCompat$MediaItem;
                }
                i3 += i;
            }
            i3 += onnotifylistenerfailed.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return i3;
    }

    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        int i = this.RatingCompat;
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = SwitchCompat.m3079x50fd9e4a(this);
        int i5 = this.RatingCompat;
        boolean z2 = false;
        if (i5 == 0) {
            MediaBrowserCompat$CustomActionResultReceiver(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            MediaBrowserCompat$CustomActionResultReceiver(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 1) {
                z2 = true;
            }
            read(this.MediaMetadataCompat == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 1) {
                z2 = true;
            }
            read(this.MediaMetadataCompat == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid flex direction is set: ");
            sb.append(this.RatingCompat);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$CustomActionResultReceiver(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingLeft()
            int r2 = r28.getPaddingRight()
            int r3 = r32 - r30
            int r4 = r33 - r31
            int r5 = r28.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r28.getPaddingTop()
            java.util.List<o.onNotifyListenerFailed> r6 = r0.MediaBrowserCompat$SearchResultReceiver
            int r6 = r6.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r6) goto L_0x023f
            java.util.List<o.onNotifyListenerFailed> r9 = r0.MediaBrowserCompat$SearchResultReceiver
            java.lang.Object r9 = r9.get(r8)
            o.onNotifyListenerFailed r9 = (p040o.onNotifyListenerFailed) r9
            boolean r10 = r0.write((int) r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.MediaBrowserCompat$ItemReceiver
            int r4 = r4 - r10
            int r5 = r5 + r10
        L_0x0032:
            int r10 = r0.MediaSessionCompat$Token
            r15 = 4
            r14 = 2
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L_0x00cb
            if (r10 == r13) goto L_0x00c1
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x00ae
            r7 = 3
            if (r10 == r7) goto L_0x0095
            if (r10 == r15) goto L_0x007b
            r7 = 5
            if (r10 != r7) goto L_0x0062
            int r7 = r9.MediaBrowserCompat$MediaItem
            int r10 = r9.write
            int r7 = r7 - r10
            if (r7 == 0) goto L_0x0059
            int r10 = r9.RatingCompat
            int r10 = r3 - r10
            float r10 = (float) r10
            int r7 = r7 + 1
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x005a
        L_0x0059:
            r10 = r11
        L_0x005a:
            float r7 = (float) r1
            float r7 = r7 + r10
            int r12 = r3 - r2
            float r12 = (float) r12
            float r12 = r12 - r10
            goto L_0x00d1
        L_0x0062:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid justifyContent is set: "
            r1.append(r2)
            int r2 = r0.MediaSessionCompat$Token
            r1.append(r2)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x007b:
            int r7 = r9.MediaBrowserCompat$MediaItem
            int r10 = r9.write
            int r7 = r7 - r10
            if (r7 == 0) goto L_0x008a
            int r10 = r9.RatingCompat
            int r10 = r3 - r10
            float r10 = (float) r10
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x008b
        L_0x008a:
            r10 = r11
        L_0x008b:
            float r7 = (float) r1
            float r12 = r10 / r12
            float r7 = r7 + r12
            int r14 = r3 - r2
            float r14 = (float) r14
            float r12 = r14 - r12
            goto L_0x00d1
        L_0x0095:
            float r7 = (float) r1
            int r10 = r9.MediaBrowserCompat$MediaItem
            int r12 = r9.write
            int r10 = r10 - r12
            if (r10 == r13) goto L_0x00a1
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x00a3
        L_0x00a1:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00a3:
            int r12 = r9.RatingCompat
            int r12 = r3 - r12
            float r12 = (float) r12
            float r10 = r12 / r10
            int r12 = r3 - r2
            float r12 = (float) r12
            goto L_0x00d1
        L_0x00ae:
            float r7 = (float) r1
            int r10 = r9.RatingCompat
            int r10 = r3 - r10
            float r10 = (float) r10
            float r10 = r10 / r12
            float r7 = r7 + r10
            int r10 = r3 - r2
            float r10 = (float) r10
            int r14 = r9.RatingCompat
            int r14 = r3 - r14
            float r14 = (float) r14
            float r14 = r14 / r12
            float r10 = r10 - r14
            goto L_0x00cf
        L_0x00c1:
            int r7 = r9.RatingCompat
            int r7 = r3 - r7
            int r7 = r7 + r2
            float r7 = (float) r7
            int r10 = r9.RatingCompat
            int r10 = r10 - r1
            goto L_0x00ce
        L_0x00cb:
            float r7 = (float) r1
            int r10 = r3 - r2
        L_0x00ce:
            float r10 = (float) r10
        L_0x00cf:
            r12 = r10
            r10 = r11
        L_0x00d1:
            float r17 = java.lang.Math.max(r10, r11)
            r14 = 0
        L_0x00d6:
            int r10 = r9.MediaBrowserCompat$MediaItem
            if (r14 >= r10) goto L_0x0231
            int r10 = r9.read
            int r10 = r10 + r14
            if (r10 < 0) goto L_0x00eb
            int[] r11 = r0.MediaSessionCompat$ResultReceiverWrapper
            int r15 = r11.length
            if (r10 >= r15) goto L_0x00eb
            r11 = r11[r10]
            android.view.View r11 = r0.getChildAt(r11)
            goto L_0x00ec
        L_0x00eb:
            r11 = 0
        L_0x00ec:
            r18 = r11
            if (r18 == 0) goto L_0x021d
            int r11 = r18.getVisibility()
            r15 = 8
            if (r11 == r15) goto L_0x021d
            android.view.ViewGroup$LayoutParams r11 = r18.getLayoutParams()
            r15 = r11
            com.google.android.flexbox.FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver r15 = (com.google.android.flexbox.FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver) r15
            int r11 = r15.leftMargin
            float r11 = (float) r11
            float r7 = r7 + r11
            int r11 = r15.rightMargin
            float r11 = (float) r11
            float r12 = r12 - r11
            boolean r10 = r0.MediaBrowserCompat$ItemReceiver((int) r10, (int) r14)
            if (r10 == 0) goto L_0x0117
            int r10 = r0.MediaBrowserCompat$MediaItem
            float r11 = (float) r10
            float r7 = r7 + r11
            float r12 = r12 - r11
            r20 = r10
            r19 = r12
            goto L_0x011b
        L_0x0117:
            r19 = r12
            r20 = 0
        L_0x011b:
            int r10 = r9.MediaBrowserCompat$MediaItem
            int r10 = r10 - r13
            if (r14 != r10) goto L_0x012d
            int r10 = r0.Keep
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x012f
            int r10 = r0.MediaBrowserCompat$MediaItem
            r21 = r10
            goto L_0x0131
        L_0x012d:
            r16 = 4
        L_0x012f:
            r21 = 0
        L_0x0131:
            int r10 = r0.MediaMetadataCompat
            r12 = 2
            if (r10 != r12) goto L_0x0196
            if (r29 == 0) goto L_0x0169
            o.nAllocationSyncAll r10 = r0.f3061x50fd9e4a
            int r11 = java.lang.Math.round(r19)
            int r22 = r18.getMeasuredWidth()
            int r23 = r18.getMeasuredHeight()
            int r24 = java.lang.Math.round(r19)
            int r22 = r11 - r22
            int r23 = r4 - r23
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = r13
            r13 = r22
            r22 = r14
            r14 = r23
            r23 = r1
            r1 = r15
            r27 = r16
            r15 = r24
            r16 = r4
            r10.MediaBrowserCompat$ItemReceiver((android.view.View) r11, (p040o.onNotifyListenerFailed) r12, (int) r13, (int) r14, (int) r15, (int) r16)
            goto L_0x01df
        L_0x0169:
            r23 = r1
            r25 = r12
            r26 = r13
            r22 = r14
            r1 = r15
            r27 = r16
            o.nAllocationSyncAll r10 = r0.f3061x50fd9e4a
            int r13 = java.lang.Math.round(r7)
            int r11 = r18.getMeasuredHeight()
            int r12 = java.lang.Math.round(r7)
            int r14 = r18.getMeasuredWidth()
            int r15 = r4 - r11
            int r16 = r12 + r14
            r11 = r18
            r12 = r9
            r14 = r15
            r15 = r16
            r16 = r4
            r10.MediaBrowserCompat$ItemReceiver((android.view.View) r11, (p040o.onNotifyListenerFailed) r12, (int) r13, (int) r14, (int) r15, (int) r16)
            goto L_0x01df
        L_0x0196:
            r23 = r1
            r25 = r12
            r26 = r13
            r22 = r14
            r1 = r15
            r27 = r16
            if (r29 == 0) goto L_0x01c2
            o.nAllocationSyncAll r10 = r0.f3061x50fd9e4a
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredWidth()
            int r15 = java.lang.Math.round(r19)
            int r13 = r18.getMeasuredHeight()
            int r14 = r11 - r12
            int r16 = r5 + r13
            r11 = r18
            r12 = r9
            r13 = r14
            r14 = r5
            r10.MediaBrowserCompat$ItemReceiver((android.view.View) r11, (p040o.onNotifyListenerFailed) r12, (int) r13, (int) r14, (int) r15, (int) r16)
            goto L_0x01df
        L_0x01c2:
            o.nAllocationSyncAll r10 = r0.f3061x50fd9e4a
            int r13 = java.lang.Math.round(r7)
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r14 = r18.getMeasuredHeight()
            int r15 = r11 + r12
            int r16 = r5 + r14
            r11 = r18
            r12 = r9
            r14 = r5
            r10.MediaBrowserCompat$ItemReceiver((android.view.View) r11, (p040o.onNotifyListenerFailed) r12, (int) r13, (int) r14, (int) r15, (int) r16)
        L_0x01df:
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r11 = r1.rightMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r7 = r7 + r10
            int r10 = r18.getMeasuredWidth()
            float r15 = (float) r10
            int r1 = r1.leftMargin
            float r1 = (float) r1
            if (r29 == 0) goto L_0x0207
            r13 = 0
            r16 = 0
            r10 = r9
            r11 = r18
            r12 = r21
            r14 = r20
            r24 = r15
            r15 = r16
            r10.write(r11, r12, r13, r14, r15)
            goto L_0x0215
        L_0x0207:
            r24 = r15
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r20
            r14 = r21
            r10.write(r11, r12, r13, r14, r15)
        L_0x0215:
            float r15 = r24 + r17
            float r15 = r15 + r1
            float r19 = r19 - r15
            r12 = r19
            goto L_0x0227
        L_0x021d:
            r23 = r1
            r26 = r13
            r22 = r14
            r25 = 2
            r27 = 4
        L_0x0227:
            int r14 = r22 + 1
            r1 = r23
            r13 = r26
            r15 = r27
            goto L_0x00d6
        L_0x0231:
            r23 = r1
            int r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r5 + r1
            int r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r4 - r1
            int r8 = r8 + 1
            r1 = r23
            goto L_0x001e
        L_0x023f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.MediaBrowserCompat$CustomActionResultReceiver(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0235  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void read(boolean r29, boolean r30, int r31, int r32, int r33, int r34) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingTop()
            int r2 = r28.getPaddingBottom()
            int r3 = r28.getPaddingRight()
            int r4 = r28.getPaddingLeft()
            int r5 = r34 - r32
            int r6 = r33 - r31
            int r6 = r6 - r3
            java.util.List<o.onNotifyListenerFailed> r3 = r0.MediaBrowserCompat$SearchResultReceiver
            int r3 = r3.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r3) goto L_0x024d
            java.util.List<o.onNotifyListenerFailed> r9 = r0.MediaBrowserCompat$SearchResultReceiver
            java.lang.Object r9 = r9.get(r8)
            o.onNotifyListenerFailed r9 = (p040o.onNotifyListenerFailed) r9
            boolean r10 = r0.write((int) r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.MediaBrowserCompat$MediaItem
            int r4 = r4 + r10
            int r6 = r6 - r10
        L_0x0032:
            int r10 = r0.MediaSessionCompat$Token
            r15 = 4
            r11 = 0
            r14 = 1
            if (r10 == 0) goto L_0x00cb
            if (r10 == r14) goto L_0x00c1
            r12 = 2
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x00ad
            r12 = 3
            if (r10 == r12) goto L_0x0095
            if (r10 == r15) goto L_0x007b
            r12 = 5
            if (r10 != r12) goto L_0x0062
            int r10 = r9.MediaBrowserCompat$MediaItem
            int r12 = r9.write
            int r10 = r10 - r12
            if (r10 == 0) goto L_0x0059
            int r12 = r9.RatingCompat
            int r12 = r5 - r12
            float r12 = (float) r12
            int r10 = r10 + 1
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x005a
        L_0x0059:
            r12 = r11
        L_0x005a:
            float r10 = (float) r1
            float r10 = r10 + r12
            int r13 = r5 - r2
            float r13 = (float) r13
            float r13 = r13 - r12
            goto L_0x00d2
        L_0x0062:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid justifyContent is set: "
            r1.append(r2)
            int r2 = r0.MediaSessionCompat$Token
            r1.append(r2)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x007b:
            int r10 = r9.MediaBrowserCompat$MediaItem
            int r12 = r9.write
            int r10 = r10 - r12
            if (r10 == 0) goto L_0x008a
            int r12 = r9.RatingCompat
            int r12 = r5 - r12
            float r12 = (float) r12
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x008b
        L_0x008a:
            r12 = r11
        L_0x008b:
            float r10 = (float) r1
            float r13 = r12 / r13
            float r10 = r10 + r13
            int r7 = r5 - r2
            float r7 = (float) r7
            float r13 = r7 - r13
            goto L_0x00d2
        L_0x0095:
            float r10 = (float) r1
            int r7 = r9.MediaBrowserCompat$MediaItem
            int r12 = r9.write
            int r7 = r7 - r12
            if (r7 == r14) goto L_0x00a1
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x00a3
        L_0x00a1:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x00a3:
            int r12 = r9.RatingCompat
            int r12 = r5 - r12
            float r12 = (float) r12
            float r12 = r12 / r7
            int r7 = r5 - r2
            float r13 = (float) r7
            goto L_0x00d2
        L_0x00ad:
            float r7 = (float) r1
            int r10 = r9.RatingCompat
            int r10 = r5 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r10 = r10 + r7
            int r7 = r5 - r2
            float r7 = (float) r7
            int r12 = r9.RatingCompat
            int r12 = r5 - r12
            float r12 = (float) r12
            float r12 = r12 / r13
            float r7 = r7 - r12
            r13 = r7
            goto L_0x00d1
        L_0x00c1:
            int r7 = r9.RatingCompat
            int r7 = r5 - r7
            int r7 = r7 + r2
            float r7 = (float) r7
            int r10 = r9.RatingCompat
            int r10 = r10 - r1
            goto L_0x00ce
        L_0x00cb:
            float r7 = (float) r1
            int r10 = r5 - r2
        L_0x00ce:
            float r10 = (float) r10
            r13 = r10
            r10 = r7
        L_0x00d1:
            r12 = r11
        L_0x00d2:
            float r7 = java.lang.Math.max(r12, r11)
            r12 = 0
        L_0x00d7:
            int r11 = r9.MediaBrowserCompat$MediaItem
            if (r12 >= r11) goto L_0x0243
            int r11 = r9.read
            int r11 = r11 + r12
            if (r11 < 0) goto L_0x00ec
            int[] r15 = r0.MediaSessionCompat$ResultReceiverWrapper
            int r14 = r15.length
            if (r11 >= r14) goto L_0x00ec
            r14 = r15[r11]
            android.view.View r14 = r0.getChildAt(r14)
            goto L_0x00ed
        L_0x00ec:
            r14 = 0
        L_0x00ed:
            r18 = r14
            if (r18 == 0) goto L_0x0235
            int r14 = r18.getVisibility()
            r15 = 8
            if (r14 == r15) goto L_0x0235
            android.view.ViewGroup$LayoutParams r14 = r18.getLayoutParams()
            r15 = r14
            com.google.android.flexbox.FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver r15 = (com.google.android.flexbox.FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver) r15
            int r14 = r15.topMargin
            float r14 = (float) r14
            float r10 = r10 + r14
            int r14 = r15.bottomMargin
            float r14 = (float) r14
            float r13 = r13 - r14
            boolean r11 = r0.MediaBrowserCompat$ItemReceiver((int) r11, (int) r12)
            if (r11 == 0) goto L_0x011a
            int r11 = r0.MediaBrowserCompat$ItemReceiver
            float r14 = (float) r11
            float r10 = r10 + r14
            float r13 = r13 - r14
            r19 = r10
            r21 = r11
            r20 = r13
            goto L_0x0120
        L_0x011a:
            r19 = r10
            r20 = r13
            r21 = 0
        L_0x0120:
            int r10 = r9.MediaBrowserCompat$MediaItem
            r14 = 1
            int r10 = r10 - r14
            if (r12 != r10) goto L_0x0133
            int r10 = r0.PlaybackStateCompat
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0135
            int r10 = r0.MediaBrowserCompat$ItemReceiver
            r22 = r10
            goto L_0x0137
        L_0x0133:
            r16 = 4
        L_0x0135:
            r22 = 0
        L_0x0137:
            if (r29 == 0) goto L_0x0198
            if (r30 == 0) goto L_0x016d
            o.nAllocationSyncAll r10 = r0.f3061x50fd9e4a
            int r11 = r18.getMeasuredWidth()
            int r13 = java.lang.Math.round(r20)
            int r17 = r18.getMeasuredHeight()
            int r23 = java.lang.Math.round(r20)
            r24 = 1
            int r25 = r6 - r11
            int r17 = r13 - r17
            r11 = r18
            r26 = r12
            r12 = r9
            r13 = r24
            r24 = r14
            r14 = r25
            r27 = r15
            r25 = r16
            r15 = r17
            r16 = r6
            r17 = r23
            r10.write(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01e1
        L_0x016d:
            r26 = r12
            r24 = r14
            r27 = r15
            r25 = r16
            o.nAllocationSyncAll r10 = r0.f3061x50fd9e4a
            int r11 = r18.getMeasuredWidth()
            int r15 = java.lang.Math.round(r19)
            int r12 = java.lang.Math.round(r19)
            int r13 = r18.getMeasuredHeight()
            r14 = 1
            int r16 = r6 - r11
            int r17 = r12 + r13
            r11 = r18
            r12 = r9
            r13 = r14
            r14 = r16
            r16 = r6
            r10.write(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01e1
        L_0x0198:
            r26 = r12
            r24 = r14
            r27 = r15
            r25 = r16
            if (r30 == 0) goto L_0x01c2
            o.nAllocationSyncAll r10 = r0.f3061x50fd9e4a
            int r11 = java.lang.Math.round(r20)
            int r12 = r18.getMeasuredHeight()
            int r13 = r18.getMeasuredWidth()
            int r17 = java.lang.Math.round(r20)
            r14 = 0
            int r15 = r11 - r12
            int r16 = r4 + r13
            r11 = r18
            r12 = r9
            r13 = r14
            r14 = r4
            r10.write(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01e1
        L_0x01c2:
            o.nAllocationSyncAll r10 = r0.f3061x50fd9e4a
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredWidth()
            int r12 = java.lang.Math.round(r19)
            int r13 = r18.getMeasuredHeight()
            r14 = 0
            int r16 = r4 + r11
            int r17 = r12 + r13
            r11 = r18
            r12 = r9
            r13 = r14
            r14 = r4
            r10.write(r11, r12, r13, r14, r15, r16, r17)
        L_0x01e1:
            int r10 = r18.getMeasuredHeight()
            float r15 = (float) r10
            r14 = r27
            int r10 = r14.bottomMargin
            float r13 = (float) r10
            int r10 = r18.getMeasuredHeight()
            float r12 = (float) r10
            int r10 = r14.topMargin
            float r14 = (float) r10
            if (r30 == 0) goto L_0x0210
            r16 = 0
            r17 = 0
            r10 = r9
            r11 = r18
            r23 = r12
            r12 = r16
            r16 = r13
            r13 = r22
            r27 = r14
            r14 = r17
            r17 = r15
            r15 = r21
            r10.write(r11, r12, r13, r14, r15)
            goto L_0x0224
        L_0x0210:
            r23 = r12
            r16 = r13
            r27 = r14
            r17 = r15
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r21
            r15 = r22
            r10.write(r11, r12, r13, r14, r15)
        L_0x0224:
            float r15 = r17 + r7
            float r15 = r15 + r16
            float r19 = r19 + r15
            float r12 = r23 + r7
            float r12 = r12 + r27
            float r20 = r20 - r12
            r10 = r19
            r13 = r20
            goto L_0x023b
        L_0x0235:
            r26 = r12
            r24 = 1
            r25 = 4
        L_0x023b:
            int r12 = r26 + 1
            r14 = r24
            r15 = r25
            goto L_0x00d7
        L_0x0243:
            int r7 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r4 + r7
            int r7 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r6 - r7
            int r8 = r8 + 1
            goto L_0x001e
        L_0x024d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.read(boolean, boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null || this.write != null) {
            if (this.PlaybackStateCompat != 0 || this.Keep != 0) {
                int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = SwitchCompat.m3079x50fd9e4a(this);
                int i = this.RatingCompat;
                boolean z = false;
                boolean z2 = true;
                if (i == 0) {
                    boolean z3 = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 1;
                    if (this.MediaMetadataCompat == 2) {
                        z = true;
                    }
                    write(canvas, z3, z);
                } else if (i == 1) {
                    boolean z4 = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != 1;
                    if (this.MediaMetadataCompat == 2) {
                        z = true;
                    }
                    write(canvas, z4, z);
                } else if (i == 2) {
                    if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != 1) {
                        z2 = false;
                    }
                    if (this.MediaMetadataCompat == 2) {
                        z2 = !z2;
                    }
                    read(canvas, z2, false);
                } else if (i == 3) {
                    if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 1) {
                        z = true;
                    }
                    if (this.MediaMetadataCompat == 2) {
                        z = !z;
                    }
                    read(canvas, z, true);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void write(android.graphics.Canvas r13, boolean r14, boolean r15) {
        /*
            r12 = this;
            int r0 = r12.getPaddingLeft()
            int r1 = r12.getPaddingRight()
            int r2 = r12.getWidth()
            int r2 = r2 - r1
            int r2 = r2 - r0
            r1 = 0
            int r2 = java.lang.Math.max(r1, r2)
            java.util.List<o.onNotifyListenerFailed> r3 = r12.MediaBrowserCompat$SearchResultReceiver
            int r3 = r3.size()
            r4 = r1
        L_0x001a:
            if (r4 >= r3) goto L_0x00c6
            java.util.List<o.onNotifyListenerFailed> r5 = r12.MediaBrowserCompat$SearchResultReceiver
            java.lang.Object r5 = r5.get(r4)
            o.onNotifyListenerFailed r5 = (p040o.onNotifyListenerFailed) r5
            r6 = r1
        L_0x0025:
            int r7 = r5.MediaBrowserCompat$MediaItem
            if (r6 >= r7) goto L_0x0096
            int r7 = r5.read
            int r7 = r7 + r6
            if (r7 < 0) goto L_0x003a
            int[] r8 = r12.MediaSessionCompat$ResultReceiverWrapper
            int r9 = r8.length
            if (r7 >= r9) goto L_0x003a
            r8 = r8[r7]
            android.view.View r8 = r12.getChildAt(r8)
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            if (r8 == 0) goto L_0x0093
            int r9 = r8.getVisibility()
            r10 = 8
            if (r9 == r10) goto L_0x0093
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.google.android.flexbox.FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver r9 = (com.google.android.flexbox.FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver) r9
            boolean r7 = r12.MediaBrowserCompat$ItemReceiver((int) r7, (int) r6)
            if (r7 == 0) goto L_0x006c
            if (r14 == 0) goto L_0x005b
            int r7 = r8.getRight()
            int r10 = r9.rightMargin
            int r7 = r7 + r10
            goto L_0x0065
        L_0x005b:
            int r7 = r8.getLeft()
            int r10 = r9.leftMargin
            int r7 = r7 - r10
            int r10 = r12.MediaBrowserCompat$MediaItem
            int r7 = r7 - r10
        L_0x0065:
            int r10 = r5.MediaSessionCompat$QueueItem
            int r11 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r12.MediaBrowserCompat$CustomActionResultReceiver((android.graphics.Canvas) r13, (int) r7, (int) r10, (int) r11)
        L_0x006c:
            int r7 = r5.MediaBrowserCompat$MediaItem
            int r7 = r7 + -1
            if (r6 != r7) goto L_0x0093
            int r7 = r12.Keep
            r7 = r7 & 4
            if (r7 <= 0) goto L_0x0093
            if (r14 == 0) goto L_0x0085
            int r7 = r8.getLeft()
            int r8 = r9.leftMargin
            int r7 = r7 - r8
            int r8 = r12.MediaBrowserCompat$MediaItem
            int r7 = r7 - r8
            goto L_0x008c
        L_0x0085:
            int r7 = r8.getRight()
            int r8 = r9.rightMargin
            int r7 = r7 + r8
        L_0x008c:
            int r8 = r5.MediaSessionCompat$QueueItem
            int r9 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r12.MediaBrowserCompat$CustomActionResultReceiver((android.graphics.Canvas) r13, (int) r7, (int) r8, (int) r9)
        L_0x0093:
            int r6 = r6 + 1
            goto L_0x0025
        L_0x0096:
            boolean r6 = r12.write((int) r4)
            if (r6 == 0) goto L_0x00a9
            if (r15 == 0) goto L_0x00a1
            int r6 = r5.MediaBrowserCompat$ItemReceiver
            goto L_0x00a6
        L_0x00a1:
            int r6 = r5.MediaSessionCompat$QueueItem
            int r7 = r12.MediaBrowserCompat$ItemReceiver
            int r6 = r6 - r7
        L_0x00a6:
            r12.MediaBrowserCompat$ItemReceiver(r13, r0, r6, r2)
        L_0x00a9:
            boolean r6 = r12.MediaBrowserCompat$ItemReceiver(r4)
            if (r6 == 0) goto L_0x00c2
            int r6 = r12.PlaybackStateCompat
            r6 = r6 & 4
            if (r6 <= 0) goto L_0x00c2
            if (r15 == 0) goto L_0x00bd
            int r5 = r5.MediaSessionCompat$QueueItem
            int r6 = r12.MediaBrowserCompat$ItemReceiver
            int r5 = r5 - r6
            goto L_0x00bf
        L_0x00bd:
            int r5 = r5.MediaBrowserCompat$ItemReceiver
        L_0x00bf:
            r12.MediaBrowserCompat$ItemReceiver(r13, r0, r5, r2)
        L_0x00c2:
            int r4 = r4 + 1
            goto L_0x001a
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.write(android.graphics.Canvas, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void read(android.graphics.Canvas r13, boolean r14, boolean r15) {
        /*
            r12 = this;
            int r0 = r12.getPaddingTop()
            int r1 = r12.getPaddingBottom()
            int r2 = r12.getHeight()
            int r2 = r2 - r1
            int r2 = r2 - r0
            r1 = 0
            int r2 = java.lang.Math.max(r1, r2)
            java.util.List<o.onNotifyListenerFailed> r3 = r12.MediaBrowserCompat$SearchResultReceiver
            int r3 = r3.size()
            r4 = r1
        L_0x001a:
            if (r4 >= r3) goto L_0x00c6
            java.util.List<o.onNotifyListenerFailed> r5 = r12.MediaBrowserCompat$SearchResultReceiver
            java.lang.Object r5 = r5.get(r4)
            o.onNotifyListenerFailed r5 = (p040o.onNotifyListenerFailed) r5
            r6 = r1
        L_0x0025:
            int r7 = r5.MediaBrowserCompat$MediaItem
            if (r6 >= r7) goto L_0x0096
            int r7 = r5.read
            int r7 = r7 + r6
            if (r7 < 0) goto L_0x003a
            int[] r8 = r12.MediaSessionCompat$ResultReceiverWrapper
            int r9 = r8.length
            if (r7 >= r9) goto L_0x003a
            r8 = r8[r7]
            android.view.View r8 = r12.getChildAt(r8)
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            if (r8 == 0) goto L_0x0093
            int r9 = r8.getVisibility()
            r10 = 8
            if (r9 == r10) goto L_0x0093
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.google.android.flexbox.FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver r9 = (com.google.android.flexbox.FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver) r9
            boolean r7 = r12.MediaBrowserCompat$ItemReceiver((int) r7, (int) r6)
            if (r7 == 0) goto L_0x006c
            if (r15 == 0) goto L_0x005b
            int r7 = r8.getBottom()
            int r10 = r9.bottomMargin
            int r7 = r7 + r10
            goto L_0x0065
        L_0x005b:
            int r7 = r8.getTop()
            int r10 = r9.topMargin
            int r7 = r7 - r10
            int r10 = r12.MediaBrowserCompat$ItemReceiver
            int r7 = r7 - r10
        L_0x0065:
            int r10 = r5.MediaBrowserCompat$SearchResultReceiver
            int r11 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r12.MediaBrowserCompat$ItemReceiver(r13, r10, r7, r11)
        L_0x006c:
            int r7 = r5.MediaBrowserCompat$MediaItem
            int r7 = r7 + -1
            if (r6 != r7) goto L_0x0093
            int r7 = r12.PlaybackStateCompat
            r7 = r7 & 4
            if (r7 <= 0) goto L_0x0093
            if (r15 == 0) goto L_0x0085
            int r7 = r8.getTop()
            int r8 = r9.topMargin
            int r7 = r7 - r8
            int r8 = r12.MediaBrowserCompat$ItemReceiver
            int r7 = r7 - r8
            goto L_0x008c
        L_0x0085:
            int r7 = r8.getBottom()
            int r8 = r9.bottomMargin
            int r7 = r7 + r8
        L_0x008c:
            int r8 = r5.MediaBrowserCompat$SearchResultReceiver
            int r9 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r12.MediaBrowserCompat$ItemReceiver(r13, r8, r7, r9)
        L_0x0093:
            int r6 = r6 + 1
            goto L_0x0025
        L_0x0096:
            boolean r6 = r12.write((int) r4)
            if (r6 == 0) goto L_0x00a9
            if (r14 == 0) goto L_0x00a1
            int r6 = r5.MediaSessionCompat$Token
            goto L_0x00a6
        L_0x00a1:
            int r6 = r5.MediaBrowserCompat$SearchResultReceiver
            int r7 = r12.MediaBrowserCompat$MediaItem
            int r6 = r6 - r7
        L_0x00a6:
            r12.MediaBrowserCompat$CustomActionResultReceiver((android.graphics.Canvas) r13, (int) r6, (int) r0, (int) r2)
        L_0x00a9:
            boolean r6 = r12.MediaBrowserCompat$ItemReceiver(r4)
            if (r6 == 0) goto L_0x00c2
            int r6 = r12.Keep
            r6 = r6 & 4
            if (r6 <= 0) goto L_0x00c2
            if (r14 == 0) goto L_0x00bd
            int r5 = r5.MediaBrowserCompat$SearchResultReceiver
            int r6 = r12.MediaBrowserCompat$MediaItem
            int r5 = r5 - r6
            goto L_0x00bf
        L_0x00bd:
            int r5 = r5.MediaSessionCompat$Token
        L_0x00bf:
            r12.MediaBrowserCompat$CustomActionResultReceiver((android.graphics.Canvas) r13, (int) r5, (int) r0, (int) r2)
        L_0x00c2:
            int r4 = r4 + 1
            goto L_0x001a
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.read(android.graphics.Canvas, boolean, boolean):void");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.MediaBrowserCompat$MediaItem + i, i3 + i2);
            this.MediaBrowserCompat$CustomActionResultReceiver.draw(canvas);
        }
    }

    private void MediaBrowserCompat$ItemReceiver(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.write;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.MediaBrowserCompat$ItemReceiver + i2);
            this.write.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver) {
            return new FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver((FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver(layoutParams);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.RatingCompat;
    }

    public void setFlexDirection(int i) {
        if (this.RatingCompat != i) {
            this.RatingCompat = i;
            requestLayout();
        }
    }

    public final int MediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public void setFlexWrap(int i) {
        if (this.MediaMetadataCompat != i) {
            this.MediaMetadataCompat = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.MediaSessionCompat$Token != i) {
            this.MediaSessionCompat$Token = i;
            requestLayout();
        }
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public void setAlignItems(int i) {
        if (this.IconCompatParcelizer != i) {
            this.IconCompatParcelizer = i;
            requestLayout();
        }
    }

    /* renamed from: k_ */
    public final int mo33252k_() {
        return this.read;
    }

    public void setAlignContent(int i) {
        if (this.read != i) {
            this.read = i;
            requestLayout();
        }
    }

    public final int MediaDescriptionCompat() {
        return this.MediaSessionCompat$QueueItem;
    }

    public void setMaxLine(int i) {
        if (this.MediaSessionCompat$QueueItem != i) {
            this.MediaSessionCompat$QueueItem = i;
            requestLayout();
        }
    }

    public final int MediaBrowserCompat$ItemReceiver(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    public final int read(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    public final void write(View view, int i, int i2, onNotifyListenerFailed onnotifylistenerfailed) {
        if (MediaBrowserCompat$ItemReceiver(i, i2)) {
            int i3 = this.RatingCompat;
            boolean z = true;
            if (!(i3 == 0 || i3 == 1)) {
                z = false;
            }
            if (z) {
                onnotifylistenerfailed.RatingCompat += this.MediaBrowserCompat$MediaItem;
                onnotifylistenerfailed.IconCompatParcelizer += this.MediaBrowserCompat$MediaItem;
                return;
            }
            onnotifylistenerfailed.RatingCompat += this.MediaBrowserCompat$ItemReceiver;
            onnotifylistenerfailed.IconCompatParcelizer += this.MediaBrowserCompat$ItemReceiver;
        }
    }

    public void setFlexLines(List<onNotifyListenerFailed> list) {
        this.MediaBrowserCompat$SearchResultReceiver = list;
    }

    /* renamed from: m_ */
    public final List<onNotifyListenerFailed> mo33254m_() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.write) {
            this.write = drawable;
            if (drawable != null) {
                this.MediaBrowserCompat$ItemReceiver = drawable.getIntrinsicHeight();
            } else {
                this.MediaBrowserCompat$ItemReceiver = 0;
            }
            if (this.write == null && this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                setWillNotDraw(true);
            } else {
                setWillNotDraw(false);
            }
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = drawable;
            if (drawable != null) {
                this.MediaBrowserCompat$MediaItem = drawable.getIntrinsicWidth();
            } else {
                this.MediaBrowserCompat$MediaItem = 0;
            }
            if (this.write == null && this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                setWillNotDraw(true);
            } else {
                setWillNotDraw(false);
            }
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerVertical(int i) {
        if (i != this.Keep) {
            this.Keep = i;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.PlaybackStateCompat) {
            this.PlaybackStateCompat = i;
            requestLayout();
        }
    }

    private boolean MediaBrowserCompat$ItemReceiver(int i, int i2) {
        if (IconCompatParcelizer(i, i2)) {
            int i3 = this.RatingCompat;
            if (i3 == 0 || i3 == 1) {
                if ((this.Keep & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.PlaybackStateCompat & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            int i4 = this.RatingCompat;
            if (i4 == 0 || i4 == 1) {
                if ((this.Keep & 2) != 0) {
                    return true;
                }
                return false;
            } else if ((this.PlaybackStateCompat & 2) != 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    private boolean write(int i) {
        if (i < 0 || i >= this.MediaBrowserCompat$SearchResultReceiver.size()) {
            return false;
        }
        if (MediaBrowserCompat$CustomActionResultReceiver(i)) {
            int i2 = this.RatingCompat;
            if (i2 == 0 || i2 == 1) {
                if ((this.PlaybackStateCompat & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.Keep & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            int i3 = this.RatingCompat;
            if (i3 == 0 || i3 == 1) {
                if ((this.PlaybackStateCompat & 2) != 0) {
                    return true;
                }
                return false;
            } else if ((this.Keep & 2) != 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            onNotifyListenerFailed onnotifylistenerfailed = this.MediaBrowserCompat$SearchResultReceiver.get(i2);
            if (onnotifylistenerfailed.MediaBrowserCompat$MediaItem - onnotifylistenerfailed.write > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean MediaBrowserCompat$ItemReceiver(int i) {
        if (i < 0 || i >= this.MediaBrowserCompat$SearchResultReceiver.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.MediaBrowserCompat$SearchResultReceiver.size(); i2++) {
            onNotifyListenerFailed onnotifylistenerfailed = this.MediaBrowserCompat$SearchResultReceiver.get(i2);
            if (onnotifylistenerfailed.MediaBrowserCompat$MediaItem - onnotifylistenerfailed.write > 0) {
                return false;
            }
        }
        int i3 = this.RatingCompat;
        if (i3 == 0 || i3 == 1) {
            if ((this.PlaybackStateCompat & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.Keep & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[LOOP:0: B:1:0x0002->B:12:0x0021, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean IconCompatParcelizer(int r6, int r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = r0
        L_0x0002:
            if (r1 > r7) goto L_0x0024
            int r2 = r6 - r1
            if (r2 < 0) goto L_0x0014
            int[] r3 = r5.MediaSessionCompat$ResultReceiverWrapper
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0014
            r2 = r3[r2]
            android.view.View r2 = r5.getChildAt(r2)
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 == 0) goto L_0x0021
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x0021
            r6 = 0
            return r6
        L_0x0021:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.IconCompatParcelizer(int, int):boolean");
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver(getContext(), attributeSet);
    }

    public final int write(View view, int i, int i2) {
        int i3;
        int i4 = this.RatingCompat;
        boolean z = true;
        int i5 = 0;
        if (!(i4 == 0 || i4 == 1)) {
            z = false;
        }
        if (z) {
            if (MediaBrowserCompat$ItemReceiver(i, i2)) {
                i5 = 0 + this.MediaBrowserCompat$MediaItem;
            }
            if ((this.Keep & 4) <= 0) {
                return i5;
            }
            i3 = this.MediaBrowserCompat$MediaItem;
        } else {
            if (MediaBrowserCompat$ItemReceiver(i, i2)) {
                i5 = 0 + this.MediaBrowserCompat$ItemReceiver;
            }
            if ((this.PlaybackStateCompat & 4) <= 0) {
                return i5;
            }
            i3 = this.MediaBrowserCompat$ItemReceiver;
        }
        return i5 + i3;
    }

    public final View read(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.MediaSessionCompat$ResultReceiverWrapper;
        if (i < iArr.length) {
            return getChildAt(iArr[i]);
        }
        return null;
    }

    public final void write(onNotifyListenerFailed onnotifylistenerfailed) {
        int i = this.RatingCompat;
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        if (z) {
            if ((this.Keep & 4) > 0) {
                onnotifylistenerfailed.RatingCompat += this.MediaBrowserCompat$MediaItem;
                onnotifylistenerfailed.IconCompatParcelizer += this.MediaBrowserCompat$MediaItem;
            }
        } else if ((this.PlaybackStateCompat & 4) > 0) {
            onnotifylistenerfailed.RatingCompat += this.MediaBrowserCompat$ItemReceiver;
            onnotifylistenerfailed.IconCompatParcelizer += this.MediaBrowserCompat$ItemReceiver;
        }
    }
}

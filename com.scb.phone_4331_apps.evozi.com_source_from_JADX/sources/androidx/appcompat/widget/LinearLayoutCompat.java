package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.setDefaultActionButtonContentDescription;

public class LinearLayoutCompat extends ViewGroup {
    private int IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private int[] MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f9x50fd9e4a;
    private int MediaDescriptionCompat;
    private int[] MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem;
    private float MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    private int ParcelableVolumeInfo;
    private int RatingCompat;
    private int read;
    private Drawable write;

    /* access modifiers changed from: package-private */
    public int MediaBrowserCompat$CustomActionResultReceiver(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int read(int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int read(View view) {
        return 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        this.MediaBrowserCompat$ItemReceiver = -1;
        this.IconCompatParcelizer = 0;
        this.MediaDescriptionCompat = 8388659;
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat, i, 0));
        int i2 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.MediaSessionCompat$ResultReceiverWrapper = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getFloat(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat_android_weightSum, -1.0f);
        this.MediaBrowserCompat$ItemReceiver = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f9x50fd9e4a = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat_divider));
        this.MediaSessionCompat$QueueItem = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat_showDividers, 0);
        this.MediaBrowserCompat$MediaItem = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat_dividerPadding, 0);
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
    }

    public void setShowDividers(int i) {
        if (i != this.MediaSessionCompat$QueueItem) {
            requestLayout();
        }
        this.MediaSessionCompat$QueueItem = i;
    }

    public Drawable MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.write) {
            this.write = drawable;
            boolean z = false;
            if (drawable != null) {
                this.RatingCompat = drawable.getIntrinsicWidth();
                this.read = drawable.getIntrinsicHeight();
            } else {
                this.RatingCompat = 0;
                this.read = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.MediaBrowserCompat$MediaItem = i;
    }

    public int MediaBrowserCompat$MediaItem() {
        return this.RatingCompat;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.write != null) {
            if (this.ParcelableVolumeInfo == 1) {
                IconCompatParcelizer(canvas);
            } else {
                write(canvas);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void IconCompatParcelizer(Canvas canvas) {
        int i;
        int RatingCompat2 = RatingCompat();
        for (int i2 = 0; i2 < RatingCompat2; i2++) {
            View MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i2);
            if (!(MediaBrowserCompat$ItemReceiver2 == null || MediaBrowserCompat$ItemReceiver2.getVisibility() == 8 || !MediaBrowserCompat$CustomActionResultReceiver(i2))) {
                write(canvas, (MediaBrowserCompat$ItemReceiver2.getTop() - ((write) MediaBrowserCompat$ItemReceiver2.getLayoutParams()).topMargin) - this.read);
            }
        }
        if (MediaBrowserCompat$CustomActionResultReceiver(RatingCompat2)) {
            View MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(RatingCompat2 - 1);
            if (MediaBrowserCompat$ItemReceiver3 == null) {
                i = (getHeight() - getPaddingBottom()) - this.read;
            } else {
                i = MediaBrowserCompat$ItemReceiver3.getBottom() + ((write) MediaBrowserCompat$ItemReceiver3.getLayoutParams()).bottomMargin;
            }
            write(canvas, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void write(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int RatingCompat2 = RatingCompat();
        boolean MediaBrowserCompat$ItemReceiver2 = setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(this);
        for (int i5 = 0; i5 < RatingCompat2; i5++) {
            View MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(i5);
            if (!(MediaBrowserCompat$ItemReceiver3 == null || MediaBrowserCompat$ItemReceiver3.getVisibility() == 8 || !MediaBrowserCompat$CustomActionResultReceiver(i5))) {
                write write2 = (write) MediaBrowserCompat$ItemReceiver3.getLayoutParams();
                if (MediaBrowserCompat$ItemReceiver2) {
                    i4 = MediaBrowserCompat$ItemReceiver3.getRight() + write2.rightMargin;
                } else {
                    i4 = (MediaBrowserCompat$ItemReceiver3.getLeft() - write2.leftMargin) - this.RatingCompat;
                }
                MediaBrowserCompat$CustomActionResultReceiver(canvas, i4);
            }
        }
        if (MediaBrowserCompat$CustomActionResultReceiver(RatingCompat2)) {
            View MediaBrowserCompat$ItemReceiver4 = MediaBrowserCompat$ItemReceiver(RatingCompat2 - 1);
            if (MediaBrowserCompat$ItemReceiver4 != null) {
                write write3 = (write) MediaBrowserCompat$ItemReceiver4.getLayoutParams();
                if (MediaBrowserCompat$ItemReceiver2) {
                    i3 = MediaBrowserCompat$ItemReceiver4.getLeft() - write3.leftMargin;
                    i2 = this.RatingCompat;
                } else {
                    i = MediaBrowserCompat$ItemReceiver4.getRight() + write3.rightMargin;
                    MediaBrowserCompat$CustomActionResultReceiver(canvas, i);
                }
            } else if (MediaBrowserCompat$ItemReceiver2) {
                i = getPaddingLeft();
                MediaBrowserCompat$CustomActionResultReceiver(canvas, i);
            } else {
                i3 = getWidth() - getPaddingRight();
                i2 = this.RatingCompat;
            }
            i = i3 - i2;
            MediaBrowserCompat$CustomActionResultReceiver(canvas, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void write(Canvas canvas, int i) {
        Drawable drawable = this.write;
        int paddingLeft = getPaddingLeft();
        int i2 = this.MediaBrowserCompat$MediaItem;
        int width = getWidth();
        int paddingRight = getPaddingRight();
        drawable.setBounds(paddingLeft + i2, i, (width - paddingRight) - this.MediaBrowserCompat$MediaItem, this.read + i);
        this.write.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$CustomActionResultReceiver(Canvas canvas, int i) {
        this.write.setBounds(i, getPaddingTop() + this.MediaBrowserCompat$MediaItem, this.RatingCompat + i, (getHeight() - getPaddingBottom()) - this.MediaBrowserCompat$MediaItem);
        this.write.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f9x50fd9e4a = z;
    }

    public int getBaseline() {
        int i;
        if (this.MediaBrowserCompat$ItemReceiver < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.IconCompatParcelizer;
                if (this.ParcelableVolumeInfo == 1 && (i = this.MediaDescriptionCompat & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.MediaSessionCompat$Token) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.MediaSessionCompat$Token;
                    }
                }
                return i3 + ((write) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.MediaBrowserCompat$ItemReceiver == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder();
            sb.append("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    /* access modifiers changed from: package-private */
    public View MediaBrowserCompat$ItemReceiver(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: package-private */
    public int RatingCompat() {
        return getChildCount();
    }

    public void setWeightSum(float f) {
        this.MediaSessionCompat$ResultReceiverWrapper = Math.max(BitmapDescriptorFactory.HUE_RED, f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.ParcelableVolumeInfo == 1) {
            IconCompatParcelizer(i, i2);
        } else {
            write(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            return (this.MediaSessionCompat$QueueItem & 1) != 0;
        }
        if (i != getChildCount()) {
            if ((this.MediaSessionCompat$QueueItem & 2) != 0) {
                do {
                    i--;
                    if (i >= 0) {
                    }
                } while (getChildAt(i).getVisibility() == 8);
                return true;
            }
            return false;
        } else if ((this.MediaSessionCompat$QueueItem & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0327  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void IconCompatParcelizer(int r33, int r34) {
        /*
            r32 = this;
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = 0
            r7.MediaSessionCompat$Token = r10
            int r11 = r32.RatingCompat()
            int r12 = android.view.View.MeasureSpec.getMode(r33)
            int r13 = android.view.View.MeasureSpec.getMode(r34)
            int r14 = r7.MediaBrowserCompat$ItemReceiver
            boolean r15 = r7.f9x50fd9e4a
            r16 = 0
            r17 = 1
            r1 = r10
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r18 = r6
            r20 = r18
            r0 = r16
            r19 = r17
        L_0x002b:
            r10 = 8
            r21 = r4
            if (r6 >= r11) goto L_0x019a
            android.view.View r4 = r7.MediaBrowserCompat$ItemReceiver((int) r6)
            if (r4 != 0) goto L_0x0048
            int r4 = r7.MediaSessionCompat$Token
            int r10 = r7.read((int) r6)
            int r4 = r4 + r10
            r7.MediaSessionCompat$Token = r4
            r22 = r11
            r23 = r13
            r4 = r21
            goto L_0x018e
        L_0x0048:
            r23 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005f
            int r1 = r7.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r4, (int) r6)
            int r6 = r6 + r1
            r22 = r11
            r4 = r21
            r1 = r23
            r23 = r13
            goto L_0x018e
        L_0x005f:
            boolean r1 = r7.MediaBrowserCompat$CustomActionResultReceiver((int) r6)
            if (r1 == 0) goto L_0x006c
            int r1 = r7.MediaSessionCompat$Token
            int r10 = r7.read
            int r1 = r1 + r10
            r7.MediaSessionCompat$Token = r1
        L_0x006c:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.LinearLayoutCompat$write r10 = (androidx.appcompat.widget.LinearLayoutCompat.write) r10
            float r1 = r10.MediaDescriptionCompat
            float r24 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x00a7
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a7
            float r0 = r10.MediaDescriptionCompat
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a7
            int r0 = r7.MediaSessionCompat$Token
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r25 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.MediaSessionCompat$Token = r0
            r9 = r3
            r30 = r5
            r22 = r11
            r18 = r17
            r8 = r23
            r2 = r25
            r11 = r6
            r23 = r13
            r13 = r21
            goto L_0x011b
        L_0x00a7:
            r25 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b8
            float r0 = r10.MediaDescriptionCompat
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b8
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00ba
        L_0x00b8:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00ba:
            int r0 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c3
            int r0 = r7.MediaSessionCompat$Token
            r26 = r0
            goto L_0x00c5
        L_0x00c3:
            r26 = 0
        L_0x00c5:
            r27 = 0
            r0 = r32
            r8 = r23
            r22 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r29 = r2
            r28 = r25
            r2 = r6
            r9 = r3
            r3 = r33
            r23 = r13
            r13 = r21
            r21 = r4
            r31 = r22
            r22 = r11
            r11 = r31
            r4 = r27
            r30 = r5
            r5 = r34
            r11 = r6
            r6 = r26
            r0.MediaBrowserCompat$ItemReceiver(r1, r2, r3, r4, r5, r6)
            r0 = r29
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f6
            r10.height = r0
        L_0x00f6:
            int r0 = r21.getMeasuredHeight()
            int r1 = r7.MediaSessionCompat$Token
            int r2 = r10.topMargin
            int r3 = r10.bottomMargin
            r4 = r21
            int r5 = r7.read((android.view.View) r4)
            int r6 = r1 + r0
            int r6 = r6 + r2
            int r6 = r6 + r3
            int r6 = r6 + r5
            int r1 = java.lang.Math.max(r1, r6)
            r7.MediaSessionCompat$Token = r1
            r1 = r28
            if (r15 == 0) goto L_0x011a
            int r2 = java.lang.Math.max(r0, r1)
            goto L_0x011b
        L_0x011a:
            r2 = r1
        L_0x011b:
            if (r14 < 0) goto L_0x0125
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x0125
            int r0 = r7.MediaSessionCompat$Token
            r7.IconCompatParcelizer = r0
        L_0x0125:
            if (r11 >= r14) goto L_0x0136
            float r0 = r10.MediaDescriptionCompat
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x012e
            goto L_0x0136
        L_0x012e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0136:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0144
            int r0 = r10.width
            r1 = -1
            if (r0 != r1) goto L_0x0144
            r0 = r17
            r20 = r0
            goto L_0x0145
        L_0x0144:
            r0 = 0
        L_0x0145:
            int r1 = r10.leftMargin
            int r3 = r10.rightMargin
            int r1 = r1 + r3
            int r3 = r4.getMeasuredWidth()
            int r3 = r3 + r1
            int r5 = java.lang.Math.max(r8, r3)
            int r6 = r4.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r9, r6)
            if (r19 == 0) goto L_0x0165
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0165
            r19 = r17
            goto L_0x0167
        L_0x0165:
            r19 = 0
        L_0x0167:
            float r8 = r10.MediaDescriptionCompat
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x0177
            if (r0 != 0) goto L_0x0170
            r1 = r3
        L_0x0170:
            r8 = r30
            int r0 = java.lang.Math.max(r8, r1)
            goto L_0x0182
        L_0x0177:
            r8 = r30
            if (r0 != 0) goto L_0x017c
            r1 = r3
        L_0x017c:
            int r0 = java.lang.Math.max(r13, r1)
            r13 = r0
            r0 = r8
        L_0x0182:
            int r1 = r7.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r4, (int) r11)
            int r1 = r1 + r11
            r3 = r6
            r4 = r13
            r6 = r1
            r1 = r5
            r5 = r0
            r0 = r24
        L_0x018e:
            int r6 = r6 + 1
            r8 = r33
            r9 = r34
            r11 = r22
            r13 = r23
            goto L_0x002b
        L_0x019a:
            r8 = r1
            r1 = r2
            r9 = r3
            r22 = r11
            r23 = r13
            r13 = r21
            int r2 = r7.MediaSessionCompat$Token
            if (r2 <= 0) goto L_0x01b7
            r2 = r22
            boolean r3 = r7.MediaBrowserCompat$CustomActionResultReceiver((int) r2)
            if (r3 == 0) goto L_0x01b9
            int r3 = r7.MediaSessionCompat$Token
            int r4 = r7.read
            int r3 = r3 + r4
            r7.MediaSessionCompat$Token = r3
            goto L_0x01b9
        L_0x01b7:
            r2 = r22
        L_0x01b9:
            r3 = r23
            if (r15 == 0) goto L_0x0208
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c3
            if (r3 != 0) goto L_0x0208
        L_0x01c3:
            r4 = 0
            r7.MediaSessionCompat$Token = r4
            r4 = 0
        L_0x01c7:
            if (r4 >= r2) goto L_0x0208
            android.view.View r6 = r7.MediaBrowserCompat$ItemReceiver((int) r4)
            if (r6 != 0) goto L_0x01d9
            int r6 = r7.MediaSessionCompat$Token
            int r11 = r7.read((int) r4)
            int r6 = r6 + r11
            r7.MediaSessionCompat$Token = r6
            goto L_0x0203
        L_0x01d9:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01e5
            int r6 = r7.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r6, (int) r4)
            int r4 = r4 + r6
            goto L_0x0203
        L_0x01e5:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$write r11 = (androidx.appcompat.widget.LinearLayoutCompat.write) r11
            int r14 = r7.MediaSessionCompat$Token
            int r10 = r11.topMargin
            int r11 = r11.bottomMargin
            int r6 = r7.read((android.view.View) r6)
            int r21 = r14 + r1
            int r21 = r21 + r10
            int r21 = r21 + r11
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            r7.MediaSessionCompat$Token = r6
        L_0x0203:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01c7
        L_0x0208:
            int r4 = r7.MediaSessionCompat$Token
            int r6 = r32.getPaddingTop()
            int r10 = r32.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.MediaSessionCompat$Token = r4
            int r6 = r32.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r34
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.MediaSessionCompat$Token
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x027a
            if (r9 == 0) goto L_0x0235
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 > 0) goto L_0x027a
        L_0x0235:
            int r0 = java.lang.Math.max(r13, r5)
            if (r15 == 0) goto L_0x0270
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 == r5) goto L_0x0270
            r3 = 0
        L_0x0240:
            if (r3 >= r2) goto L_0x0270
            android.view.View r5 = r7.MediaBrowserCompat$ItemReceiver((int) r3)
            if (r5 == 0) goto L_0x026d
            int r9 = r5.getVisibility()
            r11 = 8
            if (r9 == r11) goto L_0x026d
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$write r9 = (androidx.appcompat.widget.LinearLayoutCompat.write) r9
            float r9 = r9.MediaDescriptionCompat
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x026d
            int r9 = r5.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r11)
            r5.measure(r9, r13)
        L_0x026d:
            int r3 = r3 + 1
            goto L_0x0240
        L_0x0270:
            r6 = r33
            r22 = r2
            r23 = r4
            r1 = r8
            r3 = r10
            goto L_0x036d
        L_0x027a:
            float r1 = r7.MediaSessionCompat$ResultReceiverWrapper
            int r5 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0281
            r0 = r1
        L_0x0281:
            r1 = 0
            r7.MediaSessionCompat$Token = r1
            r5 = r1
        L_0x0285:
            if (r5 >= r2) goto L_0x0356
            android.view.View r11 = r7.MediaBrowserCompat$ItemReceiver((int) r5)
            int r14 = r11.getVisibility()
            r15 = 8
            if (r14 == r15) goto L_0x0345
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$write r14 = (androidx.appcompat.widget.LinearLayoutCompat.write) r14
            float r1 = r14.MediaDescriptionCompat
            int r18 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x02f4
            float r15 = (float) r9
            float r15 = r15 * r1
            float r15 = r15 / r0
            int r15 = (int) r15
            int r18 = r32.getPaddingLeft()
            int r21 = r32.getPaddingRight()
            r22 = r2
            int r2 = r14.leftMargin
            int r6 = r14.rightMargin
            r23 = r4
            int r4 = r14.width
            int r9 = r9 - r15
            int r18 = r18 + r21
            int r18 = r18 + r2
            int r2 = r18 + r6
            r6 = r33
            int r2 = getChildMeasureSpec(r6, r2, r4)
            int r4 = r14.height
            if (r4 != 0) goto L_0x02d6
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L_0x02d8
            if (r15 <= 0) goto L_0x02cd
            goto L_0x02ce
        L_0x02cd:
            r15 = 0
        L_0x02ce:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r4)
            r11.measure(r2, r15)
            goto L_0x02e8
        L_0x02d6:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x02d8:
            int r18 = r11.getMeasuredHeight()
            int r15 = r18 + r15
            if (r15 >= 0) goto L_0x02e1
            r15 = 0
        L_0x02e1:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r4)
            r11.measure(r2, r15)
        L_0x02e8:
            int r2 = r11.getMeasuredState()
            r2 = r2 & -256(0xffffffffffffff00, float:NaN)
            int r10 = android.view.View.combineMeasuredStates(r10, r2)
            float r0 = r0 - r1
            goto L_0x02fa
        L_0x02f4:
            r6 = r33
            r22 = r2
            r23 = r4
        L_0x02fa:
            int r1 = r14.leftMargin
            int r2 = r14.rightMargin
            int r1 = r1 + r2
            int r2 = r11.getMeasuredWidth()
            int r2 = r2 + r1
            int r4 = java.lang.Math.max(r8, r2)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r12 == r8) goto L_0x0314
            int r8 = r14.width
            r15 = -1
            if (r8 != r15) goto L_0x0315
            r8 = r17
            goto L_0x0316
        L_0x0314:
            r15 = -1
        L_0x0315:
            r8 = 0
        L_0x0316:
            if (r8 == 0) goto L_0x0319
            goto L_0x031a
        L_0x0319:
            r1 = r2
        L_0x031a:
            int r1 = java.lang.Math.max(r13, r1)
            if (r19 == 0) goto L_0x0327
            int r2 = r14.width
            if (r2 != r15) goto L_0x0327
            r2 = r17
            goto L_0x0328
        L_0x0327:
            r2 = 0
        L_0x0328:
            int r8 = r7.MediaSessionCompat$Token
            int r13 = r11.getMeasuredHeight()
            int r15 = r14.topMargin
            int r14 = r14.bottomMargin
            int r11 = r7.read((android.view.View) r11)
            int r13 = r13 + r8
            int r13 = r13 + r15
            int r13 = r13 + r14
            int r13 = r13 + r11
            int r8 = java.lang.Math.max(r8, r13)
            r7.MediaSessionCompat$Token = r8
            r13 = r1
            r19 = r2
            r8 = r4
            goto L_0x034b
        L_0x0345:
            r6 = r33
            r22 = r2
            r23 = r4
        L_0x034b:
            int r5 = r5 + 1
            r6 = r34
            r2 = r22
            r4 = r23
            r1 = 0
            goto L_0x0285
        L_0x0356:
            r6 = r33
            r22 = r2
            r23 = r4
            int r0 = r7.MediaSessionCompat$Token
            int r1 = r32.getPaddingTop()
            int r2 = r32.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r7.MediaSessionCompat$Token = r0
            r1 = r8
            r3 = r10
            r0 = r13
        L_0x036d:
            if (r19 != 0) goto L_0x0373
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x0374
        L_0x0373:
            r0 = r1
        L_0x0374:
            int r1 = r32.getPaddingLeft()
            int r2 = r32.getPaddingRight()
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r32.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = android.view.View.resolveSizeAndState(r0, r6, r3)
            r1 = r23
            r7.setMeasuredDimension(r0, r1)
            if (r20 == 0) goto L_0x0398
            r0 = r34
            r1 = r22
            r7.MediaBrowserCompat$ItemReceiver(r1, r0)
        L_0x0398:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.IconCompatParcelizer(int, int):void");
    }

    private void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i3);
            if (MediaBrowserCompat$ItemReceiver2.getVisibility() != 8) {
                write write2 = (write) MediaBrowserCompat$ItemReceiver2.getLayoutParams();
                if (write2.width == -1) {
                    int i4 = write2.height;
                    write2.height = MediaBrowserCompat$ItemReceiver2.getMeasuredHeight();
                    measureChildWithMargins(MediaBrowserCompat$ItemReceiver2, makeMeasureSpec, 0, i2, 0);
                    write2.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(int r38, int r39) {
        /*
            r37 = this;
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = 0
            r7.MediaSessionCompat$Token = r10
            int r11 = r37.RatingCompat()
            int r12 = android.view.View.MeasureSpec.getMode(r38)
            int r13 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r7.MediaMetadataCompat
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.MediaBrowserCompat$SearchResultReceiver
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.MediaMetadataCompat = r0
            int[] r0 = new int[r14]
            r7.MediaBrowserCompat$SearchResultReceiver = r0
        L_0x0026:
            int[] r15 = r7.MediaMetadataCompat
            int[] r6 = r7.MediaBrowserCompat$SearchResultReceiver
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.MediaBrowserCompat$CustomActionResultReceiver
            boolean r3 = r7.f9x50fd9e4a
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = r18
            goto L_0x004e
        L_0x004c:
            r19 = r10
        L_0x004e:
            r20 = 0
            r1 = r10
            r14 = r1
            r21 = r14
            r23 = r21
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r22 = r18
            r0 = r20
        L_0x0062:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x0203
            android.view.View r6 = r7.MediaBrowserCompat$ItemReceiver((int) r1)
            if (r6 != 0) goto L_0x0078
            int r5 = r7.MediaSessionCompat$Token
            int r6 = r7.read((int) r1)
            int r5 = r5 + r6
            r7.MediaSessionCompat$Token = r5
            goto L_0x0083
        L_0x0078:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x0089
            int r5 = r7.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r6, (int) r1)
            int r1 = r1 + r5
        L_0x0083:
            r32 = r3
            r36 = r4
            goto L_0x01f5
        L_0x0089:
            boolean r5 = r7.MediaBrowserCompat$CustomActionResultReceiver((int) r1)
            if (r5 == 0) goto L_0x0096
            int r5 = r7.MediaSessionCompat$Token
            int r10 = r7.RatingCompat
            int r5 = r5 + r10
            r7.MediaSessionCompat$Token = r5
        L_0x0096:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.LinearLayoutCompat$write r10 = (androidx.appcompat.widget.LinearLayoutCompat.write) r10
            float r5 = r10.MediaDescriptionCompat
            float r31 = r0 + r5
            if (r12 != r2) goto L_0x00ee
            int r0 = r10.width
            if (r0 != 0) goto L_0x00ee
            float r0 = r10.MediaDescriptionCompat
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ee
            if (r19 == 0) goto L_0x00ba
            int r0 = r7.MediaSessionCompat$Token
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            r7.MediaSessionCompat$Token = r0
            goto L_0x00c8
        L_0x00ba:
            int r0 = r7.MediaSessionCompat$Token
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
            r7.MediaSessionCompat$Token = r0
        L_0x00c8:
            if (r4 == 0) goto L_0x00df
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r1 = r26
            r30 = -2
            goto L_0x016d
        L_0x00df:
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r25 = r18
            r2 = 1073741824(0x40000000, float:2.0)
            r30 = -2
            goto L_0x0171
        L_0x00ee:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00fd
            float r0 = r10.MediaDescriptionCompat
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fd
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x0100
        L_0x00fd:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0100:
            int r0 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0109
            int r0 = r7.MediaSessionCompat$Token
            r29 = r0
            goto L_0x010b
        L_0x0109:
            r29 = 0
        L_0x010b:
            r33 = 0
            r0 = r37
            r34 = r1
            r1 = r6
            r35 = r2
            r2 = r34
            r32 = r3
            r3 = r38
            r36 = r4
            r4 = r29
            r29 = r5
            r9 = -1
            r5 = r39
            r30 = r29
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = r6
            r6 = r33
            r0.MediaBrowserCompat$ItemReceiver(r1, r2, r3, r4, r5, r6)
            r0 = r35
            if (r0 == r9) goto L_0x0134
            r10.width = r0
        L_0x0134:
            int r0 = r29.getMeasuredWidth()
            if (r19 == 0) goto L_0x014d
            int r1 = r7.MediaSessionCompat$Token
            int r2 = r10.leftMargin
            int r3 = r10.rightMargin
            int r2 = r2 + r0
            int r2 = r2 + r3
            r3 = r29
            int r4 = r7.read((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            r7.MediaSessionCompat$Token = r1
            goto L_0x0164
        L_0x014d:
            r3 = r29
            int r1 = r7.MediaSessionCompat$Token
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r5 = r7.read((android.view.View) r3)
            int r6 = r1 + r0
            int r6 = r6 + r2
            int r6 = r6 + r4
            int r6 = r6 + r5
            int r1 = java.lang.Math.max(r1, r6)
            r7.MediaSessionCompat$Token = r1
        L_0x0164:
            r1 = r26
            if (r32 == 0) goto L_0x016d
            int r26 = java.lang.Math.max(r0, r1)
            goto L_0x016f
        L_0x016d:
            r26 = r1
        L_0x016f:
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0171:
            if (r13 == r2) goto L_0x017d
            int r0 = r10.height
            r1 = -1
            if (r0 != r1) goto L_0x017d
            r0 = r18
            r27 = r0
            goto L_0x017e
        L_0x017d:
            r0 = 0
        L_0x017e:
            int r1 = r10.topMargin
            int r4 = r10.bottomMargin
            int r1 = r1 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r1
            int r5 = r3.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r5)
            if (r36 == 0) goto L_0x01bc
            int r5 = r3.getBaseline()
            r6 = -1
            if (r5 == r6) goto L_0x01bc
            int r6 = r10.RatingCompat
            if (r6 >= 0) goto L_0x01a0
            int r6 = r7.MediaDescriptionCompat
            goto L_0x01a2
        L_0x01a0:
            int r6 = r10.RatingCompat
        L_0x01a2:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = 4
            int r6 = r6 >> r9
            r6 = r6 & -2
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r28[r6]
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r28[r6] = r5
        L_0x01bc:
            r6 = r21
            int r21 = java.lang.Math.max(r6, r4)
            if (r22 == 0) goto L_0x01cc
            int r5 = r10.height
            r6 = -1
            if (r5 != r6) goto L_0x01cc
            r22 = r18
            goto L_0x01ce
        L_0x01cc:
            r22 = 0
        L_0x01ce:
            float r5 = r10.MediaDescriptionCompat
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x01de
            if (r0 != 0) goto L_0x01d7
            r1 = r4
        L_0x01d7:
            r10 = r24
            int r24 = java.lang.Math.max(r10, r1)
            goto L_0x01eb
        L_0x01de:
            r10 = r24
            if (r0 != 0) goto L_0x01e3
            r1 = r4
        L_0x01e3:
            r4 = r23
            int r23 = java.lang.Math.max(r4, r1)
            r24 = r10
        L_0x01eb:
            r10 = r34
            int r0 = r7.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r3, (int) r10)
            int r1 = r0 + r10
            r0 = r31
        L_0x01f5:
            int r1 = r1 + 1
            r9 = r39
            r6 = r28
            r3 = r32
            r4 = r36
            r5 = -1
            r10 = 0
            goto L_0x0062
        L_0x0203:
            r32 = r3
            r36 = r4
            r6 = r21
            r4 = r23
            r10 = r24
            r1 = r26
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            int r3 = r7.MediaSessionCompat$Token
            if (r3 <= 0) goto L_0x0224
            boolean r3 = r7.MediaBrowserCompat$CustomActionResultReceiver((int) r11)
            if (r3 == 0) goto L_0x0224
            int r3 = r7.MediaSessionCompat$Token
            int r2 = r7.RatingCompat
            int r3 = r3 + r2
            r7.MediaSessionCompat$Token = r3
        L_0x0224:
            r2 = r15[r18]
            r3 = -1
            if (r2 != r3) goto L_0x023b
            r2 = 0
            r5 = r15[r2]
            if (r5 != r3) goto L_0x023b
            r2 = r15[r17]
            if (r2 != r3) goto L_0x023b
            r2 = r15[r16]
            if (r2 == r3) goto L_0x0237
            goto L_0x023b
        L_0x0237:
            r2 = r6
            r24 = r14
            goto L_0x026c
        L_0x023b:
            r2 = r15[r16]
            r3 = 0
            r5 = r15[r3]
            r9 = r15[r18]
            r3 = r15[r17]
            int r3 = java.lang.Math.max(r9, r3)
            int r3 = java.lang.Math.max(r5, r3)
            int r2 = java.lang.Math.max(r2, r3)
            r3 = r28[r16]
            r5 = 0
            r9 = r28[r5]
            r5 = r28[r18]
            r24 = r14
            r14 = r28[r17]
            int r5 = java.lang.Math.max(r5, r14)
            int r5 = java.lang.Math.max(r9, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r2 = r2 + r3
            int r2 = java.lang.Math.max(r6, r2)
        L_0x026c:
            if (r32 == 0) goto L_0x02cc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r3) goto L_0x0274
            if (r12 != 0) goto L_0x02cc
        L_0x0274:
            r3 = 0
            r7.MediaSessionCompat$Token = r3
            r3 = 0
        L_0x0278:
            if (r3 >= r11) goto L_0x02cc
            android.view.View r5 = r7.MediaBrowserCompat$ItemReceiver((int) r3)
            if (r5 != 0) goto L_0x028a
            int r5 = r7.MediaSessionCompat$Token
            int r6 = r7.read((int) r3)
            int r5 = r5 + r6
            r7.MediaSessionCompat$Token = r5
            goto L_0x02c9
        L_0x028a:
            int r6 = r5.getVisibility()
            r9 = 8
            if (r6 != r9) goto L_0x0298
            int r5 = r7.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r5, (int) r3)
            int r3 = r3 + r5
            goto L_0x02c9
        L_0x0298:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$write r6 = (androidx.appcompat.widget.LinearLayoutCompat.write) r6
            if (r19 == 0) goto L_0x02b1
            int r9 = r7.MediaSessionCompat$Token
            int r14 = r6.leftMargin
            int r6 = r6.rightMargin
            int r14 = r14 + r1
            int r14 = r14 + r6
            int r5 = r7.read((android.view.View) r5)
            int r14 = r14 + r5
            int r9 = r9 + r14
            r7.MediaSessionCompat$Token = r9
            goto L_0x02c9
        L_0x02b1:
            int r9 = r7.MediaSessionCompat$Token
            int r14 = r6.leftMargin
            int r6 = r6.rightMargin
            int r5 = r7.read((android.view.View) r5)
            int r26 = r9 + r1
            int r26 = r26 + r14
            int r26 = r26 + r6
            int r5 = r26 + r5
            int r5 = java.lang.Math.max(r9, r5)
            r7.MediaSessionCompat$Token = r5
        L_0x02c9:
            int r3 = r3 + 1
            goto L_0x0278
        L_0x02cc:
            int r3 = r7.MediaSessionCompat$Token
            int r5 = r37.getPaddingLeft()
            int r6 = r37.getPaddingRight()
            int r5 = r5 + r6
            int r3 = r3 + r5
            r7.MediaSessionCompat$Token = r3
            int r5 = r37.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r3, r5)
            r5 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r8, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r3
            int r6 = r7.MediaSessionCompat$Token
            int r5 = r5 - r6
            if (r25 != 0) goto L_0x033b
            if (r5 == 0) goto L_0x02f6
            int r9 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r9 > 0) goto L_0x033b
        L_0x02f6:
            int r0 = java.lang.Math.max(r4, r10)
            if (r32 == 0) goto L_0x0331
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x0331
            r10 = 0
        L_0x0301:
            if (r10 >= r11) goto L_0x0331
            android.view.View r4 = r7.MediaBrowserCompat$ItemReceiver((int) r10)
            if (r4 == 0) goto L_0x032e
            int r5 = r4.getVisibility()
            r9 = 8
            if (r5 == r9) goto L_0x032e
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$write r5 = (androidx.appcompat.widget.LinearLayoutCompat.write) r5
            float r5 = r5.MediaDescriptionCompat
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x032e
            r5 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r12 = r4.getMeasuredHeight()
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r5)
            r4.measure(r9, r12)
        L_0x032e:
            int r10 = r10 + 1
            goto L_0x0301
        L_0x0331:
            r29 = r3
            r26 = r11
            r14 = r24
            r11 = r39
            goto L_0x04da
        L_0x033b:
            float r1 = r7.MediaSessionCompat$ResultReceiverWrapper
            int r2 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r2 <= 0) goto L_0x0342
            r0 = r1
        L_0x0342:
            r1 = -1
            r15[r16] = r1
            r15[r17] = r1
            r15[r18] = r1
            r2 = 0
            r15[r2] = r1
            r28[r16] = r1
            r28[r17] = r1
            r28[r18] = r1
            r28[r2] = r1
            r7.MediaSessionCompat$Token = r2
            r2 = r1
            r14 = r24
            r9 = 0
        L_0x035a:
            if (r9 >= r11) goto L_0x0481
            android.view.View r10 = r7.MediaBrowserCompat$ItemReceiver((int) r9)
            if (r10 == 0) goto L_0x0469
            int r1 = r10.getVisibility()
            r6 = 8
            if (r1 == r6) goto L_0x0469
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$write r1 = (androidx.appcompat.widget.LinearLayoutCompat.write) r1
            float r6 = r1.MediaDescriptionCompat
            int r24 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r24 <= 0) goto L_0x03d1
            float r8 = (float) r5
            float r8 = r8 * r6
            float r8 = r8 / r0
            int r8 = (int) r8
            int r24 = r37.getPaddingTop()
            int r25 = r37.getPaddingBottom()
            r26 = r11
            int r11 = r1.topMargin
            r29 = r3
            int r3 = r1.bottomMargin
            r31 = r9
            int r9 = r1.height
            int r24 = r24 + r25
            int r24 = r24 + r11
            int r3 = r24 + r3
            r11 = r39
            r24 = r15
            r15 = -1
            int r3 = getChildMeasureSpec(r11, r3, r9)
            int r9 = r1.width
            if (r9 != 0) goto L_0x03b2
            r9 = 1073741824(0x40000000, float:2.0)
            if (r12 != r9) goto L_0x03b4
            if (r8 <= 0) goto L_0x03a9
            r15 = r8
            goto L_0x03aa
        L_0x03a9:
            r15 = 0
        L_0x03aa:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r9)
            r10.measure(r15, r3)
            goto L_0x03c3
        L_0x03b2:
            r9 = 1073741824(0x40000000, float:2.0)
        L_0x03b4:
            int r15 = r10.getMeasuredWidth()
            int r15 = r15 + r8
            if (r15 >= 0) goto L_0x03bc
            r15 = 0
        L_0x03bc:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r9)
            r10.measure(r15, r3)
        L_0x03c3:
            int r3 = r10.getMeasuredState()
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 & r9
            int r14 = android.view.View.combineMeasuredStates(r14, r3)
            float r0 = r0 - r6
            int r5 = r5 - r8
            goto L_0x03db
        L_0x03d1:
            r29 = r3
            r31 = r9
            r26 = r11
            r24 = r15
            r11 = r39
        L_0x03db:
            if (r19 == 0) goto L_0x03f2
            int r3 = r7.MediaSessionCompat$Token
            int r6 = r10.getMeasuredWidth()
            int r8 = r1.leftMargin
            int r9 = r1.rightMargin
            int r6 = r6 + r8
            int r6 = r6 + r9
            int r8 = r7.read((android.view.View) r10)
            int r6 = r6 + r8
            int r3 = r3 + r6
            r7.MediaSessionCompat$Token = r3
            goto L_0x040a
        L_0x03f2:
            int r3 = r7.MediaSessionCompat$Token
            int r6 = r10.getMeasuredWidth()
            int r8 = r1.leftMargin
            int r9 = r1.rightMargin
            int r15 = r7.read((android.view.View) r10)
            int r6 = r6 + r3
            int r6 = r6 + r8
            int r6 = r6 + r9
            int r6 = r6 + r15
            int r3 = java.lang.Math.max(r3, r6)
            r7.MediaSessionCompat$Token = r3
        L_0x040a:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r13 == r3) goto L_0x0416
            int r3 = r1.height
            r6 = -1
            if (r3 != r6) goto L_0x0416
            r3 = r18
            goto L_0x0417
        L_0x0416:
            r3 = 0
        L_0x0417:
            int r6 = r1.topMargin
            int r8 = r1.bottomMargin
            int r6 = r6 + r8
            int r8 = r10.getMeasuredHeight()
            int r8 = r8 + r6
            int r2 = java.lang.Math.max(r2, r8)
            if (r3 == 0) goto L_0x0428
            goto L_0x0429
        L_0x0428:
            r6 = r8
        L_0x0429:
            int r3 = java.lang.Math.max(r4, r6)
            if (r22 == 0) goto L_0x0437
            int r4 = r1.height
            r6 = -1
            if (r4 != r6) goto L_0x0438
            r4 = r18
            goto L_0x0439
        L_0x0437:
            r6 = -1
        L_0x0438:
            r4 = 0
        L_0x0439:
            if (r36 == 0) goto L_0x0464
            int r9 = r10.getBaseline()
            if (r9 == r6) goto L_0x0464
            int r6 = r1.RatingCompat
            if (r6 >= 0) goto L_0x0448
            int r1 = r7.MediaDescriptionCompat
            goto L_0x044a
        L_0x0448:
            int r1 = r1.RatingCompat
        L_0x044a:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r6 = 4
            int r1 = r1 >> r6
            r1 = r1 & -2
            int r1 = r1 >> 1
            r10 = r24[r1]
            int r10 = java.lang.Math.max(r10, r9)
            r24[r1] = r10
            r10 = r28[r1]
            int r8 = r8 - r9
            int r8 = java.lang.Math.max(r10, r8)
            r28[r1] = r8
            goto L_0x0465
        L_0x0464:
            r6 = 4
        L_0x0465:
            r22 = r4
            r4 = r3
            goto L_0x0474
        L_0x0469:
            r29 = r3
            r31 = r9
            r26 = r11
            r24 = r15
            r6 = 4
            r11 = r39
        L_0x0474:
            int r9 = r31 + 1
            r8 = r38
            r15 = r24
            r11 = r26
            r3 = r29
            r1 = -1
            goto L_0x035a
        L_0x0481:
            r29 = r3
            r26 = r11
            r24 = r15
            r11 = r39
            int r0 = r7.MediaSessionCompat$Token
            int r1 = r37.getPaddingLeft()
            int r3 = r37.getPaddingRight()
            int r1 = r1 + r3
            int r0 = r0 + r1
            r7.MediaSessionCompat$Token = r0
            r0 = r24[r18]
            r1 = -1
            if (r0 != r1) goto L_0x04aa
            r0 = 0
            r3 = r24[r0]
            if (r3 != r1) goto L_0x04aa
            r0 = r24[r17]
            if (r0 != r1) goto L_0x04aa
            r0 = r24[r16]
            if (r0 != r1) goto L_0x04aa
            goto L_0x04d9
        L_0x04aa:
            r0 = r24[r16]
            r1 = 0
            r3 = r24[r1]
            r5 = r24[r18]
            r6 = r24[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r3 = java.lang.Math.max(r3, r5)
            int r0 = java.lang.Math.max(r0, r3)
            r3 = r28[r16]
            r1 = r28[r1]
            r5 = r28[r18]
            r6 = r28[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r1 = java.lang.Math.max(r1, r5)
            int r1 = java.lang.Math.max(r3, r1)
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r2, r0)
            r2 = r0
        L_0x04d9:
            r0 = r4
        L_0x04da:
            if (r22 != 0) goto L_0x04e0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x04e1
        L_0x04e0:
            r0 = r2
        L_0x04e1:
            int r1 = r37.getPaddingTop()
            int r2 = r37.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r14 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r14
            r1 = r29 | r1
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L_0x050a
            r0 = r38
            r1 = r26
            r7.MediaBrowserCompat$CustomActionResultReceiver((int) r1, (int) r0)
        L_0x050a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.write(int, int):void");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i3);
            if (MediaBrowserCompat$ItemReceiver2.getVisibility() != 8) {
                write write2 = (write) MediaBrowserCompat$ItemReceiver2.getLayoutParams();
                if (write2.height == -1) {
                    int i4 = write2.width;
                    write2.width = MediaBrowserCompat$ItemReceiver2.getMeasuredWidth();
                    measureChildWithMargins(MediaBrowserCompat$ItemReceiver2, i2, 0, makeMeasureSpec, 0);
                    write2.width = i4;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.ParcelableVolumeInfo == 1) {
            MediaBrowserCompat$ItemReceiver(i, i2, i3, i4);
        } else {
            write(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void MediaBrowserCompat$ItemReceiver(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            int r7 = r18.getPaddingLeft()
            int r8 = r21 - r19
            int r9 = r18.getPaddingRight()
            int r10 = r18.getPaddingRight()
            int r11 = r18.RatingCompat()
            int r12 = r6.MediaDescriptionCompat
            r0 = r12 & 112(0x70, float:1.57E-43)
            r1 = 16
            if (r0 == r1) goto L_0x0031
            r1 = 80
            if (r0 == r1) goto L_0x0025
            int r0 = r18.getPaddingTop()
            goto L_0x003d
        L_0x0025:
            int r0 = r18.getPaddingTop()
            int r0 = r0 + r22
            int r0 = r0 - r20
            int r1 = r6.MediaSessionCompat$Token
            int r0 = r0 - r1
            goto L_0x003d
        L_0x0031:
            int r0 = r18.getPaddingTop()
            int r1 = r22 - r20
            int r2 = r6.MediaSessionCompat$Token
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x003d:
            r1 = 0
            r13 = r1
        L_0x003f:
            if (r13 >= r11) goto L_0x00c8
            android.view.View r14 = r6.MediaBrowserCompat$ItemReceiver((int) r13)
            r15 = 1
            if (r14 != 0) goto L_0x004f
            int r1 = r6.read((int) r13)
            int r0 = r0 + r1
            goto L_0x00c4
        L_0x004f:
            int r1 = r14.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x00c4
            int r4 = r14.getMeasuredWidth()
            int r16 = r14.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat$write r5 = (androidx.appcompat.widget.LinearLayoutCompat.write) r5
            int r1 = r5.RatingCompat
            if (r1 >= 0) goto L_0x006e
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r12
        L_0x006e:
            int r2 = p040o.SwitchCompat.m3079x50fd9e4a(r18)
            int r1 = p040o.setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)
            r1 = r1 & 7
            if (r1 == r15) goto L_0x0087
            r2 = 5
            if (r1 == r2) goto L_0x0081
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L_0x0094
        L_0x0081:
            int r1 = r8 - r9
            int r1 = r1 - r4
            int r2 = r5.rightMargin
            goto L_0x0093
        L_0x0087:
            int r1 = r8 - r7
            int r1 = r1 - r10
            int r1 = r1 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L_0x0093:
            int r1 = r1 - r2
        L_0x0094:
            r2 = r1
            boolean r1 = r6.MediaBrowserCompat$CustomActionResultReceiver((int) r13)
            if (r1 == 0) goto L_0x009e
            int r1 = r6.read
            int r0 = r0 + r1
        L_0x009e:
            int r1 = r5.topMargin
            int r17 = r0 + r1
            int r0 = r6.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r14)
            int r3 = r17 + r0
            r0 = r18
            r1 = r14
            r15 = r5
            r5 = r16
            r0.read(r1, r2, r3, r4, r5)
            int r0 = r15.bottomMargin
            int r1 = r6.read((android.view.View) r14)
            int r2 = r6.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r14, (int) r13)
            int r13 = r13 + r2
            int r16 = r16 + r0
            int r16 = r16 + r1
            int r17 = r17 + r16
            r0 = r17
        L_0x00c4:
            r1 = 1
            int r13 = r13 + r1
            goto L_0x003f
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.MediaBrowserCompat$ItemReceiver(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(int r26, int r27, int r28, int r29) {
        /*
            r25 = this;
            r6 = r25
            boolean r0 = p040o.setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(r25)
            int r7 = r25.getPaddingTop()
            int r8 = r29 - r27
            int r9 = r25.getPaddingBottom()
            int r10 = r25.getPaddingBottom()
            int r11 = r25.RatingCompat()
            int r1 = r6.MediaDescriptionCompat
            r12 = r1 & 112(0x70, float:1.57E-43)
            boolean r13 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int[] r14 = r6.MediaMetadataCompat
            int[] r15 = r6.MediaBrowserCompat$SearchResultReceiver
            int r2 = p040o.SwitchCompat.m3079x50fd9e4a(r25)
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r3
            int r1 = p040o.setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)
            r16 = 2
            r5 = 1
            if (r1 == r5) goto L_0x0047
            r2 = 5
            if (r1 == r2) goto L_0x003b
            int r1 = r25.getPaddingLeft()
            goto L_0x0053
        L_0x003b:
            int r1 = r25.getPaddingLeft()
            int r1 = r1 + r28
            int r1 = r1 - r26
            int r2 = r6.MediaSessionCompat$Token
            int r1 = r1 - r2
            goto L_0x0053
        L_0x0047:
            int r1 = r25.getPaddingLeft()
            int r2 = r28 - r26
            int r3 = r6.MediaSessionCompat$Token
            int r2 = r2 - r3
            int r2 = r2 / 2
            int r1 = r1 + r2
        L_0x0053:
            r2 = 0
            if (r0 == 0) goto L_0x005d
            int r0 = r11 + -1
            r17 = r0
            r18 = -1
            goto L_0x0061
        L_0x005d:
            r17 = r2
            r18 = r5
        L_0x0061:
            r3 = r2
        L_0x0062:
            if (r3 >= r11) goto L_0x0147
            int r0 = r18 * r3
            int r2 = r17 + r0
            android.view.View r0 = r6.MediaBrowserCompat$ItemReceiver((int) r2)
            if (r0 != 0) goto L_0x007d
            int r0 = r6.read((int) r2)
            int r1 = r1 + r0
            r21 = r5
            r23 = r7
            r29 = r11
            r20 = r12
            goto L_0x0139
        L_0x007d:
            int r5 = r0.getVisibility()
            r4 = 8
            if (r5 == r4) goto L_0x012f
            int r19 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$write r4 = (androidx.appcompat.widget.LinearLayoutCompat.write) r4
            r28 = r3
            if (r13 == 0) goto L_0x00a3
            int r3 = r4.height
            r29 = r11
            r11 = -1
            if (r3 == r11) goto L_0x00a5
            int r11 = r0.getBaseline()
            goto L_0x00a6
        L_0x00a3:
            r29 = r11
        L_0x00a5:
            r11 = -1
        L_0x00a6:
            int r3 = r4.RatingCompat
            if (r3 >= 0) goto L_0x00ab
            r3 = r12
        L_0x00ab:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r20 = r12
            r12 = 16
            if (r3 == r12) goto L_0x00e5
            r12 = 48
            if (r3 == r12) goto L_0x00d6
            r12 = 80
            if (r3 == r12) goto L_0x00c0
            r3 = r7
            r12 = -1
        L_0x00bd:
            r21 = 1
            goto L_0x00f5
        L_0x00c0:
            int r3 = r8 - r9
            int r3 = r3 - r5
            int r12 = r4.bottomMargin
            int r3 = r3 - r12
            r12 = -1
            if (r11 == r12) goto L_0x00bd
            int r21 = r0.getMeasuredHeight()
            r22 = r15[r16]
            int r21 = r21 - r11
            int r22 = r22 - r21
            int r3 = r3 - r22
            goto L_0x00bd
        L_0x00d6:
            r12 = -1
            int r3 = r4.topMargin
            int r3 = r3 + r7
            if (r11 == r12) goto L_0x00bd
            r21 = 1
            r22 = r14[r21]
            int r22 = r22 - r11
            int r3 = r3 + r22
            goto L_0x00f5
        L_0x00e5:
            r12 = -1
            r21 = 1
            int r3 = r8 - r7
            int r3 = r3 - r10
            int r3 = r3 - r5
            int r3 = r3 / 2
            int r3 = r3 + r7
            int r11 = r4.topMargin
            int r3 = r3 + r11
            int r11 = r4.bottomMargin
            int r3 = r3 - r11
        L_0x00f5:
            boolean r11 = r6.MediaBrowserCompat$CustomActionResultReceiver((int) r2)
            if (r11 == 0) goto L_0x00fe
            int r11 = r6.RatingCompat
            int r1 = r1 + r11
        L_0x00fe:
            int r11 = r4.leftMargin
            int r11 = r11 + r1
            int r1 = r6.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r0)
            int r22 = r11 + r1
            r1 = r0
            r0 = r25
            r26 = r1
            r12 = r2
            r2 = r22
            r22 = r28
            r23 = r7
            r24 = -1
            r7 = r4
            r4 = r19
            r0.read(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r2 = r6.read((android.view.View) r1)
            int r1 = r6.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r1, (int) r12)
            int r3 = r22 + r1
            int r19 = r19 + r0
            int r19 = r19 + r2
            int r11 = r11 + r19
            r1 = r11
            goto L_0x013b
        L_0x012f:
            r22 = r3
            r23 = r7
            r29 = r11
            r20 = r12
            r21 = 1
        L_0x0139:
            r24 = -1
        L_0x013b:
            int r3 = r3 + 1
            r11 = r29
            r12 = r20
            r5 = r21
            r7 = r23
            goto L_0x0062
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.write(int, int, int, int):void");
    }

    private void read(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.ParcelableVolumeInfo != i) {
            this.ParcelableVolumeInfo = i;
            requestLayout();
        }
    }

    public void setGravity(int i) {
        if (this.MediaDescriptionCompat != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.MediaDescriptionCompat = i;
            requestLayout();
        }
    }

    public int MediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.MediaDescriptionCompat;
        if ((8388615 & i3) != i2) {
            this.MediaDescriptionCompat = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.MediaDescriptionCompat;
        if ((i3 & 112) != i2) {
            this.MediaDescriptionCompat = i2 | (i3 & -113);
            requestLayout();
        }
    }

    /* renamed from: MediaBrowserCompat$ItemReceiver */
    public write generateLayoutParams(AttributeSet attributeSet) {
        return new write(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j_ */
    public write generateDefaultLayoutParams() {
        int i = this.ParcelableVolumeInfo;
        if (i == 0) {
            return new write(-2, -2);
        }
        if (i == 1) {
            return new write(-1, -2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaBrowserCompat$ItemReceiver */
    public write generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new write(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof write;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    public static class write extends ViewGroup.MarginLayoutParams {
        public float MediaDescriptionCompat;
        public int RatingCompat;

        public write(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.RatingCompat = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat_Layout);
            this.MediaDescriptionCompat = obtainStyledAttributes.getFloat(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat_Layout_android_layout_weight, BitmapDescriptorFactory.HUE_RED);
            this.RatingCompat = obtainStyledAttributes.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public write(int i, int i2) {
            super(i, i2);
            this.RatingCompat = -1;
            this.MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
        }

        public write(int i, int i2, float f) {
            super(i, i2);
            this.RatingCompat = -1;
            this.MediaDescriptionCompat = f;
        }

        public write(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.RatingCompat = -1;
        }
    }
}

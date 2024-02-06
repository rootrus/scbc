package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import p040o.SwitchCompat;
import p040o.setMinWidth;
import p040o.setTextOn;

public class GridLayoutManager extends LinearLayoutManager {
    private View[] ActionMenuItemView;
    final SparseIntArray IconCompatParcelizer = new SparseIntArray();
    public GridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();
    final Rect MediaBrowserCompat$ItemReceiver = new Rect();
    final SparseIntArray read = new SparseIntArray();
    private int[] setCheckable;
    private boolean setExpandedFormat = false;
    public int write = -1;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ParcelableVolumeInfo(write(context, attributeSet, i, i2).write);
    }

    public GridLayoutManager(Context context, int i) {
        ParcelableVolumeInfo(i);
    }

    public GridLayoutManager(int i, int i2, boolean z) {
        super(1, false);
        ParcelableVolumeInfo(3);
    }

    public final void IconCompatParcelizer(boolean z) {
        if (!z) {
            super.IconCompatParcelizer(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int MediaBrowserCompat$ItemReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        if (this.MediaMetadataCompat == 0) {
            return this.write;
        }
        if ((keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem) <= 0) {
            return 0;
        }
        return IconCompatParcelizer(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep, (keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem) - 1) + 1;
    }

    public final int IconCompatParcelizer(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        if (this.MediaMetadataCompat == 1) {
            return this.write;
        }
        if ((keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem) <= 0) {
            return 0;
        }
        return IconCompatParcelizer(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep, (keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem) - 1) + 1;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, View view, setTextOn settexton) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof GridLayoutManager$MediaBrowserCompat$ItemReceiver)) {
            super.read(view, settexton);
            return;
        }
        GridLayoutManager$MediaBrowserCompat$ItemReceiver gridLayoutManager$MediaBrowserCompat$ItemReceiver = (GridLayoutManager$MediaBrowserCompat$ItemReceiver) layoutParams;
        RecyclerView.setContentView setcontentview = gridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
        int i = setcontentview.ParcelableVolumeInfo;
        if (i == -1) {
            i = setcontentview.MediaSessionCompat$QueueItem;
        }
        int IconCompatParcelizer2 = IconCompatParcelizer(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep, i);
        if (this.MediaMetadataCompat == 0) {
            settexton.MediaBrowserCompat$CustomActionResultReceiver((Object) setTextOn.IconCompatParcelizer.write(gridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, gridLayoutManager$MediaBrowserCompat$ItemReceiver.write, IconCompatParcelizer2, 1, this.write > 1 && gridLayoutManager$MediaBrowserCompat$ItemReceiver.write == this.write, false));
        } else {
            settexton.MediaBrowserCompat$CustomActionResultReceiver((Object) setTextOn.IconCompatParcelizer.write(IconCompatParcelizer2, 1, gridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, gridLayoutManager$MediaBrowserCompat$ItemReceiver.write, this.write > 1 && gridLayoutManager$MediaBrowserCompat$ItemReceiver.write == this.write, false));
        }
    }

    public final void read(RecyclerView.Keep keep) {
        super.read(keep);
        this.setExpandedFormat = false;
    }

    public final void write(RecyclerView recyclerView, int i, int i2) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read.clear();
    }

    /* renamed from: p_ */
    public final void mo1406p_() {
        this.MediaBrowserCompat$CustomActionResultReceiver.read.clear();
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView, int i, int i2) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read.clear();
    }

    public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read.clear();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView, int i, int i2, int i3) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read.clear();
    }

    public final RecyclerView.MediaDescriptionCompat MediaBrowserCompat$ItemReceiver() {
        if (this.MediaMetadataCompat == 0) {
            return new GridLayoutManager$MediaBrowserCompat$ItemReceiver(-2, -1);
        }
        return new GridLayoutManager$MediaBrowserCompat$ItemReceiver(-1, -2);
    }

    public final RecyclerView.MediaDescriptionCompat IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new GridLayoutManager$MediaBrowserCompat$ItemReceiver(context, attributeSet);
    }

    public final RecyclerView.MediaDescriptionCompat MediaBrowserCompat$CustomActionResultReceiver(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new GridLayoutManager$MediaBrowserCompat$ItemReceiver((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new GridLayoutManager$MediaBrowserCompat$ItemReceiver(layoutParams);
    }

    public final boolean write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
        return mediaDescriptionCompat instanceof GridLayoutManager$MediaBrowserCompat$ItemReceiver;
    }

    public final void read(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.setCheckable == null) {
            super.read(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.MediaMetadataCompat == 1) {
            i4 = IconCompatParcelizer(i2, rect.height() + paddingTop, SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(this.setHasDecor));
            int[] iArr = this.setCheckable;
            i3 = IconCompatParcelizer(i, iArr[iArr.length - 1] + paddingLeft, SwitchCompat.MediaSessionCompat$Token(this.setHasDecor));
        } else {
            i3 = IconCompatParcelizer(i, rect.width() + paddingLeft, SwitchCompat.MediaSessionCompat$Token(this.setHasDecor));
            int[] iArr2 = this.setCheckable;
            i4 = IconCompatParcelizer(i2, iArr2[iArr2.length - 1] + paddingTop, SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(this.setHasDecor));
        }
        this.setHasDecor.setMeasuredDimension(i3, i4);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private void m10x50fd9e4a(int i) {
        int i2;
        int[] iArr = this.setCheckable;
        int i3 = this.write;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.setCheckable = iArr;
    }

    private int MediaBrowserCompat$ItemReceiver(int i, int i2) {
        boolean z = true;
        if (this.MediaMetadataCompat == 1) {
            if (SwitchCompat.m3079x50fd9e4a(this.setHasDecor) != 1) {
                z = false;
            }
            if (z) {
                int[] iArr = this.setCheckable;
                int i3 = this.write - i;
                return iArr[i3] - iArr[i3 - i2];
            }
        }
        int[] iArr2 = this.setCheckable;
        return iArr2[i2 + i] - iArr2[i];
    }

    /* access modifiers changed from: package-private */
    public final void read(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, LinearLayoutManager.IconCompatParcelizer iconCompatParcelizer, int i) {
        int read2;
        super.read(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep, iconCompatParcelizer, i);
        PlaybackStateCompat();
        if ((keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem) > 0 && !keep.MediaBrowserCompat$ItemReceiver) {
            boolean z = i == 1;
            int read3 = read(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep, iconCompatParcelizer.write);
            if (z) {
                while (read3 > 0 && iconCompatParcelizer.write > 0) {
                    iconCompatParcelizer.write--;
                    read3 = read(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep, iconCompatParcelizer.write);
                }
            } else {
                int i2 = keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem;
                int i3 = iconCompatParcelizer.write;
                while (i3 < i2 - 1 && (read2 = read(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep, r3)) > read3) {
                    i3++;
                    read3 = read2;
                }
                iconCompatParcelizer.write = i3;
            }
        }
        View[] viewArr = this.ActionMenuItemView;
        if (viewArr == null || viewArr.length != this.write) {
            this.ActionMenuItemView = new View[this.write];
        }
    }

    public final int write(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        PlaybackStateCompat();
        View[] viewArr = this.ActionMenuItemView;
        if (viewArr == null || viewArr.length != this.write) {
            this.ActionMenuItemView = new View[this.write];
        }
        return super.write(i, recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        PlaybackStateCompat();
        View[] viewArr = this.ActionMenuItemView;
        if (viewArr == null || viewArr.length != this.write) {
            this.ActionMenuItemView = new View[this.write];
        }
        return super.MediaBrowserCompat$CustomActionResultReceiver(i, recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep);
    }

    /* access modifiers changed from: package-private */
    public final View MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, int i, int i2, int i3) {
        MediaBrowserCompat$MediaItem();
        int MediaDescriptionCompat = this.RatingCompat.MediaDescriptionCompat();
        int MediaBrowserCompat$ItemReceiver2 = this.RatingCompat.MediaBrowserCompat$ItemReceiver();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View MediaDescriptionCompat2 = MediaDescriptionCompat(i);
            RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat2.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            int i5 = setcontentview.ParcelableVolumeInfo;
            if (i5 == -1) {
                i5 = setcontentview.MediaSessionCompat$QueueItem;
            }
            if (i5 >= 0 && i5 < i3 && read(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep, i5) == 0) {
                if ((((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat2.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver.read & 8) != 0) {
                    if (view2 == null) {
                        view2 = MediaDescriptionCompat2;
                    }
                } else if (this.RatingCompat.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat2) < MediaBrowserCompat$ItemReceiver2 && this.RatingCompat.IconCompatParcelizer(MediaDescriptionCompat2) >= MediaDescriptionCompat) {
                    return MediaDescriptionCompat2;
                } else {
                    if (view == null) {
                        view = MediaDescriptionCompat2;
                    }
                }
            }
            i += i4;
        }
        return view == null ? view2 : view;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.Keep keep, LinearLayoutManager.write write2, RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer iconCompatParcelizer) {
        boolean z;
        int i = this.write;
        int i2 = 0;
        while (i2 < this.write) {
            int i3 = write2.read;
            if (i3 >= 0) {
                if (i3 < (keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem)) {
                    z = true;
                    if (z && i > 0) {
                        int i4 = write2.read;
                        iconCompatParcelizer.read(i4, Math.max(0, write2.f22x50fd9e4a));
                        i -= this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(i4);
                        write2.read += write2.MediaBrowserCompat$CustomActionResultReceiver;
                        i2++;
                    } else {
                        return;
                    }
                }
            }
            z = false;
            if (z) {
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x008d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r18, androidx.recyclerview.widget.RecyclerView.Keep r19, androidx.recyclerview.widget.LinearLayoutManager.write r20, androidx.recyclerview.widget.LinearLayoutManager.read r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            o.setContentId r5 = r0.RatingCompat
            int r5 = r5.MediaBrowserCompat$MediaItem()
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = 1
            r8 = 0
            if (r5 == r6) goto L_0x0018
            r9 = r7
            goto L_0x0019
        L_0x0018:
            r9 = r8
        L_0x0019:
            o.setMinWidth r10 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r10 == 0) goto L_0x002b
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r11 = r10.read
            int r11 = r11.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r10 = r10.MediaBrowserCompat$ItemReceiver
            int r10 = r10.size()
            int r11 = r11 - r10
            goto L_0x002c
        L_0x002b:
            r11 = r8
        L_0x002c:
            if (r11 <= 0) goto L_0x0035
            int[] r10 = r0.setCheckable
            int r11 = r0.write
            r10 = r10[r11]
            goto L_0x0036
        L_0x0035:
            r10 = r8
        L_0x0036:
            if (r9 == 0) goto L_0x003b
            r17.PlaybackStateCompat()
        L_0x003b:
            int r11 = r3.MediaBrowserCompat$CustomActionResultReceiver
            if (r11 != r7) goto L_0x0041
            r11 = r7
            goto L_0x0042
        L_0x0041:
            r11 = r8
        L_0x0042:
            int r12 = r0.write
            if (r11 != 0) goto L_0x0053
            int r12 = r3.read
            int r12 = r0.read((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (int) r12)
            int r13 = r3.read
            int r13 = r0.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (int) r13)
            int r12 = r12 + r13
        L_0x0053:
            r13 = r8
        L_0x0054:
            int r14 = r0.write
            if (r13 >= r14) goto L_0x00bb
            int r14 = r3.read
            if (r14 < 0) goto L_0x006c
            boolean r15 = r2.MediaBrowserCompat$ItemReceiver
            if (r15 == 0) goto L_0x0066
            int r15 = r2.MediaDescriptionCompat
            int r6 = r2.IconCompatParcelizer
            int r15 = r15 - r6
            goto L_0x0068
        L_0x0066:
            int r15 = r2.MediaBrowserCompat$MediaItem
        L_0x0068:
            if (r14 >= r15) goto L_0x006c
            r6 = r7
            goto L_0x006d
        L_0x006c:
            r6 = r8
        L_0x006d:
            if (r6 == 0) goto L_0x00bb
            if (r12 <= 0) goto L_0x00bb
            int r6 = r3.read
            int r14 = r0.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (int) r6)
            int r15 = r0.write
            if (r14 > r15) goto L_0x008d
            int r12 = r12 - r14
            if (r12 < 0) goto L_0x00bb
            android.view.View r6 = r3.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1)
            if (r6 == 0) goto L_0x00bb
            android.view.View[] r14 = r0.ActionMenuItemView
            r14[r13] = r6
            int r13 = r13 + 1
            r6 = 1073741824(0x40000000, float:2.0)
            goto L_0x0054
        L_0x008d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r0.write
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x00bb:
            if (r13 != 0) goto L_0x00c0
            r4.write = r7
            return
        L_0x00c0:
            r6 = 0
            r0.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (int) r13, (boolean) r11)
            r1 = r8
            r2 = r1
        L_0x00c6:
            if (r1 >= r13) goto L_0x0119
            android.view.View[] r12 = r0.ActionMenuItemView
            r12 = r12[r1]
            java.util.List<androidx.recyclerview.widget.RecyclerView$setContentView> r14 = r3.MediaBrowserCompat$SearchResultReceiver
            if (r14 != 0) goto L_0x00da
            if (r11 == 0) goto L_0x00d6
            r0.read((android.view.View) r12)
            goto L_0x00e3
        L_0x00d6:
            r0.MediaBrowserCompat$ItemReceiver((android.view.View) r12, (int) r8)
            goto L_0x00e3
        L_0x00da:
            if (r11 == 0) goto L_0x00e0
            r0.MediaBrowserCompat$ItemReceiver((android.view.View) r12)
            goto L_0x00e3
        L_0x00e0:
            r0.write((android.view.View) r12, (int) r8)
        L_0x00e3:
            android.graphics.Rect r14 = r0.MediaBrowserCompat$ItemReceiver
            androidx.recyclerview.widget.RecyclerView r15 = r0.setHasDecor
            if (r15 != 0) goto L_0x00ed
            r14.set(r8, r8, r8, r8)
            goto L_0x00f4
        L_0x00ed:
            android.graphics.Rect r15 = r15.MediaMetadataCompat(r12)
            r14.set(r15)
        L_0x00f4:
            r0.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r12, (int) r5, (boolean) r8)
            o.setContentId r14 = r0.RatingCompat
            int r14 = r14.read(r12)
            if (r14 <= r2) goto L_0x0100
            r2 = r14
        L_0x0100:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver r14 = (androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver) r14
            o.setContentId r15 = r0.RatingCompat
            int r12 = r15.MediaBrowserCompat$CustomActionResultReceiver(r12)
            float r12 = (float) r12
            int r14 = r14.write
            float r14 = (float) r14
            float r12 = r12 / r14
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 <= 0) goto L_0x0116
            r6 = r12
        L_0x0116:
            int r1 = r1 + 1
            goto L_0x00c6
        L_0x0119:
            if (r9 == 0) goto L_0x0137
            r0.MediaBrowserCompat$ItemReceiver((float) r6, (int) r10)
            r1 = r8
            r2 = r1
        L_0x0120:
            if (r1 >= r13) goto L_0x0137
            android.view.View[] r5 = r0.ActionMenuItemView
            r5 = r5[r1]
            r6 = 1073741824(0x40000000, float:2.0)
            r0.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r5, (int) r6, (boolean) r7)
            o.setContentId r6 = r0.RatingCompat
            int r5 = r6.read(r5)
            if (r5 <= r2) goto L_0x0134
            r2 = r5
        L_0x0134:
            int r1 = r1 + 1
            goto L_0x0120
        L_0x0137:
            r1 = r8
        L_0x0138:
            if (r1 >= r13) goto L_0x0197
            android.view.View[] r5 = r0.ActionMenuItemView
            r5 = r5[r1]
            o.setContentId r6 = r0.RatingCompat
            int r6 = r6.read(r5)
            if (r6 == r2) goto L_0x0192
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver r6 = (androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver) r6
            android.graphics.Rect r9 = r6.IconCompatParcelizer
            int r10 = r9.top
            int r11 = r9.bottom
            int r10 = r10 + r11
            int r11 = r6.topMargin
            int r10 = r10 + r11
            int r11 = r6.bottomMargin
            int r10 = r10 + r11
            int r11 = r9.left
            int r9 = r9.right
            int r11 = r11 + r9
            int r9 = r6.leftMargin
            int r11 = r11 + r9
            int r9 = r6.rightMargin
            int r11 = r11 + r9
            int r9 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r12 = r6.write
            int r9 = r0.MediaBrowserCompat$ItemReceiver((int) r9, (int) r12)
            int r12 = r0.MediaMetadataCompat
            if (r12 != r7) goto L_0x017f
            int r6 = r6.width
            r12 = 1073741824(0x40000000, float:2.0)
            int r6 = MediaBrowserCompat$CustomActionResultReceiver(r9, r12, r11, r6, r8)
            int r9 = r2 - r10
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r12)
            goto L_0x018e
        L_0x017f:
            r12 = 1073741824(0x40000000, float:2.0)
            int r11 = r2 - r11
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            int r6 = r6.height
            int r9 = MediaBrowserCompat$CustomActionResultReceiver(r9, r12, r10, r6, r8)
            r6 = r11
        L_0x018e:
            r0.MediaBrowserCompat$ItemReceiver(r5, r6, r9, r7)
            goto L_0x0194
        L_0x0192:
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0194:
            int r1 = r1 + 1
            goto L_0x0138
        L_0x0197:
            r4.MediaBrowserCompat$ItemReceiver = r2
            int r1 = r0.MediaMetadataCompat
            r5 = -1
            if (r1 != r7) goto L_0x01b4
            int r1 = r3.MediaMetadataCompat
            if (r1 != r5) goto L_0x01ac
            int r1 = r3.MediaBrowserCompat$MediaItem
            int r2 = r1 - r2
            r3 = r2
            r5 = r8
            r6 = r5
            r2 = r1
            r1 = r6
            goto L_0x01c9
        L_0x01ac:
            int r1 = r3.MediaBrowserCompat$MediaItem
            int r2 = r2 + r1
            r3 = r1
            r1 = r8
            r5 = r1
            r6 = r5
            goto L_0x01c9
        L_0x01b4:
            int r1 = r3.MediaMetadataCompat
            if (r1 != r5) goto L_0x01bd
            int r1 = r3.MediaBrowserCompat$MediaItem
            int r2 = r1 - r2
            goto L_0x01c5
        L_0x01bd:
            int r1 = r3.MediaBrowserCompat$MediaItem
            int r2 = r2 + r1
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x01c5:
            r5 = r2
            r2 = r8
            r3 = r2
            r6 = r3
        L_0x01c9:
            if (r6 >= r13) goto L_0x0253
            android.view.View[] r9 = r0.ActionMenuItemView
            r9 = r9[r6]
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver r10 = (androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver) r10
            int r11 = r0.MediaMetadataCompat
            if (r11 != r7) goto L_0x0210
            androidx.recyclerview.widget.RecyclerView r1 = r0.setHasDecor
            int r1 = p040o.SwitchCompat.m3079x50fd9e4a(r1)
            if (r1 == r7) goto L_0x01e3
            r1 = r8
            goto L_0x01e4
        L_0x01e3:
            r1 = r7
        L_0x01e4:
            if (r1 == 0) goto L_0x01fd
            int r1 = r17.getPaddingLeft()
            int[] r5 = r0.setCheckable
            int r11 = r0.write
            int r12 = r10.MediaBrowserCompat$CustomActionResultReceiver
            int r11 = r11 - r12
            r5 = r5[r11]
            int r1 = r1 + r5
            o.setContentId r5 = r0.RatingCompat
            int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver(r9)
            int r5 = r1 - r5
            goto L_0x0227
        L_0x01fd:
            int r1 = r17.getPaddingLeft()
            int[] r5 = r0.setCheckable
            int r11 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r5 = r5[r11]
            int r5 = r5 + r1
            o.setContentId r1 = r0.RatingCompat
            int r1 = r1.MediaBrowserCompat$CustomActionResultReceiver(r9)
            int r1 = r1 + r5
            goto L_0x0227
        L_0x0210:
            int r2 = r17.getPaddingTop()
            int[] r3 = r0.setCheckable
            int r11 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r3 = r3[r11]
            int r2 = r2 + r3
            o.setContentId r3 = r0.RatingCompat
            int r3 = r3.MediaBrowserCompat$CustomActionResultReceiver(r9)
            int r3 = r3 + r2
            r16 = r3
            r3 = r2
            r2 = r16
        L_0x0227:
            IconCompatParcelizer(r9, r5, r3, r1, r2)
            androidx.recyclerview.widget.RecyclerView$setContentView r11 = r10.MediaBrowserCompat$SearchResultReceiver
            int r11 = r11.read
            r11 = r11 & 8
            if (r11 == 0) goto L_0x0234
            r11 = r7
            goto L_0x0235
        L_0x0234:
            r11 = r8
        L_0x0235:
            if (r11 != 0) goto L_0x0244
            androidx.recyclerview.widget.RecyclerView$setContentView r10 = r10.MediaBrowserCompat$SearchResultReceiver
            int r10 = r10.read
            r10 = r10 & 2
            if (r10 == 0) goto L_0x0241
            r10 = r7
            goto L_0x0242
        L_0x0241:
            r10 = r8
        L_0x0242:
            if (r10 == 0) goto L_0x0246
        L_0x0244:
            r4.IconCompatParcelizer = r7
        L_0x0246:
            boolean r10 = r4.read
            boolean r9 = r9.hasFocusable()
            r9 = r9 | r10
            r4.read = r9
            int r6 = r6 + 1
            goto L_0x01c9
        L_0x0253:
            android.view.View[] r1 = r0.ActionMenuItemView
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.read(androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper, androidx.recyclerview.widget.RecyclerView$Keep, androidx.recyclerview.widget.LinearLayoutManager$write, androidx.recyclerview.widget.LinearLayoutManager$read):void");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(View view, int i, boolean z) {
        int i2;
        int i3;
        GridLayoutManager$MediaBrowserCompat$ItemReceiver gridLayoutManager$MediaBrowserCompat$ItemReceiver = (GridLayoutManager$MediaBrowserCompat$ItemReceiver) view.getLayoutParams();
        Rect rect = gridLayoutManager$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        int i4 = rect.top + rect.bottom + gridLayoutManager$MediaBrowserCompat$ItemReceiver.topMargin + gridLayoutManager$MediaBrowserCompat$ItemReceiver.bottomMargin;
        int i5 = rect.left + rect.right + gridLayoutManager$MediaBrowserCompat$ItemReceiver.leftMargin + gridLayoutManager$MediaBrowserCompat$ItemReceiver.rightMargin;
        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(gridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, gridLayoutManager$MediaBrowserCompat$ItemReceiver.write);
        if (this.MediaMetadataCompat == 1) {
            i2 = MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2, i, i5, gridLayoutManager$MediaBrowserCompat$ItemReceiver.width, false);
            i3 = MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat.MediaBrowserCompat$SearchResultReceiver(), this.MediaSessionCompat$QueueItem, i4, gridLayoutManager$MediaBrowserCompat$ItemReceiver.height, true);
        } else {
            int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2, i, i4, gridLayoutManager$MediaBrowserCompat$ItemReceiver.height, false);
            int MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat.MediaBrowserCompat$SearchResultReceiver(), this.setContentView, i5, gridLayoutManager$MediaBrowserCompat$ItemReceiver.width, true);
            i3 = MediaBrowserCompat$CustomActionResultReceiver2;
            i2 = MediaBrowserCompat$CustomActionResultReceiver3;
        }
        MediaBrowserCompat$ItemReceiver(view, i2, i3, z);
    }

    private void MediaBrowserCompat$ItemReceiver(float f, int i) {
        m10x50fd9e4a(Math.max(Math.round(f * ((float) this.write)), i));
    }

    private void MediaBrowserCompat$ItemReceiver(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
        if (z) {
            z2 = MediaBrowserCompat$ItemReceiver(view, i, i2, mediaDescriptionCompat);
        } else {
            z2 = MediaBrowserCompat$CustomActionResultReceiver(view, i, i2, mediaDescriptionCompat);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    private void IconCompatParcelizer(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        if (z) {
            i2 = 1;
            i3 = 0;
        } else {
            i3 = 0;
            i2 = -1;
            i4 = i - 1;
            i = -1;
        }
        while (i4 != i) {
            View view = this.ActionMenuItemView[i4];
            GridLayoutManager$MediaBrowserCompat$ItemReceiver gridLayoutManager$MediaBrowserCompat$ItemReceiver = (GridLayoutManager$MediaBrowserCompat$ItemReceiver) view.getLayoutParams();
            RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            int i5 = setcontentview.ParcelableVolumeInfo;
            if (i5 == -1) {
                i5 = setcontentview.MediaSessionCompat$QueueItem;
            }
            gridLayoutManager$MediaBrowserCompat$ItemReceiver.write = MediaBrowserCompat$ItemReceiver(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep, i5);
            gridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = i3;
            i3 += gridLayoutManager$MediaBrowserCompat$ItemReceiver.write;
            i4 += i2;
        }
    }

    private void ParcelableVolumeInfo(int i) {
        if (i != this.write) {
            this.setExpandedFormat = true;
            if (i > 0) {
                this.write = i;
                this.MediaBrowserCompat$CustomActionResultReceiver.read.clear();
                RecyclerView recyclerView = this.setHasDecor;
                if (recyclerView != null) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f3, code lost:
        if (r13 == (r2 > r11)) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x011e, code lost:
        if (r13 != (r2 > r15)) goto L_0x0128;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View read(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r25, androidx.recyclerview.widget.RecyclerView.Keep r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.mo1669a_(r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver r5 = (androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver) r5
            int r6 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r7 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r5.write
            int r7 = r7 + r5
            android.view.View r5 = super.read((android.view.View) r23, (int) r24, (androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r25, (androidx.recyclerview.widget.RecyclerView.Keep) r26)
            if (r5 != 0) goto L_0x0022
            return r4
        L_0x0022:
            r5 = r24
            int r5 = r0.read((int) r5)
            r9 = 1
            if (r5 != r9) goto L_0x002d
            r5 = r9
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            boolean r10 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r5 == r10) goto L_0x0034
            r5 = r9
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            r10 = -1
            if (r5 == 0) goto L_0x004f
            o.setMinWidth r5 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r5 == 0) goto L_0x004a
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r11 = r5.read
            int r11 = r11.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r5 = r5.MediaBrowserCompat$ItemReceiver
            int r5 = r5.size()
            int r11 = r11 - r5
            goto L_0x004b
        L_0x004a:
            r11 = 0
        L_0x004b:
            int r11 = r11 - r9
            r5 = r10
            r12 = r5
            goto L_0x0065
        L_0x004f:
            o.setMinWidth r5 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r5 == 0) goto L_0x0061
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r11 = r5.read
            int r11 = r11.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r5 = r5.MediaBrowserCompat$ItemReceiver
            int r5 = r5.size()
            int r11 = r11 - r5
            goto L_0x0062
        L_0x0061:
            r11 = 0
        L_0x0062:
            r12 = r9
            r5 = r11
            r11 = 0
        L_0x0065:
            int r13 = r0.MediaMetadataCompat
            if (r13 != r9) goto L_0x0078
            androidx.recyclerview.widget.RecyclerView r13 = r0.setHasDecor
            int r13 = p040o.SwitchCompat.m3079x50fd9e4a(r13)
            if (r13 == r9) goto L_0x0073
            r13 = 0
            goto L_0x0074
        L_0x0073:
            r13 = r9
        L_0x0074:
            if (r13 == 0) goto L_0x0078
            r13 = r9
            goto L_0x0079
        L_0x0078:
            r13 = 0
        L_0x0079:
            int r14 = r0.IconCompatParcelizer(r1, r2, r11)
            r15 = r10
            r8 = r11
            r16 = r12
            r9 = 0
            r12 = 0
            r10 = r4
            r11 = r15
        L_0x0085:
            if (r8 == r5) goto L_0x015e
            r17 = r5
            int r5 = r0.IconCompatParcelizer(r1, r2, r8)
            android.view.View r1 = r0.MediaDescriptionCompat((int) r8)
            if (r1 == r3) goto L_0x015e
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x00a7
            if (r5 == r14) goto L_0x00a7
            if (r4 != 0) goto L_0x015e
            r18 = r3
            r20 = r9
            r19 = r14
            r21 = 1
            goto L_0x014e
        L_0x00a7:
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver r5 = (androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver) r5
            int r2 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r18 = r3
            int r3 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r19 = r14
            int r14 = r5.write
            int r3 = r3 + r14
            boolean r14 = r1.hasFocusable()
            if (r14 == 0) goto L_0x00c3
            if (r2 != r6) goto L_0x00c3
            if (r3 != r7) goto L_0x00c3
            return r1
        L_0x00c3:
            boolean r14 = r1.hasFocusable()
            if (r14 == 0) goto L_0x00d1
            if (r4 == 0) goto L_0x00cc
            goto L_0x00d1
        L_0x00cc:
            r20 = r9
            r21 = 1
            goto L_0x0121
        L_0x00d1:
            boolean r14 = r1.hasFocusable()
            if (r14 != 0) goto L_0x00da
            if (r10 != 0) goto L_0x00da
            goto L_0x00cc
        L_0x00da:
            int r14 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r7)
            int r14 = r20 - r14
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x00f6
            if (r14 > r9) goto L_0x00cc
            if (r14 != r9) goto L_0x0124
            if (r2 <= r11) goto L_0x00f2
            r14 = 1
            goto L_0x00f3
        L_0x00f2:
            r14 = 0
        L_0x00f3:
            if (r13 != r14) goto L_0x0124
            goto L_0x00cc
        L_0x00f6:
            if (r4 != 0) goto L_0x0124
            r20 = r9
            o.setFitsSystemWindows r9 = r0.MediaSessionCompat$Token
            boolean r9 = r9.MediaBrowserCompat$ItemReceiver(r1)
            if (r9 == 0) goto L_0x010c
            o.setFitsSystemWindows r9 = r0.AppCompatDialogFragment
            boolean r9 = r9.MediaBrowserCompat$ItemReceiver(r1)
            if (r9 == 0) goto L_0x010c
            r9 = 1
            goto L_0x010d
        L_0x010c:
            r9 = 0
        L_0x010d:
            r21 = 1
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x0128
            if (r14 <= r12) goto L_0x0116
            goto L_0x0121
        L_0x0116:
            if (r14 != r12) goto L_0x0128
            if (r2 > r15) goto L_0x011c
            r9 = 0
            goto L_0x011e
        L_0x011c:
            r9 = r21
        L_0x011e:
            if (r13 == r9) goto L_0x0121
            goto L_0x0128
        L_0x0121:
            r9 = r21
            goto L_0x0129
        L_0x0124:
            r20 = r9
            r21 = 1
        L_0x0128:
            r9 = 0
        L_0x0129:
            if (r9 == 0) goto L_0x014e
            boolean r9 = r1.hasFocusable()
            if (r9 == 0) goto L_0x0140
            int r4 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r9 = r3 - r2
            r11 = r4
            r4 = r1
            goto L_0x0150
        L_0x0140:
            int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r12 = r3 - r2
            r10 = r1
            r15 = r5
        L_0x014e:
            r9 = r20
        L_0x0150:
            int r8 = r8 + r16
            r1 = r25
            r2 = r26
            r5 = r17
            r3 = r18
            r14 = r19
            goto L_0x0085
        L_0x015e:
            if (r4 != 0) goto L_0x0161
            r4 = r10
        L_0x0161:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.read(android.view.View, int, androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper, androidx.recyclerview.widget.RecyclerView$Keep):android.view.View");
    }

    /* renamed from: q_ */
    public final boolean mo1407q_() {
        return this.MediaDescriptionCompat == null && !this.setExpandedFormat;
    }

    public static final class IconCompatParcelizer extends GridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver {
        public final int IconCompatParcelizer(int i) {
            return 1;
        }

        public final int IconCompatParcelizer(int i, int i2) {
            return i % i2;
        }
    }

    private int IconCompatParcelizer(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, int i) {
        if (!keep.MediaBrowserCompat$ItemReceiver) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i, this.write);
        }
        int MediaBrowserCompat$ItemReceiver2 = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(i);
        if (MediaBrowserCompat$ItemReceiver2 != -1) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2, this.write);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    private int read(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, int i) {
        if (!keep.MediaBrowserCompat$ItemReceiver) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(i, this.write);
        }
        int i2 = this.IconCompatParcelizer.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int MediaBrowserCompat$ItemReceiver2 = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(i);
        if (MediaBrowserCompat$ItemReceiver2 != -1) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2, this.write);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    private int MediaBrowserCompat$ItemReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, int i) {
        if (!keep.MediaBrowserCompat$ItemReceiver) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(i);
        }
        int i2 = this.read.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int MediaBrowserCompat$ItemReceiver2 = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(i);
        if (MediaBrowserCompat$ItemReceiver2 != -1) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 1;
    }

    private void PlaybackStateCompat() {
        int i;
        int i2;
        if (this.MediaMetadataCompat == 1) {
            i2 = this.setBackgroundResource - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = this.ParcelableVolumeInfo - getPaddingBottom();
            i = getPaddingTop();
        }
        m10x50fd9e4a(i2 - i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        if (keep.MediaBrowserCompat$ItemReceiver) {
            setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
            int MediaBrowserCompat$CustomActionResultReceiver2 = setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0;
            for (int i = 0; i < MediaBrowserCompat$CustomActionResultReceiver2; i++) {
                GridLayoutManager$MediaBrowserCompat$ItemReceiver gridLayoutManager$MediaBrowserCompat$ItemReceiver = (GridLayoutManager$MediaBrowserCompat$ItemReceiver) MediaDescriptionCompat(i).getLayoutParams();
                RecyclerView.setContentView setcontentview = gridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
                int i2 = setcontentview.ParcelableVolumeInfo;
                if (i2 == -1) {
                    i2 = setcontentview.MediaSessionCompat$QueueItem;
                }
                this.read.put(i2, gridLayoutManager$MediaBrowserCompat$ItemReceiver.write);
                this.IconCompatParcelizer.put(i2, gridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
        super.MediaBrowserCompat$CustomActionResultReceiver(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep);
        this.read.clear();
        this.IconCompatParcelizer.clear();
    }
}

package p040o;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.nAllocationSyncAll */
public final class nAllocationSyncAll {
    public int[] IconCompatParcelizer;
    private boolean[] MediaBrowserCompat$CustomActionResultReceiver;
    public long[] MediaBrowserCompat$ItemReceiver;
    private long[] read;
    private final CardIoWrapperActivity write;

    public nAllocationSyncAll(CardIoWrapperActivity cardIoWrapperActivity) {
        this.write = cardIoWrapperActivity;
    }

    public final int[] write(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int l_ = this.write.mo33253l_();
        List<write> IconCompatParcelizer2 = IconCompatParcelizer(l_);
        write write2 = new write((byte) 0);
        if (view == null || !(layoutParams instanceof nAllocationResize2D)) {
            write2.MediaBrowserCompat$ItemReceiver = 1;
        } else {
            write2.MediaBrowserCompat$ItemReceiver = ((nAllocationResize2D) layoutParams).MediaSessionCompat$ResultReceiverWrapper();
        }
        if (i == -1 || i == l_) {
            write2.IconCompatParcelizer = l_;
        } else if (i < this.write.mo33253l_()) {
            write2.IconCompatParcelizer = i;
            while (i < l_) {
                IconCompatParcelizer2.get(i).IconCompatParcelizer++;
                i++;
            }
        } else {
            write2.IconCompatParcelizer = l_;
        }
        IconCompatParcelizer2.add(write2);
        return read(l_ + 1, IconCompatParcelizer2, sparseIntArray);
    }

    public final int[] read(SparseIntArray sparseIntArray) {
        int l_ = this.write.mo33253l_();
        return read(l_, IconCompatParcelizer(l_), sparseIntArray);
    }

    private List<write> IconCompatParcelizer(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            write write2 = new write((byte) 0);
            write2.MediaBrowserCompat$ItemReceiver = ((nAllocationResize2D) this.write.mo33247a_(i2).getLayoutParams()).MediaSessionCompat$ResultReceiverWrapper();
            write2.IconCompatParcelizer = i2;
            arrayList.add(write2);
        }
        return arrayList;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(SparseIntArray sparseIntArray) {
        int l_ = this.write.mo33253l_();
        if (sparseIntArray.size() != l_) {
            return true;
        }
        for (int i = 0; i < l_; i++) {
            View a_ = this.write.mo33247a_(i);
            if (a_ != null && ((nAllocationResize2D) a_.getLayoutParams()).MediaSessionCompat$ResultReceiverWrapper() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    private static int[] read(int i, List<write> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (write next : list) {
            iArr[i2] = next.IconCompatParcelizer;
            sparseIntArray.append(next.IconCompatParcelizer, next.MediaBrowserCompat$ItemReceiver);
            i2++;
        }
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x022a, code lost:
        if (r2 < (r6 + r13)) goto L_0x0208;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(p040o.nAllocationSyncAll$MediaBrowserCompat$ItemReceiver r27, int r28, int r29, int r30, int r31, int r32, java.util.List<p040o.onNotifyListenerFailed> r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r32
            o.CardIoWrapperActivity r5 = r0.write
            boolean r5 = r5.MediaBrowserCompat$SearchResultReceiver()
            int r6 = android.view.View.MeasureSpec.getMode(r28)
            int r7 = android.view.View.MeasureSpec.getSize(r28)
            if (r33 != 0) goto L_0x0020
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L_0x0022
        L_0x0020:
            r8 = r33
        L_0x0022:
            r1.MediaBrowserCompat$CustomActionResultReceiver = r8
            r9 = -1
            if (r4 != r9) goto L_0x0029
            r12 = 1
            goto L_0x002a
        L_0x0029:
            r12 = 0
        L_0x002a:
            if (r5 == 0) goto L_0x0033
            o.CardIoWrapperActivity r13 = r0.write
            int r13 = r13.getPaddingStart()
            goto L_0x0039
        L_0x0033:
            o.CardIoWrapperActivity r13 = r0.write
            int r13 = r13.getPaddingTop()
        L_0x0039:
            if (r5 == 0) goto L_0x0042
            o.CardIoWrapperActivity r14 = r0.write
            int r14 = r14.getPaddingEnd()
            goto L_0x0048
        L_0x0042:
            o.CardIoWrapperActivity r14 = r0.write
            int r14 = r14.getPaddingBottom()
        L_0x0048:
            if (r5 == 0) goto L_0x0051
            o.CardIoWrapperActivity r15 = r0.write
            int r15 = r15.getPaddingTop()
            goto L_0x0057
        L_0x0051:
            o.CardIoWrapperActivity r15 = r0.write
            int r15 = r15.getPaddingStart()
        L_0x0057:
            if (r5 == 0) goto L_0x0060
            o.CardIoWrapperActivity r10 = r0.write
            int r10 = r10.getPaddingBottom()
            goto L_0x0066
        L_0x0060:
            o.CardIoWrapperActivity r10 = r0.write
            int r10 = r10.getPaddingEnd()
        L_0x0066:
            o.onNotifyListenerFailed r9 = new o.onNotifyListenerFailed
            r9.<init>()
            r11 = r31
            r9.read = r11
            int r14 = r14 + r13
            r9.RatingCompat = r14
            o.CardIoWrapperActivity r13 = r0.write
            int r13 = r13.mo33253l_()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = r12
            r17 = r16
            r1 = 0
            r4 = 0
            r12 = 0
        L_0x0081:
            if (r11 >= r13) goto L_0x0406
            r18 = r4
            o.CardIoWrapperActivity r4 = r0.write
            android.view.View r4 = r4.read(r11)
            if (r4 != 0) goto L_0x00b1
            int r4 = r13 + -1
            if (r11 != r4) goto L_0x009d
            int r4 = r9.MediaBrowserCompat$MediaItem
            r19 = r1
            int r1 = r9.write
            int r4 = r4 - r1
            if (r4 != 0) goto L_0x009b
            goto L_0x009f
        L_0x009b:
            r1 = 1
            goto L_0x00a0
        L_0x009d:
            r19 = r1
        L_0x009f:
            r1 = 0
        L_0x00a0:
            if (r1 == 0) goto L_0x00ae
            r9.ParcelableVolumeInfo = r12
            o.CardIoWrapperActivity r1 = r0.write
            r1.write((p040o.onNotifyListenerFailed) r9)
            r9.MediaDescriptionCompat = r11
            r8.add(r9)
        L_0x00ae:
            r20 = r3
            goto L_0x00e5
        L_0x00b1:
            r19 = r1
            int r1 = r4.getVisibility()
            r20 = r3
            r3 = 8
            if (r1 != r3) goto L_0x0101
            int r1 = r9.write
            r3 = 1
            int r1 = r1 + r3
            r9.write = r1
            int r1 = r9.MediaBrowserCompat$MediaItem
            int r1 = r1 + r3
            r9.MediaBrowserCompat$MediaItem = r1
            int r1 = r13 + -1
            if (r11 != r1) goto L_0x00d6
            int r1 = r9.MediaBrowserCompat$MediaItem
            int r3 = r9.write
            int r1 = r1 - r3
            if (r1 != 0) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            r1 = 1
            goto L_0x00d7
        L_0x00d6:
            r1 = 0
        L_0x00d7:
            if (r1 == 0) goto L_0x00e5
            r9.ParcelableVolumeInfo = r12
            o.CardIoWrapperActivity r1 = r0.write
            r1.write((p040o.onNotifyListenerFailed) r9)
            r9.MediaDescriptionCompat = r11
            r8.add(r9)
        L_0x00e5:
            r4 = r31
            r1 = r32
            r23 = r6
            r24 = r7
            r21 = r13
            r6 = r17
            r17 = r18
            r18 = r19
            r2 = r20
            r3 = -1
            r13 = r29
            r7 = r30
            r20 = r5
            r5 = 1
            goto L_0x03ef
        L_0x0101:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            o.nAllocationResize2D r1 = (p040o.nAllocationResize2D) r1
            int r3 = r1.MediaBrowserCompat$CustomActionResultReceiver()
            r21 = r13
            r13 = 4
            if (r3 != r13) goto L_0x0119
            java.util.List<java.lang.Integer> r3 = r9.MediaMetadataCompat
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r3.add(r13)
        L_0x0119:
            if (r5 == 0) goto L_0x0120
            int r3 = r1.mo33282x50fd9e4a()
            goto L_0x0124
        L_0x0120:
            int r3 = r1.write()
        L_0x0124:
            float r13 = r1.MediaBrowserCompat$ItemReceiver()
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r13 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r13 == 0) goto L_0x013c
            r13 = 1073741824(0x40000000, float:2.0)
            if (r6 != r13) goto L_0x013c
            float r3 = (float) r7
            float r13 = r1.MediaBrowserCompat$ItemReceiver()
            float r3 = r3 * r13
            int r3 = java.lang.Math.round(r3)
        L_0x013c:
            if (r5 == 0) goto L_0x017b
            o.CardIoWrapperActivity r13 = r0.write
            int r22 = r1.RatingCompat()
            int r23 = r1.MediaMetadataCompat()
            int r22 = r14 + r22
            r24 = r7
            int r7 = r22 + r23
            int r3 = r13.MediaBrowserCompat$ItemReceiver(r2, r7, r3)
            o.CardIoWrapperActivity r7 = r0.write
            int r13 = r1.MediaDescriptionCompat()
            int r22 = r1.MediaBrowserCompat$MediaItem()
            r23 = r6
            int r6 = r1.write()
            int r25 = r15 + r10
            int r25 = r25 + r13
            int r25 = r25 + r22
            int r13 = r25 + r12
            r22 = r8
            r8 = r20
            int r6 = r7.read(r8, r13, r6)
            r4.measure(r3, r6)
            r0.MediaBrowserCompat$ItemReceiver(r11, r3, r6, r4)
            r20 = r5
            goto L_0x01b5
        L_0x017b:
            r23 = r6
            r24 = r7
            r22 = r8
            r8 = r20
            o.CardIoWrapperActivity r6 = r0.write
            int r7 = r1.RatingCompat()
            int r13 = r1.MediaMetadataCompat()
            r20 = r5
            int r5 = r1.mo33282x50fd9e4a()
            int r25 = r15 + r10
            int r25 = r25 + r7
            int r25 = r25 + r13
            int r7 = r25 + r12
            int r5 = r6.MediaBrowserCompat$ItemReceiver(r8, r7, r5)
            o.CardIoWrapperActivity r6 = r0.write
            int r7 = r1.MediaDescriptionCompat()
            int r8 = r1.MediaBrowserCompat$MediaItem()
            int r7 = r7 + r14
            int r7 = r7 + r8
            int r3 = r6.read(r2, r7, r3)
            r4.measure(r5, r3)
            r0.MediaBrowserCompat$ItemReceiver(r11, r5, r3, r4)
        L_0x01b5:
            o.CardIoWrapperActivity r5 = r0.write
            r5.MediaBrowserCompat$ItemReceiver(r11, r4)
            r0.IconCompatParcelizer(r4, r11)
            int r5 = r4.getMeasuredState()
            r6 = r19
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            int r6 = r9.RatingCompat
            if (r20 == 0) goto L_0x01d0
            int r7 = r4.getMeasuredWidth()
            goto L_0x01d4
        L_0x01d0:
            int r7 = r4.getMeasuredHeight()
        L_0x01d4:
            if (r20 == 0) goto L_0x01db
            int r8 = r1.RatingCompat()
            goto L_0x01df
        L_0x01db:
            int r8 = r1.MediaDescriptionCompat()
        L_0x01df:
            if (r20 == 0) goto L_0x01e6
            int r13 = r1.MediaMetadataCompat()
            goto L_0x01ea
        L_0x01e6:
            int r13 = r1.MediaBrowserCompat$MediaItem()
        L_0x01ea:
            int r19 = r22.size()
            int r7 = r7 + r8
            int r13 = r13 + r7
            o.CardIoWrapperActivity r7 = r0.write
            int r7 = r7.MediaMetadataCompat()
            if (r7 != 0) goto L_0x01fe
        L_0x01f8:
            r7 = r18
            r2 = r24
        L_0x01fc:
            r6 = 0
            goto L_0x022d
        L_0x01fe:
            boolean r7 = r1.PlaybackStateCompat$CustomAction()
            if (r7 == 0) goto L_0x020a
            r7 = r18
            r2 = r24
        L_0x0208:
            r6 = 1
            goto L_0x022d
        L_0x020a:
            if (r23 != 0) goto L_0x020d
            goto L_0x01f8
        L_0x020d:
            o.CardIoWrapperActivity r7 = r0.write
            int r7 = r7.MediaDescriptionCompat()
            r8 = -1
            if (r7 == r8) goto L_0x021c
            r8 = 1
            int r2 = r19 + 1
            if (r7 > r2) goto L_0x021c
            goto L_0x01f8
        L_0x021c:
            o.CardIoWrapperActivity r2 = r0.write
            r7 = r18
            int r2 = r2.write(r4, r11, r7)
            if (r2 <= 0) goto L_0x0227
            int r13 = r13 + r2
        L_0x0227:
            int r6 = r6 + r13
            r2 = r24
            if (r2 >= r6) goto L_0x01fc
            goto L_0x0208
        L_0x022d:
            if (r6 == 0) goto L_0x02d1
            int r6 = r9.MediaBrowserCompat$MediaItem
            int r7 = r9.write
            int r6 = r6 - r7
            if (r6 <= 0) goto L_0x024e
            if (r11 <= 0) goto L_0x023b
            int r6 = r11 + -1
            goto L_0x023c
        L_0x023b:
            r6 = 0
        L_0x023c:
            r9.ParcelableVolumeInfo = r12
            o.CardIoWrapperActivity r7 = r0.write
            r7.write((p040o.onNotifyListenerFailed) r9)
            r9.MediaDescriptionCompat = r6
            r8 = r22
            r8.add(r9)
            int r6 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r12 = r12 + r6
            goto L_0x0250
        L_0x024e:
            r8 = r22
        L_0x0250:
            if (r20 == 0) goto L_0x028a
            int r6 = r1.write()
            r7 = -1
            if (r6 != r7) goto L_0x0285
            o.CardIoWrapperActivity r6 = r0.write
            int r7 = r6.getPaddingTop()
            o.CardIoWrapperActivity r9 = r0.write
            int r9 = r9.getPaddingBottom()
            int r13 = r1.MediaDescriptionCompat()
            int r17 = r1.MediaBrowserCompat$MediaItem()
            r24 = r2
            int r2 = r1.write()
            int r7 = r7 + r9
            int r7 = r7 + r13
            int r7 = r7 + r17
            int r7 = r7 + r12
            r13 = r29
            int r2 = r6.read(r13, r7, r2)
            r4.measure(r3, r2)
            r0.IconCompatParcelizer(r4, r11)
            goto L_0x02bf
        L_0x0285:
            r13 = r29
            r24 = r2
            goto L_0x02bf
        L_0x028a:
            r13 = r29
            r24 = r2
            int r2 = r1.mo33282x50fd9e4a()
            r6 = -1
            if (r2 != r6) goto L_0x02bf
            o.CardIoWrapperActivity r2 = r0.write
            int r6 = r2.getPaddingLeft()
            o.CardIoWrapperActivity r7 = r0.write
            int r7 = r7.getPaddingRight()
            int r9 = r1.RatingCompat()
            int r17 = r1.MediaMetadataCompat()
            r18 = r5
            int r5 = r1.mo33282x50fd9e4a()
            int r6 = r6 + r7
            int r6 = r6 + r9
            int r6 = r6 + r17
            int r6 = r6 + r12
            int r2 = r2.MediaBrowserCompat$ItemReceiver(r13, r6, r5)
            r4.measure(r2, r3)
            r0.IconCompatParcelizer(r4, r11)
            goto L_0x02c1
        L_0x02bf:
            r18 = r5
        L_0x02c1:
            o.onNotifyListenerFailed r9 = new o.onNotifyListenerFailed
            r9.<init>()
            r2 = 1
            r9.MediaBrowserCompat$MediaItem = r2
            r9.RatingCompat = r14
            r9.read = r11
            r3 = r16
            r2 = 0
            goto L_0x02e3
        L_0x02d1:
            r13 = r29
            r24 = r2
            r18 = r5
            r8 = r22
            r2 = 1
            int r3 = r9.MediaBrowserCompat$MediaItem
            int r3 = r3 + r2
            r9.MediaBrowserCompat$MediaItem = r3
            int r2 = r7 + 1
            r3 = r17
        L_0x02e3:
            int[] r5 = r0.IconCompatParcelizer
            if (r5 == 0) goto L_0x02ed
            int r6 = r8.size()
            r5[r11] = r6
        L_0x02ed:
            int r5 = r9.RatingCompat
            if (r20 == 0) goto L_0x02f6
            int r6 = r4.getMeasuredWidth()
            goto L_0x02fa
        L_0x02f6:
            int r6 = r4.getMeasuredHeight()
        L_0x02fa:
            if (r20 == 0) goto L_0x0301
            int r7 = r1.RatingCompat()
            goto L_0x0305
        L_0x0301:
            int r7 = r1.MediaDescriptionCompat()
        L_0x0305:
            int r6 = r6 + r7
            if (r20 == 0) goto L_0x030d
            int r7 = r1.MediaMetadataCompat()
            goto L_0x0311
        L_0x030d:
            int r7 = r1.MediaBrowserCompat$MediaItem()
        L_0x0311:
            int r6 = r6 + r7
            int r5 = r5 + r6
            r9.RatingCompat = r5
            float r5 = r9.MediaSessionCompat$ResultReceiverWrapper
            float r6 = r1.read()
            float r5 = r5 + r6
            r9.MediaSessionCompat$ResultReceiverWrapper = r5
            float r5 = r9.AlertController$RecycleListView
            float r6 = r1.IconCompatParcelizer()
            float r5 = r5 + r6
            r9.AlertController$RecycleListView = r5
            o.CardIoWrapperActivity r5 = r0.write
            r5.write(r4, r11, r2, r9)
            if (r20 == 0) goto L_0x0333
            int r5 = r4.getMeasuredHeight()
            goto L_0x0337
        L_0x0333:
            int r5 = r4.getMeasuredWidth()
        L_0x0337:
            if (r20 == 0) goto L_0x033e
            int r6 = r1.MediaDescriptionCompat()
            goto L_0x0342
        L_0x033e:
            int r6 = r1.RatingCompat()
        L_0x0342:
            if (r20 == 0) goto L_0x0349
            int r7 = r1.MediaBrowserCompat$MediaItem()
            goto L_0x034d
        L_0x0349:
            int r7 = r1.MediaMetadataCompat()
        L_0x034d:
            r17 = r2
            o.CardIoWrapperActivity r2 = r0.write
            int r2 = r2.write((android.view.View) r4)
            int r5 = r5 + r6
            int r5 = r5 + r7
            int r5 = r5 + r2
            int r2 = java.lang.Math.max(r3, r5)
            int r3 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = java.lang.Math.max(r3, r2)
            r9.MediaBrowserCompat$CustomActionResultReceiver = r3
            if (r20 == 0) goto L_0x0397
            o.CardIoWrapperActivity r3 = r0.write
            int r3 = r3.MediaMetadataCompat()
            r5 = 2
            if (r3 == r5) goto L_0x0381
            int r3 = r9.f2910x50fd9e4a
            int r4 = r4.getBaseline()
            int r1 = r1.MediaDescriptionCompat()
            int r4 = r4 + r1
            int r1 = java.lang.Math.max(r3, r4)
            r9.f2910x50fd9e4a = r1
            goto L_0x0397
        L_0x0381:
            int r3 = r9.f2910x50fd9e4a
            int r5 = r4.getMeasuredHeight()
            int r4 = r4.getBaseline()
            int r1 = r1.MediaBrowserCompat$MediaItem()
            int r5 = r5 - r4
            int r5 = r5 + r1
            int r1 = java.lang.Math.max(r3, r5)
            r9.f2910x50fd9e4a = r1
        L_0x0397:
            int r1 = r21 + -1
            if (r11 != r1) goto L_0x03a5
            int r1 = r9.MediaBrowserCompat$MediaItem
            int r3 = r9.write
            int r1 = r1 - r3
            if (r1 != 0) goto L_0x03a3
            goto L_0x03a5
        L_0x03a3:
            r3 = 1
            goto L_0x03a6
        L_0x03a5:
            r3 = 0
        L_0x03a6:
            if (r3 == 0) goto L_0x03b7
            r9.ParcelableVolumeInfo = r12
            o.CardIoWrapperActivity r1 = r0.write
            r1.write((p040o.onNotifyListenerFailed) r9)
            r9.MediaDescriptionCompat = r11
            r8.add(r9)
            int r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r12 = r12 + r1
        L_0x03b7:
            r1 = r32
            r3 = -1
            if (r1 == r3) goto L_0x03de
            int r4 = r8.size()
            if (r4 <= 0) goto L_0x03de
            int r4 = r8.size()
            r5 = 1
            int r4 = r4 - r5
            java.lang.Object r4 = r8.get(r4)
            o.onNotifyListenerFailed r4 = (p040o.onNotifyListenerFailed) r4
            int r4 = r4.MediaDescriptionCompat
            if (r4 < r1) goto L_0x03df
            if (r11 < r1) goto L_0x03df
            if (r31 != 0) goto L_0x03df
            int r4 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = -r4
            r7 = r30
            r12 = r4
            r4 = r5
            goto L_0x03e3
        L_0x03de:
            r5 = 1
        L_0x03df:
            r7 = r30
            r4 = r31
        L_0x03e3:
            if (r12 <= r7) goto L_0x03ed
            if (r4 != 0) goto L_0x03e8
            goto L_0x03ed
        L_0x03e8:
            r2 = r27
            r1 = r18
            goto L_0x0409
        L_0x03ed:
            r6 = r2
            r2 = r13
        L_0x03ef:
            int r11 = r11 + 1
            r3 = r2
            r31 = r4
            r4 = r17
            r1 = r18
            r5 = r20
            r13 = r21
            r7 = r24
            r2 = r28
            r17 = r6
            r6 = r23
            goto L_0x0081
        L_0x0406:
            r6 = r1
            r2 = r27
        L_0x0409:
            r2.IconCompatParcelizer = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.nAllocationSyncAll.IconCompatParcelizer(o.nAllocationSyncAll$MediaBrowserCompat$ItemReceiver, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void IconCompatParcelizer(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            o.nAllocationResize2D r0 = (p040o.nAllocationResize2D) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.ParcelableVolumeInfo()
            r4 = 1
            if (r1 >= r3) goto L_0x001a
            int r1 = r0.ParcelableVolumeInfo()
            goto L_0x0024
        L_0x001a:
            int r3 = r0.MediaSessionCompat$Token()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.MediaSessionCompat$Token()
        L_0x0024:
            r3 = r4
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.MediaSessionCompat$QueueItem()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.MediaSessionCompat$QueueItem()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.MediaBrowserCompat$SearchResultReceiver()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.MediaBrowserCompat$SearchResultReceiver()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.MediaBrowserCompat$ItemReceiver(r8, r1, r0, r7)
            o.CardIoWrapperActivity r0 = r6.write
            r0.MediaBrowserCompat$ItemReceiver(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.nAllocationSyncAll.IconCompatParcelizer(android.view.View, int):void");
    }

    public final void write(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int l_ = this.write.mo33253l_();
        boolean[] zArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i7 = 0;
        if (zArr == null) {
            if (l_ < 10) {
                l_ = 10;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = new boolean[l_];
        } else if (zArr.length < l_) {
            int length = zArr.length << 1;
            if (length >= l_) {
                l_ = length;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = new boolean[l_];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 < this.write.mo33253l_()) {
            int MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$CustomActionResultReceiver();
            int MediaBrowserCompat$CustomActionResultReceiver3 = this.write.MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver3 == 0 || MediaBrowserCompat$CustomActionResultReceiver3 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                if (mode != 1073741824) {
                    size = this.write.RatingCompat();
                }
                i6 = this.write.getPaddingLeft();
                i4 = this.write.getPaddingRight();
            } else if (MediaBrowserCompat$CustomActionResultReceiver3 == 2 || MediaBrowserCompat$CustomActionResultReceiver3 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.write.RatingCompat();
                }
                i6 = this.write.getPaddingTop();
                i4 = this.write.getPaddingBottom();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid flex direction: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver2);
                throw new IllegalArgumentException(sb.toString());
            }
            int i8 = i6 + i4;
            int[] iArr = this.IconCompatParcelizer;
            if (iArr != null) {
                i7 = iArr[i3];
            }
            List<onNotifyListenerFailed> m_ = this.write.mo33254m_();
            int size2 = m_.size();
            while (i7 < size2) {
                onNotifyListenerFailed onnotifylistenerfailed = m_.get(i7);
                if (onnotifylistenerfailed.RatingCompat < i5) {
                    MediaBrowserCompat$ItemReceiver(i, i2, onnotifylistenerfailed, i5, i8, false);
                } else {
                    write(i, i2, onnotifylistenerfailed, i5, i8, false);
                }
                i7++;
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(int i, int i2, onNotifyListenerFailed onnotifylistenerfailed, int i3, int i4, boolean z) {
        float f;
        int i5;
        double d;
        double d2;
        onNotifyListenerFailed onnotifylistenerfailed2 = onnotifylistenerfailed;
        int i6 = i3;
        int i7 = 1;
        boolean z2 = z;
        while (onnotifylistenerfailed2.MediaSessionCompat$ResultReceiverWrapper > BitmapDescriptorFactory.HUE_RED && i6 >= onnotifylistenerfailed2.RatingCompat) {
            int i8 = onnotifylistenerfailed2.RatingCompat;
            float f2 = ((float) (i6 - onnotifylistenerfailed2.RatingCompat)) / onnotifylistenerfailed2.MediaSessionCompat$ResultReceiverWrapper;
            onnotifylistenerfailed2.RatingCompat = i4 + onnotifylistenerfailed2.IconCompatParcelizer;
            if (!z2) {
                onnotifylistenerfailed2.MediaBrowserCompat$CustomActionResultReceiver = PKIFailureInfo.systemUnavail;
            }
            int i9 = 0;
            boolean z3 = false;
            int i10 = 0;
            float f3 = 0.0f;
            while (i9 < onnotifylistenerfailed2.MediaBrowserCompat$MediaItem) {
                int i11 = onnotifylistenerfailed2.read + i9;
                View read2 = this.write.read(i11);
                if (read2 == null || read2.getVisibility() == 8) {
                    int i12 = i2;
                    f = f2;
                    int i13 = i;
                } else {
                    nAllocationResize2D nallocationresize2d = (nAllocationResize2D) read2.getLayoutParams();
                    int MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$CustomActionResultReceiver();
                    if (MediaBrowserCompat$CustomActionResultReceiver2 == 0 || MediaBrowserCompat$CustomActionResultReceiver2 == i7) {
                        f = f2;
                        int i14 = i;
                        int measuredWidth = read2.getMeasuredWidth();
                        long[] jArr = this.read;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i11];
                        }
                        int measuredHeight = read2.getMeasuredHeight();
                        long[] jArr2 = this.read;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i11] >> 32);
                        }
                        if (this.MediaBrowserCompat$CustomActionResultReceiver[i11] || nallocationresize2d.read() <= BitmapDescriptorFactory.HUE_RED) {
                            int i15 = i2;
                        } else {
                            float read3 = ((float) measuredWidth) + (nallocationresize2d.read() * f);
                            if (i9 == onnotifylistenerfailed2.MediaBrowserCompat$MediaItem - 1) {
                                read3 += f3;
                                f3 = 0.0f;
                            }
                            int round = Math.round(read3);
                            if (round > nallocationresize2d.MediaSessionCompat$Token()) {
                                round = nallocationresize2d.MediaSessionCompat$Token();
                                this.MediaBrowserCompat$CustomActionResultReceiver[i11] = true;
                                onnotifylistenerfailed2.MediaSessionCompat$ResultReceiverWrapper -= nallocationresize2d.read();
                                z3 = true;
                            } else {
                                f3 += read3 - ((float) round);
                                double d3 = (double) f3;
                                if (d3 > 1.0d) {
                                    round++;
                                    d = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d = d3 + 1.0d;
                                }
                                f3 = (float) d;
                            }
                            int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i2, nallocationresize2d, onnotifylistenerfailed2.ParcelableVolumeInfo);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            read2.measure(makeMeasureSpec, MediaBrowserCompat$ItemReceiver2);
                            int measuredWidth2 = read2.getMeasuredWidth();
                            int measuredHeight2 = read2.getMeasuredHeight();
                            MediaBrowserCompat$ItemReceiver(i11, makeMeasureSpec, MediaBrowserCompat$ItemReceiver2, read2);
                            this.write.MediaBrowserCompat$ItemReceiver(i11, read2);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i10, measuredHeight + nallocationresize2d.MediaDescriptionCompat() + nallocationresize2d.MediaBrowserCompat$MediaItem() + this.write.write(read2));
                        onnotifylistenerfailed2.RatingCompat += measuredWidth + nallocationresize2d.RatingCompat() + nallocationresize2d.MediaMetadataCompat();
                        i5 = max;
                    } else {
                        int measuredHeight3 = read2.getMeasuredHeight();
                        long[] jArr3 = this.read;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i11] >> 32);
                        }
                        int measuredWidth3 = read2.getMeasuredWidth();
                        long[] jArr4 = this.read;
                        f = f2;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i11];
                        }
                        if (this.MediaBrowserCompat$CustomActionResultReceiver[i11] || nallocationresize2d.read() <= BitmapDescriptorFactory.HUE_RED) {
                            int i16 = i;
                        } else {
                            float read4 = ((float) measuredHeight3) + (nallocationresize2d.read() * f);
                            if (i9 == onnotifylistenerfailed2.MediaBrowserCompat$MediaItem - 1) {
                                read4 += f3;
                                f3 = BitmapDescriptorFactory.HUE_RED;
                            }
                            int round2 = Math.round(read4);
                            if (round2 > nallocationresize2d.MediaBrowserCompat$SearchResultReceiver()) {
                                round2 = nallocationresize2d.MediaBrowserCompat$SearchResultReceiver();
                                this.MediaBrowserCompat$CustomActionResultReceiver[i11] = true;
                                onnotifylistenerfailed2.MediaSessionCompat$ResultReceiverWrapper -= nallocationresize2d.read();
                                z3 = true;
                            } else {
                                f3 += read4 - ((float) round2);
                                double d4 = (double) f3;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                }
                                f3 = (float) d2;
                            }
                            int read5 = read(i, nallocationresize2d, onnotifylistenerfailed2.ParcelableVolumeInfo);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            read2.measure(read5, makeMeasureSpec2);
                            measuredWidth3 = read2.getMeasuredWidth();
                            measuredHeight3 = read2.getMeasuredHeight();
                            MediaBrowserCompat$ItemReceiver(i11, read5, makeMeasureSpec2, read2);
                            this.write.MediaBrowserCompat$ItemReceiver(i11, read2);
                        }
                        i5 = Math.max(i10, measuredWidth3 + nallocationresize2d.RatingCompat() + nallocationresize2d.MediaMetadataCompat() + this.write.write(read2));
                        onnotifylistenerfailed2.RatingCompat += measuredHeight3 + nallocationresize2d.MediaDescriptionCompat() + nallocationresize2d.MediaBrowserCompat$MediaItem();
                        int i17 = i2;
                    }
                    onnotifylistenerfailed2.MediaBrowserCompat$CustomActionResultReceiver = Math.max(onnotifylistenerfailed2.MediaBrowserCompat$CustomActionResultReceiver, i5);
                    i10 = i5;
                }
                i9++;
                int i18 = i3;
                f2 = f;
                i7 = 1;
            }
            int i19 = i;
            int i20 = i2;
            if (z3 && i8 != onnotifylistenerfailed2.RatingCompat) {
                i6 = i3;
                i7 = 1;
                z2 = true;
            } else {
                return;
            }
        }
    }

    private void write(int i, int i2, onNotifyListenerFailed onnotifylistenerfailed, int i3, int i4, boolean z) {
        int i5;
        onNotifyListenerFailed onnotifylistenerfailed2 = onnotifylistenerfailed;
        int i6 = i3;
        int i7 = 1;
        boolean z2 = z;
        while (true) {
            int i8 = onnotifylistenerfailed2.RatingCompat;
            if (onnotifylistenerfailed2.AlertController$RecycleListView > BitmapDescriptorFactory.HUE_RED && i6 <= onnotifylistenerfailed2.RatingCompat) {
                float f = ((float) (onnotifylistenerfailed2.RatingCompat - i6)) / onnotifylistenerfailed2.AlertController$RecycleListView;
                onnotifylistenerfailed2.RatingCompat = i4 + onnotifylistenerfailed2.IconCompatParcelizer;
                if (!z2) {
                    onnotifylistenerfailed2.MediaBrowserCompat$CustomActionResultReceiver = PKIFailureInfo.systemUnavail;
                }
                int i9 = 0;
                boolean z3 = false;
                int i10 = 0;
                float f2 = 0.0f;
                while (i9 < onnotifylistenerfailed2.MediaBrowserCompat$MediaItem) {
                    int i11 = onnotifylistenerfailed2.read + i9;
                    View read2 = this.write.read(i11);
                    if (read2 == null || read2.getVisibility() == 8) {
                        int i12 = i2;
                        z3 = z3;
                    } else {
                        nAllocationResize2D nallocationresize2d = (nAllocationResize2D) read2.getLayoutParams();
                        int MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$CustomActionResultReceiver();
                        if (MediaBrowserCompat$CustomActionResultReceiver2 == 0 || MediaBrowserCompat$CustomActionResultReceiver2 == i7) {
                            boolean z4 = z3;
                            int measuredWidth = read2.getMeasuredWidth();
                            long[] jArr = this.read;
                            if (jArr != null) {
                                measuredWidth = (int) jArr[i11];
                            }
                            int measuredHeight = read2.getMeasuredHeight();
                            long[] jArr2 = this.read;
                            if (jArr2 != null) {
                                measuredHeight = (int) (jArr2[i11] >> 32);
                            }
                            if (this.MediaBrowserCompat$CustomActionResultReceiver[i11] || nallocationresize2d.IconCompatParcelizer() <= BitmapDescriptorFactory.HUE_RED) {
                                int i13 = i2;
                            } else {
                                float IconCompatParcelizer2 = ((float) measuredWidth) - (nallocationresize2d.IconCompatParcelizer() * f);
                                if (i9 == onnotifylistenerfailed2.MediaBrowserCompat$MediaItem - 1) {
                                    IconCompatParcelizer2 += f2;
                                    f2 = 0.0f;
                                }
                                int round = Math.round(IconCompatParcelizer2);
                                if (round < nallocationresize2d.ParcelableVolumeInfo()) {
                                    round = nallocationresize2d.ParcelableVolumeInfo();
                                    this.MediaBrowserCompat$CustomActionResultReceiver[i11] = true;
                                    onnotifylistenerfailed2.AlertController$RecycleListView -= nallocationresize2d.IconCompatParcelizer();
                                    z4 = true;
                                } else {
                                    f2 += IconCompatParcelizer2 - ((float) round);
                                    double d = (double) f2;
                                    if (d > 1.0d) {
                                        round++;
                                        f2 -= 1.0f;
                                    } else if (d < -1.0d) {
                                        round--;
                                        f2 += 1.0f;
                                    }
                                }
                                int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i2, nallocationresize2d, onnotifylistenerfailed2.ParcelableVolumeInfo);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                                read2.measure(makeMeasureSpec, MediaBrowserCompat$ItemReceiver2);
                                int measuredWidth2 = read2.getMeasuredWidth();
                                int measuredHeight2 = read2.getMeasuredHeight();
                                MediaBrowserCompat$ItemReceiver(i11, makeMeasureSpec, MediaBrowserCompat$ItemReceiver2, read2);
                                this.write.MediaBrowserCompat$ItemReceiver(i11, read2);
                                measuredWidth = measuredWidth2;
                                measuredHeight = measuredHeight2;
                            }
                            int max = Math.max(i10, measuredHeight + nallocationresize2d.MediaDescriptionCompat() + nallocationresize2d.MediaBrowserCompat$MediaItem() + this.write.write(read2));
                            onnotifylistenerfailed2.RatingCompat += measuredWidth + nallocationresize2d.RatingCompat() + nallocationresize2d.MediaMetadataCompat();
                            i5 = max;
                            z3 = z4;
                        } else {
                            int measuredHeight3 = read2.getMeasuredHeight();
                            long[] jArr3 = this.read;
                            if (jArr3 != null) {
                                measuredHeight3 = (int) (jArr3[i11] >> 32);
                            }
                            int measuredWidth3 = read2.getMeasuredWidth();
                            long[] jArr4 = this.read;
                            boolean z5 = z3;
                            if (jArr4 != null) {
                                measuredWidth3 = (int) jArr4[i11];
                            }
                            if (this.MediaBrowserCompat$CustomActionResultReceiver[i11] || nallocationresize2d.IconCompatParcelizer() <= BitmapDescriptorFactory.HUE_RED) {
                                z3 = z5;
                            } else {
                                float IconCompatParcelizer3 = ((float) measuredHeight3) - (nallocationresize2d.IconCompatParcelizer() * f);
                                if (i9 == onnotifylistenerfailed2.MediaBrowserCompat$MediaItem - 1) {
                                    IconCompatParcelizer3 += f2;
                                    f2 = BitmapDescriptorFactory.HUE_RED;
                                }
                                int round2 = Math.round(IconCompatParcelizer3);
                                if (round2 < nallocationresize2d.MediaSessionCompat$QueueItem()) {
                                    round2 = nallocationresize2d.MediaSessionCompat$QueueItem();
                                    this.MediaBrowserCompat$CustomActionResultReceiver[i11] = true;
                                    onnotifylistenerfailed2.AlertController$RecycleListView -= nallocationresize2d.IconCompatParcelizer();
                                    z3 = true;
                                } else {
                                    f2 += IconCompatParcelizer3 - ((float) round2);
                                    double d2 = (double) f2;
                                    if (d2 > 1.0d) {
                                        round2++;
                                        f2 -= 1.0f;
                                    } else if (d2 < -1.0d) {
                                        round2--;
                                        f2 += 1.0f;
                                    }
                                    z3 = z5;
                                }
                                int read3 = read(i, nallocationresize2d, onnotifylistenerfailed2.ParcelableVolumeInfo);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                read2.measure(read3, makeMeasureSpec2);
                                measuredWidth3 = read2.getMeasuredWidth();
                                int measuredHeight4 = read2.getMeasuredHeight();
                                MediaBrowserCompat$ItemReceiver(i11, read3, makeMeasureSpec2, read2);
                                this.write.MediaBrowserCompat$ItemReceiver(i11, read2);
                                measuredHeight3 = measuredHeight4;
                            }
                            i5 = Math.max(i10, measuredWidth3 + nallocationresize2d.RatingCompat() + nallocationresize2d.MediaMetadataCompat() + this.write.write(read2));
                            onnotifylistenerfailed2.RatingCompat += measuredHeight3 + nallocationresize2d.MediaDescriptionCompat() + nallocationresize2d.MediaBrowserCompat$MediaItem();
                            int i14 = i2;
                        }
                        onnotifylistenerfailed2.MediaBrowserCompat$CustomActionResultReceiver = Math.max(onnotifylistenerfailed2.MediaBrowserCompat$CustomActionResultReceiver, i5);
                        i10 = i5;
                    }
                    i9++;
                    i7 = 1;
                }
                int i15 = i2;
                if (z3 && i8 != onnotifylistenerfailed2.RatingCompat) {
                    i7 = 1;
                    z2 = true;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private int read(int i, nAllocationResize2D nallocationresize2d, int i2) {
        CardIoWrapperActivity cardIoWrapperActivity = this.write;
        int paddingLeft = cardIoWrapperActivity.getPaddingLeft();
        int paddingRight = this.write.getPaddingRight();
        int MediaBrowserCompat$ItemReceiver2 = cardIoWrapperActivity.MediaBrowserCompat$ItemReceiver(i, paddingLeft + paddingRight + nallocationresize2d.RatingCompat() + nallocationresize2d.MediaMetadataCompat() + i2, nallocationresize2d.mo33282x50fd9e4a());
        int size = View.MeasureSpec.getSize(MediaBrowserCompat$ItemReceiver2);
        if (size > nallocationresize2d.MediaSessionCompat$Token()) {
            return View.MeasureSpec.makeMeasureSpec(nallocationresize2d.MediaSessionCompat$Token(), View.MeasureSpec.getMode(MediaBrowserCompat$ItemReceiver2));
        }
        return size < nallocationresize2d.ParcelableVolumeInfo() ? View.MeasureSpec.makeMeasureSpec(nallocationresize2d.ParcelableVolumeInfo(), View.MeasureSpec.getMode(MediaBrowserCompat$ItemReceiver2)) : MediaBrowserCompat$ItemReceiver2;
    }

    private int MediaBrowserCompat$ItemReceiver(int i, nAllocationResize2D nallocationresize2d, int i2) {
        CardIoWrapperActivity cardIoWrapperActivity = this.write;
        int paddingTop = cardIoWrapperActivity.getPaddingTop();
        int paddingBottom = this.write.getPaddingBottom();
        int read2 = cardIoWrapperActivity.read(i, paddingTop + paddingBottom + nallocationresize2d.MediaDescriptionCompat() + nallocationresize2d.MediaBrowserCompat$MediaItem() + i2, nallocationresize2d.write());
        int size = View.MeasureSpec.getSize(read2);
        if (size > nallocationresize2d.MediaBrowserCompat$SearchResultReceiver()) {
            return View.MeasureSpec.makeMeasureSpec(nallocationresize2d.MediaBrowserCompat$SearchResultReceiver(), View.MeasureSpec.getMode(read2));
        }
        return size < nallocationresize2d.MediaSessionCompat$QueueItem() ? View.MeasureSpec.makeMeasureSpec(nallocationresize2d.MediaSessionCompat$QueueItem(), View.MeasureSpec.getMode(read2)) : read2;
    }

    public final void IconCompatParcelizer(int i, int i2, int i3) {
        int i4;
        int i5;
        int MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 == 0 || MediaBrowserCompat$CustomActionResultReceiver2 == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (MediaBrowserCompat$CustomActionResultReceiver2 == 2 || MediaBrowserCompat$CustomActionResultReceiver2 == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid flex direction: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2);
            throw new IllegalArgumentException(sb.toString());
        }
        List<onNotifyListenerFailed> m_ = this.write.mo33254m_();
        if (i4 == 1073741824) {
            int MediaBrowserCompat$MediaItem = this.write.MediaBrowserCompat$MediaItem() + i3;
            int i6 = 0;
            if (m_.size() == 1) {
                m_.get(0).MediaBrowserCompat$CustomActionResultReceiver = i5 - i3;
            } else if (m_.size() >= 2) {
                int k_ = this.write.mo33252k_();
                if (k_ == 1) {
                    onNotifyListenerFailed onnotifylistenerfailed = new onNotifyListenerFailed();
                    onnotifylistenerfailed.MediaBrowserCompat$CustomActionResultReceiver = i5 - MediaBrowserCompat$MediaItem;
                    m_.add(0, onnotifylistenerfailed);
                } else if (k_ == 2) {
                    this.write.setFlexLines(MediaBrowserCompat$CustomActionResultReceiver(m_, i5, MediaBrowserCompat$MediaItem));
                } else if (k_ != 3) {
                    if (k_ != 4) {
                        if (k_ == 5 && MediaBrowserCompat$MediaItem < i5) {
                            float size2 = ((float) (i5 - MediaBrowserCompat$MediaItem)) / ((float) m_.size());
                            int size3 = m_.size();
                            float f = 0.0f;
                            while (i6 < size3) {
                                onNotifyListenerFailed onnotifylistenerfailed2 = m_.get(i6);
                                float f2 = ((float) onnotifylistenerfailed2.MediaBrowserCompat$CustomActionResultReceiver) + size2;
                                if (i6 == m_.size() - 1) {
                                    f2 += f;
                                    f = 0.0f;
                                }
                                int round = Math.round(f2);
                                f += f2 - ((float) round);
                                if (f > 1.0f) {
                                    round++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    round--;
                                    f += 1.0f;
                                }
                                onnotifylistenerfailed2.MediaBrowserCompat$CustomActionResultReceiver = round;
                                i6++;
                            }
                        }
                    } else if (MediaBrowserCompat$MediaItem >= i5) {
                        this.write.setFlexLines(MediaBrowserCompat$CustomActionResultReceiver(m_, i5, MediaBrowserCompat$MediaItem));
                    } else {
                        int size4 = (i5 - MediaBrowserCompat$MediaItem) / (m_.size() << 1);
                        ArrayList arrayList = new ArrayList();
                        onNotifyListenerFailed onnotifylistenerfailed3 = new onNotifyListenerFailed();
                        onnotifylistenerfailed3.MediaBrowserCompat$CustomActionResultReceiver = size4;
                        for (onNotifyListenerFailed add : m_) {
                            arrayList.add(onnotifylistenerfailed3);
                            arrayList.add(add);
                            arrayList.add(onnotifylistenerfailed3);
                        }
                        this.write.setFlexLines(arrayList);
                    }
                } else if (MediaBrowserCompat$MediaItem < i5) {
                    float size5 = ((float) (i5 - MediaBrowserCompat$MediaItem)) / ((float) (m_.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = m_.size();
                    float f3 = 0.0f;
                    while (i6 < size6) {
                        arrayList2.add(m_.get(i6));
                        if (i6 != m_.size() - 1) {
                            onNotifyListenerFailed onnotifylistenerfailed4 = new onNotifyListenerFailed();
                            if (i6 == m_.size() - 2) {
                                onnotifylistenerfailed4.MediaBrowserCompat$CustomActionResultReceiver = Math.round(f3 + size5);
                                f3 = 0.0f;
                            } else {
                                onnotifylistenerfailed4.MediaBrowserCompat$CustomActionResultReceiver = Math.round(size5);
                            }
                            f3 += size5 - ((float) onnotifylistenerfailed4.MediaBrowserCompat$CustomActionResultReceiver);
                            if (f3 > 1.0f) {
                                onnotifylistenerfailed4.MediaBrowserCompat$CustomActionResultReceiver++;
                                f3 -= 1.0f;
                            } else if (f3 < -1.0f) {
                                onnotifylistenerfailed4.MediaBrowserCompat$CustomActionResultReceiver--;
                                f3 += 1.0f;
                            }
                            arrayList2.add(onnotifylistenerfailed4);
                        }
                        i6++;
                    }
                    this.write.setFlexLines(arrayList2);
                }
            }
        }
    }

    private static List<onNotifyListenerFailed> MediaBrowserCompat$CustomActionResultReceiver(List<onNotifyListenerFailed> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        onNotifyListenerFailed onnotifylistenerfailed = new onNotifyListenerFailed();
        onnotifylistenerfailed.MediaBrowserCompat$CustomActionResultReceiver = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(onnotifylistenerfailed);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(onnotifylistenerfailed);
            }
        }
        return arrayList;
    }

    public final void write(int i) {
        View read2;
        int i2 = i;
        if (i2 < this.write.mo33253l_()) {
            int MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$CustomActionResultReceiver();
            if (this.write.IconCompatParcelizer() == 4) {
                int[] iArr = this.IconCompatParcelizer;
                List<onNotifyListenerFailed> m_ = this.write.mo33254m_();
                int size = m_.size();
                for (int i3 = iArr != null ? iArr[i2] : 0; i3 < size; i3++) {
                    onNotifyListenerFailed onnotifylistenerfailed = m_.get(i3);
                    int i4 = onnotifylistenerfailed.MediaBrowserCompat$MediaItem;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = onnotifylistenerfailed.read + i5;
                        if (!(i5 >= this.write.mo33253l_() || (read2 = this.write.read(i6)) == null || read2.getVisibility() == 8)) {
                            nAllocationResize2D nallocationresize2d = (nAllocationResize2D) read2.getLayoutParams();
                            if (nallocationresize2d.MediaBrowserCompat$CustomActionResultReceiver() == -1 || nallocationresize2d.MediaBrowserCompat$CustomActionResultReceiver() == 4) {
                                if (MediaBrowserCompat$CustomActionResultReceiver2 == 0 || MediaBrowserCompat$CustomActionResultReceiver2 == 1) {
                                    IconCompatParcelizer(read2, onnotifylistenerfailed.MediaBrowserCompat$CustomActionResultReceiver, i6);
                                } else if (MediaBrowserCompat$CustomActionResultReceiver2 == 2 || MediaBrowserCompat$CustomActionResultReceiver2 == 3) {
                                    MediaBrowserCompat$CustomActionResultReceiver(read2, onnotifylistenerfailed.MediaBrowserCompat$CustomActionResultReceiver, i6);
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Invalid flex direction: ");
                                    sb.append(MediaBrowserCompat$CustomActionResultReceiver2);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (onNotifyListenerFailed next : this.write.mo33254m_()) {
                Iterator<Integer> it = next.MediaMetadataCompat.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next2 = it.next();
                        View read3 = this.write.read(next2.intValue());
                        if (MediaBrowserCompat$CustomActionResultReceiver2 == 0 || MediaBrowserCompat$CustomActionResultReceiver2 == 1) {
                            IconCompatParcelizer(read3, next.MediaBrowserCompat$CustomActionResultReceiver, next2.intValue());
                        } else if (MediaBrowserCompat$CustomActionResultReceiver2 == 2 || MediaBrowserCompat$CustomActionResultReceiver2 == 3) {
                            MediaBrowserCompat$CustomActionResultReceiver(read3, next.MediaBrowserCompat$CustomActionResultReceiver, next2.intValue());
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid flex direction: ");
                            sb2.append(MediaBrowserCompat$CustomActionResultReceiver2);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                }
            }
        }
    }

    private void IconCompatParcelizer(View view, int i, int i2) {
        int i3;
        nAllocationResize2D nallocationresize2d = (nAllocationResize2D) view.getLayoutParams();
        int MediaDescriptionCompat = nallocationresize2d.MediaDescriptionCompat();
        int min = Math.min(Math.max(((i - MediaDescriptionCompat) - nallocationresize2d.MediaBrowserCompat$MediaItem()) - this.write.write(view), nallocationresize2d.MediaSessionCompat$QueueItem()), nallocationresize2d.MediaBrowserCompat$SearchResultReceiver());
        long[] jArr = this.read;
        if (jArr != null) {
            i3 = (int) jArr[i2];
        } else {
            i3 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        MediaBrowserCompat$ItemReceiver(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.write.MediaBrowserCompat$ItemReceiver(i2, view);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(View view, int i, int i2) {
        int i3;
        nAllocationResize2D nallocationresize2d = (nAllocationResize2D) view.getLayoutParams();
        int RatingCompat = nallocationresize2d.RatingCompat();
        int min = Math.min(Math.max(((i - RatingCompat) - nallocationresize2d.MediaMetadataCompat()) - this.write.write(view), nallocationresize2d.ParcelableVolumeInfo()), nallocationresize2d.MediaSessionCompat$Token());
        long[] jArr = this.read;
        if (jArr != null) {
            i3 = (int) (jArr[i2] >> 32);
        } else {
            i3 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        MediaBrowserCompat$ItemReceiver(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.write.MediaBrowserCompat$ItemReceiver(i2, view);
    }

    public final void MediaBrowserCompat$ItemReceiver(View view, onNotifyListenerFailed onnotifylistenerfailed, int i, int i2, int i3, int i4) {
        nAllocationResize2D nallocationresize2d = (nAllocationResize2D) view.getLayoutParams();
        int IconCompatParcelizer2 = this.write.IconCompatParcelizer();
        if (nallocationresize2d.MediaBrowserCompat$CustomActionResultReceiver() != -1) {
            IconCompatParcelizer2 = nallocationresize2d.MediaBrowserCompat$CustomActionResultReceiver();
        }
        int i5 = onnotifylistenerfailed.MediaBrowserCompat$CustomActionResultReceiver;
        if (IconCompatParcelizer2 != 0) {
            if (IconCompatParcelizer2 != 1) {
                if (IconCompatParcelizer2 == 2) {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + nallocationresize2d.MediaDescriptionCompat()) - nallocationresize2d.MediaBrowserCompat$MediaItem()) / 2;
                    if (this.write.MediaMetadataCompat() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (IconCompatParcelizer2 != 3) {
                    if (IconCompatParcelizer2 != 4) {
                        return;
                    }
                } else if (this.write.MediaMetadataCompat() != 2) {
                    int max = Math.max(onnotifylistenerfailed.f2910x50fd9e4a - view.getBaseline(), nallocationresize2d.MediaDescriptionCompat());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((onnotifylistenerfailed.f2910x50fd9e4a - view.getMeasuredHeight()) + view.getBaseline(), nallocationresize2d.MediaBrowserCompat$MediaItem());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (this.write.MediaMetadataCompat() != 2) {
                int i8 = i2 + i5;
                int measuredHeight2 = view.getMeasuredHeight();
                view.layout(i, (i8 - measuredHeight2) - nallocationresize2d.MediaBrowserCompat$MediaItem(), i3, i8 - nallocationresize2d.MediaBrowserCompat$MediaItem());
                return;
            } else {
                int measuredHeight3 = view.getMeasuredHeight();
                view.layout(i, (i2 - i5) + measuredHeight3 + nallocationresize2d.MediaDescriptionCompat(), i3, (i4 - i5) + view.getMeasuredHeight() + nallocationresize2d.MediaDescriptionCompat());
                return;
            }
        }
        if (this.write.MediaMetadataCompat() != 2) {
            view.layout(i, i2 + nallocationresize2d.MediaDescriptionCompat(), i3, i4 + nallocationresize2d.MediaDescriptionCompat());
            return;
        }
        view.layout(i, i2 - nallocationresize2d.MediaBrowserCompat$MediaItem(), i3, i4 - nallocationresize2d.MediaBrowserCompat$MediaItem());
    }

    public final void write(View view, onNotifyListenerFailed onnotifylistenerfailed, boolean z, int i, int i2, int i3, int i4) {
        nAllocationResize2D nallocationresize2d = (nAllocationResize2D) view.getLayoutParams();
        int IconCompatParcelizer2 = this.write.IconCompatParcelizer();
        if (nallocationresize2d.MediaBrowserCompat$CustomActionResultReceiver() != -1) {
            IconCompatParcelizer2 = nallocationresize2d.MediaBrowserCompat$CustomActionResultReceiver();
        }
        int i5 = onnotifylistenerfailed.MediaBrowserCompat$CustomActionResultReceiver;
        if (IconCompatParcelizer2 != 0) {
            if (IconCompatParcelizer2 != 1) {
                if (IconCompatParcelizer2 == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + setOnSuggestionListener.IconCompatParcelizer(marginLayoutParams)) - setOnSuggestionListener.MediaBrowserCompat$CustomActionResultReceiver(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                } else if (!(IconCompatParcelizer2 == 3 || IconCompatParcelizer2 == 4)) {
                    return;
                }
            } else if (!z) {
                int measuredWidth2 = view.getMeasuredWidth();
                view.layout(((i + i5) - measuredWidth2) - nallocationresize2d.MediaMetadataCompat(), i2, ((i3 + i5) - view.getMeasuredWidth()) - nallocationresize2d.MediaMetadataCompat(), i4);
                return;
            } else {
                int measuredWidth3 = view.getMeasuredWidth();
                view.layout((i - i5) + measuredWidth3 + nallocationresize2d.RatingCompat(), i2, (i3 - i5) + view.getMeasuredWidth() + nallocationresize2d.RatingCompat(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + nallocationresize2d.RatingCompat(), i2, i3 + nallocationresize2d.RatingCompat(), i4);
            return;
        }
        view.layout(i - nallocationresize2d.MediaMetadataCompat(), i2, i3 - nallocationresize2d.MediaMetadataCompat(), i4);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        long[] jArr = this.read;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.read = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length << 1;
            if (length >= i) {
                i = length;
            }
            this.read = Arrays.copyOf(this.read, i);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        long[] jArr = this.MediaBrowserCompat$ItemReceiver;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.MediaBrowserCompat$ItemReceiver = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length << 1;
            if (length >= i) {
                i = length;
            }
            this.MediaBrowserCompat$ItemReceiver = Arrays.copyOf(this.MediaBrowserCompat$ItemReceiver, i);
        }
    }

    private void MediaBrowserCompat$ItemReceiver(int i, int i2, int i3, View view) {
        long[] jArr = this.MediaBrowserCompat$ItemReceiver;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.read;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }

    public final void read(int i) {
        int[] iArr = this.IconCompatParcelizer;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.IconCompatParcelizer = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length << 1;
            if (length >= i) {
                i = length;
            }
            this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, i);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<onNotifyListenerFailed> list, int i) {
        int i2 = this.IconCompatParcelizer[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.IconCompatParcelizer;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.MediaBrowserCompat$ItemReceiver;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    /* renamed from: o.nAllocationSyncAll$write */
    static class write implements Comparable<write> {
        int IconCompatParcelizer;
        int MediaBrowserCompat$ItemReceiver;

        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            write write = (write) obj;
            int i = this.MediaBrowserCompat$ItemReceiver;
            int i2 = write.MediaBrowserCompat$ItemReceiver;
            if (i != i2) {
                return i - i2;
            }
            return this.IconCompatParcelizer - write.IconCompatParcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Order{order=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", index=");
            sb.append(this.IconCompatParcelizer);
            sb.append('}');
            return sb.toString();
        }
    }
}

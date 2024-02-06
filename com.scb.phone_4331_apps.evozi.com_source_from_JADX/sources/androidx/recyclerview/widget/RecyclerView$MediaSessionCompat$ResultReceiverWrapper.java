package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$QueueItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p040o.SwitchCompat;
import p040o.setIconifiedByDefault;
import p040o.setMeasureWithLargestChildEnabled;
import p040o.setMinWidth;
import p040o.setOptimizationLevel;

public final class RecyclerView$MediaSessionCompat$ResultReceiverWrapper {
    ArrayList<RecyclerView.setContentView> IconCompatParcelizer = null;
    final ArrayList<RecyclerView.setContentView> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList<>();
    public RecyclerView$MediaSessionCompat$QueueItem MediaBrowserCompat$ItemReceiver;
    final List<RecyclerView.setContentView> MediaBrowserCompat$MediaItem = Collections.unmodifiableList(this.write);
    final /* synthetic */ RecyclerView MediaDescriptionCompat;
    RecyclerView.setBackgroundResource MediaMetadataCompat;
    private int RatingCompat = 2;
    int read = 2;
    final ArrayList<RecyclerView.setContentView> write = new ArrayList<>();

    public RecyclerView$MediaSessionCompat$ResultReceiverWrapper(RecyclerView recyclerView) {
        this.MediaDescriptionCompat = recyclerView;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.RatingCompat = this.read + (this.MediaDescriptionCompat.AppCompatActivity != null ? this.MediaDescriptionCompat.AppCompatActivity.PlaybackStateCompat : 0);
        for (int size = this.MediaBrowserCompat$CustomActionResultReceiver.size() - 1; size >= 0 && this.MediaBrowserCompat$CustomActionResultReceiver.size() > this.RatingCompat; size--) {
            IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.get(size), true);
            this.MediaBrowserCompat$CustomActionResultReceiver.remove(size);
        }
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i, int i2, long j) {
        setcontentview.MediaMetadataCompat = this.MediaDescriptionCompat;
        int i3 = setcontentview.MediaBrowserCompat$CustomActionResultReceiver;
        long MediaBrowserCompat$ItemReceiver2 = RecyclerView.MediaBrowserCompat$ItemReceiver();
        boolean z = false;
        if (j != Long.MAX_VALUE) {
            long j2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(i3).IconCompatParcelizer;
            if (!(j2 == 0 || j2 + MediaBrowserCompat$ItemReceiver2 < j)) {
                return false;
            }
        }
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.MediaDescriptionCompat.MediaDescriptionCompat;
        setcontentview.MediaSessionCompat$QueueItem = i;
        if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) {
            setcontentview.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i);
        }
        setcontentview.read = (setcontentview.read & -520) | 1;
        setMeasureWithLargestChildEnabled.read("RV OnBindView");
        iconCompatParcelizer.write(setcontentview, i, setcontentview.mo1615t_());
        List<Object> list = setcontentview.MediaBrowserCompat$SearchResultReceiver;
        if (list != null) {
            list.clear();
        }
        setcontentview.read &= -1025;
        ViewGroup.LayoutParams layoutParams = setcontentview.write.getLayoutParams();
        if (layoutParams instanceof RecyclerView.MediaDescriptionCompat) {
            ((RecyclerView.MediaDescriptionCompat) layoutParams).read = true;
        }
        setMeasureWithLargestChildEnabled.MediaBrowserCompat$CustomActionResultReceiver();
        long MediaBrowserCompat$ItemReceiver3 = RecyclerView.MediaBrowserCompat$ItemReceiver();
        RecyclerView$MediaSessionCompat$QueueItem.write IconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(setcontentview.MediaBrowserCompat$CustomActionResultReceiver);
        IconCompatParcelizer2.IconCompatParcelizer = RecyclerView$MediaSessionCompat$QueueItem.write(IconCompatParcelizer2.IconCompatParcelizer, MediaBrowserCompat$ItemReceiver3 - MediaBrowserCompat$ItemReceiver2);
        AccessibilityManager accessibilityManager = this.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            z = true;
        }
        if (z) {
            View view = setcontentview.write;
            if (SwitchCompat.MediaBrowserCompat$MediaItem(view) == 0) {
                SwitchCompat.write(view, 1);
            }
            if (!SwitchCompat.setBackgroundResource(view)) {
                setcontentview.read |= 16384;
                SwitchCompat.read(view, this.MediaDescriptionCompat.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
        if (this.MediaDescriptionCompat.ExpandedMenuView.MediaBrowserCompat$ItemReceiver) {
            setcontentview.ParcelableVolumeInfo = i2;
        }
        return true;
    }

    public final int MediaBrowserCompat$ItemReceiver(int i) {
        if (i >= 0) {
            RecyclerView.Keep keep = this.MediaDescriptionCompat.ExpandedMenuView;
            if (i < (keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem)) {
                if (!this.MediaDescriptionCompat.ExpandedMenuView.MediaBrowserCompat$ItemReceiver) {
                    return i;
                }
                return this.MediaDescriptionCompat.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(i, 0);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid position ");
        sb.append(i);
        sb.append(". State ");
        sb.append("item count is ");
        RecyclerView.Keep keep2 = this.MediaDescriptionCompat.ExpandedMenuView;
        sb.append(keep2.MediaBrowserCompat$ItemReceiver ? keep2.MediaDescriptionCompat - keep2.IconCompatParcelizer : keep2.MediaBrowserCompat$MediaItem);
        sb.append(this.MediaDescriptionCompat.read());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final View MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return MediaBrowserCompat$ItemReceiver(i, false, Long.MAX_VALUE).write;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0214, code lost:
        if (((r9.read & 4) != 0) == false) goto L_0x0216;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.recyclerview.widget.RecyclerView.setContentView MediaBrowserCompat$ItemReceiver(int r18, boolean r19, long r20) {
        /*
            r17 = this;
            r6 = r17
            r3 = r18
            if (r3 < 0) goto L_0x0264
            androidx.recyclerview.widget.RecyclerView r0 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r0.ExpandedMenuView
            boolean r1 = r0.MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x0014
            int r1 = r0.MediaDescriptionCompat
            int r0 = r0.IconCompatParcelizer
            int r1 = r1 - r0
            goto L_0x0016
        L_0x0014:
            int r1 = r0.MediaBrowserCompat$MediaItem
        L_0x0016:
            if (r3 >= r1) goto L_0x0264
            androidx.recyclerview.widget.RecyclerView r0 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r0.ExpandedMenuView
            boolean r0 = r0.MediaBrowserCompat$ItemReceiver
            r1 = 0
            r7 = 1
            r8 = 0
            if (r0 == 0) goto L_0x002b
            androidx.recyclerview.widget.RecyclerView$setContentView r0 = r17.read((int) r18)
            if (r0 == 0) goto L_0x002c
            r2 = r7
            goto L_0x002d
        L_0x002b:
            r0 = r1
        L_0x002c:
            r2 = r8
        L_0x002d:
            if (r0 != 0) goto L_0x006e
            androidx.recyclerview.widget.RecyclerView$setContentView r0 = r6.IconCompatParcelizer((int) r3, (boolean) r8)
            if (r0 == 0) goto L_0x006e
            boolean r4 = r6.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView.setContentView) r0)
            if (r4 != 0) goto L_0x006d
            int r4 = r0.read
            r4 = r4 | 4
            r0.read = r4
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r4 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r4 == 0) goto L_0x0047
            r4 = r7
            goto L_0x0048
        L_0x0047:
            r4 = r8
        L_0x0048:
            if (r4 == 0) goto L_0x0057
            androidx.recyclerview.widget.RecyclerView r4 = r6.MediaDescriptionCompat
            android.view.View r5 = r0.write
            r4.removeDetachedView(r5, r8)
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r4 = r0.MediaSessionCompat$ResultReceiverWrapper
            r4.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r0)
            goto L_0x0068
        L_0x0057:
            int r4 = r0.read
            r4 = r4 & 32
            if (r4 == 0) goto L_0x005f
            r4 = r7
            goto L_0x0060
        L_0x005f:
            r4 = r8
        L_0x0060:
            if (r4 == 0) goto L_0x0068
            int r4 = r0.read
            r4 = r4 & -33
            r0.read = r4
        L_0x0068:
            r6.read((androidx.recyclerview.widget.RecyclerView.setContentView) r0)
            r0 = r1
            goto L_0x006e
        L_0x006d:
            r2 = r7
        L_0x006e:
            if (r0 != 0) goto L_0x01a7
            androidx.recyclerview.widget.RecyclerView r4 = r6.MediaDescriptionCompat
            o.setTag r4 = r4.MediaBrowserCompat$MediaItem
            int r4 = r4.MediaBrowserCompat$CustomActionResultReceiver(r3, r8)
            if (r4 < 0) goto L_0x0162
            androidx.recyclerview.widget.RecyclerView r5 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r5 = r5.MediaDescriptionCompat
            int r5 = r5.IconCompatParcelizer()
            if (r4 >= r5) goto L_0x0162
            androidx.recyclerview.widget.RecyclerView r5 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r5 = r5.MediaDescriptionCompat
            int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver((int) r4)
            androidx.recyclerview.widget.RecyclerView r9 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r9 = r9.MediaDescriptionCompat
            boolean r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            if (r9 == 0) goto L_0x00a5
            androidx.recyclerview.widget.RecyclerView r0 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r0 = r0.MediaDescriptionCompat
            long r9 = r0.MediaBrowserCompat$ItemReceiver((int) r4)
            androidx.recyclerview.widget.RecyclerView$setContentView r0 = r6.MediaBrowserCompat$CustomActionResultReceiver(r9, r5, r8)
            if (r0 == 0) goto L_0x00a5
            r0.MediaSessionCompat$QueueItem = r4
            r2 = r7
        L_0x00a5:
            if (r0 != 0) goto L_0x00ff
            androidx.recyclerview.widget.RecyclerView$setBackgroundResource r4 = r6.MediaMetadataCompat
            if (r4 == 0) goto L_0x00ff
            android.view.View r4 = r4.MediaBrowserCompat$CustomActionResultReceiver()
            if (r4 == 0) goto L_0x00ff
            androidx.recyclerview.widget.RecyclerView r0 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$setContentView r0 = r0.MediaBrowserCompat$MediaItem((android.view.View) r4)
            if (r0 == 0) goto L_0x00e2
            int r4 = r0.read
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x00c1
            r4 = r7
            goto L_0x00c2
        L_0x00c1:
            r4 = r8
        L_0x00c2:
            if (r4 != 0) goto L_0x00c5
            goto L_0x00ff
        L_0x00c5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r6.MediaDescriptionCompat
            java.lang.String r1 = r1.read()
            r0.append(r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00e2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r6.MediaDescriptionCompat
            java.lang.String r1 = r1.read()
            r0.append(r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00ff:
            if (r0 != 0) goto L_0x011e
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$QueueItem r0 = r6.MediaBrowserCompat$ItemReceiver
            if (r0 != 0) goto L_0x010c
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$QueueItem r0 = new androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$QueueItem
            r0.<init>()
            r6.MediaBrowserCompat$ItemReceiver = r0
        L_0x010c:
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$QueueItem r0 = r6.MediaBrowserCompat$ItemReceiver
            androidx.recyclerview.widget.RecyclerView$setContentView r0 = r0.read((int) r5)
            if (r0 == 0) goto L_0x011e
            r0.MediaBrowserCompat$CustomActionResultReceiver()
            boolean r4 = androidx.recyclerview.widget.RecyclerView.write
            if (r4 == 0) goto L_0x011e
            r6.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r0)
        L_0x011e:
            if (r0 != 0) goto L_0x01a7
            long r15 = androidx.recyclerview.widget.RecyclerView.MediaBrowserCompat$ItemReceiver()
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x013a
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$QueueItem r9 = r6.MediaBrowserCompat$ItemReceiver
            r10 = r5
            r11 = r15
            r13 = r20
            boolean r0 = r9.MediaBrowserCompat$ItemReceiver(r10, r11, r13)
            if (r0 != 0) goto L_0x013a
            return r1
        L_0x013a:
            androidx.recyclerview.widget.RecyclerView r0 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r0 = r0.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView r1 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$setContentView r0 = r0.MediaBrowserCompat$CustomActionResultReceiver((android.view.ViewGroup) r1, (int) r5)
            boolean r1 = androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
            if (r1 == 0) goto L_0x0157
            android.view.View r1 = r0.write
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.MediaBrowserCompat$ItemReceiver((android.view.View) r1)
            if (r1 == 0) goto L_0x0157
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r1)
            r0.RatingCompat = r4
        L_0x0157:
            long r9 = androidx.recyclerview.widget.RecyclerView.MediaBrowserCompat$ItemReceiver()
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$QueueItem r1 = r6.MediaBrowserCompat$ItemReceiver
            long r9 = r9 - r15
            r1.MediaBrowserCompat$ItemReceiver(r5, r9)
            goto L_0x01a7
        L_0x0162:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Inconsistency detected. Invalid item position "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "(offset:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ")."
            r0.append(r1)
            java.lang.String r1 = "state:"
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$Keep r1 = r1.ExpandedMenuView
            boolean r2 = r1.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x018f
            int r2 = r1.MediaDescriptionCompat
            int r1 = r1.IconCompatParcelizer
            int r2 = r2 - r1
            goto L_0x0191
        L_0x018f:
            int r2 = r1.MediaBrowserCompat$MediaItem
        L_0x0191:
            r0.append(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r6.MediaDescriptionCompat
            java.lang.String r1 = r1.read()
            r0.append(r1)
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x01a7:
            r9 = r0
            r10 = r2
            if (r10 == 0) goto L_0x01e1
            androidx.recyclerview.widget.RecyclerView r0 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r0.ExpandedMenuView
            boolean r0 = r0.MediaBrowserCompat$ItemReceiver
            if (r0 != 0) goto L_0x01e1
            int r0 = r9.read
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x01bb
            r0 = r7
            goto L_0x01bc
        L_0x01bb:
            r0 = r8
        L_0x01bc:
            if (r0 == 0) goto L_0x01e1
            int r0 = r9.read
            r0 = r0 & -8193(0xffffffffffffdfff, float:NaN)
            r0 = r0 | r8
            r9.read = r0
            androidx.recyclerview.widget.RecyclerView r0 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r0.ExpandedMenuView
            boolean r0 = r0.MediaSessionCompat$QueueItem
            if (r0 == 0) goto L_0x01e1
            androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(r9)
            r9.mo1615t_()
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$IconCompatParcelizer r0 = new androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$IconCompatParcelizer
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$IconCompatParcelizer r0 = r0.IconCompatParcelizer(r9)
            androidx.recyclerview.widget.RecyclerView r1 = r6.MediaDescriptionCompat
            r1.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r9, (androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat.IconCompatParcelizer) r0)
        L_0x01e1:
            androidx.recyclerview.widget.RecyclerView r0 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$Keep r0 = r0.ExpandedMenuView
            boolean r0 = r0.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x01f6
            int r0 = r9.read
            r0 = r0 & r7
            if (r0 != 0) goto L_0x01f0
            r0 = r8
            goto L_0x01f1
        L_0x01f0:
            r0 = r7
        L_0x01f1:
            if (r0 == 0) goto L_0x01f6
            r9.ParcelableVolumeInfo = r3
            goto L_0x0216
        L_0x01f6:
            int r0 = r9.read
            r0 = r0 & r7
            if (r0 != 0) goto L_0x01fd
            r0 = r8
            goto L_0x01fe
        L_0x01fd:
            r0 = r7
        L_0x01fe:
            if (r0 == 0) goto L_0x0218
            int r0 = r9.read
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0208
            r0 = r7
            goto L_0x0209
        L_0x0208:
            r0 = r8
        L_0x0209:
            if (r0 != 0) goto L_0x0218
            int r0 = r9.read
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0213
            r0 = r7
            goto L_0x0214
        L_0x0213:
            r0 = r8
        L_0x0214:
            if (r0 != 0) goto L_0x0218
        L_0x0216:
            r0 = r8
            goto L_0x022b
        L_0x0218:
            androidx.recyclerview.widget.RecyclerView r0 = r6.MediaDescriptionCompat
            o.setTag r0 = r0.MediaBrowserCompat$MediaItem
            int r2 = r0.MediaBrowserCompat$ItemReceiver(r3)
            r0 = r17
            r1 = r9
            r3 = r18
            r4 = r20
            boolean r0 = r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r2, r3, r4)
        L_0x022b:
            android.view.View r1 = r9.write
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 != 0) goto L_0x0241
            androidx.recyclerview.widget.RecyclerView r1 = r6.MediaDescriptionCompat
            android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r1 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r1
            android.view.View r2 = r9.write
            r2.setLayoutParams(r1)
            goto L_0x0259
        L_0x0241:
            androidx.recyclerview.widget.RecyclerView r2 = r6.MediaDescriptionCompat
            boolean r2 = r2.checkLayoutParams(r1)
            if (r2 != 0) goto L_0x0257
            androidx.recyclerview.widget.RecyclerView r2 = r6.MediaDescriptionCompat
            android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r1 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r1
            android.view.View r2 = r9.write
            r2.setLayoutParams(r1)
            goto L_0x0259
        L_0x0257:
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r1 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r1
        L_0x0259:
            r1.MediaBrowserCompat$SearchResultReceiver = r9
            if (r10 == 0) goto L_0x0260
            if (r0 == 0) goto L_0x0260
            goto L_0x0261
        L_0x0260:
            r7 = r8
        L_0x0261:
            r1.MediaBrowserCompat$ItemReceiver = r7
            return r9
        L_0x0264:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid item position "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "). Item count:"
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$Keep r1 = r1.ExpandedMenuView
            boolean r2 = r1.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x028c
            int r2 = r1.MediaDescriptionCompat
            int r1 = r1.IconCompatParcelizer
            int r2 = r2 - r1
            goto L_0x028e
        L_0x028c:
            int r2 = r1.MediaBrowserCompat$MediaItem
        L_0x028e:
            r0.append(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r6.MediaDescriptionCompat
            java.lang.String r1 = r1.read()
            r0.append(r1)
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(int, boolean, long):androidx.recyclerview.widget.RecyclerView$setContentView");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview) {
        if (setcontentview.write instanceof ViewGroup) {
            MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) setcontentview.write, false);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    public final void IconCompatParcelizer(View view) {
        RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver2 = RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(view);
        boolean z = true;
        if ((MediaBrowserCompat$CustomActionResultReceiver2.read & 256) != 0) {
            this.MediaDescriptionCompat.removeDetachedView(view, false);
        }
        if (MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper != null) {
            MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
        } else {
            if ((MediaBrowserCompat$CustomActionResultReceiver2.read & 32) == 0) {
                z = false;
            }
            if (z) {
                MediaBrowserCompat$CustomActionResultReceiver2.read &= -33;
            }
        }
        read(MediaBrowserCompat$CustomActionResultReceiver2);
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        for (int size = this.MediaBrowserCompat$CustomActionResultReceiver.size() - 1; size >= 0; size--) {
            IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.get(size), true);
            this.MediaBrowserCompat$CustomActionResultReceiver.remove(size);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.clear();
        if (RecyclerView.IconCompatParcelizer) {
            setOptimizationLevel.IconCompatParcelizer iconCompatParcelizer = this.MediaDescriptionCompat.setIcon;
            int[] iArr = iconCompatParcelizer.write;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            iconCompatParcelizer.IconCompatParcelizer = 0;
        }
    }

    public final void IconCompatParcelizer(RecyclerView.setContentView setcontentview, boolean z) {
        RecyclerView.read(setcontentview);
        if ((setcontentview.read & 16384) != 0) {
            setcontentview.read = (setcontentview.read & -16385) | 0;
            SwitchCompat.read(setcontentview.write, (setIconifiedByDefault) null);
        }
        if (z) {
            write(setcontentview);
        }
        setcontentview.MediaMetadataCompat = null;
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            this.MediaBrowserCompat$ItemReceiver = new RecyclerView$MediaSessionCompat$QueueItem();
        }
        this.MediaBrowserCompat$ItemReceiver.read(setcontentview);
    }

    /* access modifiers changed from: package-private */
    public final void write(View view) {
        RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver2 = RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(view);
        boolean z = true;
        if (!((MediaBrowserCompat$CustomActionResultReceiver2.read & 12) != 0)) {
            if ((MediaBrowserCompat$CustomActionResultReceiver2.read & 2) != 0) {
                RecyclerView.MediaMetadataCompat mediaMetadataCompat = this.MediaDescriptionCompat.AlertController$RecycleListView;
                if (!(mediaMetadataCompat == null || mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2, MediaBrowserCompat$CustomActionResultReceiver2.mo1615t_()))) {
                    if (this.IconCompatParcelizer == null) {
                        this.IconCompatParcelizer = new ArrayList<>();
                    }
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper = this;
                    MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = true;
                    this.IconCompatParcelizer.add(MediaBrowserCompat$CustomActionResultReceiver2);
                    return;
                }
            }
        }
        if ((MediaBrowserCompat$CustomActionResultReceiver2.read & 4) != 0) {
            if ((MediaBrowserCompat$CustomActionResultReceiver2.read & 8) == 0) {
                z = false;
            }
            if (!z && !this.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(this.MediaDescriptionCompat.read());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper = this;
        MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = false;
        this.write.add(MediaBrowserCompat$CustomActionResultReceiver2);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview) {
        if (setcontentview.IconCompatParcelizer) {
            this.IconCompatParcelizer.remove(setcontentview);
        } else {
            this.write.remove(setcontentview);
        }
        setcontentview.MediaSessionCompat$ResultReceiverWrapper = null;
        setcontentview.IconCompatParcelizer = false;
        setcontentview.read &= -33;
    }

    private RecyclerView.setContentView read(int i) {
        int size;
        int MediaBrowserCompat$CustomActionResultReceiver2;
        ArrayList<RecyclerView.setContentView> arrayList = this.IconCompatParcelizer;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < size) {
                RecyclerView.setContentView setcontentview = this.IconCompatParcelizer.get(i2);
                if ((setcontentview.read & 32) == 0) {
                    z = false;
                }
                if (!z) {
                    int i3 = setcontentview.ParcelableVolumeInfo;
                    if (i3 == -1) {
                        i3 = setcontentview.MediaSessionCompat$QueueItem;
                    }
                    if (i3 == i) {
                        setcontentview.read |= 32;
                        return setcontentview;
                    }
                }
                i2++;
            } else if (!this.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver || (MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(i, 0)) <= 0 || MediaBrowserCompat$CustomActionResultReceiver2 >= this.MediaDescriptionCompat.MediaDescriptionCompat.IconCompatParcelizer()) {
                return null;
            } else {
                long MediaBrowserCompat$ItemReceiver2 = this.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
                int i4 = 0;
                while (i4 < size) {
                    RecyclerView.setContentView setcontentview2 = this.IconCompatParcelizer.get(i4);
                    if (((setcontentview2.read & 32) != 0) || setcontentview2.MediaBrowserCompat$ItemReceiver != MediaBrowserCompat$ItemReceiver2) {
                        i4++;
                    } else {
                        setcontentview2.read |= 32;
                        return setcontentview2;
                    }
                }
                return null;
            }
        }
    }

    private RecyclerView.setContentView IconCompatParcelizer(int i, boolean z) {
        View view;
        RecyclerView.setContentView setcontentview;
        int size = this.write.size();
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 < size) {
                setcontentview = this.write.get(i2);
                if (!((setcontentview.read & 32) != 0)) {
                    int i3 = setcontentview.ParcelableVolumeInfo;
                    if (i3 == -1) {
                        i3 = setcontentview.MediaSessionCompat$QueueItem;
                    }
                    if (i3 != i) {
                        continue;
                    } else {
                        if ((setcontentview.read & 4) != 0) {
                            continue;
                        } else if (this.MediaDescriptionCompat.ExpandedMenuView.MediaBrowserCompat$ItemReceiver) {
                            break;
                        } else {
                            if ((setcontentview.read & 8) == 0) {
                                z2 = false;
                            }
                            if (!z2) {
                                break;
                            }
                        }
                    }
                }
                i2++;
            } else {
                if (!z) {
                    setMinWidth setminwidth = this.MediaDescriptionCompat.MediaSessionCompat$ResultReceiverWrapper;
                    int size2 = setminwidth.MediaBrowserCompat$ItemReceiver.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            view = null;
                            break;
                        }
                        view = setminwidth.MediaBrowserCompat$ItemReceiver.get(i4);
                        RecyclerView.setContentView MediaBrowserCompat$ItemReceiver2 = setminwidth.read.MediaBrowserCompat$ItemReceiver(view);
                        int i5 = MediaBrowserCompat$ItemReceiver2.ParcelableVolumeInfo;
                        if (i5 == -1) {
                            i5 = MediaBrowserCompat$ItemReceiver2.MediaSessionCompat$QueueItem;
                        }
                        if (i5 == i) {
                            if ((MediaBrowserCompat$ItemReceiver2.read & 4) != 0) {
                                continue;
                            } else {
                                if (!((MediaBrowserCompat$ItemReceiver2.read & 8) != 0)) {
                                    break;
                                }
                            }
                        }
                        i4++;
                    }
                    if (view != null) {
                        RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver2 = RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(view);
                        setMinWidth setminwidth2 = this.MediaDescriptionCompat.MediaSessionCompat$ResultReceiverWrapper;
                        int read2 = setminwidth2.read.read(view);
                        if (read2 < 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("view is not a child, cannot hide ");
                            sb.append(view);
                            throw new IllegalArgumentException(sb.toString());
                        } else if (setminwidth2.IconCompatParcelizer.write(read2)) {
                            setminwidth2.IconCompatParcelizer.read(read2);
                            if (setminwidth2.MediaBrowserCompat$ItemReceiver.remove(view)) {
                                setminwidth2.read.write(view);
                            }
                            int MediaBrowserCompat$ItemReceiver3 = this.MediaDescriptionCompat.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(view);
                            if (MediaBrowserCompat$ItemReceiver3 != -1) {
                                this.MediaDescriptionCompat.MediaSessionCompat$ResultReceiverWrapper.write(MediaBrowserCompat$ItemReceiver3);
                                write(view);
                                MediaBrowserCompat$CustomActionResultReceiver2.read |= 8224;
                                return MediaBrowserCompat$CustomActionResultReceiver2;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("layout index should not be -1 after unhiding a view:");
                            sb2.append(MediaBrowserCompat$CustomActionResultReceiver2);
                            sb2.append(this.MediaDescriptionCompat.read());
                            throw new IllegalStateException(sb2.toString());
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("trying to unhide a view that was not hidden");
                            sb3.append(view);
                            throw new RuntimeException(sb3.toString());
                        }
                    }
                }
                int size3 = this.MediaBrowserCompat$CustomActionResultReceiver.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    RecyclerView.setContentView setcontentview2 = this.MediaBrowserCompat$CustomActionResultReceiver.get(i6);
                    if (!((setcontentview2.read & 4) != 0)) {
                        int i7 = setcontentview2.ParcelableVolumeInfo;
                        if (i7 == -1) {
                            i7 = setcontentview2.MediaSessionCompat$QueueItem;
                        }
                        if (i7 == i) {
                            if (!z) {
                                this.MediaBrowserCompat$CustomActionResultReceiver.remove(i6);
                            }
                            return setcontentview2;
                        }
                    }
                }
                return null;
            }
        }
        setcontentview.read |= 32;
        return setcontentview;
    }

    private RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver(long j, int i, boolean z) {
        boolean z2 = true;
        for (int size = this.write.size() - 1; size >= 0; size--) {
            RecyclerView.setContentView setcontentview = this.write.get(size);
            if (setcontentview.MediaBrowserCompat$ItemReceiver == j) {
                if ((setcontentview.read & 32) != 0) {
                    continue;
                } else if (i == setcontentview.MediaBrowserCompat$CustomActionResultReceiver) {
                    setcontentview.read |= 32;
                    if ((setcontentview.read & 8) == 0) {
                        z2 = false;
                    }
                    if (z2 && !this.MediaDescriptionCompat.ExpandedMenuView.MediaBrowserCompat$ItemReceiver) {
                        setcontentview.read = (setcontentview.read & -15) | 2;
                    }
                    return setcontentview;
                } else if (!z) {
                    this.write.remove(size);
                    this.MediaDescriptionCompat.removeDetachedView(setcontentview.write, false);
                    RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver2 = RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(setcontentview.write);
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper = null;
                    MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = false;
                    MediaBrowserCompat$CustomActionResultReceiver2.read &= -33;
                    read(MediaBrowserCompat$CustomActionResultReceiver2);
                }
            }
        }
        for (int size2 = this.MediaBrowserCompat$CustomActionResultReceiver.size() - 1; size2 >= 0; size2--) {
            RecyclerView.setContentView setcontentview2 = this.MediaBrowserCompat$CustomActionResultReceiver.get(size2);
            if (setcontentview2.MediaBrowserCompat$ItemReceiver == j) {
                if (i == setcontentview2.MediaBrowserCompat$CustomActionResultReceiver) {
                    if (!z) {
                        this.MediaBrowserCompat$CustomActionResultReceiver.remove(size2);
                    }
                    return setcontentview2;
                } else if (!z) {
                    IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.get(size2), true);
                    this.MediaBrowserCompat$CustomActionResultReceiver.remove(size2);
                    return null;
                }
            }
        }
        return null;
    }

    private void write(RecyclerView.setContentView setcontentview) {
        if (this.MediaDescriptionCompat.MediaDescriptionCompat != null) {
            this.MediaDescriptionCompat.MediaDescriptionCompat.write(setcontentview);
        }
        if (this.MediaDescriptionCompat.ExpandedMenuView != null) {
            this.MediaDescriptionCompat.MenuItemWrapperICS$CollapsibleActionViewWrapper.write(setcontentview);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver() {
        int size = this.MediaBrowserCompat$CustomActionResultReceiver.size();
        for (int i = 0; i < size; i++) {
            RecyclerView.setContentView setcontentview = this.MediaBrowserCompat$CustomActionResultReceiver.get(i);
            setcontentview.MediaBrowserCompat$MediaItem = -1;
            setcontentview.ParcelableVolumeInfo = -1;
        }
        int size2 = this.write.size();
        for (int i2 = 0; i2 < size2; i2++) {
            RecyclerView.setContentView setcontentview2 = this.write.get(i2);
            setcontentview2.MediaBrowserCompat$MediaItem = -1;
            setcontentview2.ParcelableVolumeInfo = -1;
        }
        ArrayList<RecyclerView.setContentView> arrayList = this.IconCompatParcelizer;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                RecyclerView.setContentView setcontentview3 = this.IconCompatParcelizer.get(i3);
                setcontentview3.MediaBrowserCompat$MediaItem = -1;
                setcontentview3.ParcelableVolumeInfo = -1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        int size = this.MediaBrowserCompat$CustomActionResultReceiver.size();
        for (int i = 0; i < size; i++) {
            RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) this.MediaBrowserCompat$CustomActionResultReceiver.get(i).write.getLayoutParams();
            if (mediaDescriptionCompat != null) {
                mediaDescriptionCompat.read = true;
            }
        }
    }

    public final View IconCompatParcelizer(int i) {
        return MediaBrowserCompat$ItemReceiver(i, false, Long.MAX_VALUE).write;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(androidx.recyclerview.widget.RecyclerView.setContentView r7) {
        /*
            r6 = this;
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r0 = r7.MediaSessionCompat$ResultReceiverWrapper
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = r2
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            if (r0 != 0) goto L_0x011c
            android.view.View r0 = r7.write
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x011c
            int r0 = r7.read
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x001b
            r0 = r2
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            if (r0 != 0) goto L_0x00fc
            int r0 = r7.read
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0026
            r0 = r2
            goto L_0x0027
        L_0x0026:
            r0 = r1
        L_0x0027:
            if (r0 != 0) goto L_0x00df
            int r0 = r7.read
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0039
            android.view.View r0 = r7.write
            boolean r0 = p040o.SwitchCompat.AppCompatViewInflater(r0)
            if (r0 == 0) goto L_0x0039
            r0 = r2
            goto L_0x003a
        L_0x0039:
            r0 = r1
        L_0x003a:
            androidx.recyclerview.widget.RecyclerView r3 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r3 = r3.MediaDescriptionCompat
            if (r3 == 0) goto L_0x004e
            if (r0 == 0) goto L_0x004e
            androidx.recyclerview.widget.RecyclerView r3 = r6.MediaDescriptionCompat
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r3 = r3.MediaDescriptionCompat
            boolean r3 = r3.MediaBrowserCompat$ItemReceiver(r7)
            if (r3 == 0) goto L_0x004e
            r3 = r2
            goto L_0x004f
        L_0x004e:
            r3 = r1
        L_0x004f:
            if (r3 != 0) goto L_0x0067
            int r3 = r7.read
            r3 = r3 & 16
            if (r3 != 0) goto L_0x0061
            android.view.View r3 = r7.write
            boolean r3 = p040o.SwitchCompat.AppCompatViewInflater(r3)
            if (r3 != 0) goto L_0x0061
            r3 = r2
            goto L_0x0062
        L_0x0061:
            r3 = r1
        L_0x0062:
            if (r3 != 0) goto L_0x0067
            r3 = r1
            goto L_0x00ce
        L_0x0067:
            int r3 = r6.RatingCompat
            if (r3 <= 0) goto L_0x00c7
            int r3 = r7.read
            r3 = r3 & 526(0x20e, float:7.37E-43)
            if (r3 == 0) goto L_0x0073
            r3 = r2
            goto L_0x0074
        L_0x0073:
            r3 = r1
        L_0x0074:
            if (r3 != 0) goto L_0x00c7
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$setContentView> r3 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r3.size()
            int r4 = r6.RatingCompat
            if (r3 < r4) goto L_0x0094
            if (r3 <= 0) goto L_0x0094
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$setContentView> r4 = r6.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r4 = r4.get(r1)
            androidx.recyclerview.widget.RecyclerView$setContentView r4 = (androidx.recyclerview.widget.RecyclerView.setContentView) r4
            r6.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView.setContentView) r4, (boolean) r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$setContentView> r4 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r4.remove(r1)
            int r3 = r3 + -1
        L_0x0094:
            boolean r4 = androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
            if (r4 == 0) goto L_0x00c0
            if (r3 <= 0) goto L_0x00c0
            androidx.recyclerview.widget.RecyclerView r4 = r6.MediaDescriptionCompat
            o.setOptimizationLevel$IconCompatParcelizer r4 = r4.setIcon
            int r5 = r7.MediaSessionCompat$QueueItem
            boolean r4 = r4.MediaBrowserCompat$ItemReceiver(r5)
            if (r4 != 0) goto L_0x00c0
        L_0x00a6:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x00bf
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$setContentView> r4 = r6.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.RecyclerView$setContentView r4 = (androidx.recyclerview.widget.RecyclerView.setContentView) r4
            int r4 = r4.MediaSessionCompat$QueueItem
            androidx.recyclerview.widget.RecyclerView r5 = r6.MediaDescriptionCompat
            o.setOptimizationLevel$IconCompatParcelizer r5 = r5.setIcon
            boolean r4 = r5.MediaBrowserCompat$ItemReceiver(r4)
            if (r4 == 0) goto L_0x00bf
            goto L_0x00a6
        L_0x00bf:
            int r3 = r3 + r2
        L_0x00c0:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$setContentView> r4 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r4.add(r3, r7)
            r3 = r2
            goto L_0x00c8
        L_0x00c7:
            r3 = r1
        L_0x00c8:
            if (r3 != 0) goto L_0x00ce
            r6.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView.setContentView) r7, (boolean) r2)
            r1 = r2
        L_0x00ce:
            androidx.recyclerview.widget.RecyclerView r2 = r6.MediaDescriptionCompat
            o.setStatusBarBackground r2 = r2.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r2.write(r7)
            if (r3 != 0) goto L_0x00de
            if (r1 != 0) goto L_0x00de
            if (r0 == 0) goto L_0x00de
            r0 = 0
            r7.MediaMetadataCompat = r0
        L_0x00de:
            return
        L_0x00df:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r7.append(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r6.MediaDescriptionCompat
            java.lang.String r0 = r0.read()
            r7.append(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x00fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r0.append(r1)
            r0.append(r7)
            androidx.recyclerview.widget.RecyclerView r7 = r6.MediaDescriptionCompat
            java.lang.String r7 = r7.read()
            r0.append(r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x011c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Scrapped or attached views may not be recycled. isScrap:"
            r0.append(r3)
            androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r3 = r7.MediaSessionCompat$ResultReceiverWrapper
            if (r3 == 0) goto L_0x012c
            r3 = r2
            goto L_0x012d
        L_0x012c:
            r3 = r1
        L_0x012d:
            r0.append(r3)
            java.lang.String r3 = " isAttached:"
            r0.append(r3)
            android.view.View r7 = r7.write
            android.view.ViewParent r7 = r7.getParent()
            if (r7 == 0) goto L_0x013e
            r1 = r2
        L_0x013e:
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView r7 = r6.MediaDescriptionCompat
            java.lang.String r7 = r7.read()
            r0.append(r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper.read(androidx.recyclerview.widget.RecyclerView$setContentView):void");
    }

    private boolean IconCompatParcelizer(RecyclerView.setContentView setcontentview) {
        if ((setcontentview.read & 8) != 0) {
            return this.MediaDescriptionCompat.ExpandedMenuView.MediaBrowserCompat$ItemReceiver;
        }
        if (setcontentview.MediaSessionCompat$QueueItem < 0 || setcontentview.MediaSessionCompat$QueueItem >= this.MediaDescriptionCompat.MediaDescriptionCompat.IconCompatParcelizer()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Inconsistency detected. Invalid view holder adapter position");
            sb.append(setcontentview);
            sb.append(this.MediaDescriptionCompat.read());
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (!this.MediaDescriptionCompat.ExpandedMenuView.MediaBrowserCompat$ItemReceiver && this.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(setcontentview.MediaSessionCompat$QueueItem) != setcontentview.MediaBrowserCompat$CustomActionResultReceiver) {
            return false;
        } else {
            if (!this.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver || setcontentview.MediaBrowserCompat$ItemReceiver == this.MediaDescriptionCompat.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(setcontentview.MediaSessionCompat$QueueItem)) {
                return true;
            }
            return false;
        }
    }
}

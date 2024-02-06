package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.AlertController$RecycleListView;
import p040o.SwitchCompat;
import p040o.getSupportImageTintList;
import p040o.setContentId;
import p040o.setGuidelineBegin;
import p040o.setTextOn;

public class StaggeredGridLayoutManager extends RecyclerView$MediaBrowserCompat$SearchResultReceiver implements RecyclerView.PlaybackStateCompat.read {
    private int ActionMenuItemView = -1;
    private final getSupportImageTintList AppCompatViewInflater;
    public int IconCompatParcelizer = -1;
    private final Rect ListMenuItemView = new Rect();
    setContentId MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem = false;
    private final Runnable MediaBrowserCompat$SearchResultReceiver = new Runnable() {
        public final void run() {
            StaggeredGridLayoutManager.this.RatingCompat();
        }
    };
    private int MediaDescriptionCompat = 2;
    private boolean MediaMetadataCompat;
    private boolean RatingCompat;
    private final write read = new write();
    private C0068xf916f2be setCheckable = new C0068xf916f2be();
    private int setChecked = PKIFailureInfo.systemUnavail;
    private read setExpandedFormat;
    private StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] setForceShowIcon;
    private boolean setGroupDividerEnabled = true;
    private BitSet setIcon;
    private boolean setItemInvoker = false;
    private setContentId setPadding;
    private int setPopupCallback;
    private int[] setShortcut;
    boolean write = false;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C5530x1a4d18ae write2 = write(context, attributeSet, i, i2);
        int i3 = write2.MediaBrowserCompat$ItemReceiver;
        if (i3 == 0 || i3 == 1) {
            if (this.setExpandedFormat == null) {
                super.read((String) null);
            }
            if (i3 != this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = i3;
                setContentId setcontentid = this.MediaBrowserCompat$CustomActionResultReceiver;
                this.MediaBrowserCompat$CustomActionResultReceiver = this.setPadding;
                this.setPadding = setcontentid;
                RecyclerView recyclerView = this.setHasDecor;
                if (recyclerView != null) {
                    recyclerView.requestLayout();
                }
            }
            m25x50fd9e4a(write2.write);
            IconCompatParcelizer(write2.read);
            this.AppCompatViewInflater = new getSupportImageTintList();
            this.MediaBrowserCompat$CustomActionResultReceiver = setContentId.MediaBrowserCompat$ItemReceiver(this, this.MediaBrowserCompat$ItemReceiver);
            this.setPadding = setContentId.MediaBrowserCompat$ItemReceiver(this, 1 - this.MediaBrowserCompat$ItemReceiver);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: o_ */
    public final boolean mo1438o_() {
        return this.MediaDescriptionCompat != 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean RatingCompat() {
        int i;
        int i2;
        if (!(MediaSessionCompat$ResultReceiverWrapper() == 0 || this.MediaDescriptionCompat == 0 || !this.AlertController$RecycleListView)) {
            if (this.setItemInvoker) {
                int MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
                if (MediaSessionCompat$ResultReceiverWrapper == 0) {
                    i = 0;
                } else {
                    RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat(MediaSessionCompat$ResultReceiverWrapper - 1).getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
                    i = setcontentview.ParcelableVolumeInfo;
                    if (i == -1) {
                        i = setcontentview.MediaSessionCompat$QueueItem;
                    }
                }
                if (MediaSessionCompat$ResultReceiverWrapper() != 0) {
                    RecyclerView.setContentView setcontentview2 = ((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat(0).getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
                    if (setcontentview2.ParcelableVolumeInfo == -1) {
                        int i3 = setcontentview2.MediaSessionCompat$QueueItem;
                    }
                }
            } else {
                if (MediaSessionCompat$ResultReceiverWrapper() != 0) {
                    RecyclerView.setContentView setcontentview3 = ((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat(0).getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
                    i2 = setcontentview3.ParcelableVolumeInfo;
                    if (i2 == -1) {
                        i2 = setcontentview3.MediaSessionCompat$QueueItem;
                    }
                } else {
                    i2 = 0;
                }
                int MediaSessionCompat$ResultReceiverWrapper2 = MediaSessionCompat$ResultReceiverWrapper();
                if (MediaSessionCompat$ResultReceiverWrapper2 != 0) {
                    RecyclerView.setContentView setcontentview4 = ((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat(MediaSessionCompat$ResultReceiverWrapper2 - 1).getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
                    if (setcontentview4.ParcelableVolumeInfo == -1) {
                        int i4 = setcontentview4.MediaSessionCompat$QueueItem;
                    }
                }
            }
            if (i == 0 && MediaBrowserCompat$MediaItem() != null) {
                C0068xf916f2be staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver = this.setCheckable;
                int[] iArr = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = null;
                this.AppCompatActivity = true;
                RecyclerView recyclerView = this.setHasDecor;
                if (recyclerView != null) {
                    recyclerView.requestLayout();
                }
                return true;
            }
        }
        return false;
    }

    public final void MediaBrowserCompat$MediaItem(int i) {
        if (i == 0) {
            RatingCompat();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper) {
        super.MediaBrowserCompat$CustomActionResultReceiver(recyclerView, recyclerView$MediaSessionCompat$ResultReceiverWrapper);
        Runnable runnable = this.MediaBrowserCompat$SearchResultReceiver;
        RecyclerView recyclerView2 = this.setHasDecor;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver = this.setForceShowIcon[i];
            staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.clear();
            staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.write = PKIFailureInfo.systemUnavail;
            staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = PKIFailureInfo.systemUnavail;
            staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.read = 0;
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r10 == r11) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        if (r10 == r11) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View MediaBrowserCompat$MediaItem() {
        /*
            r12 = this;
            int r0 = r12.MediaSessionCompat$ResultReceiverWrapper()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.IconCompatParcelizer
            r2.<init>(r3)
            int r3 = r12.IconCompatParcelizer
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.MediaBrowserCompat$ItemReceiver
            r5 = -1
            if (r3 != r1) goto L_0x0027
            androidx.recyclerview.widget.RecyclerView r3 = r12.setHasDecor
            int r3 = p040o.SwitchCompat.m3079x50fd9e4a(r3)
            if (r3 == r1) goto L_0x0022
            r3 = r4
            goto L_0x0023
        L_0x0022:
            r3 = r1
        L_0x0023:
            if (r3 == 0) goto L_0x0027
            r3 = r1
            goto L_0x0028
        L_0x0027:
            r3 = r5
        L_0x0028:
            boolean r6 = r12.setItemInvoker
            if (r6 == 0) goto L_0x002e
            r6 = r5
            goto L_0x0032
        L_0x002e:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x0032:
            if (r0 >= r6) goto L_0x0035
            r5 = r1
        L_0x0035:
            if (r0 == r6) goto L_0x00aa
            android.view.View r7 = r12.MediaDescriptionCompat((int) r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$IconCompatParcelizer r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x005b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
            boolean r9 = r12.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver) r9)
            if (r9 == 0) goto L_0x0054
            return r7
        L_0x0054:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            r2.clear(r9)
        L_0x005b:
            int r0 = r0 + r5
            if (r0 == r6) goto L_0x0035
            android.view.View r9 = r12.MediaDescriptionCompat((int) r0)
            boolean r10 = r12.setItemInvoker
            if (r10 == 0) goto L_0x0078
            o.setContentId r10 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r10.IconCompatParcelizer(r7)
            o.setContentId r11 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r11 = r11.IconCompatParcelizer(r9)
            if (r10 >= r11) goto L_0x0075
            return r7
        L_0x0075:
            if (r10 != r11) goto L_0x008b
            goto L_0x0089
        L_0x0078:
            o.setContentId r10 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r10.MediaBrowserCompat$ItemReceiver(r7)
            o.setContentId r11 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r11 = r11.MediaBrowserCompat$ItemReceiver(r9)
            if (r10 <= r11) goto L_0x0087
            return r7
        L_0x0087:
            if (r10 != r11) goto L_0x008b
        L_0x0089:
            r10 = r1
            goto L_0x008c
        L_0x008b:
            r10 = r4
        L_0x008c:
            if (r10 == 0) goto L_0x0035
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$IconCompatParcelizer r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a1
            r8 = r1
            goto L_0x00a2
        L_0x00a1:
            r8 = r4
        L_0x00a2:
            if (r3 >= 0) goto L_0x00a6
            r9 = r1
            goto L_0x00a7
        L_0x00a6:
            r9 = r4
        L_0x00a7:
            if (r8 == r9) goto L_0x0035
            return r7
        L_0x00aa:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.MediaBrowserCompat$MediaItem():android.view.View");
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver) {
        if (this.setItemInvoker) {
            int i = staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            if (i == Integer.MIN_VALUE) {
                staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
                i = staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            }
            if (i < this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver()) {
                staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.get(staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.size() - 1).getLayoutParams();
                return true;
            }
        } else {
            int i2 = staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.write;
            if (i2 == Integer.MIN_VALUE) {
                staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.read();
                i2 = staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.write;
            }
            if (i2 > this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat()) {
                staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.get(0).getLayoutParams();
                return true;
            }
        }
        return false;
    }

    public final void read(String str) {
        if (this.setExpandedFormat == null) {
            super.read(str);
        }
    }

    private void MediaMetadataCompat() {
        if (this.MediaBrowserCompat$ItemReceiver != 1) {
            if (SwitchCompat.m3079x50fd9e4a(this.setHasDecor) == 1) {
                this.setItemInvoker = !this.write;
                return;
            }
        }
        this.setItemInvoker = this.write;
    }

    public final void read(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.MediaBrowserCompat$ItemReceiver == 1) {
            i4 = IconCompatParcelizer(i2, rect.height() + paddingTop, SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(this.setHasDecor));
            i3 = IconCompatParcelizer(i, (this.setPopupCallback * this.IconCompatParcelizer) + paddingLeft, SwitchCompat.MediaSessionCompat$Token(this.setHasDecor));
        } else {
            i3 = IconCompatParcelizer(i, rect.width() + paddingLeft, SwitchCompat.MediaSessionCompat$Token(this.setHasDecor));
            i4 = IconCompatParcelizer(i2, (this.setPopupCallback * this.IconCompatParcelizer) + paddingTop, SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(this.setHasDecor));
        }
        this.setHasDecor.setMeasuredDimension(i3, i4);
    }

    public final void read(RecyclerView.Keep keep) {
        super.read(keep);
        this.ActionMenuItemView = -1;
        this.setChecked = PKIFailureInfo.systemUnavail;
        this.setExpandedFormat = null;
        this.read.IconCompatParcelizer();
    }

    /* renamed from: q_ */
    public final boolean mo1407q_() {
        return this.setExpandedFormat == null;
    }

    public final int write(RecyclerView.Keep keep) {
        return MediaDescriptionCompat(keep);
    }

    private int MediaDescriptionCompat(RecyclerView.Keep keep) {
        if (MediaSessionCompat$ResultReceiverWrapper() == 0) {
            return 0;
        }
        return AlertController$RecycleListView.IconCompatParcelizer(keep, this.MediaBrowserCompat$CustomActionResultReceiver, read(!this.setGroupDividerEnabled), write(!this.setGroupDividerEnabled), this, this.setGroupDividerEnabled, this.setItemInvoker);
    }

    public final int MediaBrowserCompat$SearchResultReceiver(RecyclerView.Keep keep) {
        return MediaDescriptionCompat(keep);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.Keep keep) {
        return RatingCompat(keep);
    }

    private int RatingCompat(RecyclerView.Keep keep) {
        if (MediaSessionCompat$ResultReceiverWrapper() == 0) {
            return 0;
        }
        return AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(keep, this.MediaBrowserCompat$CustomActionResultReceiver, read(!this.setGroupDividerEnabled), write(!this.setGroupDividerEnabled), this, this.setGroupDividerEnabled);
    }

    public final int MediaBrowserCompat$ItemReceiver(RecyclerView.Keep keep) {
        return RatingCompat(keep);
    }

    public final int IconCompatParcelizer(RecyclerView.Keep keep) {
        return MediaBrowserCompat$MediaItem(keep);
    }

    private int MediaBrowserCompat$MediaItem(RecyclerView.Keep keep) {
        if (MediaSessionCompat$ResultReceiverWrapper() == 0) {
            return 0;
        }
        return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(keep, this.MediaBrowserCompat$CustomActionResultReceiver, read(!this.setGroupDividerEnabled), write(!this.setGroupDividerEnabled), this, this.setGroupDividerEnabled);
    }

    public final int MediaMetadataCompat(RecyclerView.Keep keep) {
        return MediaBrowserCompat$MediaItem(keep);
    }

    private void write(View view, int i, int i2, boolean z) {
        Rect rect = this.ListMenuItemView;
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.MediaMetadataCompat(view));
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) view.getLayoutParams();
        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i, iconCompatParcelizer.leftMargin + this.ListMenuItemView.left, iconCompatParcelizer.rightMargin + this.ListMenuItemView.right);
        int MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(i2, iconCompatParcelizer.topMargin + this.ListMenuItemView.top, iconCompatParcelizer.bottomMargin + this.ListMenuItemView.bottom);
        if (MediaBrowserCompat$CustomActionResultReceiver(view, MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$ItemReceiver3, (RecyclerView.MediaDescriptionCompat) iconCompatParcelizer)) {
            view.measure(MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$ItemReceiver3);
        }
    }

    private static int MediaBrowserCompat$ItemReceiver(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    public final void IconCompatParcelizer(Parcelable parcelable) {
        if (parcelable instanceof read) {
            this.setExpandedFormat = (read) parcelable;
            RecyclerView recyclerView = this.setHasDecor;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* renamed from: n_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable mo1437n_() {
        /*
            r6 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r0 = r6.setExpandedFormat
            if (r0 == 0) goto L_0x000c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$read
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r1 = r6.setExpandedFormat
            r0.<init>((androidx.recyclerview.widget.StaggeredGridLayoutManager.read) r1)
            return r0
        L_0x000c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$read
            r0.<init>()
            boolean r1 = r6.write
            r0.write = r1
            boolean r1 = r6.MediaMetadataCompat
            r0.IconCompatParcelizer = r1
            boolean r1 = r6.RatingCompat
            r0.read = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r1 = r6.setCheckable
            r2 = 0
            if (r1 == 0) goto L_0x0038
            int[] r1 = r1.MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x0038
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r1 = r6.setCheckable
            int[] r1 = r1.MediaBrowserCompat$ItemReceiver
            r0.MediaDescriptionCompat = r1
            int[] r1 = r0.MediaDescriptionCompat
            int r1 = r1.length
            r0.MediaMetadataCompat = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r1 = r6.setCheckable
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver> r1 = r1.IconCompatParcelizer
            r0.MediaBrowserCompat$CustomActionResultReceiver = r1
            goto L_0x003a
        L_0x0038:
            r0.MediaMetadataCompat = r2
        L_0x003a:
            int r1 = r6.MediaSessionCompat$ResultReceiverWrapper()
            r3 = -1
            if (r1 <= 0) goto L_0x00dc
            boolean r1 = r6.MediaMetadataCompat
            r4 = 1
            if (r1 == 0) goto L_0x0062
            int r1 = r6.MediaSessionCompat$ResultReceiverWrapper()
            if (r1 != 0) goto L_0x004e
        L_0x004c:
            r5 = r2
            goto L_0x007a
        L_0x004e:
            int r1 = r1 - r4
            android.view.View r1 = r6.MediaDescriptionCompat((int) r1)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r1 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r1
            androidx.recyclerview.widget.RecyclerView$setContentView r1 = r1.MediaBrowserCompat$SearchResultReceiver
            int r5 = r1.ParcelableVolumeInfo
            if (r5 != r3) goto L_0x007a
            int r5 = r1.MediaSessionCompat$QueueItem
            goto L_0x007a
        L_0x0062:
            int r1 = r6.MediaSessionCompat$ResultReceiverWrapper()
            if (r1 == 0) goto L_0x004c
            android.view.View r1 = r6.MediaDescriptionCompat((int) r2)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r1 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r1
            androidx.recyclerview.widget.RecyclerView$setContentView r1 = r1.MediaBrowserCompat$SearchResultReceiver
            int r5 = r1.ParcelableVolumeInfo
            if (r5 != r3) goto L_0x007a
            int r5 = r1.MediaSessionCompat$QueueItem
        L_0x007a:
            r0.MediaBrowserCompat$ItemReceiver = r5
            boolean r1 = r6.setItemInvoker
            if (r1 == 0) goto L_0x0085
            android.view.View r1 = r6.write((boolean) r4)
            goto L_0x0089
        L_0x0085:
            android.view.View r1 = r6.read((boolean) r4)
        L_0x0089:
            if (r1 != 0) goto L_0x008c
            goto L_0x009d
        L_0x008c:
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r1 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r1
            androidx.recyclerview.widget.RecyclerView$setContentView r1 = r1.MediaBrowserCompat$SearchResultReceiver
            int r4 = r1.ParcelableVolumeInfo
            if (r4 != r3) goto L_0x009c
            int r1 = r1.MediaSessionCompat$QueueItem
            r3 = r1
            goto L_0x009d
        L_0x009c:
            r3 = r4
        L_0x009d:
            r0.RatingCompat = r3
            int r1 = r6.IconCompatParcelizer
            r0.MediaBrowserCompat$MediaItem = r1
            int r1 = r6.IconCompatParcelizer
            int[] r1 = new int[r1]
            r0.MediaBrowserCompat$SearchResultReceiver = r1
        L_0x00a9:
            int r1 = r6.IconCompatParcelizer
            if (r2 >= r1) goto L_0x00e2
            boolean r1 = r6.MediaMetadataCompat
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x00c4
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r1 = r6.setForceShowIcon
            r1 = r1[r2]
            int r1 = r1.write(r3)
            if (r1 == r3) goto L_0x00d5
            o.setContentId r3 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r3.MediaBrowserCompat$ItemReceiver()
            goto L_0x00d4
        L_0x00c4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r1 = r6.setForceShowIcon
            r1 = r1[r2]
            int r1 = r1.MediaBrowserCompat$CustomActionResultReceiver(r3)
            if (r1 == r3) goto L_0x00d5
            o.setContentId r3 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r3.MediaDescriptionCompat()
        L_0x00d4:
            int r1 = r1 - r3
        L_0x00d5:
            int[] r3 = r0.MediaBrowserCompat$SearchResultReceiver
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x00a9
        L_0x00dc:
            r0.MediaBrowserCompat$ItemReceiver = r3
            r0.RatingCompat = r3
            r0.MediaBrowserCompat$MediaItem = r2
        L_0x00e2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1437n_():android.os.Parcelable");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, View view, setTextOn settexton) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof IconCompatParcelizer)) {
            super.read(view, settexton);
            return;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) layoutParams;
        int i = -1;
        if (this.MediaBrowserCompat$ItemReceiver == 0) {
            StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            if (staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver != null) {
                i = staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            }
            settexton.MediaBrowserCompat$CustomActionResultReceiver((Object) setTextOn.IconCompatParcelizer.write(i, 1, -1, -1, false, false));
            return;
        }
        StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver2 != null) {
            i = staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver;
        }
        settexton.MediaBrowserCompat$CustomActionResultReceiver((Object) setTextOn.IconCompatParcelizer.write(-1, -1, i, 1, false, false));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AccessibilityEvent accessibilityEvent) {
        super.MediaBrowserCompat$CustomActionResultReceiver(accessibilityEvent);
        if (MediaSessionCompat$ResultReceiverWrapper() > 0) {
            View read2 = read(false);
            View write2 = write(false);
            if (read2 != null && write2 != null) {
                RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) read2.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
                int i = setcontentview.ParcelableVolumeInfo;
                if (i == -1) {
                    i = setcontentview.MediaSessionCompat$QueueItem;
                }
                RecyclerView.setContentView setcontentview2 = ((RecyclerView.MediaDescriptionCompat) write2.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
                int i2 = setcontentview2.ParcelableVolumeInfo;
                if (i2 == -1) {
                    i2 = setcontentview2.MediaSessionCompat$QueueItem;
                }
                if (i < i2) {
                    accessibilityEvent.setFromIndex(i);
                    accessibilityEvent.setToIndex(i2);
                    return;
                }
                accessibilityEvent.setFromIndex(i2);
                accessibilityEvent.setToIndex(i);
            }
        }
    }

    public final int MediaBrowserCompat$ItemReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        if (this.MediaBrowserCompat$ItemReceiver == 0) {
            return this.IconCompatParcelizer;
        }
        return super.MediaBrowserCompat$ItemReceiver(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep);
    }

    public final int IconCompatParcelizer(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        if (this.MediaBrowserCompat$ItemReceiver == 1) {
            return this.IconCompatParcelizer;
        }
        return super.IconCompatParcelizer(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep);
    }

    private View read(boolean z) {
        int MediaDescriptionCompat2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
        int MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        int MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
        View view = null;
        for (int i = 0; i < MediaSessionCompat$ResultReceiverWrapper; i++) {
            View MediaDescriptionCompat3 = MediaDescriptionCompat(i);
            int MediaBrowserCompat$ItemReceiver3 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat3);
            if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaDescriptionCompat3) > MediaDescriptionCompat2 && MediaBrowserCompat$ItemReceiver3 < MediaBrowserCompat$ItemReceiver2) {
                if (MediaBrowserCompat$ItemReceiver3 >= MediaDescriptionCompat2 || !z) {
                    return MediaDescriptionCompat3;
                }
                if (view == null) {
                    view = MediaDescriptionCompat3;
                }
            }
        }
        return view;
    }

    private View write(boolean z) {
        int MediaDescriptionCompat2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
        int MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        View view = null;
        for (int MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper() - 1; MediaSessionCompat$ResultReceiverWrapper >= 0; MediaSessionCompat$ResultReceiverWrapper--) {
            View MediaDescriptionCompat3 = MediaDescriptionCompat(MediaSessionCompat$ResultReceiverWrapper);
            int MediaBrowserCompat$ItemReceiver3 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat3);
            int IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaDescriptionCompat3);
            if (IconCompatParcelizer2 > MediaDescriptionCompat2 && MediaBrowserCompat$ItemReceiver3 < MediaBrowserCompat$ItemReceiver2) {
                if (IconCompatParcelizer2 <= MediaBrowserCompat$ItemReceiver2 || !z) {
                    return MediaDescriptionCompat3;
                }
                if (view == null) {
                    view = MediaDescriptionCompat3;
                }
            }
        }
        return view;
    }

    private void IconCompatParcelizer(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, boolean z) {
        int MediaBrowserCompat$ItemReceiver2;
        int read2 = read((int) PKIFailureInfo.systemUnavail);
        if (read2 != Integer.MIN_VALUE && (MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver() - read2) > 0) {
            int i = MediaBrowserCompat$ItemReceiver2 - (-IconCompatParcelizer(-MediaBrowserCompat$ItemReceiver2, recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep));
            if (z && i > 0) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write(i);
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, boolean z) {
        int MediaDescriptionCompat2;
        int MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (MediaSessionCompat$ResultReceiverWrapper != Integer.MAX_VALUE && (MediaDescriptionCompat2 = MediaSessionCompat$ResultReceiverWrapper - this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat()) > 0) {
            int IconCompatParcelizer2 = MediaDescriptionCompat2 - IconCompatParcelizer(MediaDescriptionCompat2, recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep);
            if (z && IconCompatParcelizer2 > 0) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write(-IconCompatParcelizer2);
            }
        }
    }

    private void write(int i, RecyclerView.Keep keep) {
        int i2;
        int i3;
        int i4;
        boolean z = false;
        this.AppCompatViewInflater.read = 0;
        this.AppCompatViewInflater.write = i;
        RecyclerView.PlaybackStateCompat playbackStateCompat = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (!(playbackStateCompat != null && playbackStateCompat.RatingCompat) || (i4 = keep.ParcelableVolumeInfo) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            if (this.setItemInvoker == (i4 < i)) {
                i3 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver();
                i2 = 0;
            } else {
                i2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver();
                i3 = 0;
            }
        }
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null && recyclerView.MediaSessionCompat$QueueItem) {
            this.AppCompatViewInflater.MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat() - i2;
            this.AppCompatViewInflater.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver() + i3;
        } else {
            this.AppCompatViewInflater.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.read() + i3;
            this.AppCompatViewInflater.MediaBrowserCompat$SearchResultReceiver = -i2;
        }
        this.AppCompatViewInflater.MediaDescriptionCompat = false;
        this.AppCompatViewInflater.MediaMetadataCompat = true;
        getSupportImageTintList getsupportimagetintlist = this.AppCompatViewInflater;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer() == 0 && this.MediaBrowserCompat$CustomActionResultReceiver.read() == 0) {
            z = true;
        }
        getsupportimagetintlist.MediaBrowserCompat$ItemReceiver = z;
    }

    private void ParcelableVolumeInfo(int i) {
        this.AppCompatViewInflater.MediaBrowserCompat$MediaItem = i;
        getSupportImageTintList getsupportimagetintlist = this.AppCompatViewInflater;
        int i2 = 1;
        if (this.setItemInvoker != (i == -1)) {
            i2 = -1;
        }
        getsupportimagetintlist.MediaBrowserCompat$CustomActionResultReceiver = i2;
    }

    public final void RatingCompat(int i) {
        super.RatingCompat(i);
        for (int i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
            this.setForceShowIcon[i2].IconCompatParcelizer(i);
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver(int i) {
        super.MediaBrowserCompat$SearchResultReceiver(i);
        for (int i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
            this.setForceShowIcon[i2].IconCompatParcelizer(i);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView, int i, int i2) {
        read(i, i2, 2);
    }

    public final void write(RecyclerView recyclerView, int i, int i2) {
        read(i, i2, 1);
    }

    /* renamed from: p_ */
    public final void mo1406p_() {
        C0068xf916f2be staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver = this.setCheckable;
        int[] iArr = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = null;
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView, int i, int i2, int i3) {
        read(i, i2, 8);
    }

    public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2, Object obj) {
        read(i, i2, 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void read(int r9, int r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r8.setItemInvoker
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0022
            int r0 = r8.MediaSessionCompat$ResultReceiverWrapper()
            if (r0 != 0) goto L_0x000e
            goto L_0x003c
        L_0x000e:
            int r0 = r0 - r3
            android.view.View r0 = r8.MediaDescriptionCompat((int) r0)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r0 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r0
            androidx.recyclerview.widget.RecyclerView$setContentView r0 = r0.MediaBrowserCompat$SearchResultReceiver
            int r4 = r0.ParcelableVolumeInfo
            if (r4 != r1) goto L_0x003d
            int r4 = r0.MediaSessionCompat$QueueItem
            goto L_0x003d
        L_0x0022:
            int r0 = r8.MediaSessionCompat$ResultReceiverWrapper()
            if (r0 == 0) goto L_0x003c
            android.view.View r0 = r8.MediaDescriptionCompat((int) r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r0 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r0
            androidx.recyclerview.widget.RecyclerView$setContentView r0 = r0.MediaBrowserCompat$SearchResultReceiver
            int r4 = r0.ParcelableVolumeInfo
            if (r4 != r1) goto L_0x003d
            int r0 = r0.MediaSessionCompat$QueueItem
            r4 = r0
            goto L_0x003d
        L_0x003c:
            r4 = r2
        L_0x003d:
            r0 = 8
            if (r11 != r0) goto L_0x004a
            if (r9 >= r10) goto L_0x0046
            int r5 = r10 + 1
            goto L_0x004c
        L_0x0046:
            int r5 = r9 + 1
            r6 = r10
            goto L_0x004d
        L_0x004a:
            int r5 = r9 + r10
        L_0x004c:
            r6 = r9
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r7 = r8.setCheckable
            r7.IconCompatParcelizer(r6)
            if (r11 == r3) goto L_0x006a
            r7 = 2
            if (r11 == r7) goto L_0x0064
            if (r11 != r0) goto L_0x006f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r11 = r8.setCheckable
            r11.IconCompatParcelizer(r9, r3)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r9 = r8.setCheckable
            r9.read(r10, r3)
            goto L_0x006f
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r11 = r8.setCheckable
            r11.IconCompatParcelizer(r9, r10)
            goto L_0x006f
        L_0x006a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r11 = r8.setCheckable
            r11.read(r9, r10)
        L_0x006f:
            if (r5 > r4) goto L_0x0072
            return
        L_0x0072:
            boolean r9 = r8.setItemInvoker
            if (r9 == 0) goto L_0x0092
            int r9 = r8.MediaSessionCompat$ResultReceiverWrapper()
            if (r9 == 0) goto L_0x00ad
            android.view.View r9 = r8.MediaDescriptionCompat((int) r2)
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r9 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r9
            androidx.recyclerview.widget.RecyclerView$setContentView r9 = r9.MediaBrowserCompat$SearchResultReceiver
            int r10 = r9.ParcelableVolumeInfo
            if (r10 != r1) goto L_0x0090
            int r9 = r9.MediaSessionCompat$QueueItem
        L_0x008e:
            r2 = r9
            goto L_0x00ad
        L_0x0090:
            r2 = r10
            goto L_0x00ad
        L_0x0092:
            int r9 = r8.MediaSessionCompat$ResultReceiverWrapper()
            if (r9 != 0) goto L_0x0099
            goto L_0x00ad
        L_0x0099:
            int r9 = r9 - r3
            android.view.View r9 = r8.MediaDescriptionCompat((int) r9)
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r9 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r9
            androidx.recyclerview.widget.RecyclerView$setContentView r9 = r9.MediaBrowserCompat$SearchResultReceiver
            int r10 = r9.ParcelableVolumeInfo
            if (r10 != r1) goto L_0x0090
            int r9 = r9.MediaSessionCompat$QueueItem
            goto L_0x008e
        L_0x00ad:
            if (r6 > r2) goto L_0x00b6
            androidx.recyclerview.widget.RecyclerView r9 = r8.setHasDecor
            if (r9 == 0) goto L_0x00b6
            r9.requestLayout()
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.read(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f2, code lost:
        if (((r11.MediaBrowserCompat$SearchResultReceiver.read & 2) != 0) != false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01aa, code lost:
        if (((r11.MediaBrowserCompat$SearchResultReceiver.read & 2) != 0) != false) goto L_0x01ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int read(androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r18, p040o.getSupportImageTintList r19, androidx.recyclerview.widget.RecyclerView.Keep r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.util.BitSet r3 = r0.setIcon
            int r4 = r0.IconCompatParcelizer
            r5 = 0
            r6 = 1
            r3.set(r5, r4, r6)
            o.getSupportImageTintList r3 = r0.AppCompatViewInflater
            boolean r3 = r3.MediaBrowserCompat$ItemReceiver
            if (r3 == 0) goto L_0x0020
            int r3 = r2.MediaBrowserCompat$MediaItem
            if (r3 != r6) goto L_0x001d
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x002f
        L_0x001d:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x002f
        L_0x0020:
            int r3 = r2.MediaBrowserCompat$MediaItem
            if (r3 != r6) goto L_0x002a
            int r3 = r2.IconCompatParcelizer
            int r8 = r2.read
            int r3 = r3 + r8
            goto L_0x002f
        L_0x002a:
            int r3 = r2.MediaBrowserCompat$SearchResultReceiver
            int r8 = r2.read
            int r3 = r3 - r8
        L_0x002f:
            int r8 = r2.MediaBrowserCompat$MediaItem
            r9 = r5
        L_0x0032:
            int r10 = r0.IconCompatParcelizer
            if (r9 >= r10) goto L_0x004c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r10 = r0.setForceShowIcon
            r10 = r10[r9]
            java.util.ArrayList<android.view.View> r10 = r10.IconCompatParcelizer
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0049
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r10 = r0.setForceShowIcon
            r10 = r10[r9]
            r0.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver) r10, (int) r8, (int) r3)
        L_0x0049:
            int r9 = r9 + 1
            goto L_0x0032
        L_0x004c:
            boolean r8 = r0.setItemInvoker
            if (r8 == 0) goto L_0x0057
            o.setContentId r8 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8.MediaBrowserCompat$ItemReceiver()
            goto L_0x005d
        L_0x0057:
            o.setContentId r8 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8.MediaDescriptionCompat()
        L_0x005d:
            r9 = r5
        L_0x005e:
            boolean r10 = r19.write(r20)
            r11 = -1
            if (r10 == 0) goto L_0x026f
            o.getSupportImageTintList r10 = r0.AppCompatViewInflater
            boolean r10 = r10.MediaBrowserCompat$ItemReceiver
            if (r10 != 0) goto L_0x0073
            java.util.BitSet r10 = r0.setIcon
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x026f
        L_0x0073:
            int r9 = r2.write
            android.view.View r9 = r1.MediaBrowserCompat$CustomActionResultReceiver((int) r9)
            int r10 = r2.write
            int r12 = r2.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r10 + r12
            r2.write = r10
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$IconCompatParcelizer r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer) r10
            androidx.recyclerview.widget.RecyclerView$setContentView r12 = r10.MediaBrowserCompat$SearchResultReceiver
            int r13 = r12.ParcelableVolumeInfo
            if (r13 != r11) goto L_0x008e
            int r13 = r12.MediaSessionCompat$QueueItem
        L_0x008e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r12 = r0.setCheckable
            int[] r12 = r12.MediaBrowserCompat$ItemReceiver
            if (r12 == 0) goto L_0x009a
            int r14 = r12.length
            if (r13 >= r14) goto L_0x009a
            r12 = r12[r13]
            goto L_0x009b
        L_0x009a:
            r12 = r11
        L_0x009b:
            if (r12 != r11) goto L_0x009f
            r14 = r6
            goto L_0x00a0
        L_0x009f:
            r14 = r5
        L_0x00a0:
            if (r14 == 0) goto L_0x00fc
            int r12 = r2.MediaBrowserCompat$MediaItem
            boolean r12 = r0.MediaSessionCompat$Token(r12)
            if (r12 == 0) goto L_0x00b0
            int r12 = r0.IconCompatParcelizer
            int r12 = r12 - r6
            r14 = r12
            r12 = r11
            goto L_0x00b4
        L_0x00b0:
            int r11 = r0.IconCompatParcelizer
            r14 = r5
            r12 = r6
        L_0x00b4:
            int r15 = r2.MediaBrowserCompat$MediaItem
            r16 = 0
            if (r15 != r6) goto L_0x00d5
            o.setContentId r15 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r15 = r15.MediaDescriptionCompat()
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x00c3:
            if (r14 == r11) goto L_0x00ee
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r7 = r0.setForceShowIcon
            r7 = r7[r14]
            int r5 = r7.write(r15)
            if (r5 >= r4) goto L_0x00d2
            r4 = r5
            r16 = r7
        L_0x00d2:
            int r14 = r14 + r12
            r5 = 0
            goto L_0x00c3
        L_0x00d5:
            o.setContentId r4 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r4.MediaBrowserCompat$ItemReceiver()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00dd:
            if (r14 == r11) goto L_0x00ee
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r7 = r0.setForceShowIcon
            r7 = r7[r14]
            int r15 = r7.MediaBrowserCompat$CustomActionResultReceiver(r4)
            if (r15 <= r5) goto L_0x00ec
            r16 = r7
            r5 = r15
        L_0x00ec:
            int r14 = r14 + r12
            goto L_0x00dd
        L_0x00ee:
            r4 = r16
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r5 = r0.setCheckable
            r5.write(r13)
            int[] r5 = r5.MediaBrowserCompat$ItemReceiver
            int r7 = r4.MediaBrowserCompat$CustomActionResultReceiver
            r5[r13] = r7
            goto L_0x0100
        L_0x00fc:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r4 = r0.setForceShowIcon
            r4 = r4[r12]
        L_0x0100:
            r10.MediaBrowserCompat$CustomActionResultReceiver = r4
            int r5 = r2.MediaBrowserCompat$MediaItem
            if (r5 != r6) goto L_0x010b
            r0.read((android.view.View) r9)
            r5 = 0
            goto L_0x010f
        L_0x010b:
            r5 = 0
            r0.MediaBrowserCompat$ItemReceiver((android.view.View) r9, (int) r5)
        L_0x010f:
            int r7 = r0.MediaBrowserCompat$ItemReceiver
            if (r7 != r6) goto L_0x0134
            int r7 = r0.setPopupCallback
            int r11 = r0.setContentView
            int r12 = r10.width
            int r7 = MediaBrowserCompat$CustomActionResultReceiver(r7, r11, r5, r12, r5)
            int r11 = r0.ParcelableVolumeInfo
            int r12 = r0.MediaSessionCompat$QueueItem
            int r13 = r17.getPaddingTop()
            int r14 = r17.getPaddingBottom()
            int r15 = r10.height
            int r13 = r13 + r14
            int r11 = MediaBrowserCompat$CustomActionResultReceiver(r11, r12, r13, r15, r6)
            r0.write(r9, r7, r11, r5)
            goto L_0x0155
        L_0x0134:
            int r5 = r0.setBackgroundResource
            int r7 = r0.setContentView
            int r11 = r17.getPaddingLeft()
            int r12 = r17.getPaddingRight()
            int r13 = r10.width
            int r11 = r11 + r12
            int r5 = MediaBrowserCompat$CustomActionResultReceiver(r5, r7, r11, r13, r6)
            int r7 = r0.setPopupCallback
            int r11 = r0.MediaSessionCompat$QueueItem
            int r12 = r10.height
            r13 = 0
            int r7 = MediaBrowserCompat$CustomActionResultReceiver(r7, r11, r13, r12, r13)
            r0.write(r9, r5, r7, r13)
        L_0x0155:
            int r5 = r2.MediaBrowserCompat$MediaItem
            if (r5 != r6) goto L_0x0165
            int r5 = r4.write(r8)
            o.setContentId r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r7 = r7.read(r9)
            int r7 = r7 + r5
            goto L_0x0171
        L_0x0165:
            int r7 = r4.MediaBrowserCompat$CustomActionResultReceiver(r8)
            o.setContentId r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r5.read(r9)
            int r5 = r7 - r5
        L_0x0171:
            int r11 = r2.MediaBrowserCompat$MediaItem
            if (r11 != r6) goto L_0x01bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver r10 = r10.MediaBrowserCompat$CustomActionResultReceiver
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$IconCompatParcelizer r11 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer) r11
            r11.MediaBrowserCompat$CustomActionResultReceiver = r10
            java.util.ArrayList<android.view.View> r12 = r10.IconCompatParcelizer
            r12.add(r9)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r10.MediaBrowserCompat$ItemReceiver = r12
            java.util.ArrayList<android.view.View> r13 = r10.IconCompatParcelizer
            int r13 = r13.size()
            if (r13 != r6) goto L_0x0192
            r10.write = r12
        L_0x0192:
            androidx.recyclerview.widget.RecyclerView$setContentView r12 = r11.MediaBrowserCompat$SearchResultReceiver
            int r12 = r12.read
            r12 = r12 & 8
            if (r12 == 0) goto L_0x019c
            r12 = r6
            goto L_0x019d
        L_0x019c:
            r12 = 0
        L_0x019d:
            if (r12 != 0) goto L_0x01ac
            androidx.recyclerview.widget.RecyclerView$setContentView r11 = r11.MediaBrowserCompat$SearchResultReceiver
            int r11 = r11.read
            r11 = r11 & 2
            if (r11 == 0) goto L_0x01a9
            r11 = r6
            goto L_0x01aa
        L_0x01a9:
            r11 = 0
        L_0x01aa:
            if (r11 == 0) goto L_0x01b9
        L_0x01ac:
            int r11 = r10.read
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = r10.MediaDescriptionCompat
            o.setContentId r12 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r12 = r12.read(r9)
            int r11 = r11 + r12
            r10.read = r11
        L_0x01b9:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0201
        L_0x01bc:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver r10 = r10.MediaBrowserCompat$CustomActionResultReceiver
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$IconCompatParcelizer r11 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer) r11
            r11.MediaBrowserCompat$CustomActionResultReceiver = r10
            java.util.ArrayList<android.view.View> r12 = r10.IconCompatParcelizer
            r13 = 0
            r12.add(r13, r9)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r10.write = r12
            java.util.ArrayList<android.view.View> r13 = r10.IconCompatParcelizer
            int r13 = r13.size()
            if (r13 != r6) goto L_0x01da
            r10.MediaBrowserCompat$ItemReceiver = r12
        L_0x01da:
            androidx.recyclerview.widget.RecyclerView$setContentView r13 = r11.MediaBrowserCompat$SearchResultReceiver
            int r13 = r13.read
            r13 = r13 & 8
            if (r13 == 0) goto L_0x01e4
            r13 = r6
            goto L_0x01e5
        L_0x01e4:
            r13 = 0
        L_0x01e5:
            if (r13 != 0) goto L_0x01f4
            androidx.recyclerview.widget.RecyclerView$setContentView r11 = r11.MediaBrowserCompat$SearchResultReceiver
            int r11 = r11.read
            r11 = r11 & 2
            if (r11 == 0) goto L_0x01f1
            r11 = r6
            goto L_0x01f2
        L_0x01f1:
            r11 = 0
        L_0x01f2:
            if (r11 == 0) goto L_0x0201
        L_0x01f4:
            int r11 = r10.read
            androidx.recyclerview.widget.StaggeredGridLayoutManager r13 = r10.MediaDescriptionCompat
            o.setContentId r13 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r13 = r13.read(r9)
            int r11 = r11 + r13
            r10.read = r11
        L_0x0201:
            androidx.recyclerview.widget.RecyclerView r10 = r0.setHasDecor
            int r10 = p040o.SwitchCompat.m3079x50fd9e4a(r10)
            if (r10 == r6) goto L_0x020b
            r10 = 0
            goto L_0x020c
        L_0x020b:
            r10 = r6
        L_0x020c:
            if (r10 == 0) goto L_0x022b
            int r10 = r0.MediaBrowserCompat$ItemReceiver
            if (r10 != r6) goto L_0x022b
            o.setContentId r10 = r0.setPadding
            int r10 = r10.MediaBrowserCompat$ItemReceiver()
            int r11 = r0.IconCompatParcelizer
            int r11 = r11 - r6
            int r13 = r4.MediaBrowserCompat$CustomActionResultReceiver
            int r11 = r11 - r13
            int r13 = r0.setPopupCallback
            int r11 = r11 * r13
            int r10 = r10 - r11
            o.setContentId r11 = r0.setPadding
            int r11 = r11.read(r9)
            int r11 = r10 - r11
            goto L_0x023e
        L_0x022b:
            int r10 = r4.MediaBrowserCompat$CustomActionResultReceiver
            int r11 = r0.setPopupCallback
            o.setContentId r13 = r0.setPadding
            int r10 = r10 * r11
            int r11 = r13.MediaDescriptionCompat()
            int r11 = r11 + r10
            o.setContentId r10 = r0.setPadding
            int r10 = r10.read(r9)
            int r10 = r10 + r11
        L_0x023e:
            int r13 = r0.MediaBrowserCompat$ItemReceiver
            if (r13 != r6) goto L_0x0246
            IconCompatParcelizer(r9, r11, r5, r10, r7)
            goto L_0x0249
        L_0x0246:
            IconCompatParcelizer(r9, r5, r11, r7, r10)
        L_0x0249:
            o.getSupportImageTintList r5 = r0.AppCompatViewInflater
            int r5 = r5.MediaBrowserCompat$MediaItem
            r0.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver) r4, (int) r5, (int) r3)
            o.getSupportImageTintList r5 = r0.AppCompatViewInflater
            r0.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (p040o.getSupportImageTintList) r5)
            o.getSupportImageTintList r5 = r0.AppCompatViewInflater
            boolean r5 = r5.MediaDescriptionCompat
            if (r5 == 0) goto L_0x026a
            boolean r5 = r9.hasFocusable()
            if (r5 == 0) goto L_0x026a
            java.util.BitSet r5 = r0.setIcon
            int r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            r7 = 0
            r5.set(r4, r7)
            goto L_0x026b
        L_0x026a:
            r7 = 0
        L_0x026b:
            r9 = r6
            r5 = r7
            goto L_0x005e
        L_0x026f:
            r7 = r5
            if (r9 != 0) goto L_0x0277
            o.getSupportImageTintList r3 = r0.AppCompatViewInflater
            r0.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (p040o.getSupportImageTintList) r3)
        L_0x0277:
            o.getSupportImageTintList r1 = r0.AppCompatViewInflater
            int r1 = r1.MediaBrowserCompat$MediaItem
            if (r1 != r11) goto L_0x028f
            o.setContentId r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r1.MediaDescriptionCompat()
            int r1 = r0.MediaSessionCompat$ResultReceiverWrapper(r1)
            o.setContentId r3 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r3.MediaDescriptionCompat()
            int r3 = r3 - r1
            goto L_0x02a1
        L_0x028f:
            o.setContentId r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r1.MediaBrowserCompat$ItemReceiver()
            int r1 = r0.read((int) r1)
            o.setContentId r3 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r3.MediaBrowserCompat$ItemReceiver()
            int r3 = r1 - r3
        L_0x02a1:
            if (r3 <= 0) goto L_0x02aa
            int r1 = r2.read
            int r5 = java.lang.Math.min(r1, r3)
            goto L_0x02ab
        L_0x02aa:
            r5 = r7
        L_0x02ab:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.read(androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper, o.getSupportImageTintList, androidx.recyclerview.widget.RecyclerView$Keep):int");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, getSupportImageTintList getsupportimagetintlist) {
        int i;
        int i2;
        if (getsupportimagetintlist.MediaMetadataCompat && !getsupportimagetintlist.MediaBrowserCompat$ItemReceiver) {
            if (getsupportimagetintlist.read == 0) {
                if (getsupportimagetintlist.MediaBrowserCompat$MediaItem == -1) {
                    MediaBrowserCompat$CustomActionResultReceiver(recyclerView$MediaSessionCompat$ResultReceiverWrapper, getsupportimagetintlist.IconCompatParcelizer);
                } else {
                    IconCompatParcelizer(recyclerView$MediaSessionCompat$ResultReceiverWrapper, getsupportimagetintlist.MediaBrowserCompat$SearchResultReceiver);
                }
            } else if (getsupportimagetintlist.MediaBrowserCompat$MediaItem == -1) {
                int MediaMetadataCompat2 = getsupportimagetintlist.MediaBrowserCompat$SearchResultReceiver - MediaMetadataCompat(getsupportimagetintlist.MediaBrowserCompat$SearchResultReceiver);
                if (MediaMetadataCompat2 < 0) {
                    i2 = getsupportimagetintlist.IconCompatParcelizer;
                } else {
                    i2 = getsupportimagetintlist.IconCompatParcelizer - Math.min(MediaMetadataCompat2, getsupportimagetintlist.read);
                }
                MediaBrowserCompat$CustomActionResultReceiver(recyclerView$MediaSessionCompat$ResultReceiverWrapper, i2);
            } else {
                int MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem(getsupportimagetintlist.IconCompatParcelizer) - getsupportimagetintlist.IconCompatParcelizer;
                if (MediaSessionCompat$QueueItem < 0) {
                    i = getsupportimagetintlist.MediaBrowserCompat$SearchResultReceiver;
                } else {
                    i = Math.min(MediaSessionCompat$QueueItem, getsupportimagetintlist.read) + getsupportimagetintlist.MediaBrowserCompat$SearchResultReceiver;
                }
                IconCompatParcelizer(recyclerView$MediaSessionCompat$ResultReceiverWrapper, i);
            }
        }
    }

    private int MediaMetadataCompat(int i) {
        int MediaBrowserCompat$CustomActionResultReceiver2 = this.setForceShowIcon[0].MediaBrowserCompat$CustomActionResultReceiver(i);
        for (int i2 = 1; i2 < this.IconCompatParcelizer; i2++) {
            int MediaBrowserCompat$CustomActionResultReceiver3 = this.setForceShowIcon[i2].MediaBrowserCompat$CustomActionResultReceiver(i);
            if (MediaBrowserCompat$CustomActionResultReceiver3 > MediaBrowserCompat$CustomActionResultReceiver2) {
                MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver3;
            }
        }
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    private int MediaSessionCompat$ResultReceiverWrapper(int i) {
        int MediaBrowserCompat$CustomActionResultReceiver2 = this.setForceShowIcon[0].MediaBrowserCompat$CustomActionResultReceiver(i);
        for (int i2 = 1; i2 < this.IconCompatParcelizer; i2++) {
            int MediaBrowserCompat$CustomActionResultReceiver3 = this.setForceShowIcon[i2].MediaBrowserCompat$CustomActionResultReceiver(i);
            if (MediaBrowserCompat$CustomActionResultReceiver3 < MediaBrowserCompat$CustomActionResultReceiver2) {
                MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver3;
            }
        }
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    private int read(int i) {
        int write2 = this.setForceShowIcon[0].write(i);
        for (int i2 = 1; i2 < this.IconCompatParcelizer; i2++) {
            int write3 = this.setForceShowIcon[i2].write(i);
            if (write3 > write2) {
                write2 = write3;
            }
        }
        return write2;
    }

    private int MediaSessionCompat$QueueItem(int i) {
        int write2 = this.setForceShowIcon[0].write(i);
        for (int i2 = 1; i2 < this.IconCompatParcelizer; i2++) {
            int write3 = this.setForceShowIcon[i2].write(i);
            if (write3 < write2) {
                write2 = write3;
            }
        }
        return write2;
    }

    private void IconCompatParcelizer(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, int i) {
        while (MediaSessionCompat$ResultReceiverWrapper() > 0) {
            View MediaDescriptionCompat2 = MediaDescriptionCompat(0);
            if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaDescriptionCompat2) <= i && this.MediaBrowserCompat$CustomActionResultReceiver.write(MediaDescriptionCompat2) <= i) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) MediaDescriptionCompat2.getLayoutParams();
                if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.size() != 1) {
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
                    this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat2);
                    recyclerView$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(MediaDescriptionCompat2);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, int i) {
        int MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper() - 1;
        while (MediaSessionCompat$ResultReceiverWrapper >= 0) {
            View MediaDescriptionCompat2 = MediaDescriptionCompat(MediaSessionCompat$ResultReceiverWrapper);
            if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat2) >= i && this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat(MediaDescriptionCompat2) >= i) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) MediaDescriptionCompat2.getLayoutParams();
                if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.size() != 1) {
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.write();
                    this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat2);
                    recyclerView$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(MediaDescriptionCompat2);
                    MediaSessionCompat$ResultReceiverWrapper--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private boolean MediaSessionCompat$Token(int i) {
        if (this.MediaBrowserCompat$ItemReceiver == 0) {
            if ((i == -1) != this.setItemInvoker) {
                return true;
            }
            return false;
        }
        if (((i == -1) == this.setItemInvoker) == (SwitchCompat.m3079x50fd9e4a(this.setHasDecor) == 1)) {
            return true;
        }
        return false;
    }

    public final boolean read() {
        return this.MediaBrowserCompat$ItemReceiver == 1;
    }

    public final boolean write() {
        return this.MediaBrowserCompat$ItemReceiver == 0;
    }

    public final int write(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        return IconCompatParcelizer(i, recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        return IconCompatParcelizer(i, recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep);
    }

    private int write(int i) {
        int i2;
        if (MediaSessionCompat$ResultReceiverWrapper() != 0) {
            boolean z = false;
            if (MediaSessionCompat$ResultReceiverWrapper() != 0) {
                RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat(0).getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
                i2 = setcontentview.ParcelableVolumeInfo;
                if (i2 == -1) {
                    i2 = setcontentview.MediaSessionCompat$QueueItem;
                }
            } else {
                i2 = 0;
            }
            if (i < i2) {
                z = true;
            }
            if (z == this.setItemInvoker) {
                return 1;
            }
            return -1;
        } else if (this.setItemInvoker) {
            return 1;
        } else {
            return -1;
        }
    }

    public final PointF IconCompatParcelizer(int i) {
        int write2 = write(i);
        PointF pointF = new PointF();
        if (write2 == 0) {
            return null;
        }
        if (this.MediaBrowserCompat$ItemReceiver == 0) {
            pointF.x = (float) write2;
            pointF.y = BitmapDescriptorFactory.HUE_RED;
        } else {
            pointF.x = BitmapDescriptorFactory.HUE_RED;
            pointF.y = (float) write2;
        }
        return pointF;
    }

    public final void IconCompatParcelizer(RecyclerView recyclerView, int i) {
        setGuidelineBegin setguidelinebegin = new setGuidelineBegin(recyclerView.getContext());
        setguidelinebegin.MediaBrowserCompat$MediaItem = i;
        write((RecyclerView.PlaybackStateCompat) setguidelinebegin);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        read read2 = this.setExpandedFormat;
        if (!(read2 == null || read2.MediaBrowserCompat$ItemReceiver == i)) {
            read read3 = this.setExpandedFormat;
            read3.MediaBrowserCompat$SearchResultReceiver = null;
            read3.MediaBrowserCompat$MediaItem = 0;
            read3.MediaBrowserCompat$ItemReceiver = -1;
            read3.RatingCompat = -1;
        }
        this.ActionMenuItemView = i;
        this.setChecked = PKIFailureInfo.systemUnavail;
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void IconCompatParcelizer(int i, int i2, RecyclerView.Keep keep, RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer iconCompatParcelizer) {
        int i3;
        int i4;
        if (this.MediaBrowserCompat$ItemReceiver != 0) {
            i = i2;
        }
        if (MediaSessionCompat$ResultReceiverWrapper() != 0 && i != 0) {
            MediaBrowserCompat$ItemReceiver(i, keep);
            int[] iArr = this.setShortcut;
            if (iArr == null || iArr.length < this.IconCompatParcelizer) {
                this.setShortcut = new int[this.IconCompatParcelizer];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.IconCompatParcelizer; i6++) {
                if (this.AppCompatViewInflater.MediaBrowserCompat$CustomActionResultReceiver == -1) {
                    i4 = this.AppCompatViewInflater.MediaBrowserCompat$SearchResultReceiver;
                    i3 = this.setForceShowIcon[i6].MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatViewInflater.MediaBrowserCompat$SearchResultReceiver);
                } else {
                    i4 = this.setForceShowIcon[i6].write(this.AppCompatViewInflater.IconCompatParcelizer);
                    i3 = this.AppCompatViewInflater.IconCompatParcelizer;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.setShortcut[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.setShortcut, 0, i5);
            for (int i8 = 0; i8 < i5 && this.AppCompatViewInflater.write(keep); i8++) {
                iconCompatParcelizer.read(this.AppCompatViewInflater.write, this.setShortcut[i8]);
                this.AppCompatViewInflater.write += this.AppCompatViewInflater.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private int IconCompatParcelizer(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        if (MediaSessionCompat$ResultReceiverWrapper() == 0 || i == 0) {
            return 0;
        }
        MediaBrowserCompat$ItemReceiver(i, keep);
        int read2 = read(recyclerView$MediaSessionCompat$ResultReceiverWrapper, this.AppCompatViewInflater, keep);
        if (this.AppCompatViewInflater.read >= read2) {
            i = i < 0 ? -read2 : read2;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.write(-i);
        this.MediaMetadataCompat = this.setItemInvoker;
        this.AppCompatViewInflater.read = 0;
        MediaBrowserCompat$CustomActionResultReceiver(recyclerView$MediaSessionCompat$ResultReceiverWrapper, this.AppCompatViewInflater);
        return i;
    }

    public final RecyclerView.MediaDescriptionCompat MediaBrowserCompat$ItemReceiver() {
        if (this.MediaBrowserCompat$ItemReceiver == 0) {
            return new IconCompatParcelizer(-2, -1);
        }
        return new IconCompatParcelizer(-1, -2);
    }

    public final RecyclerView.MediaDescriptionCompat IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new IconCompatParcelizer(context, attributeSet);
    }

    public final RecyclerView.MediaDescriptionCompat MediaBrowserCompat$CustomActionResultReceiver(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new IconCompatParcelizer((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new IconCompatParcelizer(layoutParams);
    }

    public final boolean write(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat) {
        return mediaDescriptionCompat instanceof IconCompatParcelizer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (r9.MediaBrowserCompat$ItemReceiver != 1) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (r9.MediaBrowserCompat$ItemReceiver != 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0053, code lost:
        if ((p040o.SwitchCompat.m3079x50fd9e4a(r9.setHasDecor) == 1) == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        if ((p040o.SwitchCompat.m3079x50fd9e4a(r9.setHasDecor) == 1) != false) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0160 A[LOOP:3: B:108:0x0160->B:117:0x0180, LOOP_START, PHI: r3 
      PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:95:0x0136, B:117:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00de A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x012f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View read(android.view.View r10, int r11, androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r12, androidx.recyclerview.widget.RecyclerView.Keep r13) {
        /*
            r9 = this;
            int r0 = r9.MediaSessionCompat$ResultReceiverWrapper()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r10 = r9.mo1669a_(r10)
            if (r10 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r9.MediaMetadataCompat()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 0
            r4 = 1
            if (r11 == r4) goto L_0x0056
            r5 = 2
            if (r11 == r5) goto L_0x0042
            r5 = 17
            if (r11 == r5) goto L_0x003d
            r5 = 33
            if (r11 == r5) goto L_0x0038
            r5 = 66
            if (r11 == r5) goto L_0x0033
            r5 = 130(0x82, float:1.82E-43)
            if (r11 == r5) goto L_0x002e
        L_0x002c:
            r11 = r0
            goto L_0x0069
        L_0x002e:
            int r11 = r9.MediaBrowserCompat$ItemReceiver
            if (r11 != r4) goto L_0x002c
            goto L_0x0046
        L_0x0033:
            int r11 = r9.MediaBrowserCompat$ItemReceiver
            if (r11 != 0) goto L_0x002c
            goto L_0x0046
        L_0x0038:
            int r11 = r9.MediaBrowserCompat$ItemReceiver
            if (r11 == r4) goto L_0x0068
        L_0x003c:
            goto L_0x002c
        L_0x003d:
            int r11 = r9.MediaBrowserCompat$ItemReceiver
            if (r11 == 0) goto L_0x0068
            goto L_0x003c
        L_0x0042:
            int r11 = r9.MediaBrowserCompat$ItemReceiver
            if (r11 != r4) goto L_0x0048
        L_0x0046:
            r11 = r4
            goto L_0x0069
        L_0x0048:
            androidx.recyclerview.widget.RecyclerView r11 = r9.setHasDecor
            int r11 = p040o.SwitchCompat.m3079x50fd9e4a(r11)
            if (r11 == r4) goto L_0x0052
            r11 = r3
            goto L_0x0053
        L_0x0052:
            r11 = r4
        L_0x0053:
            if (r11 != 0) goto L_0x0068
            goto L_0x0046
        L_0x0056:
            int r11 = r9.MediaBrowserCompat$ItemReceiver
            if (r11 == r4) goto L_0x0068
            androidx.recyclerview.widget.RecyclerView r11 = r9.setHasDecor
            int r11 = p040o.SwitchCompat.m3079x50fd9e4a(r11)
            if (r11 == r4) goto L_0x0064
            r11 = r3
            goto L_0x0065
        L_0x0064:
            r11 = r4
        L_0x0065:
            if (r11 == 0) goto L_0x0068
            goto L_0x0046
        L_0x0068:
            r11 = r2
        L_0x0069:
            if (r11 != r0) goto L_0x006c
            return r1
        L_0x006c:
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$IconCompatParcelizer r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer) r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r11 != r4) goto L_0x0092
            int r5 = r9.MediaSessionCompat$ResultReceiverWrapper()
            if (r5 != 0) goto L_0x007e
        L_0x007c:
            r6 = r3
            goto L_0x00aa
        L_0x007e:
            int r5 = r5 - r4
            android.view.View r5 = r9.MediaDescriptionCompat((int) r5)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r5 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r5
            androidx.recyclerview.widget.RecyclerView$setContentView r5 = r5.MediaBrowserCompat$SearchResultReceiver
            int r6 = r5.ParcelableVolumeInfo
            if (r6 != r2) goto L_0x00aa
            int r6 = r5.MediaSessionCompat$QueueItem
            goto L_0x00aa
        L_0x0092:
            int r5 = r9.MediaSessionCompat$ResultReceiverWrapper()
            if (r5 == 0) goto L_0x007c
            android.view.View r5 = r9.MediaDescriptionCompat((int) r3)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r5 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r5
            androidx.recyclerview.widget.RecyclerView$setContentView r5 = r5.MediaBrowserCompat$SearchResultReceiver
            int r6 = r5.ParcelableVolumeInfo
            if (r6 != r2) goto L_0x00aa
            int r6 = r5.MediaSessionCompat$QueueItem
        L_0x00aa:
            r9.write(r6, r13)
            r9.ParcelableVolumeInfo(r11)
            o.getSupportImageTintList r5 = r9.AppCompatViewInflater
            int r7 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r7 = r7 + r6
            r5.write = r7
            o.getSupportImageTintList r5 = r9.AppCompatViewInflater
            o.setContentId r7 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r7 = r7.MediaBrowserCompat$SearchResultReceiver()
            float r7 = (float) r7
            r8 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r7 = r7 * r8
            int r7 = (int) r7
            r5.read = r7
            o.getSupportImageTintList r5 = r9.AppCompatViewInflater
            r5.MediaDescriptionCompat = r4
            o.getSupportImageTintList r5 = r9.AppCompatViewInflater
            r5.MediaMetadataCompat = r3
            o.getSupportImageTintList r5 = r9.AppCompatViewInflater
            r9.read((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r12, (p040o.getSupportImageTintList) r5, (androidx.recyclerview.widget.RecyclerView.Keep) r13)
            boolean r12 = r9.setItemInvoker
            r9.MediaMetadataCompat = r12
            android.view.View r12 = r0.write(r6, r11)
            if (r12 == 0) goto L_0x00e1
            if (r12 == r10) goto L_0x00e1
            return r12
        L_0x00e1:
            boolean r12 = r9.MediaSessionCompat$Token(r11)
            if (r12 == 0) goto L_0x00fc
            int r12 = r9.IconCompatParcelizer
            int r12 = r12 - r4
        L_0x00ea:
            if (r12 < 0) goto L_0x0111
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r13 = r9.setForceShowIcon
            r13 = r13[r12]
            android.view.View r13 = r13.write(r6, r11)
            if (r13 == 0) goto L_0x00f9
            if (r13 == r10) goto L_0x00f9
            return r13
        L_0x00f9:
            int r12 = r12 + -1
            goto L_0x00ea
        L_0x00fc:
            r12 = r3
        L_0x00fd:
            int r13 = r9.IconCompatParcelizer
            if (r12 >= r13) goto L_0x0111
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r13 = r9.setForceShowIcon
            r13 = r13[r12]
            android.view.View r13 = r13.write(r6, r11)
            if (r13 == 0) goto L_0x010e
            if (r13 == r10) goto L_0x010e
            return r13
        L_0x010e:
            int r12 = r12 + 1
            goto L_0x00fd
        L_0x0111:
            boolean r12 = r9.write
            if (r11 != r2) goto L_0x0117
            r13 = r4
            goto L_0x0118
        L_0x0117:
            r13 = r3
        L_0x0118:
            r12 = r12 ^ r4
            if (r12 != r13) goto L_0x011d
            r12 = r4
            goto L_0x011e
        L_0x011d:
            r12 = r3
        L_0x011e:
            if (r12 == 0) goto L_0x0125
            int r13 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            goto L_0x0129
        L_0x0125:
            int r13 = r0.IconCompatParcelizer()
        L_0x0129:
            android.view.View r13 = r9.MediaBrowserCompat$CustomActionResultReceiver((int) r13)
            if (r13 == 0) goto L_0x0132
            if (r13 == r10) goto L_0x0132
            return r13
        L_0x0132:
            boolean r11 = r9.MediaSessionCompat$Token(r11)
            if (r11 == 0) goto L_0x0160
            int r11 = r9.IconCompatParcelizer
            int r11 = r11 - r4
        L_0x013b:
            if (r11 < 0) goto L_0x0183
            int r13 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r11 == r13) goto L_0x015d
            if (r12 == 0) goto L_0x014c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r13 = r9.setForceShowIcon
            r13 = r13[r11]
            int r13 = r13.MediaBrowserCompat$CustomActionResultReceiver()
            goto L_0x0154
        L_0x014c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r13 = r9.setForceShowIcon
            r13 = r13[r11]
            int r13 = r13.IconCompatParcelizer()
        L_0x0154:
            android.view.View r13 = r9.MediaBrowserCompat$CustomActionResultReceiver((int) r13)
            if (r13 == 0) goto L_0x015d
            if (r13 == r10) goto L_0x015d
            return r13
        L_0x015d:
            int r11 = r11 + -1
            goto L_0x013b
        L_0x0160:
            int r11 = r9.IconCompatParcelizer
            if (r3 >= r11) goto L_0x0183
            if (r12 == 0) goto L_0x016f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r11 = r9.setForceShowIcon
            r11 = r11[r3]
            int r11 = r11.MediaBrowserCompat$CustomActionResultReceiver()
            goto L_0x0177
        L_0x016f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r11 = r9.setForceShowIcon
            r11 = r11[r3]
            int r11 = r11.IconCompatParcelizer()
        L_0x0177:
            android.view.View r11 = r9.MediaBrowserCompat$CustomActionResultReceiver((int) r11)
            if (r11 == 0) goto L_0x0180
            if (r11 == r10) goto L_0x0180
            return r11
        L_0x0180:
            int r3 = r3 + 1
            goto L_0x0160
        L_0x0183:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.read(android.view.View, int, androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper, androidx.recyclerview.widget.RecyclerView$Keep):android.view.View");
    }

    public static class IconCompatParcelizer extends RecyclerView.MediaDescriptionCompat {
        StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

        public IconCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public IconCompatParcelizer(int i, int i2) {
            super(i, i2);
        }

        public IconCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public IconCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class read implements Parcelable {
        public static final Parcelable.Creator<read> CREATOR = new Parcelable.Creator<read>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new read(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new read[i];
            }
        };
        boolean IconCompatParcelizer;
        List<C0069x3a4b86cb> MediaBrowserCompat$CustomActionResultReceiver;
        int MediaBrowserCompat$ItemReceiver;
        int MediaBrowserCompat$MediaItem;
        int[] MediaBrowserCompat$SearchResultReceiver;
        int[] MediaDescriptionCompat;
        int MediaMetadataCompat;
        int RatingCompat;
        boolean read;
        boolean write;

        public final int describeContents() {
            return 0;
        }

        public read() {
        }

        read(Parcel parcel) {
            this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
            this.RatingCompat = parcel.readInt();
            int readInt = parcel.readInt();
            this.MediaBrowserCompat$MediaItem = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.MediaBrowserCompat$SearchResultReceiver = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.MediaMetadataCompat = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.MediaDescriptionCompat = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.write = parcel.readInt() == 1;
            this.IconCompatParcelizer = parcel.readInt() == 1;
            this.read = parcel.readInt() == 1 ? true : z;
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readArrayList(C0069x3a4b86cb.class.getClassLoader());
        }

        public read(read read2) {
            this.MediaBrowserCompat$MediaItem = read2.MediaBrowserCompat$MediaItem;
            this.MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$ItemReceiver;
            this.RatingCompat = read2.RatingCompat;
            this.MediaBrowserCompat$SearchResultReceiver = read2.MediaBrowserCompat$SearchResultReceiver;
            this.MediaMetadataCompat = read2.MediaMetadataCompat;
            this.MediaDescriptionCompat = read2.MediaDescriptionCompat;
            this.write = read2.write;
            this.IconCompatParcelizer = read2.IconCompatParcelizer;
            this.read = read2.read;
            this.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeInt(this.RatingCompat);
            parcel.writeInt(this.MediaBrowserCompat$MediaItem);
            if (this.MediaBrowserCompat$MediaItem > 0) {
                parcel.writeIntArray(this.MediaBrowserCompat$SearchResultReceiver);
            }
            parcel.writeInt(this.MediaMetadataCompat);
            if (this.MediaMetadataCompat > 0) {
                parcel.writeIntArray(this.MediaDescriptionCompat);
            }
            parcel.writeInt(this.write ? 1 : 0);
            parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
            parcel.writeInt(this.read ? 1 : 0);
            parcel.writeList(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    class write {
        int IconCompatParcelizer;
        boolean MediaBrowserCompat$CustomActionResultReceiver;
        int MediaBrowserCompat$ItemReceiver;
        boolean MediaBrowserCompat$SearchResultReceiver;
        int[] read;
        boolean write;

        write() {
            IconCompatParcelizer();
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer() {
            this.MediaBrowserCompat$ItemReceiver = -1;
            this.IconCompatParcelizer = PKIFailureInfo.systemUnavail;
            this.write = false;
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
            this.MediaBrowserCompat$SearchResultReceiver = false;
            int[] iArr = this.read;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver, int i, int i2) {
        int i3 = staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.read;
        if (i == -1) {
            int i4 = staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.write;
            if (i4 == Integer.MIN_VALUE) {
                staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.read();
                i4 = staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.write;
            }
            if (i4 + i3 <= i2) {
                this.setIcon.set(staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, false);
                return;
            }
            return;
        }
        int i5 = staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        if (i5 == Integer.MIN_VALUE) {
            staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            i5 = staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        }
        if (i5 - i3 >= i2) {
            this.setIcon.set(staggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:161:0x029d, code lost:
        if ((p040o.SwitchCompat.m3079x50fd9e4a(r13.setHasDecor) == 1) != r13.RatingCompat) goto L_0x029f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04e6 A[LOOP:0: B:1:0x0003->B:281:0x04e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r14, androidx.recyclerview.widget.RecyclerView.Keep r15) {
        /*
            r13 = this;
            r0 = 0
            r1 = 1
            r2 = r1
        L_0x0003:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$write r3 = r13.read
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r4 = r13.setExpandedFormat
            r5 = -1
            if (r4 != 0) goto L_0x000e
            int r4 = r13.ActionMenuItemView
            if (r4 == r5) goto L_0x0023
        L_0x000e:
            boolean r4 = r15.MediaBrowserCompat$ItemReceiver
            if (r4 == 0) goto L_0x0018
            int r4 = r15.MediaDescriptionCompat
            int r6 = r15.IconCompatParcelizer
            int r4 = r4 - r6
            goto L_0x001a
        L_0x0018:
            int r4 = r15.MediaBrowserCompat$MediaItem
        L_0x001a:
            if (r4 != 0) goto L_0x0023
            r13.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r14)
            r3.IconCompatParcelizer()
            return
        L_0x0023:
            boolean r4 = r3.MediaBrowserCompat$SearchResultReceiver
            if (r4 == 0) goto L_0x0031
            int r4 = r13.ActionMenuItemView
            if (r4 != r5) goto L_0x0031
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r4 = r13.setExpandedFormat
            if (r4 != 0) goto L_0x0031
            r4 = r0
            goto L_0x0032
        L_0x0031:
            r4 = r1
        L_0x0032:
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == 0) goto L_0x0282
            r3.IconCompatParcelizer()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            if (r8 == 0) goto L_0x00d5
            int r8 = r8.MediaBrowserCompat$MediaItem
            if (r8 <= 0) goto L_0x0097
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            int r8 = r8.MediaBrowserCompat$MediaItem
            int r9 = r13.IconCompatParcelizer
            if (r8 != r9) goto L_0x0085
            r8 = r0
        L_0x004b:
            int r9 = r13.IconCompatParcelizer
            if (r8 >= r9) goto L_0x0097
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r9 = r13.setForceShowIcon
            r9 = r9[r8]
            java.util.ArrayList<android.view.View> r10 = r9.IconCompatParcelizer
            r10.clear()
            r9.write = r7
            r9.MediaBrowserCompat$ItemReceiver = r7
            r9.read = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r9 = r13.setExpandedFormat
            int[] r9 = r9.MediaBrowserCompat$SearchResultReceiver
            r9 = r9[r8]
            if (r9 == r7) goto L_0x007a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r10 = r13.setExpandedFormat
            boolean r10 = r10.IconCompatParcelizer
            if (r10 == 0) goto L_0x0073
            o.setContentId r10 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r10.MediaBrowserCompat$ItemReceiver()
            goto L_0x0079
        L_0x0073:
            o.setContentId r10 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r10.MediaDescriptionCompat()
        L_0x0079:
            int r9 = r9 + r10
        L_0x007a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r10 = r13.setForceShowIcon
            r10 = r10[r8]
            r10.write = r9
            r10.MediaBrowserCompat$ItemReceiver = r9
            int r8 = r8 + 1
            goto L_0x004b
        L_0x0085:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            r8.MediaBrowserCompat$SearchResultReceiver = r6
            r8.MediaBrowserCompat$MediaItem = r0
            r8.MediaMetadataCompat = r0
            r8.MediaDescriptionCompat = r6
            r8.MediaBrowserCompat$CustomActionResultReceiver = r6
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            int r9 = r8.RatingCompat
            r8.MediaBrowserCompat$ItemReceiver = r9
        L_0x0097:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            boolean r8 = r8.read
            r13.RatingCompat = r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            boolean r8 = r8.write
            r13.IconCompatParcelizer((boolean) r8)
            r13.MediaMetadataCompat()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            int r8 = r8.MediaBrowserCompat$ItemReceiver
            if (r8 == r5) goto L_0x00ba
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            int r8 = r8.MediaBrowserCompat$ItemReceiver
            r13.ActionMenuItemView = r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            boolean r8 = r8.IconCompatParcelizer
            r3.write = r8
            goto L_0x00be
        L_0x00ba:
            boolean r8 = r13.setItemInvoker
            r3.write = r8
        L_0x00be:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            int r8 = r8.MediaMetadataCompat
            if (r8 <= r1) goto L_0x00dc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r8 = r13.setCheckable
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r9 = r13.setExpandedFormat
            int[] r9 = r9.MediaDescriptionCompat
            r8.MediaBrowserCompat$ItemReceiver = r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r8 = r13.setCheckable
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r9 = r13.setExpandedFormat
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver> r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            r8.IconCompatParcelizer = r9
            goto L_0x00dc
        L_0x00d5:
            r13.MediaMetadataCompat()
            boolean r8 = r13.setItemInvoker
            r3.write = r8
        L_0x00dc:
            boolean r8 = r15.MediaBrowserCompat$ItemReceiver
            if (r8 != 0) goto L_0x0218
            int r8 = r13.ActionMenuItemView
            if (r8 == r5) goto L_0x0218
            if (r8 < 0) goto L_0x0214
            boolean r9 = r15.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x00f0
            int r9 = r15.MediaDescriptionCompat
            int r10 = r15.IconCompatParcelizer
            int r9 = r9 - r10
            goto L_0x00f2
        L_0x00f0:
            int r9 = r15.MediaBrowserCompat$MediaItem
        L_0x00f2:
            if (r8 >= r9) goto L_0x0214
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            if (r8 == 0) goto L_0x010a
            int r8 = r8.MediaBrowserCompat$ItemReceiver
            if (r8 == r5) goto L_0x010a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            int r8 = r8.MediaBrowserCompat$MediaItem
            if (r8 <= 0) goto L_0x010a
            r3.IconCompatParcelizer = r7
            int r8 = r13.ActionMenuItemView
            r3.MediaBrowserCompat$ItemReceiver = r8
            goto L_0x0212
        L_0x010a:
            int r8 = r13.ActionMenuItemView
            android.view.View r8 = r13.MediaBrowserCompat$CustomActionResultReceiver((int) r8)
            if (r8 == 0) goto L_0x01c8
            boolean r9 = r13.setItemInvoker
            if (r9 == 0) goto L_0x0133
            int r9 = r13.MediaSessionCompat$ResultReceiverWrapper()
            if (r9 != 0) goto L_0x011e
        L_0x011c:
            r10 = r0
            goto L_0x014b
        L_0x011e:
            int r9 = r9 + -1
            android.view.View r9 = r13.MediaDescriptionCompat((int) r9)
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r9 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r9
            androidx.recyclerview.widget.RecyclerView$setContentView r9 = r9.MediaBrowserCompat$SearchResultReceiver
            int r10 = r9.ParcelableVolumeInfo
            if (r10 != r5) goto L_0x014b
            int r10 = r9.MediaSessionCompat$QueueItem
            goto L_0x014b
        L_0x0133:
            int r9 = r13.MediaSessionCompat$ResultReceiverWrapper()
            if (r9 == 0) goto L_0x011c
            android.view.View r9 = r13.MediaDescriptionCompat((int) r0)
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r9 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r9
            androidx.recyclerview.widget.RecyclerView$setContentView r9 = r9.MediaBrowserCompat$SearchResultReceiver
            int r10 = r9.ParcelableVolumeInfo
            if (r10 != r5) goto L_0x014b
            int r10 = r9.MediaSessionCompat$QueueItem
        L_0x014b:
            r3.MediaBrowserCompat$ItemReceiver = r10
            int r9 = r13.setChecked
            if (r9 == r7) goto L_0x017d
            boolean r9 = r3.write
            if (r9 == 0) goto L_0x0169
            o.setContentId r9 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.MediaBrowserCompat$ItemReceiver()
            int r10 = r13.setChecked
            int r9 = r9 - r10
            o.setContentId r10 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r10.IconCompatParcelizer(r8)
            int r9 = r9 - r8
            r3.IconCompatParcelizer = r9
            goto L_0x0212
        L_0x0169:
            o.setContentId r9 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.MediaDescriptionCompat()
            int r10 = r13.setChecked
            int r9 = r9 + r10
            o.setContentId r10 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r10.MediaBrowserCompat$ItemReceiver(r8)
            int r9 = r9 - r8
            r3.IconCompatParcelizer = r9
            goto L_0x0212
        L_0x017d:
            o.setContentId r9 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.read(r8)
            o.setContentId r10 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r10.MediaBrowserCompat$SearchResultReceiver()
            if (r9 <= r10) goto L_0x01a0
            boolean r8 = r3.write
            if (r8 == 0) goto L_0x0196
            o.setContentId r8 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8.MediaBrowserCompat$ItemReceiver()
            goto L_0x019c
        L_0x0196:
            o.setContentId r8 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8.MediaDescriptionCompat()
        L_0x019c:
            r3.IconCompatParcelizer = r8
            goto L_0x0212
        L_0x01a0:
            o.setContentId r9 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.MediaBrowserCompat$ItemReceiver(r8)
            o.setContentId r10 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r10.MediaDescriptionCompat()
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x01b3
            int r8 = -r9
            r3.IconCompatParcelizer = r8
            goto L_0x0212
        L_0x01b3:
            o.setContentId r9 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.MediaBrowserCompat$ItemReceiver()
            o.setContentId r10 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r10.IconCompatParcelizer(r8)
            int r9 = r9 - r8
            if (r9 >= 0) goto L_0x01c5
            r3.IconCompatParcelizer = r9
            goto L_0x0212
        L_0x01c5:
            r3.IconCompatParcelizer = r7
            goto L_0x0212
        L_0x01c8:
            int r8 = r13.ActionMenuItemView
            r3.MediaBrowserCompat$ItemReceiver = r8
            int r8 = r13.setChecked
            if (r8 != r7) goto L_0x01f5
            int r8 = r3.MediaBrowserCompat$ItemReceiver
            int r8 = r13.write((int) r8)
            if (r8 != r1) goto L_0x01da
            r8 = r1
            goto L_0x01db
        L_0x01da:
            r8 = r0
        L_0x01db:
            r3.write = r8
            boolean r8 = r3.write
            if (r8 == 0) goto L_0x01ea
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.setContentId r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8.MediaBrowserCompat$ItemReceiver()
            goto L_0x01f2
        L_0x01ea:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.setContentId r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8.MediaDescriptionCompat()
        L_0x01f2:
            r3.IconCompatParcelizer = r8
            goto L_0x0210
        L_0x01f5:
            boolean r9 = r3.write
            if (r9 == 0) goto L_0x0205
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.setContentId r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.MediaBrowserCompat$ItemReceiver()
            int r9 = r9 - r8
            r3.IconCompatParcelizer = r9
            goto L_0x0210
        L_0x0205:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.setContentId r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.MediaDescriptionCompat()
            int r9 = r9 + r8
            r3.IconCompatParcelizer = r9
        L_0x0210:
            r3.MediaBrowserCompat$CustomActionResultReceiver = r1
        L_0x0212:
            r8 = r1
            goto L_0x0219
        L_0x0214:
            r13.ActionMenuItemView = r5
            r13.setChecked = r7
        L_0x0218:
            r8 = r0
        L_0x0219:
            if (r8 != 0) goto L_0x0280
            boolean r8 = r13.MediaMetadataCompat
            if (r8 == 0) goto L_0x024e
            boolean r8 = r15.MediaBrowserCompat$ItemReceiver
            if (r8 == 0) goto L_0x0229
            int r8 = r15.MediaDescriptionCompat
            int r9 = r15.IconCompatParcelizer
            int r8 = r8 - r9
            goto L_0x022b
        L_0x0229:
            int r8 = r15.MediaBrowserCompat$MediaItem
        L_0x022b:
            int r9 = r13.MediaSessionCompat$ResultReceiverWrapper()
            int r9 = r9 - r1
        L_0x0230:
            if (r9 < 0) goto L_0x024c
            android.view.View r10 = r13.MediaDescriptionCompat((int) r9)
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r10 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r10
            androidx.recyclerview.widget.RecyclerView$setContentView r10 = r10.MediaBrowserCompat$SearchResultReceiver
            int r11 = r10.ParcelableVolumeInfo
            if (r11 != r5) goto L_0x0244
            int r11 = r10.MediaSessionCompat$QueueItem
        L_0x0244:
            if (r11 < 0) goto L_0x0249
            if (r11 >= r8) goto L_0x0249
            goto L_0x027c
        L_0x0249:
            int r9 = r9 + -1
            goto L_0x0230
        L_0x024c:
            r11 = r0
            goto L_0x027c
        L_0x024e:
            boolean r8 = r15.MediaBrowserCompat$ItemReceiver
            if (r8 == 0) goto L_0x0258
            int r8 = r15.MediaDescriptionCompat
            int r9 = r15.IconCompatParcelizer
            int r8 = r8 - r9
            goto L_0x025a
        L_0x0258:
            int r8 = r15.MediaBrowserCompat$MediaItem
        L_0x025a:
            int r9 = r13.MediaSessionCompat$ResultReceiverWrapper()
            r10 = r0
        L_0x025f:
            if (r10 >= r9) goto L_0x024c
            android.view.View r11 = r13.MediaDescriptionCompat((int) r10)
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r11 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r11
            androidx.recyclerview.widget.RecyclerView$setContentView r11 = r11.MediaBrowserCompat$SearchResultReceiver
            int r12 = r11.ParcelableVolumeInfo
            if (r12 != r5) goto L_0x0273
            int r12 = r11.MediaSessionCompat$QueueItem
        L_0x0273:
            if (r12 < 0) goto L_0x0279
            if (r12 >= r8) goto L_0x0279
            r11 = r12
            goto L_0x027c
        L_0x0279:
            int r10 = r10 + 1
            goto L_0x025f
        L_0x027c:
            r3.MediaBrowserCompat$ItemReceiver = r11
            r3.IconCompatParcelizer = r7
        L_0x0280:
            r3.MediaBrowserCompat$SearchResultReceiver = r1
        L_0x0282:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r8 = r13.setExpandedFormat
            if (r8 != 0) goto L_0x02ac
            int r8 = r13.ActionMenuItemView
            if (r8 != r5) goto L_0x02ac
            boolean r8 = r3.write
            boolean r9 = r13.MediaMetadataCompat
            if (r8 != r9) goto L_0x029f
            androidx.recyclerview.widget.RecyclerView r8 = r13.setHasDecor
            int r8 = p040o.SwitchCompat.m3079x50fd9e4a(r8)
            if (r8 == r1) goto L_0x029a
            r8 = r0
            goto L_0x029b
        L_0x029a:
            r8 = r1
        L_0x029b:
            boolean r9 = r13.RatingCompat
            if (r8 == r9) goto L_0x02ac
        L_0x029f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r8 = r13.setCheckable
            int[] r9 = r8.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x02a8
            java.util.Arrays.fill(r9, r5)
        L_0x02a8:
            r8.IconCompatParcelizer = r6
            r3.MediaBrowserCompat$CustomActionResultReceiver = r1
        L_0x02ac:
            int r6 = r13.MediaSessionCompat$ResultReceiverWrapper()
            if (r6 <= 0) goto L_0x0379
            androidx.recyclerview.widget.StaggeredGridLayoutManager$read r6 = r13.setExpandedFormat
            if (r6 == 0) goto L_0x02ba
            int r6 = r6.MediaBrowserCompat$MediaItem
            if (r6 > 0) goto L_0x0379
        L_0x02ba:
            boolean r6 = r3.MediaBrowserCompat$CustomActionResultReceiver
            if (r6 == 0) goto L_0x02e3
            r4 = r0
        L_0x02bf:
            int r6 = r13.IconCompatParcelizer
            if (r4 >= r6) goto L_0x0379
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r6 = r13.setForceShowIcon
            r6 = r6[r4]
            java.util.ArrayList<android.view.View> r8 = r6.IconCompatParcelizer
            r8.clear()
            r6.write = r7
            r6.MediaBrowserCompat$ItemReceiver = r7
            r6.read = r0
            int r6 = r3.IconCompatParcelizer
            if (r6 == r7) goto L_0x02e0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r6 = r13.setForceShowIcon
            r6 = r6[r4]
            int r8 = r3.IconCompatParcelizer
            r6.write = r8
            r6.MediaBrowserCompat$ItemReceiver = r8
        L_0x02e0:
            int r4 = r4 + 1
            goto L_0x02bf
        L_0x02e3:
            if (r4 != 0) goto L_0x030c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$write r4 = r13.read
            int[] r4 = r4.read
            if (r4 == 0) goto L_0x030c
            r4 = r0
        L_0x02ec:
            int r6 = r13.IconCompatParcelizer
            if (r4 >= r6) goto L_0x0379
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r6 = r13.setForceShowIcon
            r6 = r6[r4]
            java.util.ArrayList<android.view.View> r8 = r6.IconCompatParcelizer
            r8.clear()
            r6.write = r7
            r6.MediaBrowserCompat$ItemReceiver = r7
            r6.read = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$write r8 = r13.read
            int[] r8 = r8.read
            r8 = r8[r4]
            r6.write = r8
            r6.MediaBrowserCompat$ItemReceiver = r8
            int r4 = r4 + 1
            goto L_0x02ec
        L_0x030c:
            r4 = r0
        L_0x030d:
            int r6 = r13.IconCompatParcelizer
            if (r4 >= r6) goto L_0x0354
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r6 = r13.setForceShowIcon
            r6 = r6[r4]
            boolean r8 = r13.setItemInvoker
            int r9 = r3.IconCompatParcelizer
            if (r8 == 0) goto L_0x0320
            int r10 = r6.write(r7)
            goto L_0x0324
        L_0x0320:
            int r10 = r6.MediaBrowserCompat$CustomActionResultReceiver(r7)
        L_0x0324:
            java.util.ArrayList<android.view.View> r11 = r6.IconCompatParcelizer
            r11.clear()
            r6.write = r7
            r6.MediaBrowserCompat$ItemReceiver = r7
            r6.read = r0
            if (r10 == r7) goto L_0x0351
            if (r8 == 0) goto L_0x033d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = r6.MediaDescriptionCompat
            o.setContentId r11 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r11 = r11.MediaBrowserCompat$ItemReceiver()
            if (r10 < r11) goto L_0x0351
        L_0x033d:
            if (r8 != 0) goto L_0x034a
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = r6.MediaDescriptionCompat
            o.setContentId r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8.MediaDescriptionCompat()
            if (r10 <= r8) goto L_0x034a
            goto L_0x0351
        L_0x034a:
            if (r9 == r7) goto L_0x034d
            int r10 = r10 + r9
        L_0x034d:
            r6.MediaBrowserCompat$ItemReceiver = r10
            r6.write = r10
        L_0x0351:
            int r4 = r4 + 1
            goto L_0x030d
        L_0x0354:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$write r4 = r13.read
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r6 = r13.setForceShowIcon
            int r8 = r6.length
            int[] r9 = r4.read
            if (r9 == 0) goto L_0x0360
            int r9 = r9.length
            if (r9 >= r8) goto L_0x0369
        L_0x0360:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[] r9 = r9.setForceShowIcon
            int r9 = r9.length
            int[] r9 = new int[r9]
            r4.read = r9
        L_0x0369:
            r9 = r0
        L_0x036a:
            if (r9 >= r8) goto L_0x0379
            int[] r10 = r4.read
            r11 = r6[r9]
            int r11 = r11.MediaBrowserCompat$CustomActionResultReceiver(r7)
            r10[r9] = r11
            int r9 = r9 + 1
            goto L_0x036a
        L_0x0379:
            r13.write((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r14)
            o.getSupportImageTintList r4 = r13.AppCompatViewInflater
            r4.MediaMetadataCompat = r0
            r13.MediaBrowserCompat$MediaItem = r0
            o.setContentId r4 = r13.setPadding
            int r4 = r4.MediaBrowserCompat$SearchResultReceiver()
            int r6 = r13.IconCompatParcelizer
            int r6 = r4 / r6
            r13.setPopupCallback = r6
            o.setContentId r6 = r13.setPadding
            int r6 = r6.IconCompatParcelizer()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            int r4 = r3.MediaBrowserCompat$ItemReceiver
            r13.write(r4, r15)
            boolean r4 = r3.write
            if (r4 == 0) goto L_0x03bc
            r13.ParcelableVolumeInfo(r5)
            o.getSupportImageTintList r4 = r13.AppCompatViewInflater
            r13.read((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r14, (p040o.getSupportImageTintList) r4, (androidx.recyclerview.widget.RecyclerView.Keep) r15)
            r13.ParcelableVolumeInfo(r1)
            o.getSupportImageTintList r4 = r13.AppCompatViewInflater
            int r5 = r3.MediaBrowserCompat$ItemReceiver
            o.getSupportImageTintList r6 = r13.AppCompatViewInflater
            int r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r5 + r6
            r4.write = r5
            o.getSupportImageTintList r4 = r13.AppCompatViewInflater
            r13.read((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r14, (p040o.getSupportImageTintList) r4, (androidx.recyclerview.widget.RecyclerView.Keep) r15)
            goto L_0x03d7
        L_0x03bc:
            r13.ParcelableVolumeInfo(r1)
            o.getSupportImageTintList r4 = r13.AppCompatViewInflater
            r13.read((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r14, (p040o.getSupportImageTintList) r4, (androidx.recyclerview.widget.RecyclerView.Keep) r15)
            r13.ParcelableVolumeInfo(r5)
            o.getSupportImageTintList r4 = r13.AppCompatViewInflater
            int r5 = r3.MediaBrowserCompat$ItemReceiver
            o.getSupportImageTintList r6 = r13.AppCompatViewInflater
            int r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r5 + r6
            r4.write = r5
            o.getSupportImageTintList r4 = r13.AppCompatViewInflater
            r13.read((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r14, (p040o.getSupportImageTintList) r4, (androidx.recyclerview.widget.RecyclerView.Keep) r15)
        L_0x03d7:
            o.setContentId r4 = r13.setPadding
            int r4 = r4.IconCompatParcelizer()
            r5 = 1073741824(0x40000000, float:2.0)
            if (r4 == r5) goto L_0x0486
            r4 = 0
            int r5 = r13.MediaSessionCompat$ResultReceiverWrapper()
            r6 = r0
        L_0x03e7:
            if (r6 >= r5) goto L_0x0402
            android.view.View r8 = r13.MediaDescriptionCompat((int) r6)
            o.setContentId r9 = r13.setPadding
            int r9 = r9.read(r8)
            float r9 = (float) r9
            int r10 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x03ff
            r8.getLayoutParams()
            float r4 = java.lang.Math.max(r4, r9)
        L_0x03ff:
            int r6 = r6 + 1
            goto L_0x03e7
        L_0x0402:
            int r6 = r13.setPopupCallback
            int r8 = r13.IconCompatParcelizer
            float r8 = (float) r8
            float r4 = r4 * r8
            int r4 = java.lang.Math.round(r4)
            o.setContentId r8 = r13.setPadding
            int r8 = r8.IconCompatParcelizer()
            if (r8 != r7) goto L_0x041e
            o.setContentId r7 = r13.setPadding
            int r7 = r7.MediaBrowserCompat$SearchResultReceiver()
            int r4 = java.lang.Math.min(r4, r7)
        L_0x041e:
            int r7 = r13.IconCompatParcelizer
            int r7 = r4 / r7
            r13.setPopupCallback = r7
            o.setContentId r7 = r13.setPadding
            int r7 = r7.IconCompatParcelizer()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r7)
            int r4 = r13.setPopupCallback
            if (r4 == r6) goto L_0x0486
            r4 = r0
        L_0x0432:
            if (r4 >= r5) goto L_0x0486
            android.view.View r7 = r13.MediaDescriptionCompat((int) r4)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$IconCompatParcelizer r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer) r8
            androidx.recyclerview.widget.RecyclerView r9 = r13.setHasDecor
            int r9 = p040o.SwitchCompat.m3079x50fd9e4a(r9)
            if (r9 == r1) goto L_0x0448
            r9 = r0
            goto L_0x0449
        L_0x0448:
            r9 = r1
        L_0x0449:
            if (r9 == 0) goto L_0x046a
            int r9 = r13.MediaBrowserCompat$ItemReceiver
            if (r9 != r1) goto L_0x046a
            int r9 = r13.IconCompatParcelizer
            int r9 = r9 - r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver r10 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r10.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9 - r10
            int r9 = -r9
            int r10 = r13.setPopupCallback
            int r11 = r13.IconCompatParcelizer
            int r11 = r11 - r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r11 = r11 - r8
            int r8 = -r11
            int r9 = r9 * r10
            int r8 = r8 * r6
            int r9 = r9 - r8
            r7.offsetLeftAndRight(r9)
            goto L_0x0483
        L_0x046a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r13.setPopupCallback
            int r9 = r9 * r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r8 * r6
            int r10 = r13.MediaBrowserCompat$ItemReceiver
            if (r10 != r1) goto L_0x047f
            int r9 = r9 - r8
            r7.offsetLeftAndRight(r9)
            goto L_0x0483
        L_0x047f:
            int r9 = r9 - r8
            r7.offsetTopAndBottom(r9)
        L_0x0483:
            int r4 = r4 + 1
            goto L_0x0432
        L_0x0486:
            int r4 = r13.MediaSessionCompat$ResultReceiverWrapper()
            if (r4 <= 0) goto L_0x049d
            boolean r4 = r13.setItemInvoker
            if (r4 == 0) goto L_0x0497
            r13.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r14, (androidx.recyclerview.widget.RecyclerView.Keep) r15, (boolean) r1)
            r13.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r14, (androidx.recyclerview.widget.RecyclerView.Keep) r15, (boolean) r0)
            goto L_0x049d
        L_0x0497:
            r13.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r14, (androidx.recyclerview.widget.RecyclerView.Keep) r15, (boolean) r1)
            r13.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r14, (androidx.recyclerview.widget.RecyclerView.Keep) r15, (boolean) r0)
        L_0x049d:
            if (r2 == 0) goto L_0x04c9
            boolean r2 = r15.MediaBrowserCompat$ItemReceiver
            if (r2 != 0) goto L_0x04c9
            int r2 = r13.MediaDescriptionCompat
            if (r2 == 0) goto L_0x04b5
            int r2 = r13.MediaSessionCompat$ResultReceiverWrapper()
            if (r2 <= 0) goto L_0x04b5
            android.view.View r2 = r13.MediaBrowserCompat$MediaItem()
            if (r2 == 0) goto L_0x04b5
            r2 = r1
            goto L_0x04b6
        L_0x04b5:
            r2 = r0
        L_0x04b6:
            if (r2 == 0) goto L_0x04c9
            java.lang.Runnable r2 = r13.MediaBrowserCompat$SearchResultReceiver
            androidx.recyclerview.widget.RecyclerView r4 = r13.setHasDecor
            if (r4 == 0) goto L_0x04c1
            r4.removeCallbacks(r2)
        L_0x04c1:
            boolean r2 = r13.RatingCompat()
            if (r2 == 0) goto L_0x04c9
            r2 = r1
            goto L_0x04ca
        L_0x04c9:
            r2 = r0
        L_0x04ca:
            boolean r4 = r15.MediaBrowserCompat$ItemReceiver
            if (r4 == 0) goto L_0x04d3
            androidx.recyclerview.widget.StaggeredGridLayoutManager$write r4 = r13.read
            r4.IconCompatParcelizer()
        L_0x04d3:
            boolean r3 = r3.write
            r13.MediaMetadataCompat = r3
            androidx.recyclerview.widget.RecyclerView r3 = r13.setHasDecor
            int r3 = p040o.SwitchCompat.m3079x50fd9e4a(r3)
            if (r3 == r1) goto L_0x04e1
            r3 = r0
            goto L_0x04e2
        L_0x04e1:
            r3 = r1
        L_0x04e2:
            r13.RatingCompat = r3
            if (r2 == 0) goto L_0x04ee
            androidx.recyclerview.widget.StaggeredGridLayoutManager$write r2 = r13.read
            r2.IconCompatParcelizer()
            r2 = r0
            goto L_0x0003
        L_0x04ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.MediaBrowserCompat$CustomActionResultReceiver(androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper, androidx.recyclerview.widget.RecyclerView$Keep):void");
    }

    private void MediaBrowserCompat$ItemReceiver(int i, RecyclerView.Keep keep) {
        int i2 = -1;
        int i3 = 0;
        if (i > 0) {
            int MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
            if (MediaSessionCompat$ResultReceiverWrapper != 0) {
                RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat(MediaSessionCompat$ResultReceiverWrapper - 1).getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
                int i4 = setcontentview.ParcelableVolumeInfo;
                i3 = i4 == -1 ? setcontentview.MediaSessionCompat$QueueItem : i4;
            }
            i2 = 1;
        } else if (MediaSessionCompat$ResultReceiverWrapper() != 0) {
            RecyclerView.setContentView setcontentview2 = ((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat(0).getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            int i5 = setcontentview2.ParcelableVolumeInfo;
            i3 = i5 == -1 ? setcontentview2.MediaSessionCompat$QueueItem : i5;
        }
        this.AppCompatViewInflater.MediaMetadataCompat = true;
        write(i3, keep);
        ParcelableVolumeInfo(i2);
        getSupportImageTintList getsupportimagetintlist = this.AppCompatViewInflater;
        getsupportimagetintlist.write = i3 + getsupportimagetintlist.MediaBrowserCompat$CustomActionResultReceiver;
        this.AppCompatViewInflater.read = Math.abs(i);
    }

    private void IconCompatParcelizer(boolean z) {
        if (this.setExpandedFormat == null) {
            super.read((String) null);
        }
        read read2 = this.setExpandedFormat;
        if (!(read2 == null || read2.write == z)) {
            this.setExpandedFormat.write = z;
        }
        this.write = z;
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private void m25x50fd9e4a(int i) {
        if (this.setExpandedFormat == null) {
            super.read((String) null);
        }
        if (i != this.IconCompatParcelizer) {
            C0068xf916f2be staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver = this.setCheckable;
            int[] iArr = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = null;
            RecyclerView recyclerView = this.setHasDecor;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
            this.IconCompatParcelizer = i;
            this.setIcon = new BitSet(this.IconCompatParcelizer);
            this.setForceShowIcon = new StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver[this.IconCompatParcelizer];
            for (int i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
                this.setForceShowIcon[i2] = new StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver(this, i2);
            }
            RecyclerView recyclerView2 = this.setHasDecor;
            if (recyclerView2 != null) {
                recyclerView2.requestLayout();
            }
        }
    }
}

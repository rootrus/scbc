package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.AlertController$RecycleListView;
import p040o.SwitchCompat;
import p040o.setContentId;
import p040o.setGuidelineBegin;
import p040o.setMinWidth;

public class LinearLayoutManager extends RecyclerView$MediaBrowserCompat$SearchResultReceiver implements RecyclerView.PlaybackStateCompat.read {
    private int ActionMenuItemView;
    private boolean AppCompatViewInflater;
    private int IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final read MediaBrowserCompat$ItemReceiver;
    final IconCompatParcelizer MediaBrowserCompat$MediaItem;
    boolean MediaBrowserCompat$SearchResultReceiver;
    LinearLayoutManager$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat;
    public int MediaMetadataCompat;
    setContentId RatingCompat;
    private int read;
    private boolean setCheckable;
    private boolean setChecked;
    private write write;

    /* renamed from: o_ */
    public final boolean mo1438o_() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void read(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, IconCompatParcelizer iconCompatParcelizer, int i) {
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    public LinearLayoutManager(int i, boolean z) {
        this.MediaMetadataCompat = 1;
        this.setChecked = false;
        this.MediaBrowserCompat$SearchResultReceiver = false;
        this.AppCompatViewInflater = false;
        this.setCheckable = true;
        this.IconCompatParcelizer = -1;
        this.ActionMenuItemView = PKIFailureInfo.systemUnavail;
        this.MediaDescriptionCompat = null;
        this.MediaBrowserCompat$MediaItem = new IconCompatParcelizer();
        this.MediaBrowserCompat$ItemReceiver = new read();
        this.read = 2;
        MediaMetadataCompat(i);
        if (this.MediaDescriptionCompat == null) {
            super.read((String) null);
        }
        if (z != this.setChecked) {
            this.setChecked = z;
            RecyclerView recyclerView = this.setHasDecor;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.MediaMetadataCompat = 1;
        this.setChecked = false;
        this.MediaBrowserCompat$SearchResultReceiver = false;
        this.AppCompatViewInflater = false;
        this.setCheckable = true;
        this.IconCompatParcelizer = -1;
        this.ActionMenuItemView = PKIFailureInfo.systemUnavail;
        this.MediaDescriptionCompat = null;
        this.MediaBrowserCompat$MediaItem = new IconCompatParcelizer();
        this.MediaBrowserCompat$ItemReceiver = new read();
        this.read = 2;
        C5530x1a4d18ae write2 = write(context, attributeSet, i, i2);
        MediaMetadataCompat(write2.MediaBrowserCompat$ItemReceiver);
        boolean z = write2.read;
        if (this.MediaDescriptionCompat == null) {
            super.read((String) null);
        }
        if (z != this.setChecked) {
            this.setChecked = z;
            RecyclerView recyclerView = this.setHasDecor;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
        IconCompatParcelizer(write2.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public RecyclerView.MediaDescriptionCompat MediaBrowserCompat$ItemReceiver() {
        return new RecyclerView.MediaDescriptionCompat(-2, -2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper) {
        super.MediaBrowserCompat$CustomActionResultReceiver(recyclerView, recyclerView$MediaSessionCompat$ResultReceiverWrapper);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AccessibilityEvent accessibilityEvent) {
        super.MediaBrowserCompat$CustomActionResultReceiver(accessibilityEvent);
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        if ((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) > 0) {
            accessibilityEvent.setFromIndex(MediaMetadataCompat());
            setMinWidth setminwidth2 = this.MediaSessionCompat$ResultReceiverWrapper;
            int i = -1;
            View read2 = read((setminwidth2 != null ? setminwidth2.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth2.MediaBrowserCompat$ItemReceiver.size() : 0) - 1, -1, false, true);
            if (read2 != null) {
                RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) read2.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
                int i2 = setcontentview.ParcelableVolumeInfo;
                i = i2 == -1 ? setcontentview.MediaSessionCompat$QueueItem : i2;
            }
            accessibilityEvent.setToIndex(i);
        }
    }

    /* renamed from: n_ */
    public final Parcelable mo1437n_() {
        if (this.MediaDescriptionCompat != null) {
            return new LinearLayoutManager$MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat);
        }
        LinearLayoutManager$MediaBrowserCompat$ItemReceiver linearLayoutManager$MediaBrowserCompat$ItemReceiver = new LinearLayoutManager$MediaBrowserCompat$ItemReceiver();
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        if ((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) > 0) {
            if (this.write == null) {
                this.write = new write();
            }
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver ^ this.MediaBrowserCompat$SearchResultReceiver;
            linearLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = z;
            if (z) {
                View AppCompatDialogFragment = AppCompatDialogFragment();
                linearLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = this.RatingCompat.MediaBrowserCompat$ItemReceiver() - this.RatingCompat.IconCompatParcelizer(AppCompatDialogFragment);
                RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) AppCompatDialogFragment.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
                int i = setcontentview.ParcelableVolumeInfo;
                if (i == -1) {
                    i = setcontentview.MediaSessionCompat$QueueItem;
                }
                linearLayoutManager$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = i;
            } else {
                View backgroundResource = setBackgroundResource();
                RecyclerView.setContentView setcontentview2 = ((RecyclerView.MediaDescriptionCompat) backgroundResource.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
                int i2 = setcontentview2.ParcelableVolumeInfo;
                if (i2 == -1) {
                    i2 = setcontentview2.MediaSessionCompat$QueueItem;
                }
                linearLayoutManager$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = i2;
                linearLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = this.RatingCompat.MediaBrowserCompat$ItemReceiver(backgroundResource) - this.RatingCompat.MediaDescriptionCompat();
            }
        } else {
            linearLayoutManager$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = -1;
        }
        return linearLayoutManager$MediaBrowserCompat$ItemReceiver;
    }

    public final void IconCompatParcelizer(Parcelable parcelable) {
        if (parcelable instanceof LinearLayoutManager$MediaBrowserCompat$ItemReceiver) {
            this.MediaDescriptionCompat = (LinearLayoutManager$MediaBrowserCompat$ItemReceiver) parcelable;
            RecyclerView recyclerView = this.setHasDecor;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
    }

    public final boolean write() {
        return this.MediaMetadataCompat == 0;
    }

    public boolean read() {
        return this.MediaMetadataCompat == 1;
    }

    public final void MediaMetadataCompat(int i) {
        setContentId setcontentid;
        if (i == 0 || i == 1) {
            if (this.MediaDescriptionCompat == null) {
                super.read((String) null);
            }
            if (i != this.MediaMetadataCompat || this.RatingCompat == null) {
                if (i == 0) {
                    setcontentid = new setContentId(this) {
                        public final int MediaBrowserCompat$ItemReceiver() {
                            return this.read.setBackgroundResource - this.read.getPaddingRight();
                        }

                        public final int read() {
                            return this.read.setBackgroundResource;
                        }

                        public final void write(int i) {
                            this.read.RatingCompat(i);
                        }

                        public final int MediaDescriptionCompat() {
                            return this.read.getPaddingLeft();
                        }

                        public final int read(View view) {
                            RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
                            return RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver(view) + mediaDescriptionCompat.leftMargin + mediaDescriptionCompat.rightMargin;
                        }

                        public final int MediaBrowserCompat$CustomActionResultReceiver(View view) {
                            RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
                            return RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(view) + mediaDescriptionCompat.topMargin + mediaDescriptionCompat.bottomMargin;
                        }

                        public final int IconCompatParcelizer(View view) {
                            return view.getRight() + RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem(view) + ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).rightMargin;
                        }

                        public final int MediaBrowserCompat$ItemReceiver(View view) {
                            return (view.getLeft() - RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat(view)) - ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).leftMargin;
                        }

                        public final int write(View view) {
                            this.read.write(view, this.write);
                            return this.write.right;
                        }

                        public final int MediaDescriptionCompat(View view) {
                            this.read.write(view, this.write);
                            return this.write.left;
                        }

                        public final int MediaBrowserCompat$SearchResultReceiver() {
                            return (this.read.setBackgroundResource - this.read.getPaddingLeft()) - this.read.getPaddingRight();
                        }

                        public final int MediaBrowserCompat$CustomActionResultReceiver() {
                            return this.read.getPaddingRight();
                        }

                        public final int IconCompatParcelizer() {
                            return this.read.setContentView;
                        }

                        public final int MediaBrowserCompat$MediaItem() {
                            return this.read.MediaSessionCompat$QueueItem;
                        }
                    };
                } else if (i == 1) {
                    setcontentid = new setContentId(this) {
                        public final int MediaBrowserCompat$ItemReceiver() {
                            return this.read.ParcelableVolumeInfo - this.read.getPaddingBottom();
                        }

                        public final int read() {
                            return this.read.ParcelableVolumeInfo;
                        }

                        public final void write(int i) {
                            this.read.MediaBrowserCompat$SearchResultReceiver(i);
                        }

                        public final int MediaDescriptionCompat() {
                            return this.read.getPaddingTop();
                        }

                        public final int read(View view) {
                            RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
                            return RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(view) + mediaDescriptionCompat.topMargin + mediaDescriptionCompat.bottomMargin;
                        }

                        public final int MediaBrowserCompat$CustomActionResultReceiver(View view) {
                            RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
                            return RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver(view) + mediaDescriptionCompat.leftMargin + mediaDescriptionCompat.rightMargin;
                        }

                        public final int IconCompatParcelizer(View view) {
                            return view.getBottom() + RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(view) + ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).bottomMargin;
                        }

                        public final int MediaBrowserCompat$ItemReceiver(View view) {
                            return (view.getTop() - RecyclerView$MediaBrowserCompat$SearchResultReceiver.RatingCompat(view)) - ((RecyclerView.MediaDescriptionCompat) view.getLayoutParams()).topMargin;
                        }

                        public final int write(View view) {
                            this.read.write(view, this.write);
                            return this.write.bottom;
                        }

                        public final int MediaDescriptionCompat(View view) {
                            this.read.write(view, this.write);
                            return this.write.top;
                        }

                        public final int MediaBrowserCompat$SearchResultReceiver() {
                            return (this.read.ParcelableVolumeInfo - this.read.getPaddingTop()) - this.read.getPaddingBottom();
                        }

                        public final int MediaBrowserCompat$CustomActionResultReceiver() {
                            return this.read.getPaddingBottom();
                        }

                        public final int IconCompatParcelizer() {
                            return this.read.MediaSessionCompat$QueueItem;
                        }

                        public final int MediaBrowserCompat$MediaItem() {
                            return this.read.setContentView;
                        }
                    };
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
                this.RatingCompat = setcontentid;
                this.MediaBrowserCompat$MediaItem.read = setcontentid;
                this.MediaMetadataCompat = i;
                RecyclerView recyclerView = this.setHasDecor;
                if (recyclerView != null) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private void setContentView() {
        if (this.MediaMetadataCompat != 1) {
            if (SwitchCompat.m3079x50fd9e4a(this.setHasDecor) == 1) {
                this.MediaBrowserCompat$SearchResultReceiver = !this.setChecked;
                return;
            }
        }
        this.MediaBrowserCompat$SearchResultReceiver = this.setChecked;
    }

    public final void IconCompatParcelizer(RecyclerView recyclerView, int i) {
        setGuidelineBegin setguidelinebegin = new setGuidelineBegin(recyclerView.getContext());
        setguidelinebegin.MediaBrowserCompat$MediaItem = i;
        write((RecyclerView.PlaybackStateCompat) setguidelinebegin);
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void MediaBrowserCompat$CustomActionResultReceiver(androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r17, androidx.recyclerview.widget.RecyclerView.Keep r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.LinearLayoutManager$MediaBrowserCompat$ItemReceiver r3 = r0.MediaDescriptionCompat
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.IconCompatParcelizer
            if (r3 == r4) goto L_0x0021
        L_0x000f:
            boolean r3 = r2.MediaBrowserCompat$ItemReceiver
            if (r3 == 0) goto L_0x0019
            int r3 = r2.MediaDescriptionCompat
            int r5 = r2.IconCompatParcelizer
            int r3 = r3 - r5
            goto L_0x001b
        L_0x0019:
            int r3 = r2.MediaBrowserCompat$MediaItem
        L_0x001b:
            if (r3 != 0) goto L_0x0021
            r16.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r17)
            return
        L_0x0021:
            androidx.recyclerview.widget.LinearLayoutManager$MediaBrowserCompat$ItemReceiver r3 = r0.MediaDescriptionCompat
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0036
            int r3 = r3.IconCompatParcelizer
            if (r3 < 0) goto L_0x002d
            r3 = r5
            goto L_0x002e
        L_0x002d:
            r3 = r6
        L_0x002e:
            if (r3 == 0) goto L_0x0036
            androidx.recyclerview.widget.LinearLayoutManager$MediaBrowserCompat$ItemReceiver r3 = r0.MediaDescriptionCompat
            int r3 = r3.IconCompatParcelizer
            r0.IconCompatParcelizer = r3
        L_0x0036:
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            if (r3 != 0) goto L_0x0041
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = new androidx.recyclerview.widget.LinearLayoutManager$write
            r3.<init>()
            r0.write = r3
        L_0x0041:
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r3.RatingCompat = r6
            r16.setContentView()
            android.view.View r3 = r16.ParcelableVolumeInfo()
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r7 = r0.MediaBrowserCompat$MediaItem
            boolean r7 = r7.MediaBrowserCompat$CustomActionResultReceiver
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x008f
            int r7 = r0.IconCompatParcelizer
            if (r7 != r4) goto L_0x008f
            androidx.recyclerview.widget.LinearLayoutManager$MediaBrowserCompat$ItemReceiver r7 = r0.MediaDescriptionCompat
            if (r7 != 0) goto L_0x008f
            if (r3 == 0) goto L_0x0300
            o.setContentId r7 = r0.RatingCompat
            int r7 = r7.MediaBrowserCompat$ItemReceiver(r3)
            o.setContentId r9 = r0.RatingCompat
            int r9 = r9.MediaBrowserCompat$ItemReceiver()
            if (r7 >= r9) goto L_0x007a
            o.setContentId r7 = r0.RatingCompat
            int r7 = r7.IconCompatParcelizer(r3)
            o.setContentId r9 = r0.RatingCompat
            int r9 = r9.MediaDescriptionCompat()
            if (r7 > r9) goto L_0x0300
        L_0x007a:
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r7 = r0.MediaBrowserCompat$MediaItem
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r9 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r9
            androidx.recyclerview.widget.RecyclerView$setContentView r9 = r9.MediaBrowserCompat$SearchResultReceiver
            int r10 = r9.ParcelableVolumeInfo
            if (r10 != r4) goto L_0x008a
            int r10 = r9.MediaSessionCompat$QueueItem
        L_0x008a:
            r7.read(r3, r10)
            goto L_0x0300
        L_0x008f:
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r3 = r0.MediaBrowserCompat$MediaItem
            r3.write = r4
            r3.MediaBrowserCompat$ItemReceiver = r8
            r3.IconCompatParcelizer = r6
            r3.MediaBrowserCompat$CustomActionResultReceiver = r6
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r3 = r0.MediaBrowserCompat$MediaItem
            boolean r7 = r0.MediaBrowserCompat$SearchResultReceiver
            boolean r9 = r0.AppCompatViewInflater
            r7 = r7 ^ r9
            r3.IconCompatParcelizer = r7
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r3 = r0.MediaBrowserCompat$MediaItem
            boolean r7 = r2.MediaBrowserCompat$ItemReceiver
            if (r7 != 0) goto L_0x01ef
            int r7 = r0.IconCompatParcelizer
            if (r7 == r4) goto L_0x01ef
            if (r7 < 0) goto L_0x01eb
            boolean r9 = r2.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x00b8
            int r9 = r2.MediaDescriptionCompat
            int r10 = r2.IconCompatParcelizer
            int r9 = r9 - r10
            goto L_0x00ba
        L_0x00b8:
            int r9 = r2.MediaBrowserCompat$MediaItem
        L_0x00ba:
            if (r7 >= r9) goto L_0x01eb
            int r7 = r0.IconCompatParcelizer
            r3.write = r7
            androidx.recyclerview.widget.LinearLayoutManager$MediaBrowserCompat$ItemReceiver r7 = r0.MediaDescriptionCompat
            if (r7 == 0) goto L_0x00f5
            int r7 = r7.IconCompatParcelizer
            if (r7 < 0) goto L_0x00ca
            r7 = r5
            goto L_0x00cb
        L_0x00ca:
            r7 = r6
        L_0x00cb:
            if (r7 == 0) goto L_0x00f5
            androidx.recyclerview.widget.LinearLayoutManager$MediaBrowserCompat$ItemReceiver r7 = r0.MediaDescriptionCompat
            boolean r7 = r7.MediaBrowserCompat$CustomActionResultReceiver
            r3.IconCompatParcelizer = r7
            boolean r7 = r3.IconCompatParcelizer
            if (r7 == 0) goto L_0x00e6
            o.setContentId r7 = r0.RatingCompat
            int r7 = r7.MediaBrowserCompat$ItemReceiver()
            androidx.recyclerview.widget.LinearLayoutManager$MediaBrowserCompat$ItemReceiver r9 = r0.MediaDescriptionCompat
            int r9 = r9.MediaBrowserCompat$ItemReceiver
            int r7 = r7 - r9
            r3.MediaBrowserCompat$ItemReceiver = r7
            goto L_0x01e9
        L_0x00e6:
            o.setContentId r7 = r0.RatingCompat
            int r7 = r7.MediaDescriptionCompat()
            androidx.recyclerview.widget.LinearLayoutManager$MediaBrowserCompat$ItemReceiver r9 = r0.MediaDescriptionCompat
            int r9 = r9.MediaBrowserCompat$ItemReceiver
            int r7 = r7 + r9
            r3.MediaBrowserCompat$ItemReceiver = r7
            goto L_0x01e9
        L_0x00f5:
            int r7 = r0.ActionMenuItemView
            if (r7 != r8) goto L_0x01ca
            int r7 = r0.IconCompatParcelizer
            android.view.View r7 = r0.MediaBrowserCompat$CustomActionResultReceiver((int) r7)
            if (r7 == 0) goto L_0x017f
            o.setContentId r9 = r0.RatingCompat
            int r9 = r9.read(r7)
            o.setContentId r10 = r0.RatingCompat
            int r10 = r10.MediaBrowserCompat$SearchResultReceiver()
            if (r9 <= r10) goto L_0x0124
            boolean r7 = r3.IconCompatParcelizer
            if (r7 == 0) goto L_0x011a
            o.setContentId r7 = r3.read
            int r7 = r7.MediaBrowserCompat$ItemReceiver()
            goto L_0x0120
        L_0x011a:
            o.setContentId r7 = r3.read
            int r7 = r7.MediaDescriptionCompat()
        L_0x0120:
            r3.MediaBrowserCompat$ItemReceiver = r7
            goto L_0x01e9
        L_0x0124:
            o.setContentId r9 = r0.RatingCompat
            int r9 = r9.MediaBrowserCompat$ItemReceiver(r7)
            o.setContentId r10 = r0.RatingCompat
            int r10 = r10.MediaDescriptionCompat()
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x013f
            o.setContentId r7 = r0.RatingCompat
            int r7 = r7.MediaDescriptionCompat()
            r3.MediaBrowserCompat$ItemReceiver = r7
            r3.IconCompatParcelizer = r6
            goto L_0x01e9
        L_0x013f:
            o.setContentId r9 = r0.RatingCompat
            int r9 = r9.MediaBrowserCompat$ItemReceiver()
            o.setContentId r10 = r0.RatingCompat
            int r10 = r10.IconCompatParcelizer(r7)
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x015a
            o.setContentId r7 = r0.RatingCompat
            int r7 = r7.MediaBrowserCompat$ItemReceiver()
            r3.MediaBrowserCompat$ItemReceiver = r7
            r3.IconCompatParcelizer = r5
            goto L_0x01e9
        L_0x015a:
            boolean r9 = r3.IconCompatParcelizer
            if (r9 == 0) goto L_0x0175
            o.setContentId r9 = r0.RatingCompat
            int r7 = r9.IconCompatParcelizer(r7)
            o.setContentId r9 = r0.RatingCompat
            int r10 = r9.IconCompatParcelizer
            if (r8 != r10) goto L_0x016c
            r10 = r6
            goto L_0x0173
        L_0x016c:
            int r10 = r9.MediaBrowserCompat$SearchResultReceiver()
            int r9 = r9.IconCompatParcelizer
            int r10 = r10 - r9
        L_0x0173:
            int r7 = r7 + r10
            goto L_0x017b
        L_0x0175:
            o.setContentId r9 = r0.RatingCompat
            int r7 = r9.MediaBrowserCompat$ItemReceiver(r7)
        L_0x017b:
            r3.MediaBrowserCompat$ItemReceiver = r7
            goto L_0x01e9
        L_0x017f:
            o.setMinWidth r7 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r7 == 0) goto L_0x0191
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r9 = r7.read
            int r9 = r9.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r7 = r7.MediaBrowserCompat$ItemReceiver
            int r7 = r7.size()
            int r9 = r9 - r7
            goto L_0x0192
        L_0x0191:
            r9 = r6
        L_0x0192:
            if (r9 <= 0) goto L_0x01b6
            android.view.View r7 = r0.MediaDescriptionCompat((int) r6)
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r7 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r7
            androidx.recyclerview.widget.RecyclerView$setContentView r7 = r7.MediaBrowserCompat$SearchResultReceiver
            int r9 = r7.ParcelableVolumeInfo
            if (r9 != r4) goto L_0x01a6
            int r9 = r7.MediaSessionCompat$QueueItem
        L_0x01a6:
            int r7 = r0.IconCompatParcelizer
            if (r7 >= r9) goto L_0x01ac
            r7 = r5
            goto L_0x01ad
        L_0x01ac:
            r7 = r6
        L_0x01ad:
            boolean r9 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r7 != r9) goto L_0x01b3
            r7 = r5
            goto L_0x01b4
        L_0x01b3:
            r7 = r6
        L_0x01b4:
            r3.IconCompatParcelizer = r7
        L_0x01b6:
            boolean r7 = r3.IconCompatParcelizer
            if (r7 == 0) goto L_0x01c1
            o.setContentId r7 = r3.read
            int r7 = r7.MediaBrowserCompat$ItemReceiver()
            goto L_0x01c7
        L_0x01c1:
            o.setContentId r7 = r3.read
            int r7 = r7.MediaDescriptionCompat()
        L_0x01c7:
            r3.MediaBrowserCompat$ItemReceiver = r7
            goto L_0x01e9
        L_0x01ca:
            boolean r7 = r0.MediaBrowserCompat$SearchResultReceiver
            r3.IconCompatParcelizer = r7
            boolean r7 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r7 == 0) goto L_0x01de
            o.setContentId r7 = r0.RatingCompat
            int r7 = r7.MediaBrowserCompat$ItemReceiver()
            int r9 = r0.ActionMenuItemView
            int r7 = r7 - r9
            r3.MediaBrowserCompat$ItemReceiver = r7
            goto L_0x01e9
        L_0x01de:
            o.setContentId r7 = r0.RatingCompat
            int r7 = r7.MediaDescriptionCompat()
            int r9 = r0.ActionMenuItemView
            int r7 = r7 + r9
            r3.MediaBrowserCompat$ItemReceiver = r7
        L_0x01e9:
            r7 = r5
            goto L_0x01f0
        L_0x01eb:
            r0.IconCompatParcelizer = r4
            r0.ActionMenuItemView = r8
        L_0x01ef:
            r7 = r6
        L_0x01f0:
            if (r7 != 0) goto L_0x02fc
            o.setMinWidth r7 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r7 == 0) goto L_0x0204
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r9 = r7.read
            int r9 = r9.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r7 = r7.MediaBrowserCompat$ItemReceiver
            int r7 = r7.size()
            int r9 = r9 - r7
            goto L_0x0205
        L_0x0204:
            r9 = r6
        L_0x0205:
            if (r9 == 0) goto L_0x02d1
            android.view.View r7 = r16.ParcelableVolumeInfo()
            if (r7 == 0) goto L_0x0259
            android.view.ViewGroup$LayoutParams r9 = r7.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r9 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r9
            androidx.recyclerview.widget.RecyclerView$setContentView r10 = r9.MediaBrowserCompat$SearchResultReceiver
            int r10 = r10.read
            r10 = r10 & 8
            if (r10 == 0) goto L_0x021d
            r10 = r5
            goto L_0x021e
        L_0x021d:
            r10 = r6
        L_0x021e:
            if (r10 != 0) goto L_0x0242
            androidx.recyclerview.widget.RecyclerView$setContentView r10 = r9.MediaBrowserCompat$SearchResultReceiver
            int r11 = r10.ParcelableVolumeInfo
            if (r11 != r4) goto L_0x0228
            int r11 = r10.MediaSessionCompat$QueueItem
        L_0x0228:
            if (r11 < 0) goto L_0x0242
            androidx.recyclerview.widget.RecyclerView$setContentView r9 = r9.MediaBrowserCompat$SearchResultReceiver
            int r10 = r9.ParcelableVolumeInfo
            if (r10 != r4) goto L_0x0232
            int r10 = r9.MediaSessionCompat$QueueItem
        L_0x0232:
            boolean r9 = r2.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x023c
            int r9 = r2.MediaDescriptionCompat
            int r11 = r2.IconCompatParcelizer
            int r9 = r9 - r11
            goto L_0x023e
        L_0x023c:
            int r9 = r2.MediaBrowserCompat$MediaItem
        L_0x023e:
            if (r10 >= r9) goto L_0x0242
            r9 = r5
            goto L_0x0243
        L_0x0242:
            r9 = r6
        L_0x0243:
            if (r9 == 0) goto L_0x0259
            android.view.ViewGroup$LayoutParams r9 = r7.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r9 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r9
            androidx.recyclerview.widget.RecyclerView$setContentView r9 = r9.MediaBrowserCompat$SearchResultReceiver
            int r10 = r9.ParcelableVolumeInfo
            if (r10 != r4) goto L_0x0253
            int r10 = r9.MediaSessionCompat$QueueItem
        L_0x0253:
            r3.read(r7, r10)
        L_0x0256:
            r7 = r5
            goto L_0x02d2
        L_0x0259:
            boolean r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r9 = r0.AppCompatViewInflater
            if (r7 != r9) goto L_0x02d1
            boolean r7 = r3.IconCompatParcelizer
            if (r7 == 0) goto L_0x0271
            boolean r7 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r7 == 0) goto L_0x026c
            android.view.View r7 = r16.write((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r17, (androidx.recyclerview.widget.RecyclerView.Keep) r18)
            goto L_0x027e
        L_0x026c:
            android.view.View r7 = r16.read(r17, r18)
            goto L_0x027e
        L_0x0271:
            boolean r7 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r7 == 0) goto L_0x027a
            android.view.View r7 = r16.read(r17, r18)
            goto L_0x027e
        L_0x027a:
            android.view.View r7 = r16.write((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r17, (androidx.recyclerview.widget.RecyclerView.Keep) r18)
        L_0x027e:
            if (r7 == 0) goto L_0x02d1
            android.view.ViewGroup$LayoutParams r9 = r7.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r9 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r9
            androidx.recyclerview.widget.RecyclerView$setContentView r9 = r9.MediaBrowserCompat$SearchResultReceiver
            int r10 = r9.ParcelableVolumeInfo
            if (r10 != r4) goto L_0x028e
            int r10 = r9.MediaSessionCompat$QueueItem
        L_0x028e:
            r3.IconCompatParcelizer(r7, r10)
            boolean r9 = r2.MediaBrowserCompat$ItemReceiver
            if (r9 != 0) goto L_0x0256
            boolean r9 = r16.mo1407q_()
            if (r9 == 0) goto L_0x0256
            o.setContentId r9 = r0.RatingCompat
            int r9 = r9.MediaBrowserCompat$ItemReceiver(r7)
            o.setContentId r10 = r0.RatingCompat
            int r10 = r10.MediaBrowserCompat$ItemReceiver()
            if (r9 >= r10) goto L_0x02ba
            o.setContentId r9 = r0.RatingCompat
            int r7 = r9.IconCompatParcelizer(r7)
            o.setContentId r9 = r0.RatingCompat
            int r9 = r9.MediaDescriptionCompat()
            if (r7 >= r9) goto L_0x02b8
            goto L_0x02ba
        L_0x02b8:
            r7 = r6
            goto L_0x02bb
        L_0x02ba:
            r7 = r5
        L_0x02bb:
            if (r7 == 0) goto L_0x0256
            boolean r7 = r3.IconCompatParcelizer
            if (r7 == 0) goto L_0x02c8
            o.setContentId r7 = r0.RatingCompat
            int r7 = r7.MediaBrowserCompat$ItemReceiver()
            goto L_0x02ce
        L_0x02c8:
            o.setContentId r7 = r0.RatingCompat
            int r7 = r7.MediaDescriptionCompat()
        L_0x02ce:
            r3.MediaBrowserCompat$ItemReceiver = r7
            goto L_0x0256
        L_0x02d1:
            r7 = r6
        L_0x02d2:
            if (r7 != 0) goto L_0x02fc
            boolean r7 = r3.IconCompatParcelizer
            if (r7 == 0) goto L_0x02df
            o.setContentId r7 = r3.read
            int r7 = r7.MediaBrowserCompat$ItemReceiver()
            goto L_0x02e5
        L_0x02df:
            o.setContentId r7 = r3.read
            int r7 = r7.MediaDescriptionCompat()
        L_0x02e5:
            r3.MediaBrowserCompat$ItemReceiver = r7
            boolean r7 = r0.AppCompatViewInflater
            if (r7 == 0) goto L_0x02f9
            boolean r7 = r2.MediaBrowserCompat$ItemReceiver
            if (r7 == 0) goto L_0x02f5
            int r7 = r2.MediaDescriptionCompat
            int r9 = r2.IconCompatParcelizer
            int r7 = r7 - r9
            goto L_0x02f7
        L_0x02f5:
            int r7 = r2.MediaBrowserCompat$MediaItem
        L_0x02f7:
            int r7 = r7 - r5
            goto L_0x02fa
        L_0x02f9:
            r7 = r6
        L_0x02fa:
            r3.write = r7
        L_0x02fc:
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r3 = r0.MediaBrowserCompat$MediaItem
            r3.MediaBrowserCompat$CustomActionResultReceiver = r5
        L_0x0300:
            int r3 = r2.ParcelableVolumeInfo
            if (r3 == r4) goto L_0x0306
            r3 = r5
            goto L_0x0307
        L_0x0306:
            r3 = r6
        L_0x0307:
            if (r3 == 0) goto L_0x0310
            o.setContentId r3 = r0.RatingCompat
            int r3 = r3.MediaBrowserCompat$SearchResultReceiver()
            goto L_0x0311
        L_0x0310:
            r3 = r6
        L_0x0311:
            androidx.recyclerview.widget.LinearLayoutManager$write r7 = r0.write
            int r7 = r7.MediaDescriptionCompat
            if (r7 < 0) goto L_0x031a
            r7 = r3
            r3 = r6
            goto L_0x031b
        L_0x031a:
            r7 = r6
        L_0x031b:
            o.setContentId r9 = r0.RatingCompat
            int r9 = r9.MediaDescriptionCompat()
            int r3 = r3 + r9
            o.setContentId r9 = r0.RatingCompat
            int r9 = r9.MediaBrowserCompat$CustomActionResultReceiver()
            int r7 = r7 + r9
            boolean r9 = r2.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x0364
            int r9 = r0.IconCompatParcelizer
            if (r9 == r4) goto L_0x0364
            int r10 = r0.ActionMenuItemView
            if (r10 == r8) goto L_0x0364
            android.view.View r9 = r0.MediaBrowserCompat$CustomActionResultReceiver((int) r9)
            if (r9 == 0) goto L_0x0364
            boolean r10 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r10 == 0) goto L_0x034f
            o.setContentId r10 = r0.RatingCompat
            int r10 = r10.MediaBrowserCompat$ItemReceiver()
            o.setContentId r11 = r0.RatingCompat
            int r9 = r11.IconCompatParcelizer(r9)
            int r10 = r10 - r9
            int r9 = r0.ActionMenuItemView
            goto L_0x035e
        L_0x034f:
            o.setContentId r10 = r0.RatingCompat
            int r9 = r10.MediaBrowserCompat$ItemReceiver(r9)
            o.setContentId r10 = r0.RatingCompat
            int r10 = r10.MediaDescriptionCompat()
            int r9 = r9 - r10
            int r10 = r0.ActionMenuItemView
        L_0x035e:
            int r10 = r10 - r9
            if (r10 <= 0) goto L_0x0363
            int r3 = r3 + r10
            goto L_0x0364
        L_0x0363:
            int r7 = r7 - r10
        L_0x0364:
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r9 = r0.MediaBrowserCompat$MediaItem
            boolean r9 = r9.IconCompatParcelizer
            if (r9 == 0) goto L_0x036f
            boolean r9 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r9 == 0) goto L_0x0373
            goto L_0x0375
        L_0x036f:
            boolean r9 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r9 == 0) goto L_0x0375
        L_0x0373:
            r9 = r4
            goto L_0x0376
        L_0x0375:
            r9 = r5
        L_0x0376:
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r10 = r0.MediaBrowserCompat$MediaItem
            r0.read((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (androidx.recyclerview.widget.LinearLayoutManager.IconCompatParcelizer) r10, (int) r9)
            r16.write((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r17)
            androidx.recyclerview.widget.LinearLayoutManager$write r9 = r0.write
            o.setContentId r10 = r0.RatingCompat
            int r10 = r10.IconCompatParcelizer()
            if (r10 != 0) goto L_0x0392
            o.setContentId r10 = r0.RatingCompat
            int r10 = r10.read()
            if (r10 != 0) goto L_0x0392
            r10 = r5
            goto L_0x0393
        L_0x0392:
            r10 = r6
        L_0x0393:
            r9.write = r10
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r9 = r0.MediaBrowserCompat$MediaItem
            boolean r9 = r9.IconCompatParcelizer
            if (r9 == 0) goto L_0x03fc
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r9 = r0.MediaBrowserCompat$MediaItem
            int r10 = r9.write
            int r9 = r9.MediaBrowserCompat$ItemReceiver
            r0.write((int) r10, (int) r9)
            androidx.recyclerview.widget.LinearLayoutManager$write r9 = r0.write
            r9.IconCompatParcelizer = r3
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r0.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.LinearLayoutManager.write) r3, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (boolean) r6)
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            int r3 = r3.MediaBrowserCompat$MediaItem
            androidx.recyclerview.widget.LinearLayoutManager$write r9 = r0.write
            int r9 = r9.read
            androidx.recyclerview.widget.LinearLayoutManager$write r10 = r0.write
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            if (r10 <= 0) goto L_0x03c0
            androidx.recyclerview.widget.LinearLayoutManager$write r10 = r0.write
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            int r7 = r7 + r10
        L_0x03c0:
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r10 = r0.MediaBrowserCompat$MediaItem
            int r11 = r10.write
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            r0.MediaBrowserCompat$ItemReceiver(r11, r10)
            androidx.recyclerview.widget.LinearLayoutManager$write r10 = r0.write
            r10.IconCompatParcelizer = r7
            androidx.recyclerview.widget.LinearLayoutManager$write r7 = r0.write
            int r10 = r7.read
            androidx.recyclerview.widget.LinearLayoutManager$write r11 = r0.write
            int r11 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r10 + r11
            r7.read = r10
            androidx.recyclerview.widget.LinearLayoutManager$write r7 = r0.write
            r0.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.LinearLayoutManager.write) r7, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (boolean) r6)
            androidx.recyclerview.widget.LinearLayoutManager$write r7 = r0.write
            int r7 = r7.MediaBrowserCompat$MediaItem
            androidx.recyclerview.widget.LinearLayoutManager$write r10 = r0.write
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            if (r10 <= 0) goto L_0x045c
            androidx.recyclerview.widget.LinearLayoutManager$write r10 = r0.write
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            r0.write((int) r9, (int) r3)
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r3.IconCompatParcelizer = r10
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r0.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.LinearLayoutManager.write) r3, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (boolean) r6)
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            int r3 = r3.MediaBrowserCompat$MediaItem
            goto L_0x045c
        L_0x03fc:
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r9 = r0.MediaBrowserCompat$MediaItem
            int r10 = r9.write
            int r9 = r9.MediaBrowserCompat$ItemReceiver
            r0.MediaBrowserCompat$ItemReceiver(r10, r9)
            androidx.recyclerview.widget.LinearLayoutManager$write r9 = r0.write
            r9.IconCompatParcelizer = r7
            androidx.recyclerview.widget.LinearLayoutManager$write r7 = r0.write
            r0.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.LinearLayoutManager.write) r7, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (boolean) r6)
            androidx.recyclerview.widget.LinearLayoutManager$write r7 = r0.write
            int r7 = r7.MediaBrowserCompat$MediaItem
            androidx.recyclerview.widget.LinearLayoutManager$write r9 = r0.write
            int r9 = r9.read
            androidx.recyclerview.widget.LinearLayoutManager$write r10 = r0.write
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            if (r10 <= 0) goto L_0x0421
            androidx.recyclerview.widget.LinearLayoutManager$write r10 = r0.write
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            int r3 = r3 + r10
        L_0x0421:
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r10 = r0.MediaBrowserCompat$MediaItem
            int r11 = r10.write
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            r0.write((int) r11, (int) r10)
            androidx.recyclerview.widget.LinearLayoutManager$write r10 = r0.write
            r10.IconCompatParcelizer = r3
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            int r10 = r3.read
            androidx.recyclerview.widget.LinearLayoutManager$write r11 = r0.write
            int r11 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r10 + r11
            r3.read = r10
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r0.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.LinearLayoutManager.write) r3, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (boolean) r6)
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            int r3 = r3.MediaBrowserCompat$MediaItem
            androidx.recyclerview.widget.LinearLayoutManager$write r10 = r0.write
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            if (r10 <= 0) goto L_0x045c
            androidx.recyclerview.widget.LinearLayoutManager$write r10 = r0.write
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            r0.MediaBrowserCompat$ItemReceiver(r9, r7)
            androidx.recyclerview.widget.LinearLayoutManager$write r7 = r0.write
            r7.IconCompatParcelizer = r10
            androidx.recyclerview.widget.LinearLayoutManager$write r7 = r0.write
            r0.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.LinearLayoutManager.write) r7, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (boolean) r6)
            androidx.recyclerview.widget.LinearLayoutManager$write r7 = r0.write
            int r7 = r7.MediaBrowserCompat$MediaItem
        L_0x045c:
            o.setMinWidth r9 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r9 == 0) goto L_0x046e
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r10 = r9.read
            int r10 = r10.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r9 = r9.MediaBrowserCompat$ItemReceiver
            int r9 = r9.size()
            int r10 = r10 - r9
            goto L_0x046f
        L_0x046e:
            r10 = r6
        L_0x046f:
            if (r10 <= 0) goto L_0x048f
            boolean r9 = r0.MediaBrowserCompat$SearchResultReceiver
            boolean r10 = r0.AppCompatViewInflater
            r9 = r9 ^ r10
            if (r9 == 0) goto L_0x0483
            int r9 = r0.MediaBrowserCompat$ItemReceiver(r7, r1, r2, r5)
            int r3 = r3 + r9
            int r7 = r7 + r9
            int r9 = r0.write(r3, r1, r2, r6)
            goto L_0x048d
        L_0x0483:
            int r9 = r0.write(r3, r1, r2, r5)
            int r3 = r3 + r9
            int r7 = r7 + r9
            int r9 = r0.MediaBrowserCompat$ItemReceiver(r7, r1, r2, r6)
        L_0x048d:
            int r3 = r3 + r9
            int r7 = r7 + r9
        L_0x048f:
            boolean r9 = r2.RatingCompat
            if (r9 == 0) goto L_0x0568
            o.setMinWidth r9 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r9 == 0) goto L_0x04a5
            o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver r10 = r9.read
            int r10 = r10.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List<android.view.View> r9 = r9.MediaBrowserCompat$ItemReceiver
            int r9 = r9.size()
            int r10 = r10 - r9
            goto L_0x04a6
        L_0x04a5:
            r10 = r6
        L_0x04a6:
            if (r10 == 0) goto L_0x0568
            boolean r9 = r2.MediaBrowserCompat$ItemReceiver
            if (r9 != 0) goto L_0x0568
            boolean r9 = r16.mo1407q_()
            if (r9 == 0) goto L_0x0568
            java.util.List<androidx.recyclerview.widget.RecyclerView$setContentView> r9 = r1.MediaBrowserCompat$MediaItem
            int r10 = r9.size()
            android.view.View r11 = r0.MediaDescriptionCompat((int) r6)
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r11 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r11
            androidx.recyclerview.widget.RecyclerView$setContentView r11 = r11.MediaBrowserCompat$SearchResultReceiver
            int r12 = r11.ParcelableVolumeInfo
            if (r12 != r4) goto L_0x04ca
            int r12 = r11.MediaSessionCompat$QueueItem
        L_0x04ca:
            r11 = r6
            r13 = r11
            r14 = r13
        L_0x04cd:
            if (r11 >= r10) goto L_0x050d
            java.lang.Object r15 = r9.get(r11)
            androidx.recyclerview.widget.RecyclerView$setContentView r15 = (androidx.recyclerview.widget.RecyclerView.setContentView) r15
            int r5 = r15.read
            r5 = r5 & 8
            if (r5 == 0) goto L_0x04dd
            r5 = 1
            goto L_0x04de
        L_0x04dd:
            r5 = r6
        L_0x04de:
            if (r5 != 0) goto L_0x0507
            int r5 = r15.ParcelableVolumeInfo
            if (r5 != r4) goto L_0x04e6
            int r5 = r15.MediaSessionCompat$QueueItem
        L_0x04e6:
            if (r5 >= r12) goto L_0x04ea
            r5 = 1
            goto L_0x04eb
        L_0x04ea:
            r5 = r6
        L_0x04eb:
            boolean r8 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r5 == r8) goto L_0x04f1
            r5 = r4
            goto L_0x04f2
        L_0x04f1:
            r5 = 1
        L_0x04f2:
            if (r5 != r4) goto L_0x04fe
            o.setContentId r5 = r0.RatingCompat
            android.view.View r8 = r15.write
            int r5 = r5.read(r8)
            int r13 = r13 + r5
            goto L_0x0507
        L_0x04fe:
            o.setContentId r5 = r0.RatingCompat
            android.view.View r8 = r15.write
            int r5 = r5.read(r8)
            int r14 = r14 + r5
        L_0x0507:
            int r11 = r11 + 1
            r5 = 1
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x04cd
        L_0x050d:
            androidx.recyclerview.widget.LinearLayoutManager$write r5 = r0.write
            r5.MediaBrowserCompat$SearchResultReceiver = r9
            r5 = 0
            if (r13 <= 0) goto L_0x053b
            android.view.View r8 = r16.setBackgroundResource()
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r8 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r8
            androidx.recyclerview.widget.RecyclerView$setContentView r8 = r8.MediaBrowserCompat$SearchResultReceiver
            int r9 = r8.ParcelableVolumeInfo
            if (r9 != r4) goto L_0x0526
            int r9 = r8.MediaSessionCompat$QueueItem
        L_0x0526:
            r0.write((int) r9, (int) r3)
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r3.IconCompatParcelizer = r13
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r3.MediaBrowserCompat$ItemReceiver = r6
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r3.write(r5)
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r0.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.LinearLayoutManager.write) r3, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (boolean) r6)
        L_0x053b:
            if (r14 <= 0) goto L_0x0564
            android.view.View r3 = r16.AppCompatDialogFragment()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r3 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r3
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r3.MediaBrowserCompat$SearchResultReceiver
            int r8 = r3.ParcelableVolumeInfo
            if (r8 != r4) goto L_0x054f
            int r8 = r3.MediaSessionCompat$QueueItem
        L_0x054f:
            r0.MediaBrowserCompat$ItemReceiver(r8, r7)
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r3.IconCompatParcelizer = r14
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r3.MediaBrowserCompat$ItemReceiver = r6
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r3.write(r5)
            androidx.recyclerview.widget.LinearLayoutManager$write r3 = r0.write
            r0.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r1, (androidx.recyclerview.widget.LinearLayoutManager.write) r3, (androidx.recyclerview.widget.RecyclerView.Keep) r2, (boolean) r6)
        L_0x0564:
            androidx.recyclerview.widget.LinearLayoutManager$write r1 = r0.write
            r1.MediaBrowserCompat$SearchResultReceiver = r5
        L_0x0568:
            boolean r1 = r2.MediaBrowserCompat$ItemReceiver
            if (r1 != 0) goto L_0x0575
            o.setContentId r1 = r0.RatingCompat
            int r2 = r1.MediaBrowserCompat$SearchResultReceiver()
            r1.IconCompatParcelizer = r2
            goto L_0x0581
        L_0x0575:
            androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer r1 = r0.MediaBrowserCompat$MediaItem
            r1.write = r4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.MediaBrowserCompat$ItemReceiver = r2
            r1.IconCompatParcelizer = r6
            r1.MediaBrowserCompat$CustomActionResultReceiver = r6
        L_0x0581:
            boolean r1 = r0.AppCompatViewInflater
            r0.MediaBrowserCompat$CustomActionResultReceiver = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.MediaBrowserCompat$CustomActionResultReceiver(androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper, androidx.recyclerview.widget.RecyclerView$Keep):void");
    }

    public void read(RecyclerView.Keep keep) {
        super.read(keep);
        this.MediaDescriptionCompat = null;
        this.IconCompatParcelizer = -1;
        this.ActionMenuItemView = PKIFailureInfo.systemUnavail;
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$MediaItem;
        iconCompatParcelizer.write = -1;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = PKIFailureInfo.systemUnavail;
        iconCompatParcelizer.IconCompatParcelizer = false;
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = false;
    }

    private int MediaBrowserCompat$ItemReceiver(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, boolean z) {
        int MediaBrowserCompat$ItemReceiver2;
        int MediaBrowserCompat$ItemReceiver3 = this.RatingCompat.MediaBrowserCompat$ItemReceiver() - i;
        if (MediaBrowserCompat$ItemReceiver3 <= 0) {
            return 0;
        }
        int i2 = -MediaBrowserCompat$ItemReceiver(-MediaBrowserCompat$ItemReceiver3, recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep);
        if (!z || (MediaBrowserCompat$ItemReceiver2 = this.RatingCompat.MediaBrowserCompat$ItemReceiver() - (i + i2)) <= 0) {
            return i2;
        }
        this.RatingCompat.write(MediaBrowserCompat$ItemReceiver2);
        return MediaBrowserCompat$ItemReceiver2 + i2;
    }

    private int write(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, boolean z) {
        int MediaDescriptionCompat2;
        int MediaDescriptionCompat3 = i - this.RatingCompat.MediaDescriptionCompat();
        if (MediaDescriptionCompat3 <= 0) {
            return 0;
        }
        int i2 = -MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat3, recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep);
        if (!z || (MediaDescriptionCompat2 = (i + i2) - this.RatingCompat.MediaDescriptionCompat()) <= 0) {
            return i2;
        }
        this.RatingCompat.write(-MediaDescriptionCompat2);
        return i2 - MediaDescriptionCompat2;
    }

    private void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        this.write.MediaBrowserCompat$ItemReceiver = this.RatingCompat.MediaBrowserCompat$ItemReceiver() - i2;
        this.write.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$SearchResultReceiver ? -1 : 1;
        this.write.read = i;
        this.write.MediaMetadataCompat = 1;
        this.write.MediaBrowserCompat$MediaItem = i2;
        this.write.f22x50fd9e4a = PKIFailureInfo.systemUnavail;
    }

    private void write(int i, int i2) {
        this.write.MediaBrowserCompat$ItemReceiver = i2 - this.RatingCompat.MediaDescriptionCompat();
        this.write.read = i;
        this.write.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$SearchResultReceiver ? 1 : -1;
        this.write.MediaMetadataCompat = -1;
        this.write.MediaBrowserCompat$MediaItem = i2;
        this.write.f22x50fd9e4a = PKIFailureInfo.systemUnavail;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$MediaItem() {
        if (this.write == null) {
            this.write = new write();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.IconCompatParcelizer = i;
        this.ActionMenuItemView = PKIFailureInfo.systemUnavail;
        LinearLayoutManager$MediaBrowserCompat$ItemReceiver linearLayoutManager$MediaBrowserCompat$ItemReceiver = this.MediaDescriptionCompat;
        if (linearLayoutManager$MediaBrowserCompat$ItemReceiver != null) {
            linearLayoutManager$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = -1;
        }
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void write(int i) {
        this.IconCompatParcelizer = i;
        this.ActionMenuItemView = 5;
        LinearLayoutManager$MediaBrowserCompat$ItemReceiver linearLayoutManager$MediaBrowserCompat$ItemReceiver = this.MediaDescriptionCompat;
        if (linearLayoutManager$MediaBrowserCompat$ItemReceiver != null) {
            linearLayoutManager$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = -1;
        }
        RecyclerView recyclerView = this.setHasDecor;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public int write(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        if (this.MediaMetadataCompat == 1) {
            return 0;
        }
        return MediaBrowserCompat$ItemReceiver(i, recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep);
    }

    public int MediaBrowserCompat$CustomActionResultReceiver(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        if (this.MediaMetadataCompat == 0) {
            return 0;
        }
        return MediaBrowserCompat$ItemReceiver(i, recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep);
    }

    public final int write(RecyclerView.Keep keep) {
        return MediaDescriptionCompat(keep);
    }

    public final int MediaBrowserCompat$SearchResultReceiver(RecyclerView.Keep keep) {
        return MediaDescriptionCompat(keep);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.Keep keep) {
        return RatingCompat(keep);
    }

    public final int MediaBrowserCompat$ItemReceiver(RecyclerView.Keep keep) {
        return RatingCompat(keep);
    }

    public final int IconCompatParcelizer(RecyclerView.Keep keep) {
        return MediaBrowserCompat$MediaItem(keep);
    }

    public final int MediaMetadataCompat(RecyclerView.Keep keep) {
        return MediaBrowserCompat$MediaItem(keep);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, boolean z, RecyclerView.Keep keep) {
        int i3;
        int i4 = 0;
        int i5 = 1;
        this.write.write = this.RatingCompat.IconCompatParcelizer() == 0 && this.RatingCompat.read() == 0;
        write write2 = this.write;
        if (keep.ParcelableVolumeInfo != -1) {
            i4 = this.RatingCompat.MediaBrowserCompat$SearchResultReceiver();
        }
        write2.IconCompatParcelizer = i4;
        this.write.MediaMetadataCompat = i;
        if (i == 1) {
            this.write.IconCompatParcelizer += this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver();
            View AppCompatDialogFragment = AppCompatDialogFragment();
            write write3 = this.write;
            if (this.MediaBrowserCompat$SearchResultReceiver) {
                i5 = -1;
            }
            write3.MediaBrowserCompat$CustomActionResultReceiver = i5;
            write write4 = this.write;
            RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) AppCompatDialogFragment.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            int i6 = setcontentview.ParcelableVolumeInfo;
            if (i6 == -1) {
                i6 = setcontentview.MediaSessionCompat$QueueItem;
            }
            write4.read = i6 + this.write.MediaBrowserCompat$CustomActionResultReceiver;
            this.write.MediaBrowserCompat$MediaItem = this.RatingCompat.IconCompatParcelizer(AppCompatDialogFragment);
            i3 = this.RatingCompat.IconCompatParcelizer(AppCompatDialogFragment) - this.RatingCompat.MediaBrowserCompat$ItemReceiver();
        } else {
            View backgroundResource = setBackgroundResource();
            this.write.IconCompatParcelizer += this.RatingCompat.MediaDescriptionCompat();
            write write5 = this.write;
            if (!this.MediaBrowserCompat$SearchResultReceiver) {
                i5 = -1;
            }
            write5.MediaBrowserCompat$CustomActionResultReceiver = i5;
            write write6 = this.write;
            RecyclerView.setContentView setcontentview2 = ((RecyclerView.MediaDescriptionCompat) backgroundResource.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            int i7 = setcontentview2.ParcelableVolumeInfo;
            if (i7 == -1) {
                i7 = setcontentview2.MediaSessionCompat$QueueItem;
            }
            write6.read = i7 + this.write.MediaBrowserCompat$CustomActionResultReceiver;
            this.write.MediaBrowserCompat$MediaItem = this.RatingCompat.MediaBrowserCompat$ItemReceiver(backgroundResource);
            i3 = (-this.RatingCompat.MediaBrowserCompat$ItemReceiver(backgroundResource)) + this.RatingCompat.MediaDescriptionCompat();
        }
        this.write.MediaBrowserCompat$ItemReceiver = i2;
        if (z) {
            this.write.MediaBrowserCompat$ItemReceiver -= i3;
        }
        this.write.f22x50fd9e4a = i3;
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.Keep keep, write write2, RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer iconCompatParcelizer) {
        int i = write2.read;
        if (i >= 0) {
            if (i < (keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem)) {
                iconCompatParcelizer.read(i, Math.max(0, write2.f22x50fd9e4a));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(int r6, androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.LinearLayoutManager$MediaBrowserCompat$ItemReceiver r0 = r5.MediaDescriptionCompat
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0019
            int r0 = r0.IconCompatParcelizer
            if (r0 < 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.LinearLayoutManager$MediaBrowserCompat$ItemReceiver r0 = r5.MediaDescriptionCompat
            boolean r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            androidx.recyclerview.widget.LinearLayoutManager$MediaBrowserCompat$ItemReceiver r4 = r5.MediaDescriptionCompat
            int r4 = r4.IconCompatParcelizer
            goto L_0x0028
        L_0x0019:
            r5.setContentView()
            boolean r0 = r5.MediaBrowserCompat$SearchResultReceiver
            int r4 = r5.IconCompatParcelizer
            if (r4 != r1) goto L_0x0028
            if (r0 == 0) goto L_0x0027
            int r4 = r6 + -1
            goto L_0x0028
        L_0x0027:
            r4 = r3
        L_0x0028:
            if (r0 != 0) goto L_0x002b
            r1 = r2
        L_0x002b:
            r0 = r3
        L_0x002c:
            int r2 = r5.read
            if (r0 >= r2) goto L_0x003b
            if (r4 < 0) goto L_0x003b
            if (r4 >= r6) goto L_0x003b
            r7.read(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L_0x002c
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.write(int, androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver$IconCompatParcelizer):void");
    }

    public final void IconCompatParcelizer(int i, int i2, RecyclerView.Keep keep, RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer iconCompatParcelizer) {
        if (this.MediaMetadataCompat != 0) {
            i = i2;
        }
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        if ((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) != 0 && i != 0) {
            if (this.write == null) {
                this.write = new write();
            }
            MediaBrowserCompat$CustomActionResultReceiver(i > 0 ? 1 : -1, Math.abs(i), true, keep);
            MediaBrowserCompat$CustomActionResultReceiver(keep, this.write, iconCompatParcelizer);
        }
    }

    public final void read(String str) {
        if (this.MediaDescriptionCompat == null) {
            super.read(str);
        }
    }

    private void write(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                while (true) {
                    i2--;
                    if (i2 >= i) {
                        read(i2, recyclerView$MediaSessionCompat$ResultReceiverWrapper);
                    } else {
                        return;
                    }
                }
            } else {
                while (i > i2) {
                    read(i, recyclerView$MediaSessionCompat$ResultReceiverWrapper);
                    i--;
                }
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, write write2) {
        if (write2.RatingCompat && !write2.write) {
            if (write2.MediaMetadataCompat == -1) {
                int i = write2.f22x50fd9e4a;
                setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
                int MediaBrowserCompat$CustomActionResultReceiver2 = setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0;
                if (i >= 0) {
                    int read2 = this.RatingCompat.read() - i;
                    if (this.MediaBrowserCompat$SearchResultReceiver) {
                        for (int i2 = 0; i2 < MediaBrowserCompat$CustomActionResultReceiver2; i2++) {
                            View MediaDescriptionCompat2 = MediaDescriptionCompat(i2);
                            if (this.RatingCompat.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat2) < read2 || this.RatingCompat.MediaDescriptionCompat(MediaDescriptionCompat2) < read2) {
                                write(recyclerView$MediaSessionCompat$ResultReceiverWrapper, 0, i2);
                                return;
                            }
                        }
                        return;
                    }
                    int i3 = MediaBrowserCompat$CustomActionResultReceiver2 - 1;
                    for (int i4 = i3; i4 >= 0; i4--) {
                        View MediaDescriptionCompat3 = MediaDescriptionCompat(i4);
                        if (this.RatingCompat.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat3) < read2 || this.RatingCompat.MediaDescriptionCompat(MediaDescriptionCompat3) < read2) {
                            write(recyclerView$MediaSessionCompat$ResultReceiverWrapper, i3, i4);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            int i5 = write2.f22x50fd9e4a;
            if (i5 >= 0) {
                setMinWidth setminwidth2 = this.MediaSessionCompat$ResultReceiverWrapper;
                int MediaBrowserCompat$CustomActionResultReceiver3 = setminwidth2 != null ? setminwidth2.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth2.MediaBrowserCompat$ItemReceiver.size() : 0;
                if (this.MediaBrowserCompat$SearchResultReceiver) {
                    int i6 = MediaBrowserCompat$CustomActionResultReceiver3 - 1;
                    for (int i7 = i6; i7 >= 0; i7--) {
                        View MediaDescriptionCompat4 = MediaDescriptionCompat(i7);
                        if (this.RatingCompat.IconCompatParcelizer(MediaDescriptionCompat4) > i5 || this.RatingCompat.write(MediaDescriptionCompat4) > i5) {
                            write(recyclerView$MediaSessionCompat$ResultReceiverWrapper, i6, i7);
                            return;
                        }
                    }
                    return;
                }
                for (int i8 = 0; i8 < MediaBrowserCompat$CustomActionResultReceiver3; i8++) {
                    View MediaDescriptionCompat5 = MediaDescriptionCompat(i8);
                    if (this.RatingCompat.IconCompatParcelizer(MediaDescriptionCompat5) > i5 || this.RatingCompat.write(MediaDescriptionCompat5) > i5) {
                        write(recyclerView$MediaSessionCompat$ResultReceiverWrapper, 0, i8);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:38:0x008b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r9, androidx.recyclerview.widget.LinearLayoutManager.write r10, androidx.recyclerview.widget.RecyclerView.Keep r11, boolean r12) {
        /*
            r8 = this;
            int r0 = r10.MediaBrowserCompat$ItemReceiver
            int r1 = r10.f22x50fd9e4a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L_0x0016
            int r1 = r10.MediaBrowserCompat$ItemReceiver
            if (r1 >= 0) goto L_0x0013
            int r1 = r10.f22x50fd9e4a
            int r3 = r10.MediaBrowserCompat$ItemReceiver
            int r1 = r1 + r3
            r10.f22x50fd9e4a = r1
        L_0x0013:
            r8.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r9, (androidx.recyclerview.widget.LinearLayoutManager.write) r10)
        L_0x0016:
            int r1 = r10.MediaBrowserCompat$ItemReceiver
            int r3 = r10.IconCompatParcelizer
            int r1 = r1 + r3
            androidx.recyclerview.widget.LinearLayoutManager$read r3 = r8.MediaBrowserCompat$ItemReceiver
        L_0x001d:
            boolean r4 = r10.write
            if (r4 != 0) goto L_0x0023
            if (r1 <= 0) goto L_0x008b
        L_0x0023:
            int r4 = r10.read
            r5 = 0
            if (r4 < 0) goto L_0x0038
            boolean r6 = r11.MediaBrowserCompat$ItemReceiver
            if (r6 == 0) goto L_0x0032
            int r6 = r11.MediaDescriptionCompat
            int r7 = r11.IconCompatParcelizer
            int r6 = r6 - r7
            goto L_0x0034
        L_0x0032:
            int r6 = r11.MediaBrowserCompat$MediaItem
        L_0x0034:
            if (r4 >= r6) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            r4 = r5
        L_0x0039:
            if (r4 == 0) goto L_0x008b
            r3.MediaBrowserCompat$ItemReceiver = r5
            r3.write = r5
            r3.IconCompatParcelizer = r5
            r3.read = r5
            r8.read((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r9, (androidx.recyclerview.widget.RecyclerView.Keep) r11, (androidx.recyclerview.widget.LinearLayoutManager.write) r10, (androidx.recyclerview.widget.LinearLayoutManager.read) r3)
            boolean r4 = r3.write
            if (r4 != 0) goto L_0x008b
            int r4 = r10.MediaBrowserCompat$MediaItem
            int r5 = r3.MediaBrowserCompat$ItemReceiver
            int r6 = r10.MediaMetadataCompat
            int r5 = r5 * r6
            int r4 = r4 + r5
            r10.MediaBrowserCompat$MediaItem = r4
            boolean r4 = r3.IconCompatParcelizer
            if (r4 == 0) goto L_0x0062
            androidx.recyclerview.widget.LinearLayoutManager$write r4 = r8.write
            java.util.List<androidx.recyclerview.widget.RecyclerView$setContentView> r4 = r4.MediaBrowserCompat$SearchResultReceiver
            if (r4 != 0) goto L_0x0062
            boolean r4 = r11.MediaBrowserCompat$ItemReceiver
            if (r4 != 0) goto L_0x006c
        L_0x0062:
            int r4 = r10.MediaBrowserCompat$ItemReceiver
            int r5 = r3.MediaBrowserCompat$ItemReceiver
            int r4 = r4 - r5
            r10.MediaBrowserCompat$ItemReceiver = r4
            int r4 = r3.MediaBrowserCompat$ItemReceiver
            int r1 = r1 - r4
        L_0x006c:
            int r4 = r10.f22x50fd9e4a
            if (r4 == r2) goto L_0x0085
            int r4 = r10.f22x50fd9e4a
            int r5 = r3.MediaBrowserCompat$ItemReceiver
            int r4 = r4 + r5
            r10.f22x50fd9e4a = r4
            int r4 = r10.MediaBrowserCompat$ItemReceiver
            if (r4 >= 0) goto L_0x0082
            int r4 = r10.f22x50fd9e4a
            int r5 = r10.MediaBrowserCompat$ItemReceiver
            int r4 = r4 + r5
            r10.f22x50fd9e4a = r4
        L_0x0082:
            r8.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r9, (androidx.recyclerview.widget.LinearLayoutManager.write) r10)
        L_0x0085:
            if (r12 == 0) goto L_0x001d
            boolean r4 = r3.read
            if (r4 == 0) goto L_0x001d
        L_0x008b:
            int r9 = r10.MediaBrowserCompat$ItemReceiver
            int r0 = r0 - r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper, androidx.recyclerview.widget.LinearLayoutManager$write, androidx.recyclerview.widget.RecyclerView$Keep, boolean):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013a, code lost:
        if (((r5.MediaBrowserCompat$SearchResultReceiver.read & 2) != 0) != false) goto L_0x013c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void read(androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper r20, androidx.recyclerview.widget.RecyclerView.Keep r21, androidx.recyclerview.widget.LinearLayoutManager.write r22, androidx.recyclerview.widget.LinearLayoutManager.read r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            r2 = r20
            r3 = r23
            android.view.View r2 = r1.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper) r2)
            r4 = 1
            if (r2 != 0) goto L_0x0012
            r3.write = r4
            return
        L_0x0012:
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r5 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r5
            java.util.List<androidx.recyclerview.widget.RecyclerView$setContentView> r6 = r1.MediaBrowserCompat$SearchResultReceiver
            r7 = -1
            r8 = 0
            if (r6 != 0) goto L_0x0031
            boolean r6 = r0.MediaBrowserCompat$SearchResultReceiver
            int r9 = r1.MediaMetadataCompat
            if (r9 != r7) goto L_0x0026
            r9 = r4
            goto L_0x0027
        L_0x0026:
            r9 = r8
        L_0x0027:
            if (r6 != r9) goto L_0x002d
            r0.read((android.view.View) r2)
            goto L_0x0043
        L_0x002d:
            r0.MediaBrowserCompat$ItemReceiver((android.view.View) r2, (int) r8)
            goto L_0x0043
        L_0x0031:
            boolean r6 = r0.MediaBrowserCompat$SearchResultReceiver
            int r9 = r1.MediaMetadataCompat
            if (r9 != r7) goto L_0x0039
            r9 = r4
            goto L_0x003a
        L_0x0039:
            r9 = r8
        L_0x003a:
            if (r6 != r9) goto L_0x0040
            r0.MediaBrowserCompat$ItemReceiver((android.view.View) r2)
            goto L_0x0043
        L_0x0040:
            r0.write((android.view.View) r2, (int) r8)
        L_0x0043:
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r6 = (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r6
            androidx.recyclerview.widget.RecyclerView r9 = r0.setHasDecor
            android.graphics.Rect r9 = r9.MediaMetadataCompat(r2)
            int r10 = r9.left
            int r11 = r9.right
            int r12 = r9.top
            int r9 = r9.bottom
            int r13 = r0.setBackgroundResource
            int r14 = r0.setContentView
            int r15 = r19.getPaddingLeft()
            int r16 = r19.getPaddingRight()
            int r7 = r6.leftMargin
            int r4 = r6.rightMargin
            int r8 = r6.width
            r17 = r5
            boolean r5 = r19.write()
            int r15 = r15 + r16
            int r15 = r15 + r7
            int r15 = r15 + r4
            int r10 = r10 + r11
            r4 = 0
            int r10 = r10 + r4
            int r15 = r15 + r10
            int r4 = androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(r13, r14, r15, r8, r5)
            int r5 = r0.ParcelableVolumeInfo
            int r7 = r0.MediaSessionCompat$QueueItem
            int r8 = r19.getPaddingTop()
            int r10 = r19.getPaddingBottom()
            int r11 = r6.topMargin
            int r13 = r6.bottomMargin
            int r14 = r6.height
            boolean r15 = r19.read()
            int r8 = r8 + r10
            int r8 = r8 + r11
            int r8 = r8 + r13
            int r12 = r12 + r9
            r9 = 0
            int r12 = r12 + r9
            int r8 = r8 + r12
            int r5 = androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(r5, r7, r8, r14, r15)
            boolean r6 = r0.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r2, (int) r4, (int) r5, (androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat) r6)
            if (r6 == 0) goto L_0x00a5
            r2.measure(r4, r5)
        L_0x00a5:
            o.setContentId r4 = r0.RatingCompat
            int r4 = r4.read(r2)
            r3.MediaBrowserCompat$ItemReceiver = r4
            int r4 = r0.MediaMetadataCompat
            r5 = 1
            if (r4 != r5) goto L_0x00f2
            androidx.recyclerview.widget.RecyclerView r4 = r0.setHasDecor
            int r4 = p040o.SwitchCompat.m3079x50fd9e4a(r4)
            if (r4 == r5) goto L_0x00bc
            r4 = r9
            goto L_0x00bd
        L_0x00bc:
            r4 = 1
        L_0x00bd:
            if (r4 == 0) goto L_0x00cf
            int r4 = r0.setBackgroundResource
            int r5 = r19.getPaddingRight()
            int r4 = r4 - r5
            o.setContentId r5 = r0.RatingCompat
            int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver(r2)
            int r5 = r4 - r5
            goto L_0x00da
        L_0x00cf:
            int r5 = r19.getPaddingLeft()
            o.setContentId r4 = r0.RatingCompat
            int r4 = r4.MediaBrowserCompat$CustomActionResultReceiver(r2)
            int r4 = r4 + r5
        L_0x00da:
            int r6 = r1.MediaMetadataCompat
            r7 = -1
            if (r6 != r7) goto L_0x00e7
            int r6 = r1.MediaBrowserCompat$MediaItem
            int r1 = r1.MediaBrowserCompat$MediaItem
            int r7 = r3.MediaBrowserCompat$ItemReceiver
            int r1 = r1 - r7
            goto L_0x011d
        L_0x00e7:
            int r6 = r1.MediaBrowserCompat$MediaItem
            int r1 = r1.MediaBrowserCompat$MediaItem
            int r7 = r3.MediaBrowserCompat$ItemReceiver
            int r1 = r1 + r7
            r18 = r6
            r6 = r1
            goto L_0x011b
        L_0x00f2:
            int r4 = r19.getPaddingTop()
            o.setContentId r5 = r0.RatingCompat
            int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver(r2)
            int r6 = r5 + r4
            int r5 = r1.MediaMetadataCompat
            r7 = -1
            if (r5 != r7) goto L_0x0111
            int r5 = r1.MediaBrowserCompat$MediaItem
            int r1 = r1.MediaBrowserCompat$MediaItem
            int r7 = r3.MediaBrowserCompat$ItemReceiver
            int r1 = r1 - r7
            r18 = r5
            r5 = r1
            r1 = r4
            r4 = r18
            goto L_0x011d
        L_0x0111:
            int r5 = r1.MediaBrowserCompat$MediaItem
            int r1 = r1.MediaBrowserCompat$MediaItem
            int r7 = r3.MediaBrowserCompat$ItemReceiver
            int r1 = r1 + r7
            r18 = r4
            r4 = r1
        L_0x011b:
            r1 = r18
        L_0x011d:
            IconCompatParcelizer(r2, r5, r1, r4, r6)
            r5 = r17
            androidx.recyclerview.widget.RecyclerView$setContentView r1 = r5.MediaBrowserCompat$SearchResultReceiver
            int r1 = r1.read
            r1 = r1 & 8
            if (r1 == 0) goto L_0x012c
            r4 = 1
            goto L_0x012d
        L_0x012c:
            r4 = r9
        L_0x012d:
            if (r4 != 0) goto L_0x013c
            androidx.recyclerview.widget.RecyclerView$setContentView r1 = r5.MediaBrowserCompat$SearchResultReceiver
            int r1 = r1.read
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0139
            r8 = 1
            goto L_0x013a
        L_0x0139:
            r8 = r9
        L_0x013a:
            if (r8 == 0) goto L_0x013f
        L_0x013c:
            r1 = 1
            r3.IconCompatParcelizer = r1
        L_0x013f:
            boolean r1 = r2.hasFocusable()
            r3.read = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.read(androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper, androidx.recyclerview.widget.RecyclerView$Keep, androidx.recyclerview.widget.LinearLayoutManager$write, androidx.recyclerview.widget.LinearLayoutManager$read):void");
    }

    /* access modifiers changed from: package-private */
    public final int read(int i) {
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return PKIFailureInfo.systemUnavail;
                            }
                            if (this.MediaMetadataCompat == 1) {
                                return 1;
                            }
                            return PKIFailureInfo.systemUnavail;
                        } else if (this.MediaMetadataCompat == 0) {
                            return 1;
                        } else {
                            return PKIFailureInfo.systemUnavail;
                        }
                    } else if (this.MediaMetadataCompat != 1) {
                        return PKIFailureInfo.systemUnavail;
                    } else {
                        return -1;
                    }
                } else if (this.MediaMetadataCompat != 0) {
                    return PKIFailureInfo.systemUnavail;
                } else {
                    return -1;
                }
            } else if (this.MediaMetadataCompat == 1) {
                return 1;
            } else {
                if (SwitchCompat.m3079x50fd9e4a(this.setHasDecor) == 1) {
                    z = true;
                }
                return z ? -1 : 1;
            }
        } else if (this.MediaMetadataCompat == 1) {
            return -1;
        } else {
            if (SwitchCompat.m3079x50fd9e4a(this.setHasDecor) == 1) {
                z = true;
            }
            return z ? 1 : -1;
        }
    }

    private View setBackgroundResource() {
        int i = 0;
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
            if (setminwidth != null) {
                i = setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size();
            }
            i--;
        }
        return MediaDescriptionCompat(i);
    }

    private View AppCompatDialogFragment() {
        int i = 0;
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
            if (setminwidth != null) {
                i = setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size();
            }
            i--;
        }
        return MediaDescriptionCompat(i);
    }

    private View MediaBrowserCompat$ItemReceiver(boolean z) {
        int i = 0;
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
            if (setminwidth != null) {
                i = setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size();
            }
            return read(i - 1, -1, z, true);
        }
        setMinWidth setminwidth2 = this.MediaSessionCompat$ResultReceiverWrapper;
        return read(0, setminwidth2 != null ? setminwidth2.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth2.MediaBrowserCompat$ItemReceiver.size() : 0, z, true);
    }

    private View write(boolean z) {
        int i = 0;
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
            return read(0, setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0, z, true);
        }
        setMinWidth setminwidth2 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (setminwidth2 != null) {
            i = setminwidth2.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth2.MediaBrowserCompat$ItemReceiver.size();
        }
        return read(i - 1, -1, z, true);
    }

    public View read(View view, int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        int read2;
        View view2;
        View view3;
        setContentView();
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        if ((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) == 0 || (read2 = read(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (this.write == null) {
            this.write = new write();
        }
        if (this.write == null) {
            this.write = new write();
        }
        MediaBrowserCompat$CustomActionResultReceiver(read2, (int) (((float) this.RatingCompat.MediaBrowserCompat$SearchResultReceiver()) * 0.33333334f), false, keep);
        this.write.f22x50fd9e4a = PKIFailureInfo.systemUnavail;
        this.write.RatingCompat = false;
        IconCompatParcelizer(recyclerView$MediaSessionCompat$ResultReceiverWrapper, this.write, keep, true);
        if (read2 == -1) {
            if (this.MediaBrowserCompat$SearchResultReceiver) {
                view2 = PlaybackStateCompat();
            } else {
                view2 = PlaybackStateCompat$CustomAction();
            }
        } else if (this.MediaBrowserCompat$SearchResultReceiver) {
            view2 = PlaybackStateCompat$CustomAction();
        } else {
            view2 = PlaybackStateCompat();
        }
        if (read2 == -1) {
            view3 = setBackgroundResource();
        } else {
            view3 = AppCompatDialogFragment();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: q_ */
    public boolean mo1407q_() {
        return this.MediaDescriptionCompat == null && this.MediaBrowserCompat$CustomActionResultReceiver == this.AppCompatViewInflater;
    }

    static class write {
        int IconCompatParcelizer = 0;
        int MediaBrowserCompat$CustomActionResultReceiver;
        int MediaBrowserCompat$ItemReceiver;
        int MediaBrowserCompat$MediaItem;
        List<RecyclerView.setContentView> MediaBrowserCompat$SearchResultReceiver = null;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        int f22x50fd9e4a;
        int MediaDescriptionCompat;
        int MediaMetadataCompat;
        boolean RatingCompat = true;
        int read;
        boolean write;

        write() {
        }

        /* access modifiers changed from: package-private */
        public final View MediaBrowserCompat$ItemReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper) {
            if (this.MediaBrowserCompat$SearchResultReceiver != null) {
                return MediaBrowserCompat$CustomActionResultReceiver();
            }
            View MediaBrowserCompat$CustomActionResultReceiver2 = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(this.read);
            this.read += this.MediaBrowserCompat$CustomActionResultReceiver;
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }

        private View MediaBrowserCompat$CustomActionResultReceiver() {
            int size = this.MediaBrowserCompat$SearchResultReceiver.size();
            for (int i = 0; i < size; i++) {
                View view = this.MediaBrowserCompat$SearchResultReceiver.get(i).write;
                RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view.getLayoutParams();
                if (!((mediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver.read & 8) != 0)) {
                    int i2 = this.read;
                    RecyclerView.setContentView setcontentview = mediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver;
                    int i3 = setcontentview.ParcelableVolumeInfo;
                    if (i3 == -1) {
                        i3 = setcontentview.MediaSessionCompat$QueueItem;
                    }
                    if (i2 == i3) {
                        write(view);
                        return view;
                    }
                }
            }
            return null;
        }

        public final void write(View view) {
            View MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(view);
            if (MediaBrowserCompat$ItemReceiver2 == null) {
                this.read = -1;
                return;
            }
            RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) MediaBrowserCompat$ItemReceiver2.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            int i = setcontentview.ParcelableVolumeInfo;
            if (i == -1) {
                i = setcontentview.MediaSessionCompat$QueueItem;
            }
            this.read = i;
        }

        private View MediaBrowserCompat$ItemReceiver(View view) {
            int size = this.MediaBrowserCompat$SearchResultReceiver.size();
            View view2 = null;
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.MediaBrowserCompat$SearchResultReceiver.get(i2).write;
                RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) view3.getLayoutParams();
                if (view3 != view) {
                    if (!((mediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver.read & 8) != 0)) {
                        RecyclerView.setContentView setcontentview = mediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver;
                        int i3 = setcontentview.ParcelableVolumeInfo;
                        if (i3 == -1) {
                            i3 = setcontentview.MediaSessionCompat$QueueItem;
                        }
                        int i4 = (i3 - this.read) * this.MediaBrowserCompat$CustomActionResultReceiver;
                        if (i4 >= 0 && i4 < i) {
                            view2 = view3;
                            if (i4 == 0) {
                                break;
                            }
                            i = i4;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return view2;
        }
    }

    static class IconCompatParcelizer {
        boolean IconCompatParcelizer = false;
        boolean MediaBrowserCompat$CustomActionResultReceiver = false;
        int MediaBrowserCompat$ItemReceiver = PKIFailureInfo.systemUnavail;
        setContentId read;
        int write = -1;

        IconCompatParcelizer() {
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AnchorInfo{mPosition=");
            sb.append(this.write);
            sb.append(", mCoordinate=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", mValid=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append('}');
            return sb.toString();
        }

        public final void read(View view, int i) {
            setContentId setcontentid = this.read;
            int MediaBrowserCompat$SearchResultReceiver = Integer.MIN_VALUE == setcontentid.IconCompatParcelizer ? 0 : setcontentid.MediaBrowserCompat$SearchResultReceiver() - setcontentid.IconCompatParcelizer;
            if (MediaBrowserCompat$SearchResultReceiver >= 0) {
                IconCompatParcelizer(view, i);
                return;
            }
            this.write = i;
            if (this.IconCompatParcelizer) {
                int MediaBrowserCompat$ItemReceiver2 = (this.read.MediaBrowserCompat$ItemReceiver() - MediaBrowserCompat$SearchResultReceiver) - this.read.IconCompatParcelizer(view);
                this.MediaBrowserCompat$ItemReceiver = this.read.MediaBrowserCompat$ItemReceiver() - MediaBrowserCompat$ItemReceiver2;
                if (MediaBrowserCompat$ItemReceiver2 > 0) {
                    int read2 = this.read.read(view);
                    int i2 = this.MediaBrowserCompat$ItemReceiver;
                    int MediaDescriptionCompat = this.read.MediaDescriptionCompat();
                    int min = (i2 - read2) - (MediaDescriptionCompat + Math.min(this.read.MediaBrowserCompat$ItemReceiver(view) - MediaDescriptionCompat, 0));
                    if (min < 0) {
                        this.MediaBrowserCompat$ItemReceiver += Math.min(MediaBrowserCompat$ItemReceiver2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int MediaBrowserCompat$ItemReceiver3 = this.read.MediaBrowserCompat$ItemReceiver(view);
            int MediaDescriptionCompat2 = MediaBrowserCompat$ItemReceiver3 - this.read.MediaDescriptionCompat();
            this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver3;
            if (MediaDescriptionCompat2 > 0) {
                int MediaBrowserCompat$ItemReceiver4 = (this.read.MediaBrowserCompat$ItemReceiver() - Math.min(0, (this.read.MediaBrowserCompat$ItemReceiver() - MediaBrowserCompat$SearchResultReceiver) - this.read.IconCompatParcelizer(view))) - (MediaBrowserCompat$ItemReceiver3 + this.read.read(view));
                if (MediaBrowserCompat$ItemReceiver4 < 0) {
                    this.MediaBrowserCompat$ItemReceiver -= Math.min(MediaDescriptionCompat2, -MediaBrowserCompat$ItemReceiver4);
                }
            }
        }

        public final void IconCompatParcelizer(View view, int i) {
            if (this.IconCompatParcelizer) {
                int IconCompatParcelizer2 = this.read.IconCompatParcelizer(view);
                setContentId setcontentid = this.read;
                this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2 + (Integer.MIN_VALUE == setcontentid.IconCompatParcelizer ? 0 : setcontentid.MediaBrowserCompat$SearchResultReceiver() - setcontentid.IconCompatParcelizer);
            } else {
                this.MediaBrowserCompat$ItemReceiver = this.read.MediaBrowserCompat$ItemReceiver(view);
            }
            this.write = i;
        }
    }

    public static class read {
        public boolean IconCompatParcelizer;
        public int MediaBrowserCompat$ItemReceiver;
        public boolean read;
        public boolean write;

        protected read() {
        }
    }

    private int RatingCompat(RecyclerView.Keep keep) {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        if ((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) == 0) {
            return 0;
        }
        if (this.write == null) {
            this.write = new write();
        }
        return AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(keep, this.RatingCompat, MediaBrowserCompat$ItemReceiver(!this.setCheckable), write(!this.setCheckable), this, this.setCheckable);
    }

    private int MediaDescriptionCompat(RecyclerView.Keep keep) {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        if ((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) == 0) {
            return 0;
        }
        if (this.write == null) {
            this.write = new write();
        }
        return AlertController$RecycleListView.IconCompatParcelizer(keep, this.RatingCompat, MediaBrowserCompat$ItemReceiver(!this.setCheckable), write(!this.setCheckable), this, this.setCheckable, this.MediaBrowserCompat$SearchResultReceiver);
    }

    private int MediaBrowserCompat$MediaItem(RecyclerView.Keep keep) {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        if ((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) == 0) {
            return 0;
        }
        if (this.write == null) {
            this.write = new write();
        }
        return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(keep, this.RatingCompat, MediaBrowserCompat$ItemReceiver(!this.setCheckable), write(!this.setCheckable), this, this.setCheckable);
    }

    private View PlaybackStateCompat$CustomAction() {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        return IconCompatParcelizer(0, setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0);
    }

    private View write(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        return MediaBrowserCompat$CustomActionResultReceiver(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep, 0, setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0, keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem);
    }

    private View PlaybackStateCompat() {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        return IconCompatParcelizer((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) - 1, -1);
    }

    private View read(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        return MediaBrowserCompat$CustomActionResultReceiver(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep, (setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) - 1, -1, keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem);
    }

    public final PointF IconCompatParcelizer(int i) {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        boolean z = false;
        if ((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) == 0) {
            return null;
        }
        RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat(0).getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
        int i2 = setcontentview.ParcelableVolumeInfo;
        int i3 = -1;
        if (i2 == -1) {
            i2 = setcontentview.MediaSessionCompat$QueueItem;
        }
        if (i < i2) {
            z = true;
        }
        if (z == this.MediaBrowserCompat$SearchResultReceiver) {
            i3 = 1;
        }
        if (this.MediaMetadataCompat == 0) {
            return new PointF((float) i3, BitmapDescriptorFactory.HUE_RED);
        }
        return new PointF(BitmapDescriptorFactory.HUE_RED, (float) i3);
    }

    public final int MediaMetadataCompat() {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        View read2 = read(0, setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0, false, true);
        if (read2 == null) {
            return -1;
        }
        RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) read2.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
        int i = setcontentview.ParcelableVolumeInfo;
        return i == -1 ? setcontentview.MediaSessionCompat$QueueItem : i;
    }

    public final int RatingCompat() {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        View read2 = read((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) - 1, -1, true, false);
        if (read2 == null) {
            return -1;
        }
        RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) read2.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
        int i = setcontentview.ParcelableVolumeInfo;
        return i == -1 ? setcontentview.MediaSessionCompat$QueueItem : i;
    }

    private View IconCompatParcelizer(int i, int i2) {
        int i3;
        int i4;
        if (this.write == null) {
            this.write = new write();
        }
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return MediaDescriptionCompat(i);
        }
        if (this.RatingCompat.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat(i)) < this.RatingCompat.MediaDescriptionCompat()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.MediaMetadataCompat == 0) {
            return this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(i, i2, i4, i3);
        }
        return this.AppCompatDialogFragment.MediaBrowserCompat$CustomActionResultReceiver(i, i2, i4, i3);
    }

    public final View read(int i, int i2, boolean z, boolean z2) {
        if (this.write == null) {
            this.write = new write();
        }
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.MediaMetadataCompat == 0) {
            return this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(i, i2, i4, i3);
        }
        return this.AppCompatDialogFragment.MediaBrowserCompat$CustomActionResultReceiver(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    public View MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep, int i, int i2, int i3) {
        if (this.write == null) {
            this.write = new write();
        }
        int MediaDescriptionCompat2 = this.RatingCompat.MediaDescriptionCompat();
        int MediaBrowserCompat$ItemReceiver2 = this.RatingCompat.MediaBrowserCompat$ItemReceiver();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View MediaDescriptionCompat3 = MediaDescriptionCompat(i);
            RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat3.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            int i5 = setcontentview.ParcelableVolumeInfo;
            if (i5 == -1) {
                i5 = setcontentview.MediaSessionCompat$QueueItem;
            }
            if (i5 >= 0 && i5 < i3) {
                if ((((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat3.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver.read & 8) != 0) {
                    if (view2 == null) {
                        view2 = MediaDescriptionCompat3;
                    }
                } else if (this.RatingCompat.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat3) < MediaBrowserCompat$ItemReceiver2 && this.RatingCompat.IconCompatParcelizer(MediaDescriptionCompat3) >= MediaDescriptionCompat2) {
                    return MediaDescriptionCompat3;
                } else {
                    if (view == null) {
                        view = MediaDescriptionCompat3;
                    }
                }
            }
            i += i4;
        }
        return view == null ? view2 : view;
    }

    public final View MediaBrowserCompat$CustomActionResultReceiver(int i) {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        int MediaBrowserCompat$CustomActionResultReceiver2 = setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0;
        if (MediaBrowserCompat$CustomActionResultReceiver2 == 0) {
            return null;
        }
        RecyclerView.setContentView setcontentview = ((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat(0).getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
        int i2 = setcontentview.ParcelableVolumeInfo;
        if (i2 == -1) {
            i2 = setcontentview.MediaSessionCompat$QueueItem;
        }
        int i3 = i - i2;
        if (i3 >= 0 && i3 < MediaBrowserCompat$CustomActionResultReceiver2) {
            View MediaDescriptionCompat2 = MediaDescriptionCompat(i3);
            RecyclerView.setContentView setcontentview2 = ((RecyclerView.MediaDescriptionCompat) MediaDescriptionCompat2.getLayoutParams()).MediaBrowserCompat$SearchResultReceiver;
            int i4 = setcontentview2.ParcelableVolumeInfo;
            if (i4 == -1) {
                i4 = setcontentview2.MediaSessionCompat$QueueItem;
            }
            if (i4 == i) {
                return MediaDescriptionCompat2;
            }
        }
        return super.MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    private int MediaBrowserCompat$ItemReceiver(int i, RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper, RecyclerView.Keep keep) {
        setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
        if ((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) == 0 || i == 0) {
            return 0;
        }
        this.write.RatingCompat = true;
        if (this.write == null) {
            this.write = new write();
        }
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        MediaBrowserCompat$CustomActionResultReceiver(i2, abs, true, keep);
        int IconCompatParcelizer2 = this.write.f22x50fd9e4a + IconCompatParcelizer(recyclerView$MediaSessionCompat$ResultReceiverWrapper, this.write, keep, false);
        if (IconCompatParcelizer2 < 0) {
            return 0;
        }
        if (abs > IconCompatParcelizer2) {
            i = i2 * IconCompatParcelizer2;
        }
        this.RatingCompat.write(-i);
        this.write.MediaDescriptionCompat = i;
        return i;
    }

    public void IconCompatParcelizer(boolean z) {
        if (this.MediaDescriptionCompat == null) {
            super.read((String) null);
        }
        if (this.AppCompatViewInflater != z) {
            this.AppCompatViewInflater = z;
            RecyclerView recyclerView = this.setHasDecor;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaSessionCompat$Token() {
        boolean z;
        if (!(this.MediaSessionCompat$QueueItem == 1073741824 || this.setContentView == 1073741824)) {
            setMinWidth setminwidth = this.MediaSessionCompat$ResultReceiverWrapper;
            int MediaBrowserCompat$CustomActionResultReceiver2 = setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0;
            int i = 0;
            while (true) {
                if (i >= MediaBrowserCompat$CustomActionResultReceiver2) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = MediaDescriptionCompat(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}

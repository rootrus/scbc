package androidx.gridlayout.widget;

import android.util.Pair;
import android.util.Printer;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

final class GridLayout$MediaBrowserCompat$CustomActionResultReceiver {
    private boolean AlertController$RecycleListView = false;
    private boolean AppCompatActivity = false;
    private int[] AppCompatDelegateImpl$ListMenuDecorView;
    private boolean AppCompatDialogFragment;
    public boolean IconCompatParcelizer = false;
    private GridLayout.MediaDescriptionCompat<GridLayout.MediaMetadataCompat, GridLayout.read> Keep;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public int[] MediaBrowserCompat$ItemReceiver;
    GridLayout$MediaBrowserCompat$SearchResultReceiver MediaBrowserCompat$MediaItem = new GridLayout$MediaBrowserCompat$SearchResultReceiver(0);
    final /* synthetic */ GridLayout MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f20x50fd9e4a = false;
    GridLayout$MediaBrowserCompat$SearchResultReceiver MediaDescriptionCompat = new GridLayout$MediaBrowserCompat$SearchResultReceiver(-100000);
    boolean MediaMetadataCompat = true;
    private boolean MediaSessionCompat$QueueItem = false;
    private GridLayout.MediaDescriptionCompat<GridLayout.RatingCompat, GridLayout$MediaBrowserCompat$SearchResultReceiver> MediaSessionCompat$ResultReceiverWrapper;
    private GridLayout.IconCompatParcelizer[] MediaSessionCompat$Token;
    private boolean ParcelableVolumeInfo = false;
    private GridLayout.MediaDescriptionCompat<GridLayout.RatingCompat, GridLayout$MediaBrowserCompat$SearchResultReceiver> PlaybackStateCompat;
    private boolean PlaybackStateCompat$CustomAction = false;
    public int[] RatingCompat;
    public boolean read = false;
    private int setBackgroundResource = PKIFailureInfo.systemUnavail;
    private int[] setHasDecor;
    public int write = PKIFailureInfo.systemUnavail;

    GridLayout$MediaBrowserCompat$CustomActionResultReceiver(GridLayout gridLayout, boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver = gridLayout;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    /* access modifiers changed from: package-private */
    public final int IconCompatParcelizer() {
        int i = this.setBackgroundResource;
        int i2 = PKIFailureInfo.systemUnavail;
        if (i == Integer.MIN_VALUE) {
            int childCount = this.MediaBrowserCompat$SearchResultReceiver.getChildCount();
            int i3 = -1;
            for (int i4 = 0; i4 < childCount; i4++) {
                GridLayout$MediaBrowserCompat$MediaItem IconCompatParcelizer2 = GridLayout.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver.getChildAt(i4));
                GridLayout.RatingCompat ratingCompat = (this.MediaBrowserCompat$CustomActionResultReceiver ? IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver : IconCompatParcelizer2.write).read;
                i3 = Math.max(Math.max(Math.max(i3, ratingCompat.read), ratingCompat.MediaBrowserCompat$CustomActionResultReceiver), ratingCompat.MediaBrowserCompat$CustomActionResultReceiver - ratingCompat.read);
            }
            if (i3 != -1) {
                i2 = i3;
            }
            this.setBackgroundResource = Math.max(0, i2);
        }
        return this.setBackgroundResource;
    }

    public final int read() {
        return Math.max(this.write, IconCompatParcelizer());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != Integer.MIN_VALUE && i < IconCompatParcelizer()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver ? "column" : "row");
            sb.append("Count must be greater than or equal to the maximum of all grid indices ");
            sb.append("(and spans) defined in the LayoutParams of each child");
            GridLayout.IconCompatParcelizer(sb.toString());
        }
        this.write = i;
    }

    private GridLayout.MediaDescriptionCompat<GridLayout.MediaMetadataCompat, GridLayout.read> MediaMetadataCompat() {
        GridLayout.write write2 = new GridLayout.write(GridLayout.MediaMetadataCompat.class, GridLayout.read.class);
        int childCount = this.MediaBrowserCompat$SearchResultReceiver.getChildCount();
        for (int i = 0; i < childCount; i++) {
            GridLayout$MediaBrowserCompat$MediaItem IconCompatParcelizer2 = GridLayout.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver.getChildAt(i));
            GridLayout.MediaMetadataCompat mediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver ? IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver : IconCompatParcelizer2.write;
            write2.add(Pair.create(mediaMetadataCompat, mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer()));
        }
        return write2.MediaBrowserCompat$ItemReceiver();
    }

    private void MediaBrowserCompat$SearchResultReceiver() {
        int i;
        int i2;
        int i3;
        GridLayout.read[] readArr = (GridLayout.read[]) this.Keep.read;
        for (GridLayout.read MediaBrowserCompat$CustomActionResultReceiver2 : readArr) {
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver();
        }
        int childCount = this.MediaBrowserCompat$SearchResultReceiver.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.MediaBrowserCompat$SearchResultReceiver.getChildAt(i4);
            GridLayout$MediaBrowserCompat$MediaItem IconCompatParcelizer2 = GridLayout.IconCompatParcelizer(childAt);
            GridLayout.MediaMetadataCompat mediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver ? IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver : IconCompatParcelizer2.write;
            GridLayout gridLayout = this.MediaBrowserCompat$SearchResultReceiver;
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (childAt.getVisibility() == 8) {
                i = 0;
            } else {
                if (z) {
                    i3 = childAt.getMeasuredWidth();
                } else {
                    i3 = childAt.getMeasuredHeight();
                }
                i = i3 + gridLayout.MediaBrowserCompat$CustomActionResultReceiver(childAt, z, true) + gridLayout.MediaBrowserCompat$CustomActionResultReceiver(childAt, z, false);
            }
            if (mediaMetadataCompat.write == BitmapDescriptorFactory.HUE_RED) {
                i2 = 0;
            } else {
                if (this.setHasDecor == null) {
                    this.setHasDecor = new int[this.MediaBrowserCompat$SearchResultReceiver.getChildCount()];
                }
                i2 = this.setHasDecor[i4];
            }
            GridLayout.MediaDescriptionCompat<GridLayout.MediaMetadataCompat, GridLayout.read> mediaDescriptionCompat = this.Keep;
            ((GridLayout.read) mediaDescriptionCompat.read[mediaDescriptionCompat.IconCompatParcelizer[i4]]).IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, childAt, mediaMetadataCompat, this, i + i2);
        }
    }

    public final GridLayout.MediaDescriptionCompat<GridLayout.MediaMetadataCompat, GridLayout.read> MediaBrowserCompat$ItemReceiver() {
        if (this.Keep == null) {
            this.Keep = MediaMetadataCompat();
        }
        if (!this.PlaybackStateCompat$CustomAction) {
            MediaBrowserCompat$SearchResultReceiver();
            this.PlaybackStateCompat$CustomAction = true;
        }
        return this.Keep;
    }

    private GridLayout.MediaDescriptionCompat<GridLayout.RatingCompat, GridLayout$MediaBrowserCompat$SearchResultReceiver> MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        GridLayout.RatingCompat ratingCompat;
        GridLayout.write write2 = new GridLayout.write(GridLayout.RatingCompat.class, GridLayout$MediaBrowserCompat$SearchResultReceiver.class);
        GridLayout.MediaMetadataCompat[] mediaMetadataCompatArr = (GridLayout.MediaMetadataCompat[]) MediaBrowserCompat$ItemReceiver().write;
        int length = mediaMetadataCompatArr.length;
        for (int i = 0; i < length; i++) {
            if (z) {
                ratingCompat = mediaMetadataCompatArr[i].read;
            } else {
                GridLayout.RatingCompat ratingCompat2 = mediaMetadataCompatArr[i].read;
                ratingCompat = new GridLayout.RatingCompat(ratingCompat2.MediaBrowserCompat$CustomActionResultReceiver, ratingCompat2.read);
            }
            write2.add(Pair.create(ratingCompat, new GridLayout$MediaBrowserCompat$SearchResultReceiver()));
        }
        return write2.MediaBrowserCompat$ItemReceiver();
    }

    private void read(GridLayout.MediaDescriptionCompat<GridLayout.RatingCompat, GridLayout$MediaBrowserCompat$SearchResultReceiver> mediaDescriptionCompat, boolean z) {
        GridLayout$MediaBrowserCompat$SearchResultReceiver[] gridLayout$MediaBrowserCompat$SearchResultReceiverArr = (GridLayout$MediaBrowserCompat$SearchResultReceiver[]) mediaDescriptionCompat.read;
        for (GridLayout$MediaBrowserCompat$SearchResultReceiver gridLayout$MediaBrowserCompat$SearchResultReceiver : gridLayout$MediaBrowserCompat$SearchResultReceiverArr) {
            gridLayout$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver = PKIFailureInfo.systemUnavail;
        }
        GridLayout.read[] readArr = (GridLayout.read[]) MediaBrowserCompat$ItemReceiver().read;
        for (int i = 0; i < readArr.length; i++) {
            int MediaBrowserCompat$ItemReceiver2 = readArr[i].MediaBrowserCompat$ItemReceiver(z);
            GridLayout$MediaBrowserCompat$SearchResultReceiver gridLayout$MediaBrowserCompat$SearchResultReceiver2 = (GridLayout$MediaBrowserCompat$SearchResultReceiver) mediaDescriptionCompat.read[mediaDescriptionCompat.IconCompatParcelizer[i]];
            int i2 = gridLayout$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$ItemReceiver;
            if (!z) {
                MediaBrowserCompat$ItemReceiver2 = -MediaBrowserCompat$ItemReceiver2;
            }
            gridLayout$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$ItemReceiver = Math.max(i2, MediaBrowserCompat$ItemReceiver2);
        }
    }

    private GridLayout.MediaDescriptionCompat<GridLayout.RatingCompat, GridLayout$MediaBrowserCompat$SearchResultReceiver> ParcelableVolumeInfo() {
        if (this.PlaybackStateCompat == null) {
            this.PlaybackStateCompat = MediaBrowserCompat$CustomActionResultReceiver(true);
        }
        if (!this.AlertController$RecycleListView) {
            read(this.PlaybackStateCompat, true);
            this.AlertController$RecycleListView = true;
        }
        return this.PlaybackStateCompat;
    }

    private GridLayout.MediaDescriptionCompat<GridLayout.RatingCompat, GridLayout$MediaBrowserCompat$SearchResultReceiver> RatingCompat() {
        if (this.MediaSessionCompat$ResultReceiverWrapper == null) {
            this.MediaSessionCompat$ResultReceiverWrapper = MediaBrowserCompat$CustomActionResultReceiver(false);
        }
        if (!this.ParcelableVolumeInfo) {
            read(this.MediaSessionCompat$ResultReceiverWrapper, false);
            this.ParcelableVolumeInfo = true;
        }
        return this.MediaSessionCompat$ResultReceiverWrapper;
    }

    private GridLayout.IconCompatParcelizer[] write(final GridLayout.IconCompatParcelizer[] iconCompatParcelizerArr) {
        C00525 r0 = new Object() {
            GridLayout.IconCompatParcelizer[][] MediaBrowserCompat$CustomActionResultReceiver;
            private int MediaBrowserCompat$ItemReceiver;
            private int[] MediaBrowserCompat$MediaItem = new int[(GridLayout$MediaBrowserCompat$CustomActionResultReceiver.this.read() + 1)];
            GridLayout.IconCompatParcelizer[] read;

            {
                GridLayout.IconCompatParcelizer[] iconCompatParcelizerArr = iconCompatParcelizerArr;
                int length = iconCompatParcelizerArr.length;
                this.read = new GridLayout.IconCompatParcelizer[length];
                this.MediaBrowserCompat$ItemReceiver = length - 1;
                this.MediaBrowserCompat$CustomActionResultReceiver = GridLayout$MediaBrowserCompat$CustomActionResultReceiver.this.MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizerArr);
            }

            /* access modifiers changed from: package-private */
            public final void write(int i) {
                int[] iArr = this.MediaBrowserCompat$MediaItem;
                if (iArr[i] == 0) {
                    iArr[i] = 1;
                    for (GridLayout.IconCompatParcelizer iconCompatParcelizer : this.MediaBrowserCompat$CustomActionResultReceiver[i]) {
                        write(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                        GridLayout.IconCompatParcelizer[] iconCompatParcelizerArr = this.read;
                        int i2 = this.MediaBrowserCompat$ItemReceiver;
                        this.MediaBrowserCompat$ItemReceiver = i2 - 1;
                        iconCompatParcelizerArr[i2] = iconCompatParcelizer;
                    }
                    this.MediaBrowserCompat$MediaItem[i] = 2;
                }
            }
        };
        int length = r0.MediaBrowserCompat$CustomActionResultReceiver.length;
        for (int i = 0; i < length; i++) {
            r0.write(i);
        }
        return r0.read;
    }

    private static void MediaBrowserCompat$ItemReceiver(List<GridLayout.IconCompatParcelizer> list, GridLayout.MediaDescriptionCompat<GridLayout.RatingCompat, GridLayout$MediaBrowserCompat$SearchResultReceiver> mediaDescriptionCompat) {
        for (int i = 0; i < ((GridLayout.RatingCompat[]) mediaDescriptionCompat.write).length; i++) {
            MediaBrowserCompat$CustomActionResultReceiver(list, ((GridLayout.RatingCompat[]) mediaDescriptionCompat.write)[i], ((GridLayout$MediaBrowserCompat$SearchResultReceiver[]) mediaDescriptionCompat.read)[i], false);
        }
    }

    private GridLayout.IconCompatParcelizer[] MediaBrowserCompat$MediaItem() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        MediaBrowserCompat$ItemReceiver(arrayList, ParcelableVolumeInfo());
        MediaBrowserCompat$ItemReceiver(arrayList2, RatingCompat());
        if (this.MediaMetadataCompat) {
            int i = 0;
            while (i < read()) {
                int i2 = i + 1;
                MediaBrowserCompat$CustomActionResultReceiver(arrayList, new GridLayout.RatingCompat(i, i2), new GridLayout$MediaBrowserCompat$SearchResultReceiver(0), true);
                i = i2;
            }
        }
        int read2 = read();
        MediaBrowserCompat$CustomActionResultReceiver(arrayList, new GridLayout.RatingCompat(0, read2), this.MediaBrowserCompat$MediaItem, false);
        MediaBrowserCompat$CustomActionResultReceiver(arrayList2, new GridLayout.RatingCompat(read2, 0), this.MediaDescriptionCompat, false);
        return (GridLayout.IconCompatParcelizer[]) GridLayout.IconCompatParcelizer(write((GridLayout.IconCompatParcelizer[]) arrayList.toArray(new GridLayout.IconCompatParcelizer[arrayList.size()])), write((GridLayout.IconCompatParcelizer[]) arrayList2.toArray(new GridLayout.IconCompatParcelizer[arrayList2.size()])));
    }

    private GridLayout.IconCompatParcelizer[] MediaSessionCompat$ResultReceiverWrapper() {
        if (this.MediaSessionCompat$Token == null) {
            this.MediaSessionCompat$Token = MediaBrowserCompat$MediaItem();
        }
        if (!this.MediaSessionCompat$QueueItem) {
            ParcelableVolumeInfo();
            RatingCompat();
            this.MediaSessionCompat$QueueItem = true;
        }
        return this.MediaSessionCompat$Token;
    }

    private static boolean read(int[] iArr, GridLayout.IconCompatParcelizer iconCompatParcelizer) {
        if (!iconCompatParcelizer.write) {
            return false;
        }
        GridLayout.RatingCompat ratingCompat = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        int i = ratingCompat.read;
        int i2 = ratingCompat.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = iArr[i] + iconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (i3 <= iArr[i2]) {
            return false;
        }
        iArr[i2] = i3;
        return true;
    }

    private String MediaBrowserCompat$CustomActionResultReceiver(List<GridLayout.IconCompatParcelizer> list) {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver ? "x" : "y";
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (GridLayout.IconCompatParcelizer next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            int i = next.MediaBrowserCompat$CustomActionResultReceiver.read;
            int i2 = next.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            int i3 = next.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (i < i2) {
                sb2.append(i2);
                sb2.append("-");
                sb2.append(str);
                sb2.append(i);
                sb2.append(">=");
            } else {
                sb2.append(i);
                sb2.append("-");
                sb2.append(str);
                sb2.append(i2);
                sb2.append("<=");
                i3 = -i3;
            }
            sb2.append(i3);
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    private void write(String str, GridLayout.IconCompatParcelizer[] iconCompatParcelizerArr, boolean[] zArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < iconCompatParcelizerArr.length; i++) {
            GridLayout.IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerArr[i];
            if (zArr[i]) {
                arrayList.add(iconCompatParcelizer);
            }
            if (!iconCompatParcelizer.write) {
                arrayList2.add(iconCompatParcelizer);
            }
        }
        Printer printer = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" constraints: ");
        sb.append(MediaBrowserCompat$CustomActionResultReceiver((List<GridLayout.IconCompatParcelizer>) arrayList));
        sb.append(" are inconsistent; permanently removing: ");
        sb.append(MediaBrowserCompat$CustomActionResultReceiver((List<GridLayout.IconCompatParcelizer>) arrayList2));
        sb.append(". ");
        printer.println(sb.toString());
    }

    private boolean write(GridLayout.IconCompatParcelizer[] iconCompatParcelizerArr, int[] iArr, boolean z) {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver ? "horizontal" : "vertical";
        int max = Math.max(this.write, IconCompatParcelizer()) + 1;
        boolean[] zArr = null;
        for (int i = 0; i < iconCompatParcelizerArr.length; i++) {
            Arrays.fill(iArr, 0);
            for (int i2 = 0; i2 < max; i2++) {
                boolean z2 = false;
                for (GridLayout.IconCompatParcelizer read2 : iconCompatParcelizerArr) {
                    z2 |= read(iArr, read2);
                }
                if (!z2) {
                    if (zArr != null) {
                        write(str, iconCompatParcelizerArr, zArr);
                    }
                    return true;
                }
            }
            if (!z) {
                return false;
            }
            boolean[] zArr2 = new boolean[iconCompatParcelizerArr.length];
            for (int i3 = 0; i3 < max; i3++) {
                int length = iconCompatParcelizerArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    zArr2[i4] = zArr2[i4] | read(iArr, iconCompatParcelizerArr[i4]);
                }
            }
            if (i == 0) {
                zArr = zArr2;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= iconCompatParcelizerArr.length) {
                    break;
                }
                if (zArr2[i5]) {
                    GridLayout.IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerArr[i5];
                    if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.read >= iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                        iconCompatParcelizer.write = false;
                        break;
                    }
                }
                i5++;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(boolean z) {
        int[] iArr = z ? this.MediaBrowserCompat$ItemReceiver : this.RatingCompat;
        int childCount = this.MediaBrowserCompat$SearchResultReceiver.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.MediaBrowserCompat$SearchResultReceiver.getChildAt(i);
            if (childAt.getVisibility() != 8) {
                GridLayout$MediaBrowserCompat$MediaItem IconCompatParcelizer2 = GridLayout.IconCompatParcelizer(childAt);
                GridLayout.RatingCompat ratingCompat = (this.MediaBrowserCompat$CustomActionResultReceiver ? IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver : IconCompatParcelizer2.write).read;
                int i2 = z ? ratingCompat.read : ratingCompat.MediaBrowserCompat$CustomActionResultReceiver;
                iArr[i2] = Math.max(iArr[i2], this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(childAt, this.MediaBrowserCompat$CustomActionResultReceiver, z));
            }
        }
    }

    private void write(int i, float f) {
        Arrays.fill(this.setHasDecor, 0);
        int childCount = this.MediaBrowserCompat$SearchResultReceiver.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.MediaBrowserCompat$SearchResultReceiver.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                GridLayout$MediaBrowserCompat$MediaItem IconCompatParcelizer2 = GridLayout.IconCompatParcelizer(childAt);
                float f2 = (this.MediaBrowserCompat$CustomActionResultReceiver ? IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver : IconCompatParcelizer2.write).write;
                if (f2 != BitmapDescriptorFactory.HUE_RED) {
                    int round = Math.round((((float) i) * f2) / f);
                    this.setHasDecor[i2] = round;
                    i -= round;
                    f -= f2;
                }
            }
        }
    }

    public final int[] write() {
        if (this.AppCompatDelegateImpl$ListMenuDecorView == null) {
            this.AppCompatDelegateImpl$ListMenuDecorView = new int[(Math.max(this.write, IconCompatParcelizer()) + 1)];
        }
        if (!this.IconCompatParcelizer) {
            write(this.AppCompatDelegateImpl$ListMenuDecorView);
            this.IconCompatParcelizer = true;
        }
        return this.AppCompatDelegateImpl$ListMenuDecorView;
    }

    public final int read(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return read(0, size);
        }
        if (mode == 0) {
            return read(0, 100000);
        }
        if (mode != 1073741824) {
            return 0;
        }
        return read(size, size);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.setBackgroundResource = PKIFailureInfo.systemUnavail;
        this.Keep = null;
        this.PlaybackStateCompat = null;
        this.MediaSessionCompat$ResultReceiverWrapper = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.RatingCompat = null;
        this.MediaSessionCompat$Token = null;
        this.AppCompatDelegateImpl$ListMenuDecorView = null;
        this.setHasDecor = null;
        this.AppCompatActivity = false;
        MediaDescriptionCompat();
    }

    public final void MediaDescriptionCompat() {
        this.PlaybackStateCompat$CustomAction = false;
        this.AlertController$RecycleListView = false;
        this.ParcelableVolumeInfo = false;
        this.read = false;
        this.f20x50fd9e4a = false;
        this.MediaSessionCompat$QueueItem = false;
        this.IconCompatParcelizer = false;
    }

    private void write(int[] iArr) {
        boolean z;
        boolean z2 = this.AppCompatActivity;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (!z2) {
            int childCount = this.MediaBrowserCompat$SearchResultReceiver.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    z = false;
                    break;
                }
                View childAt = this.MediaBrowserCompat$SearchResultReceiver.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    GridLayout$MediaBrowserCompat$MediaItem IconCompatParcelizer2 = GridLayout.IconCompatParcelizer(childAt);
                    if ((this.MediaBrowserCompat$CustomActionResultReceiver ? IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver : IconCompatParcelizer2.write).write != BitmapDescriptorFactory.HUE_RED) {
                        z = true;
                        break;
                    }
                }
                i++;
            }
            this.AppCompatDialogFragment = z;
            this.AppCompatActivity = true;
        }
        if (!this.AppCompatDialogFragment) {
            write(MediaSessionCompat$ResultReceiverWrapper(), iArr, true);
        } else {
            if (this.setHasDecor == null) {
                this.setHasDecor = new int[this.MediaBrowserCompat$SearchResultReceiver.getChildCount()];
            }
            Arrays.fill(this.setHasDecor, 0);
            write(MediaSessionCompat$ResultReceiverWrapper(), iArr, true);
            int childCount2 = (this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver * this.MediaBrowserCompat$SearchResultReceiver.getChildCount()) + 1;
            if (childCount2 >= 2) {
                int childCount3 = this.MediaBrowserCompat$SearchResultReceiver.getChildCount();
                for (int i2 = 0; i2 < childCount3; i2++) {
                    View childAt2 = this.MediaBrowserCompat$SearchResultReceiver.getChildAt(i2);
                    if (childAt2.getVisibility() != 8) {
                        GridLayout$MediaBrowserCompat$MediaItem IconCompatParcelizer3 = GridLayout.IconCompatParcelizer(childAt2);
                        f += (this.MediaBrowserCompat$CustomActionResultReceiver ? IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver : IconCompatParcelizer3.write).write;
                    }
                }
                int i3 = -1;
                int i4 = 0;
                boolean z3 = true;
                while (i4 < childCount2) {
                    int i5 = (int) ((((long) i4) + ((long) childCount2)) / 2);
                    MediaDescriptionCompat();
                    write(i5, f);
                    boolean write2 = write(MediaSessionCompat$ResultReceiverWrapper(), iArr, false);
                    if (write2) {
                        i4 = i5 + 1;
                        i3 = i5;
                    } else {
                        childCount2 = i5;
                    }
                    z3 = write2;
                }
                if (i3 > 0 && !z3) {
                    MediaDescriptionCompat();
                    write(i3, f);
                    write(MediaSessionCompat$ResultReceiverWrapper(), iArr, true);
                }
            }
        }
        if (!this.MediaMetadataCompat) {
            int i6 = iArr[0];
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = iArr[i7] - i6;
            }
        }
    }

    private int read(int i, int i2) {
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver = i;
        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver = -i2;
        this.IconCompatParcelizer = false;
        return write()[Math.max(this.write, IconCompatParcelizer())];
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(List<GridLayout.IconCompatParcelizer> list, GridLayout.RatingCompat ratingCompat, GridLayout$MediaBrowserCompat$SearchResultReceiver gridLayout$MediaBrowserCompat$SearchResultReceiver, boolean z) {
        if (ratingCompat.MediaBrowserCompat$CustomActionResultReceiver - ratingCompat.read != 0) {
            if (z) {
                for (GridLayout.IconCompatParcelizer iconCompatParcelizer : list) {
                    if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.equals(ratingCompat)) {
                        return;
                    }
                }
            }
            list.add(new GridLayout.IconCompatParcelizer(ratingCompat, gridLayout$MediaBrowserCompat$SearchResultReceiver));
        }
    }

    /* access modifiers changed from: package-private */
    public final GridLayout.IconCompatParcelizer[][] MediaBrowserCompat$CustomActionResultReceiver(GridLayout.IconCompatParcelizer[] iconCompatParcelizerArr) {
        int max = Math.max(this.write, IconCompatParcelizer()) + 1;
        GridLayout.IconCompatParcelizer[][] iconCompatParcelizerArr2 = new GridLayout.IconCompatParcelizer[max][];
        int[] iArr = new int[max];
        for (GridLayout.IconCompatParcelizer iconCompatParcelizer : iconCompatParcelizerArr) {
            int i = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.read;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < max; i2++) {
            iconCompatParcelizerArr2[i2] = new GridLayout.IconCompatParcelizer[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (GridLayout.IconCompatParcelizer iconCompatParcelizer2 : iconCompatParcelizerArr) {
            int i3 = iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver.read;
            GridLayout.IconCompatParcelizer[] iconCompatParcelizerArr3 = iconCompatParcelizerArr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            iconCompatParcelizerArr3[i4] = iconCompatParcelizer2;
        }
        return iconCompatParcelizerArr2;
    }
}

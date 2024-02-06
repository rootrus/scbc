package p040o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: o.setOptimizationLevel */
public final class setOptimizationLevel implements Runnable {
    private static Comparator<write> IconCompatParcelizer = new Comparator<write>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            write write = (write) obj;
            write write2 = (write) obj2;
            if ((write.write == null) != (write2.write == null)) {
                if (write.write == null) {
                    return 1;
                }
                return -1;
            } else if (write.MediaBrowserCompat$ItemReceiver == write2.MediaBrowserCompat$ItemReceiver) {
                int i = write2.IconCompatParcelizer - write.IconCompatParcelizer;
                if (i != 0) {
                    return i;
                }
                int i2 = write.MediaBrowserCompat$CustomActionResultReceiver - write2.MediaBrowserCompat$CustomActionResultReceiver;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            } else if (write.MediaBrowserCompat$ItemReceiver) {
                return -1;
            } else {
                return 1;
            }
        }
    };
    public static final ThreadLocal<setOptimizationLevel> MediaBrowserCompat$CustomActionResultReceiver = new ThreadLocal<>();
    private long MediaBrowserCompat$ItemReceiver;
    private ArrayList<write> MediaBrowserCompat$SearchResultReceiver = new ArrayList<>();
    public ArrayList<RecyclerView> read = new ArrayList<>();
    public long write;

    /* renamed from: o.setOptimizationLevel$write */
    static class write {
        public int IconCompatParcelizer;
        public int MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public int read;
        public RecyclerView write;

        write() {
        }
    }

    /* renamed from: o.setOptimizationLevel$IconCompatParcelizer */
    public static class IconCompatParcelizer implements RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer {
        public int IconCompatParcelizer;
        int MediaBrowserCompat$CustomActionResultReceiver;
        int MediaBrowserCompat$ItemReceiver;
        public int[] write;

        /* access modifiers changed from: package-private */
        public final void read(RecyclerView recyclerView, boolean z) {
            boolean z2 = false;
            this.IconCompatParcelizer = 0;
            int[] iArr = this.write;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = recyclerView.AppCompatActivity;
            if (recyclerView.MediaDescriptionCompat != null && recyclerView$MediaBrowserCompat$SearchResultReceiver != null && recyclerView$MediaBrowserCompat$SearchResultReceiver.Keep) {
                if (z) {
                    if (recyclerView.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver.size() > 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        recyclerView$MediaBrowserCompat$SearchResultReceiver.write(recyclerView.MediaDescriptionCompat.IconCompatParcelizer(), (RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer) this);
                    }
                } else if (!recyclerView.MediaBrowserCompat$CustomActionResultReceiver()) {
                    recyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, recyclerView.ExpandedMenuView, (RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer) this);
                }
                if (this.IconCompatParcelizer > recyclerView$MediaBrowserCompat$SearchResultReceiver.PlaybackStateCompat) {
                    recyclerView$MediaBrowserCompat$SearchResultReceiver.PlaybackStateCompat = this.IconCompatParcelizer;
                    recyclerView$MediaBrowserCompat$SearchResultReceiver.PlaybackStateCompat$CustomAction = z;
                    recyclerView.setPadding.MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
        }

        public final void read(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.IconCompatParcelizer << 1;
                int[] iArr = this.write;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.write = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 << 1)];
                    this.write = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.write;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.IconCompatParcelizer++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public final boolean MediaBrowserCompat$ItemReceiver(int i) {
            if (this.write != null) {
                int i2 = this.IconCompatParcelizer;
                for (int i3 = 0; i3 < (i2 << 1); i3 += 2) {
                    if (this.write[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final void write(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.MediaBrowserCompat$ItemReceiver == 0) {
            this.MediaBrowserCompat$ItemReceiver = RecyclerView.MediaBrowserCompat$ItemReceiver();
            recyclerView.post(this);
        }
        IconCompatParcelizer iconCompatParcelizer = recyclerView.setIcon;
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = i;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = i2;
    }

    public final void run() {
        RecyclerView recyclerView;
        write write2;
        long j = 0;
        try {
            setMeasureWithLargestChildEnabled.read("RV Prefetch");
            if (!this.read.isEmpty()) {
                int size = this.read.size();
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView2 = this.read.get(i);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView2.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.write;
                    int size2 = this.read.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView3 = this.read.get(i3);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            recyclerView3.setIcon.read(recyclerView3, false);
                            i2 += recyclerView3.setIcon.IconCompatParcelizer;
                        }
                    }
                    this.MediaBrowserCompat$SearchResultReceiver.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView4 = this.read.get(i5);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            IconCompatParcelizer iconCompatParcelizer = recyclerView4.setIcon;
                            int abs = Math.abs(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) + Math.abs(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
                            int i6 = 0;
                            while (i6 < (iconCompatParcelizer.IconCompatParcelizer << 1)) {
                                if (i4 >= this.MediaBrowserCompat$SearchResultReceiver.size()) {
                                    write2 = new write();
                                    this.MediaBrowserCompat$SearchResultReceiver.add(write2);
                                } else {
                                    write2 = this.MediaBrowserCompat$SearchResultReceiver.get(i4);
                                }
                                int i7 = iconCompatParcelizer.write[i6 + 1];
                                try {
                                    write2.MediaBrowserCompat$ItemReceiver = i7 <= abs;
                                    write2.IconCompatParcelizer = abs;
                                    write2.MediaBrowserCompat$CustomActionResultReceiver = i7;
                                    write2.write = recyclerView4;
                                    write2.read = iconCompatParcelizer.write[i6];
                                    i4++;
                                    i6 += 2;
                                } catch (Throwable th) {
                                    th = th;
                                    j = 0;
                                    this.MediaBrowserCompat$ItemReceiver = j;
                                    setMeasureWithLargestChildEnabled.MediaBrowserCompat$CustomActionResultReceiver();
                                    throw th;
                                }
                            }
                        }
                    }
                    Collections.sort(this.MediaBrowserCompat$SearchResultReceiver, IconCompatParcelizer);
                    for (int i8 = 0; i8 < this.MediaBrowserCompat$SearchResultReceiver.size(); i8++) {
                        write write3 = this.MediaBrowserCompat$SearchResultReceiver.get(i8);
                        if (write3.write == null) {
                            break;
                        }
                        RecyclerView.setContentView read2 = read(write3.write, write3.read, write3.MediaBrowserCompat$ItemReceiver ? Long.MAX_VALUE : nanos);
                        if (!(read2 == null || read2.RatingCompat == null)) {
                            if ((read2.read & 1) != 0) {
                                if (!((read2.read & 4) != 0) && (recyclerView = read2.RatingCompat.get()) != null) {
                                    if (recyclerView.f23x50fd9e4a && recyclerView.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver() != 0) {
                                        recyclerView.MediaDescriptionCompat();
                                    }
                                    IconCompatParcelizer iconCompatParcelizer2 = recyclerView.setIcon;
                                    iconCompatParcelizer2.read(recyclerView, true);
                                    if (iconCompatParcelizer2.IconCompatParcelizer != 0) {
                                        setMeasureWithLargestChildEnabled.read("RV Nested Prefetch");
                                        RecyclerView.Keep keep = recyclerView.ExpandedMenuView;
                                        RecyclerView.IconCompatParcelizer iconCompatParcelizer3 = recyclerView.MediaDescriptionCompat;
                                        keep.MediaMetadataCompat = 1;
                                        keep.MediaBrowserCompat$MediaItem = iconCompatParcelizer3.IconCompatParcelizer();
                                        keep.MediaBrowserCompat$ItemReceiver = false;
                                        keep.MediaSessionCompat$Token = false;
                                        keep.MediaBrowserCompat$SearchResultReceiver = false;
                                        for (int i9 = 0; i9 < (iconCompatParcelizer2.IconCompatParcelizer << 1); i9 += 2) {
                                            read(recyclerView, iconCompatParcelizer2.write[i9], nanos);
                                        }
                                        setMeasureWithLargestChildEnabled.MediaBrowserCompat$CustomActionResultReceiver();
                                    }
                                }
                            }
                        }
                        write3.MediaBrowserCompat$ItemReceiver = false;
                        write3.IconCompatParcelizer = 0;
                        write3.MediaBrowserCompat$CustomActionResultReceiver = 0;
                        write3.write = null;
                        write3.read = 0;
                    }
                    j = 0;
                }
            }
            this.MediaBrowserCompat$ItemReceiver = j;
            setMeasureWithLargestChildEnabled.MediaBrowserCompat$CustomActionResultReceiver();
        } catch (Throwable th2) {
            th = th2;
            this.MediaBrowserCompat$ItemReceiver = j;
            setMeasureWithLargestChildEnabled.MediaBrowserCompat$CustomActionResultReceiver();
            throw th;
        }
    }

    private static RecyclerView.setContentView read(RecyclerView recyclerView, int i, long j) {
        boolean z;
        boolean z2;
        int MediaBrowserCompat$CustomActionResultReceiver2 = recyclerView.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver();
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= MediaBrowserCompat$CustomActionResultReceiver2) {
                z2 = false;
                break;
            }
            RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver3 = RecyclerView.MediaBrowserCompat$CustomActionResultReceiver(recyclerView.MediaSessionCompat$ResultReceiverWrapper.read.MediaBrowserCompat$CustomActionResultReceiver(i2));
            if (MediaBrowserCompat$CustomActionResultReceiver3.MediaSessionCompat$QueueItem == i) {
                if (!((MediaBrowserCompat$CustomActionResultReceiver3.read & 4) != 0)) {
                    z2 = true;
                    break;
                }
            }
            i2++;
        }
        if (z2) {
            return null;
        }
        RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper = recyclerView.setPadding;
        try {
            recyclerView.ActionMenuItemView++;
            RecyclerView.setContentView MediaBrowserCompat$ItemReceiver2 = recyclerView$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(i, false, j);
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                if ((MediaBrowserCompat$ItemReceiver2.read & 1) != 0) {
                    if ((MediaBrowserCompat$ItemReceiver2.read & 4) == 0) {
                        z = false;
                    }
                    if (!z) {
                        recyclerView$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2.write);
                    }
                }
                recyclerView$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2, false);
            }
            return MediaBrowserCompat$ItemReceiver2;
        } finally {
            recyclerView.read(false);
        }
    }
}

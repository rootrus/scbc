package p040o;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* renamed from: o.isMenuVisible */
public class isMenuVisible implements isHidden {
    private static final String MediaBrowserCompat$CustomActionResultReceiver = isMenuVisible.class.getSimpleName();
    private ByteBuffer AlertController$RecycleListView;
    private byte[] AppCompatActivity;
    private final isHidden$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
    private int Keep;
    private byte[] MediaBrowserCompat$ItemReceiver;
    private AppCompatSeekBar$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private short[] f2604x50fd9e4a;
    private Boolean MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private final int[] MediaSessionCompat$QueueItem;
    private byte[] MediaSessionCompat$ResultReceiverWrapper;
    private int[] MediaSessionCompat$Token;
    private byte[] ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private Bitmap PlaybackStateCompat$CustomAction;
    private int RatingCompat;
    private int[] read;
    private int setHasDecor;
    private Bitmap.Config write;

    public isMenuVisible(isHidden$MediaBrowserCompat$CustomActionResultReceiver ishidden_mediabrowsercompat_customactionresultreceiver, AppCompatSeekBar$MediaBrowserCompat$ItemReceiver appCompatSeekBar$MediaBrowserCompat$ItemReceiver, ByteBuffer byteBuffer, int i) {
        this(ishidden_mediabrowsercompat_customactionresultreceiver);
        synchronized (this) {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.Keep = 0;
                this.MediaBrowserCompat$MediaItem = appCompatSeekBar$MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$SearchResultReceiver = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.AlertController$RecycleListView = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.AlertController$RecycleListView.order(ByteOrder.LITTLE_ENDIAN);
                this.PlaybackStateCompat = false;
                Iterator<AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver> it = appCompatSeekBar$MediaBrowserCompat$ItemReceiver.write.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().MediaBrowserCompat$CustomActionResultReceiver == 3) {
                            this.PlaybackStateCompat = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.setHasDecor = highestOneBit;
                this.RatingCompat = appCompatSeekBar$MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo / highestOneBit;
                this.MediaMetadataCompat = appCompatSeekBar$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat / highestOneBit;
                this.MediaSessionCompat$ResultReceiverWrapper = this.IconCompatParcelizer.read(appCompatSeekBar$MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo * appCompatSeekBar$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat);
                this.MediaSessionCompat$Token = this.IconCompatParcelizer.write(this.RatingCompat * this.MediaMetadataCompat);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Sample size must be >=0, not: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    private isMenuVisible(isHidden$MediaBrowserCompat$CustomActionResultReceiver ishidden_mediabrowsercompat_customactionresultreceiver) {
        this.MediaSessionCompat$QueueItem = new int[256];
        this.write = Bitmap.Config.ARGB_8888;
        this.IconCompatParcelizer = ishidden_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$MediaItem = new AppCompatSeekBar$MediaBrowserCompat$ItemReceiver();
    }

    public final ByteBuffer MediaBrowserCompat$CustomActionResultReceiver() {
        return this.AlertController$RecycleListView;
    }

    public final void IconCompatParcelizer() {
        this.MediaBrowserCompat$SearchResultReceiver = (this.MediaBrowserCompat$SearchResultReceiver + 1) % this.MediaBrowserCompat$MediaItem.IconCompatParcelizer;
    }

    public final int MediaMetadataCompat() {
        int i;
        if (this.MediaBrowserCompat$MediaItem.IconCompatParcelizer <= 0 || (i = this.MediaBrowserCompat$SearchResultReceiver) < 0) {
            return 0;
        }
        if (i < 0 || i >= this.MediaBrowserCompat$MediaItem.IconCompatParcelizer) {
            return -1;
        }
        return this.MediaBrowserCompat$MediaItem.write.get(i).write;
    }

    public final int MediaBrowserCompat$MediaItem() {
        return this.MediaBrowserCompat$MediaItem.IconCompatParcelizer;
    }

    public final int read() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.AlertController$RecycleListView.limit() + this.MediaSessionCompat$ResultReceiverWrapper.length + (this.MediaSessionCompat$Token.length << 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap MediaDescriptionCompat() {
        /*
            r8 = this;
            monitor-enter(r8)
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r0 = r8.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x00f2 }
            int r0 = r0.IconCompatParcelizer     // Catch:{ all -> 0x00f2 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x00f2 }
            if (r0 >= 0) goto L_0x003b
        L_0x000d:
            java.lang.String r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00f2 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00f2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r3.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00f2 }
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r4 = r8.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x00f2 }
            int r4 = r4.IconCompatParcelizer     // Catch:{ all -> 0x00f2 }
            r3.append(r4)     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00f2 }
            int r4 = r8.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x00f2 }
            r3.append(r4)     // Catch:{ all -> 0x00f2 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f2 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00f2 }
        L_0x0039:
            r8.Keep = r2     // Catch:{ all -> 0x00f2 }
        L_0x003b:
            int r0 = r8.Keep     // Catch:{ all -> 0x00f2 }
            r3 = 0
            if (r0 == r2) goto L_0x00d0
            int r0 = r8.Keep     // Catch:{ all -> 0x00f2 }
            r4 = 2
            if (r0 != r4) goto L_0x0047
            goto L_0x00d0
        L_0x0047:
            r0 = 0
            r8.Keep = r0     // Catch:{ all -> 0x00f2 }
            byte[] r5 = r8.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00f2 }
            if (r5 != 0) goto L_0x0058
            o.isHidden$MediaBrowserCompat$CustomActionResultReceiver r5 = r8.IconCompatParcelizer     // Catch:{ all -> 0x00f2 }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.read((int) r6)     // Catch:{ all -> 0x00f2 }
            r8.MediaBrowserCompat$ItemReceiver = r5     // Catch:{ all -> 0x00f2 }
        L_0x0058:
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r8.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x00f2 }
            java.util.List<o.AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver> r5 = r5.write     // Catch:{ all -> 0x00f2 }
            int r6 = r8.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x00f2 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00f2 }
            o.AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver r5 = (p040o.AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver) r5     // Catch:{ all -> 0x00f2 }
            int r6 = r8.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x00f2 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0074
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r7 = r8.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x00f2 }
            java.util.List<o.AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver> r7 = r7.write     // Catch:{ all -> 0x00f2 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00f2 }
            o.AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver r6 = (p040o.AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver) r6     // Catch:{ all -> 0x00f2 }
            goto L_0x0075
        L_0x0074:
            r6 = r3
        L_0x0075:
            int[] r7 = r5.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x007c
            int[] r7 = r5.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x00f2 }
            goto L_0x0080
        L_0x007c:
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r7 = r8.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x00f2 }
            int[] r7 = r7.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x00f2 }
        L_0x0080:
            r8.read = r7     // Catch:{ all -> 0x00f2 }
            if (r7 != 0) goto L_0x00a8
            java.lang.String r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00f2 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00f2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r1.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00f2 }
            int r4 = r8.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x00f2 }
            r1.append(r4)     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f2 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00f2 }
        L_0x00a4:
            r8.Keep = r2     // Catch:{ all -> 0x00f2 }
            monitor-exit(r8)
            return r3
        L_0x00a8:
            boolean r1 = r5.ParcelableVolumeInfo     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x00ca
            int[] r1 = r8.read     // Catch:{ all -> 0x00f2 }
            int[] r2 = r8.MediaSessionCompat$QueueItem     // Catch:{ all -> 0x00f2 }
            int[] r3 = r8.read     // Catch:{ all -> 0x00f2 }
            int r3 = r3.length     // Catch:{ all -> 0x00f2 }
            java.lang.System.arraycopy(r1, r0, r2, r0, r3)     // Catch:{ all -> 0x00f2 }
            int[] r1 = r8.MediaSessionCompat$QueueItem     // Catch:{ all -> 0x00f2 }
            r8.read = r1     // Catch:{ all -> 0x00f2 }
            int r2 = r5.RatingCompat     // Catch:{ all -> 0x00f2 }
            r1[r2] = r0     // Catch:{ all -> 0x00f2 }
            int r0 = r5.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00f2 }
            if (r0 != r4) goto L_0x00ca
            int r0 = r8.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x00f2 }
            if (r0 != 0) goto L_0x00ca
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00f2 }
            r8.MediaDescriptionCompat = r0     // Catch:{ all -> 0x00f2 }
        L_0x00ca:
            android.graphics.Bitmap r0 = r8.read(r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r8)
            return r0
        L_0x00d0:
            java.lang.String r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00f2 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00f2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r1.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00f2 }
            int r2 = r8.Keep     // Catch:{ all -> 0x00f2 }
            r1.append(r2)     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f2 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00f2 }
        L_0x00f0:
            monitor-exit(r8)
            return r3
        L_0x00f2:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isMenuVisible.MediaDescriptionCompat():android.graphics.Bitmap");
    }

    public final void write() {
        this.MediaBrowserCompat$MediaItem = null;
        byte[] bArr = this.MediaSessionCompat$ResultReceiverWrapper;
        if (bArr != null) {
            this.IconCompatParcelizer.write(bArr);
        }
        int[] iArr = this.MediaSessionCompat$Token;
        if (iArr != null) {
            this.IconCompatParcelizer.write(iArr);
        }
        Bitmap bitmap = this.PlaybackStateCompat$CustomAction;
        if (bitmap != null) {
            this.IconCompatParcelizer.read(bitmap);
        }
        this.PlaybackStateCompat$CustomAction = null;
        this.AlertController$RecycleListView = null;
        this.MediaDescriptionCompat = null;
        byte[] bArr2 = this.MediaBrowserCompat$ItemReceiver;
        if (bArr2 != null) {
            this.IconCompatParcelizer.write(bArr2);
        }
    }

    public final void write(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.write = config;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported format: ");
        sb.append(config);
        sb.append(", must be one of ");
        sb.append(Bitmap.Config.ARGB_8888);
        sb.append(" or ");
        sb.append(Bitmap.Config.RGB_565);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r0.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver == r1.RatingCompat) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v38, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap read(p040o.AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver r38, p040o.AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver r39) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = r39
            int[] r10 = r0.MediaSessionCompat$Token
            r11 = 0
            if (r2 != 0) goto L_0x001a
            android.graphics.Bitmap r3 = r0.PlaybackStateCompat$CustomAction
            if (r3 == 0) goto L_0x0014
            o.isHidden$MediaBrowserCompat$CustomActionResultReceiver r4 = r0.IconCompatParcelizer
            r4.read((android.graphics.Bitmap) r3)
        L_0x0014:
            r3 = 0
            r0.PlaybackStateCompat$CustomAction = r3
            java.util.Arrays.fill(r10, r11)
        L_0x001a:
            r12 = 3
            if (r2 == 0) goto L_0x0028
            int r3 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r3 != r12) goto L_0x0028
            android.graphics.Bitmap r3 = r0.PlaybackStateCompat$CustomAction
            if (r3 != 0) goto L_0x0028
            java.util.Arrays.fill(r10, r11)
        L_0x0028:
            r13 = 2
            if (r2 == 0) goto L_0x0088
            int r3 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r3 <= 0) goto L_0x0088
            int r3 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r3 != r13) goto L_0x0074
            boolean r3 = r1.ParcelableVolumeInfo
            if (r3 != 0) goto L_0x0047
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r3 = r0.MediaBrowserCompat$MediaItem
            int r3 = r3.MediaBrowserCompat$CustomActionResultReceiver
            int[] r4 = r1.MediaBrowserCompat$MediaItem
            if (r4 == 0) goto L_0x0048
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r4 = r0.MediaBrowserCompat$MediaItem
            int r4 = r4.MediaBrowserCompat$ItemReceiver
            int r5 = r1.RatingCompat
            if (r4 != r5) goto L_0x0048
        L_0x0047:
            r3 = r11
        L_0x0048:
            int r4 = r2.IconCompatParcelizer
            int r5 = r0.setHasDecor
            int r4 = r4 / r5
            int r5 = r2.MediaDescriptionCompat
            int r6 = r0.setHasDecor
            int r5 = r5 / r6
            int r6 = r2.MediaMetadataCompat
            int r7 = r0.setHasDecor
            int r6 = r6 / r7
            int r2 = r2.MediaBrowserCompat$SearchResultReceiver
            int r7 = r0.setHasDecor
            int r2 = r2 / r7
            int r7 = r0.RatingCompat
            int r5 = r5 * r7
            int r5 = r5 + r2
            r2 = r5
        L_0x0061:
            int r8 = r4 * r7
            int r8 = r8 + r5
            if (r2 >= r8) goto L_0x0088
            r8 = r2
        L_0x0067:
            int r9 = r2 + r6
            if (r8 >= r9) goto L_0x0070
            r10[r8] = r3
            int r8 = r8 + 1
            goto L_0x0067
        L_0x0070:
            int r8 = r0.RatingCompat
            int r2 = r2 + r8
            goto L_0x0061
        L_0x0074:
            int r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 != r12) goto L_0x0088
            android.graphics.Bitmap r2 = r0.PlaybackStateCompat$CustomAction
            if (r2 == 0) goto L_0x0088
            int r8 = r0.RatingCompat
            r4 = 0
            r6 = 0
            r7 = 0
            int r9 = r0.MediaMetadataCompat
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x0088:
            if (r1 == 0) goto L_0x0091
            java.nio.ByteBuffer r2 = r0.AlertController$RecycleListView
            int r3 = r1.read
            r2.position(r3)
        L_0x0091:
            if (r1 != 0) goto L_0x009d
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r2 = r0.MediaBrowserCompat$MediaItem
            int r2 = r2.ParcelableVolumeInfo
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r3 = r0.MediaBrowserCompat$MediaItem
            int r3 = r3.MediaMetadataCompat
            int r2 = r2 * r3
            goto L_0x00a2
        L_0x009d:
            int r2 = r1.MediaMetadataCompat
            int r3 = r1.IconCompatParcelizer
            int r2 = r2 * r3
        L_0x00a2:
            byte[] r3 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r3 == 0) goto L_0x00a9
            int r3 = r3.length
            if (r3 >= r2) goto L_0x00b1
        L_0x00a9:
            o.isHidden$MediaBrowserCompat$CustomActionResultReceiver r3 = r0.IconCompatParcelizer
            byte[] r3 = r3.read((int) r2)
            r0.MediaSessionCompat$ResultReceiverWrapper = r3
        L_0x00b1:
            byte[] r3 = r0.MediaSessionCompat$ResultReceiverWrapper
            short[] r4 = r0.f2604x50fd9e4a
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00bd
            short[] r4 = new short[r5]
            r0.f2604x50fd9e4a = r4
        L_0x00bd:
            short[] r4 = r0.f2604x50fd9e4a
            byte[] r6 = r0.AppCompatActivity
            if (r6 != 0) goto L_0x00c7
            byte[] r6 = new byte[r5]
            r0.AppCompatActivity = r6
        L_0x00c7:
            byte[] r6 = r0.AppCompatActivity
            byte[] r7 = r0.ParcelableVolumeInfo
            if (r7 != 0) goto L_0x00d3
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.ParcelableVolumeInfo = r7
        L_0x00d3:
            byte[] r7 = r0.ParcelableVolumeInfo
            java.nio.ByteBuffer r8 = r0.AlertController$RecycleListView
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r14 = r9 << r8
            int r15 = r14 + 2
            int r8 = r8 + r9
            int r16 = r9 << r8
            int r16 = r16 + -1
            r13 = r11
        L_0x00e8:
            if (r13 >= r14) goto L_0x00f4
            r4[r13] = r11
            byte r5 = (byte) r13
            r6[r13] = r5
            int r13 = r13 + 1
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x00e8
        L_0x00f4:
            byte[] r5 = r0.MediaBrowserCompat$ItemReceiver
            r24 = r8
            r13 = r11
            r20 = r13
            r21 = r20
            r22 = r21
            r25 = r22
            r26 = r25
            r27 = r26
            r29 = r27
            r23 = r15
            r28 = r16
            r19 = -1
        L_0x010d:
            r30 = 8
            if (r13 >= r2) goto L_0x0205
            if (r20 != 0) goto L_0x0145
            java.nio.ByteBuffer r9 = r0.AlertController$RecycleListView
            byte r9 = r9.get()
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r9 > 0) goto L_0x0122
            r31 = r8
            r32 = r13
            goto L_0x0136
        L_0x0122:
            java.nio.ByteBuffer r12 = r0.AlertController$RecycleListView
            byte[] r11 = r0.MediaBrowserCompat$ItemReceiver
            r31 = r8
            int r8 = r12.remaining()
            int r8 = java.lang.Math.min(r9, r8)
            r32 = r13
            r13 = 0
            r12.get(r11, r13, r8)
        L_0x0136:
            if (r9 > 0) goto L_0x0140
            r8 = 3
            r0.Keep = r8
            r11 = r27
            r13 = 0
            goto L_0x0208
        L_0x0140:
            r20 = r9
            r21 = 0
            goto L_0x0149
        L_0x0145:
            r31 = r8
            r32 = r13
        L_0x0149:
            byte r8 = r5[r21]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r26
            int r22 = r22 + r8
            r8 = 1
            int r21 = r21 + 1
            int r20 = r20 + -1
            int r26 = r26 + 8
            r8 = r19
            r9 = r23
            r11 = r24
            r12 = r25
            r13 = r32
            r19 = r5
            r5 = r26
        L_0x0166:
            if (r5 < r11) goto L_0x01f2
            r23 = r15
            r15 = r22 & r28
            int r22 = r22 >> r11
            int r5 = r5 - r11
            if (r15 != r14) goto L_0x017a
            r28 = r16
            r9 = r23
            r15 = r9
            r11 = r31
            r8 = -1
            goto L_0x0166
        L_0x017a:
            r24 = r5
            int r5 = r14 + 1
            if (r15 != r5) goto L_0x0195
            r25 = r12
            r5 = r19
            r15 = r23
            r26 = r24
            r12 = 3
            r19 = r8
            r23 = r9
            r24 = r11
            r8 = r31
            r9 = 1
            r11 = 0
            goto L_0x010d
        L_0x0195:
            r5 = -1
            if (r8 != r5) goto L_0x01a7
            byte r5 = r6[r15]
            r3[r27] = r5
            int r27 = r27 + 1
            int r13 = r13 + 1
            r8 = r15
            r12 = r8
            r15 = r23
            r5 = r24
            goto L_0x0166
        L_0x01a7:
            if (r15 < r9) goto L_0x01b0
            byte r5 = (byte) r12
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r8
            goto L_0x01b1
        L_0x01b0:
            r5 = r15
        L_0x01b1:
            if (r5 < r14) goto L_0x01bc
            byte r12 = r6[r5]
            r7[r29] = r12
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01b1
        L_0x01bc:
            byte r5 = r6[r5]
            r12 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r12
            r3[r27] = r5
        L_0x01c3:
            r25 = 1
            int r27 = r27 + 1
            int r13 = r13 + 1
            if (r29 <= 0) goto L_0x01d2
            int r29 = r29 + -1
            byte r25 = r7[r29]
            r3[r27] = r25
            goto L_0x01c3
        L_0x01d2:
            r25 = r7
            r7 = 4096(0x1000, float:5.74E-42)
            if (r9 >= r7) goto L_0x01e9
            short r8 = (short) r8
            r4[r9] = r8
            r6[r9] = r5
            int r9 = r9 + 1
            r5 = r9 & r28
            if (r5 != 0) goto L_0x01e9
            if (r9 >= r7) goto L_0x01e9
            int r11 = r11 + 1
            int r28 = r28 + r9
        L_0x01e9:
            r8 = r15
            r15 = r23
            r5 = r24
            r7 = r25
            goto L_0x0166
        L_0x01f2:
            r26 = r5
            r23 = r9
            r24 = r11
            r25 = r12
            r5 = r19
            r9 = 1
            r11 = 0
            r12 = 3
            r19 = r8
            r8 = r31
            goto L_0x010d
        L_0x0205:
            r13 = r11
            r11 = r27
        L_0x0208:
            java.util.Arrays.fill(r3, r11, r2, r13)
            boolean r2 = r1.MediaBrowserCompat$ItemReceiver
            if (r2 != 0) goto L_0x028a
            int r2 = r0.setHasDecor
            r3 = 1
            if (r2 != r3) goto L_0x028a
            int[] r2 = r0.MediaSessionCompat$Token
            int r3 = r1.IconCompatParcelizer
            int r4 = r1.MediaDescriptionCompat
            int r5 = r1.MediaMetadataCompat
            int r6 = r1.MediaBrowserCompat$SearchResultReceiver
            int r7 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r7 != 0) goto L_0x0224
            r7 = 1
            goto L_0x0225
        L_0x0224:
            r7 = r13
        L_0x0225:
            int r8 = r0.RatingCompat
            byte[] r9 = r0.MediaSessionCompat$ResultReceiverWrapper
            int[] r11 = r0.read
            r14 = r13
            r12 = -1
        L_0x022d:
            if (r14 >= r3) goto L_0x026a
            int r15 = r14 + r4
            int r15 = r15 * r8
            int r16 = r15 + r6
            int r13 = r16 + r5
            int r15 = r15 + r8
            if (r15 >= r13) goto L_0x023a
            r13 = r15
        L_0x023a:
            int r15 = r1.MediaMetadataCompat
            int r15 = r15 * r14
            r36 = r16
            r16 = r3
            r3 = r36
        L_0x0243:
            if (r3 >= r13) goto L_0x0260
            r17 = r4
            byte r4 = r9[r15]
            r19 = r5
            r5 = r4 & 255(0xff, float:3.57E-43)
            if (r5 == r12) goto L_0x0257
            r5 = r11[r5]
            if (r5 == 0) goto L_0x0256
            r2[r3] = r5
            goto L_0x0257
        L_0x0256:
            r12 = r4
        L_0x0257:
            int r15 = r15 + 1
            int r3 = r3 + 1
            r4 = r17
            r5 = r19
            goto L_0x0243
        L_0x0260:
            r17 = r4
            r19 = r5
            int r14 = r14 + 1
            r3 = r16
            r13 = 0
            goto L_0x022d
        L_0x026a:
            java.lang.Boolean r2 = r0.MediaDescriptionCompat
            if (r2 == 0) goto L_0x0274
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x027d
        L_0x0274:
            java.lang.Boolean r2 = r0.MediaDescriptionCompat
            if (r2 != 0) goto L_0x027f
            if (r7 == 0) goto L_0x027f
            r2 = -1
            if (r12 == r2) goto L_0x027f
        L_0x027d:
            r11 = 1
            goto L_0x0280
        L_0x027f:
            r11 = 0
        L_0x0280:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.MediaDescriptionCompat = r2
            r20 = r10
            goto L_0x040f
        L_0x028a:
            int[] r2 = r0.MediaSessionCompat$Token
            int r3 = r1.IconCompatParcelizer
            int r4 = r0.setHasDecor
            int r3 = r3 / r4
            int r4 = r1.MediaDescriptionCompat
            int r5 = r0.setHasDecor
            int r4 = r4 / r5
            int r5 = r1.MediaMetadataCompat
            int r6 = r0.setHasDecor
            int r5 = r5 / r6
            int r6 = r1.MediaBrowserCompat$SearchResultReceiver
            int r7 = r0.setHasDecor
            int r6 = r6 / r7
            int r7 = r0.MediaBrowserCompat$SearchResultReceiver
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            if (r7 != 0) goto L_0x02a8
            r13 = 1
            goto L_0x02a9
        L_0x02a8:
            r13 = 0
        L_0x02a9:
            int r7 = r0.setHasDecor
            int r9 = r0.RatingCompat
            int r11 = r0.MediaMetadataCompat
            byte[] r12 = r0.MediaSessionCompat$ResultReceiverWrapper
            int[] r14 = r0.read
            java.lang.Boolean r15 = r0.MediaDescriptionCompat
            r39 = r8
            r16 = r15
            r19 = r30
            r8 = 0
            r15 = 0
            r18 = 1
        L_0x02bf:
            if (r15 >= r3) goto L_0x03fb
            r20 = r10
            boolean r10 = r1.MediaBrowserCompat$ItemReceiver
            if (r10 == 0) goto L_0x02ed
            if (r8 < r3) goto L_0x02e8
            int r10 = r18 + 1
            r22 = r3
            r3 = 2
            if (r10 == r3) goto L_0x02e3
            r3 = 3
            if (r10 == r3) goto L_0x02dc
            r3 = 4
            r18 = r10
            if (r10 != r3) goto L_0x02ea
            r8 = 1
            r19 = 2
            goto L_0x02ea
        L_0x02dc:
            r3 = 4
            r19 = r3
            r18 = r10
            r8 = 2
            goto L_0x02ea
        L_0x02e3:
            r3 = 4
            r8 = r3
            r18 = r10
            goto L_0x02ea
        L_0x02e8:
            r22 = r3
        L_0x02ea:
            int r3 = r8 + r19
            goto L_0x02f1
        L_0x02ed:
            r22 = r3
            r3 = r8
            r8 = r15
        L_0x02f1:
            int r8 = r8 + r4
            r10 = 1
            if (r7 != r10) goto L_0x02f7
            r10 = 1
            goto L_0x02f8
        L_0x02f7:
            r10 = 0
        L_0x02f8:
            if (r8 >= r11) goto L_0x03e4
            int r8 = r8 * r9
            int r21 = r8 + r6
            r23 = r3
            int r3 = r21 + r5
            int r8 = r8 + r9
            if (r8 >= r3) goto L_0x0305
            r3 = r8
        L_0x0305:
            int r8 = r15 * r7
            r24 = r4
            int r4 = r1.MediaMetadataCompat
            int r8 = r8 * r4
            if (r10 == 0) goto L_0x0327
            r4 = r21
        L_0x0310:
            if (r4 >= r3) goto L_0x03dd
            byte r10 = r12[r8]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r14[r10]
            if (r10 == 0) goto L_0x031d
            r2[r4] = r10
            goto L_0x0323
        L_0x031d:
            if (r13 == 0) goto L_0x0323
            if (r16 != 0) goto L_0x0323
            r16 = r39
        L_0x0323:
            int r8 = r8 + r7
            int r4 = r4 + 1
            goto L_0x0310
        L_0x0327:
            r4 = r8
            r10 = r21
        L_0x032a:
            if (r10 >= r3) goto L_0x03dd
            int r25 = r3 - r21
            int r25 = r25 * r7
            r26 = r3
            int r3 = r25 + r8
            r25 = r5
            int r5 = r1.MediaMetadataCompat
            r33 = r6
            r34 = r8
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r6 = r4
        L_0x0347:
            int r8 = r0.setHasDecor
            int r8 = r8 + r4
            if (r6 >= r8) goto L_0x037a
            byte[] r8 = r0.MediaSessionCompat$ResultReceiverWrapper
            r35 = r9
            int r9 = r8.length
            if (r6 >= r9) goto L_0x037c
            if (r6 >= r3) goto L_0x037c
            byte r8 = r8[r6]
            int[] r9 = r0.read
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0375
            int r9 = r8 >>> 24
            int r27 = r27 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r28 = r28 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r29 = r29 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r31 = r31 + r8
            int r32 = r32 + 1
        L_0x0375:
            int r6 = r6 + 1
            r9 = r35
            goto L_0x0347
        L_0x037a:
            r35 = r9
        L_0x037c:
            int r5 = r5 + r4
            r6 = r5
        L_0x037e:
            int r8 = r0.setHasDecor
            int r8 = r8 + r5
            if (r6 >= r8) goto L_0x03ad
            byte[] r8 = r0.MediaSessionCompat$ResultReceiverWrapper
            int r9 = r8.length
            if (r6 >= r9) goto L_0x03ad
            if (r6 >= r3) goto L_0x03ad
            byte r8 = r8[r6]
            int[] r9 = r0.read
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r9[r8]
            if (r8 == 0) goto L_0x03aa
            int r9 = r8 >>> 24
            int r27 = r27 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r28 = r28 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r29 = r29 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r31 = r31 + r8
            int r32 = r32 + 1
        L_0x03aa:
            int r6 = r6 + 1
            goto L_0x037e
        L_0x03ad:
            if (r32 != 0) goto L_0x03b1
            r3 = 0
            goto L_0x03c3
        L_0x03b1:
            int r27 = r27 / r32
            int r3 = r27 << 24
            int r28 = r28 / r32
            int r5 = r28 << 16
            r3 = r3 | r5
            int r29 = r29 / r32
            int r5 = r29 << 8
            r3 = r3 | r5
            int r31 = r31 / r32
            r3 = r3 | r31
        L_0x03c3:
            if (r3 == 0) goto L_0x03c8
            r2[r10] = r3
            goto L_0x03ce
        L_0x03c8:
            if (r13 == 0) goto L_0x03ce
            if (r16 != 0) goto L_0x03ce
            r16 = r39
        L_0x03ce:
            int r4 = r4 + r7
            int r10 = r10 + 1
            r5 = r25
            r3 = r26
            r6 = r33
            r8 = r34
            r9 = r35
            goto L_0x032a
        L_0x03dd:
            r25 = r5
            r33 = r6
            r35 = r9
            goto L_0x03e9
        L_0x03e4:
            r23 = r3
            r24 = r4
            goto L_0x03dd
        L_0x03e9:
            int r15 = r15 + 1
            r10 = r20
            r3 = r22
            r8 = r23
            r4 = r24
            r5 = r25
            r6 = r33
            r9 = r35
            goto L_0x02bf
        L_0x03fb:
            r20 = r10
            java.lang.Boolean r2 = r0.MediaDescriptionCompat
            if (r2 != 0) goto L_0x040f
            if (r16 != 0) goto L_0x0405
            r11 = 0
            goto L_0x0409
        L_0x0405:
            boolean r11 = r16.booleanValue()
        L_0x0409:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.MediaDescriptionCompat = r2
        L_0x040f:
            boolean r2 = r0.PlaybackStateCompat
            if (r2 == 0) goto L_0x0435
            int r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x041c
            int r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r2 = 1
            if (r1 != r2) goto L_0x0435
        L_0x041c:
            android.graphics.Bitmap r1 = r0.PlaybackStateCompat$CustomAction
            if (r1 != 0) goto L_0x0426
            android.graphics.Bitmap r1 = r37.MediaBrowserCompat$SearchResultReceiver()
            r0.PlaybackStateCompat$CustomAction = r1
        L_0x0426:
            android.graphics.Bitmap r1 = r0.PlaybackStateCompat$CustomAction
            int r7 = r0.RatingCompat
            r3 = 0
            r5 = 0
            r6 = 0
            int r8 = r0.MediaMetadataCompat
            r2 = r20
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x0435:
            android.graphics.Bitmap r9 = r37.MediaBrowserCompat$SearchResultReceiver()
            int r7 = r0.RatingCompat
            r3 = 0
            r5 = 0
            r6 = 0
            int r8 = r0.MediaMetadataCompat
            r1 = r9
            r2 = r20
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isMenuVisible.read(o.AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver, o.AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver):android.graphics.Bitmap");
    }

    private Bitmap MediaBrowserCompat$SearchResultReceiver() {
        Boolean bool = this.MediaDescriptionCompat;
        Bitmap read2 = this.IconCompatParcelizer.read(this.RatingCompat, this.MediaMetadataCompat, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.write);
        read2.setHasAlpha(true);
        return read2;
    }
}

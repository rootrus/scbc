package p040o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p040o.CheckParameters;

/* renamed from: o.onMenuItemSelected */
public final class onMenuItemSelected {
    public static final noteStateNotSaved<isResumed> IconCompatParcelizer = noteStateNotSaved.MediaBrowserCompat$CustomActionResultReceiver("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", isResumed.SRGB);
    public static final noteStateNotSaved<Boolean> MediaBrowserCompat$CustomActionResultReceiver;
    public static final noteStateNotSaved<isInBackStack> MediaBrowserCompat$ItemReceiver = noteStateNotSaved.MediaBrowserCompat$CustomActionResultReceiver("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", isInBackStack.DEFAULT);
    private static final Queue<BitmapFactory.Options> MediaBrowserCompat$MediaItem = LinearLayoutManager.IconCompatParcelizer(0);
    private static final Set<ImageHeaderParser.ImageType> MediaMetadataCompat = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
    private static final Set<String> RatingCompat = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
    static final IconCompatParcelizer read = new IconCompatParcelizer() {
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(CheckParameters_MembersInjector checkParameters_MembersInjector, Bitmap bitmap) {
        }
    };
    private static noteStateNotSaved<Boolean> write;
    private final CheckParameters_MembersInjector MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final DisplayMetrics f2613x50fd9e4a;
    private final CheckParameters.CheckCountry MediaDescriptionCompat;
    private final onPreparePanel MediaSessionCompat$ResultReceiverWrapper = onPreparePanel.IconCompatParcelizer();
    private final List<ImageHeaderParser> ParcelableVolumeInfo;

    /* renamed from: o.onMenuItemSelected$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(CheckParameters_MembersInjector checkParameters_MembersInjector, Bitmap bitmap) throws IOException;
    }

    static {
        noteStateNotSaved<onCreatePanelMenu> notestatenotsaved = onCreatePanelMenu.MediaBrowserCompat$SearchResultReceiver;
        Boolean bool = Boolean.FALSE;
        write = noteStateNotSaved.MediaBrowserCompat$CustomActionResultReceiver("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        MediaBrowserCompat$CustomActionResultReceiver = noteStateNotSaved.MediaBrowserCompat$CustomActionResultReceiver("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public onMenuItemSelected(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, CheckParameters_MembersInjector checkParameters_MembersInjector, CheckParameters.CheckCountry checkCountry) {
        this.ParcelableVolumeInfo = list;
        if (displayMetrics != null) {
            this.f2613x50fd9e4a = displayMetrics;
            if (checkParameters_MembersInjector != null) {
                this.MediaBrowserCompat$SearchResultReceiver = checkParameters_MembersInjector;
                if (checkCountry != null) {
                    this.MediaDescriptionCompat = checkCountry;
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf A[Catch:{ all -> 0x00da }] */
    public final p040o.performOptionsMenuClosed<android.graphics.Bitmap> IconCompatParcelizer(java.io.InputStream r16, int r17, int r18, p040o.onActivityResult r19, p040o.onMenuItemSelected.IconCompatParcelizer r20) throws java.io.IOException {
        /*
            r15 = this;
            r12 = r15
            r0 = r19
            boolean r1 = r16.markSupported()
            if (r1 == 0) goto L_0x00f0
            o.CheckParameters$CheckCountry r1 = r12.MediaDescriptionCompat
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r3 = byte[].class
            java.lang.Object r1 = r1.read(r2, r3)
            r13 = r1
            byte[] r13 = (byte[]) r13
            android.graphics.BitmapFactory$Options r14 = write()
            r14.inTempStorage = r13
            o.noteStateNotSaved<o.isInBackStack> r1 = MediaBrowserCompat$ItemReceiver
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x002d
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r1 = r2.get(r1)
            goto L_0x002f
        L_0x002d:
            T r1 = r1.read
        L_0x002f:
            r5 = r1
            o.isInBackStack r5 = (p040o.isInBackStack) r5
            o.noteStateNotSaved<o.isResumed> r1 = IconCompatParcelizer
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x0043
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r1 = r2.get(r1)
            goto L_0x0045
        L_0x0043:
            T r1 = r1.read
        L_0x0045:
            r6 = r1
            o.isResumed r6 = (p040o.isResumed) r6
            o.noteStateNotSaved<o.onCreatePanelMenu> r1 = p040o.onCreatePanelMenu.MediaBrowserCompat$SearchResultReceiver
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x0059
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r1 = r2.get(r1)
            goto L_0x005b
        L_0x0059:
            T r1 = r1.read
        L_0x005b:
            r4 = r1
            o.onCreatePanelMenu r4 = (p040o.onCreatePanelMenu) r4
            o.noteStateNotSaved<java.lang.Boolean> r1 = write
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x006f
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r1 = r2.get(r1)
            goto L_0x0071
        L_0x006f:
            T r1 = r1.read
        L_0x0071:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r10 = r1.booleanValue()
            o.noteStateNotSaved<java.lang.Boolean> r1 = MediaBrowserCompat$CustomActionResultReceiver
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x0088
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r1 = r2.get(r1)
            goto L_0x008a
        L_0x0088:
            T r1 = r1.read
        L_0x008a:
            if (r1 == 0) goto L_0x00a9
            o.noteStateNotSaved<java.lang.Boolean> r1 = MediaBrowserCompat$CustomActionResultReceiver
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x009d
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r0 = r0.get(r1)
            goto L_0x009f
        L_0x009d:
            T r0 = r1.read
        L_0x009f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00a9
            r0 = 1
            goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            r7 = r0
            r1 = r15
            r2 = r16
            r3 = r14
            r8 = r17
            r9 = r18
            r11 = r20
            android.graphics.Bitmap r0 = r1.write(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00da }
            o.CheckParameters_MembersInjector r1 = r12.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00bf
            r0 = 0
            goto L_0x00c5
        L_0x00bf:
            o.getLastCustomNonConfigurationInstance r2 = new o.getLastCustomNonConfigurationInstance     // Catch:{ all -> 0x00da }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x00da }
            r0 = r2
        L_0x00c5:
            write(r14)
            java.util.Queue<android.graphics.BitmapFactory$Options> r1 = MediaBrowserCompat$MediaItem
            monitor-enter(r1)
            java.util.Queue<android.graphics.BitmapFactory$Options> r2 = MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x00d7 }
            r2.offer(r14)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r1)
            o.CheckParameters$CheckCountry r1 = r12.MediaDescriptionCompat
            r1.MediaBrowserCompat$CustomActionResultReceiver(r13)
            return r0
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00da:
            r0 = move-exception
            write(r14)
            java.util.Queue<android.graphics.BitmapFactory$Options> r1 = MediaBrowserCompat$MediaItem
            monitor-enter(r1)
            java.util.Queue<android.graphics.BitmapFactory$Options> r2 = MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x00ed }
            r2.offer(r14)     // Catch:{ all -> 0x00ed }
            monitor-exit(r1)
            o.CheckParameters$CheckCountry r1 = r12.MediaDescriptionCompat
            r1.MediaBrowserCompat$CustomActionResultReceiver(r13)
            throw r0
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00f0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "You must provide an InputStream that supports mark()"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onMenuItemSelected.IconCompatParcelizer(java.io.InputStream, int, int, o.onActivityResult, o.onMenuItemSelected$IconCompatParcelizer):o.performOptionsMenuClosed");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x052c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap write(java.io.InputStream r39, android.graphics.BitmapFactory.Options r40, p040o.onCreatePanelMenu r41, p040o.isInBackStack r42, p040o.isResumed r43, boolean r44, int r45, int r46, boolean r47, p040o.onMenuItemSelected.IconCompatParcelizer r48) throws java.io.IOException {
        /*
            r38 = this;
            r1 = r38
            r2 = r39
            r3 = r40
            r0 = r41
            r4 = r42
            r5 = r45
            r6 = r46
            r7 = r48
            long r8 = p040o.AudioAttributesCompatParcelizer.MediaBrowserCompat$ItemReceiver()
            o.CheckParameters_MembersInjector r10 = r1.MediaBrowserCompat$SearchResultReceiver
            int[] r10 = MediaBrowserCompat$ItemReceiver(r2, r3, r7, r10)
            r11 = 0
            r12 = r10[r11]
            r13 = 1
            r10 = r10[r13]
            java.lang.String r14 = r3.outMimeType
            r15 = -1
            if (r12 == r15) goto L_0x002b
            if (r10 != r15) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            r15 = r44
            goto L_0x002c
        L_0x002b:
            r15 = r11
        L_0x002c:
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r11 = r1.ParcelableVolumeInfo
            o.CheckParameters$CheckCountry r13 = r1.MediaDescriptionCompat
            int r11 = p040o.AlertController$RecycleListView.IconCompatParcelizer((java.util.List<com.bumptech.glide.load.ImageHeaderParser>) r11, (java.io.InputStream) r2, (p040o.CheckParameters.CheckCountry) r13)
            int r13 = p040o.requestPermissionsFromFragment.MediaBrowserCompat$ItemReceiver(r11)
            r16 = r8
            boolean r8 = p040o.requestPermissionsFromFragment.MediaBrowserCompat$CustomActionResultReceiver(r11)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r44 = r11
            r11 = 90
            if (r5 != r9) goto L_0x005b
            if (r13 == r11) goto L_0x004f
            r11 = 270(0x10e, float:3.78E-43)
            if (r13 == r11) goto L_0x0051
            r18 = 0
            goto L_0x0053
        L_0x004f:
            r11 = 270(0x10e, float:3.78E-43)
        L_0x0051:
            r18 = 1
        L_0x0053:
            if (r18 == 0) goto L_0x0058
            r20 = r10
            goto L_0x005f
        L_0x0058:
            r20 = r12
            goto L_0x005f
        L_0x005b:
            r11 = 270(0x10e, float:3.78E-43)
            r20 = r5
        L_0x005f:
            if (r6 != r9) goto L_0x0070
            r9 = 90
            if (r13 == r9) goto L_0x0069
            if (r13 == r11) goto L_0x0069
            r9 = 0
            goto L_0x006a
        L_0x0069:
            r9 = 1
        L_0x006a:
            if (r9 == 0) goto L_0x006e
            r9 = r12
            goto L_0x0071
        L_0x006e:
            r9 = r10
            goto L_0x0071
        L_0x0070:
            r9 = r6
        L_0x0071:
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r11 = r1.ParcelableVolumeInfo
            o.CheckParameters$CheckCountry r6 = r1.MediaDescriptionCompat
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = p040o.AlertController$RecycleListView.read((java.util.List<com.bumptech.glide.load.ImageHeaderParser>) r11, (java.io.InputStream) r2, (p040o.CheckParameters.CheckCountry) r6)
            o.CheckParameters_MembersInjector r11 = r1.MediaBrowserCompat$SearchResultReceiver
            r21 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r5 = ", target density: "
            r22 = r14
            java.lang.String r14 = "]"
            java.lang.String r4 = ", density: "
            r23 = r8
            java.lang.String r8 = "x"
            r24 = r15
            java.lang.String r15 = "Downsampler"
            if (r12 <= 0) goto L_0x02c9
            if (r10 <= 0) goto L_0x02c9
            r1 = 90
            if (r13 == r1) goto L_0x009c
            r1 = 270(0x10e, float:3.78E-43)
            if (r13 == r1) goto L_0x009c
            r1 = 0
            goto L_0x009d
        L_0x009c:
            r1 = 1
        L_0x009d:
            r19 = r4
            if (r1 == 0) goto L_0x00aa
            r4 = r12
            r18 = r14
            r1 = r20
            r20 = r5
            r14 = r10
            goto L_0x00b2
        L_0x00aa:
            r4 = r10
            r18 = r14
            r1 = r20
            r20 = r5
            r14 = r12
        L_0x00b2:
            float r5 = r0.MediaBrowserCompat$ItemReceiver(r14, r4, r1, r9)
            r25 = 0
            int r25 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r25 <= 0) goto L_0x0284
            r25 = r13
            o.onCreatePanelMenu$IconCompatParcelizer r13 = r0.MediaBrowserCompat$CustomActionResultReceiver(r14, r4, r1, r9)
            if (r13 == 0) goto L_0x027c
            r26 = r10
            float r10 = (float) r14
            r27 = r8
            float r8 = r5 * r10
            r28 = r1
            double r0 = (double) r8
            r29 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 + r29
            int r0 = (int) r0
            float r1 = (float) r4
            float r8 = r5 * r1
            r31 = r9
            double r8 = (double) r8
            double r8 = r8 + r29
            int r8 = (int) r8
            int r0 = r14 / r0
            int r8 = r4 / r8
            o.onCreatePanelMenu$IconCompatParcelizer r9 = p040o.onCreatePanelMenu.IconCompatParcelizer.MEMORY
            if (r13 != r9) goto L_0x00e9
            int r0 = java.lang.Math.max(r0, r8)
            goto L_0x00ed
        L_0x00e9:
            int r0 = java.lang.Math.min(r0, r8)
        L_0x00ed:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r8 > r9) goto L_0x00ff
            java.util.Set<java.lang.String> r8 = RatingCompat
            java.lang.String r9 = r3.outMimeType
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x00ff
            r0 = 1
            goto L_0x0115
        L_0x00ff:
            int r0 = java.lang.Integer.highestOneBit(r0)
            r8 = 1
            int r0 = java.lang.Math.max(r8, r0)
            o.onCreatePanelMenu$IconCompatParcelizer r8 = p040o.onCreatePanelMenu.IconCompatParcelizer.MEMORY
            if (r13 != r8) goto L_0x0115
            float r8 = (float) r0
            float r9 = r21 / r5
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0115
            int r0 = r0 << 1
        L_0x0115:
            r3.inSampleSize = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r6 != r8) goto L_0x013d
            r4 = 8
            int r4 = java.lang.Math.min(r0, r4)
            float r4 = (float) r4
            float r10 = r10 / r4
            double r8 = (double) r10
            double r8 = java.lang.Math.ceil(r8)
            int r8 = (int) r8
            float r1 = r1 / r4
            double r9 = (double) r1
            double r9 = java.lang.Math.ceil(r9)
            int r1 = (int) r9
            int r4 = r0 / 8
            if (r4 <= 0) goto L_0x0136
            int r8 = r8 / r4
            int r1 = r1 / r4
        L_0x0136:
            r4 = r41
            r9 = r28
            r10 = r31
            goto L_0x0196
        L_0x013d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r6 == r8) goto L_0x0186
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r6 == r8) goto L_0x0186
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
            if (r6 == r8) goto L_0x0165
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
            if (r6 == r8) goto L_0x0165
            int r1 = r14 % r0
            if (r1 != 0) goto L_0x015a
            int r1 = r4 % r0
            if (r1 != 0) goto L_0x015a
            int r8 = r14 / r0
            int r1 = r4 / r0
            goto L_0x0136
        L_0x015a:
            int[] r1 = MediaBrowserCompat$ItemReceiver(r2, r3, r7, r11)
            r4 = 0
            r8 = r1[r4]
            r4 = 1
            r1 = r1[r4]
            goto L_0x0136
        L_0x0165:
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r4 < r8) goto L_0x0177
            float r4 = (float) r0
            float r10 = r10 / r4
            int r8 = java.lang.Math.round(r10)
            float r1 = r1 / r4
            int r1 = java.lang.Math.round(r1)
            goto L_0x0136
        L_0x0177:
            float r4 = (float) r0
            float r10 = r10 / r4
            double r8 = (double) r10
            double r8 = java.lang.Math.floor(r8)
            int r8 = (int) r8
            float r1 = r1 / r4
            double r9 = (double) r1
            double r9 = java.lang.Math.floor(r9)
            goto L_0x0194
        L_0x0186:
            float r4 = (float) r0
            float r10 = r10 / r4
            double r8 = (double) r10
            double r8 = java.lang.Math.floor(r8)
            int r8 = (int) r8
            float r1 = r1 / r4
            double r9 = (double) r1
            double r9 = java.lang.Math.floor(r9)
        L_0x0194:
            int r1 = (int) r9
            goto L_0x0136
        L_0x0196:
            float r4 = r4.MediaBrowserCompat$ItemReceiver(r8, r1, r9, r10)
            double r13 = (double) r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r11 = 19
            if (r4 < r11) goto L_0x01e1
            r31 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r13 > r31 ? 1 : (r13 == r31 ? 0 : -1))
            if (r4 <= 0) goto L_0x01aa
            double r33 = r31 / r13
            goto L_0x01ac
        L_0x01aa:
            r33 = r13
        L_0x01ac:
            r35 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r33 = r33 * r35
            r11 = r6
            long r6 = java.lang.Math.round(r33)
            int r6 = (int) r6
            r7 = r0
            r18 = r1
            double r0 = (double) r6
            double r0 = r0 * r13
            double r0 = r0 + r29
            int r0 = (int) r0
            float r1 = (float) r0
            float r6 = (float) r6
            float r1 = r1 / r6
            r41 = r7
            double r6 = (double) r1
            double r6 = r13 / r6
            double r0 = (double) r0
            double r6 = r6 * r0
            double r6 = r6 + r29
            int r0 = (int) r6
            r3.inTargetDensity = r0
            if (r4 <= 0) goto L_0x01d5
            double r31 = r31 / r13
            goto L_0x01d7
        L_0x01d5:
            r31 = r13
        L_0x01d7:
            double r31 = r31 * r35
            long r0 = java.lang.Math.round(r31)
            int r0 = (int) r0
            r3.inDensity = r0
            goto L_0x01e6
        L_0x01e1:
            r41 = r0
            r18 = r1
            r11 = r6
        L_0x01e6:
            boolean r0 = MediaBrowserCompat$ItemReceiver((android.graphics.BitmapFactory.Options) r40)
            if (r0 == 0) goto L_0x01f0
            r1 = 1
            r3.inScaled = r1
            goto L_0x01f5
        L_0x01f0:
            r1 = 0
            r3.inTargetDensity = r1
            r3.inDensity = r1
        L_0x01f5:
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r15, r1)
            if (r0 == 0) goto L_0x0271
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Calculate scaling, source: ["
            r0.append(r1)
            r0.append(r12)
            r1 = r27
            r0.append(r1)
            r6 = r26
            r0.append(r6)
            java.lang.String r4 = "], degreesToRotate: "
            r0.append(r4)
            r4 = r25
            r0.append(r4)
            java.lang.String r4 = ", target: ["
            r0.append(r4)
            r0.append(r9)
            r0.append(r1)
            r0.append(r10)
            java.lang.String r4 = "], power of two scaled: ["
            r0.append(r4)
            r0.append(r8)
            r0.append(r1)
            r4 = r18
            r0.append(r4)
            java.lang.String r4 = "], exact scale factor: "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ", power of 2 sample size: "
            r0.append(r4)
            r4 = r41
            r0.append(r4)
            java.lang.String r4 = ", adjusted scale factor: "
            r0.append(r4)
            r0.append(r13)
            r4 = r20
            r0.append(r4)
            int r5 = r3.inTargetDensity
            r0.append(r5)
            r5 = r19
            r0.append(r5)
            int r7 = r3.inDensity
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r15, r0)
            goto L_0x0279
        L_0x0271:
            r5 = r19
            r4 = r20
            r6 = r26
            r1 = r27
        L_0x0279:
            r8 = 3
            goto L_0x0301
        L_0x027c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x0284:
            r4 = r0
            r6 = r10
            r10 = r9
            r9 = r1
            r1 = r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Cannot scale with factor: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = " from: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = ", source: ["
            r0.append(r2)
            r0.append(r12)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r2 = "], target: ["
            r0.append(r2)
            r0.append(r9)
            r0.append(r1)
            r0.append(r10)
            r7 = r18
            r0.append(r7)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02c9:
            r11 = r6
            r1 = r8
            r6 = r10
            r7 = r14
            r10 = r9
            r9 = r20
            r37 = r5
            r5 = r4
            r4 = r37
            r8 = 3
            boolean r0 = android.util.Log.isLoggable(r15, r8)
            if (r0 == 0) goto L_0x0301
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = "Unable to determine dimensions for: "
            r0.append(r13)
            r0.append(r11)
            java.lang.String r13 = " with target ["
            r0.append(r13)
            r0.append(r9)
            r0.append(r1)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r15, r0)
        L_0x0301:
            r7 = r38
            o.onPreparePanel r0 = r7.MediaSessionCompat$ResultReceiverWrapper
            r13 = r23
            r14 = r24
            boolean r0 = r0.MediaBrowserCompat$ItemReceiver(r9, r10, r14, r13)
            if (r0 == 0) goto L_0x0317
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r13
            r13 = 0
            r3.inMutable = r13
            goto L_0x0318
        L_0x0317:
            r13 = 0
        L_0x0318:
            if (r0 != 0) goto L_0x0367
            o.isInBackStack r0 = p040o.isInBackStack.PREFER_ARGB_8888
            r14 = r8
            r8 = r42
            if (r8 == r0) goto L_0x0363
            int r0 = android.os.Build.VERSION.SDK_INT
            r13 = 16
            if (r0 == r13) goto L_0x0363
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r7.ParcelableVolumeInfo     // Catch:{ IOException -> 0x0334 }
            o.CheckParameters$CheckCountry r13 = r7.MediaDescriptionCompat     // Catch:{ IOException -> 0x0334 }
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = p040o.AlertController$RecycleListView.read((java.util.List<com.bumptech.glide.load.ImageHeaderParser>) r0, (java.io.InputStream) r2, (p040o.CheckParameters.CheckCountry) r13)     // Catch:{ IOException -> 0x0334 }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x0334 }
            goto L_0x0350
        L_0x0334:
            r0 = move-exception
            boolean r13 = android.util.Log.isLoggable(r15, r14)
            if (r13 == 0) goto L_0x034f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Cannot determine whether the image has alpha or not from header, format "
            r13.append(r14)
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            android.util.Log.d(r15, r8, r0)
        L_0x034f:
            r0 = 0
        L_0x0350:
            if (r0 == 0) goto L_0x0355
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x0357
        L_0x0355:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x0357:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r0 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r8) goto L_0x0367
            r8 = 1
            r3.inDither = r8
            goto L_0x0367
        L_0x0363:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r0
        L_0x0367:
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 19
            if (r0 < r8) goto L_0x036f
            r8 = 1
            goto L_0x0370
        L_0x036f:
            r8 = 0
        L_0x0370:
            int r0 = r3.inSampleSize
            r13 = 1
            if (r0 == r13) goto L_0x037b
            if (r8 == 0) goto L_0x0378
            goto L_0x037b
        L_0x0378:
            r13 = r15
            goto L_0x043d
        L_0x037b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r13 = 19
            if (r0 < r13) goto L_0x0383
            r0 = 1
            goto L_0x0389
        L_0x0383:
            java.util.Set<com.bumptech.glide.load.ImageHeaderParser$ImageType> r0 = MediaMetadataCompat
            boolean r0 = r0.contains(r11)
        L_0x0389:
            if (r0 == 0) goto L_0x0378
            if (r12 < 0) goto L_0x0399
            if (r6 < 0) goto L_0x0399
            if (r47 == 0) goto L_0x0399
            if (r8 != 0) goto L_0x0394
            goto L_0x0399
        L_0x0394:
            r0 = r9
            r9 = r10
            r13 = r15
            goto L_0x041d
        L_0x0399:
            boolean r0 = MediaBrowserCompat$ItemReceiver((android.graphics.BitmapFactory.Options) r40)
            if (r0 == 0) goto L_0x03a7
            int r0 = r3.inTargetDensity
            float r0 = (float) r0
            int r8 = r3.inDensity
            float r8 = (float) r8
            float r21 = r0 / r8
        L_0x03a7:
            r0 = r21
            int r8 = r3.inSampleSize
            float r9 = (float) r12
            float r10 = (float) r8
            float r9 = r9 / r10
            r11 = r15
            double r14 = (double) r9
            double r13 = java.lang.Math.ceil(r14)
            int r9 = (int) r13
            float r13 = (float) r6
            float r13 = r13 / r10
            double r13 = (double) r13
            double r13 = java.lang.Math.ceil(r13)
            int r10 = (int) r13
            float r9 = (float) r9
            float r9 = r9 * r0
            int r9 = java.lang.Math.round(r9)
            float r10 = (float) r10
            float r10 = r10 * r0
            int r10 = java.lang.Math.round(r10)
            r13 = r11
            r11 = 2
            boolean r14 = android.util.Log.isLoggable(r13, r11)
            if (r14 == 0) goto L_0x041b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "Calculated target ["
            r11.append(r14)
            r11.append(r9)
            r11.append(r1)
            r11.append(r10)
            java.lang.String r14 = "] for source ["
            r11.append(r14)
            r11.append(r12)
            r11.append(r1)
            r11.append(r6)
            java.lang.String r14 = "], sampleSize: "
            r11.append(r14)
            r11.append(r8)
            java.lang.String r8 = ", targetDensity: "
            r11.append(r8)
            int r8 = r3.inTargetDensity
            r11.append(r8)
            r11.append(r5)
            int r8 = r3.inDensity
            r11.append(r8)
            java.lang.String r8 = ", density multiplier: "
            r11.append(r8)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            android.util.Log.v(r13, r0)
        L_0x041b:
            r0 = r9
            r9 = r10
        L_0x041d:
            if (r0 <= 0) goto L_0x043d
            if (r9 <= 0) goto L_0x043d
            o.CheckParameters_MembersInjector r8 = r7.MediaBrowserCompat$SearchResultReceiver
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            if (r10 < r11) goto L_0x0432
            android.graphics.Bitmap$Config r10 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.HARDWARE
            if (r10 == r11) goto L_0x043d
            android.graphics.Bitmap$Config r10 = r3.outConfig
            goto L_0x0433
        L_0x0432:
            r10 = 0
        L_0x0433:
            if (r10 != 0) goto L_0x0437
            android.graphics.Bitmap$Config r10 = r3.inPreferredConfig
        L_0x0437:
            android.graphics.Bitmap r0 = r8.MediaBrowserCompat$CustomActionResultReceiver(r0, r9, r10)
            r3.inBitmap = r0
        L_0x043d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 28
            if (r0 < r8) goto L_0x0466
            o.isResumed r0 = p040o.isResumed.DISPLAY_P3
            r8 = r43
            if (r8 != r0) goto L_0x0457
            android.graphics.ColorSpace r0 = r3.outColorSpace
            if (r0 == 0) goto L_0x0457
            android.graphics.ColorSpace r0 = r3.outColorSpace
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x0457
            r11 = 1
            goto L_0x0458
        L_0x0457:
            r11 = 0
        L_0x0458:
            if (r11 == 0) goto L_0x045d
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x045f
        L_0x045d:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x045f:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
            goto L_0x0474
        L_0x0466:
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r0 < r8) goto L_0x0474
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
        L_0x0474:
            o.CheckParameters_MembersInjector r0 = r7.MediaBrowserCompat$SearchResultReceiver
            r8 = r48
            android.graphics.Bitmap r0 = MediaBrowserCompat$CustomActionResultReceiver(r2, r3, r8, r0)
            o.CheckParameters_MembersInjector r2 = r7.MediaBrowserCompat$SearchResultReceiver
            r8.MediaBrowserCompat$CustomActionResultReceiver(r2, r0)
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r13, r2)
            if (r2 == 0) goto L_0x050f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "Decoded "
            r2.append(r8)
            java.lang.String r8 = MediaBrowserCompat$ItemReceiver((android.graphics.Bitmap) r0)
            r2.append(r8)
            java.lang.String r8 = " from ["
            r2.append(r8)
            r2.append(r12)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = "] "
            r2.append(r6)
            r6 = r22
            r2.append(r6)
            java.lang.String r6 = " with inBitmap "
            r2.append(r6)
            android.graphics.Bitmap r6 = r3.inBitmap
            java.lang.String r6 = MediaBrowserCompat$ItemReceiver((android.graphics.Bitmap) r6)
            r2.append(r6)
            java.lang.String r6 = " for ["
            r2.append(r6)
            r6 = r4
            r4 = r45
            r2.append(r4)
            r2.append(r1)
            r1 = r46
            r2.append(r1)
            java.lang.String r1 = "], sample size: "
            r2.append(r1)
            int r1 = r3.inSampleSize
            r2.append(r1)
            r2.append(r5)
            int r1 = r3.inDensity
            r2.append(r1)
            r2.append(r6)
            int r1 = r3.inTargetDensity
            r2.append(r1)
            java.lang.String r1 = ", thread: "
            r2.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r2.append(r1)
            java.lang.String r1 = ", duration: "
            r2.append(r1)
            double r3 = p040o.AudioAttributesCompatParcelizer.write(r16)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            android.util.Log.v(r13, r1)
        L_0x050f:
            if (r0 == 0) goto L_0x052c
            android.util.DisplayMetrics r1 = r7.f2613x50fd9e4a
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            o.CheckParameters_MembersInjector r1 = r7.MediaBrowserCompat$SearchResultReceiver
            r2 = r44
            android.graphics.Bitmap r13 = p040o.requestPermissionsFromFragment.MediaBrowserCompat$ItemReceiver(r1, r0, r2)
            boolean r1 = r0.equals(r13)
            if (r1 != 0) goto L_0x052d
            o.CheckParameters_MembersInjector r1 = r7.MediaBrowserCompat$SearchResultReceiver
            r1.write(r0)
            goto L_0x052d
        L_0x052c:
            r13 = 0
        L_0x052d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onMenuItemSelected.write(java.io.InputStream, android.graphics.BitmapFactory$Options, o.onCreatePanelMenu, o.isInBackStack, o.isResumed, boolean, int, int, boolean, o.onMenuItemSelected$IconCompatParcelizer):android.graphics.Bitmap");
    }

    private static int[] MediaBrowserCompat$ItemReceiver(InputStream inputStream, BitmapFactory.Options options, IconCompatParcelizer iconCompatParcelizer, CheckParameters_MembersInjector checkParameters_MembersInjector) throws IOException {
        options.inJustDecodeBounds = true;
        MediaBrowserCompat$CustomActionResultReceiver(inputStream, options, iconCompatParcelizer, checkParameters_MembersInjector);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap MediaBrowserCompat$CustomActionResultReceiver(java.io.InputStream r8, android.graphics.BitmapFactory.Options r9, p040o.onMenuItemSelected.IconCompatParcelizer r10, p040o.CheckParameters_MembersInjector r11) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r9.inJustDecodeBounds
            if (r1 == 0) goto L_0x000c
            r1 = 10485760(0xa00000, float:1.469368E-38)
            r8.mark(r1)
            goto L_0x000f
        L_0x000c:
            r10.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x000f:
            int r1 = r9.outWidth
            int r2 = r9.outHeight
            java.lang.String r3 = r9.outMimeType
            java.util.concurrent.locks.Lock r4 = p040o.requestPermissionsFromFragment.write()
            r4.lock()
            r4 = 0
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r8, r4, r9)     // Catch:{ IllegalArgumentException -> 0x0032 }
            java.util.concurrent.locks.Lock r11 = p040o.requestPermissionsFromFragment.write()
            r11.unlock()
            boolean r9 = r9.inJustDecodeBounds
            if (r9 == 0) goto L_0x002f
            r8.reset()
        L_0x002f:
            return r10
        L_0x0030:
            r8 = move-exception
            goto L_0x008f
        L_0x0032:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r6.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r7 = "Exception decoding bitmap, outWidth: "
            r6.append(r7)     // Catch:{ all -> 0x0030 }
            r6.append(r1)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = ", outHeight: "
            r6.append(r1)     // Catch:{ all -> 0x0030 }
            r6.append(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = ", outMimeType: "
            r6.append(r1)     // Catch:{ all -> 0x0030 }
            r6.append(r3)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = ", inBitmap: "
            r6.append(r1)     // Catch:{ all -> 0x0030 }
            android.graphics.Bitmap r1 = r9.inBitmap     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = MediaBrowserCompat$ItemReceiver((android.graphics.Bitmap) r1)     // Catch:{ all -> 0x0030 }
            r6.append(r1)     // Catch:{ all -> 0x0030 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0030 }
            r1.<init>(r2, r5)     // Catch:{ all -> 0x0030 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0073
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0030 }
        L_0x0073:
            android.graphics.Bitmap r0 = r9.inBitmap     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x008e
            r8.reset()     // Catch:{ IOException -> 0x008d }
            android.graphics.Bitmap r0 = r9.inBitmap     // Catch:{ IOException -> 0x008d }
            r11.write(r0)     // Catch:{ IOException -> 0x008d }
            r9.inBitmap = r4     // Catch:{ IOException -> 0x008d }
            android.graphics.Bitmap r8 = MediaBrowserCompat$CustomActionResultReceiver(r8, r9, r10, r11)     // Catch:{ IOException -> 0x008d }
            java.util.concurrent.locks.Lock r9 = p040o.requestPermissionsFromFragment.write()
            r9.unlock()
            return r8
        L_0x008d:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x008e:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x008f:
            java.util.concurrent.locks.Lock r9 = p040o.requestPermissionsFromFragment.write()
            r9.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onMenuItemSelected.MediaBrowserCompat$CustomActionResultReceiver(java.io.InputStream, android.graphics.BitmapFactory$Options, o.onMenuItemSelected$IconCompatParcelizer, o.CheckParameters_MembersInjector):android.graphics.Bitmap");
    }

    private static boolean MediaBrowserCompat$ItemReceiver(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static String MediaBrowserCompat$ItemReceiver(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(bitmap.getAllocationByteCount());
            sb.append(")");
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(bitmap.getWidth());
        sb2.append("x");
        sb2.append(bitmap.getHeight());
        sb2.append("] ");
        sb2.append(bitmap.getConfig());
        sb2.append(str);
        return sb2.toString();
    }

    private static BitmapFactory.Options write() {
        BitmapFactory.Options poll;
        synchronized (onMenuItemSelected.class) {
            synchronized (MediaBrowserCompat$MediaItem) {
                poll = MediaBrowserCompat$MediaItem.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                write(poll);
            }
        }
        return poll;
    }

    private static void write(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }
}

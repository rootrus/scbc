package p040o;

import android.content.Context;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import p040o.AppCompatSeekBar;
import p040o.CheckParameters;

/* renamed from: o.setColumnCount */
public final class setColumnCount implements isVisible<ByteBuffer, setUseDefaultMargins> {
    private static final setColumnCount$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver = new setColumnCount$MediaBrowserCompat$ItemReceiver();
    private static final setColumnCount$MediaBrowserCompat$CustomActionResultReceiver write = new setColumnCount$MediaBrowserCompat$CustomActionResultReceiver();
    private final Context IconCompatParcelizer;
    private final setColumnCount$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$MediaItem;
    private final List<ImageHeaderParser> read;

    public final /* synthetic */ boolean IconCompatParcelizer(Object obj, onActivityResult onactivityresult) throws IOException {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        noteStateNotSaved<Boolean> notestatenotsaved = Space.IconCompatParcelizer;
        if (((Boolean) (onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.containsKey(notestatenotsaved) ? onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.get(notestatenotsaved) : notestatenotsaved.read)).booleanValue()) {
            return false;
        }
        List<ImageHeaderParser> list = this.read;
        if (byteBuffer != null) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                imageType = list.get(i).IconCompatParcelizer(byteBuffer);
                if (imageType != ImageHeaderParser.ImageType.UNKNOWN) {
                    break;
                }
                i++;
            }
        }
        imageType = ImageHeaderParser.ImageType.UNKNOWN;
        if (imageType == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }

    public setColumnCount(Context context, List<ImageHeaderParser> list, CheckParameters_MembersInjector checkParameters_MembersInjector, CheckParameters.CheckCountry checkCountry) {
        this(context, list, checkParameters_MembersInjector, checkCountry, MediaBrowserCompat$ItemReceiver, write);
    }

    private setColumnCount(Context context, List<ImageHeaderParser> list, CheckParameters_MembersInjector checkParameters_MembersInjector, CheckParameters.CheckCountry checkCountry, setColumnCount$MediaBrowserCompat$ItemReceiver setcolumncount_mediabrowsercompat_itemreceiver, setColumnCount$MediaBrowserCompat$CustomActionResultReceiver setcolumncount_mediabrowsercompat_customactionresultreceiver) {
        this.IconCompatParcelizer = context.getApplicationContext();
        this.read = list;
        this.MediaBrowserCompat$MediaItem = new ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver(checkParameters_MembersInjector, checkCountry);
        this.MediaBrowserCompat$CustomActionResultReceiver = setcolumncount_mediabrowsercompat_itemreceiver;
    }

    /* access modifiers changed from: private */
    public setRowOrderPreserved MediaBrowserCompat$CustomActionResultReceiver(ByteBuffer byteBuffer, int i, int i2, onActivityResult onactivityresult) {
        AppCompatSeekBar.IconCompatParcelizer IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(byteBuffer);
        try {
            setRowOrderPreserved MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(byteBuffer, i, i2, IconCompatParcelizer2, onactivityresult);
            setColumnCount$MediaBrowserCompat$ItemReceiver setcolumncount_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            synchronized (setcolumncount_mediabrowsercompat_itemreceiver) {
                IconCompatParcelizer2.read = null;
                IconCompatParcelizer2.IconCompatParcelizer = null;
                setcolumncount_mediabrowsercompat_itemreceiver.write.offer(IconCompatParcelizer2);
            }
            return MediaBrowserCompat$ItemReceiver2;
        } catch (Throwable th) {
            setColumnCount$MediaBrowserCompat$ItemReceiver setcolumncount_mediabrowsercompat_itemreceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            synchronized (setcolumncount_mediabrowsercompat_itemreceiver2) {
                IconCompatParcelizer2.read = null;
                IconCompatParcelizer2.IconCompatParcelizer = null;
                setcolumncount_mediabrowsercompat_itemreceiver2.write.offer(IconCompatParcelizer2);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p040o.setRowOrderPreserved MediaBrowserCompat$ItemReceiver(java.nio.ByteBuffer r18, int r19, int r20, p040o.AppCompatSeekBar.IconCompatParcelizer r21, p040o.onActivityResult r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r7 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "x"
            java.lang.String r9 = "Decoded GIF from stream in "
            java.lang.String r10 = "BufferGifDecoder"
            long r11 = p040o.AudioAttributesCompatParcelizer.MediaBrowserCompat$ItemReceiver()
            r13 = 2
            java.nio.ByteBuffer r5 = r2.read     // Catch:{ all -> 0x01ec }
            if (r5 == 0) goto L_0x01e4
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01ec }
            int r5 = r5.MediaDescriptionCompat     // Catch:{ all -> 0x01ec }
            r8 = 1
            if (r5 == 0) goto L_0x0023
            r5 = r8
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            if (r5 == 0) goto L_0x002c
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r2 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01ec }
            r16 = r9
            goto L_0x00d4
        L_0x002c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ec }
            r5.<init>()     // Catch:{ all -> 0x01ec }
            r14 = 0
        L_0x0032:
            r15 = 6
            if (r14 >= r15) goto L_0x0040
            int r15 = r21.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x01ec }
            char r15 = (char) r15     // Catch:{ all -> 0x01ec }
            r5.append(r15)     // Catch:{ all -> 0x01ec }
            int r14 = r14 + 1
            goto L_0x0032
        L_0x0040:
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01ec }
            java.lang.String r14 = "GIF"
            boolean r5 = r5.startsWith(r14)     // Catch:{ all -> 0x01ec }
            if (r5 != 0) goto L_0x0053
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01ec }
            r5.MediaDescriptionCompat = r8     // Catch:{ all -> 0x01ec }
            r16 = r9
            goto L_0x00b9
        L_0x0053:
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01ec }
            java.nio.ByteBuffer r14 = r2.read     // Catch:{ all -> 0x01ec }
            short r14 = r14.getShort()     // Catch:{ all -> 0x01ec }
            r5.ParcelableVolumeInfo = r14     // Catch:{ all -> 0x01ec }
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01ec }
            java.nio.ByteBuffer r14 = r2.read     // Catch:{ all -> 0x01ec }
            short r14 = r14.getShort()     // Catch:{ all -> 0x01ec }
            r5.MediaMetadataCompat = r14     // Catch:{ all -> 0x01ec }
            int r5 = r21.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x01ec }
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r14 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01ec }
            r15 = r5 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x0073
            r15 = r8
            goto L_0x0074
        L_0x0073:
            r15 = 0
        L_0x0074:
            r14.RatingCompat = r15     // Catch:{ all -> 0x01ec }
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r14 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01ec }
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = r5 & 7
            int r5 = r5 + r8
            r16 = r9
            double r8 = (double) r5
            double r5 = java.lang.Math.pow(r6, r8)     // Catch:{ all -> 0x01e0 }
            int r5 = (int) r5     // Catch:{ all -> 0x01e0 }
            r14.MediaBrowserCompat$SearchResultReceiver = r5     // Catch:{ all -> 0x01e0 }
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01e0 }
            int r6 = r21.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x01e0 }
            r5.MediaBrowserCompat$ItemReceiver = r6     // Catch:{ all -> 0x01e0 }
            r21.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x01e0 }
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01e0 }
            boolean r5 = r5.RatingCompat     // Catch:{ all -> 0x01e0 }
            if (r5 == 0) goto L_0x00b9
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01e0 }
            int r5 = r5.MediaDescriptionCompat     // Catch:{ all -> 0x01e0 }
            if (r5 == 0) goto L_0x00a0
            r5 = 1
            goto L_0x00a1
        L_0x00a0:
            r5 = 0
        L_0x00a1:
            if (r5 != 0) goto L_0x00b9
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01e0 }
            int r6 = r5.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x01e0 }
            int[] r6 = r2.MediaBrowserCompat$CustomActionResultReceiver(r6)     // Catch:{ all -> 0x01e0 }
            r5.MediaBrowserCompat$MediaItem = r6     // Catch:{ all -> 0x01e0 }
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01e0 }
            int[] r6 = r5.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x01e0 }
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r7 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01e0 }
            int r7 = r7.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x01e0 }
            r6 = r6[r7]     // Catch:{ all -> 0x01e0 }
            r5.MediaBrowserCompat$CustomActionResultReceiver = r6     // Catch:{ all -> 0x01e0 }
        L_0x00b9:
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01e0 }
            int r5 = r5.MediaDescriptionCompat     // Catch:{ all -> 0x01e0 }
            if (r5 == 0) goto L_0x00c1
            r5 = 1
            goto L_0x00c2
        L_0x00c1:
            r5 = 0
        L_0x00c2:
            if (r5 != 0) goto L_0x00d2
            r21.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x01e0 }
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01e0 }
            int r5 = r5.IconCompatParcelizer     // Catch:{ all -> 0x01e0 }
            if (r5 >= 0) goto L_0x00d2
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01e0 }
            r6 = 1
            r5.MediaDescriptionCompat = r6     // Catch:{ all -> 0x01e0 }
        L_0x00d2:
            o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver r2 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01e0 }
        L_0x00d4:
            int r5 = r2.IconCompatParcelizer     // Catch:{ all -> 0x01e0 }
            r6 = 0
            if (r5 <= 0) goto L_0x01c1
            int r5 = r2.MediaDescriptionCompat     // Catch:{ all -> 0x01e0 }
            if (r5 == 0) goto L_0x00df
            goto L_0x01c1
        L_0x00df:
            o.noteStateNotSaved<o.isInBackStack> r5 = p040o.Space.write     // Catch:{ all -> 0x01e0 }
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r7 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x01e0 }
            boolean r7 = r7.containsKey(r5)     // Catch:{ all -> 0x01e0 }
            if (r7 == 0) goto L_0x00f0
            o.setTextAppearance<o.noteStateNotSaved<?>, java.lang.Object> r3 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x01e0 }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x01e0 }
            goto L_0x00f2
        L_0x00f0:
            T r3 = r5.read     // Catch:{ all -> 0x01e0 }
        L_0x00f2:
            o.isInBackStack r5 = p040o.isInBackStack.PREFER_RGB_565     // Catch:{ all -> 0x01e0 }
            if (r3 != r5) goto L_0x00f9
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x01e0 }
            goto L_0x00fb
        L_0x00f9:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01e0 }
        L_0x00fb:
            int r5 = r2.MediaMetadataCompat     // Catch:{ all -> 0x01e0 }
            r7 = r20
            int r5 = r5 / r7
            int r8 = r2.ParcelableVolumeInfo     // Catch:{ all -> 0x01e0 }
            int r8 = r8 / r0
            int r5 = java.lang.Math.min(r5, r8)     // Catch:{ all -> 0x01e0 }
            if (r5 != 0) goto L_0x010c
            r5 = 1
            r15 = 0
            goto L_0x0112
        L_0x010c:
            int r5 = java.lang.Integer.highestOneBit(r5)     // Catch:{ all -> 0x01e0 }
            r15 = r5
            r5 = 1
        L_0x0112:
            int r8 = java.lang.Math.max(r5, r15)     // Catch:{ all -> 0x01e0 }
            boolean r9 = android.util.Log.isLoggable(r10, r13)     // Catch:{ all -> 0x01e0 }
            if (r9 == 0) goto L_0x0157
            if (r8 <= r5) goto L_0x0157
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e0 }
            r5.<init>()     // Catch:{ all -> 0x01e0 }
            java.lang.String r9 = "Downsampling GIF, sampleSize: "
            r5.append(r9)     // Catch:{ all -> 0x01e0 }
            r5.append(r8)     // Catch:{ all -> 0x01e0 }
            java.lang.String r9 = ", target dimens: ["
            r5.append(r9)     // Catch:{ all -> 0x01e0 }
            r5.append(r0)     // Catch:{ all -> 0x01e0 }
            r5.append(r4)     // Catch:{ all -> 0x01e0 }
            r5.append(r7)     // Catch:{ all -> 0x01e0 }
            java.lang.String r9 = "], actual dimens: ["
            r5.append(r9)     // Catch:{ all -> 0x01e0 }
            int r9 = r2.ParcelableVolumeInfo     // Catch:{ all -> 0x01e0 }
            r5.append(r9)     // Catch:{ all -> 0x01e0 }
            r5.append(r4)     // Catch:{ all -> 0x01e0 }
            int r4 = r2.MediaMetadataCompat     // Catch:{ all -> 0x01e0 }
            r5.append(r4)     // Catch:{ all -> 0x01e0 }
            java.lang.String r4 = "]"
            r5.append(r4)     // Catch:{ all -> 0x01e0 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x01e0 }
            android.util.Log.v(r10, r4)     // Catch:{ all -> 0x01e0 }
        L_0x0157:
            o.ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver r4 = r1.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x01e0 }
            o.isMenuVisible r5 = new o.isMenuVisible     // Catch:{ all -> 0x01e0 }
            r9 = r18
            r5.<init>(r4, r2, r9, r8)     // Catch:{ all -> 0x01e0 }
            r5.write(r3)     // Catch:{ all -> 0x01e0 }
            r5.IconCompatParcelizer()     // Catch:{ all -> 0x01e0 }
            android.graphics.Bitmap r8 = r5.MediaDescriptionCompat()     // Catch:{ all -> 0x01e0 }
            if (r8 != 0) goto L_0x018b
            boolean r0 = android.util.Log.isLoggable(r10, r13)
            if (r0 == 0) goto L_0x018a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r9 = r16
            r0.append(r9)
            double r2 = p040o.AudioAttributesCompatParcelizer.write(r11)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r10, r0)
        L_0x018a:
            return r6
        L_0x018b:
            r9 = r16
            o.checkForValidRequestCode r6 = p040o.checkForValidRequestCode.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x01ec }
            o.setUseDefaultMargins r14 = new o.setUseDefaultMargins     // Catch:{ all -> 0x01ec }
            android.content.Context r3 = r1.IconCompatParcelizer     // Catch:{ all -> 0x01ec }
            r2 = r14
            r4 = r5
            r5 = r6
            r6 = r19
            r7 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01ec }
            o.setRowOrderPreserved r0 = new o.setRowOrderPreserved     // Catch:{ all -> 0x01ec }
            r0.<init>(r14)     // Catch:{ all -> 0x01ec }
            boolean r2 = android.util.Log.isLoggable(r10, r13)
            if (r2 == 0) goto L_0x01c0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            double r3 = p040o.AudioAttributesCompatParcelizer.write(r11)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r10, r2)
        L_0x01c0:
            return r0
        L_0x01c1:
            r9 = r16
            boolean r0 = android.util.Log.isLoggable(r10, r13)
            if (r0 == 0) goto L_0x01df
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            double r2 = p040o.AudioAttributesCompatParcelizer.write(r11)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r10, r0)
        L_0x01df:
            return r6
        L_0x01e0:
            r0 = move-exception
            r9 = r16
            goto L_0x01ed
        L_0x01e4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01ec }
            java.lang.String r2 = "You must call setData() before parseHeader()"
            r0.<init>(r2)     // Catch:{ all -> 0x01ec }
            throw r0     // Catch:{ all -> 0x01ec }
        L_0x01ec:
            r0 = move-exception
        L_0x01ed:
            boolean r2 = android.util.Log.isLoggable(r10, r13)
            if (r2 == 0) goto L_0x0209
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            double r3 = p040o.AudioAttributesCompatParcelizer.write(r11)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r10, r2)
        L_0x0209:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setColumnCount.MediaBrowserCompat$ItemReceiver(java.nio.ByteBuffer, int, int, o.AppCompatSeekBar$IconCompatParcelizer, o.onActivityResult):o.setRowOrderPreserved");
    }
}

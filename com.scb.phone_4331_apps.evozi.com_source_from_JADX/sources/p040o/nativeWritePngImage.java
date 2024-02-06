package p040o;

import p040o.C5082o;
import p040o.ImmutableSortedSet;
import p040o.Synchronized;

/* renamed from: o.nativeWritePngImage */
public class nativeWritePngImage extends C5082o.C5084a {
    /* access modifiers changed from: private */
    public final countIn IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final FaceDetectorV2Jni MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public setUuidFromUtf8Bytes MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final mapException read;

    @HmlPinActivity
    public nativeWritePngImage(AppMeasurementContentProvider appMeasurementContentProvider, FaceDetectorV2Jni faceDetectorV2Jni, countIn countin, mapException mapexception, RegularImmutableBiMap regularImmutableBiMap, Synchronized.SynchronizedSetMultimap synchronizedSetMultimap, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        super(appMeasurementContentProvider, countin, mapexception, regularImmutableBiMap, synchronizedSetMultimap, str);
        this.MediaBrowserCompat$ItemReceiver = faceDetectorV2Jni;
        this.read = mapexception;
        this.IconCompatParcelizer = countin;
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        ImmutableSortedSet.Builder builder;
        if (!this.MediaBrowserCompat$MediaItem) {
            boolean z = true;
            this.MediaBrowserCompat$MediaItem = true;
            GlobalThresholdShader globalThresholdShader = GlobalThresholdShader.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                globalThresholdShader.IconCompatParcelizer(this.RatingCompat);
            }
            this.MediaBrowserCompat$SearchResultReceiver = setuuidfromutf8bytes;
            putInstance IconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.read.IconCompatParcelizer();
            userNavigationEnabled read2 = this.MediaBrowserCompat$ItemReceiver.read.read();
            if (IconCompatParcelizer2 == null || read2 == null) {
                builder = ImmutableSortedSet.Builder.MediaBrowserCompat$ItemReceiver();
            } else {
                builder = ImmutableSortedSet.Builder.MediaBrowserCompat$ItemReceiver();
                builder.read = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver;
                builder.write = IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver;
                builder.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.IconCompatParcelizer;
                builder.MediaBrowserCompat$CustomActionResultReceiver = read2.PlaybackStateCompat;
                String str = read2.setHasDecor;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                builder.MediaBrowserCompat$SearchResultReceiver = str;
                String str3 = read2.Keep;
                if (str3 == null) {
                    str3 = str2;
                }
                builder.MediaBrowserCompat$MediaItem = str3;
                String str4 = read2.AppCompatActivity;
                if (str4 == null) {
                    str4 = str2;
                }
                builder.MediaDescriptionCompat = str4;
                String str5 = read2.AppCompatDialogFragment;
                if (str5 == null) {
                    str5 = str2;
                }
                builder.RatingCompat = str5;
                String str6 = read2.setContentView;
                if (str6 != null) {
                    str2 = str6;
                }
                builder.f2726x50fd9e4a = str2;
                builder.MediaMetadataCompat = IconCompatParcelizer2.MediaSessionCompat$ResultReceiverWrapper;
                builder.IconCompatParcelizer = IconCompatParcelizer2.MediaBrowserCompat$SearchResultReceiver;
                builder.MediaSessionCompat$QueueItem = read2.setChecked;
            }
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(builder);
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C10077x68f725e7(this, (byte) 0));
        }
    }
}

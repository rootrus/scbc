package p040o;

import android.text.TextUtils;
import java.util.regex.Pattern;
import p040o.CameraSource;
import p040o.CustomConcurrentHashMap;
import p040o.PhenotypeFlag;
import p040o.setNextExpirable;

/* renamed from: o.IGlareDetector */
public class IGlareDetector extends ICheckDetector<C6392xfcabe75c> {
    @HmlPinActivity
    public IGlareDetector(RegularImmutableBiMap regularImmutableBiMap, CameraSource.ShutterCallback shutterCallback, getStartFinalizer getstartfinalizer, PhenotypeFlag.zza zza) {
        super(regularImmutableBiMap, shutterCallback, getstartfinalizer, zza);
    }

    public final void write(String str) {
        boolean z = true;
        if (MediaBrowserCompat$CustomActionResultReceiver(str)) {
            GpuDetectionModule_GetForcedDocumentDetectorFactory gpuDetectionModule_GetForcedDocumentDetectorFactory = GpuDetectionModule_GetForcedDocumentDetectorFactory.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                gpuDetectionModule_GetForcedDocumentDetectorFactory.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (TextUtils.isEmpty(str)) {
            GpuDetectionModule_GetIGPUImageHolderFactory gpuDetectionModule_GetIGPUImageHolderFactory = GpuDetectionModule_GetIGPUImageHolderFactory.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                gpuDetectionModule_GetIGPUImageHolderFactory.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            setSearchSymbology setsearchsymbology = setSearchSymbology.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setsearchsymbology.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer(String str, String str2, String str3, String str4) {
        boolean z = true;
        if (write()) {
            String read = removeIfFromRandomAccessList.read(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str).doubleValue());
            String str5 = this.write;
            setNextExpirable.write write = new setNextExpirable.write();
            write.MediaBrowserCompat$ItemReceiver = read;
            write.read = str2;
            write.MediaDescriptionCompat = str5;
            write.RatingCompat = str3;
            write.MediaBrowserCompat$SearchResultReceiver = str4;
            write.ParcelableVolumeInfo = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
            write(new setNextExpirable(write, (byte) 0), true);
            return;
        }
        newForcedIsgDocumentDetector newforcedisgdocumentdetector = newForcedIsgDocumentDetector.write;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            newforcedisgdocumentdetector.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, String str4) {
        String read = removeIfFromRandomAccessList.read(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str).doubleValue());
        String str5 = this.write;
        setNextExpirable.write write = new setNextExpirable.write();
        write.MediaBrowserCompat$ItemReceiver = read;
        write.read = str2;
        write.MediaDescriptionCompat = str5;
        write.RatingCompat = str3;
        write.MediaBrowserCompat$SearchResultReceiver = str4;
        write.ParcelableVolumeInfo = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
        write.f2952x50fd9e4a = this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat;
        write.MediaBrowserCompat$CustomActionResultReceiver = new CustomConcurrentHashMap.EntryFactory.C32902(new CustomConcurrentHashMap.EntryFactory.C32902.write(), (byte) 0);
        write(new setNextExpirable(write, (byte) 0), false);
    }

    /* access modifiers changed from: protected */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return !TextUtils.isEmpty(str) && Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(str).matches();
    }
}

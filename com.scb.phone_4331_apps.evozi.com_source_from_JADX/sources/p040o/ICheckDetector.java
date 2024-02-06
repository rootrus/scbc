package p040o;

import p040o.CameraSource;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CheckExtractActivity_MembersInjector.ParcelableVolumeInfo;
import p040o.CrashlyticsBackgroundWorker;
import p040o.PhenotypeFlag;

/* renamed from: o.ICheckDetector */
public abstract class ICheckDetector<T extends CheckExtractActivity_MembersInjector.ParcelableVolumeInfo> extends writeUInt64NoTag<T> {
    public CameraSource.ShutterCallback IconCompatParcelizer;
    protected CrashlyticsBackgroundWorker.C32131 MediaBrowserCompat$ItemReceiver;
    public final getStartFinalizer MediaDescriptionCompat;
    public PhenotypeFlag.zza MediaMetadataCompat;
    public boolean read;
    public String write;

    /* access modifiers changed from: protected */
    public abstract boolean MediaBrowserCompat$CustomActionResultReceiver(String str);

    public abstract void write(String str);

    ICheckDetector(RegularImmutableBiMap regularImmutableBiMap, CameraSource.ShutterCallback shutterCallback, getStartFinalizer getstartfinalizer, PhenotypeFlag.zza zza) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = shutterCallback;
        this.MediaDescriptionCompat = getstartfinalizer;
        this.MediaMetadataCompat = zza;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsBackgroundWorker.C32131 r2) {
        this.MediaBrowserCompat$ItemReceiver = r2;
        C4183channels channels = new C4183channels(this, r2);
        if (this.RatingCompat != null) {
            channels.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final boolean IconCompatParcelizer(double d) {
        return d >= this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.doubleValue();
    }

    /* access modifiers changed from: package-private */
    public final void write(setNextExpirable setnextexpirable, boolean z) {
        height height = height.MediaBrowserCompat$ItemReceiver;
        if (this.RatingCompat != null) {
            height.IconCompatParcelizer(this.RatingCompat);
        }
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setnextexpirable, z);
        this.IconCompatParcelizer.IconCompatParcelizer(new ICheckDetector$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
    }

    /* access modifiers changed from: protected */
    public final boolean write() {
        return this.MediaDescriptionCompat.write.read() != null;
    }
}

package p040o;

import p040o.CrashlyticsReport;
import p040o.ImagePerfectionProfile;
import p040o.StreetViewPanoramaFragment;
import p040o.access$2300;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.ImagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver */
final class C3478xeef7f070 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<StreetViewPanoramaFragment.zza> {
    final /* synthetic */ ImagePerfectionProfile.UseMRZPassportDetection MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.ImagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.MediaMetadataCompat> {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth.MediaMetadataCompat) obj).IconCompatParcelizer();
        }
    }

    public C3478xeef7f070(ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection) {
        this.MediaBrowserCompat$ItemReceiver = useMRZPassportDetection;
    }

    public final /* synthetic */ void onNext(Object obj) {
        StreetViewPanoramaFragment.zza zza = (StreetViewPanoramaFragment.zza) obj;
        onGetStartedClick.write((Object) zza, "billPaymentBillerList");
        this.MediaBrowserCompat$ItemReceiver.read = zza;
        boolean z = true;
        if (!(this.MediaBrowserCompat$ItemReceiver.RatingCompat != null)) {
            return;
        }
        if (ImagePerfectionProfile.UseMRZPassportDetection.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver) != null) {
            CrashlyticsReport.Session.Event.Application.Execution write = this.MediaBrowserCompat$ItemReceiver.write.write(zza.write, ImagePerfectionProfile.UseMRZPassportDetection.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver), this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.setCheckable());
            if (write != null) {
                ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.MediaBrowserCompat$ItemReceiver;
                writeUInt64NoTag.IconCompatParcelizer imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver = new C3479x4ee85cfd(write);
                if (useMRZPassportDetection.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(useMRZPassportDetection.RatingCompat);
                    return;
                }
                return;
            }
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.biller_not_found, access$2300.write.NAVIGATE_BACK);
            return;
        }
        ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection2 = this.MediaBrowserCompat$ItemReceiver;
        useMRZPassportDetection2.ParcelableVolumeInfo = useMRZPassportDetection2.write.MediaBrowserCompat$ItemReceiver(zza.write, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.setCheckable());
        ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection3 = this.MediaBrowserCompat$ItemReceiver;
        useMRZPassportDetection3.f2722x50fd9e4a = ImagePerfectionProfile.UseMRZPassportDetection.MediaMetadataCompat(useMRZPassportDetection3);
        ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection4 = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$ItemReceiver = new C3480xa20aea8c(this);
        if (useMRZPassportDetection4.RatingCompat == null) {
            z = false;
        }
        if (z) {
            imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(useMRZPassportDetection4.RatingCompat);
        }
    }

    public final void onComplete() {
        ImagePerfectionProfile.UseMRZPassportDetection.RatingCompat(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        boolean z = true;
        if ((this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) && !this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            ImagePerfectionProfile.UseMRZPassportDetection.RatingCompat(this.MediaBrowserCompat$ItemReceiver);
            ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.IconCompatParcelizer;
            if (useMRZPassportDetection.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(useMRZPassportDetection.RatingCompat);
            }
        }
    }
}

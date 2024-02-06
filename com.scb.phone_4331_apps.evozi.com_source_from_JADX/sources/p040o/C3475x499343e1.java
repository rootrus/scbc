package p040o;

import p040o.CrashlyticsReport;
import p040o.ImagePerfectionProfile;
import p040o.access$2300;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.ImagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver */
final class C3475x499343e1 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getUserNavigationEnabled> {
    private final boolean IconCompatParcelizer;
    final /* synthetic */ ImagePerfectionProfile.UseMRZPassportDetection write;

    /* renamed from: o.ImagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.MediaMetadataCompat> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth.MediaMetadataCompat) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.ImagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.MediaMetadataCompat> {
        private /* synthetic */ C3475x499343e1 write;

        read(C3475x499343e1 imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver) {
            this.write = imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getTopLeftCornerWidth.MediaMetadataCompat mediaMetadataCompat = (getTopLeftCornerWidth.MediaMetadataCompat) obj;
            mediaMetadataCompat.IconCompatParcelizer(ImagePerfectionProfile.UseMRZPassportDetection.MediaBrowserCompat$CustomActionResultReceiver(this.write.write.ParcelableVolumeInfo));
            mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
            mediaMetadataCompat.write();
        }
    }

    /* renamed from: o.ImagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.MediaMetadataCompat> {
        private /* synthetic */ C3475x499343e1 write;

        write(C3475x499343e1 imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver) {
            this.write = imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth.MediaMetadataCompat) obj).MediaBrowserCompat$CustomActionResultReceiver(ImagePerfectionProfile.UseMRZPassportDetection.MediaBrowserCompat$CustomActionResultReceiver(this.write.write.ParcelableVolumeInfo));
        }
    }

    public C3475x499343e1(ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection, boolean z) {
        this.write = useMRZPassportDetection;
        this.IconCompatParcelizer = z;
    }

    public final /* synthetic */ void onNext(Object obj) {
        getUserNavigationEnabled getusernavigationenabled = (getUserNavigationEnabled) obj;
        onGetStartedClick.write((Object) getusernavigationenabled, "billPaymentBillerSearchList");
        ImagePerfectionProfile.UseMRZPassportDetection.RatingCompat(this.write);
        ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.write;
        useMRZPassportDetection.read = useMRZPassportDetection.read;
        boolean z = true;
        if (this.write.RatingCompat != null) {
            if (ImagePerfectionProfile.UseMRZPassportDetection.MediaBrowserCompat$ItemReceiver(this.write) != null) {
                CrashlyticsReport.Session.Event.Application.Execution write2 = this.write.write.write(getusernavigationenabled.read, ImagePerfectionProfile.UseMRZPassportDetection.MediaBrowserCompat$ItemReceiver(this.write), this.write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.setCheckable());
                if (write2 != null) {
                    ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection2 = this.write;
                    writeUInt64NoTag.IconCompatParcelizer imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver = new C3476xc79552ae(write2);
                    if (useMRZPassportDetection2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(useMRZPassportDetection2.RatingCompat);
                    }
                } else {
                    this.write.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.biller_not_found, access$2300.write.NAVIGATE_BACK);
                }
            } else {
                this.write.IconCompatParcelizer = getusernavigationenabled.IconCompatParcelizer;
                if (getusernavigationenabled.read.isEmpty() && this.IconCompatParcelizer) {
                    ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection3 = this.write;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.read;
                    if (useMRZPassportDetection3.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        iconCompatParcelizer.IconCompatParcelizer(useMRZPassportDetection3.RatingCompat);
                    }
                } else if (!getusernavigationenabled.read.isEmpty() && this.IconCompatParcelizer) {
                    ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection4 = this.write;
                    useMRZPassportDetection4.ParcelableVolumeInfo = useMRZPassportDetection4.write.MediaBrowserCompat$ItemReceiver(getusernavigationenabled.read, this.write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.setCheckable());
                    ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection5 = this.write;
                    writeUInt64NoTag.IconCompatParcelizer read2 = new read(this);
                    if (useMRZPassportDetection5.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        read2.IconCompatParcelizer(useMRZPassportDetection5.RatingCompat);
                    }
                } else if (!getusernavigationenabled.read.isEmpty() && !this.IconCompatParcelizer) {
                    ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection6 = this.write;
                    useMRZPassportDetection6.ParcelableVolumeInfo = useMRZPassportDetection6.write.MediaBrowserCompat$ItemReceiver(getusernavigationenabled.read, this.write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.setCheckable());
                    ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection7 = this.write;
                    writeUInt64NoTag.IconCompatParcelizer write3 = new write(this);
                    if (useMRZPassportDetection7.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        write3.IconCompatParcelizer(useMRZPassportDetection7.RatingCompat);
                    }
                }
            }
            this.write.MediaMetadataCompat = false;
            ImagePerfectionProfile.UseMRZPassportDetection.RatingCompat(this.write);
        }
    }

    public final void onComplete() {
        ImagePerfectionProfile.UseMRZPassportDetection.RatingCompat(this.write);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        boolean z = false;
        this.write.MediaMetadataCompat = false;
        if ((this.write.RatingCompat != null) && !this.write.MediaBrowserCompat$SearchResultReceiver(th)) {
            ImagePerfectionProfile.UseMRZPassportDetection.RatingCompat(this.write);
            ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.write;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C3477x4ed439fd.write;
            if (useMRZPassportDetection.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(useMRZPassportDetection.RatingCompat);
            }
        }
    }
}

package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.C1160x44733d2;
import p040o.CameraSource;
import p040o.access$2300;

/* renamed from: o.setImageID */
public class setImageID extends writeUInt64NoTag<C1160x44733d2.IconCompatParcelizer> {
    /* access modifiers changed from: private */
    public final compound IconCompatParcelizer;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public nextEntry MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public String MediaMetadataCompat;
    public final CameraSource.zzd read;
    public final detectorIsOperational write;

    @HmlPinActivity
    public setImageID(RegularImmutableBiMap regularImmutableBiMap, detectorIsOperational detectorisoperational, compound compound, CameraSource.zzd zzd) {
        super(regularImmutableBiMap);
        this.write = detectorisoperational;
        this.IconCompatParcelizer = compound;
        this.read = zzd;
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(C1160x44733d2.IconCompatParcelizer iconCompatParcelizer) {
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        iconCompatParcelizer.read();
    }

    static /* synthetic */ void read(C1160x44733d2.IconCompatParcelizer iconCompatParcelizer) {
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        iconCompatParcelizer.IconCompatParcelizer(true);
    }

    static String IconCompatParcelizer(String str) {
        return str.replaceAll(",", "");
    }

    /* renamed from: o.setImageID$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<nextEntry> {
        private read() {
        }

        public /* synthetic */ read(setImageID setimageid, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            nextEntry nextentry = (nextEntry) obj;
            setImageID.read(setImageID.this);
            nextEntry unused = setImageID.this.MediaDescriptionCompat = nextentry;
            String unused2 = setImageID.this.MediaBrowserCompat$ItemReceiver = nextentry.write;
            boolean z = false;
            if (DiskLruCache.VERSION_1.equals(nextentry.MediaBrowserCompat$ItemReceiver)) {
                String unused3 = setImageID.this.MediaMetadataCompat = nextentry.MediaBrowserCompat$CustomActionResultReceiver;
                setImageID setimageid = setImageID.this;
                getImageBitmapWidth getimagebitmapwidth = new getImageBitmapWidth(nextentry);
                if (setimageid.RatingCompat != null) {
                    getimagebitmapwidth.IconCompatParcelizer(setimageid.RatingCompat);
                }
            }
            String str = nextentry.IconCompatParcelizer;
            if (!(str == null || str.length() == 0)) {
                setImageID setimageid2 = setImageID.this;
                getImageFileBuffer getimagefilebuffer = new getImageFileBuffer(nextentry);
                if (setimageid2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getimagefilebuffer.IconCompatParcelizer(setimageid2.RatingCompat);
                }
                setImageID.this.MediaBrowserCompat$ItemReceiver(nextentry.IconCompatParcelizer, nextentry.read);
            }
        }

        public final void onError(Throwable th) {
            setImageID.this.MediaBrowserCompat$ItemReceiver(setImageID.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    static /* synthetic */ void read(setImageID setimageid) {
        if (setimageid.RatingCompat != null) {
            setimageid.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        boolean z = true;
        boolean z2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str).doubleValue() >= getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver).doubleValue();
        if ((str == null || str.length() == 0) || z2) {
            imageReadFromFile imagereadfromfile = imageReadFromFile.read;
            if (this.RatingCompat != null) {
                imagereadfromfile.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            getImageCreateDateTime getimagecreatedatetime = getImageCreateDateTime.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat != null) {
                getimagecreatedatetime.IconCompatParcelizer(this.RatingCompat);
            }
        }
        if (DiskLruCache.VERSION_1.equals(this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver)) {
            boolean z3 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str2).doubleValue() >= getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat).doubleValue();
            boolean z4 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str2).doubleValue() > getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str).doubleValue();
            getImageMetaData getimagemetadata = getImageMetaData.write;
            if (this.RatingCompat != null) {
                getimagemetadata.IconCompatParcelizer(this.RatingCompat);
            }
            if (str2 == null || str2.length() == 0) {
                return;
            }
            if (z4) {
                getImageClassifyResults getimageclassifyresults = getImageClassifyResults.MediaBrowserCompat$ItemReceiver;
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getimageclassifyresults.IconCompatParcelizer(this.RatingCompat);
                }
            } else if (!z3) {
                getImageFileHeight getimagefileheight = getImageFileHeight.read;
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getimagefileheight.IconCompatParcelizer(this.RatingCompat);
                }
            } else {
                getImageLatitude getimagelatitude = getImageLatitude.read;
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getimagelatitude.IconCompatParcelizer(this.RatingCompat);
                }
            }
        } else {
            getImageFileWidth getimagefilewidth = new getImageFileWidth(z2);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getimagefilewidth.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }
}

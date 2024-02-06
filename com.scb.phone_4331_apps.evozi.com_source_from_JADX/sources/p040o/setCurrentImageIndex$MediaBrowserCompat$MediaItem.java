package p040o;

import kotlin.NoWhenBranchMatchedException;
import p040o.setCurrentImageIndex;
import p040o.writeUInt64NoTag;
import p040o.zzct;
import p040o.zzcz;

/* renamed from: o.setCurrentImageIndex$MediaBrowserCompat$MediaItem */
public final class setCurrentImageIndex$MediaBrowserCompat$MediaItem extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzcz.zzf.zza> {
    final /* synthetic */ setCurrentImageIndex IconCompatParcelizer;

    /* renamed from: o.setCurrentImageIndex$MediaBrowserCompat$MediaItem$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ setCurrentImageIndex$MediaBrowserCompat$MediaItem MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ zzcz.zzf.zza write;

        write(setCurrentImageIndex$MediaBrowserCompat$MediaItem setcurrentimageindex_mediabrowsercompat_mediaitem, zzcz.zzf.zza zza) {
            this.MediaBrowserCompat$CustomActionResultReceiver = setcurrentimageindex_mediabrowsercompat_mediaitem;
            this.write = zza;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ExtractionParameters extractionParameters = (ExtractionParameters) obj;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.write.read.MediaBrowserCompat$SearchResultReceiver() == zzct.zza.BUSINESS_OWNER ? "business_owner" : "consumer";
            onGetStartedClick.IconCompatParcelizer((Object) str, "Utilities.getCustomerTyp…peCase.getCustomerType())");
            extractionParameters.read(str, this.write.IconCompatParcelizer, this.write.MediaBrowserCompat$ItemReceiver);
        }
    }

    public setCurrentImageIndex$MediaBrowserCompat$MediaItem(setCurrentImageIndex setcurrentimageindex) {
        this.IconCompatParcelizer = setcurrentimageindex;
    }

    public final /* synthetic */ void onNext(Object obj) {
        setCurrentImageIndex.IconCompatParcelizer iconCompatParcelizer;
        setCurrentImageIndex.write write2;
        zzcz.zzf.zza zza = (zzcz.zzf.zza) obj;
        onGetStartedClick.write((Object) zza, "prerequisites");
        setCurrentImageIndex setcurrentimageindex = this.IconCompatParcelizer;
        onGetStartedClick.write((Object) zza, "<set-?>");
        setcurrentimageindex.IconCompatParcelizer = zza;
        setCurrentImageIndex setcurrentimageindex2 = this.IconCompatParcelizer;
        boolean z = true;
        if (zza.IconCompatParcelizer) {
            int i = removeImage.MediaBrowserCompat$ItemReceiver[zza.MediaBrowserCompat$ItemReceiver.ordinal()];
            if (i == 1) {
                iconCompatParcelizer = setCurrentImageIndex.IconCompatParcelizer.ADD_VERIFIED;
            } else if (i == 2) {
                iconCompatParcelizer = setCurrentImageIndex.IconCompatParcelizer.OPEN_VERIFIED;
            } else if (i == 3) {
                iconCompatParcelizer = setCurrentImageIndex.IconCompatParcelizer.NO_VALUE_VERIFIED;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            iconCompatParcelizer = setCurrentImageIndex.IconCompatParcelizer.NO_VERIFIED;
        }
        setcurrentimageindex2.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer read = new setCurrentImageIndex.read(setcurrentimageindex2);
        if (setcurrentimageindex2.RatingCompat != null) {
            read.IconCompatParcelizer(setcurrentimageindex2.RatingCompat);
        }
        setCurrentImageIndex setcurrentimageindex3 = this.IconCompatParcelizer;
        if (setcurrentimageindex3.read()) {
            int i2 = removeImage.MediaBrowserCompat$CustomActionResultReceiver[zza.MediaBrowserCompat$ItemReceiver.ordinal()];
            if (i2 == 1) {
                write2 = setCurrentImageIndex.write.SETUP_LOAN;
            } else if (i2 == 2) {
                write2 = setCurrentImageIndex.write.OPEN_ACCOUNT;
            } else if (i2 == 3) {
                write2 = setCurrentImageIndex.write.ADD_ACCOUNT;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            write2 = setCurrentImageIndex.write.VERIFY_EMAIL;
        }
        writeUInt64NoTag.IconCompatParcelizer setcurrentimageindex_mediabrowsercompat_itemreceiver = new setCurrentImageIndex$MediaBrowserCompat$ItemReceiver(write2);
        if (setcurrentimageindex3.RatingCompat != null) {
            setcurrentimageindex_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setcurrentimageindex3.RatingCompat);
        }
        setCurrentImageIndex setcurrentimageindex4 = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer write3 = new write(this, zza);
        if (setcurrentimageindex4.RatingCompat != null) {
            write3.IconCompatParcelizer(setcurrentimageindex4.RatingCompat);
        }
        setCurrentImageIndex setcurrentimageindex5 = this.IconCompatParcelizer;
        if (setcurrentimageindex5.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setcurrentimageindex5.RatingCompat.aj_();
        }
    }

    /* renamed from: o.setCurrentImageIndex$MediaBrowserCompat$MediaItem$IconCompatParcelizer */
    static final class IconCompatParcelizer implements Runnable {
        private /* synthetic */ setCurrentImageIndex$MediaBrowserCompat$MediaItem read;

        IconCompatParcelizer(setCurrentImageIndex$MediaBrowserCompat$MediaItem setcurrentimageindex_mediabrowsercompat_mediaitem) {
            this.read = setcurrentimageindex_mediabrowsercompat_mediaitem;
        }

        public final void run() {
            setCurrentImageIndex setcurrentimageindex = this.read.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C52871.write;
            if (setcurrentimageindex.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(setcurrentimageindex.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        setCurrentImageIndex setcurrentimageindex = this.IconCompatParcelizer;
        setcurrentimageindex.MediaBrowserCompat$ItemReceiver(setcurrentimageindex.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new IconCompatParcelizer(this)));
    }
}

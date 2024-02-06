package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.StandardRowSortedTable;
import p040o.access$2300;

/* renamed from: o.setImageResolution */
public class setImageResolution extends writeUInt64NoTag<C1355x8de47d61> {
    public final getTileUrl MediaBrowserCompat$ItemReceiver;
    private final StandardRowSortedTable.C38171 write;

    @HmlPinActivity
    public setImageResolution(RegularImmutableBiMap regularImmutableBiMap, getTileUrl gettileurl, StandardRowSortedTable.C38171 r3) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = gettileurl;
        this.write = r3;
    }

    static /* synthetic */ void IconCompatParcelizer(getInstallerPackageName getinstallerpackagename, C1355x8de47d61 injectrtticheckdeserializer_mediabrowsercompat_searchresultreceiver) {
        injectrtticheckdeserializer_mediabrowsercompat_searchresultreceiver.aj_();
        injectrtticheckdeserializer_mediabrowsercompat_searchresultreceiver.read(getinstallerpackagename);
    }

    public static /* synthetic */ void IconCompatParcelizer(setImageResolution setimageresolution, LocationSettingsResponse locationSettingsResponse) {
        getInstallerPackageName getinstallerpackagename;
        String str;
        StandardRowSortedTable.C38171 r0 = setimageresolution.write;
        boolean z = true;
        if (locationSettingsResponse == null) {
            getinstallerpackagename = null;
        } else {
            getInstallerPackageName getinstallerpackagename2 = new getInstallerPackageName();
            if (locationSettingsResponse.MediaBrowserCompat$MediaItem == null) {
                str = "";
            } else {
                str = r0.IconCompatParcelizer("dd MMM yyyy - HH:mm", locationSettingsResponse.MediaBrowserCompat$MediaItem);
            }
            getinstallerpackagename2.MediaDescriptionCompat = str;
            getinstallerpackagename2.MediaMetadataCompat = locationSettingsResponse.write;
            getinstallerpackagename2.MediaBrowserCompat$SearchResultReceiver = locationSettingsResponse.read;
            getinstallerpackagename2.RatingCompat = getICheckDeserializerRtti.MediaDescriptionCompat(getinstallerpackagename2.MediaBrowserCompat$SearchResultReceiver);
            getinstallerpackagename2.read = locationSettingsResponse.IconCompatParcelizer;
            getinstallerpackagename2.IconCompatParcelizer = locationSettingsResponse.MediaBrowserCompat$CustomActionResultReceiver;
            getinstallerpackagename2.MediaBrowserCompat$CustomActionResultReceiver = locationSettingsResponse.MediaBrowserCompat$ItemReceiver;
            getinstallerpackagename2.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(getinstallerpackagename2.IconCompatParcelizer, true);
            getinstallerpackagename = getinstallerpackagename2;
        }
        forceTakePicture forcetakepicture = new forceTakePicture(getinstallerpackagename);
        if (setimageresolution.RatingCompat == null) {
            z = false;
        }
        if (z) {
            forcetakepicture.IconCompatParcelizer(setimageresolution.RatingCompat);
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(setImageResolution setimageresolution, Throwable th) {
        boolean z = false;
        if (setimageresolution.RatingCompat != null) {
            setimageresolution.RatingCompat.aj_();
        }
        if (writeUInt64NoTag.MediaBrowserCompat$CustomActionResultReceiver(th)) {
            getAllowableImageResolutions getallowableimageresolutions = new getAllowableImageResolutions(setimageresolution, th);
            if (setimageresolution.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getallowableimageresolutions.IconCompatParcelizer(setimageresolution.RatingCompat);
            }
        } else if (writeUInt64NoTag.read(th)) {
            setimageresolution.MediaBrowserCompat$ItemReceiver(setimageresolution.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
        } else if (th instanceof RetrofitException) {
            ILocationSourceDelegate.zza zza = ((RetrofitException) th).IconCompatParcelizer.write;
            String str = zza.IconCompatParcelizer;
            char c = 65535;
            switch (str.hashCode()) {
                case 1507523:
                    if (str.equals("1037")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1507524:
                    if (str.equals("1038")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0 || c == 1) {
                addLevelnessListener addlevelnesslistener = new addLevelnessListener(zza);
                if (setimageresolution.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    addlevelnesslistener.IconCompatParcelizer(setimageresolution.RatingCompat);
                    return;
                }
                return;
            }
            addCameraInitializationListener addcamerainitializationlistener = new addCameraInitializationListener(setimageresolution, th);
            if (setimageresolution.RatingCompat != null) {
                z = true;
            }
            if (z) {
                addcamerainitializationlistener.IconCompatParcelizer(setimageresolution.RatingCompat);
            }
        } else {
            forceTakePictureForCaptureExperience forcetakepictureforcaptureexperience = new forceTakePictureForCaptureExperience(setimageresolution, th);
            if (setimageresolution.RatingCompat != null) {
                z = true;
            }
            if (z) {
                forcetakepictureforcaptureexperience.IconCompatParcelizer(setimageresolution.RatingCompat);
            }
        }
    }
}

package p040o;

import p040o.ImageProcessor;
import p040o.zzbt;

/* renamed from: o.ImageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver */
class C3490x49eb2967 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzbt.zze.zza> {
    final /* synthetic */ ImageProcessor.ProcessProgressEvent write;

    private C3490x49eb2967(ImageProcessor.ProcessProgressEvent processProgressEvent) {
        this.write = processProgressEvent;
    }

    /* synthetic */ C3490x49eb2967(ImageProcessor.ProcessProgressEvent processProgressEvent, byte b) {
        this(processProgressEvent);
    }

    public final /* synthetic */ void onNext(Object obj) {
        String str;
        String str2;
        String str3;
        AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute;
        zzbt.zze.zza zza = (zzbt.zze.zza) obj;
        zzbt.zze.zza unused = this.write.MediaBrowserCompat$SearchResultReceiver = zza;
        ImageProcessor.ProcessProgressEvent processProgressEvent = this.write;
        String str4 = "";
        if (zza.MediaDescriptionCompat != null) {
            str = zza.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
        } else {
            str = str4;
        }
        ImageProcessor.ProcessProgressEvent.write(processProgressEvent, str);
        String unused2 = this.write.write = zza.write;
        ImageProcessor.ProcessProgressEvent.write(this.write);
        toArrayImpl unused3 = this.write.Keep;
        C5240x2a802996 MediaBrowserCompat$ItemReceiver = retrieveSettingsData.MediaBrowserCompat$ItemReceiver();
        if (zza.IconCompatParcelizer != null) {
            str2 = zza.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        } else {
            str2 = str4;
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = str2;
        if (zza.IconCompatParcelizer != null) {
            str3 = zza.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str3 = str4;
        }
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = str3;
        if (zza.MediaDescriptionCompat != null) {
            str4 = zza.MediaDescriptionCompat.write;
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = str4;
        MediaBrowserCompat$ItemReceiver.read = zza.write;
        if (getDigest.MediaBrowserCompat$ItemReceiver(zza.MediaMetadataCompat) != null) {
            autoValue_CrashlyticsReport_CustomAttribute = getDigest.MediaBrowserCompat$ItemReceiver(zza.MediaMetadataCompat);
        } else {
            autoValue_CrashlyticsReport_CustomAttribute = AutoValue_CrashlyticsReport_CustomAttribute.read();
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = autoValue_CrashlyticsReport_CustomAttribute;
        MediaBrowserCompat$ItemReceiver.write = zza.read;
        boolean z = false;
        retrieveSettingsData retrievesettingsdata = new retrieveSettingsData(MediaBrowserCompat$ItemReceiver, (byte) 0);
        AutoValue_CrashlyticsReport_CustomAttribute unused4 = this.write.MediaBrowserCompat$ItemReceiver = retrievesettingsdata.MediaDescriptionCompat;
        ImageProcessor.ProcessProgressEvent processProgressEvent2 = this.write;
        removeProcessProgressEventListener removeprocessprogresseventlistener = new removeProcessProgressEventListener(this, retrievesettingsdata, zza);
        if (processProgressEvent2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            removeprocessprogresseventlistener.IconCompatParcelizer(processProgressEvent2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        ImageProcessor.ProcessProgressEvent.MediaSessionCompat$Token(this.write);
        if (!this.write.MediaBrowserCompat$SearchResultReceiver(th)) {
            ImageProcessor.ProcessProgressEvent processProgressEvent = this.write;
            setImagePerfectionProfile setimageperfectionprofile = new setImagePerfectionProfile(this, th);
            if (processProgressEvent.RatingCompat != null) {
                setimageperfectionprofile.IconCompatParcelizer(processProgressEvent.RatingCompat);
            }
        }
    }
}

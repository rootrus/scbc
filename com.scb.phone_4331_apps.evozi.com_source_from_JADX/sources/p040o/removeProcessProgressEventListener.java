package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.ImageProcessor;
import p040o.writeUInt64NoTag;
import p040o.zzbt;

/* renamed from: o.removeProcessProgressEventListener */
public final /* synthetic */ class removeProcessProgressEventListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzbt.zze.zza IconCompatParcelizer;
    private final /* synthetic */ C3490x49eb2967 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ retrieveSettingsData write;

    public /* synthetic */ removeProcessProgressEventListener(C3490x49eb2967 imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver, retrieveSettingsData retrievesettingsdata, zzbt.zze.zza zza) {
        this.MediaBrowserCompat$CustomActionResultReceiver = imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver;
        this.write = retrievesettingsdata;
        this.IconCompatParcelizer = zza;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        C3490x49eb2967 imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        retrieveSettingsData retrievesettingsdata = this.write;
        zzbt.zze.zza zza = this.IconCompatParcelizer;
        CheckExtractActivity_MembersInjector.setCheckable setcheckable = (CheckExtractActivity_MembersInjector.setCheckable) obj;
        String str2 = "";
        setcheckable.IconCompatParcelizer(retrievesettingsdata.MediaBrowserCompat$CustomActionResultReceiver != null ? retrievesettingsdata.MediaBrowserCompat$CustomActionResultReceiver : str2, retrievesettingsdata.read);
        if (imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver.write.f2723x50fd9e4a.equals("COMMERCIAL_LOAN")) {
            setcheckable.MediaBrowserCompat$MediaItem();
        }
        AutoValue_CrashlyticsReport_CustomAttribute MediaDescriptionCompat = imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver;
        ImageProcessor.ProcessProgressEvent processProgressEvent = imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver.write;
        setBasicSettingsProfile setbasicsettingsprofile = new setBasicSettingsProfile(imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver, MediaDescriptionCompat);
        if (processProgressEvent.RatingCompat != null) {
            setbasicsettingsprofile.IconCompatParcelizer(processProgressEvent.RatingCompat);
        }
        if (retrievesettingsdata.MediaBrowserCompat$ItemReceiver != null) {
            str = retrievesettingsdata.MediaBrowserCompat$ItemReceiver;
        } else {
            str = str2;
        }
        setcheckable.write(str);
        if (retrievesettingsdata.IconCompatParcelizer != null) {
            str2 = retrievesettingsdata.IconCompatParcelizer;
        }
        setcheckable.IconCompatParcelizer(str2);
        setcheckable.write(imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver.write.read());
        isBuildingsEnabled isbuildingsenabled = zza.MediaDescriptionCompat;
        ImageProcessor.ProcessProgressEvent.MediaSessionCompat$ResultReceiverWrapper(imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver.write);
        imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver.write.PlaybackStateCompat$CustomAction.write();
        imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver.write.PlaybackStateCompat$CustomAction.IconCompatParcelizer(new ImageProcessor.ProcessProgressEvent.write(isbuildingsenabled));
    }
}

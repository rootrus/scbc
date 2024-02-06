package p040o;

import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.ActivityRecognition;
import p040o.CrashlyticsController;
import p040o.writeUInt64NoTag;
import p040o.zzjx;

/* renamed from: o.getDocumentID$MediaBrowserCompat$ItemReceiver */
public final class getDocumentID$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzjx.zze> {
    private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
    private /* synthetic */ getDocumentID MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ BaseDiscoverFundFilterActivity read;
    private /* synthetic */ boolean write;

    getDocumentID$MediaBrowserCompat$ItemReceiver(getDocumentID getdocumentid, boolean z, BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity, FundFactSheetActivity fundFactSheetActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getdocumentid;
        this.write = z;
        this.read = baseDiscoverFundFilterActivity;
        this.IconCompatParcelizer = fundFactSheetActivity;
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzjx.zze zze = (zzjx.zze) obj;
        onGetStartedClick.write((Object) zze, "res");
        super.onNext(zze);
        String str = null;
        if (this.write) {
            getDocumentID getdocumentid = this.MediaBrowserCompat$CustomActionResultReceiver;
            getdocumentid.read(getdocumentid.write.write(zze, this.MediaBrowserCompat$CustomActionResultReceiver.read.read.MediaBrowserCompat$SearchResultReceiver()), (List<getUserId>) null);
        } else {
            getDocumentID getdocumentid2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            getdocumentid2.IconCompatParcelizer = getdocumentid2.write.write(zze, this.MediaBrowserCompat$CustomActionResultReceiver.read.read.MediaBrowserCompat$SearchResultReceiver());
        }
        C10844immutableEnumSet IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
        String str2 = zze.MediaDescriptionCompat;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        OffsetDateTime offsetDateTime = zze.write;
        zzjx.zze.zza zza = zze.MediaMetadataCompat;
        removeActivityUpdates removeactivityupdates = zze.read;
        String str4 = removeactivityupdates != null ? removeactivityupdates.IconCompatParcelizer : null;
        removeActivityUpdates removeactivityupdates2 = zze.read;
        if (removeactivityupdates2 != null) {
            str = removeactivityupdates2.write;
        }
        CrashlyticsController.C322115 MediaBrowserCompat$CustomActionResultReceiver2 = IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver(new ActivityRecognition.zza(str3, offsetDateTime, zza, str4, str));
        getDocumentID getdocumentid3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer getdocumentid_mediabrowsercompat_itemreceiver_mediabrowsercompat_itemreceiver = new C4552x444e5ba4(MediaBrowserCompat$CustomActionResultReceiver2);
        if (getdocumentid3.RatingCompat != null) {
            getdocumentid_mediabrowsercompat_itemreceiver_mediabrowsercompat_itemreceiver.IconCompatParcelizer(getdocumentid3.RatingCompat);
        }
        getDocumentID.write(this.MediaBrowserCompat$CustomActionResultReceiver);
        BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity = this.read;
        if (baseDiscoverFundFilterActivity != null) {
            baseDiscoverFundFilterActivity.MediaBrowserCompat$CustomActionResultReceiver(zze, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        this.IconCompatParcelizer.invoke(th);
    }
}

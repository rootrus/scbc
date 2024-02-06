package p040o;

import java.util.List;
import p040o.AutoValue_CrashlyticsReport;

/* renamed from: o.setNdkPayload */
public final class setNdkPayload {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final setInstallationUuid MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2951x50fd9e4a;
    public final List<AutoValue_CrashlyticsReport.C30561> MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    private final String MediaSessionCompat$QueueItem;
    public final boolean RatingCompat;
    public final setBuildVersion read;
    public final String write;

    public setNdkPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, setBuildVersion setbuildversion, String str8, setInstallationUuid setinstallationuuid, List<AutoValue_CrashlyticsReport.C30561> list) {
        this.MediaMetadataCompat = str;
        this.MediaSessionCompat$QueueItem = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.f2951x50fd9e4a = str6;
        this.write = str7;
        this.RatingCompat = z;
        this.read = setbuildversion;
        this.MediaBrowserCompat$CustomActionResultReceiver = str8;
        this.MediaBrowserCompat$MediaItem = setinstallationuuid;
        this.MediaDescriptionCompat = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setNdkPayload setndkpayload = (setNdkPayload) obj;
        if (this.RatingCompat != setndkpayload.RatingCompat) {
            return false;
        }
        String str = this.MediaMetadataCompat;
        if (str == null ? setndkpayload.MediaMetadataCompat != null : !str.equals(setndkpayload.MediaMetadataCompat)) {
            return false;
        }
        String str2 = this.MediaSessionCompat$QueueItem;
        if (str2 == null ? setndkpayload.MediaSessionCompat$QueueItem != null : !str2.equals(setndkpayload.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 == null ? setndkpayload.IconCompatParcelizer != null : !str3.equals(setndkpayload.IconCompatParcelizer)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 == null ? setndkpayload.MediaBrowserCompat$ItemReceiver != null : !str4.equals(setndkpayload.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str5 == null ? setndkpayload.MediaBrowserCompat$SearchResultReceiver != null : !str5.equals(setndkpayload.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str6 = this.f2951x50fd9e4a;
        if (str6 == null ? setndkpayload.f2951x50fd9e4a != null : !str6.equals(setndkpayload.f2951x50fd9e4a)) {
            return false;
        }
        String str7 = this.write;
        if (str7 == null ? setndkpayload.write != null : !str7.equals(setndkpayload.write)) {
            return false;
        }
        if (this.read != setndkpayload.read) {
            return false;
        }
        String str8 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str8 == null ? setndkpayload.MediaBrowserCompat$CustomActionResultReceiver != null : !str8.equals(setndkpayload.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        setInstallationUuid setinstallationuuid = this.MediaBrowserCompat$MediaItem;
        if (setinstallationuuid == null ? setndkpayload.MediaBrowserCompat$MediaItem != null : !setinstallationuuid.equals(setndkpayload.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        List<AutoValue_CrashlyticsReport.C30561> list = this.MediaDescriptionCompat;
        List<AutoValue_CrashlyticsReport.C30561> list2 = setndkpayload.MediaDescriptionCompat;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaSessionCompat$QueueItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.f2951x50fd9e4a;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.write;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        boolean z = this.RatingCompat;
        setBuildVersion setbuildversion = this.read;
        int hashCode8 = setbuildversion != null ? setbuildversion.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        setInstallationUuid setinstallationuuid = this.MediaBrowserCompat$MediaItem;
        int hashCode10 = setinstallationuuid != null ? setinstallationuuid.hashCode() : 0;
        List<AutoValue_CrashlyticsReport.C30561> list = this.MediaDescriptionCompat;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (z ? 1 : 0)) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i;
    }
}

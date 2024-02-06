package p040o;

import java.util.List;
import p040o.CrashlyticsController;

/* renamed from: o.retainSessions */
public final class retainSessions {
    public final String IconCompatParcelizer;
    public final writeSessionUser MediaBrowserCompat$CustomActionResultReceiver;
    public final Integer MediaBrowserCompat$ItemReceiver;
    public final setMapStyle MediaBrowserCompat$MediaItem;
    public final CrashlyticsController.C322014 MediaDescriptionCompat;
    public final writeToLog MediaMetadataCompat;
    public final List<getTimestampSeconds> RatingCompat;
    public final int read;
    public final getTrimmedNonFatalFiles write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof retainSessions)) {
            return false;
        }
        retainSessions retainsessions = (retainSessions) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) retainsessions.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) retainsessions.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) retainsessions.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) retainsessions.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) retainsessions.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) retainsessions.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) retainsessions.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) retainsessions.RatingCompat) && this.read == retainsessions.read;
    }

    public final int hashCode() {
        CrashlyticsController.C322014 r0 = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = r0 != null ? r0.hashCode() : 0;
        getTrimmedNonFatalFiles gettrimmednonfatalfiles = this.write;
        int hashCode2 = gettrimmednonfatalfiles != null ? gettrimmednonfatalfiles.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        int hashCode3 = str != null ? str.hashCode() : 0;
        writeToLog writetolog = this.MediaMetadataCompat;
        int hashCode4 = writetolog != null ? writetolog.hashCode() : 0;
        writeSessionUser writesessionuser = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = writesessionuser != null ? writesessionuser.hashCode() : 0;
        Integer num = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = num != null ? num.hashCode() : 0;
        setMapStyle setmapstyle = this.MediaBrowserCompat$MediaItem;
        int hashCode7 = setmapstyle != null ? setmapstyle.hashCode() : 0;
        List<getTimestampSeconds> list = this.RatingCompat;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i) * 31) + this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessInfoDisplay(validationConfig=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", businessIndustry=");
        sb.append(this.write);
        sb.append(", businessType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", storeType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", loanPurpose=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", netIncome=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", sourceOfIncome=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", operatingAccount=");
        sb.append(this.RatingCompat);
        sb.append(", minIncome=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public retainSessions(CrashlyticsController.C322014 r2, getTrimmedNonFatalFiles gettrimmednonfatalfiles, String str, writeToLog writetolog, writeSessionUser writesessionuser, Integer num, setMapStyle setmapstyle, List<getTimestampSeconds> list, int i) {
        onGetStartedClick.write((Object) r2, "validationConfig");
        this.MediaDescriptionCompat = r2;
        this.write = gettrimmednonfatalfiles;
        this.IconCompatParcelizer = str;
        this.MediaMetadataCompat = writetolog;
        this.MediaBrowserCompat$CustomActionResultReceiver = writesessionuser;
        this.MediaBrowserCompat$ItemReceiver = num;
        this.MediaBrowserCompat$MediaItem = setmapstyle;
        this.RatingCompat = list;
        this.read = i;
    }
}

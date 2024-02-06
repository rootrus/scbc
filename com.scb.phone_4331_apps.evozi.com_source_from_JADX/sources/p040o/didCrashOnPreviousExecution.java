package p040o;

import java.util.List;
import p040o.CrashlyticsController;

/* renamed from: o.didCrashOnPreviousExecution */
public final class didCrashOnPreviousExecution {
    public final CrashlyticsController.C321810 IconCompatParcelizer;
    public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
    public final getFatalSessionFilesDir MediaBrowserCompat$ItemReceiver;
    public final List<String> MediaMetadataCompat;
    public final CrashlyticsController.C321810 read;
    public final CrashlyticsController.C321810 write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof didCrashOnPreviousExecution)) {
            return false;
        }
        didCrashOnPreviousExecution didcrashonpreviousexecution = (didCrashOnPreviousExecution) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) didcrashonpreviousexecution.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) didcrashonpreviousexecution.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) didcrashonpreviousexecution.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) didcrashonpreviousexecution.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) didcrashonpreviousexecution.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) didcrashonpreviousexecution.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        getFatalSessionFilesDir getfatalsessionfilesdir = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = getfatalsessionfilesdir != null ? getfatalsessionfilesdir.hashCode() : 0;
        CrashlyticsController.C321810 r2 = this.IconCompatParcelizer;
        int hashCode2 = r2 != null ? r2.hashCode() : 0;
        CrashlyticsController.C321810 r3 = this.read;
        int hashCode3 = r3 != null ? r3.hashCode() : 0;
        CrashlyticsController.C321810 r4 = this.write;
        int hashCode4 = r4 != null ? r4.hashCode() : 0;
        List<String> list = this.MediaMetadataCompat;
        int hashCode5 = list != null ? list.hashCode() : 0;
        List<String> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlNTBContactInfoFormDisplay(hmlContactInfoDisplay=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", maritalDisplay=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", residenceDisplay=");
        sb.append(this.read);
        sb.append(", educationLevelsDisplay=");
        sb.append(this.write);
        sb.append(", titleDisplay=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", fullTitleDisplay=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public didCrashOnPreviousExecution(getFatalSessionFilesDir getfatalsessionfilesdir, CrashlyticsController.C321810 r3, CrashlyticsController.C321810 r4, CrashlyticsController.C321810 r5, List<String> list, List<String> list2) {
        onGetStartedClick.write((Object) getfatalsessionfilesdir, "hmlContactInfoDisplay");
        onGetStartedClick.write((Object) r3, "maritalDisplay");
        onGetStartedClick.write((Object) r4, "residenceDisplay");
        onGetStartedClick.write((Object) r5, "educationLevelsDisplay");
        onGetStartedClick.write((Object) list, "titleDisplay");
        onGetStartedClick.write((Object) list2, "fullTitleDisplay");
        this.MediaBrowserCompat$ItemReceiver = getfatalsessionfilesdir;
        this.IconCompatParcelizer = r3;
        this.read = r4;
        this.write = r5;
        this.MediaMetadataCompat = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = list2;
    }
}

package p040o;

import p040o.CrashlyticsController;

/* renamed from: o.listNativeSessionFileDirectories */
public final class listNativeSessionFileDirectories {
    public final CrashlyticsController.C321810 IconCompatParcelizer;
    public final listSessionBeginFiles MediaBrowserCompat$ItemReceiver;
    public final CrashlyticsController.C321810 read;
    public final CrashlyticsController.C321810 write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof listNativeSessionFileDirectories)) {
            return false;
        }
        listNativeSessionFileDirectories listnativesessionfiledirectories = (listNativeSessionFileDirectories) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) listnativesessionfiledirectories.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) listnativesessionfiledirectories.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) listnativesessionfiledirectories.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) listnativesessionfiledirectories.read);
    }

    public final int hashCode() {
        listSessionBeginFiles listsessionbeginfiles = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = listsessionbeginfiles != null ? listsessionbeginfiles.hashCode() : 0;
        CrashlyticsController.C321810 r2 = this.IconCompatParcelizer;
        int hashCode2 = r2 != null ? r2.hashCode() : 0;
        CrashlyticsController.C321810 r3 = this.write;
        int hashCode3 = r3 != null ? r3.hashCode() : 0;
        CrashlyticsController.C321810 r4 = this.read;
        if (r4 != null) {
            i = r4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlPersonalInfoFormDisplay(contactInfoDisplay=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", maritalDisplay=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", residenceDisplay=");
        sb.append(this.write);
        sb.append(", educationLevelsDisplay=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public listNativeSessionFileDirectories(listSessionBeginFiles listsessionbeginfiles, CrashlyticsController.C321810 r3, CrashlyticsController.C321810 r4, CrashlyticsController.C321810 r5) {
        onGetStartedClick.write((Object) listsessionbeginfiles, "contactInfoDisplay");
        onGetStartedClick.write((Object) r3, "maritalDisplay");
        onGetStartedClick.write((Object) r4, "residenceDisplay");
        onGetStartedClick.write((Object) r5, "educationLevelsDisplay");
        this.MediaBrowserCompat$ItemReceiver = listsessionbeginfiles;
        this.IconCompatParcelizer = r3;
        this.write = r4;
        this.read = r5;
    }
}

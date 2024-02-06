package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: o.ISprintService */
public final class ISprintService {
    public final String IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ISprintService)) {
            return false;
        }
        ISprintService iSprintService = (ISprintService) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iSprintService.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iSprintService.IconCompatParcelizer) && this.MediaBrowserCompat$CustomActionResultReceiver == iSprintService.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + i) * 31) + this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberPickerDisplay(tag=");
        sb.append(this.write);
        sb.append(", value=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", position=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public ISprintService(String str, String str2, int i) {
        onGetStartedClick.write((Object) str, "tag");
        onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }
}

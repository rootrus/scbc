package p040o;

/* renamed from: o.EventBus */
public final class EventBus {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final int MediaDescriptionCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventBus)) {
            return false;
        }
        EventBus eventBus = (EventBus) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) eventBus.write) && this.MediaDescriptionCompat == eventBus.MediaDescriptionCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) eventBus.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) eventBus.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) eventBus.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) eventBus.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.MediaDescriptionCompat;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SensitiveConsentDisplay(consentContentUrl=");
        sb.append(this.write);
        sb.append(", sequence=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", consentType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", consentSubType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", consentVersion=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", scopeKey=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public EventBus(String str, int i, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "consentContentUrl");
        onGetStartedClick.write((Object) str2, "consentType");
        onGetStartedClick.write((Object) str3, "consentSubType");
        onGetStartedClick.write((Object) str4, "consentVersion");
        onGetStartedClick.write((Object) str5, "scopeKey");
        this.write = str;
        this.MediaDescriptionCompat = i;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.read = str5;
    }
}

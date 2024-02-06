package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.setOnPlaceSelectedListener */
public final class setOnPlaceSelectedListener {
    public final OffsetDateTime IconCompatParcelizer;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnPlaceSelectedListener)) {
            return false;
        }
        setOnPlaceSelectedListener setonplaceselectedlistener = (setOnPlaceSelectedListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setonplaceselectedlistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setonplaceselectedlistener.read);
    }

    public final int hashCode() {
        OffsetDateTime offsetDateTime = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str = this.read;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressConfirmationResponse(requestDatetime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", requestID=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public setOnPlaceSelectedListener(OffsetDateTime offsetDateTime, String str) {
        onGetStartedClick.write((Object) offsetDateTime, "requestDatetime");
        onGetStartedClick.write((Object) str, "requestID");
        this.IconCompatParcelizer = offsetDateTime;
        this.read = str;
    }
}

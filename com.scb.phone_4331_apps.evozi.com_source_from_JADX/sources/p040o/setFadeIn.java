package p040o;

/* renamed from: o.setFadeIn */
public final class setFadeIn {
    public final getTransparency IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final getCenter read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFadeIn)) {
            return false;
        }
        setFadeIn setfadein = (setFadeIn) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setfadein.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setfadein.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setfadein.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        getCenter getcenter = this.read;
        int hashCode2 = getcenter != null ? getcenter.hashCode() : 0;
        getTransparency gettransparency = this.IconCompatParcelizer;
        if (gettransparency != null) {
            i = gettransparency.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardActivationVerificationData(unmaskedCardNumber=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", cardInfo=");
        sb.append(this.read);
        sb.append(", activationVerification=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public setFadeIn(String str, getCenter getcenter, getTransparency gettransparency) {
        onGetStartedClick.write((Object) str, "unmaskedCardNumber");
        onGetStartedClick.write((Object) getcenter, "cardInfo");
        onGetStartedClick.write((Object) gettransparency, "activationVerification");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = getcenter;
        this.IconCompatParcelizer = gettransparency;
    }
}

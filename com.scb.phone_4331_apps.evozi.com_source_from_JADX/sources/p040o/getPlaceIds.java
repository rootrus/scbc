package p040o;

/* renamed from: o.getPlaceIds */
public final class getPlaceIds {
    public final String IconCompatParcelizer;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPlaceIds)) {
            return false;
        }
        getPlaceIds getplaceids = (getPlaceIds) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getplaceids.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getplaceids.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuristicSendOtaResponse(mobileNo=");
        sb.append(this.read);
        sb.append(", refId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getPlaceIds(String str, String str2) {
        onGetStartedClick.write((Object) str, "mobileNo");
        onGetStartedClick.write((Object) str2, "refId");
        this.read = str;
        this.IconCompatParcelizer = str2;
    }
}

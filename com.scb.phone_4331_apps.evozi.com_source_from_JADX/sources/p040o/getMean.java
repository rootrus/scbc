package p040o;

import com.google.gson.annotations.SerializedName;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;

/* renamed from: o.getMean */
public final class getMean extends setCurrentItemInternal {
    @SerializedName("consentVersion")
    private final String IconCompatParcelizer;
    @SerializedName("consentHtml")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("callbackUrl")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("information")
    private final setMinAndMaxFrames read;
    @SerializedName("consentDescription")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMean)) {
            return false;
        }
        getMean getmean = (getMean) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getmean.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getmean.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getmean.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getmean.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getmean.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        setMinAndMaxFrames setminandmaxframes = this.read;
        int hashCode2 = setminandmaxframes != null ? setminandmaxframes.hashCode() : 0;
        String str2 = this.write;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartnerConsentEntity(callbackUrl=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", information=");
        sb.append(this.read);
        sb.append(", consentDescription=");
        sb.append(this.write);
        sb.append(", consentHtml=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", consentVersion=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final setMyLocationEnabled IconCompatParcelizer() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            setMinAndMaxFrames setminandmaxframes = this.read;
            return new setMyLocationEnabled(str, setminandmaxframes != null ? new setOnCameraChangeListener(setminandmaxframes.MediaBrowserCompat$ItemReceiver, setminandmaxframes.IconCompatParcelizer, setminandmaxframes.read, setminandmaxframes.write, setminandmaxframes.MediaBrowserCompat$MediaItem, setminandmaxframes.MediaDescriptionCompat, setminandmaxframes.MediaBrowserCompat$SearchResultReceiver, setminandmaxframes.RatingCompat, setminandmaxframes.MediaBrowserCompat$CustomActionResultReceiver) : null, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer);
        }
        throw new EntityMappingException("callbackUrl can not be null");
    }

    public final setMyLocationEnabled MediaBrowserCompat$CustomActionResultReceiver(setOnPageChangeListener setonpagechangelistener) {
        onGetStartedClick.write((Object) setonpagechangelistener, "status");
        setMyLocationEnabled IconCompatParcelizer2 = IconCompatParcelizer();
        IconCompatParcelizer2.read(new zzvj(setonpagechangelistener.write(), setonpagechangelistener.read()));
        return IconCompatParcelizer2;
    }
}

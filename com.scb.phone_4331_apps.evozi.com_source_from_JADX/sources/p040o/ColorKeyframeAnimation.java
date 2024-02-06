package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.BaseKeyframeAnimation;

/* renamed from: o.ColorKeyframeAnimation */
public final class ColorKeyframeAnimation {
    @SerializedName("netIncome")
    public final Integer IconCompatParcelizer;
    @SerializedName("minIncome")
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("businessIndustry")
    public final BaseKeyframeAnimation.AnimationListener MediaBrowserCompat$ItemReceiver;
    @SerializedName("operatingAccount")
    public final List<setValueCallback> MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("validationConfig")
    public final getResolvedElement MediaDescriptionCompat;
    @SerializedName("sourceOfIncome")
    public final AnimatableTextFrame MediaMetadataCompat;
    @SerializedName("storeType")
    public final getStyle RatingCompat;
    @SerializedName("businessType")
    public final String read;
    @SerializedName("loanPurpose")
    public final setDelegate write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorKeyframeAnimation)) {
            return false;
        }
        ColorKeyframeAnimation colorKeyframeAnimation = (ColorKeyframeAnimation) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) colorKeyframeAnimation.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) colorKeyframeAnimation.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) colorKeyframeAnimation.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) colorKeyframeAnimation.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) colorKeyframeAnimation.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) colorKeyframeAnimation.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) colorKeyframeAnimation.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) colorKeyframeAnimation.MediaBrowserCompat$SearchResultReceiver) && this.MediaBrowserCompat$CustomActionResultReceiver == colorKeyframeAnimation.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        getResolvedElement getresolvedelement = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = getresolvedelement != null ? getresolvedelement.hashCode() : 0;
        BaseKeyframeAnimation.AnimationListener animationListener = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = animationListener != null ? animationListener.hashCode() : 0;
        String str = this.read;
        int hashCode3 = str != null ? str.hashCode() : 0;
        getStyle getstyle = this.RatingCompat;
        int hashCode4 = getstyle != null ? getstyle.hashCode() : 0;
        setDelegate setdelegate = this.write;
        int hashCode5 = setdelegate != null ? setdelegate.hashCode() : 0;
        Integer num = this.IconCompatParcelizer;
        int hashCode6 = num != null ? num.hashCode() : 0;
        AnimatableTextFrame animatableTextFrame = this.MediaMetadataCompat;
        int hashCode7 = animatableTextFrame != null ? animatableTextFrame.hashCode() : 0;
        List<setValueCallback> list = this.MediaBrowserCompat$SearchResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i) * 31) + this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessInfoEntity(validationConfig=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", businessIndustry=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", businessType=");
        sb.append(this.read);
        sb.append(", storeType=");
        sb.append(this.RatingCompat);
        sb.append(", loanPurpose=");
        sb.append(this.write);
        sb.append(", netIncome=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", sourceOfIncome=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", operatingAccount=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", minIncome=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

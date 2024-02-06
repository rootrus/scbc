package p040o;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import oauth.signpost.exception.OAuthMessageSignerException;

/* renamed from: o.PartnerLandingAdapter$PartnerGroupTitleHolder_ViewBinding */
public final class PartnerLandingAdapter$PartnerGroupTitleHolder_ViewBinding extends PartnerLandingAdapter$PartnerGroupTitleHolder {
    public final String read() {
        return "HMAC-SHA1";
    }

    public final String IconCompatParcelizer(PartnerLandingActivity partnerLandingActivity, onAllowClick onallowclick) throws OAuthMessageSignerException {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(PartnerConsentActivity_ViewBinding.write(this.read));
            sb.append('&');
            sb.append(PartnerConsentActivity_ViewBinding.write(this.MediaBrowserCompat$ItemReceiver));
            SecretKeySpec secretKeySpec = new SecretKeySpec(sb.toString().getBytes("UTF-8"), "HmacSHA1");
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            String read = new PartnerLandingAdapter$PartnerHighlightHolder_ViewBinding(partnerLandingActivity, onallowclick).read();
            PartnerConsentActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("SBS", read);
            return new String(SetupQuickTopUpActivity.IconCompatParcelizer(instance.doFinal(read.getBytes("UTF-8")))).trim();
        } catch (GeneralSecurityException e) {
            throw new OAuthMessageSignerException(e);
        } catch (UnsupportedEncodingException e2) {
            throw new OAuthMessageSignerException(e2);
        }
    }
}

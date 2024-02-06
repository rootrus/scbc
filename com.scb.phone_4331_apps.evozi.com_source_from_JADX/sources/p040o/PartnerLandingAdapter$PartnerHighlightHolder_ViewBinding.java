package p040o;

import java.io.IOException;
import java.net.URI;
import oauth.signpost.exception.OAuthMessageSignerException;

/* renamed from: o.PartnerLandingAdapter$PartnerHighlightHolder_ViewBinding */
public final class PartnerLandingAdapter$PartnerHighlightHolder_ViewBinding {
    private onAllowClick MediaBrowserCompat$CustomActionResultReceiver;
    private PartnerLandingActivity MediaBrowserCompat$ItemReceiver;

    public PartnerLandingAdapter$PartnerHighlightHolder_ViewBinding(PartnerLandingActivity partnerLandingActivity, onAllowClick onallowclick) {
        this.MediaBrowserCompat$ItemReceiver = partnerLandingActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = onallowclick;
    }

    private String MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String next : this.MediaBrowserCompat$CustomActionResultReceiver.keySet()) {
            if (!"oauth_signature".equals(next) && !"realm".equals(next)) {
                if (i > 0) {
                    sb.append("&");
                }
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer((Object) next, false));
            }
            i++;
        }
        return sb.toString();
    }

    public final String read() throws OAuthMessageSignerException {
        int lastIndexOf;
        try {
            URI uri = new URI(this.MediaBrowserCompat$ItemReceiver.getRequestUrl());
            String lowerCase = uri.getScheme().toLowerCase();
            String lowerCase2 = uri.getAuthority().toLowerCase();
            if (((lowerCase.equals("http") && uri.getPort() == 80) || (lowerCase.equals("https") && uri.getPort() == 443)) && (lastIndexOf = lowerCase2.lastIndexOf(":")) >= 0) {
                lowerCase2 = lowerCase2.substring(0, lastIndexOf);
            }
            String rawPath = uri.getRawPath();
            if (rawPath == null || rawPath.length() <= 0) {
                rawPath = "/";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(lowerCase);
            sb.append("://");
            sb.append(lowerCase2);
            sb.append(rawPath);
            String obj = sb.toString();
            String MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.MediaBrowserCompat$ItemReceiver.getMethod());
            sb2.append('&');
            sb2.append(PartnerConsentActivity_ViewBinding.write(obj));
            sb2.append('&');
            sb2.append(PartnerConsentActivity_ViewBinding.write(MediaBrowserCompat$CustomActionResultReceiver2));
            return sb2.toString();
        } catch (Exception e) {
            throw new OAuthMessageSignerException(e);
        }
    }
}

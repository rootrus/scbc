package p040o;

import java.util.Iterator;

/* renamed from: o.PartnerLandingAdapter$PartnerHighlightHolder */
public final class PartnerLandingAdapter$PartnerHighlightHolder implements PartnerLandingAdapter$PartnerTileHolder {
    public final String write(String str, PartnerLandingActivity partnerLandingActivity, onAllowClick onallowclick) {
        onAllowClick read = onallowclick.read();
        read.write("oauth_signature", str, true);
        Iterator<String> it = read.keySet().iterator();
        StringBuilder sb = new StringBuilder(PartnerConsentActivity_ViewBinding.IconCompatParcelizer(partnerLandingActivity.getRequestUrl(), read.MediaBrowserCompat$ItemReceiver(it.next())));
        while (it.hasNext()) {
            sb.append("&");
            sb.append(read.MediaBrowserCompat$ItemReceiver(it.next()));
        }
        String obj = sb.toString();
        partnerLandingActivity.setRequestUrl(obj);
        return obj;
    }
}

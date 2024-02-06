package p040o;

import java.util.Iterator;

/* renamed from: o.PartnerLandingActivity_ViewBinding */
public final class PartnerLandingActivity_ViewBinding implements PartnerLandingAdapter$PartnerTileHolder {
    public final String write(String str, PartnerLandingActivity partnerLandingActivity, onAllowClick onallowclick) {
        StringBuilder sb = new StringBuilder();
        sb.append("OAuth ");
        if (onallowclick.containsKey("realm")) {
            sb.append(onallowclick.MediaBrowserCompat$CustomActionResultReceiver("realm"));
            sb.append(", ");
        }
        onAllowClick read = onallowclick.read();
        read.write("oauth_signature", str, true);
        Iterator<String> it = read.keySet().iterator();
        while (it.hasNext()) {
            sb.append(read.MediaBrowserCompat$CustomActionResultReceiver(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        String obj = sb.toString();
        PartnerConsentActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("Auth Header", obj);
        partnerLandingActivity.setHeader("Authorization", obj);
        return obj;
    }
}

package p040o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import oauth.signpost.exception.OAuthMessageSignerException;

/* renamed from: o.PartnerLandingAdapter$PartnerGroupTitleHolder */
public abstract class PartnerLandingAdapter$PartnerGroupTitleHolder implements Serializable {
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public abstract String IconCompatParcelizer(PartnerLandingActivity partnerLandingActivity, onAllowClick onallowclick) throws OAuthMessageSignerException;

    public abstract String read();

    public PartnerLandingAdapter$PartnerGroupTitleHolder() {
        new SetupQuickTopUpActivity();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        new SetupQuickTopUpActivity();
    }
}

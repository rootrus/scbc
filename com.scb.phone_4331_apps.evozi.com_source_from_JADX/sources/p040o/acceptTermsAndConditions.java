package p040o;

import com.scb.phone.view.fragment.bond.BondNoAccountsErrorFragment;

/* renamed from: o.acceptTermsAndConditions */
public final /* synthetic */ class acceptTermsAndConditions implements ZHPR2$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ BondNoAccountsErrorFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ acceptTermsAndConditions(BondNoAccountsErrorFragment bondNoAccountsErrorFragment) {
        this.MediaBrowserCompat$ItemReceiver = bondNoAccountsErrorFragment;
    }

    public final void read() {
        C10831component component = this.MediaBrowserCompat$ItemReceiver.bondNoAccountsErrorPresenter;
        lambda$static$2 lambda_static_2 = new lambda$static$2(component);
        if (component.RatingCompat != null) {
            lambda_static_2.IconCompatParcelizer(component.RatingCompat);
        }
    }
}

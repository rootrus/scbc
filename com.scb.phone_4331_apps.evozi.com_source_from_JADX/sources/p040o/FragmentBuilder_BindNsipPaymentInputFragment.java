package p040o;

import com.thunderhead.android.domain.authentication.AuthenticationAccessToken;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* renamed from: o.FragmentBuilder_BindNsipPaymentInputFragment */
public final class FragmentBuilder_BindNsipPaymentInputFragment implements Authenticator {
    private final FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> MediaBrowserCompat$CustomActionResultReceiver;

    public FragmentBuilder_BindNsipPaymentInputFragment(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindJuristicOnboardingLandingFragment;
    }

    public final Request authenticate(Route route, Response response) {
        boolean z = response.request().header("Authorization") == null;
        boolean IconCompatParcelizer = FragmentBuilder_BindMyFundsFragment.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver());
        ReviewDocumentActivity primaryBackground = FragmentBuilder_BindHmlIssuerLandingFragment.setPrimaryBackground();
        if (z || (!IconCompatParcelizer) || primaryBackground == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(new C6571x58b78c12((AuthenticationAccessToken) null));
            return null;
        }
        AuthenticationAccessToken authenticationAccessToken = primaryBackground.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindMyFundsFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver())).token();
        if (authenticationAccessToken == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(new C6571x58b78c12((AuthenticationAccessToken) null));
            return null;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(new C6571x58b78c12(authenticationAccessToken));
        Request.Builder newBuilder = response.request().newBuilder();
        StringBuilder sb = new StringBuilder();
        sb.append(authenticationAccessToken.getTokenType());
        sb.append(" ");
        sb.append(authenticationAccessToken.getAccessToken());
        return newBuilder.header("Authorization", sb.toString()).build();
    }
}

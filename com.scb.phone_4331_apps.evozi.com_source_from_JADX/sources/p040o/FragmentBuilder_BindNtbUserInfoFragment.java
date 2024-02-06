package p040o;

import com.thunderhead.android.domain.authentication.AuthenticationResult;
import com.thunderhead.android.domain.authentication.ClientCredentials;
import com.thunderhead.android.infrastructure.authentication.oauth2.retrofit2.OneClientAuthentication;

/* renamed from: o.FragmentBuilder_BindNtbUserInfoFragment */
public final class FragmentBuilder_BindNtbUserInfoFragment implements ReviewDocumentActivity {
    private final FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> MediaBrowserCompat$ItemReceiver;
    private final OneClientAuthentication write;

    public FragmentBuilder_BindNtbUserInfoFragment(OneClientAuthentication oneClientAuthentication, FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        this.write = oneClientAuthentication;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindJuristicOnboardingLandingFragment;
    }

    public final AuthenticationResult MediaBrowserCompat$ItemReceiver(ClientCredentials clientCredentials) {
        if (clientCredentials == null) {
            try {
                clientCredentials = FragmentBuilder_BindMyFundsFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver());
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return new FragmentBuilder_BindOPRRegistrationLandingFragment(e);
            }
        }
        if (clientCredentials == null) {
            return new FragmentBuilder_BindOPRRegistrationLandingFragment((Exception) new NullPointerException("Client Credentials are null!"));
        }
        return new FragmentBuilder_BindOPRRegistrationLandingFragment(this.write.authenticate(new FragmentBuilder_BindNsipPaymentAddAccountFragment(clientCredentials).toString(), "client_credentials").execute());
    }
}

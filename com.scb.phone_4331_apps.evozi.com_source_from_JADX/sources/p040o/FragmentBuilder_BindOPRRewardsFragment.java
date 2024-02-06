package p040o;

import com.thunderhead.android.domain.authentication.AuthenticationAccessToken;
import java.io.IOException;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.Response;

/* renamed from: o.FragmentBuilder_BindOPRRewardsFragment */
public final class FragmentBuilder_BindOPRRewardsFragment implements Interceptor {
    private final FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> MediaBrowserCompat$ItemReceiver;

    public FragmentBuilder_BindOPRRewardsFragment(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindJuristicOnboardingLandingFragment;
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        boolean z = proceed.code() != 302;
        List<String> pathSegments = proceed.request().url().pathSegments();
        StringBuilder sb = new StringBuilder();
        for (String lowerCase : pathSegments) {
            sb.append(lowerCase.toLowerCase());
            sb.append("/");
        }
        boolean contains = sb.toString().contains("one/oauth2");
        if (z || (!contains)) {
            return proceed;
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(new C6571x58b78c12((AuthenticationAccessToken) null));
        return proceed.newBuilder().code(401).body(proceed.body()).build();
    }
}

package p040o;

import com.thunderhead.android.domain.authentication.AuthenticationAccessToken;
import java.io.IOException;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: o.FragmentBuilder_BindNoEligiblePurchasesFragment */
public final class FragmentBuilder_BindNoEligiblePurchasesFragment implements Interceptor {
    private final FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> IconCompatParcelizer;

    public FragmentBuilder_BindNoEligiblePurchasesFragment(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindJuristicOnboardingLandingFragment;
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        AuthenticationAccessToken write = FragmentBuilder_BindMyFundsFragment.write(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
        List<String> pathSegments = chain.request().url().pathSegments();
        StringBuilder sb = new StringBuilder();
        for (String lowerCase : pathSegments) {
            sb.append(lowerCase.toLowerCase());
            sb.append("/");
        }
        boolean contains = sb.toString().contains("one/oauth2/services");
        boolean contains2 = sb.toString().contains("one/oauth2token");
        if (write == null && ((!contains) || contains2)) {
            return chain.proceed(chain.request());
        }
        if (write == null) {
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(401).headers(chain.request().headers()).message("Missing Authentication Token").body(ResponseBody.create(MediaType.parse("text/plain"), "Missing Authentication Token")).build();
        }
        String accessToken = write.getAccessToken();
        Request.Builder newBuilder = chain.request().newBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(write.getTokenType());
        sb2.append(" ");
        sb2.append(accessToken);
        newBuilder.header("Authorization", sb2.toString());
        return chain.proceed(newBuilder.build());
    }
}

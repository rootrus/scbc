package p040o;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: o.FragmentBuilder_BindStatementChannelLandingFragment */
public final class FragmentBuilder_BindStatementChannelLandingFragment implements Interceptor {
    private final FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> MediaBrowserCompat$CustomActionResultReceiver;

    public FragmentBuilder_BindStatementChannelLandingFragment(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment, "store");
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindJuristicOnboardingLandingFragment;
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        onGetStartedClick.write((Object) chain, "chain");
        try {
            Boolean invoke = FragmentBuilder_BindStopChequeInputFragment.MediaBrowserCompat$CustomActionResultReceiver().invoke(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver());
            if (invoke != null ? invoke.booleanValue() : false) {
                Response.Builder builder = new Response.Builder();
                Integer num = C6557x2438d01c.write;
                onGetStartedClick.IconCompatParcelizer((Object) num, "Constants.OptOut.OPT_OUT_NETWORK_CODE");
                Response build = builder.code(num.intValue()).protocol(Protocol.HTTP_1_0).body(ResponseBody.create(MediaType.parse("text/plain"), C6557x2438d01c.MediaBrowserCompat$ItemReceiver("OptOutInterceptor", "intercept"))).message("OK").request(chain.request()).build();
                MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindMerchantWalletIncomingTransactionFragment.OPT_OUT_TRUE_NETWORK_INTERCEPTED);
                onGetStartedClick.IconCompatParcelizer((Object) build, "Response.Builder()\n     …      )\n                }");
                return build;
            }
            Response proceed = chain.proceed(chain.request());
            onGetStartedClick.IconCompatParcelizer((Object) proceed, "chain.proceed(chain.request())");
            return proceed;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletIncomingTransactionFragment.OPT_OUT_NETWORK_ERROR);
            throw new IOException(e);
        }
    }
}

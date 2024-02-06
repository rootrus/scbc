package p040o;

import com.thunderhead.android.infrastructure.server.responses.CreateTouchpointResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: o.FragmentBuilder_BindWorkAddressFragment */
final class FragmentBuilder_BindWorkAddressFragment implements Callback<CreateTouchpointResponse> {
    private final FragmentBuilder_BindHowToAddFavouriteTopUpFragment<FragmentBuilder_BindLandingFragment<Exception>> IconCompatParcelizer;
    private final FragmentBuilder_BindHowToAddFavouriteTopUpFragment<FragmentBuilder_BindJuristicRequestFormSuccessfulFragment<FragmentBuilder_BindInformationTabFragment>> MediaBrowserCompat$CustomActionResultReceiver;

    FragmentBuilder_BindWorkAddressFragment(FragmentBuilder_BindHowToAddFavouriteTopUpFragment<FragmentBuilder_BindLandingFragment<Exception>> fragmentBuilder_BindHowToAddFavouriteTopUpFragment, FragmentBuilder_BindHowToAddFavouriteTopUpFragment<FragmentBuilder_BindJuristicRequestFormSuccessfulFragment<FragmentBuilder_BindInformationTabFragment>> fragmentBuilder_BindHowToAddFavouriteTopUpFragment2) {
        this.IconCompatParcelizer = fragmentBuilder_BindHowToAddFavouriteTopUpFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHowToAddFavouriteTopUpFragment2;
    }

    public final void onResponse(Call<CreateTouchpointResponse> call, Response<CreateTouchpointResponse> response) {
        FragmentBuilder_BindHowToAddFavouriteTopUpFragment<FragmentBuilder_BindLandingFragment<Exception>> fragmentBuilder_BindHowToAddFavouriteTopUpFragment;
        if (response == null && (fragmentBuilder_BindHowToAddFavouriteTopUpFragment = this.IconCompatParcelizer) != null) {
            Exception exc = new Exception(new NullPointerException("Response"));
            FragmentBuilder_BindManagePromptpayLandingFragment fragmentBuilder_BindManagePromptpayLandingFragment = FragmentBuilder_BindManagePromptpayLandingFragment.NETWORK_GENERIC_ERROR;
            fragmentBuilder_BindHowToAddFavouriteTopUpFragment.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindLandingFragment(exc));
        } else if (response != null) {
            if (response.code() != 409 && response.code() != 200) {
                FragmentBuilder_BindHowToAddFavouriteTopUpFragment<FragmentBuilder_BindLandingFragment<Exception>> fragmentBuilder_BindHowToAddFavouriteTopUpFragment2 = this.IconCompatParcelizer;
                if (fragmentBuilder_BindHowToAddFavouriteTopUpFragment2 != null) {
                    Exception exc2 = new Exception("Unhandled HTTP Code for Retrofit2TouchpointsRepository#create");
                    FragmentBuilder_BindManagePromptpayLandingFragment fragmentBuilder_BindManagePromptpayLandingFragment2 = FragmentBuilder_BindManagePromptpayLandingFragment.NETWORK_GENERIC_ERROR;
                    fragmentBuilder_BindHowToAddFavouriteTopUpFragment2.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindLandingFragment(exc2));
                }
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                int code = response.code();
                FragmentBuilder_BindJuristicRequestFormSuccessfulFragment fragmentBuilder_BindJuristicRequestFormSuccessfulFragment = null;
                if (code == 409) {
                    FragmentBuilder_BindManagePromptpayLandingFragment fragmentBuilder_BindManagePromptpayLandingFragment3 = FragmentBuilder_BindManagePromptpayLandingFragment.NETWORK_409;
                    fragmentBuilder_BindJuristicRequestFormSuccessfulFragment = new FragmentBuilder_BindJuristicRequestFormSuccessfulFragment(null);
                } else if (code == 200) {
                    response.body().getData().getId();
                    FragmentBuilder_BindInformationTabFragment fragmentBuilder_BindInformationTabFragment = new FragmentBuilder_BindInformationTabFragment();
                    FragmentBuilder_BindManagePromptpayLandingFragment fragmentBuilder_BindManagePromptpayLandingFragment4 = FragmentBuilder_BindManagePromptpayLandingFragment.NETWORK_200;
                    fragmentBuilder_BindJuristicRequestFormSuccessfulFragment = new FragmentBuilder_BindJuristicRequestFormSuccessfulFragment(fragmentBuilder_BindInformationTabFragment);
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindJuristicRequestFormSuccessfulFragment);
            }
        }
    }

    public final void onFailure(Call<CreateTouchpointResponse> call, Throwable th) {
        FragmentBuilder_BindHowToAddFavouriteTopUpFragment<FragmentBuilder_BindLandingFragment<Exception>> fragmentBuilder_BindHowToAddFavouriteTopUpFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindHowToAddFavouriteTopUpFragment != null) {
            Exception exc = new Exception(th);
            FragmentBuilder_BindManagePromptpayLandingFragment fragmentBuilder_BindManagePromptpayLandingFragment = FragmentBuilder_BindManagePromptpayLandingFragment.NETWORK_GENERIC_ERROR;
            fragmentBuilder_BindHowToAddFavouriteTopUpFragment.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindLandingFragment(exc));
        }
    }
}

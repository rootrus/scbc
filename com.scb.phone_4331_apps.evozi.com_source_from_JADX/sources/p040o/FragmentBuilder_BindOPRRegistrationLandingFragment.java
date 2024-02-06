package p040o;

import com.thunderhead.android.domain.authentication.AuthenticationAccessToken;
import com.thunderhead.android.domain.authentication.AuthenticationResult;
import java.io.IOException;
import retrofit2.Response;

/* renamed from: o.FragmentBuilder_BindOPRRegistrationLandingFragment */
final class FragmentBuilder_BindOPRRegistrationLandingFragment extends AuthenticationResult {
    private final Response<AuthenticationAccessToken> IconCompatParcelizer;
    private final Exception write;

    FragmentBuilder_BindOPRRegistrationLandingFragment(Response<AuthenticationAccessToken> response) {
        this.IconCompatParcelizer = response;
        this.write = null;
    }

    FragmentBuilder_BindOPRRegistrationLandingFragment(Exception exc) {
        this.IconCompatParcelizer = null;
        this.write = exc;
    }

    public final AuthenticationAccessToken token() {
        Response<AuthenticationAccessToken> response = this.IconCompatParcelizer;
        if (response == null) {
            return null;
        }
        return response.body();
    }

    public final Throwable error() {
        try {
            if (this.IconCompatParcelizer == null && this.write != null) {
                return new Throwable(this.write);
            }
            if (this.IconCompatParcelizer == null || this.IconCompatParcelizer.errorBody() == null) {
                return null;
            }
            return new Throwable(this.IconCompatParcelizer.errorBody().string());
        } catch (IOException e) {
            return new Throwable(e);
        }
    }

    public final Integer code() {
        Response<AuthenticationAccessToken> response = this.IconCompatParcelizer;
        if (response == null) {
            return null;
        }
        return Integer.valueOf(response.code());
    }
}

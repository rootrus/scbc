package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import p040o.HmlNationalIdActivity;
import p040o.onGetStartedClick;

public final class CookieJar$Companion$NO_COOKIES$1 implements CookieJar {
    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
        onGetStartedClick.write((Object) list, "cookies");
    }

    CookieJar$Companion$NO_COOKIES$1() {
    }

    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
        return HmlNationalIdActivity.IconCompatParcelizer;
    }
}

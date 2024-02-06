package p040o;

import java.io.IOException;
import org.apache.http.HttpException;

/* renamed from: o.PrepaidRequestSuccessActivity */
public interface PrepaidRequestSuccessActivity extends PrepaidRequestReviewActivity {
    ScbPrivacyPolicyActivity MediaBrowserCompat$ItemReceiver() throws HttpException, IOException;

    void MediaBrowserCompat$ItemReceiver(PrivacyConsentActivity privacyConsentActivity) throws HttpException, IOException;

    void read(PrepaidResetPinSuccessActivity_ViewBinding prepaidResetPinSuccessActivity_ViewBinding) throws HttpException, IOException;

    void write() throws IOException;

    void write(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity) throws HttpException, IOException;

    boolean write(int i) throws IOException;
}

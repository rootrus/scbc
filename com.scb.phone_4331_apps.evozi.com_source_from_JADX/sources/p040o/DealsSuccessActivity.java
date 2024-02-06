package p040o;

import java.io.IOException;
import java.net.Socket;

@Deprecated
/* renamed from: o.DealsSuccessActivity */
public interface DealsSuccessActivity extends PrepaidRequestSuccessActivity, PrivacyManagementLandingActivity_ViewBinding {
    void IconCompatParcelizer(boolean z, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException;

    void MediaBrowserCompat$ItemReceiver(Socket socket, PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, boolean z, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException;

    boolean MediaBrowserCompat$MediaItem();

    Socket RatingCompat();

    void write(Socket socket) throws IOException;
}

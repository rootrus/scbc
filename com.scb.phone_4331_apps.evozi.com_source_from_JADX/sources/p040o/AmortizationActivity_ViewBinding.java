package p040o;

import com.thunderhead.android.infrastructure.server.entitys.Property;
import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import com.thunderhead.connectivity.NetworkOperationError;

/* renamed from: o.AmortizationActivity_ViewBinding */
public class AmortizationActivity_ViewBinding extends CCTermsAndConditionsActivity {
    private int IconCompatParcelizer = 0;

    public void MediaBrowserCompat$ItemReceiver(BaseResponse baseResponse) {
    }

    /* access modifiers changed from: protected */
    public void read() {
    }

    public AmortizationActivity_ViewBinding(String str, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, ConfirmRedemptionActivity confirmRedemptionActivity) {
        super(str, eCouponCommonActivity_ViewBinding, confirmRedemptionActivity);
    }

    public void write(NetworkOperationError networkOperationError) {
        Property[] properties;
        if (networkOperationError != null && networkOperationError.getHttpStatusCode() == 400 && this.read != null && (properties = this.read.MediaBrowserCompat$CustomActionResultReceiver.getProperties()) != null) {
            for (Property property : properties) {
                BaseRequest baseRequest = new BaseRequest(this.read.MediaBrowserCompat$CustomActionResultReceiver.getUri());
                CCAboutActivity cCAboutActivity = new CCAboutActivity("", this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
                baseRequest.setProperties(new Property[]{property});
                this.MediaBrowserCompat$CustomActionResultReceiver.read(new C6437x1b3a90a2(this.read.IconCompatParcelizer, baseRequest, cCAboutActivity, 12));
                this.IconCompatParcelizer++;
            }
        }
    }
}

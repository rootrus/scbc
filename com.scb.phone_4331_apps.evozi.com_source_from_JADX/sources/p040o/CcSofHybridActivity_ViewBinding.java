package p040o;

import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelServicesTabFragment;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p040o.ImmutableSortedMap;

/* renamed from: o.CcSofHybridActivity_ViewBinding */
public final class CcSofHybridActivity_ViewBinding extends ResponseBody {
    /* access modifiers changed from: private */
    public final ResponseBody IconCompatParcelizer;
    private NsipPartnerPaymentOtpActivity MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final read write;

    /* renamed from: o.CcSofHybridActivity_ViewBinding$read */
    public interface read {
        DebitCardResetOtpActivity<PrepaidTravelServicesTabFragment.write> MediaBrowserCompat$ItemReceiver();

        DebitCardResetOtpActivity<PrepaidTravelServicesTabFragment.write> read();

        DebitCardResetOtpActivity<OnStreetViewPanoramaReadyCallback> read(String str);

        DebitCardResetOtpActivity<Boolean> write(ImmutableSortedMap.Values values);
    }

    public final long contentLength() {
        return this.IconCompatParcelizer.contentLength();
    }

    public final MediaType contentType() {
        return this.IconCompatParcelizer.contentType();
    }

    public final NsipPartnerPaymentOtpActivity source() {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            this.MediaBrowserCompat$ItemReceiver = onSubmit.read((HowToAddAccountStep2Activity) new PayNowSuccessActivity(this.IconCompatParcelizer.source()) {
                private long write = 0;

                public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException {
                    long read = super.read(sCBUniversalWebViewActivity, j);
                    this.write += read != -1 ? read : 0;
                    read unused = CcSofHybridActivity_ViewBinding.this.write;
                    CcSofHybridActivity_ViewBinding.this.IconCompatParcelizer.contentLength();
                    return read;
                }
            });
        }
        return this.MediaBrowserCompat$ItemReceiver;
    }
}

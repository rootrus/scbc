package p040o;

import java.io.IOException;

/* renamed from: o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding$MediaBrowserCompat$ItemReceiver */
public final class C6973xe9e3c5f4 implements HowToAddAccountStep2Activity {
    private /* synthetic */ PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding IconCompatParcelizer;
    private /* synthetic */ HowToAddAccountStep2Activity write;

    C6973xe9e3c5f4(PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding, HowToAddAccountStep2Activity howToAddAccountStep2Activity) {
        this.IconCompatParcelizer = partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding;
        this.write = howToAddAccountStep2Activity;
    }

    public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
        this.IconCompatParcelizer.enter();
        try {
            long read = this.write.read(sCBUniversalWebViewActivity, j);
            this.IconCompatParcelizer.exit$jvm(true);
            return read;
        } catch (IOException e) {
            throw this.IconCompatParcelizer.exit$jvm(e);
        } catch (Throwable th) {
            this.IconCompatParcelizer.exit$jvm(false);
            throw th;
        }
    }

    public final void close() {
        this.IconCompatParcelizer.enter();
        try {
            this.write.close();
            this.IconCompatParcelizer.exit$jvm(true);
        } catch (IOException e) {
            throw this.IconCompatParcelizer.exit$jvm(e);
        } catch (Throwable th) {
            this.IconCompatParcelizer.exit$jvm(false);
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AsyncTimeout.source(");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ PinChangeActivity_ViewBinding timeout() {
        return this.IconCompatParcelizer;
    }
}

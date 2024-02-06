package okhttp3.internal.connection;

import p040o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding;

public final class Transmitter$timeout$1 extends PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding {
    final /* synthetic */ Transmitter this$0;

    Transmitter$timeout$1(Transmitter transmitter) {
        this.this$0 = transmitter;
    }

    public final void timedOut() {
        this.this$0.cancel();
    }
}

package p040o;

import p040o.JsonDataEncoderBuilder;

/* renamed from: o.maybeUnNest */
public final /* synthetic */ class maybeUnNest implements Runnable {
    private final /* synthetic */ lambda$component$0 read;

    public /* synthetic */ maybeUnNest(lambda$component$0 lambda_component_0) {
        this.read = lambda_component_0;
    }

    public final void run() {
        lambda$component$0 lambda_component_0 = this.read;
        JsonDataEncoderBuilder.TimestampEncoder timestampEncoder = new JsonDataEncoderBuilder.TimestampEncoder(lambda_component_0);
        if (lambda_component_0.RatingCompat != null) {
            timestampEncoder.IconCompatParcelizer(lambda_component_0.RatingCompat);
        }
    }
}

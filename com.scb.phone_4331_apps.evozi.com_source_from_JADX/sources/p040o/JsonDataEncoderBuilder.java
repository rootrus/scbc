package p040o;

import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.JsonDataEncoderBuilder */
public final /* synthetic */ class JsonDataEncoderBuilder implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ JsonDataEncoderBuilder read = new JsonDataEncoderBuilder();

    private /* synthetic */ JsonDataEncoderBuilder() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((RttiJsonCheck.C1257a) obj).MediaBrowserCompat$CustomActionResultReceiver(Iterables$3$MediaBrowserCompat$MediaItem.bond_landing_title);
    }

    /* renamed from: o.JsonDataEncoderBuilder$TimestampEncoder */
    public final /* synthetic */ class TimestampEncoder implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ lambda$component$0 MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ TimestampEncoder(lambda$component$0 lambda_component_0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = lambda_component_0;
        }

        public final void IconCompatParcelizer(Object obj) {
            lambda$component$0 lambda_component_0 = this.MediaBrowserCompat$CustomActionResultReceiver;
            ((RttiJsonCheck.C12561) obj).MediaBrowserCompat$ItemReceiver(lambda_component_0.MediaBrowserCompat$ItemReceiver, lambda_component_0.MediaBrowserCompat$SearchResultReceiver);
        }
    }
}

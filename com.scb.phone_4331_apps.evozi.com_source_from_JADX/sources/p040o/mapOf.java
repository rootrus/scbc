package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;

/* renamed from: o.mapOf */
public final /* synthetic */ class mapOf implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ mapOf write = new mapOf();

    private /* synthetic */ mapOf() {
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.error((Throwable) new EntityMappingException((String) null, (Throwable) obj));
    }
}

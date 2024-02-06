package p040o;

/* renamed from: o.asFilePayload */
public final class asFilePayload extends CLSUUID {
    public /* synthetic */ asFilePayload(String str) {
        this(Boolean.FALSE, str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private asFilePayload(Boolean bool, String str) {
        super(bool, str);
        onGetStartedClick.write((Object) str, "header");
    }
}

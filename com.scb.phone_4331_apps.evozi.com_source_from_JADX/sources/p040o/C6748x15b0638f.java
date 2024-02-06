package p040o;

/* renamed from: o.FragmentBuilder_BindRiskQuestionnaireFragment$MediaBrowserCompat$ItemReceiver */
public final class C6748x15b0638f extends FragmentBuilder_BindRiskQuestionnaireFragment {
    private final Throwable IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C6748x15b0638f) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((C6748x15b0638f) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        Throwable th = this.IconCompatParcelizer;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaceholderUpdateFailure(throwable=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6748x15b0638f(Throwable th) {
        super((byte) 0);
        onGetStartedClick.write((Object) th, "throwable");
        this.IconCompatParcelizer = th;
    }
}

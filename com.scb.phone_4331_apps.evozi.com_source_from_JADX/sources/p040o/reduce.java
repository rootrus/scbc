package p040o;

/* renamed from: o.reduce */
public final class reduce extends setVar {
    /* access modifiers changed from: protected */
    public final int read(int i) {
        return i < 10000 ? i : i - 10000;
    }

    public reduce(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) {
        super(rsnscriptintrinsiccreate);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }
}

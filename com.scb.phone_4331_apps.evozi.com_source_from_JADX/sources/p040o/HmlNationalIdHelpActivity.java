package p040o;

import java.util.Iterator;

/* renamed from: o.HmlNationalIdHelpActivity */
public abstract class HmlNationalIdHelpActivity implements Iterator<Integer>, FundOnboardingSuccessActivity_ViewBinding {
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int write();

    public /* synthetic */ Object next() {
        return Integer.valueOf(write());
    }
}

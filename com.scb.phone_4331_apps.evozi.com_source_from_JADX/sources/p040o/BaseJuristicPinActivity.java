package p040o;

import java.util.Iterator;

/* renamed from: o.BaseJuristicPinActivity */
public final class BaseJuristicPinActivity<T> implements BaseJuristicPinActivity_ViewBinding<HmlNTBeKYCLandingActivity<? extends T>> {
    final BaseJuristicPinActivity_ViewBinding<T> write;

    /* renamed from: o.BaseJuristicPinActivity$read */
    public static final class read implements Iterator<HmlNTBeKYCLandingActivity<? extends T>>, FundOnboardingSuccessActivity_ViewBinding {
        private int read;
        private final Iterator<T> write;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        read(BaseJuristicPinActivity baseJuristicPinActivity) {
            this.write = baseJuristicPinActivity.write.read();
        }

        public final boolean hasNext() {
            return this.write.hasNext();
        }

        public final /* synthetic */ Object next() {
            int i = this.read;
            this.read = i + 1;
            if (i >= 0) {
                return new HmlNTBeKYCLandingActivity(i, this.write.next());
            }
            throw new ArithmeticException("Index overflow has happened.");
        }
    }

    public BaseJuristicPinActivity(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "sequence");
        this.write = baseJuristicPinActivity_ViewBinding;
    }

    public final Iterator<HmlNTBeKYCLandingActivity<T>> read() {
        return new read(this);
    }
}

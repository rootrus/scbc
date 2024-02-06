package p040o;

import java.util.Iterator;

/* renamed from: o.JuristicSetupNewPinActivity */
public final class JuristicSetupNewPinActivity<T, R> implements BaseJuristicPinActivity_ViewBinding<R> {
    final BaseJuristicPinActivity_ViewBinding<T> read;
    final FundFactSheetActivity<T, R> write;

    /* renamed from: o.JuristicSetupNewPinActivity$write */
    public static final class write implements Iterator<R>, FundOnboardingSuccessActivity_ViewBinding {
        private /* synthetic */ JuristicSetupNewPinActivity read;
        private final Iterator<T> write;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        write(JuristicSetupNewPinActivity juristicSetupNewPinActivity) {
            this.read = juristicSetupNewPinActivity;
            this.write = juristicSetupNewPinActivity.read.read();
        }

        public final R next() {
            return this.read.write.invoke(this.write.next());
        }

        public final boolean hasNext() {
            return this.write.hasNext();
        }
    }

    public JuristicSetupNewPinActivity(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding, FundFactSheetActivity<? super T, ? extends R> fundFactSheetActivity) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "sequence");
        onGetStartedClick.write((Object) fundFactSheetActivity, "transformer");
        this.read = baseJuristicPinActivity_ViewBinding;
        this.write = fundFactSheetActivity;
    }

    public final Iterator<R> read() {
        return new write(this);
    }
}

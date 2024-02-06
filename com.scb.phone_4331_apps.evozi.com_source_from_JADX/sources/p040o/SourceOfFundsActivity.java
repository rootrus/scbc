package p040o;

import java.util.Iterator;

/* renamed from: o.SourceOfFundsActivity */
public final class SourceOfFundsActivity<T> implements onNextButtonClick<T> {
    final int MediaBrowserCompat$ItemReceiver;
    final BaseJuristicPinActivity_ViewBinding<T> write;

    public SourceOfFundsActivity(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding, int i) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "sequence");
        this.write = baseJuristicPinActivity_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = i;
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("count must be non-negative, but was ");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    public final BaseJuristicPinActivity_ViewBinding<T> MediaBrowserCompat$ItemReceiver(int i) {
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        int i3 = i2 + i;
        return i3 < 0 ? new JuristicResetPinOtpActivity<>(this, i) : new JuristicVerifyResetPinActivity<>(this.write, i2, i3);
    }

    /* renamed from: o.SourceOfFundsActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Iterator<T>, FundOnboardingSuccessActivity_ViewBinding {
        private final Iterator<T> IconCompatParcelizer;
        private int read;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        IconCompatParcelizer(SourceOfFundsActivity sourceOfFundsActivity) {
            this.IconCompatParcelizer = sourceOfFundsActivity.write.read();
            this.read = sourceOfFundsActivity.MediaBrowserCompat$ItemReceiver;
        }

        private final void MediaBrowserCompat$ItemReceiver() {
            while (this.read > 0 && this.IconCompatParcelizer.hasNext()) {
                this.IconCompatParcelizer.next();
                this.read--;
            }
        }

        public final T next() {
            MediaBrowserCompat$ItemReceiver();
            return this.IconCompatParcelizer.next();
        }

        public final boolean hasNext() {
            MediaBrowserCompat$ItemReceiver();
            return this.IconCompatParcelizer.hasNext();
        }
    }

    public final Iterator<T> read() {
        return new IconCompatParcelizer(this);
    }
}

package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.JuristicResetPinOtpActivity */
public final class JuristicResetPinOtpActivity<T> implements onNextButtonClick<T> {
    final int MediaBrowserCompat$CustomActionResultReceiver;
    final BaseJuristicPinActivity_ViewBinding<T> write;

    public JuristicResetPinOtpActivity(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding, int i) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "sequence");
        this.write = baseJuristicPinActivity_ViewBinding;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("count must be non-negative, but was ");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    public final BaseJuristicPinActivity_ViewBinding<T> MediaBrowserCompat$ItemReceiver(int i) {
        return i >= this.MediaBrowserCompat$CustomActionResultReceiver ? this : new JuristicResetPinOtpActivity<>(this.write, i);
    }

    /* renamed from: o.JuristicResetPinOtpActivity$read */
    public static final class read implements Iterator<T>, FundOnboardingSuccessActivity_ViewBinding {
        private int IconCompatParcelizer;
        private final Iterator<T> read;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        read(JuristicResetPinOtpActivity juristicResetPinOtpActivity) {
            this.IconCompatParcelizer = juristicResetPinOtpActivity.MediaBrowserCompat$CustomActionResultReceiver;
            this.read = juristicResetPinOtpActivity.write.read();
        }

        public final T next() {
            int i = this.IconCompatParcelizer;
            if (i != 0) {
                this.IconCompatParcelizer = i - 1;
                return this.read.next();
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            return this.IconCompatParcelizer > 0 && this.read.hasNext();
        }
    }

    public final Iterator<T> read() {
        return new read(this);
    }
}

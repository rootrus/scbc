package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.JuristicVerifyResetPinActivity */
public final class JuristicVerifyResetPinActivity<T> implements onNextButtonClick<T> {
    final int MediaBrowserCompat$CustomActionResultReceiver;
    final int MediaBrowserCompat$ItemReceiver;
    final BaseJuristicPinActivity_ViewBinding<T> read;

    public JuristicVerifyResetPinActivity(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding, int i, int i2) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "sequence");
        this.read = baseJuristicPinActivity_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        boolean z = true;
        if (i >= 0) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver >= 0) {
                if (!(this.MediaBrowserCompat$CustomActionResultReceiver < this.MediaBrowserCompat$ItemReceiver ? false : z)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("endIndex should be not less than startIndex, but was ");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                    sb.append(" < ");
                    sb.append(this.MediaBrowserCompat$ItemReceiver);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex should be non-negative, but is ");
            sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("startIndex should be non-negative, but is ");
        sb3.append(this.MediaBrowserCompat$ItemReceiver);
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    /* renamed from: o.JuristicVerifyResetPinActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Iterator<T>, FundOnboardingSuccessActivity_ViewBinding {
        private final Iterator<T> MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ JuristicVerifyResetPinActivity MediaBrowserCompat$ItemReceiver;
        private int read;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        IconCompatParcelizer(JuristicVerifyResetPinActivity juristicVerifyResetPinActivity) {
            this.MediaBrowserCompat$ItemReceiver = juristicVerifyResetPinActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = juristicVerifyResetPinActivity.read.read();
        }

        private final void write() {
            while (this.read < this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver && this.MediaBrowserCompat$CustomActionResultReceiver.hasNext()) {
                this.MediaBrowserCompat$CustomActionResultReceiver.next();
                this.read++;
            }
        }

        public final boolean hasNext() {
            write();
            return this.read < this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver && this.MediaBrowserCompat$CustomActionResultReceiver.hasNext();
        }

        public final T next() {
            write();
            if (this.read < this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                this.read++;
                return this.MediaBrowserCompat$CustomActionResultReceiver.next();
            }
            throw new NoSuchElementException();
        }
    }

    public final Iterator<T> read() {
        return new IconCompatParcelizer(this);
    }

    public final BaseJuristicPinActivity_ViewBinding<T> MediaBrowserCompat$ItemReceiver(int i) {
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = this.MediaBrowserCompat$ItemReceiver;
        return i >= i2 - i3 ? this : new JuristicVerifyResetPinActivity<>(this.read, i3, i + i3);
    }
}

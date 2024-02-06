package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.clickNonCustomer */
public final class clickNonCustomer<T> implements Iterable<T> {
    private T IconCompatParcelizer;
    private DebitCardResetPinSuccessActivity_ViewBinding<T> write;

    public clickNonCustomer(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, T t) {
        this.write = debitCardResetPinSuccessActivity_ViewBinding;
        this.IconCompatParcelizer = t;
    }

    public final Iterator<T> iterator() {
        write write2 = new write(this.IconCompatParcelizer);
        this.write.subscribe(write2);
        return new write.IconCompatParcelizer();
    }

    /* renamed from: o.clickNonCustomer$write */
    static final class write<T> extends HmlConsumerGuidelinesDeepLinkPushActivity<T> {
        volatile Object MediaBrowserCompat$CustomActionResultReceiver;

        write(T t) {
            this.MediaBrowserCompat$CustomActionResultReceiver = HmlCaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(t);
        }

        public final void onComplete() {
            this.MediaBrowserCompat$CustomActionResultReceiver = HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver = HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver(th);
        }

        public final void onNext(T t) {
            this.MediaBrowserCompat$CustomActionResultReceiver = HmlCaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(t);
        }

        /* renamed from: o.clickNonCustomer$write$IconCompatParcelizer */
        final class IconCompatParcelizer implements Iterator<T> {
            private Object read;

            IconCompatParcelizer() {
            }

            public final boolean hasNext() {
                Object obj = write.this.MediaBrowserCompat$CustomActionResultReceiver;
                this.read = obj;
                return !HmlCaptureDocumentActivity.read(obj);
            }

            public final T next() {
                Object obj = null;
                try {
                    if (this.read == null) {
                        obj = write.this.MediaBrowserCompat$CustomActionResultReceiver;
                    }
                    if (HmlCaptureDocumentActivity.read(this.read)) {
                        throw new NoSuchElementException();
                    } else if (!HmlCaptureDocumentActivity.write(this.read)) {
                        T MediaBrowserCompat$CustomActionResultReceiver = HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver(this.read);
                        this.read = obj;
                        return MediaBrowserCompat$CustomActionResultReceiver;
                    } else {
                        throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(HmlCaptureDocumentActivity.IconCompatParcelizer(this.read));
                    }
                } finally {
                    this.read = obj;
                }
            }

            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }
    }
}

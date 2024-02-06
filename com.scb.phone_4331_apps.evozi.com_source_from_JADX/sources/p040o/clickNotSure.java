package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.clickNotSure */
public final class clickNotSure<T> implements Iterable<T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<T> read;

    public clickNotSure(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        this.read = debitCardResetPinSuccessActivity_ViewBinding;
    }

    public final Iterator<T> iterator() {
        write write2 = new write();
        DebitCardResetOtpActivity.wrap(this.read).materialize().subscribe(write2);
        return write2;
    }

    /* renamed from: o.clickNotSure$write */
    static final class write<T> extends HmlETBBusinessInformationActivity<DebitCardResetPinActivity<T>> implements Iterator<T> {
        private Semaphore IconCompatParcelizer = new Semaphore(0);
        private DebitCardResetPinActivity<T> MediaBrowserCompat$CustomActionResultReceiver;
        private AtomicReference<DebitCardResetPinActivity<T>> write = new AtomicReference<>();

        public final void onComplete() {
        }

        write() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            if (this.write.getAndSet((DebitCardResetPinActivity) obj) == null) {
                this.IconCompatParcelizer.release();
            }
        }

        public final void onError(Throwable th) {
            AlertController$RecycleListView.read.read(th);
        }

        public final boolean hasNext() {
            DebitCardResetPinActivity<T> debitCardResetPinActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            Throwable th = null;
            if (debitCardResetPinActivity == null || !HmlCaptureDocumentActivity.write(debitCardResetPinActivity.MediaBrowserCompat$ItemReceiver)) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                    try {
                        boolean z = AlertController$RecycleListView.read.read;
                        this.IconCompatParcelizer.acquire();
                        DebitCardResetPinActivity<T> andSet = this.write.getAndSet((Object) null);
                        this.MediaBrowserCompat$CustomActionResultReceiver = andSet;
                        if (HmlCaptureDocumentActivity.write(andSet.MediaBrowserCompat$ItemReceiver)) {
                            Object obj = andSet.MediaBrowserCompat$ItemReceiver;
                            if (HmlCaptureDocumentActivity.write(obj)) {
                                th = HmlCaptureDocumentActivity.IconCompatParcelizer(obj);
                            }
                            throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
                        }
                    } catch (InterruptedException e) {
                        dispose();
                        this.MediaBrowserCompat$CustomActionResultReceiver = DebitCardResetPinActivity.MediaBrowserCompat$CustomActionResultReceiver(e);
                        throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(e);
                    }
                }
                Object obj2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                return obj2 != null && !HmlCaptureDocumentActivity.write(obj2);
            }
            Object obj3 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            if (HmlCaptureDocumentActivity.write(obj3)) {
                th = HmlCaptureDocumentActivity.IconCompatParcelizer(obj3);
            }
            throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
        }

        public final T next() {
            T t;
            if (hasNext()) {
                DebitCardResetPinActivity<T> debitCardResetPinActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                Object obj = debitCardResetPinActivity.MediaBrowserCompat$ItemReceiver;
                if (obj == null || HmlCaptureDocumentActivity.write(obj)) {
                    t = null;
                } else {
                    t = debitCardResetPinActivity.MediaBrowserCompat$ItemReceiver;
                }
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                return t;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }
}

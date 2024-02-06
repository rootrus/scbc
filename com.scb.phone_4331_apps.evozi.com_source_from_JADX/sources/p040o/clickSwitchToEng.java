package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.clickSwitchToEng */
public final class clickSwitchToEng<T> implements Iterable<T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<T> IconCompatParcelizer;

    public clickSwitchToEng(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        this.IconCompatParcelizer = debitCardResetPinSuccessActivity_ViewBinding;
    }

    public final Iterator<T> iterator() {
        return new read(this.IconCompatParcelizer, new clickSwitchToEng$MediaBrowserCompat$CustomActionResultReceiver());
    }

    /* renamed from: o.clickSwitchToEng$read */
    static final class read<T> implements Iterator<T> {
        private Throwable IconCompatParcelizer;
        private T MediaBrowserCompat$CustomActionResultReceiver;
        private boolean MediaBrowserCompat$ItemReceiver = true;
        private final clickSwitchToEng$MediaBrowserCompat$CustomActionResultReceiver<T> MediaBrowserCompat$MediaItem;
        private boolean MediaDescriptionCompat;
        private final DebitCardResetPinSuccessActivity_ViewBinding<T> read;
        private boolean write = true;

        read(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, clickSwitchToEng$MediaBrowserCompat$CustomActionResultReceiver<T> clickswitchtoeng_mediabrowsercompat_customactionresultreceiver) {
            this.read = debitCardResetPinSuccessActivity_ViewBinding;
            this.MediaBrowserCompat$MediaItem = clickswitchtoeng_mediabrowsercompat_customactionresultreceiver;
        }

        public final boolean hasNext() {
            Throwable th = this.IconCompatParcelizer;
            if (th != null) {
                throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
            } else if (!this.MediaBrowserCompat$ItemReceiver) {
                return false;
            } else {
                if (!this.write || MediaBrowserCompat$CustomActionResultReceiver()) {
                    return true;
                }
                return false;
            }
        }

        private boolean MediaBrowserCompat$CustomActionResultReceiver() {
            boolean z = true;
            if (!this.MediaDescriptionCompat) {
                this.MediaDescriptionCompat = true;
                this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver.set(1);
                new EasycashBaseIntroductionActivity(this.read).subscribe(this.MediaBrowserCompat$MediaItem);
            }
            try {
                clickSwitchToEng$MediaBrowserCompat$CustomActionResultReceiver<T> clickswitchtoeng_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$MediaItem;
                clickswitchtoeng_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.set(1);
                boolean z2 = AlertController$RecycleListView.read.read;
                DebitCardResetPinActivity take = clickswitchtoeng_mediabrowsercompat_customactionresultreceiver.read.take();
                Object obj = take.MediaBrowserCompat$ItemReceiver;
                T t = null;
                if (obj != null && !HmlCaptureDocumentActivity.write(obj)) {
                    this.write = false;
                    Object obj2 = take.MediaBrowserCompat$ItemReceiver;
                    if (obj2 != null && !HmlCaptureDocumentActivity.write(obj2)) {
                        t = take.MediaBrowserCompat$ItemReceiver;
                    }
                    this.MediaBrowserCompat$CustomActionResultReceiver = t;
                    return true;
                }
                this.MediaBrowserCompat$ItemReceiver = false;
                if (take.MediaBrowserCompat$ItemReceiver != null) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                Object obj3 = take.MediaBrowserCompat$ItemReceiver;
                if (HmlCaptureDocumentActivity.write(obj3)) {
                    t = HmlCaptureDocumentActivity.IconCompatParcelizer(obj3);
                }
                this.IconCompatParcelizer = t;
                throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(t);
            } catch (InterruptedException e) {
                this.MediaBrowserCompat$MediaItem.dispose();
                this.IconCompatParcelizer = e;
                throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(e);
            }
        }

        public final T next() {
            Throwable th = this.IconCompatParcelizer;
            if (th != null) {
                throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
            } else if (hasNext()) {
                this.write = true;
                return this.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                throw new NoSuchElementException("No more elements");
            }
        }

        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }
}

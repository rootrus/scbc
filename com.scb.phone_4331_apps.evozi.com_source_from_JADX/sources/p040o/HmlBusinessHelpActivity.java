package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.HmlBusinessHelpActivity */
public abstract class HmlBusinessHelpActivity<T> implements Iterator<T>, FundOnboardingSuccessActivity_ViewBinding {
    private HmlNdidNationalIdInputPresenterModule MediaBrowserCompat$CustomActionResultReceiver = HmlNdidNationalIdInputPresenterModule.NotReady;
    private T MediaBrowserCompat$ItemReceiver;

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$CustomActionResultReceiver();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != HmlNdidNationalIdInputPresenterModule.Failed) {
            int i = HmlBusinessIndustrySelectionActivity.IconCompatParcelizer[this.MediaBrowserCompat$CustomActionResultReceiver.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                this.MediaBrowserCompat$CustomActionResultReceiver = HmlNdidNationalIdInputPresenterModule.Failed;
                MediaBrowserCompat$CustomActionResultReceiver();
                if (this.MediaBrowserCompat$CustomActionResultReceiver != HmlNdidNationalIdInputPresenterModule.Ready) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.MediaBrowserCompat$CustomActionResultReceiver = HmlNdidNationalIdInputPresenterModule.NotReady;
            return this.MediaBrowserCompat$ItemReceiver;
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(T t) {
        this.MediaBrowserCompat$ItemReceiver = t;
        this.MediaBrowserCompat$CustomActionResultReceiver = HmlNdidNationalIdInputPresenterModule.Ready;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaBrowserCompat$CustomActionResultReceiver = HmlNdidNationalIdInputPresenterModule.Done;
    }
}

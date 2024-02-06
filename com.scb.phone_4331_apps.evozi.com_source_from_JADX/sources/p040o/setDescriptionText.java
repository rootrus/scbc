package p040o;

import java.util.Arrays;
import p043rx.exceptions.CompositeException;
import p043rx.exceptions.OnCompletedFailedException;
import p043rx.exceptions.OnErrorFailedException;
import p043rx.exceptions.UnsubscribeFailedException;

/* renamed from: o.setDescriptionText */
public final class setDescriptionText<T> extends CustomCheckboxGroupView_ViewBinding<T> {
    private final CustomCheckboxGroupView_ViewBinding<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private boolean write = false;

    public setDescriptionText(CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding) {
        super(customCheckboxGroupView_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = customCheckboxGroupView_ViewBinding;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!this.write) {
            this.write = true;
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
                try {
                    write();
                    return;
                } catch (Throwable th) {
                    setIvAvatar.IconCompatParcelizer(th);
                }
            } catch (Throwable th2) {
                setIvAvatar.IconCompatParcelizer(th2);
            }
        } else {
            return;
        }
        throw new OnCompletedFailedException(th.getMessage(), th);
        throw new UnsubscribeFailedException(th.getMessage(), th);
    }

    public final void IconCompatParcelizer(Throwable th) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(th);
        if (!this.write) {
            this.write = true;
            try {
                DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver();
            } catch (Throwable th2) {
                setIvAvatar.IconCompatParcelizer(th2);
            }
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(th);
                try {
                    write();
                    return;
                } catch (RuntimeException e) {
                    DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver();
                } catch (Throwable th3) {
                    setIvAvatar.IconCompatParcelizer(th3);
                }
            } catch (Throwable th4) {
                try {
                    DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver();
                } catch (Throwable th5) {
                    setIvAvatar.IconCompatParcelizer(th5);
                }
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(new Throwable[]{th, th, th4})));
            }
        } else {
            return;
        }
        throw new OnErrorFailedException(e);
        write();
        throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(new Throwable[]{th, th})));
    }

    public final void IconCompatParcelizer(T t) {
        try {
            if (!this.write) {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(t);
            }
        } catch (Throwable th) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(th);
            IconCompatParcelizer(th);
        }
    }
}

package p040o;

import p043rx.exceptions.OnErrorThrowable;

/* renamed from: o.setFilledIconRes$MediaBrowserCompat$CustomActionResultReceiver */
final class setFilledIconRes$MediaBrowserCompat$CustomActionResultReceiver<T> extends CustomCheckboxGroupView_ViewBinding<T> {
    private CustomCheckboxGroupView_ViewBinding<? super T> IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private setInnerColors<? super T, Boolean> write;

    public setFilledIconRes$MediaBrowserCompat$CustomActionResultReceiver(CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding, setInnerColors<? super T, Boolean> setinnercolors) {
        this.IconCompatParcelizer = customCheckboxGroupView_ViewBinding;
        this.write = setinnercolors;
        MediaBrowserCompat$CustomActionResultReceiver(0);
    }

    public final void IconCompatParcelizer(T t) {
        try {
            if (this.write.MediaBrowserCompat$CustomActionResultReceiver(t).booleanValue()) {
                this.IconCompatParcelizer.IconCompatParcelizer(t);
            } else {
                MediaBrowserCompat$CustomActionResultReceiver(1);
            }
        } catch (Throwable th) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(th);
            write();
            IconCompatParcelizer(OnErrorThrowable.write(th, t));
        }
    }

    public final void IconCompatParcelizer(Throwable th) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            try {
                DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver();
            } catch (Throwable th2) {
                setIvAvatar.IconCompatParcelizer(th2);
            }
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            this.IconCompatParcelizer.IconCompatParcelizer(th);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void write(ColorChangeableNumberPicker colorChangeableNumberPicker) {
        super.write(colorChangeableNumberPicker);
        this.IconCompatParcelizer.write(colorChangeableNumberPicker);
    }
}

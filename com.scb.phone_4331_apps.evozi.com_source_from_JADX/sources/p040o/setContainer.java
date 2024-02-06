package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import p043rx.exceptions.OnErrorThrowable;

/* renamed from: o.setContainer */
public final class setContainer<T> extends AtomicInteger implements ColorChangeableNumberPicker {
    private CustomCheckboxGroupView_ViewBinding<? super T> IconCompatParcelizer;
    private T MediaBrowserCompat$ItemReceiver;

    public setContainer(CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding) {
        this.IconCompatParcelizer = customCheckboxGroupView_ViewBinding;
    }

    public final void write(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        } else if (i != 0) {
            do {
                int i2 = get();
                if (i2 != 0) {
                    if (i2 == 1 && compareAndSet(1, 3)) {
                        write(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver);
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(T t) {
        do {
            int i = get();
            if (i == 0) {
                this.MediaBrowserCompat$ItemReceiver = t;
            } else if (i == 2 && compareAndSet(2, 3)) {
                write(this.IconCompatParcelizer, t);
                return;
            } else {
                return;
            }
        } while (!compareAndSet(0, 1));
    }

    private static <T> void write(CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding, T t) {
        if (!customCheckboxGroupView_ViewBinding.read.read) {
            try {
                customCheckboxGroupView_ViewBinding.IconCompatParcelizer(t);
                if (!customCheckboxGroupView_ViewBinding.read.read) {
                    customCheckboxGroupView_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(th);
                customCheckboxGroupView_ViewBinding.IconCompatParcelizer(OnErrorThrowable.write(th, t));
            }
        }
    }
}

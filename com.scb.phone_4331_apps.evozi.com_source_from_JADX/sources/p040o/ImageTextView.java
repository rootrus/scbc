package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p040o.CameraApi2$CameraHardwareNotSupportException;
import p040o.CameraSource;
import p043rx.exceptions.OnErrorThrowable;

/* renamed from: o.ImageTextView */
public final class ImageTextView<T> extends CameraSource.CameraSourceException<T> {
    static {
        DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().IconCompatParcelizer();
        System.getProperty("rx.just.strong-mode", "false");
    }

    public final CameraSource.CameraSourceException<T> MediaBrowserCompat$CustomActionResultReceiver(final CameraApi2$CameraHardwareNotSupportException cameraApi2$CameraHardwareNotSupportException) {
        setInnerColors setinnercolors;
        if (cameraApi2$CameraHardwareNotSupportException instanceof CustomExternalSelector_ViewBinding) {
            final CustomExternalSelector_ViewBinding customExternalSelector_ViewBinding = (CustomExternalSelector_ViewBinding) cameraApi2$CameraHardwareNotSupportException;
            setinnercolors = new setInnerColors<setImageWidth, CustomDoubleCircleBorderView>() {
                public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
                    return CustomExternalSelector_ViewBinding.this.read.get().write().read((setImageWidth) obj, -1, TimeUnit.NANOSECONDS);
                }
            };
        } else {
            setinnercolors = new setInnerColors<setImageWidth, CustomDoubleCircleBorderView>() {
                public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
                    final setImageWidth setimagewidth = (setImageWidth) obj;
                    final CameraApi2$CameraHardwareNotSupportException.write IconCompatParcelizer2 = CameraApi2$CameraHardwareNotSupportException.this.IconCompatParcelizer();
                    IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(new setImageWidth() {
                        public final void IconCompatParcelizer() {
                            try {
                                setImageWidth.this.IconCompatParcelizer();
                            } finally {
                                IconCompatParcelizer2.write();
                            }
                        }
                    });
                    return IconCompatParcelizer2;
                }
            };
        }
        return new CameraSource.CameraSourceException<>(setDetailText.IconCompatParcelizer(new ImageTextView$MediaBrowserCompat$CustomActionResultReceiver(null, setinnercolors)));
    }

    /* renamed from: o.ImageTextView$write */
    static final class write<T> extends AtomicBoolean implements ColorChangeableNumberPicker, setImageWidth {
        private setInnerColors<setImageWidth, CustomDoubleCircleBorderView> IconCompatParcelizer;
        private CustomCheckboxGroupView_ViewBinding<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        private T read;

        public write(CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding, T t, setInnerColors<setImageWidth, CustomDoubleCircleBorderView> setinnercolors) {
            this.MediaBrowserCompat$CustomActionResultReceiver = customCheckboxGroupView_ViewBinding;
            this.read = t;
            this.IconCompatParcelizer = setinnercolors;
        }

        public final void write(long j) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("n >= 0 required but it was ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (i != 0 && compareAndSet(false, true)) {
                this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this));
            }
        }

        public final void IconCompatParcelizer() {
            CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (!customCheckboxGroupView_ViewBinding.read.read) {
                T t = this.read;
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

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ScalarAsyncProducer[");
            sb.append(this.read);
            sb.append(", ");
            sb.append(get());
            sb.append("]");
            return sb.toString();
        }
    }
}

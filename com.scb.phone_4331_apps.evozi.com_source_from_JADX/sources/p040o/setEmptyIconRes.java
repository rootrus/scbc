package p040o;

import p040o.CameraApi2$CameraHardwareNotSupportException;
import p040o.CameraSource;

/* renamed from: o.setEmptyIconRes */
public final class setEmptyIconRes<T> implements CameraSource.CameraSourceException.write<T> {
    private CameraApi2$CameraHardwareNotSupportException IconCompatParcelizer;
    final CameraSource.CameraSourceException<T> MediaBrowserCompat$CustomActionResultReceiver;

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        final CustomCheckboxGroupView_ViewBinding customCheckboxGroupView_ViewBinding = (CustomCheckboxGroupView_ViewBinding) obj;
        final CameraApi2$CameraHardwareNotSupportException.write IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer();
        customCheckboxGroupView_ViewBinding.read.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2);
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(new setImageWidth() {
            public final void IconCompatParcelizer() {
                final Thread currentThread = Thread.currentThread();
                setEmptyIconRes.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(new CustomCheckboxGroupView_ViewBinding<T>(customCheckboxGroupView_ViewBinding) {
                    public final void IconCompatParcelizer(T t) {
                        customCheckboxGroupView_ViewBinding.IconCompatParcelizer(t);
                    }

                    public final void IconCompatParcelizer(Throwable th) {
                        try {
                            customCheckboxGroupView_ViewBinding.IconCompatParcelizer(th);
                        } finally {
                            IconCompatParcelizer2.write();
                        }
                    }

                    public final void MediaBrowserCompat$CustomActionResultReceiver() {
                        try {
                            customCheckboxGroupView_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
                        } finally {
                            IconCompatParcelizer2.write();
                        }
                    }

                    public final void write(final ColorChangeableNumberPicker colorChangeableNumberPicker) {
                        customCheckboxGroupView_ViewBinding.write(new ColorChangeableNumberPicker() {
                            public final void write(final long j) {
                                if (currentThread == Thread.currentThread()) {
                                    colorChangeableNumberPicker.write(j);
                                } else {
                                    IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(new setImageWidth() {
                                        public final void IconCompatParcelizer() {
                                            colorChangeableNumberPicker.write(j);
                                        }
                                    });
                                }
                            }
                        });
                    }
                });
            }
        });
    }

    public setEmptyIconRes(CameraSource.CameraSourceException<T> cameraSourceException, CameraApi2$CameraHardwareNotSupportException cameraApi2$CameraHardwareNotSupportException) {
        this.IconCompatParcelizer = cameraApi2$CameraHardwareNotSupportException;
        this.MediaBrowserCompat$CustomActionResultReceiver = cameraSourceException;
    }
}

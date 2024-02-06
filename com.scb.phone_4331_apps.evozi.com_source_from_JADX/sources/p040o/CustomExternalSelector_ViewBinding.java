package p040o;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p040o.CameraApi2$CameraHardwareNotSupportException;
import p040o.CustomInformationList;

/* renamed from: o.CustomExternalSelector_ViewBinding */
public final class CustomExternalSelector_ViewBinding extends CameraApi2$CameraHardwareNotSupportException implements CustomInformationList_ViewBinding {
    private static int IconCompatParcelizer;
    private static C6408x8e4bbfc9 MediaBrowserCompat$CustomActionResultReceiver = new C6408x8e4bbfc9((ThreadFactory) null, 0);
    static final C6409x3591e258 write;
    private ThreadFactory MediaBrowserCompat$ItemReceiver;
    public final AtomicReference<C6408x8e4bbfc9> read = new AtomicReference<>(MediaBrowserCompat$CustomActionResultReceiver);

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        IconCompatParcelizer = intValue;
        C6409x3591e258 customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver = new C6409x3591e258(setDrawableBitmap.MediaBrowserCompat$ItemReceiver);
        write = customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver;
        customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver.write = true;
        customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.shutdownNow();
        setSelectedTextView.read(customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
    }

    public CustomExternalSelector_ViewBinding(ThreadFactory threadFactory) {
        this.MediaBrowserCompat$ItemReceiver = threadFactory;
        C6408x8e4bbfc9 customExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = new C6408x8e4bbfc9(this.MediaBrowserCompat$ItemReceiver, IconCompatParcelizer);
        if (!this.read.compareAndSet(MediaBrowserCompat$CustomActionResultReceiver, customExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver)) {
            customExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final CameraApi2$CameraHardwareNotSupportException.write IconCompatParcelizer() {
        return new write(this.read.get().write());
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        C6408x8e4bbfc9 customExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver;
        C6408x8e4bbfc9 customExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2;
        do {
            customExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = this.read.get();
            customExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver;
            if (customExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver == customExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2) {
                return;
            }
        } while (!this.read.compareAndSet(customExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, customExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2));
        for (C6409x3591e258 customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver : customExternalSelector_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) {
            customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver.write = true;
            customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.shutdownNow();
            setSelectedTextView.MediaBrowserCompat$CustomActionResultReceiver.remove(customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.CustomExternalSelector_ViewBinding$write */
    static class write extends CameraApi2$CameraHardwareNotSupportException.write {
        private final setIconBottom IconCompatParcelizer;
        private final DraggableFloatingActionButton MediaBrowserCompat$CustomActionResultReceiver = new DraggableFloatingActionButton();
        final DraggableFloatingActionButton MediaBrowserCompat$ItemReceiver;
        private final C6409x3591e258 read;

        write(C6409x3591e258 customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver) {
            setIconBottom seticonbottom = new setIconBottom();
            this.IconCompatParcelizer = seticonbottom;
            this.MediaBrowserCompat$ItemReceiver = new DraggableFloatingActionButton(this.MediaBrowserCompat$CustomActionResultReceiver, seticonbottom);
            this.read = customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver;
        }

        public final void write() {
            this.MediaBrowserCompat$ItemReceiver.write();
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            return this.MediaBrowserCompat$ItemReceiver.read;
        }

        public final CustomDoubleCircleBorderView MediaBrowserCompat$ItemReceiver(final setImageWidth setimagewidth) {
            if (this.MediaBrowserCompat$ItemReceiver.read) {
                return setAddButton.MediaBrowserCompat$ItemReceiver();
            }
            C6409x3591e258 customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver = this.read;
            C64062 r1 = new setImageWidth() {
                public final void IconCompatParcelizer() {
                    if (!write.this.MediaBrowserCompat$ItemReceiver.read) {
                        setimagewidth.IconCompatParcelizer();
                    }
                }
            };
            DraggableFloatingActionButton draggableFloatingActionButton = this.MediaBrowserCompat$CustomActionResultReceiver;
            CustomInformationList customInformationList = new CustomInformationList(ImageAndTextAdBannerView_ViewBinding.write(r1), draggableFloatingActionButton);
            draggableFloatingActionButton.MediaBrowserCompat$ItemReceiver(customInformationList);
            customInformationList.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(new CustomInformationList.read(customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.submit(customInformationList)));
            return customInformationList;
        }

        public final CustomDoubleCircleBorderView IconCompatParcelizer(final setImageWidth setimagewidth, long j, TimeUnit timeUnit) {
            Future future;
            if (this.MediaBrowserCompat$ItemReceiver.read) {
                return setAddButton.MediaBrowserCompat$ItemReceiver();
            }
            C6409x3591e258 customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver = this.read;
            C64073 r1 = new setImageWidth() {
                public final void IconCompatParcelizer() {
                    if (!write.this.MediaBrowserCompat$ItemReceiver.read) {
                        setimagewidth.IconCompatParcelizer();
                    }
                }
            };
            setIconBottom seticonbottom = this.IconCompatParcelizer;
            CustomInformationList customInformationList = new CustomInformationList(ImageAndTextAdBannerView_ViewBinding.write(r1), seticonbottom);
            seticonbottom.MediaBrowserCompat$ItemReceiver(customInformationList);
            if (j <= 0) {
                future = customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.submit(customInformationList);
            } else {
                future = customExternalSelector_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.schedule(customInformationList, j, timeUnit);
            }
            customInformationList.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(new CustomInformationList.read(future));
            return customInformationList;
        }
    }
}

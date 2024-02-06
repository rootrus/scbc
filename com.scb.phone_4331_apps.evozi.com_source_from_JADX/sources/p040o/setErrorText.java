package p040o;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p040o.CameraApi2$CameraHardwareNotSupportException;
import p040o.CameraSource;
import p040o.set;
import p043rx.exceptions.MissingBackpressureException;

/* renamed from: o.setErrorText */
public final class setErrorText<T> implements CameraSource.CameraSourceException.IconCompatParcelizer<T, T> {
    private final CameraApi2$CameraHardwareNotSupportException IconCompatParcelizer;
    private final boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    private final int MediaBrowserCompat$ItemReceiver;

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        CustomCheckboxGroupView_ViewBinding customCheckboxGroupView_ViewBinding = (CustomCheckboxGroupView_ViewBinding) obj;
        CameraApi2$CameraHardwareNotSupportException cameraApi2$CameraHardwareNotSupportException = this.IconCompatParcelizer;
        if ((cameraApi2$CameraHardwareNotSupportException instanceof setIconArrow) || (cameraApi2$CameraHardwareNotSupportException instanceof setBottomViewVisibility)) {
            return customCheckboxGroupView_ViewBinding;
        }
        read read2 = new read(cameraApi2$CameraHardwareNotSupportException, customCheckboxGroupView_ViewBinding, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
        CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding2 = read2.MediaBrowserCompat$CustomActionResultReceiver;
        customCheckboxGroupView_ViewBinding2.write(new ColorChangeableNumberPicker() {
            public final void write(long j) {
                long j2;
                long j3;
                if (j > 0) {
                    AtomicLong atomicLong = read.this.MediaBrowserCompat$ItemReceiver;
                    do {
                        j2 = atomicLong.get();
                        j3 = j2 + j;
                        if (j3 < 0) {
                            j3 = Long.MAX_VALUE;
                        }
                    } while (!atomicLong.compareAndSet(j2, j3));
                    read read = read.this;
                    if (read.write.getAndIncrement() == 0) {
                        read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(read);
                    }
                }
            }
        });
        customCheckboxGroupView_ViewBinding2.read.MediaBrowserCompat$ItemReceiver(read2.IconCompatParcelizer);
        customCheckboxGroupView_ViewBinding2.read.MediaBrowserCompat$ItemReceiver(read2);
        return read2;
    }

    public setErrorText(CameraApi2$CameraHardwareNotSupportException cameraApi2$CameraHardwareNotSupportException, boolean z, int i) {
        this.IconCompatParcelizer = cameraApi2$CameraHardwareNotSupportException;
        this.MediaBrowserCompat$ItemReceiver = i <= 0 ? CustomProfileImageView_ViewBinding.IconCompatParcelizer : i;
    }

    /* renamed from: o.setErrorText$read */
    static final class read<T> extends CustomCheckboxGroupView_ViewBinding<T> implements setImageWidth {
        final CameraApi2$CameraHardwareNotSupportException.write IconCompatParcelizer;
        final CustomCheckboxGroupView_ViewBinding<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        final AtomicLong MediaBrowserCompat$ItemReceiver = new AtomicLong();
        private volatile boolean MediaBrowserCompat$MediaItem;
        private long MediaBrowserCompat$SearchResultReceiver;
        private int MediaDescriptionCompat;
        private Throwable MediaMetadataCompat;
        private Queue<Object> MediaSessionCompat$Token;
        private boolean RatingCompat;
        final AtomicLong write = new AtomicLong();

        public read(CameraApi2$CameraHardwareNotSupportException cameraApi2$CameraHardwareNotSupportException, CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding, boolean z, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = customCheckboxGroupView_ViewBinding;
            this.IconCompatParcelizer = cameraApi2$CameraHardwareNotSupportException.IconCompatParcelizer();
            this.RatingCompat = z;
            set.Cdefault.IconCompatParcelizer();
            i = i <= 0 ? CustomProfileImageView_ViewBinding.IconCompatParcelizer : i;
            this.MediaDescriptionCompat = i - (i >> 2);
            if (setCloseButton.MediaBrowserCompat$CustomActionResultReceiver()) {
                this.MediaSessionCompat$Token = new setMaxLines(i);
            } else {
                this.MediaSessionCompat$Token = new setOnSnapPositionChangeListener(i);
            }
            MediaBrowserCompat$CustomActionResultReceiver((long) i);
        }

        public final void IconCompatParcelizer(T t) {
            if (!MediaBrowserCompat$ItemReceiver() && !this.MediaBrowserCompat$MediaItem) {
                if (!this.MediaSessionCompat$Token.offer(set.Cdefault.MediaBrowserCompat$CustomActionResultReceiver(t))) {
                    IconCompatParcelizer((Throwable) new MissingBackpressureException());
                } else if (this.write.getAndIncrement() == 0) {
                    this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this);
                }
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            if (!MediaBrowserCompat$ItemReceiver() && !this.MediaBrowserCompat$MediaItem) {
                this.MediaBrowserCompat$MediaItem = true;
                if (this.write.getAndIncrement() == 0) {
                    this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this);
                }
            }
        }

        public final void IconCompatParcelizer(Throwable th) {
            if (MediaBrowserCompat$ItemReceiver() || this.MediaBrowserCompat$MediaItem) {
                DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver();
                return;
            }
            this.MediaMetadataCompat = th;
            this.MediaBrowserCompat$MediaItem = true;
            if (this.write.getAndIncrement() == 0) {
                this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this);
            }
        }

        public final void IconCompatParcelizer() {
            int i;
            long j;
            long j2;
            long j3 = this.MediaBrowserCompat$SearchResultReceiver;
            Queue<Object> queue = this.MediaSessionCompat$Token;
            CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
            long j4 = 1;
            do {
                long j5 = this.MediaBrowserCompat$ItemReceiver.get();
                while (true) {
                    i = (j5 > j3 ? 1 : (j5 == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.MediaBrowserCompat$MediaItem;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!write(z, z2, customCheckboxGroupView_ViewBinding, queue)) {
                        if (z2) {
                            break;
                        }
                        customCheckboxGroupView_ViewBinding.IconCompatParcelizer(set.Cdefault.write(poll));
                        j3++;
                        if (j3 == ((long) this.MediaDescriptionCompat)) {
                            AtomicLong atomicLong = this.MediaBrowserCompat$ItemReceiver;
                            do {
                                j = atomicLong.get();
                                j2 = Long.MAX_VALUE;
                                if (j == Long.MAX_VALUE) {
                                    break;
                                }
                                j2 = j - j3;
                                if (j2 < 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("More produced than requested: ");
                                    sb.append(j2);
                                    throw new IllegalStateException(sb.toString());
                                }
                            } while (!atomicLong.compareAndSet(j, j2));
                            j5 = j2;
                            MediaBrowserCompat$CustomActionResultReceiver(j3);
                            j3 = 0;
                        }
                    } else {
                        return;
                    }
                }
                if (i != 0 || !write(this.MediaBrowserCompat$MediaItem, queue.isEmpty(), customCheckboxGroupView_ViewBinding, queue)) {
                    this.MediaBrowserCompat$SearchResultReceiver = j3;
                    j4 = this.write.addAndGet(-j4);
                } else {
                    return;
                }
            } while (j4 != 0);
        }

        private boolean write(boolean z, boolean z2, CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding, Queue<Object> queue) {
            if (customCheckboxGroupView_ViewBinding.MediaBrowserCompat$ItemReceiver()) {
                queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.RatingCompat) {
                    Throwable th = this.MediaMetadataCompat;
                    if (th != null) {
                        queue.clear();
                        try {
                            customCheckboxGroupView_ViewBinding.IconCompatParcelizer(th);
                            return true;
                        } finally {
                            this.IconCompatParcelizer.write();
                        }
                    } else if (!z2) {
                        return false;
                    } else {
                        try {
                            customCheckboxGroupView_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
                            return true;
                        } finally {
                            this.IconCompatParcelizer.write();
                        }
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.MediaMetadataCompat;
                    if (th2 != null) {
                        try {
                            customCheckboxGroupView_ViewBinding.IconCompatParcelizer(th2);
                        } catch (Throwable th3) {
                            this.IconCompatParcelizer.write();
                            throw th3;
                        }
                    } else {
                        customCheckboxGroupView_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                    this.IconCompatParcelizer.write();
                    return false;
                }
            }
        }
    }
}

package p040o;

import android.os.Build;
import com.scb.phone.domain.errors.RetrofitException;
import okhttp3.internal.cache.DiskLruCache;
import p040o.Suppliers;
import p040o.access$2300;
import p040o.writeUInt32;

/* renamed from: o.KtaServiceCaller */
public final /* synthetic */ class KtaServiceCaller {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[binaryImagesJsonFromMapsFile.values().length];
        IconCompatParcelizer = iArr;
        iArr[binaryImagesJsonFromMapsFile.NEW_REGISTRATION.ordinal()] = 1;
        IconCompatParcelizer[binaryImagesJsonFromMapsFile.FORGOT_PIN.ordinal()] = 2;
    }

    /* renamed from: o.KtaServiceCaller$JOB_TYPE */
    public class JOB_TYPE extends writeUInt32<C7535ub> {
        /* access modifiers changed from: private */
        public final Splitter IconCompatParcelizer;
        private final Suppliers.SupplierFunction MediaBrowserCompat$MediaItem;
        private final setUserPropertyInternal MediaBrowserCompat$SearchResultReceiver;
        /* access modifiers changed from: private */
        public final getInheritableThreadLocalsField write;

        @HmlPinActivity
        public JOB_TYPE(RegularImmutableBiMap regularImmutableBiMap, performActionWithResponse performactionwithresponse, FileBackedOutputStream fileBackedOutputStream, Suppliers.SupplierFunction supplierFunction, Splitter splitter, setUserPropertyInternal setuserpropertyinternal, getInheritableThreadLocalsField getinheritablethreadlocalsfield) {
            super(performactionwithresponse, regularImmutableBiMap, fileBackedOutputStream);
            this.MediaBrowserCompat$MediaItem = supplierFunction;
            this.MediaBrowserCompat$SearchResultReceiver = setuserpropertyinternal;
            this.IconCompatParcelizer = splitter;
            this.write = getinheritablethreadlocalsfield;
        }

        public final void IconCompatParcelizer() {
            super.IconCompatParcelizer();
            UseVideoChangedEvent useVideoChangedEvent = UseVideoChangedEvent.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat != null) {
                useVideoChangedEvent.IconCompatParcelizer(this.RatingCompat);
            }
        }

        static /* synthetic */ void write(C7535ub ubVar) {
            ubVar.mo13712Q_();
            ubVar.MediaBrowserCompat$ItemReceiver(4);
            ubVar.MediaBrowserCompat$CustomActionResultReceiver(false);
        }

        static /* synthetic */ void write(JOB_TYPE job_type) {
            if (job_type.RatingCompat != null) {
                job_type.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void read(JOB_TYPE job_type) {
            if (job_type.RatingCompat != null) {
                job_type.RatingCompat.aj_();
            }
        }

        public final void write(String str) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver.RatingCompat.IconCompatParcelizer(), Build.BRAND, Build.MODEL, Build.VERSION.RELEASE, this.MediaBrowserCompat$SearchResultReceiver.RatingCompat.MediaBrowserCompat$ItemReceiver() ? DiskLruCache.VERSION_1 : "0", str, this.MediaBrowserCompat$ItemReceiver);
            this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<getAmbientEnabled>() {
                public final /* synthetic */ void onNext(Object obj) {
                    getAmbientEnabled getambientenabled = (getAmbientEnabled) obj;
                    super.onNext(getambientenabled);
                    JOB_TYPE.write(JOB_TYPE.this);
                    boolean z = true;
                    if (getambientenabled.MediaBrowserCompat$CustomActionResultReceiver) {
                        JOB_TYPE job_type = JOB_TYPE.this;
                        PreviewImageReadyBusEvent previewImageReadyBusEvent = new PreviewImageReadyBusEvent(getambientenabled);
                        if (job_type.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            previewImageReadyBusEvent.IconCompatParcelizer(job_type.RatingCompat);
                            return;
                        }
                        return;
                    }
                    JOB_TYPE.this.IconCompatParcelizer.read();
                    JOB_TYPE.this.IconCompatParcelizer.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver());
                    JOB_TYPE job_type2 = JOB_TYPE.this;
                    deleteBitmap deletebitmap = new deleteBitmap(this, getambientenabled);
                    if (job_type2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        deletebitmap.IconCompatParcelizer(job_type2.RatingCompat);
                    }
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    if (!JOB_TYPE.this.MediaBrowserCompat$SearchResultReceiver(th) && (th instanceof RetrofitException)) {
                        RetrofitException retrofitException = (RetrofitException) th;
                        if (!(retrofitException.IconCompatParcelizer == null || retrofitException.IconCompatParcelizer.write == null)) {
                            String str = retrofitException.IconCompatParcelizer.write.IconCompatParcelizer;
                            JOB_TYPE.read(JOB_TYPE.this);
                            char c = 65535;
                            boolean z = false;
                            switch (str.hashCode()) {
                                case 1507489:
                                    if (str.equals("1024")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 1567011:
                                    if (str.equals("3006")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 1567012:
                                    if (str.equals("3007")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                            }
                            if (c == 0) {
                                JOB_TYPE job_type = JOB_TYPE.this;
                                RealtimeVideoEvent realtimeVideoEvent = new RealtimeVideoEvent(th);
                                if (job_type.RatingCompat != null) {
                                    z = true;
                                }
                                if (z) {
                                    realtimeVideoEvent.IconCompatParcelizer(job_type.RatingCompat);
                                    return;
                                }
                                return;
                            } else if (c == 1 || c == 2) {
                                JOB_TYPE.this.MediaBrowserCompat$ItemReceiver(JOB_TYPE.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new LevelChangedEvent(this)));
                                return;
                            } else {
                                JOB_TYPE.this.MediaBrowserCompat$ItemReceiver(JOB_TYPE.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                                return;
                            }
                        }
                    }
                    JOB_TYPE.this.MediaBrowserCompat$ItemReceiver(JOB_TYPE.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            });
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            boolean z = true;
            if (this.read == writeUInt32.read.CONFIRM) {
                SetFocusAreasRequestBusEvent setFocusAreasRequestBusEvent = SetFocusAreasRequestBusEvent.IconCompatParcelizer;
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    setFocusAreasRequestBusEvent.IconCompatParcelizer(this.RatingCompat);
                }
            }
            super.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            boolean z = true;
            if (this.read == writeUInt32.read.NEW) {
                C4976mp mpVar = C4976mp.MediaBrowserCompat$ItemReceiver;
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    mpVar.IconCompatParcelizer(this.RatingCompat);
                }
            }
            super.MediaBrowserCompat$ItemReceiver();
        }
    }
}

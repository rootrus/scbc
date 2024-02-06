package p040o;

import p040o.access$2300;

/* renamed from: o.getDetectorBasedCropper */
public class getDetectorBasedCropper extends writeUInt64NoTag<KtaCheckExtractor> {
    public String IconCompatParcelizer;
    public final attachInfo MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final skipBytes MediaDescriptionCompat;
    public final FinalizableReferenceQueue read;
    public boolean write = false;

    @HmlPinActivity
    public getDetectorBasedCropper(RegularImmutableBiMap regularImmutableBiMap, FinalizableReferenceQueue finalizableReferenceQueue, attachInfo attachinfo, getInfoWindowAnchorU getinfowindowanchoru, skipBytes skipbytes) {
        super(regularImmutableBiMap);
        this.read = finalizableReferenceQueue;
        this.MediaBrowserCompat$ItemReceiver = attachinfo;
        this.MediaDescriptionCompat = skipbytes;
    }

    /* renamed from: o.getDetectorBasedCropper$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<addPolyline> {
        public final void onComplete() {
        }

        private read() {
        }

        public /* synthetic */ read(getDetectorBasedCropper getdetectorbasedcropper, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            addPolyline addpolyline = (addPolyline) obj;
            boolean unused = getDetectorBasedCropper.this.write = addpolyline.write;
            boolean z = true;
            if (getDetectorBasedCropper.this.RatingCompat != null) {
                getDetectorBasedCropper getdetectorbasedcropper = getDetectorBasedCropper.this;
                getCreditCardParameters getcreditcardparameters = new getCreditCardParameters(this, addpolyline);
                if (getdetectorbasedcropper.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getcreditcardparameters.IconCompatParcelizer(getdetectorbasedcropper.RatingCompat);
                }
            }
            getDetectorBasedCropper.MediaBrowserCompat$ItemReceiver(getDetectorBasedCropper.this);
        }

        public final void onError(Throwable th) {
            if (!getDetectorBasedCropper.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                boolean z = true;
                if (getDetectorBasedCropper.this.RatingCompat != null) {
                    getDetectorBasedCropper.this.MediaBrowserCompat$ItemReceiver(getDetectorBasedCropper.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                    getDetectorBasedCropper getdetectorbasedcropper = getDetectorBasedCropper.this;
                    getCheckParameters getcheckparameters = getCheckParameters.IconCompatParcelizer;
                    if (getdetectorbasedcropper.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getcheckparameters.IconCompatParcelizer(getdetectorbasedcropper.RatingCompat);
                    }
                }
            }
            getDetectorBasedCropper.read(getDetectorBasedCropper.this);
        }
    }

    /* renamed from: o.getDetectorBasedCropper$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onEnterAmbient> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(getDetectorBasedCropper getdetectorbasedcropper, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            onEnterAmbient onenterambient = (onEnterAmbient) obj;
            boolean z = true;
            if (getDetectorBasedCropper.this.RatingCompat != null) {
                getDetectorBasedCropper getdetectorbasedcropper = getDetectorBasedCropper.this;
                getBarCodeCaptureView getbarcodecaptureview = new getBarCodeCaptureView(this, onenterambient);
                if (getdetectorbasedcropper.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getbarcodecaptureview.IconCompatParcelizer(getdetectorbasedcropper.RatingCompat);
                }
            }
            getDetectorBasedCropper.MediaBrowserCompat$CustomActionResultReceiver(getDetectorBasedCropper.this);
        }

        public final void onError(Throwable th) {
            if (!getDetectorBasedCropper.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                boolean z = true;
                if (getDetectorBasedCropper.this.RatingCompat != null) {
                    getDetectorBasedCropper.this.MediaBrowserCompat$ItemReceiver(getDetectorBasedCropper.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                    getDetectorBasedCropper getdetectorbasedcropper = getDetectorBasedCropper.this;
                    getCheckParameters getcheckparameters = getCheckParameters.IconCompatParcelizer;
                    if (getdetectorbasedcropper.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getcheckparameters.IconCompatParcelizer(getdetectorbasedcropper.RatingCompat);
                    }
                }
            }
            getDetectorBasedCropper.write(getDetectorBasedCropper.this);
        }
    }

    static /* synthetic */ void write(getDetectorBasedCropper getdetectorbasedcropper) {
        if (getdetectorbasedcropper.RatingCompat != null) {
            getdetectorbasedcropper.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getDetectorBasedCropper getdetectorbasedcropper) {
        if (getdetectorbasedcropper.RatingCompat != null) {
            getdetectorbasedcropper.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(getDetectorBasedCropper getdetectorbasedcropper) {
        if (getdetectorbasedcropper.RatingCompat != null) {
            getdetectorbasedcropper.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getDetectorBasedCropper getdetectorbasedcropper) {
        if (getdetectorbasedcropper.RatingCompat != null) {
            getdetectorbasedcropper.RatingCompat.ay_();
        }
    }
}

package p040o;

import java.util.List;
import p040o.CrashlyticsCore;
import p040o.GeofencingRequest;
import p040o.Sets;
import p040o.getMicrAmount;

/* renamed from: o.getCropTetragon */
public abstract class getCropTetragon extends writeUInt64NoTag<getMicrAmount.RatingCompat> {
    public markInitializationComplete IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final Sets.SetFromMap MediaBrowserCompat$ItemReceiver;
    public final StreetViewPanoramaLink read;
    /* access modifiers changed from: private */
    public getTriggeringLocation write;

    /* access modifiers changed from: protected */
    public abstract String IconCompatParcelizer();

    /* access modifiers changed from: protected */
    public abstract List<CrashlyticsCore.C32473> MediaBrowserCompat$ItemReceiver();

    /* access modifiers changed from: protected */
    public abstract List<GeofencingRequest.Builder> MediaBrowserCompat$ItemReceiver(getTriggeringLocation gettriggeringlocation);

    public getCropTetragon(StreetViewPanoramaLink streetViewPanoramaLink, Sets.SetFromMap setFromMap, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.read = streetViewPanoramaLink;
        this.MediaBrowserCompat$ItemReceiver = setFromMap;
    }

    /* renamed from: o.getCropTetragon$read */
    final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getTriggeringLocation> {
        private read() {
        }

        /* synthetic */ read(getCropTetragon getcroptetragon, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getTriggeringLocation gettriggeringlocation = (getTriggeringLocation) obj;
            getTriggeringLocation unused = getCropTetragon.this.write = gettriggeringlocation;
            boolean z = true;
            if (getCropTetragon.this.RatingCompat != null) {
                getCropTetragon getcroptetragon = getCropTetragon.this;
                getcroptetragon.IconCompatParcelizer = getcroptetragon.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(gettriggeringlocation, getCropTetragon.this.read.IconCompatParcelizer.setItemInvoker());
                if (getCropTetragon.this.MediaBrowserCompat$ItemReceiver(gettriggeringlocation).size() == 0) {
                    getCropTetragon getcroptetragon2 = getCropTetragon.this;
                    setCropCornerColor setcropcornercolor = setCropCornerColor.write;
                    if (getcroptetragon2.RatingCompat != null) {
                        setcropcornercolor.IconCompatParcelizer(getcroptetragon2.RatingCompat);
                    }
                } else {
                    getCropTetragon getcroptetragon3 = getCropTetragon.this;
                    getIpResults getipresults = new getIpResults(this);
                    if (getcroptetragon3.RatingCompat != null) {
                        getipresults.IconCompatParcelizer(getcroptetragon3.RatingCompat);
                    }
                }
            }
            getCropTetragon getcroptetragon4 = getCropTetragon.this;
            getRetainImage getretainimage = getRetainImage.MediaBrowserCompat$ItemReceiver;
            if (getcroptetragon4.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getretainimage.IconCompatParcelizer(getcroptetragon4.RatingCompat);
            }
        }

        public final void onComplete() {
            getCropTetragon.write(getCropTetragon.this);
            getCropTetragon getcroptetragon = getCropTetragon.this;
            getNonNullIpResults getnonnullipresults = getNonNullIpResults.IconCompatParcelizer;
            if (getcroptetragon.RatingCompat != null) {
                getnonnullipresults.IconCompatParcelizer(getcroptetragon.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            getCropTetragon.read(getCropTetragon.this);
            boolean z = true;
            if ((getCropTetragon.this.RatingCompat != null) && !getCropTetragon.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                getCropTetragon getcroptetragon = getCropTetragon.this;
                C3966aC aCVar = new C3966aC(this, th);
                if (getcroptetragon.RatingCompat != null) {
                    aCVar.IconCompatParcelizer(getcroptetragon.RatingCompat);
                }
                getCropTetragon getcroptetragon2 = getCropTetragon.this;
                getcroptetragon2.IconCompatParcelizer = getcroptetragon2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(getCropTetragon.this.write, getCropTetragon.this.read.IconCompatParcelizer.setItemInvoker());
                getCropTetragon getcroptetragon3 = getCropTetragon.this;
                if (getcroptetragon3.MediaBrowserCompat$ItemReceiver(getcroptetragon3.write).size() == 0) {
                    getCropTetragon getcroptetragon4 = getCropTetragon.this;
                    setCropCornerColor setcropcornercolor = setCropCornerColor.write;
                    if (getcroptetragon4.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setcropcornercolor.IconCompatParcelizer(getcroptetragon4.RatingCompat);
                        return;
                    }
                    return;
                }
                getCropTetragon getcroptetragon5 = getCropTetragon.this;
                storeGlobalBitmap storeglobalbitmap = new storeGlobalBitmap(this);
                if (getcroptetragon5.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    storeglobalbitmap.IconCompatParcelizer(getcroptetragon5.RatingCompat);
                }
            }
        }

        public final /* synthetic */ void write(getMicrAmount.RatingCompat ratingCompat) {
            ratingCompat.read(getCropTetragon.this.MediaBrowserCompat$ItemReceiver());
        }

        public final /* synthetic */ void IconCompatParcelizer(getMicrAmount.RatingCompat ratingCompat) {
            ratingCompat.read(getCropTetragon.this.MediaBrowserCompat$ItemReceiver());
        }
    }

    /* renamed from: o.getCropTetragon$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getTriggeringLocation> {
        private write() {
        }

        public /* synthetic */ write(getCropTetragon getcroptetragon, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getTriggeringLocation gettriggeringlocation = (getTriggeringLocation) obj;
            getTriggeringLocation unused = getCropTetragon.this.write = gettriggeringlocation;
            boolean z = true;
            if (getCropTetragon.this.RatingCompat != null) {
                getCropTetragon getcroptetragon = getCropTetragon.this;
                getcroptetragon.IconCompatParcelizer = getcroptetragon.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(gettriggeringlocation, getCropTetragon.this.read.IconCompatParcelizer.setItemInvoker());
                if (getCropTetragon.this.MediaBrowserCompat$ItemReceiver(gettriggeringlocation).size() == 0) {
                    getCropTetragon getcroptetragon2 = getCropTetragon.this;
                    setCropCornerColor setcropcornercolor = setCropCornerColor.write;
                    if (getcroptetragon2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setcropcornercolor.IconCompatParcelizer(getcroptetragon2.RatingCompat);
                        return;
                    }
                    return;
                }
                getCropTetragon getcroptetragon3 = getCropTetragon.this;
                getBitmapFromURL getbitmapfromurl = new getBitmapFromURL(this);
                if (getcroptetragon3.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getbitmapfromurl.IconCompatParcelizer(getcroptetragon3.RatingCompat);
                }
            }
        }

        public final void onComplete() {
            getCropTetragon.MediaMetadataCompat(getCropTetragon.this);
        }

        public final void onError(Throwable th) {
            getCropTetragon.MediaBrowserCompat$ItemReceiver(getCropTetragon.this);
            boolean z = true;
            if ((getCropTetragon.this.RatingCompat != null) && !getCropTetragon.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                getCropTetragon getcroptetragon = getCropTetragon.this;
                setCropCornerColor setcropcornercolor = setCropCornerColor.write;
                if (getcroptetragon.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    setcropcornercolor.IconCompatParcelizer(getcroptetragon.RatingCompat);
                }
            }
        }

        public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getMicrAmount.RatingCompat ratingCompat) {
            ratingCompat.read(getCropTetragon.this.MediaBrowserCompat$ItemReceiver());
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getCropTetragon getcroptetragon) {
        if (getcroptetragon.RatingCompat != null) {
            getcroptetragon.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void write(getCropTetragon getcroptetragon) {
        if (getcroptetragon.RatingCompat != null) {
            getcroptetragon.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void read(getCropTetragon getcroptetragon) {
        if (getcroptetragon.RatingCompat != null) {
            getcroptetragon.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaMetadataCompat(getCropTetragon getcroptetragon) {
        if (getcroptetragon.RatingCompat != null) {
            getcroptetragon.RatingCompat.ay_();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        StreetViewPanoramaLink streetViewPanoramaLink = this.read;
        EnumBiMap MediaBrowserCompat$ItemReceiver2 = EnumBiMap.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver().get(i).MediaDescriptionCompat;
        MediaBrowserCompat$ItemReceiver2.write = MediaBrowserCompat$ItemReceiver().get(i).MediaSessionCompat$ResultReceiverWrapper;
        MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver().get(i).Keep;
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver().get(i).MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$ItemReceiver2.read = IconCompatParcelizer();
        streetViewPanoramaLink.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2);
        this.read.IconCompatParcelizer(new read(this, (byte) 0));
    }
}

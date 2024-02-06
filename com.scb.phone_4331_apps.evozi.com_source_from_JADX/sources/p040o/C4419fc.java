package p040o;

import p040o.FileBackedOutputStream;
import p040o.MapDifference;
import p040o.access$2300;

/* renamed from: o.fc */
public class C4419fc extends writeUInt64NoTag<getAdditionalTopScanLinesHeight> {
    /* access modifiers changed from: package-private */
    public getCores IconCompatParcelizer;
    /* access modifiers changed from: package-private */
    public getArch MediaBrowserCompat$ItemReceiver;
    final MapDifference.ValueDifference MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: package-private */
    public getDiskSpace MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: package-private */
    public Throwable MediaDescriptionCompat;
    final SignedBytes MediaMetadataCompat;
    /* access modifiers changed from: private */
    public boolean MediaSessionCompat$QueueItem = false;
    /* access modifiers changed from: private */
    public final FileBackedOutputStream.MemoryOutput MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public final deleteRecursively MediaSessionCompat$Token;
    /* access modifiers changed from: private */
    public final FileBackedOutputStream.C33622 ParcelableVolumeInfo;
    public int read = -1;
    public final setConditionalUserPropertyAs write;

    @HmlPinActivity
    public C4419fc(setConditionalUserPropertyAs setconditionaluserpropertyas, RegularImmutableBiMap regularImmutableBiMap, FileBackedOutputStream.C33622 r3, FileBackedOutputStream.MemoryOutput memoryOutput, deleteRecursively deleterecursively, SignedBytes signedBytes, MapDifference.ValueDifference valueDifference) {
        super(regularImmutableBiMap);
        this.write = setconditionaluserpropertyas;
        this.ParcelableVolumeInfo = r3;
        this.MediaSessionCompat$ResultReceiverWrapper = memoryOutput;
        this.MediaSessionCompat$Token = deleterecursively;
        this.MediaMetadataCompat = signedBytes;
        this.MediaBrowserCompat$MediaItem = valueDifference;
    }

    public void onDestroy() {
        super.onDestroy();
        setConditionalUserPropertyAs setconditionaluserpropertyas = this.write;
        if (!setconditionaluserpropertyas.MediaBrowserCompat$MediaItem.isDisposed()) {
            setconditionaluserpropertyas.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    public final void IconCompatParcelizer() {
        this.read = 3;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.write.MediaBrowserCompat$ItemReceiver();
        this.write.IconCompatParcelizer(new fc$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0));
    }

    /* renamed from: o.fc$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setOnPolylineClickListener> {
        public final void onComplete() {
        }

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(C4419fc fcVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4419fc fcVar = C4419fc.this;
            deleteRecursively unused = fcVar.MediaSessionCompat$Token;
            getDiskSpace unused2 = fcVar.MediaBrowserCompat$SearchResultReceiver = deleteRecursively.write((setOnPolylineClickListener) obj);
            if (C4419fc.this.MediaSessionCompat$QueueItem) {
                C4419fc.MediaDescriptionCompat(C4419fc.this);
            } else {
                C4419fc.MediaBrowserCompat$SearchResultReceiver(C4419fc.this);
            }
        }

        public final void onError(Throwable th) {
            if (C4419fc.this.MediaSessionCompat$QueueItem) {
                C4419fc fcVar = C4419fc.this;
                C9936fU fUVar = C9936fU.MediaBrowserCompat$ItemReceiver;
                if (fcVar.RatingCompat != null) {
                    fUVar.IconCompatParcelizer(fcVar.RatingCompat);
                    return;
                }
                return;
            }
            Throwable unused = C4419fc.this.MediaDescriptionCompat = th;
            getDiskSpace unused2 = C4419fc.this.MediaBrowserCompat$SearchResultReceiver = new getDiskSpace();
            C4419fc.this.MediaBrowserCompat$SearchResultReceiver.Keep = setOnMyLocationChangeListener.ERROR;
            C4419fc.MediaBrowserCompat$SearchResultReceiver(C4419fc.this);
        }
    }

    /* renamed from: o.fc$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setOnMyLocationButtonClickListener> {
        public final void onComplete() {
        }

        private read() {
        }

        public /* synthetic */ read(C4419fc fcVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4419fc fcVar = C4419fc.this;
            getArch unused = fcVar.MediaBrowserCompat$ItemReceiver = fcVar.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver((setOnMyLocationButtonClickListener) obj, true);
            if (C4419fc.this.MediaSessionCompat$QueueItem) {
                C4419fc.MediaDescriptionCompat(C4419fc.this);
            } else {
                C4419fc.MediaBrowserCompat$SearchResultReceiver(C4419fc.this);
            }
        }

        public final void onError(Throwable th) {
            C4419fc.this.MediaBrowserCompat$ItemReceiver(C4419fc.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(C4419fc fcVar) {
        fcVar.write.MediaBrowserCompat$ItemReceiver();
        fcVar.write.IconCompatParcelizer(new fc$MediaBrowserCompat$CustomActionResultReceiver(fcVar, (byte) 0));
    }

    static /* synthetic */ void MediaDescriptionCompat(C4419fc fcVar) {
        boolean z = false;
        if (fcVar.RatingCompat != null) {
            fcVar.RatingCompat.aj_();
        }
        int i = fcVar.read;
        if (i == 0) {
            if (fcVar.RatingCompat != null) {
                if (fcVar.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat == setOnMyLocationChangeListener.NORMAL) {
                    C4412fY fYVar = new C4412fY(fcVar);
                    if (fcVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        fYVar.IconCompatParcelizer(fcVar.RatingCompat);
                    }
                } else if (fcVar.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat == setOnMyLocationChangeListener.WITHOUT_PRE_REQUISITE) {
                    C4422ff ffVar = C4422ff.read;
                    if (fcVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        ffVar.IconCompatParcelizer(fcVar.RatingCompat);
                    }
                } else {
                    C4420fd fdVar = C4420fd.read;
                    if (fcVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        fdVar.IconCompatParcelizer(fcVar.RatingCompat);
                    }
                }
            }
            fcVar.MediaBrowserCompat$ItemReceiver = null;
        } else if (i == 1) {
            if (fcVar.RatingCompat != null) {
                if (fcVar.IconCompatParcelizer.MediaDescriptionCompat == setOnMyLocationChangeListener.NORMAL) {
                    C4418fb fbVar = new C4418fb(fcVar);
                    if (fcVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        fbVar.IconCompatParcelizer(fcVar.RatingCompat);
                    }
                } else if (fcVar.IconCompatParcelizer.MediaDescriptionCompat == setOnMyLocationChangeListener.WITHOUT_PRE_REQUISITE) {
                    C4423fg fgVar = C4423fg.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fcVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        fgVar.IconCompatParcelizer(fcVar.RatingCompat);
                    }
                } else {
                    C4421fe feVar = C4421fe.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fcVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        feVar.IconCompatParcelizer(fcVar.RatingCompat);
                    }
                }
            }
            fcVar.IconCompatParcelizer = null;
        } else if (i == 2) {
            if (fcVar.RatingCompat != null) {
                if (fcVar.MediaBrowserCompat$SearchResultReceiver.Keep == setOnMyLocationChangeListener.NORMAL) {
                    C4409fV fVVar = new C4409fV(fcVar);
                    if (fcVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        fVVar.IconCompatParcelizer(fcVar.RatingCompat);
                    }
                } else if (fcVar.MediaBrowserCompat$SearchResultReceiver.Keep == setOnMyLocationChangeListener.WITHOUT_PRE_REQUISITE) {
                    C4408fT fTVar = C4408fT.write;
                    if (fcVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        fTVar.IconCompatParcelizer(fcVar.RatingCompat);
                    }
                } else if (fcVar.MediaBrowserCompat$SearchResultReceiver.Keep == setOnMyLocationChangeListener.ERROR) {
                    Throwable th = fcVar.MediaDescriptionCompat;
                    int i2 = Iterables$3$MediaBrowserCompat$MediaItem.setup_quick_top_up;
                    C4413fZ fZVar = new C4413fZ(fcVar);
                    RegularImmutableBiMap regularImmutableBiMap = fcVar.MediaBrowserCompat$CustomActionResultReceiver;
                    access$2300 access_2300 = new access$2300();
                    access_2300.MediaBrowserCompat$ItemReceiver = regularImmutableBiMap.MediaBrowserCompat$CustomActionResultReceiver.getString(i2);
                    access_2300.read = access$2300.write.CUSTOM;
                    access_2300.MediaBrowserCompat$CustomActionResultReceiver = fZVar;
                    access$2200 MediaBrowserCompat$ItemReceiver2 = regularImmutableBiMap.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                    MediaBrowserCompat$ItemReceiver2.write = access_2300;
                    fcVar.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
                } else {
                    C4407fS fSVar = C4407fS.IconCompatParcelizer;
                    if (fcVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        fSVar.IconCompatParcelizer(fcVar.RatingCompat);
                    }
                }
            }
            fcVar.MediaBrowserCompat$SearchResultReceiver = null;
        } else if (i == 3) {
            C4406fR fRVar = C4406fR.IconCompatParcelizer;
            if (fcVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                fRVar.IconCompatParcelizer(fcVar.RatingCompat);
            }
        }
    }
}

package p040o;

import java.util.NoSuchElementException;
import p040o.C3085x7c929f5b;
import p040o.CrashlyticsReport;
import p040o.FileBackedOutputStream;
import p040o.LogFileManager;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.er */
public class C4382er extends writeUInt64NoTag<getLeftEdgeTearWidth> {
    public final access$210 IconCompatParcelizer;
    /* access modifiers changed from: package-private */
    public getArch MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final FileBackedOutputStream.MemoryOutput MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final doStartService MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public final FileBackedOutputStream.C33622 read;
    /* access modifiers changed from: package-private */
    public getCores write;

    @HmlPinActivity
    public C4382er(doStartService dostartservice, FileBackedOutputStream.MemoryOutput memoryOutput, FileBackedOutputStream.C33622 r3, RegularImmutableBiMap regularImmutableBiMap, access$210 access_210) {
        super(regularImmutableBiMap);
        this.read = r3;
        this.MediaBrowserCompat$SearchResultReceiver = memoryOutput;
        this.MediaDescriptionCompat = dostartservice;
        this.IconCompatParcelizer = access_210;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z, writeUInt64NoTag.IconCompatParcelizer<getLeftEdgeTearWidth> iconCompatParcelizer) {
        boolean z2 = true;
        if (!z || this.MediaDescriptionCompat.IconCompatParcelizer.setShortcut()) {
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        C4354eV eVVar = C4354eV.write;
        if (this.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            eVVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    /* renamed from: o.er$2 */
    static /* synthetic */ class C43832 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.getGeoDataClient[] r0 = p040o.getGeoDataClient.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.getGeoDataClient r1 = p040o.getGeoDataClient.BILLERTOPUP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.BILLERPAYMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.FAVOURITE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.QUICKBALANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x003e }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.QUICKPROMPTPAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.BILLERSCAN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.TRANSFER     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.getGeoDataClient r1 = p040o.getGeoDataClient.DEEPLINK     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4382er.C43832.<clinit>():void");
        }
    }

    private void MediaBrowserCompat$ItemReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        onInfoWindowClick oninfowindowclick;
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver2 = discardoldlogfiles_mediabrowsercompat_itemreceiver;
        doStartService dostartservice = this.MediaDescriptionCompat;
        CrashlyticsReport.Session.Event.Application.Builder builder = discardoldlogfiles_mediabrowsercompat_itemreceiver2.setHasDecor;
        onInfoWindowLongClick oninfowindowlongclick = new onInfoWindowLongClick();
        oninfowindowlongclick.MediaBrowserCompat$MediaItem = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(builder.MediaSessionCompat$QueueItem).doubleValue();
        oninfowindowlongclick.AlertController$RecycleListView = builder.PlaybackStateCompat;
        oninfowindowlongclick.ActionMenuItemView = builder.setCheckable;
        oninfowindowlongclick.setBackgroundResource = builder.AppCompatActivity;
        oninfowindowlongclick.MediaBrowserCompat$ItemReceiver = builder.MediaDescriptionCompat;
        oninfowindowlongclick.AppCompatDialogFragment = builder.read();
        oninfowindowlongclick.Keep = builder.setHasDecor;
        oninfowindowlongclick.setContentView = builder.MediaBrowserCompat$CustomActionResultReceiver();
        oninfowindowlongclick.AppCompatDelegateImpl$ListMenuDecorView = builder.AppCompatDialogFragment;
        oninfowindowlongclick.AppCompatViewInflater = builder.setBackgroundResource;
        oninfowindowlongclick.setChecked = builder.setContentView;
        oninfowindowlongclick.MediaBrowserCompat$CustomActionResultReceiver = builder.MediaBrowserCompat$MediaItem;
        oninfowindowlongclick.write = builder.RatingCompat;
        oninfowindowlongclick.MediaSessionCompat$Token = builder.AlertController$RecycleListView;
        oninfowindowlongclick.PlaybackStateCompat = builder.Keep;
        oninfowindowlongclick.ParcelableVolumeInfo = builder.MediaSessionCompat$Token;
        oninfowindowlongclick.MediaBrowserCompat$SearchResultReceiver = builder.MediaSessionCompat$ResultReceiverWrapper;
        oninfowindowlongclick.RatingCompat = builder.MediaMetadataCompat;
        oninfowindowlongclick.MediaSessionCompat$ResultReceiverWrapper = builder.ParcelableVolumeInfo;
        C3085x7c929f5b.Builder builder2 = builder.MediaBrowserCompat$SearchResultReceiver;
        if (builder2 == null) {
            oninfowindowclick = null;
        } else {
            oninfowindowclick = new onInfoWindowClick(builder2.setHasDecor, builder2.MediaBrowserCompat$CustomActionResultReceiver, builder2.read, builder2.MediaBrowserCompat$ItemReceiver, builder2.Keep, builder2.AlertController$RecycleListView, builder2.MediaBrowserCompat$SearchResultReceiver, builder2.MediaSessionCompat$QueueItem, builder2.MediaSessionCompat$ResultReceiverWrapper, builder2.RatingCompat, builder2.MediaDescriptionCompat, builder2.write, builder2.IconCompatParcelizer, builder2.PlaybackStateCompat$CustomAction, builder2.f2676x50fd9e4a, builder2.MediaMetadataCompat, builder2.MediaSessionCompat$Token, builder2.MediaBrowserCompat$MediaItem, builder2.ParcelableVolumeInfo);
        }
        oninfowindowlongclick.read = oninfowindowclick;
        dostartservice.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(oninfowindowlongclick);
        boolean z = true;
        if ("REMITTANCE".equals(discardoldlogfiles_mediabrowsercompat_itemreceiver2.setHasDecor.PlaybackStateCompat)) {
            C4360ea eaVar = C4360ea.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                eaVar.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        C4371ej ejVar = C4371ej.read;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            ejVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    private static onInfoWindowLongClick write(isSupportFragmentClass<CrashlyticsReport.Session.Event.Application.Builder> issupportfragmentclass, isSupportFragmentClass<LogFileManager.C35981> issupportfragmentclass2) {
        double d;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z;
        onInfoWindowLongClick oninfowindowlongclick = new onInfoWindowLongClick();
        boolean z2 = true;
        if (issupportfragmentclass2.IconCompatParcelizer != null) {
            T t = issupportfragmentclass2.IconCompatParcelizer;
            if (t != null) {
                d = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(((LogFileManager.C35981) t).read).doubleValue();
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            d = 0.0d;
        }
        oninfowindowlongclick.MediaBrowserCompat$MediaItem = d;
        String str12 = "";
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t2 = issupportfragmentclass.IconCompatParcelizer;
            if (t2 != null) {
                str = ((CrashlyticsReport.Session.Event.Application.Builder) t2).PlaybackStateCompat;
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            str = str12;
        }
        oninfowindowlongclick.AlertController$RecycleListView = str;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t3 = issupportfragmentclass.IconCompatParcelizer;
            if (t3 != null) {
                str2 = ((CrashlyticsReport.Session.Event.Application.Builder) t3).setCheckable;
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            str2 = str12;
        }
        oninfowindowlongclick.ActionMenuItemView = str2;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t4 = issupportfragmentclass.IconCompatParcelizer;
            if (t4 != null) {
                str3 = ((CrashlyticsReport.Session.Event.Application.Builder) t4).AppCompatActivity;
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            str3 = str12;
        }
        oninfowindowlongclick.setBackgroundResource = str3;
        if (issupportfragmentclass2.IconCompatParcelizer != null) {
            T t5 = issupportfragmentclass2.IconCompatParcelizer;
            if (t5 != null) {
                str4 = ((LogFileManager.C35981) t5).MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            str4 = str12;
        }
        oninfowindowlongclick.MediaBrowserCompat$ItemReceiver = str4;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t6 = issupportfragmentclass.IconCompatParcelizer;
            if (t6 != null) {
                str5 = ((CrashlyticsReport.Session.Event.Application.Builder) t6).read();
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            str5 = str12;
        }
        oninfowindowlongclick.AppCompatDialogFragment = str5;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t7 = issupportfragmentclass.IconCompatParcelizer;
            if (t7 != null) {
                i = ((CrashlyticsReport.Session.Event.Application.Builder) t7).setHasDecor.intValue();
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            i = 0;
        }
        oninfowindowlongclick.Keep = Integer.valueOf(i);
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t8 = issupportfragmentclass.IconCompatParcelizer;
            if (t8 != null) {
                str6 = ((CrashlyticsReport.Session.Event.Application.Builder) t8).MediaBrowserCompat$CustomActionResultReceiver();
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            str6 = str12;
        }
        oninfowindowlongclick.setContentView = str6;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t9 = issupportfragmentclass.IconCompatParcelizer;
            if (t9 != null) {
                str7 = ((CrashlyticsReport.Session.Event.Application.Builder) t9).AppCompatDialogFragment;
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            str7 = str12;
        }
        oninfowindowlongclick.AppCompatDelegateImpl$ListMenuDecorView = str7;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t10 = issupportfragmentclass.IconCompatParcelizer;
            if (t10 != null) {
                str8 = ((CrashlyticsReport.Session.Event.Application.Builder) t10).setBackgroundResource;
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            str8 = str12;
        }
        oninfowindowlongclick.AppCompatViewInflater = str8;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t11 = issupportfragmentclass.IconCompatParcelizer;
            if (t11 != null) {
                str9 = ((CrashlyticsReport.Session.Event.Application.Builder) t11).setContentView;
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            str9 = str12;
        }
        oninfowindowlongclick.setChecked = str9;
        if (issupportfragmentclass2.IconCompatParcelizer != null) {
            T t12 = issupportfragmentclass2.IconCompatParcelizer;
            if (t12 != null) {
                str10 = ((LogFileManager.C35981) t12).MediaBrowserCompat$ItemReceiver;
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            str10 = str12;
        }
        oninfowindowlongclick.MediaBrowserCompat$CustomActionResultReceiver = str10;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t13 = issupportfragmentclass.IconCompatParcelizer;
            if (t13 != null) {
                str11 = ((CrashlyticsReport.Session.Event.Application.Builder) t13).RatingCompat;
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            str11 = str12;
        }
        oninfowindowlongclick.write = str11;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t14 = issupportfragmentclass.IconCompatParcelizer;
            if (t14 != null) {
                z = ((CrashlyticsReport.Session.Event.Application.Builder) t14).AlertController$RecycleListView;
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            z = false;
        }
        oninfowindowlongclick.MediaSessionCompat$Token = z;
        if (issupportfragmentclass.IconCompatParcelizer == null) {
            z2 = false;
        }
        if (z2) {
            T t15 = issupportfragmentclass.IconCompatParcelizer;
            if (t15 != null) {
                str12 = ((CrashlyticsReport.Session.Event.Application.Builder) t15).Keep;
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        oninfowindowlongclick.PlaybackStateCompat = str12;
        return oninfowindowlongclick;
    }

    /* renamed from: o.er$write */
    final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setOnMyLocationButtonClickListener> {
        public final void onComplete() {
        }

        private write() {
        }

        /* synthetic */ write(C4382er erVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4382er.RatingCompat(C4382er.this);
            C4382er erVar = C4382er.this;
            getArch unused = erVar.MediaBrowserCompat$ItemReceiver = erVar.read.MediaBrowserCompat$ItemReceiver((setOnMyLocationButtonClickListener) obj, true);
            C4382er.MediaBrowserCompat$ItemReceiver(C4382er.this);
        }

        public final void onError(Throwable th) {
            C4382er.this.MediaBrowserCompat$ItemReceiver(C4382er.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4382er erVar) {
        boolean z = true;
        if (erVar.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat == setOnMyLocationChangeListener.NORMAL) {
            C4370ei eiVar = new C4370ei(erVar);
            if (erVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                eiVar.IconCompatParcelizer(erVar.RatingCompat);
            }
        } else if (erVar.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat == setOnMyLocationChangeListener.WITHOUT_PRE_REQUISITE) {
            C4373el elVar = C4373el.MediaBrowserCompat$CustomActionResultReceiver;
            if (erVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                elVar.IconCompatParcelizer(erVar.RatingCompat);
            }
        } else {
            C4374em emVar = C4374em.write;
            if (erVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                emVar.IconCompatParcelizer(erVar.RatingCompat);
            }
        }
    }

    static /* synthetic */ void write(C4382er erVar) {
        if (erVar.RatingCompat != null) {
            erVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(C4382er erVar) {
        boolean z = true;
        if (erVar.write.MediaDescriptionCompat == setOnMyLocationChangeListener.NORMAL) {
            C4367ef efVar = new C4367ef(erVar);
            if (erVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                efVar.IconCompatParcelizer(erVar.RatingCompat);
            }
        } else if (erVar.write.MediaDescriptionCompat == setOnMyLocationChangeListener.WITHOUT_PRE_REQUISITE) {
            C4372ek ekVar = C4372ek.IconCompatParcelizer;
            if (erVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                ekVar.IconCompatParcelizer(erVar.RatingCompat);
            }
        } else {
            C4357eY eYVar = C4357eY.MediaBrowserCompat$CustomActionResultReceiver;
            if (erVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                eYVar.IconCompatParcelizer(erVar.RatingCompat);
            }
        }
        erVar.write = null;
    }

    static /* synthetic */ void RatingCompat(C4382er erVar) {
        if (erVar.RatingCompat != null) {
            erVar.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        if (discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle != null) {
            boolean z = true;
            switch (C43832.read[discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle.ordinal()]) {
                case 1:
                    MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver, (writeUInt64NoTag.IconCompatParcelizer<getLeftEdgeTearWidth>) new C4369eh(discardoldlogfiles_mediabrowsercompat_itemreceiver));
                    return;
                case 2:
                    MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver, (writeUInt64NoTag.IconCompatParcelizer<getLeftEdgeTearWidth>) new C4365ee(discardoldlogfiles_mediabrowsercompat_itemreceiver));
                    return;
                case 3:
                    MediaBrowserCompat$ItemReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
                    return;
                case 4:
                    if (this.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        this.RatingCompat.AlertController$RecycleListView();
                    }
                    this.MediaDescriptionCompat.read();
                    this.MediaDescriptionCompat.IconCompatParcelizer(new write(this, (byte) 0));
                    return;
                case 5:
                    if (this.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        this.RatingCompat.AlertController$RecycleListView();
                    }
                    this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
                    this.MediaDescriptionCompat.IconCompatParcelizer(new er$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0));
                    return;
                case 6:
                    C4375en enVar = C4375en.read;
                    if (this.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        enVar.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                case 7:
                    if (discardoldlogfiles_mediabrowsercompat_itemreceiver.AbsActionBarView == null || discardoldlogfiles_mediabrowsercompat_itemreceiver.setPopupCallback == null) {
                        C4362eb ebVar = C4362eb.read;
                        if (this.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            ebVar.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    }
                    this.MediaDescriptionCompat.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(write((isSupportFragmentClass<CrashlyticsReport.Session.Event.Application.Builder>) isSupportFragmentClass.MediaBrowserCompat$ItemReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver.AbsActionBarView), (isSupportFragmentClass<LogFileManager.C35981>) isSupportFragmentClass.MediaBrowserCompat$ItemReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver.setPopupCallback)));
                    C4371ej ejVar = C4371ej.read;
                    if (this.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        ejVar.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                case 8:
                    MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver, (writeUInt64NoTag.IconCompatParcelizer<getLeftEdgeTearWidth>) new C4368eg(discardoldlogfiles_mediabrowsercompat_itemreceiver));
                    return;
                default:
                    return;
            }
        }
    }
}

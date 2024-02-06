package p040o;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p040o.Maps;
import p040o.zzrc;

/* renamed from: o.setPrettyPrinting */
public class setPrettyPrinting extends writeUInt64NoTag<isBarcodeRead> {
    /* access modifiers changed from: private */
    public Maps.FilteredKeyMap read;
    private getSupportedCipherSuites write;

    @HmlPinActivity
    public setPrettyPrinting(RegularImmutableBiMap regularImmutableBiMap, Maps.FilteredKeyMap filteredKeyMap, getSupportedCipherSuites getsupportedciphersuites) {
        super(regularImmutableBiMap);
        this.read = filteredKeyMap;
        this.write = getsupportedciphersuites;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(eagerInDefaultApp eagerindefaultapp) {
        addDeserializationExclusionStrategy adddeserializationexclusionstrategy = addDeserializationExclusionStrategy.read;
        if (this.RatingCompat != null) {
            adddeserializationexclusionstrategy.IconCompatParcelizer(this.RatingCompat);
        }
        this.write.read(eagerindefaultapp.MediaBrowserCompat$ItemReceiver, eagerindefaultapp.read, readStringList.NORMAL);
        this.write.IconCompatParcelizer(new write(eagerindefaultapp));
    }

    public static int read(List<C4283discover> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).write.equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    static /* synthetic */ void write(List list, int i, isBarcodeRead isbarcoderead) {
        isbarcoderead.MediaBrowserCompat$ItemReceiver(list, i);
        isbarcoderead.MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    /* renamed from: o.setPrettyPrinting$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzrc.zze> {
        private eagerInDefaultApp write;

        public final /* synthetic */ void onNext(Object obj) {
            int i;
            zzrc.zze zze = (zzrc.zze) obj;
            setPrettyPrinting setprettyprinting = setPrettyPrinting.this;
            generateNonExecutableJson generatenonexecutablejson = generateNonExecutableJson.read;
            boolean z = true;
            if (setprettyprinting.RatingCompat != null) {
                generatenonexecutablejson.IconCompatParcelizer(setprettyprinting.RatingCompat);
            }
            Maps.FilteredKeyMap unused = setPrettyPrinting.this.read;
            List<getAction> list = zze.read;
            eagerInDefaultApp eagerindefaultapp = this.write;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                getAction getaction = list.get(i2);
                C4283discover discover = new C4283discover();
                discover.MediaBrowserCompat$ItemReceiver = getaction.MediaBrowserCompat$ItemReceiver;
                discover.IconCompatParcelizer = getaction.write;
                discover.MediaBrowserCompat$CustomActionResultReceiver = getaction.read;
                discover.write = getaction.RatingCompat;
                String format = NumberFormat.getInstance(Locale.getDefault()).format((long) getaction.MediaBrowserCompat$CustomActionResultReceiver);
                String format2 = NumberFormat.getInstance(Locale.getDefault()).format((long) getaction.IconCompatParcelizer);
                if (i2 == list.size() - 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(format);
                    sb.append(" +");
                    discover.MediaBrowserCompat$MediaItem = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(format);
                    sb2.append(" - ");
                    sb2.append(format2);
                    discover.MediaBrowserCompat$MediaItem = sb2.toString();
                }
                if (eagerindefaultapp.f2820x50fd9e4a != null) {
                    i = 0;
                    for (validateInterface validateinterface : eagerindefaultapp.f2820x50fd9e4a) {
                        if (validateinterface.IconCompatParcelizer.equalsIgnoreCase(getaction.RatingCompat)) {
                            i++;
                        }
                    }
                } else {
                    i = 0;
                }
                discover.read = i;
                arrayList.add(discover);
            }
            if (!arrayList.isEmpty()) {
                setPrettyPrinting setprettyprinting2 = setPrettyPrinting.this;
                disableInnerClassSerialization disableinnerclassserialization = new disableInnerClassSerialization(this, arrayList);
                if (setprettyprinting2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    disableinnerclassserialization.IconCompatParcelizer(setprettyprinting2.RatingCompat);
                    return;
                }
                return;
            }
            setPrettyPrinting setprettyprinting3 = setPrettyPrinting.this;
            registerTypeHierarchyAdapter registertypehierarchyadapter = registerTypeHierarchyAdapter.MediaBrowserCompat$CustomActionResultReceiver;
            if (setprettyprinting3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                registertypehierarchyadapter.IconCompatParcelizer(setprettyprinting3.RatingCompat);
            }
        }

        write(eagerInDefaultApp eagerindefaultapp) {
            this.write = eagerindefaultapp;
        }

        public final void onError(Throwable th) {
            setPrettyPrinting setprettyprinting = setPrettyPrinting.this;
            generateNonExecutableJson generatenonexecutablejson = generateNonExecutableJson.read;
            boolean z = true;
            if (setprettyprinting.RatingCompat != null) {
                generatenonexecutablejson.IconCompatParcelizer(setprettyprinting.RatingCompat);
            }
            if (!setPrettyPrinting.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                setPrettyPrinting setprettyprinting2 = setPrettyPrinting.this;
                registerTypeHierarchyAdapter registertypehierarchyadapter = registerTypeHierarchyAdapter.MediaBrowserCompat$CustomActionResultReceiver;
                if (setprettyprinting2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    registertypehierarchyadapter.IconCompatParcelizer(setprettyprinting2.RatingCompat);
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.write.write.write();
        this.write.write.MediaBrowserCompat$CustomActionResultReceiver();
    }

    static /* synthetic */ void write(setPrettyPrinting setprettyprinting, List list, int i) {
        enableComplexMapKeySerialization enablecomplexmapkeyserialization = new enableComplexMapKeySerialization(list, i);
        if (setprettyprinting.RatingCompat != null) {
            enablecomplexmapkeyserialization.IconCompatParcelizer(setprettyprinting.RatingCompat);
        }
    }
}

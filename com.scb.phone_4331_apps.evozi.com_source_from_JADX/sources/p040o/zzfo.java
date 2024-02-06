package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import org.bouncycastle.i18n.ErrorBundle;
import p040o.GoogleMap;
import p040o.onMapLongClick;

/* renamed from: o.zzfo */
public final /* synthetic */ class zzfo implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ getSharedApiKey MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ zzfo(getSharedApiKey getsharedapikey) {
        this.MediaBrowserCompat$ItemReceiver = getsharedapikey;
    }

    /* renamed from: o.zzfo$zzc */
    public final class zzc {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;
        public String write;

        public /* synthetic */ zzc(zzfo$zzc$MediaBrowserCompat$ItemReceiver zzfo_zzc_mediabrowsercompat_itemreceiver, byte b) {
            this(zzfo_zzc_mediabrowsercompat_itemreceiver);
        }

        private zzc(zzfo$zzc$MediaBrowserCompat$ItemReceiver zzfo_zzc_mediabrowsercompat_itemreceiver) {
            this.MediaBrowserCompat$ItemReceiver = zzfo_zzc_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
            this.IconCompatParcelizer = zzfo_zzc_mediabrowsercompat_itemreceiver.write;
            this.MediaBrowserCompat$CustomActionResultReceiver = zzfo_zzc_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
            this.write = zzfo_zzc_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
            this.read = zzfo_zzc_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver;
        }
    }

    /* renamed from: o.zzfo$zzd */
    public final class zzd {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public boolean MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2987x50fd9e4a;
        public boolean MediaDescriptionCompat;
        public boolean MediaMetadataCompat;
        public String MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public String ParcelableVolumeInfo;
        public String RatingCompat;
        public String read;
        public String write;

        /* renamed from: o.zzfo$zzd$read */
        public static final class read {
            public String AlertController$RecycleListView;
            public String IconCompatParcelizer;
            public int Keep;
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public boolean MediaBrowserCompat$ItemReceiver;
            public boolean MediaBrowserCompat$MediaItem;
            public String MediaBrowserCompat$SearchResultReceiver;

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            public String f2988x50fd9e4a;
            public String MediaDescriptionCompat;
            public boolean MediaMetadataCompat;
            public String MediaSessionCompat$QueueItem;
            public String MediaSessionCompat$ResultReceiverWrapper;
            public String MediaSessionCompat$Token;
            public String ParcelableVolumeInfo;
            public String PlaybackStateCompat$CustomAction;
            public boolean RatingCompat;
            public String read;
            public String write;
        }

        public /* synthetic */ zzd(read read2, byte b) {
            this(read2);
        }

        private zzd(read read2) {
            this.MediaSessionCompat$ResultReceiverWrapper = read2.PlaybackStateCompat$CustomAction;
            this.ParcelableVolumeInfo = read2.AlertController$RecycleListView;
            this.IconCompatParcelizer = read2.MediaBrowserCompat$SearchResultReceiver;
            this.write = read2.IconCompatParcelizer;
            this.MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$MediaItem = read2.MediaBrowserCompat$MediaItem;
            this.MediaDescriptionCompat = read2.MediaMetadataCompat;
            this.MediaMetadataCompat = read2.RatingCompat;
            this.MediaSessionCompat$QueueItem = read2.f2988x50fd9e4a;
            this.read = read2.read;
            this.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaDescriptionCompat;
            this.RatingCompat = read2.MediaSessionCompat$ResultReceiverWrapper;
            this.MediaBrowserCompat$SearchResultReceiver = read2.MediaSessionCompat$Token;
            this.f2987x50fd9e4a = read2.MediaSessionCompat$QueueItem;
        }
    }

    /* renamed from: o.zzfo$zze */
    public final class zze {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final List<String> MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final String MediaDescriptionCompat;
        public final String read;
        public final List<setDataCollectionEnabled> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze zze = (zze) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zze.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zze.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zze.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zze.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zze.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zze.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zze.write);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$SearchResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaDescriptionCompat;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.IconCompatParcelizer;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            List<String> list = this.MediaBrowserCompat$ItemReceiver;
            int hashCode6 = list != null ? list.hashCode() : 0;
            List<setDataCollectionEnabled> list2 = this.write;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashMCMCLoan(minimumCreditLimit=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", maximumCreditLimit=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", defaultCreditLimit=");
            sb.append(this.read);
            sb.append(", sliderInterval=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", applicationId=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", durationOptions=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", details=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public zze(String str, String str2, String str3, String str4, String str5, List<String> list, List<? extends setDataCollectionEnabled> list2) {
            onGetStartedClick.write((Object) str, "minimumCreditLimit");
            onGetStartedClick.write((Object) str2, "maximumCreditLimit");
            onGetStartedClick.write((Object) str3, "defaultCreditLimit");
            onGetStartedClick.write((Object) str4, "sliderInterval");
            onGetStartedClick.write((Object) str5, "applicationId");
            onGetStartedClick.write((Object) list, "durationOptions");
            onGetStartedClick.write((Object) list2, ErrorBundle.DETAIL_ENTRY);
            this.MediaBrowserCompat$SearchResultReceiver = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.read = str3;
            this.MediaDescriptionCompat = str4;
            this.IconCompatParcelizer = str5;
            this.MediaBrowserCompat$ItemReceiver = list;
            this.write = list2;
        }
    }

    /* renamed from: o.zzfo$zzf */
    public final class zzf {
        public List<zzd> IconCompatParcelizer;
        public List<zzd> MediaBrowserCompat$CustomActionResultReceiver;
        public C4467g_ MediaBrowserCompat$ItemReceiver;
        public List<zzd> MediaDescriptionCompat;
        public List<zzc> read;
        public boolean write;

        /* renamed from: o.zzfo$zzf$read */
        public static final class read {
            public List<zzc> IconCompatParcelizer;
            public List<zzd> MediaBrowserCompat$CustomActionResultReceiver;
            public C4467g_ MediaBrowserCompat$ItemReceiver;
            public List<zzd> MediaMetadataCompat;
            public boolean read;
            public List<zzd> write;
        }

        public /* synthetic */ zzf(read read2, byte b) {
            this(read2);
        }

        private zzf(read read2) {
            this.write = read2.read;
            this.MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$ItemReceiver;
            this.MediaDescriptionCompat = read2.MediaMetadataCompat;
            this.IconCompatParcelizer = read2.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = read2.write;
            this.read = read2.IconCompatParcelizer;
        }
    }

    /* renamed from: o.zzfo$zzb */
    public final class zzb {
        public List<C4739h_> read;

        public zzb(List<C4739h_> list) {
            this.read = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) obj;
            List<C4739h_> list = this.read;
            if (list != null) {
                return list.equals(zzb.read);
            }
            if (zzb.read != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            List<C4739h_> list = this.read;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: o.zzfo$zza */
    public final class zza {
        public int MediaBrowserCompat$ItemReceiver;
        public List<C4739h_> write;

        public zza(int i, List<C4739h_> list) {
            this.MediaBrowserCompat$ItemReceiver = i;
            this.write = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            if (this.MediaBrowserCompat$ItemReceiver != zza.MediaBrowserCompat$ItemReceiver) {
                return false;
            }
            List<C4739h_> list = this.write;
            if (list != null) {
                return list.equals(zza.write);
            }
            if (zza.write != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.MediaBrowserCompat$ItemReceiver;
            List<C4739h_> list = this.write;
            return (i * 31) + (list != null ? list.hashCode() : 0);
        }
    }

    public final Object write(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        String str5;
        String str6;
        String str7;
        String str8;
        List list2;
        String str9;
        List list3;
        String str10;
        List<RuntimeJsonMappingException> list4;
        PropertyBindingException propertyBindingException;
        setOnPageChangeListener status;
        setOnPageChangeListener status2;
        List<setDragDecelerationFrictionCoef> list5;
        setExtraLeftOffset setextraleftoffset;
        setOnPageChangeListener status3;
        setOnPageChangeListener status4;
        JsonEOFException jsonEOFException = (JsonEOFException) obj;
        onGetStartedClick.write((Object) jsonEOFException, "accountList");
        C3423x31993af1 googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver = new C3423x31993af1((byte) 0);
        setOnPageChangeListener status5 = jsonEOFException.IconCompatParcelizer.getStatus();
        onGetStartedClick.IconCompatParcelizer((Object) status5, "accountList.cardsPending.status");
        String str11 = null;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) status5.write(), (Object) "1000")) {
            setOnPageChangeListener status6 = jsonEOFException.IconCompatParcelizer.getStatus();
            onGetStartedClick.IconCompatParcelizer((Object) status6, "accountList.cardsPending.status");
            str = status6.IconCompatParcelizer();
        } else {
            str = null;
        }
        Iterable<JsonGenerationException> iterable = jsonEOFException.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        int i = 10;
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (JsonGenerationException jsonGenerationException : iterable) {
            arrayList.add(getSharedApiKey.MediaBrowserCompat$ItemReceiver(jsonGenerationException.read, jsonGenerationException.write, jsonGenerationException.MediaBrowserCompat$CustomActionResultReceiver.write, jsonGenerationException.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, jsonGenerationException.IconCompatParcelizer, (String) null));
        }
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper = new GoogleMap.OnMapLoadedCallback(str, (List) arrayList);
        setOnPageChangeListener status7 = jsonEOFException.MediaBrowserCompat$MediaItem.getStatus();
        onGetStartedClick.IconCompatParcelizer((Object) status7, "accountList.deposits.status");
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) status7.write(), (Object) "1000")) {
            setOnPageChangeListener status8 = jsonEOFException.MediaBrowserCompat$MediaItem.getStatus();
            onGetStartedClick.IconCompatParcelizer((Object) status8, "accountList.deposits.status");
            str2 = status8.IconCompatParcelizer();
        } else {
            str2 = null;
        }
        Iterable<InvalidFormatException> iterable2 = jsonEOFException.MediaBrowserCompat$MediaItem.write;
        onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
        Collection arrayList2 = new ArrayList(iterable2 instanceof Collection ? ((Collection) iterable2).size() : 10);
        for (InvalidFormatException invalidFormatException : iterable2) {
            int i2 = invalidFormatException.read;
            String str12 = invalidFormatException.write;
            String str13 = invalidFormatException.MediaBrowserCompat$ItemReceiver.write;
            String str14 = invalidFormatException.IconCompatParcelizer.write;
            onMapLongClick.write write = new onMapLongClick.write();
            write.MediaBrowserCompat$SearchResultReceiver = i2;
            write.read = str12;
            write.MediaBrowserCompat$CustomActionResultReceiver = str13;
            write.MediaBrowserCompat$ItemReceiver = str14;
            arrayList2.add(new onMapLongClick(write, (byte) 0));
        }
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = new GoogleMap.OnMapLoadedCallback(str2, (List) arrayList2);
        setOnPageChangeListener status9 = jsonEOFException.MediaBrowserCompat$CustomActionResultReceiver.getStatus();
        onGetStartedClick.IconCompatParcelizer((Object) status9, "accountList.cards.status");
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) status9.write(), (Object) "1000")) {
            setOnPageChangeListener status10 = jsonEOFException.MediaBrowserCompat$CustomActionResultReceiver.getStatus();
            onGetStartedClick.IconCompatParcelizer((Object) status10, "accountList.cards.status");
            str3 = status10.IconCompatParcelizer();
        } else {
            str3 = null;
        }
        Iterable<JsonGenerationException> iterable3 = jsonEOFException.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) iterable3, "$this$collectionSizeOrDefault");
        Collection arrayList3 = new ArrayList(iterable3 instanceof Collection ? ((Collection) iterable3).size() : 10);
        for (JsonGenerationException jsonGenerationException2 : iterable3) {
            arrayList3.add(getSharedApiKey.MediaBrowserCompat$ItemReceiver(jsonGenerationException2.read, jsonGenerationException2.write, jsonGenerationException2.MediaBrowserCompat$CustomActionResultReceiver.write, jsonGenerationException2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, jsonGenerationException2.IconCompatParcelizer, jsonGenerationException2.MediaBrowserCompat$ItemReceiver.write));
        }
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = new GoogleMap.OnMapLoadedCallback(str3, (List) arrayList3);
        setOnPageChangeListener status11 = jsonEOFException.MediaSessionCompat$Token.getStatus();
        onGetStartedClick.IconCompatParcelizer((Object) status11, "accountList.mutualFunds.status");
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) status11.write(), (Object) "1000")) {
            setOnPageChangeListener status12 = jsonEOFException.MediaSessionCompat$Token.getStatus();
            onGetStartedClick.IconCompatParcelizer((Object) status12, "accountList.mutualFunds.status");
            str4 = status12.IconCompatParcelizer();
        } else {
            str4 = null;
        }
        List<IgnoredPropertyException> list6 = jsonEOFException.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver;
        if (list6 != null) {
            Iterable<IgnoredPropertyException> iterable4 = list6;
            onGetStartedClick.write((Object) iterable4, "$this$collectionSizeOrDefault");
            Collection arrayList4 = new ArrayList(iterable4 instanceof Collection ? ((Collection) iterable4).size() : 10);
            for (IgnoredPropertyException ignoredPropertyException : iterable4) {
                int i3 = ignoredPropertyException.MediaBrowserCompat$ItemReceiver;
                String str15 = ignoredPropertyException.write;
                String str16 = ignoredPropertyException.read.write;
                onMapLongClick.write write2 = new onMapLongClick.write();
                write2.MediaBrowserCompat$SearchResultReceiver = i3;
                write2.read = str15;
                write2.MediaBrowserCompat$CustomActionResultReceiver = str16;
                arrayList4.add(new onMapLongClick(write2, (byte) 0));
            }
            list = (List) arrayList4;
        } else {
            list = null;
        }
        if (list == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.f2720x50fd9e4a = new GoogleMap.OnMapLoadedCallback(str4, list);
        setOnPageChangeListener status13 = jsonEOFException.MediaMetadataCompat.getStatus();
        onGetStartedClick.IconCompatParcelizer((Object) status13, "accountList.loans.status");
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) status13.write(), (Object) "1000")) {
            setOnPageChangeListener status14 = jsonEOFException.MediaMetadataCompat.getStatus();
            onGetStartedClick.IconCompatParcelizer((Object) status14, "accountList.loans.status");
            str5 = status14.IconCompatParcelizer();
        } else {
            str5 = null;
        }
        Iterable<setDescription> iterable5 = jsonEOFException.MediaMetadataCompat.IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable5, "$this$collectionSizeOrDefault");
        Collection arrayList5 = new ArrayList(iterable5 instanceof Collection ? ((Collection) iterable5).size() : 10);
        for (setDescription setdescription : iterable5) {
            arrayList5.add(getSharedApiKey.read(setdescription.MediaBrowserCompat$CustomActionResultReceiver, setdescription.MediaBrowserCompat$ItemReceiver, setdescription.read.write, setdescription.read.MediaBrowserCompat$CustomActionResultReceiver));
        }
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem = new GoogleMap.OnMapLoadedCallback(str5, (List) arrayList5);
        setOnPageChangeListener status15 = jsonEOFException.PlaybackStateCompat$CustomAction.getStatus();
        onGetStartedClick.IconCompatParcelizer((Object) status15, "accountList.smeLoans.status");
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) status15.write(), (Object) "1000")) {
            setOnPageChangeListener status16 = jsonEOFException.PlaybackStateCompat$CustomAction.getStatus();
            onGetStartedClick.IconCompatParcelizer((Object) status16, "accountList.smeLoans.status");
            str6 = status16.IconCompatParcelizer();
        } else {
            str6 = null;
        }
        Iterable<setDescription> iterable6 = jsonEOFException.PlaybackStateCompat$CustomAction.read;
        onGetStartedClick.write((Object) iterable6, "$this$collectionSizeOrDefault");
        Collection arrayList6 = new ArrayList(iterable6 instanceof Collection ? ((Collection) iterable6).size() : 10);
        for (setDescription setdescription2 : iterable6) {
            arrayList6.add(getSharedApiKey.read(setdescription2.MediaBrowserCompat$CustomActionResultReceiver, setdescription2.MediaBrowserCompat$ItemReceiver, setdescription2.read.write, setdescription2.read.MediaBrowserCompat$CustomActionResultReceiver));
        }
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView = new GoogleMap.OnMapLoadedCallback(str6, (List) arrayList6);
        setOnPageChangeListener status17 = jsonEOFException.MediaSessionCompat$QueueItem.getStatus();
        onGetStartedClick.IconCompatParcelizer((Object) status17, "accountList.merchants.status");
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) status17.write(), (Object) "1000")) {
            setOnPageChangeListener status18 = jsonEOFException.MediaSessionCompat$QueueItem.getStatus();
            onGetStartedClick.IconCompatParcelizer((Object) status18, "accountList.merchants.status");
            str7 = status18.IconCompatParcelizer();
        } else {
            str7 = null;
        }
        Iterable<Chart> iterable7 = jsonEOFException.MediaSessionCompat$QueueItem.IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable7, "$this$collectionSizeOrDefault");
        Collection arrayList7 = new ArrayList(iterable7 instanceof Collection ? ((Collection) iterable7).size() : 10);
        for (Chart chart : iterable7) {
            arrayList7.add(getSharedApiKey.read(chart.read, chart.MediaBrowserCompat$CustomActionResultReceiver, chart.write.write, chart.write.MediaBrowserCompat$CustomActionResultReceiver));
        }
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.setHasDecor = new GoogleMap.OnMapLoadedCallback(str7, (List) arrayList7);
        setExtraLeftOffset setextraleftoffset2 = jsonEOFException.ParcelableVolumeInfo;
        if (setextraleftoffset2 == null || (status4 = setextraleftoffset2.getStatus()) == null) {
            str8 = null;
        } else {
            str8 = status4.write();
        }
        String IconCompatParcelizer = (!(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str8, (Object) "1000") ^ true) || (setextraleftoffset = jsonEOFException.ParcelableVolumeInfo) == null || (status3 = setextraleftoffset.getStatus()) == null) ? null : status3.IconCompatParcelizer();
        setExtraLeftOffset setextraleftoffset3 = jsonEOFException.ParcelableVolumeInfo;
        if (setextraleftoffset3 == null || (list5 = setextraleftoffset3.MediaBrowserCompat$CustomActionResultReceiver) == null) {
            list2 = HmlNationalIdActivity.IconCompatParcelizer;
        } else {
            Iterable<setDragDecelerationFrictionCoef> iterable8 = list5;
            onGetStartedClick.write((Object) iterable8, "$this$collectionSizeOrDefault");
            Collection arrayList8 = new ArrayList(iterable8 instanceof Collection ? ((Collection) iterable8).size() : 10);
            for (setDragDecelerationFrictionCoef setdragdecelerationfrictioncoef : iterable8) {
                arrayList8.add(getSharedApiKey.MediaBrowserCompat$ItemReceiver(setdragdecelerationfrictioncoef.write, setdragdecelerationfrictioncoef.MediaBrowserCompat$ItemReceiver, setdragdecelerationfrictioncoef.MediaBrowserCompat$CustomActionResultReceiver.write, setdragdecelerationfrictioncoef.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, setdragdecelerationfrictioncoef.read, (String) null));
            }
            list2 = (List) arrayList8;
        }
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction = new GoogleMap.OnMapLoadedCallback(IconCompatParcelizer, list2);
        PropertyBindingException propertyBindingException2 = jsonEOFException.read;
        if (propertyBindingException2 == null || (status2 = propertyBindingException2.getStatus()) == null) {
            str9 = null;
        } else {
            str9 = status2.write();
        }
        String IconCompatParcelizer2 = (!(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str9, (Object) "1000") ^ true) || (propertyBindingException = jsonEOFException.read) == null || (status = propertyBindingException.getStatus()) == null) ? null : status.IconCompatParcelizer();
        PropertyBindingException propertyBindingException3 = jsonEOFException.read;
        if (propertyBindingException3 == null || (list4 = propertyBindingException3.MediaBrowserCompat$ItemReceiver) == null) {
            list3 = HmlNationalIdActivity.IconCompatParcelizer;
        } else {
            Iterable<RuntimeJsonMappingException> iterable9 = list4;
            onGetStartedClick.write((Object) iterable9, "$this$collectionSizeOrDefault");
            if (iterable9 instanceof Collection) {
                i = ((Collection) iterable9).size();
            }
            Collection arrayList9 = new ArrayList(i);
            for (RuntimeJsonMappingException runtimeJsonMappingException : iterable9) {
                arrayList9.add(getSharedApiKey.MediaBrowserCompat$ItemReceiver(runtimeJsonMappingException.read, runtimeJsonMappingException.write, runtimeJsonMappingException.MediaBrowserCompat$ItemReceiver, "", runtimeJsonMappingException.MediaBrowserCompat$CustomActionResultReceiver, (String) null));
            }
            list3 = (List) arrayList9;
        }
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo = new GoogleMap.OnMapLoadedCallback(IconCompatParcelizer2, list3);
        setOnPageChangeListener status19 = jsonEOFException.AlertController$RecycleListView.getStatus();
        onGetStartedClick.IconCompatParcelizer((Object) status19, "accountList.securities.status");
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) status19.write(), (Object) "1000")) {
            setOnPageChangeListener status20 = jsonEOFException.AlertController$RecycleListView.getStatus();
            onGetStartedClick.IconCompatParcelizer((Object) status20, "accountList.securities.status");
            str10 = status20.IconCompatParcelizer();
        } else {
            str10 = null;
        }
        setDrawMarkerViews setdrawmarkerviews = jsonEOFException.AlertController$RecycleListView.read;
        if (setdrawmarkerviews != null) {
            str11 = setdrawmarkerviews.IconCompatParcelizer;
        }
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat = new onMapLoaded(str10, onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) str11));
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.Keep = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) jsonEOFException.PlaybackStateCompat);
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) jsonEOFException.write);
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) jsonEOFException.MediaDescriptionCompat);
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) jsonEOFException.MediaBrowserCompat$ItemReceiver);
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.write = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) jsonEOFException.MediaBrowserCompat$SearchResultReceiver);
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) jsonEOFException.setHasDecor);
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.read = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) jsonEOFException.MediaSessionCompat$ResultReceiverWrapper);
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) jsonEOFException.f2749x50fd9e4a);
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) jsonEOFException.RatingCompat);
        googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) jsonEOFException.Keep);
        GoogleMap.OnMapLongClickListener onMapLongClickListener = new GoogleMap.OnMapLongClickListener(googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
        onGetStartedClick.IconCompatParcelizer((Object) onMapLongClickListener, "UnregisteredAccountList.…lag)\n            .build()");
        return onMapLongClickListener;
    }
}

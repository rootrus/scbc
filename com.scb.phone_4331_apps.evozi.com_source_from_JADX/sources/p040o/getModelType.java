package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.ExtractorResponse;
import p040o.Maps;
import p040o.Predicates;
import p040o.writeUInt64NoTag;

/* renamed from: o.getModelType */
public final class getModelType extends writeUInt64NoTag<ExtractorResponse.read> {
    public String IconCompatParcelizer;
    public chain MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final forArray MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public ArrayList<String> MediaDescriptionCompat = new ArrayList<>();
    /* access modifiers changed from: private */
    public final Predicates.C37371 MediaMetadataCompat;
    public ArrayList<chain> read;
    public String write;

    /* renamed from: o.getModelType$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.read> {
        private /* synthetic */ getModelType read;

        public IconCompatParcelizer(getModelType getmodeltype) {
            this.read = getmodeltype;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ExtractorResponse.read read2 = (ExtractorResponse.read) obj;
            String MediaMetadataCompat = this.read.MediaMetadataCompat.write.MediaMetadataCompat();
            if (MediaMetadataCompat == null) {
                MediaMetadataCompat = "";
            }
            read2.IconCompatParcelizer(MediaMetadataCompat);
        }
    }

    /* renamed from: o.getModelType$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.read> {
        private /* synthetic */ getModelType write;

        public read(getModelType getmodeltype) {
            this.write = getmodeltype;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str;
            ExtractorResponse.read read = (ExtractorResponse.read) obj;
            forArray unused = this.write.MediaBrowserCompat$SearchResultReceiver;
            chain MediaBrowserCompat$ItemReceiver = getModelType.MediaBrowserCompat$ItemReceiver(this.write);
            onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "ccd");
            read.MediaMetadataCompat(Maps.FilteredEntryMap.EntrySet.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver));
            forArray write2 = this.write.MediaBrowserCompat$SearchResultReceiver;
            String MediaBrowserCompat$CustomActionResultReceiver = getModelType.MediaBrowserCompat$CustomActionResultReceiver(this.write);
            onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "channel");
            Maps.FilteredEntryMap.EntrySet entrySet = write2.read;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$CustomActionResultReceiver, (Object) createId.EMAIL.name())) {
                str = entrySet.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.email_remark);
                onGetStartedClick.IconCompatParcelizer((Object) str, "getString(R.string.email_remark)");
            } else {
                str = entrySet.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.paper_remark);
                onGetStartedClick.IconCompatParcelizer((Object) str, "getString(R.string.paper_remark)");
            }
            read.MediaDescriptionCompat(str);
            String MediaBrowserCompat$CustomActionResultReceiver2 = getModelType.MediaBrowserCompat$CustomActionResultReceiver(this.write);
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$CustomActionResultReceiver2, (Object) createId.EMAIL.name())) {
                String MediaMetadataCompat = this.write.MediaMetadataCompat.write.MediaMetadataCompat();
                if (MediaMetadataCompat == null) {
                    MediaMetadataCompat = "";
                }
                read.IconCompatParcelizer(MediaMetadataCompat);
                forArray write3 = this.write.MediaBrowserCompat$SearchResultReceiver;
                String MediaBrowserCompat$CustomActionResultReceiver3 = getModelType.MediaBrowserCompat$CustomActionResultReceiver(this.write);
                onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver3, "channel");
                read.read(write3.read.MediaMetadataCompat(MediaBrowserCompat$CustomActionResultReceiver3));
            } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$CustomActionResultReceiver2, (Object) createId.PAPER.name())) {
                read.write(getModelType.IconCompatParcelizer(this.write));
                forArray write4 = this.write.MediaBrowserCompat$SearchResultReceiver;
                String MediaBrowserCompat$CustomActionResultReceiver4 = getModelType.MediaBrowserCompat$CustomActionResultReceiver(this.write);
                onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver4, "channel");
                read.read(write4.read.MediaMetadataCompat(MediaBrowserCompat$CustomActionResultReceiver4));
            }
            read.read();
        }
    }

    /* renamed from: o.getModelType$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.read> {
        private /* synthetic */ getModelType IconCompatParcelizer;
        private /* synthetic */ int read;

        write(getModelType getmodeltype, int i) {
            this.IconCompatParcelizer = getmodeltype;
            this.read = i;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ExtractorResponse.read read2 = (ExtractorResponse.read) obj;
            String str = "";
            if (this.read <= 0) {
                this.IconCompatParcelizer.MediaDescriptionCompat.add(getModelType.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer).MediaDescriptionCompat);
                chain MediaBrowserCompat$ItemReceiver = getModelType.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
                ArrayList MediaBrowserCompat$SearchResultReceiver = getModelType.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer);
                String MediaBrowserCompat$CustomActionResultReceiver = getModelType.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
                String MediaMetadataCompat = this.IconCompatParcelizer.MediaMetadataCompat.write.MediaMetadataCompat();
                if (MediaMetadataCompat == null) {
                    MediaMetadataCompat = str;
                }
                read2.read(MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$SearchResultReceiver, MediaBrowserCompat$CustomActionResultReceiver, MediaMetadataCompat, this.IconCompatParcelizer.MediaDescriptionCompat);
                return;
            }
            chain MediaBrowserCompat$ItemReceiver2 = getModelType.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
            ArrayList MediaBrowserCompat$SearchResultReceiver2 = getModelType.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer);
            String MediaBrowserCompat$CustomActionResultReceiver2 = getModelType.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            String MediaMetadataCompat2 = this.IconCompatParcelizer.MediaMetadataCompat.write.MediaMetadataCompat();
            if (MediaMetadataCompat2 != null) {
                str = MediaMetadataCompat2;
            }
            read2.write(MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$SearchResultReceiver2, MediaBrowserCompat$CustomActionResultReceiver2, str);
        }
    }

    public static final /* synthetic */ String IconCompatParcelizer(getModelType getmodeltype) {
        String str = getmodeltype.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("address");
        }
        return str;
    }

    public static final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver(getModelType getmodeltype) {
        String str = getmodeltype.write;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("channel");
        }
        return str;
    }

    public static final /* synthetic */ chain MediaBrowserCompat$ItemReceiver(getModelType getmodeltype) {
        chain chain = getmodeltype.MediaBrowserCompat$ItemReceiver;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        return chain;
    }

    public static final /* synthetic */ ArrayList MediaBrowserCompat$SearchResultReceiver(getModelType getmodeltype) {
        ArrayList<chain> arrayList = getmodeltype.read;
        if (arrayList == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplayList");
        }
        return arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getModelType(forArray forarray, Predicates.C37371 r3, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) forarray, "controller");
        onGetStartedClick.write((Object) r3, "userEmailCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaBrowserCompat$SearchResultReceiver = forarray;
        this.MediaMetadataCompat = r3;
    }

    public static final /* synthetic */ int read(getModelType getmodeltype) {
        ArrayList<chain> arrayList = getmodeltype.read;
        if (arrayList == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplayList");
        }
        Collection arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            chain chain = (chain) next;
            String str = chain.MediaDescriptionCompat;
            chain chain2 = getmodeltype.MediaBrowserCompat$ItemReceiver;
            if (chain2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) chain2.MediaDescriptionCompat);
            boolean z = true;
            if (!(!MediaBrowserCompat$ItemReceiver2) || !chain.setContentHeight) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        return ((List) arrayList2).size();
    }

    public static final /* synthetic */ void write(getModelType getmodeltype, int i) {
        writeUInt64NoTag.IconCompatParcelizer write2 = new write(getmodeltype, i);
        if (getmodeltype.RatingCompat != null) {
            write2.IconCompatParcelizer(getmodeltype.RatingCompat);
        }
    }
}

package p040o;

import p040o.CheckWorkflowActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCropTetragon */
public final class setCropTetragon extends writeUInt64NoTag<CheckWorkflowActivity.write> {
    public String IconCompatParcelizer = "N";
    public final StreetViewPanoramaLink MediaBrowserCompat$ItemReceiver;
    public MetaDataStore write;

    /* renamed from: o.setCropTetragon$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckWorkflowActivity.write> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ setCropTetragon write;

        public read(setCropTetragon setcroptetragon, String str) {
            this.write = setcroptetragon;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            CheckWorkflowActivity.write write2 = (CheckWorkflowActivity.write) obj;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode = str.hashCode();
            if (hashCode != 78) {
                if (hashCode == 89 && str.equals("Y")) {
                    setCropTetragon setcroptetragon = this.write;
                    onGetStartedClick.write((Object) "Y", "statementOfHolding");
                    setcroptetragon.IconCompatParcelizer = "Y";
                    write2.read();
                    return;
                }
            } else if (str.equals("N")) {
                setCropTetragon setcroptetragon2 = this.write;
                onGetStartedClick.write((Object) "N", "statementOfHolding");
                setcroptetragon2.IconCompatParcelizer = "N";
                write2.MediaBrowserCompat$ItemReceiver();
                return;
            }
            setCropTetragon setcroptetragon3 = this.write;
            onGetStartedClick.write((Object) "N", "statementOfHolding");
            setcroptetragon3.IconCompatParcelizer = "N";
            write2.write();
        }
    }

    /* renamed from: o.setCropTetragon$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckWorkflowActivity.write> {
        private /* synthetic */ setCropTetragon IconCompatParcelizer;

        public write(setCropTetragon setcroptetragon) {
            this.IconCompatParcelizer = setcroptetragon;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((CheckWorkflowActivity.write) obj).write(this.IconCompatParcelizer.IconCompatParcelizer, setCropTetragon.IconCompatParcelizer(this.IconCompatParcelizer));
        }
    }

    public static final /* synthetic */ MetaDataStore IconCompatParcelizer(setCropTetragon setcroptetragon) {
        MetaDataStore metaDataStore = setcroptetragon.write;
        if (metaDataStore == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("redeemVerificationDisplay");
        }
        return metaDataStore;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setCropTetragon(StreetViewPanoramaLink streetViewPanoramaLink, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) streetViewPanoramaLink, "investmentCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = streetViewPanoramaLink;
    }
}

package p040o;

import java.util.List;
import p040o.AutoValue_PersistedInstallationEntry;
import p040o.access$2300;
import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.PersistedInstallationEntry */
public final /* synthetic */ class PersistedInstallationEntry implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ PersistedInstallationEntry MediaBrowserCompat$ItemReceiver = new PersistedInstallationEntry();

    private /* synthetic */ PersistedInstallationEntry() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.write) obj).MediaBrowserCompat$ItemReceiver();
    }

    /* renamed from: o.PersistedInstallationEntry$Builder */
    public class Builder extends writeUInt64NoTag<proxyGetICheckDeserializerRtti$MediaSessionCompat$QueueItem> {
        public String MediaBrowserCompat$ItemReceiver;
        /* access modifiers changed from: private */
        public final notifyStopped read;
        public final MapStyleOptions write;

        @HmlPinActivity
        public Builder(RegularImmutableBiMap regularImmutableBiMap, notifyStopped notifystopped, MapStyleOptions mapStyleOptions) {
            super(regularImmutableBiMap);
            this.write = mapStyleOptions;
            this.read = notifystopped;
        }

        /* renamed from: o.PersistedInstallationEntry$Builder$read */
        public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanoramaFragment>> {
            private read() {
            }

            public /* synthetic */ read(Builder builder, byte b) {
                this();
            }

            public final /* synthetic */ void onNext(Object obj) {
                Builder.read(Builder.this);
                Builder builder = Builder.this;
                AutoValue_PersistedInstallationEntry.Builder builder2 = new AutoValue_PersistedInstallationEntry.Builder(this, (List) obj);
                if (builder.RatingCompat != null) {
                    builder2.IconCompatParcelizer(builder.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                Builder.this.MediaBrowserCompat$ItemReceiver(Builder.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }

        static /* synthetic */ void read(Builder builder) {
            if (builder.RatingCompat != null) {
                builder.RatingCompat.aj_();
            }
        }
    }
}

package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.ImmutableSortedSet;
import p040o.Synchronized;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.o */
public final /* synthetic */ class C5082o implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ C5082o IconCompatParcelizer = new C5082o();

    private /* synthetic */ C5082o() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.PlaybackStateCompat.CustomAction) obj).MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* renamed from: o.o$a */
    public class C5084a extends writeUInt64NoTag<getTopLeftCornerWidth.RatingCompat> {
        /* access modifiers changed from: private */
        public boolean IconCompatParcelizer;
        /* access modifiers changed from: private */
        public final countIn MediaBrowserCompat$ItemReceiver;
        private String MediaBrowserCompat$MediaItem;
        /* access modifiers changed from: private */
        public setUuidFromUtf8Bytes MediaBrowserCompat$SearchResultReceiver;
        /* access modifiers changed from: private */
        public final AppMeasurementContentProvider MediaDescriptionCompat;
        /* access modifiers changed from: private */
        public final mapException read;
        final Synchronized.SynchronizedSetMultimap write;

        @HmlPinActivity
        public C5084a(AppMeasurementContentProvider appMeasurementContentProvider, countIn countin, mapException mapexception, RegularImmutableBiMap regularImmutableBiMap, Synchronized.SynchronizedSetMultimap synchronizedSetMultimap, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
            super(regularImmutableBiMap);
            this.read = mapexception;
            this.write = synchronizedSetMultimap;
            this.MediaDescriptionCompat = appMeasurementContentProvider;
            this.MediaBrowserCompat$ItemReceiver = countin;
            this.MediaBrowserCompat$MediaItem = str;
        }

        public void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
            ImmutableSortedSet.Builder builder;
            if (!this.IconCompatParcelizer) {
                boolean z = true;
                this.IconCompatParcelizer = true;
                this.MediaBrowserCompat$SearchResultReceiver = setuuidfromutf8bytes;
                if (setuuidfromutf8bytes.setShortcut != null) {
                    C10137rv rvVar = new C10137rv(this);
                    if (this.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        rvVar.IconCompatParcelizer(this.RatingCompat);
                    }
                } else {
                    C10140sS sSVar = C10140sS.MediaBrowserCompat$CustomActionResultReceiver;
                    if (this.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        sSVar.IconCompatParcelizer(this.RatingCompat);
                    }
                }
                putInstance MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
                userNavigationEnabled IconCompatParcelizer2 = this.MediaDescriptionCompat.IconCompatParcelizer.IconCompatParcelizer();
                if (MediaBrowserCompat$CustomActionResultReceiver == null || IconCompatParcelizer2 == null) {
                    builder = ImmutableSortedSet.Builder.MediaBrowserCompat$ItemReceiver();
                } else {
                    builder = ImmutableSortedSet.Builder.MediaBrowserCompat$ItemReceiver();
                    builder.read = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                    builder.write = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                    builder.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                    builder.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2.PlaybackStateCompat;
                    String str = IconCompatParcelizer2.setHasDecor;
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    builder.MediaBrowserCompat$SearchResultReceiver = str;
                    String str3 = IconCompatParcelizer2.Keep;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    builder.MediaBrowserCompat$MediaItem = str3;
                    String str4 = IconCompatParcelizer2.AppCompatActivity;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    builder.MediaDescriptionCompat = str4;
                    String str5 = IconCompatParcelizer2.AppCompatDialogFragment;
                    if (str5 == null) {
                        str5 = str2;
                    }
                    builder.RatingCompat = str5;
                    String str6 = IconCompatParcelizer2.setContentView;
                    if (str6 != null) {
                        str2 = str6;
                    }
                    builder.f2726x50fd9e4a = str2;
                    builder.MediaMetadataCompat = MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper;
                    builder.IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
                    builder.MediaSessionCompat$QueueItem = IconCompatParcelizer2.setChecked;
                }
                if (setuuidfromutf8bytes.setIcon) {
                    this.MediaDescriptionCompat.read(builder);
                } else if (setuuidfromutf8bytes.setShortcut != null) {
                    this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(builder);
                } else if ("E_DONATION_FUNCTION".equalsIgnoreCase(setuuidfromutf8bytes.setOverflowReserved)) {
                    AppMeasurementContentProvider appMeasurementContentProvider = this.MediaDescriptionCompat;
                    ImmutableSortedSet.SerializedForm write2 = ImmutableSortedSet.SerializedForm.write();
                    write2.write = this.MediaBrowserCompat$SearchResultReceiver.AppCompatDialogFragment;
                    write2.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$MediaItem;
                    write2.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem();
                    appMeasurementContentProvider.read(write2);
                } else {
                    this.MediaDescriptionCompat.write(builder);
                }
                this.MediaDescriptionCompat.IconCompatParcelizer(new o$a$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
            }
        }
    }
}

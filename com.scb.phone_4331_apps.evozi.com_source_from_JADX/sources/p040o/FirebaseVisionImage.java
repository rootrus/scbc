package p040o;

import java.util.ArrayList;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionImage */
public final class FirebaseVisionImage extends writeUInt64NoTag<ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver> {
    public chain IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final forArray MediaBrowserCompat$ItemReceiver;
    public ArrayList<chain> write;

    /* renamed from: o.FirebaseVisionImage$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver> {
        private /* synthetic */ FirebaseVisionImage IconCompatParcelizer;

        public IconCompatParcelizer(FirebaseVisionImage firebaseVisionImage) {
            this.IconCompatParcelizer = firebaseVisionImage;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver extractorResponse$MediaBrowserCompat$CustomActionResultReceiver = (ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver) obj;
            extractorResponse$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(false);
            extractorResponse$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(false);
            extractorResponse$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            forArray MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            String str = FirebaseVisionImage.IconCompatParcelizer(this.IconCompatParcelizer).MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) str, "creditCardDisplay.cardRefNo");
            extractorResponse$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver.write(str, false, FirebaseVisionImage.write(this.IconCompatParcelizer)));
            extractorResponse$MediaBrowserCompat$CustomActionResultReceiver.read();
        }
    }

    /* renamed from: o.FirebaseVisionImage$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver> {
        private /* synthetic */ FirebaseVisionImage IconCompatParcelizer;

        public read(FirebaseVisionImage firebaseVisionImage) {
            this.IconCompatParcelizer = firebaseVisionImage;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver extractorResponse$MediaBrowserCompat$CustomActionResultReceiver = (ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver) obj;
            extractorResponse$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            extractorResponse$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(false);
            forArray MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            String str = FirebaseVisionImage.IconCompatParcelizer(this.IconCompatParcelizer).MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) str, "creditCardDisplay.cardRefNo");
            extractorResponse$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver.write(str, false, FirebaseVisionImage.write(this.IconCompatParcelizer)));
            extractorResponse$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(true);
        }
    }

    /* renamed from: o.FirebaseVisionImage$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver> {
        private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ FirebaseVisionImage read;

        public write(FirebaseVisionImage firebaseVisionImage, boolean z) {
            this.read = firebaseVisionImage;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver extractorResponse$MediaBrowserCompat$CustomActionResultReceiver = (ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver) obj;
            extractorResponse$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
            forArray MediaBrowserCompat$CustomActionResultReceiver2 = this.read.MediaBrowserCompat$ItemReceiver;
            String str = FirebaseVisionImage.IconCompatParcelizer(this.read).MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) str, "creditCardDisplay.cardRefNo");
            extractorResponse$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(z, MediaBrowserCompat$CustomActionResultReceiver2.write(str, this.MediaBrowserCompat$CustomActionResultReceiver, FirebaseVisionImage.write(this.read)));
        }
    }

    public static final /* synthetic */ chain IconCompatParcelizer(FirebaseVisionImage firebaseVisionImage) {
        chain chain = firebaseVisionImage.IconCompatParcelizer;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        return chain;
    }

    public static final /* synthetic */ ArrayList write(FirebaseVisionImage firebaseVisionImage) {
        ArrayList<chain> arrayList = firebaseVisionImage.write;
        if (arrayList == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplayList");
        }
        return arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public FirebaseVisionImage(RegularImmutableBiMap regularImmutableBiMap, forArray forarray) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) forarray, "controller");
        this.MediaBrowserCompat$ItemReceiver = forarray;
    }
}

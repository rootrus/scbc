package p040o;

import android.os.Environment;
import java.util.ArrayList;
import p040o.ExtractorResponse;
import p040o.getSession;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionCloudDocumentRecognizerOptions */
public class FirebaseVisionCloudDocumentRecognizerOptions extends writeUInt64NoTag<ExceptionResponse> {
    private getRemoteSocketAddress MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.FirebaseVisionCloudDocumentRecognizerOptions$Builder */
    public final class Builder extends writeUInt64NoTag<ExtractorResponse.write> {
        private final forArray IconCompatParcelizer;
        public ArrayList<chain> MediaBrowserCompat$ItemReceiver;
        public Component read;
        public chain write;

        /* renamed from: o.FirebaseVisionCloudDocumentRecognizerOptions$Builder$MediaDescriptionCompat */
        public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.write> {
            private /* synthetic */ String IconCompatParcelizer;
            private /* synthetic */ Component MediaBrowserCompat$ItemReceiver;

            public MediaDescriptionCompat(Component component, String str) {
                this.MediaBrowserCompat$ItemReceiver = component;
                this.IconCompatParcelizer = str;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ExtractorResponse.write write = (ExtractorResponse.write) obj;
                write.write(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
                write.IconCompatParcelizer(this.IconCompatParcelizer.length() > 0);
            }
        }

        /* renamed from: o.FirebaseVisionCloudDocumentRecognizerOptions$Builder$read */
        static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Component, HmlVerifyPhoneValidateOtpActivity> {
            final /* synthetic */ Builder MediaBrowserCompat$ItemReceiver;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            read(Builder builder) {
                super(1);
                this.MediaBrowserCompat$ItemReceiver = builder;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                final Component component = (Component) obj;
                onGetStartedClick.write((Object) component, "display");
                this.MediaBrowserCompat$ItemReceiver.read = component;
                Builder builder = this.MediaBrowserCompat$ItemReceiver;
                writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.write>(this) {
                    private /* synthetic */ read MediaBrowserCompat$CustomActionResultReceiver;

                    {
                        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        ExtractorResponse.write write = (ExtractorResponse.write) obj;
                        write.aj_();
                        write.MediaBrowserCompat$ItemReceiver(true);
                        write.read();
                        Builder.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, component);
                    }
                };
                if (builder.RatingCompat != null) {
                    r1.IconCompatParcelizer(builder.RatingCompat);
                }
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }

        /* renamed from: o.FirebaseVisionCloudDocumentRecognizerOptions$Builder$write */
        static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.write> {
            public static final write write = new write();

            write() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((ExtractorResponse.write) obj).AlertController$RecycleListView();
            }
        }

        /* renamed from: o.FirebaseVisionCloudDocumentRecognizerOptions$Builder$IconCompatParcelizer */
        public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.write> {
            private /* synthetic */ Builder MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ String read;

            public IconCompatParcelizer(Builder builder, String str) {
                this.MediaBrowserCompat$CustomActionResultReceiver = builder;
                this.read = str;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ExtractorResponse.write write = (ExtractorResponse.write) obj;
                Component MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.read;
                if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                    write.read(this.read, Builder.read(this.MediaBrowserCompat$CustomActionResultReceiver), Builder.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver), Builder.read(this.read, MediaBrowserCompat$CustomActionResultReceiver2));
                }
            }
        }

        public static final /* synthetic */ ArrayList MediaBrowserCompat$ItemReceiver(Builder builder) {
            ArrayList<chain> arrayList = builder.MediaBrowserCompat$ItemReceiver;
            if (arrayList == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplayList");
            }
            return arrayList;
        }

        public static final /* synthetic */ chain read(Builder builder) {
            chain chain = builder.write;
            if (chain == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
            }
            return chain;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public Builder(forArray forarray, RegularImmutableBiMap regularImmutableBiMap) {
            super(regularImmutableBiMap);
            onGetStartedClick.write((Object) forarray, "controller");
            onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
            this.IconCompatParcelizer = forarray;
        }

        public static final /* synthetic */ String read(String str, Component component) {
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.PAPER.name())) {
                return component.write;
            }
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.EMAIL.name()) ? component.MediaBrowserCompat$ItemReceiver : "";
        }

        public static final /* synthetic */ void read(Builder builder, String str) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.write;
            if (builder.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(builder.RatingCompat);
            }
            forArray forarray = builder.IconCompatParcelizer;
            FundFactSheetActivity read2 = new read(builder);
            FundFactSheetActivity firebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$ItemReceiver = new C3382x86b5608c(builder);
            onGetStartedClick.write((Object) str, "cardRefNo");
            onGetStartedClick.write((Object) read2, "onSuccess");
            onGetStartedClick.write((Object) firebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$ItemReceiver, "onError");
            forarray.IconCompatParcelizer.read(read2, firebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$ItemReceiver, new getSession.read(str), new forArray$MediaBrowserCompat$CustomActionResultReceiver(forarray), forarray.MediaBrowserCompat$ItemReceiver);
        }

        public static final /* synthetic */ void IconCompatParcelizer(Builder builder, Component component) {
            writeUInt64NoTag.IconCompatParcelizer firebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$SearchResultReceiver = new C3385xabe7255e(component);
            if (builder.RatingCompat != null) {
                firebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(builder.RatingCompat);
            }
        }
    }

    @HmlPinActivity
    public FirebaseVisionCloudDocumentRecognizerOptions(getRemoteSocketAddress getremotesocketaddress, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        Environment.getExternalStorageState();
        this.MediaBrowserCompat$ItemReceiver = getremotesocketaddress;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        boolean z = true;
        if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.setShortcut()) {
            FirebaseModelDataType firebaseModelDataType = FirebaseModelDataType.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                firebaseModelDataType.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        FirebaseModelOutputs firebaseModelOutputs = FirebaseModelOutputs.MediaBrowserCompat$ItemReceiver;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            firebaseModelOutputs.IconCompatParcelizer(this.RatingCompat);
        }
    }
}

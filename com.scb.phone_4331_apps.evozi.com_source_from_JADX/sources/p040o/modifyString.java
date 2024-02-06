package p040o;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p040o.Constraints;
import p040o.access$2300;
import p040o.getFirstName;
import p040o.getUseClientMode;
import p040o.isOutputShutdown;
import p040o.partitionImpl;
import p040o.writeUInt64NoTag;

/* renamed from: o.modifyString */
public final class modifyString extends writeUInt64NoTag<getFirstName.IconCompatParcelizer> {
    /* access modifiers changed from: private */
    public final partitionImpl MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.modifyString$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.IconCompatParcelizer> {
        final /* synthetic */ modifyString IconCompatParcelizer;
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ String read;
        private /* synthetic */ int write;

        public IconCompatParcelizer(modifyString modifystring, String str, String str2, int i, String str3) {
            this.IconCompatParcelizer = modifystring;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.write = i;
            this.read = str3;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            final getFirstName.IconCompatParcelizer iconCompatParcelizer = (getFirstName.IconCompatParcelizer) obj;
            iconCompatParcelizer.AlertController$RecycleListView();
            partitionImpl MediaBrowserCompat$CustomActionResultReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            Constraints.ConstrainedRandomAccessList constrainedRandomAccessList = new Constraints.ConstrainedRandomAccessList(this.MediaBrowserCompat$ItemReceiver, this.write, this.read);
            FundFactSheetActivity r5 = new FundFactSheetActivity<isValue, HmlVerifyPhoneValidateOtpActivity>(this) {
                private /* synthetic */ IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    isValue isvalue = (isValue) obj;
                    onGetStartedClick.write((Object) isvalue, "display");
                    modifyString.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, isvalue);
                    modifyString.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, isvalue);
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            };
            FundFactSheetActivity r6 = new FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity>(this) {
                private /* synthetic */ IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

                {
                    this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    onGetStartedClick.write((Object) th, "e");
                    iconCompatParcelizer.aj_();
                    iconCompatParcelizer.IconCompatParcelizer(false);
                    iconCompatParcelizer.write(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            };
            onGetStartedClick.write((Object) str, "cardRefNo");
            onGetStartedClick.write((Object) constrainedRandomAccessList, "request");
            onGetStartedClick.write((Object) r5, "onSuccess");
            onGetStartedClick.write((Object) r6, "onError");
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver.read(r5, r6, new isOutputShutdown.write(str, constrainedRandomAccessList), new partitionImpl.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2), MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.modifyString$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.IconCompatParcelizer> {
        public static final MediaDescriptionCompat MediaBrowserCompat$ItemReceiver = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getFirstName.IconCompatParcelizer) obj).write();
        }
    }

    /* renamed from: o.modifyString$MediaMetadataCompat */
    static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.IconCompatParcelizer> {
        private /* synthetic */ isValue write;

        MediaMetadataCompat(isValue isvalue) {
            this.write = isvalue;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getFirstName.IconCompatParcelizer iconCompatParcelizer = (getFirstName.IconCompatParcelizer) obj;
            iconCompatParcelizer.RatingCompat();
            iconCompatParcelizer.MediaDescriptionCompat();
            iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(this.write.write);
        }
    }

    /* renamed from: o.modifyString$RatingCompat */
    static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.IconCompatParcelizer> {
        private /* synthetic */ isValue IconCompatParcelizer;

        RatingCompat(isValue isvalue) {
            this.IconCompatParcelizer = isvalue;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getFirstName.IconCompatParcelizer iconCompatParcelizer = (getFirstName.IconCompatParcelizer) obj;
            if (this.IconCompatParcelizer.MediaBrowserCompat$MediaItem) {
                iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer.IconCompatParcelizer);
            } else {
                iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer.write);
            }
        }
    }

    /* renamed from: o.modifyString$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.IconCompatParcelizer> {
        private /* synthetic */ float write = -1.0f;

        public read(float f) {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getFirstName.IconCompatParcelizer) obj).IconCompatParcelizer(this.write);
        }
    }

    /* renamed from: o.modifyString$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.IconCompatParcelizer> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ modifyString MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ int MediaBrowserCompat$MediaItem;
        final /* synthetic */ boolean read;
        private /* synthetic */ String write;

        public write(modifyString modifystring, String str, String str2, int i, String str3, boolean z) {
            this.MediaBrowserCompat$ItemReceiver = modifystring;
            this.IconCompatParcelizer = str;
            this.write = str2;
            this.MediaBrowserCompat$MediaItem = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.read = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            final getFirstName.IconCompatParcelizer iconCompatParcelizer = (getFirstName.IconCompatParcelizer) obj;
            iconCompatParcelizer.AlertController$RecycleListView();
            partitionImpl MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            String str = this.IconCompatParcelizer;
            Constraints.ConstrainedRandomAccessList constrainedRandomAccessList = new Constraints.ConstrainedRandomAccessList(this.write, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$CustomActionResultReceiver);
            FundFactSheetActivity r5 = new FundFactSheetActivity<getProvidedInterfaces, HmlVerifyPhoneValidateOtpActivity>(this) {
                private /* synthetic */ write read;

                {
                    this.read = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    onGetStartedClick.write((Object) (getProvidedInterfaces) obj, "it");
                    modifyString.write(this.read.MediaBrowserCompat$ItemReceiver, this.read.read);
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            };
            FundFactSheetActivity r6 = new FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity>(this) {
                private /* synthetic */ write read;

                {
                    this.read = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    onGetStartedClick.write((Object) th, "e");
                    iconCompatParcelizer.aj_();
                    iconCompatParcelizer.write(this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            };
            onGetStartedClick.write((Object) str, "ref");
            onGetStartedClick.write((Object) constrainedRandomAccessList, "request");
            onGetStartedClick.write((Object) r5, "onSuccess");
            onGetStartedClick.write((Object) r6, "onError");
            MediaBrowserCompat$CustomActionResultReceiver2.read.read(r5, r6, new getUseClientMode.IconCompatParcelizer(str, constrainedRandomAccessList), new partitionImpl.write(MediaBrowserCompat$CustomActionResultReceiver2), MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public modifyString(RegularImmutableBiMap regularImmutableBiMap, partitionImpl partitionimpl) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) partitionimpl, "controller");
        this.MediaBrowserCompat$ItemReceiver = partitionimpl;
    }

    public static final /* synthetic */ double MediaBrowserCompat$ItemReceiver(modifyString modifystring, String str) {
        Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).parse(str);
        onGetStartedClick.IconCompatParcelizer((Object) parse, "getSimpleDateFormat().parse(dateExpiry)");
        long time = parse.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
        Calendar instance = Calendar.getInstance();
        onGetStartedClick.IconCompatParcelizer((Object) instance, "Calendar.getInstance()");
        String format = simpleDateFormat2.format(instance.getTime());
        onGetStartedClick.IconCompatParcelizer((Object) format, "SimpleDateFormat(DateUti…endar.getInstance().time)");
        Date parse2 = simpleDateFormat.parse(format);
        onGetStartedClick.IconCompatParcelizer((Object) parse2, "getSimpleDateFormat().parse(getDateNowFormat())");
        long time2 = time - parse2.getTime();
        return (((double) ((time2 / 60000) % 60)) + (((double) ((time2 / 1000) % 60)) / 60.0d)) * 60.0d * 1000.0d;
    }

    public static final /* synthetic */ void read(modifyString modifystring, isValue isvalue) {
        writeUInt64NoTag.IconCompatParcelizer ratingCompat = new RatingCompat(isvalue);
        if (modifystring.RatingCompat != null) {
            ratingCompat.IconCompatParcelizer(modifystring.RatingCompat);
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(modifyString modifystring, isValue isvalue) {
        String str = isvalue.MediaBrowserCompat$ItemReceiver;
        int hashCode = str.hashCode();
        boolean z = true;
        if (hashCode != -591252731) {
            if (hashCode != 2408251) {
                if (hashCode == 2614205 && str.equals("USED")) {
                    writeUInt64NoTag.IconCompatParcelizer modifystring_mediabrowsercompat_mediaitem = new modifyString$MediaBrowserCompat$MediaItem(isvalue);
                    if (modifystring.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        modifystring_mediabrowsercompat_mediaitem.IconCompatParcelizer(modifystring.RatingCompat);
                    }
                }
            } else if (str.equals("REDEEMED")) {
                writeUInt64NoTag.IconCompatParcelizer modifystring_mediabrowsercompat_searchresultreceiver = new modifyString$MediaBrowserCompat$SearchResultReceiver(modifystring, isvalue);
                if (modifystring.RatingCompat != null) {
                    modifystring_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(modifystring.RatingCompat);
                }
                writeUInt64NoTag.IconCompatParcelizer modifystring_mediasessioncompat_token = new modifyString$MediaSessionCompat$Token(modifystring, isvalue);
                if (modifystring.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    modifystring_mediasessioncompat_token.IconCompatParcelizer(modifystring.RatingCompat);
                }
            }
        } else if (str.equals("EXPIRED")) {
            writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new MediaMetadataCompat(isvalue);
            if (modifystring.RatingCompat == null) {
                z = false;
            }
            if (z) {
                mediaMetadataCompat.IconCompatParcelizer(modifystring.RatingCompat);
            }
        }
    }

    public static final /* synthetic */ void write(modifyString modifystring, boolean z) {
        writeUInt64NoTag.IconCompatParcelizer modifystring_mediasessioncompat_resultreceiverwrapper = new modifyString$MediaSessionCompat$ResultReceiverWrapper(z);
        if (modifystring.RatingCompat != null) {
            modifystring_mediasessioncompat_resultreceiverwrapper.IconCompatParcelizer(modifystring.RatingCompat);
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(modifyString modifystring, isValue isvalue) {
        writeUInt64NoTag.IconCompatParcelizer modifystring_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver = new C4975x77b511(isvalue);
        if (modifystring.RatingCompat != null) {
            modifystring_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver.IconCompatParcelizer(modifystring.RatingCompat);
        }
    }
}

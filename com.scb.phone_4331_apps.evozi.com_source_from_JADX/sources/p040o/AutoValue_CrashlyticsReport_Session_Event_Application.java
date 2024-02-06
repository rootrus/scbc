package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application */
public final class AutoValue_CrashlyticsReport_Session_Event_Application implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C3075x82a1f0a0();
    public final String IconCompatParcelizer;
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public final List<String> MediaBrowserCompat$ItemReceiver;
    public final int MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoValue_CrashlyticsReport_Session_Event_Application)) {
            return false;
        }
        AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application = (AutoValue_CrashlyticsReport_Session_Event_Application) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) autoValue_CrashlyticsReport_Session_Event_Application.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) autoValue_CrashlyticsReport_Session_Event_Application.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) autoValue_CrashlyticsReport_Session_Event_Application.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) autoValue_CrashlyticsReport_Session_Event_Application.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) autoValue_CrashlyticsReport_Session_Event_Application.MediaDescriptionCompat) && this.MediaMetadataCompat == autoValue_CrashlyticsReport_Session_Event_Application.MediaMetadataCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) autoValue_CrashlyticsReport_Session_Event_Application.MediaBrowserCompat$ItemReceiver) && this.MediaBrowserCompat$SearchResultReceiver == autoValue_CrashlyticsReport_Session_Event_Application.MediaBrowserCompat$SearchResultReceiver && this.MediaBrowserCompat$CustomActionResultReceiver == autoValue_CrashlyticsReport_Session_Event_Application.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        int i2 = this.MediaMetadataCompat;
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + i) * 31) + this.MediaBrowserCompat$SearchResultReceiver) * 31) + this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidTravelWalletDisplay(currency=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", currencyName=");
        sb.append(this.write);
        sb.append(", flagImage=");
        sb.append(this.RatingCompat);
        sb.append(", amount=");
        sb.append(this.read);
        sb.append(", thbEquivalentAmount=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", sortSequence=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", allowTag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", displayWalletFlag=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", displayForBuyCurrencyFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeInt(this.MediaMetadataCompat);
        parcel.writeStringList(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application$1 */
    public final class C30731 implements Parcelable {
        public static final Parcelable.Creator<C30731> CREATOR = new C3074x28f24dad();
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        private final int MediaDescriptionCompat;
        public final String read;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30731)) {
                return false;
            }
            C30731 r3 = (C30731) obj;
            return this.MediaDescriptionCompat == r3.MediaDescriptionCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) r3.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            int i = this.MediaDescriptionCompat;
            String str = this.read;
            int i2 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$MediaItem;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            return (((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UnregisteredAccountDisplay(sortSequence=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", accountNo=");
            sb.append(this.read);
            sb.append(", productType=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", branchDescription=");
            sb.append(this.write);
            sb.append(", accountMask=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", productTypeCode=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", cardCategory=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public C30731(int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.MediaDescriptionCompat = i;
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.write = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.MediaBrowserCompat$MediaItem = str5;
            this.MediaBrowserCompat$CustomActionResultReceiver = str6;
        }

        /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application$1$read */
        public static final class read implements newCheckExtractor {
            private final /* synthetic */ List IconCompatParcelizer;
            private final /* synthetic */ GooglePlayServicesUtilLight MediaBrowserCompat$CustomActionResultReceiver;
            private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
            private final /* synthetic */ int MediaBrowserCompat$MediaItem;
            private final /* synthetic */ ContentModelParser read;
            private final /* synthetic */ String write;

            private read() {
            }

            public /* synthetic */ read(GooglePlayServicesUtilLight googlePlayServicesUtilLight, List list, ContentModelParser contentModelParser, List list2, String str, int i) {
                this.MediaBrowserCompat$CustomActionResultReceiver = googlePlayServicesUtilLight;
                this.IconCompatParcelizer = list;
                this.read = contentModelParser;
                this.MediaBrowserCompat$ItemReceiver = list2;
                this.write = str;
                this.MediaBrowserCompat$MediaItem = i;
            }

            public final void IconCompatParcelizer(int i) {
                String str;
                String str2;
                PlacesStatusCodes placesStatusCodes;
                GooglePlayServicesUtilLight googlePlayServicesUtilLight = this.MediaBrowserCompat$CustomActionResultReceiver;
                List list = this.IconCompatParcelizer;
                ContentModelParser contentModelParser = this.read;
                List list2 = this.MediaBrowserCompat$ItemReceiver;
                String str3 = this.write;
                int i2 = this.MediaBrowserCompat$MediaItem;
                if (i < list.size() && i < contentModelParser.MediaDescriptionCompat) {
                    getOpacityAtPosition getopacityatposition = (getOpacityAtPosition) list.get(i);
                    boolean z = false;
                    PlaceLikelihoodBuffer RatingCompat = new PlaceLikelihoodBuffer().RatingCompat(GooglePlayServicesUtilLight.IconCompatParcelizer(getopacityatposition)).write(getopacityatposition.write).IconCompatParcelizer(i2 + i).MediaDescriptionCompat(getopacityatposition.MediaBrowserCompat$ItemReceiver).RatingCompat(getopacityatposition.MediaBrowserCompat$CustomActionResultReceiver == 1);
                    if (getopacityatposition.MediaMetadataCompat == 1) {
                        z = true;
                    }
                    PlaceLikelihoodBuffer write2 = RatingCompat.MediaMetadataCompat(z).write(getopacityatposition.RatingCompat);
                    if ("en".equalsIgnoreCase(str3)) {
                        str = getopacityatposition.MediaBrowserCompat$SearchResultReceiver;
                    } else {
                        str = getopacityatposition.MediaBrowserCompat$MediaItem;
                    }
                    PlaceLikelihoodBuffer PlaybackStateCompat = write2.PlaybackStateCompat(str);
                    if ("en".equalsIgnoreCase(str3)) {
                        str2 = getopacityatposition.MediaDescriptionCompat;
                    } else {
                        str2 = getopacityatposition.ParcelableVolumeInfo;
                    }
                    PlaceLikelihoodBuffer write3 = PlaybackStateCompat.AlertController$RecycleListView(str2).write(getopacityatposition.MediaSessionCompat$Token).write(setLocale.NTB_PREDICTIVE);
                    if (getopacityatposition.MediaSessionCompat$ResultReceiverWrapper != null) {
                        placesStatusCodes = googlePlayServicesUtilLight.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(getopacityatposition.MediaSessionCompat$ResultReceiverWrapper);
                    } else {
                        placesStatusCodes = null;
                    }
                    list2.add(write3.MediaBrowserCompat$ItemReceiver(placesStatusCodes).MediaBrowserCompat$ItemReceiver(getopacityatposition.read));
                }
                if (i == list.size() && i != 0 && i < contentModelParser.MediaDescriptionCompat) {
                    list2.add(PlaceLikelihoodBuffer.read().MediaBrowserCompat$ItemReceiver(0).write(setLocale.LEARN_MORE).IconCompatParcelizer(i2 + i).mo26268x50fd9e4a(3 - (list.size() % 3)));
                }
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C30731(Parcel parcel) {
            this(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            onGetStartedClick.write((Object) parcel, "source");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "dest");
            parcel.writeInt(this.MediaDescriptionCompat);
            parcel.writeString(this.read);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.write);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application$Builder */
    public final class Builder implements Parcelable {
        public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
        public final setTimestamp AlertController$RecycleListView;
        public final getExecution IconCompatParcelizer;
        public final getExecution Keep;
        public final getExecution MediaBrowserCompat$CustomActionResultReceiver;
        public final getExecution MediaBrowserCompat$ItemReceiver;
        public final boolean MediaBrowserCompat$MediaItem;
        public final boolean MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final boolean f2674x50fd9e4a;
        public final boolean MediaDescriptionCompat;
        public final boolean MediaMetadataCompat;
        public final boolean MediaSessionCompat$QueueItem;
        public final boolean MediaSessionCompat$ResultReceiverWrapper;
        public final boolean MediaSessionCompat$Token;
        public final boolean ParcelableVolumeInfo;
        public final getExecution PlaybackStateCompat;
        public final getExecution PlaybackStateCompat$CustomAction;
        public final boolean RatingCompat;
        public final getExecution read;
        public final getExecution setHasDecor;
        public final getExecution write;

        /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application$Builder$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                onGetStartedClick.write((Object) parcel2, "in");
                return new Builder((getExecution) parcel2.readParcelable(Builder.class.getClassLoader()), (getExecution) parcel2.readParcelable(Builder.class.getClassLoader()), (getExecution) parcel2.readParcelable(Builder.class.getClassLoader()), (getExecution) parcel2.readParcelable(Builder.class.getClassLoader()), (getExecution) parcel2.readParcelable(Builder.class.getClassLoader()), (getExecution) parcel2.readParcelable(Builder.class.getClassLoader()), (getExecution) parcel2.readParcelable(Builder.class.getClassLoader()), (getExecution) parcel2.readParcelable(Builder.class.getClassLoader()), (getExecution) parcel2.readParcelable(Builder.class.getClassLoader()), (setTimestamp) setTimestamp.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            public final Object[] newArray(int i) {
                return new Builder[i];
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) builder.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) builder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) builder.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat$CustomAction, (Object) builder.PlaybackStateCompat$CustomAction) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setHasDecor, (Object) builder.setHasDecor) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) builder.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat, (Object) builder.PlaybackStateCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.Keep, (Object) builder.Keep) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) builder.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AlertController$RecycleListView, (Object) builder.AlertController$RecycleListView) && this.MediaSessionCompat$Token == builder.MediaSessionCompat$Token && this.MediaMetadataCompat == builder.MediaMetadataCompat && this.MediaBrowserCompat$SearchResultReceiver == builder.MediaBrowserCompat$SearchResultReceiver && this.MediaBrowserCompat$MediaItem == builder.MediaBrowserCompat$MediaItem && this.MediaSessionCompat$QueueItem == builder.MediaSessionCompat$QueueItem && this.RatingCompat == builder.RatingCompat && this.MediaDescriptionCompat == builder.MediaDescriptionCompat && this.ParcelableVolumeInfo == builder.ParcelableVolumeInfo && this.f2674x50fd9e4a == builder.f2674x50fd9e4a && this.MediaSessionCompat$ResultReceiverWrapper == builder.MediaSessionCompat$ResultReceiverWrapper;
        }

        public final int hashCode() {
            getExecution getexecution = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = getexecution != null ? getexecution.hashCode() : 0;
            getExecution getexecution2 = this.write;
            int hashCode2 = getexecution2 != null ? getexecution2.hashCode() : 0;
            getExecution getexecution3 = this.read;
            int hashCode3 = getexecution3 != null ? getexecution3.hashCode() : 0;
            getExecution getexecution4 = this.PlaybackStateCompat$CustomAction;
            int hashCode4 = getexecution4 != null ? getexecution4.hashCode() : 0;
            getExecution getexecution5 = this.setHasDecor;
            int hashCode5 = getexecution5 != null ? getexecution5.hashCode() : 0;
            getExecution getexecution6 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode6 = getexecution6 != null ? getexecution6.hashCode() : 0;
            getExecution getexecution7 = this.PlaybackStateCompat;
            int hashCode7 = getexecution7 != null ? getexecution7.hashCode() : 0;
            getExecution getexecution8 = this.Keep;
            int hashCode8 = getexecution8 != null ? getexecution8.hashCode() : 0;
            getExecution getexecution9 = this.IconCompatParcelizer;
            int hashCode9 = getexecution9 != null ? getexecution9.hashCode() : 0;
            setTimestamp settimestamp = this.AlertController$RecycleListView;
            if (settimestamp != null) {
                i = settimestamp.hashCode();
            }
            boolean z = this.MediaSessionCompat$Token;
            if (z) {
                z = true;
            }
            boolean z2 = this.MediaMetadataCompat;
            if (z2) {
                z2 = true;
            }
            boolean z3 = this.MediaBrowserCompat$SearchResultReceiver;
            if (z3) {
                z3 = true;
            }
            boolean z4 = this.MediaBrowserCompat$MediaItem;
            if (z4) {
                z4 = true;
            }
            boolean z5 = this.MediaSessionCompat$QueueItem;
            boolean z6 = z5 ? true : z5;
            boolean z7 = this.RatingCompat;
            boolean z8 = z7 ? true : z7;
            boolean z9 = this.MediaDescriptionCompat;
            boolean z10 = z9 ? true : z9;
            boolean z11 = this.ParcelableVolumeInfo;
            boolean z12 = z11 ? true : z11;
            boolean z13 = this.f2674x50fd9e4a;
            boolean z14 = z13 ? true : z13;
            boolean z15 = this.MediaSessionCompat$ResultReceiverWrapper;
            if (z15) {
                z15 = true;
            }
            return (((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + (z6 ? 1 : 0)) * 31) + (z8 ? 1 : 0)) * 31) + (z10 ? 1 : 0)) * 31) + (z12 ? 1 : 0)) * 31) + (z14 ? 1 : 0)) * 31) + (z15 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UnregisteredAccountListDisplay(depositAccounts=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", cardAccounts=");
            sb.append(this.write);
            sb.append(", cardPendingAccounts=");
            sb.append(this.read);
            sb.append(", loanAccounts=");
            sb.append(this.PlaybackStateCompat$CustomAction);
            sb.append(", smeLoanAccounts=");
            sb.append(this.setHasDecor);
            sb.append(", clientAccounts=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", merchantWalletAccounts=");
            sb.append(this.PlaybackStateCompat);
            sb.append(", prepaidAccounts=");
            sb.append(this.Keep);
            sb.append(", debitAccounts=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", securitiesList=");
            sb.append(this.AlertController$RecycleListView);
            sb.append(", isVerificationRequired=");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(", isAllowAddDeposits=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", isAllowAddCards=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", isAllowAddLoans=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", isAllowAddSMELoans=");
            sb.append(this.MediaSessionCompat$QueueItem);
            sb.append(", isAllowAddMerchantWallets=");
            sb.append(this.RatingCompat);
            sb.append(", isAllowAddClients=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", isAllowPrepaid=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", isAllowDebit=");
            sb.append(this.f2674x50fd9e4a);
            sb.append(", isAllowAddSecurities=");
            sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, i);
            parcel.writeParcelable(this.write, i);
            parcel.writeParcelable(this.read, i);
            parcel.writeParcelable(this.PlaybackStateCompat$CustomAction, i);
            parcel.writeParcelable(this.setHasDecor, i);
            parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
            parcel.writeParcelable(this.PlaybackStateCompat, i);
            parcel.writeParcelable(this.Keep, i);
            parcel.writeParcelable(this.IconCompatParcelizer, i);
            this.AlertController$RecycleListView.writeToParcel(parcel, 0);
            parcel.writeInt(this.MediaSessionCompat$Token ? 1 : 0);
            parcel.writeInt(this.MediaMetadataCompat ? 1 : 0);
            parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver ? 1 : 0);
            parcel.writeInt(this.MediaBrowserCompat$MediaItem ? 1 : 0);
            parcel.writeInt(this.MediaSessionCompat$QueueItem ? 1 : 0);
            parcel.writeInt(this.RatingCompat ? 1 : 0);
            parcel.writeInt(this.MediaDescriptionCompat ? 1 : 0);
            parcel.writeInt(this.ParcelableVolumeInfo ? 1 : 0);
            parcel.writeInt(this.f2674x50fd9e4a ? 1 : 0);
            parcel.writeInt(this.MediaSessionCompat$ResultReceiverWrapper ? 1 : 0);
        }

        public Builder(getExecution getexecution, getExecution getexecution2, getExecution getexecution3, getExecution getexecution4, getExecution getexecution5, getExecution getexecution6, getExecution getexecution7, getExecution getexecution8, getExecution getexecution9, setTimestamp settimestamp, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
            getExecution getexecution10 = getexecution4;
            getExecution getexecution11 = getexecution5;
            getExecution getexecution12 = getexecution6;
            getExecution getexecution13 = getexecution7;
            getExecution getexecution14 = getexecution8;
            getExecution getexecution15 = getexecution9;
            setTimestamp settimestamp2 = settimestamp;
            onGetStartedClick.write((Object) getexecution, "depositAccounts");
            onGetStartedClick.write((Object) getexecution2, "cardAccounts");
            onGetStartedClick.write((Object) getexecution3, "cardPendingAccounts");
            onGetStartedClick.write((Object) getexecution10, "loanAccounts");
            onGetStartedClick.write((Object) getexecution11, "smeLoanAccounts");
            onGetStartedClick.write((Object) getexecution12, "clientAccounts");
            onGetStartedClick.write((Object) getexecution13, "merchantWalletAccounts");
            onGetStartedClick.write((Object) getexecution14, "prepaidAccounts");
            onGetStartedClick.write((Object) getexecution15, "debitAccounts");
            onGetStartedClick.write((Object) settimestamp2, "securitiesList");
            this.MediaBrowserCompat$ItemReceiver = getexecution;
            this.write = getexecution2;
            this.read = getexecution3;
            this.PlaybackStateCompat$CustomAction = getexecution10;
            this.setHasDecor = getexecution11;
            this.MediaBrowserCompat$CustomActionResultReceiver = getexecution12;
            this.PlaybackStateCompat = getexecution13;
            this.Keep = getexecution14;
            this.IconCompatParcelizer = getexecution15;
            this.AlertController$RecycleListView = settimestamp2;
            this.MediaSessionCompat$Token = z;
            this.MediaMetadataCompat = z2;
            this.MediaBrowserCompat$SearchResultReceiver = z3;
            this.MediaBrowserCompat$MediaItem = z4;
            this.MediaSessionCompat$QueueItem = z5;
            this.RatingCompat = z6;
            this.MediaDescriptionCompat = z7;
            this.ParcelableVolumeInfo = z8;
            this.f2674x50fd9e4a = z9;
            this.MediaSessionCompat$ResultReceiverWrapper = z10;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application(String str, String str2, String str3, String str4, String str5, int i, List<String> list, int i2, int i3) {
        onGetStartedClick.write((Object) str, "currency");
        onGetStartedClick.write((Object) str2, "currencyName");
        onGetStartedClick.write((Object) str3, "flagImage");
        onGetStartedClick.write((Object) str4, "amount");
        onGetStartedClick.write((Object) str5, "thbEquivalentAmount");
        onGetStartedClick.write((Object) list, "allowTag");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.RatingCompat = str3;
        this.read = str4;
        this.MediaDescriptionCompat = str5;
        this.MediaMetadataCompat = i;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaBrowserCompat$SearchResultReceiver = i2;
        this.MediaBrowserCompat$CustomActionResultReceiver = i3;
    }
}

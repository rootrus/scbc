package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;

/* renamed from: o.CrashlyticsController$17$MediaBrowserCompat$ItemReceiver */
public final class CrashlyticsController$17$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        onGetStartedClick.write((Object) parcel2, "in");
        CrashlyticsController.C322317 r21 = r2;
        CrashlyticsController.C322317 r2 = new Parcelable(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (CrashlyticsReport.FilesPayload.Builder) parcel2.readParcelable(CrashlyticsController.C322317.class.getClassLoader())) {
            public static final Parcelable.Creator CREATOR = new CrashlyticsController$17$MediaBrowserCompat$ItemReceiver();
            public final String AlertController$RecycleListView;
            public final String IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final String MediaBrowserCompat$MediaItem;
            public final String MediaBrowserCompat$SearchResultReceiver;

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            public final String f2690x50fd9e4a;
            public final String MediaDescriptionCompat;
            public final String MediaMetadataCompat;
            public final String MediaSessionCompat$QueueItem;
            public final String MediaSessionCompat$ResultReceiverWrapper;
            public final String MediaSessionCompat$Token;
            public final String ParcelableVolumeInfo;
            public final String PlaybackStateCompat;
            public final CrashlyticsReport.FilesPayload.Builder RatingCompat;
            public final String read;
            public final String setHasDecor;
            public final String write;

            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C322317)) {
                    return false;
                }
                C322317 r3 = (C322317) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) r3.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) r3.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) r3.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) r3.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) r3.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setHasDecor, (Object) r3.setHasDecor) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) r3.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2690x50fd9e4a, (Object) r3.f2690x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) r3.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AlertController$RecycleListView, (Object) r3.AlertController$RecycleListView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat, (Object) r3.PlaybackStateCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) r3.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) r3.RatingCompat);
            }

            public final int hashCode() {
                String str = this.MediaMetadataCompat;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.write;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.MediaSessionCompat$Token;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.ParcelableVolumeInfo;
                int hashCode5 = str5 != null ? str5.hashCode() : 0;
                String str6 = this.MediaSessionCompat$ResultReceiverWrapper;
                int hashCode6 = str6 != null ? str6.hashCode() : 0;
                String str7 = this.MediaDescriptionCompat;
                int hashCode7 = str7 != null ? str7.hashCode() : 0;
                String str8 = this.read;
                int hashCode8 = str8 != null ? str8.hashCode() : 0;
                String str9 = this.IconCompatParcelizer;
                int hashCode9 = str9 != null ? str9.hashCode() : 0;
                String str10 = this.setHasDecor;
                int hashCode10 = str10 != null ? str10.hashCode() : 0;
                String str11 = this.MediaBrowserCompat$MediaItem;
                int hashCode11 = str11 != null ? str11.hashCode() : 0;
                String str12 = this.f2690x50fd9e4a;
                int hashCode12 = str12 != null ? str12.hashCode() : 0;
                String str13 = this.MediaSessionCompat$QueueItem;
                int hashCode13 = str13 != null ? str13.hashCode() : 0;
                String str14 = this.AlertController$RecycleListView;
                int hashCode14 = str14 != null ? str14.hashCode() : 0;
                String str15 = this.PlaybackStateCompat;
                int hashCode15 = str15 != null ? str15.hashCode() : 0;
                String str16 = this.MediaBrowserCompat$SearchResultReceiver;
                int hashCode16 = str16 != null ? str16.hashCode() : 0;
                String str17 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode17 = str17 != null ? str17.hashCode() : 0;
                CrashlyticsReport.FilesPayload.Builder builder = this.RatingCompat;
                return (((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + (builder != null ? builder.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("LoanReviewDetailsDisplay(loanAmount=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", duration=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", durationFrequency=");
                sb.append(this.write);
                sb.append(", repaymentAmount=");
                sb.append(this.MediaSessionCompat$Token);
                sb.append(", repaymentAmountFrequency=");
                sb.append(this.ParcelableVolumeInfo);
                sb.append(", startRepaymentDate=");
                sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
                sb.append(", frontEndFee=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", dutyStampFee=");
                sb.append(this.read);
                sb.append(", dutyStampFeeRate=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", transferFee=");
                sb.append(this.setHasDecor);
                sb.append(", netTransferAmount=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", receivingAccount=");
                sb.append(this.f2690x50fd9e4a);
                sb.append(", repaymentAccount=");
                sb.append(this.MediaSessionCompat$QueueItem);
                sb.append(", yourRepaymentDate=");
                sb.append(this.AlertController$RecycleListView);
                sb.append(", yourRepaymentDateUnit=");
                sb.append(this.PlaybackStateCompat);
                sb.append(", estatementMail=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(", attentionText=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", promotion=");
                sb.append(this.RatingCompat);
                sb.append(")");
                return sb.toString();
            }

            public final void writeToParcel(Parcel parcel, int i) {
                onGetStartedClick.write((Object) parcel, "parcel");
                parcel.writeString(this.MediaMetadataCompat);
                parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                parcel.writeString(this.write);
                parcel.writeString(this.MediaSessionCompat$Token);
                parcel.writeString(this.ParcelableVolumeInfo);
                parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
                parcel.writeString(this.MediaDescriptionCompat);
                parcel.writeString(this.read);
                parcel.writeString(this.IconCompatParcelizer);
                parcel.writeString(this.setHasDecor);
                parcel.writeString(this.MediaBrowserCompat$MediaItem);
                parcel.writeString(this.f2690x50fd9e4a);
                parcel.writeString(this.MediaSessionCompat$QueueItem);
                parcel.writeString(this.AlertController$RecycleListView);
                parcel.writeString(this.PlaybackStateCompat);
                parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                parcel.writeParcelable(this.RatingCompat, i);
            }

            {
                String str = r17;
                String str2 = r18;
                String str3 = r19;
                String str4 = r20;
                String str5 = r21;
                String str6 = r22;
                String str7 = r24;
                String str8 = r25;
                String str9 = r26;
                String str10 = r27;
                String str11 = r28;
                String str12 = r30;
                String str13 = r31;
                CrashlyticsReport.FilesPayload.Builder builder = r34;
                onGetStartedClick.write((Object) str, "loanAmount");
                onGetStartedClick.write((Object) str2, "duration");
                onGetStartedClick.write((Object) str3, "durationFrequency");
                onGetStartedClick.write((Object) str4, "repaymentAmount");
                onGetStartedClick.write((Object) str5, "repaymentAmountFrequency");
                onGetStartedClick.write((Object) str6, "startRepaymentDate");
                onGetStartedClick.write((Object) str7, "dutyStampFee");
                onGetStartedClick.write((Object) str8, "dutyStampFeeRate");
                onGetStartedClick.write((Object) str9, "transferFee");
                onGetStartedClick.write((Object) str10, "netTransferAmount");
                onGetStartedClick.write((Object) str11, "receivingAccount");
                onGetStartedClick.write((Object) str12, "yourRepaymentDate");
                onGetStartedClick.write((Object) str13, "yourRepaymentDateUnit");
                onGetStartedClick.write((Object) builder, "promotion");
                this.MediaMetadataCompat = str;
                this.MediaBrowserCompat$ItemReceiver = str2;
                this.write = str3;
                this.MediaSessionCompat$Token = str4;
                this.ParcelableVolumeInfo = str5;
                this.MediaSessionCompat$ResultReceiverWrapper = str6;
                this.MediaDescriptionCompat = r23;
                this.read = str7;
                this.IconCompatParcelizer = str8;
                this.setHasDecor = str9;
                this.MediaBrowserCompat$MediaItem = str10;
                this.f2690x50fd9e4a = str11;
                this.MediaSessionCompat$QueueItem = r29;
                this.AlertController$RecycleListView = str12;
                this.PlaybackStateCompat = str13;
                this.MediaBrowserCompat$SearchResultReceiver = r32;
                this.MediaBrowserCompat$CustomActionResultReceiver = r33;
                this.RatingCompat = builder;
            }
        };
        return r21;
    }

    public final Object[] newArray(int i) {
        return new CrashlyticsController.C322317[i];
    }
}

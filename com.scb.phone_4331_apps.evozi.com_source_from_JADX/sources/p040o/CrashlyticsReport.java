package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.i18n.MessageBundle;
import p039io.beid.beidk.definitions.BeIDParams;
import p040o.C3085x7c929f5b;

/* renamed from: o.CrashlyticsReport */
public final class CrashlyticsReport {
    public withEvents IconCompatParcelizer;
    public List<withEvents> MediaBrowserCompat$CustomActionResultReceiver;
    public String write;

    /* renamed from: o.CrashlyticsReport$Builder */
    public abstract class Builder {
        public final write IconCompatParcelizer;

        /* renamed from: o.CrashlyticsReport$Builder$write */
        public enum write {
            TITLE,
            INTEREST
        }

        public Builder(write write2) {
            onGetStartedClick.write((Object) write2, "type");
            this.IconCompatParcelizer = write2;
        }
    }

    /* renamed from: o.CrashlyticsReport$Session */
    public final class Session {
        public final FilesPayload.Builder MediaBrowserCompat$CustomActionResultReceiver;
        public final boolean read;
        public final String write;

        /* renamed from: o.CrashlyticsReport$Session$Event */
        public final class Event extends remainingCapacity implements Parcelable {
            public static final Parcelable.Creator<Event> CREATOR = new write();
            public final String IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final boolean read;

            public final int describeContents() {
                return 0;
            }

            /* renamed from: o.CrashlyticsReport$Session$Event$Application */
            public final class Application implements Parcelable {
                public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);
                public String AlertController$RecycleListView;
                public String AppCompatActivity;
                public String AppCompatDelegateImpl$ListMenuDecorView;
                public String AppCompatDialogFragment;
                public List<Device.Builder> IconCompatParcelizer;
                public String Keep;
                public String MediaBrowserCompat$CustomActionResultReceiver;
                public String MediaBrowserCompat$ItemReceiver;
                public boolean MediaBrowserCompat$MediaItem;
                public String MediaBrowserCompat$SearchResultReceiver;

                /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
                public String f2696x50fd9e4a;
                public String MediaDescriptionCompat;
                public String MediaMetadataCompat;
                public String MediaSessionCompat$QueueItem;
                public String MediaSessionCompat$ResultReceiverWrapper;
                public String MediaSessionCompat$Token;
                public String ParcelableVolumeInfo;
                public String PlaybackStateCompat;
                public String PlaybackStateCompat$CustomAction;
                public String RatingCompat;
                public String read;
                private String setBackgroundResource;
                private String setContentView;
                public String setHasDecor;
                public String write;

                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Application)) {
                        return false;
                    }
                    Application application = (Application) obj;
                    return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setContentView, (Object) application.setContentView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) application.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AppCompatDialogFragment, (Object) application.AppCompatDialogFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AppCompatActivity, (Object) application.AppCompatActivity) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2696x50fd9e4a, (Object) application.f2696x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) application.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) application.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) application.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) application.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat$CustomAction, (Object) application.PlaybackStateCompat$CustomAction) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setHasDecor, (Object) application.setHasDecor) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setBackgroundResource, (Object) application.setBackgroundResource) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat, (Object) application.PlaybackStateCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) application.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) application.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) application.MediaBrowserCompat$SearchResultReceiver) && this.MediaBrowserCompat$MediaItem == application.MediaBrowserCompat$MediaItem && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) application.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) application.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) application.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AlertController$RecycleListView, (Object) application.AlertController$RecycleListView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AppCompatDelegateImpl$ListMenuDecorView, (Object) application.AppCompatDelegateImpl$ListMenuDecorView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.Keep, (Object) application.Keep) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) application.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) application.MediaSessionCompat$ResultReceiverWrapper);
                }

                public final int hashCode() {
                    String str = this.setContentView;
                    int hashCode = str != null ? str.hashCode() : 0;
                    String str2 = this.MediaSessionCompat$Token;
                    int hashCode2 = str2 != null ? str2.hashCode() : 0;
                    String str3 = this.AppCompatDialogFragment;
                    int hashCode3 = str3 != null ? str3.hashCode() : 0;
                    String str4 = this.AppCompatActivity;
                    int hashCode4 = str4 != null ? str4.hashCode() : 0;
                    String str5 = this.f2696x50fd9e4a;
                    int hashCode5 = str5 != null ? str5.hashCode() : 0;
                    String str6 = this.write;
                    int hashCode6 = str6 != null ? str6.hashCode() : 0;
                    String str7 = this.read;
                    int hashCode7 = str7 != null ? str7.hashCode() : 0;
                    String str8 = this.RatingCompat;
                    int hashCode8 = str8 != null ? str8.hashCode() : 0;
                    String str9 = this.MediaBrowserCompat$ItemReceiver;
                    int hashCode9 = str9 != null ? str9.hashCode() : 0;
                    String str10 = this.PlaybackStateCompat$CustomAction;
                    int hashCode10 = str10 != null ? str10.hashCode() : 0;
                    String str11 = this.setHasDecor;
                    int hashCode11 = str11 != null ? str11.hashCode() : 0;
                    String str12 = this.setBackgroundResource;
                    int hashCode12 = str12 != null ? str12.hashCode() : 0;
                    String str13 = this.PlaybackStateCompat;
                    int hashCode13 = str13 != null ? str13.hashCode() : 0;
                    String str14 = this.MediaMetadataCompat;
                    int hashCode14 = str14 != null ? str14.hashCode() : 0;
                    String str15 = this.ParcelableVolumeInfo;
                    int hashCode15 = str15 != null ? str15.hashCode() : 0;
                    String str16 = this.MediaBrowserCompat$SearchResultReceiver;
                    int hashCode16 = str16 != null ? str16.hashCode() : 0;
                    boolean z = this.MediaBrowserCompat$MediaItem;
                    if (z) {
                        z = true;
                    }
                    boolean z2 = z;
                    String str17 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    int hashCode17 = str17 != null ? str17.hashCode() : 0;
                    String str18 = this.MediaDescriptionCompat;
                    int hashCode18 = str18 != null ? str18.hashCode() : 0;
                    String str19 = this.MediaSessionCompat$QueueItem;
                    int hashCode19 = str19 != null ? str19.hashCode() : 0;
                    String str20 = this.AlertController$RecycleListView;
                    int hashCode20 = str20 != null ? str20.hashCode() : 0;
                    String str21 = this.AppCompatDelegateImpl$ListMenuDecorView;
                    int hashCode21 = str21 != null ? str21.hashCode() : 0;
                    String str22 = this.Keep;
                    int hashCode22 = str22 != null ? str22.hashCode() : 0;
                    List<Device.Builder> list = this.IconCompatParcelizer;
                    int hashCode23 = list != null ? list.hashCode() : 0;
                    String str23 = this.MediaSessionCompat$ResultReceiverWrapper;
                    return (((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + (z2 ? 1 : 0)) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + (str23 != null ? str23.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("FixedTransferSuccessDisplay(transactionId=");
                    sb.append(this.setContentView);
                    sb.append(", successfulTransferSummary=");
                    sb.append(this.MediaSessionCompat$Token);
                    sb.append(", unsuccesfulTransferSummary=");
                    sb.append(this.AppCompatDialogFragment);
                    sb.append(", transactionDateTime=");
                    sb.append(this.AppCompatActivity);
                    sb.append(", refId=");
                    sb.append(this.f2696x50fd9e4a);
                    sb.append(", fromAccountName=");
                    sb.append(this.write);
                    sb.append(", fromAccountNumber=");
                    sb.append(this.read);
                    sb.append(", fromAccountNumberRaw=");
                    sb.append(this.RatingCompat);
                    sb.append(", fromAccountIconUrl=");
                    sb.append(this.MediaBrowserCompat$ItemReceiver);
                    sb.append(", toAccountName=");
                    sb.append(this.PlaybackStateCompat$CustomAction);
                    sb.append(", toAccountNumber=");
                    sb.append(this.setHasDecor);
                    sb.append(", toAccountNumberRaw=");
                    sb.append(this.setBackgroundResource);
                    sb.append(", toAccountIconUrl=");
                    sb.append(this.PlaybackStateCompat);
                    sb.append(", functionType=");
                    sb.append(this.MediaMetadataCompat);
                    sb.append(", subFunctionType=");
                    sb.append(this.ParcelableVolumeInfo);
                    sb.append(", payeeId=");
                    sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                    sb.append(", isFavoriteType=");
                    sb.append(this.MediaBrowserCompat$MediaItem);
                    sb.append(", favoriteName=");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                    sb.append(", note=");
                    sb.append(this.MediaDescriptionCompat);
                    sb.append(", successNetAmount=");
                    sb.append(this.MediaSessionCompat$QueueItem);
                    sb.append(", totalInterest=");
                    sb.append(this.AlertController$RecycleListView);
                    sb.append(", totalWithholdingTax=");
                    sb.append(this.AppCompatDelegateImpl$ListMenuDecorView);
                    sb.append(", totalFee=");
                    sb.append(this.Keep);
                    sb.append(", depositTransactions=");
                    sb.append(this.IconCompatParcelizer);
                    sb.append(", remainingBalance=");
                    sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
                    sb.append(")");
                    return sb.toString();
                }

                /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution */
                public class Execution extends Builder implements Parcelable {
                    public static final Parcelable.Creator<Execution> CREATOR = new Parcelable.Creator<Execution>() {
                        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                            return new Execution(parcel);
                        }

                        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                            return new Execution[i];
                        }
                    };
                    public String ActionMenuItemView;
                    public String AlertController$RecycleListView;
                    public String AppCompatActivity;
                    public boolean AppCompatDelegateImpl$ListMenuDecorView;
                    public Device AppCompatDialogFragment;
                    public String AppCompatViewInflater;
                    public String ExpandedMenuView;
                    public String Keep;
                    public String ListMenuItemView;
                    public String MediaBrowserCompat$MediaItem;
                    public String MediaBrowserCompat$SearchResultReceiver;

                    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
                    public String f2698x50fd9e4a;
                    public String MediaDescriptionCompat;
                    public String MediaMetadataCompat;
                    public String MediaSessionCompat$QueueItem;
                    public position MediaSessionCompat$ResultReceiverWrapper;
                    public Thread.Frame MediaSessionCompat$Token;
                    public int MenuItemImpl;
                    public String MenuItemWrapperICS$CollapsibleActionViewWrapper;
                    public String ParcelableVolumeInfo;
                    public int PlaybackStateCompat;
                    public boolean PlaybackStateCompat$CustomAction;
                    public String RatingCompat;
                    public String setBackgroundResource;
                    public String setCheckable;
                    public String setChecked;
                    public String setContentHeight;
                    public String setContentView;
                    public List<OperatingSystem.Builder> setExpandedFormat;
                    public String setForceShowIcon;
                    public String setGroupDividerEnabled;
                    public OperatingSystem setHasDecor;
                    public String setIcon;
                    public String setItemInvoker;
                    public String setPadding;
                    public String setPopupCallback;
                    public access$lambda$2 setShortcut;
                    public String setTitle;

                    public int describeContents() {
                        return 0;
                    }

                    /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Thread */
                    public final class Thread extends TypeToken<List<parseDevice>> {

                        /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder */
                        public final class Builder extends TypeToken<List<Log.Builder>> {
                        }

                        /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame */
                        public class Frame implements Parcelable {
                            public static final Parcelable.Creator<Frame> CREATOR = new Parcelable.Creator<Frame>() {
                                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                                    return new Frame(parcel);
                                }

                                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                                    return new Frame[i];
                                }
                            };
                            public String IconCompatParcelizer;
                            public String MediaBrowserCompat$CustomActionResultReceiver;
                            public String MediaBrowserCompat$ItemReceiver;
                            public String MediaBrowserCompat$MediaItem;
                            public String MediaBrowserCompat$SearchResultReceiver;

                            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
                            public parseArray f2701x50fd9e4a;
                            public String MediaDescriptionCompat;
                            public String MediaMetadataCompat;
                            public String MediaSessionCompat$QueueItem;
                            private String ParcelableVolumeInfo;
                            public String RatingCompat;
                            public String read;
                            public String write;

                            public int describeContents() {
                                return 0;
                            }

                            public /* synthetic */ Frame(read read2, byte b) {
                                this(read2);
                            }

                            private Frame(read read2) {
                                this.IconCompatParcelizer = read2.IconCompatParcelizer;
                                this.MediaBrowserCompat$CustomActionResultReceiver = read2.read;
                                this.ParcelableVolumeInfo = read2.MediaSessionCompat$QueueItem;
                                this.MediaMetadataCompat = read2.MediaMetadataCompat;
                                this.write = read2.MediaBrowserCompat$ItemReceiver;
                                this.read = read2.MediaBrowserCompat$CustomActionResultReceiver;
                                this.RatingCompat = read2.MediaBrowserCompat$SearchResultReceiver;
                                this.MediaDescriptionCompat = read2.RatingCompat;
                                this.MediaSessionCompat$QueueItem = read2.MediaSessionCompat$ResultReceiverWrapper;
                                this.MediaBrowserCompat$ItemReceiver = read2.write;
                                this.MediaBrowserCompat$MediaItem = read2.MediaDescriptionCompat;
                                this.MediaBrowserCompat$SearchResultReceiver = read2.MediaBrowserCompat$MediaItem;
                                this.f2701x50fd9e4a = read2.MediaSessionCompat$Token;
                            }

                            public static read MediaBrowserCompat$CustomActionResultReceiver() {
                                return new read((byte) 0);
                            }

                            /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder */
                            public final class Builder extends remainingCapacity implements Parcelable {
                                public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
                                    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                                        return new Builder(parcel);
                                    }

                                    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                                        return new Builder[i];
                                    }
                                };
                                public String ActionMenuItemView;
                                public String AlertController$RecycleListView;
                                public String AppCompatActivity;
                                public String AppCompatDelegateImpl$ListMenuDecorView;
                                public String AppCompatDialogFragment;
                                public String AppCompatViewInflater;
                                public String IconCompatParcelizer;
                                public String Keep;
                                public boolean MediaBrowserCompat$CustomActionResultReceiver;
                                public boolean MediaBrowserCompat$ItemReceiver;
                                public String MediaBrowserCompat$MediaItem;
                                public String MediaBrowserCompat$SearchResultReceiver;

                                /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
                                public String f2702x50fd9e4a;
                                public String MediaDescriptionCompat;
                                public boolean MediaMetadataCompat;
                                public boolean MediaSessionCompat$QueueItem;
                                public String MediaSessionCompat$ResultReceiverWrapper;
                                public String MediaSessionCompat$Token;
                                public String ParcelableVolumeInfo;
                                public String PlaybackStateCompat;
                                public String PlaybackStateCompat$CustomAction;
                                public String RatingCompat;
                                public String read;
                                public String setBackgroundResource;
                                public String setCheckable;
                                public String setChecked;
                                public String setContentView;
                                public String setExpandedFormat;
                                public String setHasDecor;
                                public String setIcon;
                                public String setItemInvoker;
                                public String setPadding;
                                public String setPopupCallback;

                                public final int describeContents() {
                                    return 0;
                                }

                                public Builder() {
                                }

                                public static Builder MediaBrowserCompat$CustomActionResultReceiver() {
                                    return new Builder();
                                }

                                public final void writeToParcel(Parcel parcel, int i) {
                                    parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                                    parcel.writeString(this.IconCompatParcelizer);
                                    parcel.writeString(this.ParcelableVolumeInfo);
                                    parcel.writeString(this.MediaSessionCompat$Token);
                                    parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
                                    parcel.writeString(this.f2702x50fd9e4a);
                                    parcel.writeString(this.AppCompatViewInflater);
                                    parcel.writeString(this.setChecked);
                                    parcel.writeString(this.setPadding);
                                    parcel.writeString(this.AlertController$RecycleListView);
                                    parcel.writeString(this.PlaybackStateCompat);
                                    parcel.writeString(this.MediaBrowserCompat$MediaItem);
                                    parcel.writeString(this.setBackgroundResource);
                                    parcel.writeString(this.PlaybackStateCompat$CustomAction);
                                    parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
                                    parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
                                    parcel.writeByte(this.MediaBrowserCompat$CustomActionResultReceiver ? (byte) 1 : 0);
                                    parcel.writeString(this.MediaDescriptionCompat);
                                    parcel.writeString(this.setExpandedFormat);
                                    parcel.writeString(this.ActionMenuItemView);
                                    parcel.writeString(this.setPopupCallback);
                                    parcel.writeString(this.setHasDecor);
                                    parcel.writeByte(this.MediaSessionCompat$QueueItem ? (byte) 1 : 0);
                                    parcel.writeString(this.read);
                                    parcel.writeString(this.Keep);
                                    parcel.writeString(this.setContentView);
                                    parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
                                    parcel.writeString(this.AppCompatDialogFragment);
                                    parcel.writeString(this.AppCompatActivity);
                                    parcel.writeString(this.setCheckable);
                                    parcel.writeString(this.setIcon);
                                    parcel.writeString(this.setItemInvoker);
                                    parcel.writeString(this.RatingCompat);
                                }

                                protected Builder(Parcel parcel) {
                                    this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
                                    this.IconCompatParcelizer = parcel.readString();
                                    this.ParcelableVolumeInfo = parcel.readString();
                                    this.MediaSessionCompat$Token = parcel.readString();
                                    this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
                                    this.f2702x50fd9e4a = parcel.readString();
                                    this.AppCompatViewInflater = parcel.readString();
                                    this.setChecked = parcel.readString();
                                    this.setPadding = parcel.readString();
                                    this.AlertController$RecycleListView = parcel.readString();
                                    this.PlaybackStateCompat = parcel.readString();
                                    this.MediaBrowserCompat$MediaItem = parcel.readString();
                                    this.setBackgroundResource = parcel.readString();
                                    this.PlaybackStateCompat$CustomAction = parcel.readString();
                                    boolean z = true;
                                    this.MediaMetadataCompat = parcel.readByte() != 0;
                                    this.MediaBrowserCompat$ItemReceiver = parcel.readByte() != 0;
                                    this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readByte() != 0;
                                    this.MediaDescriptionCompat = parcel.readString();
                                    this.setExpandedFormat = parcel.readString();
                                    this.ActionMenuItemView = parcel.readString();
                                    this.setPopupCallback = parcel.readString();
                                    this.setHasDecor = parcel.readString();
                                    this.MediaSessionCompat$QueueItem = parcel.readByte() == 0 ? false : z;
                                    this.read = parcel.readString();
                                    this.Keep = parcel.readString();
                                    this.setContentView = parcel.readString();
                                    this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readString();
                                    this.AppCompatDialogFragment = parcel.readString();
                                    this.AppCompatActivity = parcel.readString();
                                    this.setCheckable = parcel.readString();
                                    this.setIcon = parcel.readString();
                                    this.setItemInvoker = parcel.readString();
                                    this.RatingCompat = parcel.readString();
                                }
                            }

                            /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$read */
                            public static final class read {
                                public String IconCompatParcelizer;
                                public String MediaBrowserCompat$CustomActionResultReceiver;
                                public String MediaBrowserCompat$ItemReceiver;
                                public String MediaBrowserCompat$MediaItem;
                                public String MediaBrowserCompat$SearchResultReceiver;
                                public String MediaDescriptionCompat;
                                public String MediaMetadataCompat;
                                public String MediaSessionCompat$QueueItem;
                                public String MediaSessionCompat$ResultReceiverWrapper;
                                public parseArray MediaSessionCompat$Token;
                                public String RatingCompat;
                                public String read;
                                public String write;

                                /* synthetic */ read(byte b) {
                                    this();
                                }

                                private read() {
                                }
                            }

                            public void writeToParcel(Parcel parcel, int i) {
                                parcel.writeString(this.IconCompatParcelizer);
                                parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                                parcel.writeString(this.ParcelableVolumeInfo);
                                parcel.writeString(this.MediaMetadataCompat);
                                parcel.writeString(this.write);
                                parcel.writeString(this.read);
                                parcel.writeString(this.RatingCompat);
                                parcel.writeString(this.MediaDescriptionCompat);
                                parcel.writeString(this.MediaSessionCompat$QueueItem);
                                parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                                parcel.writeString(this.MediaBrowserCompat$MediaItem);
                                parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                                parcel.writeParcelable(this.f2701x50fd9e4a, i);
                            }

                            protected Frame(Parcel parcel) {
                                this.IconCompatParcelizer = parcel.readString();
                                this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
                                this.ParcelableVolumeInfo = parcel.readString();
                                this.MediaMetadataCompat = parcel.readString();
                                this.write = parcel.readString();
                                this.read = parcel.readString();
                                this.RatingCompat = parcel.readString();
                                this.MediaDescriptionCompat = parcel.readString();
                                this.MediaSessionCompat$QueueItem = parcel.readString();
                                this.MediaBrowserCompat$ItemReceiver = parcel.readString();
                                this.MediaBrowserCompat$MediaItem = parcel.readString();
                                this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
                                this.f2701x50fd9e4a = (parseArray) parcel.readParcelable(parseArray.class.getClassLoader());
                            }
                        }
                    }

                    /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Builder */
                    public final class Builder implements Parcelable {
                        public static final Parcelable.Creator CREATOR = new read();
                        public final String IconCompatParcelizer;
                        private final String Keep;
                        public final String MediaBrowserCompat$CustomActionResultReceiver;
                        public final String MediaBrowserCompat$ItemReceiver;
                        public final String MediaBrowserCompat$MediaItem;
                        private final String MediaBrowserCompat$SearchResultReceiver;

                        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
                        private final String f2699x50fd9e4a;
                        private final String MediaDescriptionCompat;
                        public final String MediaMetadataCompat;
                        private final String MediaSessionCompat$QueueItem;
                        private final String MediaSessionCompat$ResultReceiverWrapper;
                        private final String MediaSessionCompat$Token;
                        private final String ParcelableVolumeInfo;
                        private final String PlaybackStateCompat;
                        private final String RatingCompat;
                        public final String read;
                        public final String write;

                        /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Builder$read */
                        public static final class read implements Parcelable.Creator {
                            public final Object createFromParcel(Parcel parcel) {
                                onGetStartedClick.write((Object) parcel, "in");
                                return new Builder(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                            }

                            public final Object[] newArray(int i) {
                                return new Builder[i];
                            }
                        }

                        public final int describeContents() {
                            return 0;
                        }

                        public final void writeToParcel(Parcel parcel, int i) {
                            onGetStartedClick.write((Object) parcel, "parcel");
                            parcel.writeString(this.write);
                            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                            parcel.writeString(this.MediaBrowserCompat$MediaItem);
                            parcel.writeString(this.MediaMetadataCompat);
                            parcel.writeString(this.IconCompatParcelizer);
                            parcel.writeString(this.read);
                            parcel.writeString(this.RatingCompat);
                            parcel.writeString(this.PlaybackStateCompat);
                            parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
                            parcel.writeString(this.ParcelableVolumeInfo);
                            parcel.writeString(this.Keep);
                            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                            parcel.writeString(this.MediaSessionCompat$QueueItem);
                            parcel.writeString(this.f2699x50fd9e4a);
                            parcel.writeString(this.MediaDescriptionCompat);
                            parcel.writeString(this.MediaSessionCompat$Token);
                        }

                        public Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
                            String str18 = str7;
                            String str19 = str9;
                            String str20 = str10;
                            String str21 = str13;
                            String str22 = str16;
                            onGetStartedClick.write((Object) str2, "accountTo");
                            onGetStartedClick.write((Object) str3, "referenceNo1");
                            onGetStartedClick.write((Object) str18, "billerLogo");
                            onGetStartedClick.write((Object) str19, "refType");
                            onGetStartedClick.write((Object) str20, "ref1Label");
                            onGetStartedClick.write((Object) str21, "placeholderRef1");
                            onGetStartedClick.write((Object) str22, "amountType");
                            this.write = str;
                            this.MediaBrowserCompat$ItemReceiver = str2;
                            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
                            this.MediaBrowserCompat$MediaItem = str4;
                            this.MediaMetadataCompat = str5;
                            this.IconCompatParcelizer = str6;
                            this.read = str18;
                            this.RatingCompat = str8;
                            this.PlaybackStateCompat = str19;
                            this.MediaSessionCompat$ResultReceiverWrapper = str20;
                            this.ParcelableVolumeInfo = str11;
                            this.Keep = str12;
                            this.MediaBrowserCompat$SearchResultReceiver = str21;
                            this.MediaSessionCompat$QueueItem = str14;
                            this.f2699x50fd9e4a = str15;
                            this.MediaDescriptionCompat = str22;
                            this.MediaSessionCompat$Token = str17;
                        }
                    }

                    /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage */
                    public final class BinaryImage extends remainingCapacity implements Parcelable {
                        public static final Parcelable.Creator<BinaryImage> CREATOR = new read();
                        public final String IconCompatParcelizer;
                        public final String MediaBrowserCompat$CustomActionResultReceiver;
                        public final Event MediaBrowserCompat$ItemReceiver;

                        public final int describeContents() {
                            return 0;
                        }

                        /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder */
                        public class Builder implements Parcelable {
                            public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
                                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                                    return new Builder(parcel);
                                }

                                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                                    return new Builder[i];
                                }
                            };
                            public String MediaBrowserCompat$CustomActionResultReceiver;
                            public String MediaBrowserCompat$ItemReceiver;

                            public int describeContents() {
                                return 0;
                            }

                            public Builder(String str, String str2) {
                                this.MediaBrowserCompat$CustomActionResultReceiver = str;
                                this.MediaBrowserCompat$ItemReceiver = str2;
                            }

                            protected Builder(Parcel parcel) {
                                this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
                                this.MediaBrowserCompat$ItemReceiver = parcel.readString();
                            }

                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                Builder builder = (Builder) obj;
                                String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                                if (str == null ? builder.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(builder.MediaBrowserCompat$CustomActionResultReceiver)) {
                                    return false;
                                }
                                String str2 = this.MediaBrowserCompat$ItemReceiver;
                                String str3 = builder.MediaBrowserCompat$ItemReceiver;
                                if (str2 != null) {
                                    return str2.equals(str3);
                                }
                                if (str3 != null) {
                                    return false;
                                }
                                return true;
                            }

                            public int hashCode() {
                                String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                                int i = 0;
                                int hashCode = str != null ? str.hashCode() : 0;
                                String str2 = this.MediaBrowserCompat$ItemReceiver;
                                if (str2 != null) {
                                    i = str2.hashCode();
                                }
                                return (hashCode * 31) + i;
                            }

                            public void writeToParcel(Parcel parcel, int i) {
                                parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                                parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                            }
                        }

                        public BinaryImage(String str, String str2, Event event) {
                            onGetStartedClick.write((Object) str, "buttonLabel");
                            this.MediaBrowserCompat$CustomActionResultReceiver = str;
                            this.IconCompatParcelizer = str2;
                            this.MediaBrowserCompat$ItemReceiver = event;
                        }

                        /* JADX WARNING: Illegal instructions before constructor call */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public BinaryImage(android.os.Parcel r4) {
                            /*
                                r3 = this;
                                java.lang.String r0 = "source"
                                p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
                                java.lang.String r0 = "$this$readStringNonNull"
                                p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
                                java.lang.String r0 = r4.readString()
                                if (r0 != 0) goto L_0x0012
                                java.lang.String r0 = ""
                            L_0x0012:
                                java.lang.String r1 = r4.readString()
                                java.lang.Class<o.CrashlyticsReport$Session$Event> r2 = p040o.CrashlyticsReport.Session.Event.class
                                java.lang.ClassLoader r2 = r2.getClassLoader()
                                android.os.Parcelable r4 = r4.readParcelable(r2)
                                o.CrashlyticsReport$Session$Event r4 = (p040o.CrashlyticsReport.Session.Event) r4
                                r3.<init>(r0, r1, r4)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p040o.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.<init>(android.os.Parcel):void");
                        }

                        public final void writeToParcel(Parcel parcel, int i) {
                            onGetStartedClick.write((Object) parcel, "dest");
                            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                            parcel.writeString(this.IconCompatParcelizer);
                            parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, 0);
                        }

                        /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$IconCompatParcelizer */
                        public static final class IconCompatParcelizer implements findFragmentByWho {
                            private final /* synthetic */ isUserRecoverableError MediaBrowserCompat$CustomActionResultReceiver;
                            private final /* synthetic */ String write;

                            private IconCompatParcelizer() {
                            }

                            public /* synthetic */ IconCompatParcelizer(isUserRecoverableError isuserrecoverableerror, String str) {
                                this.MediaBrowserCompat$CustomActionResultReceiver = isuserrecoverableerror;
                                this.write = str;
                            }

                            public final Object IconCompatParcelizer(Object obj) {
                                return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.write, (getOpacityAtPosition) obj);
                            }
                        }

                        /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$read */
                        public static final class read implements Parcelable.Creator<BinaryImage> {
                            read() {
                            }

                            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                                onGetStartedClick.write((Object) parcel, "source");
                                return new BinaryImage(parcel);
                            }

                            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                                return new BinaryImage[i];
                            }
                        }
                    }

                    /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Exception */
                    public final class Exception extends Execution implements Parcelable {
                        public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);
                        public String AbsActionBarView;
                        public processInstanceComponents ActionBarContainer;
                        public String ActionBarContextView;
                        public List<OperatingSystem.Builder> setCustomView;
                        public String setPrimaryBackground;
                        public String setSplitBackground;
                        public String setStackedBackground;
                        public String setSubtitle;
                        public String setTabContainer;
                        public String setTitleOptional;
                        public String setVisibility;

                        public final int describeContents() {
                            return 0;
                        }

                        /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder */
                        public final class Builder implements Parcelable {
                            public static final write CREATOR = new write((byte) 0);
                            public String IconCompatParcelizer;
                            public String MediaBrowserCompat$CustomActionResultReceiver;
                            public String MediaBrowserCompat$ItemReceiver;
                            public String MediaBrowserCompat$MediaItem;
                            public setUuidFromUtf8Bytes MediaBrowserCompat$SearchResultReceiver;
                            public String MediaMetadataCompat;
                            public List<OperatingSystem.Builder> RatingCompat;
                            public String read;
                            public String write;

                            public final int describeContents() {
                                return 0;
                            }

                            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                            public Builder(Parcel parcel) {
                                this();
                                onGetStartedClick.write((Object) parcel, "parcel");
                                onGetStartedClick.write((Object) parcel, "$this$readStringNonNull");
                                String readString = parcel.readString();
                                String str = "";
                                this.MediaBrowserCompat$ItemReceiver = readString == null ? str : readString;
                                onGetStartedClick.write((Object) parcel, "$this$readStringNonNull");
                                String readString2 = parcel.readString();
                                this.IconCompatParcelizer = readString2 == null ? str : readString2;
                                onGetStartedClick.write((Object) parcel, "$this$readStringNonNull");
                                String readString3 = parcel.readString();
                                this.MediaMetadataCompat = readString3 == null ? str : readString3;
                                List<OperatingSystem.Builder> createTypedArrayList = parcel.createTypedArrayList(OperatingSystem.Builder.CREATOR);
                                this.RatingCompat = createTypedArrayList == null ? HmlNationalIdActivity.IconCompatParcelizer : createTypedArrayList;
                                onGetStartedClick.write((Object) parcel, "$this$readStringNonNull");
                                String readString4 = parcel.readString();
                                this.write = readString4 != null ? readString4 : str;
                                setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) parcel.readParcelable(Signal.class.getClassLoader());
                                this.MediaBrowserCompat$SearchResultReceiver = setuuidfromutf8bytes == null ? new Signal() : setuuidfromutf8bytes;
                                this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
                                this.read = parcel.readString();
                                this.MediaBrowserCompat$MediaItem = parcel.readString();
                            }

                            public Builder() {
                            }

                            public final void writeToParcel(Parcel parcel, int i) {
                                onGetStartedClick.write((Object) parcel, "parcel");
                                String str = this.MediaBrowserCompat$ItemReceiver;
                                if (str == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("partnerId");
                                }
                                parcel.writeString(str);
                                String str2 = this.IconCompatParcelizer;
                                if (str2 == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("partnerName");
                                }
                                parcel.writeString(str2);
                                String str3 = this.MediaMetadataCompat;
                                if (str3 == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("partnerTransactionId");
                                }
                                parcel.writeString(str3);
                                List<OperatingSystem.Builder> list = this.RatingCompat;
                                if (list == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("paymentInfoDisplay");
                                }
                                parcel.writeTypedList(list);
                                String str4 = this.write;
                                if (str4 == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountNumberDescription");
                                }
                                parcel.writeString(str4);
                                setUuidFromUtf8Bytes setuuidfromutf8bytes = this.MediaBrowserCompat$SearchResultReceiver;
                                if (setuuidfromutf8bytes == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
                                }
                                parcel.writeParcelable(setuuidfromutf8bytes, i);
                                parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                                parcel.writeString(this.read);
                                parcel.writeString(this.MediaBrowserCompat$MediaItem);
                            }

                            /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder$write */
                            public static final class write implements Parcelable.Creator<Builder> {
                                private write() {
                                }

                                public /* synthetic */ write(byte b) {
                                    this();
                                }

                                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                                    onGetStartedClick.write((Object) parcel, "parcel");
                                    return new Builder(parcel);
                                }

                                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                                    return new Builder[i];
                                }
                            }
                        }

                        public Exception() {
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public Exception(Parcel parcel) {
                            super(parcel);
                            onGetStartedClick.write((Object) parcel, "parcel");
                            this.setSplitBackground = parcel.readString();
                            this.AbsActionBarView = parcel.readString();
                            this.setTitleOptional = parcel.readString();
                            onGetStartedClick.write((Object) parcel, "$this$readStringNonNull");
                            String readString = parcel.readString();
                            String str = "";
                            this.setPrimaryBackground = readString == null ? str : readString;
                            onGetStartedClick.write((Object) parcel, "$this$readStringNonNull");
                            String readString2 = parcel.readString();
                            this.setTabContainer = readString2 == null ? str : readString2;
                            onGetStartedClick.write((Object) parcel, "$this$readStringNonNull");
                            String readString3 = parcel.readString();
                            this.ActionBarContextView = readString3 == null ? str : readString3;
                            onGetStartedClick.write((Object) parcel, "$this$readStringNonNull");
                            String readString4 = parcel.readString();
                            this.setSubtitle = readString4 == null ? str : readString4;
                            onGetStartedClick.write((Object) parcel, "$this$readStringNonNull");
                            String readString5 = parcel.readString();
                            this.setStackedBackground = readString5 != null ? readString5 : str;
                            List<OperatingSystem.Builder> createTypedArrayList = parcel.createTypedArrayList(OperatingSystem.Builder.CREATOR);
                            this.setCustomView = createTypedArrayList == null ? HmlNationalIdActivity.IconCompatParcelizer : createTypedArrayList;
                            this.ActionBarContainer = (processInstanceComponents) parcel.readParcelable(processInstanceComponents.class.getClassLoader());
                            this.setVisibility = parcel.readString();
                        }

                        public final void writeToParcel(Parcel parcel, int i) {
                            onGetStartedClick.write((Object) parcel, "parcel");
                            super.writeToParcel(parcel, i);
                            parcel.writeString(this.setSplitBackground);
                            parcel.writeString(this.AbsActionBarView);
                            parcel.writeString(this.setTitleOptional);
                            String str = this.setPrimaryBackground;
                            if (str == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("partnerId");
                            }
                            parcel.writeString(str);
                            String str2 = this.setTabContainer;
                            if (str2 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("partnerName");
                            }
                            parcel.writeString(str2);
                            String str3 = this.ActionBarContextView;
                            if (str3 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("partnerTransactionId");
                            }
                            parcel.writeString(str3);
                            String str4 = this.setSubtitle;
                            if (str4 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("partnerType");
                            }
                            parcel.writeString(str4);
                            String str5 = this.setStackedBackground;
                            if (str5 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("partnerSubType");
                            }
                            parcel.writeString(str5);
                            List<OperatingSystem.Builder> list = this.setCustomView;
                            if (list == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("paymentInfoDisplay");
                            }
                            parcel.writeTypedList(list);
                            parcel.writeParcelable(this.ActionBarContainer, i);
                            parcel.writeString(this.setVisibility);
                        }

                        /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Exception$IconCompatParcelizer */
                        public static final class IconCompatParcelizer implements Parcelable.Creator<Exception> {
                            private IconCompatParcelizer() {
                            }

                            public /* synthetic */ IconCompatParcelizer(byte b) {
                                this();
                            }

                            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                                onGetStartedClick.write((Object) parcel, "parcel");
                                return new Exception(parcel);
                            }

                            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                                return new Exception[i];
                            }
                        }
                    }

                    /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Signal */
                    public class Signal extends setUuidFromUtf8Bytes {
                        public static final Parcelable.Creator<Signal> CREATOR = new Parcelable.Creator<Signal>() {
                            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                                return new Signal(parcel);
                            }

                            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                                return new Signal[i];
                            }
                        };
                        public String ActionMenuView$OnMenuItemClickListener;
                        public String ActivityChooserView;
                        public String IconCompatParcelizer;
                        public String MediaBrowserCompat$CustomActionResultReceiver;
                        public String MediaBrowserCompat$ItemReceiver;
                        public String MediaBrowserCompat$MediaItem;
                        public String MediaBrowserCompat$SearchResultReceiver;
                        public String MediaDescriptionCompat;
                        public String MediaMetadataCompat;
                        public String onMenuItemClick;
                        public String read;
                        public String setDefaultActionButtonContentDescription;
                        public String setExpandActivityOverflowButtonContentDescription;
                        public String setExpandActivityOverflowButtonDrawable;
                        public String setExpandedActionViewsExclusive;
                        public String setInitialActivityCount;
                        public String setMenuCallbacks;
                        public String setPopupTheme;
                        public Log setPresenter;
                        public String write;

                        public Signal() {
                        }

                        public static Signal read() {
                            return new Signal();
                        }

                        public final String MediaMetadataCompat() {
                            return this.onMenuItemClick;
                        }

                        /* renamed from: o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder */
                        public class Builder extends remainingCapacity implements Parcelable {
                            private static String AlertController$RecycleListView = "PBP";
                            public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
                                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                                    return new Builder(parcel);
                                }

                                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                                    return new Builder[i];
                                }
                            };
                            private static String Keep = "PCC";

                            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
                            private static String f2700x50fd9e4a = "PP";
                            private static String MediaSessionCompat$QueueItem = "PULLSLIP";
                            private static String MediaSessionCompat$ResultReceiverWrapper = "BP";
                            private static String MediaSessionCompat$Token = "FASTPP";
                            private static String ParcelableVolumeInfo = "FASTBP";
                            private static String PlaybackStateCompat = "PPP";
                            private static String PlaybackStateCompat$CustomAction = "PTP";
                            private static String setHasDecor = "TP";
                            public Builder IconCompatParcelizer;
                            public String MediaBrowserCompat$CustomActionResultReceiver;
                            public String MediaBrowserCompat$ItemReceiver;
                            public String MediaBrowserCompat$MediaItem;
                            public String MediaBrowserCompat$SearchResultReceiver;
                            public String MediaDescriptionCompat;
                            public String MediaMetadataCompat;
                            public String RatingCompat;
                            public double read;

                            public /* synthetic */ Builder() {
                            }

                            public int describeContents() {
                                return 0;
                            }

                            public Builder(String str, String str2, String str3, String str4, double d, String str5, String str6, Builder builder, String str7) {
                                this.MediaBrowserCompat$ItemReceiver = str;
                                this.MediaMetadataCompat = str2;
                                this.RatingCompat = str3;
                                this.MediaDescriptionCompat = str4;
                                this.read = d;
                                this.MediaBrowserCompat$SearchResultReceiver = str5;
                                this.MediaBrowserCompat$MediaItem = str6;
                                this.IconCompatParcelizer = builder;
                                this.MediaBrowserCompat$CustomActionResultReceiver = str7;
                            }

                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                Builder builder = (Builder) obj;
                                if (Double.compare(builder.read, this.read) != 0) {
                                    return false;
                                }
                                String str = this.MediaBrowserCompat$ItemReceiver;
                                if (str == null ? builder.MediaBrowserCompat$ItemReceiver != null : !str.equals(builder.MediaBrowserCompat$ItemReceiver)) {
                                    return false;
                                }
                                String str2 = this.MediaMetadataCompat;
                                if (str2 == null ? builder.MediaMetadataCompat != null : !str2.equals(builder.MediaMetadataCompat)) {
                                    return false;
                                }
                                String str3 = this.RatingCompat;
                                if (str3 == null ? builder.RatingCompat != null : !str3.equals(builder.RatingCompat)) {
                                    return false;
                                }
                                String str4 = this.MediaDescriptionCompat;
                                if (str4 == null ? builder.MediaDescriptionCompat != null : !str4.equals(builder.MediaDescriptionCompat)) {
                                    return false;
                                }
                                String str5 = this.MediaBrowserCompat$SearchResultReceiver;
                                if (str5 == null ? builder.MediaBrowserCompat$SearchResultReceiver != null : !str5.equals(builder.MediaBrowserCompat$SearchResultReceiver)) {
                                    return false;
                                }
                                String str6 = this.MediaBrowserCompat$MediaItem;
                                if (str6 == null ? builder.MediaBrowserCompat$MediaItem != null : !str6.equals(builder.MediaBrowserCompat$MediaItem)) {
                                    return false;
                                }
                                Builder builder2 = this.IconCompatParcelizer;
                                Builder builder3 = builder.IconCompatParcelizer;
                                if (builder2 != null) {
                                    return builder2.equals(builder3);
                                }
                                if (builder3 != null) {
                                    return false;
                                }
                                return true;
                            }

                            public int hashCode() {
                                String str = this.MediaBrowserCompat$ItemReceiver;
                                int i = 0;
                                int hashCode = str != null ? str.hashCode() : 0;
                                String str2 = this.MediaMetadataCompat;
                                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                                String str3 = this.RatingCompat;
                                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                                String str4 = this.MediaDescriptionCompat;
                                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                                long doubleToLongBits = Double.doubleToLongBits(this.read);
                                int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                                String str5 = this.MediaBrowserCompat$SearchResultReceiver;
                                int hashCode5 = str5 != null ? str5.hashCode() : 0;
                                String str6 = this.MediaBrowserCompat$MediaItem;
                                int hashCode6 = str6 != null ? str6.hashCode() : 0;
                                Builder builder = this.IconCompatParcelizer;
                                if (builder != null) {
                                    i = builder.hashCode();
                                }
                                return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
                            }

                            public void writeToParcel(Parcel parcel, int i) {
                                parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                                parcel.writeString(this.MediaMetadataCompat);
                                parcel.writeString(this.RatingCompat);
                                parcel.writeString(this.MediaDescriptionCompat);
                                parcel.writeDouble(this.read);
                                parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                                parcel.writeString(this.MediaBrowserCompat$MediaItem);
                                parcel.writeParcelable(this.IconCompatParcelizer, i);
                                parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                            }

                            protected Builder(Parcel parcel) {
                                this.MediaBrowserCompat$ItemReceiver = parcel.readString();
                                this.MediaMetadataCompat = parcel.readString();
                                this.RatingCompat = parcel.readString();
                                this.MediaDescriptionCompat = parcel.readString();
                                this.read = parcel.readDouble();
                                this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
                                this.MediaBrowserCompat$MediaItem = parcel.readString();
                                this.IconCompatParcelizer = (Builder) parcel.readParcelable(Builder.class.getClassLoader());
                                this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
                            }
                        }

                        public final String MediaBrowserCompat$MediaItem() {
                            return this.setExpandActivityOverflowButtonDrawable;
                        }

                        public final Log MediaBrowserCompat$SearchResultReceiver() {
                            return this.setPresenter;
                        }

                        public void writeToParcel(Parcel parcel, int i) {
                            super.writeToParcel(parcel, i);
                            parcel.writeString(this.onMenuItemClick);
                            parcel.writeString(this.setPopupTheme);
                            parcel.writeString(this.ActionMenuView$OnMenuItemClickListener);
                            parcel.writeString(this.ActivityChooserView);
                            parcel.writeString(this.setExpandActivityOverflowButtonContentDescription);
                            parcel.writeString(this.setDefaultActionButtonContentDescription);
                            parcel.writeString(this.read);
                            parcel.writeString(this.IconCompatParcelizer);
                            parcel.writeString(this.write);
                            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                            parcel.writeString(this.MediaDescriptionCompat);
                            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                            parcel.writeString(this.MediaBrowserCompat$MediaItem);
                            parcel.writeString(this.MediaMetadataCompat);
                            parcel.writeString(this.setMenuCallbacks);
                            parcel.writeString(this.setExpandedActionViewsExclusive);
                            parcel.writeString(this.setInitialActivityCount);
                            parcel.writeString(this.setExpandActivityOverflowButtonDrawable);
                            parcel.writeParcelable(this.setPresenter, i);
                        }

                        protected Signal(Parcel parcel) {
                            super(parcel);
                            this.onMenuItemClick = parcel.readString();
                            this.setPopupTheme = parcel.readString();
                            this.ActionMenuView$OnMenuItemClickListener = parcel.readString();
                            this.ActivityChooserView = parcel.readString();
                            this.setExpandActivityOverflowButtonContentDescription = parcel.readString();
                            this.setDefaultActionButtonContentDescription = parcel.readString();
                            this.read = parcel.readString();
                            this.IconCompatParcelizer = parcel.readString();
                            this.write = parcel.readString();
                            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
                            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
                            this.MediaDescriptionCompat = parcel.readString();
                            this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
                            this.MediaBrowserCompat$MediaItem = parcel.readString();
                            this.MediaMetadataCompat = parcel.readString();
                            this.setMenuCallbacks = parcel.readString();
                            this.setExpandedActionViewsExclusive = parcel.readString();
                            this.setInitialActivityCount = parcel.readString();
                            this.setExpandActivityOverflowButtonDrawable = parcel.readString();
                            this.setPresenter = (Log) parcel.readParcelable(Log.class.getClassLoader());
                        }

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Signal) || !super.equals(obj)) {
                                return false;
                            }
                            Signal signal = (Signal) obj;
                            String str = this.onMenuItemClick;
                            if (str == null ? signal.onMenuItemClick != null : !str.equals(signal.onMenuItemClick)) {
                                return false;
                            }
                            String str2 = this.setPopupTheme;
                            if (str2 == null ? signal.setPopupTheme != null : !str2.equals(signal.setPopupTheme)) {
                                return false;
                            }
                            String str3 = this.ActionMenuView$OnMenuItemClickListener;
                            if (str3 == null ? signal.ActionMenuView$OnMenuItemClickListener != null : !str3.equals(signal.ActionMenuView$OnMenuItemClickListener)) {
                                return false;
                            }
                            String str4 = this.ActivityChooserView;
                            if (str4 == null ? signal.ActivityChooserView != null : !str4.equals(signal.ActivityChooserView)) {
                                return false;
                            }
                            String str5 = this.setExpandActivityOverflowButtonContentDescription;
                            if (str5 == null ? signal.setExpandActivityOverflowButtonContentDescription != null : !str5.equals(signal.setExpandActivityOverflowButtonContentDescription)) {
                                return false;
                            }
                            String str6 = this.setDefaultActionButtonContentDescription;
                            if (str6 == null ? signal.setDefaultActionButtonContentDescription != null : !str6.equals(signal.setDefaultActionButtonContentDescription)) {
                                return false;
                            }
                            String str7 = this.read;
                            if (str7 == null ? signal.read != null : !str7.equals(signal.read)) {
                                return false;
                            }
                            String str8 = this.IconCompatParcelizer;
                            if (str8 == null ? signal.IconCompatParcelizer != null : !str8.equals(signal.IconCompatParcelizer)) {
                                return false;
                            }
                            String str9 = this.write;
                            if (str9 == null ? signal.write != null : !str9.equals(signal.write)) {
                                return false;
                            }
                            String str10 = this.MediaBrowserCompat$CustomActionResultReceiver;
                            if (str10 == null ? signal.MediaBrowserCompat$CustomActionResultReceiver != null : !str10.equals(signal.MediaBrowserCompat$CustomActionResultReceiver)) {
                                return false;
                            }
                            String str11 = this.MediaBrowserCompat$ItemReceiver;
                            if (str11 == null ? signal.MediaBrowserCompat$ItemReceiver != null : !str11.equals(signal.MediaBrowserCompat$ItemReceiver)) {
                                return false;
                            }
                            String str12 = this.MediaDescriptionCompat;
                            if (str12 == null ? signal.MediaDescriptionCompat != null : !str12.equals(signal.MediaDescriptionCompat)) {
                                return false;
                            }
                            String str13 = this.MediaBrowserCompat$SearchResultReceiver;
                            if (str13 == null ? signal.MediaBrowserCompat$SearchResultReceiver != null : !str13.equals(signal.MediaBrowserCompat$SearchResultReceiver)) {
                                return false;
                            }
                            String str14 = this.MediaBrowserCompat$MediaItem;
                            if (str14 == null ? signal.MediaBrowserCompat$MediaItem != null : !str14.equals(signal.MediaBrowserCompat$MediaItem)) {
                                return false;
                            }
                            String str15 = this.MediaMetadataCompat;
                            if (str15 == null ? signal.MediaMetadataCompat != null : !str15.equals(signal.MediaMetadataCompat)) {
                                return false;
                            }
                            String str16 = this.setMenuCallbacks;
                            if (str16 == null ? signal.setMenuCallbacks != null : !str16.equals(signal.setMenuCallbacks)) {
                                return false;
                            }
                            String str17 = this.setExpandedActionViewsExclusive;
                            if (str17 == null ? signal.setExpandedActionViewsExclusive != null : !str17.equals(signal.setExpandedActionViewsExclusive)) {
                                return false;
                            }
                            String str18 = this.setInitialActivityCount;
                            if (str18 == null ? signal.setInitialActivityCount != null : !str18.equals(signal.setInitialActivityCount)) {
                                return false;
                            }
                            String str19 = this.setExpandActivityOverflowButtonDrawable;
                            if (str19 == null ? signal.setExpandActivityOverflowButtonDrawable != null : !str19.equals(signal.setExpandActivityOverflowButtonDrawable)) {
                                return false;
                            }
                            Log log = this.setPresenter;
                            Log log2 = signal.setPresenter;
                            if (log != null) {
                                return log.equals(log2);
                            }
                            if (log2 != null) {
                                return false;
                            }
                            return true;
                        }

                        public int hashCode() {
                            int i;
                            int i2;
                            int i3;
                            int i4;
                            int i5;
                            int i6;
                            int i7;
                            int i8;
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            int i16;
                            int i17;
                            int i18;
                            int hashCode = super.hashCode();
                            String str = this.onMenuItemClick;
                            if (str != null) {
                                i = str.hashCode();
                            } else {
                                i = 0;
                            }
                            String str2 = this.setPopupTheme;
                            if (str2 != null) {
                                i2 = str2.hashCode();
                            } else {
                                i2 = 0;
                            }
                            String str3 = this.ActionMenuView$OnMenuItemClickListener;
                            if (str3 != null) {
                                i3 = str3.hashCode();
                            } else {
                                i3 = 0;
                            }
                            String str4 = this.ActivityChooserView;
                            if (str4 != null) {
                                i4 = str4.hashCode();
                            } else {
                                i4 = 0;
                            }
                            String str5 = this.setExpandActivityOverflowButtonContentDescription;
                            if (str5 != null) {
                                i5 = str5.hashCode();
                            } else {
                                i5 = 0;
                            }
                            String str6 = this.setDefaultActionButtonContentDescription;
                            if (str6 != null) {
                                i6 = str6.hashCode();
                            } else {
                                i6 = 0;
                            }
                            String str7 = this.read;
                            if (str7 != null) {
                                i7 = str7.hashCode();
                            } else {
                                i7 = 0;
                            }
                            String str8 = this.IconCompatParcelizer;
                            if (str8 != null) {
                                i8 = str8.hashCode();
                            } else {
                                i8 = 0;
                            }
                            String str9 = this.write;
                            if (str9 != null) {
                                i9 = str9.hashCode();
                            } else {
                                i9 = 0;
                            }
                            String str10 = this.MediaBrowserCompat$CustomActionResultReceiver;
                            if (str10 != null) {
                                i10 = str10.hashCode();
                            } else {
                                i10 = 0;
                            }
                            String str11 = this.MediaBrowserCompat$ItemReceiver;
                            if (str11 != null) {
                                i11 = str11.hashCode();
                            } else {
                                i11 = 0;
                            }
                            String str12 = this.MediaDescriptionCompat;
                            if (str12 != null) {
                                i12 = str12.hashCode();
                            } else {
                                i12 = 0;
                            }
                            String str13 = this.MediaBrowserCompat$SearchResultReceiver;
                            if (str13 != null) {
                                i13 = str13.hashCode();
                            } else {
                                i13 = 0;
                            }
                            String str14 = this.MediaBrowserCompat$MediaItem;
                            if (str14 != null) {
                                i14 = str14.hashCode();
                            } else {
                                i14 = 0;
                            }
                            String str15 = this.MediaMetadataCompat;
                            if (str15 != null) {
                                i15 = str15.hashCode();
                            } else {
                                i15 = 0;
                            }
                            String str16 = this.setMenuCallbacks;
                            if (str16 != null) {
                                i16 = str16.hashCode();
                            } else {
                                i16 = 0;
                            }
                            String str17 = this.setExpandedActionViewsExclusive;
                            if (str17 != null) {
                                i17 = str17.hashCode();
                            } else {
                                i17 = 0;
                            }
                            String str18 = this.setInitialActivityCount;
                            if (str18 != null) {
                                i18 = str18.hashCode();
                            } else {
                                i18 = 0;
                            }
                            String str19 = this.setExpandActivityOverflowButtonDrawable;
                            int hashCode2 = str19 != null ? str19.hashCode() : 0;
                            Log log = this.setPresenter;
                            return (((((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + i9) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + hashCode2) * 31) + (log != null ? log.hashCode() : 0);
                        }

                        public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver(Log log) {
                            this.setPresenter = log;
                            return this;
                        }

                        public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$MediaItem(String str) {
                            this.onMenuItemClick = str;
                            return this;
                        }

                        public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes read(String str) {
                            this.setExpandActivityOverflowButtonDrawable = str;
                            return this;
                        }
                    }

                    public Execution() {
                    }

                    protected Execution(Parcel parcel) {
                        super(parcel);
                        position position;
                        this.PlaybackStateCompat = parcel.readInt();
                        this.setIcon = parcel.readString();
                        this.setPadding = parcel.readString();
                        this.setItemInvoker = parcel.readString();
                        this.setChecked = parcel.readString();
                        this.AppCompatViewInflater = parcel.readString();
                        this.ActionMenuItemView = parcel.readString();
                        this.ParcelableVolumeInfo = parcel.readString();
                        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
                        this.RatingCompat = parcel.readString();
                        this.setForceShowIcon = parcel.readString();
                        this.AlertController$RecycleListView = parcel.readString();
                        this.MediaBrowserCompat$MediaItem = parcel.readString();
                        this.setPopupCallback = parcel.readString();
                        this.setGroupDividerEnabled = parcel.readString();
                        this.ExpandedMenuView = parcel.readString();
                        boolean z = true;
                        this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readByte() != 0;
                        this.PlaybackStateCompat$CustomAction = parcel.readByte() == 0 ? false : z;
                        this.Keep = parcel.readString();
                        this.MenuItemImpl = parcel.readInt();
                        this.f2698x50fd9e4a = parcel.readString();
                        this.setBackgroundResource = parcel.readString();
                        this.setContentView = parcel.readString();
                        this.AppCompatActivity = parcel.readString();
                        this.setContentHeight = parcel.readString();
                        this.MenuItemWrapperICS$CollapsibleActionViewWrapper = parcel.readString();
                        this.setCheckable = parcel.readString();
                        this.MediaDescriptionCompat = parcel.readString();
                        int readInt = parcel.readInt();
                        if (readInt == -1) {
                            position = null;
                        } else {
                            position = position.values()[readInt];
                        }
                        this.MediaSessionCompat$ResultReceiverWrapper = position;
                        this.ListMenuItemView = parcel.readString();
                        this.AppCompatDialogFragment = (Device) parcel.readParcelable(Device.class.getClassLoader());
                        this.setShortcut = (access$lambda$2) parcel.readParcelable(access$lambda$2.class.getClassLoader());
                        this.setHasDecor = (OperatingSystem) parcel.readParcelable(OperatingSystem.class.getClassLoader());
                        this.setTitle = parcel.readString();
                        this.MediaSessionCompat$Token = (Thread.Frame) parcel.readParcelable(Thread.Frame.class.getClassLoader());
                        this.setExpandedFormat = parcel.createTypedArrayList(OperatingSystem.Builder.CREATOR);
                        this.MediaMetadataCompat = parcel.readString();
                    }

                    public void writeToParcel(Parcel parcel, int i) {
                        super.writeToParcel(parcel, i);
                        parcel.writeInt(this.PlaybackStateCompat);
                        parcel.writeString(this.setIcon);
                        parcel.writeString(this.setPadding);
                        parcel.writeString(this.setItemInvoker);
                        parcel.writeString(this.setChecked);
                        parcel.writeString(this.AppCompatViewInflater);
                        parcel.writeString(this.ActionMenuItemView);
                        parcel.writeString(this.ParcelableVolumeInfo);
                        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                        parcel.writeString(this.RatingCompat);
                        parcel.writeString(this.setForceShowIcon);
                        parcel.writeString(this.AlertController$RecycleListView);
                        parcel.writeString(this.MediaBrowserCompat$MediaItem);
                        parcel.writeString(this.setPopupCallback);
                        parcel.writeString(this.setGroupDividerEnabled);
                        parcel.writeString(this.ExpandedMenuView);
                        parcel.writeByte(this.AppCompatDelegateImpl$ListMenuDecorView ? (byte) 1 : 0);
                        parcel.writeByte(this.PlaybackStateCompat$CustomAction ? (byte) 1 : 0);
                        parcel.writeString(this.Keep);
                        parcel.writeInt(this.MenuItemImpl);
                        parcel.writeString(this.f2698x50fd9e4a);
                        parcel.writeString(this.setBackgroundResource);
                        parcel.writeString(this.setContentView);
                        parcel.writeString(this.AppCompatActivity);
                        parcel.writeString(this.setContentHeight);
                        parcel.writeString(this.MenuItemWrapperICS$CollapsibleActionViewWrapper);
                        parcel.writeString(this.setCheckable);
                        parcel.writeString(this.MediaDescriptionCompat);
                        position position = this.MediaSessionCompat$ResultReceiverWrapper;
                        parcel.writeInt(position == null ? -1 : position.ordinal());
                        parcel.writeString(this.ListMenuItemView);
                        parcel.writeParcelable(this.AppCompatDialogFragment, i);
                        parcel.writeParcelable(this.setShortcut, i);
                        parcel.writeParcelable(this.setHasDecor, i);
                        parcel.writeString(this.setTitle);
                        parcel.writeParcelable(this.MediaSessionCompat$Token, i);
                        parcel.writeTypedList(this.setExpandedFormat);
                        parcel.writeString(this.MediaMetadataCompat);
                    }

                    public static Execution write() {
                        return new Execution();
                    }

                    public final String read() {
                        return this.read;
                    }

                    public final Execution MediaBrowserCompat$CustomActionResultReceiver(String str) {
                        this.read = str;
                        return this;
                    }

                    public final Execution MediaBrowserCompat$ItemReceiver(String str) {
                        this.MediaBrowserCompat$CustomActionResultReceiver = str;
                        return this;
                    }

                    public final String MediaBrowserCompat$CustomActionResultReceiver() {
                        return this.IconCompatParcelizer;
                    }

                    public final Execution IconCompatParcelizer(String str) {
                        this.IconCompatParcelizer = str;
                        return this;
                    }

                    public final Execution MediaMetadataCompat() {
                        this.MediaBrowserCompat$ItemReceiver = true;
                        return this;
                    }

                    public final Execution MediaBrowserCompat$MediaItem() {
                        this.write = true;
                        return this;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Execution execution = (Execution) obj;
                        if (this.PlaybackStateCompat != execution.PlaybackStateCompat || this.AppCompatDelegateImpl$ListMenuDecorView != execution.AppCompatDelegateImpl$ListMenuDecorView || this.MenuItemImpl != execution.MenuItemImpl || this.PlaybackStateCompat$CustomAction != execution.PlaybackStateCompat$CustomAction) {
                            return false;
                        }
                        String str = this.Keep;
                        if (str == null ? execution.Keep != null : !str.equals(execution.Keep)) {
                            return false;
                        }
                        String str2 = this.setIcon;
                        if (str2 == null ? execution.setIcon != null : !str2.equals(execution.setIcon)) {
                            return false;
                        }
                        String str3 = this.setPadding;
                        if (str3 == null ? execution.setPadding != null : !str3.equals(execution.setPadding)) {
                            return false;
                        }
                        String str4 = this.setItemInvoker;
                        if (str4 == null ? execution.setItemInvoker != null : !str4.equals(execution.setItemInvoker)) {
                            return false;
                        }
                        String str5 = this.setChecked;
                        if (str5 == null ? execution.setChecked != null : !str5.equals(execution.setChecked)) {
                            return false;
                        }
                        String str6 = this.AppCompatViewInflater;
                        if (str6 == null ? execution.AppCompatViewInflater != null : !str6.equals(execution.AppCompatViewInflater)) {
                            return false;
                        }
                        String str7 = this.ActionMenuItemView;
                        if (str7 == null ? execution.ActionMenuItemView != null : !str7.equals(execution.ActionMenuItemView)) {
                            return false;
                        }
                        String str8 = this.ParcelableVolumeInfo;
                        if (str8 == null ? execution.ParcelableVolumeInfo != null : !str8.equals(execution.ParcelableVolumeInfo)) {
                            return false;
                        }
                        String str9 = this.MediaBrowserCompat$SearchResultReceiver;
                        if (str9 == null ? execution.MediaBrowserCompat$SearchResultReceiver != null : !str9.equals(execution.MediaBrowserCompat$SearchResultReceiver)) {
                            return false;
                        }
                        String str10 = this.RatingCompat;
                        if (str10 == null ? execution.RatingCompat != null : !str10.equals(execution.RatingCompat)) {
                            return false;
                        }
                        String str11 = this.setForceShowIcon;
                        if (str11 == null ? execution.setForceShowIcon != null : !str11.equals(execution.setForceShowIcon)) {
                            return false;
                        }
                        String str12 = this.AlertController$RecycleListView;
                        if (str12 == null ? execution.AlertController$RecycleListView != null : !str12.equals(execution.AlertController$RecycleListView)) {
                            return false;
                        }
                        String str13 = this.MediaBrowserCompat$MediaItem;
                        if (str13 == null ? execution.MediaBrowserCompat$MediaItem != null : !str13.equals(execution.MediaBrowserCompat$MediaItem)) {
                            return false;
                        }
                        String str14 = this.setPopupCallback;
                        if (str14 == null ? execution.setPopupCallback != null : !str14.equals(execution.setPopupCallback)) {
                            return false;
                        }
                        String str15 = this.setGroupDividerEnabled;
                        if (str15 == null ? execution.setGroupDividerEnabled != null : !str15.equals(execution.setGroupDividerEnabled)) {
                            return false;
                        }
                        String str16 = this.ExpandedMenuView;
                        if (str16 == null ? execution.ExpandedMenuView != null : !str16.equals(execution.ExpandedMenuView)) {
                            return false;
                        }
                        String str17 = this.f2698x50fd9e4a;
                        if (str17 == null ? execution.f2698x50fd9e4a != null : !str17.equals(execution.f2698x50fd9e4a)) {
                            return false;
                        }
                        String str18 = this.setBackgroundResource;
                        if (str18 == null ? execution.setBackgroundResource != null : !str18.equals(execution.setBackgroundResource)) {
                            return false;
                        }
                        String str19 = this.setContentView;
                        if (str19 == null ? execution.setContentView != null : !str19.equals(execution.setContentView)) {
                            return false;
                        }
                        String str20 = this.AppCompatActivity;
                        if (str20 == null ? execution.AppCompatActivity != null : !str20.equals(execution.AppCompatActivity)) {
                            return false;
                        }
                        String str21 = this.setContentHeight;
                        if (str21 == null ? execution.setContentHeight != null : !str21.equals(execution.setContentHeight)) {
                            return false;
                        }
                        String str22 = this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
                        if (str22 == null ? execution.MenuItemWrapperICS$CollapsibleActionViewWrapper != null : !str22.equals(execution.MenuItemWrapperICS$CollapsibleActionViewWrapper)) {
                            return false;
                        }
                        String str23 = this.setCheckable;
                        if (str23 == null ? execution.setCheckable != null : !str23.equals(execution.setCheckable)) {
                            return false;
                        }
                        String str24 = this.MediaDescriptionCompat;
                        if (str24 == null ? execution.MediaDescriptionCompat != null : !str24.equals(execution.MediaDescriptionCompat)) {
                            return false;
                        }
                        if (this.MediaSessionCompat$ResultReceiverWrapper != execution.MediaSessionCompat$ResultReceiverWrapper) {
                            return false;
                        }
                        String str25 = this.ListMenuItemView;
                        if (str25 == null ? execution.ListMenuItemView != null : !str25.equals(execution.ListMenuItemView)) {
                            return false;
                        }
                        Device device = this.AppCompatDialogFragment;
                        if (device == null ? execution.AppCompatDialogFragment != null : !device.equals(execution.AppCompatDialogFragment)) {
                            return false;
                        }
                        access$lambda$2 access_lambda_2 = this.setShortcut;
                        if (access_lambda_2 == null ? execution.setShortcut != null : !access_lambda_2.equals(execution.setShortcut)) {
                            return false;
                        }
                        OperatingSystem operatingSystem = this.setHasDecor;
                        if (operatingSystem == null ? execution.setHasDecor != null : !operatingSystem.equals(execution.setHasDecor)) {
                            return false;
                        }
                        Thread.Frame frame = this.MediaSessionCompat$Token;
                        if (frame == null ? execution.MediaSessionCompat$Token != null : !frame.equals(execution.MediaSessionCompat$Token)) {
                            return false;
                        }
                        if (!Objects.equals(this.MediaMetadataCompat, execution.MediaMetadataCompat)) {
                            return false;
                        }
                        String str26 = this.MediaSessionCompat$QueueItem;
                        if (str26 == null ? execution.MediaSessionCompat$QueueItem != null : !str26.equals(execution.ListMenuItemView)) {
                            return false;
                        }
                        String str27 = this.setTitle;
                        String str28 = execution.setTitle;
                        if (str27 != null) {
                            return str27.equals(str28);
                        }
                        if (str28 != null) {
                            return false;
                        }
                        return true;
                    }

                    public int hashCode() {
                        int i = this.PlaybackStateCompat;
                        String str = this.setIcon;
                        int hashCode = str != null ? str.hashCode() : 0;
                        String str2 = this.setPadding;
                        int hashCode2 = str2 != null ? str2.hashCode() : 0;
                        String str3 = this.setItemInvoker;
                        int hashCode3 = str3 != null ? str3.hashCode() : 0;
                        String str4 = this.setChecked;
                        int hashCode4 = str4 != null ? str4.hashCode() : 0;
                        String str5 = this.AppCompatViewInflater;
                        int hashCode5 = str5 != null ? str5.hashCode() : 0;
                        String str6 = this.ActionMenuItemView;
                        int hashCode6 = str6 != null ? str6.hashCode() : 0;
                        String str7 = this.ParcelableVolumeInfo;
                        int hashCode7 = str7 != null ? str7.hashCode() : 0;
                        String str8 = this.MediaBrowserCompat$SearchResultReceiver;
                        int hashCode8 = str8 != null ? str8.hashCode() : 0;
                        String str9 = this.RatingCompat;
                        int hashCode9 = str9 != null ? str9.hashCode() : 0;
                        String str10 = this.setForceShowIcon;
                        int hashCode10 = str10 != null ? str10.hashCode() : 0;
                        String str11 = this.AlertController$RecycleListView;
                        int hashCode11 = str11 != null ? str11.hashCode() : 0;
                        String str12 = this.MediaBrowserCompat$MediaItem;
                        int hashCode12 = str12 != null ? str12.hashCode() : 0;
                        String str13 = this.setPopupCallback;
                        int hashCode13 = str13 != null ? str13.hashCode() : 0;
                        String str14 = this.setGroupDividerEnabled;
                        int hashCode14 = str14 != null ? str14.hashCode() : 0;
                        String str15 = this.ExpandedMenuView;
                        int hashCode15 = str15 != null ? str15.hashCode() : 0;
                        boolean z = this.AppCompatDelegateImpl$ListMenuDecorView;
                        boolean z2 = this.PlaybackStateCompat$CustomAction;
                        String str16 = this.Keep;
                        int hashCode16 = str16 != null ? str16.hashCode() : 0;
                        int i2 = this.MenuItemImpl;
                        String str17 = this.f2698x50fd9e4a;
                        int hashCode17 = str17 != null ? str17.hashCode() : 0;
                        String str18 = this.setBackgroundResource;
                        int hashCode18 = str18 != null ? str18.hashCode() : 0;
                        String str19 = this.setContentView;
                        int hashCode19 = str19 != null ? str19.hashCode() : 0;
                        String str20 = this.AppCompatActivity;
                        int hashCode20 = str20 != null ? str20.hashCode() : 0;
                        String str21 = this.setContentHeight;
                        int hashCode21 = str21 != null ? str21.hashCode() : 0;
                        String str22 = this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
                        int hashCode22 = str22 != null ? str22.hashCode() : 0;
                        String str23 = this.setCheckable;
                        int hashCode23 = str23 != null ? str23.hashCode() : 0;
                        String str24 = this.MediaDescriptionCompat;
                        int hashCode24 = str24 != null ? str24.hashCode() : 0;
                        position position = this.MediaSessionCompat$ResultReceiverWrapper;
                        int hashCode25 = position != null ? position.hashCode() : 0;
                        String str25 = this.ListMenuItemView;
                        int hashCode26 = str25 != null ? str25.hashCode() : 0;
                        Device device = this.AppCompatDialogFragment;
                        int hashCode27 = device != null ? device.hashCode() : 0;
                        access$lambda$2 access_lambda_2 = this.setShortcut;
                        int hashCode28 = access_lambda_2 != null ? access_lambda_2.hashCode() : 0;
                        OperatingSystem operatingSystem = this.setHasDecor;
                        int hashCode29 = operatingSystem != null ? operatingSystem.hashCode() : 0;
                        String str26 = this.setTitle;
                        int hashCode30 = str26 != null ? str26.hashCode() : 0;
                        Thread.Frame frame = this.MediaSessionCompat$Token;
                        int hashCode31 = frame != null ? frame.hashCode() : 0;
                        String str27 = this.MediaMetadataCompat;
                        int hashCode32 = str27 != null ? str27.hashCode() : 0;
                        String str28 = this.MediaSessionCompat$QueueItem;
                        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + hashCode16) * 31) + i2) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + hashCode25) * 31) + hashCode26) * 31) + hashCode27) * 31) + hashCode28) * 31) + hashCode29) * 31) + hashCode30) * 31) + hashCode31) * 31) + hashCode32) * 31) + (str28 != null ? str28.hashCode() : 0);
                    }
                }

                public Application(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String str19, String str20, String str21, String str22, List<Device.Builder> list, String str23) {
                    String str24 = str;
                    String str25 = str2;
                    String str26 = str3;
                    String str27 = str4;
                    String str28 = str6;
                    String str29 = str7;
                    String str30 = str8;
                    String str31 = str9;
                    String str32 = str10;
                    String str33 = str11;
                    String str34 = str12;
                    String str35 = str13;
                    String str36 = str19;
                    String str37 = str20;
                    String str38 = str22;
                    onGetStartedClick.write((Object) str24, BeIDParams.BEID_TRANSACTION_ID);
                    onGetStartedClick.write((Object) str25, "successfulTransferSummary");
                    onGetStartedClick.write((Object) str26, "unsuccesfulTransferSummary");
                    onGetStartedClick.write((Object) str27, "transactionDateTime");
                    onGetStartedClick.write((Object) str28, "fromAccountName");
                    onGetStartedClick.write((Object) str29, "fromAccountNumber");
                    onGetStartedClick.write((Object) str30, "fromAccountNumberRaw");
                    onGetStartedClick.write((Object) str31, "fromAccountIconUrl");
                    onGetStartedClick.write((Object) str32, "toAccountName");
                    onGetStartedClick.write((Object) str33, "toAccountNumber");
                    onGetStartedClick.write((Object) str34, "toAccountNumberRaw");
                    onGetStartedClick.write((Object) str35, "toAccountIconUrl");
                    onGetStartedClick.write((Object) str36, "successNetAmount");
                    onGetStartedClick.write((Object) str37, "totalInterest");
                    onGetStartedClick.write((Object) str21, "totalWithholdingTax");
                    onGetStartedClick.write((Object) str22, "totalFee");
                    onGetStartedClick.write((Object) list, "depositTransactions");
                    onGetStartedClick.write((Object) str23, "remainingBalance");
                    this.setContentView = str24;
                    this.MediaSessionCompat$Token = str25;
                    this.AppCompatDialogFragment = str26;
                    this.AppCompatActivity = str27;
                    this.f2696x50fd9e4a = str5;
                    this.write = str28;
                    this.read = str29;
                    this.RatingCompat = str30;
                    this.MediaBrowserCompat$ItemReceiver = str31;
                    this.PlaybackStateCompat$CustomAction = str32;
                    this.setHasDecor = str33;
                    this.setBackgroundResource = str34;
                    this.PlaybackStateCompat = str35;
                    this.MediaMetadataCompat = str14;
                    this.ParcelableVolumeInfo = str15;
                    this.MediaBrowserCompat$SearchResultReceiver = str16;
                    this.MediaBrowserCompat$MediaItem = z;
                    this.MediaBrowserCompat$CustomActionResultReceiver = str17;
                    this.MediaDescriptionCompat = str18;
                    this.MediaSessionCompat$QueueItem = str36;
                    this.AlertController$RecycleListView = str37;
                    this.AppCompatDelegateImpl$ListMenuDecorView = str21;
                    this.Keep = str22;
                    this.IconCompatParcelizer = list;
                    this.MediaSessionCompat$ResultReceiverWrapper = str23;
                }

                /* JADX WARNING: Illegal instructions before constructor call */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public Application(android.os.Parcel r31) {
                    /*
                        r30 = this;
                        r0 = r31
                        java.lang.String r1 = "parcel"
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r1 = "$this$readStringNonNull"
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        java.lang.String r3 = ""
                        if (r2 != 0) goto L_0x0016
                        r5 = r3
                        goto L_0x0017
                    L_0x0016:
                        r5 = r2
                    L_0x0017:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x0022
                        r6 = r3
                        goto L_0x0023
                    L_0x0022:
                        r6 = r2
                    L_0x0023:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x002e
                        r7 = r3
                        goto L_0x002f
                    L_0x002e:
                        r7 = r2
                    L_0x002f:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x003a
                        r8 = r3
                        goto L_0x003b
                    L_0x003a:
                        r8 = r2
                    L_0x003b:
                        java.lang.String r9 = r31.readString()
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x004a
                        r10 = r3
                        goto L_0x004b
                    L_0x004a:
                        r10 = r2
                    L_0x004b:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x0056
                        r11 = r3
                        goto L_0x0057
                    L_0x0056:
                        r11 = r2
                    L_0x0057:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x0062
                        r12 = r3
                        goto L_0x0063
                    L_0x0062:
                        r12 = r2
                    L_0x0063:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x006e
                        r13 = r3
                        goto L_0x006f
                    L_0x006e:
                        r13 = r2
                    L_0x006f:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x007a
                        r14 = r3
                        goto L_0x007b
                    L_0x007a:
                        r14 = r2
                    L_0x007b:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x0086
                        r15 = r3
                        goto L_0x0087
                    L_0x0086:
                        r15 = r2
                    L_0x0087:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x0093
                        r16 = r3
                        goto L_0x0095
                    L_0x0093:
                        r16 = r2
                    L_0x0095:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x00a1
                        r17 = r3
                        goto L_0x00a3
                    L_0x00a1:
                        r17 = r2
                    L_0x00a3:
                        java.lang.String r18 = r31.readString()
                        java.lang.String r19 = r31.readString()
                        java.lang.String r20 = r31.readString()
                        int r2 = r31.readInt()
                        r4 = 1
                        if (r2 != r4) goto L_0x00b9
                        r21 = r4
                        goto L_0x00bc
                    L_0x00b9:
                        r2 = 0
                        r21 = r2
                    L_0x00bc:
                        java.lang.String r22 = r31.readString()
                        java.lang.String r23 = r31.readString()
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x00d0
                        r24 = r3
                        goto L_0x00d2
                    L_0x00d0:
                        r24 = r2
                    L_0x00d2:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x00de
                        r25 = r3
                        goto L_0x00e0
                    L_0x00de:
                        r25 = r2
                    L_0x00e0:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x00ec
                        r26 = r3
                        goto L_0x00ee
                    L_0x00ec:
                        r26 = r2
                    L_0x00ee:
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r2 = r31.readString()
                        if (r2 != 0) goto L_0x00fa
                        r27 = r3
                        goto L_0x00fc
                    L_0x00fa:
                        r27 = r2
                    L_0x00fc:
                        o.CrashlyticsReport$Session$Device$Builder$MediaBrowserCompat$CustomActionResultReceiver r2 = p040o.CrashlyticsReport.Session.Device.Builder.CREATOR
                        android.os.Parcelable$Creator r2 = (android.os.Parcelable.Creator) r2
                        java.util.ArrayList r2 = r0.createTypedArrayList(r2)
                        java.util.List r2 = (java.util.List) r2
                        if (r2 != 0) goto L_0x010c
                        o.HmlNationalIdActivity r2 = p040o.HmlNationalIdActivity.IconCompatParcelizer
                        java.util.List r2 = (java.util.List) r2
                    L_0x010c:
                        r28 = r2
                        p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                        java.lang.String r0 = r31.readString()
                        if (r0 != 0) goto L_0x011a
                        r29 = r3
                        goto L_0x011c
                    L_0x011a:
                        r29 = r0
                    L_0x011c:
                        r4 = r30
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p040o.CrashlyticsReport.Session.Event.Application.<init>(android.os.Parcel):void");
                }

                /* renamed from: o.CrashlyticsReport$Session$Event$Application$Builder */
                public class Builder extends Builder implements Serializable, Parcelable {
                    public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
                        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                            return new Builder(parcel);
                        }

                        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                            return new Builder[i];
                        }
                    };
                    public boolean AlertController$RecycleListView;
                    public String AppCompatActivity;
                    public String AppCompatDelegateImpl$ListMenuDecorView;
                    public String AppCompatDialogFragment;
                    public String Keep;
                    public String MediaBrowserCompat$MediaItem;
                    public C3085x7c929f5b.Builder MediaBrowserCompat$SearchResultReceiver;

                    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
                    public String f2697x50fd9e4a;
                    public String MediaDescriptionCompat;
                    public String MediaMetadataCompat;
                    public String MediaSessionCompat$QueueItem;
                    public String MediaSessionCompat$ResultReceiverWrapper;
                    public String MediaSessionCompat$Token;
                    public String ParcelableVolumeInfo;
                    public String PlaybackStateCompat;
                    public String PlaybackStateCompat$CustomAction;
                    public String RatingCompat;
                    public String setBackgroundResource;
                    public String setCheckable;
                    public String setContentView;
                    public Integer setHasDecor;

                    public int describeContents() {
                        return 0;
                    }

                    public Builder() {
                    }

                    protected Builder(Parcel parcel) {
                        super(parcel);
                        if (parcel.readByte() == 0) {
                            this.setHasDecor = null;
                        } else {
                            this.setHasDecor = Integer.valueOf(parcel.readInt());
                        }
                        this.AppCompatActivity = parcel.readString();
                        this.PlaybackStateCompat = parcel.readString();
                        this.Keep = parcel.readString();
                        this.MediaBrowserCompat$MediaItem = parcel.readString();
                        this.RatingCompat = parcel.readString();
                        this.AppCompatDialogFragment = parcel.readString();
                        this.setBackgroundResource = parcel.readString();
                        this.setContentView = parcel.readString();
                        this.MediaDescriptionCompat = parcel.readString();
                        this.PlaybackStateCompat$CustomAction = parcel.readString();
                        this.MediaSessionCompat$QueueItem = parcel.readString();
                        this.f2697x50fd9e4a = parcel.readString();
                        this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readString();
                        this.setCheckable = parcel.readString();
                        this.AlertController$RecycleListView = parcel.readByte() != 0;
                        this.MediaSessionCompat$Token = parcel.readString();
                        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
                        this.MediaMetadataCompat = parcel.readString();
                        this.ParcelableVolumeInfo = parcel.readString();
                        this.MediaBrowserCompat$SearchResultReceiver = (C3085x7c929f5b.Builder) parcel.readParcelable(C3085x7c929f5b.Builder.class.getClassLoader());
                    }

                    public void writeToParcel(Parcel parcel, int i) {
                        super.writeToParcel(parcel, i);
                        if (this.setHasDecor == null) {
                            parcel.writeByte((byte) 0);
                        } else {
                            parcel.writeByte((byte) 1);
                            parcel.writeInt(this.setHasDecor.intValue());
                        }
                        parcel.writeString(this.AppCompatActivity);
                        parcel.writeString(this.PlaybackStateCompat);
                        parcel.writeString(this.Keep);
                        parcel.writeString(this.MediaBrowserCompat$MediaItem);
                        parcel.writeString(this.RatingCompat);
                        parcel.writeString(this.AppCompatDialogFragment);
                        parcel.writeString(this.setBackgroundResource);
                        parcel.writeString(this.setContentView);
                        parcel.writeString(this.MediaDescriptionCompat);
                        parcel.writeString(this.PlaybackStateCompat$CustomAction);
                        parcel.writeString(this.MediaSessionCompat$QueueItem);
                        parcel.writeString(this.f2697x50fd9e4a);
                        parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
                        parcel.writeString(this.setCheckable);
                        parcel.writeByte(this.AlertController$RecycleListView ? (byte) 1 : 0);
                        parcel.writeString(this.MediaSessionCompat$Token);
                        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
                        parcel.writeString(this.MediaMetadataCompat);
                        parcel.writeString(this.ParcelableVolumeInfo);
                        parcel.writeParcelable(this.MediaBrowserCompat$SearchResultReceiver, i);
                    }

                    public static Builder write() {
                        return new Builder();
                    }

                    public final Builder MediaBrowserCompat$CustomActionResultReceiver(String str) {
                        this.read = str;
                        return this;
                    }

                    public final Builder IconCompatParcelizer(String str) {
                        this.IconCompatParcelizer = str;
                        return this;
                    }

                    public boolean equals(Object obj) {
                        boolean z = true;
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Builder)) {
                            return false;
                        }
                        Builder builder = (Builder) obj;
                        AddNewCurrencyActivity_ViewBinding addNewCurrencyActivity_ViewBinding = new AddNewCurrencyActivity_ViewBinding();
                        boolean z2 = this.AlertController$RecycleListView;
                        boolean z3 = builder.AlertController$RecycleListView;
                        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
                            if (z2 != z3) {
                                z = false;
                            }
                            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = z;
                        }
                        return addNewCurrencyActivity_ViewBinding.read(this.setHasDecor, builder.setHasDecor).read(this.AppCompatActivity, builder.AppCompatActivity).read(this.PlaybackStateCompat, builder.PlaybackStateCompat).read(this.Keep, builder.Keep).read(this.MediaBrowserCompat$MediaItem, builder.MediaBrowserCompat$MediaItem).read(this.RatingCompat, builder.RatingCompat).read(this.AppCompatDialogFragment, builder.AppCompatDialogFragment).read(this.setBackgroundResource, builder.setBackgroundResource).read(this.setContentView, builder.setContentView).read(this.MediaDescriptionCompat, builder.MediaDescriptionCompat).read(this.PlaybackStateCompat$CustomAction, builder.PlaybackStateCompat$CustomAction).read(this.MediaSessionCompat$QueueItem, builder.MediaSessionCompat$QueueItem).read(this.f2697x50fd9e4a, builder.f2697x50fd9e4a).read(this.AppCompatDelegateImpl$ListMenuDecorView, builder.AppCompatDelegateImpl$ListMenuDecorView).read(this.setCheckable, builder.setCheckable).read(this.MediaSessionCompat$Token, builder.MediaSessionCompat$Token).read(this.MediaSessionCompat$ResultReceiverWrapper, builder.MediaSessionCompat$ResultReceiverWrapper).read(this.MediaMetadataCompat, builder.MediaMetadataCompat).read(this.ParcelableVolumeInfo, builder.ParcelableVolumeInfo).read(this.MediaBrowserCompat$SearchResultReceiver, builder.MediaBrowserCompat$SearchResultReceiver).MediaBrowserCompat$ItemReceiver;
                    }

                    public int hashCode() {
                        DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = new DetailsTabHolder_ViewBinding((byte) 0).MediaBrowserCompat$CustomActionResultReceiver(this.setHasDecor).MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatActivity).MediaBrowserCompat$CustomActionResultReceiver(this.PlaybackStateCompat).MediaBrowserCompat$CustomActionResultReceiver(this.Keep).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem).MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat).MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatDialogFragment).MediaBrowserCompat$CustomActionResultReceiver(this.setBackgroundResource).MediaBrowserCompat$CustomActionResultReceiver(this.setContentView).MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat).MediaBrowserCompat$CustomActionResultReceiver(this.PlaybackStateCompat$CustomAction).MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$QueueItem).MediaBrowserCompat$CustomActionResultReceiver(this.f2697x50fd9e4a).MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatDelegateImpl$ListMenuDecorView).MediaBrowserCompat$CustomActionResultReceiver(this.setCheckable);
                        MediaBrowserCompat$CustomActionResultReceiver.read = (MediaBrowserCompat$CustomActionResultReceiver.read * 37) + (this.AlertController$RecycleListView ^ true ? 1 : 0);
                        return MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$Token).MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$ResultReceiverWrapper).MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat).MediaBrowserCompat$CustomActionResultReceiver(this.ParcelableVolumeInfo).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver).read;
                    }
                }

                public final void writeToParcel(Parcel parcel, int i) {
                    onGetStartedClick.write((Object) parcel, "parcel");
                    parcel.writeString(this.setContentView);
                    parcel.writeString(this.MediaSessionCompat$Token);
                    parcel.writeString(this.AppCompatDialogFragment);
                    parcel.writeString(this.AppCompatActivity);
                    parcel.writeString(this.f2696x50fd9e4a);
                    parcel.writeString(this.write);
                    parcel.writeString(this.read);
                    parcel.writeString(this.RatingCompat);
                    parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                    parcel.writeString(this.PlaybackStateCompat$CustomAction);
                    parcel.writeString(this.setHasDecor);
                    parcel.writeString(this.setBackgroundResource);
                    parcel.writeString(this.PlaybackStateCompat);
                    parcel.writeString(this.MediaMetadataCompat);
                    parcel.writeString(this.ParcelableVolumeInfo);
                    parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                    parcel.writeInt(this.MediaBrowserCompat$MediaItem ? 1 : 0);
                    parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                    parcel.writeString(this.MediaDescriptionCompat);
                    parcel.writeString(this.MediaSessionCompat$QueueItem);
                    parcel.writeString(this.AlertController$RecycleListView);
                    parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
                    parcel.writeString(this.Keep);
                    parcel.writeTypedList(this.IconCompatParcelizer);
                    parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
                }

                /* renamed from: o.CrashlyticsReport$Session$Event$Application$IconCompatParcelizer */
                public static final class IconCompatParcelizer implements Parcelable.Creator<Application> {
                    private IconCompatParcelizer() {
                    }

                    public /* synthetic */ IconCompatParcelizer(byte b) {
                        this();
                    }

                    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                        onGetStartedClick.write((Object) parcel, "parcel");
                        return new Application(parcel);
                    }

                    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                        return new Application[i];
                    }
                }
            }

            /* renamed from: o.CrashlyticsReport$Session$Event$Log */
            public class Log implements Parcelable {
                public static final Parcelable.Creator<Log> CREATOR = new Parcelable.Creator<Log>() {
                    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                        return new Log(parcel);
                    }

                    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                        return new Log[i];
                    }
                };
                public String IconCompatParcelizer;
                public String MediaBrowserCompat$CustomActionResultReceiver;

                public int describeContents() {
                    return 0;
                }

                /* renamed from: o.CrashlyticsReport$Session$Event$Log$Builder */
                public class Builder implements Parcelable {
                    public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
                        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                            return new Builder(parcel);
                        }

                        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                            return new Builder[i];
                        }
                    };
                    String IconCompatParcelizer;
                    String MediaBrowserCompat$ItemReceiver;

                    public /* synthetic */ Builder() {
                    }

                    public int describeContents() {
                        return 0;
                    }

                    public Builder(String str, String str2) {
                        this.IconCompatParcelizer = str;
                        this.MediaBrowserCompat$ItemReceiver = str2;
                    }

                    protected Builder(Parcel parcel) {
                        this.IconCompatParcelizer = parcel.readString();
                        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
                    }

                    public void writeToParcel(Parcel parcel, int i) {
                        parcel.writeString(this.IconCompatParcelizer);
                        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Builder)) {
                            return false;
                        }
                        Builder builder = (Builder) obj;
                        String str = this.IconCompatParcelizer;
                        if (str == null ? builder.IconCompatParcelizer != null : !str.equals(builder.IconCompatParcelizer)) {
                            return false;
                        }
                        String str2 = this.MediaBrowserCompat$ItemReceiver;
                        if (str2 != null) {
                            return str2.equals(builder.MediaBrowserCompat$ItemReceiver);
                        }
                        if (builder.MediaBrowserCompat$ItemReceiver != null) {
                            return false;
                        }
                        return true;
                    }

                    public int hashCode() {
                        int i;
                        String str = this.IconCompatParcelizer;
                        int i2 = 0;
                        if (str != null) {
                            i = str.hashCode();
                        } else {
                            i = 0;
                        }
                        String str2 = this.MediaBrowserCompat$ItemReceiver;
                        if (str2 != null) {
                            i2 = str2.hashCode();
                        }
                        return (i * 31) + i2;
                    }
                }

                public Log(String str, String str2) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = str;
                    this.IconCompatParcelizer = str2;
                }

                protected Log(Parcel parcel) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
                    this.IconCompatParcelizer = parcel.readString();
                }

                public void writeToParcel(Parcel parcel, int i) {
                    parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                    parcel.writeString(this.IconCompatParcelizer);
                }
            }

            /* renamed from: o.CrashlyticsReport$Session$Event$Device */
            public class Device implements Parcelable {
                public static final Parcelable.Creator<Device> CREATOR = new Parcelable.Creator<Device>() {
                    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                        return new Device(parcel);
                    }

                    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                        return new Device[i];
                    }
                };
                public String IconCompatParcelizer;
                public String MediaBrowserCompat$CustomActionResultReceiver;
                public String MediaBrowserCompat$ItemReceiver;
                public String MediaBrowserCompat$MediaItem;
                public String MediaBrowserCompat$SearchResultReceiver;

                /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
                public String f2703x50fd9e4a;
                public String MediaDescriptionCompat;
                public String MediaMetadataCompat;
                public String MediaSessionCompat$QueueItem;
                public String MediaSessionCompat$ResultReceiverWrapper;
                public String RatingCompat;
                public String read;
                public String write;

                public int describeContents() {
                    return 0;
                }

                /* renamed from: o.CrashlyticsReport$Session$Event$Device$Builder */
                public final class Builder extends remainingCapacity implements Parcelable {
                    public static final Parcelable.Creator CREATOR = new read();
                    private String IconCompatParcelizer;
                    public String MediaBrowserCompat$CustomActionResultReceiver;
                    private String MediaBrowserCompat$ItemReceiver;
                    private String MediaBrowserCompat$MediaItem;
                    public String read;

                    /* renamed from: o.CrashlyticsReport$Session$Event$Device$Builder$read */
                    public static final class read implements Parcelable.Creator {
                        public final Object createFromParcel(Parcel parcel) {
                            onGetStartedClick.write((Object) parcel, "in");
                            return new Builder(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        public final Object[] newArray(int i) {
                            return new Builder[i];
                        }
                    }

                    public final int describeContents() {
                        return 0;
                    }

                    public final void writeToParcel(Parcel parcel, int i) {
                        onGetStartedClick.write((Object) parcel, "parcel");
                        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                        parcel.writeString(this.IconCompatParcelizer);
                        parcel.writeString(this.MediaBrowserCompat$MediaItem);
                        parcel.writeString(this.read);
                    }

                    public Builder(String str, String str2, String str3, String str4, String str5) {
                        onGetStartedClick.write((Object) str, "merchantId");
                        onGetStartedClick.write((Object) str2, "merchantName");
                        onGetStartedClick.write((Object) str3, "merchantTerminalId");
                        onGetStartedClick.write((Object) str4, "transNo");
                        onGetStartedClick.write((Object) str5, "urlLogo");
                        this.MediaBrowserCompat$ItemReceiver = str;
                        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
                        this.IconCompatParcelizer = str3;
                        this.MediaBrowserCompat$MediaItem = str4;
                        this.read = str5;
                    }
                }

                public void writeToParcel(Parcel parcel, int i) {
                    parcel.writeString(this.f2703x50fd9e4a);
                    parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
                    parcel.writeString(this.RatingCompat);
                    parcel.writeString(this.write);
                    parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                    parcel.writeString(this.IconCompatParcelizer);
                    parcel.writeString(this.MediaSessionCompat$QueueItem);
                    parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                    parcel.writeString(this.MediaBrowserCompat$MediaItem);
                    parcel.writeString(this.MediaDescriptionCompat);
                    parcel.writeString(this.MediaMetadataCompat);
                    parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                    parcel.writeString(this.read);
                }

                public Device() {
                }

                protected Device(Parcel parcel) {
                    this.f2703x50fd9e4a = parcel.readString();
                    this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
                    this.RatingCompat = parcel.readString();
                    this.write = parcel.readString();
                    this.MediaBrowserCompat$ItemReceiver = parcel.readString();
                    this.IconCompatParcelizer = parcel.readString();
                    this.MediaSessionCompat$QueueItem = parcel.readString();
                    this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
                    this.MediaBrowserCompat$MediaItem = parcel.readString();
                    this.MediaDescriptionCompat = parcel.readString();
                    this.MediaMetadataCompat = parcel.readString();
                    this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
                    this.read = parcel.readString();
                }

                public static Device read() {
                    return new Device();
                }
            }

            public Event(boolean z, String str, String str2) {
                this.read = z;
                this.MediaBrowserCompat$CustomActionResultReceiver = str;
                this.IconCompatParcelizer = str2;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public Event(Parcel parcel) {
                this(parcel.readInt() != 1 ? false : true, parcel.readString(), parcel.readString());
                onGetStartedClick.write((Object) parcel, "source");
            }

            public final void writeToParcel(Parcel parcel, int i) {
                onGetStartedClick.write((Object) parcel, "dest");
                parcel.writeInt(this.read ? 1 : 0);
                parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                parcel.writeString(this.IconCompatParcelizer);
            }

            /* renamed from: o.CrashlyticsReport$Session$Event$IconCompatParcelizer */
            public static final class IconCompatParcelizer implements findFragmentByWho {
                private final /* synthetic */ isUserRecoverableError IconCompatParcelizer;
                private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

                private IconCompatParcelizer() {
                }

                public /* synthetic */ IconCompatParcelizer(isUserRecoverableError isuserrecoverableerror, String str) {
                    this.IconCompatParcelizer = isuserrecoverableerror;
                    this.MediaBrowserCompat$ItemReceiver = str;
                }

                public final Object IconCompatParcelizer(Object obj) {
                    return this.IconCompatParcelizer.read(this.MediaBrowserCompat$ItemReceiver, (getOpacityAtPosition) obj);
                }
            }

            /* renamed from: o.CrashlyticsReport$Session$Event$write */
            public static final class write implements Parcelable.Creator<Event> {
                write() {
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    onGetStartedClick.write((Object) parcel, "source");
                    return new Event(parcel);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new Event[i];
                }
            }

            /* renamed from: o.CrashlyticsReport$Session$Event$Builder */
            public class Builder implements Parcelable {
                public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
                    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                        return new Builder(parcel);
                    }

                    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                        return new Builder[i];
                    }
                };
                public String IconCompatParcelizer;
                List<Log.Builder> MediaBrowserCompat$CustomActionResultReceiver;
                public List<parseDevice> MediaBrowserCompat$ItemReceiver;
                public String MediaBrowserCompat$MediaItem;
                public String MediaBrowserCompat$SearchResultReceiver;
                public String MediaDescriptionCompat;
                String MediaMetadataCompat;
                public String RatingCompat;
                String read;
                public String write;

                public /* synthetic */ Builder() {
                }

                public int describeContents() {
                    return 0;
                }

                public Builder(List<Log.Builder> list, String str, String str2, String str3, String str4, String str5, List<parseDevice> list2, String str6, String str7, String str8) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = list;
                    this.MediaDescriptionCompat = str;
                    this.MediaBrowserCompat$SearchResultReceiver = str2;
                    this.RatingCompat = str3;
                    this.MediaBrowserCompat$MediaItem = str4;
                    this.write = str5;
                    this.MediaBrowserCompat$ItemReceiver = list2;
                    this.MediaMetadataCompat = str6;
                    this.read = str7;
                    this.IconCompatParcelizer = str8;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Builder)) {
                        return false;
                    }
                    Builder builder = (Builder) obj;
                    List<Log.Builder> list = this.MediaBrowserCompat$CustomActionResultReceiver;
                    if (list == null ? builder.MediaBrowserCompat$CustomActionResultReceiver != null : !list.equals(builder.MediaBrowserCompat$CustomActionResultReceiver)) {
                        return false;
                    }
                    String str = this.MediaDescriptionCompat;
                    if (str == null ? builder.MediaDescriptionCompat != null : !str.equals(builder.MediaDescriptionCompat)) {
                        return false;
                    }
                    String str2 = this.MediaBrowserCompat$SearchResultReceiver;
                    if (str2 == null ? builder.MediaBrowserCompat$SearchResultReceiver != null : !str2.equals(builder.MediaBrowserCompat$SearchResultReceiver)) {
                        return false;
                    }
                    String str3 = this.RatingCompat;
                    if (str3 == null ? builder.RatingCompat != null : !str3.equals(builder.RatingCompat)) {
                        return false;
                    }
                    String str4 = this.MediaBrowserCompat$MediaItem;
                    if (str4 == null ? builder.MediaBrowserCompat$MediaItem != null : !str4.equals(builder.MediaBrowserCompat$MediaItem)) {
                        return false;
                    }
                    String str5 = this.write;
                    if (str5 == null ? builder.write != null : !str5.equals(builder.write)) {
                        return false;
                    }
                    List<parseDevice> list2 = this.MediaBrowserCompat$ItemReceiver;
                    if (list2 == null ? builder.MediaBrowserCompat$ItemReceiver != null : !list2.equals(builder.MediaBrowserCompat$ItemReceiver)) {
                        return false;
                    }
                    String str6 = this.MediaMetadataCompat;
                    if (str6 == null ? builder.MediaMetadataCompat != null : !str6.equals(builder.MediaMetadataCompat)) {
                        return false;
                    }
                    String str7 = this.read;
                    if (str7 == null ? builder.read != null : !str7.equals(builder.read)) {
                        return false;
                    }
                    String str8 = this.IconCompatParcelizer;
                    String str9 = builder.IconCompatParcelizer;
                    if (str8 != null) {
                        return str8.equals(str9);
                    }
                    if (str9 != null) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    List<Log.Builder> list = this.MediaBrowserCompat$CustomActionResultReceiver;
                    int i = 0;
                    int hashCode = list != null ? list.hashCode() : 0;
                    String str = this.MediaDescriptionCompat;
                    int hashCode2 = str != null ? str.hashCode() : 0;
                    String str2 = this.MediaBrowserCompat$SearchResultReceiver;
                    int hashCode3 = str2 != null ? str2.hashCode() : 0;
                    String str3 = this.RatingCompat;
                    int hashCode4 = str3 != null ? str3.hashCode() : 0;
                    String str4 = this.MediaBrowserCompat$MediaItem;
                    int hashCode5 = str4 != null ? str4.hashCode() : 0;
                    String str5 = this.write;
                    int hashCode6 = str5 != null ? str5.hashCode() : 0;
                    List<parseDevice> list2 = this.MediaBrowserCompat$ItemReceiver;
                    int hashCode7 = list2 != null ? list2.hashCode() : 0;
                    String str6 = this.MediaMetadataCompat;
                    int hashCode8 = str6 != null ? str6.hashCode() : 0;
                    String str7 = this.read;
                    int hashCode9 = str7 != null ? str7.hashCode() : 0;
                    String str8 = this.IconCompatParcelizer;
                    if (str8 != null) {
                        i = str8.hashCode();
                    }
                    return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
                }

                protected Builder(Parcel parcel) {
                    this.MediaDescriptionCompat = parcel.readString();
                    this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
                    this.RatingCompat = parcel.readString();
                    this.MediaBrowserCompat$MediaItem = parcel.readString();
                    this.write = parcel.readString();
                    this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(parseDevice.CREATOR);
                    this.MediaMetadataCompat = parcel.readString();
                    this.read = parcel.readString();
                    this.IconCompatParcelizer = parcel.readString();
                }

                public void writeToParcel(Parcel parcel, int i) {
                    parcel.writeString(this.MediaDescriptionCompat);
                    parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                    parcel.writeString(this.RatingCompat);
                    parcel.writeString(this.MediaBrowserCompat$MediaItem);
                    parcel.writeString(this.write);
                    parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
                    parcel.writeString(this.MediaMetadataCompat);
                    parcel.writeString(this.read);
                    parcel.writeString(this.IconCompatParcelizer);
                }
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Session)) {
                return false;
            }
            Session session = (Session) obj;
            return this.read == session.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) session.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) session.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            boolean z = this.read;
            if (z) {
                z = true;
            }
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            FilesPayload.Builder builder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (builder != null) {
                i = builder.hashCode();
            }
            return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TierPricingPromotionDisplay(showPromo=");
            sb.append(this.read);
            sb.append(", validUntil=");
            sb.append(this.write);
            sb.append(", simplePromotion=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.CrashlyticsReport$Session$Application */
        public class Application implements Parcelable {
            public static final Parcelable.Creator<Application> CREATOR = new Parcelable.Creator<Application>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new Application(parcel);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new Application[i];
                }
            };
            public String MediaBrowserCompat$ItemReceiver;
            public List<parseReport> read;

            /* renamed from: o.CrashlyticsReport$Session$Application$read */
            public static final class read {
                public String IconCompatParcelizer;
                public List<parseReport> MediaBrowserCompat$CustomActionResultReceiver;
            }

            public int describeContents() {
                return 0;
            }

            /* renamed from: o.CrashlyticsReport$Session$Application$Organization */
            public final class Organization {
                public final String IconCompatParcelizer;
                public final Double MediaBrowserCompat$CustomActionResultReceiver;
                public final String MediaBrowserCompat$ItemReceiver;
                public final zzrm MediaBrowserCompat$SearchResultReceiver;
                public final double read;
                public final double write;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Organization)) {
                        return false;
                    }
                    Organization organization = (Organization) obj;
                    return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) organization.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) organization.MediaBrowserCompat$CustomActionResultReceiver) && Double.compare(this.write, organization.write) == 0 && Double.compare(this.read, organization.read) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) organization.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) organization.IconCompatParcelizer);
                }

                public final int hashCode() {
                    zzrm zzrm = this.MediaBrowserCompat$SearchResultReceiver;
                    int i = 0;
                    int hashCode = zzrm != null ? zzrm.hashCode() : 0;
                    Double d = this.MediaBrowserCompat$CustomActionResultReceiver;
                    int hashCode2 = d != null ? d.hashCode() : 0;
                    long doubleToLongBits = Double.doubleToLongBits(this.write);
                    int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    long doubleToLongBits2 = Double.doubleToLongBits(this.read);
                    int i3 = (int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2);
                    String str = this.MediaBrowserCompat$ItemReceiver;
                    int hashCode3 = str != null ? str.hashCode() : 0;
                    String str2 = this.IconCompatParcelizer;
                    if (str2 != null) {
                        i = str2.hashCode();
                    }
                    return (((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + i3) * 31) + hashCode3) * 31) + i;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DepositAdditionalLimitDisplay(status=");
                    sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                    sb.append(", creditLimit=");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                    sb.append(", creditUsed=");
                    sb.append(this.write);
                    sb.append(", availableCredit=");
                    sb.append(this.read);
                    sb.append(", cardRefNo=");
                    sb.append(this.MediaBrowserCompat$ItemReceiver);
                    sb.append(", limitLabel=");
                    sb.append(this.IconCompatParcelizer);
                    sb.append(")");
                    return sb.toString();
                }

                public Organization(zzrm zzrm, Double d, double d2, double d3, String str, String str2) {
                    this.MediaBrowserCompat$SearchResultReceiver = zzrm;
                    this.MediaBrowserCompat$CustomActionResultReceiver = d;
                    this.write = d2;
                    this.read = d3;
                    this.MediaBrowserCompat$ItemReceiver = str;
                    this.IconCompatParcelizer = str2;
                }
            }

            public /* synthetic */ Application(read read2, byte b) {
                this(read2);
            }

            /* renamed from: o.CrashlyticsReport$Session$Application$Builder */
            public final class Builder extends remainingCapacity implements Parcelable {
                public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
                    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                        return new Builder(parcel);
                    }

                    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                        return new Builder[i];
                    }
                };
                public List<OperatingSystem.Builder> MediaBrowserCompat$CustomActionResultReceiver;
                public String read;

                public final int describeContents() {
                    return 0;
                }

                private Builder() {
                }

                protected Builder(Parcel parcel) {
                    this.read = parcel.readString();
                }

                public static Builder write() {
                    return new Builder();
                }

                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeString(this.read);
                }
            }

            private Application(read read2) {
                this.MediaBrowserCompat$ItemReceiver = read2.IconCompatParcelizer;
                this.read = read2.MediaBrowserCompat$CustomActionResultReceiver;
            }

            protected Application(Parcel parcel) {
                this.MediaBrowserCompat$ItemReceiver = parcel.readString();
                this.read = parcel.createTypedArrayList(parseReport.CREATOR);
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                parcel.writeTypedList(this.read);
            }
        }

        public Session(boolean z, String str, FilesPayload.Builder builder) {
            onGetStartedClick.write((Object) builder, "simplePromotion");
            this.read = z;
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = builder;
        }

        /* renamed from: o.CrashlyticsReport$Session$Device */
        public final class Device extends FilesPayload.File.Builder {
            public static final Parcelable.Creator<Device> CREATOR = new Parcelable.Creator<Device>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new Device(parcel);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new Device[i];
                }
            };
            public String MediaBrowserCompat$ItemReceiver;

            public final int describeContents() {
                return 0;
            }

            /* renamed from: o.CrashlyticsReport$Session$Device$Builder */
            public final class Builder implements Parcelable {
                public static final C3274x9373093f CREATOR = new C3274x9373093f((byte) 0);
                public String IconCompatParcelizer;
                public String MediaBrowserCompat$CustomActionResultReceiver;
                public String MediaBrowserCompat$ItemReceiver;
                public String MediaBrowserCompat$MediaItem;
                public String MediaDescriptionCompat;
                public boolean read;
                public String write;

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
                    return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) builder.IconCompatParcelizer) && this.read == builder.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) builder.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) builder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) builder.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) builder.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) builder.MediaDescriptionCompat);
                }

                public final int hashCode() {
                    String str = this.IconCompatParcelizer;
                    int i = 0;
                    int hashCode = str != null ? str.hashCode() : 0;
                    boolean z = this.read;
                    if (z) {
                        z = true;
                    }
                    String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    int hashCode2 = str2 != null ? str2.hashCode() : 0;
                    String str3 = this.write;
                    int hashCode3 = str3 != null ? str3.hashCode() : 0;
                    String str4 = this.MediaBrowserCompat$ItemReceiver;
                    int hashCode4 = str4 != null ? str4.hashCode() : 0;
                    String str5 = this.MediaBrowserCompat$MediaItem;
                    int hashCode5 = str5 != null ? str5.hashCode() : 0;
                    String str6 = this.MediaDescriptionCompat;
                    if (str6 != null) {
                        i = str6.hashCode();
                    }
                    return (((((((((((hashCode * 31) + (z ? 1 : 0)) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("FixedTransferDepositTransactionDisplay(title=");
                    sb.append(this.IconCompatParcelizer);
                    sb.append(", isSuccess=");
                    sb.append(this.read);
                    sb.append(", errorMessage=");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                    sb.append(", amount=");
                    sb.append(this.write);
                    sb.append(", interest=");
                    sb.append(this.MediaBrowserCompat$ItemReceiver);
                    sb.append(", withholdingTax=");
                    sb.append(this.MediaBrowserCompat$MediaItem);
                    sb.append(", total=");
                    sb.append(this.MediaDescriptionCompat);
                    sb.append(")");
                    return sb.toString();
                }

                public Builder(String str, boolean z, String str2, String str3, String str4, String str5, String str6) {
                    onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
                    onGetStartedClick.write((Object) str3, "amount");
                    onGetStartedClick.write((Object) str4, "interest");
                    onGetStartedClick.write((Object) str5, "withholdingTax");
                    onGetStartedClick.write((Object) str6, "total");
                    this.IconCompatParcelizer = str;
                    this.read = z;
                    this.MediaBrowserCompat$CustomActionResultReceiver = str2;
                    this.write = str3;
                    this.MediaBrowserCompat$ItemReceiver = str4;
                    this.MediaBrowserCompat$MediaItem = str5;
                    this.MediaDescriptionCompat = str6;
                }

                /* JADX WARNING: Illegal instructions before constructor call */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public Builder(android.os.Parcel r12) {
                    /*
                        r11 = this;
                        java.lang.String r0 = "parcel"
                        p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r0)
                        java.lang.String r0 = "$this$readStringNonNull"
                        p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r0)
                        java.lang.String r1 = r12.readString()
                        java.lang.String r2 = ""
                        if (r1 != 0) goto L_0x0014
                        r4 = r2
                        goto L_0x0015
                    L_0x0014:
                        r4 = r1
                    L_0x0015:
                        byte r1 = r12.readByte()
                        if (r1 == 0) goto L_0x001d
                        r1 = 1
                        goto L_0x001e
                    L_0x001d:
                        r1 = 0
                    L_0x001e:
                        r5 = r1
                        java.lang.String r6 = r12.readString()
                        p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r0)
                        java.lang.String r1 = r12.readString()
                        if (r1 != 0) goto L_0x002e
                        r7 = r2
                        goto L_0x002f
                    L_0x002e:
                        r7 = r1
                    L_0x002f:
                        p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r0)
                        java.lang.String r1 = r12.readString()
                        if (r1 != 0) goto L_0x003a
                        r8 = r2
                        goto L_0x003b
                    L_0x003a:
                        r8 = r1
                    L_0x003b:
                        p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r0)
                        java.lang.String r1 = r12.readString()
                        if (r1 != 0) goto L_0x0046
                        r9 = r2
                        goto L_0x0047
                    L_0x0046:
                        r9 = r1
                    L_0x0047:
                        p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r0)
                        java.lang.String r12 = r12.readString()
                        if (r12 != 0) goto L_0x0052
                        r10 = r2
                        goto L_0x0053
                    L_0x0052:
                        r10 = r12
                    L_0x0053:
                        r3 = r11
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p040o.CrashlyticsReport.Session.Device.Builder.<init>(android.os.Parcel):void");
                }

                public final void writeToParcel(Parcel parcel, int i) {
                    onGetStartedClick.write((Object) parcel, "parcel");
                    parcel.writeString(this.IconCompatParcelizer);
                    parcel.writeByte(this.read ? (byte) 1 : 0);
                    parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                    parcel.writeString(this.write);
                    parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                    parcel.writeString(this.MediaBrowserCompat$MediaItem);
                    parcel.writeString(this.MediaDescriptionCompat);
                }
            }

            protected Device(Parcel parcel) {
                super(parcel);
            }

            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
            }

            public static Device write() {
                return new Device();
            }

            public Device() {
            }
        }

        /* renamed from: o.CrashlyticsReport$Session$OperatingSystem */
        public class OperatingSystem implements Parcelable {
            public static final Parcelable.Creator<OperatingSystem> CREATOR = new Parcelable.Creator<OperatingSystem>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new OperatingSystem(parcel);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new OperatingSystem[i];
                }
            };
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public boolean MediaBrowserCompat$ItemReceiver;
            public boolean read;

            public int describeContents() {
                return 0;
            }

            /* renamed from: o.CrashlyticsReport$Session$OperatingSystem$Builder */
            public final class Builder extends remainingCapacity implements Parcelable {
                public static final write CREATOR = new write((byte) 0);
                public final String IconCompatParcelizer;
                public final String MediaBrowserCompat$CustomActionResultReceiver;
                public final String MediaBrowserCompat$ItemReceiver;
                public final String MediaBrowserCompat$MediaItem;
                public final String MediaBrowserCompat$SearchResultReceiver;
                public final String read;

                public final int describeContents() {
                    return 0;
                }

                public Builder(String str, String str2, String str3, String str4, String str5, String str6) {
                    this.MediaBrowserCompat$MediaItem = str;
                    this.MediaBrowserCompat$SearchResultReceiver = str2;
                    this.MediaBrowserCompat$CustomActionResultReceiver = str3;
                    this.IconCompatParcelizer = str4;
                    this.MediaBrowserCompat$ItemReceiver = str5;
                    this.read = str6;
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public Builder(Parcel parcel) {
                    this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    onGetStartedClick.write((Object) parcel, "parcel");
                }

                public final void writeToParcel(Parcel parcel, int i) {
                    onGetStartedClick.write((Object) parcel, "parcel");
                    parcel.writeString(this.MediaBrowserCompat$MediaItem);
                    parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                    parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                    parcel.writeString(this.IconCompatParcelizer);
                    parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                    parcel.writeString(this.read);
                }

                /* renamed from: o.CrashlyticsReport$Session$OperatingSystem$Builder$write */
                public static final class write implements Parcelable.Creator<Builder> {
                    private write() {
                    }

                    public /* synthetic */ write(byte b) {
                        this();
                    }

                    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                        onGetStartedClick.write((Object) parcel, "parcel");
                        return new Builder(parcel);
                    }

                    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                        return new Builder[i];
                    }
                }
            }

            public OperatingSystem() {
            }

            public static OperatingSystem write() {
                return new OperatingSystem();
            }

            protected OperatingSystem(Parcel parcel) {
                boolean z = true;
                this.MediaBrowserCompat$ItemReceiver = parcel.readByte() != 0;
                this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
                this.read = parcel.readByte() == 0 ? false : z;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
                parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                parcel.writeByte(this.read ? (byte) 1 : 0);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                OperatingSystem operatingSystem = (OperatingSystem) obj;
                if (this.MediaBrowserCompat$ItemReceiver != operatingSystem.MediaBrowserCompat$ItemReceiver || this.read != operatingSystem.read) {
                    return false;
                }
                String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                String str2 = operatingSystem.MediaBrowserCompat$CustomActionResultReceiver;
                if (str != null) {
                    return str.equals(str2);
                }
                if (str2 != null) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                boolean z = this.MediaBrowserCompat$ItemReceiver;
                String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                return ((((z ? 1 : 0) * true) + (str != null ? str.hashCode() : 0)) * 31) + (this.read ? 1 : 0);
            }
        }

        /* renamed from: o.CrashlyticsReport$Session$Builder */
        public abstract class Builder implements Parcelable {
            public String IconCompatParcelizer;
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public boolean MediaBrowserCompat$ItemReceiver = false;
            public String read;
            public boolean write;

            public int describeContents() {
                return 0;
            }

            public String read() {
                return this.read;
            }

            public String MediaBrowserCompat$CustomActionResultReceiver() {
                return this.IconCompatParcelizer;
            }

            public final boolean MediaBrowserCompat$ItemReceiver() {
                return this.MediaBrowserCompat$ItemReceiver;
            }

            public final boolean IconCompatParcelizer() {
                return this.write;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.read);
                parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                parcel.writeString(this.IconCompatParcelizer);
                parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
                parcel.writeByte(this.write ? (byte) 1 : 0);
            }

            public Builder() {
            }

            public Builder(Parcel parcel) {
                boolean z = false;
                this.read = parcel.readString();
                this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
                this.IconCompatParcelizer = parcel.readString();
                this.MediaBrowserCompat$ItemReceiver = parcel.readByte() != 0;
                this.write = parcel.readByte() != 0 ? true : z;
            }
        }

        /* renamed from: o.CrashlyticsReport$Session$User */
        public final class User extends TypeAdapter implements addKernel {
            private Gson IconCompatParcelizer;
            private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
            private validateDAGRecurse write;

            /* renamed from: o.CrashlyticsReport$Session$User$Builder */
            public final class Builder extends TypeAdapter implements addKernel {
                private validateDAGRecurse IconCompatParcelizer;
                private validateCycle MediaBrowserCompat$ItemReceiver;
                private Gson write;

                public Builder(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
                    this.write = gson;
                    this.MediaBrowserCompat$ItemReceiver = validatecycle;
                    this.IconCompatParcelizer = validatedagrecurse;
                }

                public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                    if (obj == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    Event.Builder builder = (Event.Builder) obj;
                    Gson gson = this.write;
                    validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
                    jsonWriter.beginObject();
                    if (builder != builder.read) {
                        validatedagrecurse.read(jsonWriter, 24);
                        String str = builder.read;
                        findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
                    }
                    if (builder != builder.MediaBrowserCompat$ItemReceiver) {
                        validatedagrecurse.read(jsonWriter, 244);
                        Event.Application.Execution.Thread thread = new Event.Application.Execution.Thread();
                        List<parseDevice> list = builder.MediaBrowserCompat$ItemReceiver;
                        findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) thread, (Object) list).write(jsonWriter, list);
                    }
                    if (builder != builder.IconCompatParcelizer) {
                        validatedagrecurse.read(jsonWriter, 441);
                        String str2 = builder.IconCompatParcelizer;
                        findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
                    }
                    if (builder != builder.write) {
                        validatedagrecurse.read(jsonWriter, 64);
                        String str3 = builder.write;
                        findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
                    }
                    if (builder != builder.MediaBrowserCompat$CustomActionResultReceiver) {
                        validatedagrecurse.read(jsonWriter, 131);
                        Event.Application.Execution.Thread.Builder builder2 = new Event.Application.Execution.Thread.Builder();
                        List<Event.Log.Builder> list2 = builder.MediaBrowserCompat$CustomActionResultReceiver;
                        findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) builder2, (Object) list2).write(jsonWriter, list2);
                    }
                    if (builder != builder.MediaBrowserCompat$SearchResultReceiver) {
                        validatedagrecurse.read(jsonWriter, 488);
                        String str4 = builder.MediaBrowserCompat$SearchResultReceiver;
                        findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
                    }
                    if (builder != builder.MediaDescriptionCompat) {
                        validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA);
                        String str5 = builder.MediaDescriptionCompat;
                        findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
                    }
                    if (builder != builder.MediaMetadataCompat) {
                        validatedagrecurse.read(jsonWriter, 104);
                        String str6 = builder.MediaMetadataCompat;
                        findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
                    }
                    if (builder != builder.MediaBrowserCompat$MediaItem) {
                        validatedagrecurse.read(jsonWriter, 368);
                        String str7 = builder.MediaBrowserCompat$MediaItem;
                        findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
                    }
                    if (builder != builder.RatingCompat) {
                        validatedagrecurse.read(jsonWriter, 611);
                        String str8 = builder.RatingCompat;
                        findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
                    }
                    jsonWriter.endObject();
                }

                public final Object read(JsonReader jsonReader) throws IOException {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        return null;
                    }
                    Event.Builder builder = new Event.Builder();
                    Gson gson = this.write;
                    validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        int write2 = validatecycle.write(jsonReader);
                        boolean z = jsonReader.peek() != JsonToken.NULL;
                        if (write2 != 2) {
                            if (write2 != 5) {
                                if (write2 != 45) {
                                    if (write2 != 99) {
                                        if (write2 != 420) {
                                            if (write2 != 472) {
                                                if (write2 != 514) {
                                                    if (write2 != 566) {
                                                        if (write2 != 583) {
                                                            if (write2 != 587) {
                                                                jsonReader.skipValue();
                                                            } else if (z) {
                                                                builder.MediaDescriptionCompat = gson.getAdapter(String.class).read(jsonReader);
                                                            } else {
                                                                builder.MediaDescriptionCompat = null;
                                                            }
                                                        } else if (z) {
                                                            builder.MediaBrowserCompat$ItemReceiver = (List) gson.getAdapter(new Event.Application.Execution.Thread()).read(jsonReader);
                                                        } else {
                                                            builder.MediaBrowserCompat$ItemReceiver = null;
                                                        }
                                                    } else if (z) {
                                                        builder.MediaBrowserCompat$SearchResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                                                    } else {
                                                        builder.MediaBrowserCompat$SearchResultReceiver = null;
                                                    }
                                                } else if (z) {
                                                    builder.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                                                } else {
                                                    builder.IconCompatParcelizer = null;
                                                }
                                            } else if (z) {
                                                builder.read = gson.getAdapter(String.class).read(jsonReader);
                                            } else {
                                                builder.read = null;
                                            }
                                        } else if (z) {
                                            builder.MediaBrowserCompat$MediaItem = gson.getAdapter(String.class).read(jsonReader);
                                        } else {
                                            builder.MediaBrowserCompat$MediaItem = null;
                                        }
                                    } else if (z) {
                                        builder.MediaMetadataCompat = gson.getAdapter(String.class).read(jsonReader);
                                    } else {
                                        builder.MediaMetadataCompat = null;
                                    }
                                } else if (z) {
                                    builder.RatingCompat = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    builder.RatingCompat = null;
                                }
                            } else if (z) {
                                builder.MediaBrowserCompat$CustomActionResultReceiver = (List) gson.getAdapter(new Event.Application.Execution.Thread.Builder()).read(jsonReader);
                            } else {
                                builder.MediaBrowserCompat$CustomActionResultReceiver = null;
                            }
                        } else if (z) {
                            builder.write = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            builder.write = null;
                        }
                        jsonReader.nextNull();
                    }
                    jsonReader.endObject();
                    return builder;
                }
            }

            public User(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
                this.IconCompatParcelizer = gson;
                this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
                this.write = validatedagrecurse;
            }

            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                if (obj == null) {
                    jsonWriter.nullValue();
                    return;
                }
                parseDevice parsedevice = (parseDevice) obj;
                Gson gson = this.IconCompatParcelizer;
                validateDAGRecurse validatedagrecurse = this.write;
                jsonWriter.beginObject();
                if (parsedevice != parsedevice.IconCompatParcelizer) {
                    validatedagrecurse.read(jsonWriter, 122);
                    String str = parsedevice.IconCompatParcelizer;
                    findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
                }
                jsonWriter.endObject();
            }

            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    return null;
                }
                parseDevice parsedevice = new parseDevice();
                Gson gson = this.IconCompatParcelizer;
                validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    int write2 = validatecycle.write(jsonReader);
                    boolean z = jsonReader.peek() != JsonToken.NULL;
                    if (write2 != 457) {
                        jsonReader.skipValue();
                    } else if (z) {
                        parsedevice.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        parsedevice.IconCompatParcelizer = null;
                        jsonReader.nextNull();
                    }
                }
                jsonReader.endObject();
                return parsedevice;
            }
        }
    }

    /* renamed from: o.CrashlyticsReport$CustomAttribute */
    public final class CustomAttribute extends remainingCapacity {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public int read;

        /* renamed from: o.CrashlyticsReport$CustomAttribute$Builder */
        public final class Builder extends Builder {
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final List<read> read;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Builder)) {
                    return false;
                }
                Builder builder = (Builder) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) builder.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) builder.read);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                List<read> list = this.read;
                if (list != null) {
                    i = list.hashCode();
                }
                return (hashCode * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ProductCatalogueInterestOptionsDisplay(principal=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", options=");
                sb.append(this.read);
                sb.append(")");
                return sb.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Builder(String str, List<read> list) {
                super(Builder.write.INTEREST);
                onGetStartedClick.write((Object) str, "principal");
                onGetStartedClick.write((Object) list, "options");
                this.MediaBrowserCompat$CustomActionResultReceiver = str;
                this.read = list;
            }

            /* renamed from: o.CrashlyticsReport$CustomAttribute$Builder$read */
            public static final class read {
                public final String MediaBrowserCompat$ItemReceiver;
                public final String write;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof read)) {
                        return false;
                    }
                    read read = (read) obj;
                    return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) read.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) read.write);
                }

                public final int hashCode() {
                    String str = this.MediaBrowserCompat$ItemReceiver;
                    int i = 0;
                    int hashCode = str != null ? str.hashCode() : 0;
                    String str2 = this.write;
                    if (str2 != null) {
                        i = str2.hashCode();
                    }
                    return (hashCode * 31) + i;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("InterestOptionDisplay(interest=");
                    sb.append(this.MediaBrowserCompat$ItemReceiver);
                    sb.append(", installmentRage=");
                    sb.append(this.write);
                    sb.append(")");
                    return sb.toString();
                }

                public read(String str, String str2) {
                    this.MediaBrowserCompat$ItemReceiver = str;
                    this.write = str2;
                }
            }
        }

        public static CustomAttribute MediaBrowserCompat$CustomActionResultReceiver() {
            return new CustomAttribute();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CustomAttribute customAttribute = (CustomAttribute) obj;
            if (this.read != customAttribute.read) {
                return false;
            }
            String str = this.MediaBrowserCompat$ItemReceiver;
            if (str == null ? customAttribute.MediaBrowserCompat$ItemReceiver != null : !str.equals(customAttribute.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str3 = customAttribute.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (((hashCode * 31) + i) * 31) + this.read;
        }
    }

    /* renamed from: o.CrashlyticsReport$FilesPayload */
    public enum FilesPayload implements Parcelable {
        RECEIVED(Iterables$3$MediaBrowserCompat$MediaItem.gifts_received_tab),
        SENT(Iterables$3$MediaBrowserCompat$MediaItem.gifts_sent_tab);
        
        public static final Parcelable.Creator<FilesPayload> CREATOR = null;
        public int tabResourceId;

        public final int describeContents() {
            return 0;
        }

        /* renamed from: o.CrashlyticsReport$FilesPayload$Builder */
        public final class Builder implements Parcelable {
            public static final read CREATOR = null;
            public final List<getIdentifierUtf8Bytes> IconCompatParcelizer;
            public final String MediaBrowserCompat$ItemReceiver;
            public final boolean read;
            public final String write;

            static {
                CREATOR = new read((byte) 0);
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
                return this.read == builder.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) builder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) builder.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) builder.MediaBrowserCompat$ItemReceiver);
            }

            public final int hashCode() {
                boolean z = this.read;
                if (z) {
                    z = true;
                }
                String str = this.write;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                List<getIdentifierUtf8Bytes> list = this.IconCompatParcelizer;
                int hashCode2 = list != null ? list.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$ItemReceiver;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return ((((((z ? 1 : 0) * true) + hashCode) * 31) + hashCode2) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("TierPricingSimplePromotionDisplay(showPromo=");
                sb.append(this.read);
                sb.append(", title=");
                sb.append(this.write);
                sb.append(", installments=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", remark=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(")");
                return sb.toString();
            }

            public Builder(boolean z, String str, List<getIdentifierUtf8Bytes> list, String str2) {
                this.read = z;
                this.write = str;
                this.IconCompatParcelizer = list;
                this.MediaBrowserCompat$ItemReceiver = str2;
            }

            public /* synthetic */ Builder(String str, List list) {
                this(false, str, list, (String) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public Builder(Parcel parcel) {
                this(parcel.readByte() != 0, parcel.readString(), parcel.createTypedArrayList(getIdentifierUtf8Bytes.CREATOR), parcel.readString());
                onGetStartedClick.write((Object) parcel, "parcel");
            }

            public final void writeToParcel(Parcel parcel, int i) {
                onGetStartedClick.write((Object) parcel, "parcel");
                parcel.writeByte(this.read ? (byte) 1 : 0);
                parcel.writeString(this.write);
                parcel.writeTypedList(this.IconCompatParcelizer);
                parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            }

            /* renamed from: o.CrashlyticsReport$FilesPayload$Builder$read */
            public static final class read implements Parcelable.Creator<Builder> {
                private read() {
                }

                public /* synthetic */ read(byte b) {
                    this();
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    onGetStartedClick.write((Object) parcel, "parcel");
                    return new Builder(parcel);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new Builder[i];
                }
            }
        }

        /* renamed from: o.CrashlyticsReport$FilesPayload$File */
        public final class File implements Parcelable {
            public static final Parcelable.Creator<File> CREATOR = null;
            public int IconCompatParcelizer;
            public CrashlyticsReportJsonTransform$$Lambda$4 MediaBrowserCompat$CustomActionResultReceiver;
            public boolean MediaBrowserCompat$ItemReceiver;
            public boolean MediaDescriptionCompat;
            public boolean MediaMetadataCompat;
            public String RatingCompat;
            public boolean read;
            public String write;

            public final int describeContents() {
                return 0;
            }

            public /* synthetic */ File(write write2, byte b) {
                this(write2);
            }

            protected File(Parcel parcel) {
                boolean z = true;
                this.MediaMetadataCompat = parcel.readByte() != 0;
                this.MediaDescriptionCompat = parcel.readByte() != 0;
                this.MediaBrowserCompat$ItemReceiver = parcel.readByte() != 0;
                this.RatingCompat = parcel.readString();
                this.write = parcel.readString();
                this.read = parcel.readByte() == 0 ? false : z;
                this.MediaBrowserCompat$CustomActionResultReceiver = CrashlyticsReportJsonTransform$$Lambda$4.MediaBrowserCompat$ItemReceiver(parcel.readString());
                this.IconCompatParcelizer = parcel.readInt();
            }

            /* renamed from: o.CrashlyticsReport$FilesPayload$File$Builder */
            public class Builder extends remainingCapacity implements Parcelable {
                public static final Parcelable.Creator<Builder> CREATOR = null;
                public boolean AlertController$RecycleListView;
                public String IconCompatParcelizer;
                public String Keep;
                public Double MediaBrowserCompat$CustomActionResultReceiver;
                public Session.Application.Organization MediaBrowserCompat$MediaItem;
                public String MediaBrowserCompat$SearchResultReceiver;

                /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
                public String f2695x50fd9e4a;
                public Double MediaDescriptionCompat;
                public String MediaMetadataCompat;
                public List<zzvq> MediaSessionCompat$QueueItem;
                public getShortName MediaSessionCompat$ResultReceiverWrapper;
                public String MediaSessionCompat$Token;
                public String ParcelableVolumeInfo;
                public List<String> PlaybackStateCompat$CustomAction;
                public String RatingCompat;
                public String read;

                public int describeContents() {
                    return 0;
                }

                public Builder() {
                }

                protected Builder(Parcel parcel) {
                    this.MediaSessionCompat$Token = parcel.readString();
                    this.f2695x50fd9e4a = parcel.readString();
                    this.Keep = parcel.readString();
                    this.read = parcel.readString();
                    if (parcel.readByte() == 0) {
                        this.MediaBrowserCompat$CustomActionResultReceiver = null;
                    } else {
                        this.MediaBrowserCompat$CustomActionResultReceiver = Double.valueOf(parcel.readDouble());
                    }
                    this.AlertController$RecycleListView = parcel.readByte() != 0;
                    this.ParcelableVolumeInfo = parcel.readString();
                    this.RatingCompat = parcel.readString();
                    this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
                    this.PlaybackStateCompat$CustomAction = parcel.createStringArrayList();
                }

                public void writeToParcel(Parcel parcel, int i) {
                    parcel.writeString(this.MediaSessionCompat$Token);
                    parcel.writeString(this.f2695x50fd9e4a);
                    parcel.writeString(this.Keep);
                    parcel.writeString(this.read);
                    if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                        parcel.writeByte((byte) 0);
                    } else {
                        parcel.writeByte((byte) 1);
                        parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver.doubleValue());
                    }
                    parcel.writeByte(this.AlertController$RecycleListView ? (byte) 1 : 0);
                    parcel.writeString(this.ParcelableVolumeInfo);
                    parcel.writeString(this.RatingCompat);
                    parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                    parcel.writeStringList(this.PlaybackStateCompat$CustomAction);
                }

                static {
                    CREATOR = new Parcelable.Creator<Builder>() {
                        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                            return new Builder(parcel);
                        }

                        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                            return new Builder[i];
                        }
                    };
                }

                public static Builder MediaBrowserCompat$CustomActionResultReceiver() {
                    return new Builder();
                }
            }

            static {
                CREATOR = new Parcelable.Creator<File>() {
                    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                        return new File(parcel);
                    }

                    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                        return new File[i];
                    }
                };
            }

            private File() {
            }

            private File(write write2) {
                this.MediaMetadataCompat = write2.MediaDescriptionCompat;
                this.MediaDescriptionCompat = write2.RatingCompat;
                this.MediaBrowserCompat$ItemReceiver = write2.IconCompatParcelizer;
                this.RatingCompat = write2.MediaBrowserCompat$MediaItem;
                this.write = write2.MediaBrowserCompat$CustomActionResultReceiver;
                this.read = write2.MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$CustomActionResultReceiver = write2.write;
                this.IconCompatParcelizer = write2.read;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
                parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : 0);
                parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
                parcel.writeString(this.RatingCompat);
                parcel.writeString(this.write);
                parcel.writeByte(this.read ? (byte) 1 : 0);
                parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver.toString());
                parcel.writeInt(this.IconCompatParcelizer);
            }

            /* renamed from: o.CrashlyticsReport$FilesPayload$File$write */
            public static final class write {
                public boolean IconCompatParcelizer;
                public String MediaBrowserCompat$CustomActionResultReceiver;
                public boolean MediaBrowserCompat$ItemReceiver;
                public String MediaBrowserCompat$MediaItem;
                public boolean MediaDescriptionCompat;
                public boolean RatingCompat;
                public int read;
                CrashlyticsReportJsonTransform$$Lambda$4 write;

                public write(CrashlyticsReportJsonTransform$$Lambda$4 crashlyticsReportJsonTransform$$Lambda$4) {
                    this.write = crashlyticsReportJsonTransform$$Lambda$4;
                    this.read = 0;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                File file = (File) obj;
                if (this.MediaMetadataCompat != file.MediaMetadataCompat || this.MediaDescriptionCompat != file.MediaDescriptionCompat || this.MediaBrowserCompat$ItemReceiver != file.MediaBrowserCompat$ItemReceiver || this.read != file.read || this.IconCompatParcelizer != file.IconCompatParcelizer) {
                    return false;
                }
                String str = this.RatingCompat;
                if (str == null ? file.RatingCompat != null : !str.equals(file.RatingCompat)) {
                    return false;
                }
                String str2 = this.write;
                if (str2 == null ? file.write != null : !str2.equals(file.write)) {
                    return false;
                }
                if (this.MediaBrowserCompat$CustomActionResultReceiver != file.MediaBrowserCompat$CustomActionResultReceiver) {
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                boolean z = this.MediaMetadataCompat;
                boolean z2 = this.MediaDescriptionCompat;
                boolean z3 = this.MediaBrowserCompat$ItemReceiver;
                String str = this.RatingCompat;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.write;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                boolean z4 = this.read;
                CrashlyticsReportJsonTransform$$Lambda$4 crashlyticsReportJsonTransform$$Lambda$4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (crashlyticsReportJsonTransform$$Lambda$4 != null) {
                    i = crashlyticsReportJsonTransform$$Lambda$4.hashCode();
                }
                return ((((((((((((((z ? 1 : 0) * true) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + hashCode) * 31) + hashCode2) * 31) + (z4 ? 1 : 0)) * 31) + i) * 31) + this.IconCompatParcelizer;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("AccountSourceSelectDisplay{showToLabel=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", showFromLabel=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", showBottomDivider=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", toTextLabel='");
                sb.append(this.RatingCompat);
                sb.append('\'');
                sb.append(", fromTextLabel='");
                sb.append(this.write);
                sb.append('\'');
                sb.append(", isQuickTopUp=");
                sb.append(this.read);
                sb.append(", accountSourceSelectFunction=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", error=");
                sb.append(this.IconCompatParcelizer);
                sb.append('}');
                return sb.toString();
            }
        }

        static {
            CREATOR = new Parcelable.Creator<FilesPayload>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return FilesPayload.values()[parcel.readInt()];
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new FilesPayload[i];
                }
            };
        }

        private FilesPayload(int i) {
            this.tabResourceId = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("GiftsTransType{tabResourceId=");
            sb.append(this.tabResourceId);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: o.CrashlyticsReport$Type */
    public final class Type extends TypeAdapter implements addKernel {
        private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
        private Gson MediaBrowserCompat$ItemReceiver;
        private validateCycle write;

        public Type(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
            this.MediaBrowserCompat$ItemReceiver = gson;
            this.write = validatecycle;
            this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
        }

        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            Session.Event.Application.Execution.Signal.Builder builder = (Session.Event.Application.Execution.Signal.Builder) obj;
            Gson gson = this.MediaBrowserCompat$ItemReceiver;
            validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
            jsonWriter.beginObject();
            if (builder != builder.MediaBrowserCompat$ItemReceiver) {
                validatedagrecurse.read(jsonWriter, 582);
                String str = builder.MediaBrowserCompat$ItemReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
            }
            validatedagrecurse.read(jsonWriter, 518);
            Class cls = Double.TYPE;
            Double valueOf = Double.valueOf(builder.read);
            findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
            if (builder != builder.MediaBrowserCompat$CustomActionResultReceiver) {
                validatedagrecurse.read(jsonWriter, 233);
                String str2 = builder.MediaBrowserCompat$CustomActionResultReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
            }
            if (builder != builder.IconCompatParcelizer) {
                validatedagrecurse.read(jsonWriter, 474);
                Session.Event.Builder builder2 = builder.IconCompatParcelizer;
                findNode.MediaBrowserCompat$ItemReceiver(gson, Session.Event.Builder.class, (Object) builder2).write(jsonWriter, builder2);
            }
            if (builder != builder.MediaBrowserCompat$SearchResultReceiver) {
                validatedagrecurse.read(jsonWriter, 570);
                String str3 = builder.MediaBrowserCompat$SearchResultReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
            }
            if (builder != builder.MediaMetadataCompat) {
                validatedagrecurse.read(jsonWriter, 579);
                String str4 = builder.MediaMetadataCompat;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
            }
            if (builder != builder.RatingCompat) {
                validatedagrecurse.read(jsonWriter, 502);
                String str5 = builder.RatingCompat;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
            }
            if (builder != builder.MediaDescriptionCompat) {
                validatedagrecurse.read(jsonWriter, 47);
                String str6 = builder.MediaDescriptionCompat;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
            }
            if (builder != builder.MediaBrowserCompat$MediaItem) {
                validatedagrecurse.read(jsonWriter, 415);
                String str7 = builder.MediaBrowserCompat$MediaItem;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
            }
            validatedagrecurse.read(jsonWriter, 442);
            Class cls2 = Boolean.TYPE;
            Boolean valueOf2 = Boolean.valueOf(builder.write);
            findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
            jsonWriter.endObject();
        }

        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                return null;
            }
            Session.Event.Application.Execution.Signal.Builder builder = new Session.Event.Application.Execution.Signal.Builder();
            Gson gson = this.MediaBrowserCompat$ItemReceiver;
            validateCycle validatecycle = this.write;
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                int write2 = validatecycle.write(jsonReader);
                boolean z = jsonReader.peek() != JsonToken.NULL;
                if (write2 != 9) {
                    if (write2 != 83) {
                        if (write2 != 332) {
                            if (write2 != 368) {
                                if (write2 != 394) {
                                    if (write2 != 473) {
                                        if (write2 != 598) {
                                            if (write2 != 387) {
                                                if (write2 != 388) {
                                                    builder.IconCompatParcelizer(gson, jsonReader, write2);
                                                } else if (z) {
                                                    builder.MediaDescriptionCompat = gson.getAdapter(String.class).read(jsonReader);
                                                } else {
                                                    builder.MediaDescriptionCompat = null;
                                                }
                                            } else if (z) {
                                                builder.read = gson.getAdapter(Double.class).read(jsonReader).doubleValue();
                                            }
                                        } else if (z) {
                                            builder.RatingCompat = gson.getAdapter(String.class).read(jsonReader);
                                        } else {
                                            builder.RatingCompat = null;
                                        }
                                    } else if (z) {
                                        builder.MediaBrowserCompat$SearchResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                                    } else {
                                        builder.MediaBrowserCompat$SearchResultReceiver = null;
                                    }
                                } else if (z) {
                                    builder.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    builder.MediaBrowserCompat$ItemReceiver = null;
                                }
                            } else if (z) {
                                builder.MediaBrowserCompat$MediaItem = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                builder.MediaBrowserCompat$MediaItem = null;
                            }
                        } else if (z) {
                            builder.MediaMetadataCompat = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            builder.MediaMetadataCompat = null;
                        }
                    } else if (z) {
                        builder.IconCompatParcelizer = gson.getAdapter(Session.Event.Builder.class).read(jsonReader);
                    } else {
                        builder.IconCompatParcelizer = null;
                    }
                } else if (z) {
                    builder.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    builder.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return builder;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        String str = this.write;
        if (str == null ? crashlyticsReport.write != null : !str.equals(crashlyticsReport.write)) {
            return false;
        }
        List<withEvents> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list == null ? crashlyticsReport.MediaBrowserCompat$CustomActionResultReceiver != null : !list.equals(crashlyticsReport.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        withEvents withevents = this.IconCompatParcelizer;
        withEvents withevents2 = crashlyticsReport.IconCompatParcelizer;
        if (withevents != null) {
            return withevents.equals(withevents2);
        }
        if (withevents2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<withEvents> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = list != null ? list.hashCode() : 0;
        withEvents withevents = this.IconCompatParcelizer;
        if (withevents != null) {
            i = withevents.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}

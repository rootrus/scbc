package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.TypeCastException;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AutoValue_CrashlyticsReport_Session_Application;
import p040o.Iterables;
import p040o.MapConstraints;
import p040o.awaitEvenIfOnMainThread;
import p040o.race;
import p040o.standardStartAndWait;

/* renamed from: o.CountingInputStream */
public final class CountingInputStream extends MapConstraints.C36312.C36321 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public CountingInputStream(Resources resources, SharedPreferences sharedPreferences) {
        new constrainedListMultimap(resources, sharedPreferences) {
            public List<ForwardingFuture> read = new ArrayList();

            public final void MediaBrowserCompat$CustomActionResultReceiver(ForwardingFuture forwardingFuture) {
                this.read.add(forwardingFuture);
            }

            public final void read(ForwardingFuture forwardingFuture) {
                this.read.add(forwardingFuture);
                this.read.add(new callTask());
            }

            public final void IconCompatParcelizer(List<ForwardingFuture> list, boolean z) {
                for (int i = 0; i < list.size(); i++) {
                    if (i == list.size() - 1) {
                        this.read.add(list.get(i));
                    } else {
                        this.read.add(list.get(i));
                        this.read.add(new callTask(z));
                    }
                }
            }

            public final void write(ForwardingFuture forwardingFuture) {
                this.read.add(forwardingFuture);
                this.read.add(new callTask(true));
            }

            public final void IconCompatParcelizer(ForwardingFuture forwardingFuture, boolean z) {
                this.read.add(forwardingFuture);
                this.read.add(new callTask(z));
            }

            public final void MediaBrowserCompat$ItemReceiver(ForwardingFuture forwardingFuture) {
                this.read.add(new callTask(true));
                this.read.add(forwardingFuture);
            }

            public final String MediaBrowserCompat$MediaItem(String str) {
                if (str == null || str.length() == 0) {
                    return str;
                }
                return IconCompatParcelizer("dd MMM yyyy - HH:mm", OffsetDateTime.parse(CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(str)));
            }
        };
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    /* renamed from: o.CountingInputStream$write */
    public static final class write implements findFragmentByWho {
        private final /* synthetic */ getCredentialPickerConfig write;

        private write() {
        }

        public /* synthetic */ write(getCredentialPickerConfig getcredentialpickerconfig) {
            this.write = getcredentialpickerconfig;
        }

        public final Object IconCompatParcelizer(Object obj) {
            getDirName getdirname = (getDirName) obj;
            if (getdirname == null) {
                return null;
            }
            getCachedAppInstanceId$MediaBrowserCompat$ItemReceiver getcachedappinstanceid_mediabrowsercompat_itemreceiver = new getCachedAppInstanceId$MediaBrowserCompat$ItemReceiver((byte) 0);
            getcachedappinstanceid_mediabrowsercompat_itemreceiver.write = getdirname.write;
            getcachedappinstanceid_mediabrowsercompat_itemreceiver.IconCompatParcelizer = getdirname.MediaBrowserCompat$CustomActionResultReceiver;
            getcachedappinstanceid_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = getdirname.MediaBrowserCompat$ItemReceiver;
            return new getCachedAppInstanceId(getcachedappinstanceid_mediabrowsercompat_itemreceiver, (byte) 0);
        }
    }

    public final standardStartAndWait read(AutoValue_CrashlyticsReport_Session_Application.Builder builder, setOnMapLoadedCallback setonmaploadedcallback, boolean z) {
        onGetStartedClick.write((Object) builder, "review");
        onGetStartedClick.write((Object) setonmaploadedcallback, "confirm");
        onGetStartedClick.write((Object) builder, "review");
        onGetStartedClick.write((Object) setonmaploadedcallback, "confirm");
        this.read.clear();
        if (z) {
            capSessionCount$MediaBrowserCompat$CustomActionResultReceiver read = capSessionCount.read();
            read.write = Iterables$3$MediaBrowserCompat$ItemReceiver.timer;
            read.MediaBrowserCompat$ItemReceiver = Iterables.C35273.read.remittance_request_yellow;
            read.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.paynow_success_header_title);
            read.MediaDescriptionCompat = Iterables.C35273.read.remittance_request_yellow;
            read.read = MediaBrowserCompat$MediaItem(setonmaploadedcallback.MediaBrowserCompat$CustomActionResultReceiver);
            read.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ref_id, new Object[]{setonmaploadedcallback.write});
            write(new capSessionCount(read, (byte) 0));
        } else {
            capSessionCount$MediaBrowserCompat$CustomActionResultReceiver read2 = capSessionCount.read();
            read2.write = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_check_circle_black_48dp;
            read2.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remittance_transaction_success_header_title);
            read2.read = MediaBrowserCompat$MediaItem(setonmaploadedcallback.MediaBrowserCompat$CustomActionResultReceiver);
            read2.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ref_id, new Object[]{setonmaploadedcallback.write});
            write(new capSessionCount(read2, CrashlyticsReportJsonTransform$$Lambda$1.REVAMP_SUCCESS_HEADER, (byte) 0));
        }
        awaitEvenIfOnMainThread.IconCompatParcelizer IconCompatParcelizer = awaitEvenIfOnMainThread.IconCompatParcelizer();
        IconCompatParcelizer.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.from);
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer;
        iconCompatParcelizer.MediaMetadataCompat = builder.IconCompatParcelizer.IconCompatParcelizer;
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
        iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(builder.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, true);
        iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = builder.IconCompatParcelizer.read;
        iconCompatParcelizer2.read = Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_remittance;
        MediaBrowserCompat$CustomActionResultReceiver(new awaitEvenIfOnMainThread(iconCompatParcelizer2, (byte) 0));
        awaitEvenIfOnMainThread.IconCompatParcelizer IconCompatParcelizer2 = awaitEvenIfOnMainThread.IconCompatParcelizer();
        IconCompatParcelizer2.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.f2745to);
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer3 = IconCompatParcelizer2;
        iconCompatParcelizer3.MediaMetadataCompat = builder.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer4 = iconCompatParcelizer3;
        String str = builder.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        int length = str.length();
        if (str != null) {
            String substring = str.substring(0, length - 4);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            int length2 = str.length();
            int length3 = str.length();
            if (str != null) {
                String substring2 = str.substring(length2 - 4, length3);
                onGetStartedClick.IconCompatParcelizer((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String read3 = new LifestyleCustomizationActivity("[0-9+]").read(substring, "*");
                StringBuilder sb = new StringBuilder();
                sb.append(read3);
                sb.append(substring2);
                iconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver = sb.toString();
                iconCompatParcelizer4.MediaBrowserCompat$ItemReceiver = builder.MediaBrowserCompat$CustomActionResultReceiver.read;
                iconCompatParcelizer4.read = Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_remittance;
                iconCompatParcelizer4.ParcelableVolumeInfo = true;
                read(new awaitEvenIfOnMainThread(iconCompatParcelizer4, (byte) 0));
                race.write read4 = race.read();
                String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remittance_review_conversion_rate_title);
                onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.remit…ew_conversion_rate_title)");
                if (string != null) {
                    String upperCase = string.toUpperCase();
                    onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase()");
                    read4.RatingCompat = upperCase;
                    read4.MediaMetadataCompat = builder.write;
                    read4.MediaDescriptionCompat = true;
                    MediaBrowserCompat$CustomActionResultReceiver(read4.read());
                    race.write read5 = race.read();
                    String string2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remittance_review_amount_to_send);
                    onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.remit…ce_review_amount_to_send)");
                    if (string2 != null) {
                        String upperCase2 = string2.toUpperCase();
                        onGetStartedClick.IconCompatParcelizer((Object) upperCase2, "(this as java.lang.String).toUpperCase()");
                        read5.RatingCompat = upperCase2;
                        read5.MediaMetadataCompat = builder.MediaBrowserCompat$ItemReceiver;
                        read5.ParcelableVolumeInfo = true;
                        read5.MediaDescriptionCompat = true;
                        MediaBrowserCompat$CustomActionResultReceiver(read5.read());
                        race.write read6 = race.read();
                        String string3 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remittance_review_amount_recipient_gets);
                        onGetStartedClick.IconCompatParcelizer((Object) string3, "getString(R.string.remit…ew_amount_recipient_gets)");
                        if (string3 != null) {
                            String upperCase3 = string3.toUpperCase();
                            onGetStartedClick.IconCompatParcelizer((Object) upperCase3, "(this as java.lang.String).toUpperCase()");
                            read6.RatingCompat = upperCase3;
                            read6.MediaMetadataCompat = builder.read;
                            read6.ParcelableVolumeInfo = true;
                            read6.MediaDescriptionCompat = true;
                            MediaBrowserCompat$CustomActionResultReceiver(read6.read());
                            race.write read7 = race.read();
                            String string4 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.review_fees);
                            onGetStartedClick.IconCompatParcelizer((Object) string4, "getString(R.string.review_fees)");
                            if (string4 != null) {
                                String upperCase4 = string4.toUpperCase();
                                onGetStartedClick.IconCompatParcelizer((Object) upperCase4, "(this as java.lang.String).toUpperCase()");
                                read7.RatingCompat = upperCase4;
                                read7.MediaMetadataCompat = builder.MediaMetadataCompat;
                                read7.ParcelableVolumeInfo = true;
                                read(read7.read());
                                capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = capFileCount.MediaBrowserCompat$CustomActionResultReceiver();
                                MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remittance_recipient_purpose_input_title);
                                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = builder.RatingCompat;
                                MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = true;
                                capFileCount capfilecount = new capFileCount(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
                                if (builder.MediaDescriptionCompat.length() > 0) {
                                    MediaBrowserCompat$CustomActionResultReceiver(capfilecount);
                                    capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver2 = capFileCount.MediaBrowserCompat$CustomActionResultReceiver();
                                    MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remittance_review_note);
                                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = builder.MediaDescriptionCompat;
                                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$MediaItem = true;
                                    MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$Token = true;
                                    MediaBrowserCompat$CustomActionResultReceiver(new capFileCount(MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0));
                                } else {
                                    MediaBrowserCompat$CustomActionResultReceiver(capfilecount);
                                }
                                List<ForwardingFuture> list = this.read;
                                onGetStartedClick.IconCompatParcelizer((Object) list, "displays");
                                FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
                                String string5 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.paynow_success_slip_file_name);
                                onGetStartedClick.IconCompatParcelizer((Object) string5, "getString(R.string.paynow_success_slip_file_name)");
                                String format = String.format(string5, Arrays.copyOf(new Object[]{setonmaploadedcallback.MediaBrowserCompat$CustomActionResultReceiver}, 1));
                                onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
                                standardStartAndWait.IconCompatParcelizer write2 = standardStartAndWait.write(list, format);
                                write2.MediaBrowserCompat$MediaItem = Boolean.valueOf(!z).booleanValue();
                                write2.RatingCompat = true;
                                standardStartAndWait read8 = write2.read();
                                onGetStartedClick.IconCompatParcelizer((Object) read8, "SuccessfulDisplay.newBui…\n                .build()");
                                return read8;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}

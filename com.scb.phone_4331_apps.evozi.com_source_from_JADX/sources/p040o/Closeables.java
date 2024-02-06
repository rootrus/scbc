package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CrashlyticsReport;
import p040o.MapConstraints;
import p040o.awaitEvenIfOnMainThread;
import p040o.race;
import p040o.standardStartAndWait;

/* renamed from: o.Closeables */
public final class Closeables extends MapConstraints.C36312.C36321 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public Closeables(Resources resources, SharedPreferences sharedPreferences) {
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

    public final standardStartAndWait IconCompatParcelizer(setStartedAt setstartedat, zoomByWithFocus zoombywithfocus) {
        List<setOnIndoorStateChangeListener> list;
        onGetStartedClick.write((Object) setstartedat, "verificationDisplay");
        onGetStartedClick.write((Object) zoombywithfocus, "confirmation");
        this.read.clear();
        capSessionCount$MediaBrowserCompat$CustomActionResultReceiver read = capSessionCount.read();
        read.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.review_success_transfer);
        read.write = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_check_circle_black_48dp;
        read.read = IconCompatParcelizer("dd MMM yyyy - HH:mm", zoombywithfocus.MediaBrowserCompat$MediaItem);
        read.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.reference_id, new Object[]{zoombywithfocus.RatingCompat});
        write(new capSessionCount(read, CrashlyticsReportJsonTransform$$Lambda$1.REVAMP_SUCCESS_HEADER, (byte) 0));
        List arrayList = new ArrayList();
        setOnCameraMoveStartedListener setoncameramovestartedlistener = zoombywithfocus.MediaBrowserCompat$ItemReceiver;
        if (setoncameramovestartedlistener != null) {
            list = setoncameramovestartedlistener.MediaBrowserCompat$ItemReceiver;
        } else {
            list = null;
        }
        if (list == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        for (setOnIndoorStateChangeListener setonindoorstatechangelistener : list) {
            if (setonindoorstatechangelistener != null) {
                arrayList.add(new CrashlyticsReport.Session.OperatingSystem.Builder(setonindoorstatechangelistener.MediaDescriptionCompat, setonindoorstatechangelistener.IconCompatParcelizer, setonindoorstatechangelistener.write, setonindoorstatechangelistener.MediaBrowserCompat$CustomActionResultReceiver, setonindoorstatechangelistener.MediaBrowserCompat$ItemReceiver, setonindoorstatechangelistener.read));
            }
        }
        AutoValue_CrashlyticsReport_Session_Application autoValue_CrashlyticsReport_Session_Application = new AutoValue_CrashlyticsReport_Session_Application(arrayList);
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Application, "<set-?>");
        setstartedat.MediaBrowserCompat$CustomActionResultReceiver = autoValue_CrashlyticsReport_Session_Application;
        awaitEvenIfOnMainThread.IconCompatParcelizer IconCompatParcelizer = awaitEvenIfOnMainThread.IconCompatParcelizer();
        IconCompatParcelizer.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.from);
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer;
        iconCompatParcelizer.MediaMetadataCompat = setstartedat.MediaBrowserCompat$ItemReceiver;
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
        iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(setstartedat.IconCompatParcelizer, true);
        iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_scb).toString();
        MediaBrowserCompat$CustomActionResultReceiver(new awaitEvenIfOnMainThread(iconCompatParcelizer2, (byte) 0));
        awaitEvenIfOnMainThread.IconCompatParcelizer IconCompatParcelizer2 = awaitEvenIfOnMainThread.IconCompatParcelizer();
        IconCompatParcelizer2.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.f2745to);
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer3 = IconCompatParcelizer2;
        iconCompatParcelizer3.MediaMetadataCompat = setstartedat.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver;
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer4 = iconCompatParcelizer3;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Resources resources = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = Iterables$3$MediaBrowserCompat$MediaItem.biller_ac;
        Object[] objArr = new Object[1];
        String str = setstartedat.read;
        if (str.length() == 10) {
            str = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(true, false, str);
        }
        objArr[0] = str;
        sb2.append(resources.getString(i, objArr));
        sb2.append("\n");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(setstartedat.MediaMetadataCompat);
        sb3.append(" : ");
        sb3.append(setstartedat.MediaBrowserCompat$SearchResultReceiver);
        sb.append(sb3.toString());
        if (setstartedat.MediaSessionCompat$QueueItem.length() > 0) {
            if (setstartedat.MediaSessionCompat$Token.length() > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(10);
                sb4.append(setstartedat.MediaSessionCompat$Token);
                sb4.append(" : ");
                sb4.append(setstartedat.MediaSessionCompat$QueueItem);
                sb.append(sb4.toString());
            }
        }
        if (setstartedat.MediaSessionCompat$ResultReceiverWrapper.length() > 0) {
            if (setstartedat.f2959x50fd9e4a.length() > 0) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(10);
                sb5.append(setstartedat.f2959x50fd9e4a);
                sb5.append(" : ");
                sb5.append(setstartedat.MediaSessionCompat$ResultReceiverWrapper);
                sb.append(sb5.toString());
            }
        }
        String obj = sb.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "description.toString()");
        iconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver = obj;
        iconCompatParcelizer4.MediaBrowserCompat$ItemReceiver = setstartedat.RatingCompat.read;
        iconCompatParcelizer4.read = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_biller_default;
        iconCompatParcelizer4.ParcelableVolumeInfo = true;
        write(new awaitEvenIfOnMainThread(iconCompatParcelizer4, (byte) 0));
        race.write read2 = race.read();
        read2.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.amount);
        read2.MediaMetadataCompat = write(Double.valueOf(setstartedat.MediaBrowserCompat$MediaItem));
        read2.MediaDescriptionCompat = true;
        MediaBrowserCompat$CustomActionResultReceiver(read2.read());
        boolean z = setstartedat.ParcelableVolumeInfo <= 0.0d;
        race.write read3 = race.read();
        read3.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.nsip_fee);
        read3.MediaMetadataCompat = write(Double.valueOf(setstartedat.ParcelableVolumeInfo));
        read3.ParcelableVolumeInfo = true;
        if (z) {
            read3.MediaSessionCompat$Token = true;
        }
        race read4 = read3.read();
        CharSequence charSequence = setstartedat.MediaDescriptionCompat;
        if (!(charSequence == null || charSequence.length() == 0)) {
            write(read4);
            if (!setstartedat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = capFileCount.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.note);
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = setstartedat.MediaDescriptionCompat;
                MediaBrowserCompat$CustomActionResultReceiver(new capFileCount(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0));
                C3769x8df5a479 write = SessionReportingCoordinator$$Lambda$1.write();
                write.MediaBrowserCompat$ItemReceiver = setstartedat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                MediaBrowserCompat$CustomActionResultReceiver(new SessionReportingCoordinator$$Lambda$1((C3769x8df5a479<?>) write));
            } else {
                capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver2 = capFileCount.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.note);
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = setstartedat.MediaDescriptionCompat;
                MediaBrowserCompat$CustomActionResultReceiver(new capFileCount(MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0));
            }
        } else if (!setstartedat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            write(read4);
            C3769x8df5a479 write2 = SessionReportingCoordinator$$Lambda$1.write();
            write2.MediaBrowserCompat$ItemReceiver = setstartedat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            MediaBrowserCompat$CustomActionResultReceiver(new SessionReportingCoordinator$$Lambda$1((C3769x8df5a479<?>) write2));
        } else {
            MediaBrowserCompat$CustomActionResultReceiver(read4);
        }
        List<ForwardingFuture> list2 = this.read;
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Nsip_");
        sb6.append(zoombywithfocus.RatingCompat);
        standardStartAndWait.IconCompatParcelizer write3 = standardStartAndWait.write(list2, sb6.toString());
        write3.RatingCompat = true;
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remaining_balance);
        onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.string.remaining_balance)");
        String format = String.format(string, Arrays.copyOf(new Object[]{this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.nsip_transaction), write(Double.valueOf(zoombywithfocus.write))}, 2));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
        write3.MediaDescriptionCompat = format;
        standardStartAndWait read5 = write3.read();
        onGetStartedClick.IconCompatParcelizer((Object) read5, "SuccessfulDisplay.newBui…\n                .build()");
        return read5;
    }
}

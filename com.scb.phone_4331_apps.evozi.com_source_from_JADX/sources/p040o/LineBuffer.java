package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CountingInputStream;
import p040o.ForwardingService;
import p040o.MapConstraints;
import p040o.awaitEvenIfOnMainThread;
import p040o.race;

/* renamed from: o.LineBuffer */
public final class LineBuffer extends MapConstraints.C36312.C36321 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public LineBuffer(Resources resources, SharedPreferences sharedPreferences) {
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

    /* renamed from: o.LineBuffer$write */
    public static final class write implements findFragmentByWho {
        private final /* synthetic */ getCredentialPickerConfig read;

        private write() {
        }

        public /* synthetic */ write(getCredentialPickerConfig getcredentialpickerconfig) {
            this.read = getcredentialpickerconfig;
        }

        public final Object IconCompatParcelizer(Object obj) {
            getCredentialPickerConfig getcredentialpickerconfig = this.read;
            LottieProperty lottieProperty = (LottieProperty) obj;
            if (!((lottieProperty == null || lottieProperty.PlaybackStateCompat$CustomAction == null || lottieProperty.MediaBrowserCompat$MediaItem == null || lottieProperty.MediaDescriptionCompat == null || lottieProperty.read == null || lottieProperty.Keep == null || lottieProperty.MediaSessionCompat$Token == null || lottieProperty.MediaSessionCompat$ResultReceiverWrapper == null || lottieProperty.AppCompatDelegateImpl$ListMenuDecorView == null || lottieProperty.RatingCompat == null || lottieProperty.MediaBrowserCompat$CustomActionResultReceiver == null || lottieProperty.setChecked == null || lottieProperty.AppCompatDialogFragment == null || lottieProperty.setBackgroundResource == null || lottieProperty.MediaBrowserCompat$SearchResultReceiver == null) ? false : true)) {
                return null;
            }
            logEventAndBundle$MediaBrowserCompat$ItemReceiver logeventandbundle_mediabrowsercompat_itemreceiver = new logEventAndBundle$MediaBrowserCompat$ItemReceiver((byte) 0);
            logeventandbundle_mediabrowsercompat_itemreceiver.AppCompatActivity = lottieProperty.AppCompatActivity;
            logeventandbundle_mediabrowsercompat_itemreceiver.setBackgroundResource = lottieProperty.setContentView;
            logeventandbundle_mediabrowsercompat_itemreceiver.PlaybackStateCompat$CustomAction = lottieProperty.read;
            logeventandbundle_mediabrowsercompat_itemreceiver.setContentView = lottieProperty.AppCompatDelegateImpl$ListMenuDecorView;
            logeventandbundle_mediabrowsercompat_itemreceiver.AppCompatViewInflater = lottieProperty.setChecked;
            logeventandbundle_mediabrowsercompat_itemreceiver.AppCompatDialogFragment = lottieProperty.AppCompatDialogFragment;
            logeventandbundle_mediabrowsercompat_itemreceiver.AppCompatDelegateImpl$ListMenuDecorView = lottieProperty.setBackgroundResource;
            logeventandbundle_mediabrowsercompat_itemreceiver.AlertController$RecycleListView = getCredentialPickerConfig.write(lottieProperty.MediaBrowserCompat$ItemReceiver, new CountingInputStream.write(getcredentialpickerconfig));
            logeventandbundle_mediabrowsercompat_itemreceiver.write = lottieProperty.MediaBrowserCompat$MediaItem;
            logeventandbundle_mediabrowsercompat_itemreceiver.read = lottieProperty.MediaDescriptionCompat;
            logeventandbundle_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = lottieProperty.MediaBrowserCompat$CustomActionResultReceiver;
            logeventandbundle_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver = lottieProperty.MediaBrowserCompat$SearchResultReceiver;
            logeventandbundle_mediabrowsercompat_itemreceiver.PlaybackStateCompat = lottieProperty.PlaybackStateCompat$CustomAction;
            logeventandbundle_mediabrowsercompat_itemreceiver.setHasDecor = lottieProperty.Keep;
            logeventandbundle_mediabrowsercompat_itemreceiver.MediaSessionCompat$QueueItem = lottieProperty.MediaSessionCompat$Token;
            logeventandbundle_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem = lottieProperty.MediaSessionCompat$ResultReceiverWrapper;
            logeventandbundle_mediabrowsercompat_itemreceiver.MediaMetadataCompat = lottieProperty.RatingCompat;
            return (logEventAndBundle) logeventandbundle_mediabrowsercompat_itemreceiver.IconCompatParcelizer();
        }
    }

    public final ForwardingService MediaBrowserCompat$CustomActionResultReceiver(getTimestamp gettimestamp, getLog getlog, boolean z, boolean z2) {
        onGetStartedClick.write((Object) gettimestamp, "prepaidRequestVerificationDisplay");
        onGetStartedClick.write((Object) getlog, "prepaidRequestLandingDisplay");
        ForwardingService.read write2 = ForwardingService.write();
        this.read.clear();
        race.write MediaBrowserCompat$ItemReceiver = race.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_review_request_type);
        MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = gettimestamp.MediaDescriptionCompat;
        read(MediaBrowserCompat$ItemReceiver.read());
        awaitEvenIfOnMainThread.IconCompatParcelizer IconCompatParcelizer = awaitEvenIfOnMainThread.IconCompatParcelizer();
        IconCompatParcelizer.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_review_account);
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer;
        iconCompatParcelizer.MediaMetadataCompat = gettimestamp.read;
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
        iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(gettimestamp.write, z);
        iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_scb).toString();
        read(new awaitEvenIfOnMainThread(iconCompatParcelizer2, (byte) 0));
        race.write MediaBrowserCompat$ItemReceiver2 = race.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver2.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_review_display_name);
        MediaBrowserCompat$ItemReceiver2.MediaMetadataCompat = gettimestamp.MediaBrowserCompat$CustomActionResultReceiver;
        read(MediaBrowserCompat$ItemReceiver2.read());
        race.write MediaBrowserCompat$ItemReceiver3 = race.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver3.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_review_prepaid_card_type);
        MediaBrowserCompat$ItemReceiver3.MediaMetadataCompat = gettimestamp.MediaBrowserCompat$MediaItem;
        read(MediaBrowserCompat$ItemReceiver3.read());
        race.write MediaBrowserCompat$ItemReceiver4 = race.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver4.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_review_annual_fee);
        MediaBrowserCompat$ItemReceiver4.MediaMetadataCompat = write(Double.valueOf(gettimestamp.IconCompatParcelizer));
        read(MediaBrowserCompat$ItemReceiver4.read());
        race.write MediaBrowserCompat$ItemReceiver5 = race.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver5.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_review_issuing_fee);
        MediaBrowserCompat$ItemReceiver5.MediaMetadataCompat = write(Double.valueOf(gettimestamp.RatingCompat));
        read(MediaBrowserCompat$ItemReceiver5.read());
        race.write MediaBrowserCompat$ItemReceiver6 = race.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver6.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_review_delivery_fee);
        MediaBrowserCompat$ItemReceiver6.MediaMetadataCompat = write(Double.valueOf(gettimestamp.MediaBrowserCompat$ItemReceiver));
        read(MediaBrowserCompat$ItemReceiver6.read());
        List<String> list = gettimestamp.MediaBrowserCompat$SearchResultReceiver;
        if (!list.isEmpty()) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
            capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = capFileCount.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_review_mailing_address);
            MediaBrowserCompat$CustomActionResultReceiver.read = AlertController$RecycleListView.write((List<String>) (List) arrayList, "\n");
            read(new capFileCount(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getlog.write);
        if (z2) {
            arrayList2.add(gettimestamp.MediaMetadataCompat);
        }
        ArrayList arrayList3 = new ArrayList();
        capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver2 = capFileCount.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_review_remark);
        MediaBrowserCompat$CustomActionResultReceiver2.read = getICheckDeserializerRtti.read((int) TypedValue.applyDimension(1, 16.0f, this.MediaBrowserCompat$CustomActionResultReceiver.getDisplayMetrics()), (List<String>) arrayList2);
        arrayList3.add(new capFileCount(MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0));
        IconCompatParcelizer((List<ForwardingFuture>) arrayList3, false);
        List<ForwardingFuture> list2 = this.read;
        onGetStartedClick.IconCompatParcelizer((Object) list2, "displays");
        write2.read = list2;
        write2.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_review_bottom_text);
        ForwardingService forwardingService = new ForwardingService(write2, (byte) 0);
        onGetStartedClick.IconCompatParcelizer((Object) forwardingService, "PurchaseReviewDisplay.cr…\n                .build()");
        return forwardingService;
    }
}

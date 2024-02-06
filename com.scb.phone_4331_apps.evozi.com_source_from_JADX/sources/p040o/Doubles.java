package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.ForwardingService;
import p040o.MapConstraints;
import p040o.SignedBytes;
import p040o.StreetViewPanorama;
import p040o.awaitEvenIfOnMainThread;
import p040o.race;

/* renamed from: o.Doubles */
public final class Doubles extends constrainedListMultimap {
    public final toCharArray read;

    @HmlPinActivity
    public Doubles(Resources resources, SharedPreferences sharedPreferences, toCharArray tochararray) {
        super(resources, sharedPreferences);
        this.read = tochararray;
    }

    /* renamed from: o.Doubles$DoubleArrayAsList */
    public final class DoubleArrayAsList extends MapConstraints.C36312.C36321 {
        private final SignedBytes.LexicographicalComparator IconCompatParcelizer;

        @HmlPinActivity
        public DoubleArrayAsList(Resources resources, SharedPreferences sharedPreferences, SignedBytes.LexicographicalComparator lexicographicalComparator) {
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
            this.IconCompatParcelizer = lexicographicalComparator;
        }

        public final ForwardingService write(InvestmentViewPagerAdapter$ViewHolder_ViewBinding investmentViewPagerAdapter$ViewHolder_ViewBinding, TouchPointInstructionActivity touchPointInstructionActivity, setPattern setpattern, String str, userNavigationEnabled usernavigationenabled, StreetViewPanoramaOptions streetViewPanoramaOptions, boolean z, boolean z2) {
            String str2;
            String str3;
            String str4;
            InvestmentViewPagerAdapter$ViewHolder_ViewBinding investmentViewPagerAdapter$ViewHolder_ViewBinding2 = investmentViewPagerAdapter$ViewHolder_ViewBinding;
            setPattern setpattern2 = setpattern;
            String str5 = str;
            userNavigationEnabled usernavigationenabled2 = usernavigationenabled;
            StreetViewPanoramaOptions streetViewPanoramaOptions2 = streetViewPanoramaOptions;
            boolean z3 = z2;
            this.read = new ArrayList();
            ForwardingService.read write = ForwardingService.write();
            awaitEvenIfOnMainThread.IconCompatParcelizer IconCompatParcelizer2 = awaitEvenIfOnMainThread.IconCompatParcelizer();
            IconCompatParcelizer2.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.from);
            awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer2;
            iconCompatParcelizer.MediaMetadataCompat = MediaBrowserCompat$CustomActionResultReceiver(touchPointInstructionActivity);
            awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
            iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(investmentViewPagerAdapter$ViewHolder_ViewBinding2.write, z);
            iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_scb).toString();
            awaitEvenIfOnMainThread.IconCompatParcelizer IconCompatParcelizer3 = awaitEvenIfOnMainThread.IconCompatParcelizer();
            IconCompatParcelizer3.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.f2745to);
            awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer3 = IconCompatParcelizer3;
            if (str5.equals("th")) {
                str2 = streetViewPanoramaOptions2.MediaMetadataCompat;
            } else {
                str2 = streetViewPanoramaOptions2.MediaBrowserCompat$MediaItem;
            }
            iconCompatParcelizer3.MediaMetadataCompat = str2;
            awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer4 = iconCompatParcelizer3;
            String str6 = streetViewPanoramaOptions2.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.biller_id, new Object[]{str6}));
            sb.append("\n");
            if (str5.equals("th")) {
                str3 = streetViewPanoramaOptions2.setBackgroundResource;
            } else {
                str3 = streetViewPanoramaOptions2.AppCompatDelegateImpl$ListMenuDecorView;
            }
            sb.append(MediaBrowserCompat$CustomActionResultReceiver(str3, setpattern2.MediaMetadataCompat));
            sb.append("\n");
            if (str5.equals("th")) {
                str4 = streetViewPanoramaOptions2.setChecked;
            } else {
                str4 = streetViewPanoramaOptions2.AppCompatDialogFragment;
            }
            sb.append(MediaBrowserCompat$CustomActionResultReceiver(str4, setpattern2.RatingCompat));
            iconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver = sb.toString();
            iconCompatParcelizer4.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.mo26549c_(streetViewPanoramaOptions2.read);
            if (z3) {
                iconCompatParcelizer2.IconCompatParcelizer = true;
                iconCompatParcelizer4.IconCompatParcelizer = true;
                iconCompatParcelizer4.ParcelableVolumeInfo = true;
                MediaBrowserCompat$CustomActionResultReceiver(new awaitEvenIfOnMainThread(iconCompatParcelizer2, (byte) 0));
                write(new awaitEvenIfOnMainThread(iconCompatParcelizer4, (byte) 0));
                race.write read = race.read();
                read.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.amount);
                read.MediaMetadataCompat = write(Double.valueOf(Double.parseDouble(setpattern2.MediaBrowserCompat$CustomActionResultReceiver)));
                race.write read2 = race.read();
                read2.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.deals_buy_deal_fee);
                read2.MediaMetadataCompat = usernavigationenabled2.PlaybackStateCompat;
                read.MediaDescriptionCompat = true;
                MediaBrowserCompat$CustomActionResultReceiver(read.read());
                read2.ParcelableVolumeInfo = true;
                if (removeIfFromRandomAccessList.IconCompatParcelizer(usernavigationenabled2.PlaybackStateCompat) <= 0.0d) {
                    read2.MediaSessionCompat$Token = true;
                }
                write(read2.read());
            } else {
                read(new awaitEvenIfOnMainThread(iconCompatParcelizer2, (byte) 0));
                read(new awaitEvenIfOnMainThread(iconCompatParcelizer4, (byte) 0));
                race.write MediaBrowserCompat$ItemReceiver = race.MediaBrowserCompat$ItemReceiver();
                MediaBrowserCompat$ItemReceiver.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.amount);
                MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = write(Double.valueOf(Double.parseDouble(setpattern2.MediaBrowserCompat$CustomActionResultReceiver)));
                race.write MediaBrowserCompat$ItemReceiver2 = race.MediaBrowserCompat$ItemReceiver();
                MediaBrowserCompat$ItemReceiver2.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.deals_buy_deal_fee);
                MediaBrowserCompat$ItemReceiver2.MediaMetadataCompat = usernavigationenabled2.PlaybackStateCompat;
                read(MediaBrowserCompat$ItemReceiver.read());
                read(MediaBrowserCompat$ItemReceiver2.read());
            }
            if (setpattern2.MediaBrowserCompat$SearchResultReceiver == null || setpattern2.MediaBrowserCompat$SearchResultReceiver.isEmpty()) {
                capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = capFileCount.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.deals_buy_deal_item_details);
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = setpattern2.read;
                MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = setpattern2.IconCompatParcelizer;
                if (z3) {
                    MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = true;
                }
                if (!TextUtils.isEmpty(investmentViewPagerAdapter$ViewHolder_ViewBinding2.read)) {
                    IconCompatParcelizer((ForwardingFuture) new capFileCount(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0), z3);
                } else {
                    MediaBrowserCompat$CustomActionResultReceiver(new capFileCount(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0));
                }
            } else {
                UserMetadata$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer4 = UserMetadata.IconCompatParcelizer();
                IconCompatParcelizer4.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.deals_buy_deal_item_details);
                UserMetadata$MediaBrowserCompat$CustomActionResultReceiver userMetadata$MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
                userMetadata$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = setpattern2.read;
                UserMetadata$MediaBrowserCompat$CustomActionResultReceiver userMetadata$MediaBrowserCompat$CustomActionResultReceiver2 = userMetadata$MediaBrowserCompat$CustomActionResultReceiver;
                userMetadata$MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = setpattern2.IconCompatParcelizer;
                userMetadata$MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.mo26549c_(setpattern2.MediaBrowserCompat$SearchResultReceiver);
                IconCompatParcelizer((ForwardingFuture) new UserMetadata(userMetadata$MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0), z3);
            }
            ArrayList arrayList = new ArrayList();
            if (usernavigationenabled2.f2972x50fd9e4a != null && !usernavigationenabled2.f2972x50fd9e4a.isEmpty()) {
                String str7 = usernavigationenabled2.f2972x50fd9e4a.get(0);
                if (!str7.isEmpty()) {
                    awaitEvenIfOnMainThread.IconCompatParcelizer IconCompatParcelizer5 = awaitEvenIfOnMainThread.IconCompatParcelizer();
                    IconCompatParcelizer5.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.deals_buy_deal_ship_to);
                    awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer5 = IconCompatParcelizer5;
                    iconCompatParcelizer5.MediaMetadataCompat = str7;
                    awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer6 = iconCompatParcelizer5;
                    iconCompatParcelizer6.MediaBrowserCompat$CustomActionResultReceiver = TextUtils.join("\n", usernavigationenabled2.f2972x50fd9e4a.subList(1, usernavigationenabled2.f2972x50fd9e4a.size()));
                    arrayList.add(new awaitEvenIfOnMainThread(iconCompatParcelizer6, (byte) 0));
                }
            }
            if (!TextUtils.isEmpty(setpattern2.ParcelableVolumeInfo.read)) {
                race.write MediaBrowserCompat$ItemReceiver3 = race.MediaBrowserCompat$ItemReceiver();
                MediaBrowserCompat$ItemReceiver3.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.deals_buy_deal_email);
                MediaBrowserCompat$ItemReceiver3.MediaMetadataCompat = setpattern2.ParcelableVolumeInfo.read;
                arrayList.add(MediaBrowserCompat$ItemReceiver3.read());
            }
            if (!TextUtils.isEmpty(investmentViewPagerAdapter$ViewHolder_ViewBinding2.read)) {
                capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver2 = capFileCount.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.note);
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = investmentViewPagerAdapter$ViewHolder_ViewBinding2.read;
                MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$Token = true;
                arrayList.add(new capFileCount(MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0));
            }
            IconCompatParcelizer((List<ForwardingFuture>) arrayList, z3);
            write.read = this.read;
            return new ForwardingService(write, (byte) 0);
        }

        private static String MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            return sb.toString();
        }
    }

    /* renamed from: o.Doubles$LexicographicalComparator */
    public final /* synthetic */ class LexicographicalComparator implements findFragmentByWho {
        private final /* synthetic */ toIntArray write;

        public /* synthetic */ LexicographicalComparator(toIntArray tointarray) {
            this.write = tointarray;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return this.write.MediaBrowserCompat$ItemReceiver((StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) obj);
        }
    }
}

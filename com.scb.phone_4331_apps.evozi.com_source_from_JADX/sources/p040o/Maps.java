package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.TypeCastException;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AnalyticsConnector;
import p040o.FirebaseApp;
import p040o.setTvRemark;
import p040o.setupDialog;
import p040o.zzqj;
import p040o.zzqp;
import p040o.zztx;

/* renamed from: o.Maps */
public final /* synthetic */ class Maps implements getAllowReturnTransitionOverlap {
    public static final /* synthetic */ Maps MediaBrowserCompat$ItemReceiver = new Maps();

    /* renamed from: o.Maps$EntrySetImpl */
    public final class EntrySetImpl {
    }

    private /* synthetic */ Maps() {
    }

    public final boolean write(Object obj) {
        return ((ThreadFactoryBuilder) obj) != null;
    }

    /* renamed from: o.Maps$MapDifferenceImpl */
    public final class MapDifferenceImpl {
        public Resources read;

        public MapDifferenceImpl(Resources resources) {
            this.read = resources;
        }
    }

    /* renamed from: o.Maps$UnmodifiableEntries */
    public final class UnmodifiableEntries extends constrainedSetMultimap<zzqp.zza, getProvidedInterfaces> {
        public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
            zzqp.zza zza = (zzqp.zza) obj;
            onGetStartedClick.write((Object) zza, "model");
            String str = zza.MediaBrowserCompat$CustomActionResultReceiver;
            if (str == null) {
                str = "";
            }
            return new getProvidedInterfaces(str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public UnmodifiableEntries(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        }
    }

    /* renamed from: o.Maps$AbstractFilteredMap */
    public final class AbstractFilteredMap extends constrainedListMultimap {

        /* renamed from: o.Maps$AbstractFilteredMap$Values */
        public final class Values extends constrainedSetMultimap<setTvRemark.IconCompatParcelizer, normalize> {
            public final /* bridge */ /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
                return MediaBrowserCompat$ItemReceiver((setTvRemark.IconCompatParcelizer) obj);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            @HmlPinActivity
            public Values(Resources resources, SharedPreferences sharedPreferences) {
                super(resources, sharedPreferences);
                onGetStartedClick.write((Object) resources, "resource");
                onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
            }

            private static normalize MediaBrowserCompat$ItemReceiver(setTvRemark.IconCompatParcelizer iconCompatParcelizer) {
                FirebaseApp.UiExecutor uiExecutor;
                String str;
                onGetStartedClick.write((Object) iconCompatParcelizer, "data");
                normalize normalize = new normalize((byte) 0);
                SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
                String str2 = "";
                if (sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver == null) {
                    uiExecutor = new FirebaseApp.UiExecutor(str2, str2);
                } else {
                    uiExecutor = new FirebaseApp.UiExecutor(sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver.read, sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
                }
                normalize.ParcelableVolumeInfo = uiExecutor;
                normalize.f2902x50fd9e4a = write(Double.valueOf(iconCompatParcelizer.MediaMetadataCompat));
                normalize.MediaDescriptionCompat = Double.valueOf(iconCompatParcelizer.MediaMetadataCompat);
                normalize.setHasDecor = write(Double.valueOf(iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper));
                normalize.Keep = Double.valueOf(iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper);
                normalize.MediaSessionCompat$Token = write(Double.valueOf(iconCompatParcelizer.MediaSessionCompat$Token));
                normalize.PlaybackStateCompat$CustomAction = write(Double.valueOf(iconCompatParcelizer.ParcelableVolumeInfo));
                if (iconCompatParcelizer.MediaDescriptionCompat != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(iconCompatParcelizer.MediaDescriptionCompat);
                    sb.append("%");
                    str = sb.toString();
                } else {
                    str = str2;
                }
                normalize.RatingCompat = str;
                normalize.MediaBrowserCompat$MediaItem = iconCompatParcelizer.MediaDescriptionCompat;
                if (iconCompatParcelizer.MediaSessionCompat$QueueItem != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iconCompatParcelizer.MediaSessionCompat$QueueItem);
                    sb2.append("%");
                    str2 = sb2.toString();
                }
                normalize.setBackgroundResource = str2;
                normalize.setContentView = iconCompatParcelizer.MediaSessionCompat$QueueItem;
                normalize.MediaSessionCompat$ResultReceiverWrapper = iconCompatParcelizer.RatingCompat;
                normalize.MediaSessionCompat$QueueItem = ModifyQuickTopUpReviewActivity.IconCompatParcelizer(iconCompatParcelizer.RatingCompat, "0");
                Double valueOf = Double.valueOf(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                currencyInstance.setMinimumFractionDigits(2);
                currencyInstance.setMaximumFractionDigits(2);
                normalize.write = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(valueOf);
                StringBuilder sb3 = new StringBuilder();
                Double valueOf2 = Double.valueOf(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
                NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                currencyInstance2.setMinimumFractionDigits(2);
                currencyInstance2.setMaximumFractionDigits(2);
                sb3.append(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance2).format(valueOf2));
                sb3.append("%");
                normalize.IconCompatParcelizer = sb3.toString();
                normalize.MediaBrowserCompat$ItemReceiver = Double.valueOf(iconCompatParcelizer.read);
                normalize.read = write(Double.valueOf(iconCompatParcelizer.read));
                Double valueOf3 = Double.valueOf(iconCompatParcelizer.IconCompatParcelizer);
                NumberFormat currencyInstance3 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                currencyInstance3.setMinimumFractionDigits(2);
                currencyInstance3.setMaximumFractionDigits(2);
                normalize.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance3).format(valueOf3);
                StringBuilder sb4 = new StringBuilder();
                Double valueOf4 = Double.valueOf(iconCompatParcelizer.IconCompatParcelizer);
                NumberFormat currencyInstance4 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                currencyInstance4.setMinimumFractionDigits(2);
                currencyInstance4.setMaximumFractionDigits(2);
                sb4.append(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance4).format(valueOf4));
                sb4.append("%");
                normalize.MediaBrowserCompat$SearchResultReceiver = sb4.toString();
                Double valueOf5 = Double.valueOf(iconCompatParcelizer.f3176x50fd9e4a);
                NumberFormat currencyInstance5 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                currencyInstance5.setMinimumFractionDigits(2);
                currencyInstance5.setMaximumFractionDigits(2);
                normalize.AlertController$RecycleListView = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance5).format(valueOf5);
                StringBuilder sb5 = new StringBuilder();
                Double valueOf6 = Double.valueOf(iconCompatParcelizer.f3176x50fd9e4a);
                NumberFormat currencyInstance6 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                currencyInstance6.setMinimumFractionDigits(2);
                currencyInstance6.setMaximumFractionDigits(2);
                sb5.append(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance6).format(valueOf6));
                sb5.append("%");
                normalize.AppCompatDelegateImpl$ListMenuDecorView = sb5.toString();
                normalize.MediaMetadataCompat = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
                return normalize;
            }

            public final List<normalize> MediaBrowserCompat$ItemReceiver(List<? extends setTvRemark.IconCompatParcelizer> list) {
                if (list == null) {
                    return new ArrayList<>();
                }
                Iterable<setTvRemark.IconCompatParcelizer> iterable = list;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (setTvRemark.IconCompatParcelizer MediaBrowserCompat$ItemReceiver : iterable) {
                    arrayList.add(MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver));
                }
                return (List) arrayList;
            }

            /* renamed from: o.Maps$AbstractFilteredMap$Values$IconCompatParcelizer */
            public static final class IconCompatParcelizer implements findFragmentByWho {
                private final /* synthetic */ getAccountName MediaBrowserCompat$CustomActionResultReceiver;

                private IconCompatParcelizer() {
                }

                public /* synthetic */ IconCompatParcelizer(getAccountName getaccountname) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = getaccountname;
                }

                public final Object IconCompatParcelizer(Object obj) {
                    getSpeed getspeed = (getSpeed) obj;
                    onLocationChanged onlocationchanged = new onLocationChanged();
                    onlocationchanged.MediaBrowserCompat$CustomActionResultReceiver = getspeed.read;
                    onlocationchanged.write = FragmentBuilder_BindSummaryFragment.write(getspeed.IconCompatParcelizer, (OffsetDateTime) null);
                    return onlocationchanged;
                }
            }
        }

        @HmlPinActivity
        public AbstractFilteredMap(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }
    }

    /* renamed from: o.Maps$EntryTransformer */
    public final class EntryTransformer extends constrainedListMultimap {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public EntryTransformer(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        }

        public static AnalyticsConnector.AnalyticsConnectorHandle MediaBrowserCompat$ItemReceiver(interceptEvent interceptevent) {
            List<AnalyticsConnector.AnalyticsConnectorListener> list;
            onGetStartedClick.write((Object) interceptevent, "model");
            AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandle = new AnalyticsConnector.AnalyticsConnectorHandle((byte) 0);
            analyticsConnectorHandle.read = interceptevent.MediaBrowserCompat$ItemReceiver;
            analyticsConnectorHandle.write = interceptevent.MediaBrowserCompat$CustomActionResultReceiver;
            List<onEvent> list2 = interceptevent.read;
            if (list2 != null) {
                Iterable<onEvent> iterable = list2;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (onEvent onevent : iterable) {
                    String str = interceptevent.MediaBrowserCompat$CustomActionResultReceiver;
                    onGetStartedClick.write((Object) onevent, "model");
                    AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener = new AnalyticsConnector.AnalyticsConnectorListener((byte) 0);
                    analyticsConnectorListener.IconCompatParcelizer = onevent.MediaBrowserCompat$ItemReceiver;
                    analyticsConnectorListener.read = onevent.write;
                    analyticsConnectorListener.MediaBrowserCompat$CustomActionResultReceiver = str;
                    analyticsConnectorListener.write = onevent.read;
                    arrayList.add(analyticsConnectorListener);
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            analyticsConnectorHandle.IconCompatParcelizer = list;
            return analyticsConnectorHandle;
        }
    }

    /* renamed from: o.Maps$UnmodifiableBiMap */
    public final class UnmodifiableBiMap extends constrainedSetMultimap<zzqj.zzd, isValue> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public UnmodifiableBiMap(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        }

        private final String MediaMetadataCompat(String str) {
            CharSequence charSequence = str;
            boolean z = false;
            if (charSequence.length() == 0) {
                return "";
            }
            if (charSequence.length() == 0) {
                z = true;
            }
            if (z) {
                return "";
            }
            String IconCompatParcelizer = IconCompatParcelizer("dd MMM yyyy", CheckCaptureActivity.write("yyyy-MM-dd'T'HH:mm:ss", str));
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "transformToDateMonthStri…ECOND_DATE_FORMAT, date))");
            return IconCompatParcelizer;
        }

        private final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
            String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.e_coupon_minutes_after_redemption, new Object[]{String.valueOf(i)});
            onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…on, timeLimit.toString())");
            return string;
        }

        /* renamed from: IconCompatParcelizer */
        public final isValue MediaBrowserCompat$ItemReceiver(zzqj.zzd zzd) {
            int i;
            zzqj.zzd zzd2 = zzd;
            onGetStartedClick.write((Object) zzd2, "model");
            String str = zzd2.MediaDescriptionCompat;
            String str2 = "";
            String str3 = str == null ? str2 : str;
            String str4 = zzd2.MediaBrowserCompat$CustomActionResultReceiver;
            String str5 = str4 == null ? str2 : str4;
            String str6 = zzd2.MediaBrowserCompat$MediaItem;
            String str7 = str6 == null ? str2 : str6;
            String str8 = zzd2.MediaBrowserCompat$ItemReceiver;
            String str9 = str8 == null ? str2 : str8;
            String str10 = zzd2.MediaBrowserCompat$ItemReceiver;
            if (str10 == null) {
                str10 = str2;
            }
            String MediaMetadataCompat = MediaMetadataCompat(str10);
            String str11 = zzd2.MediaBrowserCompat$SearchResultReceiver;
            if (str11 == null) {
                str11 = str2;
            }
            String MediaMetadataCompat2 = MediaMetadataCompat(str11);
            Integer num = zzd2.read;
            int i2 = 0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            String str12 = zzd2.MediaMetadataCompat;
            String str13 = str12 == null ? str2 : str12;
            String str14 = zzd2.write;
            String str15 = str14 == null ? str2 : str14;
            String str16 = zzd2.RatingCompat;
            if (str16 == null) {
                str16 = str2;
            }
            String MediaMetadataCompat3 = MediaMetadataCompat(str16);
            String str17 = zzd2.IconCompatParcelizer;
            if (str17 != null) {
                str2 = str17;
            }
            if (str2 != null) {
                String upperCase = str2.toUpperCase();
                onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase()");
                boolean z = zzd2.read != null;
                Integer num2 = zzd2.read;
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                return new isValue(str3, str5, str7, str9, MediaMetadataCompat, MediaMetadataCompat2, i, str13, str15, MediaMetadataCompat3, upperCase, z, MediaBrowserCompat$CustomActionResultReceiver(i2));
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: o.Maps$FilteredEntryMap */
    public final /* synthetic */ class FilteredEntryMap implements findFragmentByWho {
        private final /* synthetic */ ImprovedAbstractMap write;

        public /* synthetic */ FilteredEntryMap(ImprovedAbstractMap improvedAbstractMap) {
            this.write = improvedAbstractMap;
        }

        /* renamed from: o.Maps$FilteredEntryMap$KeySet */
        public final class KeySet extends constrainedListMultimap {
            @HmlPinActivity
            public KeySet(Resources resources, SharedPreferences sharedPreferences) {
                super(resources, sharedPreferences);
            }

            public static C4416factory MediaBrowserCompat$ItemReceiver(zztx.zzc zzc) {
                String str;
                C4416factory factory = new C4416factory();
                factory.MediaMetadataCompat = zzc.MediaBrowserCompat$MediaItem;
                factory.MediaBrowserCompat$SearchResultReceiver = zzc.MediaMetadataCompat;
                factory.write = zzc.IconCompatParcelizer;
                String str2 = zzc.MediaBrowserCompat$ItemReceiver;
                if (str2 == null || str2.length() == 0) {
                    str = zzc.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    str = zzc.MediaBrowserCompat$ItemReceiver;
                }
                factory.IconCompatParcelizer = str;
                factory.MediaBrowserCompat$CustomActionResultReceiver = zzc.read;
                factory.RatingCompat = zzc.MediaBrowserCompat$CustomActionResultReceiver;
                try {
                    factory.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer(Double.valueOf(Double.parseDouble(zzc.MediaBrowserCompat$SearchResultReceiver.replaceAll("\\.0*$", ""))));
                } catch (NumberFormatException e) {
                    onCheckBoxClick.IconCompatParcelizer(e);
                    factory.MediaBrowserCompat$ItemReceiver = zzc.MediaBrowserCompat$SearchResultReceiver;
                }
                factory.read = zzc.write;
                factory.MediaBrowserCompat$MediaItem = true;
                return factory;
            }
        }

        /* renamed from: o.Maps$FilteredEntryMap$EntrySet */
        public final class EntrySet extends constrainedListMultimap {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            @HmlPinActivity
            public EntrySet(Resources resources, SharedPreferences sharedPreferences) {
                super(resources, sharedPreferences);
                onGetStartedClick.write((Object) resources, "resources");
                onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
            }

            public final String write(String str, List<? extends chain> list) {
                for (chain chain : list) {
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) chain.MediaDescriptionCompat, (Object) str)) {
                        return MediaBrowserCompat$ItemReceiver(chain);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }

            public final String MediaBrowserCompat$MediaItem(String str) {
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.EMAIL.name())) {
                    return this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.receive_statement_email);
                } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.PAPER.name())) {
                    return this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.receive_statement_mail);
                } else {
                    return this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.receive_statement_inapp);
                }
            }

            public final String MediaMetadataCompat(String str) {
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.EMAIL.name())) {
                    String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.change_email);
                    onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.change_email)");
                    return string;
                }
                String string2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.change_address);
                onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.change_address)");
                return string2;
            }

            public static String MediaBrowserCompat$ItemReceiver(chain chain) {
                onGetStartedClick.write((Object) chain, "ccd");
                StringBuilder sb = new StringBuilder();
                String str = chain.AppCompatViewInflater;
                if (str == null) {
                    str = chain.setItemInvoker;
                }
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                sb.append(MediaBrowserCompat$CustomActionResultReceiver(chain.AppCompatViewInflater, chain.setItemInvoker));
                sb.append(chain.MediaBrowserCompat$SearchResultReceiver);
                sb.append(" ");
                sb.append(chain.MediaSessionCompat$QueueItem);
                sb.append("xx");
                sb.append(" ");
                sb.append("xxxx");
                sb.append(" ");
                sb.append(chain.f2806x50fd9e4a);
                String obj = sb.toString();
                onGetStartedClick.IconCompatParcelizer((Object) obj, "StringBuilder().also { b…ardMask)\n    }.toString()");
                return obj;
            }

            private static String MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
                CharSequence charSequence = str;
                boolean z = false;
                if (!(!(charSequence == null || GoodToKnowActivity.read(charSequence)))) {
                    CharSequence charSequence2 = str2;
                    if (charSequence2 == null || GoodToKnowActivity.read(charSequence2)) {
                        z = true;
                    }
                    if (!(!z)) {
                        return "";
                    }
                }
                return " ";
            }
        }

        public final Object IconCompatParcelizer(Object obj) {
            ImprovedAbstractMap improvedAbstractMap = this.write;
            zztx.zzd zzd = (zztx.zzd) obj;
            getAction getaction = zzd.MediaBrowserCompat$CustomActionResultReceiver;
            String IconCompatParcelizer = improvedAbstractMap.IconCompatParcelizer("dd MMM yyyy", CheckCaptureActivity.write("yyyy-MM-dd", zzd.IconCompatParcelizer));
            String str = getaction.read;
            String string = improvedAbstractMap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.rewards_text, new Object[]{getaction.write});
            int i = getaction.MediaBrowserCompat$CustomActionResultReceiver;
            int i2 = getaction.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append(NumberFormat.getInstance(Locale.getDefault()).format((long) i));
            sb.append(" - ");
            sb.append(NumberFormat.getInstance(Locale.getDefault()).format((long) i2));
            String obj2 = sb.toString();
            String string2 = improvedAbstractMap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.expires_text, new Object[]{IconCompatParcelizer});
            return new validateInterface(str, string, obj2, string2, getaction.RatingCompat, getaction.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.Maps$AbstractMapWrapper */
    public final class AbstractMapWrapper extends constrainedListMultimap {
        @HmlPinActivity
        public AbstractMapWrapper(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }
    }

    /* renamed from: o.Maps$UnmodifiableEntrySet */
    public final class UnmodifiableEntrySet extends constrainedListMultimap {
        @HmlPinActivity
        public UnmodifiableEntrySet(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }
    }

    /* renamed from: o.Maps$TransformedEntriesMap */
    public final class TransformedEntriesMap extends constrainedListMultimap {
        @HmlPinActivity
        public TransformedEntriesMap(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }

        /* renamed from: o.Maps$TransformedEntriesMap$EntrySet */
        public final class EntrySet extends constrainedSetMultimap<zzqj.zza, getDependencies> {
            @HmlPinActivity
            public EntrySet(Resources resources, SharedPreferences sharedPreferences) {
                super(resources, sharedPreferences);
            }

            /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
            /* JADX WARNING: Removed duplicated region for block: B:55:0x011c A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final p040o.getDependencies MediaBrowserCompat$ItemReceiver(p040o.zzqj.zza r12) {
                /*
                    r11 = this;
                    o.getDependencies r0 = new o.getDependencies
                    r0.<init>()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.List<o.DetailsTabHolder> r2 = r12.MediaBrowserCompat$CustomActionResultReceiver
                    java.util.Iterator r2 = r2.iterator()
                L_0x0010:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x0123
                    java.lang.Object r3 = r2.next()
                    o.DetailsTabHolder r3 = (p040o.DetailsTabHolder) r3
                    o.intoSet r4 = new o.intoSet
                    r4.<init>()
                    java.lang.String r5 = r3.MediaSessionCompat$QueueItem
                    r4.MediaSessionCompat$QueueItem = r5
                    java.lang.String r5 = r3.write
                    r4.MediaSessionCompat$Token = r5
                    o.Maps$MapDifferenceImpl r5 = new o.Maps$MapDifferenceImpl
                    android.content.res.Resources r6 = r11.MediaBrowserCompat$CustomActionResultReceiver
                    r5.<init>(r6)
                    r4.setBackgroundResource = r5
                    java.lang.String r5 = r3.MediaBrowserCompat$MediaItem
                    r4.MediaDescriptionCompat = r5
                    java.lang.Integer r5 = r3.MediaSessionCompat$Token
                    r4.IconCompatParcelizer = r5
                    java.lang.Integer r5 = r3.MediaSessionCompat$ResultReceiverWrapper
                    r4.PlaybackStateCompat$CustomAction = r5
                    java.lang.Integer r5 = r3.f3132x50fd9e4a
                    r4.ParcelableVolumeInfo = r5
                    java.lang.String r5 = r3.RatingCompat
                    r4.MediaBrowserCompat$MediaItem = r5
                    java.lang.String r5 = r3.MediaMetadataCompat
                    r4.AlertController$RecycleListView = r5
                    java.lang.Integer r5 = r3.MediaSessionCompat$Token
                    r6 = 1
                    r7 = 0
                    if (r5 == 0) goto L_0x007a
                    java.util.Locale r5 = java.util.Locale.getDefault()
                    java.text.NumberFormat r5 = java.text.NumberFormat.getInstance(r5)
                    java.lang.Integer r8 = r3.MediaSessionCompat$Token
                    java.lang.String r5 = r5.format(r8)
                    int r8 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.formatted_points_cash_opr
                    android.content.res.Resources r9 = r11.MediaBrowserCompat$CustomActionResultReceiver
                    java.lang.String r8 = r9.getString(r8)
                    r9 = 3
                    java.lang.Object[] r9 = new java.lang.Object[r9]
                    java.lang.Integer r10 = r3.f3132x50fd9e4a
                    r9[r7] = r10
                    r9[r6] = r5
                    r5 = 2
                    java.lang.String r10 = r3.RatingCompat
                    r9[r5] = r10
                    java.lang.String r5 = java.lang.String.format(r8, r9)
                    r4.MediaBrowserCompat$SearchResultReceiver = r5
                L_0x007a:
                    o.zzpf$zza r5 = r3.ParcelableVolumeInfo
                    if (r5 == 0) goto L_0x0083
                    o.zzpf$zza r5 = r3.ParcelableVolumeInfo
                    r4.setHasDecor = r5
                    goto L_0x0087
                L_0x0083:
                    o.zzpf$zza r5 = p040o.zzpf.zza.OTHER
                    r4.setHasDecor = r5
                L_0x0087:
                    o.AddNewCurrencyActivity r5 = r3.MediaBrowserCompat$SearchResultReceiver
                    if (r5 == 0) goto L_0x0096
                    o.handle r5 = new o.handle
                    o.AddNewCurrencyActivity r8 = r3.MediaBrowserCompat$SearchResultReceiver
                    java.lang.Long r8 = r8.write
                    r5.<init>((java.lang.Long) r8)
                    r4.f2870x50fd9e4a = r5
                L_0x0096:
                    o.readString r5 = r3.PlaybackStateCompat$CustomAction
                    if (r5 == 0) goto L_0x009e
                    o.readString r5 = r3.PlaybackStateCompat$CustomAction
                    r4.PlaybackStateCompat = r5
                L_0x009e:
                    java.lang.Integer r5 = r3.IconCompatParcelizer
                    if (r5 == 0) goto L_0x00a9
                    java.lang.Integer r5 = r3.IconCompatParcelizer
                    int r5 = r5.intValue()
                    goto L_0x00aa
                L_0x00a9:
                    r5 = r7
                L_0x00aa:
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    r4.MediaBrowserCompat$CustomActionResultReceiver = r5
                    java.lang.Integer r5 = r3.MediaBrowserCompat$ItemReceiver
                    r4.MediaBrowserCompat$ItemReceiver = r5
                    java.lang.String r5 = r3.read
                    java.lang.String r8 = ""
                    if (r5 == 0) goto L_0x00bd
                    java.lang.String r5 = r3.read
                    goto L_0x00be
                L_0x00bd:
                    r5 = r8
                L_0x00be:
                    r4.write = r5
                    java.lang.String r5 = r3.MediaBrowserCompat$CustomActionResultReceiver
                    java.lang.String r9 = "dd MMM yyyy"
                    java.lang.String r10 = "yyyy-MM-dd'T'HH:mm:ss"
                    if (r5 != 0) goto L_0x00ca
                    r5 = r8
                    goto L_0x00d2
                L_0x00ca:
                    org.threeten.bp.OffsetDateTime r5 = p040o.CheckCaptureActivity.write(r10, r5)
                    java.lang.String r5 = r11.IconCompatParcelizer((java.lang.String) r9, (org.threeten.p041bp.OffsetDateTime) r5)
                L_0x00d2:
                    r4.read = r5
                    java.lang.Integer r5 = r3.setHasDecor
                    r4.Keep = r5
                    java.lang.String r5 = r3.MediaDescriptionCompat
                    if (r5 != 0) goto L_0x00dd
                    goto L_0x00e5
                L_0x00dd:
                    org.threeten.bp.OffsetDateTime r5 = p040o.CheckCaptureActivity.write(r10, r5)
                    java.lang.String r8 = r11.IconCompatParcelizer((java.lang.String) r9, (org.threeten.p041bp.OffsetDateTime) r5)
                L_0x00e5:
                    r4.MediaSessionCompat$ResultReceiverWrapper = r8
                    java.lang.String r5 = r3.MediaDescriptionCompat
                    java.lang.String r8 = r3.MediaBrowserCompat$CustomActionResultReceiver
                    if (r8 == 0) goto L_0x0114
                    r9 = 0
                    if (r5 != 0) goto L_0x00f2
                    r5 = r9
                    goto L_0x00f6
                L_0x00f2:
                    org.threeten.bp.OffsetDateTime r5 = p040o.CheckCaptureActivity.write(r10, r5)
                L_0x00f6:
                    if (r8 != 0) goto L_0x00f9
                    goto L_0x00fd
                L_0x00f9:
                    org.threeten.bp.OffsetDateTime r9 = p040o.CheckCaptureActivity.write(r10, r8)
                L_0x00fd:
                    if (r5 == 0) goto L_0x010a
                    if (r9 == 0) goto L_0x010a
                    boolean r5 = r5.isAfter(r9)
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    goto L_0x010c
                L_0x010a:
                    java.lang.Boolean r5 = java.lang.Boolean.FALSE
                L_0x010c:
                    boolean r5 = r5.booleanValue()
                    if (r5 != 0) goto L_0x0114
                    r5 = r7
                    goto L_0x0115
                L_0x0114:
                    r5 = r6
                L_0x0115:
                    r4.RatingCompat = r5
                    java.lang.Integer r3 = r3.MediaBrowserCompat$ItemReceiver
                    if (r3 != 0) goto L_0x011c
                    r6 = r7
                L_0x011c:
                    r4.MediaMetadataCompat = r6
                    r1.add(r4)
                    goto L_0x0010
                L_0x0123:
                    r0.IconCompatParcelizer = r1
                    int r12 = r12.write
                    r0.read = r12
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.Maps.TransformedEntriesMap.EntrySet.MediaBrowserCompat$ItemReceiver(o.zzqj$zza):o.getDependencies");
            }
        }
    }

    /* renamed from: o.Maps$ValueDifferenceImpl */
    public final class ValueDifferenceImpl extends constrainedListMultimap {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public ValueDifferenceImpl(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        }

        /* renamed from: o.Maps$ValueDifferenceImpl$read */
        public static final class read implements findFragmentByWho {
            private final /* synthetic */ GoogleAuthUtil read;

            private read() {
            }

            public /* synthetic */ read(GoogleAuthUtil googleAuthUtil) {
                this.read = googleAuthUtil;
            }

            public final Object IconCompatParcelizer(Object obj) {
                resumeAnimation resumeanimation = (resumeAnimation) obj;
                getPattern MediaBrowserCompat$CustomActionResultReceiver = getPattern.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = FragmentBuilder_BindSummaryFragment.write(resumeanimation.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null);
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = resumeanimation.MediaBrowserCompat$SearchResultReceiver;
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = resumeanimation.IconCompatParcelizer;
                MediaBrowserCompat$CustomActionResultReceiver.write = resumeanimation.read.IconCompatParcelizer();
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = FragmentBuilder_BindSummaryFragment.write(resumeanimation.MediaDescriptionCompat, (OffsetDateTime) null);
                MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = resumeanimation.MediaMetadataCompat;
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = resumeanimation.MediaBrowserCompat$CustomActionResultReceiver;
                MediaBrowserCompat$CustomActionResultReceiver.read = resumeanimation.write;
                return MediaBrowserCompat$CustomActionResultReceiver;
            }
        }

        public static String IconCompatParcelizer() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            Calendar instance = Calendar.getInstance();
            onGetStartedClick.IconCompatParcelizer((Object) instance, "Calendar.getInstance()");
            String format = simpleDateFormat.format(instance.getTime());
            onGetStartedClick.IconCompatParcelizer((Object) format, "SimpleDateFormat(DateUti…Instance().time\n        )");
            return format;
        }

        public final String MediaBrowserCompat$SearchResultReceiver(String str) {
            if (str.length() == 0) {
                return "";
            }
            String IconCompatParcelizer = IconCompatParcelizer("dd MMM yyyy", CheckCaptureActivity.write("yyyy-MM-dd'T'HH:mm:ss", str));
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "transformToDateMonthStri…          )\n            )");
            return IconCompatParcelizer;
        }
    }

    /* renamed from: o.Maps$ImprovedAbstractMap */
    public final class ImprovedAbstractMap extends constrainedListMultimap {
        @HmlPinActivity
        public ImprovedAbstractMap(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }

        public final eagerInDefaultApp IconCompatParcelizer(int i, readStringList readstringlist, chain chain, zztx.zzb zzb) {
            eagerInDefaultApp eagerindefaultapp = new eagerInDefaultApp();
            eagerindefaultapp.read = i;
            eagerindefaultapp.MediaDescriptionCompat = readstringlist;
            eagerindefaultapp.MediaBrowserCompat$ItemReceiver = chain.MediaDescriptionCompat;
            eagerindefaultapp.MediaSessionCompat$Token = chain.AppCompatViewInflater;
            eagerindefaultapp.MediaBrowserCompat$MediaItem = chain.MediaSessionCompat$Token;
            List<zztx.zzd> list = zzb.MediaBrowserCompat$MediaItem;
            List<zztx.zzd> list2 = zzb.IconCompatParcelizer;
            eagerindefaultapp.MediaMetadataCompat = Boolean.valueOf(zzb.write).booleanValue();
            boolean z = true;
            String str = null;
            eagerindefaultapp.f2820x50fd9e4a = list == null || list.isEmpty() ? null : write(list);
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            if (!z) {
                str = IconCompatParcelizer("MMM yyyy", CheckCaptureActivity.write("yyyy-MM-dd", list2.get(0).IconCompatParcelizer));
            }
            eagerindefaultapp.ParcelableVolumeInfo = str;
            eagerindefaultapp.MediaBrowserCompat$SearchResultReceiver = zzb.MediaBrowserCompat$CustomActionResultReceiver;
            eagerindefaultapp.MediaSessionCompat$ResultReceiverWrapper = zzb.MediaBrowserCompat$ItemReceiver;
            eagerindefaultapp.MediaSessionCompat$QueueItem = chain.setGroupDividerEnabled;
            eagerindefaultapp.IconCompatParcelizer = chain.setItemInvoker;
            eagerindefaultapp.MediaBrowserCompat$CustomActionResultReceiver = chain.MediaBrowserCompat$CustomActionResultReceiver;
            eagerindefaultapp.PlaybackStateCompat = zzb.read;
            return eagerindefaultapp;
        }

        public final eagerInDefaultApp IconCompatParcelizer(C4416factory factory, zztx.zzb zzb) {
            eagerInDefaultApp eagerindefaultapp = new eagerInDefaultApp();
            eagerindefaultapp.read = factory.MediaMetadataCompat;
            eagerindefaultapp.MediaDescriptionCompat = factory.MediaBrowserCompat$SearchResultReceiver;
            eagerindefaultapp.MediaBrowserCompat$ItemReceiver = factory.write;
            eagerindefaultapp.MediaSessionCompat$Token = factory.IconCompatParcelizer;
            eagerindefaultapp.MediaBrowserCompat$MediaItem = factory.MediaBrowserCompat$CustomActionResultReceiver;
            List<zztx.zzd> list = zzb.MediaBrowserCompat$MediaItem;
            List<zztx.zzd> list2 = zzb.IconCompatParcelizer;
            eagerindefaultapp.MediaMetadataCompat = Boolean.valueOf(zzb.write).booleanValue();
            boolean z = true;
            String str = null;
            eagerindefaultapp.f2820x50fd9e4a = list == null || list.isEmpty() ? null : write(list);
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            if (!z) {
                str = IconCompatParcelizer("MMM yyyy", CheckCaptureActivity.write("yyyy-MM-dd", list2.get(0).IconCompatParcelizer));
            }
            eagerindefaultapp.ParcelableVolumeInfo = str;
            eagerindefaultapp.MediaBrowserCompat$SearchResultReceiver = zzb.MediaBrowserCompat$CustomActionResultReceiver;
            eagerindefaultapp.MediaSessionCompat$ResultReceiverWrapper = zzb.MediaBrowserCompat$ItemReceiver;
            eagerindefaultapp.MediaSessionCompat$QueueItem = factory.MediaBrowserCompat$ItemReceiver;
            eagerindefaultapp.IconCompatParcelizer = factory.RatingCompat;
            eagerindefaultapp.MediaBrowserCompat$CustomActionResultReceiver = factory.read;
            eagerindefaultapp.RatingCompat = factory.MediaBrowserCompat$MediaItem;
            eagerindefaultapp.PlaybackStateCompat = zzb.read;
            return eagerindefaultapp;
        }

        private List<validateInterface> write(List<zztx.zzd> list) {
            show show = new show(list);
            return (List) new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, new FilteredEntryMap(this))).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: null
                    java.util.ConcurrentModificationException
                    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1660)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.insertDecompilationProblems(ClassGen.java:327)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:301)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                public final /* synthetic */ java.lang.Object read(
/*
Method generation error in method: o.setupDialog.1.read():java.lang.Object, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }, new ensureAnimationInfo<List<T>, T>() {
                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: null
                    java.util.ConcurrentModificationException
                    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1660)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.insertDecompilationProblems(ClassGen.java:327)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:301)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(
/*
Method generation error in method: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }));
        }
    }

    /* renamed from: o.Maps$FilteredKeyMap */
    public final class FilteredKeyMap extends constrainedListMultimap {
        @HmlPinActivity
        public FilteredKeyMap(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }
    }
}

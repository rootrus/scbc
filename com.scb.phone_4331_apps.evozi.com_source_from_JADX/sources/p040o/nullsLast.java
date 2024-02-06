package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.gms.stats.CodePackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.TypeCastException;
import org.bouncycastle.i18n.ErrorBundle;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.Iterables;
import p040o.padWithZerosToMaxIntWidth;
import p040o.zzin;

/* renamed from: o.nullsLast */
public final class nullsLast extends constrainedListMultimap {

    /* renamed from: o.nullsLast$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, Boolean> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
            onGetStartedClick.write((Object) setdatacollectionenabled, "it");
            return Boolean.valueOf((!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "LOAN_INFO", (Object) setdatacollectionenabled.read) || setdatacollectionenabled.MediaDescriptionCompat == null || setdatacollectionenabled.write == null) ? false : true);
        }
    }

    /* renamed from: o.nullsLast$MediaDescriptionCompat */
    static final class MediaDescriptionCompat extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
        private /* synthetic */ nullsLast MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(nullsLast nullslast) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = nullslast;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
            onGetStartedClick.write((Object) setdatacollectionenabled, "it");
            return nullsLast.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, setdatacollectionenabled);
        }
    }

    /* renamed from: o.nullsLast$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, Boolean> {
        public static final read write = new read();

        read() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
            onGetStartedClick.write((Object) setdatacollectionenabled, "it");
            return Boolean.valueOf((!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "COST", (Object) setdatacollectionenabled.read) || setdatacollectionenabled.MediaDescriptionCompat == null || setdatacollectionenabled.write == null) ? false : true);
        }
    }

    /* renamed from: o.nullsLast$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
        private /* synthetic */ nullsLast MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(nullsLast nullslast) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = nullslast;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
            onGetStartedClick.write((Object) setdatacollectionenabled, "it");
            return nullsLast.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, setdatacollectionenabled);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public nullsLast(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public final access$1400 MediaBrowserCompat$CustomActionResultReceiver(List<? extends setDataCollectionEnabled> list) {
        onGetStartedClick.write((Object) list, ErrorBundle.DETAIL_ENTRY);
        access$1400$MediaBrowserCompat$CustomActionResultReceiver access_1400_mediabrowsercompat_customactionresultreceiver = new access$1400$MediaBrowserCompat$CustomActionResultReceiver();
        Iterable iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$asSequence");
        BaseJuristicPinActivity_ViewBinding iconCompatParcelizer = new HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(iterable);
        FundFactSheetActivity fundFactSheetActivity = nullsLast$MediaBrowserCompat$CustomActionResultReceiver.write;
        onGetStartedClick.write((Object) iconCompatParcelizer, "$this$filter");
        onGetStartedClick.write((Object) fundFactSheetActivity, "predicate");
        BaseJuristicPinActivity_ViewBinding setupScheduleActivity = new SetupScheduleActivity(iconCompatParcelizer, true, fundFactSheetActivity);
        FundFactSheetActivity nullslast_mediabrowsercompat_itemreceiver = new nullsLast$MediaBrowserCompat$ItemReceiver(this);
        onGetStartedClick.write((Object) setupScheduleActivity, "$this$map");
        onGetStartedClick.write((Object) nullslast_mediabrowsercompat_itemreceiver, "transform");
        BaseJuristicPinActivity_ViewBinding juristicSetupNewPinActivity = new JuristicSetupNewPinActivity(setupScheduleActivity, nullslast_mediabrowsercompat_itemreceiver);
        onGetStartedClick.write((Object) juristicSetupNewPinActivity, "$this$toList");
        onGetStartedClick.write((Object) juristicSetupNewPinActivity, "$this$toMutableList");
        access_1400_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = HmlNTBBusinessURLInformationActivity.write((List) JuristicRequestFormActivity.read(juristicSetupNewPinActivity, new ArrayList()));
        onGetStartedClick.write((Object) iterable, "$this$asSequence");
        BaseJuristicPinActivity_ViewBinding iconCompatParcelizer2 = new HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(iterable);
        FundFactSheetActivity fundFactSheetActivity2 = IconCompatParcelizer.IconCompatParcelizer;
        onGetStartedClick.write((Object) iconCompatParcelizer2, "$this$filter");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "predicate");
        BaseJuristicPinActivity_ViewBinding setupScheduleActivity2 = new SetupScheduleActivity(iconCompatParcelizer2, true, fundFactSheetActivity2);
        FundFactSheetActivity write2 = new write(this);
        onGetStartedClick.write((Object) setupScheduleActivity2, "$this$map");
        onGetStartedClick.write((Object) write2, "transform");
        BaseJuristicPinActivity_ViewBinding juristicSetupNewPinActivity2 = new JuristicSetupNewPinActivity(setupScheduleActivity2, write2);
        onGetStartedClick.write((Object) juristicSetupNewPinActivity2, "$this$toList");
        onGetStartedClick.write((Object) juristicSetupNewPinActivity2, "$this$toMutableList");
        access_1400_mediabrowsercompat_customactionresultreceiver.read = HmlNTBBusinessURLInformationActivity.write((List) JuristicRequestFormActivity.read(juristicSetupNewPinActivity2, new ArrayList()));
        onGetStartedClick.write((Object) iterable, "$this$asSequence");
        BaseJuristicPinActivity_ViewBinding iconCompatParcelizer3 = new HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(iterable);
        FundFactSheetActivity fundFactSheetActivity3 = read.write;
        onGetStartedClick.write((Object) iconCompatParcelizer3, "$this$filter");
        onGetStartedClick.write((Object) fundFactSheetActivity3, "predicate");
        BaseJuristicPinActivity_ViewBinding setupScheduleActivity3 = new SetupScheduleActivity(iconCompatParcelizer3, true, fundFactSheetActivity3);
        FundFactSheetActivity mediaDescriptionCompat = new MediaDescriptionCompat(this);
        onGetStartedClick.write((Object) setupScheduleActivity3, "$this$map");
        onGetStartedClick.write((Object) mediaDescriptionCompat, "transform");
        BaseJuristicPinActivity_ViewBinding juristicSetupNewPinActivity3 = new JuristicSetupNewPinActivity(setupScheduleActivity3, mediaDescriptionCompat);
        onGetStartedClick.write((Object) juristicSetupNewPinActivity3, "$this$toList");
        onGetStartedClick.write((Object) juristicSetupNewPinActivity3, "$this$toMutableList");
        access_1400_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = HmlNTBBusinessURLInformationActivity.write((List) JuristicRequestFormActivity.read(juristicSetupNewPinActivity3, new ArrayList()));
        return (access$1400) access_1400_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public static getSharedPrefs MediaBrowserCompat$ItemReceiver(initForTests initfortests) {
        getSharedPrefs$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = getSharedPrefs.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.read = initfortests.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = initfortests.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = initfortests.read;
        MediaBrowserCompat$CustomActionResultReceiver.setBackgroundResource = initfortests.setHasDecor;
        MediaBrowserCompat$CustomActionResultReceiver.setHasDecor = initfortests.MediaSessionCompat$Token;
        MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat = initfortests.MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem = initfortests.RatingCompat;
        MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView = initfortests.PlaybackStateCompat;
        List<String> list = initfortests.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) list, "easycashMortgageLoanOffer.durationOptions");
        Iterable<String> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        int i = 10;
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (String str : iterable) {
            onGetStartedClick.IconCompatParcelizer((Object) str, "it");
            arrayList.add(Integer.valueOf(Integer.parseInt(str)));
        }
        MediaBrowserCompat$CustomActionResultReceiver.Keep = (List) arrayList;
        padWithZerosToMaxIntWidth.write write2 = new padWithZerosToMaxIntWidth.write();
        write2.read = initfortests.MediaSessionCompat$Token;
        write2.MediaBrowserCompat$CustomActionResultReceiver = initfortests.MediaBrowserCompat$SearchResultReceiver;
        List<String> list2 = initfortests.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) list2, "easycashMortgageLoanOffer.durationOptions");
        Iterable<String> iterable2 = list2;
        onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
        if (iterable2 instanceof Collection) {
            i = ((Collection) iterable2).size();
        }
        Collection arrayList2 = new ArrayList(i);
        for (String str2 : iterable2) {
            onGetStartedClick.IconCompatParcelizer((Object) str2, "it");
            arrayList2.add(Integer.valueOf(Integer.parseInt(str2)));
        }
        write2.MediaBrowserCompat$ItemReceiver = (List) arrayList2;
        List<padWithZerosToMaxIntWidth> singletonList = Collections.singletonList(new padWithZerosToMaxIntWidth(write2, (byte) 0));
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        MediaBrowserCompat$CustomActionResultReceiver.setContentView = singletonList;
        getStringsFileValue MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver != null) {
            return (getSharedPrefs) MediaBrowserCompat$ItemReceiver;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.landing.EasycashMortgageLoanOfferDisplay");
    }

    public static getSharedPrefs read(initForTests initfortests, zzin.zzc zzc) {
        getSharedPrefs$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = getSharedPrefs.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.read = initfortests.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = initfortests.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = initfortests.read;
        MediaBrowserCompat$CustomActionResultReceiver.setBackgroundResource = initfortests.setHasDecor;
        MediaBrowserCompat$CustomActionResultReceiver.setHasDecor = zzc.MediaDescriptionCompat;
        MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat = zzc.write;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem = initfortests.RatingCompat;
        MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView = initfortests.PlaybackStateCompat;
        Iterable<String> iterable = zzc.read;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        int i = 10;
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (String parseInt : iterable) {
            arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
        }
        MediaBrowserCompat$CustomActionResultReceiver.Keep = (List) arrayList;
        padWithZerosToMaxIntWidth.write write2 = new padWithZerosToMaxIntWidth.write();
        write2.read = zzc.MediaDescriptionCompat;
        write2.MediaBrowserCompat$CustomActionResultReceiver = zzc.write;
        Iterable<String> iterable2 = zzc.read;
        onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
        if (iterable2 instanceof Collection) {
            i = ((Collection) iterable2).size();
        }
        Collection arrayList2 = new ArrayList(i);
        for (String parseInt2 : iterable2) {
            arrayList2.add(Integer.valueOf(Integer.parseInt(parseInt2)));
        }
        write2.MediaBrowserCompat$ItemReceiver = (List) arrayList2;
        List<padWithZerosToMaxIntWidth> singletonList = Collections.singletonList(new padWithZerosToMaxIntWidth(write2, (byte) 0));
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        MediaBrowserCompat$CustomActionResultReceiver.setContentView = singletonList;
        getStringsFileValue MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver != null) {
            return (getSharedPrefs) MediaBrowserCompat$ItemReceiver;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.landing.EasycashMortgageLoanOfferDisplay");
    }

    public static final /* synthetic */ RestrictedComponentContainer MediaBrowserCompat$ItemReceiver(nullsLast nullslast, setDataCollectionEnabled setdatacollectionenabled) {
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) CodePackage.LOCATION, (Object) setdatacollectionenabled.MediaBrowserCompat$ItemReceiver) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "ANNUAL_INTEREST", (Object) setdatacollectionenabled.MediaBrowserCompat$ItemReceiver) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "REMARK", (Object) setdatacollectionenabled.MediaBrowserCompat$ItemReceiver)) {
            return new RestrictedComponentContainer(setdatacollectionenabled.IconCompatParcelizer, setdatacollectionenabled.MediaDescriptionCompat);
        }
        String str = setdatacollectionenabled.IconCompatParcelizer;
        List singletonList = Collections.singletonList(new C3758xd990f62c(setdatacollectionenabled.MediaDescriptionCompat, ContentFrameLayout.write(nullslast.MediaBrowserCompat$CustomActionResultReceiver, Iterables.C35273.read.dark_gray, (Resources.Theme) null)));
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        return new RestrictedComponentContainer(str, (List<C3758xd990f62c>) singletonList);
    }
}

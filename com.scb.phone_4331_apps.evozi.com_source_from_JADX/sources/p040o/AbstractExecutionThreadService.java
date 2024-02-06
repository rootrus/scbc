package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.GoogleMap;
import p040o.SignedBytes;
import p040o.StreetViewPanoramaFragment;

/* renamed from: o.AbstractExecutionThreadService */
public final class AbstractExecutionThreadService extends SignedBytes.LexicographicalComparator {
    private final String MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public AbstractExecutionThreadService(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    private final String read(StreetViewPanoramaOptions streetViewPanoramaOptions, String str) {
        position position = streetViewPanoramaOptions.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) position, "biller.billerType");
        CharSequence charSequence = position.type;
        if (charSequence == null || charSequence.length() == 0) {
            CharSequence charSequence2 = streetViewPanoramaOptions.f2790x50fd9e4a;
            if (charSequence2 == null || charSequence2.length() == 0) {
                CharSequence charSequence3 = str;
                if (!(charSequence3 == null || charSequence3.length() == 0)) {
                    FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
                    String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.biller_ac);
                    onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.biller_ac)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(str, true)}, 1));
                    onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
                    return format;
                }
            }
            FundOnboardingSuccessActivity fundOnboardingSuccessActivity2 = FundOnboardingSuccessActivity.IconCompatParcelizer;
            String string2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.comp_code);
            onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.comp_code)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{streetViewPanoramaOptions.f2790x50fd9e4a}, 1));
            onGetStartedClick.IconCompatParcelizer((Object) format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity3 = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String string3 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.biller_id);
        onGetStartedClick.IconCompatParcelizer((Object) string3, "getString(R.string.biller_id)");
        String format3 = String.format(string3, Arrays.copyOf(new Object[]{str}, 1));
        onGetStartedClick.IconCompatParcelizer((Object) format3, "java.lang.String.format(format, *args)");
        return format3;
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Exception MediaBrowserCompat$CustomActionResultReceiver(lambda$processSetComponents$1 lambda_processsetcomponents_1, StreetViewPanoramaFragment.zza zza) {
        String str;
        List<CrashlyticsReport.Session.OperatingSystem.Builder> list;
        String str2;
        String str3;
        String str4;
        Double d;
        List<ComponentRuntime> list2;
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseSourceOfFundDisplay");
        onGetStartedClick.write((Object) zza, "billPaymentBillerList");
        List<StreetViewPanoramaOptions> list3 = zza.write;
        onGetStartedClick.IconCompatParcelizer((Object) list3, "billPaymentBillerList.billPaymentBillerEntityList");
        StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(list3);
        onGetStartedClick.IconCompatParcelizer((Object) streetViewPanoramaOptions, "biller");
        getProvider getprovider = lambda_processsetcomponents_1.MediaBrowserCompat$ItemReceiver;
        String str5 = null;
        if (getprovider != null) {
            str = getprovider.MediaBrowserCompat$ItemReceiver;
        } else {
            str = null;
        }
        String read = read(streetViewPanoramaOptions, str);
        ComponentFactory componentFactory = lambda_processsetcomponents_1.MediaBrowserCompat$SearchResultReceiver;
        if (componentFactory == null || (list2 = componentFactory.MediaBrowserCompat$ItemReceiver) == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        } else {
            Iterable<ComponentRuntime> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (ComponentRuntime componentRuntime : iterable) {
                onGetStartedClick.write((Object) componentRuntime, "sourceOfFundPaymentInfoDisplay");
                arrayList.add(new CrashlyticsReport.Session.OperatingSystem.Builder(componentRuntime.MediaBrowserCompat$CustomActionResultReceiver, componentRuntime.write, componentRuntime.MediaBrowserCompat$ItemReceiver, componentRuntime.IconCompatParcelizer, componentRuntime.read, (String) null));
            }
            list = (List) arrayList;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = new CrashlyticsReport.Session.Event.Application.Execution.Exception();
        exception.setSplitBackground = lambda_processsetcomponents_1.write;
        exception.AbsActionBarView = lambda_processsetcomponents_1.IconCompatParcelizer;
        exception.setTitleOptional = lambda_processsetcomponents_1.ParcelableVolumeInfo;
        String str6 = lambda_processsetcomponents_1.MediaMetadataCompat;
        onGetStartedClick.write((Object) str6, "<set-?>");
        exception.setPrimaryBackground = str6;
        String str7 = lambda_processsetcomponents_1.MediaDescriptionCompat;
        onGetStartedClick.write((Object) str7, "<set-?>");
        exception.setTabContainer = str7;
        String str8 = lambda_processsetcomponents_1.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) str8, "<set-?>");
        exception.ActionBarContextView = str8;
        String str9 = lambda_processsetcomponents_1.MediaSessionCompat$Token;
        onGetStartedClick.write((Object) str9, "<set-?>");
        exception.setSubtitle = str9;
        String str10 = CrashlyticsReportJsonTransform$$Lambda$9.BILL_PAYMENT.code;
        onGetStartedClick.write((Object) str10, "<set-?>");
        exception.setStackedBackground = str10;
        onGetStartedClick.write((Object) list, "<set-?>");
        exception.setCustomView = list;
        ComponentFactory componentFactory2 = lambda_processsetcomponents_1.MediaBrowserCompat$SearchResultReceiver;
        exception.ActionBarContainer = componentFactory2 != null ? componentFactory2.MediaBrowserCompat$CustomActionResultReceiver : null;
        CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$CustomActionResultReceiver = exception.MediaBrowserCompat$CustomActionResultReceiver(read(streetViewPanoramaOptions.MediaBrowserCompat$MediaItem, streetViewPanoramaOptions.MediaMetadataCompat));
        MediaBrowserCompat$CustomActionResultReceiver.setIcon = read(streetViewPanoramaOptions.AppCompatDelegateImpl$ListMenuDecorView, streetViewPanoramaOptions.setBackgroundResource);
        MediaBrowserCompat$CustomActionResultReceiver.setPadding = read(streetViewPanoramaOptions.AppCompatDialogFragment, streetViewPanoramaOptions.setChecked);
        MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker = read(streetViewPanoramaOptions.setCheckable, streetViewPanoramaOptions.ActionMenuItemView);
        getProvider getprovider2 = lambda_processsetcomponents_1.MediaBrowserCompat$ItemReceiver;
        if (getprovider2 != null) {
            str2 = getprovider2.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str2 = null;
        }
        MediaBrowserCompat$CustomActionResultReceiver.setPopupCallback = str2;
        getProvider getprovider3 = lambda_processsetcomponents_1.MediaBrowserCompat$ItemReceiver;
        if (getprovider3 != null) {
            str3 = getprovider3.IconCompatParcelizer;
        } else {
            str3 = null;
        }
        MediaBrowserCompat$CustomActionResultReceiver.setGroupDividerEnabled = str3;
        getProvider getprovider4 = lambda_processsetcomponents_1.MediaBrowserCompat$ItemReceiver;
        if (getprovider4 != null) {
            str4 = getprovider4.read;
        } else {
            str4 = null;
        }
        MediaBrowserCompat$CustomActionResultReceiver.ExpandedMenuView = str4;
        MediaBrowserCompat$CustomActionResultReceiver.f2698x50fd9e4a = lambda_processsetcomponents_1.MediaMetadataCompat;
        getProvider getprovider5 = lambda_processsetcomponents_1.MediaBrowserCompat$ItemReceiver;
        if (getprovider5 != null) {
            str5 = getprovider5.MediaBrowserCompat$ItemReceiver;
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = str5;
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = read;
        getProvider getprovider6 = lambda_processsetcomponents_1.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((getprovider6 == null || (d = getprovider6.write) == null) ? 0.0d : d.doubleValue());
        String MediaBrowserCompat$CustomActionResultReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(streetViewPanoramaOptions.read, this.MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "Utilities.transformAsset…Logo(this, baseAssetsURL)");
        CrashlyticsReport.Session.Event.Application.Execution MediaMetadataCompat = MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2).MediaMetadataCompat();
        MediaMetadataCompat.Keep = streetViewPanoramaOptions.MediaSessionCompat$ResultReceiverWrapper;
        return (CrashlyticsReport.Session.Event.Application.Execution.Exception) MediaMetadataCompat;
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Exception IconCompatParcelizer(HmlVerifyEmailSuccessfulActivity<getStreetNamesEnabled, ? extends StreetViewPanoramaFragment.zza> hmlVerifyEmailSuccessfulActivity) {
        List<CrashlyticsReport.Session.OperatingSystem.Builder> list;
        HmlVerifyEmailSuccessfulActivity<getStreetNamesEnabled, ? extends StreetViewPanoramaFragment.zza> hmlVerifyEmailSuccessfulActivity2 = hmlVerifyEmailSuccessfulActivity;
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity2, "pair");
        getStreetNamesEnabled getstreetnamesenabled = (getStreetNamesEnabled) hmlVerifyEmailSuccessfulActivity2.MediaBrowserCompat$CustomActionResultReceiver;
        StreetViewPanoramaOptions streetViewPanoramaOptions = ((StreetViewPanoramaFragment.zza) hmlVerifyEmailSuccessfulActivity2.write).write.get(0);
        onGetStartedClick.IconCompatParcelizer((Object) streetViewPanoramaOptions, "biller");
        String read = read(streetViewPanoramaOptions, getstreetnamesenabled.IconCompatParcelizer);
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = new CrashlyticsReport.Session.Event.Application.Execution.Exception();
        String str = getstreetnamesenabled.read;
        onGetStartedClick.write((Object) str, "<set-?>");
        exception.setPrimaryBackground = str;
        String str2 = getstreetnamesenabled.MediaMetadataCompat;
        onGetStartedClick.write((Object) str2, "<set-?>");
        exception.setTabContainer = str2;
        String str3 = getstreetnamesenabled.MediaDescriptionCompat;
        onGetStartedClick.write((Object) str3, "<set-?>");
        exception.ActionBarContextView = str3;
        String str4 = getstreetnamesenabled.RatingCompat;
        onGetStartedClick.write((Object) str4, "<set-?>");
        exception.setSubtitle = str4;
        String str5 = getstreetnamesenabled.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) str5, "<set-?>");
        exception.setStackedBackground = str5;
        List<SupportStreetViewPanoramaFragment> list2 = getstreetnamesenabled.MediaBrowserCompat$MediaItem;
        if (list2 != null) {
            Iterable iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = (SupportStreetViewPanoramaFragment) it.next();
                Iterator it2 = it;
                CrashlyticsReport.Session.OperatingSystem.Builder builder = r9;
                CrashlyticsReport.Session.OperatingSystem.Builder builder2 = new CrashlyticsReport.Session.OperatingSystem.Builder(supportStreetViewPanoramaFragment.MediaDescriptionCompat, supportStreetViewPanoramaFragment.read, supportStreetViewPanoramaFragment.MediaBrowserCompat$ItemReceiver, supportStreetViewPanoramaFragment.write, supportStreetViewPanoramaFragment.MediaBrowserCompat$CustomActionResultReceiver, supportStreetViewPanoramaFragment.IconCompatParcelizer);
                arrayList.add(builder);
                it = it2;
            }
            list = (List) arrayList;
        } else {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        onGetStartedClick.write((Object) list, "<set-?>");
        exception.setCustomView = list;
        exception.setVisibility = getstreetnamesenabled.MediaBrowserCompat$CustomActionResultReceiver;
        GoogleMap.OnPolylineClickListener onPolylineClickListener = getstreetnamesenabled.write;
        exception.ActionBarContainer = onPolylineClickListener != null ? new processInstanceComponents(onPolylineClickListener.MediaBrowserCompat$ItemReceiver, onPolylineClickListener.read, onPolylineClickListener.MediaBrowserCompat$CustomActionResultReceiver, onPolylineClickListener.IconCompatParcelizer, onPolylineClickListener.MediaBrowserCompat$SearchResultReceiver, onPolylineClickListener.write) : null;
        CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$CustomActionResultReceiver = exception.MediaBrowserCompat$CustomActionResultReceiver(read(streetViewPanoramaOptions.MediaBrowserCompat$MediaItem, streetViewPanoramaOptions.MediaMetadataCompat));
        MediaBrowserCompat$CustomActionResultReceiver.setIcon = read(streetViewPanoramaOptions.AppCompatDelegateImpl$ListMenuDecorView, streetViewPanoramaOptions.setBackgroundResource);
        MediaBrowserCompat$CustomActionResultReceiver.setPadding = read(streetViewPanoramaOptions.AppCompatDialogFragment, streetViewPanoramaOptions.setChecked);
        MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker = read(streetViewPanoramaOptions.setCheckable, streetViewPanoramaOptions.ActionMenuItemView);
        MediaBrowserCompat$CustomActionResultReceiver.setPopupCallback = getstreetnamesenabled.MediaSessionCompat$Token;
        MediaBrowserCompat$CustomActionResultReceiver.setGroupDividerEnabled = getstreetnamesenabled.f2853x50fd9e4a;
        MediaBrowserCompat$CustomActionResultReceiver.ExpandedMenuView = getstreetnamesenabled.ParcelableVolumeInfo;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = getstreetnamesenabled.IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = read;
        MediaBrowserCompat$CustomActionResultReceiver.f2698x50fd9e4a = getstreetnamesenabled.read;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) getstreetnamesenabled.MediaBrowserCompat$ItemReceiver);
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = streetViewPanoramaOptions.write;
        String MediaBrowserCompat$CustomActionResultReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(streetViewPanoramaOptions.read, this.MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "Utilities.transformAsset…Logo(this, baseAssetsURL)");
        CrashlyticsReport.Session.Event.Application.Execution MediaMetadataCompat = MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2).MediaMetadataCompat();
        MediaMetadataCompat.Keep = streetViewPanoramaOptions.MediaSessionCompat$ResultReceiverWrapper;
        return (CrashlyticsReport.Session.Event.Application.Execution.Exception) MediaMetadataCompat;
    }
}

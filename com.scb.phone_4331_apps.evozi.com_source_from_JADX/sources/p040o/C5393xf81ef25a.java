package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import p040o.getCurrentTimestampSeconds;
import p040o.writeUInt64NoTag;
import p040o.zzca;

/* renamed from: o.setUserLoggedIn$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
public final class C5393xf81ef25a extends CheckEligibilityActivity implements FundFactSheetActivity<zzca.zze.zza, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ setUserLoggedIn MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5393xf81ef25a(setUserLoggedIn setuserloggedin) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = setuserloggedin;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        boolean z;
        boolean z2;
        final zzca.zze.zza zza = (zzca.zze.zza) obj;
        onGetStartedClick.write((Object) zza, "it");
        setUserLoggedIn.write(this.MediaBrowserCompat$CustomActionResultReceiver);
        String str = zza.read;
        if (str != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str);
        }
        String str2 = zza.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        setUserLoggedIn setuserloggedin = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z3 = false;
        if (str2 != null) {
            z = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(zza.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, "0", false);
        } else {
            z = false;
        }
        setuserloggedin.MediaDescriptionCompat = z;
        String str3 = zza.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        setUserLoggedIn setuserloggedin2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            z2 = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(zza.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, "0", false);
        } else {
            z2 = false;
        }
        setuserloggedin2.MediaBrowserCompat$MediaItem = z2;
        setUserLoggedIn setuserloggedin3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<T>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                String str;
                String str2;
                List<String> list;
                ExtractionCredentials extractionCredentials = (ExtractionCredentials) obj;
                zzca.zze.zza zza = zza;
                onGetStartedClick.write((Object) zza, "model");
                setContentDescription setcontentdescription = zza.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                String str3 = null;
                if (setcontentdescription != null && (list = setcontentdescription.IconCompatParcelizer) != null) {
                    Iterable iterable = list;
                    onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                    Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
                    Iterator it = iterable.iterator();
                    int i = 0;
                    while (true) {
                        String str4 = "";
                        if (!it.hasNext()) {
                            str = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver((List) arrayList, str4, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (FundFactSheetActivity) null, 62);
                            break;
                        }
                        Object next = it.next();
                        if (i >= 0) {
                            String str5 = (String) next;
                            boolean z = true;
                            if (i == list.size() - 1) {
                                str4 = str5;
                            } else {
                                if (str5.length() <= 0) {
                                    z = false;
                                }
                                if (z) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str5);
                                    sb.append(10);
                                    str4 = sb.toString();
                                }
                            }
                            arrayList.add(str4);
                            i++;
                        } else {
                            throw new ArithmeticException("Index overflow has happened.");
                        }
                    }
                } else {
                    str = null;
                }
                String str6 = zza.read;
                zzca.zze.zza.read read = zza.MediaBrowserCompat$ItemReceiver;
                boolean z2 = read.read;
                String str7 = read.IconCompatParcelizer;
                if (str7 == null) {
                    str2 = null;
                } else if (str7 != null) {
                    str2 = str7.toLowerCase();
                    onGetStartedClick.IconCompatParcelizer((Object) str2, "(this as java.lang.String).toLowerCase()");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = "doctor".toLowerCase();
                onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str2, (Object) lowerCase);
                String str8 = read.IconCompatParcelizer;
                if (str8 != null) {
                    if (str8 != null) {
                        str3 = str8.toLowerCase();
                        onGetStartedClick.IconCompatParcelizer((Object) str3, "(this as java.lang.String).toLowerCase()");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                String lowerCase2 = "dentist".toLowerCase();
                onGetStartedClick.IconCompatParcelizer((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver getcurrenttimestampseconds_mediabrowsercompat_itemreceiver = new getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver(z2, Boolean.valueOf(MediaBrowserCompat$ItemReceiver2), Boolean.valueOf(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str3, (Object) lowerCase2)));
                zzca.zze.zza.write write = zza.IconCompatParcelizer;
                extractionCredentials.IconCompatParcelizer(new getCurrentTimestampSeconds(str6, new getCurrentTimestampSeconds.write(zza.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer, str), getcurrenttimestampseconds_mediabrowsercompat_itemreceiver, new C4543x83a7f79(write.MediaBrowserCompat$CustomActionResultReceiver, write.MediaBrowserCompat$ItemReceiver)));
            }
        };
        if (setuserloggedin3.RatingCompat != null) {
            z3 = true;
        }
        if (z3) {
            r1.IconCompatParcelizer(setuserloggedin3.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

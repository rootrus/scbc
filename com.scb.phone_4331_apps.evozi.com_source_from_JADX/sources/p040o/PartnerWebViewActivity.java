package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;

/* renamed from: o.PartnerWebViewActivity */
public class PartnerWebViewActivity extends JustForYouLandingActivity_ViewBinding {
    public static /* synthetic */ String IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "$this$trimMargin");
        onGetStartedClick.write((Object) "|", "marginPrefix");
        return GoodToKnowActivity.write(str, "", "|");
    }

    public static final String write(String str, String str2, String str3) {
        String str4;
        String invoke;
        String str5 = str;
        String str6 = str3;
        onGetStartedClick.write((Object) str5, "$this$replaceIndentByMargin");
        onGetStartedClick.write((Object) str2, "newIndent");
        onGetStartedClick.write((Object) str6, "marginPrefix");
        if (!GoodToKnowActivity.read(str6)) {
            CharSequence charSequence = str5;
            onGetStartedClick.write((Object) charSequence, "$this$lines");
            List<String> MediaBrowserCompat$CustomActionResultReceiver = JuristicRequestFormActivity.MediaBrowserCompat$CustomActionResultReceiver(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence));
            int length = str.length();
            int length2 = str2.length();
            int size = MediaBrowserCompat$CustomActionResultReceiver.size();
            FundFactSheetActivity<String, String> read = read(str2);
            onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "$this$lastIndex");
            int size2 = MediaBrowserCompat$CustomActionResultReceiver.size() - 1;
            Collection arrayList = new ArrayList();
            int i = 0;
            for (Object next : MediaBrowserCompat$CustomActionResultReceiver) {
                if (i >= 0) {
                    String str7 = (String) next;
                    if ((i == 0 || i == size2) && GoodToKnowActivity.read(str7)) {
                        str7 = null;
                    } else {
                        CharSequence charSequence2 = str7;
                        int length3 = charSequence2.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length3) {
                                i2 = -1;
                                break;
                            }
                            char charAt = charSequence2.charAt(i2);
                            if (!(Character.isWhitespace(charAt) || Character.isSpaceChar(charAt))) {
                                break;
                            }
                            i2++;
                        }
                        if (i2 == -1 || !GoodToKnowActivity.write(str7, str6, i2, false)) {
                            str4 = null;
                        } else {
                            int length4 = str3.length();
                            if (str7 != null) {
                                str4 = str7.substring(i2 + length4);
                                onGetStartedClick.IconCompatParcelizer((Object) str4, "(this as java.lang.String).substring(startIndex)");
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                        if (!(str4 == null || (invoke = read.invoke(str4)) == null)) {
                            str7 = invoke;
                        }
                    }
                    if (str7 != null) {
                        arrayList.add(str7);
                    }
                    i++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            String obj = ((StringBuilder) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList, new StringBuilder(length + (length2 * size)), "\n", "", "", -1, "...", (FundFactSheetActivity) null)).toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return obj;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static final String MediaBrowserCompat$ItemReceiver(String str) {
        onGetStartedClick.write((Object) str, "$this$trimIndent");
        return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str, "");
    }

    public static final String MediaBrowserCompat$ItemReceiver(String str, String str2) {
        String invoke;
        onGetStartedClick.write((Object) str, "$this$replaceIndent");
        onGetStartedClick.write((Object) str2, "newIndent");
        CharSequence charSequence = str;
        onGetStartedClick.write((Object) charSequence, "$this$lines");
        List<String> MediaBrowserCompat$CustomActionResultReceiver = JuristicRequestFormActivity.MediaBrowserCompat$CustomActionResultReceiver(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence));
        Iterable iterable = MediaBrowserCompat$CustomActionResultReceiver;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (true ^ GoodToKnowActivity.read((String) next)) {
                arrayList.add(next);
            }
        }
        Iterable<String> iterable2 = (List) arrayList;
        onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
        Collection arrayList2 = new ArrayList(((Collection) iterable2).size());
        for (String write2 : iterable2) {
            arrayList2.add(Integer.valueOf(write(write2)));
        }
        Integer num = (Integer) HmlNTBBusinessURLInformationActivity.read((List) arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length();
        int length2 = str2.length();
        int size = MediaBrowserCompat$CustomActionResultReceiver.size();
        FundFactSheetActivity<String, String> read = read(str2);
        onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "$this$lastIndex");
        int size2 = MediaBrowserCompat$CustomActionResultReceiver.size() - 1;
        Collection arrayList3 = new ArrayList();
        int i = 0;
        for (Object next2 : iterable) {
            if (i >= 0) {
                String str3 = (String) next2;
                if ((i == 0 || i == size2) && GoodToKnowActivity.read(str3)) {
                    str3 = null;
                } else {
                    onGetStartedClick.write((Object) str3, "$this$drop");
                    if (intValue >= 0) {
                        int length3 = str3.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        String substring = str3.substring(length3);
                        onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.String).substring(startIndex)");
                        if (!(substring == null || (invoke = read.invoke(substring)) == null)) {
                            str3 = invoke;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Requested character count ");
                        sb.append(intValue);
                        sb.append(" is less than zero.");
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i++;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        String obj = ((StringBuilder) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList3, new StringBuilder(length + (length2 * size)), "\n", "", "", -1, "...", (FundFactSheetActivity) null)).toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return obj;
    }

    private static final int write(String str) {
        CharSequence charSequence = str;
        int length = charSequence.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char charAt = charSequence.charAt(i);
            if (!(Character.isWhitespace(charAt) || Character.isSpaceChar(charAt))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }

    private static final FundFactSheetActivity<String, String> read(String str) {
        if (str.length() == 0) {
            return C1245x5ac00d0d.read;
        }
        return new write(str);
    }

    /* renamed from: o.PartnerWebViewActivity$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<String, String> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(String str) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "line");
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(str);
            return sb.toString();
        }
    }
}

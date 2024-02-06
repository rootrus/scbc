package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.GoodToKnowActivity */
public final class GoodToKnowActivity extends LoanInputActivity {
    public static final <R> List<R> write(CharSequence charSequence, int i, int i2, boolean z, FundFactSheetActivity<? super CharSequence, ? extends R> fundFactSheetActivity) {
        onGetStartedClick.write((Object) charSequence, "$this$windowed");
        onGetStartedClick.write((Object) fundFactSheetActivity, "transform");
        AlertController$RecycleListView.read(2, 2);
        int length = charSequence.length();
        int i3 = 0;
        ArrayList arrayList = new ArrayList((length / 2) + (length % 2 == 0 ? 0 : 1));
        while (i3 >= 0 && length > i3) {
            int i4 = i3 + 2;
            arrayList.add(fundFactSheetActivity.invoke(charSequence.subSequence(i3, (i4 < 0 || i4 > length) ? length : i4)));
            i3 = i4;
        }
        return arrayList;
    }

    /* renamed from: o.GoodToKnowActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<CharSequence, String> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            onGetStartedClick.write((Object) charSequence, "it");
            return charSequence.toString();
        }
    }
}

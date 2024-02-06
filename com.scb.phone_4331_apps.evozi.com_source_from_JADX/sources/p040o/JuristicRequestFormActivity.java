package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.JuristicRequestFormActivity */
public final class JuristicRequestFormActivity extends JuristicOnboardingLandingActivity {

    /* renamed from: o.JuristicRequestFormActivity$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<T, T> {
        public static final read read = new read();

        read() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: o.JuristicRequestFormActivity$write */
    public static final class write implements Iterable<T>, FundOnboardingSuccessActivity_ViewBinding {
        private /* synthetic */ BaseJuristicPinActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;

        public write(BaseJuristicPinActivity_ViewBinding baseJuristicPinActivity_ViewBinding) {
            this.MediaBrowserCompat$CustomActionResultReceiver = baseJuristicPinActivity_ViewBinding;
        }

        public final Iterator<T> iterator() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.read();
        }
    }

    public static final <T> BaseJuristicPinActivity_ViewBinding<T> MediaBrowserCompat$ItemReceiver(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "$this$filterNotNull");
        FundFactSheetActivity fundFactSheetActivity = C1223x95592992.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "$this$filterNot");
        onGetStartedClick.write((Object) fundFactSheetActivity, "predicate");
        return new SetupScheduleActivity<>(baseJuristicPinActivity_ViewBinding, false, fundFactSheetActivity);
    }

    /* renamed from: o.JuristicRequestFormActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements BaseJuristicPinActivity_ViewBinding<T> {
        private /* synthetic */ Comparator MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ BaseJuristicPinActivity_ViewBinding MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding, Comparator comparator) {
            this.MediaBrowserCompat$ItemReceiver = baseJuristicPinActivity_ViewBinding;
            this.MediaBrowserCompat$CustomActionResultReceiver = comparator;
        }

        public final Iterator<T> read() {
            BaseJuristicPinActivity_ViewBinding baseJuristicPinActivity_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "$this$toMutableList");
            List list = (List) JuristicRequestFormActivity.read(baseJuristicPinActivity_ViewBinding, new ArrayList());
            Comparator comparator = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) list, "$this$sortWith");
            onGetStartedClick.write((Object) comparator, "comparator");
            if (list.size() > 1) {
                Collections.sort(list, comparator);
            }
            return list.iterator();
        }
    }

    public static final <T, C extends Collection<? super T>> C read(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding, C c) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "$this$toCollection");
        onGetStartedClick.write((Object) c, "destination");
        Iterator<? extends T> read2 = baseJuristicPinActivity_ViewBinding.read();
        while (read2.hasNext()) {
            c.add(read2.next());
        }
        return c;
    }

    public static final <T> List<T> MediaBrowserCompat$CustomActionResultReceiver(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "$this$toList");
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "$this$toMutableList");
        return HmlNTBBusinessURLInformationActivity.write((List) read(baseJuristicPinActivity_ViewBinding, new ArrayList()));
    }

    private static <T, A extends Appendable> A MediaBrowserCompat$ItemReceiver(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, FundFactSheetActivity<? super T, ? extends CharSequence> fundFactSheetActivity) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "$this$joinTo");
        onGetStartedClick.write((Object) a, "buffer");
        onGetStartedClick.write((Object) charSequence, "separator");
        onGetStartedClick.write((Object) charSequence2, "prefix");
        onGetStartedClick.write((Object) charSequence3, "postfix");
        onGetStartedClick.write((Object) charSequence4, "truncated");
        a.append(charSequence2);
        Iterator<? extends T> read2 = baseJuristicPinActivity_ViewBinding.read();
        int i2 = 0;
        while (read2.hasNext()) {
            Object next = read2.next();
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            GoodToKnowActivity.IconCompatParcelizer(a, next, (FundFactSheetActivity) null);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String read(BaseJuristicPinActivity_ViewBinding baseJuristicPinActivity_ViewBinding, CharSequence charSequence) {
        CharSequence charSequence2 = "";
        CharSequence charSequence3 = "";
        CharSequence charSequence4 = "...";
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "$this$joinToString");
        onGetStartedClick.write((Object) charSequence, "separator");
        onGetStartedClick.write((Object) charSequence2, "prefix");
        onGetStartedClick.write((Object) charSequence3, "postfix");
        onGetStartedClick.write((Object) charSequence4, "truncated");
        String obj = ((StringBuilder) MediaBrowserCompat$ItemReceiver(baseJuristicPinActivity_ViewBinding, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, (FundFactSheetActivity) null)).toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "joinTo(StringBuilder(), …ed, transform).toString()");
        return obj;
    }

    public static final <T> BaseJuristicPinActivity_ViewBinding<T> read(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding, int i) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "$this$take");
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return JuristicBusinessPinActivity.read;
        } else {
            if (baseJuristicPinActivity_ViewBinding instanceof onNextButtonClick) {
                return ((onNextButtonClick) baseJuristicPinActivity_ViewBinding).MediaBrowserCompat$ItemReceiver(i);
            }
            return new JuristicResetPinOtpActivity<>(baseJuristicPinActivity_ViewBinding, i);
        }
    }
}

package p040o;

import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p040o.AlertController$RecycleListView;
import p040o.EasycashSalesheetIndexActivity;
import p040o.EtbSuccessActivity;
import p040o.onBtnSendEmailVerificationClicked;

/* renamed from: o.DebitCardResetOtpActivity */
public abstract class DebitCardResetOtpActivity<T> implements DebitCardResetPinSuccessActivity_ViewBinding<T> {
    /* access modifiers changed from: protected */
    public abstract void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity);

    public static <T> DebitCardResetOtpActivity<T> amb(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(iterable, "sources is null");
        return new clickOpenAccount((DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) null, iterable);
    }

    public static <T> DebitCardResetOtpActivity<T> ambArray(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBindingArr, "sources is null");
        int length = debitCardResetPinSuccessActivity_ViewBindingArr.length;
        if (length == 0) {
            return empty();
        }
        if (length == 1) {
            return wrap(debitCardResetPinSuccessActivity_ViewBindingArr[0]);
        }
        return new clickOpenAccount(debitCardResetPinSuccessActivity_ViewBindingArr, (Iterable) null);
    }

    public static int bufferSize() {
        return DebitCardRequestReviewActivity.write();
    }

    public static <T, R> DebitCardResetOtpActivity<R> combineLatest(DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity, int i, DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        return combineLatest(debitCardResetPinSuccessActivity_ViewBindingArr, directDebitDeepLinkActivity, i);
    }

    public static <T, R> DebitCardResetOtpActivity<R> combineLatest(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity) {
        return combineLatest(iterable, directDebitDeepLinkActivity, bufferSize());
    }

    public static <T, R> DebitCardResetOtpActivity<R> combineLatest(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(iterable, "sources is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "combiner is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new DepositExportStatementActivity((DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) null, iterable, directDebitDeepLinkActivity, i << 1, false);
    }

    public static <T, R> DebitCardResetOtpActivity<R> combineLatest(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity) {
        return combineLatest(debitCardResetPinSuccessActivity_ViewBindingArr, directDebitDeepLinkActivity, bufferSize());
    }

    public static <T, R> DebitCardResetOtpActivity<R> combineLatest(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBindingArr, "sources is null");
        if (debitCardResetPinSuccessActivity_ViewBindingArr.length == 0) {
            return empty();
        }
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "combiner is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new DepositExportStatementActivity(debitCardResetPinSuccessActivity_ViewBindingArr, (Iterable) null, directDebitDeepLinkActivity, i << 1, false);
    }

    public static <T1, T2, R> DebitCardResetOtpActivity<R> combineLatest(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, ChequeManagementDeepLinkActivity<? super T1, ? super T2, ? extends R> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        return combineLatest(HmlCalculatorDeepLinkActivity.write(chequeManagementDeepLinkActivity), bufferSize(), (DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) new DebitCardResetPinSuccessActivity_ViewBinding[]{debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2});
    }

    public static <T1, T2, T3, R> DebitCardResetOtpActivity<R> combineLatest(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardDeepLinkActivity<? super T1, ? super T2, ? super T3, ? extends R> debitCardDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        return combineLatest(HmlCalculatorDeepLinkActivity.IconCompatParcelizer(debitCardDeepLinkActivity), bufferSize(), (DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) new DebitCardResetPinSuccessActivity_ViewBinding[]{debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3});
    }

    public static <T1, T2, T3, T4, R> DebitCardResetOtpActivity<R> combineLatest(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T4> debitCardResetPinSuccessActivity_ViewBinding4, ETBProductDetailDeepLinkActivity<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> eTBProductDetailDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        return combineLatest(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(eTBProductDetailDeepLinkActivity), bufferSize(), (DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) new DebitCardResetPinSuccessActivity_ViewBinding[]{debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4});
    }

    public static <T1, T2, T3, T4, T5, R> DebitCardResetOtpActivity<R> combineLatest(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T4> debitCardResetPinSuccessActivity_ViewBinding4, DebitCardResetPinSuccessActivity_ViewBinding<? extends T5> debitCardResetPinSuccessActivity_ViewBinding5, EmailVerificationAndOtpVerificationDeepLinkActivity<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> emailVerificationAndOtpVerificationDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding5, "source5 is null");
        return combineLatest(HmlCalculatorDeepLinkActivity.write(emailVerificationAndOtpVerificationDeepLinkActivity), bufferSize(), (DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) new DebitCardResetPinSuccessActivity_ViewBinding[]{debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4, debitCardResetPinSuccessActivity_ViewBinding5});
    }

    public static <T1, T2, T3, T4, T5, T6, R> DebitCardResetOtpActivity<R> combineLatest(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T4> debitCardResetPinSuccessActivity_ViewBinding4, DebitCardResetPinSuccessActivity_ViewBinding<? extends T5> debitCardResetPinSuccessActivity_ViewBinding5, DebitCardResetPinSuccessActivity_ViewBinding<? extends T6> debitCardResetPinSuccessActivity_ViewBinding6, EmailVerificationDeepLinkActivity<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> emailVerificationDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding5, "source5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding6, "source6 is null");
        return combineLatest(HmlCalculatorDeepLinkActivity.write(emailVerificationDeepLinkActivity), bufferSize(), (DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) new DebitCardResetPinSuccessActivity_ViewBinding[]{debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4, debitCardResetPinSuccessActivity_ViewBinding5, debitCardResetPinSuccessActivity_ViewBinding6});
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> DebitCardResetOtpActivity<R> combineLatest(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T4> debitCardResetPinSuccessActivity_ViewBinding4, DebitCardResetPinSuccessActivity_ViewBinding<? extends T5> debitCardResetPinSuccessActivity_ViewBinding5, DebitCardResetPinSuccessActivity_ViewBinding<? extends T6> debitCardResetPinSuccessActivity_ViewBinding6, DebitCardResetPinSuccessActivity_ViewBinding<? extends T7> debitCardResetPinSuccessActivity_ViewBinding7, EasycashDeepLinkActivity<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> easycashDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding5, "source5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding6, "source6 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding7, "source7 is null");
        return combineLatest(HmlCalculatorDeepLinkActivity.read(easycashDeepLinkActivity), bufferSize(), (DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) new DebitCardResetPinSuccessActivity_ViewBinding[]{debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4, debitCardResetPinSuccessActivity_ViewBinding5, debitCardResetPinSuccessActivity_ViewBinding6, debitCardResetPinSuccessActivity_ViewBinding7});
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> DebitCardResetOtpActivity<R> combineLatest(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T4> debitCardResetPinSuccessActivity_ViewBinding4, DebitCardResetPinSuccessActivity_ViewBinding<? extends T5> debitCardResetPinSuccessActivity_ViewBinding5, DebitCardResetPinSuccessActivity_ViewBinding<? extends T6> debitCardResetPinSuccessActivity_ViewBinding6, DebitCardResetPinSuccessActivity_ViewBinding<? extends T7> debitCardResetPinSuccessActivity_ViewBinding7, DebitCardResetPinSuccessActivity_ViewBinding<? extends T8> debitCardResetPinSuccessActivity_ViewBinding8, EasycashLoanTrackDeepLinkActivity<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> easycashLoanTrackDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding5, "source5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding6, "source6 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding7, "source7 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding8, "source8 is null");
        return combineLatest(HmlCalculatorDeepLinkActivity.write(easycashLoanTrackDeepLinkActivity), bufferSize(), (DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) new DebitCardResetPinSuccessActivity_ViewBinding[]{debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4, debitCardResetPinSuccessActivity_ViewBinding5, debitCardResetPinSuccessActivity_ViewBinding6, debitCardResetPinSuccessActivity_ViewBinding7, debitCardResetPinSuccessActivity_ViewBinding8});
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> DebitCardResetOtpActivity<R> combineLatest(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T4> debitCardResetPinSuccessActivity_ViewBinding4, DebitCardResetPinSuccessActivity_ViewBinding<? extends T5> debitCardResetPinSuccessActivity_ViewBinding5, DebitCardResetPinSuccessActivity_ViewBinding<? extends T6> debitCardResetPinSuccessActivity_ViewBinding6, DebitCardResetPinSuccessActivity_ViewBinding<? extends T7> debitCardResetPinSuccessActivity_ViewBinding7, DebitCardResetPinSuccessActivity_ViewBinding<? extends T8> debitCardResetPinSuccessActivity_ViewBinding8, DebitCardResetPinSuccessActivity_ViewBinding<? extends T9> debitCardResetPinSuccessActivity_ViewBinding9, FacebookDeepLinkActivity<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> facebookDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding5, "source5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding6, "source6 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding7, "source7 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding8, "source8 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding9, "source9 is null");
        return combineLatest(HmlCalculatorDeepLinkActivity.write(facebookDeepLinkActivity), bufferSize(), (DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) new DebitCardResetPinSuccessActivity_ViewBinding[]{debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4, debitCardResetPinSuccessActivity_ViewBinding5, debitCardResetPinSuccessActivity_ViewBinding6, debitCardResetPinSuccessActivity_ViewBinding7, debitCardResetPinSuccessActivity_ViewBinding8, debitCardResetPinSuccessActivity_ViewBinding9});
    }

    public static <T, R> DebitCardResetOtpActivity<R> combineLatestDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity) {
        return combineLatestDelayError(debitCardResetPinSuccessActivity_ViewBindingArr, directDebitDeepLinkActivity, bufferSize());
    }

    public static <T, R> DebitCardResetOtpActivity<R> combineLatestDelayError(DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity, int i, DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        return combineLatestDelayError(debitCardResetPinSuccessActivity_ViewBindingArr, directDebitDeepLinkActivity, i);
    }

    public static <T, R> DebitCardResetOtpActivity<R> combineLatestDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[] debitCardResetPinSuccessActivity_ViewBindingArr, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "combiner is null");
        if (debitCardResetPinSuccessActivity_ViewBindingArr.length == 0) {
            return empty();
        }
        return new DepositExportStatementActivity(debitCardResetPinSuccessActivity_ViewBindingArr, (Iterable) null, directDebitDeepLinkActivity, i << 1, true);
    }

    public static <T, R> DebitCardResetOtpActivity<R> combineLatestDelayError(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity) {
        return combineLatestDelayError(iterable, directDebitDeepLinkActivity, bufferSize());
    }

    public static <T, R> DebitCardResetOtpActivity<R> combineLatestDelayError(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(iterable, "sources is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "combiner is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new DepositExportStatementActivity((DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) null, iterable, directDebitDeepLinkActivity, i << 1, true);
    }

    public static <T> DebitCardResetOtpActivity<T> concat(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), bufferSize(), false);
    }

    public static <T> DebitCardResetOtpActivity<T> concat(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding) {
        return concat(debitCardResetPinSuccessActivity_ViewBinding, bufferSize());
    }

    public static <T> DebitCardResetOtpActivity<T> concat(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "sources is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "prefetch");
        return new onButtonDoneClick(debitCardResetPinSuccessActivity_ViewBinding, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), i, HmlBusinessOccupationInfoActivity.IMMEDIATE);
    }

    public static <T> DebitCardResetOtpActivity<T> concat(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        return concatArray(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2);
    }

    public static <T> DebitCardResetOtpActivity<T> concat(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding3) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        return concatArray(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3);
    }

    public static <T> DebitCardResetOtpActivity<T> concat(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding4) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        return concatArray(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4);
    }

    public static <T> DebitCardResetOtpActivity<T> concatArray(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        if (debitCardResetPinSuccessActivity_ViewBindingArr.length == 0) {
            return empty();
        }
        if (debitCardResetPinSuccessActivity_ViewBindingArr.length == 1) {
            return wrap(debitCardResetPinSuccessActivity_ViewBindingArr[0]);
        }
        return new onButtonDoneClick(fromArray(debitCardResetPinSuccessActivity_ViewBindingArr), HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), bufferSize(), HmlBusinessOccupationInfoActivity.BOUNDARY);
    }

    public static <T> DebitCardResetOtpActivity<T> concatArrayDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        if (debitCardResetPinSuccessActivity_ViewBindingArr.length == 0) {
            return empty();
        }
        if (debitCardResetPinSuccessActivity_ViewBindingArr.length == 1) {
            return wrap(debitCardResetPinSuccessActivity_ViewBindingArr[0]);
        }
        return concatDelayError(fromArray(debitCardResetPinSuccessActivity_ViewBindingArr));
    }

    public static <T> DebitCardResetOtpActivity<T> concatArrayEager(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        return concatArrayEager(bufferSize(), bufferSize(), debitCardResetPinSuccessActivity_ViewBindingArr);
    }

    public static <T> DebitCardResetOtpActivity<T> concatArrayEager(int i, int i2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        return fromArray(debitCardResetPinSuccessActivity_ViewBindingArr).concatMapEagerDelayError(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), i, i2, false);
    }

    public static <T> DebitCardResetOtpActivity<T> concatArrayEagerDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), debitCardResetPinSuccessActivity_ViewBindingArr);
    }

    public static <T> DebitCardResetOtpActivity<T> concatArrayEagerDelayError(int i, int i2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        return fromArray(debitCardResetPinSuccessActivity_ViewBindingArr).concatMapEagerDelayError(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), i, i2, true);
    }

    public static <T> DebitCardResetOtpActivity<T> concatDelayError(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> DebitCardResetOtpActivity<T> concatDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding) {
        return concatDelayError(debitCardResetPinSuccessActivity_ViewBinding, bufferSize(), true);
    }

    public static <T> DebitCardResetOtpActivity<T> concatDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding, int i, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "sources is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "prefetch is null");
        return new onButtonDoneClick(debitCardResetPinSuccessActivity_ViewBinding, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), i, z ? HmlBusinessOccupationInfoActivity.END : HmlBusinessOccupationInfoActivity.BOUNDARY);
    }

    public static <T> DebitCardResetOtpActivity<T> concatEager(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding) {
        return concatEager(debitCardResetPinSuccessActivity_ViewBinding, bufferSize(), bufferSize());
    }

    public static <T> DebitCardResetOtpActivity<T> concatEager(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding, int i, int i2) {
        return wrap(debitCardResetPinSuccessActivity_ViewBinding).concatMapEager(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), i, i2);
    }

    public static <T> DebitCardResetOtpActivity<T> concatEager(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> DebitCardResetOtpActivity<T> concatEager(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).concatMapEagerDelayError(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), i, i2, false);
    }

    public static <T> DebitCardResetOtpActivity<T> create(AccountSummaryDeepLinkActivity<T> accountSummaryDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(accountSummaryDeepLinkActivity, "source is null");
        return new DepositExportStatementActivity_ViewBinding(accountSummaryDeepLinkActivity);
    }

    public static <T> DebitCardResetOtpActivity<T> defer(Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> callable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "supplier is null");
        return new DirectDebitReviewActivity(callable);
    }

    public static <T> DebitCardResetOtpActivity<T> empty() {
        return onCalculateClick.MediaBrowserCompat$ItemReceiver;
    }

    public static <T> DebitCardResetOtpActivity<T> error(Callable<? extends Throwable> callable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "errorSupplier is null");
        return new lambda$setListener$1$EasycashCollateralInformationActivity(callable);
    }

    public static <T> DebitCardResetOtpActivity<T> error(Throwable th) {
        HmlLatestPersonalInformationDeepLinkActivity.write(th, "exception is null");
        return error((Callable<? extends Throwable>) HmlCalculatorDeepLinkActivity.read(th));
    }

    public static <T> DebitCardResetOtpActivity<T> fromArray(T... tArr) {
        HmlLatestPersonalInformationDeepLinkActivity.write(tArr, "items is null");
        if (tArr.length == 0) {
            return empty();
        }
        if (tArr.length == 1) {
            return just(tArr[0]);
        }
        return new EasycashLoanTrackActivity(tArr);
    }

    public static <T> DebitCardResetOtpActivity<T> fromCallable(Callable<? extends T> callable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "supplier is null");
        return new EasycashLandingActivity(callable);
    }

    public static <T> DebitCardResetOtpActivity<T> fromFuture(Future<? extends T> future) {
        HmlLatestPersonalInformationDeepLinkActivity.write(future, "future is null");
        return new setViewNoLoan(future, 0, (TimeUnit) null);
    }

    public static <T> DebitCardResetOtpActivity<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        HmlLatestPersonalInformationDeepLinkActivity.write(future, "future is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        return new setViewNoLoan(future, j, timeUnit);
    }

    public static <T> DebitCardResetOtpActivity<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return fromFuture(future, j, timeUnit).subscribeOn(bankingAgentDeepLinkActivity);
    }

    public static <T> DebitCardResetOtpActivity<T> fromFuture(Future<? extends T> future, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return fromFuture(future).subscribeOn(bankingAgentDeepLinkActivity);
    }

    public static <T> DebitCardResetOtpActivity<T> fromIterable(Iterable<? extends T> iterable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(iterable, "source is null");
        return new EasycashIssuerSearchActivity(iterable);
    }

    public static <T> DebitCardResetOtpActivity<T> fromPublisher(InformationPanelAdapter$ItemHolder_ViewBinding<? extends T> informationPanelAdapter$ItemHolder_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(informationPanelAdapter$ItemHolder_ViewBinding, "publisher is null");
        return new EasycashInputIncomeActivity(informationPanelAdapter$ItemHolder_ViewBinding);
    }

    public static <T> DebitCardResetOtpActivity<T> generate(DebitCardMarketConductDeepLinkActivity<DebitCardLandingActivity<T>> debitCardMarketConductDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity, "generator is null");
        return generate(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$MediaItem(), new EasycashSalesheetIndexActivity$MediaSessionCompat$QueueItem(debitCardMarketConductDeepLinkActivity), HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public static <T, S> DebitCardResetOtpActivity<T> generate(Callable<S> callable, CreditCardDeepLinkActivity<S, DebitCardLandingActivity<T>> creditCardDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(creditCardDeepLinkActivity, "generator is null");
        return generate(callable, new EasycashSalesheetIndexActivity$MediaSessionCompat$Token(creditCardDeepLinkActivity), HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public static <T, S> DebitCardResetOtpActivity<T> generate(Callable<S> callable, CreditCardDeepLinkActivity<S, DebitCardLandingActivity<T>> creditCardDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super S> debitCardMarketConductDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(creditCardDeepLinkActivity, "generator is null");
        return generate(callable, new EasycashSalesheetIndexActivity$MediaSessionCompat$Token(creditCardDeepLinkActivity), debitCardMarketConductDeepLinkActivity);
    }

    public static <T, S> DebitCardResetOtpActivity<T> generate(Callable<S> callable, ChequeManagementDeepLinkActivity<S, DebitCardLandingActivity<T>, S> chequeManagementDeepLinkActivity) {
        return generate(callable, chequeManagementDeepLinkActivity, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public static <T, S> DebitCardResetOtpActivity<T> generate(Callable<S> callable, ChequeManagementDeepLinkActivity<S, DebitCardLandingActivity<T>, S> chequeManagementDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super S> debitCardMarketConductDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "initialState is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(chequeManagementDeepLinkActivity, "generator is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity, "disposeState is null");
        return new EasycashNCBConsentActivity(callable, chequeManagementDeepLinkActivity, debitCardMarketConductDeepLinkActivity);
    }

    public static DebitCardResetOtpActivity<Long> interval(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, HmlETBLandingActivity.read());
    }

    public static DebitCardResetOtpActivity<Long> interval(long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return new EasycashSubDistrictSearchActivity(Math.max(0, j), Math.max(0, j2), timeUnit, bankingAgentDeepLinkActivity);
    }

    public static DebitCardResetOtpActivity<Long> interval(long j, TimeUnit timeUnit) {
        return interval(j, j, timeUnit, HmlETBLandingActivity.read());
    }

    public static DebitCardResetOtpActivity<Long> interval(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return interval(j, j, timeUnit, bankingAgentDeepLinkActivity);
    }

    public static DebitCardResetOtpActivity<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return intervalRange(j, j2, j3, j4, timeUnit, HmlETBLandingActivity.read());
    }

    public static DebitCardResetOtpActivity<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        long j5 = j2;
        long j6 = j3;
        TimeUnit timeUnit2 = timeUnit;
        BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity2 = bankingAgentDeepLinkActivity;
        int i = (j5 > 0 ? 1 : (j5 == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(j5);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return empty().delay(j6, timeUnit2, bankingAgentDeepLinkActivity2);
        } else {
            long j7 = j + (j5 - 1);
            if (j <= 0 || j7 >= 0) {
                HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit2, "unit is null");
                HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity2, "scheduler is null");
                return new EasycashSuccessActivity(j, j7, Math.max(0, j6), Math.max(0, j4), timeUnit, bankingAgentDeepLinkActivity);
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }

    public static <T> DebitCardResetOtpActivity<T> just(T t) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item is null");
        return new NTBEasycashReferralSendProductActivity(t);
    }

    public static <T> DebitCardResetOtpActivity<T> just(T t, T t2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t2, "item2 is null");
        return fromArray(t, t2);
    }

    public static <T> DebitCardResetOtpActivity<T> just(T t, T t2, T t3) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t2, "item2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t3, "item3 is null");
        return fromArray(t, t2, t3);
    }

    public static <T> DebitCardResetOtpActivity<T> just(T t, T t2, T t3, T t4) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t2, "item2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t3, "item3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t4, "item4 is null");
        return fromArray(t, t2, t3, t4);
    }

    public static <T> DebitCardResetOtpActivity<T> just(T t, T t2, T t3, T t4, T t5) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t2, "item2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t3, "item3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t4, "item4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t5, "item5 is null");
        return fromArray(t, t2, t3, t4, t5);
    }

    public static <T> DebitCardResetOtpActivity<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t2, "item2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t3, "item3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t4, "item4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t5, "item5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t6, "item6 is null");
        return fromArray(t, t2, t3, t4, t5, t6);
    }

    public static <T> DebitCardResetOtpActivity<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t2, "item2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t3, "item3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t4, "item4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t5, "item5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t6, "item6 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t7, "item7 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7);
    }

    public static <T> DebitCardResetOtpActivity<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t2, "item2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t3, "item3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t4, "item4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t5, "item5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t6, "item6 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t7, "item7 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t8, "item8 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T> DebitCardResetOtpActivity<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t2, "item2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t3, "item3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t4, "item4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t5, "item5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t6, "item6 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t7, "item7 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t8, "item8 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t9, "item9 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    public static <T> DebitCardResetOtpActivity<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t2, "item2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t3, "item3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t4, "item4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t5, "item5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t6, "item6 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t7, "item7 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t8, "item8 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t9, "item9 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(t10, "item10 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    public static <T> DebitCardResetOtpActivity<T> merge(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), false, i, i2);
    }

    public static <T> DebitCardResetOtpActivity<T> mergeArray(int i, int i2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        return fromArray(debitCardResetPinSuccessActivity_ViewBindingArr).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), false, i, i2);
    }

    public static <T> DebitCardResetOtpActivity<T> merge(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver());
    }

    public static <T> DebitCardResetOtpActivity<T> merge(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), i);
    }

    public static <T> DebitCardResetOtpActivity<T> merge(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "sources is null");
        return new EasycashCarInformationActivity_ViewBinding(debitCardResetPinSuccessActivity_ViewBinding, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), false, Api.BaseClientBuilder.API_PRIORITY_OTHER, bufferSize());
    }

    public static <T> DebitCardResetOtpActivity<T> merge(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "sources is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "maxConcurrency");
        return new EasycashCarInformationActivity_ViewBinding(debitCardResetPinSuccessActivity_ViewBinding, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), false, i, bufferSize());
    }

    public static <T> DebitCardResetOtpActivity<T> merge(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        return fromArray(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), false, 2);
    }

    public static <T> DebitCardResetOtpActivity<T> merge(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding3) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        return fromArray(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), false, 3);
    }

    public static <T> DebitCardResetOtpActivity<T> merge(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding4) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        return fromArray(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), false, 4);
    }

    public static <T> DebitCardResetOtpActivity<T> mergeArray(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        return fromArray(debitCardResetPinSuccessActivity_ViewBindingArr).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), debitCardResetPinSuccessActivity_ViewBindingArr.length);
    }

    public static <T> DebitCardResetOtpActivity<T> mergeDelayError(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), true);
    }

    public static <T> DebitCardResetOtpActivity<T> mergeDelayError(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), true, i, i2);
    }

    public static <T> DebitCardResetOtpActivity<T> mergeArrayDelayError(int i, int i2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        return fromArray(debitCardResetPinSuccessActivity_ViewBindingArr).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), true, i, i2);
    }

    public static <T> DebitCardResetOtpActivity<T> mergeDelayError(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), true, i);
    }

    public static <T> DebitCardResetOtpActivity<T> mergeDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "sources is null");
        return new EasycashCarInformationActivity_ViewBinding(debitCardResetPinSuccessActivity_ViewBinding, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), true, Api.BaseClientBuilder.API_PRIORITY_OTHER, bufferSize());
    }

    public static <T> DebitCardResetOtpActivity<T> mergeDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "sources is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "maxConcurrency");
        return new EasycashCarInformationActivity_ViewBinding(debitCardResetPinSuccessActivity_ViewBinding, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), true, i, bufferSize());
    }

    public static <T> DebitCardResetOtpActivity<T> mergeDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        return fromArray(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), true, 2);
    }

    public static <T> DebitCardResetOtpActivity<T> mergeDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding3) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        return fromArray(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), true, 3);
    }

    public static <T> DebitCardResetOtpActivity<T> mergeDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding4) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        return fromArray(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), true, 4);
    }

    public static <T> DebitCardResetOtpActivity<T> mergeArrayDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        return fromArray(debitCardResetPinSuccessActivity_ViewBindingArr).flatMap(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), true, debitCardResetPinSuccessActivity_ViewBindingArr.length);
    }

    public static <T> DebitCardResetOtpActivity<T> never() {
        return EasycashPurposefulLoanIntroductionActivity.MediaBrowserCompat$ItemReceiver;
    }

    public static DebitCardResetOtpActivity<Integer> range(int i, int i2) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 == 0) {
            return empty();
        } else {
            if (i2 == 1) {
                return just(Integer.valueOf(i));
            }
            if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
                return new EasycashSequentialSearchActivity(i, i2);
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    public static DebitCardResetOtpActivity<Long> rangeLong(long j, long j2) {
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return empty();
        } else {
            if (j2 == 1) {
                return just(Long.valueOf(j));
            }
            if (j <= 0 || (j2 - 1) + j >= 0) {
                return new EBillSubscriptionReviewActivity(j, j2);
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }

    public static <T> BScanCNotificationDeepLinkActivity<Boolean> sequenceEqual(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2) {
        return sequenceEqual(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(), bufferSize());
    }

    public static <T> BScanCNotificationDeepLinkActivity<Boolean> sequenceEqual(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, CreditCardServiceTabDeepLinkActivity<? super T, ? super T> creditCardServiceTabDeepLinkActivity) {
        return sequenceEqual(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, creditCardServiceTabDeepLinkActivity, bufferSize());
    }

    public static <T> BScanCNotificationDeepLinkActivity<Boolean> sequenceEqual(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, CreditCardServiceTabDeepLinkActivity<? super T, ? super T> creditCardServiceTabDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(creditCardServiceTabDeepLinkActivity, "isEqual is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new ManageEmailVerificationSuccessActivity(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, creditCardServiceTabDeepLinkActivity, i);
    }

    public static <T> BScanCNotificationDeepLinkActivity<Boolean> sequenceEqual(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, int i) {
        return sequenceEqual(debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(), i);
    }

    public static <T> DebitCardResetOtpActivity<T> switchOnNext(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "sources is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new ETBSetDetailNoteActivity(debitCardResetPinSuccessActivity_ViewBinding, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), i, false);
    }

    public static <T> DebitCardResetOtpActivity<T> switchOnNext(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding) {
        return switchOnNext(debitCardResetPinSuccessActivity_ViewBinding, bufferSize());
    }

    public static <T> DebitCardResetOtpActivity<T> switchOnNextDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding) {
        return switchOnNextDelayError(debitCardResetPinSuccessActivity_ViewBinding, bufferSize());
    }

    public static <T> DebitCardResetOtpActivity<T> switchOnNextDelayError(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "sources is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "prefetch");
        return new ETBSetDetailNoteActivity(debitCardResetPinSuccessActivity_ViewBinding, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), i, true);
    }

    public static DebitCardResetOtpActivity<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, HmlETBLandingActivity.read());
    }

    public static DebitCardResetOtpActivity<Long> timer(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return new PdfViewerActivity(Math.max(j, 0), timeUnit, bankingAgentDeepLinkActivity);
    }

    public static <T> DebitCardResetOtpActivity<T> unsafeCreate(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "onSubscribe is null");
        if (!(debitCardResetPinSuccessActivity_ViewBinding instanceof DebitCardResetOtpActivity)) {
            return new EasycashLoanTrackActivity_ViewBinding(debitCardResetPinSuccessActivity_ViewBinding);
        }
        throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
    }

    public static <T, D> DebitCardResetOtpActivity<T> using(Callable<? extends D> callable, DirectDebitDeepLinkActivity<? super D, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> directDebitDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super D> debitCardMarketConductDeepLinkActivity) {
        return using(callable, directDebitDeepLinkActivity, debitCardMarketConductDeepLinkActivity, true);
    }

    public static <T, D> DebitCardResetOtpActivity<T> using(Callable<? extends D> callable, DirectDebitDeepLinkActivity<? super D, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> directDebitDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super D> debitCardMarketConductDeepLinkActivity, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "resourceSupplier is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "sourceSupplier is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity, "disposer is null");
        return new FastPaySuccessActivity(callable, directDebitDeepLinkActivity, debitCardMarketConductDeepLinkActivity, z);
    }

    public static <T> DebitCardResetOtpActivity<T> wrap(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source is null");
        if (debitCardResetPinSuccessActivity_ViewBinding instanceof DebitCardResetOtpActivity) {
            return (DebitCardResetOtpActivity) debitCardResetPinSuccessActivity_ViewBinding;
        }
        return new EasycashLoanTrackActivity_ViewBinding(debitCardResetPinSuccessActivity_ViewBinding);
    }

    public static <T, R> DebitCardResetOtpActivity<R> zip(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "zipper is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(iterable, "sources is null");
        return new ManageFastPayQrScanActivity_ViewBinding((DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) null, iterable, directDebitDeepLinkActivity, bufferSize(), false);
    }

    public static <T, R> DebitCardResetOtpActivity<R> zip(DebitCardResetPinSuccessActivity_ViewBinding<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "zipper is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "sources is null");
        return new FastPayBillPaymentReviewActivity(debitCardResetPinSuccessActivity_ViewBinding).flatMap(new C9726x8dfbb5c4(directDebitDeepLinkActivity));
    }

    public static <T1, T2, R> DebitCardResetOtpActivity<R> zip(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, ChequeManagementDeepLinkActivity<? super T1, ? super T2, ? extends R> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        return zipArray(HmlCalculatorDeepLinkActivity.write(chequeManagementDeepLinkActivity), false, bufferSize(), debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2);
    }

    public static <T1, T2, R> DebitCardResetOtpActivity<R> zip(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, ChequeManagementDeepLinkActivity<? super T1, ? super T2, ? extends R> chequeManagementDeepLinkActivity, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        return zipArray(HmlCalculatorDeepLinkActivity.write(chequeManagementDeepLinkActivity), z, bufferSize(), debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2);
    }

    public static <T1, T2, R> DebitCardResetOtpActivity<R> zip(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, ChequeManagementDeepLinkActivity<? super T1, ? super T2, ? extends R> chequeManagementDeepLinkActivity, boolean z, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        return zipArray(HmlCalculatorDeepLinkActivity.write(chequeManagementDeepLinkActivity), z, i, debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2);
    }

    public static <T1, T2, T3, R> DebitCardResetOtpActivity<R> zip(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardDeepLinkActivity<? super T1, ? super T2, ? super T3, ? extends R> debitCardDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        return zipArray(HmlCalculatorDeepLinkActivity.IconCompatParcelizer(debitCardDeepLinkActivity), false, bufferSize(), debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3);
    }

    public static <T1, T2, T3, T4, R> DebitCardResetOtpActivity<R> zip(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T4> debitCardResetPinSuccessActivity_ViewBinding4, ETBProductDetailDeepLinkActivity<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> eTBProductDetailDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        return zipArray(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(eTBProductDetailDeepLinkActivity), false, bufferSize(), debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4);
    }

    public static <T1, T2, T3, T4, T5, R> DebitCardResetOtpActivity<R> zip(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T4> debitCardResetPinSuccessActivity_ViewBinding4, DebitCardResetPinSuccessActivity_ViewBinding<? extends T5> debitCardResetPinSuccessActivity_ViewBinding5, EmailVerificationAndOtpVerificationDeepLinkActivity<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> emailVerificationAndOtpVerificationDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding5, "source5 is null");
        return zipArray(HmlCalculatorDeepLinkActivity.write(emailVerificationAndOtpVerificationDeepLinkActivity), false, bufferSize(), debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4, debitCardResetPinSuccessActivity_ViewBinding5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> DebitCardResetOtpActivity<R> zip(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T4> debitCardResetPinSuccessActivity_ViewBinding4, DebitCardResetPinSuccessActivity_ViewBinding<? extends T5> debitCardResetPinSuccessActivity_ViewBinding5, DebitCardResetPinSuccessActivity_ViewBinding<? extends T6> debitCardResetPinSuccessActivity_ViewBinding6, EmailVerificationDeepLinkActivity<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> emailVerificationDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding5, "source5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding6, "source6 is null");
        return zipArray(HmlCalculatorDeepLinkActivity.write(emailVerificationDeepLinkActivity), false, bufferSize(), debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4, debitCardResetPinSuccessActivity_ViewBinding5, debitCardResetPinSuccessActivity_ViewBinding6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> DebitCardResetOtpActivity<R> zip(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T4> debitCardResetPinSuccessActivity_ViewBinding4, DebitCardResetPinSuccessActivity_ViewBinding<? extends T5> debitCardResetPinSuccessActivity_ViewBinding5, DebitCardResetPinSuccessActivity_ViewBinding<? extends T6> debitCardResetPinSuccessActivity_ViewBinding6, DebitCardResetPinSuccessActivity_ViewBinding<? extends T7> debitCardResetPinSuccessActivity_ViewBinding7, EasycashDeepLinkActivity<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> easycashDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding5, "source5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding6, "source6 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding7, "source7 is null");
        return zipArray(HmlCalculatorDeepLinkActivity.read(easycashDeepLinkActivity), false, bufferSize(), debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4, debitCardResetPinSuccessActivity_ViewBinding5, debitCardResetPinSuccessActivity_ViewBinding6, debitCardResetPinSuccessActivity_ViewBinding7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> DebitCardResetOtpActivity<R> zip(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T4> debitCardResetPinSuccessActivity_ViewBinding4, DebitCardResetPinSuccessActivity_ViewBinding<? extends T5> debitCardResetPinSuccessActivity_ViewBinding5, DebitCardResetPinSuccessActivity_ViewBinding<? extends T6> debitCardResetPinSuccessActivity_ViewBinding6, DebitCardResetPinSuccessActivity_ViewBinding<? extends T7> debitCardResetPinSuccessActivity_ViewBinding7, DebitCardResetPinSuccessActivity_ViewBinding<? extends T8> debitCardResetPinSuccessActivity_ViewBinding8, EasycashLoanTrackDeepLinkActivity<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> easycashLoanTrackDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding5, "source5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding6, "source6 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding7, "source7 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding8, "source8 is null");
        return zipArray(HmlCalculatorDeepLinkActivity.write(easycashLoanTrackDeepLinkActivity), false, bufferSize(), debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4, debitCardResetPinSuccessActivity_ViewBinding5, debitCardResetPinSuccessActivity_ViewBinding6, debitCardResetPinSuccessActivity_ViewBinding7, debitCardResetPinSuccessActivity_ViewBinding8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> DebitCardResetOtpActivity<R> zip(DebitCardResetPinSuccessActivity_ViewBinding<? extends T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<? extends T4> debitCardResetPinSuccessActivity_ViewBinding4, DebitCardResetPinSuccessActivity_ViewBinding<? extends T5> debitCardResetPinSuccessActivity_ViewBinding5, DebitCardResetPinSuccessActivity_ViewBinding<? extends T6> debitCardResetPinSuccessActivity_ViewBinding6, DebitCardResetPinSuccessActivity_ViewBinding<? extends T7> debitCardResetPinSuccessActivity_ViewBinding7, DebitCardResetPinSuccessActivity_ViewBinding<? extends T8> debitCardResetPinSuccessActivity_ViewBinding8, DebitCardResetPinSuccessActivity_ViewBinding<? extends T9> debitCardResetPinSuccessActivity_ViewBinding9, FacebookDeepLinkActivity<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> facebookDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "source2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "source3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "source4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding5, "source5 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding6, "source6 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding7, "source7 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding8, "source8 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding9, "source9 is null");
        return zipArray(HmlCalculatorDeepLinkActivity.write(facebookDeepLinkActivity), false, bufferSize(), debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4, debitCardResetPinSuccessActivity_ViewBinding5, debitCardResetPinSuccessActivity_ViewBinding6, debitCardResetPinSuccessActivity_ViewBinding7, debitCardResetPinSuccessActivity_ViewBinding8, debitCardResetPinSuccessActivity_ViewBinding9);
    }

    public static <T, R> DebitCardResetOtpActivity<R> zipArray(DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity, boolean z, int i, DebitCardResetPinSuccessActivity_ViewBinding<? extends T>... debitCardResetPinSuccessActivity_ViewBindingArr) {
        if (debitCardResetPinSuccessActivity_ViewBindingArr.length == 0) {
            return empty();
        }
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "zipper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new ManageFastPayQrScanActivity_ViewBinding(debitCardResetPinSuccessActivity_ViewBindingArr, (Iterable) null, directDebitDeepLinkActivity, i, z);
    }

    public static <T, R> DebitCardResetOtpActivity<R> zipIterable(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> iterable, DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity, boolean z, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "zipper is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(iterable, "sources is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new ManageFastPayQrScanActivity_ViewBinding((DebitCardResetPinSuccessActivity_ViewBinding<? extends T>[]) null, iterable, directDebitDeepLinkActivity, i, z);
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> all(HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(hmlBaseDeepLinkActivity, "predicate is null");
        return new clickSwitchToThai(this, hmlBaseDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> ambWith(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        return ambArray(this, debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> any(HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(hmlBaseDeepLinkActivity, "predicate is null");
        return new onNavigateBack(this, hmlBaseDeepLinkActivity);
    }

    /* renamed from: as */
    public final <R> R mo16327as(DebitCardSuccessfulActivationActivity<T, ? extends R> debitCardSuccessfulActivationActivity) {
        return ((DebitCardSuccessfulActivationActivity) HmlLatestPersonalInformationDeepLinkActivity.write(debitCardSuccessfulActivationActivity, "converter is null")).MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final T blockingFirst() {
        JustForYouDeepLinkActivity justForYouDeepLinkActivity = new JustForYouDeepLinkActivity();
        subscribe(justForYouDeepLinkActivity);
        T MediaBrowserCompat$CustomActionResultReceiver = justForYouDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NoSuchElementException();
    }

    public final T blockingFirst(T t) {
        JustForYouDeepLinkActivity justForYouDeepLinkActivity = new JustForYouDeepLinkActivity();
        subscribe(justForYouDeepLinkActivity);
        T MediaBrowserCompat$CustomActionResultReceiver = justForYouDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver();
        return MediaBrowserCompat$CustomActionResultReceiver != null ? MediaBrowserCompat$CustomActionResultReceiver : t;
    }

    public final void blockingForEach(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity) {
        Iterator it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                debitCardMarketConductDeepLinkActivity.IconCompatParcelizer(it.next());
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                ((BulkTransferDeepLinkActivity) it).dispose();
                throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
            }
        }
    }

    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final Iterable<T> blockingIterable(int i) {
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new clickCustomer(this, i);
    }

    public final T blockingLast() {
        ManageEmailDeepLinkActivity manageEmailDeepLinkActivity = new ManageEmailDeepLinkActivity();
        subscribe(manageEmailDeepLinkActivity);
        T MediaBrowserCompat$CustomActionResultReceiver = manageEmailDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NoSuchElementException();
    }

    public final T blockingLast(T t) {
        ManageEmailDeepLinkActivity manageEmailDeepLinkActivity = new ManageEmailDeepLinkActivity();
        subscribe(manageEmailDeepLinkActivity);
        T MediaBrowserCompat$CustomActionResultReceiver = manageEmailDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver();
        return MediaBrowserCompat$CustomActionResultReceiver != null ? MediaBrowserCompat$CustomActionResultReceiver : t;
    }

    public final Iterable<T> blockingLatest() {
        return new clickNotSure(this);
    }

    public final Iterable<T> blockingMostRecent(T t) {
        return new clickNonCustomer(this, t);
    }

    public final Iterable<T> blockingNext() {
        return new clickSwitchToEng(this);
    }

    public final T blockingSingle() {
        T read = singleElement().read();
        if (read != null) {
            return read;
        }
        throw new NoSuchElementException();
    }

    public final T blockingSingle(T t) {
        BScanCNotificationDeepLinkActivity single = single(t);
        LoanDeepLinkActivity loanDeepLinkActivity = new LoanDeepLinkActivity();
        single.IconCompatParcelizer(loanDeepLinkActivity);
        return loanDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new OpenAccountDeepLinkActivity());
    }

    public final void blockingSubscribe(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity) {
        AlertController$RecycleListView.IconCompatParcelizer(this, debitCardMarketConductDeepLinkActivity, (DebitCardMarketConductDeepLinkActivity<? super Throwable>) HmlCalculatorDeepLinkActivity.write, HmlCalculatorDeepLinkActivity.read);
    }

    public final void blockingSubscribe(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2) {
        AlertController$RecycleListView.IconCompatParcelizer(this, debitCardMarketConductDeepLinkActivity, debitCardMarketConductDeepLinkActivity2, HmlCalculatorDeepLinkActivity.read);
    }

    public final void blockingSubscribe(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        AlertController$RecycleListView.IconCompatParcelizer(this, debitCardMarketConductDeepLinkActivity, debitCardMarketConductDeepLinkActivity2, dataPrivacyManagementDeepLinkActivity);
    }

    public final void blockingSubscribe(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this, bankingAgentTransactionsDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<List<T>> buffer(int i) {
        return buffer(i, i);
    }

    public final DebitCardResetOtpActivity<List<T>> buffer(int i, int i2) {
        return buffer(i, i2, HmlBusinessAddressActivity.IconCompatParcelizer());
    }

    public final <U extends Collection<? super T>> DebitCardResetOtpActivity<U> buffer(int i, int i2, Callable<U> callable) {
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "count");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i2, "skip");
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "bufferSupplier is null");
        return new clickLoan(this, i, i2, callable);
    }

    public final <U extends Collection<? super T>> DebitCardResetOtpActivity<U> buffer(int i, Callable<U> callable) {
        return buffer(i, i, callable);
    }

    public final DebitCardResetOtpActivity<List<T>> buffer(long j, long j2, TimeUnit timeUnit) {
        return buffer(j, j2, timeUnit, HmlETBLandingActivity.read(), HmlBusinessAddressActivity.IconCompatParcelizer());
    }

    public final DebitCardResetOtpActivity<List<T>> buffer(long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return buffer(j, j2, timeUnit, bankingAgentDeepLinkActivity, HmlBusinessAddressActivity.IconCompatParcelizer());
    }

    public final <U extends Collection<? super T>> DebitCardResetOtpActivity<U> buffer(long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, Callable<U> callable) {
        TimeUnit timeUnit2 = timeUnit;
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit2, "unit is null");
        BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity2 = bankingAgentDeepLinkActivity;
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity2, "scheduler is null");
        Callable<U> callable2 = callable;
        HmlLatestPersonalInformationDeepLinkActivity.write(callable2, "bufferSupplier is null");
        return new WelcomeAboardActivity_ViewBinding(this, j, j2, timeUnit2, bankingAgentDeepLinkActivity2, callable2, Api.BaseClientBuilder.API_PRIORITY_OTHER, false);
    }

    public final DebitCardResetOtpActivity<List<T>> buffer(long j, TimeUnit timeUnit) {
        return buffer(j, timeUnit, HmlETBLandingActivity.read(), (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final DebitCardResetOtpActivity<List<T>> buffer(long j, TimeUnit timeUnit, int i) {
        return buffer(j, timeUnit, HmlETBLandingActivity.read(), i);
    }

    public final DebitCardResetOtpActivity<List<T>> buffer(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, int i) {
        return buffer(j, timeUnit, bankingAgentDeepLinkActivity, i, HmlBusinessAddressActivity.IconCompatParcelizer(), false);
    }

    public final <U extends Collection<? super T>> DebitCardResetOtpActivity<U> buffer(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, int i, Callable<U> callable, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity2 = bankingAgentDeepLinkActivity;
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity2, "scheduler is null");
        Callable<U> callable2 = callable;
        HmlLatestPersonalInformationDeepLinkActivity.write(callable2, "bufferSupplier is null");
        int i2 = i;
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i2, "count");
        return new WelcomeAboardActivity_ViewBinding(this, j, j, timeUnit, bankingAgentDeepLinkActivity2, callable2, i2, z);
    }

    public final DebitCardResetOtpActivity<List<T>> buffer(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return buffer(j, timeUnit, bankingAgentDeepLinkActivity, Api.BaseClientBuilder.API_PRIORITY_OTHER, HmlBusinessAddressActivity.IconCompatParcelizer(), false);
    }

    public final <TOpening, TClosing> DebitCardResetOtpActivity<List<T>> buffer(DebitCardResetPinSuccessActivity_ViewBinding<? extends TOpening> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super TOpening, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends TClosing>> directDebitDeepLinkActivity) {
        return buffer(debitCardResetPinSuccessActivity_ViewBinding, directDebitDeepLinkActivity, HmlBusinessAddressActivity.IconCompatParcelizer());
    }

    public final <TOpening, TClosing, U extends Collection<? super T>> DebitCardResetOtpActivity<U> buffer(DebitCardResetPinSuccessActivity_ViewBinding<? extends TOpening> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super TOpening, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends TClosing>> directDebitDeepLinkActivity, Callable<U> callable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "openingIndicator is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "closingIndicator is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "bufferSupplier is null");
        return new clickExplore(this, debitCardResetPinSuccessActivity_ViewBinding, directDebitDeepLinkActivity, callable);
    }

    public final <B> DebitCardResetOtpActivity<List<T>> buffer(DebitCardResetPinSuccessActivity_ViewBinding<B> debitCardResetPinSuccessActivity_ViewBinding) {
        return buffer(debitCardResetPinSuccessActivity_ViewBinding, HmlBusinessAddressActivity.IconCompatParcelizer());
    }

    public final <B> DebitCardResetOtpActivity<List<T>> buffer(DebitCardResetPinSuccessActivity_ViewBinding<B> debitCardResetPinSuccessActivity_ViewBinding, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "initialCapacity");
        return buffer(debitCardResetPinSuccessActivity_ViewBinding, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i));
    }

    public final <B, U extends Collection<? super T>> DebitCardResetOtpActivity<U> buffer(DebitCardResetPinSuccessActivity_ViewBinding<B> debitCardResetPinSuccessActivity_ViewBinding, Callable<U> callable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "boundary is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "bufferSupplier is null");
        return new DepositDetailActivity_ViewBinding(this, debitCardResetPinSuccessActivity_ViewBinding, callable);
    }

    public final <B> DebitCardResetOtpActivity<List<T>> buffer(Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<B>> callable) {
        return buffer(callable, HmlBusinessAddressActivity.IconCompatParcelizer());
    }

    public final <B, U extends Collection<? super T>> DebitCardResetOtpActivity<U> buffer(Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<B>> callable, Callable<U> callable2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "boundarySupplier is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(callable2, "bufferSupplier is null");
        return new DepositDetailActivity(this, callable, callable2);
    }

    public final DebitCardResetOtpActivity<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    public final DebitCardResetOtpActivity<T> cacheWithInitialCapacity(int i) {
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "initialCapacity");
        return new DepositOpenAccountActivity(this, i);
    }

    public final <U> DebitCardResetOtpActivity<U> cast(Class<U> cls) {
        HmlLatestPersonalInformationDeepLinkActivity.write(cls, "clazz is null");
        return map(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(cls));
    }

    public final <U> BScanCNotificationDeepLinkActivity<U> collect(Callable<? extends U> callable, CreditCardDeepLinkActivity<? super U, ? super T> creditCardDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "initialValueSupplier is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(creditCardDeepLinkActivity, "collector is null");
        return new DepositProductCatalogActivity(this, callable, creditCardDeepLinkActivity);
    }

    public final <U> BScanCNotificationDeepLinkActivity<U> collectInto(U u, CreditCardDeepLinkActivity<? super U, ? super T> creditCardDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(u, "initialValue is null");
        return collect(HmlCalculatorDeepLinkActivity.read(u), creditCardDeepLinkActivity);
    }

    public final <R> DebitCardResetOtpActivity<R> compose(DebitCardResetPinSuccessActivity<? super T, ? extends R> debitCardResetPinSuccessActivity) {
        return wrap(((DebitCardResetPinSuccessActivity) HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity, "composer is null")).MediaBrowserCompat$ItemReceiver(this));
    }

    public final <R> DebitCardResetOtpActivity<R> concatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity) {
        return concatMap(directDebitDeepLinkActivity, 2);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "prefetch");
        if (!(this instanceof HmlPersonalInformationDeepLinkActivity)) {
            return new onButtonDoneClick(this, directDebitDeepLinkActivity, i, HmlBusinessOccupationInfoActivity.IMMEDIATE);
        }
        Object call = ((HmlPersonalInformationDeepLinkActivity) this).call();
        if (call == null) {
            return empty();
        }
        return new onBtnSendEmailVerificationClicked.read(call, directDebitDeepLinkActivity);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapDelayError(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity) {
        return concatMapDelayError(directDebitDeepLinkActivity, bufferSize(), true);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapDelayError(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, int i, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "prefetch");
        if (this instanceof HmlPersonalInformationDeepLinkActivity) {
            Object call = ((HmlPersonalInformationDeepLinkActivity) this).call();
            if (call == null) {
                return empty();
            }
            return new onBtnSendEmailVerificationClicked.read(call, directDebitDeepLinkActivity);
        }
        return new onButtonDoneClick(this, directDebitDeepLinkActivity, i, z ? HmlBusinessOccupationInfoActivity.END : HmlBusinessOccupationInfoActivity.BOUNDARY);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapEager(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity) {
        return concatMapEager(directDebitDeepLinkActivity, Api.BaseClientBuilder.API_PRIORITY_OTHER, bufferSize());
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapEager(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, int i, int i2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "maxConcurrency");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i2, "prefetch");
        return new onButtonStartCalendarClick(this, directDebitDeepLinkActivity, HmlBusinessOccupationInfoActivity.IMMEDIATE, i, i2);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapEagerDelayError(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, boolean z) {
        return concatMapEagerDelayError(directDebitDeepLinkActivity, Api.BaseClientBuilder.API_PRIORITY_OTHER, bufferSize(), z);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapEagerDelayError(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, int i, int i2, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "maxConcurrency");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i2, "prefetch");
        return new onButtonStartCalendarClick(this, directDebitDeepLinkActivity, z ? HmlBusinessOccupationInfoActivity.END : HmlBusinessOccupationInfoActivity.BOUNDARY, i, i2);
    }

    public final DebitCardCoachMarkActivity concatMapCompletable(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity) {
        return concatMapCompletable(directDebitDeepLinkActivity, 2);
    }

    public final DebitCardCoachMarkActivity concatMapCompletable(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "capacityHint");
        return new NTBBankingServiceActivity_ViewBinding(this, directDebitDeepLinkActivity, HmlBusinessOccupationInfoActivity.IMMEDIATE, i);
    }

    public final DebitCardCoachMarkActivity concatMapCompletableDelayError(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity) {
        return concatMapCompletableDelayError(directDebitDeepLinkActivity, true, 2);
    }

    public final DebitCardCoachMarkActivity concatMapCompletableDelayError(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity, boolean z) {
        return concatMapCompletableDelayError(directDebitDeepLinkActivity, z, 2);
    }

    public final DebitCardCoachMarkActivity concatMapCompletableDelayError(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity, boolean z, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "prefetch");
        return new NTBBankingServiceActivity_ViewBinding(this, directDebitDeepLinkActivity, z ? HmlBusinessOccupationInfoActivity.END : HmlBusinessOccupationInfoActivity.BOUNDARY, i);
    }

    public final <U> DebitCardResetOtpActivity<U> concatMapIterable(DirectDebitDeepLinkActivity<? super T, ? extends Iterable<? extends U>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        return new EasycashCollateralInformationActivity_ViewBinding(this, directDebitDeepLinkActivity);
    }

    public final <U> DebitCardResetOtpActivity<U> concatMapIterable(DirectDebitDeepLinkActivity<? super T, ? extends Iterable<? extends U>> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "prefetch");
        return concatMap(new EasycashSalesheetIndexActivity.write(directDebitDeepLinkActivity), i);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapMaybe(DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity) {
        return concatMapMaybe(directDebitDeepLinkActivity, 2);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapMaybe(DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "prefetch");
        return new NTBLandingActivity(this, directDebitDeepLinkActivity, HmlBusinessOccupationInfoActivity.IMMEDIATE, i);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapMaybeDelayError(DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity) {
        return concatMapMaybeDelayError(directDebitDeepLinkActivity, true, 2);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapMaybeDelayError(DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity, boolean z) {
        return concatMapMaybeDelayError(directDebitDeepLinkActivity, z, 2);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapMaybeDelayError(DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity, boolean z, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "prefetch");
        return new NTBLandingActivity(this, directDebitDeepLinkActivity, z ? HmlBusinessOccupationInfoActivity.END : HmlBusinessOccupationInfoActivity.BOUNDARY, i);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapSingle(DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity) {
        return concatMapSingle(directDebitDeepLinkActivity, 2);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapSingle(DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "prefetch");
        return new lambda$showCoachMark$0$NTBBankingServiceActivity(this, directDebitDeepLinkActivity, HmlBusinessOccupationInfoActivity.IMMEDIATE, i);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapSingleDelayError(DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity) {
        return concatMapSingleDelayError(directDebitDeepLinkActivity, true, 2);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapSingleDelayError(DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity, boolean z) {
        return concatMapSingleDelayError(directDebitDeepLinkActivity, z, 2);
    }

    public final <R> DebitCardResetOtpActivity<R> concatMapSingleDelayError(DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity, boolean z, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "prefetch");
        return new lambda$showCoachMark$0$NTBBankingServiceActivity(this, directDebitDeepLinkActivity, z ? HmlBusinessOccupationInfoActivity.END : HmlBusinessOccupationInfoActivity.BOUNDARY, i);
    }

    public final DebitCardResetOtpActivity<T> concatWith(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        return concat(this, (DebitCardResetOtpActivity) debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final DebitCardResetOtpActivity<T> concatWith(BillerDeepLinkActivity<? extends T> billerDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(billerDeepLinkActivity, "other is null");
        return new DirectDebitBillerSearchActivity(this, billerDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> concatWith(BaseChangePinWithMaxActivity<? extends T> baseChangePinWithMaxActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(baseChangePinWithMaxActivity, "other is null");
        return new ExportStatementSuccessfulActivity(this, baseChangePinWithMaxActivity);
    }

    public final DebitCardResetOtpActivity<T> concatWith(DebitCardProductCatalogActivity debitCardProductCatalogActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardProductCatalogActivity, "other is null");
        return new onButtonEndCalendarClick(this, debitCardProductCatalogActivity);
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> contains(Object obj) {
        HmlLatestPersonalInformationDeepLinkActivity.write(obj, "element is null");
        return any(HmlCalculatorDeepLinkActivity.IconCompatParcelizer(obj));
    }

    public final BScanCNotificationDeepLinkActivity<Long> count() {
        return new DirectDebitInputActivity(this);
    }

    public final <U> DebitCardResetOtpActivity<T> debounce(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<U>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "debounceSelector is null");
        return new DirectDebitTermsAndConditionsActivity(this, directDebitDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> debounce(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit, HmlETBLandingActivity.read());
    }

    public final DebitCardResetOtpActivity<T> debounce(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return new DonationsFoundationDetailsActivity(this, j, timeUnit, bankingAgentDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> defaultIfEmpty(T t) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "defaultItem is null");
        return switchIfEmpty(just(t));
    }

    public final <U> DebitCardResetOtpActivity<T> delay(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<U>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "itemDelay is null");
        return flatMap(new EasycashSalesheetIndexActivity.MediaDescriptionCompat(directDebitDeepLinkActivity));
    }

    public final DebitCardResetOtpActivity<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, HmlETBLandingActivity.read(), false);
    }

    public final DebitCardResetOtpActivity<T> delay(long j, TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, HmlETBLandingActivity.read(), z);
    }

    public final DebitCardResetOtpActivity<T> delay(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return delay(j, timeUnit, bankingAgentDeepLinkActivity, false);
    }

    public final DebitCardResetOtpActivity<T> delay(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return new DirectDebitOtpActivity(this, j, timeUnit, bankingAgentDeepLinkActivity, z);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [o.DirectDebitDeepLinkActivity<? super T, ? extends o.DebitCardResetPinSuccessActivity_ViewBinding<V>>, o.DirectDebitDeepLinkActivity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <U, V> p040o.DebitCardResetOtpActivity<T> delay(p040o.DebitCardResetPinSuccessActivity_ViewBinding<U> r1, p040o.DirectDebitDeepLinkActivity<? super T, ? extends p040o.DebitCardResetPinSuccessActivity_ViewBinding<V>> r2) {
        /*
            r0 = this;
            o.DebitCardResetOtpActivity r1 = r0.delaySubscription(r1)
            o.DebitCardResetOtpActivity r1 = r1.delay(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DebitCardResetOtpActivity.delay(o.DebitCardResetPinSuccessActivity_ViewBinding, o.DirectDebitDeepLinkActivity):o.DebitCardResetOtpActivity");
    }

    public final <U> DebitCardResetOtpActivity<T> delaySubscription(DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        return new DirectDebitSuccessActivity(this, debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final DebitCardResetOtpActivity<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, HmlETBLandingActivity.read());
    }

    public final DebitCardResetOtpActivity<T> delaySubscription(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return delaySubscription(timer(j, timeUnit, bankingAgentDeepLinkActivity));
    }

    @Deprecated
    public final <T2> DebitCardResetOtpActivity<T2> dematerialize() {
        return new SharingMomentsPreviewActivity_ViewBinding(this, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver());
    }

    public final <R> DebitCardResetOtpActivity<R> dematerialize(DirectDebitDeepLinkActivity<? super T, DebitCardResetPinActivity<R>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "selector is null");
        return new SharingMomentsPreviewActivity_ViewBinding(this, directDebitDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> distinct() {
        return distinct(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), HmlCalculatorDeepLinkActivity.IconCompatParcelizer());
    }

    public final <K> DebitCardResetOtpActivity<T> distinct(DirectDebitDeepLinkActivity<? super T, K> directDebitDeepLinkActivity) {
        return distinct(directDebitDeepLinkActivity, HmlCalculatorDeepLinkActivity.IconCompatParcelizer());
    }

    public final <K> DebitCardResetOtpActivity<T> distinct(DirectDebitDeepLinkActivity<? super T, K> directDebitDeepLinkActivity, Callable<? extends Collection<? super K>> callable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "keySelector is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "collectionSupplier is null");
        return new DonationsLandingActivity(this, directDebitDeepLinkActivity, callable);
    }

    public final DebitCardResetOtpActivity<T> distinctUntilChanged() {
        return distinctUntilChanged(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver());
    }

    public final <K> DebitCardResetOtpActivity<T> distinctUntilChanged(DirectDebitDeepLinkActivity<? super T, K> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "keySelector is null");
        return new SharingMomentsPreviewActivity(this, directDebitDeepLinkActivity, HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final DebitCardResetOtpActivity<T> distinctUntilChanged(CreditCardServiceTabDeepLinkActivity<? super T, ? super T> creditCardServiceTabDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(creditCardServiceTabDeepLinkActivity, "comparer is null");
        return new SharingMomentsPreviewActivity(this, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), creditCardServiceTabDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> doAfterNext(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity, "onAfterNext is null");
        return new BaseCommonNCBConsentActivity(this, debitCardMarketConductDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> doAfterTerminate(DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(dataPrivacyManagementDeepLinkActivity, "onFinally is null");
        return doOnEach(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(), HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(), HmlCalculatorDeepLinkActivity.read, dataPrivacyManagementDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> doFinally(DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(dataPrivacyManagementDeepLinkActivity, "onFinally is null");
        return new EasycashCarInformationActivity(this, dataPrivacyManagementDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> doOnDispose(DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        return doOnLifecycle(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(), dataPrivacyManagementDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> doOnComplete(DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        return doOnEach(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(), HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(), dataPrivacyManagementDeepLinkActivity, HmlCalculatorDeepLinkActivity.read);
    }

    private DebitCardResetOtpActivity<T> doOnEach(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity, "onNext is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity2, "onError is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(dataPrivacyManagementDeepLinkActivity, "onComplete is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(dataPrivacyManagementDeepLinkActivity2, "onAfterTerminate is null");
        return new EasycashActivity_ViewBinding(this, debitCardMarketConductDeepLinkActivity, debitCardMarketConductDeepLinkActivity2, dataPrivacyManagementDeepLinkActivity, dataPrivacyManagementDeepLinkActivity2);
    }

    public final DebitCardResetOtpActivity<T> doOnEach(DebitCardMarketConductDeepLinkActivity<? super DebitCardResetPinActivity<T>> debitCardMarketConductDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity, "onNotification is null");
        return doOnEach(HmlCalculatorDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity), HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(debitCardMarketConductDeepLinkActivity), HmlCalculatorDeepLinkActivity.IconCompatParcelizer(debitCardMarketConductDeepLinkActivity), HmlCalculatorDeepLinkActivity.read);
    }

    public final DebitCardResetOtpActivity<T> doOnEach(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentTransactionsDeepLinkActivity, "observer is null");
        return doOnEach(new EasycashSalesheetIndexActivity.RatingCompat(bankingAgentTransactionsDeepLinkActivity), new C9725x5878a90c(bankingAgentTransactionsDeepLinkActivity), new EasycashSalesheetIndexActivity.MediaMetadataCompat(bankingAgentTransactionsDeepLinkActivity), HmlCalculatorDeepLinkActivity.read);
    }

    public final DebitCardResetOtpActivity<T> doOnError(DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity) {
        DebitCardMarketConductDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver();
        DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity = HmlCalculatorDeepLinkActivity.read;
        return doOnEach(MediaBrowserCompat$CustomActionResultReceiver, debitCardMarketConductDeepLinkActivity, dataPrivacyManagementDeepLinkActivity, dataPrivacyManagementDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> doOnLifecycle(DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> debitCardMarketConductDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity, "onSubscribe is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(dataPrivacyManagementDeepLinkActivity, "onDispose is null");
        return new EasycashActivity(this, debitCardMarketConductDeepLinkActivity, dataPrivacyManagementDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> doOnNext(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity) {
        DebitCardMarketConductDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver();
        DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity = HmlCalculatorDeepLinkActivity.read;
        return doOnEach(debitCardMarketConductDeepLinkActivity, MediaBrowserCompat$CustomActionResultReceiver, dataPrivacyManagementDeepLinkActivity, dataPrivacyManagementDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> doOnSubscribe(DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> debitCardMarketConductDeepLinkActivity) {
        return doOnLifecycle(debitCardMarketConductDeepLinkActivity, HmlCalculatorDeepLinkActivity.read);
    }

    public final DebitCardResetOtpActivity<T> doOnTerminate(DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(dataPrivacyManagementDeepLinkActivity, "onTerminate is null");
        return doOnEach(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(), HmlCalculatorDeepLinkActivity.write(dataPrivacyManagementDeepLinkActivity), dataPrivacyManagementDeepLinkActivity, HmlCalculatorDeepLinkActivity.read);
    }

    public final DebitCardSaleSheetActivity<T> elementAt(long j) {
        if (j >= 0) {
            return new EasycashAdditionalDocumentTypeActivity(this, j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final BScanCNotificationDeepLinkActivity<T> elementAt(long j, T t) {
        if (j >= 0) {
            HmlLatestPersonalInformationDeepLinkActivity.write(t, "defaultItem is null");
            return new onCarSequentialSearch(this, j, t);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final BScanCNotificationDeepLinkActivity<T> elementAtOrError(long j) {
        if (j >= 0) {
            return new onCarSequentialSearch(this, j, null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final DebitCardResetOtpActivity<T> filter(HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(hmlBaseDeepLinkActivity, "predicate is null");
        return new EasycashCollateralInformationActivity(this, hmlBaseDeepLinkActivity);
    }

    public final DebitCardSaleSheetActivity<T> firstElement() {
        return elementAt(0);
    }

    public final BScanCNotificationDeepLinkActivity<T> first(T t) {
        return elementAt(0, t);
    }

    public final BScanCNotificationDeepLinkActivity<T> firstOrError() {
        return elementAtOrError(0);
    }

    public final <R> DebitCardResetOtpActivity<R> flatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity) {
        return flatMap(directDebitDeepLinkActivity, false);
    }

    public final <R> DebitCardResetOtpActivity<R> flatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, boolean z) {
        return flatMap(directDebitDeepLinkActivity, z, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final <R> DebitCardResetOtpActivity<R> flatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, boolean z, int i) {
        return flatMap(directDebitDeepLinkActivity, z, i, bufferSize());
    }

    public final <R> DebitCardResetOtpActivity<R> flatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, boolean z, int i, int i2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "maxConcurrency");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i2, "bufferSize");
        if (!(this instanceof HmlPersonalInformationDeepLinkActivity)) {
            return new EasycashCarInformationActivity_ViewBinding(this, directDebitDeepLinkActivity, z, i, i2);
        }
        Object call = ((HmlPersonalInformationDeepLinkActivity) this).call();
        if (call == null) {
            return empty();
        }
        return new onBtnSendEmailVerificationClicked.read(call, directDebitDeepLinkActivity);
    }

    public final <R> DebitCardResetOtpActivity<R> flatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super Throwable, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity2, Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> callable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "onNextMapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity2, "onErrorMapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "onCompleteSupplier is null");
        return merge(new EasycashCommercialLoanIntroductionActivity(this, directDebitDeepLinkActivity, directDebitDeepLinkActivity2, callable));
    }

    public final <R> DebitCardResetOtpActivity<R> flatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<Throwable, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity2, Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> callable, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "onNextMapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity2, "onErrorMapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "onCompleteSupplier is null");
        return merge(new EasycashCommercialLoanIntroductionActivity(this, directDebitDeepLinkActivity, directDebitDeepLinkActivity2, callable), i);
    }

    public final <R> DebitCardResetOtpActivity<R> flatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, int i) {
        return flatMap(directDebitDeepLinkActivity, false, i, bufferSize());
    }

    public final <U, R> DebitCardResetOtpActivity<R> flatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> directDebitDeepLinkActivity, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> chequeManagementDeepLinkActivity) {
        return flatMap(directDebitDeepLinkActivity, chequeManagementDeepLinkActivity, false, bufferSize(), bufferSize());
    }

    public final <U, R> DebitCardResetOtpActivity<R> flatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> directDebitDeepLinkActivity, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> chequeManagementDeepLinkActivity, boolean z) {
        return flatMap(directDebitDeepLinkActivity, chequeManagementDeepLinkActivity, z, bufferSize(), bufferSize());
    }

    public final <U, R> DebitCardResetOtpActivity<R> flatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> directDebitDeepLinkActivity, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> chequeManagementDeepLinkActivity, boolean z, int i) {
        return flatMap(directDebitDeepLinkActivity, chequeManagementDeepLinkActivity, z, i, bufferSize());
    }

    public final <U, R> DebitCardResetOtpActivity<R> flatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> directDebitDeepLinkActivity, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> chequeManagementDeepLinkActivity, boolean z, int i, int i2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(chequeManagementDeepLinkActivity, "combiner is null");
        return flatMap(new EasycashSalesheetIndexActivity.read(chequeManagementDeepLinkActivity, directDebitDeepLinkActivity), z, i, i2);
    }

    public final <U, R> DebitCardResetOtpActivity<R> flatMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends U>> directDebitDeepLinkActivity, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> chequeManagementDeepLinkActivity, int i) {
        return flatMap(directDebitDeepLinkActivity, chequeManagementDeepLinkActivity, false, i, bufferSize());
    }

    public final DebitCardCoachMarkActivity flatMapCompletable(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity) {
        return flatMapCompletable(directDebitDeepLinkActivity, false);
    }

    public final DebitCardCoachMarkActivity flatMapCompletable(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        return new EasycashCreditPowerInputActivity(this, directDebitDeepLinkActivity, z);
    }

    public final <U> DebitCardResetOtpActivity<U> flatMapIterable(DirectDebitDeepLinkActivity<? super T, ? extends Iterable<? extends U>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        return new EasycashCollateralInformationActivity_ViewBinding(this, directDebitDeepLinkActivity);
    }

    public final <U, V> DebitCardResetOtpActivity<V> flatMapIterable(DirectDebitDeepLinkActivity<? super T, ? extends Iterable<? extends U>> directDebitDeepLinkActivity, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends V> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(chequeManagementDeepLinkActivity, "resultSelector is null");
        return flatMap(new EasycashSalesheetIndexActivity.write(directDebitDeepLinkActivity), chequeManagementDeepLinkActivity, false, bufferSize(), bufferSize());
    }

    public final <R> DebitCardResetOtpActivity<R> flatMapMaybe(DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity) {
        return flatMapMaybe(directDebitDeepLinkActivity, false);
    }

    public final <R> DebitCardResetOtpActivity<R> flatMapMaybe(DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        return new onClickedAction(this, directDebitDeepLinkActivity, z);
    }

    public final <R> DebitCardResetOtpActivity<R> flatMapSingle(DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity) {
        return flatMapSingle(directDebitDeepLinkActivity, false);
    }

    public final <R> DebitCardResetOtpActivity<R> flatMapSingle(DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        return new EasycashCreditPowerInputActivity_ViewBinding(this, directDebitDeepLinkActivity, z);
    }

    public final BulkTransferDeepLinkActivity forEach(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity) {
        return subscribe(debitCardMarketConductDeepLinkActivity);
    }

    public final BulkTransferDeepLinkActivity forEachWhile(HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        return forEachWhile(hmlBaseDeepLinkActivity, HmlCalculatorDeepLinkActivity.write, HmlCalculatorDeepLinkActivity.read);
    }

    public final BulkTransferDeepLinkActivity forEachWhile(HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity) {
        return forEachWhile(hmlBaseDeepLinkActivity, debitCardMarketConductDeepLinkActivity, HmlCalculatorDeepLinkActivity.read);
    }

    public final BulkTransferDeepLinkActivity forEachWhile(HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(hmlBaseDeepLinkActivity, "onNext is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity, "onError is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(dataPrivacyManagementDeepLinkActivity, "onComplete is null");
        NsipPartnerPaymentDeepLinkActivity nsipPartnerPaymentDeepLinkActivity = new NsipPartnerPaymentDeepLinkActivity(hmlBaseDeepLinkActivity, debitCardMarketConductDeepLinkActivity, dataPrivacyManagementDeepLinkActivity);
        subscribe(nsipPartnerPaymentDeepLinkActivity);
        return nsipPartnerPaymentDeepLinkActivity;
    }

    public final <K> DebitCardResetOtpActivity<HmlConsumerReviewSubmissionDeepLinkSMSLineActivity<K, T>> groupBy(DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity) {
        return groupBy(directDebitDeepLinkActivity, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), false, bufferSize());
    }

    public final <K> DebitCardResetOtpActivity<HmlConsumerReviewSubmissionDeepLinkSMSLineActivity<K, T>> groupBy(DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity, boolean z) {
        return groupBy(directDebitDeepLinkActivity, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), z, bufferSize());
    }

    public final <K, V> DebitCardResetOtpActivity<HmlConsumerReviewSubmissionDeepLinkSMSLineActivity<K, V>> groupBy(DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends V> directDebitDeepLinkActivity2) {
        return groupBy(directDebitDeepLinkActivity, directDebitDeepLinkActivity2, false, bufferSize());
    }

    public final <K, V> DebitCardResetOtpActivity<HmlConsumerReviewSubmissionDeepLinkSMSLineActivity<K, V>> groupBy(DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends V> directDebitDeepLinkActivity2, boolean z) {
        return groupBy(directDebitDeepLinkActivity, directDebitDeepLinkActivity2, z, bufferSize());
    }

    public final <K, V> DebitCardResetOtpActivity<HmlConsumerReviewSubmissionDeepLinkSMSLineActivity<K, V>> groupBy(DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends V> directDebitDeepLinkActivity2, boolean z, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "keySelector is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity2, "valueSelector is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new EasycashReferralSendDfwActivity(this, directDebitDeepLinkActivity, directDebitDeepLinkActivity2, i, z);
    }

    public final <TRight, TLeftEnd, TRightEnd, R> DebitCardResetOtpActivity<R> groupJoin(DebitCardResetPinSuccessActivity_ViewBinding<? extends TRight> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TLeftEnd>> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super TRight, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TRightEnd>> directDebitDeepLinkActivity2, ChequeManagementDeepLinkActivity<? super T, ? super DebitCardResetOtpActivity<TRight>, ? extends R> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "leftEnd is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity2, "rightEnd is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(chequeManagementDeepLinkActivity, "resultSelector is null");
        return new EasycashOccupationSearchActivity(this, debitCardResetPinSuccessActivity_ViewBinding, directDebitDeepLinkActivity, directDebitDeepLinkActivity2, chequeManagementDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> hide() {
        return new EasycashReferralSendDfwDeepLinkActivity(this);
    }

    public final DebitCardCoachMarkActivity ignoreElements() {
        return new EasycashReferralSendProductActivity(this);
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> isEmpty() {
        return all(HmlCalculatorDeepLinkActivity.write());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> DebitCardResetOtpActivity<R> join(DebitCardResetPinSuccessActivity_ViewBinding<? extends TRight> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TLeftEnd>> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super TRight, ? extends DebitCardResetPinSuccessActivity_ViewBinding<TRightEnd>> directDebitDeepLinkActivity2, ChequeManagementDeepLinkActivity<? super T, ? super TRight, ? extends R> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "leftEnd is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity2, "rightEnd is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(chequeManagementDeepLinkActivity, "resultSelector is null");
        return new EasycashCreditPowerInformationActivity(this, debitCardResetPinSuccessActivity_ViewBinding, directDebitDeepLinkActivity, directDebitDeepLinkActivity2, chequeManagementDeepLinkActivity);
    }

    public final DebitCardSaleSheetActivity<T> lastElement() {
        return new NTBEasycashLandingActivity(this);
    }

    public final BScanCNotificationDeepLinkActivity<T> last(T t) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "defaultItem is null");
        return new EasycashCreditPowerSummaryActivity(this, t);
    }

    public final BScanCNotificationDeepLinkActivity<T> lastOrError() {
        return new EasycashCreditPowerSummaryActivity(this, null);
    }

    public final <R> DebitCardResetOtpActivity<R> lift(DebitPrepaidMenuActivity<? extends R, ? super T> debitPrepaidMenuActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitPrepaidMenuActivity, "lifter is null");
        return new SummaryActivity(this, debitPrepaidMenuActivity);
    }

    public final <R> DebitCardResetOtpActivity<R> map(DirectDebitDeepLinkActivity<? super T, ? extends R> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        return new EasycashBaseIntroductionActivity_ViewBinding(this, directDebitDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<DebitCardResetPinActivity<T>> materialize() {
        return new EasycashBaseIntroductionActivity(this);
    }

    public final DebitCardResetOtpActivity<T> mergeWith(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        return merge(this, (DebitCardResetOtpActivity) debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final DebitCardResetOtpActivity<T> mergeWith(BillerDeepLinkActivity<? extends T> billerDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(billerDeepLinkActivity, "other is null");
        return new EasycashMCMCIntroductionActivity(this, billerDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> mergeWith(BaseChangePinWithMaxActivity<? extends T> baseChangePinWithMaxActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(baseChangePinWithMaxActivity, "other is null");
        return new onClickApplyNow(this, baseChangePinWithMaxActivity);
    }

    public final DebitCardResetOtpActivity<T> mergeWith(DebitCardProductCatalogActivity debitCardProductCatalogActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardProductCatalogActivity, "other is null");
        return new EasycashCreditCardIntroductionActivity(this, debitCardProductCatalogActivity);
    }

    public final DebitCardResetOtpActivity<T> observeOn(BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return observeOn(bankingAgentDeepLinkActivity, false, bufferSize());
    }

    public final DebitCardResetOtpActivity<T> observeOn(BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z) {
        return observeOn(bankingAgentDeepLinkActivity, z, bufferSize());
    }

    public final DebitCardResetOtpActivity<T> observeOn(BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new EasycashMortgageIntroductionActivity(this, bankingAgentDeepLinkActivity, z, i);
    }

    public final <U> DebitCardResetOtpActivity<U> ofType(Class<U> cls) {
        HmlLatestPersonalInformationDeepLinkActivity.write(cls, "clazz is null");
        return filter(HmlCalculatorDeepLinkActivity.IconCompatParcelizer(cls)).cast(cls);
    }

    public final DebitCardResetOtpActivity<T> onErrorResumeNext(DirectDebitDeepLinkActivity<? super Throwable, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "resumeFunction is null");
        return new EasycashSpeedyCashIntroductionActivity(this, directDebitDeepLinkActivity, false);
    }

    public final DebitCardResetOtpActivity<T> onErrorResumeNext(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "next is null");
        return onErrorResumeNext(HmlCalculatorDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding));
    }

    public final DebitCardResetOtpActivity<T> onErrorReturn(DirectDebitDeepLinkActivity<? super Throwable, ? extends T> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "valueSupplier is null");
        return new EasycashSpeedyLoanIntroductionActivity(this, directDebitDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> onErrorReturnItem(T t) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item is null");
        return onErrorReturn(HmlCalculatorDeepLinkActivity.write(t));
    }

    public final DebitCardResetOtpActivity<T> onExceptionResumeNext(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "next is null");
        return new EasycashSpeedyCashIntroductionActivity(this, HmlCalculatorDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding), true);
    }

    public final DebitCardResetOtpActivity<T> onTerminateDetach() {
        return new CommercialReferralNCBConsentActivity(this);
    }

    public final HmlConsumerGuidelinesBaseDeepLinkActivity<T> publish() {
        return EBillSubscriptionInputActivity.MediaBrowserCompat$ItemReceiver(this);
    }

    public final <R> DebitCardResetOtpActivity<R> publish(DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<T>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "selector is null");
        return new EBillSubscriptionActivity(this, directDebitDeepLinkActivity);
    }

    public final DebitCardSaleSheetActivity<T> reduce(ChequeManagementDeepLinkActivity<T, T, T> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(chequeManagementDeepLinkActivity, "reducer is null");
        return new RtpEBillSubscriptionDetailActivity(this, chequeManagementDeepLinkActivity);
    }

    public final <R> BScanCNotificationDeepLinkActivity<R> reduce(R r, ChequeManagementDeepLinkActivity<R, ? super T, R> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(r, "seed is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(chequeManagementDeepLinkActivity, "reducer is null");
        return new ManageEmailInputActivity(this, r, chequeManagementDeepLinkActivity);
    }

    public final <R> BScanCNotificationDeepLinkActivity<R> reduceWith(Callable<R> callable, ChequeManagementDeepLinkActivity<R, ? super T, R> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "seedSupplier is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(chequeManagementDeepLinkActivity, "reducer is null");
        return new EBillSubscriptionSuccessActivity(this, callable, chequeManagementDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final DebitCardResetOtpActivity<T> repeat(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("times >= 0 required but it was ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return empty();
        } else {
            return new onBtnCancelClicked(this, j);
        }
    }

    public final DebitCardResetOtpActivity<T> repeatUntil(ECouponRedemptionDeeplinkActivity eCouponRedemptionDeeplinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(eCouponRedemptionDeeplinkActivity, "stop is null");
        return new lambda$onCreate$1$ManageEmailInputActivity(this, eCouponRedemptionDeeplinkActivity);
    }

    public final DebitCardResetOtpActivity<T> repeatWhen(DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<Object>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "handler is null");
        return new lambda$showEmailNotificationError$3$ManageEmailInputActivity(this, directDebitDeepLinkActivity);
    }

    public final HmlConsumerGuidelinesBaseDeepLinkActivity<T> replay() {
        return onBtnSaveClicked.write(this);
    }

    public final <R> DebitCardResetOtpActivity<R> replay(DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<T>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "selector is null");
        return onBtnSaveClicked.IconCompatParcelizer(new EasycashSalesheetIndexActivity$MediaBrowserCompat$MediaItem(this), directDebitDeepLinkActivity);
    }

    public final <R> DebitCardResetOtpActivity<R> replay(DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<T>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "selector is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return onBtnSaveClicked.IconCompatParcelizer(new C9724xe5abdc2b(this, i), directDebitDeepLinkActivity);
    }

    public final <R> DebitCardResetOtpActivity<R> replay(DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<T>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> directDebitDeepLinkActivity, int i, long j, TimeUnit timeUnit) {
        return replay(directDebitDeepLinkActivity, i, j, timeUnit, HmlETBLandingActivity.read());
    }

    public final <R> DebitCardResetOtpActivity<R> replay(DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<T>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> directDebitDeepLinkActivity, int i, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "selector is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return onBtnSaveClicked.IconCompatParcelizer(new EasycashSalesheetIndexActivity$MediaBrowserCompat$ItemReceiver(this, i, j, timeUnit, bankingAgentDeepLinkActivity), directDebitDeepLinkActivity);
    }

    public final <R> DebitCardResetOtpActivity<R> replay(DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<T>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> directDebitDeepLinkActivity, int i, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "selector is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return onBtnSaveClicked.IconCompatParcelizer(new C9724xe5abdc2b(this, i), new EasycashSalesheetIndexActivity.ParcelableVolumeInfo(directDebitDeepLinkActivity, bankingAgentDeepLinkActivity));
    }

    public final <R> DebitCardResetOtpActivity<R> replay(DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<T>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> directDebitDeepLinkActivity, long j, TimeUnit timeUnit) {
        return replay(directDebitDeepLinkActivity, j, timeUnit, HmlETBLandingActivity.read());
    }

    public final <R> DebitCardResetOtpActivity<R> replay(DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<T>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> directDebitDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "selector is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return onBtnSaveClicked.IconCompatParcelizer(new C9727xa05ebf1d(this, j, timeUnit, bankingAgentDeepLinkActivity), directDebitDeepLinkActivity);
    }

    public final <R> DebitCardResetOtpActivity<R> replay(DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<T>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> directDebitDeepLinkActivity, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "selector is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return onBtnSaveClicked.IconCompatParcelizer(new EasycashSalesheetIndexActivity$MediaBrowserCompat$MediaItem(this), new EasycashSalesheetIndexActivity.ParcelableVolumeInfo(directDebitDeepLinkActivity, bankingAgentDeepLinkActivity));
    }

    public final HmlConsumerGuidelinesBaseDeepLinkActivity<T> replay(int i) {
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return onBtnSaveClicked.MediaBrowserCompat$CustomActionResultReceiver(this, i);
    }

    public final HmlConsumerGuidelinesBaseDeepLinkActivity<T> replay(int i, long j, TimeUnit timeUnit) {
        return replay(i, j, timeUnit, HmlETBLandingActivity.read());
    }

    public final HmlConsumerGuidelinesBaseDeepLinkActivity<T> replay(int i, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return onBtnSaveClicked.IconCompatParcelizer(this, j, timeUnit, bankingAgentDeepLinkActivity, i);
    }

    public final HmlConsumerGuidelinesBaseDeepLinkActivity<T> replay(int i, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return onBtnSaveClicked.IconCompatParcelizer(replay(i), bankingAgentDeepLinkActivity);
    }

    public final HmlConsumerGuidelinesBaseDeepLinkActivity<T> replay(long j, TimeUnit timeUnit) {
        return replay(j, timeUnit, HmlETBLandingActivity.read());
    }

    public final HmlConsumerGuidelinesBaseDeepLinkActivity<T> replay(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return onBtnSaveClicked.write(this, j, timeUnit, bankingAgentDeepLinkActivity);
    }

    public final HmlConsumerGuidelinesBaseDeepLinkActivity<T> replay(BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return onBtnSaveClicked.IconCompatParcelizer(replay(), bankingAgentDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> retry() {
        return retry(Long.MAX_VALUE, HmlCalculatorDeepLinkActivity.read());
    }

    public final DebitCardResetOtpActivity<T> retry(CreditCardServiceTabDeepLinkActivity<? super Integer, ? super Throwable> creditCardServiceTabDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(creditCardServiceTabDeepLinkActivity, "predicate is null");
        return new clearEmail(this, creditCardServiceTabDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> retry(long j) {
        return retry(j, HmlCalculatorDeepLinkActivity.read());
    }

    public final DebitCardResetOtpActivity<T> retry(long j, HmlBaseDeepLinkActivity<? super Throwable> hmlBaseDeepLinkActivity) {
        if (j >= 0) {
            HmlLatestPersonalInformationDeepLinkActivity.write(hmlBaseDeepLinkActivity, "predicate is null");
            return new ManageEmailLandingActivity(this, j, hmlBaseDeepLinkActivity);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("times >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final DebitCardResetOtpActivity<T> retry(HmlBaseDeepLinkActivity<? super Throwable> hmlBaseDeepLinkActivity) {
        return retry(Long.MAX_VALUE, hmlBaseDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> retryUntil(ECouponRedemptionDeeplinkActivity eCouponRedemptionDeeplinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(eCouponRedemptionDeeplinkActivity, "stop is null");
        return retry(Long.MAX_VALUE, HmlCalculatorDeepLinkActivity.write(eCouponRedemptionDeeplinkActivity));
    }

    public final DebitCardResetOtpActivity<T> retryWhen(DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<Throwable>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "handler is null");
        return new ManageEmailInputActivity_ViewBinding(this, directDebitDeepLinkActivity);
    }

    public final void safeSubscribe(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentTransactionsDeepLinkActivity, "observer is null");
        if (bankingAgentTransactionsDeepLinkActivity instanceof HmlETBAccountSetupActivity) {
            subscribe(bankingAgentTransactionsDeepLinkActivity);
        } else {
            subscribe(new HmlETBAccountSetupActivity(bankingAgentTransactionsDeepLinkActivity));
        }
    }

    public final DebitCardResetOtpActivity<T> sample(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit, HmlETBLandingActivity.read());
    }

    public final DebitCardResetOtpActivity<T> sample(long j, TimeUnit timeUnit, boolean z) {
        return sample(j, timeUnit, HmlETBLandingActivity.read(), z);
    }

    public final DebitCardResetOtpActivity<T> sample(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return new onBtnEnterEmailVerificationClicked(this, j, timeUnit, bankingAgentDeepLinkActivity, false);
    }

    public final DebitCardResetOtpActivity<T> sample(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return new onBtnEnterEmailVerificationClicked(this, j, timeUnit, bankingAgentDeepLinkActivity, z);
    }

    public final <U> DebitCardResetOtpActivity<T> sample(DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "sampler is null");
        return new onIbEmailEditClicked(this, debitCardResetPinSuccessActivity_ViewBinding, false);
    }

    public final <U> DebitCardResetOtpActivity<T> sample(DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "sampler is null");
        return new onIbEmailEditClicked(this, debitCardResetPinSuccessActivity_ViewBinding, z);
    }

    public final DebitCardResetOtpActivity<T> scan(ChequeManagementDeepLinkActivity<T, T, T> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(chequeManagementDeepLinkActivity, "accumulator is null");
        return new onGetStartedButtonClicked(this, chequeManagementDeepLinkActivity);
    }

    public final <R> DebitCardResetOtpActivity<R> scan(R r, ChequeManagementDeepLinkActivity<R, ? super T, R> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(r, "initialValue is null");
        return scanWith(HmlCalculatorDeepLinkActivity.read(r), chequeManagementDeepLinkActivity);
    }

    public final <R> DebitCardResetOtpActivity<R> scanWith(Callable<R> callable, ChequeManagementDeepLinkActivity<R, ? super T, R> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "seedSupplier is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(chequeManagementDeepLinkActivity, "accumulator is null");
        return new BaseEligibilityActivity(this, callable, chequeManagementDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> serialize() {
        return new ManageEmailLandingActivity_ViewBinding(this);
    }

    public final DebitCardResetOtpActivity<T> share() {
        HmlConsumerGuidelinesBaseDeepLinkActivity publish = publish();
        if (publish instanceof EasycashSpeedyLoanTopupIntroductionActivity) {
            publish = new LoanTermsConditionsActivity(((EasycashSpeedyLoanTopupIntroductionActivity) publish).read());
        }
        return new EBillSubscriptionSearchActivity(publish);
    }

    public final DebitCardSaleSheetActivity<T> singleElement() {
        return new ETBSaleSheetAccountTypeActivity_ViewBinding(this);
    }

    public final BScanCNotificationDeepLinkActivity<T> single(T t) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "defaultItem is null");
        return new ETBCheckEligibilityActivity(this, t);
    }

    public final BScanCNotificationDeepLinkActivity<T> singleOrError() {
        return new ETBCheckEligibilityActivity(this, null);
    }

    public final DebitCardResetOtpActivity<T> skip(long j) {
        return j <= 0 ? this : new ETBSaleSheetAccountTypeActivity(this, j);
    }

    public final DebitCardResetOtpActivity<T> skip(long j, TimeUnit timeUnit) {
        return skipUntil(timer(j, timeUnit));
    }

    public final DebitCardResetOtpActivity<T> skip(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return skipUntil(timer(j, timeUnit, bankingAgentDeepLinkActivity));
    }

    public final DebitCardResetOtpActivity<T> skipLast(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i == 0) {
            return this;
        } else {
            return new BaseEligibilityActivity_ViewBinding(this, i);
        }
    }

    public final DebitCardResetOtpActivity<T> skipLast(long j, TimeUnit timeUnit) {
        return skipLast(j, timeUnit, HmlETBLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(), false, bufferSize());
    }

    public final DebitCardResetOtpActivity<T> skipLast(long j, TimeUnit timeUnit, boolean z) {
        return skipLast(j, timeUnit, HmlETBLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(), z, bufferSize());
    }

    public final DebitCardResetOtpActivity<T> skipLast(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return skipLast(j, timeUnit, bankingAgentDeepLinkActivity, false, bufferSize());
    }

    public final DebitCardResetOtpActivity<T> skipLast(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z) {
        return skipLast(j, timeUnit, bankingAgentDeepLinkActivity, z, bufferSize());
    }

    public final DebitCardResetOtpActivity<T> skipLast(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new ETBOtp9100ErrorActivity(this, j, timeUnit, bankingAgentDeepLinkActivity, i << 1, z);
    }

    public final <U> DebitCardResetOtpActivity<T> skipUntil(DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        return new ETBWelcomeAboardActivity(this, debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final DebitCardResetOtpActivity<T> skipWhile(HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(hmlBaseDeepLinkActivity, "predicate is null");
        return new ETBSaleSheetProductListActivity_ViewBinding(this, hmlBaseDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> sorted() {
        DebitCardResetOtpActivity debitCardResetOtpActivity;
        BScanCNotificationDeepLinkActivity list = toList();
        if (list instanceof HmlLatestLoanOfferStatusDeepLinkActivity) {
            debitCardResetOtpActivity = ((HmlLatestLoanOfferStatusDeepLinkActivity) list).MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            debitCardResetOtpActivity = new FriendsLandingActivity_ViewBinding(list);
        }
        return debitCardResetOtpActivity.map(HmlCalculatorDeepLinkActivity.read(HmlCalculatorDeepLinkActivity.MediaMetadataCompat())).flatMapIterable(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver());
    }

    public final DebitCardResetOtpActivity<T> sorted(Comparator<? super T> comparator) {
        DebitCardResetOtpActivity debitCardResetOtpActivity;
        HmlLatestPersonalInformationDeepLinkActivity.write(comparator, "sortFunction is null");
        BScanCNotificationDeepLinkActivity list = toList();
        if (list instanceof HmlLatestLoanOfferStatusDeepLinkActivity) {
            debitCardResetOtpActivity = ((HmlLatestLoanOfferStatusDeepLinkActivity) list).MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            debitCardResetOtpActivity = new FriendsLandingActivity_ViewBinding(list);
        }
        return debitCardResetOtpActivity.map(HmlCalculatorDeepLinkActivity.read(comparator)).flatMapIterable(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver());
    }

    public final DebitCardResetOtpActivity<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final DebitCardResetOtpActivity<T> startWith(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        return concatArray(debitCardResetPinSuccessActivity_ViewBinding, this);
    }

    public final DebitCardResetOtpActivity<T> startWith(T t) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item is null");
        return concatArray(just(t), this);
    }

    public final DebitCardResetOtpActivity<T> startWithArray(T... tArr) {
        DebitCardResetOtpActivity fromArray = fromArray(tArr);
        if (fromArray == empty()) {
            return this;
        }
        return concatArray(fromArray, this);
    }

    public final BulkTransferDeepLinkActivity subscribe() {
        return subscribe(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(), HmlCalculatorDeepLinkActivity.write, HmlCalculatorDeepLinkActivity.read, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final BulkTransferDeepLinkActivity subscribe(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity) {
        return subscribe(debitCardMarketConductDeepLinkActivity, HmlCalculatorDeepLinkActivity.write, HmlCalculatorDeepLinkActivity.read, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final BulkTransferDeepLinkActivity subscribe(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2) {
        return subscribe(debitCardMarketConductDeepLinkActivity, debitCardMarketConductDeepLinkActivity2, HmlCalculatorDeepLinkActivity.read, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final BulkTransferDeepLinkActivity subscribe(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        return subscribe(debitCardMarketConductDeepLinkActivity, debitCardMarketConductDeepLinkActivity2, dataPrivacyManagementDeepLinkActivity, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final BulkTransferDeepLinkActivity subscribe(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> debitCardMarketConductDeepLinkActivity3) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity, "onNext is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity2, "onError is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(dataPrivacyManagementDeepLinkActivity, "onComplete is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity3, "onSubscribe is null");
        OpenAccountEtbNoActiveCasaDeepLinkActivity openAccountEtbNoActiveCasaDeepLinkActivity = new OpenAccountEtbNoActiveCasaDeepLinkActivity(debitCardMarketConductDeepLinkActivity, debitCardMarketConductDeepLinkActivity2, dataPrivacyManagementDeepLinkActivity, debitCardMarketConductDeepLinkActivity3);
        subscribe(openAccountEtbNoActiveCasaDeepLinkActivity);
        return openAccountEtbNoActiveCasaDeepLinkActivity;
    }

    public final void subscribe(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentTransactionsDeepLinkActivity, "observer is null");
        try {
            HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentTransactionsDeepLinkActivity, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(bankingAgentTransactionsDeepLinkActivity);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            AlertController$RecycleListView.read.read(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final <E extends BankingAgentTransactionsDeepLinkActivity<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    public final DebitCardResetOtpActivity<T> subscribeOn(BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return new clickRegister(this, bankingAgentDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> switchIfEmpty(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        return new ETBSaleSheetProductListActivity(this, debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final <R> DebitCardResetOtpActivity<R> switchMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity) {
        return switchMap(directDebitDeepLinkActivity, bufferSize());
    }

    public final <R> DebitCardResetOtpActivity<R> switchMap(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        if (!(this instanceof HmlPersonalInformationDeepLinkActivity)) {
            return new ETBSetDetailNoteActivity(this, directDebitDeepLinkActivity, i, false);
        }
        Object call = ((HmlPersonalInformationDeepLinkActivity) this).call();
        if (call == null) {
            return empty();
        }
        return new onBtnSendEmailVerificationClicked.read(call, directDebitDeepLinkActivity);
    }

    public final DebitCardCoachMarkActivity switchMapCompletable(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        return new lambda$setOnClickFloatingButton$1$NTBLandingActivity(this, directDebitDeepLinkActivity, false);
    }

    public final DebitCardCoachMarkActivity switchMapCompletableDelayError(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        return new lambda$setOnClickFloatingButton$1$NTBLandingActivity(this, directDebitDeepLinkActivity, true);
    }

    public final <R> DebitCardResetOtpActivity<R> switchMapMaybe(DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        return new RegistrationActivity(this, directDebitDeepLinkActivity, false);
    }

    public final <R> DebitCardResetOtpActivity<R> switchMapMaybeDelayError(DirectDebitDeepLinkActivity<? super T, ? extends BaseChangePinWithMaxActivity<? extends R>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        return new RegistrationActivity(this, directDebitDeepLinkActivity, true);
    }

    public final <R> DebitCardResetOtpActivity<R> switchMapSingle(DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        return new PreregisteredMobileActivity(this, directDebitDeepLinkActivity, false);
    }

    public final <R> DebitCardResetOtpActivity<R> switchMapSingleDelayError(DirectDebitDeepLinkActivity<? super T, ? extends BillerDeepLinkActivity<? extends R>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        return new PreregisteredMobileActivity(this, directDebitDeepLinkActivity, true);
    }

    public final <R> DebitCardResetOtpActivity<R> switchMapDelayError(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity) {
        return switchMapDelayError(directDebitDeepLinkActivity, bufferSize());
    }

    public final <R> DebitCardResetOtpActivity<R> switchMapDelayError(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        if (!(this instanceof HmlPersonalInformationDeepLinkActivity)) {
            return new ETBSetDetailNoteActivity(this, directDebitDeepLinkActivity, i, true);
        }
        Object call = ((HmlPersonalInformationDeepLinkActivity) this).call();
        if (call == null) {
            return empty();
        }
        return new onBtnSendEmailVerificationClicked.read(call, directDebitDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> take(long j) {
        if (j >= 0) {
            return new EtbActivity(this, j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final DebitCardResetOtpActivity<T> take(long j, TimeUnit timeUnit) {
        return takeUntil(timer(j, timeUnit));
    }

    public final DebitCardResetOtpActivity<T> take(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return takeUntil(timer(j, timeUnit, bankingAgentDeepLinkActivity));
    }

    public final DebitCardResetOtpActivity<T> takeLast(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i == 0) {
            return new LoanRequestorActivity(this);
        } else {
            if (i == 1) {
                return new ETBWelcomeAboardActivity_ViewBinding(this);
            }
            return new EtbSuccessActivity(this, i);
        }
    }

    public final DebitCardResetOtpActivity<T> takeLast(long j, long j2, TimeUnit timeUnit) {
        return takeLast(j, j2, timeUnit, HmlETBLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(), false, bufferSize());
    }

    public final DebitCardResetOtpActivity<T> takeLast(long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return takeLast(j, j2, timeUnit, bankingAgentDeepLinkActivity, false, bufferSize());
    }

    public final DebitCardResetOtpActivity<T> takeLast(long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        if (j >= 0) {
            return new EtbActivity_ViewBinding(this, j, j2, timeUnit, bankingAgentDeepLinkActivity, i, z);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final DebitCardResetOtpActivity<T> takeLast(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit, HmlETBLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(), false, bufferSize());
    }

    public final DebitCardResetOtpActivity<T> takeLast(long j, TimeUnit timeUnit, boolean z) {
        return takeLast(j, timeUnit, HmlETBLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(), z, bufferSize());
    }

    public final DebitCardResetOtpActivity<T> takeLast(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return takeLast(j, timeUnit, bankingAgentDeepLinkActivity, false, bufferSize());
    }

    public final DebitCardResetOtpActivity<T> takeLast(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z) {
        return takeLast(j, timeUnit, bankingAgentDeepLinkActivity, z, bufferSize());
    }

    public final DebitCardResetOtpActivity<T> takeLast(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z, int i) {
        return takeLast(Long.MAX_VALUE, j, timeUnit, bankingAgentDeepLinkActivity, z, i);
    }

    public final <U> DebitCardResetOtpActivity<T> takeUntil(DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        return new EtbOtpActivity(this, debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final DebitCardResetOtpActivity<T> takeUntil(HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(hmlBaseDeepLinkActivity, "stopPredicate is null");
        return new EtbSuccessActivity.EtbScreenshot(this, hmlBaseDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> takeWhile(HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(hmlBaseDeepLinkActivity, "predicate is null");
        return new EtbSuccessActivity_ViewBinding(this, hmlBaseDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> throttleFirst(long j, TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, HmlETBLandingActivity.read());
    }

    public final DebitCardResetOtpActivity<T> throttleFirst(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return new EtbSuccessActivity.EtbScreenshot_ViewBinding(this, j, timeUnit, bankingAgentDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> throttleLast(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    public final DebitCardResetOtpActivity<T> throttleLast(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return sample(j, timeUnit, bankingAgentDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> throttleLatest(long j, TimeUnit timeUnit) {
        return throttleLatest(j, timeUnit, HmlETBLandingActivity.read(), false);
    }

    public final DebitCardResetOtpActivity<T> throttleLatest(long j, TimeUnit timeUnit, boolean z) {
        return throttleLatest(j, timeUnit, HmlETBLandingActivity.read(), z);
    }

    public final DebitCardResetOtpActivity<T> throttleLatest(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return throttleLatest(j, timeUnit, bankingAgentDeepLinkActivity, false);
    }

    public final DebitCardResetOtpActivity<T> throttleLatest(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return new onReturnButtonClicked(this, j, timeUnit, bankingAgentDeepLinkActivity, z);
    }

    public final DebitCardResetOtpActivity<T> throttleWithTimeout(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    public final DebitCardResetOtpActivity<T> throttleWithTimeout(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return debounce(j, timeUnit, bankingAgentDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<HmlETBLoanReviewActivity<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, HmlETBLandingActivity.read());
    }

    public final DebitCardResetOtpActivity<HmlETBLoanReviewActivity<T>> timeInterval(BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return timeInterval(TimeUnit.MILLISECONDS, bankingAgentDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<HmlETBLoanReviewActivity<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, HmlETBLandingActivity.read());
    }

    public final DebitCardResetOtpActivity<HmlETBLoanReviewActivity<T>> timeInterval(TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return new onSaveButtonClicked(this, timeUnit, bankingAgentDeepLinkActivity);
    }

    public final <V> DebitCardResetOtpActivity<T> timeout(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> directDebitDeepLinkActivity) {
        return timeout0((DebitCardResetPinSuccessActivity_ViewBinding) null, directDebitDeepLinkActivity, (DebitCardResetPinSuccessActivity_ViewBinding) null);
    }

    public final <V> DebitCardResetOtpActivity<T> timeout(DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> directDebitDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        return timeout0((DebitCardResetPinSuccessActivity_ViewBinding) null, directDebitDeepLinkActivity, debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final DebitCardResetOtpActivity<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, (DebitCardResetPinSuccessActivity_ViewBinding) null, HmlETBLandingActivity.read());
    }

    public final DebitCardResetOtpActivity<T> timeout(long j, TimeUnit timeUnit, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        return timeout0(j, timeUnit, debitCardResetPinSuccessActivity_ViewBinding, HmlETBLandingActivity.read());
    }

    public final DebitCardResetOtpActivity<T> timeout(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        return timeout0(j, timeUnit, debitCardResetPinSuccessActivity_ViewBinding, bankingAgentDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<T> timeout(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return timeout0(j, timeUnit, (DebitCardResetPinSuccessActivity_ViewBinding) null, bankingAgentDeepLinkActivity);
    }

    public final <U, V> DebitCardResetOtpActivity<T> timeout(DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "firstTimeoutIndicator is null");
        return timeout0(debitCardResetPinSuccessActivity_ViewBinding, directDebitDeepLinkActivity, (DebitCardResetPinSuccessActivity_ViewBinding) null);
    }

    public final <U, V> DebitCardResetOtpActivity<T> timeout(DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> directDebitDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "firstTimeoutIndicator is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "other is null");
        return timeout0(debitCardResetPinSuccessActivity_ViewBinding, directDebitDeepLinkActivity, debitCardResetPinSuccessActivity_ViewBinding2);
    }

    private DebitCardResetOtpActivity<T> timeout0(long j, TimeUnit timeUnit, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "timeUnit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return new FastPayInputActivity(this, j, timeUnit, bankingAgentDeepLinkActivity, debitCardResetPinSuccessActivity_ViewBinding);
    }

    private <U, V> DebitCardResetOtpActivity<T> timeout0(DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> directDebitDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "itemTimeoutIndicator is null");
        return new FastPayOtpActivity(this, debitCardResetPinSuccessActivity_ViewBinding, directDebitDeepLinkActivity, debitCardResetPinSuccessActivity_ViewBinding2);
    }

    public final DebitCardResetOtpActivity<HmlETBLoanReviewActivity<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, HmlETBLandingActivity.read());
    }

    public final DebitCardResetOtpActivity<HmlETBLoanReviewActivity<T>> timestamp(BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return timestamp(TimeUnit.MILLISECONDS, bankingAgentDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<HmlETBLoanReviewActivity<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, HmlETBLandingActivity.read());
    }

    public final DebitCardResetOtpActivity<HmlETBLoanReviewActivity<T>> timestamp(TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return map(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(timeUnit, bankingAgentDeepLinkActivity));
    }

    /* renamed from: to */
    public final <R> R mo16622to(DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<T>, R> directDebitDeepLinkActivity) {
        try {
            return ((DirectDebitDeepLinkActivity) HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "converter is null")).write(this);
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
        }
    }

    public final BScanCNotificationDeepLinkActivity<List<T>> toList() {
        return toList(16);
    }

    public final BScanCNotificationDeepLinkActivity<List<T>> toList(int i) {
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "capacityHint");
        return new PdfViewerActivity_ViewBinding(this, i);
    }

    public final <U extends Collection<? super T>> BScanCNotificationDeepLinkActivity<U> toList(Callable<U> callable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "collectionSupplier is null");
        return new PdfViewerActivity_ViewBinding(this, callable);
    }

    public final <K> BScanCNotificationDeepLinkActivity<Map<K, T>> toMap(DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "keySelector is null");
        return collect(HmlConsentActivity.MediaBrowserCompat$ItemReceiver(), HmlCalculatorDeepLinkActivity.IconCompatParcelizer(directDebitDeepLinkActivity));
    }

    public final <K, V> BScanCNotificationDeepLinkActivity<Map<K, V>> toMap(DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends V> directDebitDeepLinkActivity2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "keySelector is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity2, "valueSelector is null");
        return collect(HmlConsentActivity.MediaBrowserCompat$ItemReceiver(), HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(directDebitDeepLinkActivity, directDebitDeepLinkActivity2));
    }

    public final <K, V> BScanCNotificationDeepLinkActivity<Map<K, V>> toMap(DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends V> directDebitDeepLinkActivity2, Callable<? extends Map<K, V>> callable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "keySelector is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity2, "valueSelector is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "mapSupplier is null");
        return collect(callable, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(directDebitDeepLinkActivity, directDebitDeepLinkActivity2));
    }

    public final <K> BScanCNotificationDeepLinkActivity<Map<K, Collection<T>>> toMultimap(DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity) {
        return toMultimap(directDebitDeepLinkActivity, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(), HmlConsentActivity.MediaBrowserCompat$ItemReceiver(), HmlBusinessAddressActivity.MediaBrowserCompat$ItemReceiver());
    }

    public final <K, V> BScanCNotificationDeepLinkActivity<Map<K, Collection<V>>> toMultimap(DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends V> directDebitDeepLinkActivity2) {
        return toMultimap(directDebitDeepLinkActivity, directDebitDeepLinkActivity2, HmlConsentActivity.MediaBrowserCompat$ItemReceiver(), HmlBusinessAddressActivity.MediaBrowserCompat$ItemReceiver());
    }

    public final <K, V> BScanCNotificationDeepLinkActivity<Map<K, Collection<V>>> toMultimap(DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends V> directDebitDeepLinkActivity2, Callable<? extends Map<K, Collection<V>>> callable, DirectDebitDeepLinkActivity<? super K, ? extends Collection<? super V>> directDebitDeepLinkActivity3) {
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "keySelector is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity2, "valueSelector is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "mapSupplier is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity3, "collectionFactory is null");
        return collect(callable, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(directDebitDeepLinkActivity, directDebitDeepLinkActivity2, directDebitDeepLinkActivity3));
    }

    public final <K, V> BScanCNotificationDeepLinkActivity<Map<K, Collection<V>>> toMultimap(DirectDebitDeepLinkActivity<? super T, ? extends K> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends V> directDebitDeepLinkActivity2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(directDebitDeepLinkActivity, directDebitDeepLinkActivity2, callable, HmlBusinessAddressActivity.MediaBrowserCompat$ItemReceiver());
    }

    public final DebitCardRequestReviewActivity<T> toFlowable(DebitCardCoachMarkActivity_ViewBinding debitCardCoachMarkActivity_ViewBinding) {
        ScbsOnboardDeepLinkActivity scbsOnboardDeepLinkActivity = new ScbsOnboardDeepLinkActivity(this);
        int i = C11715.MediaBrowserCompat$ItemReceiver[debitCardCoachMarkActivity_ViewBinding.ordinal()];
        if (i == 1) {
            return new NTBBankingServiceActivity(scbsOnboardDeepLinkActivity);
        }
        if (i == 2) {
            return new lambda$setIntroduction$0$IntroductionActivity(scbsOnboardDeepLinkActivity);
        }
        if (i == 3) {
            return scbsOnboardDeepLinkActivity;
        }
        if (i == 4) {
            return new closeIntroduction(scbsOnboardDeepLinkActivity);
        }
        int write = DebitCardRequestReviewActivity.write();
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(write, "capacity");
        return new ThirdPartySlipDeepLinkActivity(scbsOnboardDeepLinkActivity, write, true, false, HmlCalculatorDeepLinkActivity.read);
    }

    /* renamed from: o.DebitCardResetOtpActivity$5 */
    static /* synthetic */ class C11715 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.DebitCardCoachMarkActivity_ViewBinding[] r0 = p040o.DebitCardCoachMarkActivity_ViewBinding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.DebitCardCoachMarkActivity_ViewBinding r1 = p040o.DebitCardCoachMarkActivity_ViewBinding.DROP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.DebitCardCoachMarkActivity_ViewBinding r1 = p040o.DebitCardCoachMarkActivity_ViewBinding.LATEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.DebitCardCoachMarkActivity_ViewBinding r1 = p040o.DebitCardCoachMarkActivity_ViewBinding.MISSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.DebitCardCoachMarkActivity_ViewBinding r1 = p040o.DebitCardCoachMarkActivity_ViewBinding.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.DebitCardResetOtpActivity.C11715.<clinit>():void");
        }
    }

    public final BScanCNotificationDeepLinkActivity<List<T>> toSortedList() {
        return toSortedList(HmlCalculatorDeepLinkActivity.RatingCompat());
    }

    public final BScanCNotificationDeepLinkActivity<List<T>> toSortedList(Comparator<? super T> comparator) {
        HmlLatestPersonalInformationDeepLinkActivity.write(comparator, "comparator is null");
        BScanCNotificationDeepLinkActivity list = toList();
        DirectDebitDeepLinkActivity<List<? super T>, List<? super T>> read = HmlCalculatorDeepLinkActivity.read(comparator);
        HmlLatestPersonalInformationDeepLinkActivity.write(read, "mapper is null");
        return new onCopy(list, read);
    }

    public final BScanCNotificationDeepLinkActivity<List<T>> toSortedList(Comparator<? super T> comparator, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(comparator, "comparator is null");
        BScanCNotificationDeepLinkActivity list = toList(i);
        DirectDebitDeepLinkActivity<List<? super T>, List<? super T>> read = HmlCalculatorDeepLinkActivity.read(comparator);
        HmlLatestPersonalInformationDeepLinkActivity.write(read, "mapper is null");
        return new onCopy(list, read);
    }

    public final BScanCNotificationDeepLinkActivity<List<T>> toSortedList(int i) {
        return toSortedList(HmlCalculatorDeepLinkActivity.RatingCompat(), i);
    }

    public final DebitCardResetOtpActivity<T> unsubscribeOn(BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity, "scheduler is null");
        return new FastPaySettingActivity_ViewBinding(this, bankingAgentDeepLinkActivity);
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j) {
        return window(j, j, bufferSize());
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j, long j2) {
        return window(j, j2, bufferSize());
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j, long j2, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$ItemReceiver(j, "count");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$ItemReceiver(j2, "skip");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new onSaveButtonClick(this, j, j2, i);
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j, long j2, TimeUnit timeUnit) {
        return window(j, j2, timeUnit, HmlETBLandingActivity.read(), bufferSize());
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return window(j, j2, timeUnit, bankingAgentDeepLinkActivity, bufferSize());
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$ItemReceiver(j, "timespan");
        long j3 = j2;
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$ItemReceiver(j3, "timeskip");
        int i2 = i;
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i2, "bufferSize");
        BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity2 = bankingAgentDeepLinkActivity;
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity2, "scheduler is null");
        TimeUnit timeUnit2 = timeUnit;
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit2, "unit is null");
        return new FindUsActivity(this, j, j3, timeUnit2, bankingAgentDeepLinkActivity2, Long.MAX_VALUE, i2, false);
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j, TimeUnit timeUnit) {
        return window(j, timeUnit, HmlETBLandingActivity.read(), Long.MAX_VALUE, false);
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j, TimeUnit timeUnit, long j2) {
        return window(j, timeUnit, HmlETBLandingActivity.read(), j2, false);
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j, TimeUnit timeUnit, long j2, boolean z) {
        return window(j, timeUnit, HmlETBLandingActivity.read(), j2, z);
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        return window(j, timeUnit, bankingAgentDeepLinkActivity, Long.MAX_VALUE, false);
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, long j2) {
        return window(j, timeUnit, bankingAgentDeepLinkActivity, j2, false);
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, long j2, boolean z) {
        return window(j, timeUnit, bankingAgentDeepLinkActivity, j2, z, bufferSize());
    }

    public final DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, long j2, boolean z, int i) {
        int i2 = i;
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i2, "bufferSize");
        BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity2 = bankingAgentDeepLinkActivity;
        HmlLatestPersonalInformationDeepLinkActivity.write(bankingAgentDeepLinkActivity2, "scheduler is null");
        TimeUnit timeUnit2 = timeUnit;
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit2, "unit is null");
        long j3 = j2;
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$ItemReceiver(j3, "count");
        return new FindUsActivity(this, j, j, timeUnit2, bankingAgentDeepLinkActivity2, j3, i2, z);
    }

    public final <B> DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(DebitCardResetPinSuccessActivity_ViewBinding<B> debitCardResetPinSuccessActivity_ViewBinding) {
        return window(debitCardResetPinSuccessActivity_ViewBinding, bufferSize());
    }

    public final <B> DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(DebitCardResetPinSuccessActivity_ViewBinding<B> debitCardResetPinSuccessActivity_ViewBinding, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "boundary is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new FastPaySettingActivity(this, debitCardResetPinSuccessActivity_ViewBinding, i);
    }

    public final <U, V> DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super U, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> directDebitDeepLinkActivity) {
        return window(debitCardResetPinSuccessActivity_ViewBinding, directDebitDeepLinkActivity, bufferSize());
    }

    public final <U, V> DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super U, ? extends DebitCardResetPinSuccessActivity_ViewBinding<V>> directDebitDeepLinkActivity, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "openingIndicator is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "closingIndicator is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new FastPayTransferReviewActivity(this, debitCardResetPinSuccessActivity_ViewBinding, directDebitDeepLinkActivity, i);
    }

    public final <B> DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<B>> callable) {
        return window(callable, bufferSize());
    }

    public final <B> DebitCardResetOtpActivity<DebitCardResetOtpActivity<T>> window(Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<B>> callable, int i) {
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "boundary is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(i, "bufferSize");
        return new onClickDetailLayout(this, callable, i);
    }

    public final <U, R> DebitCardResetOtpActivity<R> withLatestFrom(DebitCardResetPinSuccessActivity_ViewBinding<? extends U> debitCardResetPinSuccessActivity_ViewBinding, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(chequeManagementDeepLinkActivity, "combiner is null");
        return new ManageFastPayQrScanActivity(this, chequeManagementDeepLinkActivity, debitCardResetPinSuccessActivity_ViewBinding);
    }

    public final <T1, T2, R> DebitCardResetOtpActivity<R> withLatestFrom(DebitCardResetPinSuccessActivity_ViewBinding<T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardDeepLinkActivity<? super T, ? super T1, ? super T2, R> debitCardDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "o1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "o2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardDeepLinkActivity, "combiner is null");
        return withLatestFrom((DebitCardResetPinSuccessActivity_ViewBinding<?>[]) new DebitCardResetPinSuccessActivity_ViewBinding[]{debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2}, HmlCalculatorDeepLinkActivity.IconCompatParcelizer(debitCardDeepLinkActivity));
    }

    public final <T1, T2, T3, R> DebitCardResetOtpActivity<R> withLatestFrom(DebitCardResetPinSuccessActivity_ViewBinding<T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<T3> debitCardResetPinSuccessActivity_ViewBinding3, ETBProductDetailDeepLinkActivity<? super T, ? super T1, ? super T2, ? super T3, R> eTBProductDetailDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "o1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "o2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "o3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(eTBProductDetailDeepLinkActivity, "combiner is null");
        return withLatestFrom((DebitCardResetPinSuccessActivity_ViewBinding<?>[]) new DebitCardResetPinSuccessActivity_ViewBinding[]{debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3}, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver(eTBProductDetailDeepLinkActivity));
    }

    public final <T1, T2, T3, T4, R> DebitCardResetOtpActivity<R> withLatestFrom(DebitCardResetPinSuccessActivity_ViewBinding<T1> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<T2> debitCardResetPinSuccessActivity_ViewBinding2, DebitCardResetPinSuccessActivity_ViewBinding<T3> debitCardResetPinSuccessActivity_ViewBinding3, DebitCardResetPinSuccessActivity_ViewBinding<T4> debitCardResetPinSuccessActivity_ViewBinding4, EmailVerificationAndOtpVerificationDeepLinkActivity<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> emailVerificationAndOtpVerificationDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "o1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding2, "o2 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding3, "o3 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding4, "o4 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(emailVerificationAndOtpVerificationDeepLinkActivity, "combiner is null");
        return withLatestFrom((DebitCardResetPinSuccessActivity_ViewBinding<?>[]) new DebitCardResetPinSuccessActivity_ViewBinding[]{debitCardResetPinSuccessActivity_ViewBinding, debitCardResetPinSuccessActivity_ViewBinding2, debitCardResetPinSuccessActivity_ViewBinding3, debitCardResetPinSuccessActivity_ViewBinding4}, HmlCalculatorDeepLinkActivity.write(emailVerificationAndOtpVerificationDeepLinkActivity));
    }

    public final <R> DebitCardResetOtpActivity<R> withLatestFrom(DebitCardResetPinSuccessActivity_ViewBinding<?>[] debitCardResetPinSuccessActivity_ViewBindingArr, DirectDebitDeepLinkActivity<? super Object[], R> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBindingArr, "others is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "combiner is null");
        return new onClickInitStateLayout(this, debitCardResetPinSuccessActivity_ViewBindingArr, directDebitDeepLinkActivity);
    }

    public final <R> DebitCardResetOtpActivity<R> withLatestFrom(Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> iterable, DirectDebitDeepLinkActivity<? super Object[], R> directDebitDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(iterable, "others is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "combiner is null");
        return new onClickInitStateLayout(this, iterable, directDebitDeepLinkActivity);
    }

    public final <U, R> DebitCardResetOtpActivity<R> zipWith(Iterable<U> iterable, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(iterable, "other is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(chequeManagementDeepLinkActivity, "zipper is null");
        return new SelectProvinceOrDistrictActivity(this, iterable, chequeManagementDeepLinkActivity);
    }

    public final <U, R> DebitCardResetOtpActivity<R> zipWith(DebitCardResetPinSuccessActivity_ViewBinding<? extends U> debitCardResetPinSuccessActivity_ViewBinding, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "other is null");
        return zip(this, debitCardResetPinSuccessActivity_ViewBinding, chequeManagementDeepLinkActivity);
    }

    public final <U, R> DebitCardResetOtpActivity<R> zipWith(DebitCardResetPinSuccessActivity_ViewBinding<? extends U> debitCardResetPinSuccessActivity_ViewBinding, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> chequeManagementDeepLinkActivity, boolean z) {
        return zip(this, debitCardResetPinSuccessActivity_ViewBinding, chequeManagementDeepLinkActivity, z);
    }

    public final <U, R> DebitCardResetOtpActivity<R> zipWith(DebitCardResetPinSuccessActivity_ViewBinding<? extends U> debitCardResetPinSuccessActivity_ViewBinding, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> chequeManagementDeepLinkActivity, boolean z, int i) {
        return zip(this, debitCardResetPinSuccessActivity_ViewBinding, chequeManagementDeepLinkActivity, z, i);
    }

    public final HmlDocumentListActivity<T> test() {
        HmlDocumentListActivity<T> hmlDocumentListActivity = new HmlDocumentListActivity<>();
        subscribe(hmlDocumentListActivity);
        return hmlDocumentListActivity;
    }

    public final HmlDocumentListActivity<T> test(boolean z) {
        HmlDocumentListActivity<T> hmlDocumentListActivity = new HmlDocumentListActivity<>();
        if (z) {
            hmlDocumentListActivity.dispose();
        }
        subscribe(hmlDocumentListActivity);
        return hmlDocumentListActivity;
    }

    public final void blockingSubscribe() {
        HmlBusinessEmailAboutActivity hmlBusinessEmailAboutActivity = new HmlBusinessEmailAboutActivity();
        OpenAccountEtbNoActiveCasaDeepLinkActivity openAccountEtbNoActiveCasaDeepLinkActivity = new OpenAccountEtbNoActiveCasaDeepLinkActivity(HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(), hmlBusinessEmailAboutActivity, hmlBusinessEmailAboutActivity, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver());
        subscribe(openAccountEtbNoActiveCasaDeepLinkActivity);
        if (hmlBusinessEmailAboutActivity.getCount() != 0) {
            try {
                boolean z = AlertController$RecycleListView.read.read;
                hmlBusinessEmailAboutActivity.await();
            } catch (InterruptedException e) {
                openAccountEtbNoActiveCasaDeepLinkActivity.dispose();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
        Throwable th = hmlBusinessEmailAboutActivity.MediaBrowserCompat$CustomActionResultReceiver;
        if (th != null) {
            throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
        }
    }
}

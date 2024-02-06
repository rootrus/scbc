package p040o;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: o.DebitWithdrawalLimitAdapter$LimitCustomViewHolder */
public final class DebitWithdrawalLimitAdapter$LimitCustomViewHolder {
    private static final char[] MediaBrowserCompat$ItemReceiver = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    CreditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding IconCompatParcelizer = CreditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding.STRICT;
    String MediaBrowserCompat$CustomActionResultReceiver = null;
    public List<C9699x9b8f7d27> read = null;
    Charset write = null;

    DebitWithdrawalLimitAdapter$LimitCustomViewHolder() {
    }

    private static String write() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int nextInt = random.nextInt(11);
        for (int i = 0; i < nextInt + 30; i++) {
            char[] cArr = MediaBrowserCompat$ItemReceiver;
            sb.append(cArr[random.nextInt(cArr.length)]);
        }
        return sb.toString();
    }

    public final IntroductionViewPagerAdapter$IntroductionItemHolder IconCompatParcelizer() {
        DebitCardDetailAdapter$DebitCardHolder_ViewBinding debitCardDetailAdapter$DebitCardHolder_ViewBinding;
        String write2 = write();
        Charset charset = this.write;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new DepositAccountSelectorAdapter$ItemViewHolder("boundary", write2));
        if (charset != null) {
            arrayList.add(new DepositAccountSelectorAdapter$ItemViewHolder("charset", charset.name()));
        }
        CreditCardDetailUnbilledAdapter$ParentViewHolder write3 = CreditCardDetailUnbilledAdapter$ParentViewHolder.write("multipart/form-data", (C9698x5b61c61d[]) arrayList.toArray(new C9698x5b61c61d[arrayList.size()]));
        List arrayList2 = this.read != null ? new ArrayList(this.read) : Collections.emptyList();
        CreditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding creditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding = this.IconCompatParcelizer;
        if (creditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding == null) {
            creditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding = CreditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding.STRICT;
        }
        int i = C97042.read[creditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding.ordinal()];
        if (i == 1) {
            debitCardDetailAdapter$DebitCardHolder_ViewBinding = new TenureViewHolder_ViewBinding(charset, write2, arrayList2);
        } else if (i != 2) {
            debitCardDetailAdapter$DebitCardHolder_ViewBinding = new OccupationAdapter$CustomViewHolder_ViewBinding(charset, write2, arrayList2);
        } else {
            debitCardDetailAdapter$DebitCardHolder_ViewBinding = new SelectionAdapter$SelectionHolder(charset, write2, arrayList2);
        }
        return new IntroductionViewPagerAdapter$IntroductionItemHolder(debitCardDetailAdapter$DebitCardHolder_ViewBinding, write3, debitCardDetailAdapter$DebitCardHolder_ViewBinding.IconCompatParcelizer());
    }

    /* renamed from: o.DebitWithdrawalLimitAdapter$LimitCustomViewHolder$2 */
    static /* synthetic */ class C97042 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                o.CreditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding[] r0 = p040o.CreditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.CreditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding r1 = p040o.CreditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding.BROWSER_COMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.CreditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding r1 = p040o.CreditCardDetailUnbilledAdapter$ParentViewHolder_ViewBinding.RFC6532     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.DebitWithdrawalLimitAdapter$LimitCustomViewHolder.C97042.<clinit>():void");
        }
    }
}

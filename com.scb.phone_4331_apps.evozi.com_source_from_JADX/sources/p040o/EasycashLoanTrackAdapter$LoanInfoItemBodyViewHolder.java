package p040o;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: o.EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder */
public final class EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder extends MerchantWalletSelectorAdapter$ItemViewHolder_ViewBinding {
    private static final DateFormat MediaBrowserCompat$CustomActionResultReceiver;
    private static final TimeZone MediaBrowserCompat$ItemReceiver = TimeZone.getTimeZone("GMT");
    public Date write;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        MediaBrowserCompat$CustomActionResultReceiver = simpleDateFormat;
        simpleDateFormat.setTimeZone(MediaBrowserCompat$ItemReceiver);
    }

    private EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder) {
        super(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
    }

    EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder, Date date) {
        this(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
        Calendar instance = Calendar.getInstance(MediaBrowserCompat$ItemReceiver);
        instance.setTimeInMillis(date.getTime());
        int i = instance.get(1);
        int i2 = instance.get(2);
        int i3 = instance.get(5);
        instance.clear();
        instance.set(i, i2, i3);
        this.write = instance.getTime();
    }

    public EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder, byte[] bArr) {
        this(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
        if (bArr.length == 6) {
            int i = (bArr[0] * 10) + CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE + bArr[1];
            int i2 = ((bArr[2] * 10) + bArr[3]) - 1;
            int i3 = (bArr[4] * 10) + bArr[5];
            Calendar instance = Calendar.getInstance(MediaBrowserCompat$ItemReceiver);
            instance.clear();
            if (easycashLoanTrackAdapter$LoanInfoHeaderViewHolder == EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EFFECTIVE_DATE) {
                instance.set(i, i2, i3, 0, 0, 0);
            } else {
                instance.set(i, i2, i3, 23, 59, 59);
            }
            this.write = instance.getTime();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("data argument must have length 6, was ");
        sb.append(bArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final byte[] MediaBrowserCompat$ItemReceiver() {
        Calendar instance = Calendar.getInstance(MediaBrowserCompat$ItemReceiver);
        instance.setTimeInMillis(this.write.getTime());
        int i = instance.get(1) - 2000;
        int i2 = instance.get(2) + 1;
        int i3 = instance.get(5);
        return new byte[]{(byte) (i / 10), (byte) (i % 10), (byte) (i2 / 10), (byte) (i2 % 10), (byte) (i3 / 10), (byte) (i3 % 10)};
    }

    /* access modifiers changed from: protected */
    public final String IconCompatParcelizer() {
        return MediaBrowserCompat$CustomActionResultReceiver.format(this.write);
    }
}

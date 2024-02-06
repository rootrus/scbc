package p040o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.MessageConstraintException;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import p040o.PrivacyManagementLandingActivity;

/* renamed from: o.ExportCardStatementSelectionAdapter$ItemSelectionViewHolder */
public abstract class ExportCardStatementSelectionAdapter$ItemSelectionViewHolder<T extends PrivacyManagementLandingActivity> implements PaginationViewFooterHolder_ViewBinding<T> {
    private T IconCompatParcelizer;
    private final List<DepositTransactionAdapter$ChildViewHolder_ViewBinding> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
    public final AmountDetailsAdapter$SuccessRow_ViewBinding MediaBrowserCompat$ItemReceiver = StopChequeHistoryAdapter$ViewHolder.write;
    private int MediaDescriptionCompat = 0;
    private final EnterProxyActivity read;
    private final OPRRewardTiersAdapter$TierViewHolder_ViewBinding write;

    /* access modifiers changed from: protected */
    public abstract T IconCompatParcelizer(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding) throws IOException, HttpException, ParseException;

    @Deprecated
    public ExportCardStatementSelectionAdapter$ItemSelectionViewHolder(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding, AmountDetailsAdapter$SuccessRow_ViewBinding amountDetailsAdapter$SuccessRow_ViewBinding, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, "Session input buffer");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        this.write = oPRRewardTiersAdapter$TierViewHolder_ViewBinding;
        EnterProxyActivity$MediaBrowserCompat$CustomActionResultReceiver read2 = EnterProxyActivity.read();
        read2.MediaBrowserCompat$ItemReceiver = amountDetailsSuccessAdapter$SuccessRow_ViewBinding.MediaBrowserCompat$ItemReceiver("http.connection.max-header-count", -1);
        read2.write = amountDetailsSuccessAdapter$SuccessRow_ViewBinding.MediaBrowserCompat$ItemReceiver("http.connection.max-line-length", -1);
        this.read = new EnterProxyActivity(read2.write, read2.MediaBrowserCompat$ItemReceiver);
    }

    public static PrepaidRequestMarketConductActivity[] write(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding, int i, int i2, AmountDetailsAdapter$SuccessRow_ViewBinding amountDetailsAdapter$SuccessRow_ViewBinding, List<DepositTransactionAdapter$ChildViewHolder_ViewBinding> list) throws HttpException, IOException {
        int i3;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, "Session input buffer");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsAdapter$SuccessRow_ViewBinding, "Line parser");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(list, "Header line list");
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = null;
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding2 = null;
        while (true) {
            i3 = 0;
            if (depositTransactionAdapter$ChildViewHolder_ViewBinding == null) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(64);
            } else {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer = 0;
            }
            if (oPRRewardTiersAdapter$TierViewHolder_ViewBinding.read(depositTransactionAdapter$ChildViewHolder_ViewBinding) == -1 || depositTransactionAdapter$ChildViewHolder_ViewBinding.length() <= 0) {
                PrepaidRequestMarketConductActivity[] prepaidRequestMarketConductActivityArr = new PrepaidRequestMarketConductActivity[list.size()];
            } else {
                if ((depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(0) == ' ' || depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(0) == 9) && depositTransactionAdapter$ChildViewHolder_ViewBinding2 != null) {
                    while (i3 < depositTransactionAdapter$ChildViewHolder_ViewBinding.length() && ((r4 = depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i3)) == ' ' || r4 == 9)) {
                        i3++;
                    }
                    if (i2 <= 0 || ((depositTransactionAdapter$ChildViewHolder_ViewBinding2.length() + 1) + depositTransactionAdapter$ChildViewHolder_ViewBinding.length()) - i3 <= i2) {
                        depositTransactionAdapter$ChildViewHolder_ViewBinding2.read(' ');
                        int length = depositTransactionAdapter$ChildViewHolder_ViewBinding.length() - i3;
                        if (depositTransactionAdapter$ChildViewHolder_ViewBinding != null) {
                            depositTransactionAdapter$ChildViewHolder_ViewBinding2.MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding.write, i3, length);
                        }
                    } else {
                        throw new MessageConstraintException("Maximum line length limit exceeded");
                    }
                } else {
                    list.add(depositTransactionAdapter$ChildViewHolder_ViewBinding);
                    depositTransactionAdapter$ChildViewHolder_ViewBinding2 = depositTransactionAdapter$ChildViewHolder_ViewBinding;
                    depositTransactionAdapter$ChildViewHolder_ViewBinding = null;
                }
                if (i > 0 && list.size() >= i) {
                    throw new MessageConstraintException("Maximum header count exceeded");
                }
            }
        }
        PrepaidRequestMarketConductActivity[] prepaidRequestMarketConductActivityArr2 = new PrepaidRequestMarketConductActivity[list.size()];
        while (i3 < list.size()) {
            try {
                prepaidRequestMarketConductActivityArr2[i3] = amountDetailsAdapter$SuccessRow_ViewBinding.read(list.get(i3));
                i3++;
            } catch (ParseException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        return prepaidRequestMarketConductActivityArr2;
    }

    public final T write() throws IOException, HttpException {
        int i = this.MediaDescriptionCompat;
        if (i == 0) {
            try {
                this.IconCompatParcelizer = IconCompatParcelizer(this.write);
                this.MediaDescriptionCompat = 1;
            } catch (ParseException e) {
                throw new ProtocolException(e.getMessage(), e);
            }
        } else if (i != 1) {
            throw new IllegalStateException("Inconsistent parser state");
        }
        this.IconCompatParcelizer.IconCompatParcelizer(write(this.write, this.read.MediaBrowserCompat$ItemReceiver, this.read.read, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver));
        T t = this.IconCompatParcelizer;
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompat$CustomActionResultReceiver.clear();
        this.MediaDescriptionCompat = 0;
        return t;
    }
}

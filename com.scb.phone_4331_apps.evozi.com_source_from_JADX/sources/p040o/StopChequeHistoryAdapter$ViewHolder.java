package p040o;

import org.apache.http.ParseException;

/* renamed from: o.StopChequeHistoryAdapter$ViewHolder */
public final class StopChequeHistoryAdapter$ViewHolder implements AmountDetailsAdapter$SuccessRow_ViewBinding {
    public static final StopChequeHistoryAdapter$ViewHolder write = new StopChequeHistoryAdapter$ViewHolder();
    private ReviewAccountsActivity MediaBrowserCompat$ItemReceiver;

    static {
        new StopChequeHistoryAdapter$ViewHolder();
    }

    private StopChequeHistoryAdapter$ViewHolder(byte b) {
        this.MediaBrowserCompat$ItemReceiver = ManageAccountInboundActivity.IconCompatParcelizer;
    }

    public StopChequeHistoryAdapter$ViewHolder() {
        this((byte) 0);
    }

    private ReviewAccountsActivity MediaBrowserCompat$CustomActionResultReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup) throws ParseException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, "Char array buffer");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(radioButtonGroupAdapter$RadioButtonViewGroup, "Parser cursor");
        String str = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        int length = str.length();
        int i = radioButtonGroupAdapter$RadioButtonViewGroup.write;
        int i2 = radioButtonGroupAdapter$RadioButtonViewGroup.read;
        IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup);
        int i3 = radioButtonGroupAdapter$RadioButtonViewGroup.write;
        int i4 = i3 + length;
        if (i4 + 4 <= i2) {
            boolean z = false;
            int i5 = 0;
            boolean z2 = true;
            while (z2 && i5 < length) {
                z2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i3 + i5) == str.charAt(i5);
                i5++;
            }
            if (z2) {
                if (depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i4) == '/') {
                    z = true;
                }
                z2 = z;
            }
            if (z2) {
                int i6 = i3 + length + 1;
                int write2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write(46, i6, i2);
                if (write2 != -1) {
                    try {
                        int parseInt = Integer.parseInt(depositTransactionAdapter$ChildViewHolder_ViewBinding.write(i6, write2));
                        int i7 = write2 + 1;
                        int write3 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write(32, i7, i2);
                        if (write3 == -1) {
                            write3 = i2;
                        }
                        try {
                            int parseInt2 = Integer.parseInt(depositTransactionAdapter$ChildViewHolder_ViewBinding.write(i7, write3));
                            radioButtonGroupAdapter$RadioButtonViewGroup.write(write3);
                            return this.MediaBrowserCompat$ItemReceiver.read(parseInt, parseInt2);
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid protocol minor version number: ");
                            sb.append(depositTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, i2));
                            throw new ParseException(sb.toString());
                        }
                    } catch (NumberFormatException unused2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid protocol major version number: ");
                        sb2.append(depositTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, i2));
                        throw new ParseException(sb2.toString());
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid protocol version number: ");
                    sb3.append(depositTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, i2));
                    throw new ParseException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Not a valid protocol version: ");
                sb4.append(depositTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, i2));
                throw new ParseException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Not a valid protocol version: ");
            sb5.append(depositTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, i2));
            throw new ParseException(sb5.toString());
        }
    }

    public final boolean write(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, "Char array buffer");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(radioButtonGroupAdapter$RadioButtonViewGroup, "Parser cursor");
        int i = radioButtonGroupAdapter$RadioButtonViewGroup.write;
        String str = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        int length = str.length();
        boolean z = false;
        if (depositTransactionAdapter$ChildViewHolder_ViewBinding.length() < length + 4) {
            return false;
        }
        if (i < 0) {
            i = (depositTransactionAdapter$ChildViewHolder_ViewBinding.length() - 4) - length;
        } else if (i == 0) {
            while (i < depositTransactionAdapter$ChildViewHolder_ViewBinding.length() && CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i))) {
                i++;
            }
        }
        int i2 = i + length;
        if (i2 + 4 > depositTransactionAdapter$ChildViewHolder_ViewBinding.length()) {
            return false;
        }
        boolean z2 = true;
        int i3 = 0;
        while (z2 && i3 < length) {
            z2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i + i3) == str.charAt(i3);
            i3++;
        }
        if (!z2) {
            return z2;
        }
        if (depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i2) == '/') {
            z = true;
        }
        return z;
    }

    public final VerifyIdentityActivity read(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup) throws ParseException {
        String str;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, "Char array buffer");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(radioButtonGroupAdapter$RadioButtonViewGroup, "Parser cursor");
        int i = radioButtonGroupAdapter$RadioButtonViewGroup.write;
        int i2 = radioButtonGroupAdapter$RadioButtonViewGroup.read;
        try {
            ReviewAccountsActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup);
            IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup);
            int i3 = radioButtonGroupAdapter$RadioButtonViewGroup.write;
            int write2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write(32, i3, i2);
            if (write2 < 0) {
                write2 = i2;
            }
            String write3 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write(i3, write2);
            int i4 = 0;
            while (i4 < write3.length()) {
                if (Character.isDigit(write3.charAt(i4))) {
                    i4++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Status line contains invalid status code: ");
                    sb.append(depositTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, i2));
                    throw new ParseException(sb.toString());
                }
            }
            int parseInt = Integer.parseInt(write3);
            if (write2 < i2) {
                str = depositTransactionAdapter$ChildViewHolder_ViewBinding.write(write2, i2);
            } else {
                str = "";
            }
            return new PaymentInfoAdapter$ViewTypeTextAndImageHolder(MediaBrowserCompat$CustomActionResultReceiver, parseInt, str);
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Status line contains invalid status code: ");
            sb2.append(depositTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, i2));
            throw new ParseException(sb2.toString());
        } catch (IndexOutOfBoundsException unused2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid status line: ");
            sb3.append(depositTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, i2));
            throw new ParseException(sb3.toString());
        }
    }

    public final PrepaidRequestMarketConductActivity read(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding) throws ParseException {
        return new AmountDetailsAdapter$SuccessRow(depositTransactionAdapter$ChildViewHolder_ViewBinding);
    }

    private static void IconCompatParcelizer(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup) {
        int i = radioButtonGroupAdapter$RadioButtonViewGroup.write;
        int i2 = radioButtonGroupAdapter$RadioButtonViewGroup.read;
        while (i < i2 && CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i))) {
            i++;
        }
        radioButtonGroupAdapter$RadioButtonViewGroup.write(i);
    }
}

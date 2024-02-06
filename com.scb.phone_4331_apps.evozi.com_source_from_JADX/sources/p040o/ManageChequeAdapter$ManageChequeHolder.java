package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;

/* renamed from: o.ManageChequeAdapter$ManageChequeHolder */
public final class ManageChequeAdapter$ManageChequeHolder implements PrepaidTravelConversionLandingActivity_ViewBinding, Cloneable {
    private final AddAccountsActivity[] IconCompatParcelizer;
    private final String MediaBrowserCompat$ItemReceiver;
    private final String write;

    public ManageChequeAdapter$ManageChequeHolder(String str, String str2, AddAccountsActivity[] addAccountsActivityArr) {
        this.MediaBrowserCompat$ItemReceiver = (String) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, KtaJsonExactionHelper.NAME);
        this.write = str2;
        if (addAccountsActivityArr != null) {
            this.IconCompatParcelizer = addAccountsActivityArr;
        } else {
            this.IconCompatParcelizer = new AddAccountsActivity[0];
        }
    }

    public ManageChequeAdapter$ManageChequeHolder(String str, String str2) {
        this(str, str2, (AddAccountsActivity[]) null);
    }

    public final String read() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String write() {
        return this.write;
    }

    public final AddAccountsActivity[] MediaBrowserCompat$ItemReceiver() {
        return (AddAccountsActivity[]) this.IconCompatParcelizer.clone();
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer.length;
    }

    public final AddAccountsActivity read(int i) {
        return this.IconCompatParcelizer[i];
    }

    public final AddAccountsActivity IconCompatParcelizer(String str) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, KtaJsonExactionHelper.NAME);
        for (AddAccountsActivity addAccountsActivity : this.IconCompatParcelizer) {
            if (addAccountsActivity.IconCompatParcelizer().equalsIgnoreCase(str)) {
                return addAccountsActivity;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepaidTravelConversionLandingActivity_ViewBinding)) {
            return false;
        }
        ManageChequeAdapter$ManageChequeHolder manageChequeAdapter$ManageChequeHolder = (ManageChequeAdapter$ManageChequeHolder) obj;
        if (this.MediaBrowserCompat$ItemReceiver.equals(manageChequeAdapter$ManageChequeHolder.MediaBrowserCompat$ItemReceiver)) {
            String str = this.write;
            String str2 = manageChequeAdapter$ManageChequeHolder.write;
            if ((str == null ? str2 == null : str.equals(str2)) && AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer((Object[]) this.IconCompatParcelizer, (Object[]) manageChequeAdapter$ManageChequeHolder.IconCompatParcelizer)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i + 629;
        String str2 = this.write;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (i3 * 37) + i2;
        AddAccountsActivity[] addAccountsActivityArr = this.IconCompatParcelizer;
        int length = addAccountsActivityArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            AddAccountsActivity addAccountsActivity = addAccountsActivityArr[i5];
            i4 = (i4 * 37) + (addAccountsActivity != null ? addAccountsActivity.hashCode() : 0);
        }
        return i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        if (this.write != null) {
            sb.append("=");
            sb.append(this.write);
        }
        for (AddAccountsActivity append : this.IconCompatParcelizer) {
            sb.append("; ");
            sb.append(append);
        }
        return sb.toString();
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

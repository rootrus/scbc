package p040o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import okhttp3.internal.cache.DiskLruCache;
import org.ksoap2.repackaged.SoapFault;
import org.ksoap2.repackaged.SoapFault12;
import org.xmlpull.repackaged.p103v1.XmlPullParserException;

/* renamed from: o.AccountSelectorViewHolder */
public class AccountSelectorViewHolder extends LendingIssuerAdapter$IssuerViewHolder_ViewBinding {
    private static AccountHeaderViewHolder MediaSessionCompat$ResultReceiverWrapper = new AccountRepaymentPlanSelectorViewHolder_ViewBinding();
    public boolean MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private Vector f5806x50fd9e4a;
    private Hashtable MediaSessionCompat$QueueItem = new Hashtable();
    private Hashtable MediaSessionCompat$Token = new Hashtable();
    private boolean ParcelableVolumeInfo = true;
    private Hashtable PlaybackStateCompat = new Hashtable();
    private Hashtable PlaybackStateCompat$CustomAction = new Hashtable();

    public AccountSelectorViewHolder() {
        super(110);
        IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, "Array", AccountRemarkViewHolder.MediaBrowserCompat$SearchResultReceiver, (AccountHeaderViewHolder) null);
        MediaSessionCompat$ResultReceiverWrapper.register(this);
    }

    public final void write(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding) throws IOException, XmlPullParserException {
        SoapFault soapFault;
        this.IconCompatParcelizer = null;
        historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
        if (historyAdapter$GroupErrorViewHolder_ViewBinding.write() != 2 || !historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$MediaItem().equals(this.read) || !historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat().equals("Fault")) {
            while (historyAdapter$GroupErrorViewHolder_ViewBinding.write() == 2) {
                String MediaBrowserCompat$ItemReceiver = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, "root");
                Object IconCompatParcelizer = IconCompatParcelizer(historyAdapter$GroupErrorViewHolder_ViewBinding, (Object) null, -1, historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$MediaItem(), historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat(), AccountRemarkViewHolder.IconCompatParcelizer);
                if (DiskLruCache.VERSION_1.equals(MediaBrowserCompat$ItemReceiver) || this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = IconCompatParcelizer;
                }
                historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
            }
            return;
        }
        if (this.MediaMetadataCompat < 120) {
            soapFault = new SoapFault((byte) 0);
        } else {
            soapFault = new SoapFault12((byte) 0);
        }
        soapFault.MediaBrowserCompat$CustomActionResultReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding);
        this.IconCompatParcelizer = soapFault;
    }

    private void write(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding, C10410xd06cdadd loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding) throws IOException, XmlPullParserException {
        int i;
        int MediaSessionCompat$QueueItem2;
        String str;
        int i2;
        String str2;
        HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding2 = historyAdapter$GroupErrorViewHolder_ViewBinding;
        C10410xd06cdadd loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2 = loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding;
        try {
            i = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
        } catch (XmlPullParserException unused) {
            if (loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2 instanceof LoanInformationCardAdapter$LoanInformationCardViewHolder) {
                LoanInformationCardAdapter$LoanInformationCardViewHolder loanInformationCardAdapter$LoanInformationCardViewHolder = (LoanInformationCardAdapter$LoanInformationCardViewHolder) loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2;
                if (historyAdapter$GroupErrorViewHolder_ViewBinding.RatingCompat() != null) {
                    str2 = historyAdapter$GroupErrorViewHolder_ViewBinding.RatingCompat();
                } else {
                    str2 = "";
                }
                loanInformationCardAdapter$LoanInformationCardViewHolder.write(str2);
            }
            i = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
        }
        while (i != 3) {
            String MediaDescriptionCompat = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat();
            if (!this.MediaBrowserCompat$SearchResultReceiver || !(loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2 instanceof AccountHeaderViewHolder_ViewBinding)) {
                AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
                int propertyCount = loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding.getPropertyCount();
                int i3 = 0;
                boolean z = false;
                int i4 = 0;
                while (i4 < propertyCount && !z) {
                    accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaBrowserCompat$ItemReceiver;
                    accountRemarkViewHolder.MediaBrowserCompat$MediaItem = i3;
                    accountRemarkViewHolder.f5805x50fd9e4a = null;
                    accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper = null;
                    loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2.getPropertyInfo(i4, this.PlaybackStateCompat, accountRemarkViewHolder);
                    if ((!MediaDescriptionCompat.equals(accountRemarkViewHolder.f5805x50fd9e4a) || accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper != null) && (!MediaDescriptionCompat.equals(accountRemarkViewHolder.f5805x50fd9e4a) || !historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$MediaItem().equals(accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper))) {
                        i2 = i4;
                    } else {
                        i2 = i4;
                        loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2.setProperty(i2, IconCompatParcelizer(historyAdapter$GroupErrorViewHolder_ViewBinding, loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding, i4, (String) null, (String) null, accountRemarkViewHolder));
                        z = true;
                    }
                    i4 = i2 + 1;
                    i3 = 0;
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown Property: ");
                    sb.append(MediaDescriptionCompat);
                    throw new RuntimeException(sb.toString());
                } else if (loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2 instanceof AccountEStatementViewHolder) {
                    int MediaBrowserCompat$ItemReceiver = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver();
                    for (int i5 = 0; i5 < MediaBrowserCompat$ItemReceiver; i5++) {
                        AccountDebitSelectorViewHolder_ViewBinding accountDebitSelectorViewHolder_ViewBinding = new AccountDebitSelectorViewHolder_ViewBinding();
                        accountDebitSelectorViewHolder_ViewBinding.f5805x50fd9e4a = historyAdapter$GroupErrorViewHolder_ViewBinding2.read(i5);
                        accountDebitSelectorViewHolder_ViewBinding.write(historyAdapter$GroupErrorViewHolder_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver(i5));
                        accountDebitSelectorViewHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper = historyAdapter$GroupErrorViewHolder_ViewBinding2.write(i5);
                        accountDebitSelectorViewHolder_ViewBinding.MediaSessionCompat$QueueItem = historyAdapter$GroupErrorViewHolder_ViewBinding.IconCompatParcelizer();
                    }
                }
            } else {
                AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = (AccountHeaderViewHolder_ViewBinding) loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2;
                accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat(), IconCompatParcelizer(historyAdapter$GroupErrorViewHolder_ViewBinding, loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding, loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding.getPropertyCount(), accountHeaderViewHolder_ViewBinding.read, MediaDescriptionCompat, AccountRemarkViewHolder.IconCompatParcelizer));
            }
            try {
                MediaSessionCompat$QueueItem2 = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
            } catch (XmlPullParserException unused2) {
                if (loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2 instanceof LoanInformationCardAdapter$LoanInformationCardViewHolder) {
                    LoanInformationCardAdapter$LoanInformationCardViewHolder loanInformationCardAdapter$LoanInformationCardViewHolder2 = (LoanInformationCardAdapter$LoanInformationCardViewHolder) loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2;
                    if (historyAdapter$GroupErrorViewHolder_ViewBinding.RatingCompat() != null) {
                        str = historyAdapter$GroupErrorViewHolder_ViewBinding.RatingCompat();
                    } else {
                        str = "";
                    }
                    loanInformationCardAdapter$LoanInformationCardViewHolder2.write(str);
                }
                MediaSessionCompat$QueueItem2 = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
            }
        }
        historyAdapter$GroupErrorViewHolder_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver(3, (String) null, (String) null);
    }

    private Object MediaBrowserCompat$ItemReceiver(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding, String str, String str2) throws IOException, XmlPullParserException {
        AccountDebitSelectorViewHolder accountDebitSelectorViewHolder;
        HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding2 = historyAdapter$GroupErrorViewHolder_ViewBinding;
        String str3 = str;
        String str4 = str2;
        String MediaDescriptionCompat = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat();
        String MediaBrowserCompat$MediaItem2 = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
        Vector vector = new Vector();
        for (int i = 0; i < historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(); i++) {
            AccountDebitSelectorViewHolder_ViewBinding accountDebitSelectorViewHolder_ViewBinding = new AccountDebitSelectorViewHolder_ViewBinding();
            accountDebitSelectorViewHolder_ViewBinding.f5805x50fd9e4a = historyAdapter$GroupErrorViewHolder_ViewBinding.read(i);
            accountDebitSelectorViewHolder_ViewBinding.write(historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i));
            accountDebitSelectorViewHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper = historyAdapter$GroupErrorViewHolder_ViewBinding.write(i);
            accountDebitSelectorViewHolder_ViewBinding.MediaSessionCompat$QueueItem = historyAdapter$GroupErrorViewHolder_ViewBinding.IconCompatParcelizer();
            vector.addElement(accountDebitSelectorViewHolder_ViewBinding);
        }
        historyAdapter$GroupErrorViewHolder_ViewBinding.ParcelableVolumeInfo();
        String str5 = null;
        if (historyAdapter$GroupErrorViewHolder_ViewBinding.write() == 4) {
            str5 = historyAdapter$GroupErrorViewHolder_ViewBinding.RatingCompat();
            accountDebitSelectorViewHolder = new AccountRemarkViewHolder_ViewBinding(str3, str4, str5);
            for (int i2 = 0; i2 < vector.size(); i2++) {
                accountDebitSelectorViewHolder.MediaBrowserCompat$ItemReceiver.addElement((AccountDebitSelectorViewHolder_ViewBinding) vector.elementAt(i2));
            }
            historyAdapter$GroupErrorViewHolder_ViewBinding.ParcelableVolumeInfo();
        } else if (historyAdapter$GroupErrorViewHolder_ViewBinding.write() == 3) {
            accountDebitSelectorViewHolder = new AccountHeaderViewHolder_ViewBinding(str3, str4);
            for (int i3 = 0; i3 < vector.size(); i3++) {
                accountDebitSelectorViewHolder.MediaBrowserCompat$ItemReceiver.addElement((AccountDebitSelectorViewHolder_ViewBinding) vector.elementAt(i3));
            }
        } else {
            accountDebitSelectorViewHolder = null;
        }
        if (historyAdapter$GroupErrorViewHolder_ViewBinding.write() == 2) {
            if (str5 == null || str5.trim().length() == 0) {
                AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(str3, str4);
                for (int i4 = 0; i4 < vector.size(); i4++) {
                    accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.addElement((AccountDebitSelectorViewHolder_ViewBinding) vector.elementAt(i4));
                }
                while (historyAdapter$GroupErrorViewHolder_ViewBinding.write() != 3) {
                    accountHeaderViewHolder_ViewBinding.IconCompatParcelizer(historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$MediaItem(), historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat(), IconCompatParcelizer(historyAdapter$GroupErrorViewHolder_ViewBinding, accountHeaderViewHolder_ViewBinding, accountHeaderViewHolder_ViewBinding.getPropertyCount(), (String) null, (String) null, AccountRemarkViewHolder.IconCompatParcelizer));
                    historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
                }
                accountDebitSelectorViewHolder = accountHeaderViewHolder_ViewBinding;
            } else {
                throw new RuntimeException("Malformed input: Mixed content");
            }
        }
        historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(3, MediaBrowserCompat$MediaItem2, MediaDescriptionCompat);
        return accountDebitSelectorViewHolder;
    }

    private static int write(String str, int i, int i2) {
        if (str == null) {
            return i2;
        }
        try {
            return str.length() - i < 3 ? i2 : Integer.parseInt(str.substring(i + 1, str.length() - 1));
        } catch (Exception unused) {
            return i2;
        }
    }

    private Object IconCompatParcelizer(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding, Object obj, int i, String str, String str2, AccountRemarkViewHolder accountRemarkViewHolder) throws IOException, XmlPullParserException {
        Object obj2;
        Object obj3;
        String str3;
        String MediaDescriptionCompat = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat();
        String MediaBrowserCompat$ItemReceiver = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver((String) null, "href");
        if (MediaBrowserCompat$ItemReceiver == null) {
            String MediaBrowserCompat$ItemReceiver2 = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat, "nil");
            String MediaBrowserCompat$ItemReceiver3 = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver((String) null, Name.MARK);
            if (MediaBrowserCompat$ItemReceiver2 == null) {
                MediaBrowserCompat$ItemReceiver2 = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat, "null");
            }
            if (MediaBrowserCompat$ItemReceiver2 == null || !LendingIssuerAdapter$IssuerViewHolder_ViewBinding.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2)) {
                String MediaBrowserCompat$ItemReceiver4 = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat, "type");
                if (MediaBrowserCompat$ItemReceiver4 != null) {
                    int indexOf = MediaBrowserCompat$ItemReceiver4.indexOf(58);
                    str2 = MediaBrowserCompat$ItemReceiver4.substring(indexOf + 1);
                    if (indexOf == -1) {
                        str3 = "";
                    } else {
                        str3 = MediaBrowserCompat$ItemReceiver4.substring(0, indexOf);
                    }
                    str = historyAdapter$GroupErrorViewHolder_ViewBinding.IconCompatParcelizer(str3);
                } else if (str2 == null && str == null) {
                    if (historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, "arrayType") != null) {
                        str = this.MediaBrowserCompat$CustomActionResultReceiver;
                        str2 = "Array";
                    } else {
                        Object[] read = read(accountRemarkViewHolder.MediaSessionCompat$QueueItem, (Object) null);
                        String str4 = (String) read[0];
                        str2 = (String) read[1];
                        str = str4;
                    }
                }
                if (MediaBrowserCompat$ItemReceiver4 == null) {
                    this.MediaBrowserCompat$SearchResultReceiver = true;
                }
                Object write = write(historyAdapter$GroupErrorViewHolder_ViewBinding, str, str2, accountRemarkViewHolder);
                if (write == null) {
                    write = MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding, str, str2);
                }
                obj3 = write;
            } else {
                historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
                historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(3, (String) null, MediaDescriptionCompat);
                obj3 = null;
            }
            if (MediaBrowserCompat$ItemReceiver3 != null) {
                MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver3, obj2);
            }
        } else if (obj != null) {
            String substring = MediaBrowserCompat$ItemReceiver.substring(1);
            obj2 = this.MediaSessionCompat$Token.get(substring);
            if (obj2 == null || (obj2 instanceof AccountRepaymentSelectorViewHolder)) {
                AccountRepaymentSelectorViewHolder accountRepaymentSelectorViewHolder = new AccountRepaymentSelectorViewHolder();
                accountRepaymentSelectorViewHolder.MediaBrowserCompat$CustomActionResultReceiver = (AccountRepaymentSelectorViewHolder) obj2;
                accountRepaymentSelectorViewHolder.write = obj;
                accountRepaymentSelectorViewHolder.read = i;
                this.MediaSessionCompat$Token.put(substring, accountRepaymentSelectorViewHolder);
                obj2 = null;
            }
            historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
            historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(3, (String) null, MediaDescriptionCompat);
        } else {
            throw new RuntimeException("href at root level?!?");
        }
        historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(3, (String) null, MediaDescriptionCompat);
        return obj2;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(String str, Object obj) {
        Object obj2 = this.MediaSessionCompat$Token.get(str);
        if (obj2 instanceof AccountRepaymentSelectorViewHolder) {
            AccountRepaymentSelectorViewHolder accountRepaymentSelectorViewHolder = (AccountRepaymentSelectorViewHolder) obj2;
            do {
                if (accountRepaymentSelectorViewHolder.write instanceof C10410xd06cdadd) {
                    ((C10410xd06cdadd) accountRepaymentSelectorViewHolder.write).setProperty(accountRepaymentSelectorViewHolder.read, obj);
                } else {
                    ((Vector) accountRepaymentSelectorViewHolder.write).setElementAt(obj, accountRepaymentSelectorViewHolder.read);
                }
                accountRepaymentSelectorViewHolder = accountRepaymentSelectorViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
            } while (accountRepaymentSelectorViewHolder != null);
        } else if (obj2 == null) {
            this.MediaSessionCompat$Token.put(str, obj);
        } else {
            throw new RuntimeException("double ID");
        }
        this.MediaSessionCompat$Token.put(str, obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object write(p040o.HistoryAdapter$GroupErrorViewHolder_ViewBinding r19, java.lang.String r20, java.lang.String r21, p040o.AccountRemarkViewHolder r22) throws java.io.IOException, org.xmlpull.repackaged.p103v1.XmlPullParserException {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            java.util.Hashtable r4 = r8.PlaybackStateCompat$CustomAction
            o.AccountRemarkViewHolder_ViewBinding r5 = new o.AccountRemarkViewHolder_ViewBinding
            r9 = 0
            r5.<init>(r1, r2, r9)
            java.lang.Object r4 = r4.get(r5)
            if (r4 != 0) goto L_0x0019
            return r9
        L_0x0019:
            boolean r5 = r4 instanceof p040o.AccountHeaderViewHolder
            if (r5 == 0) goto L_0x0024
            o.AccountHeaderViewHolder r4 = (p040o.AccountHeaderViewHolder) r4
            java.lang.Object r0 = r4.readInstance(r0, r1, r2, r3)
            return r0
        L_0x0024:
            boolean r5 = r4 instanceof p040o.AccountHeaderViewHolder_ViewBinding
            if (r5 == 0) goto L_0x0030
            o.AccountHeaderViewHolder_ViewBinding r4 = (p040o.AccountHeaderViewHolder_ViewBinding) r4
            o.AccountHeaderViewHolder_ViewBinding r1 = r4.IconCompatParcelizer()
        L_0x002e:
            r10 = r1
            goto L_0x0042
        L_0x0030:
            java.lang.Class<o.AccountHeaderViewHolder_ViewBinding> r5 = p040o.AccountHeaderViewHolder_ViewBinding.class
            if (r4 != r5) goto L_0x003b
            o.AccountHeaderViewHolder_ViewBinding r4 = new o.AccountHeaderViewHolder_ViewBinding
            r4.<init>(r1, r2)
            r10 = r4
            goto L_0x0042
        L_0x003b:
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ Exception -> 0x016b }
            java.lang.Object r1 = r4.newInstance()     // Catch:{ Exception -> 0x016b }
            goto L_0x002e
        L_0x0042:
            boolean r1 = r10 instanceof p040o.AccountEStatementViewHolder
            r11 = 0
            if (r1 == 0) goto L_0x006f
            int r1 = r19.MediaBrowserCompat$ItemReceiver()
            r2 = r11
        L_0x004c:
            if (r2 >= r1) goto L_0x006f
            o.AccountDebitSelectorViewHolder_ViewBinding r4 = new o.AccountDebitSelectorViewHolder_ViewBinding
            r4.<init>()
            java.lang.String r5 = r0.read((int) r2)
            r4.f5805x50fd9e4a = r5
            java.lang.String r5 = r0.MediaBrowserCompat$CustomActionResultReceiver(r2)
            r4.write(r5)
            java.lang.String r5 = r0.write((int) r2)
            r4.MediaSessionCompat$ResultReceiverWrapper = r5
            java.lang.String r5 = r19.IconCompatParcelizer()
            r4.MediaSessionCompat$QueueItem = r5
            int r2 = r2 + 1
            goto L_0x004c
        L_0x006f:
            boolean r1 = r10 instanceof p040o.AccountHeaderViewHolder_ViewBinding
            if (r1 == 0) goto L_0x008f
            r1 = r10
            o.AccountHeaderViewHolder_ViewBinding r1 = (p040o.AccountHeaderViewHolder_ViewBinding) r1
        L_0x0076:
            int r2 = r19.MediaBrowserCompat$ItemReceiver()
            if (r11 >= r2) goto L_0x008a
            java.lang.String r2 = r0.read((int) r11)
            java.lang.String r3 = r0.MediaBrowserCompat$CustomActionResultReceiver(r11)
            r1.write(r2, r3)
            int r11 = r11 + 1
            goto L_0x0076
        L_0x008a:
            r8.write((p040o.HistoryAdapter$GroupErrorViewHolder_ViewBinding) r0, (p040o.C10410xd06cdadd) r1)
            goto L_0x014f
        L_0x008f:
            boolean r1 = r10 instanceof p040o.C10410xd06cdadd
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x00b1
            boolean r1 = r10 instanceof p040o.LoanInformationCardAdapter$LoanInformationCardViewHolder
            if (r1 == 0) goto L_0x00a9
            r1 = r10
            o.LoanInformationCardAdapter$LoanInformationCardViewHolder r1 = (p040o.LoanInformationCardAdapter$LoanInformationCardViewHolder) r1
            java.lang.String r3 = r19.RatingCompat()
            if (r3 == 0) goto L_0x00a6
            java.lang.String r2 = r19.RatingCompat()
        L_0x00a6:
            r1.write(r2)
        L_0x00a9:
            r1 = r10
            o.LoanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding r1 = (p040o.C10410xd06cdadd) r1
            r8.write((p040o.HistoryAdapter$GroupErrorViewHolder_ViewBinding) r0, (p040o.C10410xd06cdadd) r1)
            goto L_0x014f
        L_0x00b1:
            boolean r1 = r10 instanceof java.util.Vector
            if (r1 == 0) goto L_0x0150
            r12 = r10
            java.util.Vector r12 = (java.util.Vector) r12
            o.AccountRemarkViewHolder r1 = r3.RatingCompat
            int r3 = r12.size()
            java.lang.String r4 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r5 = "arrayType"
            java.lang.String r4 = r0.MediaBrowserCompat$ItemReceiver(r4, r5)
            r5 = 1
            if (r4 == 0) goto L_0x00f8
            r3 = 58
            int r3 = r4.indexOf(r3)
            java.lang.String r6 = "["
            int r6 = r4.indexOf(r6, r3)
            int r7 = r3 + 1
            java.lang.String r7 = r4.substring(r7, r6)
            r13 = -1
            if (r3 != r13) goto L_0x00df
            goto L_0x00e3
        L_0x00df:
            java.lang.String r2 = r4.substring(r11, r3)
        L_0x00e3:
            java.lang.String r2 = r0.IconCompatParcelizer((java.lang.String) r2)
            int r3 = write(r4, r6, r13)
            if (r3 == r13) goto L_0x00f4
            r12.setSize(r3)
            r13 = r2
            r15 = r7
            r14 = r11
            goto L_0x00fb
        L_0x00f4:
            r13 = r2
            r14 = r5
            r15 = r7
            goto L_0x00fb
        L_0x00f8:
            r14 = r5
            r13 = r9
            r15 = r13
        L_0x00fb:
            if (r1 != 0) goto L_0x00ff
            o.AccountRemarkViewHolder r1 = p040o.AccountRemarkViewHolder.IconCompatParcelizer
        L_0x00ff:
            r16 = r1
            r19.MediaSessionCompat$QueueItem()
            java.lang.String r1 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = "offset"
            java.lang.String r1 = r0.MediaBrowserCompat$ItemReceiver(r1, r2)
            int r1 = write(r1, r11, r11)
        L_0x0110:
            int r2 = r19.write()
            r4 = 3
            if (r2 == r4) goto L_0x014c
            java.lang.String r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = "position"
            java.lang.String r2 = r0.MediaBrowserCompat$ItemReceiver(r2, r4)
            int r7 = write(r2, r11, r1)
            if (r14 == 0) goto L_0x012f
            if (r7 < r3) goto L_0x012f
            int r1 = r7 + 1
            r12.setSize(r1)
            r17 = r1
            goto L_0x0131
        L_0x012f:
            r17 = r3
        L_0x0131:
            r1 = r18
            r2 = r19
            r3 = r12
            r4 = r7
            r5 = r13
            r6 = r15
            r11 = r7
            r7 = r16
            java.lang.Object r1 = r1.IconCompatParcelizer(r2, r3, r4, r5, r6, r7)
            r12.setElementAt(r1, r11)
            int r1 = r11 + 1
            r19.MediaSessionCompat$QueueItem()
            r3 = r17
            r11 = 0
            goto L_0x0110
        L_0x014c:
            r0.MediaBrowserCompat$CustomActionResultReceiver(r4, r9, r9)
        L_0x014f:
            return r10
        L_0x0150:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no deserializer for "
            r0.append(r1)
            java.lang.Class r1 = r10.getClass()
            r0.append(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x016b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AccountSelectorViewHolder.write(o.HistoryAdapter$GroupErrorViewHolder_ViewBinding, java.lang.String, java.lang.String, o.AccountRemarkViewHolder):java.lang.Object");
    }

    private Object[] read(Object obj, Object obj2) {
        Object[] objArr;
        if (obj == null) {
            obj = ((obj2 instanceof AccountHeaderViewHolder_ViewBinding) || (obj2 instanceof AccountRemarkViewHolder_ViewBinding)) ? obj2 : obj2.getClass();
        }
        if (obj instanceof AccountHeaderViewHolder_ViewBinding) {
            AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = (AccountHeaderViewHolder_ViewBinding) obj;
            return new Object[]{accountHeaderViewHolder_ViewBinding.read, accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, null, null};
        } else if (obj instanceof AccountRemarkViewHolder_ViewBinding) {
            AccountRemarkViewHolder_ViewBinding accountRemarkViewHolder_ViewBinding = (AccountRemarkViewHolder_ViewBinding) obj;
            return new Object[]{accountRemarkViewHolder_ViewBinding.IconCompatParcelizer, accountRemarkViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, null, MediaSessionCompat$ResultReceiverWrapper};
        } else if ((obj instanceof Class) && obj != AccountRemarkViewHolder.MediaBrowserCompat$ItemReceiver && (objArr = (Object[]) this.MediaSessionCompat$QueueItem.get(((Class) obj).getName())) != null) {
            return objArr;
        } else {
            return new Object[]{this.RatingCompat, "anyType", null, null};
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Class} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(java.lang.String r5, java.lang.String r6, java.lang.Class r7, p040o.AccountHeaderViewHolder r8) {
        /*
            r4 = this;
            java.util.Hashtable r0 = r4.PlaybackStateCompat$CustomAction
            o.AccountRemarkViewHolder_ViewBinding r1 = new o.AccountRemarkViewHolder_ViewBinding
            r2 = 0
            r1.<init>(r5, r6, r2)
            if (r8 != 0) goto L_0x000c
            r3 = r7
            goto L_0x000d
        L_0x000c:
            r3 = r8
        L_0x000d:
            r0.put(r1, r3)
            java.util.Hashtable r0 = r4.MediaSessionCompat$QueueItem
            java.lang.String r7 = r7.getName()
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r5
            r5 = 1
            r1[r5] = r6
            r5 = 2
            r1[r5] = r2
            r5 = 3
            r1[r5] = r8
            r0.put(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AccountSelectorViewHolder.IconCompatParcelizer(java.lang.String, java.lang.String, java.lang.Class, o.AccountHeaderViewHolder):void");
    }

    public final Object read() throws SoapFault {
        if (this.IconCompatParcelizer == null) {
            return null;
        }
        if (!(this.IconCompatParcelizer instanceof SoapFault)) {
            C10410xd06cdadd loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding = (C10410xd06cdadd) this.IconCompatParcelizer;
            if (loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding.getPropertyCount() == 0) {
                return null;
            }
            if (loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding.getPropertyCount() == 1) {
                return loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding.getProperty(0);
            }
            Vector vector = new Vector();
            for (int i = 0; i < loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding.getPropertyCount(); i++) {
                vector.add(loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding.getProperty(i));
            }
            return vector;
        }
        throw ((SoapFault) this.IconCompatParcelizer);
    }

    public final void MediaBrowserCompat$ItemReceiver(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding) throws IOException {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            Vector vector = new Vector();
            this.f5806x50fd9e4a = vector;
            vector.addElement(this.MediaBrowserCompat$ItemReceiver);
            Object[] read = read((Object) null, this.MediaBrowserCompat$ItemReceiver);
            String str = "";
            historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem ? str : (String) read[0], (String) read[1]);
            if (this.MediaBrowserCompat$MediaItem) {
                historyAdapter$GroupItemViewHolder_ViewBinding.read((String) null, "xmlns", (String) read[0]);
            }
            if (this.ParcelableVolumeInfo) {
                historyAdapter$GroupItemViewHolder_ViewBinding.read((String) null, Name.MARK, read[2] == null ? "o0" : (String) read[2]);
                historyAdapter$GroupItemViewHolder_ViewBinding.read(this.MediaBrowserCompat$CustomActionResultReceiver, "root", DiskLruCache.VERSION_1);
            }
            MediaBrowserCompat$ItemReceiver(historyAdapter$GroupItemViewHolder_ViewBinding, this.MediaBrowserCompat$ItemReceiver, (AccountRemarkViewHolder) null, read[3]);
            if (!this.MediaBrowserCompat$MediaItem) {
                str = (String) read[0];
            }
            historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(str, (String) read[1]);
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding, AccountEStatementViewHolder accountEStatementViewHolder) throws IOException {
        int MediaBrowserCompat$ItemReceiver = accountEStatementViewHolder.MediaBrowserCompat$ItemReceiver();
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver; i++) {
            AccountDebitSelectorViewHolder_ViewBinding accountDebitSelectorViewHolder_ViewBinding = new AccountDebitSelectorViewHolder_ViewBinding();
            accountEStatementViewHolder.MediaBrowserCompat$ItemReceiver(i, accountDebitSelectorViewHolder_ViewBinding);
            if (accountDebitSelectorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver() != null) {
                historyAdapter$GroupItemViewHolder_ViewBinding.read(accountDebitSelectorViewHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper, accountDebitSelectorViewHolder_ViewBinding.f5805x50fd9e4a, accountDebitSelectorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver().toString());
            }
        }
    }

    private void write(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding, C10410xd06cdadd loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding) throws IOException {
        String str;
        String str2;
        Object property;
        if (loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding instanceof AccountEStatementViewHolder) {
            MediaBrowserCompat$CustomActionResultReceiver(historyAdapter$GroupItemViewHolder_ViewBinding, (AccountEStatementViewHolder) loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding);
        }
        ArrayList arrayList = (ArrayList) loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding;
        C10410xd06cdadd loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2 = (C10410xd06cdadd) arrayList;
        int size = arrayList.size();
        AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
        for (int i = 0; i < size; i++) {
            Object property2 = loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2.getProperty(i);
            loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2.getPropertyInfo(i, this.PlaybackStateCompat, accountRemarkViewHolder);
            if (property2 instanceof AccountHeaderViewHolder_ViewBinding) {
                AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = (AccountHeaderViewHolder_ViewBinding) property2;
                Object[] read = read((Object) null, (Object) accountHeaderViewHolder_ViewBinding);
                String str3 = (String) read[1];
                if (accountRemarkViewHolder.f5805x50fd9e4a == null || accountRemarkViewHolder.f5805x50fd9e4a.length() <= 0) {
                    str = (String) read[1];
                } else {
                    str = accountRemarkViewHolder.f5805x50fd9e4a;
                }
                if (accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper == null || accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper.length() <= 0) {
                    str2 = (String) read[0];
                } else {
                    str2 = accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper;
                }
                historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(str2, str);
                if (!this.MediaBrowserCompat$SearchResultReceiver) {
                    String write = historyAdapter$GroupItemViewHolder_ViewBinding.write(str2, true);
                    String str4 = this.MediaDescriptionCompat;
                    StringBuilder sb = new StringBuilder();
                    sb.append(write);
                    sb.append(":");
                    sb.append(str3);
                    historyAdapter$GroupItemViewHolder_ViewBinding.read(str4, "type", sb.toString());
                }
                MediaBrowserCompat$ItemReceiver(historyAdapter$GroupItemViewHolder_ViewBinding, accountHeaderViewHolder_ViewBinding);
                historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(str2, str);
            } else if ((accountRemarkViewHolder.MediaBrowserCompat$MediaItem & 1) == 0 && (property = loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2.getProperty(i)) != AccountRemarkViewHolder_ViewBinding.read) {
                historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper, accountRemarkViewHolder.f5805x50fd9e4a);
                IconCompatParcelizer(historyAdapter$GroupItemViewHolder_ViewBinding, property, accountRemarkViewHolder);
                historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper, accountRemarkViewHolder.f5805x50fd9e4a);
            }
        }
        read(historyAdapter$GroupItemViewHolder_ViewBinding, loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding2);
    }

    private void MediaBrowserCompat$ItemReceiver(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding, C10410xd06cdadd loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding) throws IOException {
        if (loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding instanceof AccountEStatementViewHolder) {
            MediaBrowserCompat$CustomActionResultReceiver(historyAdapter$GroupItemViewHolder_ViewBinding, (AccountEStatementViewHolder) loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding);
        }
        IconCompatParcelizer(historyAdapter$GroupItemViewHolder_ViewBinding, loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding);
    }

    private void IconCompatParcelizer(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding, C10410xd06cdadd loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding) throws IOException {
        String str;
        String str2;
        Object property;
        int propertyCount = loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding.getPropertyCount();
        AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
        for (int i = 0; i < propertyCount; i++) {
            Object property2 = loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding.getProperty(i);
            loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding.getPropertyInfo(i, this.PlaybackStateCompat, accountRemarkViewHolder);
            if (property2 instanceof AccountHeaderViewHolder_ViewBinding) {
                AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = (AccountHeaderViewHolder_ViewBinding) property2;
                Object[] read = read((Object) null, (Object) accountHeaderViewHolder_ViewBinding);
                String str3 = (String) read[1];
                if (accountRemarkViewHolder.f5805x50fd9e4a == null || accountRemarkViewHolder.f5805x50fd9e4a.length() <= 0) {
                    str = (String) read[1];
                } else {
                    str = accountRemarkViewHolder.f5805x50fd9e4a;
                }
                if (accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper == null || accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper.length() <= 0) {
                    str2 = (String) read[0];
                } else {
                    str2 = accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper;
                }
                historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(str2, str);
                if (!this.MediaBrowserCompat$SearchResultReceiver) {
                    String write = historyAdapter$GroupItemViewHolder_ViewBinding.write(str2, true);
                    String str4 = this.MediaDescriptionCompat;
                    StringBuilder sb = new StringBuilder();
                    sb.append(write);
                    sb.append(":");
                    sb.append(str3);
                    historyAdapter$GroupItemViewHolder_ViewBinding.read(str4, "type", sb.toString());
                }
                MediaBrowserCompat$ItemReceiver(historyAdapter$GroupItemViewHolder_ViewBinding, accountHeaderViewHolder_ViewBinding);
                historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(str2, str);
            } else if ((accountRemarkViewHolder.MediaBrowserCompat$MediaItem & 1) == 0 && (property = loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding.getProperty(i)) != AccountRemarkViewHolder_ViewBinding.read) {
                historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper, accountRemarkViewHolder.f5805x50fd9e4a);
                IconCompatParcelizer(historyAdapter$GroupItemViewHolder_ViewBinding, property, accountRemarkViewHolder);
                historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper, accountRemarkViewHolder.f5805x50fd9e4a);
            }
        }
        read(historyAdapter$GroupItemViewHolder_ViewBinding, loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding);
    }

    private static void read(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding, C10410xd06cdadd loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding) throws IOException {
        Object MediaBrowserCompat$CustomActionResultReceiver;
        if ((loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding instanceof LoanInformationCardAdapter$LoanInformationCardViewHolder) && (MediaBrowserCompat$CustomActionResultReceiver = ((LoanInformationCardAdapter$LoanInformationCardViewHolder) loanInformationCardAdapter$LoanInformationCardViewHolder_ViewBinding).MediaBrowserCompat$CustomActionResultReceiver()) != null && !(MediaBrowserCompat$CustomActionResultReceiver instanceof AccountRepaymentSelectorViewHolder_ViewBinding)) {
            historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver.toString());
        }
    }

    private void IconCompatParcelizer(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding, Object obj, AccountRemarkViewHolder accountRemarkViewHolder) throws IOException {
        StringBuilder sb;
        if (obj == null || obj == AccountRemarkViewHolder_ViewBinding.write) {
            historyAdapter$GroupItemViewHolder_ViewBinding.read(this.MediaDescriptionCompat, this.MediaMetadataCompat >= 120 ? "nil" : "null", "true");
            return;
        }
        Object[] read = read((Object) null, obj);
        if (accountRemarkViewHolder.MediaMetadataCompat || read[2] != null) {
            int indexOf = this.f5806x50fd9e4a.indexOf(obj);
            if (indexOf == -1) {
                indexOf = this.f5806x50fd9e4a.size();
                this.f5806x50fd9e4a.addElement(obj);
            }
            if (read[2] == null) {
                sb = new StringBuilder();
                sb.append("#o");
                sb.append(indexOf);
            } else {
                sb = new StringBuilder();
                sb.append("#");
                sb.append(read[2]);
            }
            historyAdapter$GroupItemViewHolder_ViewBinding.read((String) null, "href", sb.toString());
            return;
        }
        if (!this.MediaBrowserCompat$SearchResultReceiver || obj.getClass() != accountRemarkViewHolder.MediaSessionCompat$QueueItem) {
            String write = historyAdapter$GroupItemViewHolder_ViewBinding.write((String) read[0], true);
            String str = this.MediaDescriptionCompat;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(write);
            sb2.append(":");
            sb2.append(read[1]);
            historyAdapter$GroupItemViewHolder_ViewBinding.read(str, "type", sb2.toString());
        }
        MediaBrowserCompat$ItemReceiver(historyAdapter$GroupItemViewHolder_ViewBinding, obj, accountRemarkViewHolder, read[3]);
    }

    private void MediaBrowserCompat$ItemReceiver(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding, Object obj, AccountRemarkViewHolder accountRemarkViewHolder, Object obj2) throws IOException {
        if (obj2 != null) {
            ((AccountHeaderViewHolder) obj2).writeInstance(historyAdapter$GroupItemViewHolder_ViewBinding, obj);
        } else if ((obj instanceof C10410xd06cdadd) || obj == AccountRemarkViewHolder_ViewBinding.write || obj == AccountRemarkViewHolder_ViewBinding.read) {
            if (obj instanceof ArrayList) {
                write(historyAdapter$GroupItemViewHolder_ViewBinding, (C10410xd06cdadd) obj);
            } else {
                MediaBrowserCompat$ItemReceiver(historyAdapter$GroupItemViewHolder_ViewBinding, (C10410xd06cdadd) obj);
            }
        } else if (obj instanceof AccountEStatementViewHolder) {
            MediaBrowserCompat$CustomActionResultReceiver(historyAdapter$GroupItemViewHolder_ViewBinding, (AccountEStatementViewHolder) obj);
        } else if (obj instanceof Vector) {
            MediaBrowserCompat$CustomActionResultReceiver(historyAdapter$GroupItemViewHolder_ViewBinding, (Vector) obj, accountRemarkViewHolder.RatingCompat);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot serialize: ");
            sb.append(obj);
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$CustomActionResultReceiver(p040o.HistoryAdapter$GroupItemViewHolder_ViewBinding r12, java.util.Vector r13, p040o.AccountRemarkViewHolder r14) throws java.io.IOException {
        /*
            r11 = this;
            r0 = 0
            if (r14 != 0) goto L_0x0006
            o.AccountRemarkViewHolder r14 = p040o.AccountRemarkViewHolder.IconCompatParcelizer
            goto L_0x0013
        L_0x0006:
            boolean r1 = r14 instanceof p040o.AccountRemarkViewHolder
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = r14.f5805x50fd9e4a
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = r14.f5805x50fd9e4a
            java.lang.String r2 = r14.MediaSessionCompat$ResultReceiverWrapper
            goto L_0x0016
        L_0x0013:
            java.lang.String r1 = "item"
            r2 = r0
        L_0x0016:
            int r3 = r13.size()
            java.lang.Object r4 = r14.MediaSessionCompat$QueueItem
            java.lang.Object[] r0 = r11.read((java.lang.Object) r4, (java.lang.Object) r0)
            boolean r4 = r11.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r5 = "]"
            java.lang.String r6 = "["
            r7 = 1
            r8 = 0
            if (r4 != 0) goto L_0x0059
            java.lang.String r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = r0[r8]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = r12.write(r10, r8)
            r9.append(r10)
            java.lang.String r10 = ":"
            r9.append(r10)
            r0 = r0[r7]
            r9.append(r0)
            r9.append(r6)
            r9.append(r3)
            r9.append(r5)
            java.lang.String r0 = r9.toString()
            java.lang.String r9 = "arrayType"
            r12.read(r4, r9, r0)
            goto L_0x0060
        L_0x0059:
            if (r2 != 0) goto L_0x0060
            r0 = r0[r8]
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0060:
            r0 = r8
            r4 = r0
        L_0x0062:
            if (r0 >= r3) goto L_0x0098
            java.lang.Object r9 = r13.elementAt(r0)
            if (r9 != 0) goto L_0x006c
            r4 = r7
            goto L_0x0095
        L_0x006c:
            r12.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r2, (java.lang.String) r1)
            if (r4 == 0) goto L_0x008b
            java.lang.String r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r0)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "position"
            r12.read(r4, r10, r9)
            r4 = r8
        L_0x008b:
            java.lang.Object r9 = r13.elementAt(r0)
            r11.IconCompatParcelizer(r12, r9, r14)
            r12.MediaBrowserCompat$ItemReceiver(r2, r1)
        L_0x0095:
            int r0 = r0 + 1
            goto L_0x0062
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AccountSelectorViewHolder.MediaBrowserCompat$CustomActionResultReceiver(o.HistoryAdapter$GroupItemViewHolder_ViewBinding, java.util.Vector, o.AccountRemarkViewHolder):void");
    }
}

package p040o;

import java.util.Hashtable;
import java.util.Vector;

/* renamed from: o.AccountHeaderViewHolder_ViewBinding */
public class AccountHeaderViewHolder_ViewBinding extends AccountDebitSelectorViewHolder implements LoanInformationCardAdapter$LoanInformationCardViewHolder, C10410xd06cdadd {
    public Vector IconCompatParcelizer;
    String MediaBrowserCompat$CustomActionResultReceiver;
    String read;
    private Object write;

    public AccountHeaderViewHolder_ViewBinding() {
        this("", "");
    }

    public AccountHeaderViewHolder_ViewBinding(String str, String str2) {
        this.IconCompatParcelizer = new Vector();
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b A[LOOP:0: B:11:0x002c->B:31:0x007b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p040o.AccountHeaderViewHolder_ViewBinding
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            o.AccountHeaderViewHolder_ViewBinding r8 = (p040o.AccountHeaderViewHolder_ViewBinding) r8
            java.lang.String r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = r7.read
            java.lang.String r2 = r8.read
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0083
            java.util.Vector r0 = r7.IconCompatParcelizer
            int r0 = r0.size()
            java.util.Vector r2 = r8.IconCompatParcelizer
            int r2 = r2.size()
            if (r0 == r2) goto L_0x002b
            return r1
        L_0x002b:
            r2 = r1
        L_0x002c:
            if (r2 >= r0) goto L_0x007e
            java.util.Vector r3 = r7.IconCompatParcelizer
            java.lang.Object r3 = r3.elementAt(r2)
            int r4 = r8.getPropertyCount()
            if (r2 >= r4) goto L_0x0077
            java.util.Vector r4 = r8.IconCompatParcelizer
            java.lang.Object r4 = r4.elementAt(r2)
            boolean r5 = r3 instanceof p040o.AccountRemarkViewHolder
            if (r5 == 0) goto L_0x0066
            boolean r5 = r4 instanceof p040o.AccountRemarkViewHolder
            if (r5 == 0) goto L_0x0066
            o.AccountRemarkViewHolder r3 = (p040o.AccountRemarkViewHolder) r3
            o.AccountRemarkViewHolder r4 = (p040o.AccountRemarkViewHolder) r4
            java.lang.String r5 = r3.f5805x50fd9e4a
            java.lang.String r6 = r4.f5805x50fd9e4a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0077
            java.lang.Object r3 = r3.MediaBrowserCompat$ItemReceiver()
            java.lang.Object r4 = r4.MediaBrowserCompat$ItemReceiver()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0077
            r3 = 1
            goto L_0x0078
        L_0x0066:
            boolean r5 = r3 instanceof p040o.AccountHeaderViewHolder_ViewBinding
            if (r5 == 0) goto L_0x0077
            boolean r5 = r4 instanceof p040o.AccountHeaderViewHolder_ViewBinding
            if (r5 == 0) goto L_0x0077
            o.AccountHeaderViewHolder_ViewBinding r3 = (p040o.AccountHeaderViewHolder_ViewBinding) r3
            o.AccountHeaderViewHolder_ViewBinding r4 = (p040o.AccountHeaderViewHolder_ViewBinding) r4
            boolean r3 = r3.equals(r4)
            goto L_0x0078
        L_0x0077:
            r3 = r1
        L_0x0078:
            if (r3 != 0) goto L_0x007b
            return r1
        L_0x007b:
            int r2 = r2 + 1
            goto L_0x002c
        L_0x007e:
            boolean r8 = r7.IconCompatParcelizer(r8)
            return r8
        L_0x0083:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AccountHeaderViewHolder_ViewBinding.equals(java.lang.Object):boolean");
    }

    public Object getProperty(int i) {
        Object elementAt = this.IconCompatParcelizer.elementAt(i);
        if (elementAt instanceof AccountRemarkViewHolder) {
            return ((AccountRemarkViewHolder) elementAt).MediaBrowserCompat$ItemReceiver();
        }
        return (AccountHeaderViewHolder_ViewBinding) elementAt;
    }

    public int getPropertyCount() {
        return this.IconCompatParcelizer.size();
    }

    public void getPropertyInfo(int i, Hashtable hashtable, AccountRemarkViewHolder accountRemarkViewHolder) {
        MediaBrowserCompat$CustomActionResultReceiver(i, accountRemarkViewHolder);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, AccountRemarkViewHolder accountRemarkViewHolder) {
        Object elementAt = this.IconCompatParcelizer.elementAt(i);
        if (elementAt instanceof AccountRemarkViewHolder) {
            AccountRemarkViewHolder accountRemarkViewHolder2 = (AccountRemarkViewHolder) elementAt;
            accountRemarkViewHolder.f5805x50fd9e4a = accountRemarkViewHolder2.f5805x50fd9e4a;
            accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper = accountRemarkViewHolder2.MediaSessionCompat$ResultReceiverWrapper;
            accountRemarkViewHolder.MediaBrowserCompat$MediaItem = accountRemarkViewHolder2.MediaBrowserCompat$MediaItem;
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = accountRemarkViewHolder2.MediaSessionCompat$QueueItem;
            accountRemarkViewHolder.RatingCompat = accountRemarkViewHolder2.RatingCompat;
            accountRemarkViewHolder.MediaSessionCompat$Token = accountRemarkViewHolder2.MediaSessionCompat$Token;
            accountRemarkViewHolder.MediaMetadataCompat = accountRemarkViewHolder2.MediaMetadataCompat;
            return;
        }
        accountRemarkViewHolder.f5805x50fd9e4a = null;
        accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper = null;
        accountRemarkViewHolder.MediaBrowserCompat$MediaItem = 0;
        accountRemarkViewHolder.MediaSessionCompat$QueueItem = null;
        accountRemarkViewHolder.RatingCompat = null;
        accountRemarkViewHolder.MediaSessionCompat$Token = elementAt;
        accountRemarkViewHolder.MediaMetadataCompat = false;
    }

    public final AccountHeaderViewHolder_ViewBinding IconCompatParcelizer() {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
        for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
            Object elementAt = this.IconCompatParcelizer.elementAt(i);
            if (elementAt instanceof AccountRemarkViewHolder) {
                accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement((AccountRemarkViewHolder) ((AccountRemarkViewHolder) this.IconCompatParcelizer.elementAt(i)).clone());
            } else if (elementAt instanceof AccountHeaderViewHolder_ViewBinding) {
                accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(((AccountHeaderViewHolder_ViewBinding) elementAt).IconCompatParcelizer());
            }
        }
        for (int i2 = 0; i2 < MediaBrowserCompat$ItemReceiver(); i2++) {
            AccountDebitSelectorViewHolder_ViewBinding accountDebitSelectorViewHolder_ViewBinding = new AccountDebitSelectorViewHolder_ViewBinding();
            MediaBrowserCompat$ItemReceiver(i2, accountDebitSelectorViewHolder_ViewBinding);
            accountHeaderViewHolder_ViewBinding.read(accountDebitSelectorViewHolder_ViewBinding);
        }
        return accountHeaderViewHolder_ViewBinding;
    }

    public void setProperty(int i, Object obj) {
        Object elementAt = this.IconCompatParcelizer.elementAt(i);
        if (elementAt instanceof AccountRemarkViewHolder) {
            ((AccountRemarkViewHolder) elementAt).write(obj);
        }
    }

    public final AccountHeaderViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(String str, Object obj) {
        Class<?> cls;
        AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
        accountRemarkViewHolder.f5805x50fd9e4a = str;
        if (obj == null) {
            cls = AccountRemarkViewHolder.MediaBrowserCompat$ItemReceiver;
        } else {
            cls = obj.getClass();
        }
        accountRemarkViewHolder.MediaSessionCompat$QueueItem = cls;
        accountRemarkViewHolder.MediaSessionCompat$Token = obj;
        this.IconCompatParcelizer.addElement(accountRemarkViewHolder);
        return this;
    }

    public final AccountHeaderViewHolder_ViewBinding IconCompatParcelizer(String str, String str2, Object obj) {
        Class<?> cls;
        AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
        accountRemarkViewHolder.f5805x50fd9e4a = str2;
        accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper = str;
        if (obj == null) {
            cls = AccountRemarkViewHolder.MediaBrowserCompat$ItemReceiver;
        } else {
            cls = obj.getClass();
        }
        accountRemarkViewHolder.MediaSessionCompat$QueueItem = cls;
        accountRemarkViewHolder.MediaSessionCompat$Token = obj;
        this.IconCompatParcelizer.addElement(accountRemarkViewHolder);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("{");
        StringBuffer stringBuffer = new StringBuffer(sb.toString());
        for (int i = 0; i < getPropertyCount(); i++) {
            Object elementAt = this.IconCompatParcelizer.elementAt(i);
            if (elementAt instanceof AccountRemarkViewHolder) {
                stringBuffer.append(((AccountRemarkViewHolder) elementAt).f5805x50fd9e4a);
                stringBuffer.append("=");
                stringBuffer.append(getProperty(i));
                stringBuffer.append("; ");
            } else {
                stringBuffer.append(((AccountHeaderViewHolder_ViewBinding) elementAt).toString());
            }
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }

    public final void write(Object obj) {
        this.write = obj;
    }
}

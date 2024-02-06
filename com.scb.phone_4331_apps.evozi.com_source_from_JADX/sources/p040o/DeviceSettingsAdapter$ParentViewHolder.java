package p040o;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.ejbca.cvc.exception.ConstructionException;

/* renamed from: o.DeviceSettingsAdapter$ParentViewHolder */
public abstract class DeviceSettingsAdapter$ParentViewHolder extends CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding {
    public final Map<EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder, CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding> MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
    private final List<EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder> write = Arrays.asList(write());

    /* access modifiers changed from: protected */
    public abstract EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder[] write();

    public DeviceSettingsAdapter$ParentViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder) {
        super(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
    }

    public void MediaBrowserCompat$ItemReceiver(CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) throws ConstructionException {
        if (cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding == null) {
            return;
        }
        if (!this.write.contains(cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Field ");
            sb.append(cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver());
            sb.append(" not allowed in ");
            sb.append(getClass().getName());
            throw new ConstructionException(sb.toString());
        } else if (!this.MediaBrowserCompat$CustomActionResultReceiver.containsKey(cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver())) {
            cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer(this);
            this.MediaBrowserCompat$CustomActionResultReceiver.put(cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(), cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Field ");
            sb2.append(cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver());
            sb2.append(" has already been added to ");
            sb2.append(getClass().getName());
            throw new ConstructionException(sb2.toString());
        }
    }

    public final CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder) throws NoSuchFieldException {
        CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver.get(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
        if (cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding != null) {
            return cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find subfield ");
        sb.append(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
        throw new NoSuchFieldException(sb.toString());
    }

    public final int read(DataOutputStream dataOutputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
        int i = 0;
        for (CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding read : IconCompatParcelizer()) {
            i += read.read(dataOutputStream2);
        }
        dataOutputStream2.close();
        int i2 = MediaBrowserCompat$CustomActionResultReceiver().value;
        int size = dataOutputStream.size();
        dataOutputStream.write(read(Integer.valueOf(i2)));
        dataOutputStream.write(MediaBrowserCompat$ItemReceiver(i));
        dataOutputStream.write(byteArrayOutputStream.toByteArray());
        return dataOutputStream.size() - size;
    }

    /* access modifiers changed from: protected */
    public List<CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding> IconCompatParcelizer() {
        return MediaBrowserCompat$SearchResultReceiver();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] MediaBrowserCompat$ItemReceiver() throws java.io.IOException {
        /*
            r2 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0017 }
            r0.<init>()     // Catch:{ all -> 0x0017 }
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ all -> 0x0015 }
            r1.<init>(r0)     // Catch:{ all -> 0x0015 }
            r2.read((java.io.DataOutputStream) r1)     // Catch:{ all -> 0x0015 }
            r0.close()
            byte[] r0 = r0.toByteArray()
            return r0
        L_0x0015:
            r1 = move-exception
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            r1 = r0
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x001f
            r0.close()
        L_0x001f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DeviceSettingsAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver():byte[]");
    }

    public final String MediaBrowserCompat$ItemReceiver(String str) {
        return write(str, true);
    }

    public final String write(String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.write(str, z));
        for (CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding write2 : MediaBrowserCompat$SearchResultReceiver()) {
            stringBuffer.append(read);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("   ");
            stringBuffer.append(write2.write(sb.toString(), z));
        }
        return stringBuffer.toString();
    }

    private List<CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding> MediaBrowserCompat$SearchResultReceiver() {
        ArrayList arrayList = new ArrayList();
        for (EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder : this.write) {
            CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver.get(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
            if (cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding != null) {
                arrayList.add(cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding);
            }
        }
        return arrayList;
    }
}

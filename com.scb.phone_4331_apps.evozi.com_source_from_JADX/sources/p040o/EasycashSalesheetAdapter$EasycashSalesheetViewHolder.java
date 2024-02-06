package p040o;

import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import org.bouncycastle.jce.ECPointUtil;
import org.ejbca.cvc.exception.ConstructionException;

/* renamed from: o.EasycashSalesheetAdapter$EasycashSalesheetViewHolder */
public final class EasycashSalesheetAdapter$EasycashSalesheetViewHolder extends EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding implements ECPublicKey {
    private static EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder[] write = {EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.OID, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.MODULUS, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COEFFICIENT_A, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COEFFICIENT_B, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.BASE_POINT_G, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.BASE_POINT_R_ORDER, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PUBLIC_POINT_Y, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COFACTOR_F};

    public final String getAlgorithm() {
        return "ECDSA";
    }

    public final String getFormat() {
        return "CVC";
    }

    /* access modifiers changed from: protected */
    public final EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder[] write() {
        return write;
    }

    public EasycashSalesheetAdapter$EasycashSalesheetViewHolder(C1174x485c104b easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding) throws ConstructionException, NoSuchFieldException {
        MediaBrowserCompat$ItemReceiver(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.OID));
        MediaBrowserCompat$ItemReceiver(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.MODULUS));
        MediaBrowserCompat$ItemReceiver(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COEFFICIENT_A));
        MediaBrowserCompat$ItemReceiver(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COEFFICIENT_B));
        MediaBrowserCompat$ItemReceiver(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.BASE_POINT_G));
        MediaBrowserCompat$ItemReceiver(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.BASE_POINT_R_ORDER));
        MediaBrowserCompat$ItemReceiver(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PUBLIC_POINT_Y));
        MediaBrowserCompat$ItemReceiver(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COFACTOR_F));
    }

    public EasycashSalesheetAdapter$EasycashSalesheetViewHolder(EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder, ECPublicKey eCPublicKey, AdditionDocumentAdapter$DocumentViewHolder additionDocumentAdapter$DocumentViewHolder) throws ConstructionException {
        MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder);
        ECParameterSpec params = eCPublicKey.getParams();
        boolean z = additionDocumentAdapter$DocumentViewHolder == null || additionDocumentAdapter$DocumentViewHolder.IconCompatParcelizer();
        if (z) {
            ECField field = params.getCurve().getField();
            if (field instanceof ECFieldFp) {
                MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new CustomCheckboxAdapter$CheckBoxViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.MODULUS, read(((ECFieldFp) field).getP().toByteArray())));
            }
            MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new CustomCheckboxAdapter$CheckBoxViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COEFFICIENT_A, read(params.getCurve().getA().toByteArray())));
            MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new CustomCheckboxAdapter$CheckBoxViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COEFFICIENT_B, read(params.getCurve().getB().toByteArray())));
            MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new CustomCheckboxAdapter$CheckBoxViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.BASE_POINT_G, IconCompatParcelizer(params.getGenerator(), params.getCurve())));
            MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new CustomCheckboxAdapter$CheckBoxViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.BASE_POINT_R_ORDER, read(params.getOrder().toByteArray())));
        }
        MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new CustomCheckboxAdapter$CheckBoxViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PUBLIC_POINT_Y, IconCompatParcelizer(eCPublicKey.getW(), params.getCurve())));
        if (z) {
            MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new EasycashLoanTrackingAdapter$LoanViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COFACTOR_F, params.getCofactor()));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r3.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r3 == null) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p040o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding> IconCompatParcelizer() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ NoSuchFieldException -> 0x0099 }
            r0.<init>()     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r1 = p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.OID     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding r1 = r6.read((p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder) r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            r0.add(r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            java.security.spec.ECParameterSpec r1 = r6.getParams()     // Catch:{ NoSuchFieldException -> 0x0099 }
            r2 = 0
            if (r1 == 0) goto L_0x0049
            o.DeviceSettingsAdapter$ParentViewHolder r3 = r6.read()     // Catch:{ NoSuchFieldException -> 0x0099 }
            if (r3 == 0) goto L_0x0046
            o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r4 = r3.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r5 = p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY     // Catch:{ NoSuchFieldException -> 0x0099 }
            if (r4 != r5) goto L_0x0046
            o.EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding r3 = (p040o.EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) r3     // Catch:{ NoSuchFieldException -> 0x0049 }
            o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r4 = p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.HOLDER_AUTH_TEMPLATE     // Catch:{ NoSuchFieldException -> 0x0049 }
            java.util.Map<o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder, o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding> r3 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldException -> 0x0049 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ NoSuchFieldException -> 0x0049 }
            o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding r3 = (p040o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) r3     // Catch:{ NoSuchFieldException -> 0x0049 }
            if (r3 == 0) goto L_0x0048
            org.ejbca.cvc.CVCAuthorizationTemplate r3 = (org.ejbca.cvc.CVCAuthorizationTemplate) r3     // Catch:{ NoSuchFieldException -> 0x0049 }
            o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r4 = p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.ROLE_AND_ACCESS_RIGHTS     // Catch:{ NoSuchFieldException -> 0x0049 }
            o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding r3 = r3.read((p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder) r4)     // Catch:{ NoSuchFieldException -> 0x0049 }
            o.AdditionDocumentAdapter$DocumentViewHolder_ViewBinding r3 = (p040o.AdditionDocumentAdapter$DocumentViewHolder_ViewBinding) r3     // Catch:{ NoSuchFieldException -> 0x0049 }
            if (r3 == 0) goto L_0x0049
            o.AdditionDocumentAdapter$DocumentViewHolder r3 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldException -> 0x0049 }
            boolean r3 = r3.IconCompatParcelizer()     // Catch:{ NoSuchFieldException -> 0x0049 }
            if (r3 == 0) goto L_0x0049
            goto L_0x0048
        L_0x0046:
            if (r3 != 0) goto L_0x0049
        L_0x0048:
            r2 = 1
        L_0x0049:
            if (r2 == 0) goto L_0x0084
            java.security.spec.EllipticCurve r1 = r1.getCurve()     // Catch:{ NoSuchFieldException -> 0x0099 }
            java.security.spec.ECField r1 = r1.getField()     // Catch:{ NoSuchFieldException -> 0x0099 }
            boolean r1 = r1 instanceof java.security.spec.ECFieldFp
            if (r1 == 0) goto L_0x0060
            o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r1 = p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.MODULUS     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding r1 = r6.read((p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder) r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            r0.add(r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
        L_0x0060:
            o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r1 = p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COEFFICIENT_A     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding r1 = r6.read((p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder) r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            r0.add(r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r1 = p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COEFFICIENT_B     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding r1 = r6.read((p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder) r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            r0.add(r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r1 = p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.BASE_POINT_G     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding r1 = r6.read((p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder) r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            r0.add(r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r1 = p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.BASE_POINT_R_ORDER     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding r1 = r6.read((p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder) r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            r0.add(r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
        L_0x0084:
            o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r1 = p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PUBLIC_POINT_Y     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding r1 = r6.read((p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder) r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            r0.add(r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            if (r2 == 0) goto L_0x0098
            o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r1 = p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COFACTOR_F     // Catch:{ NoSuchFieldException -> 0x0099 }
            o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding r1 = r6.read((p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder) r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
            r0.add(r1)     // Catch:{ NoSuchFieldException -> 0x0099 }
        L_0x0098:
            return r0
        L_0x0099:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.EasycashSalesheetAdapter$EasycashSalesheetViewHolder.IconCompatParcelizer():java.util.List");
    }

    public final ECParameterSpec getParams() {
        CustomCheckboxAdapter$CheckBoxViewHolder customCheckboxAdapter$CheckBoxViewHolder = (CustomCheckboxAdapter$CheckBoxViewHolder) this.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.MODULUS);
        CustomCheckboxAdapter$CheckBoxViewHolder customCheckboxAdapter$CheckBoxViewHolder2 = (CustomCheckboxAdapter$CheckBoxViewHolder) this.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COEFFICIENT_A);
        CustomCheckboxAdapter$CheckBoxViewHolder customCheckboxAdapter$CheckBoxViewHolder3 = (CustomCheckboxAdapter$CheckBoxViewHolder) this.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COEFFICIENT_B);
        CustomCheckboxAdapter$CheckBoxViewHolder customCheckboxAdapter$CheckBoxViewHolder4 = (CustomCheckboxAdapter$CheckBoxViewHolder) this.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.BASE_POINT_G);
        CustomCheckboxAdapter$CheckBoxViewHolder customCheckboxAdapter$CheckBoxViewHolder5 = (CustomCheckboxAdapter$CheckBoxViewHolder) this.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.BASE_POINT_R_ORDER);
        EasycashLoanTrackingAdapter$LoanViewHolder easycashLoanTrackingAdapter$LoanViewHolder = (EasycashLoanTrackingAdapter$LoanViewHolder) this.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COFACTOR_F);
        if (customCheckboxAdapter$CheckBoxViewHolder == null) {
            return null;
        }
        EllipticCurve ellipticCurve = new EllipticCurve(new ECFieldFp(new BigInteger(1, customCheckboxAdapter$CheckBoxViewHolder.MediaBrowserCompat$ItemReceiver)), new BigInteger(1, customCheckboxAdapter$CheckBoxViewHolder2.MediaBrowserCompat$ItemReceiver), new BigInteger(1, customCheckboxAdapter$CheckBoxViewHolder3.MediaBrowserCompat$ItemReceiver));
        return new ECParameterSpec(ellipticCurve, ECPointUtil.decodePoint(ellipticCurve, customCheckboxAdapter$CheckBoxViewHolder4.MediaBrowserCompat$ItemReceiver), new BigInteger(1, customCheckboxAdapter$CheckBoxViewHolder5.MediaBrowserCompat$ItemReceiver), easycashLoanTrackingAdapter$LoanViewHolder.write);
    }

    public final ECPoint getW() {
        try {
            byte[] bArr = ((CustomCheckboxAdapter$CheckBoxViewHolder) read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PUBLIC_POINT_Y)).MediaBrowserCompat$ItemReceiver;
            if (bArr[0] == 4) {
                int length = (bArr.length - 1) / 2;
                byte[] bArr2 = new byte[length];
                int length2 = (bArr.length - 1) / 2;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArr, 1, bArr2, 0, length);
                System.arraycopy(bArr, length + 1, bArr3, 0, length2);
                return new ECPoint(new BigInteger(1, bArr2), new BigInteger(1, bArr3));
            }
            throw new IllegalArgumentException("First byte must be 0x4");
        } catch (NoSuchFieldException e) {
            throw new IllegalStateException(e);
        }
    }

    private static byte[] IconCompatParcelizer(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        int i;
        byte[] read = read(eCPoint.getAffineX().toByteArray());
        byte[] read2 = read(eCPoint.getAffineY().toByteArray());
        if (ellipticCurve != null) {
            i = (ellipticCurve.getField().getFieldSize() + 7) >> 3;
        } else {
            i = read.length > read2.length ? read.length : read2.length;
        }
        int length = read.length < i ? i - read.length : 0;
        int length2 = read2.length < i ? i - read2.length : 0;
        byte[] bArr = new byte[((i << 1) + 1)];
        Arrays.fill(bArr, (byte) 0);
        bArr[0] = 4;
        System.arraycopy(read, 0, bArr, length + 1, i - length);
        System.arraycopy(read2, 0, bArr, i + 1 + length2, i - length2);
        return bArr;
    }
}

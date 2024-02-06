package org.jmrtd.cert;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Date;
import org.ejbca.cvc.AccessRightEnum;
import org.ejbca.cvc.AuthorizationRoleEnum;
import org.ejbca.cvc.CVCertificate;
import org.ejbca.cvc.exception.ConstructionException;
import org.jmrtd.cert.CVCAuthorizationTemplate;
import p040o.AdditionDocumentAdapter$DocumentViewHolder;
import p040o.AlertController$RecycleListView;
import p040o.CardLoanOfferViewPagerAdapter$ItemViewHolder;
import p040o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding;
import p040o.CustomCheckboxAdapter$CheckBoxViewHolder;
import p040o.DonationsItemListAdapter$DonationsCardViewHolder;
import p040o.DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding;
import p040o.EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding;
import p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder;
import p040o.EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding;
import p040o.EasycashLoanTrackingAdapter$LoanViewHolder_ViewBinding;

public class CVCertificateBuilder {
    public static CardVerifiableCertificate createCertificate(PublicKey publicKey, PrivateKey privateKey, String str, CVCPrincipal cVCPrincipal, CVCPrincipal cVCPrincipal2, CVCAuthorizationTemplate cVCAuthorizationTemplate, Date date, Date date2, String str2) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException, ConstructionException {
        String str3 = str;
        CardLoanOfferViewPagerAdapter$ItemViewHolder cardLoanOfferViewPagerAdapter$ItemViewHolder = new CardLoanOfferViewPagerAdapter$ItemViewHolder(cVCPrincipal.getCountry().toAlpha2Code(), cVCPrincipal.getMnemonic(), cVCPrincipal.getSeqNumber());
        EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding = new EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding(cVCPrincipal2.getCountry().toAlpha2Code(), cVCPrincipal2.getMnemonic(), cVCPrincipal2.getSeqNumber());
        AuthorizationRoleEnum role = getRole(cVCAuthorizationTemplate.getRole());
        PublicKey publicKey2 = publicKey;
        CVCertificate cVCertificate = new CVCertificate(new EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding(cardLoanOfferViewPagerAdapter$ItemViewHolder, EasycashLoanTrackingAdapter$LoanViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(publicKey, str, role), easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding, (AdditionDocumentAdapter$DocumentViewHolder) role, (DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding) getAccessRight(cVCAuthorizationTemplate.getAccessRight()), date, date2));
        Signature instance = Signature.getInstance(DonationsItemListAdapter$DonationsCardViewHolder.read(str), str2);
        PrivateKey privateKey2 = privateKey;
        instance.initSign(privateKey);
        instance.update(cVCertificate.MediaBrowserCompat$MediaItem());
        cVCertificate.MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new CustomCheckboxAdapter$CheckBoxViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.SIGNATURE, AlertController$RecycleListView.write(str, instance.sign())));
        return new CardVerifiableCertificate(cVCertificate);
    }

    private static AuthorizationRoleEnum getRole(CVCAuthorizationTemplate.Role role) {
        int i = C104871.$SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Role[role.ordinal()];
        if (i == 1) {
            return AuthorizationRoleEnum.CVCA;
        }
        if (i == 2) {
            return AuthorizationRoleEnum.DV_D;
        }
        if (i == 3) {
            return AuthorizationRoleEnum.DV_F;
        }
        if (i == 4) {
            return AuthorizationRoleEnum.IS;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot decode role ");
        sb.append(role);
        throw new NumberFormatException(sb.toString());
    }

    /* renamed from: org.jmrtd.cert.CVCertificateBuilder$1 */
    static /* synthetic */ class C104871 {
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission;
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Role;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        static {
            /*
                org.jmrtd.cert.CVCAuthorizationTemplate$Permission[] r0 = org.jmrtd.cert.CVCAuthorizationTemplate.Permission.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission = r0
                r1 = 1
                org.jmrtd.cert.CVCAuthorizationTemplate$Permission r2 = org.jmrtd.cert.CVCAuthorizationTemplate.Permission.READ_ACCESS_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission     // Catch:{ NoSuchFieldError -> 0x001d }
                org.jmrtd.cert.CVCAuthorizationTemplate$Permission r3 = org.jmrtd.cert.CVCAuthorizationTemplate.Permission.READ_ACCESS_DG3     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.jmrtd.cert.CVCAuthorizationTemplate$Permission r4 = org.jmrtd.cert.CVCAuthorizationTemplate.Permission.READ_ACCESS_DG4     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.jmrtd.cert.CVCAuthorizationTemplate$Permission r5 = org.jmrtd.cert.CVCAuthorizationTemplate.Permission.READ_ACCESS_DG3_AND_DG4     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                org.jmrtd.cert.CVCAuthorizationTemplate$Role[] r4 = org.jmrtd.cert.CVCAuthorizationTemplate.Role.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Role = r4
                org.jmrtd.cert.CVCAuthorizationTemplate$Role r5 = org.jmrtd.cert.CVCAuthorizationTemplate.Role.CVCA     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Role     // Catch:{ NoSuchFieldError -> 0x004e }
                org.jmrtd.cert.CVCAuthorizationTemplate$Role r4 = org.jmrtd.cert.CVCAuthorizationTemplate.Role.DV_D     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Role     // Catch:{ NoSuchFieldError -> 0x0058 }
                org.jmrtd.cert.CVCAuthorizationTemplate$Role r1 = org.jmrtd.cert.CVCAuthorizationTemplate.Role.DV_F     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Role     // Catch:{ NoSuchFieldError -> 0x0062 }
                org.jmrtd.cert.CVCAuthorizationTemplate$Role r1 = org.jmrtd.cert.CVCAuthorizationTemplate.Role.IS     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.cert.CVCertificateBuilder.C104871.<clinit>():void");
        }
    }

    private static AccessRightEnum getAccessRight(CVCAuthorizationTemplate.Permission permission) {
        int i = C104871.$SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission[permission.ordinal()];
        if (i == 1) {
            return AccessRightEnum.READ_ACCESS_NONE;
        }
        if (i == 2) {
            return AccessRightEnum.READ_ACCESS_DG3;
        }
        if (i == 3) {
            return AccessRightEnum.READ_ACCESS_DG4;
        }
        if (i == 4) {
            return AccessRightEnum.READ_ACCESS_DG3_AND_DG4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot decode access right ");
        sb.append(permission);
        throw new NumberFormatException(sb.toString());
    }
}

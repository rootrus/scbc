package org.jmrtd.cert;

import org.ejbca.cvc.AccessRightEnum;
import org.ejbca.cvc.AuthorizationRoleEnum;
import p040o.AdditionDocumentAdapter$DocumentViewHolder;
import p040o.AdditionDocumentAdapter$DocumentViewHolder_ViewBinding;
import p040o.DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding;
import p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder;

public class CVCAuthorizationTemplate {
    private Permission accessRight;
    private Role role;

    public enum Role {
        CVCA(192),
        DV_D(128),
        DV_F(64),
        IS(0);
        
        /* access modifiers changed from: private */
        public byte value;

        private Role(int i) {
            this.value = (byte) i;
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public enum Permission {
        READ_ACCESS_NONE(0),
        READ_ACCESS_DG3(1),
        READ_ACCESS_DG4(2),
        READ_ACCESS_DG3_AND_DG4(3);
        
        /* access modifiers changed from: private */
        public byte value;

        private Permission(int i) {
            this.value = (byte) i;
        }

        public final boolean implies(Permission permission) {
            int i = C104861.$SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return false;
                        }
                        if (permission == READ_ACCESS_DG3 || permission == READ_ACCESS_DG4 || permission == READ_ACCESS_DG3_AND_DG4) {
                            return true;
                        }
                        return false;
                    } else if (permission == READ_ACCESS_DG4) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (permission == READ_ACCESS_DG3) {
                    return true;
                } else {
                    return false;
                }
            } else if (permission == READ_ACCESS_NONE) {
                return true;
            } else {
                return false;
            }
        }

        public final byte getValue() {
            return this.value;
        }
    }

    protected CVCAuthorizationTemplate(org.ejbca.cvc.CVCAuthorizationTemplate cVCAuthorizationTemplate) {
        try {
            int[] iArr = C104861.$SwitchMap$org$ejbca$cvc$AuthorizationRoleEnum;
            AdditionDocumentAdapter$DocumentViewHolder additionDocumentAdapter$DocumentViewHolder = ((AdditionDocumentAdapter$DocumentViewHolder_ViewBinding) cVCAuthorizationTemplate.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.ROLE_AND_ACCESS_RIGHTS)).MediaBrowserCompat$CustomActionResultReceiver;
            if (additionDocumentAdapter$DocumentViewHolder instanceof AuthorizationRoleEnum) {
                int i = iArr[((AuthorizationRoleEnum) additionDocumentAdapter$DocumentViewHolder).ordinal()];
                if (i == 1) {
                    this.role = Role.CVCA;
                } else if (i == 2) {
                    this.role = Role.DV_D;
                } else if (i == 3) {
                    this.role = Role.DV_F;
                } else if (i == 4) {
                    this.role = Role.IS;
                }
                int[] iArr2 = C104861.$SwitchMap$org$ejbca$cvc$AccessRightEnum;
                DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding donationsItemListAdapter$DonationsCardViewHolder_ViewBinding = ((AdditionDocumentAdapter$DocumentViewHolder_ViewBinding) cVCAuthorizationTemplate.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.ROLE_AND_ACCESS_RIGHTS)).write;
                if (donationsItemListAdapter$DonationsCardViewHolder_ViewBinding instanceof AccessRightEnum) {
                    int i2 = iArr2[((AccessRightEnum) donationsItemListAdapter$DonationsCardViewHolder_ViewBinding).ordinal()];
                    if (i2 == 1) {
                        this.accessRight = Permission.READ_ACCESS_NONE;
                    } else if (i2 == 2) {
                        this.accessRight = Permission.READ_ACCESS_DG3;
                    } else if (i2 == 3) {
                        this.accessRight = Permission.READ_ACCESS_DG4;
                    } else if (i2 == 4) {
                        this.accessRight = Permission.READ_ACCESS_DG3_AND_DG4;
                    }
                } else {
                    throw new UnsupportedOperationException("Attempted to use deprecated getAccessRight method with an AT or ST certificate chain. It handles IS only.");
                }
            } else {
                throw new UnsupportedOperationException("Attempted to use deprecated getRole method with in an AT or ST certificate chain. It handles IS only.");
            }
        } catch (NoSuchFieldException unused) {
            throw new IllegalArgumentException("Error getting role from AuthZ template");
        }
    }

    public CVCAuthorizationTemplate(Role role2, Permission permission) {
        this.role = role2;
        this.accessRight = permission;
    }

    public Role getRole() {
        return this.role;
    }

    public Permission getAccessRight() {
        return this.accessRight;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.role.toString());
        sb.append(this.accessRight.toString());
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        CVCAuthorizationTemplate cVCAuthorizationTemplate = (CVCAuthorizationTemplate) obj;
        if (this.role == cVCAuthorizationTemplate.role && this.accessRight == cVCAuthorizationTemplate.accessRight) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.role.value << 1) + (this.accessRight.value * 3) + 61;
    }

    static AccessRightEnum fromPermission(Permission permission) {
        try {
            int i = C104861.$SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission[permission.ordinal()];
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
            throw new IllegalArgumentException("Error getting permission from AuthZ template");
        } catch (Exception unused) {
        }
    }

    /* renamed from: org.jmrtd.cert.CVCAuthorizationTemplate$1 */
    static /* synthetic */ class C104861 {
        static final /* synthetic */ int[] $SwitchMap$org$ejbca$cvc$AccessRightEnum;
        static final /* synthetic */ int[] $SwitchMap$org$ejbca$cvc$AuthorizationRoleEnum;
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission;
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Role;

        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b6 */
        static {
            /*
                org.jmrtd.cert.CVCAuthorizationTemplate$Role[] r0 = org.jmrtd.cert.CVCAuthorizationTemplate.Role.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Role = r0
                r1 = 1
                org.jmrtd.cert.CVCAuthorizationTemplate$Role r2 = org.jmrtd.cert.CVCAuthorizationTemplate.Role.CVCA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Role     // Catch:{ NoSuchFieldError -> 0x001d }
                org.jmrtd.cert.CVCAuthorizationTemplate$Role r3 = org.jmrtd.cert.CVCAuthorizationTemplate.Role.DV_D     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Role     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.jmrtd.cert.CVCAuthorizationTemplate$Role r4 = org.jmrtd.cert.CVCAuthorizationTemplate.Role.DV_F     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Role     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.jmrtd.cert.CVCAuthorizationTemplate$Role r5 = org.jmrtd.cert.CVCAuthorizationTemplate.Role.IS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                org.ejbca.cvc.AccessRightEnum[] r4 = org.ejbca.cvc.AccessRightEnum.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$org$ejbca$cvc$AccessRightEnum = r4
                org.ejbca.cvc.AccessRightEnum r5 = org.ejbca.cvc.AccessRightEnum.READ_ACCESS_NONE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = $SwitchMap$org$ejbca$cvc$AccessRightEnum     // Catch:{ NoSuchFieldError -> 0x004e }
                org.ejbca.cvc.AccessRightEnum r5 = org.ejbca.cvc.AccessRightEnum.READ_ACCESS_DG3     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = $SwitchMap$org$ejbca$cvc$AccessRightEnum     // Catch:{ NoSuchFieldError -> 0x0058 }
                org.ejbca.cvc.AccessRightEnum r5 = org.ejbca.cvc.AccessRightEnum.READ_ACCESS_DG4     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r4 = $SwitchMap$org$ejbca$cvc$AccessRightEnum     // Catch:{ NoSuchFieldError -> 0x0062 }
                org.ejbca.cvc.AccessRightEnum r5 = org.ejbca.cvc.AccessRightEnum.READ_ACCESS_DG3_AND_DG4     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                org.ejbca.cvc.AuthorizationRoleEnum[] r4 = org.ejbca.cvc.AuthorizationRoleEnum.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$org$ejbca$cvc$AuthorizationRoleEnum = r4
                org.ejbca.cvc.AuthorizationRoleEnum r5 = org.ejbca.cvc.AuthorizationRoleEnum.CVCA     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r4 = $SwitchMap$org$ejbca$cvc$AuthorizationRoleEnum     // Catch:{ NoSuchFieldError -> 0x007d }
                org.ejbca.cvc.AuthorizationRoleEnum r5 = org.ejbca.cvc.AuthorizationRoleEnum.DV_D     // Catch:{ NoSuchFieldError -> 0x007d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r4 = $SwitchMap$org$ejbca$cvc$AuthorizationRoleEnum     // Catch:{ NoSuchFieldError -> 0x0087 }
                org.ejbca.cvc.AuthorizationRoleEnum r5 = org.ejbca.cvc.AuthorizationRoleEnum.DV_F     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r4 = $SwitchMap$org$ejbca$cvc$AuthorizationRoleEnum     // Catch:{ NoSuchFieldError -> 0x0091 }
                org.ejbca.cvc.AuthorizationRoleEnum r5 = org.ejbca.cvc.AuthorizationRoleEnum.IS     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                org.jmrtd.cert.CVCAuthorizationTemplate$Permission[] r4 = org.jmrtd.cert.CVCAuthorizationTemplate.Permission.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission = r4
                org.jmrtd.cert.CVCAuthorizationTemplate$Permission r5 = org.jmrtd.cert.CVCAuthorizationTemplate.Permission.READ_ACCESS_NONE     // Catch:{ NoSuchFieldError -> 0x00a2 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a2 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00a2 }
            L_0x00a2:
                int[] r1 = $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission     // Catch:{ NoSuchFieldError -> 0x00ac }
                org.jmrtd.cert.CVCAuthorizationTemplate$Permission r4 = org.jmrtd.cert.CVCAuthorizationTemplate.Permission.READ_ACCESS_DG3     // Catch:{ NoSuchFieldError -> 0x00ac }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ac }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00ac }
            L_0x00ac:
                int[] r0 = $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission     // Catch:{ NoSuchFieldError -> 0x00b6 }
                org.jmrtd.cert.CVCAuthorizationTemplate$Permission r1 = org.jmrtd.cert.CVCAuthorizationTemplate.Permission.READ_ACCESS_DG4     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                int[] r0 = $SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission     // Catch:{ NoSuchFieldError -> 0x00c0 }
                org.jmrtd.cert.CVCAuthorizationTemplate$Permission r1 = org.jmrtd.cert.CVCAuthorizationTemplate.Permission.READ_ACCESS_DG3_AND_DG4     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.cert.CVCAuthorizationTemplate.C104861.<clinit>():void");
        }
    }

    static AuthorizationRoleEnum fromRole(Role role2) {
        try {
            int i = C104861.$SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Role[role2.ordinal()];
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
            throw new IllegalArgumentException("Error getting role from AuthZ template");
        } catch (Exception unused) {
        }
    }
}

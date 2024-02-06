package com.kofax.kmc.kut.utilities;

import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk.p005aa.C8244f;

public class LicensingVolume {
    public static ErrorInfo setMobileSDKLicenseServer(String str, Licensing.LicenseServerType licenseServerType) {
        return C8244f.setMobileSDKLicenseServer(str, licenseServerType);
    }

    public static void acquireVolumeLicenses(Licensing.LicenseType licenseType, int i) {
        C8244f.acquireVolumeLicenses(licenseType, i);
    }

    public static int getRemainingLicenseCount(Licensing.LicenseType licenseType) {
        return C8244f.getRemainingLicenseCount(licenseType);
    }

    public static void decrementRemainingLicenseCount(Licensing.LicenseType licenseType) {
        C8244f.decrementRemainingLicenseCount(licenseType);
    }

    public static class LicenseResults {
        public ErrorInfo errorInfo;
        public String result;

        public LicenseResults(ErrorInfo errorInfo2) {
            this.errorInfo = errorInfo2;
        }

        public LicenseResults() {
            this.errorInfo = ErrorInfo.KMC_SUCCESS;
        }
    }

    public static void addVolumeLicenseEventListener(Licensing.VolumeLicenseEventListener volumeLicenseEventListener) {
        C8244f.addVolumeLicenseEventListener(volumeLicenseEventListener);
    }

    public static void removeVolumeLicenseEventListener(Licensing.VolumeLicenseEventListener volumeLicenseEventListener) {
        C8244f.removeVolumeLicenseEventListener(volumeLicenseEventListener);
    }

    public static void setCertificateValidatorListener(CertificateValidatorListener certificateValidatorListener) {
        C8244f.setCertificateValidatorListener(certificateValidatorListener);
    }
}

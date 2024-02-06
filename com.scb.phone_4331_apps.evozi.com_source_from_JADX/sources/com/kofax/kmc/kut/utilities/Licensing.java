package com.kofax.kmc.kut.utilities;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import com.kofax.mobile.sdk.p005aa.C0780d;

public class Licensing {

    public enum LicenseServerType {
        RTTI,
        TotalAgility
    }

    public enum LicenseType {
        IMAGE_CAPTURE,
        IMAGE_PROCESSING,
        BARCODE_CAPTURE,
        LOGISTICS,
        ID_EXTRACTION
    }

    public interface VolumeLicenseEventListener {
        void licenseOperationFailed(VolumeLicenseFailureData volumeLicenseFailureData);

        void licenseOperationSucceeded(VolumeLicenseResultData volumeLicenseResultData);
    }

    public static int getDaysRemaining() {
        return C0780d.getDaysRemaining();
    }

    public static ErrorInfo setMobileSDKLicense(String str) {
        ErrorInfo errorInfo;
        ErrorInfo errorInfo2 = ErrorInfo.KMC_SUCCESS;
        if (str != null) {
            int init = IpLibUtil.init(str);
            if (init < 0) {
                errorInfo = IpLibUtil.ipErrHashMap.get(Integer.valueOf(init));
            } else if (init == 0) {
                errorInfo = ErrorInfo.KMC_EV_LICENSE_EXPIRED;
            } else {
                C0780d.m1857p(init);
                errorInfo = C0780d.m1855aC(IpLibUtil.m512aG());
            }
            if (errorInfo != ErrorInfo.KMC_SUCCESS) {
                C0780d.m1858qM();
            }
            return errorInfo;
        }
        C0780d.m1858qM();
        throw new NullPointerException("'licenseStr' parameter is null");
    }

    public static ErrorInfo setMobileSDKLicenseServer(String str, LicenseServerType licenseServerType) {
        return LicensingVolume.setMobileSDKLicenseServer(str, licenseServerType);
    }

    public static boolean isSdkLicensed(LicenseType licenseType) {
        return C0780d.m1854aB(licenseType.name());
    }

    public static void acquireVolumeLicenses(LicenseType licenseType, int i) {
        LicensingVolume.acquireVolumeLicenses(licenseType, i);
    }

    public static int getRemainingLicenseCount(LicenseType licenseType) {
        return LicensingVolume.getRemainingLicenseCount(licenseType);
    }

    public static void decrementRemainingLicenseCount(LicenseType licenseType) {
        LicensingVolume.decrementRemainingLicenseCount(licenseType);
    }

    public static class VolumeLicenseResultData {
        public int acquiredCount;
        public LicenseType licenseType;
        public ErrorInfo resultCode;

        public VolumeLicenseResultData(ErrorInfo errorInfo, int i, LicenseType licenseType2) {
            this.resultCode = errorInfo;
            this.acquiredCount = i;
            this.licenseType = licenseType2;
        }
    }

    public static class VolumeLicenseFailureData {
        public LicenseType licenseType;
        public ErrorInfo resultCode;

        public VolumeLicenseFailureData(ErrorInfo errorInfo, LicenseType licenseType2) {
            this.resultCode = errorInfo;
            this.licenseType = licenseType2;
        }
    }

    public static void addVolumeLicenseEventListener(VolumeLicenseEventListener volumeLicenseEventListener) {
        LicensingVolume.addVolumeLicenseEventListener(volumeLicenseEventListener);
    }

    public static void removeVolumeLicenseEventListener(VolumeLicenseEventListener volumeLicenseEventListener) {
        LicensingVolume.removeVolumeLicenseEventListener(volumeLicenseEventListener);
    }

    public static void setCertificateValidatorListener(CertificateValidatorListener certificateValidatorListener) {
        LicensingVolume.setCertificateValidatorListener(certificateValidatorListener);
    }
}

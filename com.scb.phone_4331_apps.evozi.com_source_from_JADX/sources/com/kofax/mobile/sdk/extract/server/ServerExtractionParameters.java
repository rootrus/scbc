package com.kofax.mobile.sdk.extract.server;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ServerExtractionParameters {
    private final String afS;
    private final TimeOutParameters afT;
    private final List<Image> afW;
    private final List<byte[]> afX;
    private final CertificateValidatorListener afY;
    private final HashMap<String, String> afZ;

    public ServerExtractionParameters(String str, List<Image> list, List<byte[]> list2, CertificateValidatorListener certificateValidatorListener, HashMap<String, String> hashMap, TimeOutParameters timeOutParameters) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("serverUrl cannot be null or empty");
        } else if ((list == null || list.size() == 0) && (list2 == null || list2.size() == 0)) {
            throw new IllegalArgumentException("images and imageBytes cannot be null or empty");
        } else {
            this.afS = str;
            this.afW = list;
            this.afX = list2;
            this.afY = certificateValidatorListener;
            this.afZ = hashMap;
            this.afT = timeOutParameters == null ? new TimeOutParameters(60, TimeUnit.SECONDS) : timeOutParameters;
        }
    }

    public String getServerUrl() {
        return this.afS;
    }

    public List<Image> getImages() {
        return this.afW;
    }

    public List<byte[]> getImageBytes() {
        return this.afX;
    }

    public CertificateValidatorListener getCertificateValidationListener() {
        return this.afY;
    }

    public HashMap<String, String> getParameters() {
        return this.afZ;
    }

    public TimeOutParameters getTimeOutParameters() {
        return this.afT;
    }
}

package com.kofax.mobile.sdk.logistics;

import android.os.Handler;
import android.os.Looper;
import bolts.Continuation;
import bolts.Task;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.BuildConfig;
import com.kofax.kmc.ken.engines.data.BasicSettingsProfile;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.ken.engines.processing.ColorDepth;
import com.kofax.kmc.ken.engines.processing.CropType;
import com.kofax.kmc.ken.engines.processing.DeskewType;
import com.kofax.kmc.ken.engines.processing.DocumentDimensions;
import com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration;
import com.kofax.kmc.ken.engines.processing.RotateType;
import com.kofax.kmc.klo.logistics.data.Document;
import com.kofax.kmc.klo.logistics.data.DocumentType;
import com.kofax.kmc.klo.logistics.data.Field;
import com.kofax.kmc.klo.logistics.data.FieldType;
import com.kofax.kmc.klo.logistics.data.Page;
import com.kofax.kmc.klo.logistics.data.UserProfile;
import com.kofax.kmc.klo.logistics.webservice.DeviceProfileResponse;
import com.kofax.kmc.klo.logistics.webservice.DeviceServiceResponse;
import com.kofax.kmc.klo.logistics.webservice.GetIndexFieldsResponse;
import com.kofax.kmc.klo.logistics.webservice.RetrieveScanSettingsResponse;
import com.kofax.kmc.klo.logistics.webservice.StartJobResponse;
import com.kofax.kmc.klo.logistics.webservice.UserLoginResponse;
import com.kofax.kmc.klo.logistics.webservice.WebServiceCallResult;
import com.kofax.kmc.klo.logistics.webservice.WscDestination;
import com.kofax.kmc.klo.logistics.webservice.WscIndexField;
import com.kofax.kmc.klo.logistics.webservice.WscScanSetting;
import com.kofax.kmc.klo.logistics.webservice.calls.DeviceService;
import com.kofax.kmc.klo.logistics.webservice.calls.GetIndexFields;
import com.kofax.kmc.klo.logistics.webservice.calls.ProfileService;
import com.kofax.kmc.klo.logistics.webservice.calls.RetrieveScanSettings;
import com.kofax.kmc.klo.logistics.webservice.calls.SendImage;
import com.kofax.kmc.klo.logistics.webservice.calls.StartJob;
import com.kofax.kmc.klo.logistics.webservice.calls.UserLogin;
import com.kofax.kmc.klo.logistics.webservice.calls.UserLogout;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.extract.p018id.ICompletionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

public class CaptureServer implements ICaptureServer {
    /* access modifiers changed from: private */

    /* renamed from: JI */
    public CertificateValidatorListener f5013JI;
    private final String TAG = CaptureServer.class.getSimpleName();
    private final String agc = "EVRSOperationsString";
    /* access modifiers changed from: private */
    public URL agd;
    /* access modifiers changed from: private */
    public Map<String, WscDestination> age = null;
    /* access modifiers changed from: private */
    public DocumentType.SourceServer agf = DocumentType.SourceServer.SERVER_NONE;
    private boolean agg = false;
    /* access modifiers changed from: private */
    public int agh = 20000;
    /* access modifiers changed from: private */
    public UserProfile agi = null;
    /* access modifiers changed from: private */
    public HashMap<String, Boolean> agj = null;

    public CaptureServer(String str, DocumentType.SourceServer sourceServer) {
        try {
            if (!Licensing.isSdkLicensed(Licensing.LicenseType.LOGISTICS)) {
                throw new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_LOGISTICS);
            } else if (str == null) {
                throw new IllegalArgumentException("server url is null");
            } else if (sourceServer != null) {
                this.agd = new URL(str);
                this.agf = sourceServer;
            } else {
                throw new IllegalArgumentException("SourceServer is null");
            }
        } catch (MalformedURLException e) {
            ErrorInfo errorInfo = ErrorInfo.KMC_LO_INVALID_SERVER_URL;
            errorInfo.setErrCause(e.getMessage());
            throw new KmcRuntimeException(errorInfo, e);
        }
    }

    public void setCertificateValidatorListener(CertificateValidatorListener certificateValidatorListener) {
        this.f5013JI = certificateValidatorListener;
    }

    public void setServerTimeout(int i) {
        if (i <= 0) {
            this.agh = 20000;
        } else {
            this.agh = i * 1000;
        }
    }

    public int getServerTimeout() {
        return this.agh / 1000;
    }

    public void registerDevice(final ICompletionListener<Void> iCompletionListener) {
        if (iCompletionListener != null) {
            m5056ud().continueWith(new Continuation<Void, Void>() {
                public Void then(Task<Void> task) throws Exception {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
            return;
        }
        throw new IllegalArgumentException("CompletionListener cannot be null");
    }

    public void login(UserProfile userProfile, final ICompletionListener<List<String>> iCompletionListener) {
        if (iCompletionListener != null) {
            this.agi = userProfile.clone();
            m5022a(userProfile).continueWith(new Continuation<List<String>, Void>() {
                public Void then(Task<List<String>> task) throws Exception {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
            return;
        }
        throw new IllegalArgumentException("CompletionListener cannot be null");
    }

    public void loginAnonymously(final ICompletionListener<List<String>> iCompletionListener) {
        if (iCompletionListener != null) {
            this.agi = new UserProfile();
            m5057ue().continueWith(new Continuation<List<String>, Void>() {
                public Void then(Task<List<String>> task) throws Exception {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
            return;
        }
        throw new IllegalArgumentException("CompletionListener cannot be null");
    }

    public void logout(final ICompletionListener<Void> iCompletionListener) {
        if (iCompletionListener != null) {
            m5058uf().continueWith(new Continuation<Void, Void>() {
                public Void then(Task<Void> task) throws Exception {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
            return;
        }
        throw new IllegalArgumentException("CompletionListener cannot be null");
    }

    public void getDocumentType(String str, final ICompletionListener<DocumentType> iCompletionListener) {
        if (iCompletionListener != null) {
            m5040aO(str).continueWith(new Continuation<DocumentType, Void>() {
                public Void then(Task<DocumentType> task) throws Exception {
                    DocumentType documentType = (DocumentType) task.getResult();
                    if (documentType != null) {
                        documentType.setSourceServer(CaptureServer.this.agf);
                    }
                    iCompletionListener.onComplete(documentType, task.getError());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
            return;
        }
        throw new IllegalArgumentException("CompletionListener cannot be null");
    }

    public void startJobService(final ICompletionListener<String> iCompletionListener) {
        if (iCompletionListener != null) {
            m5059ug().continueWith(new Continuation<String, Void>() {
                public Void then(Task<String> task) throws Exception {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
            return;
        }
        throw new IllegalArgumentException("CompletionListener cannot be null");
    }

    public void sendImageService(Document document, String str, Image image, int i, boolean z, final ICompletionListener<Void> iCompletionListener) {
        if (iCompletionListener != null) {
            m5021a(document, image, str, i, z).continueWith(new Continuation<Void, Void>() {
                public Void then(Task<Void> task) throws Exception {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
            return;
        }
        throw new IllegalArgumentException("CompletionListener cannot be null");
    }

    public void submitDocument(Document document, IProgressListener iProgressListener, final ICompletionListener iCompletionListener) {
        if (iCompletionListener == null) {
            throw new IllegalArgumentException("CompletionListener cannot be null");
        } else if (iProgressListener != null) {
            m5023a(this.agi, document, iProgressListener).continueWith(new Continuation<Integer, Void>() {
                public Void then(Task<Integer> task) throws Exception {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
        } else {
            throw new IllegalArgumentException("ProgressListener cannot be null");
        }
    }

    public ErrorInfo cancelSubmission(String str) {
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        if (!this.agj.containsKey(str)) {
            return ErrorInfo.KMC_LO_NO_OPERATION_TO_CANCEL;
        }
        this.agj.put(str, Boolean.TRUE);
        return errorInfo;
    }

    /* renamed from: ud */
    private Task<Void> m5056ud() {
        return Task.callInBackground(new Callable<Void>() {
            public Void call() throws Exception {
                ErrorInfo errorInfo;
                WebServiceCallResult updateDeviceInfo = DeviceService.updateDeviceInfo(CaptureServer.this.agd, CaptureServer.this.f5013JI, CaptureServer.this.agh);
                DeviceServiceResponse deviceServiceResponse = updateDeviceInfo.getExtraData() instanceof DeviceServiceResponse ? (DeviceServiceResponse) updateDeviceInfo.getExtraData() : null;
                if (updateDeviceInfo.isSuccess()) {
                    return null;
                }
                if (deviceServiceResponse == null || deviceServiceResponse.getResultCode() != DeviceService.ERROR_LICENSE_REQUIRES_AUTH) {
                    if (updateDeviceInfo.isCertificateError()) {
                        errorInfo = ErrorInfo.KMC_LO_INVALID_CERTIFICATE;
                    } else {
                        errorInfo = updateDeviceInfo.getErrorInfo() != null ? updateDeviceInfo.getErrorInfo() : ErrorInfo.KMC_LO_DEVICE_REG_LICENSING_ERROR;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (deviceServiceResponse != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(" (resultCode=");
                        sb2.append(deviceServiceResponse.getResultCode());
                        sb2.append(")");
                        sb.append(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(updateDeviceInfo.getErrorMsg());
                    sb3.append(sb.toString());
                    errorInfo.setErrCause(sb3.toString());
                    throw new KmcRuntimeException(errorInfo);
                }
                throw new KmcRuntimeException(ErrorInfo.KMC_LO_REGISTER_REQUIRES_AUTH);
            }
        });
    }

    /* renamed from: a */
    private Task<List<String>> m5022a(final UserProfile userProfile) {
        return Task.callInBackground(new Callable<List<String>>() {
            /* renamed from: mR */
            public List<String> call() throws Exception {
                ErrorInfo errorInfo;
                UserProfile userProfile = userProfile;
                if (userProfile == null) {
                    throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION, new IllegalArgumentException("login: userProfile parameter is null"));
                } else if (!userProfile.getUsername().isEmpty()) {
                    WebServiceCallResult loginUser = UserLogin.loginUser(CaptureServer.this.agd, userProfile.getDomain(), userProfile.getUsername(), userProfile.getPassword(), CaptureServer.this.agh, CaptureServer.this.f5013JI);
                    if (loginUser.isSuccess()) {
                        Map unused = CaptureServer.this.age = new HashMap();
                        for (WscDestination next : ((UserLoginResponse) loginUser.getExtraData()).getPersonalShortCuts()) {
                            CaptureServer.this.age.put(next.getShortcutName(), next);
                        }
                        return CaptureServer.this.m5060uh();
                    }
                    CaptureServer.this.m5061ui();
                    if (!loginUser.isCertificateError()) {
                        errorInfo = loginUser.getErrorInfo() != null ? loginUser.getErrorInfo() : ErrorInfo.KMC_LO_USER_LOGIN_ERROR;
                    } else {
                        errorInfo = ErrorInfo.KMC_LO_INVALID_CERTIFICATE;
                    }
                    errorInfo.setErrCause(loginUser.getErrorMsg());
                    throw new KmcRuntimeException(errorInfo);
                } else {
                    throw new KmcRuntimeException(ErrorInfo.KMC_LO_USERNAME_NOT_SET);
                }
            }
        });
    }

    /* renamed from: ue */
    private Task<List<String>> m5057ue() {
        return Task.callInBackground(new Callable<List<String>>() {
            /* renamed from: mR */
            public List<String> call() throws Exception {
                ErrorInfo errorInfo;
                WebServiceCallResult profile = ProfileService.getProfile(CaptureServer.this.agd, CaptureServer.this.agh, CaptureServer.this.f5013JI);
                if (profile.isSuccess()) {
                    Map unused = CaptureServer.this.age = new HashMap();
                    for (WscDestination next : ((DeviceProfileResponse) profile.getExtraData()).getProfileShortCuts()) {
                        CaptureServer.this.age.put(next.getShortcutName(), next);
                    }
                    return CaptureServer.this.m5060uh();
                }
                CaptureServer.this.m5061ui();
                if (!profile.isCertificateError()) {
                    errorInfo = profile.getErrorInfo() != null ? profile.getErrorInfo() : ErrorInfo.KMC_LO_USER_LOGIN_ERROR;
                } else {
                    errorInfo = ErrorInfo.KMC_LO_INVALID_CERTIFICATE;
                }
                errorInfo.setErrCause(profile.getErrorMsg());
                throw new KmcRuntimeException(errorInfo);
            }
        });
    }

    /* renamed from: uf */
    private Task<Void> m5058uf() {
        return Task.callInBackground(new Callable<Void>() {
            public Void call() throws Exception {
                ErrorInfo errorInfo;
                if (CaptureServer.this.age == null) {
                    throw new KmcRuntimeException(ErrorInfo.KMC_LO_NOT_LOGGED_IN);
                } else if (CaptureServer.this.agi == null || !CaptureServer.this.agi.getUsername().trim().equalsIgnoreCase("") || !CaptureServer.this.agi.getPassword().trim().equalsIgnoreCase("")) {
                    WebServiceCallResult logoutUser = UserLogout.logoutUser(CaptureServer.this.agd, CaptureServer.this.agi.getDomain(), CaptureServer.this.agi.getUsername(), CaptureServer.this.agi.getPassword(), CaptureServer.this.f5013JI, CaptureServer.this.agh);
                    if (logoutUser.isSuccess()) {
                        CaptureServer.this.m5061ui();
                        return null;
                    }
                    if (!logoutUser.isCertificateError()) {
                        errorInfo = logoutUser.getErrorInfo() != null ? logoutUser.getErrorInfo() : ErrorInfo.KMC_LO_USER_LOGOUT_ERROR;
                    } else {
                        errorInfo = ErrorInfo.KMC_LO_INVALID_CERTIFICATE;
                    }
                    errorInfo.setErrCause(logoutUser.getErrorMsg());
                    throw new KmcRuntimeException(errorInfo);
                } else {
                    CaptureServer.this.m5061ui();
                    return null;
                }
            }
        });
    }

    /* renamed from: aO */
    private Task<DocumentType> m5040aO(final String str) {
        return Task.callInBackground(new Callable<DocumentType>() {
            /* renamed from: uj */
            public DocumentType call() throws Exception {
                if (CaptureServer.this.age == null) {
                    throw new KmcRuntimeException(ErrorInfo.KMC_LO_NOT_LOGGED_IN);
                } else if (CaptureServer.this.age.containsKey(str)) {
                    CaptureServer captureServer = CaptureServer.this;
                    GetIndexFieldsResponse a = captureServer.m5028a(captureServer.agd, CaptureServer.this.agi, (WscDestination) CaptureServer.this.age.get(str), CaptureServer.this.f5013JI);
                    CaptureServer captureServer2 = CaptureServer.this;
                    RetrieveScanSettingsResponse b = captureServer2.m5044b(captureServer2.agd, CaptureServer.this.agi, (WscDestination) CaptureServer.this.age.get(str), CaptureServer.this.f5013JI);
                    List<WscIndexField> indexFields = a.getIndexFields();
                    List<WscScanSetting> scanSettings = b.getScanSettings();
                    boolean z = false;
                    DocumentType documentType = new DocumentType(CaptureServer.this.m5062w(indexFields));
                    BasicSettingsProfile basicSettingsProfile = null;
                    ImagePerfectionProfile imagePerfectionProfile = null;
                    ImageProcessorConfiguration imageProcessorConfiguration = null;
                    for (WscScanSetting next : scanSettings) {
                        if ("EVRSOperationsString".equals(next.getName()) && next.getValue() != null) {
                            z = true;
                            imagePerfectionProfile = new ImagePerfectionProfile();
                            imagePerfectionProfile.setIpOperations(next.getValue());
                            imageProcessorConfiguration = new ImageProcessorConfiguration(next.getValue());
                        }
                        String name = next.getName();
                        String value = next.getValue();
                        if (!(name == null || value == null)) {
                            if (name.equalsIgnoreCase("ShortEdgeLength")) {
                                documentType.setDocWidth(CaptureServer.this.m5042aQ(value));
                            } else if (name.equalsIgnoreCase("LongEdgeLength")) {
                                documentType.setDocHeight(CaptureServer.this.m5042aQ(value));
                            }
                        }
                    }
                    if (!z) {
                        imageProcessorConfiguration = new ImageProcessorConfiguration();
                        basicSettingsProfile = CaptureServer.this.m5025a((Collection<WscScanSetting>) scanSettings, imageProcessorConfiguration);
                    }
                    documentType.setTypeName(str);
                    documentType.setDisplayName(((WscDestination) CaptureServer.this.age.get(str)).getDisplayValue());
                    documentType.setSourceServer(DocumentType.SourceServer.SERVER_NONE);
                    new DocumentType.FriendDT(BuildConfig.APPLICATION_ID).setWscIndexFields(indexFields);
                    if (basicSettingsProfile != null) {
                        documentType.setBasicSettingsProfile(basicSettingsProfile);
                    } else if (imagePerfectionProfile != null) {
                        documentType.setImagePerfectionProfile(imagePerfectionProfile);
                    }
                    documentType.setImageProcessorConfiguration(imageProcessorConfiguration);
                    return documentType;
                } else {
                    throw new KmcRuntimeException(ErrorInfo.KMC_LO_INVALID_DOCUMENT_TYPE_NAME);
                }
            }
        });
    }

    /* renamed from: ug */
    private Task<String> m5059ug() {
        return Task.callInBackground(new Callable<String>() {
            /* renamed from: mB */
            public String call() throws Exception {
                if (CaptureServer.this.age != null) {
                    CaptureServer captureServer = CaptureServer.this;
                    return captureServer.m5047b(captureServer.agi);
                }
                throw new KmcRuntimeException(ErrorInfo.KMC_LO_NOT_LOGGED_IN);
            }
        });
    }

    /* renamed from: a */
    private Task<Void> m5021a(Document document, Image image, String str, int i, boolean z) {
        final Document document2 = document;
        final Image image2 = image;
        final String str2 = str;
        final int i2 = i;
        final boolean z2 = z;
        return Task.callInBackground(new Callable<Void>() {
            public Void call() throws Exception {
                if (CaptureServer.this.age == null) {
                    throw new KmcRuntimeException(ErrorInfo.KMC_LO_NOT_LOGGED_IN);
                } else if (document2 == null) {
                    throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION, new IllegalArgumentException("sendImage: document parameter is null"));
                } else if (image2 == null) {
                    throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION, new IllegalArgumentException("sendImage: Image parameter is null"));
                } else if (str2 != null) {
                    CaptureServer captureServer = CaptureServer.this;
                    ErrorInfo a = captureServer.m5035a(captureServer.agd, CaptureServer.this.agi, image2, document2, i2, str2, z2, CaptureServer.this.f5013JI);
                    if (a == ErrorInfo.KMC_SUCCESS) {
                        return null;
                    }
                    throw new KmcRuntimeException(a);
                } else {
                    throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION, new IllegalArgumentException("sendImage: JobID parameter is null"));
                }
            }
        });
    }

    /* renamed from: a */
    private Task<Integer> m5023a(final UserProfile userProfile, final Document document, final IProgressListener iProgressListener) {
        return Task.callInBackground(new Callable<Integer>() {
            /* renamed from: uk */
            public Integer call() throws Exception {
                ErrorInfo a = CaptureServer.this.m5030a(document);
                if (a == ErrorInfo.KMC_SUCCESS) {
                    WscDestination unused = CaptureServer.this.m5045b(document);
                    String a2 = CaptureServer.this.m5047b(userProfile);
                    if (CaptureServer.this.agj == null) {
                        HashMap unused2 = CaptureServer.this.agj = new HashMap();
                    }
                    CaptureServer.this.agj.put(a2, Boolean.FALSE);
                    ErrorInfo a3 = CaptureServer.this.m5031a(userProfile, document.getPages(), document, a2, iProgressListener);
                    if (a3 == ErrorInfo.KMC_SUCCESS) {
                        return Integer.valueOf(a3.ordinal());
                    }
                    throw new KmcRuntimeException(a3);
                }
                throw new KmcRuntimeException(a);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ErrorInfo m5031a(UserProfile userProfile, List<Page> list, Document document, String str, IProgressListener iProgressListener) {
        WscDestination wscDestination;
        long j;
        long j2;
        final String str2 = str;
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            WscDestination b = m5045b(document);
            Iterator<Page> it = list.iterator();
            long j3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Page next = it.next();
                List<Image> images = next.getImages();
                if (!images.isEmpty()) {
                    Image image = images.get(next.getCurrentImageIndex());
                    if (image.getImageFileRep() != Image.ImageFileRep.FILE_STORED) {
                        if (image.getImageFileRep() != Image.ImageFileRep.FILE_BUFFERED) {
                            errorInfo = ErrorInfo.KMC_LO_SUBMIT_BITMAP;
                            break;
                        }
                        j2 = Math.round(Math.ceil(((double) new Image.FriendI(BuildConfig.APPLICATION_ID).getFileBufferLength()) / 3.0d) * 1.03333d);
                    } else {
                        File file = new File(image.getImageFilePath());
                        if (file.exists()) {
                            j2 = Math.round(Math.ceil(((double) file.length()) / 3.0d) * 1.03333d);
                        } else {
                            j = 0;
                            arrayList.add(image);
                            arrayList2.add(Long.valueOf(j));
                            j3 += j;
                        }
                    }
                    j = j2 << 2;
                    arrayList.add(image);
                    arrayList2.add(Long.valueOf(j));
                    j3 += j;
                }
            }
            Iterator it2 = arrayList.iterator();
            Handler handler = new Handler(Looper.getMainLooper());
            int i = 0;
            long j4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Image image2 = (Image) it2.next();
                boolean z = !it2.hasNext();
                if (!this.agj.containsKey(str2) || !this.agj.get(str2).booleanValue()) {
                    UserProfile userProfile2 = userProfile;
                    int i2 = i;
                    Handler handler2 = handler;
                    wscDestination = b;
                    Iterator it3 = it2;
                    long j5 = j3;
                    errorInfo = m5035a(this.agd, userProfile, image2, document, i, str, z, this.f5013JI);
                    if (errorInfo != ErrorInfo.KMC_SUCCESS) {
                        break;
                    }
                    int i3 = i2;
                    i = i3 + 1;
                    long longValue = j4 + ((Long) arrayList2.get(i3)).longValue();
                    final int round = Math.round((((float) longValue) / ((float) j5)) * 100.0f);
                    final IProgressListener iProgressListener2 = iProgressListener;
                    handler2.post(new Runnable() {
                        public void run() {
                            iProgressListener2.onProgress(round, str2);
                        }
                    });
                    j4 = longValue;
                    handler = handler2;
                    j3 = j5;
                    b = wscDestination;
                    it2 = it3;
                    Document document2 = document;
                } else {
                    WebServiceCallResult a = m5029a(userProfile, b, str2);
                    if (!a.isSuccess()) {
                        ErrorInfo errorInfo2 = ErrorInfo.KMC_LO_OPERATION_CANCEL_ERROR;
                        errorInfo2.setErrCause(a.getErrorMsg());
                        errorInfo = errorInfo2;
                    } else {
                        errorInfo = ErrorInfo.KMC_LO_OPERATION_CANCELLED;
                    }
                }
            }
            wscDestination = b;
            wscDestination.getIndexFields().clear();
        } catch (KmcException e) {
            e.printStackTrace();
            errorInfo = e.getErrorInfo();
        }
        this.agj.remove(str2);
        return errorInfo;
    }

    /* renamed from: a */
    private WebServiceCallResult m5029a(UserProfile userProfile, WscDestination wscDestination, String str) {
        return SendImage.cancelJob(this.agd, wscDestination, userProfile.getUsername(), userProfile.getPassword(), str, this.f5013JI);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ErrorInfo m5030a(Document document) {
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        List<Page> pages = document.getPages();
        if (pages.isEmpty()) {
            return ErrorInfo.KMC_LO_SUBMIT_DOCUMENT_NO_IMAGE_ERROR;
        }
        Iterator<Page> it = pages.iterator();
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Page next = it.next();
            List<Image> images = next.getImages();
            if (!images.isEmpty()) {
                Image image = images.get(next.getCurrentImageIndex());
                boolean z2 = image.getImageFileRep() == Image.ImageFileRep.FILE_BUFFERED || image.getImageFileRep() == Image.ImageFileRep.FILE_STORED;
                boolean z3 = image.getImageMimeType() == Image.ImageMimeType.MIMETYPE_JPEG || image.getImageMimeType() == Image.ImageMimeType.MIMETYPE_TIFF;
                if (z2) {
                    if (z3) {
                        if (image.getImageFileRep() == Image.ImageFileRep.FILE_STORED && !new File(image.getImageFilePath()).exists()) {
                            errorInfo = ErrorInfo.KMC_LO_SUBMIT_DOCUMENT_IMAGE_FILE_MISSING;
                            break;
                        }
                        z = true;
                    } else {
                        errorInfo = ErrorInfo.KMC_LO_SUBMIT_DOCUMENT_MIMETYPE_ERROR;
                        break;
                    }
                } else {
                    errorInfo = ErrorInfo.KMC_LO_SUBMIT_DOCUMENT_IMAGE_REP_ERROR;
                    break;
                }
            }
        }
        return (errorInfo != ErrorInfo.KMC_SUCCESS || z) ? errorInfo : ErrorInfo.KMC_LO_SUBMIT_DOCUMENT_NO_IMAGE_ERROR;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m5047b(UserProfile userProfile) {
        ErrorInfo errorInfo;
        WebServiceCallResult startJob = StartJob.startJob(this.agd, userProfile.getUsername(), userProfile.getPassword(), this.f5013JI, this.agh);
        if (startJob.isSuccess()) {
            StartJobResponse startJobResponse = (StartJobResponse) startJob.getExtraData();
            String jobId = startJobResponse.getJobId();
            if (!(jobId == null || jobId.length() == 0)) {
                return startJobResponse.getJobId();
            }
            ErrorInfo errorInfo2 = ErrorInfo.KMC_LO_START_SUBMIT_INVALID_JOB_ID;
            errorInfo2.setErrCause("Null jobId returned from server");
            throw new KmcRuntimeException(errorInfo2);
        }
        if (!startJob.isCertificateError()) {
            errorInfo = startJob.getErrorInfo() != null ? startJob.getErrorInfo() : ErrorInfo.KMC_LO_START_SUBMIT_JOB_ERROR;
        } else {
            errorInfo = ErrorInfo.KMC_LO_INVALID_CERTIFICATE;
        }
        errorInfo.setErrCause(startJob.getErrorMsg());
        throw new KmcRuntimeException(errorInfo);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.io.RandomAccessFile} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0106 A[SYNTHETIC, Splitter:B:50:0x0106] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011e A[SYNTHETIC, Splitter:B:56:0x011e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.kofax.kmc.kut.utilities.error.ErrorInfo m5035a(java.net.URL r17, com.kofax.kmc.klo.logistics.data.UserProfile r18, com.kofax.kmc.ken.engines.data.Image r19, com.kofax.kmc.klo.logistics.data.Document r20, int r21, java.lang.String r22, boolean r23, com.kofax.kmc.kut.utilities.CertificateValidatorListener r24) {
        /*
            r16 = this;
            r1 = r16
            r0 = r20
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = r1.m5030a((com.kofax.kmc.klo.logistics.data.Document) r0)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r3 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            if (r2 != r3) goto L_0x0134
            com.kofax.kmc.klo.logistics.webservice.WscDestination r5 = r1.m5045b((com.kofax.kmc.klo.logistics.data.Document) r0)
            com.kofax.kmc.ken.engines.data.Image$ImageFileRep r0 = r19.getImageFileRep()
            com.kofax.kmc.ken.engines.data.Image$ImageFileRep r3 = com.kofax.kmc.ken.engines.data.Image.ImageFileRep.FILE_STORED
            r4 = 0
            r6 = 1
            r7 = 0
            if (r0 != r3) goto L_0x0033
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r19.getImageFilePath()
            r0.<init>(r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L_0x002d
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_LO_SUBMIT_DOCUMENT_IMAGE_FILE_MISSING
            goto L_0x002e
        L_0x002d:
            r4 = r6
        L_0x002e:
            r3 = r7
            r15 = r2
            r2 = r0
            r0 = r15
            goto L_0x005c
        L_0x0033:
            com.kofax.kmc.ken.engines.data.Image$ImageFileRep r0 = r19.getImageFileRep()
            com.kofax.kmc.ken.engines.data.Image$ImageFileRep r3 = com.kofax.kmc.ken.engines.data.Image.ImageFileRep.FILE_BUFFERED
            if (r0 != r3) goto L_0x0057
            java.nio.ByteBuffer r0 = r19.getImageFileBuffer()
            int r3 = r0.capacity()
            byte[] r4 = new byte[r3]
            r0.get(r4)
            if (r3 == 0) goto L_0x004f
            r0 = r2
            r3 = r4
            r4 = r6
            r2 = r7
            goto L_0x005c
        L_0x004f:
            com.kofax.kmc.kut.utilities.error.IllegalThreadStateException r0 = new com.kofax.kmc.kut.utilities.error.IllegalThreadStateException
            java.lang.String r2 = "submitImageToKFS: Unable to retrieve Image file bytes from File Buffer"
            r0.<init>(r2)
            throw r0
        L_0x0057:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_LO_SUBMIT_BITMAP
            r0 = r2
            r2 = r7
            r3 = r2
        L_0x005c:
            if (r4 == 0) goto L_0x0133
            java.lang.String r14 = "Error closing file read for upload"
            if (r2 == 0) goto L_0x007b
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0078 }
            java.lang.String r4 = "r"
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x0078 }
            long r6 = r3.length()     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            int r4 = (int) r6     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            r3.read(r4)     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            r9 = r4
            goto L_0x007d
        L_0x0075:
            r0 = move-exception
            goto L_0x011a
        L_0x0078:
            r0 = move-exception
            goto L_0x00e1
        L_0x007b:
            r9 = r3
            r3 = r7
        L_0x007d:
            java.lang.String r4 = r1.TAG     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            r6.<init>()     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            java.lang.String r7 = "Submitting a file of "
            r6.append(r7)     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            int r7 = r9.length     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            r6.append(r7)     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            java.lang.String r7 = " bytes"
            r6.append(r7)     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r4, (java.lang.String) r6)     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            java.lang.String r6 = r18.getUsername()     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            java.lang.String r7 = r18.getPassword()     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            int r13 = r1.agh     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            r4 = r17
            r8 = r22
            r10 = r21
            r11 = r23
            r12 = r24
            com.kofax.kmc.klo.logistics.webservice.WebServiceCallResult r4 = com.kofax.kmc.klo.logistics.webservice.calls.SendImage.sendImage(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            boolean r5 = r4.isSuccess()     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            if (r5 != 0) goto L_0x00d4
            boolean r0 = r4.isCertificateError()     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            if (r0 == 0) goto L_0x00c0
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_LO_INVALID_CERTIFICATE     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            goto L_0x00cd
        L_0x00c0:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = r4.getErrorInfo()     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            if (r0 == 0) goto L_0x00cb
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = r4.getErrorInfo()     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            goto L_0x00cd
        L_0x00cb:
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_LO_SUBMIT_DOCUMENT_IMAGES_ERROR     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
        L_0x00cd:
            java.lang.String r4 = r4.getErrorMsg()     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
            r0.setErrCause(r4)     // Catch:{ IOException -> 0x00df, all -> 0x00dc }
        L_0x00d4:
            if (r3 == 0) goto L_0x0133
            r3.close()     // Catch:{ Exception -> 0x00da }
            goto L_0x0133
        L_0x00da:
            r0 = move-exception
            goto L_0x010a
        L_0x00dc:
            r0 = move-exception
            r2 = r0
            goto L_0x011c
        L_0x00df:
            r0 = move-exception
            r7 = r3
        L_0x00e1:
            java.lang.String r3 = r1.TAG     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r4.<init>()     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = "Error reading file - "
            r4.append(r5)     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x0075 }
            r4.append(r2)     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0075 }
            com.kofax.mobile.sdk._internal.C0767k.m1821e((java.lang.String) r3, (java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0075 }
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_LO_SUBMIT_DOCUMENT_FILEIO_ERROR     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0075 }
            r2.setErrCause(r0)     // Catch:{ all -> 0x0075 }
            if (r7 == 0) goto L_0x0118
            r7.close()     // Catch:{ Exception -> 0x00da }
            goto L_0x0118
        L_0x010a:
            java.lang.String r2 = r1.TAG
            com.kofax.mobile.sdk._internal.C0767k.m1820e((java.lang.String) r2, (java.lang.String) r14)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_LO_SUBMIT_DOCUMENT_FILE_CLOSE_ERROR
            java.lang.String r0 = r0.getMessage()
            r2.setErrCause(r0)
        L_0x0118:
            r0 = r2
            goto L_0x0133
        L_0x011a:
            r2 = r0
            r3 = r7
        L_0x011c:
            if (r3 == 0) goto L_0x0132
            r3.close()     // Catch:{ Exception -> 0x0122 }
            goto L_0x0132
        L_0x0122:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = r1.TAG
            com.kofax.mobile.sdk._internal.C0767k.m1820e((java.lang.String) r0, (java.lang.String) r14)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_LO_SUBMIT_DOCUMENT_FILE_CLOSE_ERROR
            java.lang.String r3 = r3.getMessage()
            r0.setErrCause(r3)
        L_0x0132:
            throw r2
        L_0x0133:
            return r0
        L_0x0134:
            com.kofax.kmc.kut.utilities.error.KmcRuntimeException r0 = new com.kofax.kmc.kut.utilities.error.KmcRuntimeException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.logistics.CaptureServer.m5035a(java.net.URL, com.kofax.kmc.klo.logistics.data.UserProfile, com.kofax.kmc.ken.engines.data.Image, com.kofax.kmc.klo.logistics.data.Document, int, java.lang.String, boolean, com.kofax.kmc.kut.utilities.CertificateValidatorListener):com.kofax.kmc.kut.utilities.error.ErrorInfo");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public GetIndexFieldsResponse m5028a(URL url, UserProfile userProfile, WscDestination wscDestination, CertificateValidatorListener certificateValidatorListener) {
        ErrorInfo errorInfo;
        WebServiceCallResult indexFields = GetIndexFields.getIndexFields(url, wscDestination, userProfile.getUsername(), userProfile.getPassword(), certificateValidatorListener, this.agh);
        if (indexFields.isSuccess()) {
            return (GetIndexFieldsResponse) indexFields.getExtraData();
        }
        if (!indexFields.isCertificateError()) {
            errorInfo = indexFields.getErrorInfo() != null ? indexFields.getErrorInfo() : ErrorInfo.KMC_LO_DOWNLOAD_DOCUMENT_FIELDS_ERROR;
        } else {
            errorInfo = ErrorInfo.KMC_LO_INVALID_CERTIFICATE;
        }
        errorInfo.setErrCause(indexFields.getErrorMsg());
        throw new KmcRuntimeException(errorInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public RetrieveScanSettingsResponse m5044b(URL url, UserProfile userProfile, WscDestination wscDestination, CertificateValidatorListener certificateValidatorListener) {
        ErrorInfo errorInfo;
        WebServiceCallResult scanSettings = RetrieveScanSettings.getScanSettings(url, wscDestination, userProfile.getUsername(), userProfile.getPassword(), certificateValidatorListener, this.agh);
        if (scanSettings.isSuccess()) {
            return (RetrieveScanSettingsResponse) scanSettings.getExtraData();
        }
        if (!scanSettings.isCertificateError()) {
            errorInfo = scanSettings.getErrorInfo() != null ? scanSettings.getErrorInfo() : ErrorInfo.KMC_LO_DOWNLOAD_DOCUMENT_SCAN_SETTINGS_ERROR;
        } else {
            errorInfo = ErrorInfo.KMC_LO_INVALID_CERTIFICATE;
        }
        errorInfo.setErrCause(scanSettings.getErrorMsg());
        throw new KmcRuntimeException(errorInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public ArrayList<FieldType> m5062w(List<WscIndexField> list) {
        ArrayList<FieldType> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            WscIndexField wscIndexField = list.get(i);
            FieldType fieldType = new FieldType();
            fieldType.setHidden(Boolean.valueOf(wscIndexField.isHidden()));
            fieldType.setDisplayName(wscIndexField.getDisplayName());
            fieldType.setName(wscIndexField.getName());
            fieldType.setRequired(Boolean.valueOf(wscIndexField.isRequired()));
            fieldType.setDefault(wscIndexField.getValue());
            fieldType.setForceMatch(Boolean.valueOf(wscIndexField.isForceMatch()));
            fieldType.setMin(wscIndexField.getMin());
            fieldType.setMax(wscIndexField.getMax());
            String str = this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(wscIndexField.getDisplayName());
            sb.append(" ");
            sb.append(wscIndexField.getDataType());
            sb.append("  ");
            sb.append(wscIndexField.getMin());
            sb.append(" ");
            sb.append(wscIndexField.getMax());
            C0767k.m1807c(str, sb.toString());
            fieldType.setOptions((String[]) wscIndexField.getOptions().toArray(new String[wscIndexField.getOptions().size()]));
            if (wscIndexField.getDataType().equalsIgnoreCase("string")) {
                fieldType.setDataType(FieldType.DataType.STRING);
            } else if (wscIndexField.getDataType().equalsIgnoreCase("date")) {
                fieldType.setDataType(FieldType.DataType.DATE);
            } else if (wscIndexField.getDataType().equalsIgnoreCase("float")) {
                fieldType.setDataType(FieldType.DataType.FLOAT);
            } else if (wscIndexField.getDataType().equalsIgnoreCase("int")) {
                fieldType.setDataType(FieldType.DataType.INT);
            } else if (wscIndexField.getDataType().equalsIgnoreCase("boolean")) {
                fieldType.setDataType(FieldType.DataType.BOOL);
            }
            arrayList.add(fieldType);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public BasicSettingsProfile m5025a(Collection<WscScanSetting> collection, ImageProcessorConfiguration imageProcessorConfiguration) {
        BasicSettingsProfile basicSettingsProfile = new BasicSettingsProfile();
        Float valueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        Float f = valueOf;
        for (WscScanSetting next : collection) {
            String str = this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("wscScanSetting.getName() = ");
            sb.append(next.getName());
            C0767k.m1807c(str, sb.toString());
            String name = next.getName();
            String str2 = this.TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("wscScanSetting.getValue() = ");
            sb2.append(next.getValue());
            C0767k.m1807c(str2, sb2.toString());
            String value = next.getValue();
            if (value != null) {
                if (name.equals("OutputColorMode")) {
                    if (Integer.parseInt(next.getValue()) == 3) {
                        basicSettingsProfile.setOutputBitDepth(BasicSettingsProfile.OutputBitDepth.BITONAL);
                        imageProcessorConfiguration.outputColorDepth = ColorDepth.BITONAL;
                    }
                    if (Integer.parseInt(next.getValue()) == 1) {
                        basicSettingsProfile.setOutputBitDepth(BasicSettingsProfile.OutputBitDepth.COLOR);
                        imageProcessorConfiguration.outputColorDepth = ColorDepth.COLOR;
                    }
                    if (Integer.parseInt(next.getValue()) == 2) {
                        basicSettingsProfile.setOutputBitDepth(BasicSettingsProfile.OutputBitDepth.GRAYSCALE);
                        imageProcessorConfiguration.outputColorDepth = ColorDepth.GRAYSCALE;
                    }
                } else if (name.equalsIgnoreCase("DDPIV")) {
                    basicSettingsProfile.setOutputDPI(Integer.valueOf(value));
                    imageProcessorConfiguration.outputDPI = Integer.valueOf(value);
                } else if (name.equalsIgnoreCase("AutoDeskew")) {
                    if (m5041aP(next.getValue())) {
                        basicSettingsProfile.setDoDeskew(true);
                        imageProcessorConfiguration.deskewType = DeskewType.DESKEW_BY_DOCUMENT_EDGES;
                    } else {
                        basicSettingsProfile.setDoDeskew(false);
                    }
                } else if (name.equalsIgnoreCase("AutoCrop")) {
                    if (m5041aP(next.getValue())) {
                        basicSettingsProfile.setCropType(BasicSettingsProfile.CropType.CROP_AUTO);
                        imageProcessorConfiguration.cropType = CropType.CROP_AUTO;
                    } else {
                        basicSettingsProfile.setCropType(BasicSettingsProfile.CropType.CROP_NONE);
                        imageProcessorConfiguration.cropType = CropType.CROP_NONE;
                    }
                } else if (name.equalsIgnoreCase("AutoOrientation")) {
                    if (m5041aP(next.getValue())) {
                        basicSettingsProfile.setDoDeskew(true);
                        basicSettingsProfile.setRotateType(BasicSettingsProfile.RotateType.ROTATE_AUTO);
                        imageProcessorConfiguration.deskewType = DeskewType.DESKEW_BY_DOCUMENT_EDGES;
                        imageProcessorConfiguration.rotateType = RotateType.ROTATE_AUTO;
                    }
                } else if (name.equalsIgnoreCase("ShortEdgeLength")) {
                    basicSettingsProfile.setInputDocShortEdge(Float.valueOf(m5042aQ(value)));
                    valueOf = Float.valueOf(m5042aQ(value));
                } else if (name.equalsIgnoreCase("LongEdgeLength")) {
                    basicSettingsProfile.setInputDocLongEdge(Float.valueOf(m5042aQ(value)));
                    f = Float.valueOf(m5042aQ(value));
                }
            }
        }
        if (valueOf.floatValue() > BitmapDescriptorFactory.HUE_RED || f.floatValue() > BitmapDescriptorFactory.HUE_RED) {
            imageProcessorConfiguration.documentDimensions = new DocumentDimensions(valueOf, f);
        }
        String str3 = this.TAG;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("bsp :: CROP = ");
        sb3.append(basicSettingsProfile.getCropType());
        sb3.append(" SKEW = ");
        sb3.append(basicSettingsProfile.getDoDeskew());
        sb3.append(" BITDEPTH = ");
        sb3.append(basicSettingsProfile.getOutputBitDepth());
        sb3.append(" ROTATE = ");
        sb3.append(basicSettingsProfile.getRotateType());
        C0767k.m1807c(str3, sb3.toString());
        return basicSettingsProfile;
    }

    /* access modifiers changed from: private */
    /* renamed from: aQ */
    public float m5042aQ(String str) {
        if (str == null || str.trim().equals("")) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Locale("en"));
        arrayList.add(new Locale("pt", "BR"));
        arrayList.add(new Locale("de"));
        arrayList.add(new Locale("es"));
        arrayList.add(new Locale("fr"));
        arrayList.add(new Locale("it"));
        arrayList.add(new Locale("ja"));
        int i = 0;
        while (i < arrayList.size()) {
            try {
                return NumberFormat.getNumberInstance((Locale) arrayList.get(i)).parse(str).floatValue();
            } catch (ParseException e) {
                e.printStackTrace();
                i++;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* access modifiers changed from: private */
    /* renamed from: uh */
    public List<String> m5060uh() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.age.keySet());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public WscDestination m5045b(Document document) {
        try {
            List<WscIndexField> wscIndexFields = new DocumentType.FriendDT(BuildConfig.APPLICATION_ID).getWscIndexFields();
            List<Field> fields = document.getFields();
            HashMap hashMap = new HashMap();
            for (Field next : fields) {
                hashMap.put(next.getFieldType().getName(), next);
            }
            for (WscIndexField next2 : wscIndexFields) {
                next2.setValue(((Field) hashMap.get(next2.getName())).getValue());
            }
            WscDestination wscDestination = this.age.get(document.getDocumentType().getTypeName());
            wscDestination.setIndexFields(wscIndexFields);
            return wscDestination;
        } catch (KmcException e) {
            throw new KmcRuntimeException(e.getErrorInfo(), e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ui */
    public void m5061ui() {
        this.age = null;
        this.agi = null;
        this.agj = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* renamed from: aP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m5041aP(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x000c
            int r2 = r6.length()
            if (r2 == 0) goto L_0x000c
            r2 = r0
            goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            if (r2 == 0) goto L_0x0011
        L_0x000f:
            r2 = r0
            goto L_0x0027
        L_0x0011:
            int r2 = r6.length()
            r3 = r0
        L_0x0016:
            if (r3 >= r2) goto L_0x0026
            char r4 = r6.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L_0x0023
            goto L_0x000f
        L_0x0023:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0026:
            r2 = r1
        L_0x0027:
            if (r2 == 0) goto L_0x0032
            int r6 = java.lang.Integer.parseInt(r6)
            if (r6 == r1) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            r0 = r1
            goto L_0x0038
        L_0x0032:
            java.lang.String r0 = "True"
            boolean r0 = r6.equalsIgnoreCase(r0)
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.logistics.CaptureServer.m5041aP(java.lang.String):boolean");
    }
}

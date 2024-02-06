package p039io.beid.beidk.processor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.p042v1.XmlPullParserException;
import p039io.beid.beidk.BEIDConfigurationFactory;
import p039io.beid.beidk.activity.FaceCaptureActivity;
import p039io.beid.beidk.definitions.BeIDParams;
import p040o.CloseAccountConfirmationOtpActivity;

/* renamed from: io.beid.beidk.processor.FaceProcessor */
public class FaceProcessor {
    public static final Integer FACE_CAPTURE = 65281;
    private FaceProcessorParameter IconCompatParcelizer;
    private Intent MediaBrowserCompat$CustomActionResultReceiver;
    private Activity write;

    /* renamed from: io.beid.beidk.processor.FaceProcessor$FaceProcessorResult */
    public static class FaceProcessorResult {
        private ArrayList<byte[]> IconCompatParcelizer;
        private Boolean MediaBrowserCompat$CustomActionResultReceiver = Boolean.FALSE;
        private String MediaBrowserCompat$ItemReceiver;
        private String MediaBrowserCompat$MediaItem;
        private String read = "";
        private byte[] write;

        private FaceProcessorResult() {
        }

        public static FaceProcessorResult parse(Intent intent) throws IOException, XmlPullParserException {
            Bundle extras = intent.getExtras();
            FaceProcessorResult faceProcessorResult = new FaceProcessorResult();
            faceProcessorResult.IconCompatParcelizer = new ArrayList<>();
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                sb.append("livenessImage_");
                sb.append(i);
                byte[] byteArray = extras.getByteArray(sb.toString());
                if (byteArray == null) {
                    break;
                }
                faceProcessorResult.IconCompatParcelizer.add(byteArray);
                i++;
            }
            faceProcessorResult.write = extras.getByteArray("imageCapture");
            if (extras != null) {
                faceProcessorResult.read = extras.getString("responseStatus");
                faceProcessorResult.MediaBrowserCompat$ItemReceiver = extras.getString("errorCode");
                faceProcessorResult.MediaBrowserCompat$MediaItem = extras.getString("errorText");
            }
            return faceProcessorResult;
        }

        public ArrayList<byte[]> getActionImages() {
            return this.IconCompatParcelizer;
        }

        public ArrayList<byte[]> getActionVideos() {
            return null;
        }

        public String getErrorCode() {
            return this.MediaBrowserCompat$ItemReceiver;
        }

        public String getErrorText() {
            return this.MediaBrowserCompat$MediaItem;
        }

        public byte[] getImageCapture() {
            return this.write;
        }

        public String getResponseStatus() {
            return this.read;
        }

        public Boolean getSuccess() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    /* renamed from: io.beid.beidk.processor.FaceProcessor$BiometricOperation */
    public static final class BiometricOperation {
        public static final String VERIFICATION = "VERIFICATION";
    }

    /* renamed from: io.beid.beidk.processor.FaceProcessor$FaceProcessorParameter */
    public static class FaceProcessorParameter {
        private HashMap<String, String> ActionMenuItemView;
        private List<Integer> AlertController$RecycleListView;
        private String AppCompatActivity;
        private String AppCompatDelegateImpl$ListMenuDecorView;
        private String AppCompatDialogFragment;
        private String AppCompatViewInflater;
        private String IconCompatParcelizer;
        private Boolean Keep;
        private Integer MediaBrowserCompat$CustomActionResultReceiver;
        private String MediaBrowserCompat$ItemReceiver;
        private String MediaBrowserCompat$MediaItem;
        private Boolean MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private Boolean f3122x50fd9e4a;
        private String MediaDescriptionCompat;
        private Boolean MediaMetadataCompat;
        private Boolean MediaSessionCompat$QueueItem;
        private Boolean MediaSessionCompat$ResultReceiverWrapper;
        private Boolean MediaSessionCompat$Token;
        private Boolean ParcelableVolumeInfo;
        private Integer PlaybackStateCompat;
        private Boolean PlaybackStateCompat$CustomAction;
        private String RatingCompat;
        private BEIDConfigurationFactory read;
        private String setBackgroundResource;
        private InputStream setChecked;
        private String setContentView;
        private Integer setHasDecor;
        private Integer write;

        private FaceProcessorParameter(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num, String str7, List<Integer> list, Integer num2, Integer num3, String str8, String str9, Integer num4, InputStream inputStream, String str10, HashMap<String, String> hashMap, String str11, BEIDConfigurationFactory bEIDConfigurationFactory) {
            this.setBackgroundResource = str;
            this.AppCompatDialogFragment = str2;
            this.AppCompatDelegateImpl$ListMenuDecorView = str3;
            this.setContentView = str4;
            this.AppCompatActivity = str5;
            this.IconCompatParcelizer = str7;
            this.MediaBrowserCompat$CustomActionResultReceiver = num2;
            this.write = num3;
            this.MediaDescriptionCompat = str8;
            this.MediaBrowserCompat$MediaItem = str6;
            this.RatingCompat = str9;
            this.MediaBrowserCompat$SearchResultReceiver = bool;
            this.MediaMetadataCompat = bool2;
            this.ParcelableVolumeInfo = bool3;
            this.MediaSessionCompat$Token = bool4;
            this.MediaSessionCompat$ResultReceiverWrapper = bool5;
            this.f3122x50fd9e4a = bool6;
            this.MediaSessionCompat$QueueItem = bool7;
            this.PlaybackStateCompat$CustomAction = bool8;
            this.Keep = bool9;
            this.setHasDecor = num;
            this.AlertController$RecycleListView = list;
            this.PlaybackStateCompat = num4;
            this.setChecked = inputStream;
            this.AppCompatViewInflater = str10;
            this.ActionMenuItemView = hashMap;
            this.MediaBrowserCompat$ItemReceiver = str11;
            this.read = bEIDConfigurationFactory;
        }

        /* synthetic */ FaceProcessorParameter(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num, String str7, List list, Integer num2, Integer num3, String str8, String str9, Integer num4, InputStream inputStream, String str10, HashMap hashMap, String str11, BEIDConfigurationFactory bEIDConfigurationFactory, byte b) {
            this(str, str2, str3, str4, str5, str6, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, str7, list, num2, num3, str8, str9, num4, (InputStream) null, str10, hashMap, str11, bEIDConfigurationFactory);
        }

        public static FaceProcessorParameterBuilder Builder() {
            return new FaceProcessorParameterBuilder();
        }

        public String getBiometricOperation() {
            return this.RatingCompat;
        }

        public Boolean getCaptureAutomatic() {
            return this.MediaBrowserCompat$SearchResultReceiver;
        }

        public Boolean getCaptureOnly() {
            return this.MediaSessionCompat$QueueItem;
        }

        public InputStream getCertificate() {
            return this.setChecked;
        }

        public BEIDConfigurationFactory getConfig() {
            return this.read;
        }

        public Integer getContinuousSuccess() {
            return this.setHasDecor;
        }

        public String getDateOfBirth() {
            return this.AppCompatActivity;
        }

        public Boolean getFaceFirst() {
            return this.PlaybackStateCompat$CustomAction;
        }

        public Boolean getFaceSpoofDetection() {
            return this.MediaSessionCompat$Token;
        }

        public String getFirstName() {
            return this.AppCompatDialogFragment;
        }

        public Boolean getGetActionImage() {
            return this.ParcelableVolumeInfo;
        }

        public Boolean getGetActionVideo() {
            return this.MediaMetadataCompat;
        }

        public Boolean getIncludeImage() {
            return this.MediaSessionCompat$ResultReceiverWrapper;
        }

        public Boolean getIncludeVoice() {
            return this.f3122x50fd9e4a;
        }

        public String getInstitution() {
            return this.MediaDescriptionCompat;
        }

        public Integer getJPEGQuality() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public Boolean getKonyMobileFabric() {
            return this.Keep;
        }

        public String getLanguage() {
            return this.MediaBrowserCompat$ItemReceiver;
        }

        public String getLastName() {
            return this.AppCompatDelegateImpl$ListMenuDecorView;
        }

        public Integer getLivenessAcceptance() {
            return this.PlaybackStateCompat;
        }

        public List<Integer> getLivenessActivities() {
            return this.AlertController$RecycleListView;
        }

        public String getMiddleName() {
            return this.setContentView;
        }

        public HashMap<String, String> getParams() {
            return this.ActionMenuItemView;
        }

        public String getSubjectID() {
            return this.IconCompatParcelizer;
        }

        public Integer getTimer() {
            return this.write;
        }

        public String getTransactionId() {
            return this.AppCompatViewInflater;
        }

        public String getUrlServer() {
            return this.setBackgroundResource;
        }

        public String getWorkstation() {
            return this.MediaBrowserCompat$MediaItem;
        }
    }

    /* renamed from: io.beid.beidk.processor.FaceProcessor$FaceProcessorParameterBuilder */
    public static class FaceProcessorParameterBuilder {
        private Boolean AlertController$RecycleListView;
        private Boolean AppCompatActivity;
        private Boolean AppCompatDelegateImpl$ListMenuDecorView;
        private Boolean AppCompatDialogFragment;
        private List<Integer> AppCompatViewInflater;
        private String IconCompatParcelizer;
        private Boolean Keep;
        private String MediaBrowserCompat$CustomActionResultReceiver = "http://api.beid.io";
        private String MediaBrowserCompat$ItemReceiver;
        private String MediaBrowserCompat$MediaItem;
        private String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private String f3123x50fd9e4a = "TestPassportReader";
        private String MediaDescriptionCompat;
        private HashMap<String, String> MediaMetadataCompat;
        private String MediaSessionCompat$QueueItem = BiometricOperation.VERIFICATION;
        private Integer MediaSessionCompat$ResultReceiverWrapper = 100;
        private String MediaSessionCompat$Token = "MB";
        private Integer ParcelableVolumeInfo = 6;
        private Boolean PlaybackStateCompat;
        private Boolean PlaybackStateCompat$CustomAction;
        private String RatingCompat;
        private BEIDConfigurationFactory read;
        private Boolean setBackgroundResource;
        private Integer setChecked;
        private Integer setContentView;
        private Boolean setHasDecor;
        private String write;

        public FaceProcessorParameterBuilder() {
            Boolean bool = Boolean.FALSE;
            this.AlertController$RecycleListView = bool;
            Boolean bool2 = Boolean.TRUE;
            this.setHasDecor = bool2;
            this.Keep = bool2;
            this.PlaybackStateCompat = bool2;
            this.PlaybackStateCompat$CustomAction = bool2;
            this.AppCompatDelegateImpl$ListMenuDecorView = bool;
            this.AppCompatDialogFragment = bool2;
            this.setBackgroundResource = bool;
            this.AppCompatActivity = bool;
            this.setContentView = 1;
            this.AppCompatViewInflater = new ArrayList();
            this.setChecked = 3;
        }

        public FaceProcessorParameter createFaceProcessorParameter() {
            return new FaceProcessorParameter(this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$MediaItem, this.f3123x50fd9e4a, this.AlertController$RecycleListView, this.setHasDecor, this.Keep, this.PlaybackStateCompat, this.PlaybackStateCompat$CustomAction, this.AppCompatDelegateImpl$ListMenuDecorView, this.setBackgroundResource, this.AppCompatDialogFragment, this.AppCompatActivity, this.setContentView, this.MediaDescriptionCompat, this.AppCompatViewInflater, this.MediaSessionCompat$ResultReceiverWrapper, this.ParcelableVolumeInfo, this.MediaSessionCompat$Token, this.MediaSessionCompat$QueueItem, this.setChecked, (InputStream) null, this.RatingCompat, this.MediaMetadataCompat, this.IconCompatParcelizer, this.read, (byte) 0);
        }

        public FaceProcessorParameterBuilder setConfig(BEIDConfigurationFactory.Builder builder) {
            this.read = builder.Build();
            return this;
        }

        public FaceProcessorParameterBuilder setConfig(BEIDConfigurationFactory bEIDConfigurationFactory) {
            this.read = bEIDConfigurationFactory;
            return this;
        }

        public FaceProcessorParameterBuilder setDateOfBirth(String str) {
            this.MediaBrowserCompat$MediaItem = str;
            return this;
        }

        public FaceProcessorParameterBuilder setFirstName(String str) {
            this.write = str;
            return this;
        }

        public FaceProcessorParameterBuilder setIsIncludeImage(Boolean bool) {
            this.PlaybackStateCompat$CustomAction = bool;
            return this;
        }

        public FaceProcessorParameterBuilder setIsIncludeVoice(Boolean bool) {
            this.AppCompatDelegateImpl$ListMenuDecorView = bool;
            return this;
        }

        public FaceProcessorParameterBuilder setJpegQuality(Integer num) {
            this.MediaSessionCompat$ResultReceiverWrapper = num;
            return this;
        }

        public FaceProcessorParameterBuilder setLanguage(String str) {
            this.IconCompatParcelizer = str;
            return this;
        }

        public FaceProcessorParameterBuilder setLastName(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
            return this;
        }

        public FaceProcessorParameterBuilder setLivenessAcceptance(Integer num) {
            this.setChecked = num;
            return this;
        }

        public FaceProcessorParameterBuilder setLivenessActivities(List<Integer> list) {
            this.AppCompatViewInflater = list;
            return this;
        }

        public FaceProcessorParameterBuilder setMiddleName(String str) {
            this.MediaBrowserCompat$SearchResultReceiver = str;
            return this;
        }

        public FaceProcessorParameterBuilder setParams(HashMap<String, String> hashMap) {
            this.MediaMetadataCompat = hashMap;
            return this;
        }

        public FaceProcessorParameterBuilder setSubjectID(String str) {
            this.MediaDescriptionCompat = str;
            return this;
        }

        public FaceProcessorParameterBuilder setTransactionId(String str) {
            this.RatingCompat = str;
            return this;
        }

        public FaceProcessorParameterBuilder setUrlServer(String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            return this;
        }
    }

    /* renamed from: io.beid.beidk.processor.FaceProcessor$LivenessActivity */
    public static final class LivenessActivity {
        public static final Integer BLINK = 2;
        public static final Integer CLOSE_LEFT_EYE = 5;
        public static final Integer CLOSE_RIGHT_EYE = 6;
        public static final Integer SMILE = 1;
        public static final Integer STRAIGHT = 0;
        public static final Integer TILT_HEAD_LEFT = 3;
        public static final Integer TILT_HEAD_RIGHT = 4;
        public static final Integer TURN_FACE_LEFT = 7;
        public static final Integer TURN_FACE_RIGHT = 8;
    }

    public FaceProcessor(Activity activity, FaceProcessorParameter faceProcessorParameter) {
        this.write = activity;
        this.IconCompatParcelizer = faceProcessorParameter;
    }

    public FaceProcessor(Activity activity, FaceProcessorParameterBuilder faceProcessorParameterBuilder) {
        this(activity, faceProcessorParameterBuilder.createFaceProcessorParameter());
    }

    public static void startActivityForResult(Activity activity, FaceProcessorParameter faceProcessorParameter) {
        new FaceProcessor(activity, faceProcessorParameter).startActivityForResult();
    }

    public static void startActivityForResult(Activity activity, FaceProcessorParameterBuilder faceProcessorParameterBuilder) {
        new FaceProcessor(activity, faceProcessorParameterBuilder).startActivityForResult();
    }

    public void startActivityForResult() {
        if (this.IconCompatParcelizer.getCertificate() != null) {
            new FaceCaptureActivity();
            this.IconCompatParcelizer.getCertificate();
            FaceCaptureActivity.MediaDescriptionCompat();
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = new Intent(this.write, FaceCaptureActivity.class);
        if (this.IconCompatParcelizer.getConfig() != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("_config", this.IconCompatParcelizer.getConfig());
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("ContinuousSuccess", this.IconCompatParcelizer.getContinuousSuccess());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("SubjectID", this.IconCompatParcelizer.getSubjectID());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("JPEGQuality", this.IconCompatParcelizer.getJPEGQuality());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("Timer", this.IconCompatParcelizer.getTimer());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("institution", this.IconCompatParcelizer.getInstitution());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("workstation", this.IconCompatParcelizer.getWorkstation());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("BiometricOperation", this.IconCompatParcelizer.getBiometricOperation());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("isCaptureAutomatic", this.IconCompatParcelizer.getCaptureAutomatic());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("getActionVideo", this.IconCompatParcelizer.getGetActionVideo());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("getActionImage", this.IconCompatParcelizer.getGetActionImage());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("isFace_Spoof_Detection", this.IconCompatParcelizer.getFaceSpoofDetection());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("isIncludeImage", this.IconCompatParcelizer.getIncludeImage());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("isIncludeVoice", this.IconCompatParcelizer.getIncludeVoice());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("isFaceFirst", this.IconCompatParcelizer.getFaceFirst());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("isKonyMobileFabric", this.IconCompatParcelizer.getKonyMobileFabric());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("isCaptureOnly", this.IconCompatParcelizer.getCaptureOnly());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("URLServer", this.IconCompatParcelizer.getUrlServer());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("firstName", this.IconCompatParcelizer.getFirstName());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("lastName", this.IconCompatParcelizer.getLastName());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("middleName", this.IconCompatParcelizer.getMiddleName());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("dob", this.IconCompatParcelizer.getDateOfBirth());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra(BeIDParams.BEID_TRANSACTION_ID, this.IconCompatParcelizer.getTransactionId());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("params", this.IconCompatParcelizer.getParams());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("language", this.IconCompatParcelizer.getLanguage());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("livenessAcceptance", this.IconCompatParcelizer.getLivenessAcceptance());
        CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$QueueItem.clear();
        CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo.clear();
        CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().f5485x50fd9e4a.clear();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.IconCompatParcelizer.getLivenessActivities() != null) {
            for (Integer intValue : this.IconCompatParcelizer.getLivenessActivities()) {
                byteArrayOutputStream.write(intValue.intValue());
            }
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("livenessActivityLength", byteArrayOutputStream.size());
        this.MediaBrowserCompat$CustomActionResultReceiver.putExtra("livenessActivity", byteArrayOutputStream.toByteArray());
        this.write.startActivityForResult(this.MediaBrowserCompat$CustomActionResultReceiver, FACE_CAPTURE.intValue());
    }
}

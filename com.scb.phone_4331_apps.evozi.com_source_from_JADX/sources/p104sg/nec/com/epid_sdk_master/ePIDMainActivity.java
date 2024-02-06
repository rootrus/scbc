package p104sg.nec.com.epid_sdk_master;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import p040o.CustomCardApplyViewComponent;
import p040o.CustomStatementChannelViewComponent_ViewBinding;
import p040o.DocumentUploadedCustomView_ViewBinding;
import p040o.setCbSelect;
import p040o.setCkbCardName;
import p040o.setFullDivider;
import p040o.setHeader;
import p040o.setQuestionMark;
import p040o.setRecipients;
import p040o.setRemainingLimit;
import p040o.setSourceName;
import p040o.setTermsAndConditionsListener;
import p040o.setTvRemark;
import p040o.setTvRemark$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTvRemark$MediaBrowserCompat$ItemReceiver;
import p040o.setTvTitle;
import p104sg.nec.com.epid_sdk_master.fragment.CaptureFragment;
import p104sg.nec.com.epid_sdk_master.fragment.ConfirmationFragment;

/* renamed from: sg.nec.com.epid_sdk_master.ePIDMainActivity */
public class ePIDMainActivity extends Activity implements setQuestionMark, DocumentUploadedCustomView_ViewBinding {
    /* access modifiers changed from: private */
    public static String MediaMetadataCompat = ePIDMainActivity.class.getSimpleName();
    public static write write = write.ORIENTATION_0;
    private String AbsActionBarView;
    private String ActionBarContainer;
    private String ActionMenuItemView;
    private String AlertController$RecycleListView;
    private String AppCompatActivity;
    private byte[] AppCompatDelegateImpl$ListMenuDecorView;
    private String AppCompatDialogFragment;
    private boolean AppCompatViewInflater;
    private String ExpandedMenuView;
    public CaptureFragment IconCompatParcelizer;
    private String Keep;
    private boolean ListMenuItemView;
    public IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    String MediaBrowserCompat$ItemReceiver;
    boolean MediaBrowserCompat$MediaItem;
    boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private int f6394x50fd9e4a = 90;
    String MediaDescriptionCompat;
    private String MediaSessionCompat$QueueItem;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    /* access modifiers changed from: private */
    public Handler MenuItemImpl;
    private String MenuItemWrapperICS$CollapsibleActionViewWrapper;
    private String ParcelableVolumeInfo;
    private String PlaybackStateCompat;
    private String PlaybackStateCompat$CustomAction;
    boolean RatingCompat;
    public ConfirmationFragment read;
    private String setBackgroundResource;
    /* access modifiers changed from: private */
    public boolean setCheckable;
    private boolean setChecked;
    private String setContentHeight;
    private byte[] setContentView;
    private boolean setExpandedFormat;
    private boolean setForceShowIcon;
    private String setGroupDividerEnabled;
    private int setHasDecor;
    private boolean setIcon;
    private boolean setItemInvoker;
    private boolean setPadding;
    private boolean setPopupCallback;
    private boolean setShortcut;
    private byte[] setSplitBackground;
    private boolean setTitle;
    private String setVisibility;

    /* renamed from: sg.nec.com.epid_sdk_master.ePIDMainActivity$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        CAPTURE,
        CONFIRM,
        ID,
        RESULT,
        UPDATE
    }

    /* renamed from: sg.nec.com.epid_sdk_master.ePIDMainActivity$write */
    public enum write {
        ORIENTATION_0,
        ORIENTATION_90,
        ORIENTATION_270
    }

    public ePIDMainActivity() {
        new setSourceName();
        this.MediaBrowserCompat$ItemReceiver = "";
        this.MediaDescriptionCompat = null;
        this.MenuItemImpl = new Handler(new Handler.Callback() {
            public final boolean handleMessage(Message message) {
                Intent intent = new Intent();
                int i = message.what;
                if (i != 0) {
                    if (i == 1) {
                        if (setRecipients.MediaMetadataCompat().RatingCompat != setRecipients.IconCompatParcelizer.face_first || !setRecipients.MediaMetadataCompat().AppCompatDialogFragment) {
                            intent.putExtra("error", ePIDMainActivity.this.MediaDescriptionCompat);
                            ePIDMainActivity.this.setResult(0, intent);
                            ePIDMainActivity.this.finish();
                        } else if (ePIDMainActivity.this.MediaBrowserCompat$SearchResultReceiver) {
                            Log.e(ePIDMainActivity.MediaMetadataCompat, "face detection success");
                            intent.putExtra("error", ePIDMainActivity.this.MediaDescriptionCompat);
                            ePIDMainActivity.this.setResult(0, intent);
                            ePIDMainActivity.this.finish();
                        } else {
                            Log.e(ePIDMainActivity.MediaMetadataCompat, "face detection fails");
                        }
                    }
                } else if (setRecipients.MediaMetadataCompat().RatingCompat != setRecipients.IconCompatParcelizer.face_first || !setRecipients.MediaMetadataCompat().AppCompatDialogFragment) {
                    if (setRecipients.MediaMetadataCompat().AlertController$RecycleListView) {
                        intent.putExtra("captureOnlyImage", setRecipients.MediaMetadataCompat().Keep);
                        ePIDMainActivity.this.setResult(-1, intent);
                        ePIDMainActivity.this.finish();
                    } else {
                        Log.d("onSuccess DataResult", ePIDMainActivity.this.MediaBrowserCompat$ItemReceiver);
                        intent.putExtra("result", ePIDMainActivity.this.MediaBrowserCompat$ItemReceiver);
                        ePIDMainActivity.this.setResult(-1, intent);
                        ePIDMainActivity.this.finish();
                    }
                } else if (!ePIDMainActivity.this.MediaBrowserCompat$SearchResultReceiver || ePIDMainActivity.this.RatingCompat) {
                    Log.e(ePIDMainActivity.MediaMetadataCompat, "face detection fails");
                } else {
                    ePIDMainActivity.this.RatingCompat = true;
                    Log.e(ePIDMainActivity.MediaMetadataCompat, "face detection success");
                    if (setRecipients.MediaMetadataCompat().AlertController$RecycleListView) {
                        intent.putExtra("captureOnlyImage", setRecipients.MediaMetadataCompat().Keep);
                        ePIDMainActivity.this.setResult(-1, intent);
                        ePIDMainActivity.this.finish();
                    } else {
                        Log.d("onSuccess DataResult", ePIDMainActivity.this.MediaBrowserCompat$ItemReceiver);
                        intent.putExtra("result", ePIDMainActivity.this.MediaBrowserCompat$ItemReceiver);
                        ePIDMainActivity.this.setResult(-1, intent);
                        ePIDMainActivity.this.finish();
                    }
                }
                return false;
            }
        });
    }

    public Intent getIntent() {
        return super.getIntent();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("currentScreen", this.MediaBrowserCompat$CustomActionResultReceiver.ordinal());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(setTvRemark$MediaBrowserCompat$CustomActionResultReceiver.activity_main);
        setRecipients.MediaMetadataCompat().MediaDescriptionCompat = this;
        setRecipients.MediaMetadataCompat().setIcon = getResources().getString(setTvRemark.IconCompatParcelizer.rsaKeyAlgorithm);
        setRecipients.MediaMetadataCompat().setItemInvoker = getResources().getString(setTvRemark.IconCompatParcelizer.providerName);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            setRecipients.MediaMetadataCompat().PlaybackStateCompat = getResources().openRawResource(setTvRemark$MediaBrowserCompat$ItemReceiver.epidrsa_new);
            setRecipients.MediaMetadataCompat();
            getResources().openRawResource(setTvRemark$MediaBrowserCompat$ItemReceiver.epid);
            Log.i("No Bundle data found", "");
            this.MenuItemWrapperICS$CollapsibleActionViewWrapper = "TamND_NECAPAC";
            this.AlertController$RecycleListView = "ENROLLMENT_WITH_DUP_CHECK";
            this.ActionBarContainer = "https://gis.nec.com.sg/bdo/epid-webservices/api/epidService?wsdl";
            setTermsAndConditionsListener.write("https://gis.nec.com.sg/bdo/epid-webservices/api/epidService?wsdl");
            setRecipients.MediaMetadataCompat().AppCompatDialogFragment = true;
            setRecipients.MediaMetadataCompat().RatingCompat = setRecipients.IconCompatParcelizer.face_first;
            setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.smile);
            setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.turn_head_left);
            setRecipients.MediaMetadataCompat().write = 90;
            setRecipients.MediaMetadataCompat().MediaBrowserCompat$SearchResultReceiver = false;
            setRecipients.MediaMetadataCompat().setContentHeight = "Test";
            setRecipients.MediaMetadataCompat().AbsActionBarView = this.ActionBarContainer;
            if (bundle == null) {
                read();
                return;
            }
        } else if (getIntent().hasExtra("UpdateWithExistingPhoto")) {
            Log.d("update with photo", "");
            this.setSplitBackground = extras.getByteArray("UpdateWithExistingPhoto");
            setRecipients.MediaMetadataCompat().ExpandedMenuView = this.setSplitBackground;
            this.MenuItemWrapperICS$CollapsibleActionViewWrapper = extras.getString("SubjectID");
            this.AlertController$RecycleListView = extras.getString("BiometricOperation");
            this.ActionBarContainer = extras.getString("URLServer");
            this.setIcon = extras.getBoolean("isFace_Spoof_Detection");
            setRecipients.MediaMetadataCompat().AppCompatDialogFragment = this.setIcon;
            setTermsAndConditionsListener.write(this.ActionBarContainer);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer.UPDATE;
            IconCompatParcelizer(this.MenuItemWrapperICS$CollapsibleActionViewWrapper, this.AlertController$RecycleListView);
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer.UPDATE;
            return;
        } else if (getIntent().hasExtra("DeleteWithExistingPhoto")) {
            Log.d("delete with photo", "");
            this.setContentView = extras.getString("DeleteWithExistingPhoto").getBytes();
            setRecipients.MediaMetadataCompat().ParcelableVolumeInfo = this.setContentView;
            this.MenuItemWrapperICS$CollapsibleActionViewWrapper = extras.getString("SubjectID");
            this.AlertController$RecycleListView = extras.getString("BiometricOperation");
            this.ActionBarContainer = extras.getString("URLServer");
            setRecipients.MediaMetadataCompat().AppCompatDialogFragment = Boolean.valueOf(extras.getString("IsFaceSpoofDetection")).booleanValue();
            if (TextUtils.isEmpty(this.ActionBarContainer)) {
                this.ActionBarContainer = "https://gis.nec.com.sg/bdo/epid-webservices/api/epidService?wsdl";
            }
            setTermsAndConditionsListener.write(this.ActionBarContainer);
            IconCompatParcelizer(this.MenuItemWrapperICS$CollapsibleActionViewWrapper, this.AlertController$RecycleListView);
            return;
        } else if (getIntent().hasExtra("RequestToken")) {
            this.ActionBarContainer = extras.getString("URLServer");
            setRecipients.MediaMetadataCompat().AppCompatDialogFragment = Boolean.valueOf(extras.getString("IsFaceSpoofDetection")).booleanValue();
            if (TextUtils.isEmpty(this.ActionBarContainer)) {
                this.ActionBarContainer = "https://gis.nec.com.sg/bdo/epid-webservices/api/epidService?wsdl";
            }
            setTermsAndConditionsListener.write(this.ActionBarContainer);
            new CustomCardApplyViewComponent(new setRemainingLimit<String>() {
                public final /* synthetic */ void write(Object obj) {
                    String str = (String) obj;
                    Log.d(ePIDMainActivity.MediaMetadataCompat, str.toString());
                    if (str != null) {
                        ePIDMainActivity.this.MediaBrowserCompat$ItemReceiver = str;
                        System.out.println(str.toString());
                        ePIDMainActivity.this.MenuItemImpl.sendEmptyMessage(0);
                        try {
                            if (!new setTvTitle(str).MediaBrowserCompat$ItemReceiver().read.equals("0")) {
                                Log.d(ePIDMainActivity.MediaMetadataCompat, ePIDMainActivity.this.getString(setTvRemark.IconCompatParcelizer.connectionError));
                            } else {
                                Log.d(ePIDMainActivity.MediaMetadataCompat, "Request Token Successfully");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        Log.d(ePIDMainActivity.MediaMetadataCompat, ePIDMainActivity.this.getString(setTvRemark.IconCompatParcelizer.connectionError));
                    }
                }

                public final void read(Exception exc) {
                    ePIDMainActivity.this.MediaDescriptionCompat = exc.toString();
                    ePIDMainActivity.this.MenuItemImpl.sendEmptyMessage(1);
                    exc.printStackTrace();
                }
            }).execute(new Void[0]);
            return;
        } else if (getIntent().hasExtra("RetrieveBiometricOperation")) {
            this.MenuItemWrapperICS$CollapsibleActionViewWrapper = extras.getString("SubjectID");
            String string = extras.getString("URLServer");
            this.ActionBarContainer = string;
            if (TextUtils.isEmpty(string)) {
                this.ActionBarContainer = "http://172.16.2.50:8380/epid-webservices/api/epidService?wsdl";
            }
            setTermsAndConditionsListener.write(this.ActionBarContainer);
            new setCkbCardName(this.MenuItemWrapperICS$CollapsibleActionViewWrapper, new setRemainingLimit<String>() {
                public final /* synthetic */ void write(Object obj) {
                    String str = (String) obj;
                    Log.e("retrieve Response", str.toString());
                    try {
                        InputSource inputSource = new InputSource(new BufferedReader(new StringReader(str)));
                        CustomStatementChannelViewComponent_ViewBinding customStatementChannelViewComponent_ViewBinding = new CustomStatementChannelViewComponent_ViewBinding();
                        XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                        xMLReader.setContentHandler(customStatementChannelViewComponent_ViewBinding);
                        xMLReader.parse(inputSource);
                    } catch (Exception unused) {
                    }
                    ePIDMainActivity.this.MenuItemImpl.sendEmptyMessage(0);
                }

                public final void read(Exception exc) {
                    ePIDMainActivity.this.MenuItemImpl.sendEmptyMessage(1);
                }
            }).execute(new Void[0]);
            return;
        } else {
            Log.d("start main activity", "");
            setRecipients.MediaMetadataCompat().AppCompatDelegateImpl$ListMenuDecorView = null;
            this.MenuItemWrapperICS$CollapsibleActionViewWrapper = extras.getString("SubjectID");
            this.AlertController$RecycleListView = extras.getString("BiometricOperation");
            this.ActionBarContainer = extras.getString("URLServer");
            this.AppCompatActivity = extras.getString("firstName");
            this.ExpandedMenuView = extras.getString("lastName");
            this.setContentHeight = extras.getString("middleName");
            this.AppCompatDialogFragment = extras.getString("dob");
            this.AbsActionBarView = extras.getString("suffixOrComplement");
            this.setIcon = extras.getBoolean("isFace_Spoof_Detection");
            this.setShortcut = extras.getBoolean("isIncludeImage");
            this.setPopupCallback = extras.getBoolean("isIncludeVoice");
            this.setHasDecor = extras.getInt("Timer");
            this.f6394x50fd9e4a = extras.getInt("JPEGQuality");
            this.setItemInvoker = extras.getBoolean("isKonyMobileFabric");
            extras.getBoolean("isFaceFirst");
            this.ListMenuItemView = extras.getBoolean("isSmile");
            String str = MediaMetadataCompat;
            StringBuilder sb = new StringBuilder();
            sb.append("isSmile from bundel ");
            sb.append(String.valueOf(extras.getBoolean("isSmile")));
            Log.e(str, sb.toString());
            this.setExpandedFormat = extras.getBoolean("isBlink");
            String str2 = MediaMetadataCompat;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isBlink from bundel ");
            sb2.append(String.valueOf(extras.getBoolean("isBlink")));
            Log.e(str2, sb2.toString());
            String str3 = MediaMetadataCompat;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("isNothing from bundel ");
            sb3.append(String.valueOf(extras.getBoolean("isNothing")));
            Log.e(str3, sb3.toString());
            this.setTitle = extras.getBoolean("isMoveHeadLeft");
            this.setForceShowIcon = extras.getBoolean("isMoveHeadRight");
            this.setChecked = extras.getBoolean("isCloseLeftEye");
            this.setPadding = extras.getBoolean("isCloseRightEye");
            this.AppCompatViewInflater = extras.getBoolean("isCaptureAutomatic");
            this.setCheckable = extras.getBoolean("isCaptureOnly");
            this.MediaSessionCompat$Token = extras.getInt("ContinuousSuccess");
            this.ActionMenuItemView = extras.getString("institution");
            String str4 = MediaMetadataCompat;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("FaceSpoofDetection Default Value ");
            sb4.append(extras.getBoolean("isFace_Spoof_Detection"));
            Log.i(str4, sb4.toString());
            setRecipients.MediaMetadataCompat().MediaSessionCompat$ResultReceiverWrapper = this.AppCompatActivity;
            setRecipients.MediaMetadataCompat().AppCompatViewInflater = this.ExpandedMenuView;
            setRecipients.MediaMetadataCompat().setPadding = this.setContentHeight;
            setRecipients.MediaMetadataCompat().MediaSessionCompat$Token = this.AppCompatDialogFragment;
            setRecipients.MediaMetadataCompat().ListMenuItemView = this.AbsActionBarView;
            setRecipients.MediaMetadataCompat().AppCompatDialogFragment = this.setIcon;
            setRecipients.MediaMetadataCompat().PlaybackStateCompat$CustomAction = this.setShortcut;
            setRecipients.MediaMetadataCompat().setContentView = this.setPopupCallback;
            setRecipients.MediaMetadataCompat().setExpandedFormat = this.setItemInvoker;
            setRecipients.MediaMetadataCompat().MediaBrowserCompat$SearchResultReceiver = this.AppCompatViewInflater;
            setRecipients.MediaMetadataCompat().AlertController$RecycleListView = this.setCheckable;
            setRecipients.MediaMetadataCompat().setHasDecor = this.ActionMenuItemView;
            setRecipients.MediaMetadataCompat().setContentHeight = extras.getString("workstation");
            setRecipients.MediaMetadataCompat().AppCompatActivity = extras.getBoolean("getActionImage");
            setRecipients.MediaMetadataCompat();
            extras.getBoolean("getActionVideo");
            setRecipients.MediaMetadataCompat().Keep = null;
            if (getIntent().hasExtra("isFaceFirst")) {
                if (extras.getBoolean("isFaceFirst")) {
                    setRecipients.MediaMetadataCompat().RatingCompat = setRecipients.IconCompatParcelizer.face_first;
                } else {
                    setRecipients.MediaMetadataCompat().RatingCompat = setRecipients.IconCompatParcelizer.challenge_first;
                }
            }
            if (this.setHasDecor == 0) {
                this.setHasDecor = 3;
            }
            setRecipients.MediaMetadataCompat().read = this.setHasDecor;
            if (this.f6394x50fd9e4a == 0) {
                this.f6394x50fd9e4a = 90;
                setRecipients.MediaMetadataCompat().write = this.f6394x50fd9e4a;
            } else {
                String str5 = MediaMetadataCompat;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("JPEG Quality ");
                sb5.append(String.valueOf(this.f6394x50fd9e4a));
                Log.e(str5, sb5.toString());
                setRecipients.MediaMetadataCompat().write = this.f6394x50fd9e4a;
            }
            if (this.MediaSessionCompat$Token == 0) {
                this.MediaSessionCompat$Token = 1;
            }
            setRecipients.MediaMetadataCompat().f5825x50fd9e4a = this.MediaSessionCompat$Token;
            String str6 = MediaMetadataCompat;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Timer ");
            sb6.append(String.valueOf(setRecipients.MediaMetadataCompat().read));
            Log.e(str6, sb6.toString());
            String str7 = MediaMetadataCompat;
            StringBuilder sb7 = new StringBuilder();
            sb7.append("JPEGQuality ");
            sb7.append(String.valueOf(setRecipients.MediaMetadataCompat().write));
            Log.e(str7, sb7.toString());
            String str8 = MediaMetadataCompat;
            StringBuilder sb8 = new StringBuilder();
            sb8.append("ContinuousSuccess ");
            sb8.append(String.valueOf(setRecipients.MediaMetadataCompat().f5825x50fd9e4a));
            Log.e(str8, sb8.toString());
            if (this.ListMenuItemView || this.setExpandedFormat || this.setTitle || this.setForceShowIcon || this.setChecked || this.setPadding) {
                setRecipients.MediaMetadataCompat().IconCompatParcelizer.clear();
                if (this.ListMenuItemView) {
                    setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.smile);
                }
                if (this.setExpandedFormat) {
                    setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.blink);
                }
                if (this.setTitle) {
                    setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.turn_head_left);
                }
                if (this.setForceShowIcon) {
                    setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.turn_head_right);
                }
                if (this.setChecked) {
                    setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.close_left_eye);
                }
                if (this.setPadding) {
                    setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.close_right_eye);
                }
            } else {
                setRecipients.MediaMetadataCompat().IconCompatParcelizer.clear();
                setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.blink);
                setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.smile);
                setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.turn_head_left);
                setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.turn_head_right);
                setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.close_left_eye);
                setRecipients.MediaMetadataCompat().IconCompatParcelizer.add(setRecipients.write.close_right_eye);
                Log.i("Default Detections", String.valueOf(setRecipients.MediaMetadataCompat().IconCompatParcelizer.size()));
            }
            Log.i("Actions array sizes", String.valueOf(setRecipients.MediaMetadataCompat().IconCompatParcelizer.size()));
            for (int i = 0; i < setRecipients.MediaMetadataCompat().IconCompatParcelizer.size(); i++) {
                Log.i("Actions array", setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(i).toString());
            }
            if (setRecipients.MediaMetadataCompat().setExpandedFormat) {
                this.MediaSessionCompat$ResultReceiverWrapper = extras.getString("appkey");
                this.MediaSessionCompat$QueueItem = extras.getString("appsecret");
                this.Keep = extras.getString("konyurl");
                this.ParcelableVolumeInfo = extras.getString("konyservicename");
                this.PlaybackStateCompat$CustomAction = extras.getString("KonyRequestTokenOperationName");
                this.PlaybackStateCompat = extras.getString("KonySubmitBiometricOperationName");
                this.setBackgroundResource = extras.getString("clientId");
                this.setGroupDividerEnabled = extras.getString("loginId");
                this.setVisibility = extras.getString("sessionId");
                setRecipients.MediaMetadataCompat();
                setRecipients.read(this.MediaSessionCompat$ResultReceiverWrapper);
                setRecipients.MediaMetadataCompat();
                setRecipients.MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$QueueItem);
                setRecipients.MediaMetadataCompat();
                setRecipients.RatingCompat(this.Keep);
                setRecipients.MediaMetadataCompat();
                setRecipients.MediaDescriptionCompat(this.ParcelableVolumeInfo);
                setRecipients.MediaMetadataCompat().MediaBrowserCompat$CustomActionResultReceiver = this.PlaybackStateCompat$CustomAction;
                setRecipients.MediaMetadataCompat().MediaBrowserCompat$ItemReceiver = this.PlaybackStateCompat;
                setRecipients.MediaMetadataCompat();
                setRecipients.write(this.setBackgroundResource);
                setRecipients.MediaMetadataCompat();
                setRecipients.MediaBrowserCompat$MediaItem(this.setGroupDividerEnabled);
                setRecipients.MediaMetadataCompat();
                setRecipients.MediaBrowserCompat$SearchResultReceiver(this.setVisibility);
                if (TextUtils.isEmpty(extras.getString("konyloginservicename")) || TextUtils.isEmpty(extras.getString("konyloginusername")) || TextUtils.isEmpty(extras.getString("konyloginpassword"))) {
                    setRecipients.MediaMetadataCompat().setBackgroundResource = false;
                } else {
                    setRecipients.MediaMetadataCompat().setBackgroundResource = true;
                    setRecipients.MediaMetadataCompat().setCheckable = extras.getString("konyloginservicename");
                    setRecipients.MediaMetadataCompat().setPopupCallback = extras.getString("konyloginusername");
                    setRecipients.MediaMetadataCompat().ActionMenuItemView = extras.getString("konyloginpassword");
                }
            }
            setTermsAndConditionsListener.write(this.ActionBarContainer);
            if (getIntent().hasExtra("imageOnly")) {
                this.AppCompatDelegateImpl$ListMenuDecorView = extras.getByteArray("imageOnly");
                setRecipients.MediaMetadataCompat().AppCompatDelegateImpl$ListMenuDecorView = this.AppCompatDelegateImpl$ListMenuDecorView;
                this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer.UPDATE;
                IconCompatParcelizer(this.MenuItemWrapperICS$CollapsibleActionViewWrapper, this.AlertController$RecycleListView);
                return;
            } else if (bundle == null) {
                Log.e(MediaMetadataCompat, " call show capture");
                read();
                return;
            } else {
                Log.e(MediaMetadataCompat, " reviveFragments");
            }
        }
        int i2 = bundle.getInt("currentScreen");
        FragmentManager fragmentManager = getFragmentManager();
        this.IconCompatParcelizer = (CaptureFragment) fragmentManager.findFragmentByTag("captureFragment");
        this.read = (ConfirmationFragment) fragmentManager.findFragmentByTag("confirmationFragment");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer.values()[i2];
        String str9 = MediaMetadataCompat;
        StringBuilder sb9 = new StringBuilder();
        sb9.append("receiveFragments captureFragment ");
        sb9.append(this.IconCompatParcelizer);
        Log.e(str9, sb9.toString());
    }

    private void IconCompatParcelizer(String str, String str2) {
        Log.d(MediaMetadataCompat, "call action");
        new setFullDivider(setCbSelect.read(str2, str), new setRemainingLimit<String>() {
            public final /* synthetic */ void write(Object obj) {
                String str = (String) obj;
                String write2 = ePIDMainActivity.MediaMetadataCompat;
                StringBuilder sb = new StringBuilder();
                sb.append(" Server Response ");
                sb.append(str);
                Log.d(write2, sb.toString());
                if (ePIDMainActivity.this.setCheckable) {
                    ePIDMainActivity.this.MenuItemImpl.sendEmptyMessage(0);
                    return;
                }
                ePIDMainActivity.this.MediaBrowserCompat$ItemReceiver = str;
                if (setRecipients.MediaMetadataCompat().RatingCompat != setRecipients.IconCompatParcelizer.face_first || !setRecipients.MediaMetadataCompat().AppCompatDialogFragment) {
                    try {
                        setHeader MediaBrowserCompat$ItemReceiver = new setTvTitle(str).MediaBrowserCompat$ItemReceiver();
                        Log.d("result errorCode", MediaBrowserCompat$ItemReceiver.read);
                        if (!MediaBrowserCompat$ItemReceiver.read.equals("0")) {
                            Log.d(ePIDMainActivity.MediaMetadataCompat, ePIDMainActivity.this.getString(setTvRemark.IconCompatParcelizer.connectionError));
                        } else {
                            Log.d(ePIDMainActivity.MediaMetadataCompat, "Request Token Successfully");
                        }
                        ePIDMainActivity.this.MenuItemImpl.sendEmptyMessage(0);
                    } catch (Exception e) {
                        ePIDMainActivity.this.MediaDescriptionCompat = e.toString();
                        ePIDMainActivity.this.MenuItemImpl.sendEmptyMessage(1);
                        e.printStackTrace();
                    }
                } else if (ePIDMainActivity.this.MediaBrowserCompat$MediaItem) {
                    Log.e(ePIDMainActivity.MediaMetadataCompat, " Face Detection finish first!");
                    try {
                        setHeader MediaBrowserCompat$ItemReceiver2 = new setTvTitle(str).MediaBrowserCompat$ItemReceiver();
                        Log.d("result errorCode", MediaBrowserCompat$ItemReceiver2.read);
                        if (!MediaBrowserCompat$ItemReceiver2.read.equals("0")) {
                            Log.d(ePIDMainActivity.MediaMetadataCompat, ePIDMainActivity.this.getString(setTvRemark.IconCompatParcelizer.connectionError));
                        } else {
                            Log.d(ePIDMainActivity.MediaMetadataCompat, "Request Token Successfully");
                        }
                        ePIDMainActivity.this.MenuItemImpl.sendEmptyMessage(0);
                    } catch (Exception e2) {
                        ePIDMainActivity.this.MediaDescriptionCompat = e2.toString();
                        ePIDMainActivity.this.MenuItemImpl.sendEmptyMessage(1);
                        e2.printStackTrace();
                    }
                }
            }

            public final void read(Exception exc) {
                ePIDMainActivity.this.MediaDescriptionCompat = exc.toString();
                StringBuilder sb = new StringBuilder();
                sb.append(ePIDMainActivity.MediaMetadataCompat);
                sb.append(" onError");
                Log.d(sb.toString(), ePIDMainActivity.this.MediaDescriptionCompat);
                ePIDMainActivity.this.MenuItemImpl.sendEmptyMessage(1);
            }
        });
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Log.e(MediaMetadataCompat, "faceDetectionCallback");
        this.MediaBrowserCompat$MediaItem = true;
        this.MediaBrowserCompat$SearchResultReceiver = z;
        if (this.MediaBrowserCompat$ItemReceiver.length() != 0) {
            Log.e(MediaMetadataCompat, " Calling server finish first!");
            try {
                setHeader MediaBrowserCompat$ItemReceiver2 = new setTvTitle(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver();
                Log.d("result errorCode", MediaBrowserCompat$ItemReceiver2.read);
                if (!MediaBrowserCompat$ItemReceiver2.read.equals("0")) {
                    Log.d(MediaMetadataCompat, getString(setTvRemark.IconCompatParcelizer.connectionError));
                } else {
                    Log.d(MediaMetadataCompat, "Request Token Successfully");
                }
                this.MenuItemImpl.sendEmptyMessage(0);
            } catch (Exception e) {
                this.MediaDescriptionCompat = e.toString();
                this.MenuItemImpl.sendEmptyMessage(1);
                e.printStackTrace();
            }
        }
    }

    public final void write(ArrayList<byte[]> arrayList) {
        try {
            String str = MediaMetadataCompat;
            StringBuilder sb = new StringBuilder();
            sb.append("GetActionImagesSuccessFailListener=");
            sb.append(arrayList.size());
            Log.e(str, sb.toString());
            ArrayList<byte[]> arrayList2 = new ArrayList<>();
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList2.add(arrayList.get(i));
                }
                setRecipients.MediaMetadataCompat().MediaMetadataCompat = arrayList2;
                String str2 = MediaMetadataCompat;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("actionImagesize=");
                sb2.append(setRecipients.MediaMetadataCompat().MediaMetadataCompat.size());
                Log.e(str2, sb2.toString());
                setResult(-1, new Intent());
                finish();
            }
        } catch (Exception e) {
            this.MediaDescriptionCompat = e.toString();
            this.MenuItemImpl.sendEmptyMessage(1);
            e.printStackTrace();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int rotation = ((WindowManager) getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            write = write.ORIENTATION_90;
        } else if (rotation != 3) {
            write = write.ORIENTATION_0;
        } else {
            write = write.ORIENTATION_270;
        }
    }

    public void onBackPressed() {
        Log.i("Call ", " OnBackPressed");
        setRecipients.MediaMetadataCompat();
        String str = MediaMetadataCompat;
        StringBuilder sb = new StringBuilder();
        sb.append(" isFinishCaptureAutomaticFaceFirst OBP");
        setRecipients.MediaMetadataCompat();
        sb.append("false");
        Log.e(str, sb.toString());
        if (this.MediaBrowserCompat$CustomActionResultReceiver != IconCompatParcelizer.CONFIRM) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == IconCompatParcelizer.ID) {
                if (this.read.MediaDescriptionCompat == write.ORIENTATION_90) {
                    setRequestedOrientation(0);
                    return;
                } else if (this.read.MediaDescriptionCompat == write.ORIENTATION_270) {
                    setRequestedOrientation(8);
                    return;
                } else if (this.read.MediaDescriptionCompat == write.ORIENTATION_0) {
                    setRequestedOrientation(1);
                    return;
                } else {
                    return;
                }
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver == IconCompatParcelizer.RESULT) {
                FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
                beginTransaction.remove((Fragment) null);
                beginTransaction.commit();
                this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer.ID;
                return;
            }
        }
        super.onBackPressed();
    }

    public final void read() {
        Log.e(MediaMetadataCompat, " show capture fragment");
        CaptureFragment captureFragment = new CaptureFragment();
        this.IconCompatParcelizer = captureFragment;
        captureFragment.write = this;
        this.IconCompatParcelizer.MediaMetadataCompat = this;
        String str = MediaMetadataCompat;
        StringBuilder sb = new StringBuilder();
        sb.append(" capture fragment");
        sb.append(this.IconCompatParcelizer);
        Log.e(str, sb.toString());
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.add(setTvRemark.write.container, this.IconCompatParcelizer, "captureFragment");
        beginTransaction.show(this.IconCompatParcelizer);
        beginTransaction.commit();
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer.CAPTURE;
        IconCompatParcelizer(this.MenuItemWrapperICS$CollapsibleActionViewWrapper, this.AlertController$RecycleListView);
    }

    public final void IconCompatParcelizer(Bitmap bitmap, write write2, setQuestionMark setquestionmark) {
        ConfirmationFragment confirmationFragment = new ConfirmationFragment();
        this.read = confirmationFragment;
        if (bitmap != null) {
            confirmationFragment.MediaBrowserCompat$CustomActionResultReceiver = bitmap;
            this.read.MediaBrowserCompat$SearchResultReceiver = bitmap;
        }
        if (setquestionmark != null) {
            this.read.MediaMetadataCompat = setquestionmark;
        }
        this.read.MediaDescriptionCompat = write2;
        String str = MediaMetadataCompat;
        StringBuilder sb = new StringBuilder();
        sb.append("start FragmentTransaction with capture ");
        sb.append(this.IconCompatParcelizer);
        Log.e(str, sb.toString());
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.remove(this.IconCompatParcelizer);
        String str2 = MediaMetadataCompat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start FragmentTransaction capture remove ");
        sb2.append(this.IconCompatParcelizer);
        Log.e(str2, sb2.toString());
        this.IconCompatParcelizer = null;
        String str3 = MediaMetadataCompat;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("start FragmentTransaction before confirm add ");
        sb3.append(this.read);
        Log.e(str3, sb3.toString());
        beginTransaction.add(setTvRemark.write.container, this.read, "confirmationFragment");
        String str4 = MediaMetadataCompat;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("start FragmentTransaction finish confirm add ");
        sb4.append(this.read);
        Log.e(str4, sb4.toString());
        beginTransaction.show(this.read);
        beginTransaction.commit();
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer.CONFIRM;
        Log.e(MediaMetadataCompat, "finish FragmentTransaction");
    }
}

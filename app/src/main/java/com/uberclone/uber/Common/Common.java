package com.uberclone.uber.Common;

import android.location.Location;

import com.google.android.gms.common.api.GoogleApi;
import com.uberclone.uber.Remote.FCMClient;
import com.uberclone.uber.Remote.IFCMService;
import com.uberclone.uber.Remote.IGoogleAPI;
import com.uberclone.uber.Remote.RetrofitClient;

/**
 * Created by Umair Ali on 1/6/2018.
 */

public class Common {

    //firebase tables
    public static final String driver_tbl="Drivers";// store all the information of Drivers locations
    public static final String user_driver_tbl="DriverInformation";//store all the info of drivers who registered
    public static final String user_rider_tbl="RiderInformation";//store all the info of riders who registered
    public static final String pickup_request_tbl="PickupRequest";//store information about pickup Request of user

    public static final String token_table="Tokens";

    public static Location mLastLocation=null;

    public static final String baseURL="https://maps.googleapis.com";
    public static final String fcmURL="https://fcm.googleapis.com/";

    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClent(baseURL).create(IGoogleAPI.class);
    }

    public static IFCMService getFcmService(){
        return FCMClient.getClent(fcmURL).create(IFCMService.class);
    }
}

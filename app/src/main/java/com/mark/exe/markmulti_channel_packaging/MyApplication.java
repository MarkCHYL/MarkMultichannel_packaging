package com.mark.exe.markmulti_channel_packaging;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;

/**
 * 项目名称：MarkMultichannel_packaging
 * 类描述：
 * Created by mark on 2018/5/4 23:59
 * 修改人：mark
 * 修改时间：2018/5/4 23:59
 * 修改备注：
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化友盟
        initUmeng();
    }

    private void initUmeng() {
        // 必须在调用任何统计SDK接口之前调用初始化函数
        UMConfigure.init(this,
                "5aec8aa98f4a9d7f0e00015a", "Umeng",
                UMConfigure.DEVICE_TYPE_PHONE, null);
    }
}

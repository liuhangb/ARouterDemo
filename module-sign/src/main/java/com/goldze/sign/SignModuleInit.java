package com.goldze.sign;

import android.app.Application;

import com.goldze.base.base.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * Created by goldze on 2018/6/21 0021.
 */

public class SignModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("登录模块初始 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("登录模块初始 -- onInitLow");
        return false;
    }
}
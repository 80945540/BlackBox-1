package top.niunaijun.blackbox.proxy;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.content.res.Configuration;

import top.niunaijun.blackbox.app.dispatcher.AppJobServiceDispatcher;

/**
 * Created by Milk on 4/2/21.
 * * ∧＿∧
 * (`･ω･∥
 * 丶　つ０
 * しーＪ
 * 此处无Bug
 */
public class ProxyJobService extends JobService {
    public static final String TAG = "StubJobService";

    @Override
    public boolean onStartJob(JobParameters params) {
        return AppJobServiceDispatcher.get().onStartJob(params);
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return AppJobServiceDispatcher.get().onStopJob(params);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        AppJobServiceDispatcher.get().onDestroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        AppJobServiceDispatcher.get().onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        AppJobServiceDispatcher.get().onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        AppJobServiceDispatcher.get().onTrimMemory(level);
    }

    public static class P0 extends ProxyJobService {

    }

    public static class P1 extends ProxyJobService {

    }

    public static class P2 extends ProxyJobService {

    }

    public static class P3 extends ProxyJobService {

    }

    public static class P4 extends ProxyJobService {

    }

    public static class P5 extends ProxyJobService {

    }

    public static class P6 extends ProxyJobService {

    }

    public static class P7 extends ProxyJobService {

    }

    public static class P8 extends ProxyJobService {

    }

    public static class P9 extends ProxyJobService {

    }

    public static class P10 extends ProxyJobService {

    }

    public static class P11 extends ProxyJobService {

    }

    public static class P12 extends ProxyJobService {

    }

    public static class P13 extends ProxyJobService {

    }

    public static class P14 extends ProxyJobService {

    }

    public static class P15 extends ProxyJobService {

    }

    public static class P16 extends ProxyJobService {

    }

    public static class P17 extends ProxyJobService {

    }

    public static class P18 extends ProxyJobService {

    }

    public static class P19 extends ProxyJobService {

    }

    public static class P20 extends ProxyJobService {

    }

    public static class P21 extends ProxyJobService {

    }

    public static class P22 extends ProxyJobService {

    }

    public static class P23 extends ProxyJobService {

    }

    public static class P24 extends ProxyJobService {

    }

    public static class P25 extends ProxyJobService {

    }

    public static class P26 extends ProxyJobService {

    }

    public static class P27 extends ProxyJobService {

    }

    public static class P28 extends ProxyJobService {

    }

    public static class P29 extends ProxyJobService {

    }

    public static class P30 extends ProxyJobService {

    }

    public static class P31 extends ProxyJobService {

    }

    public static class P32 extends ProxyJobService {

    }

    public static class P33 extends ProxyJobService {

    }

    public static class P34 extends ProxyJobService {

    }

    public static class P35 extends ProxyJobService {

    }

    public static class P36 extends ProxyJobService {

    }

    public static class P37 extends ProxyJobService {

    }

    public static class P38 extends ProxyJobService {

    }

    public static class P39 extends ProxyJobService {

    }

    public static class P40 extends ProxyJobService {

    }

    public static class P41 extends ProxyJobService {

    }

    public static class P42 extends ProxyJobService {

    }

    public static class P43 extends ProxyJobService {

    }

    public static class P44 extends ProxyJobService {

    }

    public static class P45 extends ProxyJobService {

    }

    public static class P46 extends ProxyJobService {

    }

    public static class P47 extends ProxyJobService {

    }

    public static class P48 extends ProxyJobService {

    }

    public static class P49 extends ProxyJobService {

    }

    public static class P50 extends ProxyJobService {

    }

    public static class P51 extends ProxyJobService {

    }

    public static class P52 extends ProxyJobService {

    }

    public static class P53 extends ProxyJobService {

    }

    public static class P54 extends ProxyJobService {

    }

    public static class P55 extends ProxyJobService {

    }

    public static class P56 extends ProxyJobService {

    }

    public static class P57 extends ProxyJobService {

    }

    public static class P58 extends ProxyJobService {

    }

    public static class P59 extends ProxyJobService {

    }

    public static class P60 extends ProxyJobService {

    }

    public static class P61 extends ProxyJobService {

    }

    public static class P62 extends ProxyJobService {

    }

    public static class P63 extends ProxyJobService {

    }

    public static class P64 extends ProxyJobService {

    }

    public static class P65 extends ProxyJobService {

    }

    public static class P66 extends ProxyJobService {

    }

    public static class P67 extends ProxyJobService {

    }

    public static class P68 extends ProxyJobService {

    }

    public static class P69 extends ProxyJobService {

    }

    public static class P70 extends ProxyJobService {

    }

    public static class P71 extends ProxyJobService {

    }

    public static class P72 extends ProxyJobService {

    }

    public static class P73 extends ProxyJobService {

    }

    public static class P74 extends ProxyJobService {

    }

    public static class P75 extends ProxyJobService {

    }

    public static class P76 extends ProxyJobService {

    }

    public static class P77 extends ProxyJobService {

    }

    public static class P78 extends ProxyJobService {

    }

    public static class P79 extends ProxyJobService {

    }

    public static class P80 extends ProxyJobService {

    }

    public static class P81 extends ProxyJobService {

    }

    public static class P82 extends ProxyJobService {

    }

    public static class P83 extends ProxyJobService {

    }

    public static class P84 extends ProxyJobService {

    }

    public static class P85 extends ProxyJobService {

    }

    public static class P86 extends ProxyJobService {

    }

    public static class P87 extends ProxyJobService {

    }

    public static class P88 extends ProxyJobService {

    }

    public static class P89 extends ProxyJobService {

    }

    public static class P90 extends ProxyJobService {

    }

    public static class P91 extends ProxyJobService {

    }

    public static class P92 extends ProxyJobService {

    }

    public static class P93 extends ProxyJobService {

    }

    public static class P94 extends ProxyJobService {

    }

    public static class P95 extends ProxyJobService {

    }

    public static class P96 extends ProxyJobService {

    }

    public static class P97 extends ProxyJobService {

    }

    public static class P98 extends ProxyJobService {

    }

    public static class P99 extends ProxyJobService {

    }
}

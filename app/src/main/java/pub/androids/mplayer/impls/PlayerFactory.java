package pub.androids.mplayer.impls;

import android.content.Context;
import android.os.Build;

import pub.androids.mplayer.PlayeProxy;
import pub.androids.mplayer.interfaces.PlayInterface;

/**
 * 播放器工厂类
 * 播放器不对外提供主动实例 只能通过工厂来创建
 * 可以针对性的某资源使用不同的播放器更加详细的策略根据需求去增加
 */
public class PlayerFactory {
    private static PlayerFactory instance = null;
    private Context context;

    private PlayerFactory(Context context) {
        this.context = context.getApplicationContext();
    }

    public static PlayerFactory getInstance(Context context) {
        if (instance == null) {
            synchronized (PlayerFactory.class) {
                if (instance == null) {
                    instance = new PlayerFactory(context);
                }
            }
        }
        return instance;
    }

    /**
     * 获取系统原生的播放器
     *
     * @return
     */
    public PlayInterface getMediaPlayerPlayer() {

        return PlayeProxy.obaintPlayer(new MediaPlayer(context));
    }

    /**
     * 获取ExoPlayer
     *
     * @return
     */
    public PlayInterface getExoPlayer() {
        return null;
    }

    /**
     * 4.1 以下的手机使用MediaPlayerPlayer
     *
     * @return
     */
    public PlayInterface getPlayerByBuildVersion() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            return getExoPlayer();
        } else {
            return getMediaPlayerPlayer();
        }
    }


    /**
     * 默认播放器
     *
     * @return
     * @see PlayerFactory#getPlayerByBuildVersion()
     */
    public PlayInterface getPlayerByDefault() {
        return getExoPlayer();
    }
}
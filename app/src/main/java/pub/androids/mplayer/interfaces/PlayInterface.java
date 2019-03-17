package pub.androids.mplayer.interfaces;

import android.media.MediaPlayer;
import android.view.Surface;
import android.view.SurfaceHolder;

/**
 * 播放服务接口2016年一个播控的项目抽取代码
 * 此接口是以MediaPlayer为原型设计的接口
 * 基本包含MediaPlayer的所有接口，我们做了在perpare上做了
 * 些修改使接口使用起来更加规范 就是去除了prepare 的同步调用只
 * 保留了异步调用
 *
 * @author wsm create at 2015-08-12
 * @see MediaPlayer
 */
public interface PlayInterface {

    void setSurface(Surface surface);

    /**
     * 播放某个地址的视频或是音频
     *
     * @param url 文件地址 可以使网络地址
     * @see MediaPlayer#setDataSource(String)
     */
    void setDataSource(String url) throws Exception;

    /**
     * @param type
     * @see MediaPlayer#setAudioStreamType(int)
     */
    void setAudioStreamType(int type);

    /**
     * 暂停
     *
     * @see MediaPlayer#pause()
     */
    void pause(boolean goback);

    /**
     *
     * @param holder
     */
    void setDisplay(SurfaceHolder holder);

    /**
     * @see MediaPlayer#stop()
     * 停止
     */
    void stop();

    /**
     * @see MediaPlayer#release()
     * 释放
     */
    void release();

    /**
     * @see MediaPlayer#start()
     * 开始
     */
    void start();


    /**
     * @see MediaPlayer#prepareAsync()
     * 异步准备
     */
    void prepareAsync();


    /**
     * 滑动到某个位置
     *
     * @param pos
     */
    void seekTo(int pos);


    /**
     * 获取视频宽度
     *
     * @return
     */
    int getVideoWidth();

    /**
     * @return
     * @see MediaPlayer#getVideoHeight()
     * 获取视频高度
     */
    int getVideoHeight();

    /**
     * @return
     * @see MediaPlayer#getCurrentPosition()
     * 获取播放位置
     */
    int getCurrentPosition();

    /**
     * @return
     * @see MediaPlayer#getDuration()
     * 获取时间长度
     */
    int getDuration();

    /**
     * @return
     * @see MediaPlayer#isPlaying()
     * 是否在播放
     */
    boolean isPlaying();

    /**
     * @return
     * @see MediaPlayer#isLooping()
     */
    boolean isLooping();



    /**
     * @param listener
     * @see MediaPlayer#setOnPreparedListener(MediaPlayer.OnPreparedListener)
     */
    void setOnPreparedListener(OnPreparedListener listener);


    /**
     * @see MediaPlayer.OnCompletionListener
     */
    public interface OnCompletionListener {

        /**
         * @see MediaPlayer.OnCompletionListener#onCompletion(MediaPlayer)
         */
        void onCompletion(PlayInterface mp);
    }

    /**
     * @param listener
     * @see MediaPlayer#setOnCompletionListener(MediaPlayer.OnCompletionListener)
     */
    public void setOnCompletionListener(OnCompletionListener listener);

    /**
     * @see MediaPlayer.OnVideoSizeChangedListener
     */


    /**
     * @param listener
     */
    void setOnVideoSizeChangedListener(OnVideoSizeChangedListener listener);


    /**
     * @param listener
     */
    void setOnBufferingUpdateListener(OnBufferingUpdateListener listener);



    /**
     * @param listener
     * @see MediaPlayer#setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener)
     */
    void setOnSeekCompleteListener(OnSeekCompleteListener listener);

    /**
     * @see MediaPlayer.OnErrorListener
     */

    /**
     * @param listener
     */
    void setOnErrorListener(OnErrorListener listener);



    void setOnInfoListener(OnInfoListener listener);



    void setOnPauseListener(OnPauseListener listener);


}
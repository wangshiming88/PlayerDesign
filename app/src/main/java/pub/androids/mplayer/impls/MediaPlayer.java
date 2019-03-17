package pub.androids.mplayer.impls;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;

import pub.androids.mplayer.base.BasePlayer;
/**
 * 使用MediaPlayer实现的播放器 第三方的代码就不列出来了
 */
public class MediaPlayer extends BasePlayer implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnSeekCompleteListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnBufferingUpdateListener {

    Context context;
    android.media.MediaPlayer mediaPlayer;

    public MediaPlayer(Context context) {
        this.context = context.getApplicationContext();
        mediaPlayer = new android.media.MediaPlayer();
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnSeekCompleteListener(this);
        mediaPlayer.setOnVideoSizeChangedListener(this);
        mediaPlayer.setOnErrorListener(this);
        mediaPlayer.setOnInfoListener(this);
        mediaPlayer.setOnBufferingUpdateListener(this);
    }

    @Override
    public void setDataSource(String url) throws Exception {
        mediaPlayer.setDataSource(url);
    }

    @Override
    public void setAudioStreamType(int type) {
        mediaPlayer.setAudioStreamType(type);
    }

    @Override
    public void pause(boolean goback) {
        mediaPlayer.pause();
    }

    @Override
    public void setDisplay(SurfaceHolder holder) {
        mediaPlayer.setDisplay(holder);
    }

    @Override
    public void stop() {
        mediaPlayer.stop();
        ;
    }

    @Override
    public void release() {
        mediaPlayer.release();
    }

    @Override
    public void start() {
        mediaPlayer.start();
    }

    @Override
    public void prepareAsync() {
        mediaPlayer.prepareAsync();
    }

    @Override
    public void seekTo(int pos) {
        mediaPlayer.seekTo(pos);
    }

    @Override
    public int getVideoWidth() {
        return mediaPlayer.getVideoWidth();
    }

    @Override
    public int getVideoHeight() {
        return mediaPlayer.getVideoHeight();
    }

    @Override
    public int getCurrentPosition() {
        return mediaPlayer.getCurrentPosition();
    }

    @Override
    public int getDuration() {
        return mediaPlayer.getDuration();
    }

    @Override
    public boolean isPlaying() {
        return mediaPlayer.isPlaying();
    }

    @Override
    public boolean isLooping() {
        return mediaPlayer.isLooping();
    }

    @Override
    public void onCompletion(android.media.MediaPlayer mp) {
        if (onCompletionListener != null)
            onCompletionListener.onCompletion(this);
    }


    @Override
    public void setSurface(Surface surface) {
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }

    @Override
    public void onPrepared(android.media.MediaPlayer mp) {
        if (onPreparedListener != null)
            onPreparedListener.onPrepared(this);
    }

    @Override
    public void onSeekComplete(android.media.MediaPlayer mp) {
        if (onSeekCompleteListener != null)
            onSeekCompleteListener.onSeekComplete(this);
    }

    @Override
    public void onVideoSizeChanged(android.media.MediaPlayer mp, int width, int height) {
        if (onVideoSizeChangedListener != null)
            onVideoSizeChangedListener.onVideoSizeChanged(this, width, height, 0, 0);
    }

    @Override
    public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
        if (onErrorListener != null)
            return onErrorListener.onError(this, what, extra);
        else
            return false;
    }

    @Override
    public boolean onInfo(android.media.MediaPlayer mp, int what, int extra) {
        if (onInfoListener != null)
            return onInfoListener.onInfo(this, what, extra);
        else
            return false;
    }

    @Override
    public void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i) {
        if (onBufferingUpdateListener != null)
            onBufferingUpdateListener.onBufferingUpdate(this, i);
    }
}
